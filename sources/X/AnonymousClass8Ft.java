package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.8Ft  reason: invalid class name */
public class AnonymousClass8Ft extends AnonymousClass1J2 {
    public AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A05 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A06 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A07 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A08 = AnonymousClass3MW.A0L();
    public AnonymousClass1DT A09 = AnonymousClass3MW.A0L();
    public C41731wy A0A = AnonymousClass3MW.A0o();
    public String A0B;
    public final AnonymousClass1QL A0C;
    public final AnonymousClass18O A0D;
    public final AnonymousClass118 A0E;
    public final C18000vb A0F;
    public final C18030ve A0G;
    public final AXS A0H;
    public final AnonymousClass1QJ A0I;

    public AnonymousClass8Ft(AnonymousClass18O r2, AnonymousClass118 r3, C18000vb r4, C18030ve r5, AXS axs, AnonymousClass1QL r7, AnonymousClass1QJ r8) {
        this.A0E = r3;
        this.A0G = r5;
        this.A0D = r2;
        this.A0F = r4;
        this.A0C = r7;
        this.A0I = r8;
        this.A0H = axs;
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.9bz, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v35, types: [X.9NO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v41, types: [X.9NO, java.lang.Object] */
    public void A0T(String str, String str2) {
        boolean z;
        String A0y;
        int i;
        AnonymousClass1DT r2;
        Context context;
        int i2;
        String str3;
        C20118A8b A012 = C20118A8b.A01(str, str2);
        String A002 = AXS.A00(this.A0H);
        if (A012 == null || (str3 = A012.A0O) == null) {
            z = false;
        } else {
            z = str3.equalsIgnoreCase(A002);
        }
        Integer A0j = C17880vN.A0j();
        if (z) {
            C41731wy r22 = this.A0A;
            ? obj = new Object();
            obj.A00 = 10;
            r22.A0F(obj);
            r2 = this.A04;
            context = this.A0E.A00;
            i2 = 2131893840;
        } else if (A7Z.A04(A012)) {
            C41731wy r23 = this.A0A;
            ? obj2 = new Object();
            obj2.A00 = 10;
            r23.A0F(obj2);
            r2 = this.A04;
            context = this.A0E.A00;
            i2 = 2131893841;
        } else {
            this.A0B = str2;
            this.A06.A0F(A012);
            this.A01.A0F(A012.A09);
            this.A00.A0F(A012.A0O);
            if (str == null || !str.startsWith("upi://mandate")) {
                AnonymousClass1KJ A013 = this.A0I.A01();
                C18000vb r4 = this.A0F;
                if (TextUtils.isEmpty(A012.A0A)) {
                    A0y = null;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    String str4 = A012.A0B;
                    if (!TextUtils.isEmpty(str4) && !A012.A0A.equals(str4)) {
                        A10.append(A013.BLc(r4, AnonymousClass8BT.A0H(A013, str4)));
                        A10.append(" - ");
                    }
                    A0y = AnonymousClass000.A0y(A013.BLc(r4, AnonymousClass8BT.A0H(A013, A012.A0A)), A10);
                }
                AnonymousClass1DT r24 = this.A03;
                if (!this.A0C.A0E()) {
                    i = 2131887451;
                } else {
                    i = 2131893700;
                    if (TextUtils.isEmpty(A0y)) {
                        i = 2131893699;
                    }
                }
                AnonymousClass3MX.A1J(r24, i);
                if (!TextUtils.isEmpty(A0y)) {
                    AnonymousClass1DT r25 = this.A07;
                    ? obj3 = new Object();
                    obj3.A00 = 0;
                    obj3.A01 = A0y;
                    r25.A0F(obj3);
                }
            } else {
                AnonymousClass3MX.A1J(this.A03, 2131887451);
            }
            AnonymousClass3MX.A1J(this.A02, 1);
            if (this.A0D.A09(AnonymousClass18O.A0W) && TextUtils.isEmpty(A012.A0I)) {
                AnonymousClass3MY.A1L(this.A09, true);
                AnonymousClass3MY.A1L(this.A08, TextUtils.isEmpty(A012.A0A));
                return;
            }
            return;
        }
        r2.A0F(context.getString(i2));
        this.A02.A0F(A0j);
    }
}
