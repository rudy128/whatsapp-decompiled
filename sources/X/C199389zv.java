package X;

import java.util.Map;

/* renamed from: X.9zv  reason: invalid class name and case insensitive filesystem */
public class C199389zv {
    public static final String A04 = A5Z.A01("WorkTimer");
    public final B4N A00;
    public final Object A01 = C17880vN.A0p();
    public final Map A02 = C17880vN.A11();
    public final Map A03 = C17880vN.A11();

    public void A00(C193279pp r6) {
        synchronized (this.A01) {
            if (((C21471Akc) this.A03.remove(r6)) != null) {
                AnonymousClass8BX.A12(A5Z.A00(), r6, "Stopping timer for ", A04, AnonymousClass000.A10());
                this.A02.remove(r6);
            }
        }
    }

    public C199389zv(B4N b4n) {
        this.A00 = b4n;
    }
}
