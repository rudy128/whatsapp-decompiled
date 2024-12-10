package X;

import com.whatsapp.jid.UserJid;

public final class AS4 implements BC0 {
    public final C189299ir A00;
    public final C172058si A01;
    public final C1606989o A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass10I A05;
    public final C22821Di A06;

    public void Bqo(UserJid userJid, String str, int i, boolean z, boolean z2) {
        C18070vi.A0d(str, 1);
        this.A05.CGF(new C21374Aj3(this, str, i, 1, z, z2));
    }

    public void BwS(boolean z, String str) {
    }

    public void Bqn(String str) {
        this.A06.invoke(AnonymousClass8BR.A0w(str));
    }

    public AS4(C189299ir r1, C172058si r2, C1606989o r3, AnonymousClass10I r4, String str, String str2, C22821Di r7) {
        C18070vi.A0s(r4, r1, r2, str);
        this.A05 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r3;
        this.A06 = r7;
    }
}
