package com.mindtree.channelmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.channelmanagement.dto.ChannelDto;
import com.mindtree.channelmanagement.dto.ChannelGroupDto;
import com.mindtree.channelmanagement.dto.ShowDto;
import com.mindtree.channelmanagement.entity.Channel;
import com.mindtree.channelmanagement.entity.ChannelGroup;
import com.mindtree.channelmanagement.entity.Shows;
import com.mindtree.channelmanagement.exception.NoSuchChannelException;
import com.mindtree.channelmanagement.exception.NoSuchChannelGroupException;
import com.mindtree.channelmanagement.exception.NoSuchShowException;
import com.mindtree.channelmanagement.exception.ServiceException;
import com.mindtree.channelmanagement.exception.util.ErrorConstants;
import com.mindtree.channelmanagement.repository.ChannelGroupRepository;
import com.mindtree.channelmanagement.repository.ChannelRepository;
import com.mindtree.channelmanagement.repository.ShowRepository;
import com.mindtree.channelmanagement.service.ChannelGroupService;

@Service
public class ChannelGroupServiceImpl implements ChannelGroupService{
	
	@Autowired
	private ChannelGroupRepository channelGroupRepo;
	
	@Autowired
	private ChannelRepository channelRepo;
	
	@Autowired
	private ShowRepository showRepo;
	
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public ChannelGroupDto addChannelGroup(ChannelGroupDto channelGroupDto) {
		// TODO Auto-generated method stub
		
		ChannelGroup channelgroup = modelMapper.map(channelGroupDto, ChannelGroup.class);
		
		ChannelGroup channelgp =channelGroupRepo.save(channelgroup);
		
		ChannelGroupDto channelgpdto = modelMapper.map(channelgp, ChannelGroupDto.class);
		
		return channelgpdto;
	}

	@Override
	public ChannelDto addChannel(ChannelDto channelDto) {
		// TODO Auto-generated method stub
		Channel channel = modelMapper.map(channelDto, Channel.class);
		
		Channel channels =channelRepo.save(channel);
		
		ChannelDto channeldto = modelMapper.map(channels, ChannelDto.class);
		
		return channeldto;
		
	}

	@Override
	public ShowDto addShows(ShowDto showDto) {
		// TODO Auto-generated method stub
		Shows mshows = modelMapper.map(showDto, Shows.class);
		
		Shows shows = showRepo.save(mshows);
		
		ShowDto mshowDto = modelMapper.map(shows, ShowDto.class);
		
		return mshowDto;
	}

	@Override
	public ChannelDto addChannelToChannelGroup(String channelName, String channelGroupName) throws ServiceException {
		// TODO Auto-generated method stub
		Channel assignChannel = null;
		
		ChannelGroup assignChannelGroup = null;
		
		List<Channel> channelList= channelRepo.findAll();
	
		for (Channel channel : channelList) {
			if(channel.getChannelName().equalsIgnoreCase(channelName)){
				assignChannel = channel;
			}
		}
		List<ChannelGroup> channelGroupList = channelGroupRepo.findAll();
		for (ChannelGroup channelGroup : channelGroupList) {
			assignChannelGroup = channelGroup;
		}
		
		if(assignChannel==null) {
			throw new NoSuchChannelException(ErrorConstants.NOSUCHCHANNEL);
		}
		if(assignChannelGroup==null) {
			throw new NoSuchChannelGroupException(ErrorConstants.NOSUCHCHANNELGROUP);
		}
		assignChannel.setChannelGroup(assignChannelGroup);
		channelRepo.save(assignChannel);
		
		ChannelDto channeldto = modelMapper.map(assignChannel, ChannelDto.class);
		
		return channeldto;
	}

	@Override
	public ShowDto addShowToChannel(String showName, String channelName) throws ServiceException {
		// TODO Auto-generated method stub
		Shows assignShow =null;
		
		Channel assignChannel = null;
		
		List<Shows> showlList = showRepo.findAll();
		
		for (Shows shows : showlList) {
			if(shows.getShowName().equalsIgnoreCase(showName)) {
				assignShow = shows;
			}
		}
		List<Channel> channelList= channelRepo.findAll();
		for (Channel channel : channelList) {
			if(channel.getChannelName().equalsIgnoreCase(channelName)){
				assignChannel = channel;
			}
		}
		if(assignShow==null) {
			throw new NoSuchShowException(ErrorConstants.NOSUCHSHOW);
		}
		if(assignChannel==null) {
			throw new NoSuchChannelException(ErrorConstants.NOSUCHCHANNEL);
		}
		assignShow.setChannel(assignChannel);
		showRepo.save(assignShow);
		
		ShowDto showDto = modelMapper.map(assignShow, ShowDto.class);
		return showDto;
		
	}

	@Override
	public List<ChannelDto> sorting(int channelGroupId) {
		// TODO Auto-generated method stub
		
		ChannelGroup channelGroup = channelGroupRepo.findById(channelGroupId).get();
		List<ChannelDto> channelDtos = new ArrayList<ChannelDto>();
		for (Channel channel : channelGroup.getChannel()) {
			
		}
		return null;
	}
	


}
