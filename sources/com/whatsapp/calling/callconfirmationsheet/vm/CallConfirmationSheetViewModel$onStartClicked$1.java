package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onStartClicked$1", f = "CallConfirmationSheetViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class CallConfirmationSheetViewModel$onStartClicked$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isSecondaryButton;
    public int label;
    public final /* synthetic */ CallConfirmationSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallConfirmationSheetViewModel$onStartClicked$1(Context context, CallConfirmationSheetViewModel callConfirmationSheetViewModel, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = callConfirmationSheetViewModel;
        this.$isSecondaryButton = z;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new CallConfirmationSheetViewModel$onStartClicked$1(this.$context, this.this$0, r6, this.$isSecondaryButton);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        if (r4 == X.AnonymousClass4Cl.Video) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0130, code lost:
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r5 == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            r1 = r18
            int r3 = r1.label
            r0 = 1
            if (r3 == 0) goto L_0x0011
            if (r3 != r0) goto L_0x0134
            X.C30691eM.A01(r19)
        L_0x000e:
            X.1Wu r2 = X.C27621Wu.A00
            return r2
        L_0x0011:
            X.C30691eM.A01(r19)
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = r1.this$0
            boolean r5 = r1.$isSecondaryButton
            X.0vl r4 = r3.A0C
            java.lang.Object r3 = r4.getValue()
            X.4VY r3 = (X.AnonymousClass4VY) r3
            boolean r3 = r3.A07()
            r17 = 1
            if (r3 == 0) goto L_0x010e
            if (r5 != 0) goto L_0x0130
        L_0x002a:
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r4 = r1.this$0
            X.1EC r3 = r4.A09
            r8 = 0
            if (r3 == 0) goto L_0x004b
            X.0vl r3 = r4.A0E
            boolean r3 = r3.Bf6()
            if (r3 == 0) goto L_0x00e0
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = r1.this$0
            X.4US r3 = com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel.A00(r3)
            java.util.Collection r3 = r3.A00()
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x00e0
        L_0x004b:
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = r1.this$0
            X.4US r3 = com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel.A00(r3)
            java.util.Collection r3 = r3.A00()
            java.util.List r3 = X.C29431cG.A0t(r3)
            X.1D6 r3 = X.AnonymousClass1D6.A01(r3, r8)
        L_0x005d:
            java.lang.Object r15 = r3.first
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r14 = r3.second
            X.1EC r14 = (X.AnonymousClass1EC) r14
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = r1.this$0
            int r3 = r3.A01
            boolean r3 = X.C83614Fz.A00(r3)
            if (r3 == 0) goto L_0x00c0
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r5 = r1.this$0
            X.1VP r4 = r5.A05
            r3 = 15
            java.lang.Integer r10 = X.AnonymousClass3MW.A0v(r3)
            java.lang.Integer r11 = com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel.A03(r5)
            int r3 = r15.size()
            int r3 = r3 + 1
            java.lang.Integer r12 = X.AnonymousClass3MW.A0v(r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r17)
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = r1.this$0
            X.0vl r3 = r3.A0C
            java.lang.Object r3 = r3.getValue()
            X.4VY r3 = (X.AnonymousClass4VY) r3
            boolean r3 = r3.A07()
            if (r3 != 0) goto L_0x009c
            r9 = r8
        L_0x009c:
            r13 = 4
            X.1VQ r4 = (X.AnonymousClass1VQ) r4
            X.00H r3 = r4.A0Q
            java.lang.Object r7 = r3.get()
            X.9sP r7 = (X.C194859sP) r7
            r7.A01(r8, r9, r10, r11, r12, r13)
        L_0x00aa:
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r13 = r1.this$0
            X.0wl r3 = r13.A0G
            android.content.Context r12 = r1.$context
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onStartClicked$1$2 r11 = new com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onStartClicked$1$2
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1.label = r0
            java.lang.Object r0 = X.C30451dy.A00(r1, r3, r11)
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x00c0:
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = r1.this$0
            int r4 = r3.A01
            java.util.List r3 = X.C83604Fy.A00()
            boolean r3 = X.AnonymousClass3Ma.A1b(r3, r4)
            if (r3 == 0) goto L_0x00aa
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = r1.this$0
            X.1VP r5 = r3.A05
            r3 = 15
            java.lang.Integer r4 = X.AnonymousClass3MW.A0v(r3)
            r3 = 2
            if (r17 == 0) goto L_0x00dc
            r3 = 3
        L_0x00dc:
            r5.BiW(r3, r4)
            goto L_0x00aa
        L_0x00e0:
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r5 = r1.this$0
            X.1EC r7 = r5.A09
            X.1MZ r4 = r5.A07
            X.11S r3 = r5.A02
            X.1M9 r6 = r5.A06
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.ArrayList r3 = X.C63982u1.A03(r3, r4, r7)
            java.util.Iterator r4 = r3.iterator()
        L_0x00f6:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0104
            X.1BI r3 = X.C17880vN.A0Q(r4)
            X.AnonymousClass3MY.A1O(r6, r3, r5)
            goto L_0x00f6
        L_0x0104:
            com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel r3 = r1.this$0
            X.1EC r3 = r3.A09
            X.1D6 r3 = X.AnonymousClass1D6.A01(r5, r3)
            goto L_0x005d
        L_0x010e:
            java.lang.Object r4 = r4.getValue()
            X.4VY r4 = (X.AnonymousClass4VY) r4
            boolean r3 = r4 instanceof X.C75953mC
            if (r3 == 0) goto L_0x0122
            X.3mC r4 = (X.C75953mC) r4
            X.4Cl r4 = r4.A02
        L_0x011c:
            X.4Cl r3 = X.AnonymousClass4Cl.Video
            if (r4 != r3) goto L_0x0130
            goto L_0x002a
        L_0x0122:
            boolean r3 = r4 instanceof X.C75933mA
            if (r3 == 0) goto L_0x012b
            X.3mA r4 = (X.C75933mA) r4
            X.4Cl r4 = r4.A00
            goto L_0x011c
        L_0x012b:
            X.3mB r4 = (X.C75943mB) r4
            X.4Cl r4 = r4.A01
            goto L_0x011c
        L_0x0130:
            r17 = 0
            goto L_0x002a
        L_0x0134:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onStartClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallConfirmationSheetViewModel$onStartClicked$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
