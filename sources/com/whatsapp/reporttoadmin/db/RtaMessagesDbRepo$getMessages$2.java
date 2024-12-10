package com.whatsapp.reporttoadmin.db;

import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C42621yT;
import X.C55492fr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2", f = "RtaMessagesDbRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtaMessagesDbRepo$getMessages$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C42621yT $cancellationSignal;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public int label;
    public final /* synthetic */ C55492fr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtaMessagesDbRepo$getMessages$2(C42621yT r2, AnonymousClass1EC r3, C55492fr r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r4;
        this.$groupJid = r3;
        this.$cancellationSignal = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        C55492fr r3 = this.this$0;
        return new RtaMessagesDbRepo$getMessages$2(this.$cancellationSignal, this.$groupJid, r3, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0142, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0145, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            if (r0 != 0) goto L_0x0146
            X.C30691eM.A01(r15)
            X.2fr r0 = r14.this$0
            java.util.List r0 = r0.A04
            java.util.ArrayList r7 = X.C29351c6.A0D(r0)
            java.util.Iterator r5 = r0.iterator()
            r6 = 0
            r4 = 0
        L_0x0015:
            boolean r0 = r5.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r5.next()
            int r2 = r4 + 1
            if (r4 >= 0) goto L_0x0029
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x0029:
            java.lang.String[] r1 = X.C17880vN.A1Z()
            r1[r6] = r0
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.util.List r0 = X.C18070vi.A0O(r0, r1, r3)
            r7.add(r0)
            r4 = r2
            goto L_0x0015
        L_0x003c:
            java.util.List[] r0 = new java.util.List[r6]
            java.lang.Object[] r2 = r7.toArray(r0)
            r0 = 487(0x1e7, float:6.82E-43)
            X.23b r1 = new X.23b
            r1.<init>(r2, r0)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.2fr r0 = r14.this$0
            long r12 = android.os.SystemClock.uptimeMillis()
            X.1Cd r0 = r0.A03
            X.1at r3 = r0.get()
            X.2fr r8 = r14.this$0
            X.1EC r7 = r14.$groupJid
            X.1yT r4 = r14.$cancellationSignal
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x013f }
        L_0x0063:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0119
            java.lang.Object r9 = r11.next()     // Catch:{ all -> 0x013f }
            java.util.List[] r9 = (java.util.List[]) r9     // Catch:{ all -> 0x013f }
            X.C18070vi.A0b(r9)     // Catch:{ all -> 0x013f }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x013f }
            int r10 = r9.length     // Catch:{ all -> 0x013f }
            r1 = 0
        L_0x0078:
            if (r1 >= r10) goto L_0x0085
            r0 = r9[r1]     // Catch:{ all -> 0x013f }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x013f }
            X.C29401cD.A0J(r0, r2)     // Catch:{ all -> 0x013f }
            int r1 = r1 + 1
            goto L_0x0078
        L_0x0085:
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x013f }
            java.lang.Object[] r2 = r2.toArray(r0)     // Catch:{ all -> 0x013f }
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x013f }
            X.1LW r0 = r8.A01     // Catch:{ all -> 0x013f }
            X.AnonymousClass1LW.A03(r0, r7, r1, r6)     // Catch:{ all -> 0x013f }
            java.lang.Object[] r9 = X.C200310o.A0F(r2, r1)     // Catch:{ all -> 0x013f }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ all -> 0x013f }
            java.lang.String r0 = X.AnonymousClass203.A0P     // Catch:{ all -> 0x013f }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "( values  (\"MESSAGE_KEY_ID\", \"MESSAGE_INDEX\"),"
            r2.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "(?,?)"
            java.util.List r1 = java.util.Collections.nCopies(r10, r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)     // Catch:{ all -> 0x013f }
            r2.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = ")"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x013f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "SELECT DISTINCT "
            r1.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = X.C209514c.A00     // Catch:{ all -> 0x013f }
            r1.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = " FROM "
            r1.append(r0)     // Catch:{ all -> 0x013f }
            r1.append(r2)     // Catch:{ all -> 0x013f }
            java.lang.String r2 = " LEFT JOIN "
            r1.append(r2)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "message_edit_info"
            X.C17890vO.A17(r1, r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "MESSAGE_KEY_ID = message_edit_info.original_key_id"
            r1.append(r0)     // Catch:{ all -> 0x013f }
            r1.append(r2)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "available_message_view"
            r1.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = " ON ("
            r1.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "available_message_view.key_id = MESSAGE_KEY_ID OR available_message_view._id = message_row_id)"
            X.C17890vO.A18(r1, r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "chat_row_id = ?"
            r1.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = " AND "
            r1.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "message_type NOT IN ('8', '10', '7', '15', '19', '64')"
            r1.append(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = " ORDER BY MESSAGE_INDEX ASC"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x013f }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x013f }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x013f }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "GET_ALL_REPORTED_TO_ADMIN_MESSAGES_FOR_JID_START_SQL"
            X.26f r0 = r1.A0C(r4, r2, r0, r9)     // Catch:{ all -> 0x013f }
            r5.add(r0)     // Catch:{ all -> 0x013f }
            goto L_0x0063
        L_0x0119:
            r4 = 0
            r3.close()
            X.2fr r0 = r14.this$0
            X.1LY r3 = r0.A02
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r12
            java.lang.String r0 = "ReportToAdminStore/getReportedMessagesForJid"
            r3.A01(r0, r1)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x013e
            android.database.Cursor[] r0 = new android.database.Cursor[r6]
            java.lang.Object[] r0 = r5.toArray(r0)
            android.database.Cursor[] r0 = (android.database.Cursor[]) r0
            android.database.MergeCursor r4 = new android.database.MergeCursor
            r4.<init>(r0)
        L_0x013e:
            return r4
        L_0x013f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0146:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtaMessagesDbRepo$getMessages$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
