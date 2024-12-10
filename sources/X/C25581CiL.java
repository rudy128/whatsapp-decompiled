package X;

/* renamed from: X.CiL  reason: case insensitive filesystem */
public class C25581CiL {
    public final int A00;
    public final C25089CXa A01;
    public final Integer A02;
    public final Integer A03;
    public final byte[] A04;

    public C25581CiL(byte[] bArr, int i) {
        this.A04 = bArr;
        this.A01 = null;
        this.A00 = i;
        this.A03 = null;
        this.A02 = null;
    }

    public C25581CiL(C25089CXa cXa) {
        Integer num;
        Integer num2 = null;
        this.A04 = null;
        this.A01 = cXa;
        this.A00 = 35;
        if (cXa != null) {
            num = Integer.valueOf(cXa.A02);
        } else {
            num = null;
        }
        this.A03 = num;
        this.A02 = cXa != null ? Integer.valueOf(cXa.A00) : num2;
    }
}
