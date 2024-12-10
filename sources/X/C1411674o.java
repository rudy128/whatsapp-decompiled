package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.status.crossposting.privacy.ShareToFacebookActivity;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.74o  reason: invalid class name and case insensitive filesystem */
public class C1411674o implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public C1411674o(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onCancel(DialogInterface dialogInterface) {
        int i;
        Activity activity;
        switch (this.A00) {
            case 0:
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                Dialog dialog = dialogFragment.A03;
                if (dialog != null) {
                    dialogFragment.onCancel(dialog);
                    return;
                }
                return;
            case 1:
                AnonymousClass3MW.A1U(this.A01);
                return;
            case 2:
                AccountSwitchingActivity.A03((AccountSwitchingActivity) this.A01, false);
                return;
            case 3:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                AnonymousClass4Yv.A00(contactPickerFragment.A1B(), 1);
                AnonymousClass02B r0 = contactPickerFragment.A0E;
                if (r0 != null) {
                    r0.A05();
                    return;
                }
                return;
            case 4:
                activity = ((Fragment) this.A01).A1B();
                i = 2;
                break;
            case 5:
                activity = ((Fragment) this.A01).A1B();
                i = 3;
                break;
            case 7:
                AnonymousClass75M r2 = (AnonymousClass75M) this.A01;
                if (r2.A0X == AnonymousClass00R.A0N) {
                    AnonymousClass75M.A07(r2);
                    return;
                }
                return;
            case 9:
                activity = (Activity) this.A01;
                i = 26;
                break;
            case 10:
                activity = (Activity) this.A01;
                i = 27;
                break;
            case 11:
                ((ShareToFacebookActivity) this.A01).A4b().A04("TAP_UNLINK_CANCEL");
                return;
            case 12:
                MessageReplyActivity.A0w((MessageReplyActivity) this.A01);
                return;
            default:
                ((A34) this.A01).A0B(true);
                return;
        }
        AnonymousClass4Yv.A00(activity, i);
    }
}
