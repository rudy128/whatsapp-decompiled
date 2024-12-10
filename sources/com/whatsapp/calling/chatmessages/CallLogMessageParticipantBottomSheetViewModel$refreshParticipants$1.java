package com.whatsapp.calling.chatmessages;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r1 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r2.A01 != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r0.A09 != 0) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            int r0 = r15.label
            if (r0 != 0) goto L_0x01ab
            X.C30691eM.A01(r16)
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r15.this$0
            X.4cT r1 = r0.A0H
            if (r1 == 0) goto L_0x01a8
            X.1TB r0 = r0.A0C
            X.9Bw r6 = r0.A05(r1)
            if (r6 == 0) goto L_0x01a8
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r2 = r15.this$0
            boolean r0 = r6.A0W()
            r2.A04 = r0
            X.0ve r3 = r2.A0E
            X.0vf r1 = X.C18040vf.A01
            r0 = 9434(0x24da, float:1.322E-41)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 != 0) goto L_0x0047
            X.00H r0 = r2.A0I
            java.lang.Object r0 = r0.get()
            X.1yO r0 = (X.C42571yO) r0
            com.whatsapp.jid.GroupJid r1 = r6.A0C
            if (r1 == 0) goto L_0x0047
            X.0ve r4 = r0.A07
            X.11S r3 = r0.A00
            X.1MZ r0 = r0.A05
            int r1 = X.AnonymousClass3MW.A03(r0, r1)
            r0 = 0
            boolean r1 = X.C40811vJ.A0J(r3, r4, r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r2.A01 = r0
            boolean r0 = r6.A0J
            r2.A03 = r0
            r2.A00 = r6
            X.1G4 r3 = r2.A0M
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x005b
            boolean r1 = r2.A01
            r0 = 0
            if (r1 == 0) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            X.AnonymousClass3MY.A1Y(r3, r0)
            X.1G4 r3 = r2.A0L
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0160
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0160
            r1 = 2131887790(0x7f1206ae, float:1.9410197E38)
        L_0x006c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.setValue(r0)
            X.1G4 r3 = r2.A0P
            X.9Bw r0 = r2.A00
            if (r0 == 0) goto L_0x0150
            boolean r1 = r0.A0Q()
            r0 = 1
            if (r1 != r0) goto L_0x0150
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0144
            X.9Bw r0 = r2.A00
            if (r0 == 0) goto L_0x0092
            X.C178119Bw.A00(r0)
            int r0 = r0.A09
            r1 = 2131887785(0x7f1206a9, float:1.9410187E38)
            if (r0 == 0) goto L_0x0095
        L_0x0092:
            r1 = 2131887782(0x7f1206a6, float:1.941018E38)
        L_0x0095:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.setValue(r0)
            int r0 = r6.A08
            int r8 = r6.A05()
            X.1G4 r7 = r2.A0O
            X.118 r5 = r2.A0A
            r4 = 2131887791(0x7f1206af, float:1.94102E38)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1b()
            X.0vb r2 = r2.A0B
            long r0 = X.C17890vO.A03(r0)
            java.lang.String r1 = X.C64052u8.A04(r2, r0)
            r0 = 0
            r3[r0] = r1
            r0 = 1
            X.C17880vN.A1T(r3, r8, r0)
            java.lang.String r0 = r5.A02(r4, r3)
            r7.setValue(r0)
            java.util.ArrayList r0 = r6.A0B()
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r5 = r15.this$0
            java.util.ArrayList r1 = X.C29351c6.A0D(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x00d3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x016c
            java.lang.Object r7 = r8.next()
            X.9Bv r7 = (X.C178109Bv) r7
            X.1M9 r0 = r5.A08
            com.whatsapp.jid.UserJid r3 = r7.A00
            X.1E7 r10 = r0.A0H(r3)
            X.C18070vi.A0W(r3)
            X.9Bw r2 = r5.A00
            r11 = 0
            if (r2 == 0) goto L_0x0105
            X.11S r0 = r5.A05
            boolean r0 = r2.A0Z(r0, r3)
            if (r0 == 0) goto L_0x0105
            boolean r2 = r5.A04
            r0 = 2131887786(0x7f1206aa, float:1.9410189E38)
            if (r2 == 0) goto L_0x0101
            r0 = 2131887787(0x7f1206ab, float:1.941019E38)
        L_0x0101:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x0105:
            X.11S r6 = r5.A05
            boolean r0 = X.AnonymousClass3Ma.A1V(r6, r10)
            if (r0 == 0) goto L_0x0138
            X.118 r0 = r5.A0A
            android.content.Context r2 = r0.A00
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r12 = r2.getString(r0)
        L_0x0118:
            if (r12 != 0) goto L_0x011c
            java.lang.String r12 = ""
        L_0x011c:
            int r2 = r7.A01
            r0 = 5
            if (r2 == r0) goto L_0x012a
            int r2 = r7.A01
            r0 = 100
            if (r2 == r0) goto L_0x012a
            r13 = 0
            if (r11 == 0) goto L_0x012b
        L_0x012a:
            r13 = 1
        L_0x012b:
            boolean r14 = X.AnonymousClass3Ma.A1V(r6, r10)
            X.3ma r9 = new X.3ma
            r9.<init>(r10, r11, r12, r13, r14)
            r1.add(r9)
            goto L_0x00d3
        L_0x0138:
            X.1Me r4 = r5.A09
            r3 = 7
            r2 = 0
            r0 = 1
            X.1yg r0 = r4.A0F(r10, r3, r2, r0)
            java.lang.String r12 = r0.A01
            goto L_0x0118
        L_0x0144:
            boolean r0 = r2.A03
            r1 = 2131887784(0x7f1206a8, float:1.9410185E38)
            if (r0 == 0) goto L_0x0095
            r1 = 2131887783(0x7f1206a7, float:1.9410183E38)
            goto L_0x0095
        L_0x0150:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0092
            boolean r0 = r2.A03
            r1 = 2131887781(0x7f1206a5, float:1.9410179E38)
            if (r0 == 0) goto L_0x0095
            r1 = 2131887780(0x7f1206a4, float:1.9410177E38)
            goto L_0x0095
        L_0x0160:
            boolean r0 = r2.A03
            r1 = 2131887789(0x7f1206ad, float:1.9410195E38)
            if (r0 == 0) goto L_0x006c
            r1 = 2131887788(0x7f1206ac, float:1.9410193E38)
            goto L_0x006c
        L_0x016c:
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r15.this$0
            X.1G4 r6 = r0.A0Q
            r8 = 2
            r7 = 1
            r5 = 0
            r4 = 3
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x017c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0191
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3ma r0 = (X.C76093ma) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x017c
            r3.add(r1)
            goto L_0x017c
        L_0x0191:
            X.1Di[] r1 = new X.C22821Di[r4]
            X.5Vh r0 = X.C106295Vh.A00
            r1[r5] = r0
            X.5Vi r0 = X.C106305Vi.A00
            r1[r7] = r0
            X.5Vj r0 = X.C106315Vj.A00
            r1[r8] = r0
            r0 = 16
            java.util.List r0 = X.C98974s1.A00(r3, r1, r0)
            r6.setValue(r0)
        L_0x01a8:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x01ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
