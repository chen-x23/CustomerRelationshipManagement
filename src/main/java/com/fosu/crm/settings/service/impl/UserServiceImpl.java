package com.fosu.crm.settings.service.impl;

import com.fosu.crm.settings.dao.UserDao;
import com.fosu.crm.settings.service.UserService;
import com.fosu.crm.utils.SqlSessionUtil;

public class UserServiceImpl implements UserService {

    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
