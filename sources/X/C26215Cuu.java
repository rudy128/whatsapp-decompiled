package X;

import android.net.Uri;
import android.util.LruCache;
import java.net.URI;

/* renamed from: X.Cuu  reason: case insensitive filesystem */
public abstract class C26215Cuu {
    public static final LruCache A00 = new LruCache(20);
    public static final C28508E4s A01 = new Object();

    public static Uri A00(BA8 ba8, String str) {
        try {
            return A01(str);
        } catch (SecurityException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Parse uri <sanitized \"");
            A10.append(A01.CGc(str));
            ba8.CFI("UriParser", C17900vP.A0D("\"> failed. Fail open: ", A10, false), e);
            return null;
        }
    }

    public static boolean A04(String str, String str2) {
        if (str != null && !str.equals("")) {
            return str.equals(str2);
        }
        if (str2 == null || str2.equals("")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        if (r1.contains("_") != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        r1 = r2.getHost();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (r3.getHost() != null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        if (r1 == null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
        if (r1.contains("_") != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0106, code lost:
        A02(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00d3 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6 A[Catch:{ URISyntaxException -> 0x010a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri A01(java.lang.String r11) {
        /*
            android.net.Uri r2 = android.net.Uri.parse(r11)
            java.lang.String r5 = r2.getScheme()
            r4 = 1
            if (r5 == 0) goto L_0x003d
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x003d
            int r1 = r5.length()
            r0 = 30
            if (r1 > r0) goto L_0x002b
            r4 = 0
            android.util.LruCache r0 = A00
            java.lang.Object r0 = r0.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x002b
            boolean r3 = r0.booleanValue()
        L_0x0028:
            if (r3 != 0) goto L_0x0078
            goto L_0x003f
        L_0x002b:
            java.lang.String r0 = "([a-zA-Z][a-zA-Z0-9+.-]*)?"
            boolean r3 = r5.matches(r0)
            if (r4 != 0) goto L_0x0028
            android.util.LruCache r1 = A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.put(r5, r0)
            goto L_0x0028
        L_0x003d:
            r3 = 1
            goto L_0x0028
        L_0x003f:
            java.net.URI r2 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0093 }
            r2.<init>(r11)     // Catch:{ URISyntaxException -> 0x0093 }
            boolean r0 = r2.isOpaque()
            if (r0 == 0) goto L_0x006f
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = r2.getScheme()
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = r2.getRawSchemeSpecificPart()
            android.net.Uri$Builder r1 = r1.encodedOpaquePart(r0)
            java.lang.String r0 = r2.getRawFragment()
            android.net.Uri$Builder r0 = r1.encodedFragment(r0)
            android.net.Uri r1 = r0.build()
            A03(r11, r2, r1)
            return r1
        L_0x006f:
            android.net.Uri r1 = X.BEB.A0J(r2)
            r0 = 0
            A02(r1, r2, r0)
            return r1
        L_0x0078:
            boolean r0 = r2.isOpaque()
            if (r0 == 0) goto L_0x00b1
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x0093 }
            java.lang.String r3 = r2.getSchemeSpecificPart()     // Catch:{ URISyntaxException -> 0x0093 }
            java.lang.String r1 = r2.getFragment()     // Catch:{ URISyntaxException -> 0x0093 }
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0093 }
            r0.<init>(r4, r3, r1)     // Catch:{ URISyntaxException -> 0x0093 }
            A03(r11, r0, r2)
            return r2
        L_0x0093:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Parsing url <sanitized \""
            r1.append(r0)
            X.E4s r0 = A01
            java.lang.String r0 = r0.CGc(r11)
            r1.append(r0)
            java.lang.String r0 = "\"> caused exception"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        L_0x00b1:
            java.lang.String r4 = r2.getScheme()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r5 = r2.getUserInfo()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r6 = r2.getHost()     // Catch:{ URISyntaxException -> 0x00d3 }
            int r7 = r2.getPort()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r8 = r2.getPath()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r9 = r2.getQuery()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.lang.String r10 = r2.getFragment()     // Catch:{ URISyntaxException -> 0x00d3 }
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x00d3 }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ URISyntaxException -> 0x00d3 }
            goto L_0x00f0
        L_0x00d3:
            java.lang.String r0 = r2.toString()     // Catch:{ URISyntaxException -> 0x010a }
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x010a }
            r3.<init>(r0)     // Catch:{ URISyntaxException -> 0x010a }
            java.lang.String r1 = r2.getHost()     // Catch:{ URISyntaxException -> 0x010a }
            java.lang.String r0 = r3.getHost()     // Catch:{ URISyntaxException -> 0x010a }
            if (r0 != 0) goto L_0x010a
            if (r1 == 0) goto L_0x010a
            java.lang.String r0 = "_"
            boolean r0 = r1.contains(r0)     // Catch:{ URISyntaxException -> 0x010a }
            if (r0 == 0) goto L_0x010a
        L_0x00f0:
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = r3.getHost()
            if (r0 != 0) goto L_0x0105
            if (r1 == 0) goto L_0x0105
            java.lang.String r0 = "_"
            boolean r1 = r1.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            A02(r2, r3, r0)
            return r2
        L_0x010a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Parsing url <sanitized \""
            r1.append(r0)
            X.E4s r0 = A01
            java.lang.String r0 = r0.CGc(r11)
            r1.append(r0)
            java.lang.String r0 = "\"> caused exception"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26215Cuu.A01(java.lang.String):android.net.Uri");
    }

    public static void A02(Uri uri, URI uri2, boolean z) {
        boolean A04 = A04(uri2.getScheme(), uri.getScheme());
        boolean A042 = A04(uri2.getAuthority(), uri.getAuthority());
        boolean A043 = A04(uri2.getPath(), uri.getPath());
        if (!A04 || !A042 || !A043) {
            String str = "";
            if (!A04) {
                StringBuilder A11 = AnonymousClass000.A11(str);
                A11.append("javaUri scheme: \"");
                A11.append(uri2.getScheme());
                A11.append("\". androidUri scheme: \"");
                str = AnonymousClass001.A1H(uri.getScheme(), "\".", A11);
            }
            if (!z && !A042) {
                StringBuilder A112 = AnonymousClass000.A11(str);
                A112.append("javaUri authority: \"");
                A112.append(uri2.getAuthority());
                A112.append("\". androidUri authority: \"");
                str = AnonymousClass001.A1H(uri.getAuthority(), "\".", A112);
            }
            if (!A043) {
                StringBuilder A113 = AnonymousClass000.A11(str);
                A113.append("javaUri path: \"");
                A113.append(uri2.getPath());
                A113.append("\". androidUri path: \"");
                str = AnonymousClass001.A1H(uri.getPath(), "\".", A113);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("java uri <sanitized \"");
            String obj = uri2.toString();
            C28508E4s e4s = A01;
            A10.append(e4s.CGc(obj));
            A10.append("\"> not equal to android uri <sanitized \"");
            A10.append(e4s.CGc(uri.toString()));
            A10.append("\">. Debug info ");
            A10.append(str);
            throw new SecurityException(AnonymousClass000.A0y(".", A10));
        }
    }

    public static void A03(String str, URI uri, Uri uri2) {
        boolean A04 = A04(uri.getScheme(), uri2.getScheme());
        boolean A042 = A04(uri.getSchemeSpecificPart(), uri2.getSchemeSpecificPart());
        if (!A04 || !A042) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("java uri <sanitized \"");
            String obj = uri.toString();
            C28508E4s e4s = A01;
            A10.append(e4s.CGc(obj));
            A10.append("\"> not equal to android uri <sanitized \"");
            A10.append(e4s.CGc(uri2.toString()));
            A10.append("\"> from original <sanitized \"");
            A10.append(e4s.CGc(str));
            throw new SecurityException(AnonymousClass000.A0y("\">", A10));
        }
    }
}
