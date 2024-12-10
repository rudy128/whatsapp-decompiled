package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.A9l  reason: case insensitive filesystem */
public final /* synthetic */ class C20149A9l implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ AEX A02;
    public final /* synthetic */ AnonymousClass1BI A03;
    public final /* synthetic */ UserJid A04;
    public final /* synthetic */ BDu A05;
    public final /* synthetic */ C20107A7l A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C20107A7l a7l = this.A06;
        String str = this.A07;
        List list = this.A08;
        AnonymousClass1BI r5 = this.A03;
        UserJid userJid = this.A04;
        long j = this.A00;
        AnonymousClass1KN r3 = this.A01;
        AEX aex = this.A02;
        BDu bDu = this.A05;
        a7l.A05.CGF(new C21397AjQ(r3, aex, r5, userJid, a7l, str, list, j));
        bDu.BLI();
    }

    public /* synthetic */ C20149A9l(AnonymousClass1KN r1, AEX aex, AnonymousClass1BI r3, UserJid userJid, BDu bDu, C20107A7l a7l, String str, List list, long j) {
        this.A06 = a7l;
        this.A07 = str;
        this.A08 = list;
        this.A03 = r3;
        this.A04 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A02 = aex;
        this.A05 = bDu;
    }
}
