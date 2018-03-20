package com.pine.core.util;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by chenbupang on 2017-11-23 16:40
 */
public class PineConst {
    public static String CLASSPATH = new File(PineConst.class.getResource("/").getPath()).getPath() + File.separator;
    /**
     * 存放用户登录成功后的session信息
     */
    public static String USER_LOGIN_SESSION = "userLoginSession";

    public static String BUSSINESS_PRIMARY_ID = "bs_primary_id";
    public static String BUSSINESS_PRIMARY_NAME = "bs_primary_name";
    public static String BUSSINESS_ENTITY = "bs_entity";

    public static String USER_IN_COOKIE = "U_C_ID";

    public static String DEFAULT_PWD = "1234";
    public static String AES_SALT = "0123456789abcdef";

    /**
     * 启用
     */
    public static final String STATUS_IS_ONUSE = "1";
    /**
     * 停用
     */
    public static final String STATUS_IS_UNUSE = "0";
    /**
     * 删除
     */
    public static final String STATUS_IS_DELETED = "-1";
    /**
     * 正序/升序
     */
    public static final boolean DIRECTION_ASC = true;
    /**
     * 倒序/降序
     */
    public static final boolean DIRECTION_DESC = false;

    /**
     * 允许上传的最大文件:20M
     */
    public static int MAX_FILE_SIZE = 204800;

    /**
     * 系统配置参数
     */
    public static Config OPTIONS = Config.of(new HashMap<>());

    /**
     * 拦截ip
     */
    public static final Set<String> BLOCK_IPS = new HashSet<>(16);
    /**
     * dataTable 默认显示条数
     */
    public static int TABLE_PAGE_SIZE = 8;
    /**
     * dataTable 默认起始位置
     */
    public static int TABLE_PAGE = 0;

}
