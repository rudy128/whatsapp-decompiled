package X;

public class CRS {
    public final float A00;
    public final float A01;
    public final String A02;
    public final boolean A03;

    public CRS(CRR crr) {
        this.A00 = crr.A00;
        this.A02 = crr.A02;
        this.A01 = crr.A01;
        this.A03 = crr.A03;
    }
}
