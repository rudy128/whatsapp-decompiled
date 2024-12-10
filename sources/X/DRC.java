package X;

public final class DRC implements E2z {
    public final int A00;
    public final int A01;
    public final int A02;
    public final CM8 A03;
    public final CM9 A04;
    public final CMA A05;

    public DRC(CUB cub, C28416E0h[] e0hArr) {
        this.A01 = e0hArr.length;
        this.A02 = cub.A03;
        this.A00 = cub.A00;
        this.A03 = new CM8(e0hArr);
        this.A05 = new CMA(e0hArr);
        this.A04 = new CM9(e0hArr);
    }
}
