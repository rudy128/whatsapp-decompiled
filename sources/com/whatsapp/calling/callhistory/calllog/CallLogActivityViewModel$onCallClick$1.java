package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C89444cT;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$onCallClick$1", f = "CallLogActivityViewModel.kt", i = {0, 0, 0}, l = {1009, 1021, 1028, 1032, 1044}, m = "invokeSuspend", n = {"contacts", "groupJid", "isVoiceChatWithGroupSizeGreaterThanUpperBound"}, s = {"L$0", "L$1", "I$0"})
public final class CallLogActivityViewModel$onCallClick$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C89444cT $adhocCallLogKey;
    public final /* synthetic */ List $contactList;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $fromCallLog;
    public final /* synthetic */ boolean $isVideoCall;
    public final /* synthetic */ boolean $isVoiceChat;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ CallLogActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$onCallClick$1(Context context, CallLogActivityViewModel callLogActivityViewModel, C89444cT r4, List list, C30391dr r6, boolean z, boolean z2, boolean z3) {
        super(2, r6);
        this.$contactList = list;
        this.this$0 = callLogActivityViewModel;
        this.$adhocCallLogKey = r4;
        this.$fromCallLog = z;
        this.$isVideoCall = z2;
        this.$isVoiceChat = z3;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r11) {
        List list = this.$contactList;
        return new CallLogActivityViewModel$onCallClick$1(this.$context, this.this$0, this.$adhocCallLogKey, list, r11, this.$fromCallLog, this.$isVideoCall, this.$isVoiceChat);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (X.C40811vJ.A0H(r0.A03, r0.A0D, X.AnonymousClass3MW.A03(r0.A0B, r4)) == false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r7 = r24
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            r2 = r23
            int r0 = r2.label
            r5 = 5
            java.lang.String r8 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            r6 = 4
            r1 = 3
            r9 = 2
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0026
            if (r0 == r13) goto L_0x00f7
            if (r0 == r9) goto L_0x0021
            if (r0 == r1) goto L_0x0021
            if (r0 == r6) goto L_0x01a8
            if (r0 == r5) goto L_0x01a8
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0021:
            X.C30691eM.A01(r7)
            goto L_0x00ac
        L_0x0026:
            X.C30691eM.A01(r7)
            java.util.List r0 = r2.$contactList
            int r0 = r0.size()
            java.util.List r15 = r2.$contactList
            if (r0 != r13) goto L_0x01d4
            java.lang.Object r10 = X.C29431cG.A0b(r15)
            X.1E7 r10 = (X.AnonymousClass1E7) r10
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r2.this$0
            X.1MZ r7 = r0.A0B
            X.11S r4 = r0.A03
            X.1M9 r0 = r0.A05
            java.util.List r15 = X.C63982u1.A04(r4, r0, r7, r10)
            X.C18070vi.A0X(r15)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            java.util.List r0 = r2.$contactList
            java.lang.Object r0 = X.C29431cG.A0b(r0)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r0 = r0.A0J
            com.whatsapp.jid.GroupJid r4 = X.C36321nh.A00(r0)
        L_0x0058:
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r2.this$0
            X.00H r0 = r0.A0I
            java.lang.Object r7 = r0.get()
            X.9oh r7 = (X.C192619oh) r7
            if (r4 == 0) goto L_0x01cc
            r10 = 3
        L_0x0065:
            java.lang.Integer r10 = X.AnonymousClass3MW.A0v(r10)
            boolean r0 = r2.$fromCallLog
            if (r0 == 0) goto L_0x01bc
            r11 = 13
        L_0x006f:
            java.lang.Integer r11 = X.AnonymousClass3MW.A0v(r11)
            boolean r0 = r2.$isVideoCall
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A01(r4, r0, r10, r11)
            boolean r0 = r2.$fromCallLog
            if (r0 == 0) goto L_0x00af
            if (r4 != 0) goto L_0x00af
            java.util.List r0 = r2.$contactList
            int r0 = r0.size()
            if (r0 != r13) goto L_0x00af
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            java.util.List r0 = r2.$contactList
            java.lang.Object r0 = X.C29431cG.A0b(r0)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MZ.A0w(r0)
            if (r1 == 0) goto L_0x00ac
            android.content.Context r3 = r2.$context
            boolean r0 = r2.$isVideoCall
            X.C18070vi.A0z(r3, r8)
            X.1FU r3 = (X.AnonymousClass1FU) r3
            com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet r1 = X.AnonymousClass4Fs.A00(r1, r6, r0)
            java.lang.String r0 = "OneOnOneCallConfirmationSheet"
            r3.CMk(r1, r0)
        L_0x00ac:
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x00af:
            boolean r0 = r2.$isVoiceChat
            if (r0 == 0) goto L_0x00c8
            if (r4 == 0) goto L_0x00c8
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r2.this$0
            X.0ve r10 = r0.A0D
            X.11S r7 = r0.A03
            X.1MZ r0 = r0.A0B
            int r0 = X.AnonymousClass3MW.A03(r0, r4)
            boolean r0 = X.C40811vJ.A0H(r7, r10, r0)
            r12 = 1
            if (r0 != 0) goto L_0x00c9
        L_0x00c8:
            r12 = 0
        L_0x00c9:
            boolean r0 = r2.$isVoiceChat
            if (r0 == 0) goto L_0x0118
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r2.this$0
            X.1VP r11 = r0.A04
            X.0wl r10 = r0.A0S
            android.content.Context r7 = r2.$context
            r2.L$0 = r15
            r2.L$1 = r4
            r2.I$0 = r12
            r2.label = r13
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModelKt$mayStartVoiceChatOnDispatcher$2 r0 = new com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModelKt$mayStartVoiceChatOnDispatcher$2
            r16 = r0
            r17 = r7
            r18 = r11
            r19 = r4
            r20 = r15
            r21 = r14
            r22 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            java.lang.Object r7 = X.C30451dy.A00(r2, r10, r0)
            if (r7 != r3) goto L_0x0104
            return r3
        L_0x00f7:
            int r12 = r2.I$0
            java.lang.Object r4 = r2.L$1
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r15 = r2.L$0
            java.util.List r15 = (java.util.List) r15
            X.C30691eM.A01(r7)
        L_0x0104:
            boolean r0 = X.AnonymousClass000.A1Y(r7)
            if (r0 == 0) goto L_0x0118
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r2.this$0
            X.0ve r3 = r0.A0D
            r1 = 5429(0x1535, float:7.608E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r3, r1)
            goto L_0x01af
        L_0x0118:
            if (r12 != 0) goto L_0x00ac
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r7 = r2.this$0
            boolean r0 = r7.A0b
            if (r0 == 0) goto L_0x016b
            if (r4 == 0) goto L_0x014c
            java.util.List r0 = r2.$contactList
            java.lang.Object r5 = X.C29431cG.A0b(r0)
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            boolean r4 = r2.$isVideoCall
            android.content.Context r1 = r2.$context
            X.C18070vi.A0z(r1, r8)
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r2.L$0 = r14
            r2.L$1 = r14
            r2.label = r9
            X.0wl r0 = r7.A0S
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$launchNewLGCCallConfirmationSheet$2 r7 = new com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$launchNewLGCCallConfirmationSheet$2
            r8 = r1
            r9 = r5
            r10 = r14
            r11 = r6
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Object r0 = X.C30451dy.A00(r2, r0, r7)
        L_0x0149:
            if (r0 != r3) goto L_0x00ac
            return r3
        L_0x014c:
            X.4cT r0 = r2.$adhocCallLogKey
            if (r0 == 0) goto L_0x0188
            android.content.Context r5 = r2.$context
            X.C18070vi.A0z(r5, r8)
            X.1FU r5 = (X.AnonymousClass1FU) r5
            X.4cT r4 = r2.$adhocCallLogKey
            r2.L$0 = r14
            r2.L$1 = r14
            r2.label = r1
            X.0wl r1 = r7.A0S
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$launchNewAdhocCallConfirmationSheet$2 r0 = new com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$launchNewAdhocCallConfirmationSheet$2
            r0.<init>(r5, r4, r14, r6)
            java.lang.Object r0 = X.C30451dy.A00(r2, r1, r0)
            goto L_0x0149
        L_0x016b:
            X.1VP r8 = r7.A04
            X.0wl r1 = r7.A0S
            android.content.Context r7 = r2.$context
            boolean r0 = r2.$isVideoCall
            r2.L$0 = r14
            r2.L$1 = r14
            r2.label = r5
            r12 = 4
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2 r6 = new com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2
            r9 = r4
            r10 = r15
            r11 = r14
            r13 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r7 = X.C30451dy.A00(r2, r1, r6)
            goto L_0x01a5
        L_0x0188:
            X.1VP r13 = r7.A04
            X.0wl r1 = r7.A0S
            android.content.Context r12 = r2.$context
            boolean r0 = r2.$isVideoCall
            r2.L$0 = r14
            r2.L$1 = r14
            r2.label = r6
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2 r11 = new com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModelKt$mayStartOutgoingCallOnDispatcher$2
            r16 = r14
            r17 = r6
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r7 = X.C30451dy.A00(r2, r1, r11)
        L_0x01a5:
            if (r7 != r3) goto L_0x01ab
            return r3
        L_0x01a8:
            X.C30691eM.A01(r7)
        L_0x01ab:
            int r0 = X.AnonymousClass000.A0M(r7)
        L_0x01af:
            if (r0 != 0) goto L_0x00ac
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = r2.this$0
            X.1wy r1 = r0.A0G
            X.1Wu r0 = X.C27621Wu.A00
            r1.A0E(r0)
            goto L_0x00ac
        L_0x01bc:
            boolean r0 = r2.$isVideoCall
            if (r0 == 0) goto L_0x01c3
            r11 = 3
            goto L_0x006f
        L_0x01c3:
            boolean r0 = r2.$isVoiceChat
            r11 = 2
            if (r0 == 0) goto L_0x006f
            r11 = 32
            goto L_0x006f
        L_0x01cc:
            X.4cT r0 = r2.$adhocCallLogKey
            r10 = 1
            if (r0 == 0) goto L_0x0065
            r10 = 2
            goto L_0x0065
        L_0x01d4:
            r4 = r14
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$onCallClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogActivityViewModel$onCallClick$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
