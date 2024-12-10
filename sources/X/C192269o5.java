package X;

/* renamed from: X.9o5  reason: invalid class name and case insensitive filesystem */
public class C192269o5 {
    public C1418477e A00;
    public final /* synthetic */ C196199uc A01;

    public C192269o5(C1418477e r1, C196199uc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C192269o5)) {
            return false;
        }
        C192269o5 r3 = (C192269o5) obj;
        C1418477e r1 = this.A00;
        if (C20061A5k.A03(r1)) {
            return C20061A5k.A03(r3.A00);
        }
        return ((String) AnonymousClass8BT.A0q(r1)).equals(AnonymousClass8BT.A0q(r3.A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A00.A00, AnonymousClass3MW.A1a(), 0);
    }
}
