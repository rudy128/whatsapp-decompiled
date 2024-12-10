package com.whatsapp.registration.silentauth;

import X.AnonymousClass1OS;
import X.C187509fv;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.silentauth.SilentAuthConnectivityHelper$checkCellularConnectivity$2", f = "SilentAuthConnectivityHelper.kt", i = {}, l = {40, 42, 42, 48, 52}, m = "invokeSuspend", n = {}, s = {})
public final class SilentAuthConnectivityHelper$checkCellularConnectivity$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $executeOnCellular;
    public final /* synthetic */ C22821Di $executeWhenCellularNotAvailable;
    public Object L$0;
    public int label;
    public final /* synthetic */ C187509fv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SilentAuthConnectivityHelper$checkCellularConnectivity$2(C187509fv r2, C30391dr r3, C22821Di r4, AnonymousClass1OS r5) {
        super(2, r3);
        this.this$0 = r2;
        this.$executeWhenCellularNotAvailable = r4;
        this.$executeOnCellular = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new SilentAuthConnectivityHelper$checkCellularConnectivity$2(this.this$0, r6, this.$executeWhenCellularNotAvailable, this.$executeOnCellular);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r6 = 0
            r7 = 5
            r2 = 4
            r5 = 3
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 == r1) goto L_0x00a2
            if (r0 == r4) goto L_0x00b5
            if (r0 == r5) goto L_0x00d6
            if (r0 == r2) goto L_0x00d6
            if (r0 == r7) goto L_0x00d6
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001b:
            X.C30691eM.A01(r13)
            X.9fv r0 = r12.this$0
            X.11E r0 = r0.A00
            int r0 = r0.A03(r1)
            if (r0 == 0) goto L_0x00c3
            if (r0 == r1) goto L_0x0035
            X.1OS r0 = r12.$executeOnCellular
            r12.label = r7
            java.lang.Object r0 = r0.invoke(r6, r12)
        L_0x0032:
            if (r0 != r3) goto L_0x00d9
            return r3
        L_0x0035:
            X.9fv r0 = r12.this$0
            X.118 r11 = r0.A01
            X.19D r10 = r0.A03
            X.0z4 r9 = r0.A02
            r12.label = r1
            X.1g7 r8 = X.C72473Md.A0m(r12)
            X.9Yx r7 = new X.9Yx
            r7.<init>(r8)
            r2 = 0
            r1 = 6320(0x18b0, float:8.856E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            if (r0 == 0) goto L_0x0096
            android.content.Context r1 = r11.A00
            java.lang.String r0 = "connectivity"
            java.lang.Object r10 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            X.C18070vi.A0z(r10, r0)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            boolean r0 = X.AnonymousClass112.A03()
            if (r0 == 0) goto L_0x008c
            android.net.NetworkRequest$Builder r0 = new android.net.NetworkRequest$Builder
            r0.<init>()
            android.net.NetworkRequest$Builder r1 = r0.addTransportType(r2)
            r0 = 12
            android.net.NetworkRequest$Builder r0 = r1.addCapability(r0)
            android.net.NetworkRequest r2 = r0.build()
            X.8CQ r1 = new X.8CQ
            r1.<init>(r9, r7)
            r0 = 15000(0x3a98, float:2.102E-41)
            r10.requestNetwork(r2, r1, r0)
        L_0x0085:
            java.lang.Object r13 = r8.A0C()
            if (r13 != r3) goto L_0x00a5
            return r3
        L_0x008c:
            java.lang.String r0 = "CellularNetworkUtils/maybeExecuteRequestOnCellular/Less than SDK 26"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "silent_auth_sdk_under_26"
            r9.A1g(r0)
        L_0x0096:
            X.1g5 r1 = r7.A00
            boolean r0 = r1.Be2()
            if (r0 == 0) goto L_0x0085
            r1.resumeWith(r6)
            goto L_0x0085
        L_0x00a2:
            X.C30691eM.A01(r13)
        L_0x00a5:
            r1 = r13
            if (r13 == 0) goto L_0x00bc
            X.1OS r0 = r12.$executeOnCellular
            r12.L$0 = r13
            r12.label = r4
            java.lang.Object r0 = r0.invoke(r13, r12)
            if (r0 != r3) goto L_0x00db
            return r3
        L_0x00b5:
            java.lang.Object r1 = r12.L$0
            X.C30691eM.A01(r13)
            if (r1 != 0) goto L_0x00db
        L_0x00bc:
            X.1Di r0 = r12.$executeWhenCellularNotAvailable
            r12.L$0 = r6
            r12.label = r5
            goto L_0x00d0
        L_0x00c3:
            X.9fv r0 = r12.this$0
            X.0z4 r1 = r0.A02
            java.lang.String r0 = "silent_auth_no_internet"
            r1.A1g(r0)
            X.1Di r0 = r12.$executeWhenCellularNotAvailable
            r12.label = r2
        L_0x00d0:
            java.lang.Object r0 = r0.invoke(r12)
            goto L_0x0032
        L_0x00d6:
            X.C30691eM.A01(r13)
        L_0x00d9:
            X.1Wu r1 = X.C27621Wu.A00
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.silentauth.SilentAuthConnectivityHelper$checkCellularConnectivity$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SilentAuthConnectivityHelper$checkCellularConnectivity$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
