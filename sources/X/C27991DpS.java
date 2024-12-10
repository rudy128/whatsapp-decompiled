package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.DpS  reason: case insensitive filesystem */
public final class C27991DpS extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27991DpS(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        AnonymousClass733 r2 = inviteNonWhatsAppContactPickerActivity.A0A;
        if (r2 != null) {
            r2.A04(inviteNonWhatsAppContactPickerActivity, InviteNonWhatsAppContactPickerActivity.A0Q(inviteNonWhatsAppContactPickerActivity), str, "sms:");
            return C27621Wu.A00;
        }
        C18070vi.A11("inviteContactUtils");
        throw null;
    }
}
