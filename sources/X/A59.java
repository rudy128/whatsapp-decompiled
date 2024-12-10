package X;

public final class A59 {
    public int A00;
    public String A01;
    public final C19830z4 A02;
    public final AnonymousClass19Y A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;

    public static final String A00(Integer num) {
        if (num == null) {
            return "no_screen";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "all_stickers_tab";
        }
        if (intValue == 2) {
            return "avatars_search_tab";
        }
        if (intValue == 3) {
            return "avatars_tab";
        }
        if (intValue == 4) {
            return "emojis_tab";
        }
        if (intValue == 5) {
            return "gifs_search_tab";
        }
        if (intValue == 6) {
            return "gifs_tab";
        }
        if (intValue == 7) {
            return "my_stickers_tab";
        }
        if (intValue == 8) {
            return "sticker_pack_info";
        }
        if (intValue == 9) {
            return "stickers_search_tab";
        }
        if (intValue == 10) {
            return "stickers_tab";
        }
        if (intValue == 11) {
            return "emojis_search_tab";
        }
        if (intValue == 15) {
            return "edits_tab";
        }
        return "no_screen";
    }

    public static final String A01(Integer num) {
        if (num == null) {
            return "no_target";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "add_to_favourites";
        }
        if (intValue == 2) {
            return "all_stickers_tab";
        }
        if (intValue == 3) {
            return "avatar";
        }
        if (intValue == 4) {
            return "avatar_style";
        }
        if (intValue == 5) {
            return "avatar_tab_icon";
        }
        if (intValue == 6) {
            return "cancel";
        }
        if (intValue == 7) {
            return "cancel_delete";
        }
        if (intValue == 8) {
            return "confirm_delete";
        }
        if (intValue == 9) {
            return "create_from_genai";
        }
        if (intValue == 10) {
            return "create_from_photo";
        }
        if (intValue == 11) {
            return "create_icon";
        }
        if (intValue == 12) {
            return "delete";
        }
        if (intValue == 13) {
            return "delete_button";
        }
        if (intValue == 14) {
            return "delete_icon";
        }
        if (intValue == 15) {
            return "download_button";
        }
        if (intValue == 16) {
            return "download_icon";
        }
        if (intValue == 17) {
            return "emoji";
        }
        if (intValue == 18) {
            return "emoji_style";
        }
        if (intValue == 19) {
            return "emoji_tab_icon";
        }
        if (intValue == 20) {
            return "expression_icon";
        }
        if (intValue == 21) {
            return "favourite";
        }
        if (intValue == 22) {
            return "gif";
        }
        if (intValue == 23) {
            return "gif_tab_icon";
        }
        if (intValue == 24) {
            return "my_stickers_tab";
        }
        if (intValue == 25) {
            return "pack";
        }
        if (intValue == 26) {
            return "plus_icon";
        }
        if (intValue == 27) {
            return "recent";
        }
        if (intValue == 28) {
            return "remove_from_favourites";
        }
        if (intValue == 29) {
            return "search_bar";
        }
        if (intValue == 30) {
            return "search_icon";
        }
        if (intValue == 31) {
            return "send_icon";
        }
        if (intValue == 32) {
            return "sticker";
        }
        if (intValue == 33) {
            return "sticker_pack";
        }
        if (intValue == 34) {
            return "stickers_tab_icon";
        }
        if (intValue == 35) {
            return "gif_style";
        }
        if (intValue == 36) {
            return "remove_from_recents";
        }
        if (intValue == 37) {
            return "view_more_by_creator";
        }
        if (intValue == 38) {
            return "edit_sticker";
        }
        if (intValue == 39) {
            return "view_pack";
        }
        if (intValue == 40) {
            return "edit_icon";
        }
        if (intValue == 41) {
            return "backspace_icon";
        }
        if (intValue == 42) {
            return "trending";
        }
        if (intValue == 43) {
            return "trending_view_more";
        }
        if (intValue == 45) {
            return "move_to_top";
        }
        if (intValue == 46) {
            return "move_to_top_multi";
        }
        if (intValue == 47) {
            return "remove";
        }
        if (intValue == 48) {
            return "remove_multi";
        }
        return "no_target";
    }

