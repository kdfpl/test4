import static org.assertj.core.api.Assertions.assertThat;

import org.example.BaiHat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class Bai4 {
    private List<BaiHat> danhSachBaiHat;

    @BeforeEach
    void setUp() {
        danhSachBaiHat = new ArrayList<>();
    }

    void themBaiHat(BaiHat baiHat) {
        if (baiHat.getDoDai() > 0) {
            danhSachBaiHat.add(baiHat);
        }
    }

    void xoaBaiHat(String id) {
        danhSachBaiHat.removeIf(bh -> bh.getId().equals(id));
    }

    @Test
    void testThemBaiHat_Valid() {
        BaiHat baiHat = new BaiHat("1", "Bai Ca", "Ca Si A", 180, "Nhac Si B");
        themBaiHat(baiHat);
        assertThat(danhSachBaiHat).hasSize(1);
    }

    @Test
    void testThemBaiHat_DoDaiKhongHopLe() {
        BaiHat baiHat = new BaiHat("2", "Bai Moi", "Ca Si B", -10, "Nhac Si C");
        themBaiHat(baiHat);
        assertThat(danhSachBaiHat).isEmpty();
    }

    @Test
    void testXoaBaiHat_Valid() {
        BaiHat baiHat = new BaiHat("1", "Bai Ca", "Ca Si A", 180, "Nhac Si B");
        themBaiHat(baiHat);
        xoaBaiHat("1");
        assertThat(danhSachBaiHat).isEmpty();
    }

    @Test
    void testXoaBaiHat_KhongTonTai() {
        xoaBaiHat("99");
        assertThat(danhSachBaiHat).isEmpty();
    }
}
