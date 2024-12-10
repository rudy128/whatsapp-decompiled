package com.whatsapp.productinfra.music.api;

import X.AUZ;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass181;
import X.AnonymousClass1D6;
import X.AnonymousClass1D9;
import X.AnonymousClass1EY;
import X.AnonymousClass6EU;
import X.C108975cc;
import X.C131626lP;
import X.C17880vN;
import X.C18070vi;
import X.C19620yd;
import X.C22821Di;
import X.C29361c9;
import X.C29431cG;
import X.C63042sP;
import X.C72453Mb;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MusicApi {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6 A[Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.productinfra.music.api.MusicApi r8, X.C131626lP r9, X.C30391dr r10) {
        /*
            boolean r0 = r10 instanceof X.C147837Ur
            if (r0 == 0) goto L_0x002f
            r4 = r10
            X.7Ur r4 = (X.C147837Ur) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002f
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 2
            r2 = 1
            r7 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0062
            if (r0 != r3) goto L_0x0035
            java.lang.Object r6 = r4.L$2
            X.6lP r6 = (X.C131626lP) r6
            java.lang.Object r0 = r4.L$1
            X.6lP r0 = (X.C131626lP) r0
            java.lang.Object r8 = r4.L$0
            com.whatsapp.productinfra.music.api.MusicApi r8 = (com.whatsapp.productinfra.music.api.MusicApi) r8
            goto L_0x00af
        L_0x002f:
            X.7Ur r4 = new X.7Ur
            r4.<init>(r8, r10)
            goto L_0x0012
        L_0x0035:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x003a:
            X.C30691eM.A01(r1)
            X.00H r0 = r8.A02
            java.lang.Object r1 = r0.get()
            X.9zn r1 = (X.C199319zn) r1
            boolean r0 = r9 instanceof X.AnonymousClass6EU
            if (r0 != 0) goto L_0x005f
            boolean r0 = r9 instanceof X.AnonymousClass6EW
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "WA_StatusMusicReporting"
        L_0x004f:
            r4.L$0 = r8
            r4.L$1 = r9
            r4.L$2 = r9
            r4.label = r2
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 == r5) goto L_0x00d9
            r6 = r9
            goto L_0x0071
        L_0x005f:
            java.lang.String r0 = "WA_StatusMusic"
            goto L_0x004f
        L_0x0062:
            java.lang.Object r9 = r4.L$2
            X.6lP r9 = (X.C131626lP) r9
            java.lang.Object r6 = r4.L$1
            X.6lP r6 = (X.C131626lP) r6
            java.lang.Object r8 = r4.L$0
            com.whatsapp.productinfra.music.api.MusicApi r8 = (com.whatsapp.productinfra.music.api.MusicApi) r8
            X.C30691eM.A01(r1)
        L_0x0071:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00d8
            r9.A00 = r1
            X.1D6 r2 = r8.A01(r6)     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            java.lang.Object r0 = r2.second     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            if (r0 == 0) goto L_0x00bc
            int r1 = r0.intValue()     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            r0 = 401(0x191, float:5.62E-43)
            if (r1 != r0) goto L_0x00bc
            X.00H r0 = r8.A02     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            X.9zn r1 = (X.C199319zn) r1     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            boolean r0 = r6 instanceof X.AnonymousClass6EU     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r6 instanceof X.AnonymousClass6EW     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "WA_StatusMusicReporting"
        L_0x009b:
            r4.L$0 = r8     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            r4.L$1 = r6     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            r4.L$2 = r6     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            r4.label = r3     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            java.lang.Object r1 = r1.A00(r0, r4)     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            if (r1 == r5) goto L_0x00d9
            goto L_0x00ad
        L_0x00aa:
            java.lang.String r0 = "WA_StatusMusic"
            goto L_0x009b
        L_0x00ad:
            r0 = r6
            goto L_0x00b2
        L_0x00af:
            X.C30691eM.A01(r1)     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
        L_0x00b2:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            if (r1 == 0) goto L_0x00d8
            r6.A00 = r1     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            X.1D6 r2 = r8.A01(r0)     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
        L_0x00bc:
            java.lang.Object r0 = r2.first     // Catch:{ IOException -> 0x00bf, JSONException -> 0x00c3 }
            return r0
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "MusicApi/executeRequest failed"
            goto L_0x00c6
        L_0x00c3:
            r1 = move-exception
            java.lang.String r0 = "MusicApi/executeRequest JSON parsing failed"
        L_0x00c6:
            com.whatsapp.util.Log.e(r0, r1)
            X.00H r0 = r8.A04
            java.lang.Object r2 = r0.get()
            X.2sP r2 = (X.C63042sP) r2
            r1 = 501815069(0x1de9171d, float:6.1698485E-21)
            r0 = 3
            X.C63042sP.A01(r2, r1, r0)
        L_0x00d8:
            return r7
        L_0x00d9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.music.api.MusicApi.A00(com.whatsapp.productinfra.music.api.MusicApi, X.6lP, X.1dr):java.lang.Object");
    }

    private final AnonymousClass1D6 A01(C131626lP r19) {
        AnonymousClass1D9 r7 = (AnonymousClass1D9) this.A03.get();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("https://");
        C131626lP r3 = r19;
        boolean z = r3 instanceof AnonymousClass6EU;
        A10.append("acs.whatsapp.com");
        String A0y = AnonymousClass000.A0y("/graphql", A10);
        LinkedHashMap A002 = r3.A00();
        ArrayList A11 = C72453Mb.A11(A002);
        Iterator A15 = AnonymousClass000.A15(A002);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            StringBuilder A102 = AnonymousClass000.A10();
            String str = C19620yd.A0A;
            A102.append(URLEncoder.encode(A0x, str));
            A102.append('=');
            A11.add(AnonymousClass000.A0y(URLEncoder.encode((String) A16.getValue(), str), A102));
        }
        AUZ A003 = AnonymousClass1D9.A00(r7, 41, A0y, C29431cG.A0h("&", A11, (C22821Di) null), (String) null, "application/x-www-form-urlencoded", (Map) null, (byte[]) null, false, false, false);
        int responseCode = A003.A01.getResponseCode();
        try {
            String A004 = AnonymousClass1EY.A00(A003.BMP((AnonymousClass181) this.A05.get(), (Integer) null, 41));
            if (A004 == null) {
                return AnonymousClass1D6.A00((Object) null, responseCode);
            }
            C63042sP.A01((C63042sP) this.A04.get(), 501815069, 2);
            if (C108975cc.A1N("for (;;);", A004)) {
                A004 = C29361c9.A0D(A004, 9);
            }
            return AnonymousClass1D6.A00(C17880vN.A16(A004), responseCode);
        } catch (IOException e) {
            Log.e(AnonymousClass001.A1I("MusicApi/executeRequestInner exception with code ", AnonymousClass000.A10(), responseCode), e);
            return AnonymousClass1D6.A00((Object) null, responseCode);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, X.C30391dr r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.AnonymousClass7UB
            if (r0 == 0) goto L_0x00ce
            r4 = r12
            X.7UB r4 = (X.AnonymousClass7UB) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ce
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r6 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L_0x0090
            if (r0 != r5) goto L_0x00d5
            java.lang.Object r0 = r4.L$0
            com.whatsapp.productinfra.music.api.MusicApi r0 = (com.whatsapp.productinfra.music.api.MusicApi) r0
            X.C30691eM.A01(r6)
        L_0x0024:
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            X.00H r0 = r0.A04
            java.lang.Object r2 = r0.get()
            X.2sP r2 = (X.C63042sP) r2
            r1 = 501815069(0x1de9171d, float:6.1698485E-21)
            r0 = 2
            if (r6 != 0) goto L_0x0035
            r0 = 3
        L_0x0035:
            X.C63042sP.A01(r2, r1, r0)
            r3 = 0
            if (r6 == 0) goto L_0x00da
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r6.optJSONObject(r0)
            if (r1 == 0) goto L_0x00da
            java.lang.String r0 = "xwa_music_picker"
            org.json.JSONObject r5 = r1.optJSONObject(r0)
            if (r5 == 0) goto L_0x00da
            java.lang.String r0 = "items"
            org.json.JSONArray r0 = r5.optJSONArray(r0)
            if (r0 == 0) goto L_0x008d
            X.Akx r0 = X.A6n.A04(r0)
            X.1JS r2 = X.AnonymousClass1JO.A01(r0)
            r1 = 5
            X.7S5 r0 = new X.7S5
            r0.<init>(r1)
            X.1b3 r0 = X.AnonymousClass1b2.A0C(r0, r2)
            X.7Sa r0 = X.AnonymousClass1b2.A0B(r0)
            java.util.List r4 = X.AnonymousClass1b2.A06(r0)
        L_0x006d:
            java.lang.String r0 = "page_info"
            org.json.JSONObject r2 = r5.optJSONObject(r0)
            if (r2 == 0) goto L_0x008b
            java.lang.String r0 = "end_cursor"
            java.lang.String r1 = r2.optString(r0)
            java.lang.String r0 = "has_next_page"
            boolean r0 = r2.optBoolean(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L_0x0085:
            X.6sG r0 = new X.6sG
            r0.<init>(r3, r1, r4)
            return r0
        L_0x008b:
            r1 = r3
            goto L_0x0085
        L_0x008d:
            X.0wS r4 = X.C18460wS.A00
            goto L_0x006d
        L_0x0090:
            X.C30691eM.A01(r6)
            X.00H r0 = r7.A01
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 12421(0x3085, float:1.7406E-41)
            X.0vf r0 = X.C18040vf.A02
            int r12 = X.C18020vd.A00(r0, r2, r1)
            X.7SR r6 = new X.7SR
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.84U r0 = X.AnonymousClass84U.A00(r6)
            java.lang.String r2 = X.C18070vi.A0H(r0)
            X.00H r0 = r7.A04
            java.lang.Object r1 = r0.get()
            X.2sP r1 = (X.C63042sP) r1
            r0 = 501815069(0x1de9171d, float:6.1698485E-21)
            X.C63042sP.A00(r1, r0)
            X.6EV r0 = new X.6EV
            r0.<init>(r2)
            r4.L$0 = r7
            r4.label = r5
            java.lang.Object r6 = A00(r7, r0, r4)
            if (r6 == r3) goto L_0x00da
            r0 = r7
            goto L_0x0024
        L_0x00ce:
            X.7UB r4 = new X.7UB
            r4.<init>(r7, r12)
            goto L_0x0012
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00da:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.music.api.MusicApi.A02(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0115 A[SYNTHETIC, Splitter:B:28:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r19, X.C30391dr r20, long r21, long r23) {
        /*
            r18 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C147827Uq
            r12 = r18
            if (r0 == 0) goto L_0x010b
            r10 = r3
            X.7Uq r10 = (X.C147827Uq) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x010b
            int r2 = r2 - r1
            r10.label = r2
        L_0x0016:
            java.lang.Object r1 = r10.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r3 = 0
            r9 = 3
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r6) goto L_0x012e
            if (r0 == r5) goto L_0x006d
            if (r0 != r9) goto L_0x0129
            X.C30691eM.A01(r1)
        L_0x002b:
            com.whatsapp.ohai.HttpResponse r1 = (com.whatsapp.ohai.HttpResponse) r1
            if (r1 == 0) goto L_0x0112
            goto L_0x0115
        L_0x0031:
            X.C30691eM.A01(r1)
            X.7SN r11 = new X.7SN
            r13 = r19
            r14 = r21
            r16 = r23
            r11.<init>(r12, r13, r14, r16)
            X.84U r0 = X.AnonymousClass84U.A00(r11)
            java.lang.String r0 = X.C18070vi.A0H(r0)
            X.6EW r4 = new X.6EW
            r4.<init>(r0)
            X.00H r0 = r12.A06
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            X.00H r0 = r12.A02
            java.lang.Object r1 = r0.get()
            X.9zn r1 = (X.C199319zn) r1
            java.lang.String r0 = "WA_StatusMusicReporting"
            r10.L$0 = r12
            r10.L$1 = r4
            r10.L$2 = r4
            r10.label = r5
            java.lang.Object r1 = r1.A00(r0, r10)
            if (r1 == r2) goto L_0x0168
            r11 = r4
            goto L_0x007c
        L_0x006d:
            java.lang.Object r4 = r10.L$2
            X.6lP r4 = (X.C131626lP) r4
            java.lang.Object r11 = r10.L$1
            X.6EW r11 = (X.AnonymousClass6EW) r11
            java.lang.Object r12 = r10.L$0
            com.whatsapp.productinfra.music.api.MusicApi r12 = (com.whatsapp.productinfra.music.api.MusicApi) r12
            X.C30691eM.A01(r1)
        L_0x007c:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0167
            r4.A00 = r1
            X.6xz r8 = new X.6xz
            r8.<init>()
            java.util.LinkedHashMap r0 = r11.A00()
            java.util.Iterator r7 = X.AnonymousClass000.A15(r0)
        L_0x008f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r7)
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            X.C108975cc.A12(r4, r1, r6)
            java.util.Map r0 = r8.A02
            r0.put(r4, r1)
            goto L_0x008f
        L_0x00aa:
            r10.L$0 = r12
            r10.L$1 = r11
            r10.L$2 = r8
            r10.label = r9
            X.3Dp r4 = X.C108975cc.A0k(r10)
            X.00H r0 = r12.A07
            java.lang.Object r9 = r0.get()
            X.A02 r9 = (X.A02) r9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://"
            r1.append(r0)
            java.lang.String r0 = "acs.whatsapp.com"
            r1.append(r0)
            java.lang.String r0 = "/graphql"
            java.lang.String r11 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.Integer r10 = X.AnonymousClass00R.A00
            byte[] r14 = r8.A01()
            X.1D6[] r7 = new X.AnonymousClass1D6[r5]
            java.lang.String r1 = "X-FB-Friendly-Name"
            java.lang.String r0 = "8346567772135259"
            X.C72463Mc.A1H(r1, r0, r7)
            java.lang.String r5 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "multipart/form-data; boundary="
            r1.append(r0)
            java.lang.String r0 = r8.A00
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.AnonymousClass1D6.A03(r5, r0, r7, r6)
            java.util.LinkedHashMap r12 = X.AnonymousClass1D7.A0B(r7)
            r0 = 46
            X.7SB r13 = X.AnonymousClass7SB.A00(r4, r0)
            r15 = 41
            r9.A01(r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = r4.A00()
            if (r1 != r2) goto L_0x002b
            return r2
        L_0x010b:
            X.7Uq r10 = new X.7Uq
            r10.<init>(r12, r3)
            goto L_0x0016
        L_0x0112:
            java.lang.String r0 = ""
            goto L_0x011d
        L_0x0115:
            byte[] r0 = r1.body     // Catch:{ JSONException -> 0x0122 }
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = X.C108955ca.A13(r0)     // Catch:{ JSONException -> 0x0122 }
        L_0x011d:
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0122 }
            goto L_0x0133
        L_0x0122:
            r1 = move-exception
            java.lang.String r0 = "MusicApi/creationReporting OHAI request failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        L_0x0129:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x012e:
            X.C30691eM.A01(r1)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
        L_0x0133:
            r4 = 0
            if (r1 == 0) goto L_0x0167
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L_0x0167
            java.lang.String r0 = "xwa_music_creation_reporting"
            org.json.JSONObject r2 = r1.optJSONObject(r0)
            if (r2 == 0) goto L_0x0167
            java.lang.String r0 = "music_content_media_id"
            java.lang.String r1 = r2.optString(r0)
            if (r1 == 0) goto L_0x0167
            java.lang.String r0 = "country_blocklist"
            org.json.JSONArray r0 = r2.optJSONArray(r0)
            if (r0 == 0) goto L_0x0162
            X.Akx r0 = X.A6n.A04(r0)
            X.1JS r0 = X.AnonymousClass1JO.A01(r0)
            java.util.List r4 = X.AnonymousClass1b2.A06(r0)
        L_0x0162:
            X.6rM r3 = new X.6rM
            r3.<init>(r1, r4)
        L_0x0167:
            return r3
        L_0x0168:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.music.api.MusicApi.A03(java.lang.String, X.1dr, long, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.C30391dr r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.AnonymousClass7TV
            if (r0 == 0) goto L_0x0052
            r4 = r6
            X.7TV r4 = (X.AnonymousClass7TV) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r1) goto L_0x005a
            X.C30691eM.A01(r3)
        L_0x0020:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r3 == 0) goto L_0x0058
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r3.optJSONObject(r0)
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "xwa_music_eligible_countries"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            if (r0 == 0) goto L_0x0058
            X.Akx r0 = X.A6n.A04(r0)
            X.1JS r0 = X.AnonymousClass1JO.A01(r0)
            java.util.Set r0 = X.AnonymousClass1b2.A08(r0)
            return r0
        L_0x0041:
            X.C30691eM.A01(r3)
            X.6EU r0 = new X.6EU
            r0.<init>()
            r4.label = r1
            java.lang.Object r3 = A00(r5, r0, r4)
            if (r3 != r2) goto L_0x0020
            return r2
        L_0x0052:
            X.7TV r4 = new X.7TV
            r4.<init>(r5, r6)
            goto L_0x0012
        L_0x0058:
            r0 = 0
            return r0
        L_0x005a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.music.api.MusicApi.A04(X.1dr):java.lang.Object");
    }

    public MusicApi(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0q(r7, r8, r9);
        C18070vi.A0d(r10, 9);
        this.A03 = r2;
        this.A07 = r3;
        this.A02 = r4;
        this.A05 = r5;
        this.A04 = r7;
        this.A06 = r8;
        this.A00 = r9;
        this.A01 = r10;
    }
}
