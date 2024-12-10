package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.location.PlaceInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9BW  reason: invalid class name */
public class AnonymousClass9BW extends A34 {
    public int A00;
    public Location A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final /* synthetic */ AnonymousClass75M A05;

    public AnonymousClass9BW(Location location, AnonymousClass75M r2, String str, int i, boolean z, boolean z2) {
        this.A05 = r2;
        this.A01 = location;
        this.A02 = str;
        this.A00 = i;
        this.A04 = z;
        this.A03 = z2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:70|(1:72)|73|74|75|76|(1:78)|79|(3:83|84|(1:86))|87|88|(2:90|(3:92|(11:94|95|96|(1:100)|101|(6:103|(3:107|(1:111)|112)|113|(3:117|(1:121)|122)|123|(3:127|(1:131)|132))|133|(2:135|(1:(2:137|(1:142)(3:203|141|143))(1:204)))|150|202|155)|200))(1:156)|157|158|159) */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0418, code lost:
        if (r7 != null) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x041a, code lost:
        r1 = r7.optJSONObject(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0420, code lost:
        if (r1 == null) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0422, code lost:
        r0 = r1.optString("prefix");
        r25.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x042a, code lost:
        if (r0 == null) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x042c, code lost:
        r25.A05 = X.AnonymousClass000.A0y("64.png", X.AnonymousClass000.A11(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x047a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x047e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0215, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x02ca */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0448 A[Catch:{ JSONException -> 0x043e }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02d4 A[Catch:{ JSONException -> 0x043e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r44) {
        /*
            r43 = this;
            r1 = r43
            X.75M r0 = r1.A05
            X.9yj r5 = r0.A1E
            android.location.Location r8 = r1.A01
            int r4 = r1.A00
            java.lang.String r3 = r1.A02
            java.lang.Integer r1 = r0.A0X
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            boolean r24 = X.AnonymousClass3Ma.A1Z(r1, r0)
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            if (r3 != 0) goto L_0x001c
            java.lang.String r3 = ""
        L_0x001c:
            java.util.ArrayList r0 = r5.A05
            r42 = r0
            java.util.Iterator r12 = r42.iterator()
        L_0x0024:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r2 = r12.next()
            X.AEr r2 = (X.C20283AEr) r2
            java.lang.String r0 = r2.A0C
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0024
            android.location.Location r0 = r2.A00()
            X.C17960vV.A07(r0)
            float r0 = r0.distanceTo(r8)
            double r0 = (double) r0
            int r11 = r2.A0A
            int r6 = r11 + r4
            double r6 = (double) r6
            r9 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r6 = r6 * r9
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 / r9
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0024
            int r11 = r11 - r4
            int r0 = java.lang.Math.abs(r11)
            double r0 = (double) r0
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0024
            java.util.List r0 = r2.A0D
            r0.size()
            r0 = 1
            r2.A06 = r0
            java.lang.String r0 = r5.A04
            r2.A05 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A06
            int r0 = r0.getAndIncrement()
            r2.A00 = r0
            X.C198679yj.A00(r2, r5)
        L_0x0077:
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x0095
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x0095
            r0 = r42
            r0.add(r2)
            int r1 = r42.size()
            r0 = 12
            if (r1 <= r0) goto L_0x0095
            r1 = 0
            r0 = r42
            r0.remove(r1)
        L_0x0095:
            if (r24 == 0) goto L_0x04e1
            java.util.List r5 = r2.A0D
            java.util.Iterator r6 = r5.iterator()
        L_0x009d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04d6
            java.lang.Object r4 = r6.next()
            com.whatsapp.location.PlaceInfo r4 = (com.whatsapp.location.PlaceInfo) r4
            android.location.Location r3 = r4.A0C
            if (r3 != 0) goto L_0x00c0
            java.lang.String r0 = ""
            android.location.Location r3 = new android.location.Location
            r3.<init>(r0)
            double r0 = r4.A01
            r3.setLatitude(r0)
            double r0 = r4.A02
            r3.setLongitude(r0)
            r4.A0C = r3
        L_0x00c0:
            float r0 = r3.distanceTo(r8)
            double r0 = (double) r0
            r4.A00 = r0
            goto L_0x009d
        L_0x00c8:
            r23 = 1
            r22 = 0
        L_0x00cc:
            r12 = 3
            r21 = 4
            X.0vl r0 = r5.A07     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            boolean r0 = X.C72453Mb.A1a(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            if (r0 == 0) goto L_0x021b
            r0 = 2
            X.AEr r2 = new X.AEr     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r2.<init>(r8, r3, r0, r4)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            android.net.Uri$Builder r6 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.<init>()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r0 = X.C197569wu.A0O     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.encodedPath(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            double r0 = r8.getLatitude()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r7.append(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r0 = " , "
            r7.append(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            double r0 = r8.getLongitude()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r7.append(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r0 = r7.toString()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r11 = "location"
            r6.appendQueryParameter(r11, r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r1 = "radius"
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r1 = "key"
            java.lang.String r0 = X.C197569wu.A0N     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = "keyword"
            r6.appendQueryParameter(r0, r3)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
        L_0x0122:
            java.lang.String r1 = "type"
            java.lang.String r0 = "point_of_interest"
            r6.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            android.net.Uri r0 = r6.build()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r6 = X.C18070vi.A0H(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            X.1D9 r1 = r5.A03     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.Integer r0 = X.C17880vN.A0l()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            X.AUZ r10 = r1.A08(r0, r6)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.net.HttpURLConnection r0 = r10.A01     // Catch:{ all -> 0x0213 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x0213 }
            r0 = 200(0xc8, float:2.8E-43)
            r6 = 0
            if (r1 != r0) goto L_0x020e
            X.181 r1 = r5.A01     // Catch:{ all -> 0x0213 }
            r0 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0213 }
            X.9Hb r0 = r10.BMP(r1, r6, r0)     // Catch:{ all -> 0x0213 }
            org.json.JSONObject r6 = X.AnonymousClass1EY.A01(r0)     // Catch:{ all -> 0x0213 }
            if (r6 == 0) goto L_0x020e
            java.lang.String r0 = "status"
            java.lang.String r1 = X.C18070vi.A0J(r0, r6)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "OK"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x020e
            java.util.List r0 = r2.A0D     // Catch:{ all -> 0x0213 }
            r16 = r0
            java.lang.String r0 = "results"
            org.json.JSONArray r14 = r6.getJSONArray(r0)     // Catch:{ all -> 0x0213 }
            X.C18070vi.A0X(r14)     // Catch:{ all -> 0x0213 }
            int r13 = r14.length()     // Catch:{ all -> 0x0213 }
            r9 = 0
        L_0x0178:
            if (r9 >= r13) goto L_0x020e
            org.json.JSONObject r7 = r14.getJSONObject(r9)     // Catch:{ JSONException -> 0x0204 }
            X.C18070vi.A0X(r7)     // Catch:{ JSONException -> 0x0204 }
            r26 = 0
            r34 = 0
            r40 = 0
            com.whatsapp.location.PlaceInfo r6 = new com.whatsapp.location.PlaceInfo     // Catch:{ JSONException -> 0x0204 }
            r28 = r26
            r29 = r26
            r30 = r26
            r31 = r26
            r32 = r26
            r33 = r26
            r38 = r34
            r25 = r6
            r27 = r26
            r36 = r34
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)     // Catch:{ JSONException -> 0x0204 }
            r0 = 2
            r6.A03 = r0     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = "name"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0204 }
            r6.A06 = r0     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = "place_id"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0204 }
            r6.A07 = r0     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = "vicinity"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0204 }
            r6.A09 = r0     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = "icon"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0204 }
            r6.A05 = r0     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = "geometry"
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ JSONException -> 0x0204 }
            if (r0 == 0) goto L_0x01fe
            org.json.JSONObject r15 = r0.getJSONObject(r11)     // Catch:{ JSONException -> 0x0204 }
            if (r15 == 0) goto L_0x01e1
            java.lang.String r0 = "lat"
            double r0 = r15.getDouble(r0)     // Catch:{ JSONException -> 0x0204 }
            r6.A01 = r0     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = "lng"
            double r0 = r15.getDouble(r0)     // Catch:{ JSONException -> 0x0204 }
            r6.A02 = r0     // Catch:{ JSONException -> 0x0204 }
        L_0x01e1:
            java.lang.String r0 = "url"
            java.lang.String r0 = r7.optString(r0)     // Catch:{ JSONException -> 0x0204 }
            if (r0 != 0) goto L_0x01f8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = "https://maps.google.com/maps?q=place_id:"
            r1.append(r0)     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = r6.A07     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ JSONException -> 0x0204 }
        L_0x01f8:
            r6.A08 = r0     // Catch:{ JSONException -> 0x0204 }
            java.lang.String r0 = r6.A09     // Catch:{ JSONException -> 0x0204 }
            r6.A04 = r0     // Catch:{ JSONException -> 0x0204 }
        L_0x01fe:
            r0 = r16
            r0.add(r6)     // Catch:{ JSONException -> 0x0204 }
            goto L_0x020a
        L_0x0204:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/google/json-exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0213 }
        L_0x020a:
            int r9 = r9 + 1
            goto L_0x0178
        L_0x020e:
            r10.close()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            goto L_0x046d
        L_0x0213:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0215 }
        L_0x0215:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            goto L_0x047e
        L_0x021b:
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            X.AEr r2 = new X.AEr     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r2.<init>(r8, r3, r12, r4)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            android.net.Uri$Builder r6 = new android.net.Uri$Builder     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.<init>()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r0 = X.C197569wu.A0E     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.encodedPath(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r1 = "client_secret"
            java.lang.String r0 = X.C197569wu.A0G     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r1 = "client_id"
            java.lang.String r0 = X.C197569wu.A0F     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r1 = "v"
            java.lang.String r0 = X.C197569wu.A0H     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r6.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            double r0 = r8.getLatitude()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r7.append(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r0 = 44
            r7.append(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            double r0 = r8.getLongitude()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r7.append(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r1 = r7.toString()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r0 = "ll"
            r6.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r0 = 99999(0x1869f, float:1.40128E-40)
            int r0 = java.lang.Math.min(r4, r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r0 = "radius"
            r6.appendQueryParameter(r0, r1)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            if (r0 == 0) goto L_0x027e
            java.lang.String r0 = "query"
            r6.appendQueryParameter(r0, r3)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
        L_0x027e:
            android.net.Uri r0 = r6.build()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r1 = X.C18070vi.A0H(r0)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            X.1D9 r0 = r5.A03     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.Integer r6 = X.C17880vN.A0l()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            X.AUZ r9 = r0.A08(r6, r1)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            java.lang.String r0 = "X-RateLimit-Limit"
            java.net.HttpURLConnection r1 = r9.A01     // Catch:{ all -> 0x0478 }
            java.lang.String r10 = r1.getHeaderField(r0)     // Catch:{ all -> 0x0478 }
            if (r10 == 0) goto L_0x02a3
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0478 }
            java.lang.String r0 = "placelist/getplaces/foursquare/X-RateLimit-Limit:"
            X.C17900vP.A0f(r0, r10, r7)     // Catch:{ all -> 0x0478 }
        L_0x02a3:
            java.lang.String r0 = "X-RateLimit-Remaining"
            java.lang.String r10 = r1.getHeaderField(r0)     // Catch:{ all -> 0x0478 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0478 }
            java.lang.String r0 = "placelist/getplaces/foursquare/X-RateLimit-Remaining:"
            X.C17900vP.A0f(r0, r10, r7)     // Catch:{ all -> 0x0478 }
            if (r10 == 0) goto L_0x02ca
            int r0 = r10.length()     // Catch:{ all -> 0x0478 }
            if (r0 == 0) goto L_0x02ca
            int r0 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x02ca }
            if (r0 != 0) goto L_0x02ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x02ca }
            r2.A02 = r0     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.String r0 = "error_out_of_quota"
            r2.A04 = r0     // Catch:{ NumberFormatException -> 0x02ca }
        L_0x02ca:
            int r7 = r1.getResponseCode()     // Catch:{ all -> 0x0478 }
            r0 = 200(0xc8, float:2.8E-43)
            r20 = 0
            if (r7 != r0) goto L_0x0448
            X.181 r6 = r5.A01     // Catch:{ all -> 0x0478 }
            r0 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0478 }
            r0 = r20
            X.9Hb r0 = r9.BMP(r6, r0, r1)     // Catch:{ all -> 0x0478 }
            org.json.JSONObject r1 = X.AnonymousClass1EY.A01(r0)     // Catch:{ all -> 0x0478 }
            if (r1 == 0) goto L_0x045d
            java.util.List r0 = r2.A0D     // Catch:{ all -> 0x0478 }
            r41 = r0
            java.lang.String r0 = "response"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ all -> 0x0478 }
            java.lang.String r0 = "venues"
            org.json.JSONArray r17 = r1.getJSONArray(r0)     // Catch:{ all -> 0x0478 }
            int r14 = r17.length()     // Catch:{ all -> 0x0478 }
            r11 = 0
        L_0x02fd:
            if (r11 >= r14) goto L_0x045d
            r0 = r17
            org.json.JSONObject r10 = r0.getJSONObject(r11)     // Catch:{ JSONException -> 0x043e }
            r34 = 0
            r7 = 0
            com.whatsapp.location.PlaceInfo r6 = new com.whatsapp.location.PlaceInfo     // Catch:{ JSONException -> 0x043e }
            r27 = r20
            r28 = r20
            r29 = r20
            r30 = r20
            r31 = r20
            r32 = r20
            r33 = r20
            r38 = r34
            r25 = r6
            r26 = r20
            r36 = r34
            r40 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)     // Catch:{ JSONException -> 0x043e }
            X.C18070vi.A0b(r10)     // Catch:{ JSONException -> 0x043e }
            X.C18070vi.A0d(r10, r7)     // Catch:{ JSONException -> 0x043e }
            r6.A03 = r12     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = "name"
            java.lang.String r0 = r10.getString(r0)     // Catch:{ JSONException -> 0x043e }
            r6.A06 = r0     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = "url"
            java.lang.String r0 = r10.optString(r0)     // Catch:{ JSONException -> 0x043e }
            r6.A08 = r0     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = "id"
            java.lang.String r13 = r10.optString(r0)     // Catch:{ JSONException -> 0x043e }
            r6.A07 = r13     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = r6.A08     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x034f
            int r0 = r0.length()     // Catch:{ JSONException -> 0x043e }
            if (r0 != 0) goto L_0x035b
        L_0x034f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = "https://foursquare.com/v/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r13, r1)     // Catch:{ JSONException -> 0x043e }
            r6.A08 = r0     // Catch:{ JSONException -> 0x043e }
        L_0x035b:
            java.lang.String r0 = "location"
            org.json.JSONObject r13 = r10.getJSONObject(r0)     // Catch:{ JSONException -> 0x043e }
            if (r13 == 0) goto L_0x03f1
            java.lang.String r0 = "lat"
            double r0 = r13.optDouble(r0)     // Catch:{ JSONException -> 0x043e }
            r6.A01 = r0     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = "lng"
            double r0 = r13.optDouble(r0)     // Catch:{ JSONException -> 0x043e }
            r6.A02 = r0     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = "address"
            java.lang.String r0 = r13.optString(r0)     // Catch:{ JSONException -> 0x043e }
            r6.A04 = r0     // Catch:{ JSONException -> 0x043e }
            r6.A09 = r0     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = "city"
            java.lang.String r15 = r13.optString(r0)     // Catch:{ JSONException -> 0x043e }
            java.lang.String r1 = ", "
            if (r15 == 0) goto L_0x03a3
            int r0 = r15.length()     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x03a3
            java.lang.String r0 = r6.A04     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x039d
            int r16 = r0.length()     // Catch:{ JSONException -> 0x043e }
            if (r16 == 0) goto L_0x039d
            java.lang.String r0 = X.C17900vP.A0A(r0, r1)     // Catch:{ JSONException -> 0x043e }
            r6.A04 = r0     // Catch:{ JSONException -> 0x043e }
        L_0x039d:
            java.lang.String r0 = X.C17900vP.A0A(r0, r15)     // Catch:{ JSONException -> 0x043e }
            r6.A04 = r0     // Catch:{ JSONException -> 0x043e }
        L_0x03a3:
            java.lang.String r0 = "state"
            java.lang.String r15 = r13.optString(r0)     // Catch:{ JSONException -> 0x043e }
            if (r15 == 0) goto L_0x03c7
            int r0 = r15.length()     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x03c7
            java.lang.String r0 = r6.A04     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x03c1
            int r16 = r0.length()     // Catch:{ JSONException -> 0x043e }
            if (r16 == 0) goto L_0x03c1
            java.lang.String r0 = X.C17900vP.A0A(r0, r1)     // Catch:{ JSONException -> 0x043e }
            r6.A04 = r0     // Catch:{ JSONException -> 0x043e }
        L_0x03c1:
            java.lang.String r0 = X.C17900vP.A0A(r0, r15)     // Catch:{ JSONException -> 0x043e }
            r6.A04 = r0     // Catch:{ JSONException -> 0x043e }
        L_0x03c7:
            java.lang.String r0 = "postalCode"
            java.lang.String r13 = r13.optString(r0)     // Catch:{ JSONException -> 0x043e }
            if (r13 == 0) goto L_0x03f1
            int r0 = r13.length()     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x03f1
            java.lang.String r1 = r6.A04     // Catch:{ JSONException -> 0x043e }
            if (r1 == 0) goto L_0x03eb
            int r0 = r1.length()     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x03eb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)     // Catch:{ JSONException -> 0x043e }
            r0 = 32
            java.lang.String r1 = X.C17890vO.A0c(r1, r0)     // Catch:{ JSONException -> 0x043e }
            r6.A04 = r1     // Catch:{ JSONException -> 0x043e }
        L_0x03eb:
            java.lang.String r0 = X.C17900vP.A0A(r1, r13)     // Catch:{ JSONException -> 0x043e }
            r6.A04 = r0     // Catch:{ JSONException -> 0x043e }
        L_0x03f1:
            java.lang.String r0 = "categories"
            org.json.JSONArray r13 = r10.optJSONArray(r0)     // Catch:{ JSONException -> 0x043e }
            if (r13 == 0) goto L_0x0438
            r10 = 0
            org.json.JSONObject r7 = r13.optJSONObject(r7)     // Catch:{ JSONException -> 0x043e }
            int r15 = r13.length()     // Catch:{ JSONException -> 0x043e }
        L_0x0402:
            if (r10 >= r15) goto L_0x0418
            org.json.JSONObject r1 = r13.optJSONObject(r10)     // Catch:{ JSONException -> 0x043e }
            if (r1 == 0) goto L_0x0413
            java.lang.String r0 = "primary"
            boolean r0 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x0413
            goto L_0x0416
        L_0x0413:
            int r10 = r10 + 1
            goto L_0x0402
        L_0x0416:
            r7 = r1
            goto L_0x041a
        L_0x0418:
            if (r7 == 0) goto L_0x0438
        L_0x041a:
            java.lang.String r0 = "icon"
            org.json.JSONObject r1 = r7.optJSONObject(r0)     // Catch:{ JSONException -> 0x043e }
            if (r1 == 0) goto L_0x0438
            java.lang.String r0 = "prefix"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ JSONException -> 0x043e }
            r6.A05 = r0     // Catch:{ JSONException -> 0x043e }
            if (r0 == 0) goto L_0x0438
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ JSONException -> 0x043e }
            java.lang.String r0 = "64.png"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ JSONException -> 0x043e }
            r6.A05 = r0     // Catch:{ JSONException -> 0x043e }
        L_0x0438:
            r0 = r41
            r0.add(r6)     // Catch:{ JSONException -> 0x043e }
            goto L_0x0444
        L_0x043e:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/foursquare/json-exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0478 }
        L_0x0444:
            int r11 = r11 + 1
            goto L_0x02fd
        L_0x0448:
            r2.A02 = r6     // Catch:{ all -> 0x0478 }
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x0478 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0478 }
            r2.A04 = r6     // Catch:{ all -> 0x0478 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0478 }
            java.lang.String r0 = "placelist/getplaces/foursquare/error-status:"
            X.C17900vP.A0e(r0, r6, r1)     // Catch:{ all -> 0x0478 }
        L_0x045d:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0478 }
            long r0 = r0 - r18
            r2.A01 = r0     // Catch:{ all -> 0x0478 }
            java.util.List r0 = r2.A0D     // Catch:{ all -> 0x0478 }
            r0.size()     // Catch:{ all -> 0x0478 }
            r9.close()     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
        L_0x046d:
            java.lang.Integer r0 = r2.A02     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            if (r0 != 0) goto L_0x04a8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            r2.A02 = r0     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
            goto L_0x04a8
        L_0x0478:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x047a }
        L_0x047a:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
        L_0x047e:
            throw r0     // Catch:{ JSONException -> 0x0493, IOException -> 0x047f }
        L_0x047f:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/io-exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.AEr r2 = new X.AEr
            r2.<init>(r8, r3, r12, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r2.A02 = r0
            java.lang.String r0 = "error_communication"
            goto L_0x04a6
        L_0x0493:
            r1 = move-exception
            java.lang.String r0 = "placelist/getplaces/json-exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.AEr r2 = new X.AEr
            r2.<init>(r8, r3, r12, r4)
            java.lang.Integer r0 = X.C17880vN.A0l()
            r2.A02 = r0
            java.lang.String r0 = "error_json"
        L_0x04a6:
            r2.A04 = r0
        L_0x04a8:
            java.lang.String r0 = r5.A04
            r2.A05 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A06
            int r0 = r0.getAndIncrement()
            r2.A00 = r0
            X.C198679yj.A00(r2, r5)
            java.util.List r0 = r2.A0D
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0077
            java.lang.Integer r0 = r2.A02
            if (r0 == 0) goto L_0x04cd
            int r1 = r0.intValue()
            r0 = r21
            if (r1 != r0) goto L_0x04cd
            goto L_0x0077
        L_0x04cd:
            int r22 = r22 + 1
            r1 = 2
            r0 = r22
            if (r0 >= r1) goto L_0x0077
            goto L_0x00cc
        L_0x04d6:
            X.B3k r3 = X.C22333B3k.A00
            r1 = 7
            X.Akk r0 = new X.Akk
            r0.<init>(r3, r1)
            java.util.Collections.sort(r5, r0)
        L_0x04e1:
            X.C17960vV.A07(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BW.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C20283AEr aEr = (C20283AEr) obj;
        if (!C108945cZ.A1T(this)) {
            AnonymousClass75M r9 = this.A05;
            r9.A0V = aEr;
            r9.A0M.setVisibility(8);
            r9.A0N.setVisibility(8);
            boolean z = false;
            if (r9.A0V.A0D.isEmpty()) {
                r9.A11.A08(2131892958, 1);
                AnonymousClass3MX.A1H(r9.A0P, 2131433876, 0);
            } else {
                AnonymousClass3MX.A1H(r9.A0P, 2131433876, 8);
            }
            AnonymousClass75M.A09(r9);
            AnonymousClass75M.A0B(r9);
            r9.A0N();
            if (this.A04 && !r9.A0V.A0D.isEmpty()) {
                ArrayList A13 = AnonymousClass000.A13();
                for (PlaceInfo placeInfo : r9.A0V.A0D) {
                    A13.add(new LatLng(placeInfo.A01, placeInfo.A02));
                }
                if (r9.A0V.A0D.size() <= 1) {
                    z = true;
                }
                C25123CYw cYw = new C25123CYw();
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    cYw.A01((LatLng) it.next());
                }
                LatLngBounds A002 = cYw.A00();
                LatLng latLng = A002.A00;
                double d = latLng.A00;
                LatLng latLng2 = A002.A01;
                double d2 = latLng2.A00;
                double d3 = latLng.A01;
                double d4 = latLng2.A01;
                double d5 = (d - d2) / 10.0d;
                double d6 = (d3 - d4) / 10.0d;
                cYw.A01(new LatLng(d + d5, d3 + d6));
                cYw.A01(new LatLng(d2 - d5, d4 - d6));
                r9.A0W(cYw.A00(), z);
            }
            if (this.A03 && r9.A0e) {
                r9.A0e = false;
                r9.A0Y(Float.valueOf(-0.5f), true);
            }
        }
    }
}
