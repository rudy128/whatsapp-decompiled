package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0xx  reason: invalid class name and case insensitive filesystem */
public class C19280xx implements C19250xu, C19260xv, C19270xw {
    public static final C19290xy A05 = new C19290xy("proto");
    public final C19210xq A00;
    public final C19130xi A01;
    public final C19130xi A02;
    public final C18140vp A03;
    public final C19230xs A04;

    public static Long A00(SQLiteDatabase sQLiteDatabase, C19450yE r11) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        C19460yF r112 = (C19460yF) r11;
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{r112.A01, String.valueOf(C61072p4.A00(r112.A00))}));
        byte[] bArr = r112.A02;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            Long l = null;
            if (query.moveToNext()) {
                l = Long.valueOf(query.getLong(0));
            }
            return l;
        } finally {
            query.close();
        }
    }

    public static String A01(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AnonymousClass8R9) ((C180259Lt) it.next())).A00);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.9tB] */
    public static ArrayList A02(SQLiteDatabase sQLiteDatabase, C19450yE r23, C19280xx r24, int i) {
        NullPointerException th;
        C19290xy r6;
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        C19450yE r4 = r23;
        Long A002 = A00(sQLiteDatabase2, r4);
        if (A002 == null) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{A002.toString()}, (String) null, (String) null, (String) null, String.valueOf(i));
        while (query.moveToNext()) {
            try {
                boolean z = false;
                long j = query.getLong(0);
                if (query.getInt(7) != 0) {
                    z = true;
                }
                ? obj = new Object();
                obj.A05 = new HashMap();
                String string = query.getString(1);
                if (string != null) {
                    obj.A04 = string;
                    obj.A02 = Long.valueOf(query.getLong(2));
                    obj.A03 = Long.valueOf(query.getLong(3));
                    String string2 = query.getString(4);
                    if (string2 == null) {
                        r6 = A05;
                    } else {
                        r6 = new C19290xy(string2);
                    }
                    if (z) {
                        bArr = query.getBlob(5);
                    } else {
                        int i2 = 0;
                        query = r24.A04().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num");
                        ArrayList arrayList2 = new ArrayList();
                        while (query.moveToNext()) {
                            byte[] blob = query.getBlob(0);
                            arrayList2.add(blob);
                            i2 += blob.length;
                        }
                        bArr = new byte[i2];
                        int i3 = 0;
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            byte[] bArr2 = (byte[]) arrayList2.get(i4);
                            int length = bArr2.length;
                            System.arraycopy(bArr2, 0, bArr, i3, length);
                            i3 += length;
                        }
                    }
                    obj.A00 = new C193289pq(r6, bArr);
                    if (!query.isNull(6)) {
                        obj.A01 = Integer.valueOf(query.getInt(6));
                    }
                    arrayList.add(new AnonymousClass8R9(obj.A00(), r4, j));
                } else {
                    th = new NullPointerException("Null transportName");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, C19280xx r10) {
        C19130xi r8 = r10.A01;
        long BaO = r8.BaO();
        while (true) {
            try {
                sQLiteDatabase.beginTransaction();
                return;
            } catch (SQLiteDatabaseLockedException e) {
                if (r8.BaO() >= 10000 + BaO) {
                    throw new AnonymousClass3ER("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public SQLiteDatabase A04() {
        C19230xs r9 = this.A04;
        r9.getClass();
        C19130xi r8 = this.A01;
        long BaO = r8.BaO();
        while (true) {
            try {
                return r9.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (r8.BaO() >= 10000 + BaO) {
                    throw new AnonymousClass3ER("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public void close() {
        this.A04.close();
    }

    public C19280xx(C19210xq r1, C19230xs r2, C19130xi r3, C19130xi r4, C18140vp r5) {
        this.A04 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = r1;
        this.A03 = r5;
    }

    public void CDf(AnonymousClass9JT r9, String str, long j) {
        Cursor rawQuery;
        SQLiteDatabase A042 = A04();
        A042.beginTransaction();
        try {
            rawQuery = A042.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(r9.number_)});
            boolean z = false;
            if (rawQuery.getCount() > 0) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            rawQuery.close();
            if (!valueOf.booleanValue()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(r9.number_));
                contentValues.put("events_dropped_count", Long.valueOf(j));
                A042.insert("log_event_dropped", (String) null, contentValues);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
                sb.append(j);
                sb.append(" WHERE log_source = ? AND reason = ?");
                A042.execSQL(sb.toString(), new String[]{str, Integer.toString(r9.number_)});
            }
            A042.setTransactionSuccessful();
            A042.endTransaction();
        } catch (Throwable th) {
            A042.endTransaction();
            throw th;
        }
    }

    public void CDh(C19450yE r9, long j) {
        SQLiteDatabase A042 = A04();
        A042.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("next_request_ms", Long.valueOf(j));
            C19460yF r92 = (C19460yF) r9;
            String str = r92.A01;
            C19300xz r4 = r92.A00;
            if (A042.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(C61072p4.A00(r4))}) < 1) {
                contentValues.put("backend_name", str);
                contentValues.put("priority", Integer.valueOf(C61072p4.A00(r4)));
                A042.insert("transport_contexts", (String) null, contentValues);
            }
            A042.setTransactionSuccessful();
        } finally {
            A042.endTransaction();
        }
    }
}
