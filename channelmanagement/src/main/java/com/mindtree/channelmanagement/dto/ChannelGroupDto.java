package com.mindtree.channelmanagement.dto;

import java.util.List;

public class ChannelGroupDto {

private int channelGroupId;
	
	private String channelGroupName;
	
	private List<ChannelDto> channelDto;

	public ChannelGroupDto() {
		super();
	}

	public ChannelGroupDto(int channelGroupId, String channelGroupName, List<ChannelDto> channelDto) {
		super();
		this.channelGroupId = channelGroupId;
		this.channelGroupName = channelGroupName;
		this.channelDto = channelDto;
	}

	public int getChannelGroupId() {
		return channelGroupId;
	}

	public void setChannelGroupId(int channelGroupId) {
		this.channelGroupId = channelGroupId;
	}

	public String getChannelGroupName() {
		return channelGroupName;
	}

	public void setChannelGroupName(String channelGroupName) {
		this.channelGroupName = channelGroupName;
	}

	public List<ChannelDto> getChannelDto() {
		return channelDto;
	}

	public void setChannelDto(List<ChannelDto> channelDto) {
		this.channelDto = channelDto;
	}

	@Override
	public String toString() {
		return "ChannelGroupDto [channelGroupId=" + channelGroupId + ", channelGroupName=" + channelGroupName
				+ ", channelDto=" + channelDto + "]";
	}


	
}
