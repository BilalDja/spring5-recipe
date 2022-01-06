package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bilal Djaghout on 08/12/2021
 */

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
