package X;

import android.net.Uri;
import com.whatsapp.wamsys.SecureUriParser;
import java.util.List;

/* renamed from: X.73k  reason: invalid class name and case insensitive filesystem */
public final class C1408773k {
    public static final C1408773k A00 = new Object();

    public static final boolean A01(C18030ve r3, C61762qD r4) {
        C18070vi.A0d(r4, 1);
        String A0v = C108955ca.A0v(r3, 3827);
        if (r4.A07 != 2) {
            return false;
        }
        String str = r4.A01;
        C18070vi.A0W(str);
        if (str.startsWith(A0v)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(C18030ve r3, C61762qD r4) {
        C18070vi.A0d(r4, 1);
        String A0v = C108955ca.A0v(r3, 3828);
        if (r4.A07 != 2) {
            return false;
        }
        String str = r4.A01;
        C18070vi.A0W(str);
        if (str.startsWith(A0v)) {
            return true;
        }
        return false;
    }

    public final Integer A04(C18030ve r8, C61762qD r9) {
        Uri parseEncodedRFC2396;
        C18070vi.A0d(r9, 1);
        boolean A01 = A01(r8, r9);
        Integer A0i = C17880vN.A0i();
        if (!A01) {
            if (!A02(r8, r9) || (parseEncodedRFC2396 = SecureUriParser.parseEncodedRFC2396(r9.A01)) == null) {
                return null;
            }
            String queryParameter = parseEncodedRFC2396.getQueryParameter("otp_type");
            if (queryParameter == null) {
                return 0;
            }
            int hashCode = queryParameter.hashCode();
            if (hashCode != -601943542) {
                if (hashCode != 26351735) {
                    if (hashCode == 1470813548 && queryParameter.equals("ZERO_TAP")) {
                        return 1;
                    }
                } else if (!queryParameter.equals("COPY_CODE")) {
                    return null;
                }
            } else if (queryParameter.equals("ONE_TAP")) {
                return 0;
            }
            return null;
        }
        return A0i;
    }

    public static final C61762qD A00(C18030ve r4, AnonymousClass206 r5) {
        List<C61762qD> list;
        if ((r5 instanceof C439521o) && (list = ((C439521o) r5).A00.A06) != null) {
            for (C61762qD r1 : list) {
                C1408773k r0 = A00;
                C18070vi.A0b(r1);
                if (r0.A04(r4, r1) != null) {
                    return r1;
                }
            }
        }
        return null;
    }

    public static final boolean A03(AnonymousClass206 r1) {
        if (!(r1 instanceof C439521o) || !C18070vi.A18(((C439521o) r1).A00.A04, "AUTHENTICATION")) {
            return false;
        }
        return true;
    }
}
