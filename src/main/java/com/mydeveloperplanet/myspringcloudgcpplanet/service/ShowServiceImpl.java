package com.mydeveloperplanet.myspringcloudgcpplanet.service;

import com.mydeveloperplanet.myspringcloudgcpplanet.dao.ShowDao;
import com.mydeveloperplanet.myspringcloudgcpplanet.domain.Show;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ShowServiceImpl implements ShowService {

    @Resource
    ShowDao showDao;

    @Override
    public List<Show> findAll() {
        return showDao.findAll();
    }

}
