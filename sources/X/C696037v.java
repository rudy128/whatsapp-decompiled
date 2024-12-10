package X;

import android.net.Uri;

/* renamed from: X.37v  reason: invalid class name and case insensitive filesystem */
public class C696037v implements C1602387r {
    public final String A00;
    public final String A01;
    public final Uri.Builder A02;

    public String BLw(C191779nA r3) {
        return this.A02.encodedAuthority(r3.A02).build().toString();
    }

    public C696037v(String str, String str2) {
        Uri parse = Uri.parse(str);
        this.A02 = parse.buildUpon();
        this.A00 = parse.getAuthority();
        this.A01 = str2;
    }
}
