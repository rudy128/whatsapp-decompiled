package X;

import android.net.Uri;

/* renamed from: X.72f  reason: invalid class name and case insensitive filesystem */
public final class C1406172f {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public static final String A00(Uri uri, C1406172f r4, String str) {
        if ((str == null || str.length() == 0) && (str = A01(uri, r4, "icebreaker")) == null) {
            return str;
        }
        int length = str.length();
        if (length < 140) {
            return str;
        }
        if (!C18020vd.A05(C18040vf.A02, C17880vN.A0P(r4.A00), 9100) || length > 512) {
            return null;
        }
        return str;
    }

    public static final String A01(Uri uri, C1406172f r4, String str) {
        if (!C18020vd.A05(C18040vf.A02, C17880vN.A0P(r4.A00), 8587)) {
            return uri.getQueryParameter(str);
        }
        return null;
    }

    public static final void A02(C1406172f r2, String str) {
        AnonymousClass62J r1 = new AnonymousClass62J();
        r1.A00 = AnonymousClass3MY.A0f();
        if (!((C131916ls) r2.A01.get()).A00()) {
            r1.A01 = str;
        }
        C108965cb.A1F(r1, r2.A04);
    }

    public C1406172f(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }
}
