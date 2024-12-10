package X;

import android.content.DialogInterface;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.A9k  reason: case insensitive filesystem */
public final /* synthetic */ class C20148A9k implements DialogInterface.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1KN A01;
    public final /* synthetic */ AnonymousClass1BI A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ BDu A04;
    public final /* synthetic */ C20107A7l A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C20107A7l a7l = this.A05;
        String str = this.A06;
        List list = this.A07;
        AnonymousClass1BI r4 = this.A02;
        UserJid userJid = this.A03;
        long j = this.A00;
        AnonymousClass1KN r3 = this.A01;
        BDu bDu = this.A04;
        a7l.A05.CGF(new C21387AjG(r3, r4, userJid, a7l, str, list, j));
        bDu.BLI();
    }

    public /* synthetic */ C20148A9k(AnonymousClass1KN r1, AnonymousClass1BI r2, UserJid userJid, BDu bDu, C20107A7l a7l, String str, List list, long j) {
        this.A05 = a7l;
        this.A06 = str;
        this.A07 = list;
        this.A02 = r2;
        this.A03 = userJid;
        this.A00 = j;
        this.A01 = r1;
        this.A04 = bDu;
    }
}
