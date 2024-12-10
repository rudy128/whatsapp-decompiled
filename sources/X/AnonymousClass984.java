package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.984  reason: invalid class name */
public final class AnonymousClass984 extends C48372Mf {
    public int A00;
    public String A01;

    public final void A1G(GroupJid groupJid, Boolean bool, String str, boolean z) {
        if (groupJid != null) {
            List list = this.A00;
            C18070vi.A0X(list);
            C29401cD.A0N(list, B3J.A00);
            int i = 3;
            if (!z) {
                i = 1;
                if (C18070vi.A19(bool, true)) {
                    i = 2;
                } else if (!C18070vi.A19(bool, false)) {
                    i = 0;
                }
            }
            list.add(new C59632md(groupJid, str, 2, i));
        }
    }

    public int A1E() {
        return this.A00;
    }
}
