package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1LW  reason: invalid class name */
public class AnonymousClass1LW implements AnonymousClass1LV {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1DL A01;
    public final C22611Cn A02;
    public final AnonymousClass1Cd A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final Map A08 = new HashMap();
    public final Map A09 = new HashMap();
    public final AnonymousClass190 A0A;
    public final AnonymousClass11P A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    public int A06(C29691ci r2) {
        return A05(r2.A07((Long) null), r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r3 = r0.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r3 <= 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        A04(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r3 = A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r5.A00.A0A(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A09(X.AnonymousClass1BI r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.A08     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x002b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0011
            long r3 = r0.longValue()     // Catch:{ all -> 0x002b }
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            return r3
        L_0x0011:
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            X.1CJ r0 = r5.A00
            X.1ci r0 = r0.A0A(r6)
            if (r0 == 0) goto L_0x0026
            long r3 = r0.A0Y
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
        L_0x0022:
            r5.A04(r6, r3)
            return r3
        L_0x0026:
            long r3 = r5.A01(r6)
            goto L_0x0022
        L_0x002b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A09(X.1BI):long");
    }

    public void A0F(C29691ci r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues(2);
            contentValues.put("change_number_notified_message_row_id", Long.valueOf(r5.A0E));
        }
        A05(contentValues, r5);
    }

    public void A0G(C29691ci r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues();
            contentValues.put("unseen_message_reaction_count", Integer.valueOf(r5.A09));
            contentValues.put("last_message_reaction_row_id", Long.valueOf(r5.A0O));
            contentValues.put("last_seen_message_reaction_row_id", Long.valueOf(r5.A0V));
        }
        int A052 = A05(contentValues, r5);
        StringBuilder sb = new StringBuilder();
        sb.append("ChatStore/updateChatLastMessageReactionInfo ");
        sb.append(r5.A0u);
        sb.append("/");
        sb.append(r5.A0B());
        sb.append("/");
        sb.append(A052);
        Log.i(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r4.A02.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.C29691ci r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x004b }
            r2.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "archived"
            boolean r0 = r5.A0l     // Catch:{ all -> 0x004b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x004b }
            r2.put(r1, r0)     // Catch:{ all -> 0x004b }
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            int r0 = r4.A05(r2, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            if (r0 != 0) goto L_0x002f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            java.lang.String r0 = "ChatStore/archive/did not update "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            X.1BI r0 = r5.A0u     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            return
        L_0x002f:
            if (r6 == 0) goto L_0x005c
            X.00H r0 = r4.A0C     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            java.lang.Object r3 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            X.1Q1 r3 = (X.AnonymousClass1Q1) r3     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            X.1BI r2 = r5.A0u     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            boolean r1 = r5.A0l     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            r0 = 0
            X.C18070vi.A0d(r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            if (r1 == 0) goto L_0x0047
            r3.A00(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            return
        L_0x0047:
            r3.A01(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0053, Error | RuntimeException -> 0x004e }
        L_0x004e:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0053:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r4.A02
            r0.A03()
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A0J(X.1ci, boolean):void");
    }

    public boolean A0N(C29691ci r5) {
        ContentValues contentValues;
        synchronized (r5) {
            contentValues = new ContentValues(5);
            contentValues.put("display_message_row_id", Long.valueOf(r5.A0W));
            contentValues.put("display_message_sort_id", Long.valueOf(r5.A0X));
            contentValues.put("last_message_row_id", Long.valueOf(r5.A0P));
            contentValues.put("last_message_sort_id", Long.valueOf(r5.A0Q));
            contentValues.put("sort_timestamp", Long.valueOf(r5.A0Z));
        }
        return A0M(contentValues, r5);
    }

    private long A00(AnonymousClass1BI r11) {
        Cursor A0A2;
        long A092 = this.A01.A09(r11);
        long j = -1;
        if (A092 < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatStore/getExistingChatRowId/invalid jidRowId=");
            sb.append(A092);
            Log.e(sb.toString());
            return -1;
        }
        C28781at A042 = this.A03.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT _id FROM chat_view WHERE jid_row_id = ?", "GET_ROW_ID_FOR_CHAT", new String[]{Long.toString(A092)});
            if (A0A2.moveToNext()) {
                j = A0A2.getLong(A0A2.getColumnIndexOrThrow("_id"));
            }
            A0A2.close();
            A042.close();
            return j;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (X.C22971Dz.A0T(r2) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(X.AnonymousClass1BI r5, long r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0068
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            monitor-enter(r4)
            java.util.Map r0 = r4.A08     // Catch:{ all -> 0x0065 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0065 }
            r0.put(r5, r3)     // Catch:{ all -> 0x0065 }
            java.util.Map r1 = r4.A09     // Catch:{ all -> 0x0065 }
            java.lang.Object r2 = r1.get(r3)     // Catch:{ all -> 0x0065 }
            X.1BI r2 = (X.AnonymousClass1BI) r2     // Catch:{ all -> 0x0065 }
            boolean r0 = r5.equals(r2)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0031
            if (r2 == 0) goto L_0x002e
            boolean r0 = X.C22971Dz.A0T(r5)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0033
            boolean r0 = X.C22971Dz.A0T(r2)     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0042
        L_0x002e:
            r1.put(r3, r5)     // Catch:{ all -> 0x0065 }
        L_0x0031:
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            goto L_0x0064
        L_0x0033:
            boolean r0 = X.C22971Dz.A0T(r2)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0042
            X.1CJ r0 = r4.A00     // Catch:{ all -> 0x0065 }
            boolean r0 = r0.A0P(r5)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0042
            goto L_0x002e
        L_0x0042:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r1.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "Attempted to overwrite cached JID "
            r1.append(r0)     // Catch:{ all -> 0x0065 }
            r1.append(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = " with new JID "
            r1.append(r0)     // Catch:{ all -> 0x0065 }
            r1.append(r5)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0065 }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x0065 }
            r0.<init>()     // Catch:{ all -> 0x0065 }
            com.whatsapp.util.Log.e(r1, r0)     // Catch:{ all -> 0x0065 }
            goto L_0x0031
        L_0x0064:
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0065 }
            throw r0
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A04(X.1BI, long):void");
    }

    public int A05(ContentValues contentValues, C29691ci r17) {
        C28791au A052 = this.A03.A05();
        C29691ci r3 = r17;
        try {
            AnonymousClass1BI r6 = r3.A0u;
            A02(r3.A0b, r6, "updateChatTable");
            boolean z = false;
            if (r3.A03 == 5) {
                z = true;
            }
            ContentValues contentValues2 = contentValues;
            if (z || C22971Dz.A0V(r6)) {
                contentValues2.put("hidden", 1);
            } else {
                contentValues2.put("hidden", 0);
                if (r3.A0s) {
                    r3.A0s = false;
                }
            }
            long A092 = this.A01.A09(r6);
            contentValues2.toString();
            int A022 = ((C28801av) A052).A02.A02(contentValues2, "chat", "jid_row_id = ?", "updateChatTable/UPDATE_CHAT", new String[]{String.valueOf(A092)});
            if (A022 != 0 && r3.A0Y == -1) {
                r3.A0Y = A00(r6);
            }
            A052.close();
            return A022;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public long A07(long j) {
        Cursor A0A2;
        long j2 = -1;
        if (j < 0) {
            return -1;
        }
        C28781at A042 = this.A03.get();
        try {
            A0A2 = ((C28801av) A042).A02.A0A("SELECT created_timestamp FROM chat_view WHERE _id = ?", "GET_CREATED_TIME_FOR_CHAT", new String[]{Long.toString(j)});
            if (A0A2.moveToNext()) {
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("created_timestamp");
                if (!A0A2.isNull(columnIndexOrThrow)) {
                    j2 = A0A2.getLong(columnIndexOrThrow);
                }
            }
            A0A2.close();
            A042.close();
            return j2;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r3 > 0) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0A(X.AnonymousClass206 r7) {
        /*
            r6 = this;
            X.205 r0 = r7.A0v
            X.1BI r5 = r0.A00
            if (r5 != 0) goto L_0x0009
            r3 = -1
            return r3
        L_0x0009:
            boolean r0 = r7 instanceof X.C436420i
            if (r0 == 0) goto L_0x0012
            long r3 = r6.A01(r5)
            return r3
        L_0x0012:
            X.1CJ r0 = r6.A00
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r5)
            if (r0 == 0) goto L_0x0026
            long r3 = r0.A0Y
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0026
        L_0x0022:
            r6.A04(r5, r3)
            return r3
        L_0x0026:
            long r3 = r6.A01(r5)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A0A(X.206):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r5 = r7.A03.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = ((X.C28801av) r5).A02.A0A("SELECT jid_row_id FROM chat_view WHERE _id = ?", "GET_CHAT_BY_ROW_ID_SQL", new java.lang.String[]{java.lang.Long.toString(r8)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r3.moveToLast() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r1 = r7.A01.A0B(r3.getLong(r3.getColumnIndexOrThrow("jid_row_id")));
        r0 = X.AnonymousClass1BI.A00;
        r6 = X.C22931Dv.A00(r1);
        A04(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r3 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1BI A0B(long r8) {
        /*
            r7 = this;
            r1 = 0
            r6 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0079
            monitor-enter(r7)
            java.util.Map r2 = r7.A09     // Catch:{ all -> 0x0076 }
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0076 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x001c
            java.lang.Object r6 = r2.get(r1)     // Catch:{ all -> 0x0076 }
            X.1BI r6 = (X.AnonymousClass1BI) r6     // Catch:{ all -> 0x0076 }
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            return r6
        L_0x001c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            X.1Cd r0 = r7.A03
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006c }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "SELECT jid_row_id FROM chat_view WHERE _id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006c }
            java.lang.String r1 = java.lang.Long.toString(r8)     // Catch:{ all -> 0x006c }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "GET_CHAT_BY_ROW_ID_SQL"
            android.database.Cursor r3 = r4.A0A(r3, r0, r2)     // Catch:{ all -> 0x006c }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            X.1DL r2 = r7.A01     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "jid_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0060 }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x0060 }
            com.whatsapp.jid.Jid r1 = r2.A0B(r0)     // Catch:{ all -> 0x0060 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x0060 }
            X.1BI r6 = X.C22931Dv.A00(r1)     // Catch:{ all -> 0x0060 }
            r7.A04(r6, r8)     // Catch:{ all -> 0x0060 }
        L_0x0059:
            r3.close()     // Catch:{ all -> 0x006c }
            r5.close()
            return r6
        L_0x0060:
            r1 = move-exception
            if (r3 == 0) goto L_0x006b
            r3.close()     // Catch:{ all -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x006c }
        L_0x006b:
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0071 }
            throw r1
        L_0x0071:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0076:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r1
        L_0x0079:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A0B(long):X.1BI");
    }

    public AnonymousClass1BI A0C(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("chat_row_id");
        if (columnIndex >= 0) {
            return A0B(cursor.getLong(columnIndex));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03ca, code lost:
        if (r1 == null) goto L_0x03cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A0D() {
        /*
            r76 = this;
            java.lang.String r1 = "ChatStore/getChats"
            X.1Ez r34 = new X.1Ez
            r0 = r34
            r0.<init>((java.lang.String) r1)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            r6 = r76
            X.0ve r2 = r6.A04
            X.0vf r1 = X.C18040vf.A01
            r0 = 12272(0x2ff0, float:1.7197E-41)
            boolean r39 = X.C18020vd.A05(r1, r2, r0)
            java.lang.String r0 = X.C28811aw.A00
            X.1Cd r0 = r6.A03     // Catch:{ all -> 0x0496 }
            X.1at r66 = r0.get()     // Catch:{ all -> 0x0496 }
            r0 = r66
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x048c }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x048c }
            if (r39 == 0) goto L_0x0034
            java.lang.String r2 = X.C28811aw.A02     // Catch:{ all -> 0x048c }
        L_0x002c:
            java.lang.String r1 = "GET_CHATS_SQL"
            r0 = 0
            android.database.Cursor r2 = r3.A0A(r2, r1, r0)     // Catch:{ all -> 0x048c }
            goto L_0x0037
        L_0x0034:
            java.lang.String r2 = X.C28811aw.A01     // Catch:{ all -> 0x048c }
            goto L_0x002c
        L_0x0037:
            java.lang.String r0 = "_id"
            int r48 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "raw_string"
            int r13 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "display_message_row_id"
            int r47 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "display_message_sort_id"
            int r46 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_read_message_row_id"
            int r45 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_read_message_sort_id"
            int r44 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_read_receipt_sent_message_row_id"
            int r43 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_read_receipt_sent_message_sort_id"
            int r42 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "archived"
            int r41 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "sort_timestamp"
            int r40 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "spam_detection"
            int r49 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "plaintext_disabled"
            int r50 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "vcard_ui_dismissed"
            int r51 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "change_number_notified_message_row_id"
            int r52 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "subject"
            int r53 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_message_row_id"
            int r54 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_message_sort_id"
            int r55 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_important_message_row_id"
            int r56 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "unseen_earliest_message_received_time"
            int r57 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "unseen_message_count"
            int r58 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "unseen_missed_calls_count"
            int r59 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "unseen_row_count"
            int r60 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "unseen_message_reaction_count"
            int r61 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "unseen_comment_message_count"
            int r62 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_message_reaction_row_id"
            int r63 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "last_seen_message_reaction_row_id"
            int r38 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "deleted_message_row_id"
            int r37 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "deleted_starred_message_row_id"
            int r36 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "deleted_categories_message_row_id"
            int r35 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "deleted_categories_starred_message_row_id"
            int r33 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "deleted_message_categories"
            int r32 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "show_group_description"
            int r31 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "ephemeral_expiration"
            int r30 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "ephemeral_setting_timestamp"
            int r29 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "ephemeral_displayed_exemptions"
            int r28 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "ephemeral_disappearing_messages_initiator"
            int r27 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "unseen_important_message_count"
            int r26 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "group_type"
            int r25 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "growth_lock_level"
            int r24 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "growth_lock_expiration_ts"
            int r23 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "has_new_community_admin_dialog_been_acknowledged"
            int r22 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "history_sync_progress"
            int r21 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "hidden"
            int r12 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "chat_lock"
            int r20 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "chat_origin"
            int r19 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "participation_status"
            int r18 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "chat_encryption_state"
            int r15 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0480 }
            if (r39 == 0) goto L_0x03de
            java.lang.String r0 = "user"
            int r68 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "server"
            int r69 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "agent"
            int r70 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "device"
            int r71 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "type"
            int r72 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "jid_row_id"
            int r11 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0480 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x0480 }
            r10.<init>()     // Catch:{ all -> 0x0480 }
        L_0x018b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x03ec
            java.lang.String r1 = r2.getString(r13)     // Catch:{ all -> 0x0480 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x0480 }
            X.1BI r7 = r0.A02(r1)     // Catch:{ all -> 0x0480 }
            if (r7 != 0) goto L_0x01b6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0480 }
            r1.<init>()     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = "ChatStore/initialize/chats/could not parse raw chat jid: "
            r1.append(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = r2.getString(r13)     // Catch:{ all -> 0x0480 }
            r1.append(r0)     // Catch:{ all -> 0x0480 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0480 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0480 }
            goto L_0x018b
        L_0x01b6:
            boolean r0 = X.C22971Dz.A0a(r7)     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x018b
            int r0 = r2.getInt(r12)     // Catch:{ all -> 0x0480 }
            r4 = 1
            if (r0 == r4) goto L_0x018b
            boolean r0 = X.C22971Dz.A0V(r7)     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x018b
            if (r39 == 0) goto L_0x01e8
            boolean r0 = X.C22971Dz.A0X(r7)     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x01e8
            long r74 = r2.getLong(r11)     // Catch:{ all -> 0x0480 }
            X.1DL r0 = r6.A01     // Catch:{ all -> 0x0480 }
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r67 = com.whatsapp.jid.PhoneUserJid.class
            r64 = r0
            r65 = r2
            r73 = r13
            com.whatsapp.jid.Jid r0 = r64.A0D(r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)     // Catch:{ all -> 0x0480 }
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0     // Catch:{ all -> 0x0480 }
            r10.add(r0)     // Catch:{ all -> 0x0480 }
        L_0x01e8:
            X.1ci r3 = new X.1ci     // Catch:{ all -> 0x0480 }
            r3.<init>((X.AnonymousClass1BI) r7)     // Catch:{ all -> 0x0480 }
            r0 = r48
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0Y = r0     // Catch:{ all -> 0x0480 }
            r0 = r47
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0W = r0     // Catch:{ all -> 0x0480 }
            r0 = r46
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0X = r0     // Catch:{ all -> 0x0480 }
            r0 = r45
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0R = r0     // Catch:{ all -> 0x0480 }
            r0 = r44
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0S = r0     // Catch:{ all -> 0x0480 }
            r0 = r43
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0T = r0     // Catch:{ all -> 0x0480 }
            r0 = r42
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0U = r0     // Catch:{ all -> 0x0480 }
            r0 = r41
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r0 = 0
            if (r1 != r4) goto L_0x022f
            r0 = 1
        L_0x022f:
            r3.A0l = r0     // Catch:{ all -> 0x0480 }
            r0 = r40
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0Z = r0     // Catch:{ all -> 0x0480 }
            r0 = r49
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A06 = r0     // Catch:{ all -> 0x0480 }
            r0 = r50
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A01 = r0     // Catch:{ all -> 0x0480 }
            r0 = r51
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A0D = r0     // Catch:{ all -> 0x0480 }
            r0 = r52
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0E = r0     // Catch:{ all -> 0x0480 }
            r0 = r53
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0480 }
            r3.A0k = r0     // Catch:{ all -> 0x0480 }
            r0 = r54
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0P = r0     // Catch:{ all -> 0x0480 }
            r0 = r55
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0Q = r0     // Catch:{ all -> 0x0480 }
            r0 = r56
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0N = r0     // Catch:{ all -> 0x0480 }
            r16 = 0
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0283
            r0 = 1
            r3.A0N = r0     // Catch:{ all -> 0x0480 }
        L_0x0283:
            r0 = r57
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0a = r0     // Catch:{ all -> 0x0480 }
            r0 = r58
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A0A = r0     // Catch:{ all -> 0x0480 }
            r0 = r59
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A0B = r0     // Catch:{ all -> 0x0480 }
            r0 = r60
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A0C = r0     // Catch:{ all -> 0x0480 }
            r0 = r61
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A09 = r0     // Catch:{ all -> 0x0480 }
            r0 = r62
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A07 = r0     // Catch:{ all -> 0x0480 }
            r0 = r63
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            long r0 = (long) r0     // Catch:{ all -> 0x0480 }
            r3.A0O = r0     // Catch:{ all -> 0x0480 }
            r0 = r38
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            long r0 = (long) r0     // Catch:{ all -> 0x0480 }
            r3.A0V = r0     // Catch:{ all -> 0x0480 }
            r0 = r37
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0H = r0     // Catch:{ all -> 0x0480 }
            r4 = -9223372036854775808
            int r8 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r8 != 0) goto L_0x02d5
            r3.A0H = r4     // Catch:{ all -> 0x0480 }
        L_0x02d5:
            r0 = r36
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0I = r0     // Catch:{ all -> 0x0480 }
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x02e5
            r0 = -9223372036854775808
            r3.A0I = r0     // Catch:{ all -> 0x0480 }
        L_0x02e5:
            r0 = r32
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0480 }
            r3.A0j = r0     // Catch:{ all -> 0x0480 }
            r0 = r35
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0F = r0     // Catch:{ all -> 0x0480 }
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x02fd
            r0 = -9223372036854775808
            r3.A0F = r0     // Catch:{ all -> 0x0480 }
        L_0x02fd:
            r0 = r33
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r3.A0G = r0     // Catch:{ all -> 0x0480 }
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x030d
            r0 = -9223372036854775808
            r3.A0G = r0     // Catch:{ all -> 0x0480 }
        L_0x030d:
            r0 = r31
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r0 = 1
            if (r1 == r0) goto L_0x0317
            r0 = 0
        L_0x0317:
            r3.A0t = r0     // Catch:{ all -> 0x0480 }
            r0 = r21
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A04 = r0     // Catch:{ all -> 0x0480 }
            r0 = r20
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r0 = 0
            if (r1 <= 0) goto L_0x032b
            r0 = 1
        L_0x032b:
            r3.A0m = r0     // Catch:{ all -> 0x0480 }
            r0 = r19
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0480 }
            X.2Qs r1 = X.C29731cm.A00(r0)     // Catch:{ all -> 0x0480 }
            X.2Qs r0 = r3.A0b     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x033d
            r3.A0b = r1     // Catch:{ all -> 0x0480 }
        L_0x033d:
            int r1 = r2.getInt(r12)     // Catch:{ all -> 0x0480 }
            r0 = 0
            if (r1 <= 0) goto L_0x0345
            r0 = 1
        L_0x0345:
            r3.A0s = r0     // Catch:{ all -> 0x0480 }
            r0 = r27
            int r9 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r0 = r30
            int r8 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r0 = r29
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            r4 = r28
            int r5 = r2.getInt(r4)     // Catch:{ all -> 0x0480 }
            X.1cl r4 = new X.1cl     // Catch:{ all -> 0x0480 }
            r4.<init>(r8, r0, r9)     // Catch:{ all -> 0x0480 }
            r3.A0e = r4     // Catch:{ all -> 0x0480 }
            r3.A02 = r5     // Catch:{ all -> 0x0480 }
            r0 = r26
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A08 = r0     // Catch:{ all -> 0x0480 }
            r0 = r22
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r0 = 1
            if (r1 == r0) goto L_0x037a
            r0 = 0
        L_0x037a:
            r3.A0n = r0     // Catch:{ all -> 0x0480 }
            boolean r0 = r7 instanceof X.AnonymousClass1ED     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x03ad
            r0 = r7
            X.1ED r0 = (X.AnonymousClass1ED) r0     // Catch:{ all -> 0x0480 }
            int r0 = r0.A00     // Catch:{ all -> 0x0480 }
        L_0x0385:
            r3.A05 = r0     // Catch:{ all -> 0x0480 }
            r0 = r25
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r3.A03 = r0     // Catch:{ all -> 0x0480 }
            r0 = r24
            int r5 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            r0 = r23
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0480 }
            X.1cn r4 = new X.1cn     // Catch:{ all -> 0x0480 }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x0480 }
            r3.A0h = r4     // Catch:{ all -> 0x0480 }
            r0 = r18
            int r4 = r2.getInt(r0)     // Catch:{ all -> 0x0480 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0480 }
            goto L_0x03af
        L_0x03ad:
            r0 = 0
            goto L_0x0385
        L_0x03af:
            if (r0 == 0) goto L_0x03cc
            X.0z2 r0 = X.C29701cj.A01     // Catch:{ all -> 0x0480 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0480 }
        L_0x03b7:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x03dc
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0480 }
            r0 = r1
            X.1cj r0 = (X.C29701cj) r0     // Catch:{ all -> 0x0480 }
            int r0 = r0.status     // Catch:{ all -> 0x0480 }
            if (r0 != r4) goto L_0x03b7
        L_0x03c8:
            X.1cj r1 = (X.C29701cj) r1     // Catch:{ all -> 0x0480 }
            if (r1 != 0) goto L_0x03ce
        L_0x03cc:
            X.1cj r1 = X.C29701cj.UNSET     // Catch:{ all -> 0x0480 }
        L_0x03ce:
            r3.A0c = r1     // Catch:{ all -> 0x0480 }
            r0 = 0
            int r0 = X.AnonymousClass1Eu.A00(r2, r15, r0)     // Catch:{ all -> 0x0480 }
            r3.A00 = r0     // Catch:{ all -> 0x0480 }
            r14.put(r7, r3)     // Catch:{ all -> 0x0480 }
            goto L_0x018b
        L_0x03dc:
            r1 = 0
            goto L_0x03c8
        L_0x03de:
            r10 = 0
            r11 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            goto L_0x018b
        L_0x03ec:
            monitor-enter(r6)     // Catch:{ all -> 0x0480 }
            java.util.Set r0 = r14.entrySet()     // Catch:{ all -> 0x047a }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x047a }
        L_0x03f5:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x047a }
            if (r0 == 0) goto L_0x0413
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x047a }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x047a }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x047a }
            X.1BI r3 = (X.AnonymousClass1BI) r3     // Catch:{ all -> 0x047a }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x047a }
            X.1ci r0 = (X.C29691ci) r0     // Catch:{ all -> 0x047a }
            long r0 = r0.A0Y     // Catch:{ all -> 0x047a }
            r6.A04(r3, r0)     // Catch:{ all -> 0x047a }
            goto L_0x03f5
        L_0x0413:
            monitor-exit(r6)     // Catch:{ all -> 0x047a }
            if (r39 == 0) goto L_0x0470
            X.00H r0 = r6.A0D     // Catch:{ all -> 0x0480 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0480 }
            X.1Ln r7 = (X.C24751Ln) r7     // Catch:{ all -> 0x0480 }
            r0 = 0
            X.C18070vi.A0d(r10, r0)     // Catch:{ all -> 0x0480 }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x0470
            X.1Cd r0 = r7.A05     // Catch:{ all -> 0x0480 }
            r0.A06()     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A08     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x0470
            r10.size()     // Catch:{ all -> 0x0480 }
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0480 }
            r6.<init>()     // Catch:{ all -> 0x0480 }
            java.util.Iterator r8 = r10.iterator()     // Catch:{ all -> 0x0480 }
        L_0x043d:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0480 }
            if (r0 == 0) goto L_0x046d
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x0480 }
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ all -> 0x0480 }
            X.11S r0 = r7.A02     // Catch:{ all -> 0x0480 }
            boolean r0 = r0.A0O(r1)     // Catch:{ all -> 0x0480 }
            if (r0 != 0) goto L_0x043d
            X.1DL r0 = r7.A04     // Catch:{ all -> 0x0480 }
            long r4 = r0.A09(r1)     // Catch:{ all -> 0x0480 }
            java.lang.Object r3 = r7.A09     // Catch:{ all -> 0x0480 }
            monitor-enter(r3)     // Catch:{ all -> 0x0480 }
            java.util.Map r0 = r7.A0B     // Catch:{ all -> 0x047d }
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x047d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x047d }
            X.3Bk r0 = (X.C70523Bk) r0     // Catch:{ all -> 0x047d }
            if (r0 != 0) goto L_0x046b
            r6.add(r1)     // Catch:{ all -> 0x047d }
        L_0x046b:
            monitor-exit(r3)     // Catch:{ all -> 0x0480 }
            goto L_0x043d
        L_0x046d:
            X.C24751Ln.A02(r7, r6)     // Catch:{ all -> 0x0480 }
        L_0x0470:
            r2.close()     // Catch:{ all -> 0x048c }
            r66.close()     // Catch:{ all -> 0x0496 }
            r34.A02()
            return r14
        L_0x047a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x047a }
            goto L_0x047f
        L_0x047d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0480 }
        L_0x047f:
            throw r0     // Catch:{ all -> 0x0480 }
        L_0x0480:
            r1 = move-exception
            if (r2 == 0) goto L_0x048b
            r2.close()     // Catch:{ all -> 0x0487 }
            goto L_0x048b
        L_0x0487:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x048c }
        L_0x048b:
            throw r1     // Catch:{ all -> 0x048c }
        L_0x048c:
            r1 = move-exception
            r66.close()     // Catch:{ all -> 0x0491 }
            goto L_0x0495
        L_0x0491:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0496 }
        L_0x0495:
            throw r1     // Catch:{ all -> 0x0496 }
        L_0x0496:
            r0 = move-exception
            r34.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A0D():java.util.HashMap");
    }

    public void A0E(long j, long j2) {
        if (j >= 0) {
            C28791au A052 = this.A03.A05();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("created_timestamp", Long.valueOf(j2));
                ((C28801av) A052).A02.A02(contentValues, "chat", "_id=?", "setCreatedTime", new String[]{Long.toString(j)});
                A052.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a8, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ad, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r5.A02.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b5, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C29691ci r6) {
        /*
            r5 = this;
            java.lang.String r3 = "/"
            monitor-enter(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            android.content.ContentValues r4 = r6.A06()     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "last_read_message_row_id"
            long r0 = r6.A0R     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "last_read_message_sort_id"
            long r0 = r6.A0S     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "last_message_row_id"
            long r0 = r6.A0P     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "last_message_sort_id"
            long r0 = r6.A0Q     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "last_important_message_row_id"
            long r0 = r6.A0N     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "unseen_important_message_count"
            int r0 = r6.A08     // Catch:{ all -> 0x00a4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "unseen_message_reaction_count"
            int r0 = r6.A09     // Catch:{ all -> 0x00a4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "unseen_comment_message_count"
            int r0 = r6.A07     // Catch:{ all -> 0x00a4 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "last_message_reaction_row_id"
            long r0 = r6.A0O     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "last_seen_message_reaction_row_id"
            long r0 = r6.A0V     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            int r2 = r5.A05(r4, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            java.lang.String r0 = "ChatStore/setchatseen "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            X.1BI r0 = r6.A0u     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            r1.append(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            java.lang.String r0 = r6.A0B()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            r1.append(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            r1.append(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            return
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00ac, Error | RuntimeException -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x00ac:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r5.A02
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A0H(X.1ci):void");
    }

    public void A0I(C29691ci r5) {
        try {
            int A052 = A05(r5.A06(), r5);
            StringBuilder sb = new StringBuilder();
            sb.append("ChatStore/setchatunseen ");
            sb.append(r5.A0u);
            sb.append("/");
            sb.append(r5.A0B());
            sb.append("/");
            sb.append(A052);
            Log.i(sb.toString());
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A02.A03();
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        }
    }

    public void A0K(AnonymousClass1BI r10) {
        C28791au A052 = this.A03.A05();
        try {
            C41851xA BD0 = A052.BD0();
            try {
                long A092 = this.A01.A09(r10);
                ((C28801av) A052).A02.A0F("DELETE FROM chat WHERE jid_row_id = ?", "DELETE_CHAT_BY_JID_ROW_ID", new String[]{String.valueOf(A092)});
                this.A00.A0L(r10);
                synchronized (this) {
                    Long l = (Long) this.A08.remove(r10);
                    if (l != null) {
                        this.A09.remove(l);
                    }
                }
                BD0.A00();
                BD0.close();
                A052.close();
            } catch (Throwable th) {
                BD0.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A052.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public void A0L(AnonymousClass1BI r5, long j) {
        C29691ci A0A2 = this.A00.A0A(r5);
        if (A0A2 != null && A0A2.A0V <= j && j >= 1) {
            A0A2.A0V = j;
            if (A0A2.A0O < j) {
                A0A2.A0O = j;
            }
            A0A2.A09 = 0;
            A0G(A0A2);
        }
    }

    public void CBp(C171598ry r10) {
        Cursor A0A2;
        if (C18020vd.A05(C18040vf.A02, this.A04, 3911)) {
            C28781at A042 = this.A03.get();
            try {
                A0A2 = ((C28801av) A042).A02.A0A("SELECT hidden, COUNT(1) as chat_count FROM chat_view GROUP BY hidden", "GET_CHAT_COUNT_BY_HIDDEN_COLUMN", (String[]) null);
                int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("hidden");
                int columnIndexOrThrow2 = A0A2.getColumnIndexOrThrow("chat_count");
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (A0A2.moveToNext()) {
                    if (A0A2.isNull(columnIndexOrThrow)) {
                        i3 = A0A2.getInt(columnIndexOrThrow2);
                    } else if (A0A2.getInt(columnIndexOrThrow) == 0) {
                        i2 = A0A2.getInt(columnIndexOrThrow2);
                    } else if (A0A2.getInt(columnIndexOrThrow) == 1) {
                        i = A0A2.getInt(columnIndexOrThrow2);
                    }
                }
                A0A2.close();
                A042.close();
                r10.A05 = Long.valueOf((long) i2);
                r10.A06 = Long.valueOf((long) i);
                r10.A07 = Long.valueOf((long) i3);
                return;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public AnonymousClass1LW(AnonymousClass190 r2, AnonymousClass11P r3, AnonymousClass1CJ r4, AnonymousClass1DL r5, C22611Cn r6, AnonymousClass1Cd r7, C18030ve r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        this.A0B = r3;
        this.A04 = r8;
        this.A01 = r5;
        this.A0A = r2;
        this.A00 = r4;
        this.A05 = r11;
        this.A07 = r9;
        this.A0C = r10;
        this.A0D = r12;
        this.A03 = r7;
        this.A06 = r13;
        this.A02 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        if (r4 != null) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long A01(X.AnonymousClass1BI r10) {
        /*
            r9 = this;
            long r1 = r9.A00(r10)
            r7 = -1
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            X.1DL r0 = r9.A01
            long r5 = r0.A09(r10)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatStore/insertHiddenChat/jid row id not found; jid="
            r1.append(r0)
            r1.append(r10)
        L_0x0021:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0028:
            r1 = -1
        L_0x002a:
            r5 = 0
            java.lang.String r4 = "; rowId="
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x004c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "ChatStore/getOrCreateChatRowId/error inserting a hidden chat; jid="
            r3.append(r0)
            r3.append(r10)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x004c:
            return r1
        L_0x004d:
            X.00H r0 = r9.A05
            java.lang.Object r0 = r0.get()
            X.9oM r0 = (X.C192419oM) r0
            X.2Qs r4 = r0.A00(r10)
            boolean r0 = X.C22971Dz.A0T(r10)
            if (r0 == 0) goto L_0x0085
            X.2Qs r0 = X.C49502Qs.CTWA
            if (r4 == r0) goto L_0x0088
            X.0ve r2 = r9.A04
            r1 = 11653(0x2d85, float:1.633E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0085
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatStore/insertHiddenChat/disallow creating chat; jid="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = "; origin="
            r1.append(r0)
            r1.append(r4)
            goto L_0x0021
        L_0x0085:
            r0 = 3
            if (r4 == 0) goto L_0x0089
        L_0x0088:
            r0 = 4
        L_0x0089:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>(r0)
            java.lang.String r1 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r3.put(r1, r0)
            java.lang.String r1 = "hidden"
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3.put(r1, r2)
            if (r4 == 0) goto L_0x00aa
            java.lang.String r1 = "chat_origin"
            java.lang.String r0 = r4.origin
            r3.put(r1, r0)
        L_0x00aa:
            java.lang.String r0 = "chat_encryption_state"
            r3.put(r0, r2)
            java.lang.String r0 = "insertHiddenChatIntoChatTable"
            r9.A02(r4, r10, r0)
            X.1Cd r0 = r9.A03     // Catch:{ SQLiteConstraintException -> 0x012c }
            X.1au r5 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x012c }
            X.1xA r4 = r5.BD1()     // Catch:{ all -> 0x0122 }
            X.00H r0 = r9.A06     // Catch:{ all -> 0x0118 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0118 }
            X.30e r0 = (X.C676130e) r0     // Catch:{ all -> 0x0118 }
            boolean r0 = r0.A02(r3, r10)     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x00e8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r1.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "ChatStore/insertHiddenChat/failed to fill column values for chatJid="
            r1.append(r0)     // Catch:{ all -> 0x0118 }
            r1.append(r10)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0118 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
            r4.close()     // Catch:{ all -> 0x0122 }
            r5.close()     // Catch:{ SQLiteConstraintException -> 0x012c }
            goto L_0x0028
        L_0x00e8:
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0118 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = "chat"
            java.lang.String r0 = "insertHiddenChat/INSERT_CHAT"
            long r1 = r2.A06(r1, r0, r3)     // Catch:{ all -> 0x0118 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0110
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r3.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "ChatStore/insertHiddenChat/unable to insert for chatJid="
            r3.append(r0)     // Catch:{ all -> 0x0118 }
            r3.append(r10)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0118 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
            r4.A00()     // Catch:{ all -> 0x0118 }
        L_0x0110:
            r4.close()     // Catch:{ all -> 0x0122 }
            r5.close()     // Catch:{ SQLiteConstraintException -> 0x012c }
            goto L_0x002a
        L_0x0118:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x011d }
            goto L_0x0121
        L_0x011d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0122 }
        L_0x0121:
            throw r1     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0127 }
            goto L_0x012b
        L_0x0127:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x012c }
        L_0x012b:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x012c }
        L_0x012c:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatStore/insertHiddenChat/row already exists but can't be read; jid="
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r1 = -1
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LW.A01(X.1BI):long");
    }

    private void A02(C49502Qs r5, AnonymousClass1BI r6, String str) {
        if (C22971Dz.A0T(r6)) {
            AnonymousClass190 r3 = this.A0A;
            StringBuilder sb = new StringBuilder();
            sb.append("ChatStore/logForLidThread/");
            sb.append(str);
            sb.append("/");
            sb.append(r5);
            r3.A0G(sb.toString(), r6.toString(), true);
        }
    }

    public static void A03(AnonymousClass1LW r0, AnonymousClass1BI r1, Object[] objArr, int i) {
        objArr[i] = String.valueOf(r0.A09(r1));
    }

    public long A08(ContentValues contentValues, C49502Qs r10, AnonymousClass1BI r11) {
        C41851xA BD1;
        if (C22971Dz.A0T(r11) && r10 != C49502Qs.CTWA) {
            if (C18020vd.A05(C18040vf.A02, this.A04, 11653)) {
                StringBuilder sb = new StringBuilder();
                sb.append("ChatStore/insertIntoChatTable/disallow creating chat; chatJid=");
                sb.append(r11);
                sb.append("; origin=");
                sb.append(r10);
                Log.e(sb.toString());
                return -1;
            }
        }
        A02(r10, r11, "insertNonHiddenIntoChatTable");
        C28791au A052 = this.A03.A05();
        try {
            BD1 = A052.BD1();
            contentValues.put("hidden", 0);
            if (!((C676130e) this.A06.get()).A02(contentValues, r11)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ChatStore/insertIntoChatTable/failed to fill column values for chatJid=");
                sb2.append(r11);
                Log.e(sb2.toString());
                BD1.close();
                A052.close();
                return -1;
            }
            long A053 = ((C28801av) A052).A02.A05("chat", "insertIntoChatTable/INSERT_CHAT", contentValues);
            if (A053 != -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ChatStore/insertIntoChatTable/unable to insert for chatJid=");
                sb3.append(r11);
                Log.e(sb3.toString());
                BD1.A00();
            }
            BD1.close();
            A052.close();
            return A053;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0M(ContentValues contentValues, C29691ci r8) {
        if (A05(contentValues, r8) != 0) {
            return true;
        }
        AnonymousClass1DL r0 = this.A01;
        AnonymousClass1BI r4 = r8.A0u;
        contentValues.put("jid_row_id", Long.valueOf(r0.A09(r4)));
        long A082 = A08(contentValues, r8.A0b, r4);
        r8.A0Y = A082;
        if (A082 == -1) {
            return false;
        }
        return true;
    }
}
