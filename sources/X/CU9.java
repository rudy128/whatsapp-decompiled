package X;

public final class CU9 {
    public int A00;
    public int A01;
    public C26245Cvj A02;
    public C26245Cvj A03;
    public C26245Cvj A04;
    public C26245Cvj A05;
    public C26007CqO A06;
    public CU9 A07 = null;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C26280Cwb A0B;

    public CU9(Object obj, String str, String str2, String str3, C26280Cwb cwb, int i) {
        this.A0B = cwb;
        this.A08 = i;
        this.A0A = cwb.A0A(str);
        this.A09 = cwb.A0A(str2);
        if (str3 != null) {
            this.A01 = cwb.A0A(str3);
        }
        if (obj != null) {
            this.A00 = cwb.A0E(obj).A02;
        }
    }
}
