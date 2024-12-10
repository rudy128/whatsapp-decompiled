package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.ARu  reason: case insensitive filesystem */
public final class C20610ARu implements BCV {
    public final /* synthetic */ C170018ny A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C193199ph A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public void Bki() {
    }

    public C20610ARu(C170018ny r1, UserJid userJid, C193199ph r3, String str, String str2) {
        this.A00 = r1;
        this.A03 = str;
        this.A02 = r3;
        this.A01 = userJid;
        this.A04 = str2;
    }

    public void onSuccess() {
        C170018ny r4 = this.A00;
        String str = this.A03;
        C170018ny.A02(r4, this.A01, this.A02, str, this.A04);
    }

    public /* bridge */ /* synthetic */ void Bsy(Integer num) {
    }

    public /* bridge */ /* synthetic */ void C8h(Integer num) {
    }
}
