import org.example.SinhVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Bai2 {
    private List<SinhVien> svList;

    @BeforeEach
    void setUp() {
        svList = new ArrayList<>();
    }

    @Test
    void testAddSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "KTPM", "2024", "Java");
        svList.add(sv);
        assertThat(svList).hasSize(1);
    }

    @Test
    void testFindSinhVienByIdValid() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "KTPM", "2024", "Java");
        svList.add(sv);
        SinhVien found = svList.stream().filter(s -> s.getMaSV() == 1).findFirst().orElse(null);
        assertThat(found).isNotNull();
        assertThat(found.getTenSV()).isEqualTo("Nguyen Van A");
    }
}
