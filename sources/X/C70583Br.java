package X;

/* renamed from: X.3Br  reason: invalid class name and case insensitive filesystem */
public class C70583Br implements Runnable {
    public final int A00;
    public final Object A01;

    public C70583Br(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v46, types: [X.1en, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0212, code lost:
        if (r0 <= 0) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x039a, code lost:
        r1.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x039e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04cf, code lost:
        r0 = X.AnonymousClass001.A1E(r4, "BaseNotificationHandler/fail to ack, debugInfo:", X.AnonymousClass000.A10());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
        if (java.lang.Boolean.valueOf(r1) == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r1.A04(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0caf, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0cb2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x0df5, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x0df8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0dfd, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x0e00, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x0e19, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x0e1d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x012e, code lost:
        if (r5 <= 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015c, code lost:
        if (java.lang.Boolean.valueOf(r4) == null) goto L_0x015e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r48 = this;
            r1 = r48
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x038b;
                case 1: goto L_0x0042;
                case 2: goto L_0x005b;
                case 3: goto L_0x0390;
                case 4: goto L_0x039f;
                case 5: goto L_0x0012;
                case 6: goto L_0x03ad;
                case 7: goto L_0x006f;
                case 8: goto L_0x03e4;
                case 9: goto L_0x0094;
                case 10: goto L_0x023b;
                case 11: goto L_0x0255;
                case 12: goto L_0x03ec;
                case 13: goto L_0x0280;
                case 14: goto L_0x0d52;
                case 15: goto L_0x0de4;
                case 16: goto L_0x028a;
                case 17: goto L_0x0007;
                case 18: goto L_0x02b0;
                case 19: goto L_0x0007;
                case 20: goto L_0x02ba;
                case 21: goto L_0x0404;
                case 22: goto L_0x02cc;
                case 23: goto L_0x040c;
                case 24: goto L_0x02de;
                case 25: goto L_0x02f0;
                case 26: goto L_0x02fe;
                case 27: goto L_0x0314;
                case 28: goto L_0x0414;
                case 29: goto L_0x0df9;
                case 30: goto L_0x0341;
                case 31: goto L_0x041c;
                case 32: goto L_0x0e01;
                case 33: goto L_0x0434;
                case 34: goto L_0x04de;
                case 35: goto L_0x04e6;
                case 36: goto L_0x04ee;
                case 37: goto L_0x0511;
                case 38: goto L_0x052e;
                case 39: goto L_0x0536;
                case 40: goto L_0x0545;
                case 41: goto L_0x054d;
                case 42: goto L_0x09c5;
                case 43: goto L_0x09d2;
                case 44: goto L_0x09e2;
                case 45: goto L_0x09f5;
                case 46: goto L_0x0361;
                case 47: goto L_0x0c92;
                case 48: goto L_0x0c9a;
                case 49: goto L_0x0cd2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            X.1bI r1 = r0.A0C
            r0 = 0
        L_0x000e:
            r1.A04(r0)
        L_0x0011:
            return
        L_0x0012:
            java.lang.Object r2 = r1.A01
            X.7JF r2 = (X.AnonymousClass7JF) r2
            X.6uj r1 = r2.A0W
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r1.A0I
            android.view.View r0 = r0.A02
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "titleBar"
            goto L_0x0e19
        L_0x0023:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0011
            r1.A02()
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r2.A0L
            r0 = 1
            r1.A05(r0)
            X.6ud r0 = r2.A0J
            r0.A00()
            r0.A02()
            r1 = 1284(0x504, float:1.799E-42)
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r2.A0P
            r0.setSystemUiVisibility(r1)
            return
        L_0x0042:
            java.lang.Object r1 = r1.A01
            X.5d2 r1 = (X.C109235d2) r1
            X.4UI r0 = r1.A00
            java.lang.String r2 = "emojiSearchCoordinator"
            if (r0 == 0) goto L_0x0ce4
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0011
            X.4UI r1 = r1.A00
            if (r1 == 0) goto L_0x0ce4
            r0 = 1
            r1.A00(r0)
            return
        L_0x005b:
            java.lang.Object r1 = r1.A01
            X.6it r1 = (X.C130106it) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.widget.PopupWindow r1 = r1.A02
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x0011
            r1.dismiss()
            return
        L_0x006f:
            java.lang.Object r3 = r1.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            com.whatsapp.WaTextView r1 = r3.A0F
            if (r1 != 0) goto L_0x007b
            java.lang.String r0 = "mediaQualityToolTip"
            goto L_0x0e19
        L_0x007b:
            r0 = 4
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r3.A06
            if (r0 == 0) goto L_0x0011
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            if (r2 == 0) goto L_0x0011
            r1 = 12
            X.793 r0 = new X.793
            r0.<init>(r3, r1)
            r2.addOnGlobalLayoutListener(r0)
            return
        L_0x0094:
            java.lang.Object r3 = r1.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r3 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r3
            X.00H r0 = r3.getMediaQualityTooltipUtil()
            java.lang.Object r7 = r0.get()
            X.2ey r7 = (X.C54952ey) r7
            X.0z4 r8 = r7.A00
            long r4 = r8.A0R()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0011
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r8.A0R()
            long r4 = r4 - r0
            r1 = 1209600000(0x48190800, double:5.97621805E-315)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0011
            X.00H r9 = r8.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r9)
            java.lang.String r4 = "media_quality_has_send_media"
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x00da
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r9)
            boolean r1 = X.C17880vN.A1W(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L_0x0138
        L_0x00da:
            X.1ST r0 = r7.A01
            X.1Cd r0 = r0.A08     // Catch:{ Exception -> 0x0122 }
            X.1at r10 = r0.get()     // Catch:{ Exception -> 0x0122 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0118 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0118 }
            java.lang.String r2 = "SELECT count(1) as count FROM available_message_view WHERE from_me = 1 AND message_type IN ('3', '1')"
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT"
            android.database.Cursor r2 = r5.A0A(r2, r0, r1)     // Catch:{ all -> 0x0118 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = "count"
            long r5 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x010c }
            r2.close()     // Catch:{ all -> 0x0118 }
            r10.close()     // Catch:{ Exception -> 0x0122 }
            goto L_0x0129
        L_0x0105:
            r2.close()     // Catch:{ all -> 0x0118 }
            r10.close()     // Catch:{ Exception -> 0x0122 }
            goto L_0x0130
        L_0x010c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0117
            r2.close()     // Catch:{ all -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0118 }
        L_0x0117:
            throw r1     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x011d }
            goto L_0x0121
        L_0x011d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0122 }
        L_0x0121:
            throw r1     // Catch:{ Exception -> 0x0122 }
        L_0x0122:
            r1 = move-exception
            java.lang.String r0 = "MediaMessageStore/getMediaSendFromMeCount/sql failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0130
        L_0x0129:
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r1 = 1
            if (r0 > 0) goto L_0x0131
        L_0x0130:
            r1 = 0
        L_0x0131:
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r8)
            X.C17880vN.A1F(r0, r4, r1)
        L_0x0138:
            if (r1 == 0) goto L_0x0011
            long r0 = java.lang.System.currentTimeMillis()
            r4 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r0 = r0 - r4
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r9)
            java.lang.String r6 = "media_quality_has_send_hd_media"
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x015e
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r9)
            boolean r4 = X.C17880vN.A1W(r2, r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            if (r2 != 0) goto L_0x021c
        L_0x015e:
            X.1ST r9 = r7.A01
            X.0ve r5 = r9.A0A
            r4 = 3068(0xbfc, float:4.299E-42)
            X.0vf r2 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r2, r5, r4)
            java.lang.String r14 = java.lang.String.valueOf(r4)
            r4 = 4171(0x104b, float:5.845E-42)
            int r4 = X.C18020vd.A00(r2, r5, r4)
            java.lang.String r13 = java.lang.String.valueOf(r4)
            r4 = 4172(0x104c, float:5.846E-42)
            int r4 = X.C18020vd.A00(r2, r5, r4)
            java.lang.String r12 = java.lang.String.valueOf(r4)
            r4 = 4175(0x104f, float:5.85E-42)
            int r4 = X.C18020vd.A00(r2, r5, r4)
            java.lang.String r11 = java.lang.String.valueOf(r4)
            r4 = 9
            java.lang.String[] r4 = new java.lang.String[r4]
            r10 = 0
            X.C17880vN.A1V(r4, r10, r0)
            r0 = 1
            r4[r0] = r14
            r0 = 2
            r4[r0] = r14
            r0 = 3
            r4[r0] = r13
            r0 = 4
            r4[r0] = r13
            r0 = 5
            r4[r0] = r12
            r0 = 6
            r4[r0] = r11
            r0 = 7
            r4[r0] = r11
            r0 = 8
            r4[r0] = r12
            X.1Cd r0 = r9.A08     // Catch:{ Exception -> 0x0206 }
            X.1at r9 = r0.get()     // Catch:{ Exception -> 0x0206 }
            r0 = 6261(0x1875, float:8.774E-42)
            boolean r0 = X.C18020vd.A05(r2, r5, r0)     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x01c9
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01fc }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01fc }
            java.lang.String r1 = "SELECT count(1) as count FROM message_media  JOIN available_message_view  WHERE available_message_view.from_me = 1 AND message_media.message_row_id = available_message_view._id AND available_message_view.timestamp >= ? AND (((message_media.width >= ? OR message_media.height >= ?) AND available_message_view.message_type = '1') OR (available_message_view.message_type = '3' AND (message_media.width >= ? OR message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ?)))"
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT_BASED_ON_SIZE_A14"
            android.database.Cursor r2 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x01fc }
            goto L_0x01d6
        L_0x01c9:
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01fc }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x01fc }
            java.lang.String r1 = "SELECT count(1) as count FROM message_media  JOIN available_message_view ON message_media.message_row_id = available_message_view._id  WHERE available_message_view.from_me = 1 AND available_message_view.timestamp >= ? AND (((message_media.width >= ? OR message_media.height >= ?) AND available_message_view.message_type = '1') OR (available_message_view.message_type = '3' AND (message_media.width >= ? OR message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ? OR message_media.width >= ? AND message_media.height >= ?)))"
            java.lang.String r0 = "SELECT_MY_PHOTO_AND_VIDEO_MESSAGES_COUNT_BASED_ON_SIZE"
            android.database.Cursor r2 = r2.A0A(r1, r0, r4)     // Catch:{ all -> 0x01fc }
        L_0x01d6:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x01f0 }
            if (r0 == 0) goto L_0x01e9
            java.lang.String r0 = "count"
            long r4 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x01f0 }
            r2.close()     // Catch:{ all -> 0x01fc }
            r9.close()     // Catch:{ Exception -> 0x0206 }
            goto L_0x020d
        L_0x01e9:
            r2.close()     // Catch:{ all -> 0x01fc }
            r9.close()     // Catch:{ Exception -> 0x0206 }
            goto L_0x0214
        L_0x01f0:
            r1 = move-exception
            if (r2 == 0) goto L_0x01fb
            r2.close()     // Catch:{ all -> 0x01f7 }
            goto L_0x01fb
        L_0x01f7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01fc }
        L_0x01fb:
            throw r1     // Catch:{ all -> 0x01fc }
        L_0x01fc:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0201 }
            goto L_0x0205
        L_0x0201:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0206 }
        L_0x0205:
            throw r1     // Catch:{ Exception -> 0x0206 }
        L_0x0206:
            r1 = move-exception
            java.lang.String r0 = "MediaMessageStore/getHdMediaSendFromMeCount/sql failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0214
        L_0x020d:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r4 = 1
            if (r0 > 0) goto L_0x0215
        L_0x0214:
            r4 = 0
        L_0x0215:
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r8)
            X.C17880vN.A1F(r0, r6, r4)
        L_0x021c:
            if (r4 != 0) goto L_0x0011
            X.0ve r2 = r7.A02
            r1 = 6286(0x188e, float:8.809E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0011
            X.1KB r2 = r3.getGlobalUI()
            r1 = 7
            X.3Br r0 = new X.3Br
            r0.<init>(r3, r1)
            r2.A0J(r0)
            r0 = 1
            r3.A0f = r0
            return
        L_0x023b:
            java.lang.Object r2 = r1.A01
            X.740 r2 = (X.AnonymousClass740) r2
            r1 = 0
            android.graphics.Bitmap r0 = r2.A06
            r2.A05 = r0
            android.graphics.Bitmap r0 = r2.A02
            r2.A04 = r0
            r2.A01 = r1
            X.77n r0 = r2.A0W
            r0.A00()
            X.5kz r0 = r2.A0B
            if (r0 == 0) goto L_0x0011
            goto L_0x0dfd
        L_0x0255:
            java.lang.Object r4 = r1.A01
            X.740 r4 = (X.AnonymousClass740) r4
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            X.5kz r0 = r4.A0B
            if (r0 != 0) goto L_0x0011
            X.1FL r2 = r4.A0R
            X.2E5 r1 = r4.A0V
            X.5kz r0 = new X.5kz
            r0.<init>(r2, r1, r4)
            r4.A0B = r0
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0S
            r2.setAdapter(r0)
            android.view.View r0 = r4.A0N
            android.content.Context r1 = r0.getContext()
            com.whatsapp.filter.SmoothScrollLinearLayoutManager r0 = new com.whatsapp.filter.SmoothScrollLinearLayoutManager
            r0.<init>(r1, r3, r3)
            r2.setLayoutManager(r0)
            return
        L_0x0280:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            if (r0 == 0) goto L_0x0011
            r0.invoke()
            return
        L_0x028a:
            java.lang.Object r0 = r1.A01
            X.5dJ r0 = (X.C109355dJ) r0
            java.lang.Object r2 = r0.A01
            X.7JV r2 = (X.AnonymousClass7JV) r2
            X.5dH r1 = r2.A02
            if (r1 == 0) goto L_0x0011
            X.5dH r0 = r2.A03
            if (r0 == 0) goto L_0x0011
            int r0 = r1.getCount()
            r2.A00 = r0
            X.5dH r0 = r2.A03
            int r0 = r0.getCount()
            r2.A01 = r0
            java.lang.Runnable r0 = r2.A06
            if (r0 == 0) goto L_0x0011
            r0.run()
            return
        L_0x02b0:
            java.lang.Object r0 = r1.A01
            com.whatsapp.mediaview.MediaViewBaseFragment r0 = (com.whatsapp.mediaview.MediaViewBaseFragment) r0
            X.1bI r1 = r0.A0C
            r0 = 8
            goto L_0x000e
        L_0x02ba:
            java.lang.Object r0 = r1.A01
            com.whatsapp.mediaview.MediaViewFragment r0 = (com.whatsapp.mediaview.MediaViewFragment) r0
            X.70X r1 = r0.A1E
            if (r1 == 0) goto L_0x0011
            boolean r0 = r1.A0e()
            if (r0 != 0) goto L_0x0011
            r1.A0E()
            return
        L_0x02cc:
            java.lang.Object r1 = r1.A01
            com.whatsapp.mediaview.MediaViewBaseFragment r1 = (com.whatsapp.mediaview.MediaViewBaseFragment) r1
            X.1FL r0 = r1.A1B()
            if (r0 == 0) goto L_0x0011
            X.5rJ r0 = r1.A08
            if (r0 == 0) goto L_0x0011
            r0.A04()
            return
        L_0x02de:
            java.lang.Object r2 = r1.A01
            com.whatsapp.mediaview.PhotoView r2 = (com.whatsapp.mediaview.PhotoView) r2
            android.view.View$OnClickListener r0 = r2.A0K
            if (r0 == 0) goto L_0x0011
            android.graphics.PointF r0 = r2.A0D
            float r1 = r0.x
            float r0 = r0.y
            com.whatsapp.mediaview.PhotoView.A03(r2, r1, r0)
            return
        L_0x02f0:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1B()
            if (r0 == 0) goto L_0x0011
            r0.invalidateOptionsMenu()
            return
        L_0x02fe:
            java.lang.Object r2 = r1.A01
            X.1dZ r2 = (X.C30211dZ) r2
        L_0x0302:
            java.lang.ref.ReferenceQueue r0 = r2.A03
            java.lang.ref.Reference r0 = r0.poll()
            X.3Ei r0 = (X.C71203Ei) r0
            if (r0 == 0) goto L_0x0011
            java.util.concurrent.ConcurrentHashMap r1 = r2.A04
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            goto L_0x0302
        L_0x0314:
            java.lang.Object r5 = r1.A01
            X.1dZ r5 = (X.C30211dZ) r5
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x0011
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r0 = 100
            android.os.SystemClock.sleep(r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.runFinalization()
        L_0x032f:
            java.lang.ref.ReferenceQueue r0 = r5.A03
            java.lang.ref.Reference r0 = r0.poll()
            X.3Ei r0 = (X.C71203Ei) r0
            if (r0 == 0) goto L_0x0ce9
            java.util.concurrent.ConcurrentHashMap r1 = r5.A04
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            goto L_0x032f
        L_0x0341:
            java.lang.Object r1 = r1.A01
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L_0x0011
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L_0x0011
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0011
            r1.invalidateOptionsMenu()
            return
        L_0x0361:
            java.lang.Object r1 = r1.A01
            X.2si r1 = (X.C63222si) r1
            X.00H r0 = r1.A0X
            java.lang.Object r0 = r0.get()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0011
            X.00H r0 = r1.A0p
            java.lang.Object r2 = r0.get()
            X.1kp r2 = (X.C34641kp) r2
            X.2PG r0 = r2.A00
            X.C17890vO.A0t(r0)
            X.2PG r1 = new X.2PG
            r1.<init>(r2)
            r2.A00 = r1
            X.10I r0 = r2.A0C
            X.C17890vO.A0u(r1, r0)
            return
        L_0x038b:
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            goto L_0x039a
        L_0x0390:
            java.lang.Object r1 = r1.A01
            X.7J3 r1 = (X.AnonymousClass7J3) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            androidx.recyclerview.widget.RecyclerView r1 = r1.A05
        L_0x039a:
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x039f:
            java.lang.Object r0 = r1.A01
            X.7J3 r0 = (X.AnonymousClass7J3) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r0.A05
            r0.setVisibility(r1)
            return
        L_0x03ad:
            java.lang.Object r4 = r1.A01
            com.whatsapp.mediacomposer.doodle.DoodleView r4 = (com.whatsapp.mediacomposer.doodle.DoodleView) r4
            X.70N r2 = r4.A0M
            java.util.List r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x03b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03d0
            java.lang.Object r0 = r1.next()
            X.73u r0 = (X.C1409773u) r0
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x03b9
            X.73x r0 = r4.A0J
            r0.A06()
        L_0x03d0:
            boolean r0 = r2.A09()
            android.os.Handler r3 = r4.A0I
            java.lang.Runnable r2 = r4.A0N
            if (r0 == 0) goto L_0x03e0
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x03e0:
            r3.removeCallbacks(r2)
            return
        L_0x03e4:
            java.lang.Object r0 = r1.A01
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r0
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setTooltipInPosition$lambda$13(r0)
            return
        L_0x03ec:
            java.lang.Object r0 = r1.A01
            X.7G2 r0 = (X.AnonymousClass7G2) r0
            X.5kz r4 = r0.A00
            r3 = 0
            r4.A00 = r3
            r2 = 0
        L_0x03f6:
            boolean[] r1 = r4.A02
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0400
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x03f6
        L_0x0400:
            r4.notifyDataSetChanged()
            return
        L_0x0404:
            java.lang.Object r0 = r1.A01
            X.70X r0 = (X.AnonymousClass70X) r0
            r0.A0E()
            return
        L_0x040c:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            r0.setClipBounds((android.graphics.Rect) null)
            return
        L_0x0414:
            java.lang.Object r0 = r1.A01
            com.whatsapp.mentions.MentionPickerView r0 = (com.whatsapp.mentions.MentionPickerView) r0
            com.whatsapp.mentions.MentionPickerView.A02(r0)
            return
        L_0x041c:
            java.lang.Object r0 = r1.A01
            com.whatsapp.messagetranslation.TranslationMLProcessor r0 = (com.whatsapp.messagetranslation.TranslationMLProcessor) r0
            X.118 r1 = r0.A00
            android.content.Context r2 = r1.A00
            r0 = 2131899029(0x7f123295, float:1.9432992E38)
            java.lang.String r1 = r1.A01(r0)
            r0 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r1, r0)
            r0.show()
            return
        L_0x0434:
            java.lang.Object r7 = r1.A01
            X.1gK r7 = (X.C31911gK) r7
            r6 = 0
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.util.Set r5 = r7.A09
            monitor-enter(r5)
            r0 = 0
            r7.A02 = r0     // Catch:{ all -> 0x04db }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x044b
            monitor-exit(r5)
            return
        L_0x044b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "type="
            r2.append(r0)     // Catch:{ all -> 0x04db }
            int[] r3 = r7.A0B     // Catch:{ all -> 0x04db }
            X.C18070vi.A0d(r3, r6)     // Catch:{ all -> 0x04db }
            r1 = r3[r6]     // Catch:{ all -> 0x04db }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x04db }
            if (r0 != 0) goto L_0x0463
            r1 = -1
        L_0x0463:
            r2.append(r1)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = ", size="
            r2.append(r0)     // Catch:{ all -> 0x04db }
            int r0 = r5.size()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = X.C17880vN.A0t(r2, r0)     // Catch:{ all -> 0x04db }
            r4.append(r0)     // Catch:{ all -> 0x04db }
            java.util.Iterator r10 = r5.iterator()     // Catch:{ all -> 0x04db }
        L_0x047a:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x04c6
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x04db }
            X.2nR r9 = (X.C60132nR) r9     // Catch:{ all -> 0x04db }
            java.util.Map r8 = r7.A08     // Catch:{ all -> 0x04db }
            java.lang.String r2 = r9.A08     // Catch:{ all -> 0x04db }
            boolean r0 = r8.containsKey(r2)     // Catch:{ all -> 0x04db }
            if (r0 == 0) goto L_0x04a4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04db }
            r0 = 44
            r1.append(r0)     // Catch:{ all -> 0x04db }
            java.lang.Object r0 = r8.get(r2)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ all -> 0x04db }
            r4.append(r0)     // Catch:{ all -> 0x04db }
        L_0x04a4:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x04db }
            java.lang.String r0 = "BaseNotificationHandler/getStanzaToAckAfterProcessing fail to ack, stanza="
            r2.append(r0)     // Catch:{ all -> 0x04db }
            r2.append(r9)     // Catch:{ all -> 0x04db }
            java.lang.String r0 = ",type="
            r2.append(r0)     // Catch:{ all -> 0x04db }
            r1 = r3[r6]     // Catch:{ all -> 0x04db }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x04db }
            if (r0 != 0) goto L_0x04be
            r1 = -1
        L_0x04be:
            java.lang.String r0 = X.C17880vN.A0t(r2, r1)     // Catch:{ all -> 0x04db }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04db }
            goto L_0x047a
        L_0x04c6:
            r5.clear()     // Catch:{ all -> 0x04db }
            java.util.Map r0 = r7.A08     // Catch:{ all -> 0x04db }
            r0.clear()     // Catch:{ all -> 0x04db }
            monitor-exit(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BaseNotificationHandler/fail to ack, debugInfo:"
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)
            goto L_0x0caf
        L_0x04db:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x04de:
            java.lang.Object r0 = r1.A01
            X.1cq r0 = (X.C29771cq) r0
            X.C29771cq.A04(r0)
            return
        L_0x04e6:
            java.lang.Object r0 = r1.A01
            X.1cq r0 = (X.C29771cq) r0
            X.C29771cq.A02(r0)
            return
        L_0x04ee:
            java.lang.Object r2 = r1.A01
            X.1cq r2 = (X.C29771cq) r2
            java.lang.String r0 = "ClientPingManager/ping-response"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.10s r0 = r2.A0F
            r0.A02()
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0506
            java.lang.String r0 = "ClientPingManager/ping-response; ping already timed out, ping response is ignored"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0506:
            r0 = 0
            r2.A0K = r0
            X.C29771cq.A01(r2)
            X.C29771cq.A05(r2)
            return
        L_0x0511:
            java.lang.Object r1 = r1.A01
            X.1cq r1 = (X.C29771cq) r1
            X.10s r0 = r1.A0F
            r0.A02()
            X.1nd r1 = r1.A03
            if (r1 != 0) goto L_0x0522
            java.lang.String r0 = "ClientPingManager/handlePingRequestTimeout: connection thread is not ready"
            goto L_0x0caf
        L_0x0522:
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 8
            android.os.Message r0 = r1.obtainMessage(r0)
            r0.sendToTarget()
            return
        L_0x052e:
            java.lang.Object r0 = r1.A01
            X.1cq r0 = (X.C29771cq) r0
            X.C29771cq.A03(r0)
            return
        L_0x0536:
            java.lang.Object r2 = r1.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            r1 = 24
            X.7KX r0 = new X.7KX
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return
        L_0x0545:
            java.lang.Object r0 = r1.A01
            X.1fz r0 = (X.C31701fz) r0
            r0.A0Q()
            return
        L_0x054d:
            java.lang.Object r0 = r1.A01
            X.2hB r0 = (X.C56262hB) r0
            X.1Cd r1 = r0.A09
            r47 = r1
            r47.A06()
            boolean r1 = r1.A08
            if (r1 != 0) goto L_0x0560
            java.lang.String r0 = "future-proof-message-handler/processFutureMessages msgStore not ready"
            goto L_0x0caf
        L_0x0560:
            X.2eh r7 = r0.A07
            X.11P r1 = r0.A03
            r46 = r1
            X.0ve r1 = r0.A0B
            r45 = r1
            X.190 r1 = r0.A00
            r44 = r1
            X.11S r1 = r0.A01
            r43 = r1
            X.1CJ r1 = r0.A04
            r42 = r1
            X.18K r1 = r0.A0C
            r41 = r1
            X.00H r1 = r0.A0I
            java.lang.Object r25 = r1.get()
            r1 = r25
            X.2mW r1 = (X.C59572mW) r1
            r25 = r1
            X.122 r6 = r0.A05
            X.00H r1 = r0.A0J
            X.1W6 r24 = X.C17880vN.A0c(r1)
            X.00H r1 = r0.A0M
            java.lang.Object r23 = r1.get()
            r1 = r23
            X.ARP r1 = (X.ARP) r1
            r23 = r1
            X.1WM r1 = r0.A0A
            r40 = r1
            X.1hb r1 = r0.A06
            r39 = r1
            X.00H r1 = r0.A0N
            java.lang.Object r22 = r1.get()
            r1 = r22
            X.1l7 r1 = (X.C34811l7) r1
            r22 = r1
            X.1ln r1 = r0.A02
            r38 = r1
            X.1W9 r1 = r0.A0D
            r37 = r1
            X.00H r1 = r0.A0K
            java.lang.Object r21 = r1.get()
            r1 = r21
            X.12N r1 = (X.AnonymousClass12N) r1
            r21 = r1
            X.1fr r1 = r0.A0E
            r36 = r1
            X.00H r1 = r0.A0H
            java.lang.Object r20 = r1.get()
            r1 = r20
            X.2jV r1 = (X.C57702jV) r1
            r20 = r1
            X.1fs r1 = r0.A0F
            r35 = r1
            X.00H r1 = r0.A0L
            java.lang.Object r9 = r1.get()
            X.1RU r9 = (X.AnonymousClass1RU) r9
            X.00H r1 = r0.A0O
            java.lang.Object r19 = r1.get()
            r1 = r19
            X.61n r1 = (X.C1179361n) r1
            r19 = r1
            java.util.HashMap r18 = X.C17880vN.A11()
            r12 = 0
            X.1Cd r1 = r7.A01     // Catch:{ SQLiteException -> 0x08f0 }
            X.1at r17 = r1.get()     // Catch:{ SQLiteException -> 0x08f0 }
            r1 = r17
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x08e6 }
            X.1Ev r3 = r1.A02     // Catch:{ all -> 0x08e6 }
            java.lang.String r2 = X.AnonymousClass203.A0G     // Catch:{ all -> 0x08e6 }
            java.lang.String r1 = "GET_UNPROCESSED_FUTURE_MESSAGES_SQL"
            r11 = 0
            android.database.Cursor r16 = r3.A0A(r2, r1, r11)     // Catch:{ all -> 0x08e6 }
        L_0x0604:
            boolean r1 = r16.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x08cb
            X.00H r2 = r7.A02     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r1 = r16
            X.206 r5 = X.AnonymousClass1W6.A00(r1, r2)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            boolean r1 = r5 instanceof X.AnonymousClass23U     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x062c
            boolean r1 = r43.A0N()     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 != 0) goto L_0x062c
            r4 = r5
            X.23U r4 = (X.AnonymousClass23U) r4     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            byte[] r3 = r4.A12()     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            int r2 = r4.A01     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r3 == 0) goto L_0x062c
            if (r2 == 0) goto L_0x062f
            r1 = 2
            if (r2 == r1) goto L_0x062f
        L_0x062c:
            int r12 = r12 + 1
            goto L_0x0604
        L_0x062f:
            byte[] r2 = r4.A02     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r2 == 0) goto L_0x06fa
            X.2B9 r1 = X.AnonymousClass2B9.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.Bm6 r2 = X.C23577Bm6.A07(r1, r2)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.2B9 r2 = (X.AnonymousClass2B9) r2     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            int r1 = r2.bitField0_     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r1 = r1 & 1
            if (r1 == 0) goto L_0x06e9
            X.2BL r10 = r2.botInfo_     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            if (r10 != 0) goto L_0x0647
            X.2BL r10 = X.AnonymousClass2BL.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
        L_0x0647:
            int r1 = r10.bitField0_     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r1 = r1 & 8
            if (r1 == 0) goto L_0x06c0
            java.lang.String r2 = r10.targetSenderJid_     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            com.whatsapp.jid.UserJid r28 = X.C22941Dw.A03(r2)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
        L_0x0655:
            int r1 = r10.bitField0_     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x06bd
            java.lang.String r2 = r10.targetChatJid_     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.1Dv r1 = X.AnonymousClass1BI.A00     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.1BI r27 = X.C22931Dv.A01(r2)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
        L_0x0663:
            java.lang.String r8 = r10.targetId_     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            java.lang.String r1 = r10.editTargetId_     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r33 = 0
            X.350 r2 = new X.350     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r32 = r11
            r26 = r2
            r29 = r8
            r30 = r1
            r31 = r11
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.205 r14 = r4.A0v     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.1BI r1 = r14.A00     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r26 = r1
            r8 = r25
            X.1BI r15 = r8.A00(r2, r1)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r1 = 1
            java.lang.String r13 = r2.A04     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.205 r10 = X.AnonymousClass205.A01(r15, r13, r1)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r1 = r18
            java.lang.Object r1 = r1.get(r10)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            if (r1 != 0) goto L_0x06b2
            r1 = r24
            X.1W2 r8 = r1.A01     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.206 r1 = r8.A05(r10)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            if (r1 != 0) goto L_0x06b2
            r1 = 0
            X.205 r10 = X.AnonymousClass205.A01(r15, r13, r1)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            r1 = r18
            java.lang.Object r1 = r1.get(r10)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            if (r1 != 0) goto L_0x06b2
            X.206 r1 = r8.A05(r10)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
        L_0x06b2:
            java.lang.String r10 = r2.A03     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            boolean r8 = X.AnonymousClass1EG.A0H(r10)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            if (r8 == 0) goto L_0x06c3
            java.lang.String r10 = r14.A01     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            goto L_0x06c3
        L_0x06bd:
            r27 = r11
            goto L_0x0663
        L_0x06c0:
            r28 = r11
            goto L_0x0655
        L_0x06c3:
            if (r10 == 0) goto L_0x062c
            com.whatsapp.jid.UserJid r8 = r4.A0I()     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            if (r8 == 0) goto L_0x06e0
            com.whatsapp.jid.UserJid r29 = r4.A0I()     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
        L_0x06cf:
            r26 = r20
            r27 = r2
            r28 = r11
            r30 = r1
            r31 = r10
            r33 = r3
            byte[] r3 = r26.A00(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            goto L_0x06e5
        L_0x06e0:
            com.whatsapp.jid.UserJid r29 = X.C22941Dw.A00(r26)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            goto L_0x06cf
        L_0x06e5:
            if (r3 != 0) goto L_0x06fa
            goto L_0x062c
        L_0x06e9:
            java.lang.String r1 = "FutureProofMessageProcessor/process/missing BotInfo"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 1PN -> 0x06f2, 11T -> 0x06f0 }
            goto L_0x062c
        L_0x06f0:
            r2 = move-exception
            goto L_0x06f3
        L_0x06f2:
            r2 = move-exception
        L_0x06f3:
            java.lang.String r1 = "FutureProofMessageProcessor/process/unexpected error while processing BotMetadata"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x06fa:
            X.8cr r10 = X.A3S.A00(r3)     // Catch:{ 1PN -> 0x08af }
            X.205 r1 = r5.A0v     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            X.1BI r13 = r1.A00     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r8 = r22
            r2 = r42
            r1 = r45
            boolean r1 = X.C20102A7g.A04(r8, r2, r1, r13, r10)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 != 0) goto L_0x062c
            java.util.ArrayList r8 = X.C20102A7g.A01(r10)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r2 = r44
            r1 = r45
            boolean r1 = X.C20102A7g.A03(r2, r1, r10, r8)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 != 0) goto L_0x0727
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            java.lang.String r1 = "future-proof-message-handler/futureproof/invalidmessage:messageTypes="
            X.C17900vP.A0Z(r8, r1, r2)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x0727:
            byte[] r13 = r4.A03     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r8 = 0
            if (r13 == 0) goto L_0x0758
            X.1en r2 = new X.1en     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r2.<init>()     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            X.1eo r1 = new X.1eo     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r1.<init>(r11, r2, r11)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            X.1ca r27 = X.C60632oM.A00(r1, r13)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            if (r27 == 0) goto L_0x0758
            long r29 = android.os.SystemClock.uptimeMillis()     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            long r31 = X.AnonymousClass11P.A01(r46)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r26 = r36
            r28 = r35
            android.util.Pair r1 = r26.A01(r27, r28, r29, r31)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            if (r1 == 0) goto L_0x0758
            java.lang.Object r1 = r1.first     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            if (r1 == 0) goto L_0x0758
            X.2sw r1 = (X.C63362sw) r1     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            X.9p8 r8 = X.C181639Rg.A00(r10, r1, r3)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
        L_0x0758:
            X.1BI r13 = r4.A0H()     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            X.205 r2 = r4.A0v     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            boolean r1 = r2.A02     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            if (r1 == 0) goto L_0x0768
            if (r13 != 0) goto L_0x0768
            com.whatsapp.jid.PhoneUserJid r13 = X.AnonymousClass11S.A01(r43)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
        L_0x0768:
            if (r8 != 0) goto L_0x07a5
            X.205 r8 = new X.205     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r8.<init>(r2)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            long r1 = r4.A0I     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            X.9p8 r8 = X.C196699vU.A00(r10, r8, r1)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r8.A02 = r13     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r10 = 1
            r8.A0A = r10     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r1 = 65536(0x10000, double:3.2379E-319)
            boolean r1 = r4.A11(r1)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            if (r1 != 0) goto L_0x078c
            r1 = 16384(0x4000, double:8.0948E-320)
            boolean r1 = r4.A11(r1)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            if (r1 != 0) goto L_0x078c
            r10 = 0
        L_0x078c:
            r8.A0B = r10     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            X.Ac2 r1 = X.C196899vp.A00(r4)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            if (r1 == 0) goto L_0x07a1
            byte[] r13 = r1.A03     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            byte[] r10 = r1.A04     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            java.lang.Integer r2 = r1.A01     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            X.9sl r1 = new X.9sl     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r1.<init>(r2, r13, r3, r10)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r8.A04 = r1     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
        L_0x07a1:
            int r1 = r4.A01     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r8.A00 = r1     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
        L_0x07a5:
            X.A6d r2 = r8.A00()     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            r1 = r21
            X.206 r8 = r1.A00(r2)     // Catch:{ 98Y -> 0x08a0, 98X -> 0x062c, 1UI | 1hc -> 0x0898 }
            boolean r1 = r8 instanceof X.AnonymousClass23U     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 != 0) goto L_0x062c
            boolean r1 = r8.A0w()     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x07c3
            r1 = r19
            boolean r1 = r1.A04(r8)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 != 0) goto L_0x07c3
            goto L_0x062c
        L_0x07c3:
            boolean r1 = r8 instanceof X.C442822v     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r13 = 0
            if (r1 == 0) goto L_0x07d1
            java.util.List r1 = java.util.Collections.singletonList(r5)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r6.BIL(r1, r13)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x07d1:
            X.36t r1 = X.C60512o9.A00(r8)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r10 = 6
            if (r1 == 0) goto L_0x07eb
            X.36t r1 = X.C60512o9.A00(r8)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            X.C17960vV.A07(r1)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            X.206 r1 = r9.BWH(r8, r1)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            boolean r1 = r9.BkB(r8, r1)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x0893
            goto L_0x062c
        L_0x07eb:
            boolean r1 = X.AnonymousClass206.A08(r8)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x0805
            r1 = r38
            r1.CBr(r8, r3)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            boolean r1 = r1.BkA(r8)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x0805
            java.util.List r1 = java.util.Collections.singletonList(r5)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r6.BIL(r1, r13)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x0805:
            boolean r1 = r5.A0t()     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r3 = 12
            if (r1 == 0) goto L_0x0812
            byte[] r1 = r5.A1D     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r8.A1D = r1     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x081f
        L_0x0812:
            boolean r1 = X.C60612oK.A00(r5)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x081f
            java.lang.String r2 = "future-proof-message-handler/process"
            r1 = r41
            X.AnonymousClass1W9.A01(r1, r2, r3)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
        L_0x081f:
            r1 = r37
            java.lang.Integer r1 = X.AnonymousClass1W9.A00(r8, r1, r3)     // Catch:{ 1hd -> 0x0831 }
            if (r1 == 0) goto L_0x0837
            int r2 = r1.intValue()     // Catch:{ 1hd -> 0x0831 }
            X.1hd r1 = new X.1hd     // Catch:{ 1hd -> 0x0831 }
            r1.<init>((int) r2)     // Catch:{ 1hd -> 0x0831 }
            throw r1     // Catch:{ 1hd -> 0x0831 }
        L_0x0831:
            r2 = move-exception
            java.lang.String r1 = "future-proof-message-handler/futureproof/invalidMessageSecret:"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
        L_0x0837:
            r8.A0e(r5)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            boolean r1 = r8 instanceof X.AnonymousClass212     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x0871
            X.1au r4 = r47.A05()     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            X.1xA r3 = r4.BD0()     // Catch:{ all -> 0x08c1 }
            r1 = 17
            r8.A0a(r1)     // Catch:{ all -> 0x08b7 }
            X.212 r8 = (X.AnonymousClass212) r8     // Catch:{ all -> 0x08b7 }
            r1 = r40
            int r2 = X.AnonymousClass1WM.A00(r1, r8, r13)     // Catch:{ all -> 0x08b7 }
            boolean r1 = X.C63792th.A02(r2)     // Catch:{ all -> 0x08b7 }
            if (r1 != 0) goto L_0x085f
            r1 = 5
            if (r2 == r1) goto L_0x085f
            r1 = 7
            if (r2 != r1) goto L_0x0866
        L_0x085f:
            java.util.List r1 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x08b7 }
            r6.BIL(r1, r13)     // Catch:{ all -> 0x08b7 }
        L_0x0866:
            r3.A00()     // Catch:{ all -> 0x08b7 }
            r3.close()     // Catch:{ all -> 0x08c1 }
            r4.close()     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x0871:
            r1 = 131072(0x20000, double:6.47582E-319)
            boolean r1 = r8.A11(r1)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 == 0) goto L_0x088c
            byte[] r1 = r4.A02     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            if (r1 != 0) goto L_0x088c
            java.util.List r1 = java.util.Collections.singletonList(r5)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r6.BIL(r1, r13)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r1 = r39
            r1.A03(r8)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x088c:
            X.205 r2 = r8.A0v     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r1 = r18
            r1.put(r2, r8)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
        L_0x0893:
            r6.CQx(r8, r10)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x0898:
            r2 = move-exception
            java.lang.String r1 = "future-proof-message-handler/futureproof/badMessage:"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x08a0:
            r2 = move-exception
            java.lang.String r1 = "future-proof-message-handler/futureproof/orphan message"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            X.9tq r2 = r2.messageOrphan     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            r1 = r23
            r1.A01(r2)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x08af:
            r2 = move-exception
            java.lang.String r1 = "future-proof-message-handler/futureproof/invalidproto/"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
            goto L_0x062c
        L_0x08b7:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x08bc }
            goto L_0x08c0
        L_0x08bc:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x08c1 }
        L_0x08c0:
            throw r2     // Catch:{ all -> 0x08c1 }
        L_0x08c1:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x08c6 }
            goto L_0x08ca
        L_0x08c6:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
        L_0x08ca:
            throw r2     // Catch:{ SQLiteDiskIOException -> 0x08d2 }
        L_0x08cb:
            r16.close()     // Catch:{ all -> 0x08e6 }
            r17.close()     // Catch:{ SQLiteException -> 0x08f0 }
            goto L_0x08f6
        L_0x08d2:
            r3 = move-exception
            X.1CL r2 = r7.A00     // Catch:{ all -> 0x08da }
            r1 = 1
            r2.A00(r1)     // Catch:{ all -> 0x08da }
            throw r3     // Catch:{ all -> 0x08da }
        L_0x08da:
            r2 = move-exception
            if (r16 == 0) goto L_0x08e5
            r16.close()     // Catch:{ all -> 0x08e1 }
            goto L_0x08e5
        L_0x08e1:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x08e6 }
        L_0x08e5:
            throw r2     // Catch:{ all -> 0x08e6 }
        L_0x08e6:
            r2 = move-exception
            r17.close()     // Catch:{ all -> 0x08eb }
            goto L_0x08ef
        L_0x08eb:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ SQLiteException -> 0x08f0 }
        L_0x08ef:
            throw r2     // Catch:{ SQLiteException -> 0x08f0 }
        L_0x08f0:
            r2 = move-exception
            java.lang.String r1 = "futuremsgstore/future/db/unavailable"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x08f6:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "futuremsgstore/future/size:"
            X.C17900vP.A0j(r1, r2, r12)
            X.1Nt r11 = r0.A08
            r3 = 0
            X.1Cd r1 = r7.A01     // Catch:{ SQLiteException -> 0x09ab }
            X.1at r4 = r1.get()     // Catch:{ SQLiteException -> 0x09ab }
            r1 = r4
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x09a1 }
            X.1Ev r10 = r1.A02     // Catch:{ all -> 0x09a1 }
            java.lang.String r9 = "SELECT _id, message_row_id, skip_confirmation, location_latitude, location_longitude, location_name, newsletter_jid_row_id, newsletter_server_message_id, newsletter_name, newsletter_content_type, newsletter_accessibility_text, child_message_row_id, type, fp_interactive_annotation, sort_order FROM message_media_interactive_annotation WHERE type = ?"
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x09a1 }
            X.2Qq r8 = X.C49482Qq.FUTURE_PROOF     // Catch:{ all -> 0x09a1 }
            int r1 = r8.value     // Catch:{ all -> 0x09a1 }
            long r1 = (long) r1     // Catch:{ all -> 0x09a1 }
            X.C17880vN.A1U(r6, r3, r1)     // Catch:{ all -> 0x09a1 }
            java.lang.String r1 = "GET_UNPROCESSED_INTERACTIVE_ANNOTATION_SQL"
            android.database.Cursor r6 = r10.A0A(r9, r1, r6)     // Catch:{ all -> 0x09a1 }
        L_0x0920:
            boolean r1 = r6.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x098e }
            if (r1 == 0) goto L_0x0987
            X.00H r1 = r7.A03     // Catch:{ SQLiteDiskIOException -> 0x098e }
            java.lang.Object r1 = r1.get()     // Catch:{ SQLiteDiskIOException -> 0x098e }
            X.1Nt r1 = (X.C25321Nt) r1     // Catch:{ SQLiteDiskIOException -> 0x098e }
            com.whatsapp.InteractiveAnnotation r2 = r1.A01(r6, r4)     // Catch:{ SQLiteDiskIOException -> 0x098e }
            X.2Qq r1 = r2.type     // Catch:{ SQLiteDiskIOException -> 0x098e }
            if (r1 != r8) goto L_0x0970
            java.lang.Object r9 = r2.data     // Catch:{ SQLiteDiskIOException -> 0x098e }
            java.lang.Class<byte[]> r1 = byte[].class
            if (r9 == r1) goto L_0x0970
            byte[] r9 = (byte[]) r9     // Catch:{ SQLiteDiskIOException -> 0x098e }
            X.8bU r1 = X.C165618bU.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x096b }
            X.Bm6 r1 = X.C23577Bm6.A07(r1, r9)     // Catch:{ 1PN -> 0x096b }
            X.8bU r1 = (X.C165618bU) r1     // Catch:{ 1PN -> 0x096b }
            if (r1 == 0) goto L_0x0970
            com.whatsapp.InteractiveAnnotation r12 = X.C20133A8t.A06(r1)     // Catch:{ SQLiteDiskIOException -> 0x098e }
            if (r12 == 0) goto L_0x0970
            X.2Qq r1 = r12.type     // Catch:{ SQLiteDiskIOException -> 0x098e }
            if (r1 == r8) goto L_0x0970
            X.1au r13 = r47.A05()     // Catch:{ SQLiteDiskIOException -> 0x098e }
            X.1xA r1 = r13.BD0()     // Catch:{ all -> 0x097d }
            long r15 = r2.messageRowId     // Catch:{ all -> 0x0973 }
            int r14 = r2.sortOrder     // Catch:{ all -> 0x0973 }
            r11.A03(r12, r13, r14, r15)     // Catch:{ all -> 0x0973 }
            r1.A00()     // Catch:{ all -> 0x0973 }
            r1.close()     // Catch:{ all -> 0x097d }
            r13.close()     // Catch:{ SQLiteDiskIOException -> 0x098e }
            goto L_0x0970
        L_0x096b:
            java.lang.String r1 = "Failed to decrypt the InteractiveAnnotation proto"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ SQLiteDiskIOException -> 0x098e }
        L_0x0970:
            int r3 = r3 + 1
            goto L_0x0920
        L_0x0973:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0978 }
            goto L_0x097c
        L_0x0978:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x097d }
        L_0x097c:
            throw r2     // Catch:{ all -> 0x097d }
        L_0x097d:
            r2 = move-exception
            r13.close()     // Catch:{ all -> 0x0982 }
            goto L_0x0986
        L_0x0982:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ SQLiteDiskIOException -> 0x098e }
        L_0x0986:
            throw r2     // Catch:{ SQLiteDiskIOException -> 0x098e }
        L_0x0987:
            r6.close()     // Catch:{ all -> 0x09a1 }
            r4.close()     // Catch:{ SQLiteException -> 0x09ab }
            goto L_0x09b1
        L_0x098e:
            r2 = move-exception
            X.1CL r1 = r7.A00     // Catch:{ all -> 0x0995 }
            r1.A00(r5)     // Catch:{ all -> 0x0995 }
            throw r2     // Catch:{ all -> 0x0995 }
        L_0x0995:
            r2 = move-exception
            if (r6 == 0) goto L_0x09a0
            r6.close()     // Catch:{ all -> 0x099c }
            goto L_0x09a0
        L_0x099c:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x09a1 }
        L_0x09a0:
            throw r2     // Catch:{ all -> 0x09a1 }
        L_0x09a1:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x09a6 }
            goto L_0x09aa
        L_0x09a6:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ SQLiteException -> 0x09ab }
        L_0x09aa:
            throw r2     // Catch:{ SQLiteException -> 0x09ab }
        L_0x09ab:
            r2 = move-exception
            java.lang.String r1 = "futuremsgstore/future/db/unavailable"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x09b1:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "futuremsgstore/future interactive annotation/size:"
            X.C17900vP.A0j(r1, r2, r3)
            X.00H r0 = r0.A0P
            X.0z4 r1 = X.C17880vN.A0K(r0)
            r0 = 0
            r1.A21(r0)
            return
        L_0x09c5:
            java.lang.Object r1 = r1.A01
            X.17v r1 = (X.C219017v) r1
            java.lang.String r0 = "MessageHandler/postActionStart"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A07()
            return
        L_0x09d2:
            java.lang.Object r0 = r1.A01
            X.17v r0 = (X.C219017v) r0
            X.1Hb r1 = r0.A0U
            X.11E r0 = r0.A0L
            X.1LR r0 = r0.A04()
            r1.A01(r0)
            return
        L_0x09e2:
            java.lang.Object r0 = r1.A01
            X.2si r0 = (X.C63222si) r0
            X.00H r0 = r0.A0F
            java.lang.Object r3 = r0.get()
            X.1Tf r3 = (X.C26721Tf) r3
            r2 = 0
            r1 = 1
            r0 = 0
            r3.A02(r2, r0, r1)
            return
        L_0x09f5:
            java.lang.Object r2 = r1.A01
            X.2si r2 = (X.C63222si) r2
            X.00H r0 = r2.A0X
            java.lang.Object r0 = r0.get()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0c7d
            X.00H r0 = r2.A0b
            java.lang.Object r1 = r0.get()
            X.1QR r1 = (X.AnonymousClass1QR) r1
            X.00H r0 = r2.A0c
            java.lang.Object r0 = r0.get()
            X.1em r0 = (X.C30951em) r0
            X.1Cd r5 = r1.A03
            r5.A06()
            boolean r3 = r5.A08
            if (r3 != 0) goto L_0x0a49
            X.1QE r1 = r1.A04
            java.lang.String r0 = "processFutureTransactions: msg store not ready"
            r1.A05(r0)
        L_0x0a28:
            X.00H r7 = r2.A0s
            android.content.SharedPreferences r0 = X.C17900vP.A02(r7)
            java.lang.String r6 = "verification_level_consolidation_notification"
            boolean r0 = X.C17880vN.A1W(r0, r6)
            if (r0 != 0) goto L_0x0c7d
            X.00H r0 = r2.A0H
            java.lang.Object r1 = r0.get()
            X.1Nd r1 = (X.C25161Nd) r1
            X.1CJ r0 = r1.A02
            X.AnonymousClass1CJ.A01(r0)
            X.1Ne r5 = r1.A01
            monitor-enter(r5)
            goto L_0x0c07
        L_0x0a49:
            java.lang.String[] r9 = X.C17880vN.A1Y()
            r3 = 5
            java.lang.String r4 = java.lang.Integer.toString(r3)
            r3 = 0
            r9[r3] = r4
            X.1at r18 = r5.get()
            r4 = r18
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x0c67 }
            X.1Ev r4 = r4.A02     // Catch:{ all -> 0x0c67 }
            java.lang.String r6 = "pay_transaction"
            java.lang.String[] r7 = X.AnonymousClass1QR.A0D     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "( type=? )"
            java.lang.String r11 = "init_timestamp DESC"
            java.lang.String r13 = "processFutureTransactions/QUERY_PAY_TRANSACTION"
            r10 = 0
            r5 = r4
            r12 = r10
            android.database.Cursor r9 = r5.A0B(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0c67 }
            if (r9 == 0) goto L_0x0c02
            r8 = 0
        L_0x0a73:
            boolean r4 = r9.moveToNext()     // Catch:{ all -> 0x0c5d }
            if (r4 == 0) goto L_0x0be8
            X.AW0 r11 = X.AnonymousClass1QR.A09(r9, r1)     // Catch:{ 11T -> 0x0bde }
            boolean r4 = r11.A0M()     // Catch:{ 11T -> 0x0bde }
            r30 = 0
            if (r4 == 0) goto L_0x0bda
            byte[] r6 = r11.A0R     // Catch:{ 11T -> 0x0bde }
            if (r6 == 0) goto L_0x0bda
            X.1eo r5 = r0.A06     // Catch:{ 1UI | IOException -> 0x0bcd }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ 1UI | IOException -> 0x0bcd }
            r4.<init>(r6)     // Catch:{ 1UI | IOException -> 0x0bcd }
            X.1ca r7 = X.C30971eo.A01(r5, r4)     // Catch:{ 1UI | IOException -> 0x0bcd }
            if (r7 == 0) goto L_0x0bda
            java.lang.String r5 = r7.A00     // Catch:{ 11T -> 0x0bde }
            java.lang.String r4 = "pay"
            boolean r4 = r5.equals(r4)     // Catch:{ 11T -> 0x0bde }
            if (r4 == 0) goto L_0x0b70
            X.1BI r6 = r11.A0C     // Catch:{ 11T -> 0x0bde }
            boolean r5 = r11.A0Q     // Catch:{ 11T -> 0x0bde }
            java.lang.String r4 = r11.A0L     // Catch:{ 11T -> 0x0bde }
            X.205 r6 = X.AnonymousClass205.A01(r6, r4, r5)     // Catch:{ 11T -> 0x0bde }
            X.1BI r4 = r6.A00     // Catch:{ 11T -> 0x0bde }
            if (r4 == 0) goto L_0x0bda
            java.lang.String r4 = r6.A01     // Catch:{ 11T -> 0x0bde }
            if (r4 == 0) goto L_0x0bda
            X.00H r4 = r0.A07     // Catch:{ 11T -> 0x0bde }
            java.lang.Object r4 = r4.get()     // Catch:{ 11T -> 0x0bde }
            X.2lL r4 = (X.C58842lL) r4     // Catch:{ 11T -> 0x0bde }
            X.00H r4 = r4.A00     // Catch:{ 11T -> 0x0bde }
            X.206 r4 = X.AnonymousClass1W2.A01(r6, r4)     // Catch:{ 11T -> 0x0bde }
            if (r4 == 0) goto L_0x0bda
            java.lang.String r5 = "type"
            java.lang.String r11 = r7.A0Q(r5, r10)     // Catch:{ 11T -> 0x0bde }
            X.1BI r17 = r4.A0H()     // Catch:{ 11T -> 0x0bde }
            if (r11 == 0) goto L_0x0b63
            java.lang.String r5 = "request"
            boolean r5 = r11.equals(r5)     // Catch:{ 11T -> 0x0bde }
            if (r5 == 0) goto L_0x0b63
            X.AW0 r5 = X.AnonymousClass25B.A00(r4)     // Catch:{ 11T -> 0x0bde }
            if (r5 == 0) goto L_0x0bda
            X.205 r11 = r4.A0v     // Catch:{ 11T -> 0x0bde }
            X.1BI r11 = r11.A00     // Catch:{ 11T -> 0x0bde }
            r33 = r11
            boolean r11 = X.C22971Dz.A0e(r33)     // Catch:{ 11T -> 0x0bde }
            if (r11 == 0) goto L_0x0af3
            X.11S r12 = r0.A00     // Catch:{ 11T -> 0x0bde }
            com.whatsapp.jid.UserJid r11 = r5.A0E     // Catch:{ 11T -> 0x0bde }
            boolean r11 = r12.A0O(r11)     // Catch:{ 11T -> 0x0bde }
            if (r11 == 0) goto L_0x0bda
        L_0x0af3:
            java.lang.String r13 = r5.A0G     // Catch:{ 11T -> 0x0bde }
            java.lang.String r12 = r5.A0I     // Catch:{ 11T -> 0x0bde }
            X.1QS r11 = r0.A05     // Catch:{ 11T -> 0x0bde }
            X.2is r11 = r11.A04(r13)     // Catch:{ 11T -> 0x0bde }
            if (r11 == 0) goto L_0x0b60
            X.BD1 r16 = r11.A00(r12)     // Catch:{ 11T -> 0x0bde }
        L_0x0b03:
            X.C17960vV.A07(r16)     // Catch:{ 11T -> 0x0bde }
            com.whatsapp.jid.UserJid r11 = r5.A0E     // Catch:{ 11T -> 0x0bde }
            r21 = r11
            com.whatsapp.jid.UserJid r11 = r5.A0D     // Catch:{ 11T -> 0x0bde }
            r20 = r11
            java.lang.String r11 = r5.A0I     // Catch:{ 11T -> 0x0bde }
            r19 = r11
            X.1KN r15 = r5.A09     // Catch:{ 11T -> 0x0bde }
            X.1KJ r14 = r5.A07     // Catch:{ 11T -> 0x0bde }
            long r11 = r4.A0I     // Catch:{ 11T -> 0x0bde }
            java.lang.String r13 = r5.A0G     // Catch:{ 11T -> 0x0bde }
            int r29 = r16.BZ3()     // Catch:{ 11T -> 0x0bde }
            X.A8n r16 = X.C20128A8n.$redex_init_class     // Catch:{ 11T -> 0x0bde }
            int r28 = X.C196679vS.A00(r13)     // Catch:{ 11T -> 0x0bde }
            r27 = 12
            r26 = 20
            r22 = r20
            r23 = r19
            r24 = r10
            r25 = r13
            r31 = r11
            r19 = r14
            r20 = r15
            X.AW0 r11 = X.C20128A8n.A02(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ 11T -> 0x0bde }
            int r5 = r5.A02     // Catch:{ 11T -> 0x0bde }
            if (r5 == 0) goto L_0x0b40
            r11.A02 = r5     // Catch:{ 11T -> 0x0bde }
        L_0x0b40:
            com.whatsapp.jid.UserJid r13 = X.C22941Dw.A00(r33)     // Catch:{ 11T -> 0x0bde }
            com.whatsapp.jid.UserJid r14 = X.C22941Dw.A01(r17)     // Catch:{ 11T -> 0x0bde }
            long r4 = r4.A0I     // Catch:{ 11T -> 0x0bde }
            r12 = r0
            r15 = r7
            r16 = r4
            X.AW0 r5 = r12.A01(r13, r14, r15, r16)     // Catch:{ 11T -> 0x0bde }
            java.lang.String r4 = r5.A0K     // Catch:{ 11T -> 0x0bde }
            r11.A0K = r4     // Catch:{ 11T -> 0x0bde }
            X.8pG r4 = r5.A0A     // Catch:{ 11T -> 0x0bde }
            r11.A0A = r4     // Catch:{ 11T -> 0x0bde }
        L_0x0b5a:
            X.121 r4 = r0.A01     // Catch:{ 11T -> 0x0bde }
            r4.CQz(r11, r6)     // Catch:{ 11T -> 0x0bde }
            goto L_0x0bd8
        L_0x0b60:
            r16 = 0
            goto L_0x0b03
        L_0x0b63:
            com.whatsapp.jid.UserJid r11 = X.C22941Dw.A00(r17)     // Catch:{ 11T -> 0x0bde }
            long r4 = r4.A0I     // Catch:{ 11T -> 0x0bde }
            X.AW0 r11 = r0.A02(r11, r7, r4)     // Catch:{ 11T -> 0x0bde }
            if (r11 == 0) goto L_0x0bda
            goto L_0x0b5a
        L_0x0b70:
            java.lang.String r4 = "transaction"
            boolean r4 = r5.equals(r4)     // Catch:{ 11T -> 0x0bde }
            if (r4 == 0) goto L_0x0bda
            X.AW0 r6 = r0.A03(r10, r7)     // Catch:{ 11T -> 0x0bde }
            if (r6 == 0) goto L_0x0bda
            X.1BI r4 = r6.A0C     // Catch:{ 11T -> 0x0bde }
            if (r4 != 0) goto L_0x0bbd
            java.lang.String r4 = r6.A0L     // Catch:{ 11T -> 0x0bde }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 11T -> 0x0bde }
            if (r4 != 0) goto L_0x0bbd
            X.1BI r7 = r6.A0C     // Catch:{ 11T -> 0x0bde }
            boolean r5 = r6.A0Q     // Catch:{ 11T -> 0x0bde }
            java.lang.String r4 = r6.A0L     // Catch:{ 11T -> 0x0bde }
            X.205 r7 = X.AnonymousClass205.A01(r7, r4, r5)     // Catch:{ 11T -> 0x0bde }
            X.00H r4 = r0.A07     // Catch:{ 11T -> 0x0bde }
            java.lang.Object r4 = r4.get()     // Catch:{ 11T -> 0x0bde }
            X.2lL r4 = (X.C58842lL) r4     // Catch:{ 11T -> 0x0bde }
            X.00H r4 = r4.A00     // Catch:{ 11T -> 0x0bde }
            X.206 r4 = X.AnonymousClass1W2.A01(r7, r4)     // Catch:{ 11T -> 0x0bde }
            if (r4 == 0) goto L_0x0bbd
            X.AW0 r5 = X.AnonymousClass25B.A00(r4)     // Catch:{ 11T -> 0x0bde }
            if (r5 == 0) goto L_0x0bb7
            java.lang.String r4 = r5.A0M     // Catch:{ 11T -> 0x0bde }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 11T -> 0x0bde }
            if (r4 != 0) goto L_0x0bb7
            java.lang.String r4 = r5.A0M     // Catch:{ 11T -> 0x0bde }
            r6.A0M = r4     // Catch:{ 11T -> 0x0bde }
        L_0x0bb7:
            X.121 r4 = r0.A01     // Catch:{ 11T -> 0x0bde }
            r4.CQz(r6, r7)     // Catch:{ 11T -> 0x0bde }
            goto L_0x0bd8
        L_0x0bbd:
            X.1QS r4 = r0.A05     // Catch:{ 11T -> 0x0bde }
            X.AnonymousClass1QS.A00(r4)     // Catch:{ 11T -> 0x0bde }
            X.1QR r5 = r4.A04     // Catch:{ 11T -> 0x0bde }
            java.lang.String r4 = r6.A0L     // Catch:{ 11T -> 0x0bde }
            boolean r4 = r5.A0e(r6, r11, r4)     // Catch:{ 11T -> 0x0bde }
            if (r4 == 0) goto L_0x0bda
            goto L_0x0bd8
        L_0x0bcd:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ 11T -> 0x0bde }
            java.lang.String r4 = "PAY: PaymentsProtoParser deserializeProtocolNode: "
            X.C17900vP.A0X(r6, r4, r5)     // Catch:{ 11T -> 0x0bde }
            goto L_0x0bda
        L_0x0bd8:
            int r3 = r3 + 1
        L_0x0bda:
            int r8 = r8 + 1
            goto L_0x0a73
        L_0x0bde:
            r6 = move-exception
            X.1QE r5 = r1.A04     // Catch:{ all -> 0x0c5d }
            java.lang.String r4 = "processFutureTransactions/InvalidJidException - Skipped future transaction with invalid JID"
            r5.A0A(r4, r6)     // Catch:{ all -> 0x0c5d }
            goto L_0x0a73
        L_0x0be8:
            X.1QE r4 = r1.A04     // Catch:{ all -> 0x0c5d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0c5d }
            java.lang.String r0 = "processFutureTransactions processed: "
            r1.append(r0)     // Catch:{ all -> 0x0c5d }
            r1.append(r3)     // Catch:{ all -> 0x0c5d }
            java.lang.String r0 = " / "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r8)     // Catch:{ all -> 0x0c5d }
            X.AnonymousClass1QE.A02(r4, r10, r0)     // Catch:{ all -> 0x0c5d }
            r9.close()     // Catch:{ all -> 0x0c67 }
        L_0x0c02:
            r18.close()
            goto L_0x0a28
        L_0x0c07:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0c5a }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x0c5a }
        L_0x0c0f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0c5a }
            if (r0 == 0) goto L_0x0c29
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0c5a }
            X.1ng r0 = (X.C36311ng) r0     // Catch:{ all -> 0x0c5a }
            X.1BI r1 = r0.A01     // Catch:{ all -> 0x0c5a }
            boolean r0 = X.C22971Dz.A0d(r1)     // Catch:{ all -> 0x0c5a }
            if (r0 == 0) goto L_0x0c0f
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0c5a }
            r4.add(r1)     // Catch:{ all -> 0x0c5a }
            goto L_0x0c0f
        L_0x0c29:
            monitor-exit(r5)     // Catch:{ all -> 0x0c5a }
            java.util.Iterator r5 = r4.iterator()
        L_0x0c2e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0c71
            com.whatsapp.jid.UserJid r4 = X.C17880vN.A0T(r5)
            X.00H r0 = r2.A0q
            java.lang.Object r0 = r0.get()
            X.1PM r0 = (X.AnonymousClass1PM) r0
            X.1yf r3 = r0.A02(r4)
            if (r3 == 0) goto L_0x0c2e
            X.00H r0 = r2.A0I
            java.lang.Object r1 = r0.get()
            X.122 r1 = (X.AnonymousClass122) r1
            X.2kB r0 = X.AnonymousClass2V1.A00(r3)
            X.2mv r0 = r0.A00()
            r1.BAz(r4, r0)
            goto L_0x0c2e
        L_0x0c5a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0c5a }
            throw r0
        L_0x0c5d:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0c62 }
            goto L_0x0c66
        L_0x0c62:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0c67 }
        L_0x0c66:
            throw r1     // Catch:{ all -> 0x0c67 }
        L_0x0c67:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0c6c }
            throw r1
        L_0x0c6c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0c71:
            X.0z4 r0 = X.C17880vN.A0K(r7)
            r1 = 1
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            X.C17880vN.A1F(r0, r6, r1)
        L_0x0c7d:
            X.00H r0 = r2.A0t
            java.lang.Object r0 = r0.get()
            X.11O r0 = (X.AnonymousClass11O) r0
            r2 = 0
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "run_on_connect_tasks_for_version_change"
            X.C17880vN.A1F(r1, r0, r2)
            return
        L_0x0c92:
            java.lang.Object r0 = r1.A01
            X.1P3 r0 = (X.AnonymousClass1P3) r0
            r0.A0O()
            return
        L_0x0c9a:
            java.lang.Object r1 = r1.A01
            X.2si r1 = (X.C63222si) r1
            X.00H r0 = r1.A0X
            java.lang.Object r0 = r0.get()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            r0.A06()
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0cb3
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/msg store not ready"
        L_0x0caf:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0cb3:
            X.00H r2 = r1.A0I
            java.lang.Object r1 = r2.get()
            X.122 r1 = (X.AnonymousClass122) r1
            r0 = 0
            r1.A0N(r0, r0)
            java.lang.Object r0 = r2.get()
            X.122 r0 = (X.AnonymousClass122) r0
            r0.A0L()
            java.lang.Object r0 = r2.get()
            X.122 r0 = (X.AnonymousClass122) r0
            r0.A0M()
            return
        L_0x0cd2:
            java.lang.Object r0 = r1.A01
            X.2si r0 = (X.C63222si) r0
            X.00H r0 = r0.A0P
            java.lang.Object r2 = r0.get()
            X.1Do r2 = (X.C22881Do) r2
            r1 = 1
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0ce4:
            X.C18070vi.A11(r2)
            goto L_0x0e1c
        L_0x0ce9:
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.concurrent.ConcurrentHashMap r10 = r5.A04
            java.util.Iterator r11 = X.C17890vO.A0i(r10)
        L_0x0cf7:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0d25
            java.lang.Object r8 = X.C17890vO.A0P(r11)
            X.3Ei r8 = (X.C71203Ei) r8
            java.lang.Object r7 = r8.get()
            java.lang.ref.WeakReference r0 = r8.A02
            java.lang.Object r6 = r0.get()
            long r0 = r8.A00
            long r3 = r12 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0cf7
            if (r7 == 0) goto L_0x0cf7
            if (r6 != 0) goto L_0x0cf7
            java.lang.String r0 = r8.A01
            r9.add(r7)
            r10.remove(r0)
            goto L_0x0cf7
        L_0x0d25:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0d4e
            java.util.Iterator r4 = r9.iterator()
        L_0x0d2f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0d4e
            java.lang.Object r1 = r4.next()
            X.0vt r0 = r5.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0d2f
            X.190 r3 = r5.A00
            java.lang.String r2 = X.C17890vO.A0U(r1)
            r1 = 0
            java.lang.String r0 = "leak-detected-v3"
            r3.A0G(r0, r2, r1)
            goto L_0x0d2f
        L_0x0d4e:
            r0 = 0
            r5.A06 = r0
            return
        L_0x0d52:
            java.lang.Object r6 = r1.A01
            com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment r6 = (com.whatsapp.mediacomposer.ui.bottomsheet.ImageQualitySettingsBottomSheetFragment) r6
            X.00H r0 = r6.A01
            if (r0 == 0) goto L_0x0de1
            java.lang.Object r5 = r0.get()
            X.2ev r5 = (X.C54922ev) r5
            X.72S r0 = r6.A02
            android.net.Uri r11 = r0.A0X
            r0 = 2
            int[] r8 = new int[r0]
            r8 = {3, 0} // fill-array
            r7 = 0
            r10 = 1
            java.util.HashMap r4 = X.C17880vN.A11()
            r9 = 2
            r3 = 0
        L_0x0d72:
            r1 = r8[r3]
            X.00H r0 = r5.A02
            java.lang.Object r0 = r0.get()
            X.6ub r0 = (X.C136906ub) r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.6nF r18 = r0.A00(r2, r10, r7)
            if (r18 == 0) goto L_0x0dce
            java.lang.String r1 = "temp_file"
            java.lang.String r0 = ".jpeg"
            java.io.File r19 = java.io.File.createTempFile(r1, r0)
            X.349 r14 = new X.349
            r14.<init>()
            java.lang.String r20 = X.C18070vi.A0H(r11)
            X.18K r1 = r5.A01
            X.0ve r0 = r5.A00
            r15 = 0
            X.70S r13 = new X.70S
            r13.<init>(r0, r1, r15, r7)
            X.34C r16 = new X.34C
            r16.<init>()
            X.34F r17 = new X.34F
            r17.<init>()
            X.C18070vi.A0b(r19)
            r22 = r7
            X.68T r12 = new X.68T
            r21 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            X.2kJ r0 = (X.C58202kJ) r0
            X.DTl r0 = r0.A00(r12)
            r0.run()
            long r0 = r19.length()
            X.C17880vN.A1N(r2, r4, r0)
        L_0x0dce:
            int r3 = r3 + 1
            if (r3 < r9) goto L_0x0d72
            X.1KB r2 = r6.A02
            if (r2 == 0) goto L_0x0dde
            r0 = 10
            X.3By r1 = new X.3By
            r1.<init>(r6, r4, r0)
            goto L_0x0df5
        L_0x0dde:
            java.lang.String r0 = "globalUi"
            goto L_0x0e19
        L_0x0de1:
            java.lang.String r0 = "imageTranscoderHelper"
            goto L_0x0e19
        L_0x0de4:
            java.lang.Object r4 = r1.A01
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r4 = (com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel) r4
            int r3 = com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel.A00(r4)
            X.1KB r2 = r4.A04
            r0 = 18
            X.7RM r1 = new X.7RM
            r1.<init>((java.lang.Object) r4, (int) r3, (int) r0)
        L_0x0df5:
            r2.A0J(r1)
            return
        L_0x0df9:
            java.lang.Object r0 = r1.A01
            X.1rD r0 = (X.C38391rD) r0
        L_0x0dfd:
            r0.notifyDataSetChanged()
            return
        L_0x0e01:
            java.lang.Object r3 = r1.A01
            com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment r3 = (com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment) r3
            android.view.View r1 = r3.A17()
            r0 = 2131436431(0x7f0b238f, float:1.8494732E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r1, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.whatsapp.messagetranslation.onboarding.TranslationViewModel r0 = r3.A01
            if (r0 != 0) goto L_0x0e1e
            java.lang.String r0 = "viewModel"
        L_0x0e19:
            X.C18070vi.A11(r0)
        L_0x0e1c:
            r0 = 0
            throw r0
        L_0x0e1e:
            java.lang.String r1 = r0.A01
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0e44
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r1)
            java.lang.String r0 = X.C25351CeA.A01(r0)
            X.C18070vi.A0X(r0)
            r2.setText(r0)
            android.view.View r1 = r3.A17()
            r0 = 2131436429(0x7f0b238d, float:1.8494728E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            r0 = 1
            r1.setEnabled(r0)
            return
        L_0x0e44:
            r0 = 2131899535(0x7f12348f, float:1.9434019E38)
            r2.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70583Br.run():void");
    }
}
