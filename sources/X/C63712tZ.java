package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.2tZ  reason: invalid class name and case insensitive filesystem */
public abstract class C63712tZ {
    public static final List A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final List A05;
    public static final List A06;
    public static final String[] A07 = {"live", "shorts"};

    static {
        String[] strArr = new String[3];
        strArr[0] = "facebook.com";
        strArr[1] = "www.facebook.com";
        A00 = C18070vi.A0O("m.facebook.com", strArr, 2);
        String[] strArr2 = new String[4];
        strArr2[0] = "fbwat.ch";
        strArr2[1] = "www.fbwat.ch";
        strArr2[2] = "fb.watch";
        A01 = C18070vi.A0O("www.fb.watch", strArr2, 3);
        String[] strArr3 = new String[2];
        strArr3[0] = "streamable.com";
        A06 = C18070vi.A0O("www.streamable.com", strArr3, 1);
        String[] strArr4 = new String[2];
        strArr4[0] = "instagram.com";
        A02 = C18070vi.A0O("www.instagram.com", strArr4, 1);
        String[] strArr5 = new String[2];
        strArr5[0] = "lassovideos.com";
        A03 = C18070vi.A0O("www.lassovideos.com", strArr5, 1);
        String[] strArr6 = new String[2];
        strArr6[0] = "netflix.com";
        A04 = C18070vi.A0O("www.netflix.com", strArr6, 1);
        String[] strArr7 = new String[2];
        strArr7[0] = "sharechat.com";
        A05 = C18070vi.A0O("www.sharechat.com", strArr7, 1);
    }

    public static final int A00(int i) {
        if (i == 2) {
            return 2131232205;
        }
        if (i == 3) {
            return 2131232208;
        }
        if (i == 4) {
            return 2131232215;
        }
        if (i == 5) {
            return 2131232205;
        }
        if (i == 6) {
            return 2131232210;
        }
        if (i != 8) {
            return -1;
        }
        return 2131232212;
    }

    public static final String A02(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return null;
        }
        if ("m.youtube.com".equalsIgnoreCase(host) || "www.youtube.com".equalsIgnoreCase(host) || "youtube.com".equalsIgnoreCase(host)) {
            int size = uri.getPathSegments().size() - 2;
            if (size >= 0) {
                String[] strArr = A07;
                int i = 0;
                do {
                    String str = strArr[i];
                    String str2 = uri.getPathSegments().get(size);
                    C18070vi.A0X(str2);
                    if (AnonymousClass1YF.A0V(str2, str)) {
                        return uri.getLastPathSegment();
                    }
                    i++;
                } while (i < 2);
            }
            return uri.getQueryParameter("v");
        } else if ("youtu.be".equalsIgnoreCase(host)) {
            return uri.getLastPathSegment();
        } else {
            return null;
        }
    }

    public static final boolean A03(Uri uri, List list) {
        String str = null;
        if (uri != null) {
            str = uri.getHost();
        }
        if (uri == null || str == null) {
            return false;
        }
        for (Object next : list) {
            if (str.equalsIgnoreCase((String) next)) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final int A01(String str) {
        Uri parse = Uri.parse(C32011gU.A00(str));
        C18070vi.A0b(parse);
        if (!A03(parse, A01)) {
            List list = A00;
            if (!A03(parse, list) || !"1".equalsIgnoreCase(parse.getQueryParameter("fw"))) {
                if (A03(parse, list)) {
                    return 2;
                }
                if (A03(parse, A02)) {
                    return 3;
                }
                if (A03(parse, A06)) {
                    return 1;
                }
                C18070vi.A0d(parse, 0);
                String A022 = A02(parse);
                if (A022 != null && A022.length() != 0) {
                    return 4;
                }
                if (A03(parse, A03)) {
                    return 6;
                }
                if (A03(parse, A04)) {
                    return 7;
                }
                if (A03(parse, A05)) {
                    return 8;
                }
                return 0;
            }
        }
        return 5;
    }
}
