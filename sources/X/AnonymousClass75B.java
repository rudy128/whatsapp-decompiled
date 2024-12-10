package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;

/* renamed from: X.75B  reason: invalid class name */
public class AnonymousClass75B implements DialogInterface.OnKeyListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass75B(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        AnonymousClass1FL A1B;
        C1407973c r0;
        CallInfo A0Q;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) obj;
                if (i != 4 || !sharedTextPreviewDialogFragment.A06.isShowing()) {
                    return false;
                }
                sharedTextPreviewDialogFragment.A06.dismiss();
                return true;
            case 1:
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) obj;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                RelativeLayout relativeLayout = flowsWebBottomSheetContainer.A01;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0B;
                    if (waFlowsViewModel == null) {
                        C18070vi.A11("waFlowsViewModel");
                        throw null;
                    }
                    AnonymousClass3MY.A1M(waFlowsViewModel.A00, true);
                    return true;
                }
                C108955ca.A1M(flowsWebBottomSheetContainer);
                return true;
            case 2:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) obj;
                if (i != 4) {
                    return false;
                }
                StorageUsageGalleryActivity.A03(storageUsageGalleryActivity);
                return true;
            case 3:
                VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = (VoipCallControlBottomSheetV2) obj;
                if (i == 4 && keyEvent.getAction() == 1) {
                    C131796lg r02 = voipCallControlBottomSheetV2.A0b;
                    if (r02 == null || (A0Q = VoipActivityV2.A0Q(r02.A00)) == null || (!Voip.A0B(A0Q.callState) && !voipCallControlBottomSheetV2.A0M.A01)) {
                        BottomSheetViewModel bottomSheetViewModel = voipCallControlBottomSheetV2.A0M;
                        if (((bottomSheetViewModel == null || !C72463Mc.A1O(bottomSheetViewModel.A0A)) && ((r0 = voipCallControlBottomSheetV2.A0K) == null || r0.A07())) || (A1B = voipCallControlBottomSheetV2.A1B()) == null) {
                            VoipCallControlBottomSheetV2.A03(voipCallControlBottomSheetV2);
                            return true;
                        }
                        A1B.onBackPressed();
                        return true;
                    }
                    VoipCallControlBottomSheetV2.A06(voipCallControlBottomSheetV2, 1);
                    return true;
                }
                AnonymousClass1FL A1B2 = voipCallControlBottomSheetV2.A1B();
                if (A1B2 == null || !(A1B2 instanceof AnonymousClass01E)) {
                    return false;
                }
                return ((AnonymousClass01E) A1B2).dispatchKeyEvent(keyEvent);
            default:
                FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = (FcsBottomSheetBaseContainer) obj;
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                FcsBottomSheetBaseContainer.A01(fcsBottomSheetBaseContainer);
                return true;
        }
    }
}
