package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.Iterator;
import java.util.List;

public abstract class A8e {
    public static int A00(int i) {
        if (i == 1) {
            return 2131231043;
        }
        if (i == 2) {
            return 2131231042;
        }
        if (i == 3) {
            return 2131231036;
        }
        if (i != 4) {
            return 2131231039;
        }
        return 2131231040;
    }

    public static int A01(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (AnonymousClass8BR.A0Q(list, i).A01 == 2) {
                return i;
            }
        }
        return 0;
    }

    public static String A03(Context context, C20284AEs aEs) {
        if (!TextUtils.isEmpty((CharSequence) null) || aEs.A01 != 2) {
            return null;
        }
        return context.getString(2131893842);
    }

    public static void A06(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("fetchIcon/costs ");
        sb.append(System.currentTimeMillis() - j);
        sb.append(" ms");
        AnonymousClass1QE.A01("PaymentMethodUtils", sb.toString());
    }

    public static void A07(C20284AEs aEs, PaymentMethodRow paymentMethodRow) {
        int i;
        if (aEs instanceof AnonymousClass8pK) {
            i = A00(((AnonymousClass8pK) aEs).A01);
        } else {
            Bitmap A06 = aEs.A06();
            if (A06 != null) {
                paymentMethodRow.A00.setImageBitmap(A06);
                return;
            }
            i = 2131231037;
        }
        paymentMethodRow.A00.setImageResource(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r6 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r6 != null) goto L_0x007a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087 A[SYNTHETIC, Splitter:B:35:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A09(X.AnonymousClass181 r10, java.lang.String r11) {
        /*
            java.lang.String r5 = "fetchIcon/Close InputStream: "
            java.lang.String r4 = "PaymentMethodUtils"
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r0 != 0) goto L_0x009c
            long r8 = java.lang.System.currentTimeMillis()
            r0 = 32768(0x8000, float:4.5918E-41)
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            java.net.URLConnection r2 = X.AnonymousClass8BV.A0v(r11)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r0)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r2.setConnectTimeout(r0)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r0 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            X.9Hb r6 = new X.9Hb     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            r6.<init>(r10, r0, r3, r1)     // Catch:{ MalformedURLException -> 0x006a, IOException -> 0x0059, all -> 0x0081 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            if (r2 != 0) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            java.lang.String r0 = "fetchIcon/failed to decode image data/url="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r11, r1)     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            X.AnonymousClass8BS.A1F(r4, r0)     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            goto L_0x0051
        L_0x0046:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            r0 = 100
            r2.compress(r1, r0, r7)     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
            byte[] r3 = r7.toByteArray()     // Catch:{ MalformedURLException -> 0x0057, IOException -> 0x0055 }
        L_0x0051:
            A06(r8)
            goto L_0x007a
        L_0x0055:
            r1 = move-exception
            goto L_0x005b
        L_0x0057:
            r1 = move-exception
            goto L_0x006c
        L_0x0059:
            r1 = move-exception
            r6 = r3
        L_0x005b:
            java.lang.String r0 = "/fetchIcon/IOException: "
            java.lang.String r0 = X.AnonymousClass1QE.A01(r4, r0)     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x007e }
            A06(r8)
            if (r6 == 0) goto L_0x009c
            goto L_0x007a
        L_0x006a:
            r1 = move-exception
            r6 = r3
        L_0x006c:
            java.lang.String r0 = "fetchIcon/Malformed URL: "
            java.lang.String r0 = X.AnonymousClass1QE.A01(r4, r0)     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x007e }
            A06(r8)
            if (r6 == 0) goto L_0x009c
        L_0x007a:
            r6.close()     // Catch:{ IOException -> 0x0094 }
            return r3
        L_0x007e:
            r2 = move-exception
            r3 = r6
            goto L_0x0082
        L_0x0081:
            r2 = move-exception
        L_0x0082:
            A06(r8)
            if (r3 == 0) goto L_0x0093
            r3.close()     // Catch:{ IOException -> 0x008b }
            throw r2
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass1QE.A01(r4, r5)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0093:
            throw r2
        L_0x0094:
            r1 = move-exception
            java.lang.String r0 = X.AnonymousClass1QE.A01(r4, r5)
            com.whatsapp.util.Log.w(r0, r1)
        L_0x009c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8e.A09(X.181, java.lang.String):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r7, X.AnonymousClass8pK r8) {
        /*
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r6 = r7.getString(r0)
            int r0 = r8.A01
            java.lang.String r4 = X.C20085A6m.A04(r0)
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x0012
            r4 = r5
        L_0x0012:
            int r3 = r8.A00
            r2 = 1
            r1 = 2131893615(0x7f121d6f, float:1.9422012E38)
            if (r3 == r2) goto L_0x0026
            r0 = 4
            r1 = 2131893614(0x7f121d6e, float:1.942201E38)
            if (r3 == r0) goto L_0x0026
            r0 = 6
            if (r3 != r0) goto L_0x0066
            r1 = 2131893613(0x7f121d6d, float:1.9422007E38)
        L_0x0026:
            java.lang.String r0 = r7.getString(r1)
        L_0x002a:
            if (r0 == 0) goto L_0x0041
            r1 = 2131893615(0x7f121d6f, float:1.9422012E38)
            if (r3 == r2) goto L_0x003d
            r0 = 4
            r1 = 2131893614(0x7f121d6e, float:1.942201E38)
            if (r3 == r0) goto L_0x003d
            r0 = 6
            if (r3 != r0) goto L_0x0061
            r1 = 2131893613(0x7f121d6d, float:1.9422007E38)
        L_0x003d:
            java.lang.String r5 = r7.getString(r1)
        L_0x0041:
            X.77e r1 = r8.A09
            boolean r0 = X.C20061A5k.A03(r1)
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = X.AnonymousClass8BS.A0h(r1)
            java.lang.String r3 = A04(r0)
            r2 = 2131893706(0x7f121dca, float:1.9422196E38)
            java.lang.Object[] r1 = X.AnonymousClass8BR.A1a()
            X.AnonymousClass3MY.A1V(r4, r5, r1)
            r0 = 2
            java.lang.String r6 = X.C17880vN.A0q(r7, r3, r1, r0, r2)
        L_0x0060:
            return r6
        L_0x0061:
            java.lang.String r5 = X.C20284AEs.A03(r3)
            goto L_0x0041
        L_0x0066:
            java.lang.String r0 = X.C20284AEs.A03(r3)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8e.A02(android.content.Context, X.8pK):java.lang.String");
    }

    public static String A04(String str) {
        int length = str.length();
        if (length > 4) {
            str = str.substring(length - 4);
        }
        int length2 = str.length();
        int i = length2 - 1;
        int i2 = 0;
        while (i >= 0 && AnonymousClass8BU.A1Y(str, i)) {
            i2++;
            i--;
        }
        if (i2 != length2) {
            return str.substring(length2 - i2);
        }
        return str;
    }

    public static String A05(List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C20284AEs A0P = AnonymousClass8BR.A0P(it);
            if (A0P.A01 == 2) {
                C170278pb r0 = A0P.A08;
                if (r0 != null) {
                    return (String) AnonymousClass8BT.A0q(r0.A09());
                }
                AnonymousClass8BS.A1F("PaymentMethodUtils", "getDefaultAccountHolderName/null country data");
            }
        }
        return null;
    }

    public static boolean A08(C20284AEs aEs) {
        int A05 = aEs.A05();
        if (A05 == 4 || A05 == 1 || A05 == 6 || A05 == 8 || A05 == 7) {
            return true;
        }
        return false;
    }
}
