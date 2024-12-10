package X;

import android.os.Bundle;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;
import com.whatsapp.jid.Jid;

/* renamed from: X.4G6  reason: invalid class name */
public abstract class AnonymousClass4G6 {
    public static final SharePhoneNumberBottomSheet A00(Jid jid, int i) {
        SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = new SharePhoneNumberBottomSheet();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D, jid, "arg_jid");
        A0D.putInt("arg_entry_point", i);
        sharePhoneNumberBottomSheet.A1R(A0D);
        return sharePhoneNumberBottomSheet;
    }
}
