package com.deploy.jenkins;

import com.deploy.jenkins.Controller.HelloController;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.xml.ws.Response;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
public class TestHelloController extends AbstractTest {

    @Autowired
    private WebApplicationContext context;
    @Autowired
    FilterChainProxy springSecurityFilterChain;

    private MockMvc helloMockMvc;

    @InjectMocks
    private HelloController helloController;


    @Before
    public void setup() {
        this.
                helloMockMvc= MockMvcBuilders.standaloneSetup(helloController).build();
       /* this.helloMockMvc = MockMvcBuilders.webAppContextSetup(context)
                .addFilter(springSecurityFilterChain).build();*/

    }
    @Test
    public void testGetTest() throws Exception {
        helloMockMvc.perform(get("/helloController/test")).andExpect(status().isOk()).andExpect(content().string(" I Like Cats :)"));

    }
}
