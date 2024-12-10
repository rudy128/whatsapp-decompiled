package X;

import android.view.View;

/* renamed from: X.7M5  reason: invalid class name */
public class AnonymousClass7M5 implements C1603187z {
    public View A00;
    public final C63372sx A01;

    public AnonymousClass7M5(C63372sx r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02dd, code lost:
        if (r12 == 37) goto L_0x02df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View BbX(android.content.Context r32, android.view.View r33, android.view.ViewGroup r34, X.C37451pZ r35, java.util.List r36, java.util.List r37, java.util.List r38, java.util.List r39, boolean r40) {
        /*
            r31 = this;
            r8 = r33
            if (r33 != 0) goto L_0x0034
            r3 = r32
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131627089(0x7f0e0c51, float:1.8881433E38)
            r2 = r34
            android.view.View r8 = X.AnonymousClass3MX.A09(r1, r2, r0)
            X.00c r0 = X.C17890vO.A0H(r3)
            X.5nA r6 = new X.5nA
            r1 = r35
            r6.<init>(r3, r8, r0, r1)
            r8.setTag(r6)
        L_0x0021:
            r0 = r31
            r0.A00 = r8
            X.2sx r0 = r0.A01
            r28 = r0
            com.whatsapp.jid.UserJid r7 = r0.A0A
            r6.A04 = r7
            int r0 = r28.A00()
            r6.A01 = r0
            goto L_0x003b
        L_0x0034:
            java.lang.Object r6 = r8.getTag()
            X.5nA r6 = (X.C113485nA) r6
            goto L_0x0021
        L_0x003b:
            X.00c r0 = r6.A0C     // Catch:{ all -> 0x0525 }
            r18 = r0
            r0 = r18
            X.10E r0 = (X.AnonymousClass10E) r0     // Catch:{ all -> 0x0525 }
            r27 = r0
            X.00S r0 = r0.AAF     // Catch:{ all -> 0x0525 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0525 }
            X.1TG r1 = (X.AnonymousClass1TG) r1     // Catch:{ all -> 0x0525 }
            com.whatsapp.jid.UserJid r0 = r6.A04     // Catch:{ all -> 0x0525 }
            X.206 r5 = r1.A03(r0)     // Catch:{ all -> 0x0525 }
            X.1E5 r11 = X.AnonymousClass1E5.A00
            r15 = r11
            r0 = 0
            if (r7 != r11) goto L_0x005a
            r0 = 1
        L_0x005a:
            r10 = 1
            r4 = 8
            r3 = 0
            r30 = r36
            if (r0 == 0) goto L_0x03c2
            X.1xh r9 = r6.A0E
            com.whatsapp.TextEmojiLabel r2 = r9.A01
            r0 = 2131892379(0x7f12189b, float:1.9419505E38)
            r2.setText(r0)
            r2.A0N()
            android.widget.FrameLayout r1 = r6.A07
            if (r5 == 0) goto L_0x03bd
            android.content.Context r14 = r6.A05
            r0 = 2131892382(0x7f12189e, float:1.941951E38)
            X.AnonymousClass3MY.A0w(r14, r1, r0)
            r0 = 36
            X.C89974dK.A00(r1, r6, r0)
            r1.setVisibility(r3)
            android.widget.ImageView r12 = r6.A08
            r0 = 2131232119(0x7f080577, float:1.8080338E38)
            r12.setImageResource(r0)
            boolean r13 = r30.isEmpty()
            r1 = 2130971379(0x7f040af3, float:1.7551495E38)
            r0 = 2131102602(0x7f060b8a, float:1.7817647E38)
            if (r13 == 0) goto L_0x009d
            r1 = 2130971382(0x7f040af6, float:1.75515E38)
            r0 = 2131102612(0x7f060b94, float:1.7817667E38)
        L_0x009d:
            int r1 = X.AnonymousClass3Ma.A00(r14, r1, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r12.setColorFilter(r1, r0)
        L_0x00a6:
            com.whatsapp.jid.UserJid r0 = r6.A04
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x03a7
            android.widget.TextView r1 = r6.A0B
            r1.setVisibility(r3)
            r1.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3)
            android.content.Context r0 = r6.A05
            r12 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r10 = 2131101314(0x7f060682, float:1.7815034E38)
            X.C72463Mc.A0y(r0, r2, r12, r10)
            r9.A03(r3)
        L_0x00c4:
            java.lang.String r13 = ""
            r29 = r37
            if (r5 == 0) goto L_0x0341
            com.whatsapp.jid.UserJid r9 = r6.A04
            boolean r9 = X.C22971Dz.A0Z(r9)
            if (r9 == 0) goto L_0x0275
            android.widget.ImageView r11 = r6.A0A
            r11.setTag(r13)
            X.1VW r10 = X.AnonymousClass3MZ.A0e(r27)
            X.1M9 r9 = X.AnonymousClass10E.A4z(r27)
            X.1MA r9 = r9.A03
            X.00H r9 = r9.A01
            java.lang.Object r9 = r9.get()
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            r10.A0C(r11, r9)
        L_0x00ec:
            int r12 = r30.size()
            int r13 = r29.size()
            int r17 = r38.size()
            int r14 = r12 + r13
            int r14 = r14 + r17
            X.1E5 r11 = X.AnonymousClass1E5.A00
            r10 = 0
            if (r7 != r15) goto L_0x0102
            r10 = 1
        L_0x0102:
            if (r10 == 0) goto L_0x0229
            if (r14 == 0) goto L_0x0229
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            r16 = 1
            if (r12 <= 0) goto L_0x0128
            android.content.res.Resources r9 = r6.A06
            r14 = r9
            r9 = r16
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r19 = r9
            X.C17880vN.A1T(r9, r12, r3)
            r9 = 2131755147(0x7f10008b, float:1.9141165E38)
            r15 = r14
            r14 = r9
            r9 = r19
            java.lang.String r9 = r15.getQuantityString(r14, r12, r9)
            r10.add(r9)
        L_0x0128:
            if (r13 <= 0) goto L_0x013e
            android.content.res.Resources r9 = r6.A06
            r14 = r9
            r9 = r16
            java.lang.Object[] r15 = new java.lang.Object[r9]
            X.C17880vN.A1T(r15, r13, r3)
            r9 = 2131755382(0x7f100176, float:1.9141642E38)
            java.lang.String r9 = r14.getQuantityString(r9, r13, r15)
            r10.add(r9)
        L_0x013e:
            if (r17 <= 0) goto L_0x014e
            android.content.res.Resources r14 = r6.A06
            r13 = 2131755089(0x7f100051, float:1.9141047E38)
            r9 = r17
            java.lang.String r9 = X.C72473Md.A0k(r14, r9, r13)
            r10.add(r9)
        L_0x014e:
            int r13 = r10.size()
            r14 = 2
            r9 = 3
            if (r13 != r9) goto L_0x0213
            r15 = 2131896873(0x7f122a29, float:1.942862E38)
            java.lang.Object[] r13 = new java.lang.Object[r9]
            X.C108985cd.A1Q(r10, r13)
            java.lang.Object r9 = r10.get(r14)
            r13[r14] = r9
        L_0x0164:
            java.lang.String r9 = r0.getString(r15, r13)
        L_0x0168:
            r1.setText(r9)
            if (r12 == 0) goto L_0x016e
            r3 = 1
        L_0x016e:
            r10 = 2131232259(0x7f080603, float:1.8080622E38)
            r9 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass4aX.A02(r0, r10, r9)
            if (r3 == 0) goto L_0x0181
            r3 = 2131231893(0x7f080495, float:1.807988E38)
            android.graphics.drawable.Drawable r9 = X.C24261Jm.A00(r0, r3)
        L_0x0181:
            X.0vb r3 = r18.CS9()
            X.3cP r12 = new X.3cP
            r12.<init>(r9, r3)
            X.0vb r3 = r18.CS9()
            boolean r3 = X.AnonymousClass3MW.A1Z(r3)
            r10 = 0
            r9 = r12
            if (r3 == 0) goto L_0x0197
            r9 = r10
        L_0x0197:
            X.0vb r3 = r18.CS9()
            boolean r3 = X.AnonymousClass3MW.A1Z(r3)
            if (r3 != 0) goto L_0x01a2
            r12 = r10
        L_0x01a2:
            r1.setCompoundDrawablesWithIntrinsicBounds(r9, r10, r12, r10)
        L_0x01a5:
            android.widget.ImageView r9 = r6.A0A
            boolean r13 = r9 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r13 == 0) goto L_0x020d
            r10 = r9
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r10 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r10
            r3 = 0
            r10.setProfileBadge(r3)
        L_0x01b2:
            X.1Nb r10 = X.AnonymousClass3MZ.A11(r27)
            com.whatsapp.jid.UserJid r3 = r6.A04
            X.1yM r3 = r10.A0a(r3)
            boolean r3 = r3.A0U
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x01c4
            r10 = 1056964608(0x3f000000, float:0.5)
        L_0x01c4:
            r2.setAlpha(r10)
            r1.setAlpha(r10)
            r9.setAlpha(r10)
            boolean r1 = r9 instanceof com.whatsapp.status.ContactStatusThumbnail
            if (r1 == 0) goto L_0x0409
            r12 = 0
            if (r3 == 0) goto L_0x0204
            r2 = 0
        L_0x01d5:
            r1 = r9
            com.whatsapp.status.ContactStatusThumbnail r1 = (com.whatsapp.status.ContactStatusThumbnail) r1
            java.util.Map r10 = r1.A05
            r10.clear()
            r1.A07(r12, r2)
            if (r3 != 0) goto L_0x0491
            r1 = 0
            if (r7 != r11) goto L_0x01e6
            r1 = 1
        L_0x01e6:
            if (r1 == 0) goto L_0x0491
            java.util.Iterator r12 = r30.iterator()
        L_0x01ec:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x03f0
            java.lang.Object r3 = r12.next()
            r2 = 2130971379(0x7f040af3, float:1.7551495E38)
            r1 = 2131102602(0x7f060b8a, float:1.7817647E38)
            int r1 = X.AnonymousClass3Ma.A00(r0, r2, r1)
            X.C17880vN.A1P(r3, r10, r1)
            goto L_0x01ec
        L_0x0204:
            int r2 = r28.A00()
            int r12 = r28.A01()
            goto L_0x01d5
        L_0x020d:
            android.widget.ImageView r3 = r6.A09
            r3.setVisibility(r4)
            goto L_0x01b2
        L_0x0213:
            int r9 = r10.size()
            if (r9 != r14) goto L_0x0223
            r15 = 2131897209(0x7f122b79, float:1.9429301E38)
            java.lang.Object[] r13 = new java.lang.Object[r14]
            X.C108985cd.A1Q(r10, r13)
            goto L_0x0164
        L_0x0223:
            java.lang.String r9 = X.C108945cZ.A1H(r10, r3)
            goto L_0x0168
        L_0x0229:
            r18.CP7()
            X.0vb r13 = r18.CS9()
            X.11P r12 = r18.CP7()
            long r9 = r28.A04()
            java.lang.String r13 = X.C108965cb.A0q(r12, r13, r9)
            r1.setText(r13)
            r1.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3)
            int r14 = r28.A01()
            int r10 = r28.A00()
            r12 = 1
            android.content.res.Resources r9 = r6.A06
            if (r14 <= 0) goto L_0x026d
            r3 = 2131755450(0x7f1001ba, float:1.914178E38)
            java.lang.String r10 = X.C72473Md.A0k(r9, r14, r3)
        L_0x0256:
            java.lang.StringBuilder r9 = X.C17890vO.A0f(r13)
            java.lang.String r3 = " "
            java.lang.String r3 = X.AnonymousClass001.A1H(r3, r10, r9)
            r1.setContentDescription(r3)
            r1.setImportantForAccessibility(r12)
            r3 = 2131896786(0x7f1229d2, float:1.9428443E38)
            r6.A00 = r3
            goto L_0x01a5
        L_0x026d:
            r3 = 2131755451(0x7f1001bb, float:1.9141782E38)
            java.lang.String r10 = X.C72473Md.A0k(r9, r10, r3)
            goto L_0x0256
        L_0x0275:
            boolean r9 = r5 instanceof X.C441822l
            if (r9 == 0) goto L_0x0292
            boolean r9 = r6.A0J
            if (r9 == 0) goto L_0x0292
            r9 = r5
            X.22l r9 = (X.C441822l) r9
            int r9 = X.C124106Xb.A00(r0, r9)
            android.graphics.drawable.LayerDrawable r10 = X.C124116Xc.A00(r0, r9)
            android.widget.ImageView r9 = r6.A0A
            r9.setTag(r13)
            r9.setImageDrawable(r10)
            goto L_0x00ec
        L_0x0292:
            boolean r9 = r5 instanceof X.AnonymousClass21V
            if (r9 == 0) goto L_0x02ba
            r13 = r5
            X.21V r13 = (X.AnonymousClass21V) r13
            X.2rc r12 = X.AnonymousClass206.A00(r13)
            if (r40 == 0) goto L_0x02ac
            r9 = r27
            X.00S r9 = r9.AAK
            java.lang.Object r9 = r9.get()
            X.6q4 r9 = (X.C134116q4) r9
            r9.A00(r5)
        L_0x02ac:
            X.10I r11 = r6.A0H
            r10 = 46
            X.3C5 r9 = new X.3C5
            r9.<init>(r6, r12, r13, r10)
            r11.CGN(r9)
            goto L_0x00ec
        L_0x02ba:
            int r12 = r5.A0u
            if (r12 == 0) goto L_0x02e7
            r9 = 27
            if (r12 == r9) goto L_0x02e7
            android.widget.ImageView r11 = r6.A0A
            r11.setTag(r13)
            r9 = 1
            if (r12 == r9) goto L_0x02df
            r9 = 3
            if (r12 == r9) goto L_0x02df
            r9 = 15
            r10 = 2131232325(0x7f080645, float:1.8080756E38)
            if (r12 == r9) goto L_0x02e2
            r9 = 23
            if (r12 == r9) goto L_0x02df
            r9 = 37
            r10 = 2131231230(0x7f0801fe, float:1.8078535E38)
            if (r12 != r9) goto L_0x02e2
        L_0x02df:
            r10 = 2131232351(0x7f08065f, float:1.8080809E38)
        L_0x02e2:
            r11.setImageResource(r10)
            goto L_0x00ec
        L_0x02e7:
            android.widget.ImageView r10 = r6.A0A
            r10.setTag(r13)
            X.1gU r9 = X.AnonymousClass3MY.A0d(r27)
            java.lang.String r12 = X.AnonymousClass74F.A05(r9, r5)
            r9 = r5
            X.210 r9 = (X.AnonymousClass210) r9
            com.whatsapp.TextData r9 = r9.A02
            android.graphics.drawable.Drawable r21 = r10.getDrawable()
            X.1KW r24 = X.AnonymousClass3Ma.A0f(r27)
            X.11C r23 = X.AnonymousClass3Ma.A0a(r27)
            X.0vc r25 = X.AnonymousClass3Ma.A0r(r27)
            int r13 = r12.length()
            r11 = 700(0x2bc, float:9.81E-43)
            if (r13 <= r11) goto L_0x0315
            java.lang.String r12 = r12.substring(r3, r11)
        L_0x0315:
            X.C18070vi.A0d(r0, r3)
            if (r9 == 0) goto L_0x0322
            int r11 = r9.fontStyle
            android.graphics.Typeface r20 = X.AnonymousClass74F.A04(r0, r11)
            if (r20 != 0) goto L_0x0324
        L_0x0322:
            android.graphics.Typeface r20 = android.graphics.Typeface.SANS_SERIF
        L_0x0324:
            r19 = r0
            r22 = r9
            r26 = r12
            X.6Ia r12 = X.C124196Xk.A00(r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r9 = r10 instanceof com.whatsapp.status.ContactStatusThumbnail
            if (r9 == 0) goto L_0x033c
            r9 = r10
            com.whatsapp.components.button.ThumbnailButton r9 = (com.whatsapp.components.button.ThumbnailButton) r9
            float r11 = r9.A00
            r9 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r9
            r12.A00 = r11
        L_0x033c:
            r10.setImageDrawable(r12)
            goto L_0x00ec
        L_0x0341:
            android.widget.ImageView r9 = r6.A0A
            r9.setTag(r13)
            r10 = 0
            if (r7 != r11) goto L_0x034a
            r10 = 1
        L_0x034a:
            if (r10 == 0) goto L_0x038f
            X.11S r10 = r18.BA6()
            r10.A0I()
            X.1E8 r12 = r10.A0D
            if (r12 == 0) goto L_0x035c
            X.1pZ r10 = r6.A0F
            r10.A07(r9, r12)
        L_0x035c:
            android.widget.ImageView r14 = r6.A09
            boolean r12 = X.C22891Dp.A02
            r10 = 2131232714(0x7f0807ca, float:1.8081545E38)
            if (r12 == 0) goto L_0x0368
            r10 = 2131232715(0x7f0807cb, float:1.8081547E38)
        L_0x0368:
            r14.setBackgroundResource(r10)
            boolean r13 = r9 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r13 == 0) goto L_0x038b
            r12 = r9
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r12 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r12
            X.1sk r10 = r6.A0I
            r12.setProfileBadge(r10)
        L_0x0377:
            r10 = 2131886521(0x7f1201b9, float:1.9407623E38)
            r1.setText(r10)
            r10 = 2
            r1.setImportantForAccessibility(r10)
            r10 = 2131896785(0x7f1229d1, float:1.9428441E38)
            r6.A00 = r10
        L_0x0386:
            r1.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3)
            goto L_0x01b2
        L_0x038b:
            r14.setVisibility(r3)
            goto L_0x0377
        L_0x038f:
            r12 = 0
            r9.setImageDrawable(r12)
            r1.setText(r13)
            boolean r13 = r9 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r13 == 0) goto L_0x03a1
            r10 = r9
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r10 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r10
            r10.setProfileBadge(r12)
            goto L_0x0386
        L_0x03a1:
            android.widget.ImageView r10 = r6.A09
            r10.setVisibility(r4)
            goto L_0x0386
        L_0x03a7:
            android.content.Context r0 = r6.A05
            r1 = 2130970344(0x7f0406e8, float:1.7549395E38)
            int r1 = X.AnonymousClass4Z9.A00(r0, r1)
            X.AnonymousClass3MX.A1C(r0, r2, r1)
            android.widget.TextView r1 = r6.A0B
            r1.setVisibility(r4)
            r9.A03(r10)
            goto L_0x00c4
        L_0x03bd:
            r1.setVisibility(r4)
            goto L_0x00a6
        L_0x03c2:
            X.1M9 r1 = X.AnonymousClass10E.A4z(r27)
            com.whatsapp.jid.UserJid r0 = r6.A04
            X.1E7 r1 = r1.A0H(r0)
            X.1Me r0 = X.AnonymousClass3MZ.A0g(r27)
            java.lang.String r2 = r0.A0N(r1)
            X.1xh r9 = r6.A0E
            r0 = r39
            r9.A0B(r0, r2)
            android.widget.FrameLayout r0 = r6.A07
            r0.setVisibility(r4)
            android.content.Context r1 = r6.A05
            r0 = 2131896792(0x7f1229d8, float:1.9428455E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r2, r10, r3, r0)
            com.whatsapp.TextEmojiLabel r2 = r9.A01
            r2.setContentDescription(r0)
            goto L_0x00a6
        L_0x03f0:
            java.util.Iterator r3 = r29.iterator()
        L_0x03f4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0491
            java.lang.Object r2 = r3.next()
            r1 = 2131102611(0x7f060b93, float:1.7817665E38)
            int r1 = X.C19740yt.A00(r0, r1)
            X.C17880vN.A1P(r2, r10, r1)
            goto L_0x03f4
        L_0x0409:
            if (r13 == 0) goto L_0x0491
            r10 = 0
            if (r3 == 0) goto L_0x045f
            r3 = 0
            r13 = 0
        L_0x0410:
            java.util.HashSet r12 = new java.util.HashSet
            r0 = r30
            r12.<init>(r0)
            java.util.HashSet r14 = new java.util.HashSet
            r0 = r29
            r14.<init>(r0)
            r2 = r9
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r2
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            r15 = 0
        L_0x0426:
            if (r15 >= r3) goto L_0x0450
            r0 = 0
            if (r7 != r11) goto L_0x042c
            r0 = 1
        L_0x042c:
            if (r0 == 0) goto L_0x043c
            boolean r0 = X.C108965cb.A1Z(r12, r15)
            if (r0 == 0) goto L_0x043c
            X.1sh r0 = X.C39211sh.ERROR
        L_0x0436:
            r1.add(r0)
            int r15 = r15 + 1
            goto L_0x0426
        L_0x043c:
            r0 = 0
            if (r7 != r11) goto L_0x0440
            r0 = 1
        L_0x0440:
            if (r0 == 0) goto L_0x044b
            boolean r0 = X.C108965cb.A1Z(r14, r15)
            if (r0 == 0) goto L_0x044b
        L_0x0448:
            X.1sh r0 = X.C39211sh.UNSEEN
            goto L_0x0436
        L_0x044b:
            if (r15 < r13) goto L_0x0448
            X.1sh r0 = X.C39211sh.SEEN
            goto L_0x0436
        L_0x0450:
            X.2QH r0 = new X.2QH
            r0.<init>(r1)
            r2.setProfileStatus(r0)
            if (r3 <= 0) goto L_0x045b
            r10 = 1
        L_0x045b:
            r2.setStatusIndicatorEnabled(r10)
            goto L_0x0491
        L_0x045f:
            int r3 = r28.A00()
            r0 = 32
            if (r3 <= r0) goto L_0x051f
            int r0 = r28.A01()
            if (r0 > 0) goto L_0x051b
            int r0 = r29.size()
            if (r0 > 0) goto L_0x051b
            int r0 = r30.size()
            if (r0 <= 0) goto L_0x0517
            X.1sh r2 = X.C39211sh.ERROR
        L_0x047b:
            r1 = r9
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            int r0 = r28.A00()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r1.setStatusIndicatorEnabled(r0)
            X.1sj r0 = new X.1sj
            r0.<init>(r2)
            r1.setProfileStatus(r0)
        L_0x0491:
            r1 = 0
            if (r7 != r11) goto L_0x0495
            r1 = 1
        L_0x0495:
            r0 = r27
            X.00S r0 = r0.AC9
            java.lang.Object r0 = r0.get()
            X.1dS r0 = (X.C30141dS) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x04f6
            if (r1 == 0) goto L_0x0508
            if (r5 == 0) goto L_0x0508
            android.view.View r0 = r6.A02
            if (r0 != 0) goto L_0x04bb
            android.view.View r1 = r6.A0H
            r0 = 2131429731(0x7f0b0963, float:1.8481143E38)
            android.view.View r0 = X.C72453Mb.A0S(r1, r0)
            r6.A02 = r0
            r0.setVisibility(r4)
        L_0x04bb:
            android.view.View r0 = r6.A03
            if (r0 != 0) goto L_0x04cd
            android.view.View r1 = r6.A0H
            r0 = 2131429734(0x7f0b0966, float:1.848115E38)
            android.view.View r0 = X.C72453Mb.A0S(r1, r0)
            r6.A03 = r0
            r0.setVisibility(r4)
        L_0x04cd:
            r0 = r27
            X.10E r0 = r0.Ao8
            X.10G r1 = r0.A00
            X.00S r0 = r1.A5I
            X.00H r0 = X.C000200d.A00(r0)
            X.1x7 r2 = X.C108945cZ.A12(r0)
            X.00S r0 = r1.A5I
            X.00H r0 = X.C000200d.A00(r0)
            X.1x7 r0 = X.C108945cZ.A12(r0)
            X.7Os r1 = new X.7Os
            r1.<init>(r6, r0)
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.6uW r0 = (X.C136856uW) r0
            r0.A00 = r1
        L_0x04f6:
            android.view.View r3 = r9.getRootView()
            android.view.View r2 = r9.getRootView()
            r1 = 2
            X.5hW r0 = new X.5hW
            r0.<init>(r3, r6, r1)
            X.AnonymousClass1HF.A0f(r2, r0)
            return r8
        L_0x0508:
            android.view.View r0 = r6.A02
            if (r0 == 0) goto L_0x050f
            r0.setVisibility(r4)
        L_0x050f:
            android.view.View r0 = r6.A03
            if (r0 == 0) goto L_0x04f6
            r0.setVisibility(r4)
            goto L_0x04f6
        L_0x0517:
            X.1sh r2 = X.C39211sh.SEEN
            goto L_0x047b
        L_0x051b:
            X.1sh r2 = X.C39211sh.UNSEEN
            goto L_0x047b
        L_0x051f:
            int r13 = r28.A01()
            goto L_0x0410
        L_0x0525:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7M5.BbX(android.content.Context, android.view.View, android.view.ViewGroup, X.1pZ, java.util.List, java.util.List, java.util.List, java.util.List, boolean):android.view.View");
    }
}
