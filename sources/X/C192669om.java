package X;

import android.content.SharedPreferences;

/* renamed from: X.9om  reason: invalid class name and case insensitive filesystem */
public abstract class C192669om {
    public final AnonymousClass190 A00;
    public final C196639vO A01;
    public final C22661Cs A02;
    public final C190139kR A03;
    public final AnonymousClass11P A04;

    public void A00() {
        C17880vN.A1B(AnonymousClass8BT.A05(this.A03), "current_search_location");
    }

    public void A01(C20079A6f a6f) {
        SharedPreferences.Editor A05 = AnonymousClass8BT.A05(this.A03);
        String A042 = a6f.A04();
        C17880vN.A1E(A05, "current_search_location", C20015A3h.A01(this.A00, this.A02, A042));
    }

    public C192669om(AnonymousClass190 r1, AnonymousClass11P r2, C196639vO r3, C22661Cs r4, C190139kR r5) {
        this.A04 = r2;
        this.A00 = r1;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }
}
