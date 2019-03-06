import cn.javastack.springboot.starter.jpa.Application;
import cn.javastack.springboot.starter.jpa.TestModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author: Zhao MengXia
 * @Date: 2019/3/6 11:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Tests {

    @Autowired
    private WebApplicationContext context;

    @Value("${server.port}")
    private int port;

    private MockMvc mockMvc;
    private MockHttpSession session;


    @Before
    public void setupMockMvc () throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).alwaysExpect(status().isOk()).build();
//        this.session = getHttpSession();
    }

//    private MockHttpSession getHttpSession () throws Exception {
//        BASE64Encoder encoder = new BASE64Encoder();
//        return (MockHttpSession) mockMvc.perform(post("/wl/system/login")
//                .characterEncoding("UTF-8")
//                .param("userName", String.valueOf(encoder.encode("admin".getBytes(CharsetUtil.UTF_8))))
//                .param("password", String.valueOf(encoder.encode("123456".getBytes(CharsetUtil.UTF_8)))))
//                .andReturn().getRequest().getSession();
//    }

    String url="/test";
    @Test
    public void test1() throws Exception {
        mockMvc.perform(get(url + "/findAll")
                .characterEncoding("UTF-8")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());

    }


    @Test
    public void save() throws Exception {
       TestModel testModel = new TestModel();
        testModel.setName("zhao");
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        java.lang.String requestJson = ow.writeValueAsString(testModel);
        System.out.println(requestJson);
        mockMvc.perform(post(url + "/saveTestModel")
                .characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON).content(requestJson))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
