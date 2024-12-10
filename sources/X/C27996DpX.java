package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import java.util.List;

/* renamed from: X.DpX  reason: case insensitive filesystem */
public final class C27996DpX extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27996DpX(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        MenuItem menuItem = this.this$0.A00;
        if (menuItem == null) {
            C18070vi.A11("searchMenuItem");
            throw null;
        }
        menuItem.setVisible(AnonymousClass000.A1a(list));
        return C27621Wu.A00;
    }
}
