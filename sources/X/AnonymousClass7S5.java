package X;

/* renamed from: X.7S5  reason: invalid class name */
public class AnonymousClass7S5 implements C18080vj, C22821Di {
    public final int A00;

    public AnonymousClass7S5(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        return X.C27621Wu.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r5.getVisibility() != 8) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r22 != null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9 A[Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105 A[Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0125 A[Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014b A[Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014e A[Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            r21 = this;
            r5 = r22
            r0 = r21
            int r0 = r0.A00
            switch(r0) {
                case 0: goto L_0x0184;
                case 1: goto L_0x001d;
                case 2: goto L_0x005a;
                case 3: goto L_0x0022;
                case 4: goto L_0x0064;
                case 5: goto L_0x0079;
                case 6: goto L_0x0165;
                default: goto L_0x0009;
            }
        L_0x0009:
            android.view.View r5 = (android.view.View) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            int r1 = r5.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0020
        L_0x0017:
            r0 = 1
        L_0x0018:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x001c:
            return r7
        L_0x001d:
            if (r22 == 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            r0 = 0
            goto L_0x0018
        L_0x0022:
            X.1ca r5 = (X.C29621ca) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.String r0 = "category"
            X.C29621ca.A04(r5, r0)
            java.lang.String r0 = "name"
            r1 = 0
            java.lang.String r3 = r5.A0Q(r0, r1)
            r7 = 0
            if (r3 == 0) goto L_0x001c
            java.lang.String r0 = "value"
            java.lang.String r1 = r5.A0Q(r0, r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r2 = "error"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0186
            X.1ca r1 = r5.A0I()
            X.C18070vi.A0X(r1)
            X.C29621ca.A04(r1, r2)
            java.lang.String r0 = "code"
            java.lang.String r1 = r1.A0Q(r0, r7)
            if (r1 != 0) goto L_0x0186
            return r7
        L_0x005a:
            X.5nD r5 = (X.C113515nD) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            r5.A0B()
            goto L_0x0076
        L_0x0064:
            X.84U r2 = X.C108955ca.A0a(r5)
            java.lang.String r1 = "id"
            java.lang.String r0 = "1490318767758566"
            r2.A01(r1, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = "TAG"
            r2.A01(r1, r0)
        L_0x0076:
            X.1Wu r7 = X.C27621Wu.A00
            return r7
        L_0x0079:
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            r4 = 0
            X.C18070vi.A0d(r5, r4)
            java.lang.String r0 = "item"
            org.json.JSONObject r1 = r5.getJSONObject(r0)
            X.C18070vi.A0X(r1)
            java.lang.String r5 = "text"
            r6 = 0
            java.lang.String r0 = "artists"
            org.json.JSONObject r2 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            if (r2 == 0) goto L_0x00d6
            java.lang.String r0 = "nodes"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            if (r0 == 0) goto L_0x00d6
            org.json.JSONObject r3 = r0.optJSONObject(r4)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
        L_0x009f:
            java.lang.String r0 = "display_item_type"
            java.lang.String r0 = X.C18070vi.A0J(r0, r1)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.Integer r9 = X.AnonymousClass6XI.A00(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "display_title"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r11 = r0.getString(r5)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "display_subtitle"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r12 = r0.getString(r5)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "display_image"
            org.json.JSONObject r2 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "downloadable_uri"
            java.lang.String r13 = r2.getString(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "song_id"
            java.lang.String r14 = r1.optString(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "progressive_download"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            goto L_0x00d8
        L_0x00d6:
            r3 = r6
            goto L_0x009f
        L_0x00d8:
            java.lang.String r2 = "url"
            if (r0 == 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r15 = r6
            goto L_0x00e9
        L_0x00df:
            org.json.JSONObject r0 = r0.optJSONObject(r4)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r15 = r0.optString(r2)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
        L_0x00e9:
            java.lang.String r0 = "display_id"
            java.lang.String r16 = r1.optString(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            if (r3 == 0) goto L_0x014e
            java.lang.String r0 = "ig_profile_info"
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            if (r0 == 0) goto L_0x014e
            java.lang.String r17 = r0.optString(r2)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
        L_0x00fd:
            java.lang.String r0 = "fb_profile_info"
            org.json.JSONObject r0 = r3.optJSONObject(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            if (r0 == 0) goto L_0x0153
            java.lang.String r18 = r0.optString(r2)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
        L_0x0109:
            java.lang.String r0 = "duration_in_ms"
            long r2 = r1.optLong(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "is_explicit"
            boolean r0 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "tags"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            if (r0 == 0) goto L_0x014b
            X.Akx r0 = X.A6n.A04(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            X.1JS r3 = X.AnonymousClass1JO.A01(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            r2 = 6
            X.7S5 r0 = new X.7S5     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            X.1b3 r0 = X.AnonymousClass1b2.A0C(r0, r3)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            X.7Sa r0 = X.AnonymousClass1b2.A0B(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            java.util.List r19 = X.AnonymousClass1b2.A06(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
        L_0x013f:
            java.lang.String r0 = "is_cover_uri_a_placeholder"
            boolean r20 = r1.optBoolean(r0)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            X.77c r7 = new X.77c     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ JSONException -> 0x015e, IllegalArgumentException -> 0x0157 }
            goto L_0x0156
        L_0x014b:
            r19 = 0
            goto L_0x013f
        L_0x014e:
            r17 = r6
            if (r3 == 0) goto L_0x0153
            goto L_0x00fd
        L_0x0153:
            r18 = r6
            goto L_0x0109
        L_0x0156:
            return r7
        L_0x0157:
            r1 = move-exception
            java.lang.String r0 = "MusicCatalogItem/fromJson: unsupported item type"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        L_0x015e:
            r1 = move-exception
            java.lang.String r0 = "MusicCatalogItem/fromJson: failed to parse json"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        L_0x0165:
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.String r0 = "type"
            java.lang.String r1 = r5.optString(r0)
            java.lang.String r0 = "HIGHLIGHT_TIME_IN_MS"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0184
            java.lang.String r0 = "name"
            int r0 = r5.optInt(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
        L_0x0184:
            r7 = 0
            return r7
        L_0x0186:
            X.1D6 r7 = X.AnonymousClass1D6.A01(r3, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S5.invoke(java.lang.Object):java.lang.Object");
    }
}
