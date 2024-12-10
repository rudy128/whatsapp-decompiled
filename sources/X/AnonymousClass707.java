package X;

import android.content.Context;
import android.os.Environment;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.707  reason: invalid class name */
public class AnonymousClass707 {
    public final C35551mQ A00;
    public final AnonymousClass1NM A01;
    public final AnonymousClass19D A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;

    public synchronized void A03(String str) {
        C35551mQ r6 = this.A00;
        r6.A06();
        File A002 = A00(this, (File) null, C18020vd.A00(C18040vf.A02, this.A03, 5553));
        if (A002 == null || A002.length() > 5242880) {
            r6.A05(str);
        } else {
            C35551mQ.A00(r6, A002, str, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (r6.length() > 5242880) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.util.Pair A01(android.content.Context r28, android.util.Pair r29, X.AnonymousClass1EC r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.List r34, long r35, long r37, boolean r39) {
        /*
            r27 = this;
            r5 = r27
            monitor-enter(r5)
            X.1mQ r8 = r5.A00     // Catch:{ all -> 0x009d }
            r8.A06()     // Catch:{ all -> 0x009d }
            r14 = 0
            r4 = 1
            r25 = 0
            r18 = r14
            r19 = r14
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r15 = r33
            r17 = r34
            r20 = r35
            r22 = r37
            r16 = r14
            r24 = r4
            r26 = r25
            java.lang.String r3 = r8.A04(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r25, r26)     // Catch:{ all -> 0x009d }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x009d }
            java.io.File r1 = r9.getFilesDir()     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "debuginfo.json"
            java.io.File r7 = X.C17880vN.A0e(r1, r0)     // Catch:{ all -> 0x009d }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x004c
            boolean r0 = r7.delete()     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "debug-builder/infofile/error"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009d }
            r7 = r14
            goto L_0x006d
        L_0x004c:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0066 }
            r2.<init>(r7, r4)     // Catch:{ IOException -> 0x0066 }
            byte[] r0 = r3.getBytes()     // Catch:{ all -> 0x005c }
            r2.write(r0)     // Catch:{ all -> 0x005c }
            r2.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006d
        L_0x005c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0066 }
        L_0x0065:
            throw r1     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "debug-builder/infofile/skip"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x009d }
            r7 = r14
        L_0x006d:
            r0 = 3
            java.io.File r6 = A00(r5, r7, r0)     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x0080
            long r3 = r6.length()     // Catch:{ all -> 0x009d }
            r1 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            r0 = 0
            if (r1 != 0) goto L_0x0097
            boolean r13 = r5.A04()     // Catch:{ all -> 0x009d }
            r10 = 3
            r12 = r25
            r9 = r7
            r11 = r12
            java.io.File r6 = r8.A03(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x009d }
            if (r39 == 0) goto L_0x0097
            java.lang.String r0 = r8.A05(r14)     // Catch:{ all -> 0x009d }
        L_0x0097:
            android.util.Pair r0 = X.C108945cZ.A0N(r6, r0)     // Catch:{ all -> 0x009d }
            monitor-exit(r5)
            return r0
        L_0x009d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass707.A01(android.content.Context, android.util.Pair, X.1EC, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, long, boolean):android.util.Pair");
    }

    public String A02(Context context) {
        AnonymousClass00H r4 = this.A04;
        long A022 = ((AnonymousClass11Z) r4.get()).A02();
        long[] jArr = new long[1];
        if (this.A01.A03(new C143697El(jArr, this, 2))) {
            jArr[0] = C108975cc.A07(r4);
        }
        return this.A00.A04(context, (Pair) null, (AnonymousClass1EC) null, "blocked_ban_appeals", (String) null, (String) null, Environment.getExternalStorageState(), (String) null, (List) null, (List) null, (JSONObject) null, jArr[0], A022, true, false, false);
    }

    public boolean A04() {
        AnonymousClass19D r1 = this.A02;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r1, 2500) || C18020vd.A05(r2, this.A03, 1536)) {
            return true;
        }
        return false;
    }

    public AnonymousClass707(AnonymousClass1NM r1, AnonymousClass19D r2, C18030ve r3, C35551mQ r4, AnonymousClass00H r5) {
        this.A03 = r3;
        this.A04 = r5;
        this.A02 = r2;
        this.A00 = r4;
        this.A01 = r1;
    }

    public static File A00(AnonymousClass707 r6, File file, int i) {
        Log.rotate();
        Log.compress();
        return r6.A00.A03(file, i, true, true, r6.A04());
    }
}
