package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1QW  reason: invalid class name */
public class AnonymousClass1QW {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;

    public void A01(C29691ci r15) {
        ContentValues contentValues;
        synchronized (r15) {
            contentValues = new ContentValues();
            contentValues.put("last_activity_ts", Long.valueOf(r15.A0M));
            contentValues.put("last_activity_seen_ts", Long.valueOf(r15.A0L));
            contentValues.put("join_ts", Long.valueOf(r15.A0K));
            contentValues.put("closed", Boolean.valueOf(r15.A0r));
        }
        AnonymousClass1BI r3 = r15.A0u;
        AnonymousClass1Cd r4 = this.A01;
        C28791au A05 = r4.A05();
        try {
            AnonymousClass1LW r2 = this.A00;
            long A09 = r2.A09(r3);
            int A02 = ((C28801av) A05).A02.A02(contentValues, "community_chat", "chat_row_id = ?", "updateCommunityChatTable", new String[]{String.valueOf(A09)});
            A05.close();
            if (A02 == 0) {
                contentValues.put("chat_row_id", Long.valueOf(r2.A09(r3)));
                A05 = r4.A05();
                try {
                    long A052 = ((C28801av) A05).A02.A05("community_chat", "updateCommunityChatTable", contentValues);
                    A05.close();
                    r15.A0Y = A052;
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            }
        } finally {
            th = th;
            A05.close();
        }
    }

    public ArrayList A00() {
        Cursor A0A;
        AnonymousClass1Ez r7 = new AnonymousClass1Ez("CommunityChatStore/getCommunityChats");
        AnonymousClass1LW r6 = this.A00;
        C28781at A04 = r6.A03.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT _id FROM chat_view WHERE group_type = ?", "GET_ROW_ID_BY_GROUP_TYPE_SQL", new String[]{Integer.toString(1)});
            ArrayList arrayList = new ArrayList(A0A.getCount());
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("_id");
            while (A0A.moveToNext()) {
                arrayList.add(Long.valueOf(A0A.getLong(columnIndexOrThrow)));
            }
            A0A.close();
            A04.close();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                AnonymousClass1BI A0B = r6.A0B(longValue);
                if (A0B == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CommunityChatStore/failed to find chatJid by row id: ");
                    sb.append(longValue);
                    Log.w(sb.toString());
                } else {
                    arrayList2.add(A0B);
                }
            }
            r7.A02();
            return arrayList2;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (r7 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.util.Map r19) {
        /*
            r18 = this;
            java.lang.String r0 = "CommunityChatStore/loadData"
            X.1Ez r12 = new X.1Ez
            r12.<init>((java.lang.String) r0)
            r8 = r18
            X.1Cd r0 = r8.A01
            X.1at r17 = r0.get()
            r0 = r17
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c8 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "SELECT chat_row_id, last_activity_ts, last_activity_seen_ts, join_ts, closed FROM community_chat"
            java.lang.String r1 = "GET_COMMUNITY_CHATS_SQL"
            r0 = 0
            android.database.Cursor r7 = r3.A0A(r2, r1, r0)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "chat_row_id"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "last_activity_ts"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "last_activity_seen_ts"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "join_ts"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "closed"
            int r2 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bc }
        L_0x003c:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00b2
            X.1LW r9 = r8.A00     // Catch:{ all -> 0x00bc }
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x00bc }
            X.1BI r10 = r9.A0B(r0)     // Catch:{ all -> 0x00bc }
            if (r10 != 0) goto L_0x0067
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r9.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "CommunityChatStore/failed to find chatJid by row id: "
            r9.append(r0)     // Catch:{ all -> 0x00bc }
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x00bc }
            r9.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x00bc }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00bc }
            goto L_0x003c
        L_0x0067:
            r11 = r19
            java.lang.Object r13 = r11.get(r10)     // Catch:{ all -> 0x00bc }
            r9 = r13
            X.1ci r9 = (X.C29691ci) r9     // Catch:{ all -> 0x00bc }
            if (r9 != 0) goto L_0x0087
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            r1.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "CommunityChatStore/missing chat in map: "
            r1.append(r0)     // Catch:{ all -> 0x00bc }
            r1.append(r10)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bc }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00bc }
            goto L_0x003c
        L_0x0087:
            long r0 = r7.getLong(r5)     // Catch:{ all -> 0x00bc }
            monitor-enter(r13)     // Catch:{ all -> 0x00bc }
            r9.A0M = r0     // Catch:{ all -> 0x00af }
            monitor-exit(r13)     // Catch:{ all -> 0x00bc }
            long r0 = r7.getLong(r4)     // Catch:{ all -> 0x00bc }
            monitor-enter(r13)     // Catch:{ all -> 0x00bc }
            r9.A0L = r0     // Catch:{ all -> 0x00af }
            monitor-exit(r13)     // Catch:{ all -> 0x00bc }
            long r0 = r7.getLong(r3)     // Catch:{ all -> 0x00bc }
            r9.A0K = r0     // Catch:{ all -> 0x00bc }
            long r15 = r7.getLong(r2)     // Catch:{ all -> 0x00bc }
            r13 = 1
            int r1 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00a9
            r0 = 1
        L_0x00a9:
            r9.A0r = r0     // Catch:{ all -> 0x00bc }
            r11.put(r10, r9)     // Catch:{ all -> 0x00bc }
            goto L_0x003c
        L_0x00af:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00bc }
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00b2:
            r12.A02()     // Catch:{ all -> 0x00bc }
            r7.close()     // Catch:{ all -> 0x00c8 }
            r17.close()
            return
        L_0x00bc:
            r1 = move-exception
            if (r7 == 0) goto L_0x00c7
            r7.close()     // Catch:{ all -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c8 }
        L_0x00c7:
            throw r1     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x00cd }
            throw r1
        L_0x00cd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QW.A02(java.util.Map):void");
    }

    public AnonymousClass1QW(AnonymousClass1LW r1, AnonymousClass1Cd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
