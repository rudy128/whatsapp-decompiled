package com.whatsapp.interopui.notification;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.notification.InteropNotifOptInViewModel$loadSetting$1", f = "InteropNotifOptInViewModel.kt", i = {1, 2, 2}, l = {42, 44, 46, 47, 51}, m = "invokeSuspend", n = {"allIntegrators", "allIntegrators", "reachabilitySetting"}, s = {"L$0", "L$0", "L$1"})
public final class InteropNotifOptInViewModel$loadSetting$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ InteropNotifOptInViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropNotifOptInViewModel$loadSetting$1(InteropNotifOptInViewModel interopNotifOptInViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = interopNotifOptInViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InteropNotifOptInViewModel$loadSetting$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InteropNotifOptInViewModel$loadSetting$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (r12 == r5) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca A[LOOP:1: B:34:0x00c4->B:36:0x00ca, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0100 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r3 = 5
            r8 = 4
            r4 = 3
            r9 = 2
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 == r7) goto L_0x004c
            if (r0 == r9) goto L_0x0027
            if (r0 == r4) goto L_0x001b
            if (r0 == r8) goto L_0x0117
            if (r0 == r3) goto L_0x0117
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001b:
            java.lang.Object r1 = r11.L$1
            X.5Y1 r1 = (X.AnonymousClass5Y1) r1
            java.lang.Object r2 = r11.L$0
            X.4Ej r2 = (X.C83244Ej) r2
            X.C30691eM.A01(r12)
            goto L_0x008d
        L_0x0027:
            java.lang.Object r2 = r11.L$0
            X.4Ej r2 = (X.C83244Ej) r2
            X.C30691eM.A01(r12)
            goto L_0x0072
        L_0x002f:
            X.C30691eM.A01(r12)
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r11.this$0
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            X.1kr r2 = (X.C34651kr) r2
            r11.label = r7
            X.0wl r1 = r2.A04
            com.whatsapp.interop.integrator.IntegratorManager$refreshIntegrators$2 r0 = new com.whatsapp.interop.integrator.IntegratorManager$refreshIntegrators$2
            r0.<init>(r2, r6)
            java.lang.Object r12 = X.C30451dy.A00(r11, r1, r0)
            if (r12 != r5) goto L_0x004f
        L_0x004b:
            return r5
        L_0x004c:
            X.C30691eM.A01(r12)
        L_0x004f:
            X.4Ej r12 = (X.C83244Ej) r12
            boolean r0 = r12 instanceof X.AnonymousClass423
            if (r0 == 0) goto L_0x010a
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r11.this$0
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            X.1kr r2 = (X.C34651kr) r2
            r11.L$0 = r12
            r11.label = r9
            X.0wl r1 = r2.A04
            com.whatsapp.interop.integrator.IntegratorManager$getReachabilitySettings$2 r0 = new com.whatsapp.interop.integrator.IntegratorManager$getReachabilitySettings$2
            r0.<init>(r2, r6)
            java.lang.Object r0 = X.C30451dy.A00(r11, r1, r0)
            if (r0 == r5) goto L_0x004b
            r2 = r12
            r12 = r0
        L_0x0072:
            X.5Y1 r12 = (X.AnonymousClass5Y1) r12
            boolean r0 = r12 instanceof X.C96544o1
            if (r0 == 0) goto L_0x00ea
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r11.this$0
            X.1G4 r1 = r0.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r11.L$0 = r2
            r11.L$1 = r12
            r11.label = r4
            java.lang.Object r0 = r1.BJt(r0, r11)
            if (r0 == r5) goto L_0x004b
            r1 = r12
        L_0x008d:
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r11.this$0
            X.1G4 r9 = r0.A04
            X.423 r2 = (X.AnonymousClass423) r2
            java.util.List r0 = r2.A00
            X.4o1 r1 = (X.C96544o1) r1
            java.util.List r7 = r1.A00
            java.util.ArrayList r10 = X.C72463Mc.A0s(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00a1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.4ca r0 = (X.C89514ca) r0
            java.lang.Integer r1 = r0.A02
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x00b8
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x00a1
        L_0x00b8:
            r10.add(r2)
            goto L_0x00a1
        L_0x00bc:
            java.util.ArrayList r4 = X.C29351c6.A0D(r10)
            java.util.Iterator r3 = r10.iterator()
        L_0x00c4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r2 = r3.next()
            X.4ca r2 = (X.C89514ca) r2
            int r0 = r2.A00
            boolean r1 = X.AnonymousClass3Ma.A1b(r7, r0)
            X.4Tl r0 = new X.4Tl
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x00c4
        L_0x00df:
            r11.L$0 = r6
            r11.L$1 = r6
            r11.label = r8
            java.lang.Object r0 = r9.BJt(r4, r11)
            goto L_0x00fe
        L_0x00ea:
            boolean r0 = r12 instanceof X.C96554o2
            if (r0 == 0) goto L_0x0101
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r11.this$0
            X.1G4 r1 = r0.A03
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r11.L$0 = r6
            r11.label = r3
            java.lang.Object r0 = r1.BJt(r0, r11)
        L_0x00fe:
            if (r0 != r5) goto L_0x011a
            return r5
        L_0x0101:
            boolean r0 = r12 instanceof X.C96564o3
            if (r0 != 0) goto L_0x011a
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x010a:
            boolean r0 = r12 instanceof X.AnonymousClass422
            if (r0 != 0) goto L_0x011a
            boolean r0 = r12 instanceof X.AnonymousClass424
            if (r0 != 0) goto L_0x011a
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0117:
            X.C30691eM.A01(r12)
        L_0x011a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.notification.InteropNotifOptInViewModel$loadSetting$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
