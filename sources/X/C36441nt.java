package X;

import android.app.Activity;
import android.os.Bundle;
import com.whatsapp.contact.contactform.ContactFormBottomSheetFragment;

/* renamed from: X.1nt  reason: invalid class name and case insensitive filesystem */
public final class C36441nt {
    public void A00(Activity activity, Bundle bundle, AnonymousClass1GP r6, C30191dX r7, C219217x r8, C19830z4 r9, C18030ve r10) {
        C18070vi.A0d(r6, 0);
        C18070vi.A0d(r10, 2);
        C18070vi.A0d(activity, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r9, 6);
        new ContactFormBottomSheetFragment();
        if (!C18020vd.A05(C18040vf.A02, r10, 5868) || ((r8.A02("android.permission.GET_ACCOUNTS") == 0 && r7.A00()) || r9.A2J())) {
            ContactFormBottomSheetFragment contactFormBottomSheetFragment = new ContactFormBottomSheetFragment();
            contactFormBottomSheetFragment.A1R(bundle);
            C20098A7b.A02(contactFormBottomSheetFragment, r6);
            return;
        }
        AnonymousClass74O.A0A(activity, 2131894324, 2131894328, 0, false);
    }
}
