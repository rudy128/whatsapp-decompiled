package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class A2M {
    public long A00 = 1;
    public C195839tz A01;
    public Boolean A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public final C19830z4 A06;
    public final C18030ve A07;
    public final AnonymousClass18K A08;
    public final AnonymousClass00H A09;
    public final C189399jB A0A;
    public final AnonymousClass10I A0B;

    public final void A01(C195839tz r11, Boolean bool, String str, boolean z) {
        String str2;
        C195839tz r3 = r11;
        if (C18020vd.A05(C18040vf.A02, this.A07, 7840)) {
            String str3 = this.A05;
            String str4 = str;
            if (str != null || str3 != null) {
                if (r11 == null && (r3 = this.A01) == null) {
                    str2 = null;
                } else {
                    str2 = r3.A08;
                }
                if (!"DRAFT".equalsIgnoreCase(str2)) {
                    this.A0B.CGF(new C21386AjF(r3, this, bool, str4, str, str3, z));
                }
            }
        }
    }

    public final void A02(Boolean bool, Long l, String str, String str2, String str3, String str4) {
        if (this.A01 == null) {
            Log.e("Cannot log flows screen progress without a valid session id.");
            return;
        }
        if (str != null) {
            this.A04 = str;
        }
        this.A02 = bool;
        if (l != null) {
            this.A00 = l.longValue();
        }
        this.A0B.CGF(new C21367Aiw(this, str2, str3, str4, 1));
        A01((C195839tz) null, this.A02, this.A04, false);
    }

    public final void A03(String str, boolean z, boolean z2) {
        if (this.A01 == null) {
            Log.e("Cannot log flow finished without a valid session id.");
            return;
        }
        this.A0B.CGF(new C98724rc(this, str, 3, z2, z));
    }

    public static final void A00(C171758sE r6, A2M a2m) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        C195839tz r2 = a2m.A01;
        if (r2 != null) {
            r6.A03 = Integer.valueOf(r2.A02);
            r6.A0A = a2m.A0A.A00(r2.A04);
            r6.A0I = r2.A07;
            r6.A0J = r2.A0B;
            r6.A0K = r2.A0C;
            r6.A0G = r2.A09;
            r6.A02 = Boolean.valueOf(r2.A0D);
            r6.A0M = r2.A0A;
            r6.A00 = Boolean.valueOf(r2.A01);
            r6.A08 = Long.valueOf(r2.A00);
            r6.A0H = r2.A08;
            C18030ve r5 = a2m.A07;
            C18040vf r4 = C18040vf.A02;
            if (C18020vd.A05(r4, r5, 6381)) {
                C22941Dw r0 = UserJid.Companion;
                UserJid A012 = C22941Dw.A01(r2.A04);
                if (A012 != null) {
                    num3 = ((C192229o1) a2m.A09.get()).A00(A012);
                } else {
                    num3 = null;
                }
                r6.A0F = r2.A06;
                r6.A0E = r2.A05;
                r6.A04 = num3;
            }
            C194419rh r3 = r2.A03;
            if (C18020vd.A05(r4, r5, 6551)) {
                Long l = null;
                if (r3 != null) {
                    str = r3.A02;
                } else {
                    str = null;
                }
                r6.A09 = str;
                if (r3 != null) {
                    num = Integer.valueOf(r3.A00);
                } else {
                    num = null;
                }
                r6.A05 = num;
                if (!(r3 == null || (num2 = r3.A01) == null)) {
                    l = C17890vO.A0N(num2);
                }
                r6.A06 = l;
            }
            r2.A00++;
        }
    }

    public A2M(C19830z4 r3, C18030ve r4, AnonymousClass18K r5, C189399jB r6, AnonymousClass10I r7, AnonymousClass00H r8) {
        C18070vi.A0w(r7, r5, r6, r8, r4);
        C18070vi.A0d(r3, 6);
        this.A0B = r7;
        this.A08 = r5;
        this.A0A = r6;
        this.A09 = r8;
        this.A07 = r4;
        this.A06 = r3;
    }
}
