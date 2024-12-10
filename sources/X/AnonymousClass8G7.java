package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8G7  reason: invalid class name */
public class AnonymousClass8G7 extends AnonymousClass1J2 {
    public final int A00;
    public final C22801Dg A01;
    public final C22801Dg A02;
    public final C22801Dg A03;
    public final AnonymousClass1DT A04;
    public final AnonymousClass1DT A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07;
    public final AnonymousClass1DT A08;
    public final AnonymousClass1DT A09;
    public final AnonymousClass11S A0A;
    public final AnonymousClass1M9 A0B;
    public final C27191Vc A0C;
    public final C27171Va A0D;
    public final AnonymousClass118 A0E;
    public final C18030ve A0F;
    public final AnonymousClass10I A0G;
    public final boolean A0H;
    public final boolean A0I;

    public static void A00(AnonymousClass8G7 r13) {
        Object A0I2;
        String str;
        int i;
        int intValue;
        AnonymousClass206 r5 = (AnonymousClass206) r13.A07.A06();
        C185819dC r2 = (C185819dC) r13.A01.A06();
        Number A1C = C108945cZ.A1C(r13.A03);
        Number A1C2 = C108945cZ.A1C(r13.A08);
        AnonymousClass1VX r3 = (AnonymousClass1VX) r13.A09.A06();
        String A1F = C108945cZ.A1F(r13.A06);
        Bitmap bitmap = null;
        if (r5 == null || A1C == null || ((A1C2 == null && r3 == null) || A1F == null)) {
            C137196v4.A01(r13.A02, (Object) null);
            return;
        }
        if (r5.A0v.A02) {
            A0I2 = AnonymousClass11S.A00(r13.A0A);
        } else {
            A0I2 = r5.A0I();
        }
        if (r2 == null || !C42171xk.A00(A0I2, r2.A01)) {
            str = null;
        } else {
            bitmap = r2.A00;
            str = r2.A02;
        }
        C22801Dg r22 = r13.A02;
        UserJid A0I3 = r5.A0I();
        if (r3 != null) {
            Context context = r13.A0E.A00;
            i = C19740yt.A00(context, r3.colorResId);
            intValue = C19740yt.A00(context, r3.backgroundColorRes);
        } else {
            i = 0;
            intValue = A1C2.intValue();
        }
        r22.A0F(new C85824Ow(bitmap, A0I3, str, A1F, i, intValue, A1C.intValue()));
    }

    public AnonymousClass8G7(AnonymousClass11S r11, AnonymousClass1M9 r12, C27191Vc r13, C27171Va r14, AnonymousClass118 r15, C18030ve r16, AnonymousClass10I r17, int i, boolean z, boolean z2) {
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A04 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A05 = A0L2;
        AnonymousClass1DT A0L3 = AnonymousClass3MW.A0L();
        this.A08 = A0L3;
        AnonymousClass1DT A0L4 = AnonymousClass3MW.A0L();
        this.A09 = A0L4;
        AnonymousClass1DT A0L5 = AnonymousClass3MW.A0L();
        this.A06 = A0L5;
        AnonymousClass1DT A0L6 = AnonymousClass3MW.A0L();
        this.A07 = A0L6;
        C22801Dg A0R = C108945cZ.A0R();
        this.A03 = A0R;
        C22801Dg A0R2 = C108945cZ.A0R();
        this.A01 = A0R2;
        C22801Dg A0R3 = C108945cZ.A0R();
        this.A02 = A0R3;
        this.A0E = r15;
        this.A0F = r16;
        this.A0A = r11;
        this.A0G = r17;
        this.A0B = r12;
        this.A0D = r14;
        this.A0C = r13;
        this.A0I = z;
        this.A0H = z2;
        this.A00 = i;
        C20335AGr.A01(A0L, A0R, this, 42);
        C20335AGr.A01(A0L6, A0R, this, 44);
        C20335AGr.A01(A0L2, A0R, this, 45);
        C20335AGr.A01(A0L6, A0R2, this, 46);
        C20335AGr.A01(A0R, A0R2, this, 47);
        C20335AGr.A01(A0L5, A0R2, this, 48);
        C20335AGr.A01(A0R2, A0R3, this, 49);
        A0R3.A0H(A0R, new C20336AGs(this, 0));
        A0R3.A0H(A0L3, new C20336AGs(this, 0));
        C20335AGr.A01(A0L4, A0R3, this, 41);
        C20335AGr.A01(A0L5, A0R3, this, 43);
    }
}
