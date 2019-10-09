package com.carrat.TimeLine.entity;

/**
 * @author DELL 用户文件实体
 * 
 */
public class UserFile {
	
	private String id;//主键
	private String fileName;//文件名称
	private String fileUrl;//文件路径
	private String createTime;//创建时间
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "UserFile [id=" + id + ", fileName=" + fileName + ", fileUrl=" + fileUrl + ", createTime=" + createTime
				+ "]";
	}
}
