package X;

/* renamed from: X.22l  reason: invalid class name and case insensitive filesystem */
public class C441822l extends C441722k {
    public C441822l(AnonymousClass205 r2, long j) {
        super(r2, 2, j);
    }

    public boolean A1J() {
        if (this.A09 == 1 || !"audio/ogg; codecs=opus".equals(this.A06) || !AnonymousClass25A.A0w(this)) {
            return false;
        }
        return true;
    }

    public boolean A1K() {
        if ((this.A09 == 1 || !"audio/ogg; codecs=opus".equals(this.A06) || AnonymousClass25A.A0w(this)) && !A1J()) {
            return false;
        }
        return true;
    }

    public boolean A1L() {
        if (this.A09 == 1 || A1K()) {
            return true;
        }
        return false;
    }
}
