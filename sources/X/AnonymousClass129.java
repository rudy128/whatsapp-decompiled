package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.129  reason: invalid class name */
public class AnonymousClass129 implements C201511a {
    public final C18000vb A00;
    public final AnonymousClass1K3 A01;

    public Uri A03(String str) {
        Uri.Builder A02 = A02();
        if (!TextUtils.isEmpty(str)) {
            A02.appendPath(str);
        }
        A02.appendQueryParameter("locale", this.A00.A06());
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A02.encodedFragment((String) null);
        }
        return A02.build();
    }

    public static void A01(Uri.Builder builder, AnonymousClass129 r4) {
        String str;
        C18000vb r2 = r4.A00;
        builder.appendQueryParameter("lg", r2.A05());
        builder.appendQueryParameter("lc", r2.A04());
        if (r4.A01.A04()) {
            str = "1";
        } else {
            str = "0";
        }
        builder.appendQueryParameter("eea", str);
    }

    public Uri.Builder A02() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        return builder;
    }

    @Deprecated
    public Uri A04(String str) {
        return A00((Pair) null, this, "general", str, (String) null);
    }

    @Deprecated
    public Uri A05(String str, String str2) {
        Uri.Builder A02 = A02();
        A02.appendPath("general");
        A02.appendPath(str);
        A02.appendPath(str2);
        A01(A02, this);
        return A02.build();
    }

    @Deprecated
    public String A06(String str) {
        return A00((Pair) null, this, "general", str, (String) null).toString();
    }

    public AnonymousClass129(C18000vb r1, AnonymousClass1K3 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static Uri A00(Pair pair, AnonymousClass129 r4, String str, String str2, String str3) {
        Uri.Builder A02 = r4.A02();
        A02.appendPath(str);
        if (!TextUtils.isEmpty(str2)) {
            A02.appendPath(str2);
        }
        A01(A02, r4);
        if (pair != null) {
            A02.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        if (!TextUtils.isEmpty(str3)) {
            A02.encodedFragment(str3);
        }
        return A02.build();
    }
}
