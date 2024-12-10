package com.whatsapp.interopui.optin;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel$optInIntegrator$1", f = "InteropOptInSelectIntegratorsViewModel.kt", i = {0, 1, 2, 3}, l = {105, 107, 109, 120, 125}, m = "invokeSuspend", n = {"startTimeMillis", "startTimeMillis", "optInResult", "optInResult"}, s = {"J$0", "J$0", "L$0", "L$0"})
public final class InteropOptInSelectIntegratorsViewModel$optInIntegrator$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $selectedIntegratorIds;
    public final /* synthetic */ List $selectedItems;
    public long J$0;
    public Object L$0;
    public int label;
    public final /* synthetic */ InteropOptInSelectIntegratorsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropOptInSelectIntegratorsViewModel$optInIntegrator$1(InteropOptInSelectIntegratorsViewModel interopOptInSelectIntegratorsViewModel, List list, List list2, C30391dr r5) {
        super(2, r5);
        this.this$0 = interopOptInSelectIntegratorsViewModel;
        this.$selectedIntegratorIds = list;
        this.$selectedItems = list2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new InteropOptInSelectIntegratorsViewModel$optInIntegrator$1(this.this$0, this.$selectedIntegratorIds, this.$selectedItems, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[LOOP:0: B:27:0x009d->B:29:0x00a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf A[LOOP:1: B:31:0x00b9->B:33:0x00bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0 A[LOOP:2: B:35:0x00da->B:37:0x00e0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r11.label
            r8 = 5
            r9 = 4
            r10 = 3
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r0) goto L_0x004d
            if (r1 == r5) goto L_0x0071
            if (r1 == r10) goto L_0x0031
            if (r1 == r9) goto L_0x0028
            if (r1 != r8) goto L_0x0137
            X.C30691eM.A01(r12)
        L_0x0018:
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = r11.this$0
            X.1DT r3 = r0.A07
            r0 = 810(0x32a, double:4.0E-321)
        L_0x001e:
            X.4Ze r2 = X.C88314Ze.A00(r0)
        L_0x0022:
            r3.A0E(r2)
            X.1Wu r4 = X.C27621Wu.A00
        L_0x0027:
            return r4
        L_0x0028:
            java.lang.Object r1 = r11.L$0
            X.4Ek r1 = (X.C83254Ek) r1
            X.C30691eM.A01(r12)
            goto L_0x011e
        L_0x0031:
            java.lang.Object r0 = r11.L$0
            X.4Ek r0 = (X.C83254Ek) r0
            X.C30691eM.A01(r12)
            goto L_0x0089
        L_0x0039:
            X.C30691eM.A01(r12)
            long r2 = java.lang.System.currentTimeMillis()
            r11.J$0 = r2
            r11.label = r0
            r0 = 2500(0x9c4, double:1.235E-320)
            java.lang.Object r0 = X.AnonymousClass4ZQ.A00(r11, r2, r0)
            if (r0 != r4) goto L_0x0052
            return r4
        L_0x004d:
            long r2 = r11.J$0
            X.C30691eM.A01(r12)
        L_0x0052:
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = r11.this$0
            X.00H r0 = r0.A09
            java.lang.Object r7 = r0.get()
            X.1kr r7 = (X.C34651kr) r7
            java.util.List r6 = r11.$selectedIntegratorIds
            r11.J$0 = r2
            r11.label = r5
            X.0wl r5 = r7.A04
            r1 = 0
            com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2 r0 = new com.whatsapp.interop.integrator.IntegratorManager$optInIntegrators$2
            r0.<init>(r7, r6, r1)
            java.lang.Object r12 = X.C30451dy.A00(r11, r5, r0)
            if (r12 != r4) goto L_0x0076
            return r4
        L_0x0071:
            long r2 = r11.J$0
            X.C30691eM.A01(r12)
        L_0x0076:
            X.4Ek r12 = (X.C83254Ek) r12
            boolean r0 = r12 instanceof X.AnonymousClass426
            if (r0 == 0) goto L_0x010d
            r11.L$0 = r12
            r11.label = r10
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.AnonymousClass4ZQ.A00(r11, r2, r0)
            if (r0 == r4) goto L_0x0027
            r0 = r12
        L_0x0089:
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r5 = r11.this$0
            java.util.List r2 = r11.$selectedItems
            X.426 r0 = (X.AnonymousClass426) r0
            java.util.List r3 = r0.A00
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.ArrayList r6 = X.C29351c6.A0E(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x009d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r1.next()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            int r0 = X.AnonymousClass3MZ.A04(r0)
            X.C17890vO.A1D(r6, r0)
            goto L_0x009d
        L_0x00b1:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4Tl r0 = (X.C86884Tl) r0
            X.4ca r0 = r0.A01
            int r0 = r0.A00
            boolean r0 = X.AnonymousClass3Ma.A1b(r6, r0)
            X.AnonymousClass3MZ.A1V(r1, r4, r0)
            goto L_0x00b9
        L_0x00d2:
            java.util.ArrayList r2 = X.C29351c6.A0E(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x00da:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r0 = r1.next()
            X.4Tl r0 = (X.C86884Tl) r0
            X.4ca r0 = r0.A01
            r2.add(r0)
            goto L_0x00da
        L_0x00ec:
            X.00H r0 = r5.A0D
            X.1jg r0 = X.AnonymousClass3MX.A0k(r0)
            r0.A02(r2)
            boolean r1 = r3.isEmpty()
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = r11.this$0
            X.1DT r3 = r0.A07
            if (r1 == 0) goto L_0x0109
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            r0 = 0
            X.4Ze r2 = new X.4Ze
            r2.<init>(r1, r0, r0)
            goto L_0x0022
        L_0x0109:
            r0 = 10
            goto L_0x001e
        L_0x010d:
            boolean r0 = r12 instanceof X.AnonymousClass425
            if (r0 == 0) goto L_0x0128
            r11.L$0 = r12
            r11.label = r9
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.AnonymousClass4ZQ.A00(r11, r2, r0)
            if (r0 == r4) goto L_0x0027
            r1 = r12
        L_0x011e:
            com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel r0 = r11.this$0
            X.1DT r3 = r0.A07
            X.425 r1 = (X.AnonymousClass425) r1
            long r0 = r1.A00
            goto L_0x001e
        L_0x0128:
            boolean r0 = r12 instanceof X.AnonymousClass427
            if (r0 == 0) goto L_0x013c
            r11.label = r8
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.AnonymousClass4ZQ.A00(r11, r2, r0)
            if (r0 != r4) goto L_0x0018
            return r4
        L_0x0137:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x013c:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsViewModel$optInIntegrator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropOptInSelectIntegratorsViewModel$optInIntegrator$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
