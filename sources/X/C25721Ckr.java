package X;

/* renamed from: X.Ckr  reason: case insensitive filesystem */
public final class C25721Ckr {
    public static final C25721Ckr A02 = new C25721Ckr(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C25721Ckr A03;
    public static final C25721Ckr A04;
    public static final C25721Ckr A05 = new C25721Ckr(0, Long.MAX_VALUE);
    public static final C25721Ckr A06 = new C25721Ckr(Long.MAX_VALUE, 0);
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25721Ckr ckr = (C25721Ckr) obj;
            if (!(this.A01 == ckr.A01 && this.A00 == ckr.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        C25721Ckr ckr = new C25721Ckr(0, 0);
        A04 = ckr;
        A03 = ckr;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C25721Ckr(long j, long j2) {
        boolean z = true;
        C26056CrS.A02(AnonymousClass000.A1Q((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C26056CrS.A02(j2 < 0 ? false : z);
        this.A01 = j;
        this.A00 = j2;
    }
}
