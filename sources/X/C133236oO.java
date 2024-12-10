package X;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;

/* renamed from: X.6oO  reason: invalid class name and case insensitive filesystem */
public final class C133236oO {
    public C110125ey A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DS A06;
    public final AnonymousClass1DS A07;
    public final AnonymousClass1DS A08;
    public final AnonymousClass1DT A09;
    public final AnonymousClass1DT A0A;
    public final AnonymousClass1DT A0B;
    public final AnonymousClass1DT A0C;

    public C133236oO() {
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A09 = A0S;
        this.A05 = A0S;
        AnonymousClass1DT A0S2 = C108945cZ.A0S();
        this.A0A = A0S2;
        this.A06 = A0S2;
        AnonymousClass1DT A0S3 = C108945cZ.A0S();
        this.A0C = A0S3;
        this.A08 = A0S3;
        AnonymousClass1DT A0S4 = C108945cZ.A0S();
        this.A0B = A0S4;
        this.A07 = A0S4;
    }

    public final void A00() {
        CookieManager instance = CookieManager.getInstance();
        instance.removeAllCookies((ValueCallback) null);
        instance.flush();
        WebStorage.getInstance().deleteAllData();
        C110125ey r1 = this.A00;
        if (r1 != null) {
            r1.clearCache(true);
        }
        C137536vc.A00(this.A00);
        this.A00 = null;
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        AnonymousClass1DT r0 = this.A09;
        Boolean A0h = AnonymousClass000.A0h();
        r0.A0F(A0h);
        this.A0A.A0F(A0h);
        this.A0C.A0F((Object) null);
    }
}
