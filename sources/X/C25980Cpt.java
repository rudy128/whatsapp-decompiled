package X;

import java.io.IOException;

/* renamed from: X.Cpt  reason: case insensitive filesystem */
public class C25980Cpt {
    public static int A03;
    public static C25980Cpt A04;
    public static final Object A05 = C17880vN.A0p();
    public C28573E8e A00;
    public IOException A01;
    public C25980Cpt A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Cpt] */
    public static C25980Cpt A00() {
        synchronized (A05) {
            C25980Cpt cpt = A04;
            if (cpt == null) {
                return new Object();
            }
            A04 = cpt.A02;
            cpt.A02 = null;
            A03--;
            return cpt;
        }
    }

    public void A01() {
        synchronized (A05) {
            int i = A03;
            if (i < 5) {
                this.A00 = null;
                this.A01 = null;
                A03 = i + 1;
                C25980Cpt cpt = A04;
                if (cpt != null) {
                    this.A02 = cpt;
                }
                A04 = this;
            }
        }
    }
}
