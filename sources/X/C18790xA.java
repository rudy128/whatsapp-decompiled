package X;

import android.content.Context;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.0xA  reason: invalid class name and case insensitive filesystem */
public class C18790xA {
    public static final Charset A03 = Charset.forName(DefaultCrypto.UTF_8);
    public static final Pattern A04 = Pattern.compile("[0-9]+s");
    public final Context A00;
    public final C18800xB A01 = new C18800xB();
    public final C18290w6 A02;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6 A[SYNTHETIC, Splitter:B:25:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[SYNTHETIC, Splitter:B:32:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3 A[Catch:{ NameNotFoundException -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc A[Catch:{ NameNotFoundException -> 0x0103 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.HttpURLConnection A00(X.C18790xA r11, java.lang.String r12, java.net.URL r13) {
        /*
            java.lang.String r3 = "Failed to get heartbeats header"
            java.lang.String r5 = "ContentValues"
            java.net.URLConnection r4 = r13.openConnection()     // Catch:{ IOException -> 0x0126 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x0126 }
            r1 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r1)
            r0 = 0
            r4.setUseCaches(r0)
            r4.setReadTimeout(r1)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json"
            r4.addRequestProperty(r0, r1)
            java.lang.String r0 = "Accept"
            r4.addRequestProperty(r0, r1)
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r0 = "gzip"
            r4.addRequestProperty(r1, r0)
            java.lang.String r1 = "Cache-Control"
            java.lang.String r0 = "no-cache"
            r4.addRequestProperty(r1, r0)
            android.content.Context r7 = r11.A00
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r0 = "X-Android-Package"
            r4.addRequestProperty(r0, r1)
            X.0w6 r0 = r11.A02
            java.lang.Object r8 = r0.get()
            X.0wX r8 = (X.C18500wX) r8
            if (r8 == 0) goto L_0x0081
            java.lang.String r6 = "x-firebase-client"
            android.content.Context r0 = r8.A00     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            boolean r0 = X.C18380wJ.A00(r0)     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0066
            java.lang.String r1 = ""
            com.google.android.gms.tasks.zzw r0 = new com.google.android.gms.tasks.zzw     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            r0.<init>()     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            r0.zzb(r1)     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
        L_0x005c:
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            r4.addRequestProperty(r6, r0)     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            goto L_0x0081
        L_0x0066:
            java.util.concurrent.Executor r2 = r8.A04     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            r1 = 19
            X.DVt r0 = new X.DVt     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            r0.<init>((java.lang.Object) r8, (int) r1)     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.call(r2, r0)     // Catch:{ ExecutionException -> 0x007d, InterruptedException -> 0x0074 }
            goto L_0x005c
        L_0x0074:
            r1 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x007e
        L_0x007d:
            r1 = move-exception
        L_0x007e:
            android.util.Log.w(r5, r3, r1)
        L_0x0081:
            java.lang.String r6 = "X-Android-Cert"
            r3 = 0
            java.lang.String r2 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0103 }
            X.1wL r0 = X.C41401wK.A00(r7)     // Catch:{ NameNotFoundException -> 0x0103 }
            r1 = 64
            android.content.Context r0 = r0.A00     // Catch:{ NameNotFoundException -> 0x0103 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0103 }
            android.content.pm.PackageInfo r9 = r0.getPackageInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0103 }
            android.content.pm.Signature[] r0 = r9.signatures     // Catch:{ NameNotFoundException -> 0x0103 }
            if (r0 == 0) goto L_0x00c0
            int r1 = r0.length     // Catch:{ NameNotFoundException -> 0x0103 }
            r0 = 1
            if (r1 != r0) goto L_0x00c0
            java.lang.String r8 = "SHA1"
            r1 = 0
        L_0x00a3:
            r0 = 2
            if (r1 >= r0) goto L_0x00af
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r8)     // Catch:{ NoSuchAlgorithmException -> 0x00ac }
            if (r2 != 0) goto L_0x00b0
        L_0x00ac:
            int r1 = r1 + 1
            goto L_0x00a3
        L_0x00af:
            r2 = 0
        L_0x00b0:
            if (r2 == 0) goto L_0x00c0
            android.content.pm.Signature[] r1 = r9.signatures     // Catch:{ NameNotFoundException -> 0x0103 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ NameNotFoundException -> 0x0103 }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x0103 }
            byte[] r10 = r2.digest(r0)     // Catch:{ NameNotFoundException -> 0x0103 }
            goto L_0x00c1
        L_0x00c0:
            r10 = 0
        L_0x00c1:
            if (r10 != 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0103 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0103 }
            java.lang.String r0 = "Could not get fingerprint hash for package: "
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x0103 }
            java.lang.String r0 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0103 }
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x0103 }
            java.lang.String r0 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0103 }
            android.util.Log.e(r5, r0)     // Catch:{ NameNotFoundException -> 0x0103 }
            goto L_0x011c
        L_0x00dc:
            int r9 = r10.length     // Catch:{ NameNotFoundException -> 0x0103 }
            int r0 = r9 + r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0103 }
            r8.<init>(r0)     // Catch:{ NameNotFoundException -> 0x0103 }
            r2 = 0
        L_0x00e5:
            if (r2 >= r9) goto L_0x00fe
            char[] r11 = X.AnonymousClass2VW.A00     // Catch:{ NameNotFoundException -> 0x0103 }
            byte r1 = r10[r2]     // Catch:{ NameNotFoundException -> 0x0103 }
            r0 = r1 & 240(0xf0, float:3.36E-43)
            int r0 = r0 >>> 4
            char r0 = r11[r0]     // Catch:{ NameNotFoundException -> 0x0103 }
            r8.append(r0)     // Catch:{ NameNotFoundException -> 0x0103 }
            r0 = r1 & 15
            char r0 = r11[r0]     // Catch:{ NameNotFoundException -> 0x0103 }
            r8.append(r0)     // Catch:{ NameNotFoundException -> 0x0103 }
            int r2 = r2 + 1
            goto L_0x00e5
        L_0x00fe:
            java.lang.String r3 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0103 }
            goto L_0x011c
        L_0x0103:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "No such package: "
            r1.append(r0)
            java.lang.String r0 = r7.getPackageName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r5, r0, r2)
        L_0x011c:
            r4.addRequestProperty(r6, r3)
            java.lang.String r0 = "x-goog-api-key"
            r4.addRequestProperty(r0, r12)
            return r4
        L_0x0126:
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            X.ByK r1 = X.C24261ByK.UNAVAILABLE
            X.Blz r0 = new X.Blz
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18790xA.A00(X.0xA, java.lang.String, java.net.URL):java.net.HttpURLConnection");
    }

    public static URL A01(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new C23571Blz(C24261ByK.UNAVAILABLE, e.getMessage());
        }
    }

    public C18790xA(Context context, C18290w6 r3) {
        this.A00 = context;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.net.HttpURLConnection r10) {
        /*
            java.io.InputStream r2 = r10.getErrorStream()
            r6 = 0
            if (r2 == 0) goto L_0x0051
            java.nio.charset.Charset r1 = A03
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2, r1)
            java.io.BufferedReader r5 = new java.io.BufferedReader
            r5.<init>(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            r4.<init>()     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
        L_0x0018:
            java.lang.String r0 = r5.readLine()     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            if (r0 == 0) goto L_0x0027
            r4.append(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            r0 = 10
            r4.append(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            goto L_0x0018
        L_0x0027:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            int r0 = r10.getResponseCode()     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            r0 = 0
            r2[r0] = r1     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            java.lang.String r1 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            r0 = 1
            r2[r0] = r1     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            r0 = 2
            r2[r0] = r4     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            java.lang.String r6 = java.lang.String.format(r3, r2)     // Catch:{ IOException -> 0x004e, all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x0049:
            r0 = move-exception
            r5.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            throw r0
        L_0x004e:
            r5.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0079
            java.lang.String r3 = "Firebase-Installations"
            android.util.Log.w(r3, r6)
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r8
            r0 = 1
            r2[r0] = r9
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = ""
        L_0x006d:
            r0 = 2
            r2[r0] = r1
            java.lang.String r0 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            android.util.Log.w(r3, r0)
        L_0x0079:
            return
        L_0x007a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18790xA.A02(java.lang.String, java.lang.String, java.lang.String, java.net.HttpURLConnection):void");
    }

    public static void A03(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }
}
