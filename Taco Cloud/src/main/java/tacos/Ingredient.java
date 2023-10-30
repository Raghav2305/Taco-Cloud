package tacos;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.beans.ConstructorProperties;


@Data
@Table
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Ingredient implements Persistable<String> {

    @Id
    String id;
    String name;
    Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

//    @ConstructorProperties({"id", "name", "type"})
//    public Ingredient(String id, String name, Type type) {
//        this.id = id;
//        this.name = name;
//        this.type = type;
//    }


    @Override
    public boolean isNew() {
        // You can implement your logic here to determine if the ingredient is new or not.
        // For example, you can check if the 'id' property is null.
        return id == null;
    }


}
