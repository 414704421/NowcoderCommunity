package com.nowcoder.community;


import com.nowcoder.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;



@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = NowcoderApplication.class)
public class MailTests {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testMail(){
        mailClient.sendMail("41474421@qq.com","退信代码说明","网易鼓励企业用户在遵守互联网标准的前提下，向网易邮箱用户发送已经许可的邮件。为了确保您的邮件能及时准确的投递到网易邮箱，请首先确认您没有违背网易的反垃圾政策，点击查看详情。\n" +
                "　　若您的邮件仍无法到达网易邮箱，并收到退信，请根据退信的返回字段，在下面的表单查询具体的退信原因。如果这些信息仍不能解决你的问题，那么请点击这里填写故障反馈表。\n" +
                "退信代码说明：\n" +
                "　　•421 HL:REP 该IP发送行为异常，存在接收者大量不存在情况，被临时禁止连接。请检查是否有用户发送病毒或者垃圾邮件，并核对发送列表有效性；\n" +
                "　　•421 HL:ICC 该IP同时并发连接数过大，超过了网易的限制，被临时禁止连接。请检查是否有用户发送病毒或者垃圾邮件，并降低IP并发连接数量；\n" +
                "　　•421 HL:IFC 该IP短期内发送了大量信件，超过了网易的限制，被临时禁止连接。请检查是否有用户发送病毒或者垃圾邮件，并降低发送频率；\n" +
                "　　•421 HL:MEP 该IP发送行为异常，存在大量伪造发送域域名行为，被临时禁止连接。请检查是否有用户发送病毒或者垃圾邮件，并使用真实有效的域名发送；\n" +
                "　　•450 MI:CEL 发送方出现过多的错误指令。请检查发信程序；\n" +
                "　　•450 MI:DMC 当前连接发送的邮件数量超出限制。请减少每次连接中投递的邮件数量；\n" +
                "　　•450 MI:CCL 发送方发送超出正常的指令数量。请检查发信程序；\n" +
                "　　•450 RP:DRC 当前连接发送的收件人数量超出限制。请控制每次连接投递的邮件数量；\n" +
                "　　•450 RP:CCL 发送方发送超出正常的指令数量。请检查发信程序；\n" +
                "　　•450 DT:RBL 发信IP位于一个或多个RBL里。请参考http://www.rbls.org/关于RBL的相关信息；\n" +
                "　　•450 WM:BLI 该IP不在网易允许的发送地址列表里；\n" +
                "　　•450 WM:BLU 此用户不在网易允许的发信用户列表里；\n" +
                "　　•451 DT:SPM ,please try again 邮件正文带有垃圾邮件特征或发送环境缺乏规范性，被临时拒收。请保持邮件队列，两分钟后重投邮件。需调整邮件内容或优化发送环境；\n" +
                "　　•451 Requested mail action not taken: too much fail authentication 登录失败次数过多，被临时禁止登录。请检查密码与帐号验证设置；\n" +
                "　　•451 RP:CEL 发送方出现过多的错误指令。请检查发信程序；\n" +
                "　　•451 MI:DMC 当前连接发送的邮件数量超出限制。请控制每次连接中投递的邮件数量；\n" +
                "　　•451 MI:SFQ 发信人在15分钟内的发信数量超过限制，请控制发信频率；\n" +
                "　　•451 RP:QRC 发信方短期内累计的收件人数量超过限制，该发件人被临时禁止发信。请降低该用户发信频率；\n" +
                "　　•451 Requested action aborted: local error in processing 系统暂时出现故障，请稍后再次尝试发送；\n" +
                "　　•500 Error: bad syntaxU 发送的smtp命令语法有误；\n" +
                "　　•550 MI:NHD HELO命令不允许为空；\n" +
                "　　•550 MI:IMF 发信人电子邮件地址不合规范。请参考http://www.rfc-editor.org/关于电子邮件规范的定义；\n" +
                "　　•550 MI:SPF 发信IP未被发送域的SPF许可。请参考http://www.openspf.org/关于SPF规范的定义；\n" +
                "　　•550 MI:DMA 该邮件未被发信域的DMARC许可。请参考http://dmarc.org/关于DMARC规范的定义；\n" +
                "　　•550 MI:STC 发件人当天的连接数量超出了限定数量，当天不再接受该发件人的邮件。请控制连接次数；\n" +
                "　　•550 RP:FRL 网易邮箱不开放匿名转发（Open relay）；\n" +
                "　　•550 RP:RCL 群发收件人数量超过了限额，请减少每封邮件的收件人数量；\n" +
                "　　•550 RP:TRC 发件人当天内累计的收件人数量超过限制，当天不再接受该发件人的邮件。请降低该用户发信频率；\n" +
                "　　•550 DT:SPM 邮件正文带有很多垃圾邮件特征或发送环境缺乏规范性。需调整邮件内容或优化发送环境；\n" +
                "　　•550 Invalid User 请求的用户不存在；\n" +
                "　　•550 User in blacklist 该用户不被允许给网易用户发信；\n" +
                "　　•550 User suspended 请求的用户处于禁用或者冻结状态；\n" +
                "　　•550 Requested mail action not taken: too much recipient 群发数量超过了限额；\n" +
                "　　•552 Illegal Attachment 不允许发送该类型的附件，包括以.uu .pif .scr .mim .hqx .bhx .cmd .vbs .bat .com .vbe .vb .js .wsh等结尾的附件；\n" +
                "　　•552 Requested mail action aborted: exceeded mailsize limit 发送的信件大小超过了网易邮箱允许接收的最大限制；\n" +
                "　　•553 Requested action not taken: NULL sender is not allowed 不允许发件人为空，请使用真实发件人发送；\n" +
                "　　•553 Requested action not taken: Local user only SMTP类型的机器只允许发信人是本站用户；\n" +
                "　　•553 Requested action not taken: no smtp MX only MX类型的机器不允许发信人是本站用户；\n" +
                "　　•553 authentication is required SMTP需要身份验证，请检查客户端设置；\n" +
                "　　•554 DT:SPM 发送的邮件内容包含了未被许可的信息，或被系统识别为垃圾邮件。请检查是否有用户发送病毒或者垃圾邮件；\n" +
                "　　•554 DT:SUM 信封发件人和信头发件人不匹配；\n" +
                "　　•554 IP is rejected, smtp auth error limit exceed 该IP验证失败次数过多，被临时禁止连接。请检查验证信息设置；\n" +
                "　　•554 HL:IHU 发信IP因发送垃圾邮件或存在异常的连接行为，被暂时挂起。请检测发信IP在历史上的发信情况和发信程序是否存在异常；\n" +
                "　　•554 HL:IPB 该IP不在网易允许的发送地址列表里；\n" +
                "　　•554 MI:STC 发件人当天内累计邮件数量超过限制，当天不再接受该发件人的投信。请降低发信频率；\n" +
                "　　•554 MI:SPB 此用户不在网易允许的发信用户列表里；\n" +
                "————————————————\n" +
                "版权声明：本文为CSDN博主「DY丶老周」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。\n" +
                "原文链接：https://blog.csdn.net/dayonglove2018/article/details/106786433【i撒旦解放【爱上帝就发【即使对方【i'o'a's'j'd'fii氨基酸的克里夫那iOS的房间阿斯蒂芬骄傲【打飞机啊【i啥都放假【欧式的肌肤【啊iOS的肌肤【爱上帝就发【哦i");
    }

    @Test
    public void testHtmlMail() {
        Context context = new Context();
        context.setVariable("username", "sunday");

        String content = templateEngine.process("/mail/activation", context);
        System.out.println(content);

        mailClient.sendMail("414704421@qq.com", "HTML", content);
    }

}
