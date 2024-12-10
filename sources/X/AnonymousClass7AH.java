package X;

/* renamed from: X.7AH  reason: invalid class name */
public class AnonymousClass7AH implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7AH(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.whatsapp.newsletter.NewsletterInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: com.whatsapp.newsletter.NewsletterInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: com.whatsapp.newsletter.NewsletterInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x034c, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0350, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0385, code lost:
        r3.startActivityForResult(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0388, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03c9, code lost:
        if (r10.booleanValue() == false) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01bd, code lost:
        if (r10.booleanValue() == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r3.A01 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x03b6;
                case 1: goto L_0x03a5;
                case 2: goto L_0x0398;
                case 3: goto L_0x0202;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01ac;
                case 6: goto L_0x0389;
                case 7: goto L_0x0368;
                case 8: goto L_0x0351;
                case 9: goto L_0x02ff;
                case 10: goto L_0x02c9;
                case 11: goto L_0x02af;
                case 12: goto L_0x0273;
                case 13: goto L_0x015f;
                case 14: goto L_0x0143;
                case 15: goto L_0x010e;
                case 16: goto L_0x00a2;
                case 17: goto L_0x002d;
                case 18: goto L_0x0267;
                case 19: goto L_0x0250;
                case 20: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r9.A01
            X.6j9 r3 = (X.C130266j9) r3
            java.lang.Object r1 = r9.A02
            android.webkit.PermissionRequest r1 = (android.webkit.PermissionRequest) r1
            r2 = 0
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0017
            r1.deny()
        L_0x0015:
            r3.A01 = r2
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r3 = r9.A01
            X.6j9 r3 = (X.C130266j9) r3
            java.lang.Object r1 = r9.A02
            android.webkit.PermissionRequest r1 = (android.webkit.PermissionRequest) r1
            r2 = 0
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0017
            java.lang.String[] r0 = r1.getResources()
            r1.grant(r0)
            goto L_0x0015
        L_0x002d:
            java.lang.Object r4 = r9.A01
            com.whatsapp.status.StatusesFragment r4 = (com.whatsapp.status.StatusesFragment) r4
            java.lang.Object r3 = r9.A02
            android.widget.ListView r3 = (android.widget.ListView) r3
            boolean r0 = X.AnonymousClass000.A1Y(r10)
            if (r0 != 0) goto L_0x0017
            android.view.View r0 = r4.A02
            r5 = 0
            if (r0 != 0) goto L_0x0099
            androidx.fragment.app.ListFragment.A00(r4)
            android.widget.ListView r6 = r4.A04
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0E(r4)
            r0 = 2131627005(0x7f0e0bfd, float:1.8881262E38)
            android.view.View r1 = r1.inflate(r0, r6, r5)
            r4.A02 = r1
            r0 = 2131436044(0x7f0b220c, float:1.8493947E38)
            android.widget.TextView r8 = X.C17880vN.A0E(r1, r0)
            r7 = 2131896337(0x7f122811, float:1.9427532E38)
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 24
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.String r0 = r4.A1I(r7, r1)
            r8.setText(r0)
            android.view.View r1 = r4.A02
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 37
            X.C89974dK.A00(r1, r4, r0)
            android.view.View r1 = r4.A02
            r0 = 2131434087(0x7f0b1a67, float:1.8489978E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 38
            X.C89974dK.A00(r1, r4, r0)
            android.content.Context r0 = r4.A14()
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            android.view.View r0 = r4.A02
            r1.addView(r0)
            r0 = 0
            r6.addHeaderView(r1, r0, r2)
        L_0x0099:
            android.view.View r0 = r4.A02
            r0.setVisibility(r5)
            com.whatsapp.status.StatusesFragment.A06(r3, r4)
            return
        L_0x00a2:
            java.lang.Object r3 = r9.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r9.A02
            X.1bI r2 = (X.C28931bI) r2
            boolean r0 = X.AnonymousClass000.A1Y(r10)
            if (r0 == 0) goto L_0x0104
            android.view.View r4 = X.C72463Mc.A0N(r2)
            com.whatsapp.wds.components.banners.WDSBanner r4 = (com.whatsapp.wds.components.banners.WDSBanner) r4
            X.4XT r6 = new X.4XT
            r6.<init>()
            r0 = 2131895570(0x7f122512, float:1.9425977E38)
            r6.A01 = r0
            r0 = 2131895560(0x7f122508, float:1.9425956E38)
            java.lang.String r5 = r3.getString(r0)
            r0 = 14
            X.Ajq r1 = new X.Ajq
            r1.<init>(r0)
            java.lang.String r0 = "start-checkup"
            android.text.SpannableStringBuilder r0 = X.A3H.A02(r3, r1, r5, r0)
            r6.A03 = r0
            r0 = 1
            r6.A05 = r0
            r0 = 2131232392(0x7f080688, float:1.8080892E38)
            X.4AG r1 = new X.4AG
            r1.<init>(r0)
            X.4AC r0 = new X.4AC
            r0.<init>(r1)
            r6.A02 = r0
            X.4Os r0 = r6.A01()
            r4.setState(r0)
            r1 = 24
            X.4dT r0 = new X.4dT
            r0.<init>((java.lang.Object) r3, (int) r1)
            r4.setOnClickListener(r0)
            r1 = 9
            X.786 r0 = new X.786
            r0.<init>(r3, r2, r1)
            r4.setOnDismissListener((android.view.View.OnClickListener) r0)
            return
        L_0x0104:
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x0017
            r0 = 8
            r2.A04(r0)
            return
        L_0x010e:
            java.lang.Object r1 = r9.A01
            X.5jU r1 = (X.C111295jU) r1
            java.lang.Object r5 = r9.A02
            X.1pP r5 = (X.C37361pP) r5
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x011c
            java.lang.String r10 = ""
        L_0x011c:
            java.lang.String r0 = r1.A0b()
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0017
            X.7T2 r4 = r1.A08
            int r0 = r1.A0U()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            com.whatsapp.jid.UserJid r2 = r1.A0Y()
            r1 = 3
            X.71J r0 = new X.71J
            r0.<init>(r2, r3, r10, r1)
            r4.A00(r0)
            java.lang.String r0 = "query_text"
            r5.A04(r0, r10)
            return
        L_0x0143:
            java.lang.Object r1 = r9.A01
            X.5jU r1 = (X.C111295jU) r1
            java.lang.Object r0 = r9.A02
            X.00H r0 = (X.AnonymousClass00H) r0
            X.6FF r10 = (X.AnonymousClass6FF) r10
            r1.A09 = r10
            java.lang.Object r0 = r0.get()
            X.1fA r0 = (X.C31191fA) r0
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x0017
            X.C111295jU.A08(r1)
            return
        L_0x015f:
            java.lang.Object r0 = r9.A01
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            java.lang.Object r5 = r9.A02
            X.5lL r5 = (X.C112355lL) r5
            java.util.Map r10 = (java.util.Map) r10
            X.5jJ r0 = r0.A0g
            java.util.List r0 = r0.A0U()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            r5.A02 = r10
            r3 = 0
        L_0x0177:
            X.7Sy r1 = r5.A0S
            int r0 = r1.size()
            if (r3 >= r0) goto L_0x0017
            java.lang.Object r2 = r1.get(r3)
            X.1tM r2 = (X.C39611tM) r2
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x01a2
            java.lang.Object r1 = r2.A01
            boolean r0 = r1 instanceof X.AnonymousClass1E7
            if (r0 == 0) goto L_0x019f
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            X.1BI r1 = r1.A0J
        L_0x0194:
            if (r1 == 0) goto L_0x019f
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x019f
            r5.A0G(r3)
        L_0x019f:
            int r3 = r3 + 1
            goto L_0x0177
        L_0x01a2:
            r0 = 2
            if (r1 != r0) goto L_0x019f
            java.lang.Object r1 = r2.A01
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x019f
            goto L_0x0194
        L_0x01ac:
            java.lang.Object r6 = r9.A01
            com.whatsapp.mediaview.MediaViewFragment r6 = (com.whatsapp.mediaview.MediaViewFragment) r6
            java.lang.Object r5 = r9.A02
            android.view.View r5 = (android.view.View) r5
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x01bf
            boolean r0 = r10.booleanValue()
            r4 = 1
            if (r0 != 0) goto L_0x01c0
        L_0x01bf:
            r4 = 0
        L_0x01c0:
            r6.A1e = r4
            android.view.ViewGroup$MarginLayoutParams r3 = X.AnonymousClass3MW.A0B(r5)
            r2 = 0
            if (r4 == 0) goto L_0x01eb
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r6)
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.topMargin = r0
        L_0x01d6:
            r5.setLayoutParams(r3)
            X.70X r0 = r6.A1E
            if (r0 == 0) goto L_0x0017
            X.6Mj r1 = r0.A0A()
            if (r1 == 0) goto L_0x0017
            if (r4 == 0) goto L_0x03eb
            r1.A09 = r2
            r1.A05()
            return
        L_0x01eb:
            r3.topMargin = r2
            r3.bottomMargin = r2
            goto L_0x01d6
        L_0x01f0:
            java.lang.Object r2 = r9.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            java.lang.Object r1 = r9.A02
            X.6gH r1 = (X.C128536gH) r1
            boolean r0 = X.AnonymousClass000.A1Y(r10)
            if (r0 != 0) goto L_0x0017
            com.whatsapp.mediacomposer.MediaComposerActivity.A1D(r2, r1)
            return
        L_0x0202:
            java.lang.Object r0 = r9.A01
            com.whatsapp.gallery.GalleryTabHostFragment r0 = (com.whatsapp.gallery.GalleryTabHostFragment) r0
            java.lang.Object r5 = r9.A02
            java.util.List r5 = (java.util.List) r5
            X.0vl r4 = r0.A0o
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = X.C108945cZ.A0g(r4)
            X.1DT r1 = r0.A05
            X.7HN r0 = X.AnonymousClass7HN.A00
            r1.A0F(r0)
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = X.C108945cZ.A0g(r4)
            java.util.Set r0 = r0.A0T()
            java.util.Iterator r3 = r0.iterator()
        L_0x0223:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x024e
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.8B2 r0 = (X.AnonymousClass8B2) r0
            android.net.Uri r1 = r0.BLl()
            java.lang.Object r0 = X.C29431cG.A0b(r5)
            X.72S r0 = (X.AnonymousClass72S) r0
            android.net.Uri r0 = r0.A0X
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0223
        L_0x0242:
            X.8B2 r2 = (X.AnonymousClass8B2) r2
            if (r2 == 0) goto L_0x0017
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = X.C108945cZ.A0g(r4)
            r0.A0V(r2)
            return
        L_0x024e:
            r2 = 0
            goto L_0x0242
        L_0x0250:
            java.lang.Object r3 = r9.A01
            X.5ia r3 = (X.C111175ia) r3
            java.lang.Object r2 = r9.A02
            X.1DS r2 = (X.AnonymousClass1DS) r2
            X.9f9 r10 = (X.C187029f9) r10
            int r1 = r10.A00
            r0 = 5
            if (r1 == r0) goto L_0x0263
            r3.A0V(r10)
            return
        L_0x0263:
            r2.A0F(r10)
            return
        L_0x0267:
            java.lang.Object r1 = r9.A01
            X.7K9 r1 = (X.AnonymousClass7K9) r1
            java.lang.Object r0 = r9.A02
            java.util.Collection r0 = (java.util.Collection) r0
            X.AnonymousClass7K9.A03(r1, r0)
            return
        L_0x0273:
            java.lang.Object r4 = r9.A01
            X.6q8 r4 = (X.C134156q8) r4
            java.lang.Object r0 = r9.A02
            X.2qo r0 = (X.C62112qo) r0
            X.77Z r10 = (X.AnonymousClass77Z) r10
            X.88w r0 = r0.A01(r10)
            if (r0 != 0) goto L_0x02a6
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
        L_0x0287:
            boolean r0 = r1.isEmpty()
            X.1jz r3 = r4.A0D
            if (r0 == 0) goto L_0x0290
            r1 = 0
        L_0x0290:
            r3.A0C = r1
            r3.A06 = r10
            r2 = 1
            r3.A0G = r2
            X.10I r1 = r4.A0F
            r0 = 6
            X.AnonymousClass3MZ.A1U(r1, r4, r0)
            int r0 = r3.A02
            if (r0 == 0) goto L_0x02a2
            r2 = 0
        L_0x02a2:
            r4.A01(r2)
            return
        L_0x02a6:
            java.util.Set r0 = r0.BYj()
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            goto L_0x0287
        L_0x02af:
            java.lang.Object r2 = r9.A01
            X.6k7 r2 = (X.C130856k7) r2
            java.lang.Object r0 = r9.A02
            X.1DS r0 = (X.AnonymousClass1DS) r0
            X.6iQ r1 = r2.A08
            java.lang.Object r0 = r0.A06()
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.A03 = r0
            X.1Dg r0 = r2.A02
            r0.A0E(r1)
            return
        L_0x02c9:
            java.lang.Object r3 = r9.A01
            com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity r3 = (com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity) r3
            java.lang.Object r2 = r9.A02
            X.2Dk r2 = (X.C46162Dk) r2
            X.0zA r1 = r3.A04
            if (r1 == 0) goto L_0x02fc
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x02e5
            r1.A03()
            java.lang.String r0 = "logMetaVerifiedChannelAction"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02e5:
            X.00H r0 = r3.A0E
            if (r0 == 0) goto L_0x02f9
            r0.get()
            X.1ch r1 = r2.A0M()
            r0 = 4
            android.content.Intent r1 = X.AnonymousClass1LU.A15(r3, r1, r0)
            r0 = 100
            goto L_0x0385
        L_0x02f9:
            java.lang.String r0 = "waIntents"
            goto L_0x034c
        L_0x02fc:
            java.lang.String r0 = "subscriptionAnalyticsManager"
            goto L_0x034c
        L_0x02ff:
            java.lang.Object r3 = r9.A01
            X.6BJ r3 = (X.AnonymousClass6BJ) r3
            java.lang.Object r4 = r9.A02
            X.4Yb r4 = (X.C88034Yb) r4
            android.content.DialogInterface r10 = (android.content.DialogInterface) r10
            java.lang.Integer r0 = r4.A02
            int r1 = r0.intValue()
            r0 = 3
            if (r1 == r0) goto L_0x033c
            r0 = 2
            if (r1 != r0) goto L_0x0338
            java.lang.Integer r2 = X.AnonymousClass6BJ.A0c(r3)
            X.3VT r0 = r3.A0B
            if (r0 == 0) goto L_0x034a
            X.4mD r0 = r0.A02
            X.1DT r0 = r0.A00
            java.lang.Object r1 = r0.A06()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0338
            X.1ch r0 = r4.A01
            java.lang.Object r0 = r1.get(r0)
            X.4Tp r0 = (X.C86924Tp) r0
            if (r0 == 0) goto L_0x0338
            X.2Dk r0 = r0.A00
            X.AnonymousClass6BJ.A0u(r0, r3, r2)
        L_0x0338:
            r10.dismiss()
            return
        L_0x033c:
            java.lang.Integer r2 = X.AnonymousClass6BJ.A0d(r3)
            X.1ch r1 = r4.A01
            X.3VT r0 = r3.A0B
            if (r0 == 0) goto L_0x034a
            r0.A0T(r1, r2)
            goto L_0x0338
        L_0x034a:
            java.lang.String r0 = "newsletterListViewModel"
        L_0x034c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0351:
            java.lang.Object r4 = r9.A01
            X.1FP r4 = (X.AnonymousClass1FP) r4
            java.lang.Object r3 = r9.A02
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.10I r2 = r4.A05
            r1 = 34
            X.AkP r0 = new X.AkP
            r0.<init>(r4, r3, r1)
            r2.CGN(r0)
            return
        L_0x0368:
            java.lang.Object r3 = r9.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r3 = (com.whatsapp.newsletter.NewsletterInfoActivity) r3
            java.lang.Object r1 = r9.A02
            X.2Dk r1 = (X.C46162Dk) r1
            com.whatsapp.newsletter.NewsletterInfoActivity.A16(r3)
            X.00H r0 = r3.A4p()
            r0.get()
            X.1ch r1 = r1.A0M()
            r0 = 5
            android.content.Intent r1 = X.AnonymousClass1LU.A15(r3, r1, r0)
            r0 = 1054(0x41e, float:1.477E-42)
        L_0x0385:
            r3.startActivityForResult(r1, r0)
            return
        L_0x0389:
            java.lang.Object r0 = r9.A02
            X.1DS r0 = (X.AnonymousClass1DS) r0
            r0.A0D(r9)
            java.lang.Object r0 = r9.A01
            X.1Di r0 = (X.C22821Di) r0
            r0.invoke(r10)
            return
        L_0x0398:
            java.lang.Object r2 = r9.A01
            X.1cN r2 = (X.C29491cN) r2
            java.lang.Object r1 = r9.A02
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r2.A0C(r1, r0)
            return
        L_0x03a5:
            java.lang.Object r2 = r9.A01
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r2
            java.lang.Object r0 = r9.A02
            X.8yP r0 = (X.C175258yP) r0
            X.4Sa r1 = r0.A07()
            r0 = 0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(r1, r2, r0)
            return
        L_0x03b6:
            java.lang.Object r0 = r9.A01
            X.7JX r0 = (X.AnonymousClass7JX) r0
            java.lang.Object r4 = r9.A02
            android.view.View r4 = (android.view.View) r4
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r3 = r0.A00
            if (r10 == 0) goto L_0x03cb
            boolean r1 = r10.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x03cc
        L_0x03cb:
            r0 = 0
        L_0x03cc:
            r3.A0I = r0
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r4)
            if (r0 == 0) goto L_0x03e5
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r3)
            r0 = 2131165285(0x7f070065, float:1.7944783E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.topMargin = r0
        L_0x03e1:
            r4.setLayoutParams(r2)
            return
        L_0x03e5:
            r0 = 0
            r2.topMargin = r0
            r2.bottomMargin = r0
            goto L_0x03e1
        L_0x03eb:
            r0 = 1
            r1.A09 = r0
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AH.Bo9(java.lang.Object):void");
    }
}
