package X;

import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1fI  reason: invalid class name and case insensitive filesystem */
public class C31271fI {
    public final AnonymousClass118 A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11P A02;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a7, code lost:
        if (r1 < 0) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.ArrayList A01() {
        /*
            r13 = this;
            monitor-enter(r13)
            X.C17960vV.A01()     // Catch:{ all -> 0x00e0 }
            X.118 r0 = r13.A00     // Catch:{ all -> 0x00e0 }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x00e0 }
            java.io.File r1 = r4.getFilesDir()     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = "fbips"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00e0 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x00e0 }
            boolean r0 = r0.canRead()     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x00d9
            java.io.File r1 = r4.getFilesDir()     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException | JSONException -> 0x00c7 }
            r0.<init>(r1, r3)     // Catch:{ IOException | JSONException -> 0x00c7 }
            byte[] r0 = X.AnonymousClass1EW.A00(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException | JSONException -> 0x00c7 }
            r2.<init>()     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException | JSONException -> 0x00c7 }
            r1.<init>(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x00c7 }
            r0.<init>(r1)     // Catch:{ IOException | JSONException -> 0x00c7 }
            org.json.JSONArray r5 = r0.getJSONArray(r3)     // Catch:{ IOException | JSONException -> 0x00c7 }
            r1 = 0
        L_0x003a:
            int r0 = r5.length()     // Catch:{ IOException | JSONException -> 0x00c7 }
            if (r1 >= r0) goto L_0x0081
            org.json.JSONObject r6 = r5.getJSONObject(r1)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.String r0 = "exp"
            long r7 = r6.getLong(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.String r0 = "ip"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.net.InetAddress r9 = java.net.InetAddress.getByName(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.String r0 = "port"
            int r0 = r6.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            short r0 = (short) r0     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.Short r8 = java.lang.Short.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.String r0 = "secure"
            boolean r11 = r6.getBoolean(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.String r0 = "override"
            boolean r12 = r6.getBoolean(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.String r0 = "resolver"
            int r10 = r6.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00c7 }
            X.2mm r6 = new X.2mm     // Catch:{ IOException | JSONException -> 0x00c7 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ IOException | JSONException -> 0x00c7 }
            r2.add(r6)     // Catch:{ IOException | JSONException -> 0x00c7 }
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0081:
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ IOException | JSONException -> 0x00c7 }
            r10.<init>()     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.util.Iterator r11 = r2.iterator()     // Catch:{ IOException | JSONException -> 0x00c7 }
        L_0x008a:
            boolean r0 = r11.hasNext()     // Catch:{ IOException | JSONException -> 0x00c7 }
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r9 = r11.next()     // Catch:{ IOException | JSONException -> 0x00c7 }
            X.2mm r9 = (X.C59722mm) r9     // Catch:{ IOException | JSONException -> 0x00c7 }
            X.11P r1 = r13.A02     // Catch:{ IOException | JSONException -> 0x00c7 }
            java.lang.Long r0 = r9.A01     // Catch:{ IOException | JSONException -> 0x00c7 }
            if (r0 == 0) goto L_0x00a9
            long r7 = X.AnonymousClass11P.A01(r1)     // Catch:{ IOException | JSONException -> 0x00c7 }
            long r5 = r0.longValue()     // Catch:{ IOException | JSONException -> 0x00c7 }
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            if (r0 == 0) goto L_0x008a
            r10.add(r9)     // Catch:{ IOException | JSONException -> 0x00c7 }
            goto L_0x008a
        L_0x00b0:
            boolean r0 = r10.isEmpty()     // Catch:{ IOException | JSONException -> 0x00c7 }
            if (r0 != 0) goto L_0x00de
            r2.removeAll(r10)     // Catch:{ IOException | JSONException -> 0x00c7 }
            boolean r0 = r2.isEmpty()     // Catch:{ IOException | JSONException -> 0x00c7 }
            if (r0 == 0) goto L_0x00c3
            r4.deleteFile(r3)     // Catch:{ IOException | JSONException -> 0x00c7 }
            goto L_0x00de
        L_0x00c3:
            r13.A00(r2)     // Catch:{ IOException | JSONException -> 0x00c7 }
            goto L_0x00de
        L_0x00c7:
            r1 = move-exception
            java.lang.String r0 = "FallbackManager/getFallbackIps"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e0 }
            X.190 r3 = r13.A01     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "fallback-manager/load-error"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e0 }
            r0 = 0
            r3.A0G(r2, r1, r0)     // Catch:{ all -> 0x00e0 }
        L_0x00d9:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00e0 }
            r2.<init>()     // Catch:{ all -> 0x00e0 }
        L_0x00de:
            monitor-exit(r13)
            return r2
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31271fI.A01():java.util.ArrayList");
    }

    private void A00(List list) {
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(new FileWriter(new File(this.A00.A00.getFilesDir(), "fbips"))));
        try {
            jsonWriter.beginObject();
            jsonWriter.name("fbips");
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C59722mm r4 = (C59722mm) it.next();
                jsonWriter.beginObject();
                jsonWriter.name("ip").value(r4.A03.getHostAddress());
                jsonWriter.name("port").value(r4.A02);
                jsonWriter.name("exp").value(r4.A01);
                jsonWriter.name("secure").value(r4.A05);
                jsonWriter.name("override").value(r4.A04);
                jsonWriter.name("resolver").value((long) r4.A00);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public synchronized void A02(String[] strArr) {
        synchronized (this) {
            C17960vV.A01();
            if (r6 != 1 || !strArr[0].equalsIgnoreCase("CLEAR")) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (str != null) {
                        String[] split = str.split("\\|", 6);
                        if (split.length != 6) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("DnsCacheEntry/parseFallbackIpString/");
                            sb.append(str);
                            Log.e(sb.toString());
                        } else {
                            try {
                                InetAddress byName = InetAddress.getByName(split[0]);
                                short parseShort = Short.parseShort(split[1]);
                                long parseLong = Long.parseLong(split[2]);
                                arrayList.add(new C59722mm(Long.valueOf((Long.parseLong(split[3]) + parseLong) * 1000), Short.valueOf(parseShort), byName, 4, Boolean.parseBoolean(split[4]), Boolean.parseBoolean(split[5])));
                            } catch (NumberFormatException | UnknownHostException e) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("DnsCacheEntry/parseFallbackIpString/");
                                sb2.append(str);
                                Log.e(sb2.toString(), e);
                            }
                        }
                    }
                }
                try {
                    A00(arrayList);
                } catch (IOException e2) {
                    Log.e("FallbackManager/saveFallbacks", e2);
                    this.A01.A0G("fallback-manager/save-error", e2.toString(), false);
                }
            } else {
                this.A00.A00.deleteFile("fbips");
            }
        }
        return;
    }

    public C31271fI(AnonymousClass190 r1, AnonymousClass11P r2, AnonymousClass118 r3) {
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r1;
    }
}
