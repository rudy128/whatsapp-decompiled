package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.whatsapp.mediaview.RevokeNuxDialogFragment;

/* renamed from: X.4ga  reason: invalid class name and case insensitive filesystem */
public class C91994ga implements C107825ag {
    public final int A00;
    public final Object A01;

    public C91994ga(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C31() {
        if (this.A00 != 0) {
            AnonymousClass3MW.A1V(this.A01);
        } else {
            AnonymousClass4Yv.A00((Activity) this.A01, 13);
        }
    }

    public void C5c(AnonymousClass1BI r4, int i) {
        if (this.A00 != 0) {
            Fragment fragment = (Fragment) this.A01;
            if (fragment.A1b()) {
                new RevokeNuxDialogFragment(r4, i).A2F(fragment.A1E(), "delete_message_dialog_fragment_tag");
                return;
            }
            return;
        }
        AnonymousClass4Yv.A01((Activity) this.A01, i);
    }
}
