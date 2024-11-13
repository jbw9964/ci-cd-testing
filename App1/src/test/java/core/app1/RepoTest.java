package core.app1;

import static org.assertj.core.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.*;

@SpringBootTest
@ActiveProfiles("test")
class RepoTest {

    @Autowired
    Repo repo;

    @Test
    void insert() {
        TestEntity testEntity = new TestEntity().setEntityName("TESTING");

        repo.save(testEntity);

        Optional<TestEntity> result = repo.findById(testEntity.getId());

        assertThat(result).isPresent();
        assertThat(result.get().getEntityName())
                .isEqualTo(testEntity.getEntityName());
        assertThat(result.get().getId()).isNotNull();
    }
}