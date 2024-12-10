package com.whatsapp.interopui.notification;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.notification.InteropNotifOptInViewModel$onSave$1", f = "InteropNotifOptInViewModel.kt", i = {}, l = {93, 95, 96, 97, 100, 101, 102, 105}, m = "invokeSuspend", n = {}, s = {})
public final class InteropNotifOptInViewModel$onSave$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $integrators;
    public final /* synthetic */ boolean $isEnabled;
    public final /* synthetic */ List $selectedIntegratorIds;
    public int label;
    public final /* synthetic */ InteropNotifOptInViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropNotifOptInViewModel$onSave$1(InteropNotifOptInViewModel interopNotifOptInViewModel, List list, List list2, C30391dr r5, boolean z) {
        super(2, r5);
        this.this$0 = interopNotifOptInViewModel;
        this.$isEnabled = z;
        this.$selectedIntegratorIds = list;
        this.$integrators = list2;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new InteropNotifOptInViewModel$onSave$1(this.this$0, this.$selectedIntegratorIds, this.$integrators, r8, this.$isEnabled);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if ((r13 instanceof X.C96544o1) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r3 = r12.this$0.A03;
        r12.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r3.BJt(true, r12) != r2) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        r3 = r12.this$0.A04;
        r1 = r12.$integrators;
        r12.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r3.BJt(r1, r12) != r2) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (X.C18070vi.A18(r13, X.C96554o2.A00) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        r3 = r12.this$0.A03;
        r1 = X.AnonymousClass000.A0h();
        r12.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r3.BJt(r1, r12) != r2) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        r3 = r12.this$0.A04;
        r1 = r12.$integrators;
        r12.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        if (r3.BJt(r1, r12) != r2) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        r4 = r12.this$0.A01;
        r3 = new X.C88314Ze(X.AnonymousClass00R.A0N, (java.lang.Long) null, (java.lang.Object) null);
        r0 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        if ((r13 instanceof X.C96564o3) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r4 = r12.this$0.A01;
        r3 = X.C88314Ze.A00(810);
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d1, code lost:
        r4 = r12.this$0.A01;
        r3 = new X.C88314Ze(X.AnonymousClass00R.A0N, (java.lang.Long) null, (java.lang.Object) null);
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00de, code lost:
        r12.label = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e4, code lost:
        if (r4.CHH(r3, r12) != r2) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e6, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        throw X.AnonymousClass3MW.A14();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r4 = 1
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0053;
                case 2: goto L_0x006c;
                case 3: goto L_0x00ce;
                case 4: goto L_0x00e7;
                case 5: goto L_0x0099;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00e7;
                case 8: goto L_0x00e7;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x000d:
            X.C30691eM.A01(r13)
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r12.this$0
            X.00H r0 = r0.A00
            java.lang.Object r6 = r0.get()
            X.1kr r6 = (X.C34651kr) r6
            boolean r11 = r12.$isEnabled
            java.util.List r9 = r12.$selectedIntegratorIds
            r12.label = r4
            if (r11 == 0) goto L_0x0040
            java.lang.String r7 = "true"
            java.util.ArrayList r8 = X.C29351c6.A0D(r9)
            java.util.Iterator r5 = r9.iterator()
        L_0x002c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0044
            int r0 = X.C72453Mb.A0H(r5)
            long r0 = (long) r0
            X.9Ed r3 = new X.9Ed
            r3.<init>((long) r0)
            r8.add(r3)
            goto L_0x002c
        L_0x0040:
            java.lang.String r7 = "false"
            X.0wS r8 = X.C18460wS.A00
        L_0x0044:
            X.0wl r0 = r6.A04
            r10 = 0
            com.whatsapp.interop.integrator.IntegratorManager$setReachabilitySettings$2 r5 = new com.whatsapp.interop.integrator.IntegratorManager$setReachabilitySettings$2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = X.C30451dy.A00(r12, r0, r5)
            if (r13 != r2) goto L_0x0056
            return r2
        L_0x0053:
            X.C30691eM.A01(r13)
        L_0x0056:
            boolean r0 = r13 instanceof X.C96544o1
            if (r0 == 0) goto L_0x007f
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r12.this$0
            X.1G4 r3 = r0.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0 = 2
            r12.label = r0
            java.lang.Object r0 = r3.BJt(r1, r12)
            if (r0 != r2) goto L_0x006f
            return r2
        L_0x006c:
            X.C30691eM.A01(r13)
        L_0x006f:
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r12.this$0
            X.1G4 r3 = r0.A04
            java.util.List r1 = r12.$integrators
            r0 = 3
            r12.label = r0
            java.lang.Object r0 = r3.BJt(r1, r12)
            if (r0 != r2) goto L_0x00d1
            return r2
        L_0x007f:
            X.4o2 r0 = X.C96554o2.A00
            boolean r0 = X.C18070vi.A18(r13, r0)
            if (r0 == 0) goto L_0x00bd
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r12.this$0
            X.1G4 r3 = r0.A03
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            r0 = 5
            r12.label = r0
            java.lang.Object r0 = r3.BJt(r1, r12)
            if (r0 != r2) goto L_0x009c
            return r2
        L_0x0099:
            X.C30691eM.A01(r13)
        L_0x009c:
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r12.this$0
            X.1G4 r3 = r0.A04
            java.util.List r1 = r12.$integrators
            r0 = 6
            r12.label = r0
            java.lang.Object r0 = r3.BJt(r1, r12)
            if (r0 != r2) goto L_0x00af
            return r2
        L_0x00ac:
            X.C30691eM.A01(r13)
        L_0x00af:
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r12.this$0
            X.5bm r4 = r0.A01
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            r0 = 0
            X.4Ze r3 = new X.4Ze
            r3.<init>(r1, r0, r0)
            r0 = 7
            goto L_0x00de
        L_0x00bd:
            boolean r0 = r13 instanceof X.C96564o3
            if (r0 == 0) goto L_0x00ed
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r12.this$0
            X.5bm r4 = r0.A01
            r0 = 810(0x32a, double:4.0E-321)
            X.4Ze r3 = X.C88314Ze.A00(r0)
            r0 = 8
            goto L_0x00de
        L_0x00ce:
            X.C30691eM.A01(r13)
        L_0x00d1:
            com.whatsapp.interopui.notification.InteropNotifOptInViewModel r0 = r12.this$0
            X.5bm r4 = r0.A01
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            r0 = 0
            X.4Ze r3 = new X.4Ze
            r3.<init>(r1, r0, r0)
            r0 = 4
        L_0x00de:
            r12.label = r0
            java.lang.Object r0 = r4.CHH(r3, r12)
            if (r0 != r2) goto L_0x00ea
            return r2
        L_0x00e7:
            X.C30691eM.A01(r13)
        L_0x00ea:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00ed:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.notification.InteropNotifOptInViewModel$onSave$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropNotifOptInViewModel$onSave$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
