package X;

import android.accounts.Account;
import android.content.Context;
import android.net.TrafficStats;
import android.util.Pair;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class A7X {
    public static final Pair A0J = new Pair((Object) null, (Object) null);
    public boolean A00;
    public String A01;
    public boolean A02 = true;
    public final AnonymousClass1NW A03;
    public final AnonymousClass1NT A04;
    public final C21564AmB A05;
    public final C19948A0f A06;
    public final AnonymousClass11E A07;
    public final AnonymousClass1L7 A08;
    public final C18030ve A09;
    public final C195939uB A0A;
    public final AnonymousClass10I A0B;
    public final String A0C;
    public final String A0D;
    public final AtomicInteger A0E = new AtomicInteger(0);
    public final Context A0F;
    public final AnonymousClass1NL A0G;
    public final String A0H;
    public final SSLSocketFactory A0I;

    public A7X(Context context, AnonymousClass181 r5, AnonymousClass1NW r6, AnonymousClass1NT r7, C19948A0f a0f, AnonymousClass11E r9, AnonymousClass1L7 r10, C18030ve r11, C195939uB r12, AnonymousClass1NL r13, AnonymousClass11W r14, AnonymousClass10I r15, String str, String str2) {
        String str3;
        C18070vi.A0d(context, 1);
        C18070vi.A0p(r11, r14, r5);
        C18070vi.A0d(r10, 5);
        C18070vi.A0x(r7, r12, a0f, r13, r6);
        String str4 = str;
        C18070vi.A0r(str4, r9, r15);
        this.A0F = context;
        this.A09 = r11;
        this.A08 = r10;
        this.A04 = r7;
        this.A0A = r12;
        this.A06 = a0f;
        this.A0G = r13;
        this.A03 = r6;
        this.A0C = str4;
        this.A07 = r9;
        this.A0B = r15;
        synchronized (r14) {
            str3 = r14.A00;
            if (str3 == null) {
                str3 = AnonymousClass11W.A00(r14.A05, r14, "2.24.24.78");
                r14.A00 = str3;
            }
        }
        C18070vi.A0X(str3);
        this.A0H = str3;
        this.A0I = new C21609Amy(r5);
        this.A05 = new C21564AmB(r5);
        this.A0D = str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: android.util.Pair} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A04(java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22) {
        /*
            r18 = this;
            r13 = 0
            java.lang.String r3 = " transaction="
            r8 = r18
            boolean r0 = r8.A0B()
            r14 = 0
            r1 = r19
            r4 = r21
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "gdrive-api/list-files/api is disabled for "
            r2.append(r0)
            r2.append(r1)
            X.C17900vP.A0g(r3, r4, r2)
            return r14
        L_0x0020:
            r0 = 13
            android.net.TrafficStats.setThreadStatsTag(r0)
            r0 = 1
            X.1D6[] r3 = new X.AnonymousClass1D6[r0]     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            java.lang.String r2 = "pageSize"
            java.lang.String r0 = java.lang.String.valueOf(r22)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            X.AnonymousClass1D6.A03(r2, r0, r3, r13)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            java.util.LinkedHashMap r12 = X.AnonymousClass1D7.A0C(r3)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            if (r21 == 0) goto L_0x0042
            int r0 = r4.length()     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "transaction_id"
            r12.put(r0, r4)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
        L_0x0042:
            r2 = r20
            if (r20 == 0) goto L_0x0051
            int r0 = r2.length()     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "pageToken"
            r12.put(r0, r2)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
        L_0x0051:
            java.lang.String r9 = "GET"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            java.lang.String r3 = "clients/wa/backups/"
            r2.append(r3)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            r2.append(r1)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            java.lang.String r0 = "/files"
            java.lang.String r10 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            java.lang.String r11 = "application/json; charset=UTF-8"
            javax.net.ssl.HttpsURLConnection r2 = r8.A06(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x013d, all -> 0x014d }
            int r4 = r2.getResponseCode()     // Catch:{ IOException -> 0x013b }
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 == r0) goto L_0x00ba
            r0 = 401(0x191, float:5.62E-43)
            if (r4 == r0) goto L_0x00b6
            r0 = 403(0x193, float:5.65E-43)
            if (r4 == r0) goto L_0x0135
            r0 = 429(0x1ad, float:6.01E-43)
            if (r4 != r0) goto L_0x0091
            X.A6M r4 = X.A6M.A00     // Catch:{ IOException -> 0x013b }
            X.0ve r3 = r8.A09     // Catch:{ IOException -> 0x013b }
            r1 = 916(0x394, float:1.284E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x013b }
            boolean r1 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ IOException -> 0x013b }
            java.lang.String r0 = "list-files"
            r4.A04(r0, r2, r1)     // Catch:{ IOException -> 0x013b }
            throw r14     // Catch:{ IOException -> 0x013b }
        L_0x0091:
            java.lang.String r3 = X.AnonymousClass8BT.A0w(r2)     // Catch:{ IOException -> 0x013b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x013b }
            java.lang.String r0 = "gdrive-api/list-files weird status code: "
            r1.append(r0)     // Catch:{ IOException -> 0x013b }
            r1.append(r4)     // Catch:{ IOException -> 0x013b }
            r0 = 32
            r1.append(r0)     // Catch:{ IOException -> 0x013b }
            X.C17890vO.A19(r1, r3)     // Catch:{ IOException -> 0x013b }
            X.9uB r1 = r8.A0A     // Catch:{ IOException -> 0x013b }
            r0 = 10
            r1.A00(r0, r4, r3)     // Catch:{ IOException -> 0x013b }
            X.8gq r0 = X.C167718gq.A00(r3)     // Catch:{ IOException -> 0x013b }
            goto L_0x013a
        L_0x00b6:
            r8.A0A()     // Catch:{ IOException -> 0x013b }
            goto L_0x011d
        L_0x00ba:
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x013b }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x013b }
            org.json.JSONObject r6 = X.AnonymousClass1EY.A01(r0)     // Catch:{ JSONException -> 0x0129 }
            if (r6 == 0) goto L_0x0124
            java.lang.String r0 = "files"
            org.json.JSONArray r7 = r6.optJSONArray(r0)     // Catch:{ JSONException -> 0x0129 }
            if (r7 != 0) goto L_0x00d9
            X.0wS r0 = X.C18460wS.A00     // Catch:{ JSONException -> 0x0129 }
            android.util.Pair r14 = android.util.Pair.create(r0, r14)     // Catch:{ JSONException -> 0x0129 }
            X.C18070vi.A0X(r14)     // Catch:{ JSONException -> 0x0129 }
            goto L_0x011d
        L_0x00d9:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r3, r1)     // Catch:{ JSONException -> 0x0129 }
            java.lang.String r0 = "/files/"
            java.lang.String r13 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ JSONException -> 0x0129 }
            int r0 = r7.length()     // Catch:{ JSONException -> 0x0129 }
            java.util.ArrayList r5 = X.C17880vN.A0z(r0)     // Catch:{ JSONException -> 0x0129 }
            int r4 = r7.length()     // Catch:{ JSONException -> 0x0129 }
            r3 = 0
        L_0x00f0:
            if (r3 >= r4) goto L_0x0110
            org.json.JSONObject r15 = r7.getJSONObject(r3)     // Catch:{ JSONException -> 0x0129 }
            X.1NT r12 = r8.A04     // Catch:{ JSONException -> 0x0129 }
            r16 = -1
            X.A2d r0 = X.C19990A2d.A00(r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x0129 }
            if (r0 == 0) goto L_0x0104
            r5.add(r0)     // Catch:{ JSONException -> 0x0129 }
            goto L_0x010d
        L_0x0104:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0129 }
            java.lang.String r0 = "gdrive-api/list-files/missing some attrs "
            X.C17900vP.A0X(r15, r0, r1)     // Catch:{ JSONException -> 0x0129 }
        L_0x010d:
            int r3 = r3 + 1
            goto L_0x00f0
        L_0x0110:
            java.lang.String r0 = "nextPageToken"
            java.lang.String r0 = r6.optString(r0, r14)     // Catch:{ JSONException -> 0x0129 }
            android.util.Pair r14 = android.util.Pair.create(r5, r0)     // Catch:{ JSONException -> 0x0129 }
            X.C18070vi.A0b(r14)     // Catch:{ JSONException -> 0x0129 }
        L_0x011d:
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r14
        L_0x0124:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()     // Catch:{ JSONException -> 0x0129 }
            throw r0     // Catch:{ JSONException -> 0x0129 }
        L_0x0129:
            r1 = move-exception
            java.lang.String r0 = "gdrive-api/list-files/invalid stream"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x013b }
            X.8gq r0 = new X.8gq     // Catch:{ IOException -> 0x013b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x013b }
            goto L_0x013a
        L_0x0135:
            X.8ge r0 = new X.8ge     // Catch:{ IOException -> 0x013b }
            r0.<init>()     // Catch:{ IOException -> 0x013b }
        L_0x013a:
            throw r0     // Catch:{ IOException -> 0x013b }
        L_0x013b:
            r1 = move-exception
            goto L_0x013f
        L_0x013d:
            r1 = move-exception
            r2 = r14
        L_0x013f:
            java.lang.String r0 = "gdrive-api/list-files failed with exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x014a }
            X.8gq r0 = new X.8gq     // Catch:{ all -> 0x014a }
            r0.<init>(r1)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            r14 = r2
            goto L_0x014e
        L_0x014d:
            r0 = move-exception
        L_0x014e:
            if (r14 == 0) goto L_0x0153
            r14.disconnect()
        L_0x0153:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7X.A04(java.lang.String, java.lang.String, java.lang.String, int):android.util.Pair");
    }

    public final C20007A2x A05(String str) {
        HttpsURLConnection httpsURLConnection;
        Throwable th;
        C20007A2x a2x = null;
        if (A0B()) {
            Log.i("gdrive-api/get-backup/api disabled");
            return null;
        }
        TrafficStats.setThreadStatsTag(13);
        try {
            String str2 = str;
            httpsURLConnection = A08("GET", AnonymousClass001.A1H("clients/wa/backups/", str, AnonymousClass000.A10()), (String) null, false);
            try {
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    C18030ve r7 = this.A09;
                    AnonymousClass1NT r5 = this.A04;
                    C195939uB r8 = this.A0A;
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    C18070vi.A0X(inputStream);
                    a2x = AnonymousClass9PE.A00(r5, this, r7, r8, inputStream, str2);
                } else if (responseCode == 401) {
                    A0A();
                } else if (responseCode != 429) {
                    if (responseCode == 403) {
                        th = new C167598ge();
                    } else if (responseCode != 404) {
                        httpsURLConnection.getURL();
                        String A0w = AnonymousClass8BT.A0w(httpsURLConnection);
                        C17900vP.A0e("gdrive-api/get-backup/failed ", A0w, AnonymousClass000.A10());
                        th = C167718gq.A00(A0w);
                    } else {
                        th = new C167568gb(AnonymousClass8BT.A0w(httpsURLConnection));
                    }
                    throw th;
                } else {
                    A6M.A00.A04("get-backup", httpsURLConnection, C18020vd.A05(C18040vf.A02, this.A09, 916));
                    throw null;
                }
                httpsURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                return a2x;
            } catch (IOException e) {
                e = e;
                try {
                    Log.e((Throwable) e);
                    throw new C167718gq(e);
                } catch (Throwable th2) {
                    th = th2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            httpsURLConnection = null;
            Log.e((Throwable) e);
            throw new C167718gq(e);
        } catch (Throwable th3) {
            th = th3;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    public final HttpsURLConnection A06(String str, String str2, String str3, Map map, boolean z) {
        C18070vi.A0d(str2, 1);
        try {
            String aSCIIString = new URI("https", (String) null, "backup.googleapis.com", -1, AnonymousClass001.A1H("/v1/", str2, AnonymousClass000.A10()), (String) null, (String) null).toASCIIString();
            C18070vi.A0X(aSCIIString);
            return A07(str, aSCIIString, str3, map, z);
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
    }

    public final HttpsURLConnection A08(String str, String str2, String str3, boolean z) {
        C18070vi.A0d(str2, 1);
        return A06(str, str2, str3, (Map) null, z);
    }

    public final synchronized void A09(boolean z) {
        String str;
        if (this.A02 != z) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("gdrive-api/");
            if (z) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            C17890vO.A1A(A10, str);
            this.A02 = z;
        }
    }

    public final synchronized boolean A0B() {
        return !this.A02;
    }

    public static void A00(C198759yr r4, HttpURLConnection httpURLConnection, AtomicLong atomicLong, long j) {
        r4.A03.Bqr(-(atomicLong.get() + j));
        httpURLConnection.disconnect();
        TrafficStats.clearThreadStatsTag();
    }

    public static final boolean A01(A7X a7x, File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0N(file, "restore>gdrive-api/rename-local/file/failed copying and deleting:", A10);
        A10.append(" -> ");
        C17890vO.A1B(A10, file2.getAbsolutePath());
        try {
            C64062u9.A0E(a7x.A0G, file, file2);
            if (C64062u9.A0Q(file)) {
                return true;
            }
            Log.e("restore>gdrive-api/rename-local/file/failed to delete file after copy");
            return false;
        } catch (IOException | SecurityException e) {
            Log.e("restore>gdrive-api/rename-local/file/failed with exception", e);
            return false;
        }
    }

    public static final boolean A02(A7X a7x, File file, String str, long j) {
        String A052 = C41361wE.A05(a7x.A03, a7x.A08, file, j);
        if (str.equals(A052)) {
            return true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0N(file, "restore>gdrive-api/save-file/check-md5 ", A10);
        A10.append(" downloaded but its MD5(");
        A10.append(A052);
        A10.append(") does not match remote md5(");
        A10.append(str);
        C17890vO.A19(A10, ").");
        return false;
    }

    public final int A03() {
        return this.A05.A00 + this.A0E.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r8 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.net.ssl.HttpsURLConnection A07(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map r8, boolean r9) {
        /*
            r4 = this;
            java.lang.String r3 = r4.A0D
            if (r3 == 0) goto L_0x0042
            if (r8 != 0) goto L_0x000a
            java.util.LinkedHashMap r8 = X.C17880vN.A13()
        L_0x000a:
            java.lang.String r2 = "mode"
            boolean r0 = r8.containsKey(r2)
            r1 = r0 ^ 1
            java.lang.String r0 = "mode param should not be included in params"
            X.C17960vV.A0F(r1, r0)
            r8.put(r2, r3)
        L_0x001a:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x004d
            android.net.Uri r0 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r3 = r0.buildUpon()
            java.util.Iterator r2 = X.AnonymousClass000.A15(r8)
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0045
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            java.lang.String r1 = X.C17880vN.A0x(r0)
            java.lang.String r0 = X.AnonymousClass8BR.A10(r0)
            r3.appendQueryParameter(r1, r0)
            goto L_0x002c
        L_0x0042:
            if (r8 == 0) goto L_0x004d
            goto L_0x001a
        L_0x0045:
            android.net.Uri r0 = r3.build()
            java.lang.String r6 = r0.toString()
        L_0x004d:
            X.C18070vi.A0X(r6)
            java.net.URLConnection r2 = X.AnonymousClass8BV.A0v(r6)
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            X.C18070vi.A0z(r2, r0)
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2
            javax.net.ssl.SSLSocketFactory r0 = r4.A0I
            r2.setSSLSocketFactory(r0)
            java.lang.String r0 = "Host"
            java.lang.String r3 = "backup.googleapis.com"
            r2.setRequestProperty(r0, r3)
            X.00H r0 = X.C20134A8u.A00
            org.apache.http.conn.ssl.BrowserCompatHostnameVerifier r1 = new org.apache.http.conn.ssl.BrowserCompatHostnameVerifier
            r1.<init>()
            X.AlR r0 = new X.AlR
            r0.<init>(r3, r1)
            r2.setHostnameVerifier(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Bearer "
            r1.append(r0)
            java.lang.String r0 = r4.A01
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "Authorization"
            r2.setRequestProperty(r0, r1)
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r4.A0H
            r2.setRequestProperty(r1, r0)
            r0 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r2.setReadTimeout(r0)
            r2.setRequestMethod(r5)
            if (r7 == 0) goto L_0x00a5
            java.lang.String r0 = "Content-Type"
            r2.setRequestProperty(r0, r7)
        L_0x00a5:
            r2.setDoOutput(r9)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0E
            r0.incrementAndGet()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7X.A07(java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean):javax.net.ssl.HttpsURLConnection");
    }

    public final boolean A0A() {
        String str = this.A0C;
        try {
            AnonymousClass8BY.A1H("gdrive-api/auth-request asking GoogleAuthUtil for auth token: ", str, AnonymousClass000.A10());
            String str2 = this.A01;
            if (str2 != null) {
                C26266CwB.A06(this.A0F, str2);
            }
            this.A01 = C26266CwB.A02(new Account(str, "com.google"), this.A0F, "oauth2:https://www.googleapis.com/auth/drive.appdata");
            Log.i("gdrive-api/auth-request/received-auth-token");
            return true;
        } catch (BYF e) {
            Log.e("gdrive-api/auth-request Google Play services is unavailable, if it was unavailable from the beginning code would not have reached here, so, most likely it became unavailable while the backup/restore was in progress");
            Log.e("gdrive-api/auth-request", e);
            this.A01 = null;
            throw new C167698go(e);
        } catch (UserRecoverableAuthException e2) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass8BV.A1L("gdrive-api/auth-request permission to access Google Drive for ", str, A10);
            C17890vO.A1A(A10, " is not available and we cannot ask user for permission either.");
            throw new C167698go(e2);
        } catch (BYE e3) {
            Log.i("gdrive-api/auth-request user recoverable exception happened and notification was published by the system to resolve it.");
            throw new C167698go(e3);
        } catch (IOException e4) {
            Log.e("gdrive-api/auth-request", e4);
            this.A01 = null;
            this.A0A.A00.A0E(AnonymousClass001.A1H("gdrive/", "auth-request/io-exception", AnonymousClass000.A10()), (String) null, e4);
            return false;
        } catch (C2U e5) {
            Log.e("gdrive-api/auth-request", e5);
            if ("BadUsername".equals(e5.getMessage())) {
                throw new C167688gn(e5);
            } else if ("ServiceUnavailable".equals(e5.getMessage())) {
                this.A0A.A00.A0E(AnonymousClass001.A1H("gdrive/", "auth-request/service-unavailable", AnonymousClass000.A10()), (String) null, e5);
                return false;
            } else {
                this.A01 = null;
                throw new C167698go(e5);
            }
        } catch (SecurityException e6) {
            Log.e("gdrive-api/auth-request", e6);
            this.A01 = null;
            throw new C167698go(e6);
        } catch (NullPointerException e7) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("gdrive-api/auth-request unexpected NullPointerException while trying to get  auth token for the account ");
            C17890vO.A19(A102, C41361wE.A08(str));
            Log.e("gdrive-api/auth-request", e7);
            this.A01 = null;
            throw new C167698go(e7);
        }
    }
}
