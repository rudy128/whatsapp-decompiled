package com.whatsapp.inappsupport;

import X.AnonymousClass1FU;
import X.AnonymousClass1OS;
import X.AnonymousClass4ZI;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1", f = "SupportMessageFeedbackUtilsImpl.kt", i = {}, l = {80, 81}, m = "invokeSuspend", n = {}, s = {})
public final class SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FU $dialogActivity;
    public final /* synthetic */ String $messageId;
    public int label;
    public final /* synthetic */ AnonymousClass4ZI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1(AnonymousClass1FU r2, AnonymousClass4ZI r3, String str, C30391dr r5) {
        super(2, r5);
        this.$messageId = str;
        this.this$0 = r3;
        this.$dialogActivity = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        String str = this.$messageId;
        return new SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1(this.$dialogActivity, this.this$0, str, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x0040
            if (r0 != r6) goto L_0x0058
            X.C30691eM.A01(r8)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r8)
            java.lang.String r1 = r7.$messageId
            r0 = 0
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            java.util.List r0 = X.C18070vi.A0M(r0)
            X.9qm r4 = new X.9qm
            r4.<init>(r1, r0)
            X.4ZI r0 = r7.this$0
            X.00H r0 = r0.A03
            java.lang.Object r3 = r0.get()
            X.9dQ r3 = (X.C185959dQ) r3
            r7.label = r2
            X.0wl r2 = r3.A02
            r1 = 0
            com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2 r0 = new com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2
            r0.<init>(r4, r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r7, r2, r0)
            if (r0 != r5) goto L_0x0043
            return r5
        L_0x0040:
            X.C30691eM.A01(r8)
        L_0x0043:
            X.4ZI r4 = r7.this$0
            X.0wl r3 = r4.A04
            X.1FU r2 = r7.$dialogActivity
            r1 = 0
            com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1$1 r0 = new com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1$1
            r0.<init>(r2, r4, r1)
            r7.label = r6
            java.lang.Object r0 = X.C30451dy.A00(r7, r3, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
