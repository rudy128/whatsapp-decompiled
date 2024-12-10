package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.A99;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1VP;
import X.AnonymousClass1VQ;
import X.C178119Bw;
import X.C17880vN;
import X.C17960vV;
import X.C19760yx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C62172qu;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1$1$1$1", f = "VoiceChatBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VoiceChatBottomSheetViewModel$joinCall$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C178119Bw $callLog;
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ VoiceChatBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceChatBottomSheetViewModel$joinCall$1$1$1$1(Context context, VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, C178119Bw r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = voiceChatBottomSheetViewModel;
        this.$context = context;
        this.$callLog = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new VoiceChatBottomSheetViewModel$joinCall$1$1$1$1(this.$context, this.this$0, this.$callLog, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            A99 a99 = this.this$0.A00;
            if (a99 != null) {
                Context context = this.$context;
                C178119Bw r1 = this.$callLog;
                CallInfo BO3 = a99.A29.BO3();
                C17960vV.A07(BO3);
                if (!a99.A1i) {
                    UserJid peerJid = BO3.getPeerJid();
                    C17960vV.A07(peerJid);
                    boolean z = BO3.videoEnabled;
                    a99.A0u(BO3.groupJid, peerJid, BO3.callId, false, z, BO3.isGroupCall, false);
                }
                AnonymousClass1VP r4 = a99.A2F;
                ArrayList A10 = C17880vN.A10(BO3.participants.keySet());
                String str = BO3.callId;
                AnonymousClass1VQ r42 = (AnonymousClass1VQ) r4;
                int i = 0;
                if (!r42.Bff(context, true, false)) {
                    C19760yx r2 = r42.A01;
                    if (r2 == null || !str.equals(r2.A00) || (i = AnonymousClass000.A0M(r2.A01)) == 0) {
                        Log.e("CallsManagerImpl/acceptCallFromVoiceChatLobby/ error in VC lobby entry point logging");
                        C17960vV.A0F(false, "Lobby entry point type cannot be 0");
                    }
                    if (AnonymousClass1VQ.A03(r42, new C62172qu(r1, i, false, r1.A0W()), str, A10, false, true) != 0) {
                        Voip.acceptCall();
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VoiceChatBottomSheetViewModel$joinCall$1$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
