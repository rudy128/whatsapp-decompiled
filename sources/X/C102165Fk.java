package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5Fk  reason: invalid class name and case insensitive filesystem */
public final class C102165Fk extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102165Fk(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Map map = this.this$0.A0H;
        if (map != null) {
            LinkedHashMap A13 = C17880vN.A13();
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                Object key = A16.getKey();
                if (C18070vi.A18(key, "com.whatsapp.contact.picker.DeviceContactsLoader") || C18070vi.A18(key, "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader") || C18070vi.A18(key, "com.whatsapp.contact.picker.NonWaContactsLoader") || C18070vi.A18(key, "com.whatsapp.community.DirectoryContactsLoader")) {
                    A13.put(A16.getKey(), A16.getValue());
                }
            }
            ArrayList A11 = C72453Mb.A11(A13);
            Iterator A152 = AnonymousClass000.A15(A13);
            while (A152.hasNext()) {
                A11.add(C17890vO.A0P(A152));
            }
            return C29431cG.A12(A11);
        }
        C18070vi.A11("contactsLoaderMap");
        throw null;
    }
}
