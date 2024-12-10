package X;

import android.net.Uri;

/* renamed from: X.37x  reason: invalid class name and case insensitive filesystem */
public abstract class C696237x implements C1602387r {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final Uri.Builder A02(C191779nA r5) {
        String str = this.A02;
        if (str != null) {
            Uri.Builder builder = new Uri.Builder();
            Uri.Builder appendEncodedPath = builder.scheme("https").encodedAuthority(r5.A02).appendPath(this.A03).appendPath(this.A00).appendEncodedPath(AnonymousClass1EG.A0A(str));
            int i = 1;
            if (r5.A00 == 0) {
                i = 0;
            }
            appendEncodedPath.appendQueryParameter("direct_ip", String.valueOf(i));
            return builder;
        }
        throw AnonymousClass000.A0n("originalUrlSafeHash is null");
    }

    public C696237x(String str, String str2, String str3) {
        String str4;
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
        if (str != null) {
            str4 = AnonymousClass1EG.A0A(str);
        } else {
            str4 = null;
        }
        this.A02 = str4;
    }
}
