package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.4cm  reason: invalid class name and case insensitive filesystem */
public class C89634cm implements MenuItem.OnActionExpandListener {
    public final int A00;
    public final Object A01;

    public C89634cm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        switch (this.A00) {
            case 0:
                ((C79333vF) this.A01).A0L = null;
                return true;
            case 1:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A01;
                mediaGalleryActivity.A0k = null;
                ((C22659BIk) mediaGalleryActivity.findViewById(2131436270).getLayoutParams()).A00 = 21;
                return true;
            default:
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = ((InviteNonWhatsAppContactPickerActivity) ((C28479E2u) this.A01)).A0D;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
                inviteNonWhatsAppContactPickerViewModel.A0T((String) null);
                return true;
        }
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        if (1 - this.A00 != 0) {
            return true;
        }
        ((C22659BIk) ((AnonymousClass01E) this.A01).findViewById(2131436270).getLayoutParams()).A00 = 0;
        return true;
    }
}
