package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.983  reason: invalid class name */
public abstract class AnonymousClass983 extends C48372Mf {
    public int A00;

    public final void A1G(GroupJid groupJid, String str, int i) {
        if (groupJid != null) {
            List list = this.A00;
            C18070vi.A0X(list);
            C29401cD.A0N(list, B3L.A00);
            list.add(new C59632md(groupJid, str, 2, i));
        }
    }

    public int A1E() {
        return this.A00;
    }
}
