package wooteco.subway.web.line;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import wooteco.subway.service.line.LineService;

@SpringBootTest
@AutoConfigureMockMvc
public class LineControllerTest {
    @Autowired
    protected MockMvc mockMvc;
    @MockBean
    private LineService lineService;
    //
    // @DisplayName("eTag를 활용한 HTTP 캐시 설정 검증")
    // @Test
    // void ETag() throws Exception {
    //     WholeSubwayResponse response = WholeSubwayResponse.of(
    //         Arrays.asList(createMockResponse(), createMockResponse()));
    //     given(lineService.findLinesWithStations()).willReturn(response);
    //
    //     String uri = "/lines/detail";
    //
    //     MvcResult mvcResult = mockMvc.perform(get(uri))
    //         .andDo(print())
    //         .andExpect(status().isOk())
    //         .andExpect(header().exists("ETag"))
    //         .andReturn();
    //
    //     String eTag = mvcResult.getResponse().getHeader("ETag");
    //
    //     mockMvc.perform(get(uri).header("If-None-Match", eTag))
    //         .andDo(print())
    //         .andExpect(status().isNotModified())
    //         .andExpect(header().exists("ETag"))
    //         .andReturn();
    // }
    //
    // private LineDetailResponse createMockResponse() {
    //     List<Station> stations = Arrays.asList(new Station(), new Station(), new Station());
    //     return LineDetailResponse.of(new Line(), stations);
    // }
}

