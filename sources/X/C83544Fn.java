package X;

import android.net.Uri;

/* renamed from: X.4Fn  reason: invalid class name and case insensitive filesystem */
public abstract class C83544Fn {
    public static boolean A00(String str) {
        Uri parse = Uri.parse(C87364Vh.A01(str));
        if (parse.getHost().equalsIgnoreCase("www.instagram.com") || parse.getHost().equalsIgnoreCase("instagram.com") || parse.getHost().equalsIgnoreCase("instagr.am") || parse.getHost().equalsIgnoreCase("www.instagr.am")) {
            return true;
        }
        return false;
    }
}
