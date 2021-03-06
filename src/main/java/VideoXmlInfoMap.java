import java.util.HashMap;
import java.util.Map;

/**
 * Created by tanrong.ltr on 16/9/25.
 * 此类写由抓包得来的各课程视频信息XML地址
 */
public class VideoXmlInfoMap {
    private static Map<String,String> xmlMap2016=new HashMap<String, String>(){
        {
            put("药理学", "http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=1c40a6u2u7rcoo8v1kqnri0os6&cwID=m000000216a&time=2016-09-25%2021%3A58%3A00&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=-1092338852064116902&type=0&pkey=f5022cdf251f92de2928741ce1e745f1");
            put("医学心理学", "http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=1c40a6u2u7rcoo8v1kqnri0os6&cwID=m000000716b&time=2016-09-25%2021%3A59%3A31&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=5720136626515049675&type=0&pkey=fff6150a714190d87a2cc0bff940563f");
            put("生物化学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=0c0pnepcn7rmjmrm9stpnks9k3&cwID=m000010146a&time=2016-09-25%2022%3A15%3A16&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=-981668702084447603&type=0&pkey=96187e2083eb69643b551c612bd30acd");
            put("医学微生物学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000010316b&time=2016-09-26%2000%3A04%3A12&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=6072431935573196566&type=0&pkey=76ba215e3c8fdbd750990d8f7d384906");
            put("医学免疫学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000010416b&time=2016-09-26%2000%3A04%3A27&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=-5242942659893728686&type=0&pkey=be3478b41246976995cb2fd633b951db");
            put("预防医学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000010616b&time=2016-09-26%2000%3A04%3A39&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=2636275515881437358&type=0&pkey=fb0af2c0a2e25671f1de6ef6c2169571");
            put("医学伦理学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000010816a&time=2016-09-26%2000%3A05%3A01&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=6332586424846896515&type=0&pkey=6c7db28a3a3c0d8c248f2315b15ad86a");
            put("口腔内科学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000011116b&time=2016-09-26%2000%3A05%3A27&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=4912832190750789838&type=0&pkey=ca629c403e011646ba52ad2fa386e82b");
            put("口腔解剖生理学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000020916b&time=2016-09-26%2000%3A05%3A43&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=4327481510748725880&type=0&pkey=62e525d62c900ead4ca8df63964877c2");
            put("内科学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000021516b&time=2016-09-26%2000%3A05%3A56&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=-5052503795580339799&type=0&pkey=ee3b32f96c9e0eeb2bd70833edb7d267");
            put("外科学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000021616b&time=2016-09-26%2000%3A06%3A18&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=1562113496184100426&type=0&pkey=4258b55c99032dc388266c4d3c864f48");
            put("口腔预防科学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000021816a&time=2016-09-26%2000%3A06%3A56&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=6251434141417855262&type=0&pkey=f5d73e490192f2664b8817bb2ea95cea");
            put("口腔颌面外科学(讲座一)","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000031256a&time=2016-09-26%2000%3A07%3A08&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=-9041412511295768030&type=0&pkey=2b66db8ebceb64346400ab39b57b8936");
            put("口腔颌面外科学(讲座二)","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000031256d&time=2016-09-26%2000%3A07%3A23&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=-584112069855869930&type=0&pkey=abce15ed56b141237f99a53e7b8e47ec");
            put("口腔修复学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000131316b&time=2016-09-26%2000%3A07%3A36&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=-4820325454597753921&type=0&pkey=fe694538bdd7214a5caf93f0c362bd11");
            put("卫生法规","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000310516b&time=2016-09-26%2000%3A07%3A48&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=7623718094838615630&type=0&pkey=77e805f2870237d3e3df4bed3d5863eb");
            put("儿科学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=med10074716&time=2016-09-26%2000%3A08%3A02&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=6488417076621895647&type=0&pkey=5cd1afef71f736f1ecbd21e534a53130");
            put("妇产科学","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=med1007496a&time=2016-09-26%2000%3A08%3A13&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=-8384906468865437556&type=0&pkey=13bd5ab225eb4c734b67d595b66dc714");
            put("笔试应试技巧班","http://member.med66.com/newApi/classroom/course/getCourseDetail.shtm?platformSource=1&sid=dun49449714h3s87t89vlq1ek5&cwID=m000002003b&time=2016-09-26%2000%3A08%3A23&username=qindongliang0625&appkey=a927a05d-02ca-43f5-946d-089120f18173&getType=2&version=3.4.4&random=4668149901770086403&type=0&pkey=33bfba0f91fc3a09a126691a4f2463cf");
        }
    };
    public static Map<String,String> getMap2016(){

        return xmlMap2016;
    }
}
