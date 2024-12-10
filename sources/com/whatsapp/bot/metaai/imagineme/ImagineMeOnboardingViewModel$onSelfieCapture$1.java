package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass1OS;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel$onSelfieCapture$1", f = "ImagineMeOnboardingViewModel.kt", i = {}, l = {361}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineMeOnboardingViewModel$onSelfieCapture$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $completion;
    public final /* synthetic */ byte[] $data;
    public int label;
    public final /* synthetic */ ImagineMeOnboardingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineMeOnboardingViewModel$onSelfieCapture$1(ImagineMeOnboardingViewModel imagineMeOnboardingViewModel, C30391dr r3, C18090vk r4, byte[] bArr) {
        super(2, r3);
        this.this$0 = imagineMeOnboardingViewModel;
        this.$data = bArr;
        this.$completion = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ImagineMeOnboardingViewModel$onSelfieCapture$1(this.this$0, r6, this.$completion, this.$data);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r4 = 1
            if (r0 == 0) goto L_0x0057
            if (r0 != r4) goto L_0x00a4
            X.C30691eM.A01(r8)
            X.1eK r8 = (X.C30671eK) r8
            java.lang.Object r6 = r8.value
        L_0x0010:
            boolean r1 = r6 instanceof X.AnonymousClass1IU
            r0 = 0
            if (r1 == 0) goto L_0x0016
            r6 = r0
        L_0x0016:
            java.io.File r6 = (java.io.File) r6
            if (r6 == 0) goto L_0x004e
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r5 = r7.this$0
            X.0vk r3 = r7.$completion
            java.util.List r1 = r5.A0I
            int r0 = r5.A00
            java.lang.Object r0 = r1.get(r0)
            X.4DS r0 = (X.AnonymousClass4DS) r0
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0054
            if (r1 == r4) goto L_0x0051
            r0 = 0
            if (r1 != r0) goto L_0x009f
            X.4Du r2 = X.C83094Du.LEFT
        L_0x0036:
            X.6o4 r1 = r5.A0A
            android.net.Uri r0 = android.net.Uri.fromFile(r6)
            r1.A00(r0, r2)
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            r0 = 0
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel.A03(r5, r0)
            if (r3 == 0) goto L_0x004e
            r3.invoke()
        L_0x004e:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0051:
            X.4Du r2 = X.C83094Du.RIGHT
            goto L_0x0036
        L_0x0054:
            X.4Du r2 = X.C83094Du.CENTER
            goto L_0x0036
        L_0x0057:
            X.C30691eM.A01(r8)
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r2 = r7.this$0
            java.util.List r1 = r2.A0I
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.4DS r0 = (X.AnonymousClass4DS) r0
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0096
            if (r1 == r4) goto L_0x008d
            r0 = 0
            if (r1 != r0) goto L_0x007e
            X.1Pq r3 = r2.A01
            if (r3 == 0) goto L_0x007e
            X.1BI r2 = r2.A02
            r1 = 19
        L_0x007a:
            r0 = 0
            X.AnonymousClass3MY.A1P(r2, r3, r1, r0)
        L_0x007e:
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel r0 = r7.this$0
            com.whatsapp.bot.metaai.imagineme.ImagineMePictureDataRepository r1 = r0.A09
            byte[] r0 = r7.$data
            r7.label = r4
            java.lang.Object r6 = r1.A00(r7, r0)
            if (r6 != r5) goto L_0x0010
            return r5
        L_0x008d:
            X.1Pq r3 = r2.A01
            if (r3 == 0) goto L_0x007e
            X.1BI r2 = r2.A02
            r1 = 18
            goto L_0x007a
        L_0x0096:
            X.1Pq r3 = r2.A01
            if (r3 == 0) goto L_0x007e
            X.1BI r2 = r2.A02
            r1 = 17
            goto L_0x007a
        L_0x009f:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel$onSelfieCapture$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImagineMeOnboardingViewModel$onSelfieCapture$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
