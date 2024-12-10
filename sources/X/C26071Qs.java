package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Qs  reason: invalid class name and case insensitive filesystem */
public class C26071Qs {
    public final C002100z A00 = new C002100z(2500);
    public final AnonymousClass1DL A01;
    public final AnonymousClass1Cd A02;

    public synchronized void A02(UserJid userJid) {
        Long A002 = A00(userJid);
        long j = 1;
        if (A002 != null) {
            j = 1 + A002.longValue();
        }
        long A09 = this.A01.A09(userJid);
        C28791au A05 = this.A02.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("user_jid_row_id", Long.valueOf(A09));
            contentValues.put("version", Long.valueOf(j));
            ((C28801av) A05).A02.A09("primary_device_version", "INSERT_PRIMARY_DEVICE_VERSION_SQL", contentValues, 5);
            C002100z r1 = this.A00;
            synchronized (r1) {
                r1.A05(userJid);
            }
            A05.close();
        } catch (Throwable th) {
            try {
                A05.close();
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = ((X.C28801av) r3).A02.A0A("SELECT version FROM primary_device_version WHERE user_jid_row_id = ?", "GET_PRIMARY_DEVICE_VERSION_SQL", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r2.moveToNext() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = r2.getLong(r2.getColumnIndexOrThrow("version"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = java.lang.Long.valueOf(r0);
        r4.A08(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        return null;
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
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0068, code lost:
        throw r1;
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
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r5 = new java.lang.String[]{java.lang.String.valueOf(r6.A01.A09(r7))};
        r3 = r6.A02.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long A00(com.whatsapp.jid.UserJid r7) {
        /*
            r6 = this;
            X.00z r4 = r6.A00
            monitor-enter(r4)
            java.lang.Object r0 = r4.A04(r7)     // Catch:{ all -> 0x0073 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            return r0
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            X.1DL r0 = r6.A01
            long r0 = r0.A09(r7)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 0
            r5[r0] = r1
            X.1Cd r0 = r6.A02
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0069 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "SELECT version FROM primary_device_version WHERE user_jid_row_id = ?"
            java.lang.String r0 = "GET_PRIMARY_DEVICE_VERSION_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x0069 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "version"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005d }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x005d }
            monitor-enter(r4)     // Catch:{ all -> 0x005d }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0052 }
            r4.A08(r7, r0)     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            r2.close()     // Catch:{ all -> 0x0069 }
            r3.close()
            return r0
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x0055:
            r2.close()     // Catch:{ all -> 0x0069 }
            r3.close()
            r0 = 0
            return r0
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
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0073 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26071Qs.A00(com.whatsapp.jid.UserJid):java.lang.Long");
    }

    public HashMap A01(Set set) {
        Long valueOf;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        C002100z r6 = this.A00;
        synchronized (r6) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                UserJid userJid = (UserJid) it.next();
                if (r6.A04(userJid) != null) {
                    hashMap.put(userJid, (Long) r6.A04(userJid));
                } else {
                    arrayList.add(userJid);
                }
            }
        }
        String[] strArr = new String[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            strArr[i] = String.valueOf(this.A01.A09((Jid) it2.next()));
            i++;
        }
        C443423b r1 = new C443423b(strArr, 975);
        C28781at A04 = this.A02.get();
        try {
            Iterator it3 = r1.iterator();
            while (it3.hasNext()) {
                String[] strArr2 = (String[]) it3.next();
                C23141Ev r3 = ((C28801av) A04).A02;
                int length = strArr2.length;
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT user_jid_row_id, version FROM primary_device_version WHERE user_jid_row_id IN ");
                sb.append(AnonymousClass1H2.A00(length));
                Cursor A0A = r3.A0A(sb.toString(), "GET_PRIMARY_DEVICE_VERSIONS_SQL", strArr2);
                try {
                    int columnIndexOrThrow = A0A.getColumnIndexOrThrow("user_jid_row_id");
                    int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("version");
                    while (A0A.moveToNext()) {
                        UserJid userJid2 = (UserJid) this.A01.A0E(UserJid.class, A0A.getLong(columnIndexOrThrow));
                        C17960vV.A07(userJid2);
                        long j = A0A.getLong(columnIndexOrThrow2);
                        synchronized (r6) {
                            valueOf = Long.valueOf(j);
                            r6.A08(userJid2, valueOf);
                        }
                        hashMap.put(userJid2, valueOf);
                    }
                    A0A.close();
                } catch (Throwable th) {
                    if (A0A != null) {
                        A0A.close();
                    }
                    throw th;
                }
            }
            A04.close();
            return hashMap;
        } catch (Throwable th2) {
            try {
                A04.close();
                throw th2;
            } catch (Throwable th3) {
                AnonymousClass0DT.A00(th2, th3);
                throw th2;
            }
        }
    }

    public C26071Qs(AnonymousClass1DL r3, AnonymousClass1Cd r4) {
        this.A01 = r3;
        this.A02 = r4;
    }
}
