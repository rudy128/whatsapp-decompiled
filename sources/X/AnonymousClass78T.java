package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.78T  reason: invalid class name */
public class AnonymousClass78T implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass78T(Activity activity, AnonymousClass00H r3) {
        this.A00 = 8;
        this.A02 = activity;
        this.A01 = 101;
        this.A03 = r3;
    }

    public static void A00(View view, Object obj, Object obj2, int i, int i2) {
        view.setOnClickListener(new AnonymousClass78T(obj, i, i2, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03f2, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        r5 = r0.A01.A02;
        r4 = r5.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        if (r4 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        r4.A0W(r6, 17, java.lang.Integer.valueOf(r7), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04f4, code lost:
        r0 = "activityUtils";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04f7, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04fc, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0500, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0522, code lost:
        r3.A01(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0525, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        r0 = r5.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        if (r0 == null) goto L_0x04f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        r0.get();
        r2 = X.AnonymousClass1LU.A0j(r5.A1D(), r6, true, false, true);
        r0 = r5.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        if (r0 == null) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        r1 = (X.AnonymousClass1L9) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        if (X.AnonymousClass1L9.A07(r2, r5, 5) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        r1.A01.A08(2131886448, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            r4 = r12
            switch(r0) {
                case 2: goto L_0x04d8;
                case 3: goto L_0x023c;
                case 4: goto L_0x04a5;
                case 5: goto L_0x0497;
                case 6: goto L_0x01dd;
                case 7: goto L_0x018c;
                case 8: goto L_0x02bd;
                case 9: goto L_0x016c;
                case 10: goto L_0x0158;
                case 11: goto L_0x00f2;
                case 12: goto L_0x0481;
                case 13: goto L_0x00d9;
                case 14: goto L_0x046d;
                case 15: goto L_0x0455;
                case 16: goto L_0x043e;
                case 17: goto L_0x0427;
                case 18: goto L_0x03f6;
                case 19: goto L_0x03d1;
                case 20: goto L_0x03b4;
                case 21: goto L_0x00ac;
                case 22: goto L_0x0382;
                case 23: goto L_0x0371;
                case 24: goto L_0x0353;
                case 25: goto L_0x033c;
                case 26: goto L_0x0329;
                case 27: goto L_0x005b;
                case 28: goto L_0x004a;
                case 29: goto L_0x0319;
                case 30: goto L_0x02e9;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r2 = r11.A02
            X.ALe r2 = (X.C20441ALe) r2
            int r1 = r11.A01
            java.lang.Object r4 = r11.A03
            android.view.View r4 = (android.view.View) r4
            r0 = 2
            int r10 = r2.A02
            X.C20441ALe.A00(r2, r0, r10, r1)
            X.9z0 r5 = X.C20441ALe.A0C
            android.content.Context r6 = r2.A03
            X.1L9 r7 = r2.A04
            switch(r1) {
                case 2: goto L_0x0048;
                case 3: goto L_0x0046;
                case 4: goto L_0x0044;
                case 5: goto L_0x0042;
                case 6: goto L_0x0040;
                case 7: goto L_0x003d;
                default: goto L_0x001f;
            }
        L_0x001f:
            r9 = 1
        L_0x0020:
            X.1NP r3 = r2.A05
            android.content.SharedPreferences r2 = r3.A07()
            java.lang.String r0 = "backup_last_threshold_crossed"
            r1 = 0
            int r0 = r2.getInt(r0, r1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r5.A01(r6, r7, r8, r9, r10)
            r0 = 8
            r4.setVisibility(r0)
            r3.A0C(r1)
        L_0x003c:
            return
        L_0x003d:
            r9 = 8
            goto L_0x0020
        L_0x0040:
            r9 = 7
            goto L_0x0020
        L_0x0042:
            r9 = 6
            goto L_0x0020
        L_0x0044:
            r9 = 4
            goto L_0x0020
        L_0x0046:
            r9 = 3
            goto L_0x0020
        L_0x0048:
            r9 = 2
            goto L_0x0020
        L_0x004a:
            java.lang.Object r2 = r11.A02
            X.5nJ r2 = (X.C113575nJ) r2
            java.lang.Object r1 = r11.A03
            X.6yE r1 = (X.C139106yE) r1
            int r7 = r11.A01
            java.util.List r0 = X.C42011xT.A0I
            X.6f3 r0 = r2.A01
            com.whatsapp.jid.UserJid r6 = r1.A02
            goto L_0x006b
        L_0x005b:
            java.lang.Object r2 = r11.A02
            X.5nJ r2 = (X.C113575nJ) r2
            java.lang.Object r1 = r11.A03
            X.6hS r1 = (X.C129226hS) r1
            int r7 = r11.A01
            java.util.List r0 = X.C42011xT.A0I
            X.6f3 r0 = r2.A01
            com.whatsapp.jid.UserJid r6 = r1.A02
        L_0x006b:
            X.6p9 r0 = r0.A01
            r3 = 0
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r5 = r0.A02
            X.5jJ r4 = r5.A0T
            if (r4 == 0) goto L_0x0082
            r0 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0 = 1
            r4.A0W(r6, r2, r1, r0)
        L_0x0082:
            X.00H r0 = r5.A0m
            if (r0 == 0) goto L_0x04f7
            r0.get()
            X.1FL r1 = r5.A1D()
            r0 = 1
            android.content.Intent r2 = X.AnonymousClass1LU.A0j(r1, r6, r0, r3, r0)
            X.00H r0 = r5.A0X
            if (r0 == 0) goto L_0x04f4
            java.lang.Object r1 = r0.get()
            X.1L9 r1 = (X.AnonymousClass1L9) r1
            r0 = 5
            boolean r0 = X.AnonymousClass1L9.A07(r2, r5, r0)
            if (r0 != 0) goto L_0x003c
            X.1KB r1 = r1.A01
            r0 = 2131886448(0x7f120170, float:1.9407475E38)
            r1.A08(r0, r3)
            return
        L_0x00ac:
            java.lang.Object r2 = r11.A02
            X.5n7 r2 = (X.C113455n7) r2
            java.lang.Object r1 = r11.A03
            X.6s7 r1 = (X.C135386s7) r1
            java.util.List r0 = X.C42011xT.A0I
            X.85W r6 = r2.A08
            X.2Dk r5 = r1.A02
            X.7KN r6 = (X.AnonymousClass7KN) r6
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.A00
            long r3 = r3 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r2 = X.C108975cc.A19(r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A00 = r0
            if (r2 != 0) goto L_0x003c
            X.1ki r0 = r6.A02
            r0.Bz7(r5)
            return
        L_0x00d9:
            java.lang.Object r1 = r11.A02
            X.5fx r1 = (X.C110495fx) r1
            int r7 = r11.A01
            java.lang.Object r0 = r11.A03
            X.4FM r0 = (X.AnonymousClass4FM) r0
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r1 = r1.A04
            if (r1 == 0) goto L_0x003c
            X.4Cs r4 = X.C82934Cs.CONTACT
            X.1E7 r5 = r0.A00
            r2 = 0
            r6 = r2
            r3 = r2
            r1.A0U(r2, r3, r4, r5, r6, r7)
            return
        L_0x00f2:
            java.lang.Object r4 = r11.A02
            X.3Ov r4 = (X.C73063Ov) r4
            java.lang.Object r5 = r11.A03
            android.view.View r5 = (android.view.View) r5
            int r3 = r11.A01
            java.lang.Object r1 = r5.getTag()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            com.whatsapp.jid.UserJid r6 = r4.A00
            boolean r0 = r1.equals(r6)
            r2 = 0
            if (r0 != 0) goto L_0x0155
            r4.A00 = r1
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r4.A02
            java.util.List r0 = r0.A0b
            java.lang.Object r0 = r0.get(r3)
            X.4Ua r0 = (X.C87034Ua) r0
            int r1 = r0.A00()
            r0 = 5
            if (r1 == r0) goto L_0x0155
            r0 = 1
            X.C73063Ov.A01(r5, r4, r3, r0)
        L_0x0122:
            if (r6 == 0) goto L_0x003c
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = r4.A02
            android.widget.ListView r0 = r1.A02
            android.view.View r5 = r0.findViewWithTag(r6)
            java.util.List r3 = r1.A0b
            java.util.Iterator r2 = r3.iterator()
        L_0x0132:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r1 = r2.next()
            X.4Ua r1 = (X.C87034Ua) r1
            com.whatsapp.jid.UserJid r0 = r1.A02
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0132
        L_0x0146:
            if (r5 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x003c
            int r1 = r3.indexOf(r1)
            r0 = 0
            X.C73063Ov.A01(r5, r4, r1, r0)
            return
        L_0x0153:
            r1 = 0
            goto L_0x0146
        L_0x0155:
            r4.A00 = r2
            goto L_0x0122
        L_0x0158:
            java.lang.Object r3 = r11.A02
            X.9t8 r3 = (X.C195309t8) r3
            java.lang.Object r2 = r11.A03
            X.3uP r2 = (X.AnonymousClass3uP) r2
            int r1 = r11.A01
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x003c
            X.4Pl r0 = r2.A2u
            r0.A00(r3, r1)
            return
        L_0x016c:
            java.lang.Object r0 = r11.A02
            com.whatsapp.conversation.conversationrow.DynamicButtonsLayout r0 = (com.whatsapp.conversation.conversationrow.DynamicButtonsLayout) r0
            int r3 = r11.A01
            java.lang.Object r2 = r11.A03
            X.4Pl r2 = (X.C85934Pl) r2
            java.util.List r1 = r0.A03
            java.lang.Object r0 = r1.get(r3)
            X.9t8 r0 = (X.C195309t8) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x003c
            java.lang.Object r0 = r1.get(r3)
            X.9t8 r0 = (X.C195309t8) r0
            r2.A00(r0, r3)
            return
        L_0x018c:
            java.lang.Object r6 = r11.A02
            X.6nw r6 = (X.C132966nw) r6
            java.lang.Object r4 = r11.A03
            X.01C r4 = (X.AnonymousClass01C) r4
            int r3 = r11.A01
            r5 = 0
            X.11E r0 = r6.A01
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0526
            X.0ve r2 = r6.A02
            r1 = 11774(0x2dfe, float:1.6499E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0501
            X.00H r0 = r6.A04
            java.lang.Object r1 = r0.get()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "calllink"
            java.lang.Object r0 = r1.get(r0)
            X.2Zk r0 = (X.C51732Zk) r0
            if (r0 == 0) goto L_0x003c
            X.1KB r0 = r0.A00
            X.1FR r4 = r0.A00
            if (r4 == 0) goto L_0x003c
            com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet r3 = new com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet
            r3.<init>()
            r0 = 1
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            java.lang.String r1 = "invoke_from_chat"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.AnonymousClass1D6.A03(r1, r0, r2, r5)
            X.AnonymousClass3MX.A1I(r3, r2)
            java.lang.String r0 = "CreateCallLinkBottomSheet"
            r4.CMk(r3, r0)
            return
        L_0x01dd:
            java.lang.Object r0 = r11.A02
            X.5kg r0 = (X.C111945kg) r0
            java.lang.Object r4 = r11.A03
            X.6dh r4 = (X.C127036dh) r4
            int r2 = r11.A01
            X.6bN r3 = r0.A01
            if (r4 == 0) goto L_0x0201
            X.1DT r0 = r4.A01
            java.lang.Object r1 = r0.A06()
            if (r1 == 0) goto L_0x0201
            X.6R5 r0 = X.AnonymousClass6R5.DISPLAY_IMAGE_SELECTED
            if (r1 == r0) goto L_0x01fb
            X.6R5 r0 = X.AnonymousClass6R5.DISPLAY_IMAGE_NOT_SELECTED
            if (r1 != r0) goto L_0x0201
        L_0x01fb:
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r0 = r3.A00
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet.A0B(r0, r4, r2)
            return
        L_0x0201:
            r2 = 0
            if (r4 == 0) goto L_0x0218
            X.1DT r0 = r4.A01
            java.lang.Object r1 = r0.A06()
        L_0x020a:
            X.6R5 r0 = X.AnonymousClass6R5.LOAD_MORE
            if (r1 != r0) goto L_0x003c
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r0 = r3.A00
            X.5jD r4 = r0.A0J
            if (r4 != 0) goto L_0x021a
            X.AnonymousClass3MW.A1H()
            throw r2
        L_0x0218:
            r1 = r2
            goto L_0x020a
        L_0x021a:
            X.6jC r0 = X.C111225jD.A03(r4)
            if (r0 == 0) goto L_0x003c
            java.lang.String r3 = r0.A02
            X.1DT r2 = r4.A0H
            java.lang.Number r0 = X.C108945cZ.A1C(r2)
            r1 = 0
            if (r0 != 0) goto L_0x022f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x022f:
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x052f
            X.C111225jD.A0B(r4, r3, r0, r1)
            X.AnonymousClass3MX.A1K(r2, r1)
            return
        L_0x023c:
            java.lang.Object r7 = r11.A02
            X.3Wq r7 = (X.C73613Wq) r7
            java.lang.Object r4 = r11.A03
            X.3ZR r4 = (X.AnonymousClass3ZR) r4
            int r5 = r11.A01
            r3 = 0
            X.3Wq r2 = r4.A06     // Catch:{ JSONException -> 0x0259 }
            org.json.JSONArray r1 = r2.A0B     // Catch:{ JSONException -> 0x0259 }
            int r0 = r4.A05()     // Catch:{ JSONException -> 0x0259 }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0259 }
            java.lang.String r0 = r2.A05     // Catch:{ JSONException -> 0x0259 }
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x0259 }
        L_0x0259:
            if (r3 != 0) goto L_0x003c
            org.json.JSONArray r0 = r7.A0B     // Catch:{ JSONException -> 0x0287 }
            org.json.JSONObject r6 = r0.getJSONObject(r5)     // Catch:{ JSONException -> 0x0287 }
            X.1GV r5 = r7.A02     // Catch:{ JSONException -> 0x0287 }
            if (r5 == 0) goto L_0x0291
            java.util.HashMap r3 = X.C17880vN.A11()     // Catch:{ JSONException -> 0x0287 }
            java.util.Iterator r2 = r6.keys()     // Catch:{ JSONException -> 0x0287 }
        L_0x026d:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x0287 }
            if (r0 == 0) goto L_0x0283
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ JSONException -> 0x0287 }
            java.lang.Object r0 = r6.get(r1)     // Catch:{ JSONException -> 0x0287 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0287 }
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0287 }
            goto L_0x026d
        L_0x0283:
            r5.accept(r3)     // Catch:{ JSONException -> 0x0287 }
            goto L_0x0291
        L_0x0287:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WaListViewBinder/SingleTextSelectionAdapter/notifyPositionTapped : "
            X.C108995ce.A1M(r0, r1, r2)
        L_0x0291:
            r3 = 0
            X.3Wq r2 = r4.A06     // Catch:{ JSONException -> 0x02a4 }
            org.json.JSONArray r1 = r2.A0B     // Catch:{ JSONException -> 0x02a4 }
            int r0 = r4.A05()     // Catch:{ JSONException -> 0x02a4 }
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x02a4 }
            java.lang.String r0 = r2.A05     // Catch:{ JSONException -> 0x02a4 }
            boolean r3 = r1.optBoolean(r0, r3)     // Catch:{ JSONException -> 0x02a4 }
        L_0x02a4:
            if (r3 != 0) goto L_0x003c
            X.3Wq r2 = r4.A06
            int r1 = r2.A00
            int r0 = r4.A05()
            if (r1 == r0) goto L_0x003c
            r2.A0G(r1)
            int r0 = r4.A05()
            r2.A00 = r0
            r2.A0G(r0)
            return
        L_0x02bd:
            java.lang.Object r5 = r11.A02
            android.app.Activity r5 = (android.app.Activity) r5
            java.lang.Object r4 = r11.A03
            X.00H r4 = (X.AnonymousClass00H) r4
            r3 = 101(0x65, float:1.42E-43)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.dialer.DialerActivity"
            r2.setClassName(r1, r0)
            r5.startActivityForResult(r2, r3)
            java.lang.Object r3 = r4.get()
            X.9oZ r3 = (X.C192539oZ) r3
            java.lang.Integer r2 = X.C17880vN.A0m()
            java.lang.Integer r1 = X.C17880vN.A0h()
            r0 = 12
            goto L_0x0522
        L_0x02e9:
            java.lang.Object r5 = r11.A02
            X.5ks r5 = (X.C112065ks) r5
            java.lang.Object r4 = r11.A03
            int r3 = r11.A01
            java.util.HashMap r0 = r5.A00
            r0.remove(r4)
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r1 = r5.A02
            X.1pJ r0 = r1.A0A
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x030c
            X.1KB r2 = r1.A05
            r1 = 2
            X.7Qy r0 = new X.7Qy
            r0.<init>(r5, r3, r1, r4)
            r2.A0J(r0)
            return
        L_0x030c:
            X.10I r2 = r1.A05
            r1 = 43
            X.7RD r0 = new X.7RD
            r0.<init>(r5, r4, r1)
            r2.CGN(r0)
            return
        L_0x0319:
            java.lang.Object r0 = r11.A02
            X.5lF r0 = (X.C112295lF) r0
            java.lang.Object r2 = r11.A03
            X.725 r2 = (X.AnonymousClass725) r2
            int r1 = r11.A01
            com.whatsapp.stickers.store.StickerStoreTabFragment r0 = r0.A01
            r0.A28(r2, r1)
            return
        L_0x0329:
            java.lang.Object r4 = r11.A02
            X.47Z r4 = (X.AnonymousClass47Z) r4
            java.lang.Object r3 = r11.A03
            X.47S r3 = (X.AnonymousClass47S) r3
            int r2 = r11.A01
            X.4Mx r1 = r4.A01
            r0 = 0
            r1.A00 = r0
            X.AnonymousClass47Z.A00(r3, r4, r2)
            return
        L_0x033c:
            java.lang.Object r4 = r11.A02
            X.478 r4 = (X.AnonymousClass478) r4
            java.lang.Object r3 = r11.A03
            X.47S r3 = (X.AnonymousClass47S) r3
            int r2 = r11.A01
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.4QK r1 = r4.A02
            r0 = 0
            r1.A00 = r0
            X.AnonymousClass478.A00(r4, r3, r2)
            return
        L_0x0353:
            int r3 = r11.A01
            java.lang.Object r2 = r11.A02
            X.6cb r2 = (X.C126356cb) r2
            java.lang.Object r1 = r11.A03
            X.6cc r1 = (X.C126366cc) r1
            r0 = 117(0x75, float:1.64E-43)
            if (r0 != r3) goto L_0x0369
            X.5jU r1 = r2.A00
            java.util.List r0 = X.C42011xT.A0I
            r1.A0f()
            return
        L_0x0369:
            X.5jU r1 = r1.A00
            java.util.List r0 = X.C42011xT.A0I
            r1.A0i(r3)
            return
        L_0x0371:
            java.lang.Object r2 = r11.A02
            X.1rD r2 = (X.C38391rD) r2
            java.lang.Object r1 = r11.A03
            java.util.List r1 = (java.util.List) r1
            int r0 = r11.A01
            r1.remove(r0)
            r2.A0I(r0)
            return
        L_0x0382:
            java.lang.Object r2 = r11.A02
            X.5n7 r2 = (X.C113455n7) r2
            java.lang.Object r1 = r11.A03
            X.6s7 r1 = (X.C135386s7) r1
            java.util.List r0 = X.C42011xT.A0I
            X.85W r6 = r2.A08
            X.2Dk r5 = r1.A02
            X.7KN r6 = (X.AnonymousClass7KN) r6
            androidx.recyclerview.widget.RecyclerView r0 = r6.A01
            X.1qy r0 = r0.getLayoutManager()
            java.lang.ref.WeakReference r4 = X.AnonymousClass3MW.A0z(r0)
            X.5kF r0 = r6.A05
            java.lang.ref.WeakReference r3 = X.AnonymousClass3MW.A0z(r0)
            X.5l0 r0 = r6.A04
            java.lang.ref.WeakReference r2 = X.AnonymousClass3MW.A0z(r0)
            r0 = 3
            X.4sG r1 = new X.4sG
            r1.<init>(r2, r4, r3, r0)
            X.1ki r0 = r6.A02
            r0.Bw8(r5, r1)
            return
        L_0x03b4:
            java.lang.Object r0 = r11.A02
            X.3ZB r0 = (X.AnonymousClass3ZB) r0
            java.lang.Object r3 = r11.A03
            X.3X4 r3 = (X.AnonymousClass3X4) r3
            int r2 = r11.A01
            com.whatsapp.TriStateCheckBox r0 = r0.A02
            r0.performClick()
            java.util.ArrayList r1 = r3.A00
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.set(r2, r0)
            X.0vk r0 = r3.A04
            goto L_0x03f2
        L_0x03d1:
            java.lang.Object r0 = r11.A02
            X.3ZA r0 = (X.AnonymousClass3ZA) r0
            java.lang.Object r4 = r11.A03
            X.3X4 r4 = (X.AnonymousClass3X4) r4
            int r3 = r11.A01
            r1 = 1
            com.whatsapp.components.SelectionCheckView r2 = r0.A02
            boolean r0 = r2.A0D
            r0 = r0 ^ 1
            r2.A04(r0, r1)
            java.util.ArrayList r1 = r4.A00
            boolean r0 = r2.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.set(r3, r0)
            X.0vk r0 = r4.A04
        L_0x03f2:
            r0.invoke()
            return
        L_0x03f6:
            java.lang.Object r2 = r11.A02
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment r2 = (com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment) r2
            java.lang.Object r3 = r11.A03
            int r5 = r11.A01
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            java.util.ArrayList r0 = r2.A0F
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 == 0) goto L_0x0419
            X.10I r0 = r2.A09
            if (r0 == 0) goto L_0x04fa
            r6 = 26
            X.Aiu r1 = new X.Aiu
            r1.<init>(r2, r3, r4, r5, r6)
            r0.CGN(r1)
            return
        L_0x0419:
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            java.lang.String r0 = X.AnonymousClass3MY.A0n(r2, r0)
            com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment.A00(r2, r0)
            r2.A29()
            return
        L_0x0427:
            java.lang.Object r4 = r11.A02
            X.65O r4 = (X.AnonymousClass65O) r4
            java.lang.Object r3 = r11.A03
            X.5mW r3 = (X.C113085mW) r3
            int r2 = r11.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = r4.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.gallery.IMultipleMediaSelection"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r1 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r1
            X.AnonymousClass65O.A01(r3, r4, r1, r2)
            return
        L_0x043e:
            java.lang.Object r4 = r11.A02
            X.65M r4 = (X.AnonymousClass65M) r4
            java.lang.Object r3 = r11.A03
            X.5mW r3 = (X.C113085mW) r3
            int r2 = r11.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r1 = r4.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.gallery.IMultipleMediaSelection"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r1 = (com.whatsapp.storage.StorageUsageMediaGalleryFragment) r1
            X.AnonymousClass65M.A01(r3, r4, r1, r2)
            return
        L_0x0455:
            java.lang.Object r2 = r11.A02
            X.5zu r2 = (X.C117505zu) r2
            int r1 = r11.A01
            java.lang.Object r3 = r11.A03
            X.5zw r3 = (X.C117525zw) r3
            java.util.List r0 = X.C42011xT.A0I
            X.1OS r2 = r2.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int[] r0 = r3.A04
            r2.invoke(r1, r0)
            return
        L_0x046d:
            java.lang.Object r1 = r11.A02
            X.5zt r1 = (X.C117495zt) r1
            int r3 = r11.A01
            java.lang.Object r2 = r11.A03
            java.util.List r0 = X.C42011xT.A0I
            X.1OS r1 = r1.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.invoke(r0, r2)
            return
        L_0x0481:
            java.lang.Object r0 = r11.A02
            X.2D6 r0 = (X.AnonymousClass2D6) r0
            java.lang.Object r5 = r11.A03
            X.1BI r5 = (X.AnonymousClass1BI) r5
            int r6 = r11.A01
            X.1jm r1 = r0.A03
            X.1xZ r3 = r0.A06
            android.widget.ImageView r2 = r3.A04
            r7 = -1
            r4 = r3
            r1.Bow(r2, r3, r4, r5, r6, r7)
            return
        L_0x0497:
            java.lang.Object r2 = r11.A02
            X.3Q5 r2 = (X.AnonymousClass3Q5) r2
            java.lang.Object r1 = r11.A03
            X.5Wr r1 = (X.C106655Wr) r1
            int r0 = r11.A01
            X.AnonymousClass3Q5.setData$lambda$2$lambda$0(r2, r1, r0, r12)
            return
        L_0x04a5:
            java.lang.Object r3 = r11.A02
            X.1Ps r3 = (X.C25811Ps) r3
            java.lang.Object r2 = r11.A03
            X.1FU r2 = (X.AnonymousClass1FU) r2
            r1 = 4
            java.lang.Integer r0 = X.C17880vN.A0j()
            r3.A08(r2, r0, r1)
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.6bL r0 = (X.C125596bL) r0
            X.1rr r0 = r0.A00
            r2 = 1
            android.content.SharedPreferences r0 = X.C38771rr.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "bot_contact_picker_new_badge_seen_forever"
            X.C17880vN.A1F(r1, r0, r2)
            r0 = 2131427689(0x7f0b0169, float:1.8477001E38)
            android.view.View r0 = r12.findViewById(r0)
            X.C72453Mb.A1D(r0)
            return
        L_0x04d8:
            java.lang.Object r4 = r11.A02
            X.ALe r4 = (X.C20441ALe) r4
            int r3 = r11.A01
            java.lang.Object r2 = r11.A03
            android.view.View r2 = (android.view.View) r2
            r1 = 3
            int r0 = r4.A02
            X.C20441ALe.A00(r4, r1, r0, r3)
            r0 = 8
            r2.setVisibility(r0)
            X.1NP r1 = r4.A05
            r0 = 0
            r1.A0C(r0)
            return
        L_0x04f4:
            java.lang.String r0 = "activityUtils"
            goto L_0x04fc
        L_0x04f7:
            java.lang.String r0 = "waIntents"
            goto L_0x04fc
        L_0x04fa:
            java.lang.String r0 = "waWorkers"
        L_0x04fc:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0501:
            X.00H r0 = r6.A05
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.calllink.view.CallLinkActivity"
            r2.setClassName(r1, r0)
            r4.startActivityForResult(r2, r3)
            X.00H r0 = r6.A03
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.9oZ r3 = (X.C192539oZ) r3
            java.lang.Integer r2 = X.C17880vN.A0m()
            r1 = 0
            r0 = 14
        L_0x0522:
            r3.A01(r2, r1, r0)
            return
        L_0x0526:
            X.1KB r1 = r6.A00
            r0 = 2131887665(0x7f120631, float:1.9409944E38)
            r1.A08(r0, r5)
            return
        L_0x052f:
            r0 = 1
            X.C111225jD.A0B(r4, r3, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78T.onClick(android.view.View):void");
    }

    public AnonymousClass78T(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public AnonymousClass78T(AnonymousClass1FU r2, C25811Ps r3) {
        this.A00 = 4;
        this.A02 = r3;
        this.A03 = r2;
        this.A01 = 4;
    }
}
