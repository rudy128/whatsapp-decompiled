package com.whatsapp.interopui.optin;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel$onUserOptedIn$1", f = "InteropOptInSelectInboxViewModel.kt", i = {}, l = {76, 78}, m = "invokeSuspend", n = {}, s = {})
public final class InteropOptInSelectInboxViewModel$onUserOptedIn$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $selectedIntegratorIds;
    public final /* synthetic */ List $selectedIntegratorInfo;
    public int label;
    public final /* synthetic */ InteropOptInSelectInboxViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropOptInSelectInboxViewModel$onUserOptedIn$1(InteropOptInSelectInboxViewModel interopOptInSelectInboxViewModel, List list, List list2, C30391dr r5) {
        super(2, r5);
        this.this$0 = interopOptInSelectInboxViewModel;
        this.$selectedIntegratorIds = list;
        this.$selectedIntegratorInfo = list2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new InteropOptInSelectInboxViewModel$onUserOptedIn$1(this.this$0, this.$selectedIntegratorIds, this.$selectedIntegratorInfo, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r7.label
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r0) goto L_0x004b
            if (r1 != r6) goto L_0x00eb
            X.C30691eM.A01(r8)
        L_0x000f:
            X.4Ek r8 = (X.C83254Ek) r8
            boolean r0 = r8 instanceof X.AnonymousClass426
            if (r0 == 0) goto L_0x00c5
            com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel r4 = r7.this$0
            java.util.List r2 = r7.$selectedIntegratorInfo
            X.426 r8 = (X.AnonymousClass426) r8
            java.util.List r3 = r8.A00
            java.util.ArrayList r6 = X.C29351c6.A0E(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0025:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r1.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            int r0 = X.AnonymousClass3MZ.A04(r0)
            X.C17890vO.A1D(r6, r0)
            goto L_0x0025
        L_0x0039:
            X.C30691eM.A01(r8)
            long r2 = java.lang.System.currentTimeMillis()
            r7.label = r0
            r0 = 2500(0x9c4, double:1.235E-320)
            java.lang.Object r0 = X.AnonymousClass4ZQ.A00(r7, r2, r0)
            if (r0 != r5) goto L_0x004e
            return r5
        L_0x004b:
            X.C30691eM.A01(r8)
        L_0x004e:
            com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel r0 = r7.this$0
            X.00H r0 = r0.A03
            java.lang.Object r4 = r0.get()
            X.1kr r4 = (X.C34651kr) r4
            java.util.List r3 = r7.$selectedIntegratorIds
            r7.label = r6
            X.0wl r2 = r4.A04
            r1 = 0
            com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2 r0 = new com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2
            r0.<init>(r4, r3, r1)
            java.lang.Object r8 = X.C30451dy.A00(r7, r2, r0)
            if (r8 != r5) goto L_0x000f
            return r5
        L_0x006b:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r2.iterator()
        L_0x0073:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4Tl r0 = (X.C86884Tl) r0
            X.4ca r0 = r0.A01
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass3Ma.A1b(r6, r0)
            X.AnonymousClass3MZ.A1V(r1, r5, r0)
            goto L_0x0073
        L_0x008c:
            java.util.ArrayList r2 = X.C29351c6.A0E(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x0094:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = r1.next()
            X.4Tl r0 = (X.C86884Tl) r0
            X.4ca r0 = r0.A01
            r2.add(r0)
            goto L_0x0094
        L_0x00a6:
            X.00H r0 = r4.A05
            X.1jg r0 = X.AnonymousClass3MX.A0k(r0)
            r0.A02(r2)
            boolean r1 = r3.isEmpty()
            com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel r0 = r7.this$0
            X.1DT r3 = r0.A01
            if (r1 == 0) goto L_0x00c2
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            r0 = 0
            X.4Ze r2 = new X.4Ze
            r2.<init>(r1, r0, r0)
            goto L_0x00d5
        L_0x00c2:
            r0 = 10
            goto L_0x00d1
        L_0x00c5:
            boolean r0 = r8 instanceof X.AnonymousClass425
            if (r0 == 0) goto L_0x00db
            com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel r0 = r7.this$0
            X.1DT r3 = r0.A01
            X.425 r8 = (X.AnonymousClass425) r8
            long r0 = r8.A00
        L_0x00d1:
            X.4Ze r2 = X.C88314Ze.A00(r0)
        L_0x00d5:
            r3.A0E(r2)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00db:
            boolean r0 = r8 instanceof X.AnonymousClass427
            if (r0 == 0) goto L_0x00e6
            com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel r0 = r7.this$0
            X.1DT r3 = r0.A01
            r0 = 810(0x32a, double:4.0E-321)
            goto L_0x00d1
        L_0x00e6:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.optin.InteropOptInSelectInboxViewModel$onUserOptedIn$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropOptInSelectInboxViewModel$onUserOptedIn$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
