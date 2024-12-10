package com.whatsapp.inappsupport;

import X.AnonymousClass1FU;
import X.AnonymousClass1OS;
import X.AnonymousClass4ZI;
import X.C193859qm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1", f = "SupportMessageFeedbackUtilsImpl.kt", i = {}, l = {88, 89}, m = "invokeSuspend", n = {}, s = {})
public final class SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FU $dialogActivity;
    public final /* synthetic */ C193859qm $feedbackData;
    public int label;
    public final /* synthetic */ AnonymousClass4ZI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1(AnonymousClass1FU r2, AnonymousClass4ZI r3, C193859qm r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$feedbackData = r4;
        this.$dialogActivity = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1(this.$dialogActivity, this.this$0, this.$feedbackData, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0032
            if (r0 != r6) goto L_0x004a
            X.C30691eM.A01(r8)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r8)
            X.4ZI r0 = r7.this$0
            X.00H r0 = r0.A03
            java.lang.Object r4 = r0.get()
            X.9dQ r4 = (X.C185959dQ) r4
            X.9qm r3 = r7.$feedbackData
            r7.label = r1
            X.0wl r2 = r4.A02
            r1 = 0
            com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2 r0 = new com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2
            r0.<init>(r3, r4, r1)
            java.lang.Object r0 = X.C30451dy.A00(r7, r2, r0)
            if (r0 != r5) goto L_0x0035
            return r5
        L_0x0032:
            X.C30691eM.A01(r8)
        L_0x0035:
            X.4ZI r4 = r7.this$0
            X.0wl r3 = r4.A04
            X.1FU r2 = r7.$dialogActivity
            r1 = 0
            com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1$1 r0 = new com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1$1
            r0.<init>(r2, r4, r1)
            r7.label = r6
            java.lang.Object r0 = X.C30451dy.A00(r7, r3, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
