package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.calling.controls.view.MoreMenuBottomSheet;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.5Qz  reason: invalid class name and case insensitive filesystem */
public final class C105175Qz extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AudioChatBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105175Qz(AudioChatBottomSheetDialog audioChatBottomSheetDialog) {
        super(1);
        this.this$0 = audioChatBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4DM r7 = (AnonymousClass4DM) obj;
        C18070vi.A0d(r7, 0);
        AudioChatBottomSheetDialog audioChatBottomSheetDialog = this.this$0;
        int ordinal = r7.ordinal();
        if (ordinal == 5) {
            A99 a99 = ((VoiceChatBottomSheetViewModel) audioChatBottomSheetDialog.A0Q.getValue()).A00;
            if (a99 != null) {
                A99.A0G(a99, (CallInfo) null, (String) null, 1);
            }
        } else if (ordinal == 4) {
            BottomSheetBehavior bottomSheetBehavior = audioChatBottomSheetDialog.A02;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0Y(0, true);
            }
            BottomSheetBehavior bottomSheetBehavior2 = audioChatBottomSheetDialog.A02;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.A0W(4);
            }
            C20098A7b.A01(new MoreMenuBottomSheet(), audioChatBottomSheetDialog.A1E());
        }
        return C27621Wu.A00;
    }
}
