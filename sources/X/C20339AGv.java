package X;

/* renamed from: X.AGv  reason: case insensitive filesystem */
public class C20339AGv implements C22851Dl, C22841Dk {
    public final int A00;
    public final Object A01;

    public C20339AGv(C22821Di r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public static void A00(AnonymousClass1F9 r1, AnonymousClass1DS r2, C22821Di r3, int i) {
        r2.A0A(r1, new C20339AGv(r3, i));
    }

    public static void A01(AnonymousClass1DS r1, C22801Dg r2, C22821Di r3, int i) {
        r2.A0H(r1, new C20339AGv(r3, i));
    }

    public final C18080vj BS6() {
        return (C18080vj) this.A01;
    }

    public final /* synthetic */ void Bo9(Object obj) {
        ((C22821Di) this.A01).invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22851Dl) || !(obj instanceof C22841Dk)) {
            return false;
        }
        return C108975cc.A1L(obj, this.A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
