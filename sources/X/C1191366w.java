package X;

/* renamed from: X.66w  reason: invalid class name and case insensitive filesystem */
public final class C1191366w extends AnonymousClass161 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (r0 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r0 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        if (r0 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0119, code lost:
        if (r0 != null) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass77Q A00(org.json.JSONObject r22) {
        /*
            r21 = this;
            java.lang.String r0 = "emojis"
            r3 = r22
            org.json.JSONArray r5 = r3.getJSONArray(r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            int r2 = r5.length()
            r1 = 0
        L_0x0011:
            if (r1 >= r2) goto L_0x0020
            java.lang.String r0 = r5.getString(r1)
            X.C18070vi.A0X(r0)
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0020:
            java.lang.String r1 = "file_size"
            boolean r0 = r3.has(r1)
            if (r0 == 0) goto L_0x00f2
            int r14 = r3.getInt(r1)
        L_0x002c:
            java.lang.String r1 = "metadata"
            boolean r0 = r3.has(r1)
            if (r0 == 0) goto L_0x00ef
            org.json.JSONObject r0 = r3.getJSONObject(r1)
        L_0x0038:
            java.lang.String r1 = "url"
            java.lang.String r5 = r3.getString(r1)
            r1 = 0
            X.C18070vi.A0d(r4, r1)
            java.lang.String r1 = " "
            java.lang.String r6 = android.text.TextUtils.join(r1, r4)
            X.C18070vi.A0X(r6)
            java.lang.String r1 = "mimetype"
            java.lang.String r7 = r3.getString(r1)
            java.lang.String r1 = "height"
            int r15 = r3.getInt(r1)
            java.lang.String r1 = "width"
            int r16 = r3.getInt(r1)
            java.lang.String r1 = "file_hash"
            java.lang.String r8 = r3.getString(r1)
            java.lang.String r1 = "stable_id"
            java.lang.String r9 = r3.getString(r1)
            java.lang.String r2 = "accessibility_label"
            boolean r1 = r3.has(r2)
            if (r1 != 0) goto L_0x00ea
            r10 = 0
        L_0x0072:
            if (r0 == 0) goto L_0x00dd
            java.lang.String r2 = "country_specific"
            boolean r1 = r0.has(r2)
            if (r1 == 0) goto L_0x00dd
            boolean r17 = r0.getBoolean(r2)
        L_0x0080:
            java.lang.String r2 = "instant_sticker_template"
            boolean r1 = r0.has(r2)
            if (r1 == 0) goto L_0x00e2
            boolean r19 = r0.getBoolean(r2)
        L_0x008c:
            java.lang.String r2 = "animated"
            boolean r1 = r0.has(r2)
            if (r1 == 0) goto L_0x00e7
            boolean r18 = r0.getBoolean(r2)
        L_0x0098:
            r1 = r21
            X.00H r2 = r1.A00
            boolean r1 = X.C138986y1.A00(r2)
            if (r1 == 0) goto L_0x00da
            if (r0 == 0) goto L_0x00da
            java.lang.String r3 = "social"
            boolean r1 = r0.has(r3)
            if (r1 == 0) goto L_0x00da
            boolean r20 = r0.getBoolean(r3)
        L_0x00b0:
            boolean r1 = X.C138986y1.A00(r2)
            r13 = 0
            if (r1 == 0) goto L_0x00f5
            if (r0 == 0) goto L_0x0118
            java.lang.String r1 = "social_fbids"
            boolean r2 = r0.has(r1)
            if (r2 == 0) goto L_0x00f7
            org.json.JSONArray r3 = r0.getJSONArray(r1)
            X.C18070vi.A0b(r3)
            int r2 = r3.length()
            java.lang.String[] r13 = new java.lang.String[r2]
            r1 = 0
        L_0x00cf:
            if (r1 >= r2) goto L_0x00f7
            java.lang.Object r4 = r3.get(r1)
            r13[r1] = r4
            int r1 = r1 + 1
            goto L_0x00cf
        L_0x00da:
            r20 = 0
            goto L_0x00b0
        L_0x00dd:
            r17 = 0
            if (r0 == 0) goto L_0x00e2
            goto L_0x0080
        L_0x00e2:
            r19 = 0
            if (r0 == 0) goto L_0x00e7
            goto L_0x008c
        L_0x00e7:
            r18 = 0
            goto L_0x0098
        L_0x00ea:
            java.lang.String r10 = r3.getString(r2)
            goto L_0x0072
        L_0x00ef:
            r0 = 0
            goto L_0x0038
        L_0x00f2:
            r14 = 0
            goto L_0x002c
        L_0x00f5:
            if (r0 == 0) goto L_0x0118
        L_0x00f7:
            java.lang.String r1 = "style"
            boolean r2 = r0.has(r1)
            if (r2 == 0) goto L_0x0118
            java.lang.String r11 = r0.getString(r1)
        L_0x0103:
            java.lang.String r1 = "revision_id"
            boolean r2 = r0.has(r1)
            if (r2 == 0) goto L_0x011c
            java.lang.String r12 = r0.getString(r1)
        L_0x010f:
            X.C108995ce.A1H(r5, r7, r8, r9)
            X.77Q r4 = new X.77Q
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        L_0x0118:
            r11 = 0
            if (r0 == 0) goto L_0x011c
            goto L_0x0103
        L_0x011c:
            r12 = 0
            goto L_0x010f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1191366w.A00(org.json.JSONObject):X.77Q");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e1, code lost:
        if (r0 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e9, code lost:
        if (r19 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00eb, code lost:
        r19 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ed, code lost:
        if (r0 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ef, code lost:
        r20 = r0.getString("favorites_empty_state_template_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f5, code lost:
        if (r20 != null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f7, code lost:
        r20 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r0 = r5.opt("sticker_pack_dynamic_icon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0101, code lost:
        if ((r0 instanceof org.json.JSONObject) == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0103, code lost:
        r0 = (org.json.JSONObject) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0105, code lost:
        if (r0 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0107, code lost:
        r11 = A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010b, code lost:
        r8 = r5.getJSONArray("stickers");
        r7 = X.AnonymousClass000.A13();
        r5 = r8.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0117, code lost:
        if (r4 >= r5) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0119, code lost:
        r0 = r8.getJSONObject(r4);
        X.C18070vi.A0X(r0);
        r7.add(A00(r0));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012a, code lost:
        X.C18070vi.A0b(r12);
        X.C18070vi.A0b(r13);
        r1.A00 = new X.AnonymousClass77O(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, X.C17880vN.A10(r7));
        r0 = X.C27621Wu.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(org.json.JSONObject r23, long r24) {
        /*
            r22 = this;
            java.lang.String r10 = "revision_id"
            java.lang.String r7 = "stickers"
            java.lang.String r11 = "sticker_pack_id"
            java.lang.String r4 = "fetch__WAAvatar"
            java.lang.String r8 = "id"
            java.lang.String r3 = "invalid_json_response"
            r6 = 41
            r2 = 1
            r1 = r22
            r5 = r23
            if (r23 != 0) goto L_0x0021
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0189 }
            X.6ue r4 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "received null JSON"
            r4.A02(r2, r3, r0)     // Catch:{ all -> 0x0189 }
            return
        L_0x0021:
            boolean r0 = r5.has(r4)     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0033
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0189 }
            X.6ue r4 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "missing envelope (fetch__WAAvatar)"
            r4.A02(r2, r3, r0)     // Catch:{ all -> 0x0189 }
            return
        L_0x0033:
            org.json.JSONObject r5 = r5.getJSONObject(r4)     // Catch:{ all -> 0x0189 }
            boolean r0 = r5.has(r8)     // Catch:{ all -> 0x0189 }
            java.lang.String r4 = "wa_stickers_v2"
            if (r0 == 0) goto L_0x015f
            boolean r0 = r5.has(r4)     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x015f
            java.lang.String r12 = r5.getString(r8)     // Catch:{ all -> 0x0189 }
            org.json.JSONObject r5 = r5.getJSONObject(r4)     // Catch:{ all -> 0x0189 }
            r0 = 3
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0189 }
            r4 = 0
            r8[r4] = r11     // Catch:{ all -> 0x0189 }
            r8[r2] = r7     // Catch:{ all -> 0x0189 }
            r0 = 2
            java.util.List r9 = X.C18070vi.A0O(r10, r8, r0)     // Catch:{ all -> 0x0189 }
            boolean r0 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x007a
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x007a
        L_0x0064:
            X.C18070vi.A0b(r5)     // Catch:{ all -> 0x0189 }
            java.lang.String r14 = X.A6n.A02(r11, r5)     // Catch:{ all -> 0x0189 }
            if (r14 != 0) goto L_0x006f
            java.lang.String r14 = "meta-avatar"
        L_0x006f:
            java.lang.String r13 = r5.getString(r10)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "sticker_pack_description"
            java.lang.String r15 = X.A6n.A02(r0, r5)     // Catch:{ all -> 0x0189 }
            goto L_0x00ad
        L_0x007a:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x0189 }
        L_0x007e:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = X.C17880vN.A0v(r8)     // Catch:{ all -> 0x0189 }
            boolean r0 = r5.has(r0)     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x007e
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0189 }
            java.util.Iterator r7 = r9.iterator()     // Catch:{ all -> 0x0189 }
        L_0x0096:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x0189 }
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0189 }
            boolean r0 = r5.has(r0)     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0096
            r8.add(r4)     // Catch:{ all -> 0x0189 }
            goto L_0x0096
        L_0x00ad:
            java.lang.String r9 = ""
            if (r15 != 0) goto L_0x00b2
            r15 = r9
        L_0x00b2:
            java.lang.String r0 = "sticker_pack_publisher"
            java.lang.String r17 = X.A6n.A02(r0, r5)     // Catch:{ all -> 0x0189 }
            if (r17 != 0) goto L_0x00bc
            java.lang.String r17 = "Meta"
        L_0x00bc:
            java.lang.String r0 = "sticker_pack_name"
            java.lang.String r16 = X.A6n.A02(r0, r5)     // Catch:{ all -> 0x0189 }
            if (r16 != 0) goto L_0x00c6
            java.lang.String r16 = "Avatars"
        L_0x00c6:
            java.lang.String r0 = "default_templates_info"
            java.lang.Object r0 = r5.opt(r0)     // Catch:{ all -> 0x0189 }
            boolean r8 = r0 instanceof org.json.JSONObject     // Catch:{ all -> 0x0189 }
            r11 = 0
            if (r8 == 0) goto L_0x00de
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x00df
            java.lang.String r8 = "sticker_pack_tray_icon_template_id"
            java.lang.String r18 = r0.getString(r8)     // Catch:{ all -> 0x0189 }
            if (r18 != 0) goto L_0x00e3
            goto L_0x00df
        L_0x00de:
            r0 = r11
        L_0x00df:
            r18 = r9
            if (r0 == 0) goto L_0x00eb
        L_0x00e3:
            java.lang.String r8 = "recents_empty_state_template_id"
            java.lang.String r19 = r0.getString(r8)     // Catch:{ all -> 0x0189 }
            if (r19 != 0) goto L_0x00ef
        L_0x00eb:
            r19 = r9
            if (r0 == 0) goto L_0x00f7
        L_0x00ef:
            java.lang.String r8 = "favorites_empty_state_template_id"
            java.lang.String r20 = r0.getString(r8)     // Catch:{ all -> 0x0189 }
            if (r20 != 0) goto L_0x00f9
        L_0x00f7:
            r20 = r9
        L_0x00f9:
            java.lang.String r0 = "sticker_pack_dynamic_icon"
            java.lang.Object r0 = r5.opt(r0)     // Catch:{ all -> 0x0189 }
            boolean r8 = r0 instanceof org.json.JSONObject     // Catch:{ all -> 0x0189 }
            if (r8 == 0) goto L_0x010b
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x010b
            X.77Q r11 = r1.A00(r0)     // Catch:{ all -> 0x0189 }
        L_0x010b:
            org.json.JSONArray r8 = r5.getJSONArray(r7)     // Catch:{ all -> 0x0189 }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0189 }
            int r5 = r8.length()     // Catch:{ all -> 0x0189 }
        L_0x0117:
            if (r4 >= r5) goto L_0x012a
            org.json.JSONObject r0 = r8.getJSONObject(r4)     // Catch:{ all -> 0x0189 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0189 }
            X.77Q r0 = r1.A00(r0)     // Catch:{ all -> 0x0189 }
            r7.add(r0)     // Catch:{ all -> 0x0189 }
            int r4 = r4 + 1
            goto L_0x0117
        L_0x012a:
            X.C18070vi.A0b(r12)     // Catch:{ all -> 0x0189 }
            X.C18070vi.A0b(r13)     // Catch:{ all -> 0x0189 }
            java.util.ArrayList r21 = X.C17880vN.A10(r7)     // Catch:{ all -> 0x0189 }
            X.77O r10 = new X.77O     // Catch:{ all -> 0x0189 }
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0189 }
            r1.A00 = r10     // Catch:{ all -> 0x0189 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0189 }
            goto L_0x018e
        L_0x013e:
            r4 = 0
            java.lang.String r0 = ", "
            java.lang.String r7 = X.C29431cG.A0h(r0, r8, r4)     // Catch:{ all -> 0x0189 }
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0189 }
            X.6ue r5 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "missing mandatory fields ("
            r4.append(r0)     // Catch:{ all -> 0x0189 }
            r4.append(r7)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = X.C17890vO.A0c(r4, r6)     // Catch:{ all -> 0x0189 }
            r5.A02(r2, r3, r0)     // Catch:{ all -> 0x0189 }
            return
        L_0x015f:
            boolean r8 = r5.has(r8)     // Catch:{ all -> 0x0189 }
            boolean r7 = r5.has(r4)     // Catch:{ all -> 0x0189 }
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0189 }
            X.6ue r5 = X.C108945cZ.A0p(r0)     // Catch:{ all -> 0x0189 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "missing envelope (has id: "
            r4.append(r0)     // Catch:{ all -> 0x0189 }
            r4.append(r8)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = " , has stickerpack: "
            r4.append(r0)     // Catch:{ all -> 0x0189 }
            r4.append(r7)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = X.C17890vO.A0c(r4, r6)     // Catch:{ all -> 0x0189 }
            r5.A02(r2, r3, r0)     // Catch:{ all -> 0x0189 }
            return
        L_0x0189:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x018e:
            java.lang.Throwable r5 = X.C30671eK.A00(r0)
            if (r5 == 0) goto L_0x01af
            X.00H r0 = r1.A01
            X.6ue r4 = X.C108945cZ.A0p(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "error caught parsing JSON ("
            java.lang.String r0 = X.C108955ca.A10(r0, r1, r5)
            r1.append(r0)
            java.lang.String r0 = X.C17890vO.A0c(r1, r6)
            r4.A02(r2, r3, r0)
            throw r5
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1191366w.A02(org.json.JSONObject, long):void");
    }

    public C1191366w(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
