package X;

import android.content.DialogInterface;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.75F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass75F implements DialogInterface.OnShowListener {
    public final /* synthetic */ CallInfo A00;
    public final /* synthetic */ VoipCallControlBottomSheetV2 A01;
    public final /* synthetic */ boolean A02;

    public final void onShow(DialogInterface dialogInterface) {
        this.A01.A2F(dialogInterface, this.A00, this.A02);
    }

    public /* synthetic */ AnonymousClass75F(CallInfo callInfo, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2, boolean z) {
        this.A01 = voipCallControlBottomSheetV2;
        this.A02 = z;
        this.A00 = callInfo;
    }
}
