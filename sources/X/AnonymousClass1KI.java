package X;

import android.os.Parcel;

/* renamed from: X.1KI  reason: invalid class name */
public class AnonymousClass1KI {
    public static final AnonymousClass1KJ[] A01 = {AnonymousClass1KL.A0C, AnonymousClass1KL.A0B, AnonymousClass1KL.A0A};
    public final AnonymousClass1KP A00;

    public static AnonymousClass1KJ A00(Parcel parcel) {
        AnonymousClass1KJ r1 = (AnonymousClass1KJ) parcel.readParcelable(AnonymousClass1KL.class.getClassLoader());
        if (((AnonymousClass1KK) r1).A00 != 0) {
            return AnonymousClass1KL.A0C;
        }
        return r1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:27|28|(5:29|30|31|32|33)|36|37|58|38|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1KJ A01(java.lang.String r20) {
        /*
            r19 = this;
            r2 = r20
            if (r20 == 0) goto L_0x011b
            X.1KJ[] r5 = A01
            r4 = 3
            r3 = 0
        L_0x0008:
            r1 = r5[r3]
            r0 = r1
            X.1KL r0 = (X.AnonymousClass1KL) r0
            java.lang.String r0 = r0.A06
            X.C18070vi.A0W(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0019
            return r1
        L_0x0019:
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x0008
            r0 = r19
            X.1KP r1 = r0.A00
            monitor-enter(r1)
            boolean r0 = r1.A01     // Catch:{ all -> 0x0118 }
            if (r0 != 0) goto L_0x010c
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0118 }
            r0.<init>()     // Catch:{ all -> 0x0118 }
            r1.A00 = r0     // Catch:{ all -> 0x0118 }
            X.118 r0 = r1.A02     // Catch:{ all -> 0x0118 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0118 }
            java.lang.String r3 = "currency_metadata.json"
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00df }
            r6.<init>()     // Catch:{ Exception -> 0x00df }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x00df }
            java.io.InputStream r5 = r0.open(r3)     // Catch:{ Exception -> 0x00df }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x00df }
        L_0x0044:
            int r3 = r5.read(r4)     // Catch:{ Exception -> 0x00df }
            r0 = -1
            if (r3 == r0) goto L_0x0050
            r0 = 0
            r6.write(r4, r0, r3)     // Catch:{ Exception -> 0x00df }
            goto L_0x0044
        L_0x0050:
            r6.close()     // Catch:{ Exception -> 0x00df }
            r5.close()     // Catch:{ Exception -> 0x00df }
            byte[] r3 = r6.toByteArray()     // Catch:{ Exception -> 0x00df }
            if (r3 == 0) goto L_0x0109
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0118 }
            r0.<init>(r3)     // Catch:{ all -> 0x0118 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00dd }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = "fiat_currencies"
            org.json.JSONArray r4 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r7 = "@"
            r3 = 0
        L_0x006f:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x00dd }
            if (r3 >= r0) goto L_0x0109
            org.json.JSONObject r5 = r4.getJSONObject(r3)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = "code"
            java.lang.String r9 = r5.getString(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = "icon"
            java.lang.String r11 = r5.getString(r0)     // Catch:{ JSONException -> 0x008c }
            java.lang.String r0 = "requestIcon"
            java.lang.String r12 = r5.getString(r0)     // Catch:{ JSONException -> 0x008d }
            goto L_0x00a7
        L_0x008c:
            r11 = r7
        L_0x008d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00dd }
            r6.<init>()     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/loadFiatCurrencies: No IconText for "
            r6.append(r0)     // Catch:{ JSONException -> 0x00dd }
            r6.append(r9)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = " and using default icon"
            r6.append(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = r6.toString()     // Catch:{ JSONException -> 0x00dd }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x00dd }
            r12 = r7
        L_0x00a7:
            java.lang.String r0 = "symbol"
            java.lang.String r10 = r5.getString(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = "offset"
            int r16 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = "displayExponent"
            int r17 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = "weight"
            int r18 = r5.getInt(r0)     // Catch:{ JSONException -> 0x00dd }
            r5 = 10000000(0x989680, double:4.9406565E-317)
            java.math.BigDecimal r13 = java.math.BigDecimal.valueOf(r5)     // Catch:{ JSONException -> 0x00dd }
            java.math.BigDecimal r14 = X.AnonymousClass1KL.A0D     // Catch:{ JSONException -> 0x00dd }
            r15 = 0
            X.1KL r8 = new X.1KL     // Catch:{ JSONException -> 0x00dd }
            r8.<init>((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.math.BigDecimal) r13, (java.math.BigDecimal) r14, (int) r15, (int) r16, (int) r17, (int) r18)     // Catch:{ JSONException -> 0x00dd }
            java.util.Map r5 = r1.A00     // Catch:{ JSONException -> 0x00dd }
            java.lang.String r0 = r8.A06     // Catch:{ JSONException -> 0x00dd }
            X.C18070vi.A0W(r0)     // Catch:{ JSONException -> 0x00dd }
            r5.put(r0, r8)     // Catch:{ JSONException -> 0x00dd }
            int r3 = r3 + 1
            goto L_0x006f
        L_0x00dd:
            r4 = move-exception
            goto L_0x00f5
        L_0x00df:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r3.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/getAssetFileAsByte"
            r3.append(r0)     // Catch:{ all -> 0x0118 }
            r3.append(r4)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0118 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
            goto L_0x0109
        L_0x00f5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r3.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "PAY: PaymentCurrencyProvider/load"
            r3.append(r0)     // Catch:{ all -> 0x0118 }
            r3.append(r4)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0118 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0118 }
        L_0x0109:
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x0118 }
        L_0x010c:
            monitor-exit(r1)
            java.util.Map r0 = r1.A00
            java.lang.Object r0 = r0.get(r2)
            X.1KJ r0 = (X.AnonymousClass1KJ) r0
            if (r0 == 0) goto L_0x011b
            return r0
        L_0x0118:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x011b:
            X.1KJ r0 = X.AnonymousClass1KL.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KI.A01(java.lang.String):X.1KJ");
    }

    public AnonymousClass1KI(AnonymousClass1KP r1) {
        this.A00 = r1;
    }
}
