package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.chatinfo.view.custom.Hilt_CreatorPrivacyNewsletterBottomSheet;
import com.whatsapp.chatinfo.view.custom.Hilt_PhoneNumberHiddenInNewsletterBottomSheet;

/* renamed from: X.70w  reason: invalid class name and case insensitive filesystem */
public final class C1403070w {
    public static final /* synthetic */ C1403070w A00 = new Object();

    public static final void A00(AnonymousClass1FU r4, C219117w r5, C29681ch r6, boolean z) {
        DialogFragment hilt_PhoneNumberHiddenInNewsletterBottomSheet;
        C18070vi.A0h(r4, r5);
        C18070vi.A0d(r6, 3);
        r5.A01(C202311i.class);
        if (z) {
            hilt_PhoneNumberHiddenInNewsletterBottomSheet = new Hilt_CreatorPrivacyNewsletterBottomSheet();
            String rawString = r6.getRawString();
            Bundle A0D = C17880vN.A0D();
            A0D.putString("jid", rawString);
            hilt_PhoneNumberHiddenInNewsletterBottomSheet.A1R(A0D);
        } else {
            hilt_PhoneNumberHiddenInNewsletterBottomSheet = new Hilt_PhoneNumberHiddenInNewsletterBottomSheet();
        }
        r4.CMk(hilt_PhoneNumberHiddenInNewsletterBottomSheet, "PhoneNumberHiddenInNewsletterSheet");
    }
}
