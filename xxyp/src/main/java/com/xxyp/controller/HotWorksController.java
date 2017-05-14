package com.xxyp.controller;

import com.xxyp.common.BaseController;
import com.xxyp.model.UserInfo;
import com.xxyp.model.Works;
import com.xxyp.model.WorksPhoto;
import com.xxyp.service.IWorksService;
import com.xxyp.utils.GsonUtil;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jackeymm on 2017/3/12.
 */
@Controller
public class HotWorksController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(HotWorksController.class);


    @Autowired
    private IWorksService worksService;

    @RequestMapping(value = "getHotWorks", method = RequestMethod.GET)
    @ApiOperation(
            value = "获取热门作品接口",
            notes = "获取热门作品信息.</br>"+
                    "Method: GET</br>" +
                    "Error Code: </br>"
                    ,
            response = List.class,
            consumes = "application/json"
    )
    public void getHotWorks() {
        Works works = new Works();
//        List<Works> resultList = worksService.selectByExample(works);
        Map returnMap = new HashMap();
        returnMap.put("hotWorks",initHotWorks());
        outputData(returnMap);
    }

    private List<Works> initHotWorks(){
        List<Works> list = new ArrayList<Works>();
        Works works = new Works();
        works.setUserImage("http://opcse4yv1.bkt.clouddn.com/head1.png");
        works.setUserId(1L);
        works.setUserName("jackey");
        works.setReleaseTime(System.currentTimeMillis());
        works.setStatus(1);
        works.setWorksAddress("北京");
        works.setWorksId(1L);
        works.setWorksIntroduction("姑娘很不错");
        works.setWorksTitle("昨天的客片");
        List<WorksPhoto> photoList = new ArrayList<WorksPhoto>();
        WorksPhoto worksPhoto = new WorksPhoto();
        photoList.add(worksPhoto);
        works.setList(photoList);
        worksPhoto.setWorksId(1L);
        worksPhoto.setStatus(1);
        worksPhoto.setWorksPhotoId(1L);
        worksPhoto.setWorksPhoto("http://opcse4yv1.bkt.clouddn.com/girl1.png");
        worksPhoto.setWorksImageOrder(1);
        worksPhoto.setWorksImageCommentCount(10L);
        worksPhoto.setWorksImageLikeCount(10L);
        list.add(works);

        Works works1 = new Works();
        works1.setUserImage("http://opcse4yv1.bkt.clouddn.com/head1.png");
        works1.setUserId(1L);
        works1.setUserName("jackey");
        works1.setReleaseTime(System.currentTimeMillis());
        works1.setStatus(1);
        works1.setWorksAddress("北京");
        works1.setWorksId(1L);
        works1.setWorksIntroduction("姑娘很不错");
        works1.setWorksTitle("昨天的客片");
        List<WorksPhoto> photoList1 = new ArrayList<WorksPhoto>();
        WorksPhoto worksPhoto1 = new WorksPhoto();
        photoList1.add(worksPhoto1);
        works1.setList(photoList1);
        worksPhoto1.setWorksId(1L);
        worksPhoto1.setStatus(1);
        worksPhoto1.setWorksPhotoId(1L);
        worksPhoto1.setWorksPhoto("http://opcse4yv1.bkt.clouddn.com/girl2.png");
        worksPhoto1.setWorksImageOrder(1);
        worksPhoto1.setWorksImageCommentCount(10L);
        worksPhoto1.setWorksImageLikeCount(10L);
        list.add(works1);

        Works works2 = new Works();
        works2.setUserImage("http://opcse4yv1.bkt.clouddn.com/head1.png");
        works2.setUserId(1L);
        works2.setUserName("jackey");
        works2.setReleaseTime(System.currentTimeMillis());
        works2.setStatus(1);
        works2.setWorksAddress("北京");
        works2.setWorksId(1L);
        works2.setWorksIntroduction("姑娘很不错");
        works2.setWorksTitle("昨天的客片");
        List<WorksPhoto> photoList2 = new ArrayList<WorksPhoto>();
        WorksPhoto worksPhoto2 = new WorksPhoto();
        photoList2.add(worksPhoto2);
        works2.setList(photoList2);
        worksPhoto2.setWorksId(1L);
        worksPhoto2.setStatus(1);
        worksPhoto2.setWorksPhotoId(1L);
        worksPhoto2.setWorksPhoto("http://opcse4yv1.bkt.clouddn.com/girl3.png");
        worksPhoto2.setWorksImageOrder(1);
        worksPhoto2.setWorksImageCommentCount(10L);
        worksPhoto2.setWorksImageLikeCount(10L);
        list.add(works2);

        Works works3 = new Works();
        works3.setUserImage("http://opcse4yv1.bkt.clouddn.com/head1.png");
        works3.setUserId(1L);
        works3.setUserName("jackey");
        works3.setReleaseTime(System.currentTimeMillis());
        works3.setStatus(1);
        works3.setWorksAddress("北京");
        works3.setWorksId(1L);
        works3.setWorksIntroduction("姑娘很不错");
        works3.setWorksTitle("昨天的客片");
        List<WorksPhoto> photoList3 = new ArrayList<WorksPhoto>();
        WorksPhoto worksPhoto3 = new WorksPhoto();
        photoList3.add(worksPhoto3);
        works3.setList(photoList3);
        worksPhoto3.setWorksId(1L);
        worksPhoto3.setStatus(1);
        worksPhoto3.setWorksPhotoId(1L);
        worksPhoto3.setWorksPhoto("http://opcse4yv1.bkt.clouddn.com/girl4.png");
        worksPhoto3.setWorksImageOrder(1);
        worksPhoto3.setWorksImageCommentCount(10L);
        worksPhoto3.setWorksImageLikeCount(10L);
        list.add(works3);

        Works works4 = new Works();
        works4.setUserImage("http://opcse4yv1.bkt.clouddn.com/head1.png");
        works4.setUserId(1L);
        works4.setUserName("jackey");
        works4.setReleaseTime(System.currentTimeMillis());
        works4.setStatus(1);
        works4.setWorksAddress("北京");
        works4.setWorksId(1L);
        works4.setWorksIntroduction("姑娘很不错");
        works4.setWorksTitle("昨天的客片");
        List<WorksPhoto> photoList4 = new ArrayList<WorksPhoto>();
        WorksPhoto worksPhoto4 = new WorksPhoto();
        photoList4.add(worksPhoto4);
        works4.setList(photoList4);
        worksPhoto4.setWorksId(1L);
        worksPhoto4.setStatus(1);
        worksPhoto4.setWorksPhotoId(1L);
        worksPhoto4.setWorksPhoto("http://opcse4yv1.bkt.clouddn.com/girl1.png");
        worksPhoto4.setWorksImageOrder(1);
        worksPhoto4.setWorksImageCommentCount(10L);
        worksPhoto4.setWorksImageLikeCount(10L);
        list.add(works4);

        Works works5 = new Works();
        works5.setUserImage("http://opcse4yv1.bkt.clouddn.com/head1.png");
        works5.setUserId(1L);
        works5.setUserName("jackey");
        works5.setReleaseTime(System.currentTimeMillis());
        works5.setStatus(1);
        works5.setWorksAddress("北京");
        works5.setWorksId(1L);
        works5.setWorksIntroduction("姑娘很不错");
        works5.setWorksTitle("昨天的客片");
        List<WorksPhoto> photoList5 = new ArrayList<WorksPhoto>();
        WorksPhoto worksPhoto5 = new WorksPhoto();
        photoList5.add(worksPhoto5);
        works5.setList(photoList5);
        worksPhoto5.setWorksId(1L);
        worksPhoto5.setStatus(1);
        worksPhoto5.setWorksPhotoId(1L);
        worksPhoto5.setWorksPhoto("http://opcse4yv1.bkt.clouddn.com/girl1.png");
        worksPhoto5.setWorksImageOrder(1);
        worksPhoto5.setWorksImageCommentCount(10L);
        worksPhoto5.setWorksImageLikeCount(10L);
        list.add(works5);

        return list;

    }


}
