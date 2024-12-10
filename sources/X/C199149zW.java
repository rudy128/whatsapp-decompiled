package X;

import android.database.Cursor;
import java.util.List;

/* renamed from: X.9zW  reason: invalid class name and case insensitive filesystem */
public final class C199149zW {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;

    public static final void A00(Cursor cursor, C199149zW r21, List list) {
        String string;
        Long A0M;
        List list2;
        C29681ch r12;
        String string2;
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("chat_row_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("server_message_id");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("reaction_from_me");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("reactions_from_me_ts");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("votes_from_me");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("votes_from_me_ts");
        while (cursor2.moveToNext()) {
            long j = cursor2.getLong(columnIndexOrThrow);
            long j2 = cursor2.getLong(columnIndexOrThrow2);
            long j3 = cursor2.getLong(columnIndexOrThrow3);
            Long l = null;
            if (cursor2.isNull(columnIndexOrThrow4)) {
                string = null;
            } else {
                string = cursor2.getString(columnIndexOrThrow4);
            }
            if (cursor2.isNull(columnIndexOrThrow5)) {
                A0M = null;
            } else {
                A0M = C17890vO.A0M(cursor2, columnIndexOrThrow5);
            }
            if (cursor2.isNull(columnIndexOrThrow6) || (string2 = cursor2.getString(columnIndexOrThrow6)) == null || AnonymousClass1YF.A0T(string2)) {
                list2 = C18460wS.A00;
            } else {
                list2 = C108995ce.A0c(string2);
            }
            if (!cursor2.isNull(columnIndexOrThrow7)) {
                l = C17890vO.A0M(cursor2, columnIndexOrThrow7);
            }
            AnonymousClass1BI A0B = r21.A00.A0B(j2);
            if ((A0B instanceof C29681ch) && (r12 = (C29681ch) A0B) != null) {
                list.add(new C195489tQ(r12, A0M, l, string, list2, j, j3));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00eb, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ee, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C29681ch r18, java.lang.Long r19, java.lang.Long r20, java.lang.String r21, java.util.List r22, long r23) {
        /*
            r17 = this;
            r3 = r20
            r10 = r19
            r8 = r22
            r9 = r21
            r12 = 0
            java.lang.String[] r14 = X.C17880vN.A1Z()
            r13 = r17
            X.1LW r6 = r13.A00
            r7 = r18
            X.AnonymousClass1LW.A03(r6, r7, r14, r12)
            r0 = 1
            r1 = r23
            X.C17880vN.A1V(r14, r0, r1)
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            X.1Cd r0 = r13.A01
            r16 = r0
            X.1at r5 = r16.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00e8 }
            X.1Ev r15 = r0.A02     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "SELECT _id, chat_row_id, server_message_id, reaction_from_me, reactions_from_me_ts, votes_from_me, votes_from_me_ts FROM newsletter_my_reaction_orphan_message WHERE chat_row_id = ? AND server_message_id = ?"
            java.lang.String r0 = "SELECT_ORPHAN_MY_ADD_ONS_FOR_MESSAGE"
            android.database.Cursor r4 = r15.A0A(r4, r0, r14)     // Catch:{ all -> 0x00e8 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x00e1 }
            A00(r4, r13, r11)     // Catch:{ all -> 0x00e1 }
            if (r4 == 0) goto L_0x0040
            r4.close()     // Catch:{ all -> 0x00e8 }
        L_0x0040:
            r5.close()
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x007f
            java.lang.Object r13 = r11.get(r12)
            X.9tQ r13 = (X.C195489tQ) r13
            if (r21 == 0) goto L_0x0063
            java.lang.Long r0 = r13.A03
            if (r0 == 0) goto L_0x0067
            if (r19 == 0) goto L_0x0063
            long r11 = r0.longValue()
            long r4 = r10.longValue()
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
        L_0x0063:
            java.lang.String r9 = r13.A05
            java.lang.Long r10 = r13.A03
        L_0x0067:
            if (r22 == 0) goto L_0x007b
            java.lang.Long r0 = r13.A04
            if (r0 == 0) goto L_0x007f
            if (r20 == 0) goto L_0x007b
            long r11 = r0.longValue()
            long r4 = r3.longValue()
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
        L_0x007b:
            java.util.List r8 = r13.A06
            java.lang.Long r3 = r13.A04
        L_0x007f:
            X.1au r4 = r16.A05()     // Catch:{ all -> 0x00d0 }
            android.content.ContentValues r5 = X.C17880vN.A08()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "chat_row_id"
            long r6 = r6.A09(r7)     // Catch:{ all -> 0x00c9 }
            X.C17880vN.A19(r5, r0, r6)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "server_message_id"
            X.C17880vN.A19(r5, r0, r1)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "reaction_from_me"
            r5.put(r0, r9)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "reactions_from_me_ts"
            r5.put(r0, r10)     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "votes_from_me"
            if (r8 != 0) goto L_0x00a5
            r0 = 0
            goto L_0x00ab
        L_0x00a5:
            java.lang.String r0 = ","
            java.lang.String r0 = X.C108995ce.A0X(r0, r8)     // Catch:{ all -> 0x00c9 }
        L_0x00ab:
            r5.put(r1, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "votes_from_me_ts"
            r5.put(r0, r3)     // Catch:{ all -> 0x00c9 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c9 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00c9 }
            java.lang.String r2 = "newsletter_my_reaction_orphan_message"
            java.lang.String r1 = "NewsletterMyAddOnMessageOrphanStore/insertOrReplaceNewsletterOrphanMyAddOns"
            r0 = 5
            long r0 = r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x00c9 }
            r4.close()     // Catch:{ all -> 0x00d0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00d5
        L_0x00c9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x00d5:
            java.lang.Throwable r1 = X.C30671eK.A00(r0)
            if (r1 == 0) goto L_0x00e0
            java.lang.String r0 = "NewsletterMyAddOnMessageOrphanStore/failed to insert the message"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00e0:
            return
        L_0x00e1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00e8 }
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199149zW.A01(X.1ch, java.lang.Long, java.lang.Long, java.lang.String, java.util.List, long):void");
    }

    public C199149zW(AnonymousClass1LW r1, AnonymousClass1Cd r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
