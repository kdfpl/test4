import static org.assertj.core.api.Assertions.assertThat;
import org.example.XeOTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    private List<XeOTO> xeList;

    @BeforeEach
    void setUp() {
        xeList = new ArrayList<>();
    }

    @Test
    void testAddValid() {
        XeOTO xe = new XeOTO(1, "Toyota", 50000, "New");
        xeList.add(xe);
        assertThat(xeList).hasSize(1);
    }

    @Test
    void testUpdateValid() {
        XeOTO xe = new XeOTO(1, "Toyota", 50000, "New");
        xeList.add(xe);
        xe.setGia(60000);
        assertThat(xeList.get(0).getGia()).isEqualTo(60000);
    }

    @Test
    void testDeleteValid() {
        XeOTO xe = new XeOTO(1, "Toyota", 50000, "New");
        xeList.add(xe);
        xeList.remove(0);
        assertThat(xeList).isEmpty();
    }
}
