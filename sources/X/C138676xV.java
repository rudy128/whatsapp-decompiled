package X;

import android.net.Uri;
import android.webkit.ValueCallback;

/* renamed from: X.6xV  reason: invalid class name and case insensitive filesystem */
public final class C138676xV {
    public ValueCallback A00;
    public final int A01;
    public final AnonymousClass01C A02;
    public final AnonymousClass02n A03;
    public final AnonymousClass02n A04;
    public final C18030ve A05;
    public final boolean A06;
    public final boolean A07;
    public final AnonymousClass11C A08;
    public final AnonymousClass1LU A09;
    public final AnonymousClass1NL A0A;

    public static final boolean A00(C138676xV r8, Uri[] uriArr) {
        if (uriArr != null) {
            try {
                C99014s7 r6 = new C99014s7(uriArr);
                while (r6.hasNext()) {
                    Uri uri = (Uri) r6.next();
                    AnonymousClass11B A0O = r8.A08.A0O();
                    if (!(uri == null || A0O == null)) {
                        r8.A0A.A04(uri, A0O, C18020vd.A05(C18040vf.A02, r8.A05, 11097));
                    }
                }
                return true;
            } catch (Exception e) {
                C17900vP.A0X(e, "MediaPickerLauncher/areFileUrisExternal: Internal file provided for image upload in web view", AnonymousClass000.A10());
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.02h] */
    public C138676xV(AnonymousClass01C r4, AnonymousClass11C r5, C18030ve r6, AnonymousClass1LU r7, AnonymousClass1NL r8, int i, boolean z, boolean z2) {
        C18070vi.A0j(r6, r7);
        C108965cb.A1P(r5, 5, r8);
        this.A05 = r6;
        this.A09 = r7;
        this.A02 = r4;
        this.A07 = z;
        this.A08 = r5;
        this.A06 = z2;
        this.A01 = i;
        this.A0A = r8;
        this.A04 = r4.CDw(new C1423779f(this, 2), new Object());
        this.A03 = r4.CDw(new C1423779f(this, 1), new Object());
    }
}
