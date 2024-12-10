package X;

/* renamed from: X.4Hf  reason: invalid class name and case insensitive filesystem */
public abstract class C83934Hf {
    public static final boolean A00(C18030ve r4, AnonymousClass206 r5, AnonymousClass206 r6, boolean z) {
        C62572rc r0;
        if (!(r6 instanceof C441822l) || (r6 instanceof C444523m)) {
            return false;
        }
        C441822l r2 = (C441822l) r6;
        if (C18020vd.A05(C18040vf.A02, r4, 1040)) {
            if (!r2.A1L()) {
                return false;
            }
        } else if (r2.A09 != 1) {
            return false;
        }
        if ((!r6.A0v.A02 || r5.A0v.A02 || z) && (r0 = r2.A02) != null && r0.A0G != null && AnonymousClass25A.A12((AnonymousClass21V) r6)) {
            return true;
        }
        return false;
    }
}
