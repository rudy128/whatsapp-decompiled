package X;

/* renamed from: X.7AP  reason: invalid class name */
public class AnonymousClass7AP implements C22851Dl {
    public final int A00;
    public final Object A01;

    public AnonymousClass7AP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1F9 r1, AnonymousClass1DS r2, int i) {
        r2.A0A(r1, new AnonymousClass7AP(r1, i));
    }

    public static void A01(AnonymousClass1DS r1, C22801Dg r2, Object obj, int i) {
        r2.A0H(r1, new AnonymousClass7AP(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v134, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0086, code lost:
        if (X.C72463Mc.A1O(r4.A0t.A09) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0335, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0339, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x043e, code lost:
        r2.A08(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0442, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0538, code lost:
        if (r14.isEmpty() != false) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0714, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0725, code lost:
        r0 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0727, code lost:
        r0.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x072a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x07ef, code lost:
        r3 = r14.BNt();
        r2 = r14.BNZ();
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x07f8, code lost:
        if (r3 == null) goto L_0x0802;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x07fa, code lost:
        r0 = r3.A01;
        r1 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07fe, code lost:
        r4.CMc(r1, r2, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0801, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0802, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a8, code lost:
        r4 = r0.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01aa, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ac, code lost:
        if (r14 != null) goto L_0x07ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ae, code lost:
        r4.BIq(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b1, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:499:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x03d6;
                case 1: goto L_0x039b;
                case 2: goto L_0x0787;
                case 3: goto L_0x0772;
                case 4: goto L_0x0766;
                case 5: goto L_0x072b;
                case 6: goto L_0x038b;
                case 7: goto L_0x0717;
                case 8: goto L_0x0709;
                case 9: goto L_0x06fb;
                case 10: goto L_0x06f0;
                case 11: goto L_0x06e5;
                case 12: goto L_0x06db;
                case 13: goto L_0x06d1;
                case 14: goto L_0x06c8;
                case 15: goto L_0x0346;
                case 16: goto L_0x06c2;
                case 17: goto L_0x064d;
                case 18: goto L_0x02a5;
                case 19: goto L_0x063b;
                case 20: goto L_0x020c;
                case 21: goto L_0x01de;
                case 22: goto L_0x0317;
                case 23: goto L_0x0635;
                case 24: goto L_0x05b8;
                case 25: goto L_0x054b;
                case 26: goto L_0x01c6;
                case 27: goto L_0x053f;
                case 28: goto L_0x01b2;
                case 29: goto L_0x01a1;
                case 30: goto L_0x018e;
                case 31: goto L_0x0529;
                case 32: goto L_0x051f;
                case 33: goto L_0x0515;
                case 34: goto L_0x017c;
                case 35: goto L_0x0103;
                case 36: goto L_0x04fd;
                case 37: goto L_0x00cd;
                case 38: goto L_0x00a2;
                case 39: goto L_0x04f0;
                case 40: goto L_0x0096;
                case 41: goto L_0x04e8;
                case 42: goto L_0x04dc;
                case 43: goto L_0x008d;
                case 44: goto L_0x0489;
                case 45: goto L_0x044d;
                case 46: goto L_0x0443;
                case 47: goto L_0x0048;
                case 48: goto L_0x041c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r6 = (com.whatsapp.voipcalling.VoipActivityV2) r6
            boolean r0 = r6.A2E
            if (r0 != 0) goto L_0x0416
            X.3Rj r5 = X.AnonymousClass4a6.A00(r6)
            r0 = 2131895460(0x7f1224a4, float:1.9425754E38)
            r5.A0E(r0)
            r4 = 2131895459(0x7f1224a3, float:1.9425752E38)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1a()
            X.0ve r2 = r6.A0E
            r1 = 3694(0xe6e, float:5.176E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            X.AnonymousClass000.A1L(r3, r0)
            java.lang.String r0 = r6.getString(r4, r3)
            r5.A0S(r0)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 0
            X.7AL r0 = new X.7AL
            r0.<init>(r1)
            r5.A0g(r6, r0, r2)
            X.05w r1 = r5.create()
            java.lang.String r0 = "ScreenShareStoppedMaxParticipantsDialog"
            r6.A4f(r1, r0)
        L_0x0047:
            return
        L_0x0048:
            java.lang.Object r4 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r4)
            if (r3 == 0) goto L_0x0073
            X.0ve r2 = r4.A0E
            r1 = 4773(0x12a5, float:6.688E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0063
            com.whatsapp.voipcalling.VoipActivityV2.A1L(r3, r4)
        L_0x0063:
            r4.CQl(r3)
            boolean r0 = r3.videoEnabled
            boolean r1 = X.AnonymousClass000.A1O(r0)
            int r0 = r3.getConnectedParticipantsCount()
            com.whatsapp.voipcalling.VoipActivityV2.A1i(r4, r0, r1)
        L_0x0073:
            X.8At r2 = r4.A0n
            if (r2 == 0) goto L_0x0047
            boolean r0 = r14.booleanValue()
            if (r0 != 0) goto L_0x0088
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r4.A0t
            X.1vp r0 = r0.A09
            boolean r1 = X.C72463Mc.A1O(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            r2.C50(r0)
            return
        L_0x008d:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.5al r14 = (X.C107875al) r14
            r5 = 1
            goto L_0x01a8
        L_0x0096:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.8At r0 = r0.A0n
            if (r0 == 0) goto L_0x0047
            r0.BlA()
            return
        L_0x00a2:
            java.lang.Object r4 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            X.1L9 r3 = r4.A01
            X.00H r0 = r4.A1z
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsDataUsageActivity"
            r2.setClassName(r1, r0)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r2.addFlags(r0)
            r3.A08(r4, r2)
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A23(r4)
            if (r0 == 0) goto L_0x0047
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r4)
            com.whatsapp.voipcalling.VoipActivityV2.A1y(r0, r4)
            return
        L_0x00cd:
            java.lang.Object r2 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.util.List r14 = (java.util.List) r14
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r2.A1b
            if (r0 == 0) goto L_0x0047
            int r1 = r14.size()
            r0 = 1
            if (r1 != r0) goto L_0x00f8
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r2.A1b
            java.lang.Object r0 = X.C108955ca.A0p(r14)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.3WN r1 = r1.A0L
            if (r1 == 0) goto L_0x0047
            r1.A08 = r0
            if (r0 == 0) goto L_0x0047
            int r0 = r1.A0X(r0)
            if (r0 < 0) goto L_0x0047
            X.AnonymousClass3WN.A00(r1, r0)
            return
        L_0x00f8:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r2.A1b
            X.73c r1 = r0.A0K
            if (r1 == 0) goto L_0x0047
            r0 = 3
            X.C1407973c.A01(r1, r0)
            return
        L_0x0103:
            java.lang.Object r5 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            X.Bym r14 = (X.C24289Bym) r14
            int r1 = r14.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0169
            r0 = 1
            if (r1 == r0) goto L_0x014f
            r0 = 2
            if (r1 == r0) goto L_0x013a
            r0 = 3
            if (r1 != r0) goto L_0x0047
            java.lang.String r0 = "VoipActivityV2Displaying banner on status text update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8At r0 = r5.A0n
            if (r0 == 0) goto L_0x0047
            X.6zg r0 = r0.BZh()
            if (r0 == 0) goto L_0x0047
            X.4ZN r4 = r0.A02
            if (r4 == 0) goto L_0x0047
            android.graphics.Bitmap r3 = r0.A00
            if (r3 == 0) goto L_0x0047
            X.8Au r2 = r5.A0p
            X.4ZN r1 = r0.A01
            java.lang.Integer r0 = r0.A03
            r2.CMt(r3, r4, r1, r0)
            return
        L_0x013a:
            java.lang.String r0 = "VoipActivityV2Displaying bottom sheet for glasses first init"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8At r0 = r5.A0n
            if (r0 == 0) goto L_0x0047
            com.whatsapp.glasses.SUPBottomSheetView r1 = r0.BNe()
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "glasses_bottom_sheet"
            r5.A4h(r1, r0)
            return
        L_0x014f:
            java.lang.String r0 = "VoipActivityV2Querying user for Bluetooth permissions."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8At r0 = r5.A0n
            if (r0 == 0) goto L_0x0047
            com.whatsapp.base.WaFragment r2 = r0.BNY()
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r5)
            java.lang.String r0 = "permission_request"
            r1.A0B(r2, r0)
            r1.A04()
            return
        L_0x0169:
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r5)
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A1z(r0, r5)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "VoipActivityV2Showing call controls due to glasses event"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.VoipActivityV2.A28(r5)
            return
        L_0x017c:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            if (r14 == 0) goto L_0x0047
            X.1bI r1 = r0.A1V
            if (r1 == 0) goto L_0x0047
            android.view.View r0 = r1.A00
            if (r0 != 0) goto L_0x0047
            r1.A02()
            return
        L_0x018e:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            r1 = 1
            r0.A2M = r1
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r0.A1b
            if (r0 == 0) goto L_0x0047
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0T
            if (r0 == 0) goto L_0x0047
            r0.setToggleVideoButtonSelected(r1)
            return
        L_0x01a1:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.5al r14 = (X.C107875al) r14
            r5 = 0
        L_0x01a8:
            X.8Au r4 = r0.A0p
            if (r4 == 0) goto L_0x0047
            if (r14 != 0) goto L_0x07ef
            r4.BIq(r5)
            return
        L_0x01b2:
            java.lang.Object r3 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r3)
            if (r2 == 0) goto L_0x0047
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0047
            com.whatsapp.voipcalling.VoipActivityV2.A1x(r2, r3)
            return
        L_0x01c6:
            java.lang.Object r1 = r13.A01
            X.1FL r1 = (X.AnonymousClass1FL) r1
            boolean r0 = X.AnonymousClass000.A1Y(r14)
            if (r0 == 0) goto L_0x0047
            X.1GP r1 = r1.getSupportFragmentManager()
            int r0 = r1.A0K()
            if (r0 <= 0) goto L_0x0047
            r1.A0b()
            return
        L_0x01de:
            java.lang.Object r1 = r13.A01
            X.7Mv r1 = (X.C145847Mv) r1
            X.C18070vi.A0h(r1, r14)
            boolean r0 = r14 instanceof X.AnonymousClass6Iu
            if (r0 != 0) goto L_0x0202
            boolean r0 = r14 instanceof X.AnonymousClass6Iw
            if (r0 == 0) goto L_0x01fa
            X.88G r0 = r1.A0H
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r0
            com.whatsapp.WaImageButton r1 = r0.A05
            r0 = 2131232161(0x7f0805a1, float:1.8080423E38)
        L_0x01f6:
            r1.setImageResource(r0)
            return
        L_0x01fa:
            boolean r0 = r14 instanceof X.AnonymousClass6Iv
            if (r0 != 0) goto L_0x0202
            boolean r0 = r14 instanceof X.C121256It
            if (r0 == 0) goto L_0x0047
        L_0x0202:
            X.88G r0 = r1.A0H
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r0 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r0
            com.whatsapp.WaImageButton r1 = r0.A05
            r0 = 2131232218(0x7f0805da, float:1.808054E38)
            goto L_0x01f6
        L_0x020c:
            java.lang.Object r3 = r13.A01
            X.6CF r3 = (X.AnonymousClass6CF) r3
            java.util.List r0 = r3.A0E
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0047
            java.util.List r0 = r3.A0E
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0047
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x0047
            java.util.List r1 = r3.A0E
            java.lang.String r0 = "contextual_suggestion"
            X.7Kl r1 = X.AnonymousClass6CF.A00(r0, r1)
            boolean r0 = X.AnonymousClass6CF.A02(r3)
            r2 = 0
            if (r0 == 0) goto L_0x023d
            if (r1 == 0) goto L_0x0804
            androidx.recyclerview.widget.RecyclerView r0 = r1.A04
            if (r0 == 0) goto L_0x0047
            r1.A01()
            return
        L_0x023d:
            if (r1 == 0) goto L_0x0047
            int r0 = r3.A03()
            r5 = 1
            boolean r7 = X.AnonymousClass000.A1P(r0)
            java.util.List r0 = r3.A0E
            r0.remove(r1)
            X.AnonymousClass6CF.A01(r3)
            int r1 = r3.A03()
            if (r1 >= 0) goto L_0x0292
            java.util.Locale r6 = java.util.Locale.US
            r0 = 4
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.util.List r0 = r3.A0E
            X.C108985cd.A1S(r0, r4, r2)
            X.5rK r1 = r3.A06
            boolean r0 = X.AnonymousClass000.A1X(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4[r5] = r0
            if (r1 == 0) goto L_0x02a3
            X.89I[] r0 = r1.A01
            int r0 = r0.length
        L_0x0271:
            X.AnonymousClass3Ma.A1S(r4, r0)
            androidx.viewpager.widget.ViewPager r0 = r3.A07
            int r0 = r0.getCurrentItem()
            X.C17890vO.A1G(r4, r0)
            java.lang.String r0 = "stickerPages.size(): %d, stickerPagerAdapter == null: %s, stickerPagerAdapter.getCount(): %d, viewPager.getCurrentItem(): %d"
            java.lang.String r4 = java.lang.String.format(r6, r0, r4)
            X.190 r0 = r3.A0R
            java.lang.String r1 = "StickerPicker/maybeUpdateContextualStickerPage/getCurrentPageIndex < 0 - "
            r0.A0G(r1, r4, r5)
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0f(r1, r4, r0)
            r1 = 0
        L_0x0292:
            java.util.List r0 = r3.A0E
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0047
            r3.A05(r1, r2)
            if (r7 == 0) goto L_0x0047
            r3.A04(r1)
            return
        L_0x02a3:
            r0 = 0
            goto L_0x0271
        L_0x02a5:
            java.lang.Object r4 = r13.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r4 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r4
            X.77K r14 = (X.AnonymousClass77K) r14
            r0 = 1
            X.C18070vi.A0d(r14, r0)
            X.6pz r1 = r4.A0F
            java.lang.String r0 = "shareSheetController"
            if (r1 == 0) goto L_0x0335
            int r2 = r14.A00
            r1.A01(r2)
            X.6pz r1 = r4.A0F
            if (r1 == 0) goto L_0x0335
            r0 = 2
            if (r2 != r0) goto L_0x02f8
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r3 = r1.A02
            X.6uR r2 = r1.A03
            android.content.Context r1 = r1.A01
            java.util.List r0 = r14.A02
            java.lang.String r1 = r2.A02(r1, r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.C108965cb.A1Y(r3)
            if (r0 == 0) goto L_0x02f5
            com.whatsapp.WaTextView r0 = r3.A0A
        L_0x02d9:
            if (r0 == 0) goto L_0x02de
            r0.setText(r1)
        L_0x02de:
            com.whatsapp.wds.components.toggle.WDSSwitch r1 = r4.A0I
            if (r1 == 0) goto L_0x02e7
            boolean r0 = r14.A05
            r1.setChecked(r0)
        L_0x02e7:
            java.lang.ref.WeakReference r0 = r4.A0P
            java.lang.Object r0 = r0.get()
            X.8AT r0 = (X.AnonymousClass8AT) r0
            if (r0 == 0) goto L_0x0047
            r0.C6c(r14)
            return
        L_0x02f5:
            com.whatsapp.WaTextView r0 = r3.A09
            goto L_0x02d9
        L_0x02f8:
            r0 = 1
            if (r2 != r0) goto L_0x02de
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r3 = r1.A02
            X.6uR r2 = r1.A03
            android.content.Context r1 = r1.A01
            java.util.List r0 = r14.A01
            java.lang.String r1 = r2.A01(r1, r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.C108965cb.A1Y(r3)
            if (r0 == 0) goto L_0x0314
            com.whatsapp.WaTextView r0 = r3.A0B
            goto L_0x02d9
        L_0x0314:
            com.whatsapp.WaTextView r0 = r3.A0C
            goto L_0x02d9
        L_0x0317:
            java.lang.Object r5 = r13.A01
            X.7Mv r5 = (X.C145847Mv) r5
            X.1D6 r14 = (X.AnonymousClass1D6) r14
            X.C18070vi.A0h(r5, r14)
            int r4 = X.AnonymousClass3MZ.A04(r14)
            int r3 = X.C108955ca.A09(r14)
            X.88G r2 = r5.A0H
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            float r1 = (float) r4
            float r0 = (float) r3
            float r1 = r1 / r0
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r2.A07
            if (r0 != 0) goto L_0x033a
            java.lang.String r0 = "previewVoiceVisualizer"
        L_0x0335:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x033a:
            r0.setPlaybackPercentage(r1)
            int r3 = r3 - r4
            r0 = 50
            if (r3 >= r0) goto L_0x0047
            X.C145847Mv.A01(r5)
            return
        L_0x0346:
            java.lang.Object r4 = r13.A01
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r4 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r4
            boolean r1 = X.AnonymousClass000.A1Y(r14)
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0047
            com.whatsapp.TextEmojiLabel r3 = r4.A02
            X.1np r2 = r4.A07
            android.content.Context r5 = r3.getContext()
            r0 = 2131891474(0x7f121512, float:1.941767E38)
            if (r1 == 0) goto L_0x0362
            r0 = 2131891476(0x7f121514, float:1.9417673E38)
        L_0x0362:
            java.lang.String r7 = r4.getString(r0)
            r1 = 2130971981(0x7f040d4d, float:1.7552716E38)
            r0 = 2131103158(0x7f060db6, float:1.7818774E38)
            int r9 = X.AnonymousClass1YL.A00(r4, r1, r0)
            r0 = 44
            X.4ro r6 = new X.4ro
            r6.<init>((java.lang.Object) r4, (int) r0)
            java.lang.String r8 = ""
            X.00H r0 = r2.A02
            r0.get()
            if (r5 != 0) goto L_0x0382
            android.content.Context r5 = r2.A00
        L_0x0382:
            r10 = 0
            android.text.SpannableStringBuilder r0 = X.C38541rS.A02(r5, r6, r7, r8, r9, r10)
            r3.setText(r0)
            return
        L_0x038b:
            java.lang.Object r1 = r13.A01
            X.5jU r1 = (X.C111295jU) r1
            boolean r0 = X.C111295jU.A0I(r1)
            if (r0 == 0) goto L_0x0047
            X.6q8 r0 = r1.A14
            r0.A00()
            return
        L_0x039b:
            java.lang.Object r4 = r13.A01
            X.5jU r4 = (X.C111295jU) r4
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.ArrayList r0 = X.C17880vN.A10(r14)
            java.util.Iterator r2 = r0.iterator()
        L_0x03ad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03c2
            X.1E7 r1 = X.C17880vN.A0O(r2)
            if (r1 == 0) goto L_0x03ad
            X.2Na r0 = new X.2Na
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x03ad
        L_0x03c2:
            r4.A0K = r3
            X.C111295jU.A08(r4)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0047
            r1 = 0
            int r0 = r14.size()
            X.C111295jU.A0A(r4, r1, r0)
            return
        L_0x03d6:
            java.lang.Object r5 = r13.A01
            X.5jU r5 = (X.C111295jU) r5
            java.util.List r14 = (java.util.List) r14
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r0 = X.C17880vN.A10(r14)
            java.util.Iterator r3 = r0.iterator()
        L_0x03e8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0402
            X.1E7 r0 = X.C17880vN.A0O(r3)
            if (r0 == 0) goto L_0x03e8
            X.1BI r2 = X.C72463Mc.A0g(r0)
            r1 = 2
            X.1tO r0 = new X.1tO
            r0.<init>((X.AnonymousClass1BI) r2, (int) r1)
            r4.add(r0)
            goto L_0x03e8
        L_0x0402:
            r5.A0I = r4
            X.C111295jU.A08(r5)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0047
            r1 = 1
            int r0 = r14.size()
            X.C111295jU.A0A(r5, r1, r0)
            return
        L_0x0416:
            X.1KB r2 = r6.A05
            r1 = 2131895460(0x7f1224a4, float:1.9425754E38)
            goto L_0x043e
        L_0x041c:
            java.lang.Object r2 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            java.lang.Number r14 = (java.lang.Number) r14
            boolean r0 = r2.A2E
            if (r0 != 0) goto L_0x0439
            int r1 = r14.intValue()
            X.4Rb r0 = new X.4Rb
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r0, r1)
            java.lang.String r0 = "VoipErrorDialogFragment"
            r2.A4h(r1, r0)
            return
        L_0x0439:
            X.1KB r2 = r2.A05
            r1 = 2131895466(0x7f1224aa, float:1.9425766E38)
        L_0x043e:
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x0443:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.6zf r14 = (X.C139926zf) r14
            com.whatsapp.voipcalling.VoipActivityV2.A19(r14, r0)
            return
        L_0x044d:
            java.lang.Object r4 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            X.5Wl r14 = (X.C106595Wl) r14
            com.whatsapp.calling.header.CallHeaderStateHolder r1 = X.C108955ca.A0L(r4)
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            X.1G4 r0 = r1.A0K
            r0.setValue(r14)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r4.A0g
            if (r3 == 0) goto L_0x047b
            X.5Wl r0 = r3.A03
            if (r0 == r14) goto L_0x047b
            r3.A03 = r14
            X.4Sa r2 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A05(r3)
            X.10w r0 = r2.A06
            int r1 = r0.size()
            r0 = 4
            if (r1 < r0) goto L_0x047b
            r0 = 0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(r2, r3, r0)
        L_0x047b:
            X.00H r0 = r4.A1n
            java.lang.Object r0 = r0.get()
            X.6kZ r0 = (X.C131136kZ) r0
            X.1G4 r0 = r0.A0B
            r0.setValue(r14)
            return
        L_0x0489:
            java.lang.Object r2 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            X.11C r0 = r2.A08
            boolean r0 = X.C108965cb.A1X(r0)
            if (r0 == 0) goto L_0x04a8
            boolean r0 = r2.A2D
            if (r0 != 0) goto L_0x04a5
            X.1bI r1 = r2.A1X
            r0 = 0
            if (r14 == 0) goto L_0x04a2
            r0 = 8
        L_0x04a2:
            r1.A04(r0)
        L_0x04a5:
            r2.A1K = r14
            return
        L_0x04a8:
            if (r14 == 0) goto L_0x04cb
            com.whatsapp.voipcalling.VoipActivityV2.A1U(r2)
            com.whatsapp.jid.UserJid r0 = r2.A1K
            if (r0 == r14) goto L_0x04a5
            X.A99 r1 = r2.A0u
            if (r1 == 0) goto L_0x04a5
            java.lang.String r0 = "VoiceService:onVideoMaximizedDialogShown"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.A02
            int r0 = r0 + 1
            r1.A02 = r0
            java.lang.Long r0 = X.C108955ca.A0m()
            android.util.Pair r0 = X.C108945cZ.A0N(r14, r0)
            r1.A0O = r0
            goto L_0x04a5
        L_0x04cb:
            com.whatsapp.jid.UserJid r0 = r2.A1K
            if (r0 == 0) goto L_0x04a5
            X.A99 r1 = r2.A0u
            if (r1 == 0) goto L_0x04a5
            java.lang.String r0 = "VoiceService:onExitVideoMaximizedDialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0U()
            goto L_0x04a5
        L_0x04dc:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.4ZN r14 = (X.AnonymousClass4ZN) r14
            X.8Au r0 = r0.A0p
            r0.CMy(r14)
            return
        L_0x04e8:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.voipcalling.VoipActivityV2.A1Z(r0)
            return
        L_0x04f0:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r0.A0g
            r0 = 1
            r1.A0H = r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0D(r1)
            return
        L_0x04fd:
            java.lang.Object r2 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            if (r14 == 0) goto L_0x0513
            X.1bI r1 = r2.A1V
            if (r1 == 0) goto L_0x050e
            android.view.View r0 = r1.A00
            if (r0 != 0) goto L_0x050e
            r1.A02()
        L_0x050e:
            r0 = 1
        L_0x050f:
            com.whatsapp.voipcalling.VoipActivityV2.A1l(r2, r0)
            return
        L_0x0513:
            r0 = 0
            goto L_0x050f
        L_0x0515:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.6Qg r14 = (X.C122436Qg) r14
            com.whatsapp.voipcalling.VoipActivityV2.A18(r14, r0)
            return
        L_0x051f:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            android.util.Rational r14 = (android.util.Rational) r14
            com.whatsapp.voipcalling.VoipActivityV2.A15(r14, r0)
            return
        L_0x0529:
            java.lang.Object r0 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            java.util.List r14 = (java.util.List) r14
            X.8Ag r2 = r0.A0m
            if (r14 == 0) goto L_0x053a
            boolean r1 = r14.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x053b
        L_0x053a:
            r0 = 1
        L_0x053b:
            r2.CIo(r0)
            return
        L_0x053f:
            java.lang.Object r1 = r13.A01
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            boolean r0 = X.AnonymousClass000.A1Y(r14)
            com.whatsapp.voipcalling.VoipActivityV2.A1l(r1, r0)
            return
        L_0x054b:
            java.lang.Object r6 = r13.A01
            com.whatsapp.userban.ui.BanAppealActivity r6 = (com.whatsapp.userban.ui.BanAppealActivity) r6
            int r8 = X.AnonymousClass000.A0M(r14)
            r0 = -2
            r7 = 1
            r5 = -1
            if (r8 == r0) goto L_0x05ab
            if (r8 == r7) goto L_0x05a4
            r0 = 3
            if (r8 == r0) goto L_0x059c
            r2 = 4
            r1 = 2131889358(0x7f120cce, float:1.9413377E38)
            r0 = 2131886928(0x7f120350, float:1.9408449E38)
            if (r8 == r2) goto L_0x05a2
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 2131886927(0x7f12034f, float:1.9408447E38)
        L_0x056c:
            r4 = -1
            r2 = -1
        L_0x056e:
            X.3Rj r3 = X.AnonymousClass4a6.A00(r6)
            r3.A0D(r0)
            r3.A0T(r7)
            java.lang.String r1 = r6.getString(r1)
            X.7AG r0 = new X.7AG
            r0.<init>(r6, r8)
            r3.A0i(r6, r0, r1)
            if (r2 == r5) goto L_0x0589
            r3.A0E(r2)
        L_0x0589:
            if (r4 == r5) goto L_0x0598
            java.lang.String r2 = r6.getString(r4)
            r1 = 0
            X.7AL r0 = new X.7AL
            r0.<init>(r1)
            r3.A0h(r6, r0, r2)
        L_0x0598:
            r3.A0C()
            return
        L_0x059c:
            r1 = 2131893429(0x7f121cb5, float:1.9421634E38)
            r0 = 2131886929(0x7f120351, float:1.940845E38)
        L_0x05a2:
            r7 = 0
            goto L_0x056c
        L_0x05a4:
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 2131892931(0x7f121ac3, float:1.9420624E38)
            goto L_0x056c
        L_0x05ab:
            r1 = 2131893429(0x7f121cb5, float:1.9421634E38)
            r2 = 2131886924(0x7f12034c, float:1.940844E38)
            r4 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 2131886925(0x7f12034d, float:1.9408443E38)
            goto L_0x056e
        L_0x05b8:
            java.lang.Object r5 = r13.A01
            com.whatsapp.userban.ui.BanAppealActivity r5 = (com.whatsapp.userban.ui.BanAppealActivity) r5
            int r2 = X.AnonymousClass000.A0M(r14)
            r6 = 1
            if (r2 == r6) goto L_0x061d
            r0 = 2
            if (r2 == r0) goto L_0x0615
            r0 = 3
            if (r2 == r0) goto L_0x060d
            r0 = 4
            if (r2 == r0) goto L_0x0605
            r0 = 5
            if (r2 != r0) goto L_0x0625
            java.lang.String r4 = "BanAppealBannedDecisionFragment"
            com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealBannedDecisionFragment
            r3.<init>()
        L_0x05d6:
            r6 = 0
        L_0x05d7:
            X.1GP r2 = r5.getSupportFragmentManager()
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x05ec
            int r0 = r2.A0K()
            if (r0 <= 0) goto L_0x05ec
            r0 = 1
            r2.A0v(r1, r0)
            r0 = 0
            r5.A01 = r0
        L_0x05ec:
            X.1jj r1 = X.AnonymousClass3Ma.A0H(r5)
            r0 = 2131429504(0x7f0b0880, float:1.8480683E38)
            r1.A09(r3, r0)
            if (r6 == 0) goto L_0x0601
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x05fe
            r5.A01 = r4
        L_0x05fe:
            r1.A0H(r4)
        L_0x0601:
            r1.A01()
            return
        L_0x0605:
            java.lang.String r4 = "BanAppealUnbannedDecisionFragment"
            com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment
            r3.<init>()
            goto L_0x05d6
        L_0x060d:
            java.lang.String r4 = "BanAppealFormSubmittedFragment"
            com.whatsapp.userban.ui.fragment.BanAppealFormSubmittedFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealFormSubmittedFragment
            r3.<init>()
            goto L_0x05d7
        L_0x0615:
            java.lang.String r4 = "BanAppealFormFragment"
            com.whatsapp.userban.ui.fragment.BanAppealFormFragment r3 = new com.whatsapp.userban.ui.fragment.BanAppealFormFragment
            r3.<init>()
            goto L_0x05ec
        L_0x061d:
            java.lang.String r4 = "BanInfoFragment"
            com.whatsapp.userban.ui.fragment.BanInfoFragment r3 = new com.whatsapp.userban.ui.fragment.BanInfoFragment
            r3.<init>()
            goto L_0x05d6
        L_0x0625:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid screen state: "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0635:
            java.lang.Object r0 = r13.A01
            X.C108945cZ.A1Q(r0)
            return
        L_0x063b:
            java.lang.Object r2 = r13.A01
            X.7MH r2 = (X.AnonymousClass7MH) r2
            java.util.List r14 = (java.util.List) r14
            boolean r1 = X.C18070vi.A16(r2, r14)
            X.882 r0 = r2.A04
            r0.setVoiceVisualizerSegments(r14)
            r2.A00 = r1
            return
        L_0x064d:
            java.lang.Object r2 = r13.A01
            com.whatsapp.status.StatusesFragment r2 = (com.whatsapp.status.StatusesFragment) r2
            X.6gX r14 = (X.C128696gX) r14
            java.lang.String r0 = "statusesFragment/onStatusSharingInfoChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r14 == 0) goto L_0x0698
            android.content.Intent r0 = r14.A01
            if (r0 == 0) goto L_0x0695
            java.util.List r5 = r2.A1O
            java.util.Iterator r4 = r5.iterator()
        L_0x0664:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0677
            android.net.Uri r3 = X.C108945cZ.A0M(r4)
            X.118 r0 = r2.A0R
            android.content.Context r1 = r0.A00
            r0 = 1
            r1.revokeUriPermission(r3, r0)
            goto L_0x0664
        L_0x0677:
            r5.clear()
            java.util.List r0 = r14.A02
            r5.addAll(r0)
            boolean r0 = r2.A1D
            if (r0 == 0) goto L_0x0692
            java.lang.Integer r1 = X.AnonymousClass00R.A01
        L_0x0685:
            X.6z5 r0 = r2.A0j
            r0.A02(r1)
            android.content.Intent r1 = r14.A01
            r0 = 35
            r2.startActivityForResult(r1, r0)
            return
        L_0x0692:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x0685
        L_0x0695:
            int r4 = r14.A00
            goto L_0x0699
        L_0x0698:
            r4 = 0
        L_0x0699:
            r1 = 5
            if (r4 == 0) goto L_0x06a1
            r0 = 1
            r1 = 3
            if (r4 == r0) goto L_0x06a1
            r1 = 2
        L_0x06a1:
            X.1hg r0 = r2.A0l
            X.2gt r0 = r0.A00
            if (r0 == 0) goto L_0x06a9
            r0.A01 = r1
        L_0x06a9:
            r3 = 1
            X.1KB r2 = r2.A0D
            if (r4 == r3) goto L_0x06bb
            r1 = 2
            r0 = 2131896129(0x7f122741, float:1.942711E38)
            if (r4 == r1) goto L_0x06be
            r0 = 2131896127(0x7f12273f, float:1.9427106E38)
            r2.A08(r0, r3)
            return
        L_0x06bb:
            r0 = 2131896128(0x7f122740, float:1.9427109E38)
        L_0x06be:
            r2.A06(r0, r3)
            return
        L_0x06c2:
            java.lang.Object r0 = r13.A01
            X.AnonymousClass3MW.A1U(r0)
            return
        L_0x06c8:
            java.lang.Object r0 = r13.A01
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r0 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r0
            java.lang.String r14 = (java.lang.String) r14
            r0.A09 = r14
            return
        L_0x06d1:
            java.lang.Object r0 = r13.A01
            com.whatsapp.search.views.TokenizedSearchInput r0 = (com.whatsapp.search.views.TokenizedSearchInput) r0
            X.77M r14 = (X.AnonymousClass77M) r14
            r0.setRemoteEntity(r14)
            return
        L_0x06db:
            java.lang.Object r0 = r13.A01
            com.whatsapp.search.views.TokenizedSearchInput r0 = (com.whatsapp.search.views.TokenizedSearchInput) r0
            X.77Z r14 = (X.AnonymousClass77Z) r14
            r0.setSmartFilter(r14)
            return
        L_0x06e5:
            java.lang.Object r0 = r13.A01
            X.6kD r0 = (X.C130916kD) r0
            X.77M r14 = (X.AnonymousClass77M) r14
            X.1jz r1 = r0.A08
            r1.A04 = r14
            goto L_0x0714
        L_0x06f0:
            java.lang.Object r0 = r13.A01
            X.6kD r0 = (X.C130916kD) r0
            X.77Z r14 = (X.AnonymousClass77Z) r14
            X.1jz r1 = r0.A08
            r1.A06 = r14
            goto L_0x0714
        L_0x06fb:
            java.lang.Object r2 = r13.A01
            X.6kD r2 = (X.C130916kD) r2
            X.1BI r14 = (X.AnonymousClass1BI) r14
            X.1jz r1 = r2.A08
            r1.A03 = r14
            r0 = 0
            r1.A0G = r0
            goto L_0x0725
        L_0x0709:
            java.lang.Object r0 = r13.A01
            X.6kD r0 = (X.C130916kD) r0
            java.lang.String r14 = (java.lang.String) r14
            X.1jz r1 = r0.A08
            r1.A05(r14)
        L_0x0714:
            X.1Dg r0 = r0.A02
            goto L_0x0727
        L_0x0717:
            java.lang.Object r2 = r13.A01
            X.6kD r2 = (X.C130916kD) r2
            java.lang.Number r14 = (java.lang.Number) r14
            X.1jz r1 = r2.A08
            int r0 = r14.intValue()
            r1.A02 = r0
        L_0x0725:
            X.1Dg r0 = r2.A02
        L_0x0727:
            r0.A0F(r1)
            return
        L_0x072b:
            java.lang.Object r2 = r13.A01
            X.5jU r2 = (X.C111295jU) r2
            java.util.List r14 = (java.util.List) r14
            r2.A0H = r14
            X.A8w r0 = r2.A02
            if (r0 == 0) goto L_0x0762
            java.lang.String r0 = r2.A0b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0762
            int r0 = r2.A0U()
            if (r0 != 0) goto L_0x0762
            X.0ve r1 = r2.A0y
            X.A4o r0 = X.C20135A8w.A0R
            boolean r0 = r0.A03(r1)
            if (r0 == 0) goto L_0x0762
            monitor-enter(r2)
            android.util.SparseIntArray r0 = r2.A01     // Catch:{ all -> 0x075f }
            android.util.SparseIntArray r0 = r0.clone()     // Catch:{ all -> 0x075f }
            X.C111295jU.A06(r0, r2)     // Catch:{ all -> 0x075f }
            r2.A01 = r0     // Catch:{ all -> 0x075f }
            monitor-exit(r2)     // Catch:{ all -> 0x075f }
            goto L_0x0762
        L_0x075f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x075f }
            throw r0
        L_0x0762:
            X.C111295jU.A08(r2)
            return
        L_0x0766:
            java.lang.Object r0 = r13.A01
            X.5jU r0 = (X.C111295jU) r0
            java.util.List r14 = (java.util.List) r14
            r0.A0G = r14
            X.C111295jU.A08(r0)
            return
        L_0x0772:
            java.lang.Object r1 = r13.A01
            X.5jU r1 = (X.C111295jU) r1
            X.1E7 r14 = (X.AnonymousClass1E7) r14
            if (r14 == 0) goto L_0x0785
            X.6FJ r0 = new X.6FJ
            r0.<init>(r14)
        L_0x077f:
            r1.A0A = r0
            X.C111295jU.A08(r1)
            return
        L_0x0785:
            r0 = 0
            goto L_0x077f
        L_0x0787:
            java.lang.Object r5 = r13.A01
            X.5jU r5 = (X.C111295jU) r5
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.HashMap r6 = X.C17880vN.A11()
            java.util.ArrayList r0 = X.C17880vN.A10(r14)
            java.util.Iterator r3 = r0.iterator()
        L_0x0799:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07c6
            X.1E7 r2 = X.C17880vN.A0O(r3)
            if (r2 == 0) goto L_0x0799
            java.lang.String r1 = r2.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0799
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x07bc
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r6.put(r1, r0)
        L_0x07bc:
            java.lang.Object r0 = r6.get(r1)
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x0799
        L_0x07c6:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = X.C17890vO.A0i(r6)
        L_0x07ce:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07e9
            java.lang.Object r2 = X.C17890vO.A0P(r3)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = X.C108955ca.A0p(r2)
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            X.6FK r0 = new X.6FK
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x07ce
        L_0x07e9:
            r5.A0M = r4
            X.C111295jU.A08(r5)
            return
        L_0x07ef:
            X.4Sv r3 = r14.BNt()
            X.4ZN r2 = r14.BNZ()
            r1 = 0
            if (r3 == 0) goto L_0x0802
            X.4ZN r0 = r3.A01
            android.view.View$OnClickListener r1 = r3.A00
        L_0x07fe:
            r4.CMc(r1, r2, r0, r5)
            return
        L_0x0802:
            r0 = r1
            goto L_0x07fe
        L_0x0804:
            X.6Hu r1 = r3.A09
            if (r1 == 0) goto L_0x0826
            androidx.recyclerview.widget.RecyclerView r0 = r1.A04
            if (r0 == 0) goto L_0x080f
            r1.A01()
        L_0x080f:
            java.util.List r1 = r3.A0E
            X.6Hu r0 = r3.A09
            r1.add(r2, r0)
            X.AnonymousClass6CF.A01(r3)
            java.util.List r1 = r3.A0E
            X.6Hu r0 = r3.A09
            int r1 = r1.indexOf(r0)
            r0 = 1
            r3.A05(r1, r0)
            return
        L_0x0826:
            X.0ve r7 = r3.A0T
            android.content.Context r5 = r3.A05
            android.view.LayoutInflater r6 = r3.A0P
            X.1Sw r8 = r3.A0W
            X.88B r9 = r3.A0Z
            X.5ii r10 = r3.A0a
            int r11 = r3.A0O
            int r12 = r3.A0N
            X.6Hu r4 = new X.6Hu
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r3.A09 = r4
            goto L_0x080f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AP.Bo9(java.lang.Object):void");
    }
}
