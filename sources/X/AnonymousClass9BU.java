package X;

/* renamed from: X.9BU  reason: invalid class name */
public class AnonymousClass9BU extends A34 {
    public final AnonymousClass205 A00;
    public final String A01;
    public final boolean A02 = true;
    public final /* synthetic */ C161588Gc A03;

    public AnonymousClass9BU(C161588Gc r2, AnonymousClass205 r3, String str) {
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = str;
    }

    public void A0E() {
        if (this.A02) {
            this.A03.A0q(false);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C198789yu A002;
        C161588Gc r2 = this.A03;
        r2.A0q(false);
        if (((Boolean) obj).booleanValue()) {
            C20735AWq.A00(r2.A0a, 39);
            if (r2 instanceof AnonymousClass96K) {
                A002 = new C198789yu(116);
            } else {
                A002 = C198789yu.A00(2);
            }
            r2.A08.A0F(A002);
        }
    }
}
