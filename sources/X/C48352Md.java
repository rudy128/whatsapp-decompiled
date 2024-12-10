package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2Md  reason: invalid class name and case insensitive filesystem */
public abstract class C48352Md extends C48382Mg {
    public int A1E() {
        if (this instanceof AnonymousClass2MZ) {
            return 1;
        }
        if (this instanceof C48322Ma) {
            return ((C48322Ma) this).A00;
        }
        return 3;
    }

    public final void A1F(GroupJid groupJid, String str) {
        if (groupJid != null) {
            A1D(C18070vi.A0M(new C59632md(groupJid, str, 1, 0)));
        }
    }

    public boolean A1G() {
        if ((this instanceof AnonymousClass2MZ) || !(this instanceof C48322Ma)) {
            return true;
        }
        throw AnonymousClass04E.createAndThrow();
    }
}
