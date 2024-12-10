package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.5Fj  reason: invalid class name and case insensitive filesystem */
public final class C102155Fj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102155Fj(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set<Object> A12;
        AddGroupParticipantsSelector addGroupParticipantsSelector = this.this$0;
        String[] stringArrayExtra = addGroupParticipantsSelector.getIntent().getStringArrayExtra("contacts_loader_keys");
        AnonymousClass4L6 r5 = addGroupParticipantsSelector.A04;
        if (r5 != null) {
            if (stringArrayExtra != null) {
                A12 = C200410p.A0S(stringArrayExtra);
            } else {
                A12 = C17880vN.A12();
            }
            Set set = (Set) addGroupParticipantsSelector.A0O.getValue();
            if (set == null) {
                set = C18070vi.A0P(C94234kI.A00);
            }
            if (!A12.isEmpty()) {
                ArrayList A13 = AnonymousClass000.A13();
                for (Object obj : A12) {
                    Object obj2 = r5.A00.get(obj);
                    if (obj2 != null) {
                        A13.add(obj2);
                    }
                }
                Set A122 = C29431cG.A12(A13);
                if (!A122.isEmpty()) {
                    return new AnonymousClass4L7(A122);
                }
            }
            return new AnonymousClass4L7(set);
        }
        C18070vi.A11("contactsLoaderFactory");
        throw null;
    }
}
