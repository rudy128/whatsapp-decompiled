package com.whatsapp.community.deactivate;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1", f = "DeactivateCommunityDisclaimerActivity.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
public final class DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ DeactivateCommunityDisclaimerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = deactivateCommunityDisclaimerActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r3 != 404) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L_0x0078
            if (r0 != r5) goto L_0x00a8
            X.C30691eM.A01(r7)
        L_0x000c:
            X.4EL r7 = (X.AnonymousClass4EL) r7
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            r0.CEx()
            boolean r0 = r7 instanceof X.C77213pe
            if (r0 == 0) goto L_0x004a
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r4 = r6.this$0
            r3 = 2131889208(0x7f120c38, float:1.9413073E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            X.1Me r1 = r4.A02
            if (r1 == 0) goto L_0x0047
            X.1E7 r0 = r4.A04
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "parentGroupContact"
        L_0x0028:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x002d:
            java.lang.String r1 = r1.A0I(r0)
            r0 = 0
            java.lang.String r1 = X.AnonymousClass3Ma.A10(r4, r1, r2, r0, r3)
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            X.00H r0 = r0.A06
            if (r0 == 0) goto L_0x0044
            X.1gf r0 = X.AnonymousClass3MX.A0b(r0)
            r0.BhK(r4, r1)
            goto L_0x00a5
        L_0x0044:
            java.lang.String r0 = "communityNavigator"
            goto L_0x0028
        L_0x0047:
            java.lang.String r0 = "waContactNames"
            goto L_0x0028
        L_0x004a:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper.DeactivateCommunityResult.Error"
            X.C18070vi.A0z(r7, r0)
            X.3pd r7 = (X.AnonymousClass3pd) r7
            int r3 = r7.A00
            r0 = -2
            r2 = -1
            if (r3 == r0) goto L_0x0068
            if (r3 == r2) goto L_0x0068
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L_0x0068
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x0074
            r0 = 404(0x194, float:5.66E-43)
            r1 = 2131889203(0x7f120c33, float:1.9413063E38)
            if (r3 == r0) goto L_0x006b
        L_0x0068:
            r1 = 2131889206(0x7f120c36, float:1.941307E38)
        L_0x006b:
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            android.view.View r0 = r0.A00
            if (r0 != 0) goto L_0x009e
            java.lang.String r0 = "mainView"
            goto L_0x0028
        L_0x0074:
            r1 = 2131889189(0x7f120c25, float:1.9413035E38)
            goto L_0x006b
        L_0x0078:
            X.C30691eM.A01(r7)
            com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper r2 = com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper.A00
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            X.00H r0 = r0.A07
            if (r0 == 0) goto L_0x009b
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            X.1EC r0 = r0.A05
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "parentGroupJid"
            goto L_0x0028
        L_0x0092:
            r6.label = r5
            java.lang.Object r7 = r2.A00(r0, r1, r6)
            if (r7 != r3) goto L_0x000c
            return r3
        L_0x009b:
            java.lang.String r0 = "messageClient"
            goto L_0x0028
        L_0x009e:
            X.Bik r0 = X.C23520Bik.A01(r0, r1, r2)
            r0.A08()
        L_0x00a5:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
