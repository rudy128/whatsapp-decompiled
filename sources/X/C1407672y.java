package X;

import android.util.Base64;
import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.72y  reason: invalid class name and case insensitive filesystem */
public final class C1407672y {
    public final AnonymousClass11S A00;
    public final AnonymousClass1CJ A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06 = C217517g.A00(65553);
    public final AnonymousClass00H A07;
    public final AnonymousClass11P A08;
    public final C27301Vn A09;
    public final C19830z4 A0A;

    public static final void A01(C1407672y r11, AnonymousClass206 r12, Integer num, Integer num2, Long l, String str, int i) {
        C1407672y r3 = r11;
        if (C18020vd.A05(C18040vf.A02, r11.A02, 3127)) {
            A02(r3, r12, num, num2, l, str, (String) null, i, 4);
        }
    }

    public final void A03(String str) {
        C18070vi.A0d(str, 0);
        if (C18020vd.A05(C18040vf.A02, this.A02, 3127)) {
            AnonymousClass64P r1 = new AnonymousClass64P();
            r1.A08 = C17880vN.A0i();
            r1.A07 = C108955ca.A0e();
            r1.A0F = str;
            A00(r1, this);
            this.A03.CC7(r1);
            this.A06.get();
        }
    }

    public static final void A00(AnonymousClass64P r3, C1407672y r4) {
        String str;
        if (C18020vd.A05(C18040vf.A02, r4.A02, 3127)) {
            r3.A00 = C108945cZ.A1A(r4.A0A.A2R());
            r3.A02 = Boolean.valueOf(((AnonymousClass1Vo) r4.A09).A00.A01());
            AnonymousClass11S r0 = r4.A00;
            r0.A0I();
            Me me = r0.A00;
            if (me == null || (str = C108965cb.A0p(me)) == null) {
                str = "ZZ";
            }
            r3.A0J = str;
        }
    }

    public static final void A02(C1407672y r8, AnonymousClass206 r9, Integer num, Integer num2, Long l, String str, String str2, int i, int i2) {
        String str3;
        Integer A042;
        String str4;
        Integer num3;
        Boolean bool;
        String A043;
        AnonymousClass64P r4 = new AnonymousClass64P();
        C18030ve r3 = r8.A02;
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r3, 3127) || !(r9 instanceof C439521o)) {
            str3 = null;
        } else {
            str3 = ((C439521o) r9).A00.A05;
        }
        r4.A0K = str3;
        r4.A08 = Integer.valueOf(i);
        r4.A07 = Integer.valueOf(i2);
        r4.A06 = num;
        r4.A05 = num2;
        UserJid A0I = r9.A0I();
        Long l2 = null;
        if (!(A0I == null || (A043 = AnonymousClass17K.A04(A0I)) == null)) {
            l2 = C108965cb.A0m(A043);
        }
        r4.A0A = l2;
        C1408773k r1 = C1408773k.A00;
        C61762qD A002 = C1408773k.A00(r3, r9);
        if (A002 == null) {
            A042 = null;
        } else {
            A042 = r1.A04(r3, A002);
        }
        r4.A09 = A042;
        r4.A0B = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - r9.A0I));
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass205 r5 = r9.A0v;
        A10.append(r5.A01);
        String A0u = C17880vN.A0u(A10, r9.A0I);
        try {
            MessageDigest A1I = C108945cZ.A1I();
            A1I.update(C108975cc.A1O(A0u));
            str4 = Base64.encodeToString(A1I.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            Log.e("OTP: Error computing sessionId for logging", e);
            str4 = null;
        }
        r4.A0I = str4;
        r4.A0E = str;
        r4.A0C = l;
        if (!C18020vd.A05(r2, AnonymousClass71Z.A00(r8.A07), 7493)) {
            str2 = null;
        }
        r4.A0G = str2;
        A00(r4, r8);
        if (C18020vd.A05(r2, r3, 3127)) {
            AnonymousClass1BI r52 = r5.A00;
            if (r52 != null) {
                num3 = Integer.valueOf(C72453Mb.A03(r8.A01.A0Q(r52) ? 1 : 0));
            } else {
                num3 = null;
            }
            r4.A04 = num3;
            if (r52 != null) {
                bool = C108945cZ.A1A(((C218217n) r8.A05.get()).A04.A0a(r52).A0A());
            } else {
                bool = null;
            }
            r4.A01 = bool;
        }
        if (i == 4 && C18020vd.A05(r2, r3, 3127) && C18020vd.A05(r2, r3, 6673)) {
            if (r9 instanceof C439521o) {
                r4.A03 = Boolean.valueOf(((C439521o) r9).A00.A07);
            }
            r4.A0D = C17880vN.A0n(r8.A00.A06());
        }
        r8.A03.CC7(r4);
        r8.A06.get();
    }

    public C1407672y(AnonymousClass11S r2, AnonymousClass11P r3, C27301Vn r4, C19830z4 r5, AnonymousClass1CJ r6, C18030ve r7, AnonymousClass18K r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0w(r3, r7, r2, r6, r8);
        C18070vi.A0x(r9, r10, r5, r4, r11);
        this.A08 = r3;
        this.A02 = r7;
        this.A00 = r2;
        this.A01 = r6;
        this.A03 = r8;
        this.A04 = r9;
        this.A05 = r10;
        this.A0A = r5;
        this.A09 = r4;
        this.A07 = r11;
    }
}
