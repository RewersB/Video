package pl.yellowduck.netflix90.resources;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;

public class UniqueVideoCassetteCatalogTest {

    @Test
    public void shouldNotAddSameIdVideCassette() {
        // given
        VideoCassette videoCassette1 = new VideoCassette(
                "V001",
                BigDecimal.valueOf(20),
                "The room",
                new Director("Tommy", "Wiseau", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", Gender.MALE)));

        VideoCassette videoCassette2 = new VideoCassette(
                "V001",
                BigDecimal.valueOf(20),
                "The room",
                new Director("Tommy", "Wiseau", Gender.MALE),
                Category.DRAMA,
                Set.of(new Actor("Tommy", "Wiseau", Gender.MALE)));

        IVideoCassetteCatalog catalog = new UniqueVideoCassetteCatalog();
        // when
//        catalog.addVideoCassette(videoCassette1, videoCassette2);
        // then
        Assertions.assertThat(catalog.getVideoCassettes())
                .hasSize(1);
    }
}