    public final void A02() {
        if (C18020vd.A05(C18040vf.A02, this.A04, 8193)) {
            this.A03.markerEnd(990452713, this.A00, 2);
            this.A00 = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        if (r1.intValue() > 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r1.intValue() > 0) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.Integer r7, int r8, int r9) {
        /*
            r6 = this;
            X.0ve r4 = r6.A04
            r0 = 8193(0x2001, float:1.1481E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0040
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = A00(r0)
            r3.append(r0)
            r1 = 47
            r3.append(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = X.A3P.A01(r0)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = A01(r7)
            java.lang.String r5 = X.AnonymousClass000.A0y(r0, r3)
            X.19Y r3 = r6.A03
            r1 = 990452713(0x3b091be9, float:0.0020921177)
            int r0 = r6.A00
            r3.markerPoint((int) r1, (int) r0, (java.lang.String) r5)
        L_0x0040:
            r0 = 7503(0x1d4f, float:1.0514E-41)
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0092
            X.8rP r3 = new X.8rP
            r3.<init>()
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x0053
            r3.A06 = r0
        L_0x0053:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            if (r1 == 0) goto L_0x0097
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 <= 0) goto L_0x0097
        L_0x0061:
            r3.A03 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            if (r1 == 0) goto L_0x0095
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 <= 0) goto L_0x0095
        L_0x0071:
            r3.A01 = r1
            if (r7 == 0) goto L_0x0093
            int r0 = r7.intValue()
            if (r0 <= 0) goto L_0x0093
        L_0x007b:
            r3.A02 = r7
            r0 = 9689(0x25d9, float:1.3577E-41)
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x008b
            java.lang.Long r0 = X.AnonymousClass8BT.A0m()
            r3.A05 = r0
        L_0x008b:
            X.18K r2 = r6.A05
            r1 = 0
            r0 = 1
            r2.CC0(r3, r1, r0)
        L_0x0092:
            return
        L_0x0093:
            r7 = 0
            goto L_0x007b
        L_0x0095:
            r1 = 0
            goto L_0x0071
        L_0x0097:
            r1 = 0
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A59.A03(java.lang.Integer, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        if (r1.intValue() > 0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        if (r1.intValue() > 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c7, code lost:
        if (r1.intValue() > 0) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Integer r8, int r9, int r10, int r11, boolean r12) {
        /*
            r7 = this;
            X.0ve r6 = r7.A04
            r0 = 8193(0x2001, float:1.1481E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0078
            int r2 = r7.A00
            r4 = 990452713(0x3b091be9, float:0.0020921177)
            if (r2 == 0) goto L_0x0019
            X.19Y r1 = r7.A03
            r0 = 2
            r1.markerEnd(r4, r2, r0)
        L_0x0019:
            r2 = 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            X.1JU r0 = X.AnonymousClass1JU.A01
            int r0 = r0.A03(r2, r1)
            r7.A00 = r0
            X.19Y r3 = r7.A03
            r3.markerStart(r4, r0)
            int r2 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            if (r0 == 0) goto L_0x01ee
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L_0x00fc
            java.lang.String r1 = "individual_chat"
        L_0x003d:
            java.lang.String r0 = "origin"
            r3.markerAnnotate((int) r4, (int) r2, (java.lang.String) r0, (java.lang.String) r1)
            int r2 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "origin_target"
            r3.markerAnnotate((int) r4, (int) r2, (java.lang.String) r0, (java.lang.String) r1)
            int r2 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.String r1 = A00(r0)
            java.lang.String r0 = "origin_screen"
            r3.markerAnnotate((int) r4, (int) r2, (java.lang.String) r0, (java.lang.String) r1)
            int r2 = r7.A00
            java.lang.String r1 = "chat_type"
            java.lang.String r0 = X.A3P.A02(r8)
            r3.markerAnnotate((int) r4, (int) r2, (java.lang.String) r1, (java.lang.String) r0)
            int r2 = r7.A00
            X.0z4 r0 = r7.A02
            java.lang.String r1 = r0.A0d()
            java.lang.String r0 = "encrypted_rid"
            r3.markerAnnotate((int) r4, (int) r2, (java.lang.String) r0, (java.lang.String) r1)
        L_0x0078:
            r0 = 7503(0x1d4f, float:1.0514E-41)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x00f0
            if (r12 == 0) goto L_0x00f9
            java.lang.String r0 = "2"
        L_0x0084:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            r7.A01 = r0
            X.8rP r3 = new X.8rP
            r3.<init>()
            java.lang.String r0 = r7.A01
            r3.A06 = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            if (r1 == 0) goto L_0x00f7
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 <= 0) goto L_0x00f7
        L_0x00a9:
            r3.A01 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            if (r1 == 0) goto L_0x00f5
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 <= 0) goto L_0x00f5
        L_0x00b9:
            r3.A00 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            if (r1 == 0) goto L_0x00f3
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            if (r0 <= 0) goto L_0x00f3
        L_0x00c9:
            r3.A02 = r1
            if (r8 == 0) goto L_0x00f1
            int r0 = r8.intValue()
            if (r0 <= 0) goto L_0x00f1
        L_0x00d3:
            r3.A04 = r8
            java.lang.Integer r0 = X.C17880vN.A0l()
            r3.A03 = r0
            r0 = 9689(0x25d9, float:1.3577E-41)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x00e9
            java.lang.Long r0 = X.AnonymousClass8BT.A0m()
            r3.A05 = r0
        L_0x00e9:
            X.18K r2 = r7.A05
            r1 = 0
            r0 = 1
            r2.CC0(r3, r1, r0)
        L_0x00f0:
            return
        L_0x00f1:
            r8 = 0
            goto L_0x00d3
        L_0x00f3:
            r1 = 0
            goto L_0x00c9
        L_0x00f5:
            r1 = 0
            goto L_0x00b9
        L_0x00f7:
            r1 = 0
            goto L_0x00a9
        L_0x00f9:
            java.lang.String r0 = "1"
            goto L_0x0084
        L_0x00fc:
            r0 = 2
            if (r1 != r0) goto L_0x0103
            java.lang.String r1 = "group_chat"
            goto L_0x003d
        L_0x0103:
            r0 = 3
            if (r1 != r0) goto L_0x010a
            java.lang.String r1 = "broadcast_chat"
            goto L_0x003d
        L_0x010a:
            r0 = 4
            if (r1 != r0) goto L_0x0111
            java.lang.String r1 = "channel_chat"
            goto L_0x003d
        L_0x0111:
            r0 = 5
            if (r1 != r0) goto L_0x0118
            java.lang.String r1 = "text_status_composer"
            goto L_0x003d
        L_0x0118:
            r0 = 6
            if (r1 != r0) goto L_0x011f
            java.lang.String r1 = "status_reply"
            goto L_0x003d
        L_0x011f:
            r0 = 7
            if (r1 != r0) goto L_0x0126
            java.lang.String r1 = "media_view_reply"
            goto L_0x003d
        L_0x0126:
            r0 = 8
            if (r1 != r0) goto L_0x012e
            java.lang.String r1 = "media_album_reply"
            goto L_0x003d
        L_0x012e:
            r0 = 9
            if (r1 != r0) goto L_0x0136
            java.lang.String r1 = "media_compose_caption"
            goto L_0x003d
        L_0x0136:
            r0 = 10
            if (r1 != r0) goto L_0x013e
            java.lang.String r1 = "set_group_photo"
            goto L_0x003d
        L_0x013e:
            r0 = 11
            if (r1 != r0) goto L_0x0146
            java.lang.String r1 = "reactions_tray"
            goto L_0x003d
        L_0x0146:
            r0 = 12
            if (r1 != r0) goto L_0x014e
            java.lang.String r1 = "payments_view"
            goto L_0x003d
        L_0x014e:
            r0 = 13
            if (r1 != r0) goto L_0x0156
            java.lang.String r1 = "media_composer_shape_picker"
            goto L_0x003d
        L_0x0156:
            r0 = 14
            if (r1 != r0) goto L_0x015e
            java.lang.String r1 = "quick_reply_settings_edit"
            goto L_0x003d
        L_0x015e:
            r0 = 15
            if (r1 != r0) goto L_0x0166
            java.lang.String r1 = "shared_text_preview_dialog"
            goto L_0x003d
        L_0x0166:
            r0 = 16
            if (r1 != r0) goto L_0x016e
            java.lang.String r1 = "edit_message"
            goto L_0x003d
        L_0x016e:
            r0 = 17
            if (r1 != r0) goto L_0x0176
            java.lang.String r1 = "single_selected_message"
            goto L_0x003d
        L_0x0176:
            r0 = 18
            if (r1 != r0) goto L_0x017e
            java.lang.String r1 = "create_new_group"
            goto L_0x003d
        L_0x017e:
            r0 = 19
            if (r1 != r0) goto L_0x0186
            java.lang.String r1 = "live_location_comment"
            goto L_0x003d
        L_0x0186:
            r0 = 20
            if (r1 != r0) goto L_0x018e
            java.lang.String r1 = "business_edit_profile_description"
            goto L_0x003d
        L_0x018e:
            r0 = 21
            if (r1 != r0) goto L_0x0196
            java.lang.String r1 = "popup"
            goto L_0x003d
        L_0x0196:
            r0 = 22
            if (r1 != r0) goto L_0x019e
            java.lang.String r1 = "cart"
            goto L_0x003d
        L_0x019e:
            r0 = 23
            if (r1 != r0) goto L_0x01a6
            java.lang.String r1 = "profile_photo_reminder"
            goto L_0x003d
        L_0x01a6:
            r0 = 24
            if (r1 != r0) goto L_0x01ae
            java.lang.String r1 = "profile_bio"
            goto L_0x003d
        L_0x01ae:
            r0 = 25
            if (r1 != r0) goto L_0x01b6
            java.lang.String r1 = "order_cancel_note"
            goto L_0x003d
        L_0x01b6:
            r0 = 26
            if (r1 != r0) goto L_0x01be
            java.lang.String r1 = "premium_message_composer"
            goto L_0x003d
        L_0x01be:
            r0 = 27
            if (r1 != r0) goto L_0x01c6
            java.lang.String r1 = "emoji_edit_text_bottom_sheet"
            goto L_0x003d
        L_0x01c6:
            r0 = 28
            if (r1 != r0) goto L_0x01ce
            java.lang.String r1 = "emoji_edit_text_dialog"
            goto L_0x003d
        L_0x01ce:
            r0 = 29
            if (r1 != r0) goto L_0x01d6
            java.lang.String r1 = "request_name"
            goto L_0x003d
        L_0x01d6:
            r0 = 30
            if (r1 != r0) goto L_0x01de
            java.lang.String r1 = "register_name"
            goto L_0x003d
        L_0x01de:
            r0 = 31
            if (r1 != r0) goto L_0x01e6
            java.lang.String r1 = "conversation"
            goto L_0x003d
        L_0x01e6:
            r0 = 32
            if (r1 != r0) goto L_0x01ee
            java.lang.String r1 = "chat_bar"
            goto L_0x003d
        L_0x01ee:
            java.lang.String r1 = "no_origin"
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A59.A04(java.lang.Integer, int, int, int, boolean):void");
    }

    public A59(C19830z4 r1, C18030ve r2, AnonymousClass18K r3, AnonymousClass19Y r4) {
        C18070vi.A0s(r2, r3, r4, r1);
        this.A04 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A02 = r1;
    }
}
