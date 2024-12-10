package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1La  reason: invalid class name and case insensitive filesystem */
public class C24621La {
    public final AnonymousClass10I A00;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public final AnonymousClass11P A03;
    public final AnonymousClass1LY A04;
    public final AnonymousClass1Cd A05;

    public void A03(String str) {
        C28791au A052 = this.A05.A05();
        try {
            C28341Zz.A01(((C28801av) A052).A02, str);
            A052.close();
            synchronized (this.A01) {
                this.A02.remove(str);
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C24621La(AnonymousClass11P r2, AnonymousClass1LY r3, AnonymousClass1Cd r4, AnonymousClass10I r5) {
        this.A03 = r2;
        this.A00 = r5;
        this.A04 = r3;
        this.A05 = r4;
    }

    public int A00(String str, int i) {
        String A022 = A02(str);
        if (A022 == null) {
            return i;
        }
        return Integer.parseInt(A022);
    }

    public long A01(String str, long j) {
        String A022 = A02(str);
        if (A022 == null) {
            return j;
        }
        return Long.parseLong(A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r7 = r10.A05.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = ((X.C28801av) r7).A02.A0A("SELECT value FROM props WHERE key = ?", "GET_PROP_VALUE", new java.lang.String[]{r11});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r2.moveToNext() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r4 = r2.getString(r2.getColumnIndexOrThrow("value"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.put(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r10.A04.A01("PropsMessageStore/getProp", android.os.SystemClock.uptimeMillis() - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        if (r2 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0074, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(java.lang.String r11) {
        /*
            r10 = this;
            long r8 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r5 = r10.A01
            monitor-enter(r5)
            java.util.Map r6 = r10.A02     // Catch:{ all -> 0x0077 }
            boolean r0 = r6.containsKey(r11)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r6.get(r11)     // Catch:{ all -> 0x0077 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0077 }
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            return r0
        L_0x0017:
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            X.1Cd r0 = r10.A05     // Catch:{ all -> 0x0075 }
            X.1at r7 = r0.get()     // Catch:{ all -> 0x0075 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006b }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "SELECT value FROM props WHERE key = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x006b }
            r0 = 0
            r1[r0] = r11     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "GET_PROP_VALUE"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x006b }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "value"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x005f }
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            r2.close()     // Catch:{ all -> 0x006b }
            r7.close()     // Catch:{ all -> 0x0075 }
            monitor-enter(r5)
            r6.put(r11, r4)     // Catch:{ all -> 0x005c }
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            X.1LY r3 = r10.A04
            java.lang.String r2 = "PropsMessageStore/getProp"
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r8
            r3.A01(r2, r0)
            return r4
        L_0x005c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            r1 = move-exception
            if (r2 == 0) goto L_0x006a
            r2.close()     // Catch:{ all -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x006b }
        L_0x006a:
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0075 }
        L_0x0074:
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r0 = move-exception
            throw r0
        L_0x0077:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24621La.A02(java.lang.String):java.lang.String");
    }

    public void A04(String str, int i) {
        A06(str, String.valueOf(i));
    }

    public void A05(String str, long j) {
        A06(str, String.valueOf(j));
    }

    public void A06(String str, String str2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C28791au A052 = this.A05.A05();
        try {
            C28341Zz.A03(((C28801av) A052).A02, str, str2, "PropsMessageStore");
            A052.close();
            synchronized (this.A01) {
                this.A02.put(str, str2);
            }
            this.A04.A01("PropsMessageStore/setProp", SystemClock.uptimeMillis() - uptimeMillis);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }
}
