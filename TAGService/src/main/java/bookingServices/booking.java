package bookingServices;

import java.sql.Date;
import java.sql.Time;

public class booking {

	private int id;
	private String interviewerEmailId;
	private String intervieweeEmailId;
	private String tagTeamEmailId;
	private Date date;
	//private String date;
	private String boookingStatus;
	//private Date startTime;
	private Time startTime;
	
	//private Date endTime;
	private Time endTime;
	private String techStack;
	private String description;
	
	
	
	public booking(int id, String interviewerEmailId, String intervieweeEmailId, String tagTeamEmailId, Date date,
			String boookingStatus, Time startTime, Time endTime, String techStack, String description) {
		super();
		this.id = id;
		this.interviewerEmailId = interviewerEmailId;
		this.intervieweeEmailId = intervieweeEmailId;
		this.tagTeamEmailId = tagTeamEmailId;
		this.date = date;
		this.boookingStatus = boookingStatus;
		this.startTime = startTime;
		this.endTime = endTime;
		this.techStack = techStack;
		this.description = description;
	}
	
	public booking() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInterviewerEmailId() {
		return interviewerEmailId;
	}
	public void setInterviewerEmailId(String interviewerEmailId) {
		this.interviewerEmailId = interviewerEmailId;
	}
	public String getIntervieweeEmailId() {
		return intervieweeEmailId;
	}
	public void setIntervieweeEmailId(String intervieweeEmailId) {
		this.intervieweeEmailId = intervieweeEmailId;
	}
	public String getTagTeamEmailId() {
		return tagTeamEmailId;
	}
	public void setTagTeamEmailId(String teamTeamEmailId) {
		this.tagTeamEmailId = teamTeamEmailId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date scheduleDate) {
		this.date = scheduleDate;
	}
	public String getBoookingStatus() {
		return boookingStatus;
	}
	public void setBoookingStatus(String boookingStatus) {
		this.boookingStatus = boookingStatus;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time scheduleStartTime) {
		this.startTime = scheduleStartTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time scheduleEndTime) {
		this.endTime = scheduleEndTime;
	}
	public String getTechStack() {
		return techStack;
	}
	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "booking [id=" + id + ", interviewerEmailId=" + interviewerEmailId + ", intervieweeEmailId="
				+ intervieweeEmailId + ", teamTeamEmailId=" + tagTeamEmailId + ", date=" + date + ", boookingStatus="
				+ boookingStatus + ", startTime=" + startTime + ", endTime=" + endTime + ", techStack=" + techStack
				+ ", description=" + description + "]";
	}
	
}
