package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1", f = "VoiceChatBottomSheetViewModel.kt", i = {0}, l = {178}, m = "invokeSuspend", n = {"i"}, s = {"I$0"})
public final class VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1 extends C30431dv implements AnonymousClass1OS {
    public int I$0;
    public int label;
    public final /* synthetic */ VoiceChatBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1(VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = voiceChatBottomSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r3 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r3) goto L_0x0056
            int r7 = r8.I$0
            X.C30691eM.A01(r9)
        L_0x000e:
            int r7 = r7 + -1
        L_0x0010:
            if (r7 <= 0) goto L_0x004e
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r6 = r8.this$0
            r5 = 2131755080(0x7f100048, float:1.914103E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r7)
            r2[r1] = r0
            X.6IS r0 = X.C1402670q.A01(r2, r5, r7)
            r6.A02 = r0
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = r8.this$0
            X.1DT r1 = r0.A09
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0E(r0)
            r8.I$0 = r7
            r8.label = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C62882s9.A00(r8, r0)
            if (r0 != r4) goto L_0x000e
            return r4
        L_0x003c:
            X.C30691eM.A01(r9)
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = r8.this$0
            X.0ve r2 = r0.A0K
            r1 = 6083(0x17c3, float:8.524E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            int r7 = r0 / 1000
            goto L_0x0010
        L_0x004e:
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r1 = r8.this$0
            r0 = 0
            r1.A02 = r0
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
