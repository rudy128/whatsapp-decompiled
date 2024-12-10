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

@DebugMetadata(c = "com.whatsapp.messagedrafts.MessageDraftsManagerImpl$saveDraftMessage$1", f = "MessageDraftsManagerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessageDraftsManagerImpl$saveDraftMessage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C29691ci $chatInfo;
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ AnonymousClass25L $compositionMessage;
    public int label;
    public final /* synthetic */ C42441yB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageDraftsManagerImpl$saveDraftMessage$1(C29691ci r2, AnonymousClass25L r3, AnonymousClass1BI r4, C42441yB r5, C30391dr r6) {
        super(2, r6);
        this.this$0 = r5;
        this.$chatInfo = r2;
        this.$chatJid = r4;
        this.$compositionMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C42441yB r4 = this.this$0;
        return new MessageDraftsManagerImpl$saveDraftMessage$1(this.$chatInfo, this.$compositionMessage, this.$chatJid, r4, r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0233, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        X.CDX.A00(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0237, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023b, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x023e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0227, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022d, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0230, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r2 = r22
            int r0 = r2.label
            if (r0 != 0) goto L_0x023f
            X.C30691eM.A01(r23)
            X.1yB r0 = r2.this$0
            X.1Cd r0 = r0.A05
            X.1au r12 = r0.A05()
            X.1ci r8 = r2.$chatInfo
            X.1yB r7 = r2.this$0
            X.1BI r1 = r2.$chatJid
            X.25L r13 = r2.$compositionMessage
            X.C18070vi.A0b(r12)     // Catch:{ all -> 0x0238 }
            r10 = 1
            X.4sG r0 = new X.4sG     // Catch:{ all -> 0x0238 }
            r0.<init>(r8, r7, r1, r10)     // Catch:{ all -> 0x0238 }
            X.2uS r4 = new X.2uS     // Catch:{ all -> 0x0238 }
            r4.<init>(r0)     // Catch:{ all -> 0x0238 }
            r3 = r12
            X.1av r3 = (X.C28801av) r3     // Catch:{ all -> 0x0238 }
            X.1Ev r2 = r3.A02     // Catch:{ all -> 0x0238 }
            X.1Ci r0 = r3.A01     // Catch:{ all -> 0x0238 }
            X.1xA r14 = r3.A00(r4, r0, r2)     // Catch:{ all -> 0x0238 }
            r6 = r13
            X.1y6 r3 = r7.A09     // Catch:{ all -> 0x0231 }
            X.25H r0 = X.AnonymousClass25H.DRAFT     // Catch:{ all -> 0x0231 }
            java.util.ArrayList r0 = r3.A00(r0, r1)     // Catch:{ all -> 0x0231 }
            java.lang.Object r0 = X.C29431cG.A0c(r0)     // Catch:{ all -> 0x0231 }
            X.25L r0 = (X.AnonymousClass25L) r0     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x004b
            int r0 = r0.A00()     // Catch:{ all -> 0x0231 }
            X.25L r6 = X.C42441yB.A00(r13, r0)     // Catch:{ all -> 0x0231 }
        L_0x004b:
            X.206 r0 = r13.A01     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x0062
            X.205 r2 = r0.A0v     // Catch:{ all -> 0x0231 }
            if (r2 == 0) goto L_0x0062
            X.1N3 r0 = r7.A04     // Catch:{ all -> 0x0231 }
            java.lang.Long r2 = r0.A03(r12, r2)     // Catch:{ all -> 0x0231 }
            boolean r0 = r6 instanceof X.AnonymousClass2Dr     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x0070
            r0 = r6
            X.2Dr r0 = (X.AnonymousClass2Dr) r0     // Catch:{ all -> 0x0231 }
            r0.A01 = r2     // Catch:{ all -> 0x0231 }
        L_0x0062:
            r11 = 0
            X.C18070vi.A0d(r1, r11)     // Catch:{ all -> 0x0231 }
            X.C18070vi.A0d(r6, r10)     // Catch:{ all -> 0x0231 }
            X.1Cd r0 = r3.A01     // Catch:{ all -> 0x0231 }
            X.1au r5 = r0.A05()     // Catch:{ all -> 0x0231 }
            goto L_0x0076
        L_0x0070:
            r0 = r6
            X.2Dp r0 = (X.C46212Dp) r0     // Catch:{ all -> 0x0231 }
            r0.A01 = r2     // Catch:{ all -> 0x0231 }
            goto L_0x0062
        L_0x0076:
            int r4 = r6.A00()     // Catch:{ all -> 0x0225 }
            r21 = r4
            android.content.ContentValues r9 = X.C17880vN.A08()     // Catch:{ all -> 0x0225 }
            java.lang.String r2 = "chat_row_id"
            X.1LW r0 = r3.A00     // Catch:{ all -> 0x0225 }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x0225 }
            X.C17880vN.A19(r9, r2, r0)     // Catch:{ all -> 0x0225 }
            java.lang.String r1 = "composition_type"
            boolean r15 = r6 instanceof X.AnonymousClass2Dr     // Catch:{ all -> 0x0225 }
            if (r15 == 0) goto L_0x00c6
            r0 = r6
            X.2Dr r0 = (X.AnonymousClass2Dr) r0     // Catch:{ all -> 0x0225 }
            X.25H r0 = r0.A05     // Catch:{ all -> 0x0225 }
        L_0x0096:
            int r0 = r0.value     // Catch:{ all -> 0x0225 }
            X.C17880vN.A18(r9, r1, r0)     // Catch:{ all -> 0x0225 }
            java.lang.String r1 = "text"
            java.lang.String r0 = r6.A04()     // Catch:{ all -> 0x0225 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0225 }
            java.lang.String r1 = "message_type"
            X.2Qp r0 = r6.A03()     // Catch:{ all -> 0x0225 }
            int r0 = r0.value     // Catch:{ all -> 0x0225 }
            X.C17880vN.A18(r9, r1, r0)     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = "timestamp"
            long r2 = r6.A02()     // Catch:{ all -> 0x0225 }
            X.C17880vN.A19(r9, r0, r2)     // Catch:{ all -> 0x0225 }
            java.lang.String r1 = "lookup_tables"
            int r0 = r6.A01()     // Catch:{ all -> 0x0225 }
            X.C17880vN.A18(r9, r1, r0)     // Catch:{ all -> 0x0225 }
            java.lang.String r1 = "quoted_message_row_id"
            goto L_0x00cc
        L_0x00c6:
            r0 = r6
            X.2Dp r0 = (X.C46212Dp) r0     // Catch:{ all -> 0x0225 }
            X.25H r0 = r0.A07     // Catch:{ all -> 0x0225 }
            goto L_0x0096
        L_0x00cc:
            if (r15 == 0) goto L_0x00d4
            r0 = r6
            X.2Dr r0 = (X.AnonymousClass2Dr) r0     // Catch:{ all -> 0x0225 }
            java.lang.Long r0 = r0.A01     // Catch:{ all -> 0x0225 }
            goto L_0x00d9
        L_0x00d4:
            r0 = r6
            X.2Dp r0 = (X.C46212Dp) r0     // Catch:{ all -> 0x0225 }
            java.lang.Long r0 = r0.A01     // Catch:{ all -> 0x0225 }
        L_0x00d9:
            r9.put(r1, r0)     // Catch:{ all -> 0x0225 }
            java.lang.String r15 = "last_seen_timestamp"
            long r0 = r6.A00     // Catch:{ all -> 0x0225 }
            int r16 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r16 >= 0) goto L_0x00e5
            r0 = r2
        L_0x00e5:
            X.C17880vN.A19(r9, r15, r0)     // Catch:{ all -> 0x0225 }
            r0 = -1
            r2 = 0
            if (r4 != r0) goto L_0x00fb
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0225 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0225 }
            java.lang.String r1 = "composition"
            java.lang.String r0 = "INSERT_COMPOSITION_TEXT_MESSAGE"
            long r0 = r3.A05(r1, r0, r9)     // Catch:{ all -> 0x0225 }
            int r4 = (int) r0     // Catch:{ all -> 0x0225 }
            goto L_0x0117
        L_0x00fb:
            java.lang.String r0 = "_id"
            X.C17880vN.A18(r9, r0, r4)     // Catch:{ all -> 0x0225 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0225 }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x0225 }
            java.lang.String r17 = "composition"
            java.lang.String r18 = "_id = ?"
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x0225 }
            X.C17880vN.A1S(r0, r4, r11)     // Catch:{ all -> 0x0225 }
            java.lang.String r19 = "UPDATE_COMPOSITION_TEXT_MESSAGE"
            r16 = r9
            r20 = r0
            r15.A02(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0225 }
        L_0x0117:
            r5.close()     // Catch:{ all -> 0x0231 }
            r0 = r21
            if (r4 == r0) goto L_0x0122
            X.25L r6 = X.C42441yB.A00(r6, r4)     // Catch:{ all -> 0x0231 }
        L_0x0122:
            long r0 = r13.A02()     // Catch:{ all -> 0x0231 }
            r8.A0H(r0)     // Catch:{ all -> 0x0231 }
            X.1LW r1 = r7.A02     // Catch:{ all -> 0x0231 }
            android.content.ContentValues r0 = r8.A07(r2)     // Catch:{ all -> 0x0231 }
            r1.A0M(r0, r8)     // Catch:{ all -> 0x0231 }
            boolean r0 = r6 instanceof X.AnonymousClass2Dr     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x01c6
            r1 = 2
            int r0 = r6.A01()     // Catch:{ all -> 0x0231 }
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            X.1y8 r9 = r7.A08     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x01c0
            r10 = r6
            X.2Dr r10 = (X.AnonymousClass2Dr) r10     // Catch:{ all -> 0x0231 }
            r9.A00(r10)     // Catch:{ all -> 0x0231 }
            X.C18070vi.A0d(r10, r11)     // Catch:{ all -> 0x0231 }
            java.util.List r0 = r10.A08     // Catch:{ all -> 0x0231 }
            java.util.List r0 = X.C29431cG.A0t(r0)     // Catch:{ all -> 0x0231 }
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)     // Catch:{ all -> 0x0231 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0231 }
        L_0x015b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x016d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0231 }
            X.3Bi r0 = (X.C70503Bi) r0     // Catch:{ all -> 0x0231 }
            X.1BI r0 = r0.A00     // Catch:{ all -> 0x0231 }
            r2.add(r0)     // Catch:{ all -> 0x0231 }
            goto L_0x015b
        L_0x016d:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0231 }
            if (r0 != 0) goto L_0x01c6
            X.1Cd r0 = r9.A01     // Catch:{ all -> 0x0231 }
            X.1au r5 = r0.A05()     // Catch:{ all -> 0x0231 }
            X.1xA r4 = r5.BD0()     // Catch:{ all -> 0x0225 }
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x01b9 }
        L_0x0181:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x01af
            X.1BI r3 = X.C17880vN.A0Q(r13)     // Catch:{ all -> 0x01b9 }
            android.content.ContentValues r11 = X.C17880vN.A08()     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = "composition_row_id"
            int r0 = r10.A02     // Catch:{ all -> 0x01b9 }
            X.C17880vN.A18(r11, r1, r0)     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "jid_row_id"
            X.1DL r0 = r9.A00     // Catch:{ all -> 0x01b9 }
            long r0 = r0.A09(r3)     // Catch:{ all -> 0x01b9 }
            X.C17880vN.A19(r11, r2, r0)     // Catch:{ all -> 0x01b9 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01b9 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x01b9 }
            java.lang.String r2 = "composition_mention"
            java.lang.String r1 = "INSERT_COMPOSITION_MENTION"
            r0 = 4
            r3.A09(r2, r1, r11, r0)     // Catch:{ all -> 0x01b9 }
            goto L_0x0181
        L_0x01af:
            r4.A00()     // Catch:{ all -> 0x01b9 }
            r4.close()     // Catch:{ all -> 0x0225 }
            r5.close()     // Catch:{ all -> 0x0231 }
            goto L_0x01c6
        L_0x01b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0225 }
            throw r0     // Catch:{ all -> 0x0225 }
        L_0x01c0:
            r0 = r6
            X.2Dr r0 = (X.AnonymousClass2Dr) r0     // Catch:{ all -> 0x0231 }
            r9.A00(r0)     // Catch:{ all -> 0x0231 }
        L_0x01c6:
            boolean r0 = r6 instanceof X.C46222Dq     // Catch:{ all -> 0x0231 }
            if (r0 == 0) goto L_0x0217
            X.1y9 r1 = r7.A07     // Catch:{ all -> 0x0231 }
            r3 = r6
            X.2Dq r3 = (X.C46222Dq) r3     // Catch:{ all -> 0x0231 }
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x0231 }
            X.1Cd r0 = r1.A00     // Catch:{ all -> 0x0231 }
            X.1au r4 = r0.A05()     // Catch:{ all -> 0x0231 }
            android.content.ContentValues r5 = X.C17880vN.A08()     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = "composition_row_id"
            int r0 = r3.A00()     // Catch:{ all -> 0x0212 }
            X.C17880vN.A18(r5, r1, r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = "media_uri"
            X.2Dp r3 = (X.C46212Dp) r3     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r3.A0A     // Catch:{ all -> 0x0212 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = "media_name"
            java.lang.String r0 = r3.A09     // Catch:{ all -> 0x0212 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r2 = "file_length"
            long r0 = r3.A04     // Catch:{ all -> 0x0212 }
            X.C17880vN.A19(r5, r2, r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = "media_duration_in_seconds"
            int r0 = r3.A02     // Catch:{ all -> 0x0212 }
            X.C17880vN.A18(r5, r1, r0)     // Catch:{ all -> 0x0212 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0212 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0212 }
            java.lang.String r2 = "composition_media"
            java.lang.String r1 = "INSERT_COMPOSITION_MEDIA"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x0212 }
            goto L_0x0214
        L_0x0212:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x022c }
        L_0x0214:
            r4.close()     // Catch:{ all -> 0x0231 }
        L_0x0217:
            r8.A0v = r6     // Catch:{ all -> 0x0231 }
            r14.A00()     // Catch:{ all -> 0x0231 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0231 }
            r14.close()     // Catch:{ all -> 0x0238 }
            r12.close()
            return r0
        L_0x0225:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0227 }
        L_0x0227:
            r1 = move-exception
            X.CDX.A00(r5, r0)     // Catch:{ all -> 0x0231 }
            goto L_0x0230
        L_0x022c:
            r1 = move-exception
            X.CDX.A00(r4, r0)     // Catch:{ all -> 0x0231 }
        L_0x0230:
            throw r1     // Catch:{ all -> 0x0231 }
        L_0x0231:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0233 }
        L_0x0233:
            r0 = move-exception
            X.CDX.A00(r14, r1)     // Catch:{ all -> 0x0238 }
            throw r0     // Catch:{ all -> 0x0238 }
        L_0x0238:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x023a }
        L_0x023a:
            r0 = move-exception
            X.CDX.A00(r12, r1)
            throw r0
        L_0x023f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messagedrafts.MessageDraftsManagerImpl$saveDraftMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessageDraftsManagerImpl$saveDraftMessage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
