package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass1OS;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fbJob$1", f = "WfsNativeAuthManager.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$2$fbJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C108485bm $resultChannel;
    public int label;
    public final /* synthetic */ WfsNativeAuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2$fbJob$1(Context context, WfsNativeAuthManager wfsNativeAuthManager, C30391dr r4, C108485bm r5) {
        super(2, r4);
        this.this$0 = wfsNativeAuthManager;
        this.$context = context;
        this.$resultChannel = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new WfsNativeAuthManager$getSsoList$2$fbJob$1(this.$context, this.this$0, r6, this.$resultChannel);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.0wS} */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.B9t] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r4 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 != r4) goto L_0x000e
            X.C30691eM.A01(r10)     // Catch:{ SecurityException -> 0x00bc }
            goto L_0x00ca
        L_0x000e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0013:
            X.C30691eM.A01(r10)
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager r0 = r9.this$0     // Catch:{ SecurityException -> 0x00bc }
            android.content.Context r7 = r9.$context     // Catch:{ SecurityException -> 0x00bc }
            r6 = 0
            X.C18070vi.A0d(r7, r6)     // Catch:{ SecurityException -> 0x00bc }
            X.2hj r2 = r0.A00     // Catch:{ SecurityException -> 0x00bc }
            java.lang.String r1 = "wa_android_wfs_native_auth"
            X.Am3 r0 = new X.Am3     // Catch:{ SecurityException -> 0x00bc }
            r0.<init>()     // Catch:{ SecurityException -> 0x00bc }
            X.A1J r5 = r2.A00(r1, r0, r4)     // Catch:{ SecurityException -> 0x00bc }
            boolean r0 = X.C196549vF.A00(r7)     // Catch:{ SecurityException -> 0x00bc }
            if (r0 != 0) goto L_0x0065
            X.0wS r2 = X.C18460wS.A00     // Catch:{ SecurityException -> 0x00bc }
        L_0x0033:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ SecurityException -> 0x00bc }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ SecurityException -> 0x00bc }
        L_0x003b:
            boolean r0 = r7.hasNext()     // Catch:{ SecurityException -> 0x00bc }
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r6 = r7.next()     // Catch:{ SecurityException -> 0x00bc }
            r0 = r6
            X.9oD r0 = (X.C192339oD) r0     // Catch:{ SecurityException -> 0x00bc }
            X.A0y r0 = r0.A01     // Catch:{ SecurityException -> 0x00bc }
            X.AiO r5 = r0.A02     // Catch:{ SecurityException -> 0x00bc }
            X.C18070vi.A0X(r5)     // Catch:{ SecurityException -> 0x00bc }
            java.lang.String r0 = r5.ssoEligibility     // Catch:{ SecurityException -> 0x00bc }
            java.lang.String r1 = "2"
            boolean r0 = X.C18070vi.A18(r0, r1)     // Catch:{ SecurityException -> 0x00bc }
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = r5.ntaEligibility     // Catch:{ SecurityException -> 0x00bc }
            boolean r0 = X.C18070vi.A18(r0, r1)     // Catch:{ SecurityException -> 0x00bc }
            if (r0 != 0) goto L_0x003b
        L_0x0061:
            r8.add(r6)     // Catch:{ SecurityException -> 0x00bc }
            goto L_0x003b
        L_0x0065:
            boolean r0 = X.C23061Ej.A02()     // Catch:{ SecurityException -> 0x00bc }
            if (r0 != 0) goto L_0x0090
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ SecurityException -> 0x00bc }
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ SecurityException -> 0x00bc }
            X.Bzv r0 = X.C24360Bzv.FACEBOOK     // Catch:{ SecurityException -> 0x00bc }
            java.util.List r0 = r5.A02(r1, r0)     // Catch:{ SecurityException -> 0x00bc }
            X.C18070vi.A0X(r0)     // Catch:{ SecurityException -> 0x00bc }
            r2.addAll(r0)     // Catch:{ SecurityException -> 0x00bc }
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ SecurityException -> 0x00bc }
            X.Bzv r0 = X.C24360Bzv.FACEBOOK_DEBUG     // Catch:{ SecurityException -> 0x00bc }
            java.util.List r0 = r5.A02(r1, r0)     // Catch:{ SecurityException -> 0x00bc }
            X.C18070vi.A0X(r0)     // Catch:{ SecurityException -> 0x00bc }
            r2.addAll(r0)     // Catch:{ SecurityException -> 0x00bc }
            goto L_0x0033
        L_0x0090:
            android.content.Context r2 = r7.getApplicationContext()     // Catch:{ SecurityException -> 0x00bc }
            r0 = 2
            X.Bzv[] r1 = new X.C24360Bzv[r0]     // Catch:{ SecurityException -> 0x00bc }
            X.Bzv r0 = X.C24360Bzv.FACEBOOK     // Catch:{ SecurityException -> 0x00bc }
            r1[r6] = r0     // Catch:{ SecurityException -> 0x00bc }
            X.Bzv r0 = X.C24360Bzv.FACEBOOK_DEBUG     // Catch:{ SecurityException -> 0x00bc }
            r1[r4] = r0     // Catch:{ SecurityException -> 0x00bc }
            java.util.Set r0 = X.C200410p.A0S(r1)     // Catch:{ SecurityException -> 0x00bc }
            java.util.List r2 = r5.A01(r2, r0)     // Catch:{ SecurityException -> 0x00bc }
            X.C18070vi.A0X(r2)     // Catch:{ SecurityException -> 0x00bc }
            goto L_0x0033
        L_0x00ab:
            boolean r0 = X.AnonymousClass000.A1a(r8)     // Catch:{ SecurityException -> 0x00bc }
            if (r0 == 0) goto L_0x00ca
            X.5bm r0 = r9.$resultChannel     // Catch:{ SecurityException -> 0x00bc }
            r9.label = r4     // Catch:{ SecurityException -> 0x00bc }
            java.lang.Object r0 = r0.CHH(r2, r9)     // Catch:{ SecurityException -> 0x00bc }
            if (r0 != r3) goto L_0x00ca
            return r3
        L_0x00bc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WfsNativeAuthManager/getSsoListForFb security error:"
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            X.C31081ez.A01(r0)
        L_0x00ca:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fbJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2$fbJob$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
