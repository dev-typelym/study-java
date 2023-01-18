package domain;

public class FollowVO {
	private Long follow_id;
	private Long follower_id;
	private Long following_id;

	public Long getFollow_id() {
		return follow_id;
	}

	public void setFollow_id(Long follow_id) {
		this.follow_id = follow_id;
	}

	public Long getFollower_id() {
		return follower_id;
	}

	public void setFollower_id(Long follower_id) {
		this.follower_id = follower_id;
	}

	public Long getFollowing_id() {
		return following_id;
	}

	public void setFollowing_id(Long following_id) {
		this.following_id = following_id;
	}

	@Override
	public String toString() {
		return "FollowVO [follow_id=" + follow_id + ", follower_id=" + follower_id + ", following_id=" + following_id
				+ "]";
	}

	
}
