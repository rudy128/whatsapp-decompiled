package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import java.util.List;

/* renamed from: X.DpV  reason: case insensitive filesystem */
public final class C27994DpV extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27994DpV(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
        C116635yL r2 = inviteNonWhatsAppContactPickerActivity.A0C;
        if (r2 != null) {
            r2.A01 = list;
            r2.A02 = list;
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = inviteNonWhatsAppContactPickerActivity.A0D;
            if (inviteNonWhatsAppContactPickerViewModel == null) {
                C18070vi.A11("viewModel");
                throw null;
            }
            r2.A00 = (List) inviteNonWhatsAppContactPickerViewModel.A0F.A06();
            C116635yL r0 = this.this$0.A0C;
            if (r0 != null) {
                r0.notifyDataSetChanged();
                return C27621Wu.A00;
            }
        }
        C18070vi.A11("adapter");
        throw null;
    }
}
