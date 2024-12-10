package X;

import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.wds.components.search.WDSSearchBar;

/* renamed from: X.DpU  reason: case insensitive filesystem */
public final class C27993DpU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27993DpU(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        WDSSearchBar wDSSearchBar = this.this$0.A0F;
        if (A1Y) {
            if (wDSSearchBar != null) {
                WDSSearchBar.A01(wDSSearchBar, true, true);
            }
            C18070vi.A11("wdsSearchBar");
            throw null;
        }
        if (wDSSearchBar != null) {
            wDSSearchBar.A02(true);
        }
        C18070vi.A11("wdsSearchBar");
        throw null;
        return C27621Wu.A00;
    }
}
