package X;

/* renamed from: X.48u  reason: invalid class name */
public class AnonymousClass48u extends A34 {
    public final /* synthetic */ C72983On A00;

    public AnonymousClass48u(C72983On r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.4SM, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0231, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0254, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0255, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0259, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x01ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x014a */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0254 A[ExcHandler: IOException | JSONException (r0v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0135 A[Catch:{ all -> 0x0231, IOException | JSONException -> 0x0254 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e6 A[Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r11) {
        /*
            r10 = this;
            X.3On r0 = r10.A00     // Catch:{ IOException | JSONException -> 0x0254 }
            com.whatsapp.profile.WebImagePicker r0 = r0.A02     // Catch:{ IOException | JSONException -> 0x0254 }
            X.CTp r2 = r0.A0D     // Catch:{ IOException | JSONException -> 0x0254 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ IOException | JSONException -> 0x0254 }
            r2.A02 = r0     // Catch:{ IOException | JSONException -> 0x0254 }
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ IOException | JSONException -> 0x0254 }
            r4.<init>()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = X.C197569wu.A02     // Catch:{ IOException | JSONException -> 0x0254 }
            r4.encodedPath(r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r1 = "SafeSearch"
            java.lang.String r0 = X.C197569wu.A05     // Catch:{ IOException | JSONException -> 0x0254 }
            r4.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r1 = "appid"
            java.lang.String r0 = X.C197569wu.A03     // Catch:{ IOException | JSONException -> 0x0254 }
            r4.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r1 = "aspect"
            java.lang.String r0 = X.C197569wu.A04     // Catch:{ IOException | JSONException -> 0x0254 }
            r4.appendQueryParameter(r1, r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = r2.A07     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "q"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r1 = X.AnonymousClass3MZ.A16()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r3 = r0.getCountry()     // Catch:{ IOException | JSONException -> 0x0254 }
            boolean r0 = r3.isEmpty()     // Catch:{ IOException | JSONException -> 0x0254 }
            if (r0 != 0) goto L_0x0052
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "-"
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ IOException | JSONException -> 0x0254 }
        L_0x0052:
            java.util.List r0 = r2.A08     // Catch:{ IOException | JSONException -> 0x0254 }
            boolean r0 = r0.contains(r1)     // Catch:{ IOException | JSONException -> 0x0254 }
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = "en-US"
        L_0x005c:
            java.lang.String r0 = "mkt"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0254 }
            int r0 = r2.A00     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "offset"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0254 }
            r0 = 50
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "count"
            r4.appendQueryParameter(r0, r1)     // Catch:{ IOException | JSONException -> 0x0254 }
            android.net.Uri r0 = r4.build()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r7 = r0.toString()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r1 = X.C17970vW.A04(r7)     // Catch:{ IOException | JSONException -> 0x0254 }
            if (r1 == 0) goto L_0x0251
            java.io.File r0 = r2.A06     // Catch:{ IOException | JSONException -> 0x0254 }
            java.io.File r6 = X.C17880vN.A0e(r0, r1)     // Catch:{ IOException | JSONException -> 0x0254 }
            boolean r0 = r6.exists()     // Catch:{ IOException | JSONException -> 0x0254 }
            r5 = 0
            if (r0 == 0) goto L_0x00d8
            long r8 = r6.lastModified()     // Catch:{ IOException | JSONException -> 0x0254 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 + r0
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | JSONException -> 0x0254 }
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x00d3, IOException | JSONException -> 0x0254 }
            r4.<init>(r6)     // Catch:{ IOException | ClassNotFoundException -> 0x00d3, IOException | JSONException -> 0x0254 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ all -> 0x00c9 }
            r0.<init>(r4)     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r0.readObject()     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00bf }
            r0.close()     // Catch:{ all -> 0x00bc }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x00b9, IOException | JSONException -> 0x0254 }
            goto L_0x0133
        L_0x00b9:
            r0 = move-exception
            r5 = r3
            goto L_0x00d4
        L_0x00bc:
            r1 = move-exception
            r5 = r3
            goto L_0x00ca
        L_0x00bf:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00c4 }
            goto L_0x00c8
        L_0x00c4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c9 }
        L_0x00c8:
            throw r1     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r1 = move-exception
        L_0x00ca:
            r4.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00d2
        L_0x00ce:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | ClassNotFoundException -> 0x00d3, IOException | JSONException -> 0x0254 }
        L_0x00d2:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x00d3, IOException | JSONException -> 0x0254 }
        L_0x00d3:
            r0 = move-exception
        L_0x00d4:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            goto L_0x0132
        L_0x00d8:
            boolean r0 = r6.delete()     // Catch:{ IOException | JSONException -> 0x0254 }
            if (r0 != 0) goto L_0x00e7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "WebImageSearcher/next failed to delete "
            X.C17900vP.A0X(r6, r0, r1)     // Catch:{ IOException | JSONException -> 0x0254 }
        L_0x00e7:
            X.1D9 r1 = r2.A05     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.Integer r0 = X.C17880vN.A0l()     // Catch:{ IOException | JSONException -> 0x0254 }
            X.AUZ r4 = r1.A08(r0, r7)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.net.HttpURLConnection r0 = r4.A01     // Catch:{ all -> 0x022c }
            int r3 = r0.getResponseCode()     // Catch:{ all -> 0x022c }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 != r0) goto L_0x021c
            X.181 r1 = r2.A03     // Catch:{ all -> 0x022c }
            r0 = 25
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x022c }
            X.9Hb r3 = r4.BMP(r1, r5, r0)     // Catch:{ all -> 0x022c }
            java.lang.String r5 = X.AnonymousClass1EY.A00(r3)     // Catch:{ all -> 0x0212 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0126 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0126 }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0126 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0126 }
            r0.writeObject(r5)     // Catch:{ all -> 0x011c }
            r0.close()     // Catch:{ IOException -> 0x0126 }
            goto L_0x012c
        L_0x011c:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0126 }
        L_0x0125:
            throw r1     // Catch:{ IOException -> 0x0126 }
        L_0x0126:
            r1 = move-exception
            java.lang.String r0 = "WebImageSearcher/next"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0212 }
        L_0x012c:
            r3.close()     // Catch:{ all -> 0x022c }
            r4.close()     // Catch:{ IOException | JSONException -> 0x0254 }
        L_0x0132:
            r3 = r5
        L_0x0133:
            if (r3 == 0) goto L_0x0251
            org.json.JSONObject r1 = X.C17880vN.A16(r3)     // Catch:{ IOException | JSONException -> 0x0254 }
            r5 = 0
            r4 = 0
            java.lang.String r0 = "value"
            org.json.JSONArray r4 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x014a, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "totalEstimatedMatches"
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x014a, IOException | JSONException -> 0x0254 }
            r2.A01 = r0     // Catch:{ JSONException -> 0x014a, IOException | JSONException -> 0x0254 }
            goto L_0x014c
        L_0x014a:
            r2.A01 = r5     // Catch:{ IOException | JSONException -> 0x0254 }
        L_0x014c:
            if (r4 == 0) goto L_0x0251
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "results.length() = "
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0254 }
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = ", total:"
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            int r0 = r2.A01     // Catch:{ IOException | JSONException -> 0x0254 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ IOException | JSONException -> 0x0254 }
        L_0x0168:
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0254 }
            if (r5 >= r0) goto L_0x0236
            X.4SM r3 = new X.4SM     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r3.<init>()     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "contentUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r3.A05 = r0     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "hostPageUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r3.A06 = r0     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "contentSize"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            int r0 = r1.nextInt()     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r3.A02 = r0     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r1 = r1.next()     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "KB"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            if (r0 == 0) goto L_0x01d5
            int r0 = r3.A02     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            int r1 = r0 * 1000
        L_0x01a8:
            r3.A02 = r1     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
        L_0x01aa:
            java.lang.String r0 = "width"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r3.A03 = r0     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "height"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r3.A01 = r0     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "thumbnailUrl"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r3.A07 = r0     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "name"
            java.lang.String r0 = r6.optString(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r3.A04 = r0     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "accentColor"
            java.lang.String r1 = r6.optString(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            goto L_0x01e4
        L_0x01d5:
            java.lang.String r0 = "MB"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            if (r0 == 0) goto L_0x01aa
            int r1 = r3.A02     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 * r0
            goto L_0x01a8
        L_0x01e4:
            if (r0 != 0) goto L_0x01ee
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ NumberFormatException -> 0x01ee }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x01ee }
        L_0x01ee:
            int r0 = r3.A03     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 < r1) goto L_0x020e
            int r0 = r3.A01     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            if (r0 < r1) goto L_0x020e
            int r1 = r3.A02     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r0 = 512000(0x7d000, float:7.17465E-40)
            if (r1 > r0) goto L_0x020e
            java.lang.String r1 = r3.A05     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            java.lang.String r0 = X.C197569wu.A0S     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            boolean r0 = r1.startsWith(r0)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            if (r0 == 0) goto L_0x020e
            java.util.ArrayList r0 = r2.A02     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
            r0.add(r3)     // Catch:{ JSONException -> 0x020e, IOException | JSONException -> 0x0254 }
        L_0x020e:
            int r5 = r5 + 1
            goto L_0x0168
        L_0x0212:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0217 }
            goto L_0x022b
        L_0x0217:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022b
        L_0x021c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x022c }
            java.lang.String r0 = "Communication failed, status="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ all -> 0x022c }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x022c }
            r1.<init>(r0)     // Catch:{ all -> 0x022c }
        L_0x022b:
            throw r1     // Catch:{ all -> 0x022c }
        L_0x022c:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0231 }
            goto L_0x0235
        L_0x0231:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException | JSONException -> 0x0254 }
        L_0x0235:
            throw r1     // Catch:{ IOException | JSONException -> 0x0254 }
        L_0x0236:
            int r1 = r2.A00     // Catch:{ IOException | JSONException -> 0x0254 }
            int r0 = r4.length()     // Catch:{ IOException | JSONException -> 0x0254 }
            int r1 = r1 + r0
            r2.A00 = r1     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException | JSONException -> 0x0254 }
            java.lang.String r0 = "# of images retrieved:"
            r1.append(r0)     // Catch:{ IOException | JSONException -> 0x0254 }
            java.util.ArrayList r0 = r2.A02     // Catch:{ IOException | JSONException -> 0x0254 }
            int r0 = r0.size()     // Catch:{ IOException | JSONException -> 0x0254 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ IOException | JSONException -> 0x0254 }
        L_0x0251:
            java.util.ArrayList r0 = r2.A02     // Catch:{ IOException | JSONException -> 0x0254 }
            return r0
        L_0x0254:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48u.A0G(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if ((r6.A0L.size() + 50) >= 100) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.List r9 = (java.util.List) r9
            X.3On r5 = r8.A00
            com.whatsapp.profile.WebImagePicker r6 = r5.A02
            android.widget.ProgressBar r0 = r6.A06
            r3 = 8
            r0.setVisibility(r3)
            r0 = 0
            r5.A00 = r0
            if (r9 == 0) goto L_0x001a
            java.util.ArrayList r0 = r6.A0L
            r9.removeAll(r0)
            r0.addAll(r9)
        L_0x001a:
            X.CTp r0 = r6.A0D
            int r2 = r0.A01
            int r1 = r0.A00
            r0 = 0
            if (r2 <= r1) goto L_0x0024
            r0 = 1
        L_0x0024:
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0035
            java.util.ArrayList r0 = r6.A0L
            int r0 = r0.size()
            int r2 = r0 + 50
            r0 = 100
            r1 = 1
            if (r2 < r0) goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            r5.A01 = r1
            android.view.View r0 = r6.A04
            if (r1 == 0) goto L_0x0071
            r0.setVisibility(r3)
            android.view.View r0 = r6.A05
            r0.setVisibility(r4)
        L_0x0044:
            java.util.ArrayList r0 = r6.A0L
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005e
            android.widget.ListView r0 = r6.getListView()
            android.view.View r3 = r0.getEmptyView()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r9 != 0) goto L_0x0062
            r0 = 2131894555(0x7f12211b, float:1.9423918E38)
            r3.setText(r0)
        L_0x005e:
            r5.notifyDataSetChanged()
            return
        L_0x0062:
            r2 = 2131894545(0x7f122111, float:1.9423898E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.CTp r0 = r6.A0D
            java.lang.String r0 = r0.A07
            r1[r4] = r0
            X.AnonymousClass3MY.A0y(r6, r3, r1, r2)
            goto L_0x005e
        L_0x0071:
            r0.setVisibility(r4)
            android.view.View r0 = r6.A05
            r0.setVisibility(r3)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48u.A0H(java.lang.Object):void");
    }
}
