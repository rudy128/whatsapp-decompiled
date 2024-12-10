package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1T9  reason: invalid class name */
public class AnonymousClass1T9 {
    public final AnonymousClass1DL A00;
    public final AnonymousClass1Cd A01;
    public final AnonymousClass00H A02;

    public synchronized long A00(UserJid userJid, String str) {
        C41851xA BD0;
        long j;
        long A06;
        C17960vV.A01();
        C28791au A05 = this.A01.A05();
        try {
            BD0 = A05.BD0();
            ContentValues contentValues = new ContentValues();
            contentValues.put("token", str);
            if (userJid != null) {
                j = this.A00.A09(userJid);
            } else {
                j = 0;
            }
            contentValues.put("creator_jid_row_id", Long.valueOf(j));
            A06 = ((C28801av) A05).A02.A06("call_link", "call_link_store/insert", contentValues);
            ((AnonymousClass2P5) this.A02.get()).put(str, new C59292m4(userJid, str, A06));
            BD0.A00();
            BD0.close();
            A05.close();
        } catch (Throwable th) {
            try {
                A05.close();
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            throw th;
        }
        return A06;
        throw th;
    }

    public synchronized C59292m4 A01(Cursor cursor) {
        C59292m4 r5;
        int i;
        int columnIndex = cursor.getColumnIndex("call_link_id");
        r5 = null;
        if (!(columnIndex == -1 || (i = cursor.getInt(columnIndex)) == 0)) {
            String string = cursor.getString(cursor.getColumnIndexOrThrow("token"));
            Jid A0B = this.A00.A0B((long) cursor.getInt(cursor.getColumnIndexOrThrow("creator_jid_row_id")));
            C22941Dw r0 = UserJid.Companion;
            r5 = new C59292m4(C22941Dw.A01(A0B), string, (long) i);
        }
        return r5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.2m4} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        return r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C59292m4 A02(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.00H r6 = r8.A02     // Catch:{ all -> 0x0094 }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0094 }
            X.2P5 r0 = (X.AnonymousClass2P5) r0     // Catch:{ all -> 0x0094 }
            boolean r0 = r0.containsKey(r9)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x0094 }
            X.2P5 r0 = (X.AnonymousClass2P5) r0     // Catch:{ all -> 0x0094 }
            java.lang.Object r4 = r0.get(r9)     // Catch:{ all -> 0x0094 }
            X.2m4 r4 = (X.C59292m4) r4     // Catch:{ all -> 0x0094 }
            goto L_0x007c
        L_0x001c:
            X.1Cd r0 = r8.A01     // Catch:{ all -> 0x0094 }
            X.1at r7 = r0.get()     // Catch:{ all -> 0x0094 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x008a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "SELECT _id, token, creator_jid_row_id FROM call_link WHERE token = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x008a }
            r0 = 0
            r1[r0] = r9     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "get_call_link_by_token"
            android.database.Cursor r5 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x008a }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x007e }
            r4 = 0
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007e }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x007e }
            long r2 = (long) r0     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "creator_jid_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007e }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0060
            X.1DL r4 = r8.A00     // Catch:{ all -> 0x007e }
            long r0 = (long) r0     // Catch:{ all -> 0x007e }
            com.whatsapp.jid.Jid r1 = r4.A0B(r0)     // Catch:{ all -> 0x007e }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x007e }
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x007e }
        L_0x0060:
            X.2m4 r1 = new X.2m4     // Catch:{ all -> 0x007e }
            r1.<init>(r4, r9, r2)     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r6.get()     // Catch:{ all -> 0x007e }
            X.2P5 r0 = (X.AnonymousClass2P5) r0     // Catch:{ all -> 0x007e }
            r0.put(r9, r1)     // Catch:{ all -> 0x007e }
            r5.close()     // Catch:{ all -> 0x008a }
            r7.close()     // Catch:{ all -> 0x0094 }
            monitor-exit(r8)
            return r1
        L_0x0076:
            r5.close()     // Catch:{ all -> 0x008a }
            r7.close()     // Catch:{ all -> 0x0094 }
        L_0x007c:
            monitor-exit(r8)
            return r4
        L_0x007e:
            r1 = move-exception
            if (r5 == 0) goto L_0x0089
            r5.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0094 }
        L_0x0093:
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1T9.A02(java.lang.String):X.2m4");
    }

    public AnonymousClass1T9(AnonymousClass1DL r1, AnonymousClass1Cd r2, AnonymousClass00H r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
