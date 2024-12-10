package X;

import android.os.Bundle;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;

/* renamed from: X.4PP  reason: invalid class name */
public final class AnonymousClass4PP {
    public final void A00(AnonymousClass1GP r7, AnonymousClass206 r8, boolean z) {
        AnonymousClass1BI r1;
        Bundle A0D = C17880vN.A0D();
        if (!(r8 == null || (r1 = r8.A0v.A00) == null)) {
            AnonymousClass3MY.A15(A0D, r1, "CHAT_JID");
            A0D.putInt("MESSAGE_TYPE", r8.A0u);
            A0D.putBoolean("IN_GROUP", C22971Dz.A0e(r1));
            A0D.putBoolean("IS_SENDER", false);
        }
        A0D.putBoolean("FORCE_SHOW", z);
        ViewOnceNuxBottomSheet viewOnceNuxBottomSheet = new ViewOnceNuxBottomSheet();
        viewOnceNuxBottomSheet.A1R(A0D);
        viewOnceNuxBottomSheet.A2C(r7, "view_once_nux_v2");
    }
}
