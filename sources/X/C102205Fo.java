package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.5Fo  reason: invalid class name and case insensitive filesystem */
public final class C102205Fo extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102205Fo(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GroupJid groupJid = (GroupJid) this.this$0.A0Q.getValue();
        boolean z = false;
        if (groupJid != null) {
            AnonymousClass1MZ r0 = this.this$0.A07;
            if (r0 == null) {
                C18070vi.A11("groupParticipantsManager");
                throw null;
            } else if (r0.A0K(groupJid)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
