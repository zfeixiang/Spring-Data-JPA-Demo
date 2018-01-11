package com.example.demo.model;

/**
 * 消息类
 * @author zfeix
 *
 */
public class Message {
    private Integer id;
    //发送者ID
    private Integer send;
    //接收者ID 
	private Integer receive;

    private String detail;

    private Long modifyTime;
    //语音或视频时长
    private String duration;
    
	private Integer type;

    public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSend() {
        return send;
    }

    public void setSend(Integer send) {
        this.send = send;
    }

    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

	@Override
	public String toString() {
		return "Message [id=" + id + ", send=" + send + ", receive=" + receive + ", detail=" + detail + ", modifyTime="
				+ modifyTime + ", duration=" + duration + ", type=" + type + "]";
	}

	
	
    
}