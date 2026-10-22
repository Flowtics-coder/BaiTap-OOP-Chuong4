public class DonHang {
    private String tenKhach;
    private SanPham sanPham;
    private int soLuong;

    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        // Hoàn thành TODO: soLuong < 1 thì gán 1
        if (soLuong < 1) {
            this.soLuong = 1;
        } else {
            this.soLuong = soLuong;
        }
    }

    public double tinhThanhTien() {
        double thanhTien = this.sanPham.getDonGia() * this.soLuong;
        if (this.soLuong >= 5) {
            thanhTien = thanhTien * 0.9; // Giảm 10%
        }
        return thanhTien;
    }

    public void inDonHang() {
        String tienFormat = String.format("%,.0f", this.tinhThanhTien()).replace(',', '.');
        System.out.printf("%-7s %-18s %-4d %10s%n",
                this.tenKhach,
                this.sanPham.getTenSP(),
                this.soLuong,
                tienFormat);

        if (this.soLuong >= 5) {
            System.out.printf("%-7s %-18s%n", "", "(đã giảm 10%)");
        }
    }
}