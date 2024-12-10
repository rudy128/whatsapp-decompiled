package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.2r4  reason: invalid class name and case insensitive filesystem */
public final class C62232r4 {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Q6 A01;
    public final AnonymousClass1Cd A02;

    public final void A01(C28791au r8, GroupJid groupJid) {
        C18070vi.A0d(groupJid, 1);
        String[] strArr = new String[1];
        AnonymousClass1LW.A03(this.A00, groupJid, strArr, 0);
        ContentValues A08 = C17880vN.A08();
        A08.put("event_state", C17880vN.A0h());
        ((C28801av) r8).A02.A02(A08, "message_event", "chat_row_id = ? AND is_canceled = 0 AND event_state = 0", "message_event.INVALIDATE_EVENT_MESSAGES", strArr);
        r8.BJ7(new C70733Ch(this, groupJid, 43));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dd, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C445823z r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.1Cd r0 = r6.A02
            X.1au r5 = r0.A05()
            long r0 = r7.A0x     // Catch:{ all -> 0x00da }
            r2 = 13
            android.content.ContentValues r4 = X.C17880vN.A09(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "message_row_id"
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "name"
            java.lang.String r0 = r7.A06     // Catch:{ all -> 0x00da }
            r4.put(r1, r0)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "description"
            java.lang.String r0 = r7.A04     // Catch:{ all -> 0x00da }
            r4.put(r1, r0)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "join_link"
            java.lang.String r0 = r7.A05     // Catch:{ all -> 0x00da }
            r4.put(r1, r0)     // Catch:{ all -> 0x00da }
            long r0 = r7.A00     // Catch:{ all -> 0x00da }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "start_time"
            r4.put(r0, r1)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "end_time"
            java.lang.Long r0 = r7.A03     // Catch:{ all -> 0x00da }
            r4.put(r1, r0)     // Catch:{ all -> 0x00da }
            boolean r0 = r7.A08     // Catch:{ all -> 0x00da }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "is_canceled"
            r4.put(r0, r1)     // Catch:{ all -> 0x00da }
            X.9rg r0 = r7.A01     // Catch:{ all -> 0x00da }
            r2 = 0
            if (r0 == 0) goto L_0x00a5
            X.9qf r0 = r0.A00     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00a5
            double r0 = r0.A00     // Catch:{ all -> 0x00da }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00da }
        L_0x0059:
            java.lang.String r0 = "location_latitude"
            r4.put(r0, r1)     // Catch:{ all -> 0x00da }
            X.9rg r0 = r7.A01     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00a3
            X.9qf r0 = r0.A00     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00a3
            double r0 = r0.A01     // Catch:{ all -> 0x00da }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x00da }
        L_0x006c:
            java.lang.String r0 = "location_longitude"
            r4.put(r0, r1)     // Catch:{ all -> 0x00da }
            X.9rg r0 = r7.A01     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x00da }
        L_0x0077:
            java.lang.String r0 = "location_name"
            r4.put(r0, r1)     // Catch:{ all -> 0x00da }
            X.9rg r0 = r7.A01     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0082
            java.lang.String r2 = r0.A01     // Catch:{ all -> 0x00da }
        L_0x0082:
            java.lang.String r0 = "location_address"
            r4.put(r0, r2)     // Catch:{ all -> 0x00da }
            X.1LW r1 = r6.A00     // Catch:{ all -> 0x00da }
            X.1BI r0 = X.AnonymousClass205.A00(r7)     // Catch:{ all -> 0x00da }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "chat_row_id"
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00da }
            java.lang.Integer r0 = r7.A02     // Catch:{ all -> 0x00da }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00da }
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00a9
            goto L_0x00a7
        L_0x00a1:
            r1 = r2
            goto L_0x0077
        L_0x00a3:
            r1 = r2
            goto L_0x006c
        L_0x00a5:
            r1 = r2
            goto L_0x0059
        L_0x00a7:
            r0 = 0
            goto L_0x00aa
        L_0x00a9:
            r0 = 1
        L_0x00aa:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "event_state"
            r4.put(r0, r1)     // Catch:{ all -> 0x00da }
            boolean r1 = r7.A07     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "allow_extra_guests"
            X.C50072Ta.A00(r4, r0, r1)     // Catch:{ all -> 0x00da }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00da }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "message_event"
            java.lang.String r1 = "EventMessageStore/insertOrUpdateMessageEvent"
            r0 = 5
            long r3 = r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x00da }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d2
            r5.close()
            return
        L_0x00d2:
            java.lang.String r1 = "EventMessageStore/insertOrUpdateMessageEvent the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x00da }
            r0.<init>(r1)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62232r4.A02(X.23z):void");
    }

    public C62232r4(AnonymousClass1LW r1, AnonymousClass1Q6 r2, AnonymousClass1Cd r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final void A00(Cursor cursor, List list) {
        while (cursor.moveToNext()) {
            list.add(Long.valueOf(C17890vO.A06(cursor, "message_row_id")));
        }
    }
}
