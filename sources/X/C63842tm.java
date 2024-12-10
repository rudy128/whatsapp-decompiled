package X;

import android.net.Uri;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.List;

/* renamed from: X.2tm  reason: invalid class name and case insensitive filesystem */
public final class C63842tm {
    public static final boolean A03(Uri uri, C63842tm r4, String str) {
        if (uri == null) {
            return false;
        }
        if (A02(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            C18070vi.A0X(pathSegments);
            if (!C18070vi.A18(C29431cG.A0c(pathSegments), "channel") || uri.getPathSegments().size() != 2) {
                return false;
            }
        } else if (!r4.A04(uri, "channel") || uri.getPathSegments().size() != 1) {
            return false;
        }
        return C18070vi.A18(uri.getLastPathSegment(), str);
    }

    public final Long A05(Uri uri) {
        List<String> subList;
        String str;
        if (uri == null) {
            return null;
        }
        if (A04(uri, "channel")) {
            subList = uri.getPathSegments();
            C18070vi.A0X(subList);
        } else if (!A00(uri) && !A01(uri)) {
            return null;
        } else {
            subList = uri.getPathSegments().subList(1, uri.getPathSegments().size());
        }
        if (subList.size() == 1 || (str = (String) C29431cG.A0f(subList, 1)) == null) {
            return null;
        }
        return AnonymousClass1YD.A04(str);
    }

    public final String A06(Uri uri) {
        List<String> subList;
        if (A04(uri, "channel")) {
            subList = uri.getPathSegments();
            C18070vi.A0X(subList);
        } else if (!A00(uri) && !A01(uri)) {
            return null;
        } else {
            subList = uri.getPathSegments().subList(1, uri.getPathSegments().size());
        }
        C18070vi.A0d(subList, 0);
        int size = subList.size();
        if (size == 1 || size == 2) {
            return (String) C29431cG.A0b(subList);
        }
        return null;
    }

    public final boolean A07(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (A02(uri)) {
            return A00(uri) || A01(uri);
        }
        return A04(uri, "channel");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (X.C18070vi.A18(X.C29431cG.A0c(r0), "updates") != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(android.net.Uri r4) {
        /*
            r3 = this;
            r2 = 0
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "whatsapp.com"
            boolean r0 = X.C17890vO.A1U(r4, r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "www.whatsapp.com"
            boolean r0 = X.C17890vO.A1U(r4, r0)
            if (r0 == 0) goto L_0x0035
        L_0x0019:
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0035
            java.util.List r0 = r4.getPathSegments()
            X.C18070vi.A0X(r0)
            java.lang.Object r1 = X.C29431cG.A0c(r0)
            java.lang.String r0 = "updates"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0035
        L_0x0033:
            r2 = 1
        L_0x0034:
            return r2
        L_0x0035:
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "wa.me"
            boolean r0 = X.C17890vO.A1U(r4, r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = A02(r4)
            if (r0 == 0) goto L_0x0034
            java.util.List r0 = r4.getPathSegments()
            X.C18070vi.A0X(r0)
            java.lang.Object r1 = X.C29431cG.A0c(r0)
            java.lang.String r0 = "updates"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0034
            goto L_0x0033
        L_0x005f:
            java.lang.String r0 = "updates"
            boolean r2 = r3.A04(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63842tm.A08(android.net.Uri):boolean");
    }

    private final boolean A00(Uri uri) {
        if ((C17890vO.A1U(uri, "whatsapp.com") || C17890vO.A1U(uri, "www.whatsapp.com")) && A02(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            C18070vi.A0X(pathSegments);
            if (!C18070vi.A18(C29431cG.A0c(pathSegments), "channel")) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean A01(Uri uri) {
        if (A02(uri) && C17890vO.A1U(uri, "wa.me") && A02(uri)) {
            List<String> pathSegments = uri.getPathSegments();
            C18070vi.A0X(pathSegments);
            if (!C18070vi.A18(C29431cG.A0c(pathSegments), "channel")) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A02(Uri uri) {
        if (C18070vi.A18(uri.getScheme(), "http") || C18070vi.A18(uri.getScheme(), "https")) {
            return true;
        }
        return false;
    }

    private final boolean A04(Uri uri, String str) {
        if ((C17890vO.A1T(uri, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME) || C17890vO.A1T(uri, "whatsapp-consumer") || C17890vO.A1T(uri, "whatsapp-smb")) && C18070vi.A18(uri.getHost(), str)) {
            return true;
        }
        return false;
    }
}
