package X;

import android.content.DialogInterface;
import com.whatsapp.contact.contactform.ContactFormActivity;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.util.Collections;

/* renamed from: X.74t  reason: invalid class name and case insensitive filesystem */
public class C1412174t implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C1412174t(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 2:
                StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = (StarOrRemoveFromRecentsStickerDialogFragment) this.A01;
                boolean z = this.A02;
                if (i == -3) {
                    AnonymousClass10I r3 = starOrRemoveFromRecentsStickerDialogFragment.A04;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("remove_recent_sticker");
                    r3.CGL(new C70813Cp(40, (Object) starOrRemoveFromRecentsStickerDialogFragment, z), AnonymousClass000.A0y(starOrRemoveFromRecentsStickerDialogFragment.A01.A0F, A10));
                    return;
                } else if (i == -1) {
                    C1418377d r2 = starOrRemoveFromRecentsStickerDialogFragment.A01;
                    r2.A05 = C17880vN.A0j();
                    starOrRemoveFromRecentsStickerDialogFragment.A02.A0I(Collections.singleton(r2));
                    return;
                } else {
                    return;
                }
            case 3:
                boolean z2 = this.A02;
                WaInAppBrowsingActivity waInAppBrowsingActivity = (WaInAppBrowsingActivity) this.A01;
                C18070vi.A0d(dialogInterface, 2);
                dialogInterface.dismiss();
                if (z2) {
                    waInAppBrowsingActivity.A4f(0, WaInAppBrowsingActivity.A0Q(waInAppBrowsingActivity));
                    return;
                }
                return;
            default:
                boolean z3 = this.A02;
                AnonymousClass70L r1 = ((ContactFormActivity) this.A01).A0B;
                if (z3) {
                    if (r1 != null) {
                        r1.A03();
                        return;
                    }
                } else if (r1 != null) {
                    r1.A07(false);
                    return;
                }
                C18070vi.A11("contactFormSaveContactController");
                throw null;
        }
    }
}
