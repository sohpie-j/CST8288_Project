import com.cst8288.lab2.indysimplelab2.AuthorDAO;
import com.cst8288.lab2.indysimplelab2.AuthorDAOImpl;
import com.cst8288.lab2.indysimplelab2.AuthorDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IndySimpleTest {

    private static AuthorDAO dao;

    public IndySimpleTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        dao = new AuthorDAOImpl();
    }

    @AfterAll
    public static void tearDownClass() {
        dao = null;
    }

    @BeforeEach
    public void setUp() {
        // Clean up or prepare database before each test if needed
    }

    @AfterEach
    public void tearDown() {
        // Clean up after each test if necessary
    }

    @Test
    public void testAddWinnerValid() {
        // Arrange
        AuthorDTO validWinner = new AuthorDTO(2025, "Test Driver", 150.0, "USA");

        // Act
        boolean isAdded = dao.addWinner(validWinner);

        // Assert
        assertTrue(isAdded, "A valid winner should be added successfully.");
    }

    @Test
    public void testAddWinnerInvalid() {
        // Arrange
        AuthorDTO invalidWinner = new AuthorDTO(2026, "", 150.0, "USA");

        // Act
        boolean isAdded = dao.addWinner(invalidWinner);

        // Assert
        assertFalse(isAdded, "An invalid winner with an empty driver name should not be added.");
    }

    @Test
    public void testGetWinnersFirstPage() {
        // Arrange
        int offset = 0;
        int limit = 10;

        // Act
        List<AuthorDTO> winners = dao.getWinners(offset, limit);

        // Assert
        assertNotNull(winners, "The list of winners should not be null.");
        assertTrue(winners.size() <= limit, "The size of winners should be less than or equal to the limit.");
    }

    @Test
    public void testGetWinnersPagination() {
        // Arrange
        int limit = 10;

        // Act
        List<AuthorDTO> firstPageWinners = dao.getWinners(0, limit);
        List<AuthorDTO> secondPageWinners = dao.getWinners(limit, limit);

        // Assert
        assertNotNull(firstPageWinners, "First page of winners should not be null.");
        assertNotNull(secondPageWinners, "Second page of winners should not be null.");
        assertNotEquals(firstPageWinners, secondPageWinners, "The first and second page results should not be the same.");
    }
}
