package com.whatsapp.avatar.prefetch;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.prefetch.AvatarPrefetchController$initialize$3", f = "AvatarPrefetchController.kt", i = {0, 0}, l = {73, 75}, m = "invokeSuspend", n = {"bridgeParams", "initParams"}, s = {"L$0", "L$1"})
public final class AvatarPrefetchController$initialize$3 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AvatarPrefetchController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarPrefetchController$initialize$3(AvatarPrefetchController avatarPrefetchController, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarPrefetchController;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarPrefetchController$initialize$3 avatarPrefetchController$initialize$3 = new AvatarPrefetchController$initialize$3(this.this$0, r4);
        avatarPrefetchController$initialize$3.L$0 = obj;
        return avatarPrefetchController$initialize$3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x0032
            if (r0 != r5) goto L_0x0134
            X.C30691eM.A01(r11)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r11)
            java.lang.Object r0 = r10.L$0
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r3 = r0.first
            X.CbX r3 = (X.C25236CbX) r3
            java.lang.Object r6 = r0.second
            X.Cbe r6 = (X.C25243Cbe) r6
            com.whatsapp.avatar.prefetch.AvatarPrefetchController r1 = r10.this$0
            X.D8a r0 = r1.A05
            r10.L$0 = r3
            r10.L$1 = r6
            r10.label = r2
            java.lang.Object r0 = com.whatsapp.avatar.prefetch.AvatarPrefetchController.A00(r0, r1, r3, r10)
            if (r0 != r4) goto L_0x003d
            return r4
        L_0x0032:
            java.lang.Object r6 = r10.L$1
            X.Cbe r6 = (X.C25243Cbe) r6
            java.lang.Object r3 = r10.L$0
            X.CbX r3 = (X.C25236CbX) r3
            X.C30691eM.A01(r11)
        L_0x003d:
            com.whatsapp.avatar.prefetch.AvatarPrefetchController r2 = r10.this$0
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.util.Map r3 = r3.A09
            r1 = 0
            if (r3 == 0) goto L_0x004e
            java.lang.String r0 = "isBackgroundRenderingPrewarmEnabled"
            java.lang.Object r1 = r3.get(r0)
        L_0x004e:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x011d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x011d
            boolean r0 = r1.booleanValue()
        L_0x005a:
            r2.A01 = r0
            com.whatsapp.avatar.prefetch.AvatarPrefetchController r0 = r10.this$0
            X.COK r2 = r0.A08
            java.lang.String r8 = r6.A0D
            r1 = 0
            if (r3 == 0) goto L_0x006b
            java.lang.String r0 = "isBackgroundRenderingPrewarmEnabled"
            java.lang.Object r1 = r3.get(r0)
        L_0x006b:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x011a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x011a
            boolean r1 = r1.booleanValue()
        L_0x0077:
            r3 = 0
            boolean r0 = r6.A0I
            X.ClW r9 = new X.ClW
            r9.<init>(r0)
            r6 = 0
            r10.L$0 = r6
            r10.L$1 = r6
            r10.label = r5
            if (r8 == 0) goto L_0x000f
            if (r1 == 0) goto L_0x0120
            X.CLz r0 = r2.A00
            X.1H7 r0 = r0.A00
            java.lang.Object r7 = r0.A01()
            X.Cql r7 = (X.C26027Cql) r7
            r5 = 1
            X.CZL r0 = r7.A04
            if (r0 != 0) goto L_0x000f
            r7.A05 = r5
            X.CVQ r2 = r7.A06
            X.DOg r1 = r7.A07
            X.COa r0 = r7.A09
            X.CWg r0 = r0.A01
            X.CZL r1 = r2.A00(r9, r1, r0)
            r7.A04 = r1
            java.lang.String r9 = "sparkEffectProcessor"
            X.CjS r0 = new X.CjS
            r0.<init>()
            X.DE4 r2 = X.DE4.A00(r0, r5)
            r0 = 400(0x190, float:5.6E-43)
            r2.A03(r0, r0, r3)
            X.DDU r0 = r1.A01
            X.BUd r1 = X.EDC.A01
            X.EDK r0 = r0.BP7(r1)
            X.EDC r0 = (X.EDC) r0
            X.Cmv r0 = X.DDR.A08(r0)
            r0.A03(r2, r3)
            X.CZL r0 = r7.A04
            if (r0 == 0) goto L_0x0139
            r0.A00()
            X.C26027Cql.A01(r7, r8)
            X.CZL r2 = r7.A04
            if (r2 == 0) goto L_0x0139
            X.DDU r0 = r2.A01
            r0.CG0()
            X.EDK r0 = r0.BP7(r1)
            X.EDC r0 = (X.EDC) r0
            X.Cmv r1 = X.DDR.A08(r0)
            X.DDm r0 = r2.A02
            r1.A04(r0, r3)
            X.1Fz r3 = r7.A0C
            com.whatsapp.productinfra.avatar.liveediting.richmedia.SparkRichAvatarViewProvider$collectFlow$1 r2 = new com.whatsapp.productinfra.avatar.liveediting.richmedia.SparkRichAvatarViewProvider$collectFlow$1
            r2.<init>(r7, r6)
            r0 = 7
            X.DXs r1 = new X.DXs
            r1.<init>((X.AnonymousClass1OS) r2, (X.C23421Fz) r3, (int) r0)
            r0 = 2
            X.DXo r2 = new X.DXo
            r2.<init>(r1, r0)
            r1 = 3
            X.DXo r0 = new X.DXo
            r0.<init>(r2, r1)
            X.DXo r2 = new X.DXo
            r2.<init>(r0, r5)
            r0 = 15
            X.DXo r1 = new X.DXo
            r1.<init>(r2, r0)
            X.DXy r0 = X.C27188DXy.A00
            java.lang.Object r0 = r1.BFC(r10, r0)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x011a:
            r1 = 0
            goto L_0x0077
        L_0x011d:
            r0 = 0
            goto L_0x005a
        L_0x0120:
            X.00H r0 = r2.A01
            java.lang.Object r2 = r0.get()
            com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository r2 = (com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository) r2
            X.0wl r1 = r2.A01
            com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository$fetchAvatarAREffect$1 r0 = new com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository$fetchAvatarAREffect$1
            r0.<init>(r2, r8, r6)
            X.AnonymousClass4GT.A00(r1, r0)
            goto L_0x000f
        L_0x0134:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0139:
            X.C18070vi.A11(r9)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avatar.prefetch.AvatarPrefetchController$initialize$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarPrefetchController$initialize$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
