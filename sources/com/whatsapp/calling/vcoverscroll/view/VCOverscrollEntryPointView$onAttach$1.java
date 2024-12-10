package com.whatsapp.calling.vcoverscroll.view;

import X.AnonymousClass1EC;
import X.AnonymousClass1F9;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$onAttach$1", f = "VCOverscrollEntryPointView.kt", i = {}, l = {305, 306}, m = "invokeSuspend", n = {}, s = {})
public final class VCOverscrollEntryPointView$onAttach$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ AnonymousClass1F9 $lifecycleOwner;
    public int label;
    public final /* synthetic */ VCOverscrollEntryPointView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VCOverscrollEntryPointView$onAttach$1(AnonymousClass1F9 r2, VCOverscrollEntryPointView vCOverscrollEntryPointView, AnonymousClass1EC r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = vCOverscrollEntryPointView;
        this.$lifecycleOwner = r2;
        this.$groupJid = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new VCOverscrollEntryPointView$onAttach$1(this.$lifecycleOwner, this.this$0, this.$groupJid, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x004c
            if (r0 != r7) goto L_0x0066
            X.C30691eM.A01(r9)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r9)
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r3 = r8.this$0
            r8.label = r1
            X.00H r0 = r3.getSystemServices()
            java.lang.Object r0 = r0.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            android.view.accessibility.AccessibilityManager r0 = r0.A0M()
            boolean r0 = X.AnonymousClass1Y5.A0D(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "VCOverscrollEntryPointView/ adding a11y footer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r0 = r3.getStateHolder()
            r0.A0E = r1
            X.0wl r2 = r3.getMainDispatcher()
            r1 = 0
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$checkAndAddA11yFooter$2 r0 = new com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$checkAndAddA11yFooter$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = X.C30451dy.A00(r8, r2, r0)
        L_0x0046:
            if (r0 != r6) goto L_0x004f
            return r6
        L_0x0049:
            X.1Wu r0 = X.C27621Wu.A00
            goto L_0x0046
        L_0x004c:
            X.C30691eM.A01(r9)
        L_0x004f:
            X.1F9 r5 = r8.$lifecycleOwner
            X.1Fx r4 = X.C23401Fx.STARTED
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r3 = r8.this$0
            X.1EC r2 = r8.$groupJid
            r1 = 0
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$onAttach$1$1 r0 = new com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$onAttach$1$1
            r0.<init>(r2, r1)
            r8.label = r7
            java.lang.Object r0 = X.C87334Ve.A01(r4, r5, r8, r0)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0066:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VCOverscrollEntryPointView$onAttach$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
