package com.zhuangfei.hputimetable.api.constants;

/**
 * Created by Liu ZhuangFei on 2018/2/11.
 */

public class UrlContacts {

    public final static String URL_BASE="http://www.liuzhuangfei.com/timetable/";

    //保存数据
    public final static String URL_PUT_VALUE="index.php?c=Timetable&a=putValue";

    //获取数据
    public final static String URL_GET_VALUE="index.php?c=Timetable&a=getValue";

    //根据专业获取课程
    public final static String URL_GET_BY_MAJOR="index.php?c=Timetable&a=getByMajor";

    //根据专业名称模糊搜索
    public final static String URL_FIND_MAJOR="index.php?c=Timetable&a=findMajor";

    //通过课程名搜索
    public final static String URL_GET_BY_NAME="index.php?c=Timetable&a=getByName";

    public final static String URL_ISSUES="https://github.com/zfman/HpuTimetableClient/issues";

    //获取已适配学校列表
    public final static String URL_GET_ADAPTER_SCHOOLS="index.php?c=Adapter&a=getAdapterList";

    public final static String URL_GET_ADAPTER_SCHOOLS_V2="index.php?c=Adapter&a=getAdapterListV2";

    public final static String URL_BASE_SCHOOLS="http://www.liuzhuangfei.com/apis/area/";

    //上次html
    public final static String URL_PUT_HTML="index.php?c=Adapter&a=putSchoolHtml";

    public final static String URL_CHECK_SCHOOL="index.php?c=Adapter&a=checkSchool";

    public final static String URL_GET_USER_INFO="index.php?c=Adapter&a=getUserInfo";

    public final static String URL_FIND_HTML_SUMMARY="index.php?c=Adapter&a=findHtmlSummaryByKey";

    public final static String URL_FIND_HTML_DETAIL="index.php?c=Adapter&a=findHtmlDetail";

    public final static String URL_GET_ADAPTER_INFO="index.php?c=Adapter&a=getAdapterInfo";

    public final static String URL_GET_STATIONS="index.php?c=Adapter&a=getStations";

    public final static String URL_GET_MESSAGES="index.php?c=Adapter&a=checkMessages";

    public final static String URL_SET_MESSAGE_READ="index.php?c=Adapter&a=setMessageRead";

    public final static String URL_BIND_SCHOOL="index.php?c=Adapter&a=bindSchool";

    public final static String URL_GET_SCHOOL_PERSON_COUNT="index.php?c=Adapter&a=getSchoolPersonCountV2";

    public final static String URL_CHECK_IS_BIND_SCHOOL="index.php?c=Adapter&a=checkIsBindSchool";

    public final static String URL_GET_STATION_BY_ID="index.php?c=Adapter&a=getStationById";

    //青果URL
    public final static String URL_QINGGUO="wap/wapController.jsp";
    public final static String URL_BASE_QINGGUO="http://www.xiqueer.com:8080/manager/";

}
