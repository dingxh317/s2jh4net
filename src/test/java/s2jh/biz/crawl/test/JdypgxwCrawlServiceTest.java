package s2jh.biz.crawl.test;

import lab.s2jh.module.crawl.service.test.CrawlServiceTest;

import org.junit.Test;

public class JdypgxwCrawlServiceTest extends CrawlServiceTest {

    @Test
    public void startup() throws Exception {
        crawlService.startup(buildDefaultCrawlConfig(), "http://www.jdypgxw.com/").get();
    }
}
