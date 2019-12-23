package com.mindtree.channelmanagement.service;

import java.util.List;

import com.mindtree.channelmanagement.dto.ChannelDto;
import com.mindtree.channelmanagement.dto.ChannelGroupDto;
import com.mindtree.channelmanagement.dto.ShowDto;
import com.mindtree.channelmanagement.entity.Channel;
import com.mindtree.channelmanagement.exception.ServiceException;

public interface ChannelGroupService {

	public ChannelGroupDto addChannelGroup(ChannelGroupDto channelGroupDto);

	public ChannelDto addChannel(ChannelDto channelDto);

	public ShowDto addShows(ShowDto showDto);

	public ChannelDto addChannelToChannelGroup(String channelName, String channelGroupName) throws ServiceException;

	public ShowDto addShowToChannel(String showName, String channelName) throws ServiceException;

	public List<ChannelDto> sorting(int channelGroupId);

}
