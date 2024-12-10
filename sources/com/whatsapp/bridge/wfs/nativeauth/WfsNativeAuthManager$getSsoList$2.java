package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2", f = "WfsNativeAuthManager.kt", i = {0, 0, 0, 0}, l = {334}, m = "invokeSuspend", n = {"$this$withContext", "resultChannel", "jobs", "results"}, s = {"L$0", "L$1", "L$2", "L$3"})
public final class WfsNativeAuthManager$getSsoList$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass1OX $coroutineScope;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ WfsNativeAuthManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2(Context context, WfsNativeAuthManager wfsNativeAuthManager, C30391dr r4, AnonymousClass1OX r5) {
        super(2, r4);
        this.$coroutineScope = r5;
        this.this$0 = wfsNativeAuthManager;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AnonymousClass1OX r3 = this.$coroutineScope;
        WfsNativeAuthManager$getSsoList$2 wfsNativeAuthManager$getSsoList$2 = new WfsNativeAuthManager$getSsoList$2(this.$context, this.this$0, r6, r3);
        wfsNativeAuthManager$getSsoList$2.L$0 = obj;
        return wfsNativeAuthManager$getSsoList$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
        r0 = X.C27175DXk.A05;
        r2 = new X.C27175DXk(getContext());
        r2.A05(new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$2$1((X.C30391dr) null, r6), r4.BVj());
        r14.L$0 = r3;
        r14.L$1 = r4;
        r14.L$2 = r5;
        r14.L$3 = r6;
        r14.label = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        if (X.C27175DXk.A03(r14, r2) != r9) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r6.element != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r14.label
            r8 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0035
            if (r0 != r8) goto L_0x00d8
            java.lang.Object r6 = r14.L$3
            X.4rF r6 = (X.C98494rF) r6
            java.lang.Object r5 = r14.L$2
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r14.L$1
            X.5bm r4 = (X.C108485bm) r4
            java.lang.Object r3 = r14.L$0
            X.1OX r3 = (X.AnonymousClass1OX) r3
            X.C30691eM.A01(r15)
        L_0x001d:
            java.lang.Object r0 = r6.element
            if (r0 == 0) goto L_0x007f
        L_0x0021:
            java.util.Iterator r1 = r5.iterator()
        L_0x0025:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r1.next()
            X.1OB r0 = (X.AnonymousClass1OB) r0
            r0.BEM(r7)
            goto L_0x0025
        L_0x0035:
            X.C30691eM.A01(r15)
            java.lang.Object r3 = r14.L$0
            X.1OX r3 = (X.AnonymousClass1OX) r3
            r10 = 0
            X.DXn r4 = new X.DXn
            r4.<init>(r10)
            X.1OX r5 = r14.$coroutineScope
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager r2 = r14.this$0
            android.content.Context r1 = r14.$context
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fbJob$1 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fbJob$1
            r0.<init>(r1, r2, r7, r4)
            r11 = 3
            X.1OR r12 = X.AnonymousClass1OR.A00
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            X.1e4 r6 = X.C30451dy.A02(r2, r12, r0, r5)
            X.1OX r13 = r14.$coroutineScope
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager r5 = r14.this$0
            android.content.Context r1 = r14.$context
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$igJob$1 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$igJob$1
            r0.<init>(r1, r5, r7, r4)
            X.1e4 r5 = X.C30451dy.A02(r2, r12, r0, r13)
            X.1OX r1 = r14.$coroutineScope
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fallbackJob$1 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fallbackJob$1
            r0.<init>(r7, r6, r5, r4)
            X.1e4 r2 = X.C30451dy.A02(r2, r12, r0, r1)
            X.1OB[] r1 = new X.AnonymousClass1OB[r11]
            r1[r10] = r6
            r1[r8] = r5
            r0 = 2
            java.util.List r5 = X.C18070vi.A0O(r2, r1, r0)
            X.4rF r6 = X.C98494rF.A00()
        L_0x007f:
            boolean r0 = X.AnonymousClass1OW.A05(r3)
            if (r0 == 0) goto L_0x0021
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0090
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0090
            goto L_0x0021
        L_0x0090:
            java.util.Iterator r1 = r5.iterator()
        L_0x0094:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.1OB r0 = (X.AnonymousClass1OB) r0
            boolean r0 = r0.Be2()
            if (r0 == 0) goto L_0x0094
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C27175DXk.A05
            X.0wh r0 = r14.getContext()
            X.DXk r2 = new X.DXk
            r2.<init>(r0)
            X.CQk r1 = r4.BVj()
            com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$2$1 r0 = new com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$2$1
            r0.<init>(r7, r6)
            r2.A05(r0, r1)
            r14.L$0 = r3
            r14.L$1 = r4
            r14.L$2 = r5
            r14.L$3 = r6
            r14.label = r8
            java.lang.Object r0 = X.C27175DXk.A03(r14, r2)
            if (r0 != r9) goto L_0x001d
            return r9
        L_0x00ce:
            r4.BF8(r7)
            java.lang.Object r0 = r6.element
            if (r0 != 0) goto L_0x00d7
            X.0wS r0 = X.C18460wS.A00
        L_0x00d7:
            return r0
        L_0x00d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
