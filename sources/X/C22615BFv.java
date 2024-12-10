package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.BFv  reason: case insensitive filesystem */
public class C22615BFv extends Handler {
    public final /* synthetic */ C26669D8s A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22615BFv(Looper looper, C26669D8s d8s) {
        super(looper);
        this.A00 = d8s;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            int r1 = r10.what     // Catch:{ Exception -> 0x00d7 }
            if (r1 == 0) goto L_0x0038
            r0 = 1
            if (r1 != r0) goto L_0x00d1
            X.D8s r0 = r9.A00     // Catch:{ Exception -> 0x00d7 }
            X.CSV r3 = r0.A0C     // Catch:{ Exception -> 0x00d7 }
            java.lang.Object r0 = r10.obj     // Catch:{ Exception -> 0x00d7 }
            X.CMh r0 = (X.C24839CMh) r0     // Catch:{ Exception -> 0x00d7 }
            byte[] r1 = r0.A01     // Catch:{ Exception -> 0x00d7 }
            r0 = 0
            android.util.Base64.encodeToString(r1, r0)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r2 = r3.A01     // Catch:{ Exception -> 0x00d7 }
            boolean r0 = r3.A04     // Catch:{ Exception -> 0x00d7 }
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "GIF:"
            boolean r0 = r2.startsWith(r0)     // Catch:{ Exception -> 0x00d7 }
            if (r0 == 0) goto L_0x0027
            r0 = 4
            r2.substring(r0)     // Catch:{ Exception -> 0x00d7 }
        L_0x0027:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = "Failed to get license for video "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ Exception -> 0x00d7 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x00d7 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00d6
        L_0x0038:
            X.D8s r0 = r9.A00     // Catch:{ Exception -> 0x00d7 }
            X.CSV r5 = r0.A0C     // Catch:{ Exception -> 0x00d7 }
            java.lang.Object r1 = r10.obj     // Catch:{ Exception -> 0x00d7 }
            X.CMi r1 = (X.C24840CMi) r1     // Catch:{ Exception -> 0x00d7 }
            boolean r4 = r5.A03     // Catch:{ Exception -> 0x00d7 }
            r8 = 1
            r7 = 0
            java.lang.String r6 = "DrmSessionManagerHelper"
            r2 = 0
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = r1.A00     // Catch:{ Exception -> 0x00d7 }
            r3.append(r0)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = "&signedRequest="
            r3.append(r0)     // Catch:{ Exception -> 0x00d7 }
            byte[] r1 = r1.A01     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00d7 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ Exception -> 0x00d7 }
            if (r4 == 0) goto L_0x0080
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00d7 }
            r0.getQuery()     // Catch:{ Exception -> 0x00d7 }
            boolean r0 = r5.A02     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r1 = "Failed to get provision data"
            if (r0 != 0) goto L_0x007a
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x00d7 }
            android.util.Log.e(r6, r0)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00f9
        L_0x007a:
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x00d7 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00d6
        L_0x0080:
            java.util.Set r0 = X.C24679CEt.A00     // Catch:{ Exception -> 0x00d7 }
            java.net.URLConnection r5 = X.AnonymousClass8BV.A0v(r1)     // Catch:{ all -> 0x00cf }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = "POST"
            r5.setRequestMethod(r0)     // Catch:{ all -> 0x00c8 }
            r5.setDoOutput(r7)     // Catch:{ all -> 0x00c8 }
            r5.setDoInput(r8)     // Catch:{ all -> 0x00c8 }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ all -> 0x00c8 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ all -> 0x00c3 }
            java.io.ByteArrayOutputStream r2 = X.C108945cZ.A15()     // Catch:{ all -> 0x00c3 }
        L_0x009f:
            int r1 = r4.read(r3)     // Catch:{ all -> 0x00c3 }
            r0 = -1
            if (r1 == r0) goto L_0x00aa
            r2.write(r3, r7, r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x009f
        L_0x00aa:
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x00c3 }
            r4.close()     // Catch:{ all -> 0x00c8 }
            r5.disconnect()     // Catch:{ Exception -> 0x00d7 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00d7 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00d7 }
            r1[r7] = r0     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r0 = "Provisioning data from http is %s"
            X.C25922Cog.A01(r6, r0, r1)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00f9
        L_0x00c3:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r2 = move-exception
            if (r5 == 0) goto L_0x00d6
            r5.disconnect()     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00d6
        L_0x00cf:
            r2 = move-exception
            goto L_0x00d6
        L_0x00d1:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00d7 }
            r2.<init>()     // Catch:{ Exception -> 0x00d7 }
        L_0x00d6:
            throw r2     // Catch:{ Exception -> 0x00d7 }
        L_0x00d7:
            r2 = move-exception
            int r1 = r10.arg1
            r0 = 1
            if (r1 != r0) goto L_0x00f9
            int r0 = r10.arg2
            int r1 = r0 + 1
            r0 = 3
            if (r1 > r0) goto L_0x00f9
            android.os.Message r2 = android.os.Message.obtain(r10)
            r2.arg2 = r1
            int r0 = r1 + -1
            int r1 = r0 * 1000
            r0 = 5000(0x1388, float:7.006E-42)
            int r0 = java.lang.Math.min(r1, r0)
            long r0 = (long) r0
            r9.sendMessageDelayed(r2, r0)
            return
        L_0x00f9:
            X.D8s r0 = r9.A00
            X.BFw r1 = r0.A08
            int r0 = r10.what
            X.BE7.A18(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22615BFv.handleMessage(android.os.Message):void");
    }
}
