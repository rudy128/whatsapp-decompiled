package X;

import android.app.Activity;
import com.whatsapp.jid.UserJid;

public final class AS6 implements BC0 {
    public final Activity A00;
    public final C189299ir A01;
    public final AnonymousClass1KB A02;
    public final C190469kz A03;
    public final A25 A04;
    public final AnonymousClass122 A05;
    public final C18030ve A06;
    public final C195229t0 A07;
    public final C192049ng A08;
    public final AnonymousClass1W6 A09;
    public final AnonymousClass10I A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AS6(Activity activity, C189299ir r3, AnonymousClass1KB r4, C190469kz r5, A25 a25, AnonymousClass122 r7, C18030ve r8, C195229t0 r9, C192049ng r10, AnonymousClass1W6 r11, AnonymousClass10I r12, boolean z, boolean z2) {
        C108975cc.A10(r10, 6, a25);
        C18070vi.A0d(r11, 13);
        this.A07 = r9;
        this.A00 = activity;
        this.A03 = r5;
        this.A0B = z;
        this.A0C = z2;
        this.A08 = r10;
        this.A01 = r3;
        this.A02 = r4;
        this.A0A = r12;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = a25;
        this.A09 = r11;
    }

    public void Bqn(String str) {
        this.A02.CGP(new C21408Ajb(this.A00, this.A03, (C172408tN) null, this, (String) null, (String) null, str, true, false));
    }

    public void BwS(boolean z, String str) {
    }

    public void Bqo(UserJid userJid, String str, int i, boolean z, boolean z2) {
        C18070vi.A0h(userJid, str);
        AnonymousClass8BU.A1E(this.A0A, this, userJid, str, 27);
    }
}
