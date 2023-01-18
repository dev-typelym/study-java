package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import domain.UserVO;

public class FollowDAO {

//ÆÈ·ÎÀ× ¼ö
	public Long getCountOfFollowingId(String userIdentification) {
//      String query = "SELECT RECOMMEND_COUNT FROM TBL_USER WHERE USER_ID = ?";
      String query = "SELECT RECOMMEND_COUNT FROM TBL_RECOMMEND WHERE USER_ID = ?";
      Long recommendCount = 0L;
      Long userId = select(userIdentification).getUserId();
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, userId);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            recommendCount = resultSet.getLong(1);
         }
      } catch (SQLException e) {
         System.out.println("getCountOfRecommenderId(Long) SQL¹® ¿À·ù");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      return recommendCount;
   }

	
	
//ÆÈ·Î¿ì ¼ö
	


//³»°¡ ÆÈ·ÎÀ×ÇÑ »ç¶÷
	 public ArrayList<UserVO> selectRecommenders(){
	      String query = "SELECT USER_ID, USER_IDENTIFICATION, USER_NAME, USER_PASSWORD,"
	            + " USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, "
	            + "USER_GENDER, USER_RECOMMENDER_ID, FOLLOWING_ID FROM TBL_USER U JOIN TBL_FOLLOW F"
	            + "ON U.USER_ID = F.FOLLOWING_ID "
	            + "WHERE USER_FOLLOWING_ID = ?";
	      String userIdentification = select(userId).getUserIdentification();
	      UserVO userVO = null;
	      ArrayList<UserVO> users = new ArrayList<UserVO>();
	      
	      connection = DBConnecter.getConnection();
	      try {
	         preparedStatement = connection.prepareStatement(query);
	         preparedStatement.setString(1, userIdentification);
	         
	         resultSet = preparedStatement.executeQuery();
	         
	         while(resultSet.next()) {
	            userVO = new UserVO();
	            userVO.setUserId(resultSet.getLong(1));
	            userVO.setUserIdentification(resultSet.getString(2));
	            userVO.setUserName(resultSet.getString(3));
	            userVO.setUserPassword(resultSet.getString(4));
	            userVO.setUserPhone(resultSet.getString(5));
	            userVO.setUserNickname(resultSet.getString(6));
	            userVO.setUserEmail(resultSet.getString(7));
	            userVO.setUserAddress(resultSet.getString(8));
	            userVO.setUserBirth(resultSet.getString(9));
	            userVO.setUserGender(resultSet.getString(10));
	            userVO.setUserRecommenderId(resultSet.getString(11));
	            users.add(userVO);
	         }
	         
	      } catch (SQLException e) {
	         System.out.println("selectRecommenders() SQL¹® ¿À·ù");
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if(resultSet != null) {
	               resultSet.close();
	            }
	            if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            throw new RuntimeException(e);
	         }
	      }
	      return users;
	   }
	
	
	
//³ª¸¦ ÆÈ·ÎÀ×ÇÑ »ç¶÷
	
}
