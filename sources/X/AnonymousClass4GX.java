package X;

/* renamed from: X.4GX  reason: invalid class name */
public abstract class AnonymousClass4GX {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00a4 A[SYNTHETIC, Splitter:B:11:0x00a4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C87814Xd A00(android.os.Bundle r45) {
        /*
            java.lang.String r1 = "banner"
            r0 = r45
            java.lang.String r3 = r0.getString(r1)
            r2 = 0
            if (r3 == 0) goto L_0x001a
            int r1 = r3.length()
            if (r1 == 0) goto L_0x001a
            org.json.JSONObject r37 = X.C17880vN.A16(r3)     // Catch:{ JSONException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            r1 = move-exception
            r1.printStackTrace()
        L_0x001a:
            r37 = r2
        L_0x001c:
            java.lang.String r1 = "data"
            java.lang.String r11 = r0.getString(r1, r2)
            java.lang.String r1 = "source"
            java.lang.String r12 = r0.getString(r1, r2)
            java.lang.String r1 = "entry_point"
            java.lang.String r13 = r0.getString(r1, r2)
            java.lang.String r1 = "has_ib"
            boolean r38 = r0.getBoolean(r1)
            java.lang.String r1 = "has_wm"
            boolean r39 = r0.getBoolean(r1)
            java.lang.String r1 = "ads_logging_requires_tos"
            boolean r40 = r0.getBoolean(r1)
            java.lang.String r1 = "show_ad_attribution"
            boolean r41 = r0.getBoolean(r1)
            java.lang.String r1 = "show_keyboard"
            boolean r42 = r0.getBoolean(r1)
            java.lang.String r1 = "auto_greeting_msg"
            boolean r43 = r0.getBoolean(r1)
            java.lang.String r1 = "auto_greeting_msg_cta_type"
            java.lang.String r14 = r0.getString(r1, r2)
            java.lang.String r1 = "auto_greeting_msg_cta_payload"
            java.lang.String r15 = r0.getString(r1, r2)
            java.lang.String r1 = "source_url"
            java.lang.String r16 = r0.getString(r1)
            java.lang.String r1 = "ctwa_context"
            java.lang.String r17 = r0.getString(r1)
            java.lang.String r1 = "icebreaker"
            java.lang.String r18 = r0.getString(r1)
            X.1yH r2 = X.AnonymousClass1E2.A01
            java.lang.String r1 = "lid"
            java.lang.String r1 = r0.getString(r1)
            X.1E2 r9 = r2.A03(r1)
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r1 = "jid"
            java.lang.String r1 = r0.getString(r1)
            com.whatsapp.jid.UserJid r10 = r2.A04(r1)
            java.lang.String r1 = "productId"
            java.lang.String r19 = r0.getString(r1)
            java.lang.String r1 = "land_on_whatsapp_catalog"
            java.lang.String r20 = r0.getString(r1)
            java.lang.String r1 = "categoryId"
            java.lang.String r21 = r0.getString(r1)
            java.lang.String r1 = "client_filters"
            java.util.ArrayList r1 = r0.getStringArrayList(r1)
            r36 = 0
            if (r1 == 0) goto L_0x00f6
            java.util.ArrayList r7 = X.C29351c6.A0D(r1)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x00e5 }
        L_0x00ac:
            boolean r1 = r8.hasNext()     // Catch:{ IllegalArgumentException -> 0x00e5 }
            if (r1 == 0) goto L_0x00e0
            java.lang.String r2 = X.C17880vN.A0v(r8)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            r1 = 0
            X.C18070vi.A0d(r2, r1)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            X.4DT[] r4 = X.AnonymousClass4DT.values()     // Catch:{ IllegalArgumentException -> 0x00e5 }
            int r6 = r4.length     // Catch:{ IllegalArgumentException -> 0x00e5 }
        L_0x00bf:
            if (r1 >= r6) goto L_0x00d2
            r3 = r4[r1]     // Catch:{ IllegalArgumentException -> 0x00e5 }
            java.lang.String r5 = r3.label     // Catch:{ IllegalArgumentException -> 0x00e5 }
            boolean r5 = X.C18070vi.A18(r5, r2)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            if (r5 == 0) goto L_0x00cf
            r7.add(r3)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            goto L_0x00ac
        L_0x00cf:
            int r1 = r1 + 1
            goto L_0x00bf
        L_0x00d2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x00e5 }
            java.lang.String r3 = "Not a valid client filter: "
            r1.append(r3)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A12(r2, r1)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            throw r1     // Catch:{ IllegalArgumentException -> 0x00e5 }
        L_0x00e0:
            java.util.List r36 = X.C29431cG.A0t(r7)     // Catch:{ IllegalArgumentException -> 0x00e5 }
            goto L_0x00f6
        L_0x00e5:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Failed to convert client filter from string to CTWAClientFilter, message: "
            r1.append(r2)
            java.lang.String r2 = r3.getMessage()
            X.C17890vO.A19(r1, r2)
        L_0x00f6:
            java.lang.String r1 = "ctwa_context_override_phone_number"
            java.lang.String r22 = r0.getString(r1)
            java.lang.String r1 = "always_show_ad_attribution"
            boolean r44 = r0.getBoolean(r1)
            java.lang.String r1 = "flow_cta"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "flow_id"
            java.lang.String r2 = r0.getString(r1)
            java.lang.String r1 = "flow_first_screen"
            java.lang.String r1 = r0.getString(r1)
            X.4UE r7 = new X.4UE
            r7.<init>(r3, r2, r1)
            java.lang.String r1 = "source_id_override"
            java.lang.String r23 = r0.getString(r1)
            java.lang.String r1 = "app"
            java.lang.String r24 = r0.getString(r1)
            java.lang.String r1 = "consumer_disclosure_variant"
            int r1 = r0.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.4DN r6 = X.AnonymousClass4GV.A00(r1)
            java.lang.String r1 = "headline"
            java.lang.String r25 = r0.getString(r1)
            java.lang.String r1 = "body"
            java.lang.String r26 = r0.getString(r1)
            java.lang.String r1 = "source_id"
            java.lang.String r27 = r0.getString(r1)
            java.lang.String r1 = "referral_parameter"
            java.lang.String r28 = r0.getString(r1)
            java.lang.String r1 = "welcome_message"
            java.lang.String r29 = r0.getString(r1)
            java.lang.String r1 = "ctwa_clid"
            java.lang.String r30 = r0.getString(r1)
            java.lang.String r1 = "video_url"
            java.lang.String r4 = r0.getString(r1)
            java.lang.String r1 = "thumbnail_url"
            java.lang.String r3 = r0.getString(r1)
            java.lang.String r1 = "thumbnail_data"
            byte[] r2 = r0.getByteArray(r1)
            java.lang.String r1 = "og_img_url"
            java.lang.String r1 = r0.getString(r1)
            X.4Ue r8 = new X.4Ue
            r8.<init>(r4, r3, r1, r2)
            java.lang.String r1 = "icebreakers"
            java.util.ArrayList r35 = r0.getParcelableArrayList(r1)
            java.lang.String r1 = "disable_nudge"
            boolean r45 = r0.getBoolean(r1)
            java.lang.String r1 = "signals"
            java.lang.String r31 = r0.getString(r1)
            java.lang.String r1 = "redirect"
            java.lang.String r32 = r0.getString(r1)
            java.lang.String r1 = "ad_id"
            java.lang.String r33 = r0.getString(r1)
            java.lang.String r1 = "ad_group_id"
            java.lang.String r34 = r0.getString(r1)
            X.4Xd r5 = new X.4Xd
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4GX.A00(android.os.Bundle):X.4Xd");
    }
}
