package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1MN  reason: invalid class name */
public class AnonymousClass1MN {
    public final AnonymousClass1DL A00;
    public final AnonymousClass1Cd A01;
    public final C18030ve A02;
    public final AnonymousClass1MK A03;
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Object A05 = new Object();

    public void A06(UserJid userJid) {
        C41851xA BD0;
        String[] strArr = {Long.toString(this.A00.A09(userJid))};
        C28791au A052 = this.A01.A05();
        try {
            BD0 = A052.BD0();
            ((C28801av) A052).A02.A04("user_device_info", "user_jid_row_id=?", "deleteUserDeviceInfo/DELETE_USER_DEVICE_INFO", strArr);
            BD0.A00();
            A052.BJ7(new C70733Ch(this, userJid, 5));
            BD0.close();
            A052.close();
            return;
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

    public static C62512rW A00(Cursor cursor) {
        int i;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("raw_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("expected_timestamp");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("expected_ts_last_device_job_ts");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("expected_timestamp_update_ts");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("account_encryption_type");
        if (cursor.isNull(columnIndexOrThrow6)) {
            i = 0;
        } else {
            i = cursor.getInt(columnIndexOrThrow6);
        }
        return new C62512rW(cursor.getInt(columnIndexOrThrow), i, cursor.getLong(columnIndexOrThrow2), cursor.getLong(columnIndexOrThrow3), cursor.getLong(columnIndexOrThrow4), cursor.getLong(columnIndexOrThrow5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = ((X.C28801av) r3).A02.A0A("SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type FROM user_device_info WHERE user_jid_row_id = ?", "GET_USER_DEVICE_INFO_SQL", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r2.moveToNext() == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r1 = A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r5.containsKey(r8) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r5.remove(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r5.put(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006f, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r6 = new java.lang.String[]{java.lang.Long.toString(r7.A00.A09(r8))};
        r3 = r7.A01.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C62512rW A01(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.lang.Object r4 = r7.A05
            monitor-enter(r4)
            java.util.Map r5 = r7.A04     // Catch:{ all -> 0x0073 }
            boolean r0 = r5.containsKey(r8)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r5.get(r8)     // Catch:{ all -> 0x0073 }
            X.2rW r0 = (X.C62512rW) r0     // Catch:{ all -> 0x0073 }
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            return r0
        L_0x0013:
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            X.1DL r0 = r7.A00
            long r0 = r0.A09(r8)
            java.lang.String r1 = java.lang.Long.toString(r0)
            r0 = 0
            r6[r0] = r1
            X.1Cd r0 = r7.A01
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0069 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type FROM user_device_info WHERE user_jid_row_id = ?"
            java.lang.String r0 = "GET_USER_DEVICE_INFO_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r6)     // Catch:{ all -> 0x0069 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0042
            X.2rW r1 = A00(r2)     // Catch:{ all -> 0x005d }
            goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            r2.close()     // Catch:{ all -> 0x0069 }
            r3.close()
            monitor-enter(r4)
            boolean r0 = r5.containsKey(r8)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0055
            r5.remove(r8)     // Catch:{ all -> 0x005a }
        L_0x0053:
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            goto L_0x0059
        L_0x0055:
            r5.put(r8, r1)     // Catch:{ all -> 0x005a }
            goto L_0x0053
        L_0x0059:
            return r1
        L_0x005a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005a }
            throw r0
        L_0x005d:
            r1 = move-exception
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0069 }
        L_0x0068:
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x006e }
            throw r1
        L_0x006e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0073:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MN.A01(com.whatsapp.jid.UserJid):X.2rW");
    }

    public static HashMap A02(AnonymousClass1MN r26, Set set) {
        Cursor A0A;
        int i;
        Set<UserJid> set2 = set;
        HashSet hashSet = new HashSet(set2);
        HashMap hashMap = new HashMap();
        AnonymousClass1MN r5 = r26;
        synchronized (r5.A05) {
            for (UserJid userJid : set2) {
                Map map = r5.A04;
                if (map.containsKey(userJid)) {
                    hashMap.put(userJid, (C62512rW) map.get(userJid));
                    hashSet.remove(userJid);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        if (!hashSet.isEmpty()) {
            String[] strArr = new String[hashSet.size()];
            Iterator it = hashSet.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                strArr[i2] = String.valueOf(r5.A00.A09((Jid) it.next()));
                i2++;
            }
            C443423b r1 = new C443423b(strArr, 975);
            C28781at A042 = r5.A01.get();
            try {
                Iterator it2 = r1.iterator();
                while (it2.hasNext()) {
                    String[] strArr2 = (String[]) it2.next();
                    C23141Ev r6 = ((C28801av) A042).A02;
                    int length = strArr2.length;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type, user_jid_row_id FROM user_device_info WHERE user_jid_row_id IN ");
                    sb.append(AnonymousClass1H2.A00(length));
                    A0A = r6.A0A(sb.toString(), "GET_USERS_DEVICE_INFO_SQL", strArr2);
                    int columnIndexOrThrow = A0A.getColumnIndexOrThrow("raw_id");
                    int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("timestamp");
                    int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("expected_timestamp");
                    int columnIndexOrThrow4 = A0A.getColumnIndexOrThrow("expected_ts_last_device_job_ts");
                    int columnIndexOrThrow5 = A0A.getColumnIndexOrThrow("expected_timestamp_update_ts");
                    int columnIndexOrThrow6 = A0A.getColumnIndexOrThrow("account_encryption_type");
                    while (A0A.moveToNext()) {
                        UserJid userJid2 = (UserJid) r5.A00.A0E(UserJid.class, A0A.getLong(A0A.getColumnIndexOrThrow("user_jid_row_id")));
                        if (A0A.isNull(columnIndexOrThrow6)) {
                            i = 0;
                        } else {
                            i = A0A.getInt(columnIndexOrThrow6);
                        }
                        hashMap2.put(userJid2, new C62512rW(A0A.getInt(columnIndexOrThrow), i, A0A.getLong(columnIndexOrThrow2), A0A.getLong(columnIndexOrThrow3), A0A.getLong(columnIndexOrThrow4), A0A.getLong(columnIndexOrThrow5)));
                    }
                    A0A.close();
                }
                A042.close();
                r5.A04.putAll(hashMap2);
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        }
        hashMap.putAll(hashMap2);
        for (Object next : set2) {
            if (!hashMap.containsKey(next)) {
                hashMap.put(next, (Object) null);
            }
        }
        return hashMap;
        throw th;
    }

    public C62512rW A03(UserJid userJid) {
        AnonymousClass1E1 A032;
        if (userJid instanceof PhoneUserJid) {
            if (C18020vd.A05(C18040vf.A02, this.A02, 7088) && (A032 = this.A03.A03((PhoneUserJid) userJid, "getDeviceInfo", "user_device_info")) != null) {
                return A01(A032);
            }
        }
        return A01(userJid);
    }

    public HashSet A04() {
        Cursor A0A;
        UserJid A042;
        C28781at A043 = this.A01.get();
        try {
            A0A = ((C28801av) A043).A02.A0A("SELECT raw_string FROM user_device_info JOIN jid ON user_device_info.user_jid_row_id=jid._id WHERE account_encryption_type=1", "GET_HOSTED_ACCOUNT_JIDS", (String[]) null);
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("raw_string");
            HashSet hashSet = new HashSet();
            while (A0A.moveToNext()) {
                String string = A0A.getString(columnIndexOrThrow);
                if (!TextUtils.isEmpty(string) && (A042 = UserJid.Companion.A04(string)) != null) {
                    hashSet.add(A042);
                }
            }
            A0A.close();
            A043.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                A043.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A05(C62512rW r14, UserJid userJid) {
        C41851xA BD0;
        long A09 = this.A00.A09(userJid);
        C28791au A052 = this.A01.A05();
        try {
            BD0 = A052.BD0();
            ContentValues contentValues = new ContentValues();
            contentValues.put("raw_id", Integer.valueOf(r14.A01));
            contentValues.put("timestamp", Long.valueOf(r14.A05));
            contentValues.put("expected_timestamp", Long.valueOf(r14.A02));
            contentValues.put("expected_ts_last_device_job_ts", Long.valueOf(r14.A04));
            contentValues.put("expected_timestamp_update_ts", Long.valueOf(r14.A03));
            contentValues.put("account_encryption_type", Integer.valueOf(r14.A00));
            C23141Ev r7 = ((C28801av) A052).A02;
            if (r7.A02(contentValues, "user_device_info", "user_jid_row_id = ?", "UPDATE_USER_DEVICE_INFO", new String[]{String.valueOf(A09)}) != 1) {
                contentValues.put("user_jid_row_id", Long.valueOf(A09));
                r7.A06("user_device_info", "INSERT_USER_DEVICE_INFO", contentValues);
            }
            BD0.A00();
            A052.BJ7(new C70733Ch(this, userJid, 4));
            BD0.close();
            A052.close();
            return;
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

    public AnonymousClass1MN(AnonymousClass1DL r2, AnonymousClass1Cd r3, C18030ve r4, AnonymousClass1MK r5) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
    }
}
