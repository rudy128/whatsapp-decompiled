package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONObject;

/* renamed from: X.197  reason: invalid class name */
public abstract class AnonymousClass197 {
    public static volatile AnonymousClass196 A00;

    public static String A00(Context context, C17930vS r7, Throwable th) {
        String str;
        FileOutputStream fileOutputStream;
        boolean z;
        String str2 = C223919s.A00;
        try {
            boolean A02 = C17980vY.A02(context);
            File A01 = r7.A01();
            if (A02) {
                String A012 = C17980vY.A01(context);
                C17960vV.A07(A012);
                StringBuilder sb = new StringBuilder();
                sb.append("crash_sentinel_");
                sb.append(A012);
                str = sb.toString();
            } else {
                str = "crash_sentinel";
            }
            File file = new File(A01, str);
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            Throwable th2 = th;
            while (true) {
                if (!(th2 instanceof OutOfMemoryError)) {
                    th2 = th2.getCause();
                    if (th2 == null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            Throwable th3 = th;
            while (th3.getCause() != null) {
                th3 = th3.getCause();
            }
            String obj = th3.toString();
            fileOutputStream.write(new JSONObject().put("isOom", z).put("deepestThrowable", obj).put("versionName", "2.24.24.78").put("mobileBuildId", 670735092).put("stacktrace", Log.getStackTraceInfo(th)).put("sessionId", str2).toString().getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            try {
                Log.e("Unable to create crash sentinel file", e);
            } catch (Throwable th4) {
                AnonymousClass196 r0 = A00;
                if (r0 != null) {
                    r0.A02();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            AnonymousClass0DT.A00(th, th5);
        }
        AnonymousClass196 r02 = A00;
        if (r02 != null) {
            r02.A02();
        }
        return str2;
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0062, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
        r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        X.C18070vi.A0d(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006f, code lost:
        if (r2.A02() == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        r2 = (int) ((java.lang.System.currentTimeMillis() - 1733338680000L) / 86400000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        r2 = 120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        if (r2 <= r7) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        r7 = X.C19620yd.A00;
        r5 = r5.A00;
        r1 = new android.os.StatFs(r5.A00().getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a8, code lost:
        if ((((long) r1.getBlockSize()) * ((long) r1.getAvailableBlocks())) <= (r7 * 3)) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        if ((!X.C24161Jc.A01()) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b2, code lost:
        r0 = new java.io.File(r5.A00().getPath()).listFiles(new X.C21335AiL(6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c9, code lost:
        if (r0 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cc, code lost:
        if (r0.length <= 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ce, code lost:
        r0 = "OOMHandler/hprof dump conditions not met";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d5, code lost:
        if (X.C17970vW.A0G(r6) != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        android.os.Debug.dumpHprofData(java.lang.String.format(java.util.Locale.US, "%s/dump.hprof", new java.lang.Object[]{r5.A00().getPath()}));
        com.whatsapp.util.Log.i("OOMHandler/dump successful");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        com.whatsapp.util.Log.w("OOMHandler/IOException trying to write dump", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        r0 = "OOMHandler/hprof dump not allowed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fe, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r7 = r4.A05;
        r2 = r4.A02;
        r6 = r4.A04;
        r3 = r4.A0E;
        r5 = new X.C197749xC(r4.A06);
        r7 = X.C18020vd.A00(X.C18040vf.A02, r7, 1360);
        r1 = new java.lang.StringBuilder();
        r1.append("OOM/WhatsAppWorkers state: ");
        r1.append(X.AnonymousClass10J.A05.toString());
        com.whatsapp.util.Log.i(r1.toString());
        r1 = new java.lang.StringBuilder();
        r1.append("OOM/WhatsAppWorkers/LatencySensitive state: ");
        r1.append(X.AnonymousClass10J.A08.toString());
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.lang.String r9, java.lang.Thread.UncaughtExceptionHandler r10, java.lang.Thread r11, java.lang.Throwable r12) {
        /*
            java.lang.String r0 = "UNCAUGHT EXCEPTION"
            com.whatsapp.util.Log.e(r0, r12)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.196 r4 = A00     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            if (r4 == 0) goto L_0x011a
            r1 = r12
        L_0x000a:
            boolean r0 = r1 instanceof java.lang.OutOfMemoryError     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            if (r0 == 0) goto L_0x005a
            X.0ve r7 = r4.A05     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.194 r2 = r4.A02     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.11C r6 = r4.A04     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.193 r3 = r4.A0E     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.0vS r0 = r4.A06     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.9xC r5 = new X.9xC     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r1 = 1360(0x550, float:1.906E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            int r7 = X.C18020vd.A00(r0, r7, r1)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r1.<init>()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = "OOM/WhatsAppWorkers state: "
            r1.append(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.10P r0 = X.AnonymousClass10J.A05     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r1.append(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r1.<init>()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = "OOM/WhatsAppWorkers/LatencySensitive state: "
            r1.append(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.util.concurrent.ThreadPoolExecutor r0 = X.AnonymousClass10J.A08     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r1.append(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            goto L_0x0062
        L_0x005a:
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            if (r1 != 0) goto L_0x000a
            goto L_0x0101
        L_0x0062:
            if (r3 == 0) goto L_0x0067
            r3.A00()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
        L_0x0067:
            r0 = 0
            X.C18070vi.A0d(r2, r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            boolean r0 = r2.A02()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            if (r0 == 0) goto L_0x0072
            goto L_0x0082
        L_0x0072:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r2 = 1733338680000(0x19393094ac0, double:8.56383094396E-312)
            long r0 = r0 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r2
            int r2 = (int) r0     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            goto L_0x0084
        L_0x0082:
            r2 = 120(0x78, float:1.68E-43)
        L_0x0084:
            if (r2 <= r7) goto L_0x0087
            goto L_0x00fc
        L_0x0087:
            long r7 = X.C19620yd.A00     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.0vS r5 = r5.A00     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.io.File r0 = r5.A00()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            android.os.StatFs r1 = new android.os.StatFs     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            int r0 = r1.getBlockSize()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            int r0 = r1.getAvailableBlocks()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            long r2 = r2 * r0
            r0 = 3
            long r7 = r7 * r0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ce
            boolean r0 = X.C24161Jc.A01()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ce
            java.io.File r0 = r5.A00()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r1 = 6
            X.AiL r0 = new X.AiL     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.io.File[] r0 = r2.listFiles(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.length     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            if (r0 <= 0) goto L_0x00d1
        L_0x00ce:
            java.lang.String r0 = "OOMHandler/hprof dump conditions not met"
            goto L_0x00fe
        L_0x00d1:
            boolean r0 = X.C17970vW.A0G(r6)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            if (r0 != 0) goto L_0x00ce
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ IOException -> 0x00f6 }
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x00f6 }
            java.io.File r0 = r5.A00()     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r1 = r0.getPath()     // Catch:{ IOException -> 0x00f6 }
            r0 = 0
            r2[r0] = r1     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r0 = "%s/dump.hprof"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)     // Catch:{ IOException -> 0x00f6 }
            android.os.Debug.dumpHprofData(r0)     // Catch:{ IOException -> 0x00f6 }
            java.lang.String r0 = "OOMHandler/dump successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x00f6 }
            goto L_0x0101
        L_0x00f6:
            java.lang.String r0 = "OOMHandler/IOException trying to write dump"
            com.whatsapp.util.Log.w(r0, r12)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            goto L_0x0101
        L_0x00fc:
            java.lang.String r0 = "OOMHandler/hprof dump not allowed"
        L_0x00fe:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
        L_0x0101:
            X.00H r0 = r4.A08     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.9kG r2 = (X.C190029kG) r2     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.00H r0 = r4.A09     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            X.1O1 r1 = (X.AnonymousClass1O1) r1     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.util.HashSet r0 = r1.A00     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            java.lang.String r0 = X.AnonymousClass1O1.A00(r1, r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
            r2.A00(r9, r0)     // Catch:{ Exception -> 0x011a, all -> 0x0121 }
        L_0x011a:
            com.whatsapp.util.Log.flush()
            r10.uncaughtException(r11, r12)
            return
        L_0x0121:
            r0 = move-exception
            com.whatsapp.util.Log.flush()
            r10.uncaughtException(r11, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass197.A02(java.lang.String, java.lang.Thread$UncaughtExceptionHandler, java.lang.Thread, java.lang.Throwable):void");
    }

    public static void A01(AnonymousClass196 r0) {
        A00 = r0;
    }
}
