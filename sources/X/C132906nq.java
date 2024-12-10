package X;

import java.util.HashMap;

/* renamed from: X.6nq  reason: invalid class name and case insensitive filesystem */
public abstract class C132906nq {
    public int A00 = 0;
    public int A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public HashMap A04;
    public final HashMap A05;

    public final void A00() {
        long j = 0;
        for (C23134Bbn bbn : C108955ca.A17(this.A05)) {
            j += bbn.A03;
        }
        this.A03 = j;
    }

    public /* synthetic */ C132906nq() {
        HashMap A11 = C17880vN.A11();
        HashMap A112 = C17880vN.A11();
        this.A04 = A11;
        this.A05 = A112;
    }
}
