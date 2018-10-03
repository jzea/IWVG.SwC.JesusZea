package iwvg.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "jesus", "zea");
    }

    @Test
    void testUser() {
        assertEquals(1, user.getNumber());
        assertEquals("Jesus", user.getName());
        assertEquals("Zea", user.getFamilyName());
    }

    @Test
    void testFullname() {
        assertEquals("Jesus Zea", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }

}
