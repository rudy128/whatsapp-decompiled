package X;

import android.net.Uri;

/* renamed from: X.37w  reason: invalid class name and case insensitive filesystem */
public class C696137w implements C1602387r {
    public final String A00;
    public final Uri A01;
    public final String A02;

    public String BLw(C191779nA r6) {
        Uri uri = this.A01;
        if (!"PSA".equals(uri.getQueryParameter("category"))) {
            return this.A02;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        Uri.Builder encodedAuthority = buildUpon.scheme("https").encodedAuthority(r6.A02);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("wa/static");
        encodedAuthority.encodedPath(AnonymousClass000.A0y(uri.getEncodedPath(), A10));
        String str = r6.A03;
        if (str != null) {
            C50462Un.A00(buildUpon, "_nc_cat", str);
        }
        return buildUpon.build().toString();
    }

    public C696137w(String str) {
        this.A02 = str;
        Uri parse = Uri.parse(str);
        this.A01 = parse;
        String authority = parse.getAuthority();
        C17960vV.A07(authority);
        this.A00 = authority;
    }
}
