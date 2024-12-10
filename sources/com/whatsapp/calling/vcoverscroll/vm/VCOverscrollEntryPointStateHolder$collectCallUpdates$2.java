package com.whatsapp.calling.vcoverscroll.vm;

import X.AnonymousClass1EC;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder$collectCallUpdates$2", f = "VCOverscrollEntryPointStateHolder.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
public final class VCOverscrollEntryPointStateHolder$collectCallUpdates$2 extends C30431dv implements C36001nB {
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ VCOverscrollEntryPointStateHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCOverscrollEntryPointStateHolder$collectCallUpdates$2(VCOverscrollEntryPointStateHolder vCOverscrollEntryPointStateHolder, AnonymousClass1EC r3, C30391dr r4) {
        super(3, r4);
        this.this$0 = vCOverscrollEntryPointStateHolder;
        this.$groupJid = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        VCOverscrollEntryPointStateHolder$collectCallUpdates$2 vCOverscrollEntryPointStateHolder$collectCallUpdates$2 = new VCOverscrollEntryPointStateHolder$collectCallUpdates$2(this.this$0, this.$groupJid, (C30391dr) obj3);
        vCOverscrollEntryPointStateHolder$collectCallUpdates$2.L$0 = obj;
        vCOverscrollEntryPointStateHolder$collectCallUpdates$2.L$1 = obj2;
        return vCOverscrollEntryPointStateHolder$collectCallUpdates$2.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r6.A0B != com.whatsapp.voipcalling.CallState.NONE) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 != r3) goto L_0x0098
            X.C30691eM.A01(r10)
        L_0x000d:
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r1 = r9.this$0
            r0 = 0
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder.A00(r1, r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0016:
            X.C30691eM.A01(r10)
            java.lang.Object r8 = r9.L$0
            X.9Bw r8 = (X.C178119Bw) r8
            java.lang.Object r6 = r9.L$1
            X.4Sa r6 = (X.C86534Sa) r6
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r2 = r9.this$0
            X.00H r0 = r2.A0R
            java.lang.Object r1 = r0.get()
            X.4QQ r1 = (X.AnonymousClass4QQ) r1
            X.1EC r0 = r9.$groupJid
            boolean r0 = r1.A00(r6, r0, r8)
            if (r0 == 0) goto L_0x0095
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
        L_0x0035:
            r2.A08 = r0
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r7 = r9.this$0
            X.1EC r1 = r9.$groupJid
            if (r1 == 0) goto L_0x004b
            if (r8 == 0) goto L_0x004b
            com.whatsapp.jid.GroupJid r0 = r8.A0C
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004b
            X.2Q4 r0 = r8.A0E
            if (r0 != 0) goto L_0x0052
        L_0x004b:
            com.whatsapp.voipcalling.CallState r2 = r6.A0B
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            r0 = 0
            if (r2 == r1) goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            r7.A0D = r0
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r2 = r9.this$0
            r9.L$0 = r5
            r9.label = r3
            com.whatsapp.voipcalling.CallState r1 = r6.A0B
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 != r0) goto L_0x000d
            int r1 = r6.A02
            r0 = 3
            if (r1 != r0) goto L_0x000d
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x000d
            X.00H r0 = r2.A0J
            java.lang.Object r0 = r0.get()
            X.0ve r0 = (X.C18030ve) r0
            boolean r0 = X.C40811vJ.A0U(r0)
            if (r0 != 0) goto L_0x000d
            r2.A09 = r3
            X.4Lc r3 = r2.A0H
            java.lang.String r2 = r6.A0C
            X.C18070vi.A0W(r2)
            X.1IT r1 = X.C23761Hn.A00()
            com.whatsapp.coroutine.sideeffect.MainThreadSingleSideEffect$send$2 r0 = new com.whatsapp.coroutine.sideeffect.MainThreadSingleSideEffect$send$2
            r0.<init>(r3, r2, r5)
            java.lang.Object r0 = X.C30451dy.A00(r9, r1, r0)
            java.lang.Object r0 = X.AnonymousClass3MX.A13(r0)
            if (r0 != r4) goto L_0x000d
            return r4
        L_0x0095:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0035
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder$collectCallUpdates$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
