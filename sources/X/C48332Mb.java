package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2Mb  reason: invalid class name and case insensitive filesystem */
public final class C48332Mb extends C48382Mg {
    public final void A1E(GroupJid groupJid, String str) {
        if (groupJid != null) {
            if (A1C(1).size() > 0) {
                C17960vV.A0F(false, "FMessageSystemParentGroupNameChanged/setNewParentInfo/parent info should only be set once");
            }
            this.A00.add(new C59632md(groupJid, str, 1, 0));
        }
    }
}
