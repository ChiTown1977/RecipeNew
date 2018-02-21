package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Daniel Tominov on 2/5/2018
 */
public class CategoryTest {

    private Category category;

    @Before
    public void init() {
        category = Category.testCategory();
    }

    @Test
    public void getId() {
        Long testLong = 1L;
        assertEquals(testLong, category.getId());
    }

    @Test
    public void getDescription() {
        String testDesc = "Test Description";
        assertEquals(testDesc, category.getDescription());
    }

    @Test
    public void getRecipes() {
        Set<Recipe> recipeSet = category.getRecipes();
        assertNotNull(recipeSet);
    }
}