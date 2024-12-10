package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.192  reason: invalid class name */
public class AnonymousClass192 extends AnonymousClass190 implements AnonymousClass191 {
    public AnonymousClass11J A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C222018z A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass181 A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass11C A06;
    public final AnonymousClass118 A07;
    public final C19830z4 A08;
    public final AnonymousClass18K A09;
    public final C220418j A0A;
    public final AnonymousClass11W A0B;
    public final AnonymousClass10I A0C;
    public final ConcurrentHashMap A0D = new ConcurrentHashMap();
    public final C219317y A0E;
    public final C17930vS A0F;

    public static String A03(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_version_code", 242478021);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("memclass", i);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("android_version", Build.VERSION.RELEASE);
            jSONObject.put("app_version_name", "2.24.24.78");
            jSONObject.put("app", "Whatsapp");
            jSONObject.put("process_name", "Main Process");
            jSONObject.put("uid", "1");
            jSONObject.putOpt("dump_cause", str);
            jSONObject.put("platform_abi", C62912sC.A02());
            return jSONObject.toString();
        } catch (JSONException e) {
            return String.format(Locale.US, "{ 'error' : '%s' }", new Object[]{e.getMessage()});
        }
    }

    public static String A04(String str, String str2, String str3, Map map, long j, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return new JSONObject().put("logFilePath", str2).put("fromParam", str).put("forcedUpload", z2).put("detailedException", z).put("tagsString", str3).put("attachments", jSONObject).put("timeMillis", j).toString();
    }

    public /* synthetic */ void Blg() {
    }

    public static File A00(AnonymousClass192 r2) {
        File file = new File(r2.A0F.A00(), "Crashes");
        file.mkdirs();
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0053, code lost:
        if (r5 == null) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003f A[SYNTHETIC, Splitter:B:31:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC, Splitter:B:36:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A02(java.io.File r7, java.io.File r8) {
        /*
            java.lang.String r3 = "app/CrashLogs/copyFileToCache: Could not close stream"
            r6 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0035, all -> 0x0068 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0035, all -> 0x0068 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0032, all -> 0x002f }
            r4.<init>(r8)     // Catch:{ IOException -> 0x0032, all -> 0x002f }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x002d }
        L_0x0011:
            int r1 = r5.read(r2)     // Catch:{ IOException -> 0x002d }
            if (r1 <= 0) goto L_0x001c
            r0 = 0
            r4.write(r2, r0, r1)     // Catch:{ IOException -> 0x002d }
            goto L_0x0011
        L_0x001c:
            r5.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0024:
            r4.close()     // Catch:{ IOException -> 0x0028 }
            return r8
        L_0x0028:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
            return r8
        L_0x002d:
            r1 = move-exception
            goto L_0x0038
        L_0x002f:
            r1 = move-exception
            r4 = r6
            goto L_0x0055
        L_0x0032:
            r1 = move-exception
            r4 = r6
            goto L_0x0038
        L_0x0035:
            r1 = move-exception
            r4 = r6
            r5 = r6
        L_0x0038:
            java.lang.String r0 = "app/CrashLogs/copyFileToCache: Could not copy file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0047
            r5.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0047:
            if (r4 == 0) goto L_0x0051
            r4.close()     // Catch:{ IOException -> 0x004d }
            return r6
        L_0x004d:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x0051:
            return r6
        L_0x0052:
            r1 = move-exception
            if (r5 == 0) goto L_0x005d
        L_0x0055:
            r5.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x005d:
            if (r4 == 0) goto L_0x0069
            r4.close()     // Catch:{ IOException -> 0x0063 }
            throw r1
        L_0x0063:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
            throw r1
        L_0x0068:
            r1 = move-exception
        L_0x0069:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass192.A02(java.io.File, java.io.File):java.io.File");
    }

    public static String A05(HashSet hashSet) {
        StringBuilder sb = new StringBuilder();
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021d, code lost:
        if (r8.A06.nextInt(r7.A00) == 0) goto L_0x021f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.AnonymousClass3EZ r14, X.AnonymousClass192 r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Map r19, boolean r20) {
        /*
            X.2G1 r4 = new X.2G1
            r4.<init>()
            r6 = r16
            r4.A04 = r6
            r0 = r17
            r4.A01 = r0
            r0 = r18
            r4.A02 = r0
            r0 = 670735092(0x27fa9af4, double:3.313871664E-315)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.A03 = r0
            r18 = r14
            if (r20 == 0) goto L_0x003e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Throwable r1 = r18.getCause()
            if (r1 == 0) goto L_0x0051
            r2.append(r1)
            java.lang.String r0 = "\n"
            r2.append(r0)
            java.lang.String r0 = X.C22781De.A00(r1)
        L_0x0035:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.A00 = r0
        L_0x003e:
            r3 = r15
            X.18K r0 = r15.A09
            r0.CC4(r4)
            X.18z r8 = r15.A02
            java.util.Set r0 = X.C222018z.A07
            boolean r0 = r0.contains(r6)
            r11 = 1
            if (r0 != 0) goto L_0x021f
            monitor-enter(r8)
            goto L_0x0056
        L_0x0051:
            java.lang.String r0 = X.C22781De.A00(r18)
            goto L_0x0035
        L_0x0056:
            android.content.SharedPreferences r4 = r8.A00     // Catch:{ all -> 0x02a9 }
            if (r4 != 0) goto L_0x0064
            X.0vc r1 = r8.A05     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = "critical_event_client_prefs"
            android.content.SharedPreferences r4 = r1.A05(r0)     // Catch:{ all -> 0x02a9 }
            r8.A00 = r4     // Catch:{ all -> 0x02a9 }
        L_0x0064:
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x01ed
            r2 = 242478021(0xe73ebc5, float:3.0065581E-30)
            X.C17960vV.A07(r4)     // Catch:{ all -> 0x02a9 }
            r0 = -1
            java.lang.String r1 = "build_version"
            int r0 = r4.getInt(r1, r0)     // Catch:{ all -> 0x02a9 }
            java.lang.String r4 = "critical_event_client_config"
            if (r2 == r0) goto L_0x009f
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x02a9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x02a9 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r4)     // Catch:{ all -> 0x02a9 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)     // Catch:{ all -> 0x02a9 }
            boolean r2 = r0.commit()     // Catch:{ all -> 0x02a9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a9 }
            r1.<init>()     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = "CriticalEventConfigManager/updateConfigFromAbProp/clearing client config due to app upgrade "
            r1.append(r0)     // Catch:{ all -> 0x02a9 }
            r1.append(r2)     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02a9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02a9 }
        L_0x009f:
            X.0ve r2 = r8.A04     // Catch:{ all -> 0x02a9 }
            r1 = 414(0x19e, float:5.8E-43)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02a9 }
            java.lang.String r2 = X.C18020vd.A01(r0, r2, r1)     // Catch:{ all -> 0x02a9 }
            android.content.SharedPreferences r1 = r8.A00     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = ""
            java.lang.String r14 = r1.getString(r4, r0)     // Catch:{ all -> 0x02a9 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x02a9 }
            r5.<init>()     // Catch:{ all -> 0x02a9 }
            java.lang.String r13 = ";"
            java.lang.String[] r15 = r2.split(r13)     // Catch:{ all -> 0x02a9 }
            int r12 = r15.length     // Catch:{ all -> 0x02a9 }
            if (r12 <= 0) goto L_0x00ff
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a9 }
            r9 = 3888000000(0xe7be2c00, double:1.920927231E-314)
            long r0 = r0 + r9
            r10 = 0
        L_0x00ca:
            r7 = r15[r10]     // Catch:{ all -> 0x02a9 }
            java.lang.String r2 = ":"
            java.lang.String[] r7 = r7.split(r2)     // Catch:{ all -> 0x02a9 }
            int r9 = r7.length     // Catch:{ all -> 0x02a9 }
            r2 = 2
            if (r9 != r2) goto L_0x00fa
            r9 = 0
            r2 = r7[r9]     // Catch:{ all -> 0x02a9 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02a9 }
            if (r2 != 0) goto L_0x00fa
            r2 = r7[r11]     // Catch:{ all -> 0x02a9 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02a9 }
            if (r2 != 0) goto L_0x00fa
            r9 = r7[r9]     // Catch:{ all -> 0x02a9 }
            r7 = r7[r11]     // Catch:{ all -> 0x02a9 }
            r2 = -1
            int r7 = X.C20099A7c.A01(r7, r2)     // Catch:{ all -> 0x02a9 }
            if (r7 < r11) goto L_0x00fa
            X.2lx r2 = new X.2lx     // Catch:{ all -> 0x02a9 }
            r2.<init>(r9, r7, r0)     // Catch:{ all -> 0x02a9 }
            r5.add(r2)     // Catch:{ all -> 0x02a9 }
        L_0x00fa:
            int r10 = r10 + 1
            if (r10 >= r12) goto L_0x00ff
            goto L_0x00ca
        L_0x00ff:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x02a9 }
            r2.<init>()     // Catch:{ all -> 0x02a9 }
            java.lang.String[] r13 = r14.split(r13)     // Catch:{ all -> 0x02a9 }
            int r12 = r13.length     // Catch:{ all -> 0x02a9 }
            r10 = 0
        L_0x010a:
            if (r10 >= r12) goto L_0x0156
            r1 = r13[r10]     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = ":"
            java.lang.String[] r14 = r1.split(r0)     // Catch:{ all -> 0x02a9 }
            int r1 = r14.length     // Catch:{ all -> 0x02a9 }
            r0 = 3
            if (r1 != r0) goto L_0x0153
            r1 = 0
            r0 = r14[r1]     // Catch:{ all -> 0x02a9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x0153
            r0 = r14[r11]     // Catch:{ all -> 0x02a9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x0153
            r15 = 2
            r0 = r14[r15]     // Catch:{ all -> 0x02a9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x0153
            r9 = r14[r1]     // Catch:{ all -> 0x02a9 }
            r1 = r14[r11]     // Catch:{ all -> 0x02a9 }
            r0 = -1
            int r7 = X.C20099A7c.A01(r1, r0)     // Catch:{ all -> 0x02a9 }
            if (r7 < r11) goto L_0x0153
            r14 = r14[r15]     // Catch:{ all -> 0x02a9 }
            r0 = -1
            long r0 = X.C20099A7c.A04(r14, r0)     // Catch:{ all -> 0x02a9 }
            r15 = 1
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 < 0) goto L_0x0153
            X.2lx r14 = new X.2lx     // Catch:{ all -> 0x02a9 }
            r14.<init>(r9, r7, r0)     // Catch:{ all -> 0x02a9 }
            r2.add(r14)     // Catch:{ all -> 0x02a9 }
        L_0x0153:
            int r10 = r10 + 1
            goto L_0x010a
        L_0x0156:
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x02a9 }
            r10.<init>()     // Catch:{ all -> 0x02a9 }
            r8.A02 = r10     // Catch:{ all -> 0x02a9 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x02a9 }
            r12.<init>()     // Catch:{ all -> 0x02a9 }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x02a9 }
        L_0x0166:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02a9 }
            if (r0 == 0) goto L_0x0178
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02a9 }
            X.2lx r0 = (X.C59222lx) r0     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x02a9 }
            r12.add(r0)     // Catch:{ all -> 0x02a9 }
            goto L_0x0166
        L_0x0178:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x02a9 }
            r9.<init>()     // Catch:{ all -> 0x02a9 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x02a9 }
            r7.<init>()     // Catch:{ all -> 0x02a9 }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ all -> 0x02a9 }
        L_0x0186:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x02a9 }
            if (r0 == 0) goto L_0x01a1
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x02a9 }
            X.2lx r2 = (X.C59222lx) r2     // Catch:{ all -> 0x02a9 }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x02a9 }
            boolean r0 = r12.contains(r1)     // Catch:{ all -> 0x02a9 }
            if (r0 == 0) goto L_0x0186
            r7.add(r2)     // Catch:{ all -> 0x02a9 }
            r9.add(r1)     // Catch:{ all -> 0x02a9 }
            goto L_0x0186
        L_0x01a1:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x02a9 }
        L_0x01a5:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02a9 }
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x02a9 }
            X.2lx r2 = (X.C59222lx) r2     // Catch:{ all -> 0x02a9 }
            java.lang.String r1 = r2.A02     // Catch:{ all -> 0x02a9 }
            boolean r0 = r9.contains(r1)     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x01a5
            r7.add(r2)     // Catch:{ all -> 0x02a9 }
            r9.add(r1)     // Catch:{ all -> 0x02a9 }
            goto L_0x01a5
        L_0x01c0:
            r10.addAll(r7)     // Catch:{ all -> 0x02a9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a9 }
            r2.<init>()     // Catch:{ all -> 0x02a9 }
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x02a9 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x02a9 }
        L_0x01ce:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02a9 }
            if (r0 == 0) goto L_0x01dc
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02a9 }
            r2.append(r0)     // Catch:{ all -> 0x02a9 }
            goto L_0x01ce
        L_0x01dc:
            android.content.SharedPreferences r0 = r8.A00     // Catch:{ all -> 0x02a9 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x02a9 }
            android.content.SharedPreferences$Editor r0 = r1.putString(r4, r0)     // Catch:{ all -> 0x02a9 }
            r0.apply()     // Catch:{ all -> 0x02a9 }
        L_0x01ed:
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x02a9 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x02a9 }
            monitor-exit(r8)
            java.util.Iterator r9 = r0.iterator()
        L_0x01f7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r7 = r9.next()
            X.2lx r7 = (X.C59222lx) r7
            java.lang.String r0 = r7.A02
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x01f7
            long r4 = java.lang.System.currentTimeMillis()
            long r1 = r7.A01
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f7
            java.util.Random r1 = r8.A06
            int r0 = r7.A00
            int r0 = r1.nextInt(r0)
            if (r0 != 0) goto L_0x02ac
        L_0x021f:
            java.lang.String r1 = "UNCAUGHT EXCEPTION"
            r0 = r18
            com.whatsapp.util.Log.e(r1, r0)
            X.C22781De.A01()
            java.lang.String r6 = r18.getMessage()
            X.C17960vV.A07(r6)
            monitor-enter(r8)
            java.util.Set r7 = r8.A01     // Catch:{ all -> 0x02a9 }
            if (r7 != 0) goto L_0x025e
            X.0ve r2 = r8.A04     // Catch:{ all -> 0x02a9 }
            r1 = 426(0x1aa, float:5.97E-43)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x02a9 }
            java.lang.String r1 = X.C18020vd.A01(r0, r2, r1)     // Catch:{ all -> 0x02a9 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x02a9 }
            r7.<init>()     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = ";"
            java.lang.String[] r5 = r1.split(r0)     // Catch:{ all -> 0x02a9 }
            int r4 = r5.length     // Catch:{ all -> 0x02a9 }
            r2 = 0
        L_0x024c:
            if (r2 >= r4) goto L_0x025c
            r1 = r5[r2]     // Catch:{ all -> 0x02a9 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x0259
            r7.add(r1)     // Catch:{ all -> 0x02a9 }
        L_0x0259:
            int r2 = r2 + 1
            goto L_0x024c
        L_0x025c:
            r8.A01 = r7     // Catch:{ all -> 0x02a9 }
        L_0x025e:
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x02a9 }
            monitor-exit(r8)
            java.util.Iterator r1 = r7.iterator()
        L_0x0266:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0279
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0266
            return
        L_0x0279:
            X.10I r2 = r3.A0C     // Catch:{ Exception -> 0x0288 }
            r1 = 27
            X.3Bw r0 = new X.3Bw     // Catch:{ Exception -> 0x0288 }
            r4 = r19
            r0.<init>(r3, r4, r1)     // Catch:{ Exception -> 0x0288 }
            r2.CGF(r0)     // Catch:{ Exception -> 0x0288 }
            return
        L_0x0288:
            r2 = move-exception
            java.lang.String r0 = "crashlogs/upload/failed"
            com.whatsapp.util.Log.e(r0, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "wa-worker-error-"
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 1
            A08(r3, r1, r0)
            return
        L_0x02a9:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x02ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CRITICAL EVENT = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ":"
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass192.A07(X.3EZ, X.192, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }

    public static void A08(AnonymousClass192 r3, String str, boolean z) {
        if (z) {
            AnonymousClass2G1 r2 = new AnonymousClass2G1();
            r2.A04 = "crash-log-upload-failure";
            r2.A01 = str;
            r2.A02 = null;
            r2.A03 = String.valueOf(670735092);
            r3.A09.CC4(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ("log_files_upload".equals(r6) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(X.AnonymousClass192 r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.Map r30, boolean r31, boolean r32) {
        /*
            java.lang.String r5 = "report_source"
            r4 = 0
            r0 = r26
            r2 = r31
            java.lang.String r1 = "mp4_failure"
            r6 = r29
            boolean r1 = r1.equals(r6)     // Catch:{ IOException -> 0x01e9 }
            r13 = 1
            if (r1 != 0) goto L_0x001b
            java.lang.String r1 = "log_files_upload"
            boolean r1 = r1.equals(r6)     // Catch:{ IOException -> 0x01e9 }
            r3 = 1
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            java.lang.String r1 = "crashlog"
            r9 = r28
            java.lang.String r3 = r0.A0C(r9, r1, r3)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r1 = "no_upload"
            boolean r1 = r1.equals(r3)     // Catch:{ IOException -> 0x01e9 }
            if (r1 == 0) goto L_0x002f
            if (r31 != 0) goto L_0x002f
            return r4
        L_0x002f:
            X.33s r7 = new X.33s     // Catch:{ IOException -> 0x01e9 }
            r7.<init>(r0, r2)     // Catch:{ IOException -> 0x01e9 }
            X.18j r10 = r0.A0A     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r19 = "https://crashlogs.whatsapp.net/wa_clb_data"
            X.11W r8 = r0.A0B     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r20 = r8.A02()     // Catch:{ IOException -> 0x01e9 }
            X.181 r15 = r0.A04     // Catch:{ IOException -> 0x01e9 }
            r1 = 0
            r23 = 6
            X.A7N r14 = new X.A7N     // Catch:{ IOException -> 0x01e9 }
            r22 = r1
            r25 = r4
            r26 = r4
            r17 = r1
            r21 = r1
            r24 = r4
            r16 = r7
            r18 = r10
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r10 = "access_token"
            java.lang.String r7 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r14.A06(r10, r7)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r7 = "exception_and_logs"
            boolean r7 = r7.equals(r3)     // Catch:{ IOException -> 0x01e9 }
            if (r7 == 0) goto L_0x0082
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x01e9 }
            r10 = r27
            r7.<init>(r10)     // Catch:{ IOException -> 0x01e9 }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01e9 }
            r15.<init>(r7)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r16 = "file"
            java.lang.String r17 = r7.getName()     // Catch:{ IOException -> 0x01e9 }
            long r20 = r7.length()     // Catch:{ IOException -> 0x01e9 }
            r18 = 0
            r14.A05(r15, r16, r17, r18, r20)     // Catch:{ IOException -> 0x01e9 }
        L_0x0082:
            java.util.Set r7 = r30.entrySet()     // Catch:{ IOException -> 0x01e9 }
            java.util.Iterator r12 = r7.iterator()     // Catch:{ IOException -> 0x01e9 }
        L_0x008a:
            boolean r7 = r12.hasNext()     // Catch:{ IOException -> 0x01e9 }
            if (r7 == 0) goto L_0x00bc
            java.lang.Object r10 = r12.next()     // Catch:{ IOException -> 0x01e9 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ IOException -> 0x01e9 }
            java.lang.Object r7 = r10.getKey()     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x01e9 }
            java.lang.Object r11 = r10.getValue()     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x01e9 }
            java.io.File r10 = new java.io.File     // Catch:{ IOException -> 0x01e9 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x01e9 }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ IOException -> 0x01e9 }
            r15.<init>(r10)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r17 = r10.getName()     // Catch:{ IOException -> 0x01e9 }
            long r20 = r10.length()     // Catch:{ IOException -> 0x01e9 }
            r18 = 0
            r16 = r7
            r14.A05(r15, r16, r17, r18, r20)     // Catch:{ IOException -> 0x01e9 }
            goto L_0x008a
        L_0x00bc:
            java.lang.String r7 = "from_jid"
            r14.A07(r7, r9)     // Catch:{ IOException -> 0x01e9 }
            boolean r7 = r6.isEmpty()     // Catch:{ IOException -> 0x01e9 }
            if (r7 != 0) goto L_0x00cd
            java.lang.String r7 = "tags"
            r14.A07(r7, r6)     // Catch:{ IOException -> 0x01e9 }
        L_0x00cd:
            java.lang.String r7 = "true"
            if (r31 == 0) goto L_0x00d7
            java.lang.String r6 = "forced"
            r14.A07(r6, r7)     // Catch:{ IOException -> 0x01e9 }
        L_0x00d7:
            if (r32 == 0) goto L_0x00de
            java.lang.String r6 = "detailed"
            r14.A07(r6, r7)     // Catch:{ IOException -> 0x01e9 }
        L_0x00de:
            X.0z4 r10 = r0.A08     // Catch:{ IOException -> 0x01e9 }
            X.00H r12 = r10.A00     // Catch:{ IOException -> 0x01e9 }
            java.lang.Object r9 = r12.get()     // Catch:{ IOException -> 0x01e9 }
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r6 = "voip_call_id"
            java.lang.String r11 = r9.getString(r6, r1)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r6 = "session_id_for_voip_call_id"
            java.lang.String r9 = r9.getString(r6, r1)     // Catch:{ IOException -> 0x01e9 }
            X.0yx r6 = new X.0yx     // Catch:{ IOException -> 0x01e9 }
            r6.<init>(r11, r9)     // Catch:{ IOException -> 0x01e9 }
            java.lang.Object r11 = r6.A00     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x01e9 }
            java.lang.Object r9 = r6.A01     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r6 = X.C223919s.A00     // Catch:{ IOException -> 0x01e9 }
            boolean r6 = android.text.TextUtils.equals(r9, r6)     // Catch:{ IOException -> 0x01e9 }
            if (r6 != 0) goto L_0x0126
            if (r11 == 0) goto L_0x0112
            java.lang.String r6 = "call_id"
            r14.A07(r6, r11)     // Catch:{ IOException -> 0x01e9 }
        L_0x0112:
            java.lang.Object r9 = r12.get()     // Catch:{ IOException -> 0x01e9 }
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r6 = "voip_call_ab_test_bucket"
            java.lang.String r9 = r9.getString(r6, r1)     // Catch:{ IOException -> 0x01e9 }
            if (r9 == 0) goto L_0x0126
            java.lang.String r6 = "abtest_bucket"
            r14.A07(r6, r9)     // Catch:{ IOException -> 0x01e9 }
        L_0x0126:
            boolean r6 = r10.A2S()     // Catch:{ IOException -> 0x01e9 }
            if (r6 == 0) goto L_0x0131
            java.lang.String r6 = "md_opt_in"
            r14.A07(r6, r7)     // Catch:{ IOException -> 0x01e9 }
        L_0x0131:
            java.lang.String r6 = "exception_only"
            boolean r3 = r6.equals(r3)     // Catch:{ IOException -> 0x01e9 }
            if (r3 == 0) goto L_0x013e
            java.lang.String r3 = "exception_only_upload"
            r14.A07(r3, r7)     // Catch:{ IOException -> 0x01e9 }
        L_0x013e:
            java.lang.String r9 = "build_id"
            r6 = 670735092(0x27fa9af4, double:3.313871664E-315)
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x01e9 }
            r14.A07(r9, r3)     // Catch:{ IOException -> 0x01e9 }
            boolean r3 = X.C17970vW.A0D()     // Catch:{ IOException -> 0x01e9 }
            if (r3 == 0) goto L_0x01a1
            java.lang.String r3 = "fb.report_source"
            java.lang.String r3 = X.C17970vW.A03(r3)     // Catch:{ IOException -> 0x01e9 }
            X.C17960vV.A07(r3)     // Catch:{ IOException -> 0x01e9 }
            r14.A07(r5, r3)     // Catch:{ IOException -> 0x01e9 }
            X.0vS r6 = r0.A0F     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r3 = "errorreporting"
            java.io.File r7 = r6.A02(r3, r4)     // Catch:{ IOException -> 0x01e9 }
            boolean r3 = r7.exists()     // Catch:{ IOException -> 0x01e9 }
            if (r3 == 0) goto L_0x01a1
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x01e9 }
            r6.<init>(r7, r5)     // Catch:{ IOException -> 0x01e9 }
            boolean r3 = r6.exists()     // Catch:{ IOException -> 0x01e9 }
            if (r3 == 0) goto L_0x01a1
            java.lang.String r3 = "report_source_ref.txt"
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x01e9 }
            r5.<init>(r6, r3)     // Catch:{ IOException -> 0x01e9 }
            boolean r3 = r5.exists()     // Catch:{ IOException -> 0x01e9 }
            if (r3 == 0) goto L_0x01a1
            java.lang.String r6 = X.C64062u9.A07(r5)     // Catch:{ IOException -> 0x01e9 }
            if (r6 == 0) goto L_0x01a1
            boolean r3 = r6.isEmpty()     // Catch:{ IOException -> 0x01e9 }
            if (r3 != 0) goto L_0x01a1
            java.lang.String r3 = "report_source_ref="
            boolean r3 = r6.startsWith(r3)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r5 = "report_source_ref"
            if (r3 == 0) goto L_0x019e
            r3 = 18
            java.lang.String r6 = r6.substring(r3)     // Catch:{ IOException -> 0x01e9 }
        L_0x019e:
            r14.A07(r5, r6)     // Catch:{ IOException -> 0x01e9 }
        L_0x01a1:
            X.11C r3 = r0.A06     // Catch:{ IOException -> 0x01e9 }
            android.app.ActivityManager r3 = r3.A04()     // Catch:{ IOException -> 0x01e9 }
            if (r3 != 0) goto L_0x01b1
            java.lang.String r3 = "memorydumpuploadservice/get-upload-params am=null"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ IOException -> 0x01e9 }
            r6 = 16
            goto L_0x01b5
        L_0x01b1:
            int r6 = r3.getMemoryClass()     // Catch:{ IOException -> 0x01e9 }
        L_0x01b5:
            X.118 r5 = r0.A07     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r3 = X.C18170vs.A02()     // Catch:{ IOException -> 0x01e9 }
            X.AnonymousClass11W.A00(r5, r8, r3)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r5 = "android_hprof_extras"
            java.lang.String r3 = A03(r1, r6)     // Catch:{ IOException -> 0x01e9 }
            r14.A07(r5, r3)     // Catch:{ IOException -> 0x01e9 }
            int r5 = r14.A04(r1)     // Catch:{ IOException -> 0x01e9 }
            if (r5 <= 0) goto L_0x01d2
            r1 = 400(0x190, float:5.6E-43)
            if (r5 >= r1) goto L_0x01d2
            return r13
        L_0x01d2:
            r13 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01e9 }
            r3.<init>()     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r1 = "upload-response-"
            r3.append(r1)     // Catch:{ IOException -> 0x01e9 }
            r3.append(r5)     // Catch:{ IOException -> 0x01e9 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x01e9 }
            A08(r0, r1, r2)     // Catch:{ IOException -> 0x01e9 }
            return r13
        L_0x01e9:
            r3 = move-exception
            java.lang.String r1 = "app/CrashLogs/uploadCrashData: could not upload crash data"
            com.whatsapp.util.Log.w(r1, r3)
            java.lang.String r1 = "io-error"
            A08(r0, r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass192.A09(X.192, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, boolean):boolean");
    }

    public void Blf() {
        this.A01.post(new C70573Bq(this, 10));
    }

    public AnonymousClass192(C222018z r3, AnonymousClass11S r4, AnonymousClass181 r5, AnonymousClass11E r6, AnonymousClass11C r7, AnonymousClass118 r8, C19830z4 r9, AnonymousClass18K r10, C219317y r11, C17930vS r12, C220418j r13, AnonymousClass11W r14, AnonymousClass10I r15) {
        this.A07 = r8;
        this.A03 = r4;
        this.A0B = r14;
        this.A0C = r15;
        this.A04 = r5;
        this.A09 = r10;
        this.A06 = r7;
        this.A0A = r13;
        this.A08 = r9;
        this.A05 = r6;
        this.A0F = r12;
        this.A02 = r3;
        this.A0E = r11;
    }

    private File A01(File file, long j) {
        File A002 = A00(this);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(".log");
        return A02(file, new File(A002, sb.toString()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049 A[Catch:{ IOException -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083 A[Catch:{ IOException -> 0x008b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map A06(java.util.Map r8) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0007
            return r8
        L_0x0007:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.io.File r1 = A00(r7)     // Catch:{ IOException -> 0x008b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x008b }
            r3 = 24
            java.lang.String r0 = r0.substring(r3)     // Catch:{ IOException -> 0x008b }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x008b }
            r0 = 0
        L_0x0024:
            int r2 = r0 + 1
            r1 = 10
            if (r0 >= r1) goto L_0x0047
            boolean r0 = r6.mkdirs()     // Catch:{ IOException -> 0x008b }
            if (r0 != 0) goto L_0x0047
            java.io.File r1 = A00(r7)     // Catch:{ IOException -> 0x008b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = r0.substring(r3)     // Catch:{ IOException -> 0x008b }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r6.<init>(r1, r0)     // Catch:{ IOException -> 0x008b }
            r0 = r2
            goto L_0x0024
        L_0x0047:
            if (r2 > r1) goto L_0x0083
            java.util.Set r0 = r8.entrySet()     // Catch:{ IOException -> 0x008b }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ IOException -> 0x008b }
        L_0x0051:
            boolean r0 = r4.hasNext()     // Catch:{ IOException -> 0x008b }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r0 = r4.next()     // Catch:{ IOException -> 0x008b }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x008b }
            java.lang.Object r3 = r0.getKey()     // Catch:{ IOException -> 0x008b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x008b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x008b }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x008b }
            java.lang.String r1 = r2.getName()     // Catch:{ IOException -> 0x008b }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x008b }
            r0.<init>(r6, r1)     // Catch:{ IOException -> 0x008b }
            java.io.File r0 = A02(r2, r0)     // Catch:{ IOException -> 0x008b }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x008b }
            r5.put(r3, r0)     // Catch:{ IOException -> 0x008b }
            goto L_0x0051
        L_0x0083:
            java.lang.String r1 = "max retries reached while creating attachment temp directory"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x008b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x008b }
            throw r0     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass192.A06(java.util.Map):java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x026b, code lost:
        if (r8 == null) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        r0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b3, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b4, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ec, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ed, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:33:0x0107, B:66:0x01a4] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0266 A[SYNTHETIC, Splitter:B:111:0x0266] */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0130 A[SYNTHETIC, Splitter:B:43:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cd A[SYNTHETIC, Splitter:B:76:0x01cd] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ec A[ExcHandler: all (th java.lang.Throwable), PHI: r3 r5 
      PHI: (r3v8 java.io.FileOutputStream) = (r3v14 java.io.FileOutputStream), (r3v14 java.io.FileOutputStream), (r3v18 java.io.FileOutputStream), (r3v18 java.io.FileOutputStream) binds: [B:66:0x01a4, B:67:?, B:33:0x0107, B:34:?] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v4 java.lang.String) = (r5v6 java.lang.String), (r5v6 java.lang.String), (r5v8 java.lang.String), (r5v8 java.lang.String) binds: [B:66:0x01a4, B:67:?, B:33:0x0107, B:34:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:33:0x0107] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:108:0x0250=Splitter:B:108:0x0250, B:73:0x01b7=Splitter:B:73:0x01b7, B:40:0x011a=Splitter:B:40:0x011a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(java.util.HashSet r26, java.util.Map r27, boolean r28, boolean r29, boolean r30, boolean r31) {
        /*
            r25 = this;
            boolean r0 = com.whatsapp.util.Log.rotate()
            r8 = 0
            r10 = r25
            r15 = r29
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "crash-log/whatsapp/no_file"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "no-file"
            A08(r10, r0, r15)
        L_0x0015:
            return
        L_0x0016:
            r2 = 0
            r14 = r27
            r16 = r31
            java.io.File r4 = com.whatsapp.util.Log.compress()     // Catch:{ Exception -> 0x014e, all -> 0x028e }
            X.17y r3 = r10.A0E     // Catch:{ Exception -> 0x014e, all -> 0x028e }
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = 5242880(0x500000, float:7.34684E-39)
            if (r30 == 0) goto L_0x002b
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = 41943040(0x2800000, float:1.880791E-37)
        L_0x002b:
            android.util.Pair r1 = X.C64062u9.A03(r3, r4, r1, r0)     // Catch:{ Exception -> 0x014e, all -> 0x028e }
            java.lang.Object r0 = r1.first     // Catch:{ Exception -> 0x014e, all -> 0x028e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x014e, all -> 0x028e }
            boolean r9 = r0.booleanValue()     // Catch:{ Exception -> 0x014e, all -> 0x028e }
            java.lang.Object r4 = r1.second     // Catch:{ Exception -> 0x014c, all -> 0x01e9 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ Exception -> 0x014c, all -> 0x01e9 }
            if (r4 == 0) goto L_0x004d
            java.lang.String r11 = r4.getPath()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r12 = r10.A0A()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r13 = A05(r26)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            boolean r8 = A09(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
        L_0x004d:
            if (r28 == 0) goto L_0x00c0
            java.io.File r3 = com.whatsapp.util.Log.logFile     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r7 = ".gz"
            java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            r2.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r0 = r3.getName()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r6 = X.C60412nz.A01(r0, r2)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r1 = r3.getName()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            r0 = 46
            int r0 = r1.indexOf(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r0 = r1.substring(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r5 = X.C17900vP.A0A(r0, r7)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r7 = X.C60412nz.A00(r3, r7, r2)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            int r0 = r6.length()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            int r2 = r0 + 1
            int r1 = r7.length()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            int r0 = r5.length()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            int r1 = r1 - r0
            if (r2 >= r1) goto L_0x0096
            java.lang.String r0 = r7.substring(r2, r1)     // Catch:{ NumberFormatException -> 0x0096 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0096 }
            int r0 = r0 + 1
            java.lang.String r2 = java.lang.Integer.toString(r0)     // Catch:{ NumberFormatException -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            java.lang.String r2 = "1"
        L_0x0098:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            r1.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            r1.append(r6)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r0 = "."
            r1.append(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            r1.append(r2)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            r1.append(r5)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r2 = r1.toString()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.lang.String r1 = r3.getParent()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            r0.createNewFile()     // Catch:{ Exception -> 0x00bc, all -> 0x01f1 }
            goto L_0x00c0
        L_0x00bc:
            r1 = move-exception
            r2 = r4
            goto L_0x0151
        L_0x00c0:
            if (r4 == 0) goto L_0x0144
            if (r8 != 0) goto L_0x0144
            long r0 = java.lang.System.currentTimeMillis()
            java.io.File r2 = r10.A01(r4, r0)
            if (r2 == 0) goto L_0x0144
            java.util.Map r20 = r10.A06(r14)
            java.lang.String r18 = r2.getPath()
            java.lang.String r17 = r10.A0A()
            java.lang.String r19 = A05(r26)
            java.io.File r5 = A00(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r2 = ".crash"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r2)
            java.lang.String r5 = "app/CrashLogs/serializeCrashData: Could not close stream"
            r8 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0119 }
            r3.<init>(r6, r2)     // Catch:{ Exception -> 0x0119 }
            r21 = r0
            r23 = r16
            r24 = r15
            java.lang.String r2 = A04(r17, r18, r19, r20, r21, r23, r24)     // Catch:{ Exception -> 0x0116, all -> 0x01ec }
            byte[] r2 = r2.getBytes()     // Catch:{ Exception -> 0x0116, all -> 0x01ec }
            r3.write(r2)     // Catch:{ Exception -> 0x0116, all -> 0x01ec }
            r3.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x0138
        L_0x0116:
            r6 = move-exception
            r8 = r3
            goto L_0x011a
        L_0x0119:
            r6 = move-exception
        L_0x011a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x026a }
            r3.<init>()     // Catch:{ all -> 0x026a }
            java.lang.String r2 = "app/CrashLogs/serializeCrashData: could not serialize crash data at time: "
            r3.append(r2)     // Catch:{ all -> 0x026a }
            r3.append(r0)     // Catch:{ all -> 0x026a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x026a }
            com.whatsapp.util.Log.w(r0, r6)     // Catch:{ all -> 0x026a }
            if (r8 == 0) goto L_0x0138
            r8.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x0138
        L_0x0134:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x0138:
            android.os.Handler r2 = r10.A01
            r1 = 10
            X.3Bq r0 = new X.3Bq
            r0.<init>(r10, r1)
            r2.post(r0)
        L_0x0144:
            if (r9 == 0) goto L_0x0015
            if (r4 == 0) goto L_0x0015
            r4.delete()
            return
        L_0x014c:
            r1 = move-exception
            goto L_0x0151
        L_0x014e:
            r1 = move-exception
            r8 = 0
            r9 = 0
        L_0x0151:
            java.lang.String r0 = "crash-log/failedupload"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x01ef }
            A08(r10, r0, r15)     // Catch:{ all -> 0x01ef }
            if (r2 == 0) goto L_0x01e1
            if (r8 != 0) goto L_0x01e1
            long r0 = java.lang.System.currentTimeMillis()
            java.io.File r3 = r10.A01(r2, r0)
            if (r3 == 0) goto L_0x01e1
            java.util.Map r20 = r10.A06(r14)
            java.lang.String r18 = r3.getPath()
            java.lang.String r17 = r10.A0A()
            java.lang.String r19 = A05(r26)
            java.io.File r5 = A00(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r3 = ".crash"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r3)
            java.lang.String r5 = "app/CrashLogs/serializeCrashData: Could not close stream"
            r8 = 0
            r4 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01b6 }
            r3.<init>(r6, r4)     // Catch:{ Exception -> 0x01b6 }
            r21 = r0
            r23 = r16
            r24 = r15
            java.lang.String r4 = A04(r17, r18, r19, r20, r21, r23, r24)     // Catch:{ Exception -> 0x01b3, all -> 0x01ec }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x01b3, all -> 0x01ec }
            r3.write(r4)     // Catch:{ Exception -> 0x01b3, all -> 0x01ec }
            r3.close()     // Catch:{ IOException -> 0x01d1 }
            goto L_0x01d5
        L_0x01b3:
            r6 = move-exception
            r8 = r3
            goto L_0x01b7
        L_0x01b6:
            r6 = move-exception
        L_0x01b7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x026a }
            r4.<init>()     // Catch:{ all -> 0x026a }
            java.lang.String r3 = "app/CrashLogs/serializeCrashData: could not serialize crash data at time: "
            r4.append(r3)     // Catch:{ all -> 0x026a }
            r4.append(r0)     // Catch:{ all -> 0x026a }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x026a }
            com.whatsapp.util.Log.w(r0, r6)     // Catch:{ all -> 0x026a }
            if (r8 == 0) goto L_0x01d5
            r8.close()     // Catch:{ IOException -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x01d5:
            android.os.Handler r3 = r10.A01
            r1 = 10
            X.3Bq r0 = new X.3Bq
            r0.<init>(r10, r1)
            r3.post(r0)
        L_0x01e1:
            if (r9 == 0) goto L_0x0015
            if (r2 == 0) goto L_0x0015
            r2.delete()
            return
        L_0x01e9:
            r7 = move-exception
            goto L_0x0286
        L_0x01ec:
            r1 = move-exception
            r8 = r3
            goto L_0x026d
        L_0x01ef:
            r7 = move-exception
            goto L_0x01f3
        L_0x01f1:
            r7 = move-exception
            r2 = r4
        L_0x01f3:
            if (r2 == 0) goto L_0x0286
            if (r8 != 0) goto L_0x0286
            long r0 = java.lang.System.currentTimeMillis()
            java.io.File r3 = r10.A01(r2, r0)
            if (r3 == 0) goto L_0x0286
            java.util.Map r20 = r10.A06(r14)
            java.lang.String r18 = r3.getPath()
            java.lang.String r17 = r10.A0A()
            java.lang.String r19 = A05(r26)
            java.io.File r5 = A00(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r3 = ".crash"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.io.File r6 = new java.io.File
            r6.<init>(r5, r3)
            java.lang.String r5 = "app/CrashLogs/serializeCrashData: Could not close stream"
            r8 = 0
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x024f }
            r4.<init>(r6, r3)     // Catch:{ Exception -> 0x024f }
            r21 = r0
            r23 = r16
            r24 = r15
            java.lang.String r3 = A04(r17, r18, r19, r20, r21, r23, r24)     // Catch:{ Exception -> 0x024c, all -> 0x0249 }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x024c, all -> 0x0249 }
            r4.write(r3)     // Catch:{ Exception -> 0x024c, all -> 0x0249 }
            r4.close()     // Catch:{ IOException -> 0x0276 }
            goto L_0x027a
        L_0x0249:
            r1 = move-exception
            r8 = r4
            goto L_0x026d
        L_0x024c:
            r6 = move-exception
            r8 = r4
            goto L_0x0250
        L_0x024f:
            r6 = move-exception
        L_0x0250:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x026a }
            r4.<init>()     // Catch:{ all -> 0x026a }
            java.lang.String r3 = "app/CrashLogs/serializeCrashData: could not serialize crash data at time: "
            r4.append(r3)     // Catch:{ all -> 0x026a }
            r4.append(r0)     // Catch:{ all -> 0x026a }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x026a }
            com.whatsapp.util.Log.w(r0, r6)     // Catch:{ all -> 0x026a }
            if (r8 == 0) goto L_0x027a
            r8.close()     // Catch:{ IOException -> 0x0276 }
            goto L_0x027a
        L_0x026a:
            r1 = move-exception
            if (r8 == 0) goto L_0x0275
        L_0x026d:
            r8.close()     // Catch:{ IOException -> 0x0271 }
            throw r1
        L_0x0271:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x0275:
            throw r1
        L_0x0276:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x027a:
            android.os.Handler r3 = r10.A01
            r1 = 10
            X.3Bq r0 = new X.3Bq
            r0.<init>(r10, r1)
            r3.post(r0)
        L_0x0286:
            if (r9 == 0) goto L_0x028f
            if (r2 == 0) goto L_0x028f
            r2.delete()
            throw r7
        L_0x028e:
            r7 = move-exception
        L_0x028f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass192.A0I(java.util.HashSet, java.util.Map, boolean, boolean, boolean, boolean):void");
    }

    public void Ba9() {
    }
}
