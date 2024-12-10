package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9En  reason: invalid class name and case insensitive filesystem */
public class C178809En extends C178869Et implements C22469B9b {
    public final Object A00;

    public C178809En(Jid jid, int i) {
        String str;
        if (i != 0) {
            str = "from";
        } else {
            str = "to";
        }
        C18070vi.A0d(jid, 1);
        C29591cX A0S = AnonymousClass8BS.A0S();
        Class[] clsArr = new Class[2];
        clsArr[0] = AnonymousClass1ED.class;
        C29601cY.A01(jid, str, C18070vi.A0O(UserJid.class, clsArr, 1));
        AnonymousClass8BT.A1E(jid, A0S, str);
        this.A00 = A0S.A03();
    }

    public C29621ca BVP() {
        return (C29621ca) this.A00;
    }
}
