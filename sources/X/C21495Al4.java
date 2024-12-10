package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.Al4  reason: case insensitive filesystem */
public class C21495Al4 implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C21495Al4(Context context, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = context;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v69, types: [X.9OP, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:50|51|52|53|(9:55|56|(1:58)|59|(2:73|(1:75)(3:79|108|109))(2:67|(1:69)(3:78|108|109))|70|(2:72|(1:77))|108|109)|80|81|(4:83|103|108|109)|84|85|(3:86|87|(1:89)(7:90|91|92|93|103|108|109))) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:2|(3:4|12|25)|29|(11:31|32|33|(1:35)|37|38|(1:40)|41|(1:43)(1:47)|44|(4:46|113|(1:115)|116))|48|50|51|52|53|(9:55|56|(1:58)|59|(2:73|(1:75)(3:79|108|109))(2:67|(1:69)(3:78|108|109))|70|(2:72|(1:77))|108|109)|80|81|(4:83|103|108|109)|84|85|(3:86|87|(1:89)(7:90|91|92|93|103|108|109))) */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        X.C196379ux.A01("get error failed ", r1);
        r0 = r1.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fe, code lost:
        if (r8 == null) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0208, code lost:
        if (r3 == null) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        if (r9.exists() != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01df, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0189 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0196 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01e3 */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0194 A[Catch:{ IOException -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cb A[Catch:{ all -> 0x01df, IOException -> 0x01e4 }, LOOP:0: B:86:0x01c5->B:89:0x01cb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d4 A[SYNTHETIC, Splitter:B:90:0x01d4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            int r0 = r11.A00
            if (r0 == 0) goto L_0x0222
            java.lang.Object r7 = r11.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r6 = r11.A02
            java.lang.String r3 = r11.A03
            X.9ZZ r5 = X.AnonymousClass9U1.A02
            if (r5 != 0) goto L_0x0048
            java.lang.Class<X.9ZZ> r8 = X.AnonymousClass9ZZ.class
            monitor-enter(r8)
            X.9ZZ r5 = X.AnonymousClass9U1.A02     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x0043
            android.content.Context r4 = r7.getApplicationContext()     // Catch:{ all -> 0x0045 }
            X.A4P r2 = X.AnonymousClass9U1.A01     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x0037
            java.lang.Class<X.A4P> r1 = X.A4P.class
            monitor-enter(r1)     // Catch:{ all -> 0x0045 }
            X.A4P r2 = X.AnonymousClass9U1.A01     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0032
            X.9UO r0 = new X.9UO     // Catch:{ all -> 0x0034 }
            r0.<init>(r4)     // Catch:{ all -> 0x0034 }
            X.A4P r2 = new X.A4P     // Catch:{ all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ all -> 0x0034 }
            X.AnonymousClass9U1.A01 = r2     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0037:
            X.9OP r0 = new X.9OP     // Catch:{ all -> 0x0045 }
            r0.<init>()     // Catch:{ all -> 0x0045 }
            X.9ZZ r5 = new X.9ZZ     // Catch:{ all -> 0x0045 }
            r5.<init>(r0, r2)     // Catch:{ all -> 0x0045 }
            X.AnonymousClass9U1.A02 = r5     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r8)     // Catch:{ all -> 0x0045 }
            goto L_0x0048
        L_0x0045:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0045 }
            throw r0
        L_0x0048:
            r4 = 0
            if (r3 == 0) goto L_0x00b2
            X.A4P r10 = r5.A00
            java.io.File r1 = X.A4P.A00(r10)     // Catch:{ FileNotFoundException -> 0x00b2 }
            X.9Ix r8 = X.C179679Ix.JSON     // Catch:{ FileNotFoundException -> 0x00b2 }
            r2 = 0
            java.lang.String r0 = X.A4P.A01(r8, r6, r2)     // Catch:{ FileNotFoundException -> 0x00b2 }
            java.io.File r9 = X.C17880vN.A0e(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b2 }
            boolean r0 = r9.exists()     // Catch:{ FileNotFoundException -> 0x00b2 }
            if (r0 != 0) goto L_0x0076
            java.io.File r1 = X.A4P.A00(r10)     // Catch:{ FileNotFoundException -> 0x00b2 }
            X.9Ix r0 = X.C179679Ix.ZIP     // Catch:{ FileNotFoundException -> 0x00b2 }
            java.lang.String r0 = X.A4P.A01(r0, r6, r2)     // Catch:{ FileNotFoundException -> 0x00b2 }
            java.io.File r9 = X.C17880vN.A0e(r1, r0)     // Catch:{ FileNotFoundException -> 0x00b2 }
            boolean r0 = r9.exists()     // Catch:{ FileNotFoundException -> 0x00b2 }
            if (r0 == 0) goto L_0x00b2
        L_0x0076:
            java.io.FileInputStream r2 = X.C108945cZ.A18(r9)     // Catch:{ FileNotFoundException -> 0x00b2 }
            java.lang.String r1 = r9.getAbsolutePath()
            java.lang.String r0 = ".zip"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x0088
            X.9Ix r8 = X.C179679Ix.ZIP
        L_0x0088:
            r9.getAbsolutePath()
            android.util.Pair r0 = X.C108945cZ.A0N(r8, r2)
            java.lang.Object r2 = r0.first
            java.lang.Object r1 = r0.second
            java.io.InputStream r1 = (java.io.InputStream) r1
            X.9Ix r0 = X.C179679Ix.ZIP
            if (r2 != r0) goto L_0x00ad
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r1)
            X.1yu r0 = X.C39771tc.A02(r7, r3, r0)
        L_0x00a2:
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x00b2
            X.1yu r4 = new X.1yu
            r4.<init>((java.lang.Object) r0)
            goto L_0x020a
        L_0x00ad:
            X.1yu r0 = X.C39771tc.A04(r1, r3)
            goto L_0x00a2
        L_0x00b2:
            java.lang.String r2 = "LottieFetchResult close failed "
            r8 = 0
            java.net.URLConnection r1 = X.AnonymousClass8BV.A0v(r6)     // Catch:{ Exception -> 0x01f8 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = "GET"
            r1.setRequestMethod(r0)     // Catch:{ Exception -> 0x01f8 }
            r1.connect()     // Catch:{ Exception -> 0x01f8 }
            X.AiA r0 = new X.AiA     // Catch:{ Exception -> 0x01f8 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01f8 }
            r8 = r0
            java.net.HttpURLConnection r9 = r0.A00     // Catch:{ IOException -> 0x0189 }
            int r0 = r9.getResponseCode()     // Catch:{ IOException -> 0x0189 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x0189
            java.io.InputStream r10 = r9.getInputStream()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = r9.getContentType()     // Catch:{ Exception -> 0x01f8 }
            if (r1 != 0) goto L_0x00e0
            java.lang.String r1 = "application/json"
        L_0x00e0:
            java.lang.String r0 = "application/zip"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x01f8 }
            if (r0 != 0) goto L_0x0146
            java.lang.String r0 = "application/x-zip"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x01f8 }
            if (r0 != 0) goto L_0x0146
            java.lang.String r0 = "application/x-zip-compressed"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x01f8 }
            if (r0 != 0) goto L_0x0146
            java.lang.String r0 = "\\?"
            java.lang.String[] r1 = r6.split(r0)     // Catch:{ Exception -> 0x01f8 }
            r0 = 0
            r1 = r1[r0]     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = ".lottie"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x01f8 }
            if (r0 != 0) goto L_0x0146
            X.9Ix r9 = X.C179679Ix.JSON     // Catch:{ Exception -> 0x01f8 }
            if (r3 == 0) goto L_0x0179
            X.A4P r5 = r5.A00     // Catch:{ Exception -> 0x01f8 }
            java.io.File r0 = r5.A02(r9, r10, r6)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01f8 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x01f8 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01f8 }
            X.1yu r4 = X.C39771tc.A04(r0, r6)     // Catch:{ Exception -> 0x01f8 }
        L_0x0120:
            java.lang.Object r0 = r4.A00     // Catch:{ Exception -> 0x01f8 }
            if (r0 == 0) goto L_0x0200
            r0 = 1
            java.lang.String r1 = X.A4P.A01(r9, r6, r0)     // Catch:{ Exception -> 0x01f8 }
            java.io.File r0 = X.A4P.A00(r5)     // Catch:{ Exception -> 0x01f8 }
            java.io.File r6 = X.C17880vN.A0e(r0, r1)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r5 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r1 = ".temp"
            java.lang.String r0 = ""
            java.lang.String r0 = r5.replace(r1, r0)     // Catch:{ Exception -> 0x01f8 }
            java.io.File r5 = X.C108945cZ.A17(r0)     // Catch:{ Exception -> 0x01f8 }
            boolean r0 = r6.renameTo(r5)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x015e
        L_0x0146:
            X.9Ix r9 = X.C179679Ix.ZIP     // Catch:{ Exception -> 0x01f8 }
            if (r3 == 0) goto L_0x017f
            X.A4P r5 = r5.A00     // Catch:{ Exception -> 0x01f8 }
            java.io.File r0 = r5.A02(r9, r10, r6)     // Catch:{ Exception -> 0x01f8 }
            java.io.FileInputStream r1 = X.C108945cZ.A18(r0)     // Catch:{ Exception -> 0x01f8 }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x01f8 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01f8 }
            X.1yu r4 = X.C39771tc.A02(r7, r6, r0)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x0120
        L_0x015e:
            if (r0 != 0) goto L_0x0200
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = "Unable to rename cache file "
            X.C17900vP.A0N(r6, r0, r1)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = " to "
            X.C17900vP.A0N(r5, r0, r1)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x01f8 }
            X.C196379ux.A00(r0)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x0200
        L_0x0179:
            X.1yu r4 = X.C39771tc.A04(r10, r4)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x0200
        L_0x017f:
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x01f8 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x01f8 }
            X.1yu r4 = X.C39771tc.A02(r7, r4, r0)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x0200
        L_0x0189:
            java.net.HttpURLConnection r0 = r8.A00     // Catch:{ IOException -> 0x0196 }
            int r0 = r0.getResponseCode()     // Catch:{ IOException -> 0x0196 }
            int r1 = r0 / 100
            r0 = 2
            if (r1 != r0) goto L_0x0196
            r0 = 0
            goto L_0x01ee
        L_0x0196:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r0 = "Unable to fetch "
            r5.append(r0)     // Catch:{ IOException -> 0x01e4 }
            java.net.HttpURLConnection r1 = r8.A00     // Catch:{ IOException -> 0x01e4 }
            java.net.URL r0 = r1.getURL()     // Catch:{ IOException -> 0x01e4 }
            r5.append(r0)     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r0 = ". Failed with "
            r5.append(r0)     // Catch:{ IOException -> 0x01e4 }
            int r0 = r1.getResponseCode()     // Catch:{ IOException -> 0x01e4 }
            r5.append(r0)     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r0 = "\n"
            r5.append(r0)     // Catch:{ IOException -> 0x01e4 }
            java.io.InputStream r0 = r1.getErrorStream()     // Catch:{ IOException -> 0x01e4 }
            java.io.BufferedReader r4 = X.AnonymousClass8BW.A0W(r0)     // Catch:{ IOException -> 0x01e4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x01e4 }
        L_0x01c5:
            java.lang.String r0 = r4.readLine()     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01d4
            r1.append(r0)     // Catch:{ all -> 0x01df }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x01df }
            goto L_0x01c5
        L_0x01d4:
            r4.close()     // Catch:{ Exception -> 0x01d7 }
        L_0x01d7:
            X.AnonymousClass8BS.A1D(r1, r5)     // Catch:{ IOException -> 0x01e4 }
            java.lang.String r0 = r5.toString()     // Catch:{ IOException -> 0x01e4 }
            goto L_0x01ee
        L_0x01df:
            r0 = move-exception
            r4.close()     // Catch:{ Exception -> 0x01e3 }
        L_0x01e3:
            throw r0     // Catch:{ IOException -> 0x01e4 }
        L_0x01e4:
            r1 = move-exception
            java.lang.String r0 = "get error failed "
            X.C196379ux.A01(r0, r1)     // Catch:{ Exception -> 0x01f8 }
            java.lang.String r0 = r1.getMessage()     // Catch:{ Exception -> 0x01f8 }
        L_0x01ee:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ Exception -> 0x01f8 }
            X.1yu r4 = new X.1yu     // Catch:{ Exception -> 0x01f8 }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x01f8 }
            goto L_0x0200
        L_0x01f8:
            r0 = move-exception
            X.1yu r4 = new X.1yu     // Catch:{ all -> 0x0216 }
            r4.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x0216 }
            if (r8 == 0) goto L_0x0208
        L_0x0200:
            r8.close()     // Catch:{ IOException -> 0x0204 }
            goto L_0x0208
        L_0x0204:
            r0 = move-exception
            X.C196379ux.A01(r2, r0)
        L_0x0208:
            if (r3 == 0) goto L_0x0215
        L_0x020a:
            java.lang.Object r1 = r4.A00
            if (r1 == 0) goto L_0x0215
            X.1te r0 = X.C39791te.A01
            X.00z r0 = r0.A00
            r0.A08(r3, r1)
        L_0x0215:
            return r4
        L_0x0216:
            r1 = move-exception
            if (r8 == 0) goto L_0x0221
            r8.close()     // Catch:{ IOException -> 0x021d }
            throw r1
        L_0x021d:
            r0 = move-exception
            X.C196379ux.A01(r2, r0)
        L_0x0221:
            throw r1
        L_0x0222:
            java.lang.Object r2 = r11.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = r11.A02
            java.lang.String r0 = r11.A03
            X.1yu r4 = X.C39771tc.A01(r2, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21495Al4.call():java.lang.Object");
    }
}
