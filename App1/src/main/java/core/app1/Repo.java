package core.app1;

import org.springframework.data.jpa.repository.*;

public interface Repo extends JpaRepository<TestEntity, Long> {

}
