package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.AjG  reason: case insensitive filesystem */
public final /* synthetic */ class C21387AjG implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ AnonymousClass1BI A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C20107A7l A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public final void run() {
        AnonymousClass206 r9;
        C20107A7l a7l = this.A04;
        String str = this.A05;
        List list = this.A06;
        AnonymousClass1BI r8 = this.A02;
        UserJid userJid = this.A03;
        long j = this.A00;
        AnonymousClass1KN r3 = this.A01;
        C31061ex r2 = a7l.A03;
        C32551hN r7 = a7l.A04;
        C17960vV.A07(r8);
        C21320Ai5 ai5 = new C21320Ai5();
        if (j != 0) {
            r9 = AnonymousClass1W2.A02(a7l.A06, j);
        } else {
            r9 = null;
        }
        AnonymousClass210 A002 = r7.A00(r8, r9, ai5, str, list, 0);
        if (C22971Dz.A0e(r8) && userJid != null) {
            A002.A0d(userJid);
        }
        if (!C22971Dz.A0e(r8)) {
            userJid = C22941Dw.A00(r8);
        }
        r2.A09(r3, (AEX) null, userJid, A002);
    }

    public /* synthetic */ C21387AjG(AnonymousClass1KN r1, AnonymousClass1BI r2, UserJid userJid, C20107A7l a7l, String str, List list, long j) {
        this.A04 = a7l;
        this.A05 = str;
        this.A06 = list;
        this.A02 = r2;
        this.A03 = userJid;
        this.A00 = j;
        this.A01 = r1;
    }
}
