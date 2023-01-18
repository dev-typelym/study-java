package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.BoardDTO;
import domain.ReplyDTO;
import domain.ReplyVO;

public class ReplyDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;

//	대댓글 추가
	public void addReply(ReplyVO replyVO, Long target) {
		// 몇번째 글의 댓글과 대댓글인지 식별을 위한 타겟을 매개변수로 받는다.
		String query = "INSERT INTO TBL_REPLY REPLY_ID, REPLY_CONTENT,"
				+ " USER_ID, BOARD_ID, REPLY_GROUP, REPLY_DEPTH "
				+ "VALUES(SEQ_NEXTVAL, ?, ?, ?, ?, (SELECT REPLY_DEPTH + 1 FROM TBL_REPLY WHERE REPLY_ID = ? ))";
		// 타겟을 통해 댓글의 위치를 식별한 후 거기에 대댓글이 추가되는것이기 때문에 
		// 대댓글의 위치인 REPLY_DEPTH에 +1을 해준뒤 replyVO객체에 정보를 넘긴다. REPLY_DEPTH의 DEFAULT는 0이다.
		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, replyVO.getReplyContent());
			//이미 로그인이 된 상태에서 페이지를 돌아다니기 때문에 UserDAO에서 전역변수로 사용된 userId를 가져다가 사용하는 것이다. 
			preparedStatement.setLong(2, UserDAO.userId);
			preparedStatement.setLong(3, replyVO.getBoardId());
			// 타겟을 통해 댓글의 위치를 식별해준다.
			preparedStatement.setLong(4, target);
			preparedStatement.setLong(5, target);
			// 실행해서 ReplyVO 객체의 정보를 DB에 저장한다.				
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			}catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

//  댓글 추가
  public void insert(ReplyVO replyVO) {
     String query = "INSERT INTO TBL_REPLY"
           + "(REPLY_ID, REPLY_CONTENT, USER_ID, BOARD_ID, REPLY_GROUP, REPLY_DEPTH) "
           + "VALUES(SEQ_REPLY.NEXTVAL, ?, ?, ?, SEQ_REPLY.CURRVAL, 0)";
     //첫 댓글을 다는것이기 때문에 REPLY_ID의 시퀀스를 REPLY_GROUP도 따라간다.
     //그리고 첫번째 댓글이기 때문에 REPLY_DEPTH는 DEFAULT가 0이므로 0으로 지정한다.
     connection = DBConnecter.getConnection();
     try {
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, replyVO.getReplyContent());
        preparedStatement.setLong(2, UserDAO.userId);
        preparedStatement.setLong(3, replyVO.getBoardId());
        
        preparedStatement.executeUpdate();
        
     } catch (SQLException e) {
        e.printStackTrace();
     } catch (Exception e) {
        e.printStackTrace();
     } finally {
        try {
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
  }


//	댓글 전체 조회
  // 댓글 하나하나마다 ArrayList에 ReplyDTO객체로 집어넣고 사용한다.
//댓글 전체 조회
public ArrayList<ReplyDTO> selectAll(){
   String query = "SELECT NVL(REPLY_COUNT, 0) REPLY_COUNT, REPLY_ID, REPLY_CONTENT, R2.USER_ID, BOARD_ID, REPLY_REGISTER_DATE, REPLY_UPDATE_DATE, " 
         + "R2.REPLY_GROUP, REPLY_DEPTH, " 
         + "USER_IDENTIFICATION, USER_NAME, USER_PASSWORD, " 
         + "USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_ADDRESS, USER_BIRTH, " 
         + "USER_GENDER, USER_RECOMMENDER_ID " 
         + "FROM (SELECT REPLY_GROUP, COUNT(REPLY_ID) - 1 REPLY_COUNT FROM TBL_REPLY GROUP BY REPLY_GROUP) R1 RIGHT OUTER JOIN VIEW_REPLY_USER R2 "
         + "ON R1.REPLY_GROUP = R2.REPLY_GROUP AND R1.REPLY_GROUP = R2.REPLY_ID";
   
   ReplyDTO replyDTO = null;
   int index = 0;
   ArrayList<ReplyDTO> replies = new ArrayList<ReplyDTO>();
   
   connection = DBConnecter.getConnection();
   try {
      preparedStatement = connection.prepareStatement(query);
      resultSet = preparedStatement.executeQuery();
      
      while(resultSet.next()) {
         index = 0;
         replyDTO = new ReplyDTO();
         replyDTO.setReplyCount(resultSet.getLong(++index));
         replyDTO.setReplyId(resultSet.getLong(++index));
         replyDTO.setReplyContent(resultSet.getString(++index));
         replyDTO.setUserId(resultSet.getLong(++index));
         replyDTO.setBoardId(resultSet.getLong(++index));
         replyDTO.setReplyRegisterDate(resultSet.getString(++index));
         replyDTO.setReplyUpdateDate(resultSet.getString(++index));
         replyDTO.setReplyGroup(resultSet.getLong(++index));
         replyDTO.setReplyDepth(resultSet.getLong(++index));
         replyDTO.setUserIdentification(resultSet.getString(++index));
         replyDTO.setUserName(resultSet.getString(++index));
         replyDTO.setUserPassword(resultSet.getString(++index));
         replyDTO.setUserPhone(resultSet.getString(++index));
         replyDTO.setUserNickname(resultSet.getString(++index));
         replyDTO.setUserEmail(resultSet.getString(++index));
         replyDTO.setUserAddress(resultSet.getString(++index));
         replyDTO.setUserBirth(resultSet.getString(++index));
         replyDTO.setUserGender(resultSet.getString(++index));
         replyDTO.setUserRecommenderId(resultSet.getString(++index));
         replies.add(replyDTO);
      }
      
   } catch (SQLException e) {
      e.printStackTrace();
   } catch (Exception e) {
      e.printStackTrace();
   } finally {
      try {
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
   return replies;
}


//	대댓글 삭제
	public void deleteReply(Long replyId, Long target) {
		String query = "DELETE FROM TBL_REPLY WHERE REPLY_ID = ? ";

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, replyId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
//	댓글 삭제
	public void deleteReReply(Long groupId, Long target) {
		String query = "DELETE FROM TBL_REPLY WHERE REPLY_GROUP = ? ";

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, groupId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

//	댓글 수정
		public void UpdateReply(ReplyVO replyVO) {
			String query = "UPDATE TBL_REPLY SET CONTENT = ?, REPLY_UPDATE_DATE = SYSDATE WHERE REPLY_ID = ? ";
			connection = DBConnecter.getConnection();
			try {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, replyVO.getReplyContent());
				preparedStatement.setLong(2, replyVO.getReplyId());
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
					if (connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
