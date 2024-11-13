package core.app1;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
public class TestEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String entityName;

    public TestEntity setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
}
