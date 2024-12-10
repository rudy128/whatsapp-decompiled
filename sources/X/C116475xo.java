package X;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet;
import com.whatsapp.calling.calllink.viewmodel.CallLinkViewModel;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;

/* renamed from: X.5xo  reason: invalid class name and case insensitive filesystem */
public class C116475xo extends C86294Rb {
    public final int A00;
    public final Object A01;

    public C116475xo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        boolean z;
        switch (this.A00) {
            case 0:
                CallLinkViewModel callLinkViewModel = ((CallLinkActivity) this.A01).A07;
                Boolean bool = (Boolean) callLinkViewModel.A02.A02("saved_state_is_video");
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                CallLinkViewModel.A00(callLinkViewModel, z);
                return;
            case 1:
                CreateCallLinkBottomSheet.A02((CreateCallLinkBottomSheet) this.A01);
                return;
            case 2:
                VoipActivityV2.A1W((VoipActivityV2) this.A01);
                return;
            default:
                return;
        }
    }

    public void A01(DialogInterface dialogInterface) {
        DialogFragment dialogFragment;
        switch (this.A00) {
            case 0:
                AnonymousClass3MW.A1U(this.A01);
                return;
            case 1:
                Fragment A0Q = ((Fragment) this.A01).A1E().A0Q("call_link_error_dialog");
                if ((A0Q instanceof VoipErrorDialogFragment) && (dialogFragment = (DialogFragment) A0Q) != null) {
                    dialogFragment.A28();
                    return;
                }
                return;
            case 3:
                dialogInterface.dismiss();
                ((VoipActivityV2) this.A01).finish();
                return;
            default:
                super.A01(dialogInterface);
                return;
        }
    }
}
