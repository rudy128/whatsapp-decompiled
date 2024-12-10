package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C89444cT;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C89444cT $it;
    public int label;
    public final /* synthetic */ CallLogActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1(CallLogActivityViewModel callLogActivityViewModel, C89444cT r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = callLogActivityViewModel;
        this.$it = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CallLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1(this.this$0, this.$it, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        if (r22 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
        if (((X.AnonymousClass1E7) X.C29431cG.A0b(r22)).A0B() == false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r4 = r30
            int r0 = r4.label
            if (r0 != 0) goto L_0x0191
            X.C30691eM.A01(r31)
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r4.this$0
            X.1TD r1 = r0.A09
            X.4cT r0 = r4.$it
            X.9Bw r3 = X.C72483Me.A0U(r1, r0)
            if (r3 == 0) goto L_0x0069
            java.util.ArrayList r0 = r3.A0B()
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r7 = r4.this$0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r0.iterator()
        L_0x0023:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.9Bv r0 = (X.C178109Bv) r0
            X.11S r1 = r7.A03
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x0023
            r6.add(r2)
            goto L_0x0023
        L_0x003e:
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r5 = r4.this$0
            java.util.ArrayList r2 = X.C29351c6.A0E(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x0048:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r1.next()
            X.9Bv r0 = (X.C178109Bv) r0
            com.whatsapp.jid.UserJid r0 = r0.A00
            X.C18070vi.A0W(r0)
            X.1E7 r0 = com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A00(r5, r0)
            r2.add(r0)
            goto L_0x0048
        L_0x0061:
            r0 = 3
            java.util.List r22 = X.C98974s1.A00(r2, r3, r0)
            if (r22 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            X.0wS r22 = X.C18460wS.A00
        L_0x006b:
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r9 = r4.this$0
            r8 = 0
            java.util.ArrayList r7 = X.C29351c6.A0E(r22)
            java.util.Iterator r6 = r22.iterator()
        L_0x0076:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0097
            X.1E7 r5 = X.C17880vN.A0O(r6)
            X.1Me r2 = r9.A06
            r1 = 7
            r0 = 1
            X.1yg r0 = r2.A0F(r5, r1, r8, r0)
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L_0x008e
            java.lang.String r1 = ""
        L_0x008e:
            X.4ir r0 = new X.4ir
            r0.<init>(r5, r1)
            r7.add(r0)
            goto L_0x0076
        L_0x0097:
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r4.this$0
            X.1M9 r8 = r0.A05
            X.1Me r6 = r0.A06
            java.util.ArrayList r5 = X.C29351c6.A0E(r22)
            java.util.Iterator r1 = r22.iterator()
        L_0x00a5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b3
            com.whatsapp.jid.Jid r0 = X.C72473Md.A0X(r1)
            r5.add(r0)
            goto L_0x00a5
        L_0x00b3:
            int r0 = r22.size()
            r2 = 0
            r1 = 1
            if (r0 != r1) goto L_0x00c8
            java.lang.Object r0 = X.C29431cG.A0b(r22)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            boolean r0 = r0.A0B()
            r12 = 1
            if (r0 != 0) goto L_0x00c9
        L_0x00c8:
            r12 = 0
        L_0x00c9:
            r11 = 3
            r9 = r6
            r10 = r5
            r13 = r1
            X.4ZN r16 = X.AnonymousClass74H.A04(r8, r9, r10, r11, r12, r13)
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r6 = r4.this$0
            X.1G4 r13 = r6.A0W
        L_0x00d5:
            java.lang.Object r10 = r13.getValue()
            r8 = 0
            if (r3 == 0) goto L_0x0189
            X.2m4 r0 = r3.A0B
            if (r0 == 0) goto L_0x0189
            java.lang.String r14 = r0.A02
        L_0x00e2:
            boolean r5 = r3.A0J
            X.2m4 r0 = r3.A0B
            if (r0 == 0) goto L_0x018d
            if (r5 == 0) goto L_0x0185
            X.4DF r24 = X.AnonymousClass4DF.CALL_LINK_VIDEO
        L_0x00ec:
            r0 = 2131755038(0x7f10001e, float:1.9140944E38)
            int r12 = r22.size()
            java.lang.Object[] r11 = new java.lang.Object[r1]
            int r9 = r22.size()
            X.C17880vN.A1T(r11, r9, r2)
            X.6IS r17 = X.C1402670q.A01(r11, r0, r12)
            X.0vl r9 = r6.A0Q
            java.util.Map r26 = X.AnonymousClass3MW.A12(r9)
            r9 = 2131231762(0x7f080412, float:1.8079614E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)
            r23 = 1065353216(0x3f800000, float:1.0)
            r25 = r19
            r27 = r23
            r28 = r1
            r29 = r2
            java.util.ArrayList r21 = com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A04(r24, r25, r26, r27, r28, r29)
            if (r3 == 0) goto L_0x0123
            X.2m4 r9 = r3.A0B
            if (r9 != 0) goto L_0x0123
            X.4cT r8 = r3.A04
        L_0x0123:
            boolean r9 = r6.A0b
            X.4SR r15 = new X.4SR
            r24 = r9
            r25 = r1
            r26 = r2
            r27 = r5
            r18 = r8
            r20 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r5 = r13.BFK(r10, r15)
            if (r5 == 0) goto L_0x00d5
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r3 = r4.this$0
            X.1G4 r6 = r3.A0U
        L_0x0140:
            java.lang.Object r8 = r6.getValue()
            r3 = 2
            X.5Wy[] r9 = new X.C106725Wy[r3]
            r3 = 2131168774(0x7f070e06, float:1.795186E38)
            java.lang.Integer r10 = X.AnonymousClass3MW.A0v(r3)
            r5 = 2131169416(0x7f071088, float:1.7953161E38)
            r4 = 2130969386(0x7f04032a, float:1.7547452E38)
            X.4it r3 = new X.4it
            r3.<init>(r10, r5, r4)
            r9[r2] = r3
            int r5 = r7.size()
            java.lang.Object[] r4 = new java.lang.Object[r1]
            int r3 = r7.size()
            java.lang.Integer r3 = X.AnonymousClass3MW.A0v(r3)
            r4[r2] = r3
            X.6IS r4 = X.C1402670q.A01(r4, r0, r5)
            X.4iq r3 = new X.4iq
            r3.<init>(r4)
            java.util.List r3 = X.C18070vi.A0O(r3, r9, r1)
            java.util.ArrayList r3 = X.C29431cG.A0k(r7, r3)
            boolean r3 = r6.BFK(r8, r3)
            if (r3 == 0) goto L_0x0140
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0185:
            X.4DF r24 = X.AnonymousClass4DF.CALL_LINK_AUDIO
            goto L_0x00ec
        L_0x0189:
            r14 = r8
            if (r3 != 0) goto L_0x00e2
            r5 = 0
        L_0x018d:
            X.4DF r24 = X.AnonymousClass4DF.ADHOC_GROUP_CALL
            goto L_0x00ec
        L_0x0191:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
