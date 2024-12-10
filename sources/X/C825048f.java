package X;

import android.view.View;

/* renamed from: X.48f  reason: invalid class name and case insensitive filesystem */
public class C825048f extends C38471rL {
    public final int A00;
    public final Object A01;

    public C825048f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C825048f(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v341, types: [X.4MX, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06b8, code lost:
        r1.A0l(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0728, code lost:
        r1.putExtra("vcard_message", r2);
        X.AnonymousClass3MY.A11(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0730, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0783, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0787, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x07b7, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07f1, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07f4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e5, code lost:
        if (r0 == false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01fb, code lost:
        if (r0 == false) goto L_0x01fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r25) {
        /*
            r24 = this;
            r4 = r24
            int r0 = r4.A00
            r5 = r25
            switch(r0) {
                case 0: goto L_0x070d;
                case 1: goto L_0x06f5;
                case 2: goto L_0x0463;
                case 3: goto L_0x044c;
                case 4: goto L_0x03fe;
                case 5: goto L_0x06bc;
                case 6: goto L_0x03cf;
                case 7: goto L_0x06ae;
                case 8: goto L_0x06a3;
                case 9: goto L_0x069b;
                case 10: goto L_0x068c;
                case 11: goto L_0x03ae;
                case 12: goto L_0x0602;
                case 13: goto L_0x034d;
                case 14: goto L_0x0669;
                case 15: goto L_0x0642;
                case 16: goto L_0x0329;
                case 17: goto L_0x02f3;
                case 18: goto L_0x02cb;
                case 19: goto L_0x060a;
                case 20: goto L_0x0276;
                case 21: goto L_0x0244;
                case 22: goto L_0x0602;
                case 23: goto L_0x01b0;
                case 24: goto L_0x018f;
                case 25: goto L_0x05f3;
                case 26: goto L_0x05ed;
                case 27: goto L_0x07d3;
                case 28: goto L_0x0485;
                case 29: goto L_0x047e;
                case 30: goto L_0x05e5;
                case 31: goto L_0x0583;
                case 32: goto L_0x056d;
                case 33: goto L_0x0561;
                case 34: goto L_0x054d;
                case 35: goto L_0x0161;
                case 36: goto L_0x00fe;
                case 37: goto L_0x052b;
                case 38: goto L_0x0517;
                case 39: goto L_0x00b8;
                case 40: goto L_0x00a2;
                case 41: goto L_0x008d;
                case 42: goto L_0x0077;
                case 43: goto L_0x0029;
                case 44: goto L_0x0777;
                case 45: goto L_0x050f;
                case 46: goto L_0x04ed;
                case 47: goto L_0x04d7;
                case 48: goto L_0x048c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r4.A01
            X.3d3 r2 = (X.C74873d3) r2
            X.5Zk r0 = r2.A09
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.Bf8()
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            r2.CFm()
            com.whatsapp.emoji.search.EmojiSearchProvider r1 = r2.A0N
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0017
            X.6nB r0 = r2.A0A
            if (r0 == 0) goto L_0x0017
            r0.A00(r1)
            return
        L_0x0029:
            java.lang.Object r3 = r4.A01
            X.6q9 r3 = (X.C134166q9) r3
            X.870 r2 = r3.A01
            X.5z4 r2 = (X.C117015z4) r2
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x0017
            X.C117015z4.A03(r2, r0)
            X.870 r0 = r3.A01
            X.3d3 r0 = (X.C74873d3) r0
            r0.A0F()
            X.6i6 r0 = r3.A02
            X.0vl r0 = r0.A01
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0017
            X.6ka r0 = r3.A06
            X.0z4 r0 = r0.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "sticker_store_onboarding_badge_shown"
            X.C17880vN.A1F(r1, r0, r2)
            X.6i6 r0 = r3.A02
            r1 = 8
            X.0vl r0 = r0.A01
            X.C72453Mb.A1U(r0, r1)
            X.6i6 r0 = r3.A02
            X.0vl r0 = r0.A01
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            android.view.animation.Animation r0 = r0.getAnimation()
            if (r0 == 0) goto L_0x0017
            r0.cancel()
            return
        L_0x0077:
            java.lang.Object r3 = r4.A01
            X.7Hs r3 = (X.C144547Hs) r3
            X.870 r2 = r3.A00
            r1 = 1
            if (r2 == 0) goto L_0x0089
            X.5z4 r2 = (X.C117015z4) r2
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0017
            X.C117015z4.A03(r2, r1)
        L_0x0089:
            r3.A00()
            return
        L_0x008d:
            java.lang.Object r0 = r4.A01
            X.6in r0 = (X.C130046in) r0
            X.870 r1 = r0.A00
            java.lang.String r0 = "customPopUpWindowListener"
            if (r1 == 0) goto L_0x0783
            X.5z4 r1 = (X.C117015z4) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0017
            r0 = 0
            X.C117015z4.A03(r1, r0)
            return
        L_0x00a2:
            java.lang.Object r3 = r4.A01
            X.6q3 r3 = (X.C134106q3) r3
            X.870 r2 = r3.A02
            r1 = 3
            if (r2 == 0) goto L_0x00b4
            X.5z4 r2 = (X.C117015z4) r2
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0017
            X.C117015z4.A03(r2, r1)
        L_0x00b4:
            r3.A00()
            return
        L_0x00b8:
            java.lang.Object r5 = r4.A01
            com.whatsapp.crop.CropImage r5 = (com.whatsapp.crop.CropImage) r5
            X.4Yn r0 = r5.A0L
            r1 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x0017
            r3 = 1
            r5.A0X = r3
            com.whatsapp.crop.CropImageView r0 = r5.A0K
            r0.setEnabled(r1)
            com.whatsapp.crop.CropImageView r2 = r5.A0K
            java.util.ArrayList r0 = r2.A06
            r0.clear()
            r1 = 0
            X.4MX r0 = new X.4MX
            r0.<init>()
            r0.A00 = r1
            r2.A07(r0, r3)
            com.whatsapp.crop.CropImageView r0 = r5.A0K
            r0.A01 = r3
            X.0ve r2 = r5.A01
            r1 = 11698(0x2db2, float:1.6392E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x073f
            X.10I r2 = r5.A05
            r0 = 16
            X.3Bq r1 = new X.3Bq
            r1.<init>(r4, r0)
            java.lang.String r0 = "save_click_worker_token"
            r2.CGL(r1, r0)
            return
        L_0x00fe:
            java.lang.Object r5 = r4.A01
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            X.1L9 r4 = r5.A0e
            android.content.Context r3 = r5.A1n()
            X.00H r0 = r5.A3c
            r0.get()
            android.content.Context r0 = r5.A1n()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.ArchivedConversationsActivity"
            r2.setClassName(r1, r0)
            r4.A08(r3, r2)
            com.whatsapp.conversationslist.ArchiveHeaderViewModel r4 = r5.A1S
            if (r4 == 0) goto L_0x0017
            X.18K r3 = r5.A27
            X.1DT r0 = r4.A01
            java.lang.Object r2 = r0.A06()
            r1 = 0
            if (r2 == 0) goto L_0x015c
            java.lang.String r0 = "@"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0155
            r0 = 0
            r1 = 1
        L_0x013a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            X.3z4 r1 = new X.3z4
            r1.<init>()
            if (r0 == 0) goto L_0x014b
            java.lang.Long r0 = X.C17890vO.A0N(r0)
            r1.A01 = r0
        L_0x014b:
            java.lang.String r0 = "Archive"
            r1.A02 = r0
            r1.A00 = r2
            r3.CC7(r1)
            return
        L_0x0155:
            int r0 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x013a
        L_0x015c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x013a
        L_0x0161:
            java.lang.Object r5 = r4.A01
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            X.0ve r2 = r5.A25
            r1 = 10110(0x277e, float:1.4167E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 2131894324(0x7f122034, float:1.942345E38)
            if (r0 == 0) goto L_0x0177
            r4 = 2131889749(0x7f120e55, float:1.941417E38)
        L_0x0177:
            r3 = 2131894328(0x7f122038, float:1.9423458E38)
            r2 = 14
            r1 = 0
            android.content.Context r0 = r5.A1n()
            if (r0 == 0) goto L_0x0017
            android.content.Context r0 = r5.A14()
            android.content.Intent r0 = X.AnonymousClass74O.A02(r0, r4, r3, r1)
            r5.startActivityForResult(r0, r2)
            return
        L_0x018f:
            java.lang.Object r7 = r4.A01
            X.4Ok r7 = (X.C85704Ok) r7
            X.3TA r2 = r7.A02
            X.7Fe r0 = r2.A00
            if (r0 == 0) goto L_0x0017
            X.6g9 r0 = r0.A05
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0743
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0743
            return
        L_0x01b0:
            java.lang.Object r0 = r4.A01
            X.4Ok r0 = (X.C85704Ok) r0
            X.5XJ r1 = r0.A01
            X.4ku r1 = (X.C94614ku) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x076c
            java.lang.Object r5 = r1.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            X.0ve r1 = r5.A3F
            r0 = 9315(0x2463, float:1.3053E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r6, r1, r0)
            X.3TA r2 = r5.A2d
            X.7Fe r0 = r2.A00
            boolean r0 = r0 instanceof X.C75373hL
            if (r0 == 0) goto L_0x023e
            if (r1 == 0) goto L_0x023e
            r0 = 1
            r5.A6Y = r0
            java.lang.String r1 = r2.A0A
            X.4O2 r0 = r2.A02
            r3 = 0
            if (r0 == 0) goto L_0x01e7
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x01e8
        L_0x01e7:
            r1 = 0
        L_0x01e8:
            r0 = 0
            X.AnonymousClass3TA.A07(r2, r0, r1, r3)
            X.3TA r2 = r5.A2d
            java.lang.String r1 = r2.A0A
            X.4O2 r0 = r2.A01
            if (r0 == 0) goto L_0x01fd
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r1 = 1
            if (r0 != 0) goto L_0x01fe
        L_0x01fd:
            r1 = 0
        L_0x01fe:
            r0 = 0
            X.AnonymousClass3TA.A06(r2, r0, r1, r3)
        L_0x0202:
            java.lang.Object r7 = X.C72473Md.A0f(r5)
            X.4Ox r7 = (X.C85834Ox) r7
            if (r7 == 0) goto L_0x022a
            X.4aI r4 = X.C88444Zs.A01(r5)
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MW.A0j(r5)
            r2 = 0
            r1 = 5
            r0 = 1
            X.C88654aI.A03(r4, r3, r2, r1, r0)
            X.4VR r1 = r5.A2q
            boolean r3 = r7.A04
            X.1BI r0 = r1.A0B
            if (r0 == 0) goto L_0x022a
            X.4XK r2 = r1.A0R
            java.lang.String r1 = r0.getRawString()
            r0 = 6
            X.AnonymousClass4XK.A00(r2, r1, r0, r3)
        L_0x022a:
            r5.A2Q()
            X.0ve r1 = r5.A3F
            r0 = 10389(0x2895, float:1.4558E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x0017
            X.0ve r1 = r5.A3F
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            return
        L_0x023e:
            java.lang.String r0 = r2.A0A
            r2.A0b(r0)
            goto L_0x0202
        L_0x0244:
            java.lang.Object r3 = r4.A01
            X.3uK r3 = (X.AnonymousClass3uK) r3
            X.21Y r1 = r3.getFMessage()
            X.2rc r0 = X.AnonymousClass206.A00(r1)
            int r0 = r0.A07
            r2 = 1
            if (r0 != r2) goto L_0x025e
            X.1KB r1 = r3.A0S
            r0 = 2131890637(0x7f1211cd, float:1.9415971E38)
            r1.A06(r0, r2)
            return
        L_0x025e:
            boolean r0 = r3.A2o()
            if (r0 == 0) goto L_0x0017
            boolean r0 = r1.A1F()
            if (r0 == 0) goto L_0x0017
            X.0ve r0 = r3.A0F
            boolean r0 = X.AnonymousClass72Z.A01(r0, r1)
            if (r0 == 0) goto L_0x07d0
            X.AnonymousClass3uK.A0A(r3)
            return
        L_0x0276:
            X.1FU r3 = X.C72473Md.A0O(r5)
            if (r3 == 0) goto L_0x0017
            java.lang.Object r0 = r4.A01
            X.73a r0 = (X.C1407773a) r0
            X.00H r0 = r0.A0K
            java.lang.Object r2 = r0.get()
            X.6zi r2 = (X.C139956zi) r2
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b0
            X.00H r0 = r2.A02
            r0.get()
            boolean r1 = X.AnonymousClass11Z.A00()
            r0 = 2131892427(0x7f1218cb, float:1.9419602E38)
            if (r1 == 0) goto L_0x02ad
            r0 = 2131892426(0x7f1218ca, float:1.94196E38)
        L_0x02ad:
            r3.BhQ(r0)
        L_0x02b0:
            boolean r0 = X.C139956zi.A00(r3, r2)
            if (r0 != 0) goto L_0x0017
            X.00H r0 = r2.A02
            r0.get()
            boolean r1 = X.AnonymousClass11Z.A00()
            r0 = 2131890629(0x7f1211c5, float:1.9415955E38)
            if (r1 == 0) goto L_0x02c7
            r0 = 2131890628(0x7f1211c4, float:1.9415953E38)
        L_0x02c7:
            r3.BhQ(r0)
            return
        L_0x02cb:
            java.lang.Object r3 = r4.A01
            X.73a r3 = (X.C1407773a) r3
            X.17x r1 = r3.A09
            if (r1 == 0) goto L_0x02de
            android.content.Context r0 = r5.getContext()
            boolean r0 = X.AnonymousClass74O.A0O(r0, r1)
            if (r0 != 0) goto L_0x02de
            return
        L_0x02de:
            X.21V r2 = r3.A00
            X.2rc r1 = X.AnonymousClass206.A00(r2)
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0017
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0017
            X.1kd r1 = r3.A07
            r0 = 1
            r1.A08(r2, r0, r0)
            return
        L_0x02f3:
            java.lang.Object r3 = r4.A01
            X.73a r3 = (X.C1407773a) r3
            X.21V r2 = r3.A00
            X.2rc r1 = X.AnonymousClass206.A00(r2)
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0305
            boolean r0 = r1.A0c
            if (r0 == 0) goto L_0x0017
        L_0x0305:
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0017
            boolean r0 = r2.A1F()
            if (r0 == 0) goto L_0x0017
            int r1 = r1.A07
            r0 = 1
            if (r1 == r0) goto L_0x0017
            r5 = 1
            r3.A02 = r0
            X.1iW r1 = r3.A08
            android.view.View r0 = r3.A05
            android.app.Activity r2 = X.AnonymousClass3Ma.A05(r0)
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.21V r3 = r3.A00
            r4 = 0
            r6 = r5
            r1.A0M(r2, r3, r4, r5, r6)
            return
        L_0x0329:
            java.lang.Object r4 = r4.A01
            X.73a r4 = (X.C1407773a) r4
            X.21V r2 = r4.A00
            X.2rc r0 = X.AnonymousClass206.A00(r2)
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0017
            X.205 r0 = r2.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0343
            X.1hs r1 = r4.A0B
            r0 = 0
            r1.A07(r2, r0)
        L_0x0343:
            X.1hB r3 = r4.A0C
            X.21V r2 = r4.A00
            r1 = 0
            r0 = 1
            X.C32431hB.A06(r3, r2, r0, r1, r1)
            return
        L_0x034d:
            java.lang.Object r5 = r4.A01
            X.3sE r5 = (X.C78133sE) r5
            X.24N r1 = r5.getFMessage()
            X.1ch r7 = r1.A01
            if (r7 == 0) goto L_0x0017
            java.lang.String r11 = r1.A03
            if (r11 == 0) goto L_0x0017
            X.24N r0 = r5.getFMessage()
            X.205 r0 = r0.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x094d
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.24N r0 = r5.getFMessage()
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A01(r0)
            if (r6 == 0) goto L_0x0017
            long r1 = r1.A00
            X.00H r0 = r5.A1s
            X.17w r3 = X.AnonymousClass3MW.A0c(r0)
            java.lang.Class<X.17j> r0 = X.C217817j.class
            r3.A01(r0)
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r4 = new com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet
            r4.<init>()
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r0 = "newsletter_jid"
            X.AnonymousClass3MY.A15(r3, r7, r0)
            java.lang.String r0 = "arg_contact_jid"
            X.AnonymousClass3MY.A15(r3, r6, r0)
            java.lang.String r0 = "newsletter_name"
            r3.putString(r0, r11)
            java.lang.String r0 = "invite_expiration_ts"
            r3.putLong(r0, r1)
            r4.A1R(r3)
            X.1FU r0 = X.AnonymousClass3Ma.A0K(r5)
            if (r0 == 0) goto L_0x0017
            r0.CMl(r4)
            return
        L_0x03ae:
            java.lang.Object r4 = r4.A01
            X.3uL r4 = (X.AnonymousClass3uL) r4
            X.21V r3 = r4.getFMessage()
            boolean r0 = X.C50302Tx.A00(r3)
            if (r0 == 0) goto L_0x09f4
            X.6yW r0 = r4.A07
            X.C17960vV.A07(r0)
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r3)
            X.8fi r0 = (X.C167258fi) r0
            if (r0 == 0) goto L_0x0017
            r0.cancel()
            return
        L_0x03cf:
            java.lang.Object r4 = r4.A01
            X.3u7 r4 = (X.AnonymousClass3u7) r4
            java.util.List r0 = r4.getAlbumMessages()
            java.util.Iterator r3 = r0.iterator()
        L_0x03db:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0017
            X.21V r2 = X.C17880vN.A0b(r3)
            X.2rc r1 = X.AnonymousClass3Ma.A0M(r2)
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x03db
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x03db
            boolean r0 = X.AnonymousClass4H3.A00(r2)
            if (r0 != 0) goto L_0x03db
            X.1kd r1 = r4.A0V
            r0 = 1
            r1.A08(r2, r0, r0)
            goto L_0x03db
        L_0x03fe:
            java.lang.Object r4 = r4.A01
            X.3u7 r4 = (X.AnonymousClass3u7) r4
            java.util.List r0 = r4.getAlbumMessages()
            java.util.Iterator r5 = r0.iterator()
        L_0x040a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0017
            X.21V r3 = X.C17880vN.A0b(r5)
            boolean r0 = X.C50302Tx.A00(r3)
            if (r0 == 0) goto L_0x042c
            X.6yW r0 = r4.getMediaFileFindManager()
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r3)
            X.8fi r0 = (X.C167258fi) r0
            if (r0 == 0) goto L_0x040a
            r0.cancel()
            goto L_0x040a
        L_0x042c:
            X.2rc r0 = X.AnonymousClass3Ma.A0M(r3)
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x040a
            X.205 r0 = r3.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0442
            X.1hs r1 = r4.getSendMediaMessageManager()
            r0 = 0
            r1.A07(r3, r0)
        L_0x0442:
            X.1hB r2 = r4.getMediaDownloadManager()
            r1 = 0
            r0 = 1
            X.C32431hB.A06(r2, r3, r0, r1, r1)
            goto L_0x040a
        L_0x044c:
            java.lang.Object r2 = r4.A01
            X.3u2 r2 = (X.C78983u2) r2
            X.1rL r0 = r2.A0D
            r0.A04(r5)
            X.4TR r1 = r2.A0C
            if (r1 == 0) goto L_0x0017
            X.206 r0 = r2.A0I
            X.21V r0 = (X.AnonymousClass21V) r0
            X.205 r0 = r0.A0v
            r1.A01(r0)
            return
        L_0x0463:
            java.lang.Object r1 = r4.A01
            X.3ty r1 = (X.C78943ty) r1
            X.1KB r0 = r1.A0S
            X.1FR r3 = r0.A00
            if (r3 == 0) goto L_0x0017
            X.23z r2 = r1.getFMessage()
            r1 = 0
            X.4Cx r0 = X.C82984Cx.NONE
            com.whatsapp.events.EventInfoBottomSheet r1 = X.C83664Ge.A00(r2, r1, r0)
            java.lang.String r0 = "EVENT_INFO_BOTTOM_SHEET"
            r3.CMk(r1, r0)
            return
        L_0x047e:
            java.lang.String r0 = "getOrderRequestMessageLiveData"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0485:
            java.lang.String r0 = "getOrderMessageLiveData"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x048c:
            java.lang.Object r6 = r4.A01
            com.whatsapp.email.ReconfirmEmailBottomSheet r6 = (com.whatsapp.email.ReconfirmEmailBottomSheet) r6
            X.3Rj r5 = X.AnonymousClass4a6.A03(r6)
            r0 = 2131889690(0x7f120e1a, float:1.941405E38)
            r5.A0E(r0)
            android.content.Context r4 = r6.A14()
            r3 = 2131889689(0x7f120e19, float:1.9414049E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.0z4 r0 = r6.A01
            if (r0 == 0) goto L_0x04d3
            java.lang.String r0 = r0.A0o()
            r1 = 0
            r2[r1] = r0
            android.text.Spanned r0 = X.AnonymousClass1EG.A01(r4, r2, r3)
            r5.A0S(r0)
            r5.A0T(r1)
            r1 = 2131889673(0x7f120e09, float:1.9414016E38)
            r0 = 37
            X.C73203Rj.A08(r5, r6, r0, r1)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 38
            X.4bA r0 = new X.4bA
            r0.<init>(r6, r1)
            r5.A0X(r0, r2)
            r5.A0C()
            return
        L_0x04d3:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x0783
        L_0x04d7:
            java.lang.Object r3 = r4.A01
            com.whatsapp.email.ReconfirmEmailBottomSheet r3 = (com.whatsapp.email.ReconfirmEmailBottomSheet) r3
            X.9uY r2 = r3.A03
            if (r2 == 0) goto L_0x04e9
            r1 = 0
            X.4mo r0 = new X.4mo
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x04e9:
            java.lang.String r0 = "emailVerificationXmppMethods"
            goto L_0x0783
        L_0x04ed:
            java.lang.Object r3 = r4.A01
            com.whatsapp.email.EmailVerifiedSecurityCheckActivity r3 = (com.whatsapp.email.EmailVerifiedSecurityCheckActivity) r3
            X.00H r0 = r3.A00
            if (r0 == 0) goto L_0x07b7
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity"
            r2.setClassName(r1, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r0 = r2.addFlags(r0)
            r3.startActivity(r0)
            r3.finish()
            return
        L_0x050f:
            java.lang.Object r0 = r4.A01
            com.whatsapp.email.EmailVerificationActivity r0 = (com.whatsapp.email.EmailVerificationActivity) r0
            com.whatsapp.email.EmailVerificationActivity.A03(r0)
            return
        L_0x0517:
            java.lang.Object r4 = r4.A01
            X.1pr r4 = (X.C37621pr) r4
            r3 = 1
            X.1pq r2 = r4.A08
            r1 = 87
            r0 = 0
            r2.A01(r0, r0, r3, r1)
            com.whatsapp.conversationslist.ConversationsFragment r1 = r4.A06
            r0 = 0
            com.whatsapp.conversationslist.ConversationsFragment.A0r(r1, r0, r0)
            return
        L_0x052b:
            java.lang.Object r1 = r4.A01
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            android.content.Context r3 = r1.A1n()
            X.00H r0 = r1.A3c
            r0.get()
            android.content.Context r0 = r1.A1n()
            android.content.Intent r2 = X.C72463Mc.A0G(r0)
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.InteropConversationsActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x054d:
            java.lang.Object r2 = r4.A01
            X.1pr r2 = (X.C37621pr) r2
            com.whatsapp.conversationslist.ConversationsFragment r1 = r2.A06
            r0 = 0
            com.whatsapp.conversationslist.ConversationsFragment.A0r(r1, r0, r0)
            X.1pq r3 = r2.A08
            r2 = 87
            r1 = 0
            r0 = 5
            r3.A01(r1, r1, r0, r2)
            return
        L_0x0561:
            java.lang.Object r0 = r4.A01
            X.3wY r0 = (X.C80103wY) r0
            android.view.ViewGroup r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x056d:
            java.lang.Object r2 = r4.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.00H r0 = r2.A5w
            java.lang.Object r0 = r0.get()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r1 = r0.A00()
            X.5cQ r0 = r2.A2Q
            r0.CMl(r1)
            return
        L_0x0583:
            java.lang.Object r5 = r4.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            X.12L r1 = r5.A3G
            X.1BI r0 = r5.A3R
            boolean r0 = X.C42761yh.A01(r1, r0)
            if (r0 != 0) goto L_0x05de
            X.0ve r1 = X.AnonymousClass3MX.A0h(r5)
            X.1BI r0 = r5.A3R
            boolean r0 = X.C43381zi.A01(r1, r0)
            if (r0 != 0) goto L_0x05de
            X.1BI r0 = r5.A3R
            boolean r0 = X.C22971Dz.A0S(r0)
            if (r0 != 0) goto L_0x05de
            X.1E7 r0 = r5.A35
            X.1BI r3 = r0.A0J
            r4 = 1
            r2 = 0
            if (r3 != 0) goto L_0x05b4
            X.190 r1 = r5.A0v
            java.lang.String r0 = "Chat Jid should not be null in GroupAdminPickerActivity"
            r1.A0G(r0, r2, r4)
        L_0x05b4:
            X.1EC r3 = X.AnonymousClass3MW.A0i(r3)
            if (r3 != 0) goto L_0x05c1
            X.190 r1 = r5.A0v
            java.lang.String r0 = "Group Jid should not be null in GroupAdminPickerActivity"
            r1.A0G(r0, r2, r4)
        L_0x05c1:
            X.1FY r0 = X.AnonymousClass3MW.A0P(r5)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAdminPickerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "gid"
            X.AnonymousClass3MY.A13(r2, r3, r0)
            X.5cQ r1 = r5.A2Q
            r0 = 42
            r1.startActivityForResult(r2, r0)
        L_0x05de:
            X.5cQ r1 = r5.A2Q
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x05e5:
            java.lang.Object r0 = r4.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.AnonymousClass4aY.A0q(r0)
            return
        L_0x05ed:
            java.lang.Object r0 = r4.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x05f3:
            java.lang.Object r0 = r4.A01
            X.BwW r0 = (X.C24163BwW) r0
            com.whatsapp.conversation.conversationrow.components.contextcard.GroupDescriptionAddUpsellViewModel r2 = r0.getViewModel()
            X.10I r1 = r2.A04
            r0 = 2
            X.C98834rn.A01(r1, r2, r0)
            return
        L_0x0602:
            java.lang.Object r0 = r4.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            r0.A20()
            return
        L_0x060a:
            java.lang.Object r3 = r4.A01
            X.73a r3 = (X.C1407773a) r3
            X.21V r2 = r3.A00
            X.22g r2 = (X.C441322g) r2
            X.70H r0 = r3.A0D
            X.77d r6 = r0.A01(r2)
            com.whatsapp.stickers.StickerView r1 = r3.A0E
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0621
            r1.A08()
        L_0x0621:
            X.205 r1 = r2.A0v
            X.1BI r0 = r1.A00
            java.lang.String r8 = X.C72463Mc.A0n(r0)
            boolean r9 = r1.A02
            X.6Ra r7 = X.C122606Ra.MESSAGE
            r4 = 0
            r10 = 0
            r5 = r4
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r1 = X.C124156Xg.A00(r4, r5, r6, r7, r8, r9, r10)
            android.view.View r0 = r3.A05
            android.content.Context r0 = r0.getContext()
            X.1FU r0 = X.AnonymousClass3MZ.A0P(r0)
            r0.CMl(r1)
            return
        L_0x0642:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 27
            if (r1 < r0) goto L_0x0651
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.performHapticFeedback(r0)
        L_0x0651:
            java.lang.Object r3 = r4.A01
            X.3uH r3 = (X.C79053uH) r3
            X.10I r2 = r3.A1X
            X.00H r0 = r3.A04
            java.lang.Object r1 = r0.get()
            r1.getClass()
            r0 = 24
            X.C98784ri.A00(r2, r1, r0)
            r3.A20()
            return
        L_0x0669:
            java.lang.String r0 = "conversation/row/ptv/downloadOnClickListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r2 = r4.A01
            X.3uH r2 = (X.C79053uH) r2
            android.view.animation.Interpolator r0 = X.C79053uH.A0d
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r1 = r2.A0Q
            r0 = 1
            r1.setPlayWhenReadyAndActive(r0)
            X.00H r0 = r2.A05
            X.16x r1 = X.AnonymousClass3MX.A0d(r0)
            X.206 r0 = r2.A0I
            X.21V r0 = (X.AnonymousClass21V) r0
            X.205 r0 = r0.A0v
            r1.A01 = r0
            r2.A2o()
            return
        L_0x068c:
            java.lang.Object r0 = r4.A01
            X.3uL r0 = (X.AnonymousClass3uL) r0
            X.1kd r2 = r0.A0V
            X.21V r1 = r0.getFMessage()
            r0 = 1
            r2.A08(r1, r0, r0)
            return
        L_0x069b:
            java.lang.Object r0 = r4.A01
            X.3uL r0 = (X.AnonymousClass3uL) r0
            r0.A2o()
            return
        L_0x06a3:
            java.lang.Object r0 = r4.A01
            X.3uE r0 = (X.AnonymousClass3uE) r0
            X.1iW r1 = r0.A0a
            X.21B r0 = r0.getFMessage()
            goto L_0x06b8
        L_0x06ae:
            java.lang.Object r0 = r4.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            X.1iW r1 = r0.A0a
            X.206 r0 = r0.A0I
            X.218 r0 = (X.AnonymousClass218) r0
        L_0x06b8:
            r1.A0l(r0)
            return
        L_0x06bc:
            java.lang.Object r4 = r4.A01
            X.3u7 r4 = (X.AnonymousClass3u7) r4
            X.0ve r2 = r4.A0F
            X.C18070vi.A0W(r2)
            r1 = 12555(0x310b, float:1.7593E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x06f1
            X.10I r3 = r4.A1X
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation-row-image-and-video-album-base-"
            r1.append(r0)
            X.206 r0 = r4.getFMessage()
            X.205 r0 = r0.A0v
            java.lang.String r0 = r0.A01
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            r1 = 15
            X.4ri r0 = new X.4ri
            r0.<init>((java.lang.Object) r4, (int) r1)
            r3.CGL(r0, r2)
            return
        L_0x06f1:
            X.AnonymousClass3u7.A01(r4)
            return
        L_0x06f5:
            java.lang.Object r4 = r4.A01
            X.3uR r4 = (X.C79093uR) r4
            android.content.Context r1 = r4.getContext()
            X.206 r0 = r4.getFMessage()
            X.205 r0 = r0.A0v
            android.os.Bundle r2 = X.AnonymousClass25A.A04(r0)
            r0 = 0
            android.content.Intent r1 = X.C72483Me.A0C(r1, r0)
            goto L_0x0728
        L_0x070d:
            java.lang.Object r4 = r4.A01
            X.3so r4 = (X.C78443so) r4
            X.73C r0 = r4.A0J
            r3 = 0
            if (r0 == 0) goto L_0x0731
            android.content.Context r1 = r4.getContext()
            X.206 r0 = r4.getFMessage()
            X.205 r0 = r0.A0v
            android.os.Bundle r2 = X.AnonymousClass25A.A04(r0)
            android.content.Intent r1 = X.C72483Me.A0C(r1, r3)
        L_0x0728:
            java.lang.String r0 = "vcard_message"
            r1.putExtra(r0, r2)
            X.AnonymousClass3MY.A11(r1, r4)
            return
        L_0x0731:
            java.lang.String r0 = "conversationrowcontact/onclicklistener/vcard is empty"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r1 = r4.A0S
            r0 = 2131890000(0x7f120f50, float:1.941468E38)
            r1.A08(r0, r3)
            return
        L_0x073f:
            com.whatsapp.crop.CropImage.A03(r5)
            return
        L_0x0743:
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r7.A04
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            boolean r0 = r7.A05
            r6 = 0
            r1.A0R(r6, r0)
            X.10I r5 = r7.A03
            X.17r r4 = r7.A00
            X.7Fe r0 = r2.A00
            X.6g9 r0 = r0.A05
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            r1 = 1
            X.4nM r0 = new X.4nM
            r0.<init>(r7, r1)
            X.6Lr r1 = new X.6Lr
            r1.<init>(r4, r0, r3, r2)
            java.lang.String[] r0 = new java.lang.String[r6]
            r5.CGD(r1, r0)
            return
        L_0x076c:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversation.EditMessageActivity r3 = (com.whatsapp.conversation.EditMessageActivity) r3
            X.3U2 r2 = r3.A0A
            if (r2 != 0) goto L_0x07c0
            java.lang.String r0 = "editMessageViewModel"
            goto L_0x0783
        L_0x0777:
            java.lang.Object r5 = r4.A01
            com.whatsapp.documentpicker.DocumentPickerActivity r5 = (com.whatsapp.documentpicker.DocumentPickerActivity) r5
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1BI r0 = r5.A0K
            if (r0 != 0) goto L_0x0788
            java.lang.String r0 = "chatJid"
        L_0x0783:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0788:
            X.1EC r4 = X.C42941yz.A00(r0)
            if (r4 == 0) goto L_0x07bd
            X.1kb r0 = r5.A05
            if (r0 == 0) goto L_0x07ba
            X.1EC r3 = r0.A05(r4)
            if (r3 == 0) goto L_0x07bd
            X.1LU r0 = r5.A0J
            if (r0 == 0) goto L_0x07b7
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.communitymedia.CommunityMediaActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "parent_jid"
            X.AnonymousClass3MY.A12(r2, r3, r0)
            java.lang.String r0 = "forward_from_subgroup_jid"
            X.AnonymousClass3MY.A12(r2, r4, r0)
            r5.startActivity(r2)
            return
        L_0x07b7:
            java.lang.String r0 = "waIntents"
            goto L_0x0783
        L_0x07ba:
            java.lang.String r0 = "communityChatManager"
            goto L_0x0783
        L_0x07bd:
            java.lang.String r0 = "DocumentPickerActivity/openCommunityMedia/parentJid is null"
            goto L_0x07f1
        L_0x07c0:
            X.3TA r1 = r2.A08
            java.lang.String r0 = r1.A0A
            r1.A0b(r0)
            r0 = 1
            r2.A02 = r0
            r0 = 8
            com.whatsapp.conversation.EditMessageActivity.A0V(r3, r0)
            return
        L_0x07d0:
            java.lang.String r0 = "streamdownload/unable to open playback"
            goto L_0x07f1
        L_0x07d3:
            java.lang.Object r5 = r4.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            X.4OV r0 = X.AnonymousClass3MY.A0T(r5)
            X.00H r0 = r0.A03
            r0.get()
            X.AEW r0 = r5.A1t
            if (r0 == 0) goto L_0x08af
            boolean r1 = r0.A0a
            r0 = 1
            if (r1 != r0) goto L_0x08af
            X.1FY r3 = X.AnonymousClass3MW.A0Q(r5)
            if (r3 != 0) goto L_0x07f5
            java.lang.String r0 = "activeCartButtonOnClickListener/onOneClick: null activity."
        L_0x07f1:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x07f5:
            com.whatsapp.jid.UserJid r0 = r5.A3S
            if (r0 == 0) goto L_0x0887
            X.00H r0 = r5.A63
            java.lang.Object r0 = r0.get()
            X.4Ma r0 = (X.C85084Ma) r0
            com.whatsapp.jid.UserJid r2 = r5.A3S
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            X.44c r0 = r0.A00
            java.lang.Object r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x0887
            X.00H r0 = r5.A63
            java.lang.Object r0 = r0.get()
            X.4Ma r0 = (X.C85084Ma) r0
            com.whatsapp.jid.UserJid r5 = r5.A3S
            X.C18070vi.A0d(r5, r1)
            X.44c r0 = r0.A00
            java.lang.Object r4 = r0.A02(r5)
            X.4V3 r4 = (X.AnonymousClass4V3) r4
            if (r4 != 0) goto L_0x0829
            java.lang.String r0 = "ShoppingFlowsCartLauncher/launchCart: cannot find context to launch shopping flow cart"
            goto L_0x07f1
        L_0x0829:
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.flows.webview.WaFlowsWebViewBottomsheetModalActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = "business_jid"
            java.lang.String r0 = r5.user
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "chat_id"
            java.lang.String r0 = r5.getRawString()
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "flow_message_version"
            java.lang.String r0 = "3"
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "flow_id"
            java.lang.String r0 = r4.A03
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "flow_token"
            java.lang.String r0 = r4.A04
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "flow_action"
            java.lang.String r0 = r4.A01
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "flow_action_payload"
            java.lang.String r0 = r4.A02
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "surface_request"
            java.lang.String r0 = "fab_shopping"
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r1 = "message_id"
            java.lang.String r0 = r4.A05
            android.content.Intent r0 = r2.putExtra(r1, r0)
            X.C18070vi.A0X(r0)
            r3.startActivity(r0)
            return
        L_0x0887:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "business jid is "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r5.A3S
            if (r0 == 0) goto L_0x08ac
            java.lang.String r0 = "not null"
        L_0x0896:
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "activeCartButtonOnClickListener/onOneClick: cannot start shopping cart. [Debug info]: "
            X.C17900vP.A0e(r0, r3, r1)
            X.190 r2 = r5.A0v
            java.lang.String r1 = "FailedToLaunchFlowsCart"
            r0 = 1
            r2.A0G(r1, r3, r0)
            return
        L_0x08ac:
            java.lang.String r0 = "null."
            goto L_0x0896
        L_0x08af:
            X.1E7 r0 = r5.A35
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0x(r0)
            X.A8Q r6 = X.C72463Mc.A0Z(r5)
            java.lang.String r2 = r5.A6U
            java.lang.String r1 = r5.A6R
            r0 = 7
            r6.A08(r0, r2, r1)
            X.A8Q r2 = X.C72463Mc.A0Z(r5)
            X.A7D r1 = new X.A7D
            r1.<init>()
            X.A8Q r0 = X.C72463Mc.A0Z(r5)
            java.lang.String r0 = r0.A03
            r1.A0B = r0
            X.A8Q r0 = X.C72463Mc.A0Z(r5)
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0D
            int r0 = r0.get()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            X.A8Q r0 = X.C72463Mc.A0Z(r5)
            java.lang.String r0 = r0.A01
            r1.A0E = r0
            X.A8Q r0 = X.C72463Mc.A0Z(r5)
            java.lang.String r0 = r0.A02
            r1.A0F = r0
            X.A8Q r0 = X.C72463Mc.A0Z(r5)
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0E
            int r0 = r0.getAndIncrement()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r1.A09 = r0
            r0 = 42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A06 = r0
            r1.A00 = r3
            r2.A09(r1)
            X.10I r2 = X.AnonymousClass3MX.A0w(r5)
            r1 = 32
            X.4rj r0 = new X.4rj
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.CGF(r0)
            r1 = 0
            r0 = 4
            r4 = 0
            X.C18070vi.A0d(r3, r4)
            com.whatsapp.biz.cart.view.fragment.CartFragment r3 = X.AnonymousClass9PJ.A00(r3, r1, r0)
            X.4OV r0 = X.AnonymousClass3MY.A0T(r5)
            X.00H r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.4Ww r2 = (X.C87764Ww) r2
            X.1Fw r1 = r3.A0L
            X.C18070vi.A0d(r1, r4)
            r0 = 1
            r2.A02 = r0
            X.4fc r0 = new X.4fc
            r0.<init>(r1, r2)
            r1.A05(r0)
            X.1FY r1 = X.AnonymousClass3MW.A0P(r5)
            java.lang.String r0 = "active_cart_fragment"
            r1.CMm(r3, r0)
            return
        L_0x094d:
            long r15 = r1.A00
            android.app.Activity r3 = X.AnonymousClass3Ma.A05(r5)
            X.AnonymousClass3MW.A1W(r3)
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.00H r0 = r5.A2C
            java.lang.Object r1 = r0.get()
            X.1nj r1 = (X.C36341nj) r1
            r4 = 0
            X.C18070vi.A0d(r3, r4)
            java.lang.ref.WeakReference r21 = X.AnonymousClass3MW.A0z(r3)
            X.00H r6 = r1.A09
            java.lang.Object r0 = r6.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r5 = r0.A02
            r2 = 3877(0xf25, float:5.433E-42)
            X.0vf r0 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r0, r5, r2)
            r0 = 1
            if (r2 != r0) goto L_0x098e
            X.00H r0 = r1.A04
            java.lang.Object r1 = r0.get()
            X.4YQ r1 = (X.AnonymousClass4YQ) r1
            X.C18070vi.A0X(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1.A02(r3, r0)
            return
        L_0x098e:
            boolean r0 = X.C72453Mb.A1X(r6)
            if (r0 != 0) goto L_0x09a6
            X.00H r0 = r1.A04
            java.lang.Object r2 = r0.get()
            X.4YQ r2 = (X.AnonymousClass4YQ) r2
            X.C18070vi.A0X(r2)
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2.A01(r3, r1, r0, r4)
            return
        L_0x09a6:
            X.00H r0 = r1.A0E
            java.lang.Object r2 = r0.get()
            X.749 r2 = (X.AnonymousClass749) r2
            r8 = 0
            java.lang.String r12 = "NewsletterLinkLauncher"
            java.lang.String r13 = "admin_invite_tos"
            r14 = 12
            r10 = r8
            X.6tw r6 = new X.6tw
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.35B r5 = new X.35B
            r17 = r5
            r18 = r7
            r19 = r1
            r20 = r11
            r22 = r15
            r17.<init>(r18, r19, r20, r21, r22)
            X.00H r0 = r2.A0A
            java.lang.Object r1 = r0.get()
            X.A6Q r1 = (X.A6Q) r1
            r0 = 11
            java.lang.Integer r4 = r1.A03(r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.0vl r0 = r2.A0H
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x09f0
            r2.A01 = r6
            int r1 = X.AnonymousClass749.A01(r2, r1)
            r0 = 66004(0x101d4, float:9.2491E-41)
            X.AnonymousClass749.A03(r3, r2, r1, r0)
            return
        L_0x09f0:
            X.AnonymousClass749.A02(r3, r5, r2, r1, r4)
            return
        L_0x09f4:
            X.21V r0 = r4.getFMessage()
            boolean r0 = X.AnonymousClass4H3.A00(r0)
            if (r0 != 0) goto L_0x0a05
            X.1hs r1 = r4.A05
            r0 = 1
            r1.A07(r3, r0)
            return
        L_0x0a05:
            X.1hB r2 = r4.A06
            r1 = 0
            r0 = 1
            X.C32431hB.A06(r2, r3, r0, r1, r1)
            r4.A0A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C825048f.A04(android.view.View):void");
    }
}
