package X;

import com.whatsapp.contact.picker.AddGroupParticipantsSelector;

/* renamed from: X.5Fp  reason: invalid class name and case insensitive filesystem */
public final class C102215Fp extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AddGroupParticipantsSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102215Fp(AddGroupParticipantsSelector addGroupParticipantsSelector) {
        super(0);
        this.this$0 = addGroupParticipantsSelector;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.this$0.A0Q);
        boolean z = false;
        if (A0m != null) {
            AnonymousClass1MZ r0 = this.this$0.A07;
            if (r0 == null) {
                C18070vi.A11("groupParticipantsManager");
                throw null;
            } else if (r0.A0I(A0m)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
