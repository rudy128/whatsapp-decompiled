package X;

import java.util.Map;

/* renamed from: X.9zA  reason: invalid class name and case insensitive filesystem */
public final class C198939zA {
    public final C18030ve A00;

    public C198939zA(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final Integer A01(C195709tm r5, C19979A1p a1p, String str) {
        C18070vi.A0d(r5, 0);
        C60022nG A002 = C49982Sr.A00("2.24.24.78");
        if (!(a1p == null || A002 == null)) {
            if (!C18020vd.A05(C18040vf.A02, this.A00, 5247)) {
                Integer A003 = A00(A002, String.valueOf(r5.A01), a1p.A02);
                Integer num = AnonymousClass00R.A00;
                if (A003 == num && (A003 = A00(A002, r5.A03, a1p.A00)) == num && (str == null || (A003 = A00(A002, str, a1p.A01)) == num)) {
                    return num;
                }
                return A003;
            }
        }
        return AnonymousClass00R.A00;
    }

    public static final Integer A00(C60022nG r2, String str, Map map) {
        String str2;
        String str3;
        C60022nG A002;
        C60022nG A003;
        if (str == null) {
            str = "";
        }
        Map A0u = AnonymousClass8BS.A0u(str, map);
        if (A0u == null) {
            return AnonymousClass00R.A0C;
        }
        C193809qh r1 = (C193809qh) A0u.get("release");
        if (r1 == null || (((str2 = r1.A01) != null && (A003 = C49982Sr.A00(str2)) != null && r2.A00(A003) < 0) || ((str3 = r1.A00) != null && (A002 = C49982Sr.A00(str3)) != null && r2.A00(A002) > 0))) {
            return AnonymousClass00R.A01;
        }
        return AnonymousClass00R.A00;
    }
}
