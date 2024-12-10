package X;

/* renamed from: X.4fz  reason: invalid class name and case insensitive filesystem */
public class C91624fz implements C22851Dl {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: type inference failed for: r2v3, types: [com.whatsapp.companiondevice.Hilt_WifiSpeedBumpDialogFragment, com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x045f, code lost:
        r1.BhQ(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0462, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04d0, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0540, code lost:
        X.AnonymousClass3XP.A00(r0);
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0546, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x070a, code lost:
        if (X.AnonymousClass72Y.A01(r3.A0U, r3.A0F, r3.A0H) == null) goto L_0x070c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0948, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x094b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r15) {
        /*
            r14 = this;
            r9 = r15
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0877;
                case 1: goto L_0x051f;
                case 2: goto L_0x04e7;
                case 3: goto L_0x086d;
                case 4: goto L_0x0850;
                case 5: goto L_0x0835;
                case 6: goto L_0x082b;
                case 7: goto L_0x04d4;
                case 8: goto L_0x0547;
                case 9: goto L_0x0823;
                case 10: goto L_0x0819;
                case 11: goto L_0x04ad;
                case 12: goto L_0x0497;
                case 13: goto L_0x0463;
                case 14: goto L_0x07fd;
                case 15: goto L_0x07f3;
                case 16: goto L_0x0451;
                case 17: goto L_0x0420;
                case 18: goto L_0x07e3;
                case 19: goto L_0x0412;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03c5;
                case 22: goto L_0x03a6;
                case 23: goto L_0x0390;
                case 24: goto L_0x07d7;
                case 25: goto L_0x07bf;
                case 26: goto L_0x076d;
                case 27: goto L_0x075d;
                case 28: goto L_0x06db;
                case 29: goto L_0x0695;
                case 30: goto L_0x068d;
                case 31: goto L_0x0672;
                case 32: goto L_0x036f;
                case 33: goto L_0x0361;
                case 34: goto L_0x0332;
                case 35: goto L_0x01eb;
                case 36: goto L_0x05bf;
                case 37: goto L_0x05b7;
                case 38: goto L_0x05ab;
                case 39: goto L_0x01d8;
                case 40: goto L_0x01bb;
                case 41: goto L_0x0177;
                case 42: goto L_0x00c0;
                case 43: goto L_0x058c;
                case 44: goto L_0x0089;
                case 45: goto L_0x0079;
                case 46: goto L_0x0063;
                case 47: goto L_0x001d;
                case 48: goto L_0x0582;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r14.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            com.whatsapp.conversation.ConversationListView r3 = r0.A2B
            X.1BI r2 = r0.A3R
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 31
            X.7Pi r0 = new X.7Pi
            r0.<init>(r3, r2, r1)
            r3.post(r0)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r5 = r14.A01
            X.4aY r5 = (X.AnonymousClass4aY) r5
            X.C73103Oz.A00(r5)
            com.whatsapp.mentions.MentionableEntry r2 = r5.A3Z
            if (r2 == 0) goto L_0x0044
            X.1Ps r0 = X.C72483Me.A0S(r5)
            X.1BI r1 = r5.A3R
            X.1Pk r0 = r0.A00
            boolean r4 = r0.A01(r1)
            com.whatsapp.mentions.MentionPickerView r3 = r2.A0D
            if (r3 == 0) goto L_0x0044
            X.10I r2 = r3.A0K
            r1 = 13
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r3, (boolean) r4)
            r2.CGN(r0)
        L_0x0044:
            X.4Rn r0 = r5.A2G
            java.lang.Class<X.3ry> r1 = X.C78013ry.class
            X.4XJ r0 = r0.A00
            X.4rI r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0059
            X.AnonymousClass4aY.A1G(r5)
        L_0x0059:
            boolean r0 = r5.A6n
            if (r0 == 0) goto L_0x001c
            X.5cQ r0 = r5.A2Q
            r0.invalidateOptionsMenu()
            return
        L_0x0063:
            java.lang.Object r0 = r14.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            com.whatsapp.conversation.ConversationListView r1 = r0.A2B
            X.1BI r0 = r0.A3R
            X.C18070vi.A0h(r15, r0)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x001c
            r0 = 5
            X.C98774rh.A00(r1, r0)
            return
        L_0x0079:
            java.lang.Object r1 = r14.A01
            com.whatsapp.StarRatingBar r1 = (com.whatsapp.StarRatingBar) r1
            java.lang.Number r9 = (java.lang.Number) r9
            if (r9 == 0) goto L_0x001c
            int r0 = r9.intValue()
            r1.setRating(r0)
            return
        L_0x0089:
            java.lang.Object r2 = r14.A01
            X.3vF r2 = (X.C79333vF) r2
            int r1 = X.AnonymousClass000.A0M(r15)
            X.5cH r0 = r2.A04
            r0.notifyDataSetChanged()
            if (r1 == 0) goto L_0x001c
            X.0ve r8 = r2.A0E
            X.1KW r7 = r2.A0D
            X.0vb r6 = r2.A00
            X.2hW r0 = r2.A02
            X.3vQ r3 = r0.A00(r2)
            X.4lk r4 = new X.4lk
            r4.<init>()
            X.00H r0 = r2.A0I
            java.lang.Object r5 = r0.get()
            X.4Wb r5 = (X.C87564Wb) r5
            r10 = 2
            X.3vg r1 = new X.3vg
            r9 = r2
            r1.<init>((X.AnonymousClass1FY) r2, (X.AnonymousClass5ZZ) r3, (X.C107265Za) r4, (X.C87564Wb) r5, (X.C18000vb) r6, (X.AnonymousClass1KW) r7, (X.C18030ve) r8, (java.lang.Object) r9, (int) r10)
            X.02B r0 = r2.COJ(r1)
            r2.setSelectionActionMode(r0)
            return
        L_0x00c0:
            java.lang.Object r6 = r14.A01
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r6 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r6
            int r1 = X.AnonymousClass000.A0M(r15)
            X.3Ot r0 = r6.A0A
            if (r1 != 0) goto L_0x00d0
            r0.notifyDataSetChanged()
            return
        L_0x00d0:
            r0.notifyDataSetChanged()
            r5 = 2
            if (r1 != r5) goto L_0x089a
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r6.A09
            X.1DT r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            X.4S9 r0 = (X.AnonymousClass4S9) r0
            if (r0 == 0) goto L_0x001c
            java.util.Collection r0 = r0.A00()
            if (r0 == 0) goto L_0x001c
            X.206 r0 = X.AnonymousClass3MX.A0s(r0)
            if (r0 == 0) goto L_0x001c
            X.205 r3 = r0.A0v
            android.widget.ListView r0 = r6.A02
            int r2 = r0.getChildCount()
            r1 = 0
        L_0x00f7:
            if (r1 >= r2) goto L_0x001c
            android.widget.ListView r0 = r6.A02
            android.view.View r4 = r0.getChildAt(r1)
            boolean r0 = r4 instanceof X.AnonymousClass3uP
            if (r0 == 0) goto L_0x0174
            X.3uP r4 = (X.AnonymousClass3uP) r4
            boolean r0 = r4.A2h(r3)
            if (r0 == 0) goto L_0x0174
            android.view.View r1 = r4.A0j
            androidx.appcompat.widget.Toolbar r0 = r6.A03
            if (r1 == 0) goto L_0x0172
            if (r0 == 0) goto L_0x0172
            int[] r2 = new int[r5]
            r1.getLocationInWindow(r2)
            int[] r1 = new int[r5]
            r0.getLocationInWindow(r1)
            r0 = 1
            r10 = r2[r0]
            r0 = r1[r0]
            int r10 = r10 - r0
        L_0x0123:
            android.view.View r1 = r6.A01
            X.0vb r0 = r6.A00
            int r11 = X.C42491yG.A01(r1, r0)
            int r2 = r4.getPaddingStart()
            int r1 = r4.getPaddingEnd()
            android.os.Bundle r9 = X.C17880vN.A0D()
            r4.A27(r9)
            r0 = 0
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r2, r0, r1, r0)
            X.4kt r0 = r6.A00
            X.4SX r0 = r0.A0M
            X.5c7 r1 = r0.A01
            r12 = 0
            X.C18070vi.A0d(r1, r12)
            java.util.Map r0 = r0.A0H
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r13 = X.C72463Mc.A0B(r0)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.selection.SingleSelectedMessageActivity"
            android.content.Intent r7 = r2.setClassName(r1, r0)
            X.AnonymousClass4aU.A00(r7, r3)
            X.AnonymousClass1LU.A1r(r7, r8, r9, r10, r11, r12, r13)
            X.1L9 r1 = r6.A01
            r0 = 906(0x38a, float:1.27E-42)
            r1.A0D(r6, r7, r0)
            return
        L_0x0172:
            r10 = 0
            goto L_0x0123
        L_0x0174:
            int r1 = r1 + 1
            goto L_0x00f7
        L_0x0177:
            java.lang.Object r2 = r14.A01
            X.4kt r2 = (X.C94604kt) r2
            X.4S9 r9 = (X.AnonymousClass4S9) r9
            com.whatsapp.conversation.conversationrow.MessageSelectionViewModel r0 = r2.A0K
            if (r0 == 0) goto L_0x001c
            X.1DT r0 = r0.A01
            java.lang.Object r0 = r0.A06()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0191
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x001c
        L_0x0191:
            if (r9 == 0) goto L_0x08de
            java.util.HashMap r1 = r9.A03
            int r0 = r1.size()
            if (r0 == 0) goto L_0x08de
            int r1 = r1.size()
            r0 = 1
            if (r1 <= r0) goto L_0x01b3
            X.5c6 r0 = r2.A0J
            boolean r0 = r0.Bg6()
            if (r0 == 0) goto L_0x01b3
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r2.A0p
            X.C17960vV.A07(r1)
            r0 = 0
            r1.A0T(r0)
        L_0x01b3:
            X.02B r0 = r2.A00
            if (r0 == 0) goto L_0x001c
            r0.A06()
            return
        L_0x01bb:
            java.lang.Object r1 = r14.A01
            X.4kt r1 = (X.C94604kt) r1
            int r0 = X.AnonymousClass000.A0M(r15)
            if (r0 != 0) goto L_0x001c
            X.02B r0 = r1.A00
            if (r0 == 0) goto L_0x01cf
            r0.A05()
            r0 = 0
            r1.A00 = r0
        L_0x01cf:
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r1.A0p
            if (r1 == 0) goto L_0x001c
            r0 = 0
            r1.A0T(r0)
            return
        L_0x01d8:
            java.lang.Object r1 = r14.A01
            X.4kt r1 = (X.C94604kt) r1
            boolean r0 = X.AnonymousClass000.A1Y(r15)
            if (r0 == 0) goto L_0x001c
            X.1FY r1 = X.C94604kt.A00(r1)
            r0 = 2131892541(0x7f12193d, float:1.9419833E38)
            goto L_0x045f
        L_0x01eb:
            java.lang.Object r1 = r14.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            X.4Ow r9 = (X.C85824Ow) r9
            if (r9 == 0) goto L_0x001c
            int r5 = r9.A02
            r3 = 8
            r2 = 0
            if (r5 == 0) goto L_0x08e2
            r4 = 1
            if (r5 == r4) goto L_0x02f3
            r0 = 2
            if (r5 != r0) goto L_0x001c
            X.5c7 r0 = r1.A0l
            boolean r0 = r0.CN7()
            if (r0 == 0) goto L_0x02cc
            r0 = 2131429610(0x7f0b08ea, float:1.8480898E38)
            android.view.View r3 = r1.findViewById(r0)
        L_0x020f:
            r5 = 0
            android.content.Context r8 = X.AnonymousClass3MX.A04(r3, r1, r5)
            r7 = 2131894804(0x7f122214, float:1.9424423E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = r9.A05
            java.lang.String r0 = X.C17880vN.A0q(r8, r0, r6, r5, r7)
            r3.setContentDescription(r0)
            boolean r0 = r1.A2X()
            if (r0 == 0) goto L_0x02c7
            r0 = 41
            X.AnonymousClass48m.A00(r3, r1, r0)
        L_0x022d:
            boolean r0 = r3 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x02be
            r6 = r3
            android.widget.ImageView r6 = (android.widget.ImageView) r6
        L_0x0234:
            boolean r0 = r3 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x02bc
            r0 = 2131431287(0x7f0b0f77, float:1.8484299E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r3, r0)
        L_0x023f:
            android.graphics.Bitmap r0 = r9.A03
            if (r0 == 0) goto L_0x0254
            r6.setBackground(r2)
            r6.setImageBitmap(r0)
        L_0x0249:
            if (r3 == 0) goto L_0x001c
            r0 = 8
            r3.setVisibility(r0)
            r6.setVisibility(r5)
            return
        L_0x0254:
            if (r3 == 0) goto L_0x0282
            java.lang.String r7 = r9.A06
            if (r7 == 0) goto L_0x0282
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.graphics.drawable.GradientDrawable r2 = (android.graphics.drawable.GradientDrawable) r2
            if (r2 == 0) goto L_0x0267
            int r0 = r9.A00
            r2.setColor(r0)
        L_0x0267:
            r3.setText(r7)
            X.1VW r0 = r1.A0i
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0279
            int r0 = r9.A01
            if (r0 == 0) goto L_0x0279
            r3.setTextColor(r0)
        L_0x0279:
            r3.setVisibility(r5)
            r0 = 8
            r6.setVisibility(r0)
            return
        L_0x0282:
            X.1VU r7 = r1.A14
            int r2 = r9.A00
            X.1z7 r0 = new X.1z7
            r0.<init>()
            android.graphics.drawable.Drawable r0 = r7.A02(r0, r2)
            r6.setBackground(r0)
            X.1VW r0 = r1.A0i
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x02ba
            int r0 = r9.A01
            if (r0 == 0) goto L_0x02ba
        L_0x029e:
            android.content.Context r1 = r1.getContext()
            r0 = 2131231048(0x7f080148, float:1.8078166E38)
            if (r4 == 0) goto L_0x02aa
            r0 = 2131233521(0x7f080af1, float:1.8083182E38)
        L_0x02aa:
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3MX.A06(r1, r0)
            if (r4 == 0) goto L_0x02b6
            int r0 = r9.A01
            android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A08(r1, r0)
        L_0x02b6:
            r6.setImageDrawable(r1)
            goto L_0x0249
        L_0x02ba:
            r4 = 0
            goto L_0x029e
        L_0x02bc:
            r3 = r2
            goto L_0x023f
        L_0x02be:
            r0 = 2131431288(0x7f0b0f78, float:1.84843E38)
            android.widget.ImageView r6 = X.AnonymousClass3MW.A0H(r3, r0)
            goto L_0x0234
        L_0x02c7:
            r3.setOnClickListener(r2)
            goto L_0x022d
        L_0x02cc:
            android.util.Pair r0 = r1.A04
            if (r0 == 0) goto L_0x02d8
            java.lang.Object r3 = r0.first
            if (r3 == 0) goto L_0x02d8
            android.view.View r3 = (android.view.View) r3
            goto L_0x020f
        L_0x02d8:
            android.view.LayoutInflater r3 = X.AnonymousClass3MZ.A0D(r1)
            r0 = 2131625522(0x7f0e0632, float:1.8878254E38)
            android.view.View r3 = X.AnonymousClass3MX.A09(r3, r1, r0)
            r1.addView(r3)
            X.AnonymousClass3uP.A0W(r3, r1)
            int r0 = r1.A02
            android.util.Pair r0 = X.C17890vO.A0F(r3, r0)
            r1.A04 = r0
            goto L_0x020f
        L_0x02f3:
            X.5c7 r0 = r1.A0l
            boolean r0 = r0.CN7()
            if (r0 == 0) goto L_0x0321
            r0 = 2131429610(0x7f0b08ea, float:1.8480898E38)
            android.view.View r1 = r1.findViewById(r0)
        L_0x0302:
            if (r1 == 0) goto L_0x001c
            r1.setVisibility(r3)
            r1.setOnClickListener(r2)
            boolean r0 = r1 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0319
            android.widget.ImageView r1 = (android.widget.ImageView) r1
        L_0x0310:
            if (r1 == 0) goto L_0x001c
            r1.setBackground(r2)
            r1.setImageDrawable(r2)
            return
        L_0x0319:
            r0 = 2131431288(0x7f0b0f78, float:1.84843E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0H(r1, r0)
            goto L_0x0310
        L_0x0321:
            android.util.Pair r0 = r1.A04
            if (r0 != 0) goto L_0x032d
            int r0 = r1.A02
            android.util.Pair r0 = X.C17890vO.A0F(r2, r0)
            r1.A04 = r0
        L_0x032d:
            java.lang.Object r1 = r0.first
            android.view.View r1 = (android.view.View) r1
            goto L_0x0302
        L_0x0332:
            java.lang.Object r2 = r14.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.1A3 r9 = (X.AnonymousClass1A3) r9
            java.lang.Object r0 = r9.A00
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r9.A00()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r9.A00()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r0)
            if (r0 == 0) goto L_0x001c
            com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment r1 = new com.whatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment
            r1.<init>()
            android.os.Bundle r0 = X.C72473Md.A0H(r0)
            r1.A1R(r0)
            r0 = 0
            r2.CMk(r1, r0)
            return
        L_0x0361:
            java.lang.Object r0 = r14.A01
            X.4rI r0 = (X.C98524rI) r0
            X.206 r9 = (X.AnonymousClass206) r9
            if (r9 == 0) goto L_0x001c
            X.5cS r0 = r0.A01
            r0.CH3(r9)
            return
        L_0x036f:
            java.lang.Object r3 = r14.A01
            X.3ru r3 = (X.C77973ru) r3
            X.4Tu r9 = (X.C86974Tu) r9
            boolean r0 = r3.A09()
            if (r0 == 0) goto L_0x001c
            com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator r2 = r3.A00
            if (r2 == 0) goto L_0x001c
            int r1 = r9.A01
            r0 = 1
            if (r1 > r0) goto L_0x0389
            r0 = 4
        L_0x0385:
            r2.setVisibility(r0)
            return
        L_0x0389:
            r2.setupIndicator(r9)
            com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator r2 = r3.A00
            r0 = 0
            goto L_0x0385
        L_0x0390:
            java.lang.Object r2 = r14.A01
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r2 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r2
            java.lang.Number r9 = (java.lang.Number) r9
            android.app.ProgressDialog r0 = r2.A00
            if (r9 != 0) goto L_0x0901
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x001c
            android.app.ProgressDialog r0 = r2.A00
            goto L_0x04d0
        L_0x03a6:
            java.lang.Object r5 = r14.A01
            X.1FL r5 = (X.AnonymousClass1FL) r5
            if (r15 == 0) goto L_0x001c
            r4 = 0
            com.whatsapp.LegacyMessageDialogFragment r3 = new com.whatsapp.LegacyMessageDialogFragment
            r3.<init>()
            r2 = 2131888732(0x7f120a5c, float:1.9412108E38)
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "message_res"
            r1.putInt(r0, r2)
            r3.A1R(r1)
            X.AnonymousClass3MY.A1H(r3, r5, r4)
            return
        L_0x03c5:
            java.lang.Object r4 = r14.A01
            android.content.Context r4 = (android.content.Context) r4
            if (r15 == 0) goto L_0x001c
            X.3Rj r3 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131891908(0x7f1216c4, float:1.941855E38)
            r3.A0D(r0)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 0
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.A00
            r0.A0J(r1, r2)
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 9
            X.4bA r0 = new X.4bA
            r0.<init>(r4, r1)
            r3.A0L(r0, r2)
            r3.A0C()
            return
        L_0x03f7:
            java.lang.Object r3 = r14.A01
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x001c
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L_0x001c
            X.1KB r2 = r3.A05
            r1 = 2131891915(0x7f1216cb, float:1.9418564E38)
            r0 = 1
            r2.A08(r1, r0)
            r3.finish()
            return
        L_0x0412:
            java.lang.Object r0 = r14.A01
            X.4RW r0 = (X.AnonymousClass4RW) r0
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x001c
            X.5Z3 r0 = r0.A04
            r0.CQe(r9)
            return
        L_0x0420:
            java.lang.Object r2 = r14.A01
            X.4RW r2 = (X.AnonymousClass4RW) r2
            X.1FY r0 = r2.A02
            X.1GP r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "wifi_speed_bump_dialog"
            androidx.fragment.app.Fragment r1 = r1.A0Q(r0)
            boolean r0 = r1 instanceof com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment
            if (r0 == 0) goto L_0x001c
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            if (r1 == 0) goto L_0x001c
            android.app.Dialog r0 = r1.A03
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x001c
            r1.A28()
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r2.A03
            X.3xb r0 = r2.A05
            boolean r0 = r0.A05()
            r1.A0W(r0)
            return
        L_0x0451:
            java.lang.Object r0 = r14.A01
            X.4RW r0 = (X.AnonymousClass4RW) r0
            java.lang.Number r9 = (java.lang.Number) r9
            if (r9 == 0) goto L_0x001c
            X.1FY r1 = r0.A02
            int r0 = r9.intValue()
        L_0x045f:
            r1.BhQ(r0)
            return
        L_0x0463:
            java.lang.Object r5 = r14.A01
            X.4RW r5 = (X.AnonymousClass4RW) r5
            if (r15 == 0) goto L_0x001c
            X.10I r1 = r5.A07
            r0 = 36
            X.C98764rg.A00(r1, r5, r0)
            r4 = 0
            r3 = 0
            r2 = 1
            X.1FY r1 = r5.A02
            r0 = 2131891660(0x7f1215cc, float:1.9418046E38)
            java.lang.String r2 = X.C17890vO.A0R(r1, r15, r2, r3, r0)
            r0 = 2131891659(0x7f1215cb, float:1.9418044E38)
            java.lang.String r0 = r1.getString(r0)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r1)
            r1.A0k(r2)
            r1.A0S(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r1.A0Z(r4, r0)
            r1.A0C()
            return
        L_0x0497:
            java.lang.Object r0 = r14.A01
            X.4RW r0 = (X.AnonymousClass4RW) r0
            X.0yx r9 = (X.C19760yx) r9
            if (r9 == 0) goto L_0x001c
            X.1FY r2 = r0.A02
            java.lang.Object r1 = r9.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r9.A01
            java.lang.String r0 = (java.lang.String) r0
            r2.BhS(r1, r0)
            return
        L_0x04ad:
            java.lang.Object r3 = r14.A01
            X.4RW r3 = (X.AnonymousClass4RW) r3
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x001c
            boolean r1 = r9.booleanValue()
            android.app.ProgressDialog r0 = r3.A00
            if (r1 == 0) goto L_0x04c6
            if (r0 == 0) goto L_0x0929
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0929
            return
        L_0x04c6:
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x001c
            android.app.ProgressDialog r0 = r3.A00
        L_0x04d0:
            r0.dismiss()
            return
        L_0x04d4:
            java.lang.Object r1 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesActivity r1 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r1
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x001c
            if (r9 == 0) goto L_0x001c
            X.3XP r0 = r1.A07
            r0.A01 = r9
            goto L_0x0540
        L_0x04e7:
            java.lang.Object r5 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesActivity r5 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r5
            int r1 = r5.A00
            r0 = 5
            if (r1 != r0) goto L_0x001c
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x001c
            r0 = 1
            r5.A0K = r0
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r4 = r5.A09
            X.4RW r0 = r5.A0A
            X.3xb r0 = r0.A05
            boolean r3 = r0.A05()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r5.A0B
            int r2 = r0.A0T()
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r5.A0B
            X.00H r0 = r0.A09
            java.lang.Object r0 = r0.get()
            X.1HV r0 = (X.AnonymousClass1HV) r0
            X.18O r1 = r0.A00
            X.18Q r0 = X.AnonymousClass18O.A0r
            int r1 = r1.A04(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r4.A0U(r0, r2, r1, r3)
            return
        L_0x051f:
            java.lang.Object r2 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesActivity r2 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r2
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x001c
            java.util.List r0 = java.util.Collections.emptyList()
            com.whatsapp.companiondevice.LinkedDevicesActivity.A03(r2, r0)
            java.util.List r1 = java.util.Collections.emptyList()
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x001c
            if (r1 == 0) goto L_0x001c
            X.3XP r0 = r2.A07
            r0.A01 = r1
        L_0x0540:
            X.AnonymousClass3XP.A00(r0)
            r0.notifyDataSetChanged()
            return
        L_0x0547:
            java.lang.Object r3 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r3 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r3
            X.00H r0 = r3.A0G
            java.lang.Object r0 = r0.get()
            X.1xp r0 = (X.C42221xp) r0
            X.0ve r2 = r0.A00
            r1 = 2459(0x99b, float:3.446E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0571
            X.0zA r1 = r3.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0571
            r1.A03()
            java.lang.String r0 = "endPerfTracker"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0571:
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A0V(r3)
            X.4MB r0 = r3.A04
            X.0zA r0 = r0.A00
            r0.A03()
            java.lang.String r0 = "getSetDeviceNameActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0582:
            java.lang.Object r0 = r14.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.4SW r9 = (X.AnonymousClass4SW) r9
            X.AnonymousClass4aY.A1R(r0, r9)
            return
        L_0x058c:
            java.lang.Object r2 = r14.A01
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            X.4TU r9 = (X.AnonymousClass4TU) r9
            java.util.List r1 = r2.A0b
            r1.clear()
            java.util.List r0 = r9.A01
            r1.addAll(r0)
            long r0 = r9.A00
            r2.A00 = r0
            android.widget.BaseAdapter r0 = r2.A01
            if (r0 == 0) goto L_0x05a7
            r0.notifyDataSetChanged()
        L_0x05a7:
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity.A03(r2)
            return
        L_0x05ab:
            java.lang.Object r1 = r14.A01
            X.5c6 r1 = (X.C108665c6) r1
            int r0 = X.AnonymousClass000.A0M(r15)
            r1.C2U(r0)
            return
        L_0x05b7:
            java.lang.Object r0 = r14.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CEx()
            return
        L_0x05bf:
            java.lang.Object r3 = r14.A01
            X.3uH r3 = (X.C79053uH) r3
            X.1DT r0 = r3.A0O
            r0.A0F(r15)
            X.206 r0 = r3.A0I
            boolean r1 = r3.A07
            X.205 r0 = r0.A0v
            boolean r0 = r0.equals(r15)
            r3.A07 = r0
            if (r0 == r1) goto L_0x0612
            if (r0 == 0) goto L_0x0616
            if (r1 != 0) goto L_0x0616
            X.00H r0 = r3.A05
            X.16x r0 = X.AnonymousClass3MX.A0d(r0)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0616
            X.00H r0 = r3.A06
            java.lang.Object r1 = r0.get()
            X.4Ol r1 = (X.C85714Ol) r1
            r0 = 1
            r1.A05 = r0
            android.content.Context r5 = r3.getContext()
            X.1KB r7 = r3.A0S
            X.10I r6 = r3.A1X
            X.00H r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.4Ol r0 = (X.C85714Ol) r0
            int r9 = r0.A00
            r0 = 25
            X.4ri r8 = new X.4ri
            r8.<init>((X.C79053uH) r3, (int) r0)
            r10 = 18
            X.7Q7 r4 = new X.7Q7
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r6.CGF(r4)
        L_0x0612:
            X.C79053uH.A03(r3)
            return
        L_0x0616:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0612
            if (r1 == 0) goto L_0x0612
            X.5cR r1 = r3.A0k
            if (r1 == 0) goto L_0x0625
            X.206 r0 = r3.A0I
            r1.C2F(r0)
        L_0x0625:
            boolean r0 = r1 instanceof X.C108295bS
            if (r0 == 0) goto L_0x0612
            if (r15 != 0) goto L_0x0612
            X.5bS r1 = (X.C108295bS) r1
            X.206 r0 = r3.A0I
            r2 = 0
            boolean r1 = r1.BFo(r0, r2, r2)
            X.00H r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.4Ol r0 = (X.C85714Ol) r0
            if (r1 == 0) goto L_0x065a
            r0.A05 = r2
            X.00H r1 = r3.A05
            X.16x r0 = X.AnonymousClass3MX.A0d(r1)
            X.205 r2 = r0.A00
            if (r2 == 0) goto L_0x0612
            X.16x r1 = X.AnonymousClass3MX.A0d(r1)
            r0 = 0
            r1.A00 = r0
            r0 = 1
            r1.A02 = r0
            X.1DT r0 = r1.A03
            r0.A0F(r2)
            goto L_0x0612
        L_0x065a:
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0612
            android.content.Context r2 = r3.getContext()
            X.10I r1 = r3.A1X
            X.00H r0 = r3.A06
            java.lang.Object r0 = r0.get()
            X.4Ol r0 = (X.C85714Ol) r0
            int r0 = r0.A00
            X.C83924He.A00(r2, r1, r0)
            goto L_0x0612
        L_0x0672:
            java.lang.Object r2 = r14.A01
            X.3ru r2 = (X.C77973ru) r2
            X.206 r9 = (X.AnonymousClass206) r9
            r1 = 0
            if (r9 != 0) goto L_0x067f
            r2.A06(r1)
            return
        L_0x067f:
            boolean r0 = r2.A09()
            if (r0 != 0) goto L_0x0689
            r2.A07(r1)
            return
        L_0x0689:
            X.C77973ru.A00(r2, r9)
            return
        L_0x068d:
            java.lang.Object r0 = r14.A01
            X.3rb r0 = (X.C77853rb) r0
            X.C77853rb.A07(r0)
            return
        L_0x0695:
            java.lang.Object r2 = r14.A01
            X.3rV r2 = (X.C77803rV) r2
            X.4ER r9 = (X.AnonymousClass4ER) r9
            long r0 = java.lang.System.currentTimeMillis()
            r2.A01 = r0
            r2.A0G = r9
            r2.A0C()
            r6 = 5000(0x1388, double:2.4703E-320)
            X.0ve r3 = r2.A0d
            r1 = 11474(0x2cd2, float:1.6078E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x06c6
            X.00H r0 = r2.A0H
            java.lang.Object r3 = r0.get()
            X.2ri r3 = (X.C62632ri) r3
            X.1E7 r4 = r2.A0H
            r8 = 0
            X.1BI r5 = r2.A0f
            r3.A05(r4, r5, r6, r8)
        L_0x06c6:
            r1 = 17
            X.4rh r0 = new X.4rh
            r0.<init>(r2, r1)
            r2.A04 = r0
            android.os.Handler r1 = X.C17890vO.A0D()
            r2.A02 = r1
            java.lang.Runnable r0 = r2.A04
            r1.postDelayed(r0, r6)
            return
        L_0x06db:
            java.lang.Object r3 = r14.A01
            X.3rW r3 = (X.AnonymousClass3rW) r3
            X.4ER r9 = (X.AnonymousClass4ER) r9
            long r0 = java.lang.System.currentTimeMillis()
            r3.A00 = r0
            r3.A0G = r9
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x06f0
            r3.A0C()
        L_0x06f0:
            r7 = 5000(0x1388, double:2.4703E-320)
            X.0ve r2 = r3.A0d
            r1 = 6172(0x181c, float:8.649E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 1
            if (r0 == 0) goto L_0x070c
            X.1E7 r4 = r3.A0H
            X.11P r1 = r3.A0F
            X.01E r0 = r3.A0U
            java.lang.String r1 = X.AnonymousClass72Y.A01(r0, r1, r4)
            r0 = 1
            if (r1 != 0) goto L_0x070d
        L_0x070c:
            r0 = 0
        L_0x070d:
            r3.A08 = r0
            X.1E7 r0 = r3.A0H
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x071b
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0735
        L_0x071b:
            r1 = 48
            X.3Bp r0 = new X.3Bp
            r0.<init>(r3, r1)
            r3.A06 = r0
            android.os.Handler r1 = X.C17890vO.A0D()
            r3.A01 = r1
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x0730
            r7 = 2500(0x9c4, double:1.235E-320)
        L_0x0730:
            java.lang.Runnable r0 = r3.A06
            r1.postDelayed(r0, r7)
        L_0x0735:
            X.2ri r4 = r3.A0E
            X.1E7 r5 = r3.A0H
            boolean r9 = r3.A08
            X.1BI r6 = r3.A0f
            r4.A05(r5, r6, r7, r9)
            X.1MB r1 = r3.A0H
            X.1E7 r0 = r3.A0H
            X.1BI r0 = r0.A0J
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0750
            X.1E7 r0 = r3.A0H
            r0.A0j = r2
        L_0x0750:
            X.10I r2 = r3.A0g
            r1 = 47
            X.3Bp r0 = new X.3Bp
            r0.<init>(r3, r1)
            r2.CGF(r0)
            return
        L_0x075d:
            java.lang.Object r2 = r14.A01
            X.3T3 r2 = (X.AnonymousClass3T3) r2
            X.1DT r1 = r2.A03
            r0 = 0
            X.AnonymousClass3MY.A1L(r1, r0)
            X.1Dg r0 = r2.A00
            r0.A0F(r15)
            return
        L_0x076d:
            java.lang.Object r5 = r14.A01
            com.whatsapp.contact.picker.ContactsAttachmentSelector r5 = (com.whatsapp.contact.picker.ContactsAttachmentSelector) r5
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            X.3T3 r2 = r5.A01
            X.1Dg r1 = r2.A01
            X.1DT r0 = r2.A02
            r1.A0G(r0)
            X.1Dg r0 = r2.A00
            r0.A0G(r1)
            java.lang.String r0 = X.C72453Mb.A0u(r5)
            X.1BI r7 = X.AnonymousClass3MX.A0l(r0)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "quoted_message"
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            X.205 r0 = X.AnonymousClass25A.A09(r0)
            android.os.Bundle r6 = X.AnonymousClass25A.A04(r0)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "quoted_group_jid"
            java.lang.String r1 = r1.getStringExtra(r0)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r8 = r0.A02(r1)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "has_number_from_url"
            boolean r10 = X.AnonymousClass3MY.A1a(r1, r0)
            android.content.Intent r1 = X.AnonymousClass1LU.A0R(r5, r6, r7, r8, r9, r10)
            r0 = 8
            r5.startActivityForResult(r1, r0)
            return
        L_0x07bf:
            java.lang.Object r2 = r14.A01
            X.1FU r2 = (X.AnonymousClass1FU) r2
            boolean r0 = X.AnonymousClass000.A1Y(r15)
            if (r0 == 0) goto L_0x07d3
            r1 = 2131894782(0x7f1221fe, float:1.9424378E38)
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r2.CNB(r1, r0)
            return
        L_0x07d3:
            r2.CEx()
            return
        L_0x07d7:
            java.lang.Object r1 = r14.A01
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r1 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.contact.picker.AddGroupParticipantsSelector.A0z(r1)
            return
        L_0x07e3:
            java.lang.Object r2 = r14.A01
            X.4RW r2 = (X.AnonymousClass4RW) r2
            X.1VD r0 = r2.A06
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r1 = r0.A00()
            X.1FY r0 = r2.A02
            r0.CMl(r1)
            return
        L_0x07f3:
            java.lang.Object r0 = r14.A01
            X.4RW r0 = (X.AnonymousClass4RW) r0
            X.3xb r0 = r0.A05
            r0.A06()
            return
        L_0x07fd:
            java.lang.Object r1 = r14.A01
            X.4RW r1 = (X.AnonymousClass4RW) r1
            X.4L5 r0 = new X.4L5
            r0.<init>(r1)
            com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment r2 = new com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment
            r2.<init>()
            r2.A00 = r0
            X.1FY r0 = r1.A02
            X.1GP r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "wifi_speed_bump_dialog"
            r2.A2C(r1, r0)
            return
        L_0x0819:
            java.lang.Object r0 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r0
            X.4VX r0 = r0.A0A
            r0.A01()
            return
        L_0x0823:
            java.lang.Object r0 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity) r0
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity.A0V(r0)
            return
        L_0x082b:
            java.lang.Object r0 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r0
            java.util.List r9 = (java.util.List) r9
            com.whatsapp.companiondevice.LinkedDevicesActivity.A03(r0, r9)
            return
        L_0x0835:
            java.lang.Object r4 = r14.A01
            android.content.Context r4 = (android.content.Context) r4
            r3 = 1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x0850:
            java.lang.Object r4 = r14.A01
            X.1FP r4 = (X.AnonymousClass1FP) r4
            r3 = 1
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.DevicePairQrScannerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.putExtra(r0, r3)
            r0 = 101(0x65, float:1.42E-43)
            r4.startActivityForResult(r2, r0)
            return
        L_0x086d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.companiondevice.LinkedDevicesActivity r0 = (com.whatsapp.companiondevice.LinkedDevicesActivity) r0
            com.whatsapp.companiondevice.LinkedDevicesViewModel r0 = r0.A0B
            r0.A0U()
            return
        L_0x0877:
            java.lang.Object r3 = r14.A01
            com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity r3 = (com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity) r3
            com.whatsapp.jid.DeviceJid r0 = r3.A05
            java.lang.String r2 = "deviceJid"
            if (r0 == 0) goto L_0x0895
            X.0vl r0 = r3.A0A
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = (com.whatsapp.companiondevice.LinkedDevicesSharedViewModel) r1
            com.whatsapp.jid.DeviceJid r0 = r3.A05
            if (r0 == 0) goto L_0x0895
            java.lang.String r0 = r0.getRawString()
            r1.A0V(r0)
            return
        L_0x0895:
            X.C18070vi.A11(r2)
            r0 = 0
            throw r0
        L_0x089a:
            r0 = 3
            if (r1 != r0) goto L_0x08d7
            com.whatsapp.conversation.selection.ui.MessageSelectionBottomMenu r0 = r6.A0D
            if (r0 != 0) goto L_0x08b3
            r0 = 2131432681(0x7f0b14e9, float:1.8487126E38)
            android.view.ViewStub r1 = X.AnonymousClass3MX.A0G(r6, r0)
            r0 = 2131626041(0x7f0e0839, float:1.8879307E38)
            android.view.View r0 = X.AnonymousClass3MY.A0G(r1, r0)
            com.whatsapp.conversation.selection.ui.MessageSelectionBottomMenu r0 = (com.whatsapp.conversation.selection.ui.MessageSelectionBottomMenu) r0
            r6.A0D = r0
        L_0x08b3:
            X.0vb r10 = r6.A00
            X.4PX r0 = r6.A05
            X.3vP r7 = r0.A00(r6)
            X.4lk r8 = new X.4lk
            r8.<init>()
            X.00H r0 = r6.A0R
            java.lang.Object r9 = r0.get()
            X.4Wb r9 = (X.C87564Wb) r9
            r12 = 0
            X.3we r5 = new X.3we
            r11 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.02B r0 = r6.COJ(r5)
        L_0x08d3:
            r6.setSelectionActionMode(r0)
            return
        L_0x08d7:
            X.4fB r0 = r6.A0C
            X.02B r0 = r6.COJ(r0)
            goto L_0x08d3
        L_0x08de:
            r2.BLL()
            return
        L_0x08e2:
            X.5c7 r0 = r1.A0l
            boolean r0 = r0.CN7()
            if (r0 == 0) goto L_0x08f1
            r0 = 2131429610(0x7f0b08ea, float:1.8480898E38)
            X.AnonymousClass3MY.A1B(r1, r0, r3)
            return
        L_0x08f1:
            android.util.Pair r0 = r1.A04
            if (r0 == 0) goto L_0x08fe
            java.lang.Object r0 = r0.first
            if (r0 == 0) goto L_0x08fe
            android.view.View r0 = (android.view.View) r0
            r1.removeView(r0)
        L_0x08fe:
            r1.A04 = r2
            return
        L_0x0901:
            if (r0 == 0) goto L_0x090a
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x090a
            return
        L_0x090a:
            android.app.ProgressDialog r0 = r2.A00
            if (r0 != 0) goto L_0x0919
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r2)
            r2.A00 = r1
            r0 = 0
            r1.setCancelable(r0)
        L_0x0919:
            android.app.ProgressDialog r1 = r2.A00
            int r0 = r9.intValue()
            java.lang.String r0 = r2.getString(r0)
            r1.setMessage(r0)
            android.app.ProgressDialog r0 = r2.A00
            goto L_0x0948
        L_0x0929:
            android.app.ProgressDialog r0 = r3.A00
            if (r0 != 0) goto L_0x0946
            X.1FY r2 = r3.A02
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r2)
            r3.A00 = r1
            r0 = 2131891827(0x7f121673, float:1.9418385E38)
            java.lang.String r0 = r2.getString(r0)
            r1.setMessage(r0)
            android.app.ProgressDialog r1 = r3.A00
            r0 = 0
            r1.setCancelable(r0)
        L_0x0946:
            android.app.ProgressDialog r0 = r3.A00
        L_0x0948:
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91624fz.Bo9(java.lang.Object):void");
    }

    public C91624fz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1F9 r1, AnonymousClass1DS r2, int i) {
        r2.A0A(r1, new C91624fz(r1, i));
    }

    public static void A01(AnonymousClass1F9 r1, AnonymousClass1DS r2, Object obj, int i) {
        r2.A0A(r1, new C91624fz(obj, i));
    }
}
