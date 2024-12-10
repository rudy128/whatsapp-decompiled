package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass1OS;
import X.C129986ih;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1", f = "ScreenSharePeerTransitionStateProvider.kt", i = {}, l = {42, 43}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ C129986ih this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1(C129986ih r2, UserJid userJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$userJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1(this.this$0, this.$userJid, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r7.label
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x0020
            if (r1 != r5) goto L_0x0038
            X.C30691eM.A01(r8)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r8)
            r7.label = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C62882s9.A00(r7, r0)
            if (r0 != r6) goto L_0x0023
            return r6
        L_0x0020:
            X.C30691eM.A01(r8)
        L_0x0023:
            X.6ih r4 = r7.this$0
            X.0wl r3 = r4.A05
            com.whatsapp.jid.UserJid r2 = r7.$userJid
            r1 = 0
            com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1$1 r0 = new com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1$1
            r0.<init>(r2, r1)
            r7.label = r5
            java.lang.Object r0 = X.C30451dy.A00(r7, r3, r0)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0038:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
