package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2PR  reason: invalid class name */
public class AnonymousClass2PR extends A34 {
    public final C23581Gv A00 = new AnonymousClass7E0(this, 1);
    public final /* synthetic */ C676530i A01;
    public final /* synthetic */ C691936g A02;
    public final /* synthetic */ AnonymousClass206 A03;

    public AnonymousClass2PR(C676530i r3, C691936g r4, AnonymousClass206 r5) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C676530i r5 = this.A01;
        AnonymousClass1M9 r4 = r5.A03;
        UserJid userJid = this.A02.A01;
        AnonymousClass1E7 A0E = r4.A0E(userJid);
        if (A0E != null && A0E.A0u) {
            return A0E;
        }
        r5.A00.A0J(new C70603Bt(this, 25));
        C63212sh A002 = C63212sh.A00(AnonymousClass2R1.A05);
        A002.A03 = true;
        A002.A00 = C62132qq.A0F;
        A002.A08.add(userJid);
        if (r5.A05.A03(A002.A02()) == C62602rf.A03) {
            Log.e("Unable to fetch the verified name");
        }
        return r4.A0E(userJid);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1E7 r4 = (AnonymousClass1E7) obj;
        if (r4 != null) {
            this.A02.A00 = r4;
            this.A01.A08.A02(this.A03, 38);
        }
    }
}
