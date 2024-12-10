package com.whatsapp.companiondevice.crscv2;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$launchTimeoutJob$1", f = "CompanionRegOverSideChannelV2Manager.kt", i = {1}, l = {290, 335}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
public final class CompanionRegOverSideChannelV2Manager$launchTimeoutJob$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ CompanionRegOverSideChannelV2Manager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompanionRegOverSideChannelV2Manager$launchTimeoutJob$1(CompanionRegOverSideChannelV2Manager companionRegOverSideChannelV2Manager, C30391dr r3) {
        super(2, r3);
        this.this$0 = companionRegOverSideChannelV2Manager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CompanionRegOverSideChannelV2Manager$launchTimeoutJob$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CompanionRegOverSideChannelV2Manager$launchTimeoutJob$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[Catch:{ all -> 0x0061 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 0
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x001e
            if (r0 == r2) goto L_0x002c
            if (r0 != r4) goto L_0x0019
            java.lang.Object r2 = r6.L$1
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r2 = (com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager) r2
            java.lang.Object r1 = r6.L$0
            X.1n2 r1 = (X.C35911n2) r1
            X.C30691eM.A01(r7)
            goto L_0x0040
        L_0x0019:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001e:
            X.C30691eM.A01(r7)
            long r0 = X.C50612Vc.A00
            r6.label = r2
            java.lang.Object r0 = X.C62882s9.A01(r6, r0)
            if (r0 != r5) goto L_0x002f
            return r5
        L_0x002c:
            X.C30691eM.A01(r7)
        L_0x002f:
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r2 = r6.this$0
            X.1n2 r1 = r2.A07
            r6.L$0 = r1
            r6.L$1 = r2
            r6.label = r4
            java.lang.Object r0 = r1.Bhx(r6)
            if (r0 != r5) goto L_0x0040
            return r5
        L_0x0040:
            X.1nD r0 = r2.A00     // Catch:{ all -> 0x0061 }
            boolean r0 = r0 instanceof X.C36031nE     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/launchTimeoutJob/no registration in progress"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0061 }
        L_0x004b:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0061 }
            goto L_0x005d
        L_0x004e:
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/launchTimeoutJob/timeout expired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0061 }
            r0 = 8
            X.C17890vO.A0q(r2, r0)     // Catch:{ all -> 0x0061 }
            X.1nE r0 = X.C36031nE.A00     // Catch:{ all -> 0x0061 }
            r2.A00 = r0     // Catch:{ all -> 0x0061 }
            goto L_0x004b
        L_0x005d:
            r1.CQ9(r3)
            return r0
        L_0x0061:
            r0 = move-exception
            r1.CQ9(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$launchTimeoutJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
