package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$retrieveContactInfo$1", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$retrieveContactInfo$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallLogActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$retrieveContactInfo$1(CallLogActivityViewModel callLogActivityViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogActivityViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallLogActivityViewModel$retrieveContactInfo$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallLogActivityViewModel$retrieveContactInfo$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0088, code lost:
        if (X.C63982u1.A07(r3.A02, r3.A0A, r3.A0B, r6, r3.A0D, r7) != false) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            r28 = this;
            r2 = r28
            int r0 = r2.label
            if (r0 != 0) goto L_0x0138
            X.C30691eM.A01(r29)
            X.1Dv r1 = X.AnonymousClass1BI.A00
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r2.this$0
            java.lang.String r0 = r0.A0O
            X.1BI r4 = r1.A02(r0)
            if (r4 == 0) goto L_0x0133
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r3 = r2.this$0
            X.1G4 r5 = r3.A0W
        L_0x0019:
            java.lang.Object r2 = r5.getValue()
            X.1E7 r6 = com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A00(r3, r4)
            X.1G4 r0 = r3.A0V
            r0.setValue(r6)
            X.1xo r0 = r3.A0E
            boolean r0 = r0.A03(r4)
            r8 = 1
            r20 = r0 ^ 1
            com.whatsapp.jid.GroupJid r7 = X.AnonymousClass3MW.A0f(r4)
            r18 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            if (r7 == 0) goto L_0x0121
            X.1MZ r9 = r3.A0B
            boolean r0 = r9.A0J(r7)
            if (r0 == 0) goto L_0x0121
            X.1CJ r1 = r3.A0A
            X.0zA r0 = r3.A02
            boolean r0 = X.C63982u1.A08(r0, r1, r6, r7)
            if (r0 == 0) goto L_0x0121
            X.1MW r0 = r9.A08
            int r10 = r0.A09(r7)
            X.0ve r9 = r3.A0D
            X.11S r1 = r3.A03
            boolean r0 = X.C40811vJ.A0I(r1, r9, r10)
            if (r0 == 0) goto L_0x012a
            r0 = 2131233309(0x7f080a1d, float:1.8082752E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r0 = 0
            boolean r0 = X.C40811vJ.A0J(r1, r9, r10, r0)
            if (r0 != 0) goto L_0x006b
            r18 = 1053609165(0x3ecccccd, float:0.4)
        L_0x006b:
            r1 = 0
            if (r7 == 0) goto L_0x008a
            X.1CJ r11 = r3.A0A
            X.0ve r10 = r3.A0D
            X.1MZ r9 = r3.A0B
            X.0zA r0 = r3.A02
            r21 = r0
            r22 = r11
            r23 = r9
            r24 = r6
            r25 = r10
            r26 = r7
            boolean r0 = X.C63982u1.A07(r21, r22, r23, r24, r25, r26)
            r21 = 1
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            r21 = 0
        L_0x008c:
            boolean r0 = r3.A0b
            if (r0 == 0) goto L_0x011e
            boolean r9 = X.C22971Dz.A0e(r4)
            if (r9 != 0) goto L_0x00fa
            boolean r7 = r6.A0B()
            if (r7 == 0) goto L_0x00dd
            X.4DF r22 = X.AnonymousClass4DF.ONE_ON_ONE_IN_CONTACTS
            java.lang.String r8 = X.AnonymousClass17K.A02(r6)
            if (r8 == 0) goto L_0x00b2
            X.0vb r7 = r3.A07
            java.lang.String r7 = r7.A0G(r8)
            X.C18070vi.A0X(r7)
            X.482 r12 = new X.482
            r12.<init>(r7)
        L_0x00b2:
            X.0vl r7 = r3.A0Q
            java.util.Map r24 = X.AnonymousClass3MW.A12(r7)
            r23 = r14
            r25 = r18
            r26 = r20
            r27 = r21
            java.util.ArrayList r16 = com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A04(r22, r23, r24, r25, r26, r27)
            java.util.List r17 = X.C18070vi.A0M(r6)
            r11 = 0
            X.4SR r10 = new X.4SR
            r15 = r11
            r13 = r11
            r19 = r0
            r22 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = r5.BFK(r2, r10)
            if (r0 == 0) goto L_0x0019
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00dd:
            X.11S r7 = r3.A03
            boolean r7 = r7.A0N()
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x00f7
            X.4DF r22 = X.AnonymousClass4DF.ONE_ON_ONE_NOT_IN_CONTACTS
        L_0x00e9:
            X.1Me r7 = r3.A06
            java.lang.String r7 = X.AnonymousClass3MX.A17(r7, r6)
            X.C18070vi.A0b(r7)
            X.482 r12 = X.C1402670q.A00(r7)
            goto L_0x00b2
        L_0x00f7:
            X.4DF r22 = X.AnonymousClass4DF.ONE_ON_ONE_NOT_IN_CONTACTS_COMPANION
            goto L_0x00e9
        L_0x00fa:
            X.4DF r22 = X.AnonymousClass4DF.LGC
            if (r7 == 0) goto L_0x00b2
            X.1MZ r9 = r3.A0B
            X.1MW r9 = r9.A08
            X.2tp r7 = r9.A0B(r7)
            X.10f r7 = X.C72483Me.A0O(r7)
            X.C18070vi.A0b(r7)
            int r10 = r7.size()
            r9 = 2131755037(0x7f10001d, float:1.9140942E38)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            X.C17880vN.A1T(r7, r10, r1)
            X.6IS r12 = X.C1402670q.A01(r7, r9, r10)
            goto L_0x00b2
        L_0x011e:
            X.4DF r22 = X.AnonymousClass4DF.ONE_ON_ONE_IN_CONTACTS
            goto L_0x00b2
        L_0x0121:
            boolean r0 = X.C22971Dz.A0d(r4)
            if (r0 != 0) goto L_0x012a
            r14 = r12
            goto L_0x006b
        L_0x012a:
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            goto L_0x006b
        L_0x0133:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x0138:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$retrieveContactInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
