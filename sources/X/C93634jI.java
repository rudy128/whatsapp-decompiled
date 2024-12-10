package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4jI  reason: invalid class name and case insensitive filesystem */
public final class C93634jI implements C72203La {
    public A99 A00;
    public Integer A01;
    public final AnonymousClass4ON A02 = new AnonymousClass4ON();
    public final C175258yP A03;
    public final AnonymousClass1V9 A04;
    public final AnonymousClass1V7 A05;
    public final C195199sx A06;
    public final AnonymousClass1DC A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public final void A03(C86534Sa r4, boolean z) {
        C18070vi.A0d(r4, 0);
        AnonymousClass4ON r2 = this.A02;
        r2.A02 = r4.A0C;
        r2.A00 = r4.A0A;
        CallState callState = r4.A0B;
        C18070vi.A0W(callState);
        r2.A01 = callState;
        r2.A04 = r4.A0G;
        r2.A03 = z;
        if (callState == CallState.NONE || callState == CallState.RECEIVED_CALL) {
            A00(this, (A99) null);
        } else if (this.A00 == null) {
            this.A05.A01(this);
        }
    }

    public void C5F(A99 a99) {
        C18070vi.A0d(a99, 0);
        A00(this, a99);
    }

    public void C5G() {
        A00(this, (A99) null);
    }

    public static final void A00(C93634jI r2, A99 a99) {
        A99 a992;
        if (!C18070vi.A18(r2.A00, a99)) {
            Integer num = r2.A01;
            if (a99 == null) {
                if (!(num == null || (a992 = r2.A00) == null)) {
                    a992.A0j(8);
                }
                r2.A05.A02(r2);
            } else if (num != null) {
                a99.A0j(num.intValue());
            }
            r2.A00 = a99;
        }
    }

    public final C108835cN A01() {
        C108835cN r4;
        String str;
        AnonymousClass4ON r42 = this.A02;
        if (r42.A01 == CallState.NONE) {
            r4 = new C93164iX("MinimizedCallBannerContentCallback/onClick: CallState is either NONE");
        } else {
            if (!r42.A04) {
                C195199sx r2 = this.A06;
                C136746uK r0 = r2.A03;
                if (r0 != null) {
                    r0.A01();
                }
                r2.A03 = null;
                C136746uK r02 = r2.A02;
                if (r02 != null) {
                    r02.A01();
                }
                r2.A02 = null;
                AnonymousClass1LU r3 = (AnonymousClass1LU) C18070vi.A0E(this.A09);
                C84674Kk r22 = (C84674Kk) C18070vi.A0E(this.A08);
                AnonymousClass1V9 r1 = this.A04;
                UserJid userJid = r42.A00;
                if (userJid == null) {
                    str = "MinimizedCallBannerContentCallback/onClick: peer jid is null";
                } else {
                    r4 = new C93184iZ(r22, r1, r3, userJid);
                }
            } else {
                String str2 = r42.A02;
                if (str2 == null) {
                    str = "MinimizedCallBannerContentCallback/onClick: call id is null";
                } else {
                    r4 = new C93174iY((C84674Kk) C18070vi.A0E(this.A08), this.A04, str2);
                }
            }
            return new C93164iX(str);
        }
        return r4;
    }

    public final C108845cO A02() {
        int i;
        int i2;
        C108845cO r4;
        AnonymousClass4ON r2 = this.A02;
        if (r2.A01.ordinal() == 3) {
            r4 = new C93194ia(this.A00, r2.A02);
        } else {
            if (r2.A03) {
                i = 4;
                i2 = 34;
            } else {
                i = 86;
                if (r2.A04) {
                    i = 37;
                }
                i2 = null;
            }
            r4 = new C93204ib(this.A04, this.A00, i2, i);
        }
        return r4;
    }

    public C93634jI(C175258yP r2, AnonymousClass1V9 r3, C195199sx r4, AnonymousClass1V7 r5, AnonymousClass1DC r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r7, r6, r8, r5, r3);
        C18070vi.A0l(r4, r2);
        this.A09 = r7;
        this.A07 = r6;
        this.A08 = r8;
        this.A05 = r5;
        this.A04 = r3;
        this.A06 = r4;
        this.A03 = r2;
    }
}
