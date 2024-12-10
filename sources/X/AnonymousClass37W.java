package X;

/* renamed from: X.37W  reason: invalid class name */
public final class AnonymousClass37W implements AnonymousClass3M6 {
    public final C18030ve A00;

    public AnonymousClass37W(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public long CBC(C29621ca r3) {
        C18070vi.A0d(r3, 0);
        if (r3.A0K("multicast") != null) {
            return 64;
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r6, C29621ca r7) {
        C29621ca A0K;
        Integer num;
        byte[] bArr;
        byte[] bArr2;
        C18070vi.A0d(r7, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A00, 5718) || (A0K = r7.A0K("reporting")) == null) {
            return null;
        }
        C29621ca A0K2 = A0K.A0K("reporting_token");
        C29621ca A0K3 = A0K.A0K("reporting_tag");
        if (A0K2 != null) {
            bArr = A0K2.A01;
            String A0Q = A0K2.A0Q("v", (String) null);
            if (A0Q != null) {
                num = AnonymousClass1YD.A03(A0Q);
            } else {
                num = null;
            }
        } else {
            num = null;
            bArr = null;
        }
        if (A0K3 == null || (bArr2 = A0K3.A01) == null) {
            return null;
        }
        return new C20719AVz(num, bArr2, bArr);
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }
}
