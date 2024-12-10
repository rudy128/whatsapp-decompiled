package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2Q4;
import X.C178119Bw;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C40811vJ;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1", f = "VoiceChatBottomSheetViewModel.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
public final class VoiceChatBottomSheetViewModel$joinCall$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ VoiceChatBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceChatBottomSheetViewModel$joinCall$1(Context context, VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = voiceChatBottomSheetViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new VoiceChatBottomSheetViewModel$joinCall$1(this.$context, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = this.this$0;
            AnonymousClass2Q4 A04 = voiceChatBottomSheetViewModel.A0J.A04(C40811vJ.A0A(voiceChatBottomSheetViewModel.A04));
            if (A04 != null) {
                VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel2 = this.this$0;
                Context context = this.$context;
                C178119Bw A042 = voiceChatBottomSheetViewModel2.A0H.A04(A04.A01());
                if (A042 != null) {
                    C18600wl r2 = voiceChatBottomSheetViewModel2.A0O;
                    VoiceChatBottomSheetViewModel$joinCall$1$1$1$1 voiceChatBottomSheetViewModel$joinCall$1$1$1$1 = new VoiceChatBottomSheetViewModel$joinCall$1$1$1$1(context, voiceChatBottomSheetViewModel2, A042, (C30391dr) null);
                    this.label = 1;
                    if (C30451dy.A00(this, r2, voiceChatBottomSheetViewModel$joinCall$1$1$1$1) == r6) {
                        return r6;
                    }
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VoiceChatBottomSheetViewModel$joinCall$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
