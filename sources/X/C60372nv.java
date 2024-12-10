package X;

/* renamed from: X.2nv  reason: invalid class name and case insensitive filesystem */
public abstract class C60372nv {
    public static final void A00(AnonymousClass21V r2, AnonymousClass21V r3) {
        r3.A02 = r2.A02;
        r3.A04 = r2.A18();
        r3.A0D = r2.A0D;
        r3.A08 = r2.A08;
        r3.A05 = r2.A05;
        r3.A06 = r2.A06;
        r3.A09 = r2.A19();
        r3.A01 = r2.A01;
        r3.A07 = r2.A07;
        r3.A1D(r2.A0A);
        r3.A00 = r2.A00;
    }

    public static final void A01(AnonymousClass21V r4, AnonymousClass21V r5) {
        C693436v A17 = r4.A17();
        C693436v A172 = r5.A17();
        if (A17 != null && A172 != null) {
            if (r4.A0C.A03) {
                A172.A04(A17.A06(), A17.A07());
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass206.A07(r4, "FMessageMediaCloning/cannot_copy sidecar for message type ", A10);
            A10.append('.');
            C17890vO.A0w(A10);
        }
    }
}
