package com.whatsapp.messagedrafts;

import X.AnonymousClass1OS;
import X.AnonymousClass25L;
import X.C27621Wu;
import X.C29691ci;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C42441yB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagedrafts.MessageDraftsManagerImpl$updateLastSeenTimestamp$2", f = "MessageDraftsManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessageDraftsManagerImpl$updateLastSeenTimestamp$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C29691ci $chatInfo;
    public final /* synthetic */ AnonymousClass25L $compositionMessage;
    public final /* synthetic */ long $timestamp;
    public int label;
    public final /* synthetic */ C42441yB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDraftsManagerImpl$updateLastSeenTimestamp$2(C29691ci r2, AnonymousClass25L r3, C42441yB r4, C30391dr r5, long j) {
        super(2, r5);
        this.this$0 = r4;
        this.$compositionMessage = r3;
        this.$timestamp = j;
        this.$chatInfo = r2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C42441yB r3 = this.this$0;
        return new MessageDraftsManagerImpl$updateLastSeenTimestamp$2(this.$chatInfo, this.$compositionMessage, r3, r9, this.$timestamp);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            if (r0 != 0) goto L_0x006f
            X.C30691eM.A01(r13)
            X.1yB r0 = r12.this$0
            X.1y6 r2 = r0.A09
            X.25L r5 = r12.$compositionMessage
            long r0 = r12.$timestamp
            r3 = 0
            X.C18070vi.A0d(r5, r3)
            X.1Cd r2 = r2.A01
            X.1au r4 = r2.A05()
            r2 = r4
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0068 }
            X.1Ev r6 = r2.A02     // Catch:{ all -> 0x0068 }
            java.lang.String r8 = "composition"
            android.content.ContentValues r7 = X.C17880vN.A08()     // Catch:{ all -> 0x0068 }
            java.lang.String r2 = "last_seen_timestamp"
            X.C17880vN.A19(r7, r2, r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r9 = "_id = ?"
            java.lang.String[] r11 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0068 }
            int r0 = r5.A00()     // Catch:{ all -> 0x0068 }
            X.C17880vN.A1S(r11, r0, r3)     // Catch:{ all -> 0x0068 }
            java.lang.String r10 = "UPDATE_COMPOSITION_MESSAGE_LAST_SEEN_TIMESTAMP"
            int r0 = r6.A02(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0068 }
            r4.close()
            if (r0 != 0) goto L_0x0060
            X.1ci r4 = r12.$chatInfo
            if (r4 == 0) goto L_0x004f
            X.25L r2 = r12.$compositionMessage
            long r0 = r2.A02()
            r2.A00 = r0
            r4.A0v = r2
        L_0x004f:
            X.1yB r0 = r12.this$0
            X.1Q1 r2 = r0.A01
            X.25L r1 = r12.$compositionMessage
            boolean r0 = r1 instanceof X.AnonymousClass2Dr
            if (r0 == 0) goto L_0x0063
            X.2Dr r1 = (X.AnonymousClass2Dr) r1
            X.1BI r0 = r1.A06
        L_0x005d:
            r2.A03(r0, r3)
        L_0x0060:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0063:
            X.2Dp r1 = (X.C46212Dp) r1
            X.1BI r0 = r1.A08
            goto L_0x005d
        L_0x0068:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagedrafts.MessageDraftsManagerImpl$updateLastSeenTimestamp$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageDraftsManagerImpl$updateLastSeenTimestamp$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
