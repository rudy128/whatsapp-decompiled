package com.whatsapp.messagedrafts;

import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass25L;
import X.C27621Wu;
import X.C29691ci;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C42441yB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagedrafts.MessageDraftsManagerImpl$deleteDraftMessage$1", f = "MessageDraftsManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessageDraftsManagerImpl$deleteDraftMessage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C29691ci $chatInfo;
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ AnonymousClass25L $previousDraftMessage;
    public int label;
    public final /* synthetic */ C42441yB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDraftsManagerImpl$deleteDraftMessage$1(C29691ci r2, AnonymousClass25L r3, AnonymousClass1BI r4, C42441yB r5, C30391dr r6) {
        super(2, r6);
        this.this$0 = r5;
        this.$chatJid = r4;
        this.$chatInfo = r2;
        this.$previousDraftMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C42441yB r4 = this.this$0;
        return new MessageDraftsManagerImpl$deleteDraftMessage$1(this.$chatInfo, this.$previousDraftMessage, this.$chatJid, r4, r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            if (r0 != 0) goto L_0x007e
            X.C30691eM.A01(r12)
            X.1yB r0 = r11.this$0     // Catch:{ Exception -> 0x0063 }
            X.1y6 r10 = r0.A09     // Catch:{ Exception -> 0x0063 }
            X.1BI r9 = r11.$chatJid     // Catch:{ Exception -> 0x0063 }
            X.25H r8 = X.AnonymousClass25H.DRAFT     // Catch:{ Exception -> 0x0063 }
            r7 = 0
            X.C18070vi.A0d(r9, r7)     // Catch:{ Exception -> 0x0063 }
            r6 = 1
            X.1Cd r0 = r10.A01     // Catch:{ Exception -> 0x0063 }
            X.1au r5 = r0.A05()     // Catch:{ Exception -> 0x0063 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005c }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "composition"
            java.lang.String r2 = "chat_row_id = ? AND composition_type = ?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x005c }
            X.1LW r0 = r10.A00     // Catch:{ all -> 0x005c }
            X.AnonymousClass1LW.A03(r0, r9, r1, r7)     // Catch:{ all -> 0x005c }
            int r0 = r8.value     // Catch:{ all -> 0x005c }
            X.C17880vN.A1S(r1, r0, r6)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "DELETE_COMPOSITION_MESSAGE"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x005c }
            r5.close()     // Catch:{ Exception -> 0x0063 }
            X.1ci r3 = r11.$chatInfo     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x007b
            X.1yB r2 = r11.this$0     // Catch:{ Exception -> 0x0063 }
            X.1BI r1 = r11.$chatJid     // Catch:{ Exception -> 0x0063 }
            X.1R3 r0 = r2.A03     // Catch:{ Exception -> 0x0063 }
            X.206 r0 = r0.A06(r1, r6)     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0059
            long r0 = r0.A0I     // Catch:{ Exception -> 0x0063 }
            r3.A0H(r0)     // Catch:{ Exception -> 0x0063 }
            X.1LW r1 = r2.A02     // Catch:{ Exception -> 0x0063 }
            r0 = 0
            android.content.ContentValues r0 = r3.A07(r0)     // Catch:{ Exception -> 0x0063 }
            r1.A0M(r0, r3)     // Catch:{ Exception -> 0x0063 }
            goto L_0x007b
        L_0x0059:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ Exception -> 0x0063 }
            return r0
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ Exception -> 0x0063 }
            throw r0     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            java.lang.String r0 = "MessageDraftsManagerImpl/deleteDraftMessage/unable to delete draft message"
            com.whatsapp.util.Log.w(r0, r1)
            X.1ci r1 = r11.$chatInfo
            if (r1 == 0) goto L_0x0071
            X.25L r0 = r11.$previousDraftMessage
            r1.A0v = r0
        L_0x0071:
            X.1yB r0 = r11.this$0
            X.1Q1 r2 = r0.A01
            X.1BI r1 = r11.$chatJid
            r0 = 0
            r2.A03(r1, r0)
        L_0x007b:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagedrafts.MessageDraftsManagerImpl$deleteDraftMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageDraftsManagerImpl$deleteDraftMessage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
