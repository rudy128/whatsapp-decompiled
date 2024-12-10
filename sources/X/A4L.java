package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;

public class A4L {
    public final AnonymousClass190 A00;
    public final C192789oz A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass122 A03;
    public final C37541pi A04;
    public final C18030ve A05;
    public final AnonymousClass1MB A06;
    public final C35241lt A07;
    public final AnonymousClass1N9 A08;
    public final C190789lW A09;
    public final A7C A0A;
    public final A19 A0B;
    public final A89 A0C;
    public final AnonymousClass1PV A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass11P A0I;
    public final C35221lr A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;

    public static void A00(A4L a4l, AnonymousClass206 r18, C63362sw r19) {
        String str;
        A4L a4l2 = a4l;
        if (C18020vd.A05(C18040vf.A02, a4l2.A05, 5869)) {
            UserJid A0I2 = r18.A0I();
            C20717AVx aVx = (C20717AVx) r19.A06(C20717AVx.class);
            if (aVx != null) {
                str = aVx.A01;
            } else {
                str = null;
            }
            boolean A002 = AnonymousClass026.A00(str, "MARKETING");
            C20956AcA A003 = AnonymousClass9RV.A00(r18);
            if (A0I2 != null && A003 != null && A002) {
                C42741yf A012 = ((AnonymousClass1PM) a4l2.A0M.get()).A01(C22941Dw.A00(A0I2));
                if (A003.A02 && A012 != null && A012.A01()) {
                    AnonymousClass706.A00(A0I2, (AnonymousClass706) a4l2.A0K.get(), (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 0);
                    AnonymousClass00H r4 = a4l2.A0L;
                    AnonymousClass73F r7 = (AnonymousClass73F) r4.get();
                    AnonymousClass11P r5 = r7.A00;
                    long A013 = AnonymousClass11P.A01(r5);
                    SharedPreferences.Editor A0E2 = C108995ce.A0E(((C127666ej) r7.A08.get()).A01);
                    A0E2.putBoolean(A0I2.getRawString(), true);
                    StringBuilder A10 = AnonymousClass000.A10();
                    A0E2.putLong(AnonymousClass000.A0y(AnonymousClass8BS.A0g(A0I2, "pref_disclosure_eligibility_ts_", A10), A10), A013);
                    A0E2.apply();
                    if (!((C133556oy) r7.A09.get()).A01()) {
                        C185109c2 r6 = new C185109c2(r5, (AnonymousClass1OZ) C18070vi.A0E(r7.A0B));
                        C132076m9 r52 = new C132076m9(A0I2, r7);
                        AnonymousClass1OZ r9 = r6.A01;
                        String A0B2 = r9.A0B();
                        AnonymousClass9F7 r1 = new AnonymousClass9F7(C18070vi.A0M(new C178719Ee(20231028, AnonymousClass11P.A00(r6.A00))), 26, A0B2);
                        r9.A0I(new AnonymousClass7LL(r52, r6, r1, 5), (C29621ca) r1.A00, A0B2, 433, 32000);
                    }
                    ((AnonymousClass73F) r4.get()).A04(A0I2);
                }
            }
        }
    }

    public static void A01(A4L a4l, AnonymousClass206 r8, C63362sw r9) {
        C42691ya r0;
        int i;
        AnonymousClass2M8 A002;
        Long l;
        r9.A06(C20717AVx.class);
        r8.A10 = r9.A04;
        C688234v r02 = (C688234v) r9.A06(C688234v.class);
        if (r02 != null) {
            r0 = r02.A00;
        } else {
            r0 = null;
        }
        r8.A0O = r0;
        C688434x r1 = (C688434x) r9.A06(C688434x.class);
        if (!(r1 == null || (l = r1.A01) == null)) {
            r8.A0W = l;
        }
        int i2 = 0;
        if (r1 != null) {
            i = r1.A00;
        } else {
            i = 0;
        }
        r8.A0D = i;
        if (C18020vd.A05(C18040vf.A02, a4l.A05, 12162)) {
            a4l.A0J.A02((C166278cd) null, r8, r9);
            return;
        }
        UserJid A052 = r9.A05();
        long j = r9.A05;
        if (j != 0) {
            r8.A0b(j);
        }
        r8.A0d(C22941Dw.A00(C22971Dz.A00(r9.A0Y)));
        r8.A0G = AnonymousClass11P.A01(a4l.A0I);
        C688034t r03 = (C688034t) r9.A06(C688034t.class);
        if (r03 != null) {
            i2 = r03.A00;
        }
        r8.A0Z(i2);
        C688334w r12 = (C688334w) r9.A06(C688334w.class);
        if (r12 != null && A052 != null && (A002 = a4l.A0D.A00(A052, r8, r12)) != null && !a4l.A06.A03(r8.A0v.A00)) {
            a4l.A03.BBY(A002);
        }
    }

    public A4L(AnonymousClass190 r2, C192789oz r3, AnonymousClass11P r4, AnonymousClass118 r5, AnonymousClass122 r6, C37541pi r7, C18030ve r8, AnonymousClass1MB r9, C35241lt r10, C35221lr r11, AnonymousClass1N9 r12, C190789lW r13, A7C a7c, A19 a19, A89 a89, AnonymousClass1PV r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, AnonymousClass00H r23, AnonymousClass00H r24) {
        this.A02 = r5;
        this.A0I = r4;
        this.A05 = r8;
        this.A00 = r2;
        this.A08 = r12;
        this.A03 = r6;
        this.A0D = r17;
        this.A01 = r3;
        this.A07 = r10;
        this.A0J = r11;
        this.A0B = a19;
        this.A0C = a89;
        this.A0F = r18;
        this.A0M = r19;
        this.A0A = a7c;
        this.A09 = r13;
        this.A0E = r20;
        this.A0H = r21;
        this.A04 = r7;
        this.A0G = r22;
        this.A0K = r23;
        this.A0L = r24;
        this.A06 = r9;
    }
}
