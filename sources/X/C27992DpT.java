package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.DpT  reason: case insensitive filesystem */
public final class C27992DpT extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27992DpT(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        C36261nb r4 = inviteNonWhatsAppContactPickerActivity.A0B;
        if (r4 != null) {
            Integer A0Q = InviteNonWhatsAppContactPickerActivity.A0Q(inviteNonWhatsAppContactPickerActivity);
            C23838Bqv bqv = new C23838Bqv();
            bqv.A03 = 1;
            bqv.A04 = A0Q;
            bqv.A02 = true;
            r4.A03.CC7(bqv);
            return C27621Wu.A00;
        }
        C18070vi.A11("inviteFlowLogger");
        throw null;
    }
}
