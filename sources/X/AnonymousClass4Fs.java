package X;

import com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Fs  reason: invalid class name */
public abstract class AnonymousClass4Fs {
    public static final OneOnOneCallConfirmationSheet A00(UserJid userJid, int i, boolean z) {
        OneOnOneCallConfirmationSheet oneOnOneCallConfirmationSheet = new OneOnOneCallConfirmationSheet();
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[3];
        C72463Mc.A1H("is_video", Boolean.valueOf(z), r2);
        AnonymousClass1D6.A03("user_jid", userJid, r2, 1);
        r2[2] = AnonymousClass1D6.A00("call_from_ui", i);
        AnonymousClass3MX.A1I(oneOnOneCallConfirmationSheet, r2);
        return oneOnOneCallConfirmationSheet;
    }
}
