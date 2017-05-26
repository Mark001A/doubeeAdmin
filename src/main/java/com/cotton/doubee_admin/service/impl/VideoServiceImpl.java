package com.cotton.doubee_admin.service.impl;

import com.cotton.base.service.impl.BaseServiceImpl;
import com.cotton.doubee_admin.model.Video;
import com.cotton.doubee_admin.service.VideoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017-05-25.
 */

@Service
@Transactional
public class VideoServiceImpl extends BaseServiceImpl<Video> implements VideoService {
}