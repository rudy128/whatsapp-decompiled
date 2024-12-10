package X;

import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.734  reason: invalid class name */
public final class AnonymousClass734 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass181 A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass118 A05;
    public final C19830z4 A06;
    public final C18000vb A07;
    public final C18030ve A08;
    public final C24481Km A09;
    public final JniBridge A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass18K A0C;
    public final C220418j A0D;
    public final AnonymousClass11W A0E;
    public final AnonymousClass00H A0F;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.6oW, java.lang.Object] */
    public static final ArrayList A01(InputStream inputStream) {
        JSONObject jSONObject;
        InputStream inputStream2 = inputStream;
        C18070vi.A0d(inputStream2, 0);
        String A002 = AnonymousClass1EY.A00(inputStream2);
        if (A002 != null) {
            JSONArray jSONArray = new JSONArray(A002);
            ArrayList A0z = C17880vN.A0z(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                ? obj = new Object();
                Object obj2 = jSONArray.get(i);
                if (!(obj2 instanceof JSONObject) || (jSONObject = (JSONObject) obj2) == null) {
                    Log.e("StickerPackParser/readStickerPacksFromInputString invalid pack object");
                } else {
                    boolean z = true;
                    boolean A1T = AnonymousClass000.A1T(jSONObject.optInt("lottie", 0), 1);
                    Object obj3 = jSONObject.get("sticker-pack-id");
                    C18070vi.A0z(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj3;
                    if (jSONObject.has("stickers")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("stickers");
                        C18070vi.A0b(jSONArray2);
                        ArrayList A0z2 = C17880vN.A0z(jSONArray2.length());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            C1418377d r20 = new C1418377d((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false, false, false);
                            r20.A0F = jSONObject2.getString("file-hash");
                            r20.A00 = jSONObject2.getInt("file-size");
                            r20.A0I = jSONObject2.getString("url");
                            r20.A0A = jSONObject2.getString("enc-file-hash");
                            r20.A0D = jSONObject2.getString("media-key");
                            r20.A0E = jSONObject2.getString("mimetype");
                            r20.A02 = jSONObject2.getInt("height");
                            r20.A03 = jSONObject2.getInt("width");
                            r20.A08 = jSONObject2.getString("direct-path");
                            r20.A0C = jSONObject2.optString("sticker-hash-without-meta");
                            r20.A06 = jSONObject2.optString("accessibility-text");
                            r20.A0Q = A1T;
                            JSONArray optJSONArray = jSONObject2.optJSONArray("emojis");
                            if (optJSONArray != null) {
                                ArrayList A0z3 = C17880vN.A0z(optJSONArray.length());
                                int length3 = optJSONArray.length();
                                for (int i3 = 0; i3 < length3; i3++) {
                                    A0z3.add(optJSONArray.getString(i3));
                                }
                                C18070vi.A0d(A0z3, 0);
                                String join = TextUtils.join(" ", A0z3);
                                C18070vi.A0X(join);
                                r20.A09 = join;
                            }
                            r20.A0H = str;
                            A0z2.add(r20);
                        }
                        obj.A0O = A0z2;
                    }
                    obj.A0E = str;
                    obj.A0G = C108975cc.A0f(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject);
                    obj.A0I = C108975cc.A0f("publisher", jSONObject);
                    obj.A03 = C108975cc.A0f("description", jSONObject);
                    obj.A0L = C108975cc.A0f("tray-image-id", jSONObject);
                    obj.A0M = C108975cc.A0f("tray-image-preview", jSONObject);
                    JSONArray jSONArray3 = jSONObject.getJSONArray("preview-image-ids");
                    C18070vi.A0X(jSONArray3);
                    int length4 = jSONArray3.length();
                    Object[] objArr = new String[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        objArr[i4] = jSONArray3.get(i4);
                    }
                    obj.A0N = C200410p.A0Q(objArr);
                    obj.A01 = jSONObject.getLong("file-size");
                    obj.A0F = jSONObject.getString("image-data-hash");
                    if (jSONObject.optInt("animated", 0) != 1) {
                        z = false;
                    }
                    obj.A0P = z;
                    obj.A0X = A1T;
                    A0z.add(obj.A00());
                }
            }
            return A0z;
        }
        throw C17880vN.A0g();
    }

    public final AnonymousClass725 A03(AnonymousClass89P r8, String str) {
        String A012;
        C18070vi.A0d(str, 0);
        AnonymousClass00H r3 = this.A0F;
        if (!((C135896sw) r3.get()).A02()) {
            Log.i("StickerPackNetworkProvider/getStickerPackById skipped due to backoff time");
        } else {
            try {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("https://static.whatsapp.net/sticker?id=");
                A10.append(str);
                A10.append("&lg=");
                Locale A0N = this.A07.A0N();
                String[] strArr = AnonymousClass1X0.A04;
                String A0y = AnonymousClass000.A0y(A0N.toLanguageTag(), A10);
                C18030ve r5 = this.A08;
                C18040vf r1 = C18040vf.A02;
                if (C18020vd.A05(r1, r5, 5693) && (A012 = C18020vd.A01(r1, r5, 6785)) != null) {
                    A0y = C17900vP.A0A(A0y, A012);
                }
                String A013 = this.A09.A01(A0y);
                C18070vi.A0X(A013);
                C127906f8 A002 = A00(r8, this, A013, (String) null);
                ((C135896sw) r3.get()).A01(false);
                if (A002 != null) {
                    return (AnonymousClass725) A002.A01.get(0);
                }
            } catch (AnonymousClass1SC e) {
                ((C135896sw) r3.get()).A00();
                Log.e("StickerPackNetworkProvider/getStickerPackById failed", e);
                return null;
            }
        }
        return null;
    }

    public AnonymousClass734(AnonymousClass190 r18, AnonymousClass1KB r19, AnonymousClass11S r20, AnonymousClass181 r21, AnonymousClass11P r22, AnonymousClass118 r23, C19830z4 r24, C18000vb r25, C18030ve r26, AnonymousClass18K r27, C24481Km r28, C220418j r29, AnonymousClass11W r30, JniBridge jniBridge, AnonymousClass00H r32, AnonymousClass00H r33) {
        C18030ve r0 = r26;
        AnonymousClass11P r12 = r22;
        AnonymousClass118 r11 = r23;
        AnonymousClass190 r16 = r18;
        AnonymousClass1KB r15 = r19;
        C18070vi.A0w(r11, r12, r0, r15, r16);
        AnonymousClass11W r5 = r30;
        JniBridge jniBridge2 = jniBridge;
        AnonymousClass18K r8 = r27;
        AnonymousClass11S r14 = r20;
        AnonymousClass181 r13 = r21;
        C18070vi.A0x(r14, r5, r13, r8, jniBridge2);
        AnonymousClass00H r3 = r32;
        C24481Km r7 = r28;
        C220418j r6 = r29;
        C19830z4 r10 = r24;
        C18000vb r9 = r25;
        C18070vi.A0y(r9, r6, r10, r7, r3);
        AnonymousClass00H r2 = r33;
        C18070vi.A0d(r2, 16);
        this.A05 = r11;
        this.A04 = r12;
        this.A08 = r0;
        this.A01 = r15;
        this.A00 = r16;
        this.A02 = r14;
        this.A0E = r5;
        this.A03 = r13;
        this.A0C = r8;
        this.A0A = jniBridge2;
        this.A07 = r9;
        this.A0D = r6;
        this.A06 = r10;
        this.A09 = r7;
        this.A0F = r3;
        this.A0B = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.6f8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.6f8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.6f8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection, java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.6f8] */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x00d3=Splitter:B:55:0x00d3, B:45:0x00ba=Splitter:B:45:0x00ba} */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C127906f8 A00(X.AnonymousClass89P r17, X.AnonymousClass734 r18, java.lang.String r19, java.lang.String r20) {
        /*
            java.lang.String r7 = ", reason: "
            java.lang.String r6 = "StickerPackNetworkProvider/getStickerPacks/StickerError/connection is not 200, result code: "
            r11 = r18
            X.11P r1 = r11.A04
            long r9 = X.AnonymousClass11P.A01(r1)
            r0 = 9
            r5 = 1
            r4 = 0
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ EOFException -> 0x00d2, IOException -> 0x00c9, IllegalArgumentException -> 0x00b8 }
            r8 = r19
            javax.net.ssl.HttpsURLConnection r3 = A02(r11, r8)     // Catch:{ EOFException -> 0x00d2, IOException -> 0x00c9, IllegalArgumentException -> 0x00b8 }
            r2 = r20
            if (r20 == 0) goto L_0x0022
            java.lang.String r0 = "If-None-Match"
            r3.setRequestProperty(r0, r2)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
        L_0x0022:
            int r2 = r3.getResponseCode()     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            long r15 = X.AnonymousClass11P.A01(r1)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            long r15 = r15 - r9
            java.net.URL r12 = r3.getURL()     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            X.C18070vi.A0X(r12)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            long r13 = (long) r2     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r11.A04(r12, r13, r15)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x0053
            r0 = 304(0x130, float:4.26E-43)
            if (r2 == r0) goto L_0x00dc
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x008b
            r9 = r17
            if (r17 == 0) goto L_0x008b
            X.1KB r1 = r11.A01     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r0 = 17
            X.7RI r0 = X.AnonymousClass7RI.A00(r9, r0)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r1.A0J(r0)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            goto L_0x00dc
        L_0x0053:
            java.lang.String r0 = "ETag"
            java.lang.String r6 = r3.getHeaderField(r0)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            X.181 r1 = r11.A03     // Catch:{ IOException -> 0x0082, JSONException -> 0x0079 }
            r0 = 26
            X.9Hb r2 = X.C108995ce.A0N(r1, r3, r0)     // Catch:{ IOException -> 0x0082, JSONException -> 0x0079 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0072 }
            java.util.ArrayList r1 = A01(r2)     // Catch:{ all -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x0082, JSONException -> 0x0079 }
            X.6f8 r0 = new X.6f8     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r0.<init>(r6, r1)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r4 = r0
            goto L_0x00dc
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0082, JSONException -> 0x0079 }
            throw r0     // Catch:{ IOException -> 0x0082, JSONException -> 0x0079 }
        L_0x0079:
            r1 = move-exception
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPacks/JSONException/error parsing json data"
            X.1SC r2 = new X.1SC     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r2.<init>(r0, r1)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            goto L_0x00b2
        L_0x0082:
            r1 = move-exception
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPacks/IOException/error parsing sticker pack json"
            X.1SC r2 = new X.1SC     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r2.<init>(r0, r1)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            goto L_0x00b2
        L_0x008b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            X.AnonymousClass000.A1E(r6, r7, r1, r2)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            java.lang.String r0 = r3.getResponseMessage()     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r1.append(r0)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            java.lang.String r0 = ", url: "
            X.C17900vP.A0e(r0, r8, r1)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            X.AnonymousClass000.A1E(r6, r7, r1, r2)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            java.lang.String r0 = r3.getResponseMessage()     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            X.1SC r2 = new X.1SC     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
            r2.<init>(r0)     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
        L_0x00b2:
            throw r2     // Catch:{ EOFException -> 0x00d3, IOException -> 0x00b5, IllegalArgumentException -> 0x00b3 }
        L_0x00b3:
            r2 = move-exception
            goto L_0x00ba
        L_0x00b5:
            r2 = move-exception
            r4 = r3
            goto L_0x00ca
        L_0x00b8:
            r2 = move-exception
            r3 = r4
        L_0x00ba:
            X.190 r1 = r11.A00     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "StickerPackNetworkProvider/error fetching sticker pack json"
            r1.A0G(r0, r4, r5)     // Catch:{ all -> 0x00e3 }
            java.lang.String r1 = "StickerPackNetworkProvider/getStickerPacks/IllegalArgumentException/error fetching sticker pack json"
            X.1SC r0 = new X.1SC     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00c9:
            r2 = move-exception
        L_0x00ca:
            java.lang.String r1 = "StickerPackNetworkProvider/getStickerPacks/IOException/error fetching sticker pack json"
            X.1SC r0 = new X.1SC     // Catch:{ all -> 0x00e6 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00e6 }
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00d2:
            r3 = r4
        L_0x00d3:
            X.190 r1 = r11.A00     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPacks/EOFException"
            r1.A0G(r0, r4, r5)     // Catch:{ all -> 0x00e3 }
            if (r3 == 0) goto L_0x00df
        L_0x00dc:
            r3.disconnect()
        L_0x00df:
            android.net.TrafficStats.clearThreadStatsTag()
            return r4
        L_0x00e3:
            r0 = move-exception
            r4 = r3
            goto L_0x00e7
        L_0x00e6:
            r0 = move-exception
        L_0x00e7:
            if (r4 == 0) goto L_0x00ec
            r4.disconnect()
        L_0x00ec:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass734.A00(X.89P, X.734, java.lang.String, java.lang.String):X.6f8");
    }

    public static final HttpsURLConnection A02(AnonymousClass734 r10, String str) {
        URLConnection openConnection = new URL(str).openConnection();
        C18070vi.A0z(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        httpsURLConnection.setSSLSocketFactory(r10.A0D.A02());
        C109005cf.A0o(r10.A0E, httpsURLConnection);
        httpsURLConnection.setRequestProperty("X-FB-Request-Analytics-Tags", new C58092k8(r10.A08, r10.A0A, (Integer) null, "sticker_store", "document", "manual", (String) null, false).A00());
        return httpsURLConnection;
    }

    public final void A04(URL url, long j, long j2) {
        int i;
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(url.toString());
        Set<String> parameterSet = urlQuerySanitizer.getParameterSet();
        C18070vi.A0X(parameterSet);
        if (parameterSet.contains("cat")) {
            i = 0;
            if (C18070vi.A18(urlQuerySanitizer.getValue("cat"), "suggest_sticker_packs")) {
                i = 4;
            }
        } else if (parameterSet.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
            i = 2;
        } else {
            boolean contains = parameterSet.contains("img");
            i = 1;
            if (!contains) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("StickerPackNetworkProvider/log query type ");
                A10.append(-1);
                C17900vP.A0X(url, "is not supported: ", A10);
                return;
            }
        }
        AnonymousClass635 r1 = new AnonymousClass635();
        r1.A01 = Long.valueOf(j);
        r1.A03 = url.getQuery();
        r1.A00 = Integer.valueOf(i);
        r1.A02 = Long.valueOf(j2);
        this.A0C.CC7(r1);
    }
}
