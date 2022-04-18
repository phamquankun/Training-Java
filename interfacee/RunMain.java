package interfacee;

public class RunMain implements Student {

	@Override
	public void nhap() {
		System.out.println("Đây là phương thức nhap() của Interface Person");

	}

	@Override
	public void hienthi() {
		System.out.println("Đây là phương thức hienThi() của Interface Person");

	}

	@Override
	public void diemso() {
		System.out.println("Đây là phương thức nhapDiem() của Interface Student");

	}
    public static void main(String[] args) {
        RunMain demo = new RunMain();
        demo.nhap();
        demo.hienthi();
        demo.diemso();
    }

}
