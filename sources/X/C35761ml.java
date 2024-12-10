package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1ml  reason: invalid class name and case insensitive filesystem */
public final class C35761ml {
    public long A00;
    public String A01;
    public final A5M A02;
    public final C18030ve A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass18K A05;
    public final C25431Oe A06;

    public C35761ml(A5M a5m, C18030ve r3, AnonymousClass18K r4, C25431Oe r5, AnonymousClass10I r6) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(a5m, 5);
        this.A06 = r5;
        this.A05 = r4;
        this.A03 = r3;
        this.A04 = r6;
        this.A02 = a5m;
    }

    public static final void A00(C35761ml r4, C1184763p r5) {
        if (C18020vd.A05(C18040vf.A02, r4.A03, 10667)) {
            String str = r4.A01;
            C25431Oe r1 = r4.A06;
            if (!C18070vi.A18(str, r1.A03())) {
                r4.A01 = r1.A03();
                r4.A00 = 0;
            }
            r5.A04 = Long.valueOf(r4.A00);
            r5.A07 = r4.A01;
            AnonymousClass18K r12 = r4.A05;
            r12.CC7(r5);
            r12.CHJ(true);
            r4.A00++;
        }
    }

    public final void A02(AnonymousClass206 r5) {
        String A042;
        C1184763p r3 = new C1184763p();
        r3.A01 = 7;
        r3.A02 = 2;
        if (r5 == null) {
            A042 = null;
        } else {
            A042 = C20120A8f.A04(r5);
        }
        r3.A06 = A042;
        r3.A00 = true;
        this.A04.CGF(new C21450AkH(this, r3, 47));
    }

    public final void A01(UserJid userJid, AnonymousClass206 r11, String str, String str2, int i, boolean z, boolean z2) {
        Runnable runnable;
        AnonymousClass10I r0;
        int i2;
        String A042;
        UserJid userJid2 = userJid;
        int i3 = i;
        if (C18070vi.A18(str, "suspicious_chat_banner")) {
            C1184763p r4 = new C1184763p();
            r4.A01 = 8;
            r4.A00 = Boolean.valueOf(z);
            r4.A05 = str2;
            r4.A02 = 2;
            Long l = null;
            if (userJid != null) {
                try {
                    String str3 = userJid.user;
                    if (str3 != null) {
                        l = Long.valueOf(Long.parseLong(str3));
                    }
                } catch (NumberFormatException unused) {
                }
            }
            r4.A03 = l;
            r0 = this.A04;
            runnable = new C21365Aiu(this, r4, userJid2, i3, 5);
        } else {
            int i4 = 3;
            boolean z3 = z2;
            if (i == 0) {
                i2 = 3;
                if (z2) {
                    i2 = 10;
                }
            } else {
                i2 = 6;
                if (z2) {
                    i2 = 11;
                }
            }
            if (C18070vi.A18(str, "profile_view")) {
                i4 = 5;
            } else if (!C18070vi.A18(str, "system_event_message")) {
                i4 = 2;
            }
            C1184763p r42 = new C1184763p();
            r42.A01 = Integer.valueOf(i2);
            r42.A02 = Integer.valueOf(i4);
            r42.A00 = Boolean.valueOf(z);
            r42.A05 = str2;
            if (r11 == null) {
                A042 = null;
            } else {
                A042 = C20120A8f.A04(r11);
            }
            r42.A06 = A042;
            Long l2 = null;
            if (userJid != null) {
                try {
                    String str4 = userJid.user;
                    if (str4 != null) {
                        l2 = Long.valueOf(Long.parseLong(str4));
                    }
                } catch (NumberFormatException unused2) {
                }
            }
            r42.A03 = l2;
            r0 = this.A04;
            runnable = new C70843Cs((Object) this, (Object) r42, (Object) userJid2, i3, 3, z3);
        }
        r0.CGF(runnable);
    }
}
