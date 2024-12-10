package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.AjQ  reason: case insensitive filesystem */
public final /* synthetic */ class C21397AjQ implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ AEX A02;
    public final /* synthetic */ AnonymousClass1BI A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ C20107A7l A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public final void run() {
        AnonymousClass206 r10;
        C20107A7l a7l = this.A05;
        String str = this.A06;
        List list = this.A07;
        AnonymousClass1BI r9 = this.A03;
        UserJid userJid = this.A04;
        long j = this.A00;
        AnonymousClass1KN r4 = this.A01;
        AEX aex = this.A02;
        C31061ex r2 = a7l.A03;
        C32551hN r8 = a7l.A04;
        C17960vV.A07(r9);
        C21320Ai5 ai5 = new C21320Ai5();
        if (j != 0) {
            r10 = AnonymousClass1W2.A02(a7l.A06, j);
        } else {
            r10 = null;
        }
        AnonymousClass210 A002 = r8.A00(r9, r10, ai5, str, list, 0);
        if (C22971Dz.A0e(r9) && userJid != null) {
            A002.A0d(userJid);
        }
        if (!C22971Dz.A0e(r9)) {
            userJid = C22941Dw.A00(r9);
        }
        r2.A09(r4, aex, userJid, A002);
    }

    public /* synthetic */ C21397AjQ(AnonymousClass1KN r1, AEX aex, AnonymousClass1BI r3, UserJid userJid, C20107A7l a7l, String str, List list, long j) {
        this.A05 = a7l;
        this.A06 = str;
        this.A07 = list;
        this.A03 = r3;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = aex;
    }
}
