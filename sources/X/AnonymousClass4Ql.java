package X;

import android.os.Bundle;
import android.widget.Toast;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.whatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.4Ql  reason: invalid class name */
public final class AnonymousClass4Ql {
    public Toast A00;
    public final AnonymousClass1KB A01;
    public final C19830z4 A02;
    public final C34441kU A03;

    public final void A00(AnonymousClass1GP r10, Integer num, String str, List list, boolean z, boolean z2) {
        Jid jid;
        boolean z3;
        Toast toast = this.A00;
        if (toast != null) {
            toast.cancel();
        }
        if (z && num != null) {
            int intValue = num.intValue();
            int i = 0;
            if (list == null || list.size() != 1) {
                jid = null;
                z3 = false;
            } else {
                i = 42;
                if (z2) {
                    i = 43;
                }
                jid = (Jid) C29431cG.A0b(list);
                C18070vi.A0d(jid, 2);
                z3 = true;
            }
            Toast toast2 = null;
            if (z3) {
                C34441kU r0 = this.A03;
                C18070vi.A0d(r0, 0);
                if (!r0.A00.A01((Object) null, "ephemeral_view_once") && r10.A0Q("view_once_nux_v2") == null) {
                    Bundle A0D = C17880vN.A0D();
                    AnonymousClass3MY.A15(A0D, jid, "CHAT_JID");
                    A0D.putInt("MESSAGE_TYPE", i);
                    A0D.putBoolean("IN_GROUP", C22971Dz.A0e(jid));
                    A0D.putBoolean("FORCE_SHOW", false);
                    ViewOnceNuxBottomSheet viewOnceNuxBottomSheet = new ViewOnceNuxBottomSheet();
                    viewOnceNuxBottomSheet.A1R(A0D);
                    viewOnceNuxBottomSheet.A2C(r10, "view_once_nux_v2");
                    this.A00 = toast2;
                } else if (!C17890vO.A0B(this.A02).getBoolean("view_once_nux_secondary", false)) {
                    Bundle A0D2 = C17880vN.A0D();
                    A0D2.putString("CHAT_JID", jid.getRawString());
                    A0D2.putInt("MESSAGE_TYPE", i);
                    A0D2.putBoolean("IN_GROUP", C22971Dz.A0e(jid));
                    ViewOnceSecondaryNuxBottomSheet viewOnceSecondaryNuxBottomSheet = new ViewOnceSecondaryNuxBottomSheet();
                    viewOnceSecondaryNuxBottomSheet.A1R(A0D2);
                    viewOnceSecondaryNuxBottomSheet.A2C(r10, "view_once_nux_secondary");
                    this.A00 = toast2;
                }
            }
            if (str != null) {
                AnonymousClass1KB r4 = this.A01;
                AnonymousClass1KB.A01(r4, "toast");
                toast2 = r4.A03(str);
                toast2.setGravity(49, 0, intValue / 2);
                toast2.show();
            }
            this.A00 = toast2;
        }
    }

    public AnonymousClass4Ql(AnonymousClass1KB r1, C19830z4 r2, C34441kU r3) {
        C18070vi.A0k(r2, r1);
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
    }
}
