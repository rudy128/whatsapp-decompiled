package X;

import android.app.ProgressDialog;
import android.content.Intent;
import com.whatsapp.profile.WebImagePicker;

/* renamed from: X.49h  reason: invalid class name and case insensitive filesystem */
public class C826749h extends A34 {
    public ProgressDialog A00;
    public final AnonymousClass4SM A01;
    public final /* synthetic */ WebImagePicker A02;

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13, types: [java.io.OutputStream, java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x019e, code lost:
        if (r4 != 0) goto L_0x01a0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0192 A[Catch:{ all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0197 A[Catch:{ all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0169 A[Catch:{ all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0174 A[Catch:{ all -> 0x01aa }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:88:0x0161=Splitter:B:88:0x0161, B:97:0x0178=Splitter:B:97:0x0178} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r14) {
        /*
            r13 = this;
            r3 = 1
            r4 = 0
            X.4SM r10 = r13.A01     // Catch:{ IOException -> 0x0175, Exception -> 0x015e, all -> 0x015a }
            java.lang.String r2 = r10.A05     // Catch:{ IOException -> 0x0175, Exception -> 0x015e, all -> 0x015a }
            java.lang.String r1 = " "
            java.lang.String r0 = "%20"
            java.lang.String r0 = r2.replace(r1, r0)     // Catch:{ IOException -> 0x0175, Exception -> 0x015e, all -> 0x015a }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0175, Exception -> 0x015e, all -> 0x015a }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0175, Exception -> 0x015e, all -> 0x015a }
            java.lang.String r8 = ""
            r9 = 0
            r12 = r4
            r7 = 0
        L_0x0018:
            r0 = 20
            if (r7 >= r0) goto L_0x00c4
            java.net.URLConnection r5 = X.AnonymousClass1D9.A02(r2)     // Catch:{ IOException -> 0x0155, Exception -> 0x0150, all -> 0x01ac }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0155, Exception -> 0x0150, all -> 0x01ac }
            r0 = 15000(0x3a98, float:2.102E-41)
            r5.setConnectTimeout(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r5.setReadTimeout(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r1 = "User-Agent"
            com.whatsapp.profile.WebImagePicker r0 = r13.A02     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            X.11W r0 = r0.A0G     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = r0.A02()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "Cookie"
            r5.setRequestProperty(r0, r8)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
        L_0x0044:
            int r1 = r5.getResponseCode()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 == r0) goto L_0x004d
            goto L_0x0096
        L_0x004d:
            java.lang.String r0 = "Location"
            java.lang.String r0 = r5.getHeaderField(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r0 == 0) goto L_0x00aa
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = "webimage/download/bg redirected from "
            r1.append(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            r1.append(r2)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = " to "
            X.C17900vP.A0Y(r6, r0, r1)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = "Set-Cookie"
            java.lang.String r2 = r5.getHeaderField(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r2 == 0) goto L_0x0092
            java.lang.String r0 = ";"
            java.lang.String[] r1 = r2.split(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            int r0 = r1.length     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r0 <= 0) goto L_0x007e
            r2 = r1[r9]     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
        L_0x007e:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            if (r0 != 0) goto L_0x008e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            java.lang.String r0 = "; "
            java.lang.String r8 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
        L_0x008e:
            java.lang.String r8 = X.C17900vP.A0A(r8, r2)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
        L_0x0092:
            r5.disconnect()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b8, all -> 0x00b2 }
            goto L_0x00ac
        L_0x0096:
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 302(0x12e, float:4.23E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 303(0x12f, float:4.25E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto L_0x004d
            r0 = 308(0x134, float:4.32E-43)
            if (r1 == r0) goto L_0x004d
        L_0x00aa:
            r12 = r5
            goto L_0x00c4
        L_0x00ac:
            int r7 = r7 + 1
            r12 = r5
            r2 = r6
            goto L_0x0018
        L_0x00b2:
            r0 = move-exception
            r2 = r4
            r6 = r4
            r4 = r5
            goto L_0x01b0
        L_0x00b8:
            r1 = move-exception
            r6 = r4
            r2 = r4
            r4 = r5
            goto L_0x0161
        L_0x00be:
            r1 = move-exception
            r6 = r4
            r2 = r4
            r4 = r5
            goto L_0x0178
        L_0x00c4:
            com.whatsapp.profile.WebImagePicker r6 = r13.A02     // Catch:{ IOException -> 0x0155, Exception -> 0x0150, all -> 0x01ac }
            X.181 r5 = r6.A07     // Catch:{ IOException -> 0x0155, Exception -> 0x0150, all -> 0x01ac }
            r0 = 25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0155, Exception -> 0x0150, all -> 0x01ac }
            java.io.InputStream r0 = r12.getInputStream()     // Catch:{ IOException -> 0x0155, Exception -> 0x0150, all -> 0x01ac }
            X.9Hb r2 = new X.9Hb     // Catch:{ IOException -> 0x0155, Exception -> 0x0150, all -> 0x01ac }
            r2.<init>(r5, r0, r4, r1)     // Catch:{ IOException -> 0x0155, Exception -> 0x0150, all -> 0x01ac }
            X.11C r0 = r6.A08     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            X.11B r1 = r0.A0O()     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            if (r1 != 0) goto L_0x00e5
            java.lang.String r0 = "webimage/download/bg cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            goto L_0x00eb
        L_0x00e5:
            android.net.Uri r0 = r6.A02     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            java.io.OutputStream r4 = r1.A08(r0)     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
        L_0x00eb:
            if (r4 != 0) goto L_0x00fd
            java.lang.String r0 = "webimage/download/bg os=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            r12.disconnect()
            X.AnonymousClass1EY.A02(r2)
            return r0
        L_0x00fd:
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r8]     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            r11 = 0
            r6 = 0
        L_0x0103:
            X.8CU r5 = r13.A02     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            boolean r0 = r5.isCancelled()     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            if (r0 != 0) goto L_0x012a
            int r1 = r2.read(r7, r9, r8)     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            r0 = -1
            if (r1 == r0) goto L_0x012a
            r4.write(r7, r9, r1)     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            int r11 = r11 + r1
            int r0 = r10.A02     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            r1 = 0
            if (r0 == 0) goto L_0x011e
            int r1 = r11 * 100
            int r1 = r1 / r0
        L_0x011e:
            if (r1 == r6) goto L_0x0103
            java.lang.Integer[] r0 = new java.lang.Integer[r3]     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            X.C17880vN.A1T(r0, r1, r9)     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            r13.A0C(r0)     // Catch:{ IOException -> 0x014d, Exception -> 0x014a, all -> 0x0148 }
            r6 = r1
            goto L_0x0103
        L_0x012a:
            r12.disconnect()
            X.AnonymousClass1EY.A02(r2)
            X.AnonymousClass1EY.A02(r4)
            boolean r0 = r5.isCancelled()
            if (r0 != 0) goto L_0x013e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            return r0
        L_0x013e:
            java.lang.String r0 = "webimage/download/bg/cancelled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L_0x0148:
            r0 = move-exception
            goto L_0x01ae
        L_0x014a:
            r1 = move-exception
            r6 = r4
            goto L_0x0153
        L_0x014d:
            r1 = move-exception
            r6 = r4
            goto L_0x0158
        L_0x0150:
            r1 = move-exception
            r6 = r4
            r2 = r4
        L_0x0153:
            r4 = r12
            goto L_0x0161
        L_0x0155:
            r1 = move-exception
            r6 = r4
            r2 = r4
        L_0x0158:
            r4 = r12
            goto L_0x0178
        L_0x015a:
            r0 = move-exception
            r2 = r4
            r6 = r4
            goto L_0x01b0
        L_0x015e:
            r1 = move-exception
            r6 = r4
            r2 = r4
        L_0x0161:
            X.8CU r0 = r13.A02     // Catch:{ all -> 0x01aa }
            boolean r0 = r0.isCancelled()     // Catch:{ all -> 0x01aa }
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "webimage/download/bg/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01aa }
        L_0x016e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01aa }
            if (r4 == 0) goto L_0x01a3
            goto L_0x01a0
        L_0x0175:
            r1 = move-exception
            r6 = r4
            r2 = r4
        L_0x0178:
            X.8CU r0 = r13.A02     // Catch:{ all -> 0x01aa }
            boolean r0 = r0.isCancelled()     // Catch:{ all -> 0x01aa }
            if (r0 != 0) goto L_0x0197
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0197
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0197
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ all -> 0x01aa }
            goto L_0x019e
        L_0x0197:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01aa }
            if (r4 == 0) goto L_0x01a3
            goto L_0x01a0
        L_0x019e:
            if (r4 == 0) goto L_0x01a3
        L_0x01a0:
            r4.disconnect()
        L_0x01a3:
            X.AnonymousClass1EY.A02(r2)
            X.AnonymousClass1EY.A02(r6)
            return r0
        L_0x01aa:
            r0 = move-exception
            goto L_0x01b0
        L_0x01ac:
            r0 = move-exception
            r2 = r4
        L_0x01ae:
            r6 = r4
            r4 = r12
        L_0x01b0:
            if (r4 == 0) goto L_0x01b5
            r4.disconnect()
        L_0x01b5:
            X.AnonymousClass1EY.A02(r2)
            X.AnonymousClass1EY.A02(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C826749h.A0G(java.lang.Object[]):java.lang.Object");
    }

    public C826749h(AnonymousClass4SM r1, WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
        this.A01 = r1;
    }

    public void A0F() {
        WebImagePicker webImagePicker = this.A02;
        ProgressDialog progressDialog = new ProgressDialog(webImagePicker);
        this.A00 = progressDialog;
        progressDialog.setProgressStyle(1);
        this.A00.setMessage(webImagePicker.getString(2131894543));
        this.A00.setCancelable(true);
        this.A00.setOnCancelListener(new C88794an(this, 10));
        this.A00.show();
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Number number = (Number) obj;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.A00 = null;
        WebImagePicker webImagePicker = this.A02;
        if (webImagePicker.A0C == this) {
            webImagePicker.A0C = null;
        }
        int intValue = number.intValue();
        if (intValue == 0) {
            Intent A0A = C17880vN.A0A();
            A0A.putExtra("webImageSource", this.A01.A06);
            C72453Mb.A16(webImagePicker, A0A);
        } else if (!this.A02.isCancelled()) {
            C17900vP.A0X(number, "webimage/download/error ", AnonymousClass000.A10());
            if (intValue == 2) {
                webImagePicker.A0C.get();
                int i = 2131891425;
                if (AnonymousClass11Z.A00()) {
                    i = 2131891422;
                }
                webImagePicker.BhQ(i);
                return;
            }
            webImagePicker.A05.A08(2131889981, 1);
        }
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null) {
            progressDialog.setProgress(numArr[0].intValue());
        }
    }
}
