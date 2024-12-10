package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class AOF implements BAR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C35771mm A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AOF(C35771mm r1, UserJid userJid, String str, String str2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = userJid;
        this.A03 = str;
        this.A04 = str2;
    }

    public void BcF(String str) {
        C35771mm r2 = this.A01;
        r2.A00.A09(2131887118, 1);
        UserJid userJid = this.A02;
        String str2 = this.A04;
        C35771mm.A02(r2, userJid, str2);
        r2.A01.A01(userJid, (AnonymousClass206) null, str2, str, this.A00, false, true);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9NC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.9NH, java.lang.Object] */
    public void COk(String str, ArrayList arrayList) {
        C35771mm r3 = this.A01;
        int i = this.A00;
        UserJid userJid = this.A02;
        ? obj = new Object();
        obj.A01 = null;
        obj.A00 = userJid;
        ? obj2 = new Object();
        obj2.A01 = 0;
        obj2.A00 = i;
        obj2.A02 = obj;
        r3.A05(obj2, str, this.A03, arrayList);
        String str2 = this.A04;
        C35771mm.A02(r3, userJid, str2);
        r3.A01.A01(userJid, (AnonymousClass206) null, str2, (String) null, i, true, true);
    }
}
