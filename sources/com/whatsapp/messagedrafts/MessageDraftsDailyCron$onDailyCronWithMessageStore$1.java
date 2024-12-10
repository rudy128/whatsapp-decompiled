package com.whatsapp.messagedrafts;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C95314m2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagedrafts.MessageDraftsDailyCron$onDailyCronWithMessageStore$1", f = "MessageDraftsDailyCron.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class MessageDraftsDailyCron$onDailyCronWithMessageStore$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C95314m2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDraftsDailyCron$onDailyCronWithMessageStore$1(C95314m2 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MessageDraftsDailyCron$onDailyCronWithMessageStore$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MessageDraftsDailyCron$onDailyCronWithMessageStore$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            r3 = r18
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r2) goto L_0x006b
            X.C30691eM.A01(r19)
        L_0x000e:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0011:
            X.C30691eM.A01(r19)
            X.4m2 r0 = r3.this$0
            X.1yA r5 = r0.A00
            X.2Qp r10 = X.C49472Qp.TEXT
            X.1yB r5 = (X.C42441yB) r5
            boolean r0 = r5.BeW()
            if (r0 == 0) goto L_0x0068
            X.0ve r9 = r5.A06
            r0 = 11969(0x2ec1, float:1.6772E-41)
            float r0 = r9.A0E(r0)
            long r0 = (long) r0
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0068
            X.1y6 r12 = r5.A09
            X.25H r11 = X.AnonymousClass25H.DRAFT
            r0 = 11969(0x2ec1, float:1.6772E-41)
            float r0 = r9.A0E(r0)
            long r0 = (long) r0
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r0
            r14 = 1000(0x3e8, float:1.401E-42)
            r15 = 100
            r13 = 0
            com.whatsapp.messagedrafts.CompositionMessageStore$getCompositionMessageLiteByTimestampLessThan$1 r9 = new com.whatsapp.messagedrafts.CompositionMessageStore$getCompositionMessageLiteByTimestampLessThan$1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            X.Du4 r1 = new X.Du4
            r1.<init>(r9)
            X.0wl r0 = r5.A0B
            X.1Fz r5 = X.AnonymousClass4I5.A00(r0, r1)
        L_0x0057:
            X.4m2 r1 = r3.this$0
            r0 = 31
            X.4tB r0 = X.C99614tB.A00(r1, r0)
            r3.label = r2
            java.lang.Object r0 = r5.BFC(r3, r0)
            if (r0 != r4) goto L_0x000e
            return r4
        L_0x0068:
            X.4su r5 = X.C99494su.A00
            goto L_0x0057
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagedrafts.MessageDraftsDailyCron$onDailyCronWithMessageStore$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
