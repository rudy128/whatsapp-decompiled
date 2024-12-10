package X;

/* renamed from: X.7AR  reason: invalid class name */
public class AnonymousClass7AR implements C22851Dl {
    public final int A00;
    public final Object A01;

    public AnonymousClass7AR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1F9 r1, AnonymousClass1DS r2, int i) {
        r2.A0A(r1, new AnonymousClass7AR(r1, i));
    }

    public static void A01(AnonymousClass1F9 r1, AnonymousClass1DS r2, Object obj, int i) {
        r2.A0A(r1, new AnonymousClass7AR(obj, i));
    }

    public static void A02(AnonymousClass1DS r1, C22801Dg r2, Object obj, int i) {
        r2.A0H(r1, new AnonymousClass7AR(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v67, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v114, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v115, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r6v4, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v75, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x068c, code lost:
        r4.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x068e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x08ea, code lost:
        r0 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x08fb, code lost:
        r2.A01(X.AnonymousClass000.A1P(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0902, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x091c, code lost:
        r2.A02.A0E(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0921, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0165, code lost:
        X.C111295jU.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0168, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0592  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r22
            r2 = r21
            int r1 = r2.A00
            switch(r1) {
                case 0: goto L_0x0912;
                case 1: goto L_0x0903;
                case 2: goto L_0x068f;
                case 3: goto L_0x08ed;
                case 4: goto L_0x08df;
                case 5: goto L_0x08c3;
                case 6: goto L_0x08b8;
                case 7: goto L_0x066b;
                case 8: goto L_0x0637;
                case 9: goto L_0x0009;
                case 10: goto L_0x0009;
                case 11: goto L_0x0009;
                case 12: goto L_0x0892;
                case 13: goto L_0x0850;
                case 14: goto L_0x0824;
                case 15: goto L_0x07ec;
                case 16: goto L_0x0617;
                case 17: goto L_0x07c2;
                case 18: goto L_0x05da;
                case 19: goto L_0x04cd;
                case 20: goto L_0x0495;
                case 21: goto L_0x046b;
                case 22: goto L_0x03f7;
                case 23: goto L_0x0718;
                case 24: goto L_0x02da;
                case 25: goto L_0x070b;
                case 26: goto L_0x025f;
                case 27: goto L_0x0239;
                case 28: goto L_0x01f1;
                case 29: goto L_0x01ce;
                case 30: goto L_0x01bb;
                case 31: goto L_0x0009;
                case 32: goto L_0x0009;
                case 33: goto L_0x01ab;
                case 34: goto L_0x0169;
                case 35: goto L_0x0155;
                case 36: goto L_0x0144;
                case 37: goto L_0x0122;
                case 38: goto L_0x0111;
                case 39: goto L_0x00e4;
                case 40: goto L_0x06fd;
                case 41: goto L_0x06e1;
                case 42: goto L_0x06d9;
                case 43: goto L_0x06d9;
                case 44: goto L_0x00a5;
                case 45: goto L_0x0063;
                case 46: goto L_0x0063;
                case 47: goto L_0x0063;
                case 48: goto L_0x06c6;
                case 49: goto L_0x06be;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r2.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            com.whatsapp.search.SearchFragment.A08(r3)
            r2 = 4
            if (r22 == 0) goto L_0x0055
            java.lang.Integer r1 = X.AnonymousClass3MY.A0f()
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0055
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0055
            boolean r0 = X.C108985cd.A1X(r3)
            if (r0 == 0) goto L_0x0032
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0032
            r0.setVisibility(r2)
        L_0x0032:
            java.lang.Integer r1 = X.C17880vN.A0i()
            X.5jU r0 = r3.A0b
            X.1DS r0 = r0.A0U
            boolean r0 = X.C108965cb.A1W(r0, r1)
            if (r0 == 0) goto L_0x0043
            com.whatsapp.search.SearchFragment.A07(r3)
        L_0x0043:
            com.airbnb.lottie.LottieAnimationView r1 = r3.A06
            if (r1 == 0) goto L_0x0054
            X.5jU r0 = r3.A0b
            boolean r0 = r0.A0q()
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
        L_0x0054:
            return
        L_0x0055:
            boolean r0 = X.C108985cd.A1X(r3)
            if (r0 == 0) goto L_0x0043
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0043
            r0.setVisibility(r2)
            goto L_0x0043
        L_0x0063:
            java.lang.Object r4 = r2.A01
            X.5jU r4 = (X.C111295jU) r4
            X.1Dg r0 = r4.A0h
            java.lang.Object r0 = r0.A06()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r3 = 0
            if (r0 != 0) goto L_0x00a0
            r2 = 0
        L_0x0073:
            X.1DT r1 = r4.A0j
            java.lang.Object r0 = r1.A06()
            if (r0 != 0) goto L_0x009b
            r1 = 0
        L_0x007c:
            boolean r0 = X.C111295jU.A0H(r4)
            if (r0 == 0) goto L_0x0087
            int r0 = r2 + -3
            if (r1 <= r0) goto L_0x0087
            r3 = 1
        L_0x0087:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            X.1Dg r1 = r4.A0f
            java.lang.Object r0 = r1.A06()
            boolean r0 = X.C42171xk.A00(r2, r0)
            if (r0 != 0) goto L_0x0054
            r1.A0F(r2)
            return
        L_0x009b:
            int r1 = X.C72463Mc.A0A(r1)
            goto L_0x007c
        L_0x00a0:
            int r2 = r0.size()
            goto L_0x0073
        L_0x00a5:
            java.lang.Object r5 = r2.A01
            X.5jU r5 = (X.C111295jU) r5
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x00b3:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00d0
            java.lang.Object r2 = r3.next()
            X.6FH r2 = (X.AnonymousClass6FH) r2
            X.1E7 r1 = r2.A01
            com.whatsapp.jid.Jid r1 = X.AnonymousClass3MW.A0g(r1)
            if (r1 == 0) goto L_0x00b3
            X.1xm r1 = new X.1xm
            r1.<init>(r2)
            r4.add(r1)
            goto L_0x00b3
        L_0x00d0:
            r5.A0L = r4
            X.C111295jU.A08(r5)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0054
            r1 = 2
            int r0 = r0.size()
            X.C111295jU.A0A(r5, r1, r0)
            return
        L_0x00e4:
            java.lang.Object r3 = r2.A01
            X.5jU r3 = (X.C111295jU) r3
            X.6yD r0 = (X.C139096yD) r0
            X.6yD r1 = r0.A00()
            r3.A06 = r1
            java.lang.Runnable r1 = r3.A0E
            if (r1 == 0) goto L_0x00f7
            r1.run()
        L_0x00f7:
            android.os.Handler r2 = r3.A0T
            r1 = 0
            r2.removeMessages(r1)
            X.C111295jU.A08(r3)
            java.util.List r1 = r0.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0054
            int r1 = r1.size()
            r0 = 4
            X.C111295jU.A0A(r3, r0, r1)
            return
        L_0x0111:
            java.lang.Object r2 = r2.A01
            X.5jU r2 = (X.C111295jU) r2
            X.77M r0 = (X.AnonymousClass77M) r0
            X.77M r1 = r2.A04
            boolean r1 = X.C42171xk.A00(r0, r1)
            if (r1 != 0) goto L_0x0054
            r2.A04 = r0
            goto L_0x0165
        L_0x0122:
            java.lang.Object r3 = r2.A01
            X.5jU r3 = (X.C111295jU) r3
            X.77Z r0 = (X.AnonymousClass77Z) r0
            X.77Z r1 = r3.A0B
            boolean r1 = X.C42171xk.A00(r0, r1)
            if (r1 != 0) goto L_0x0054
            X.0zA r2 = r3.A0m
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x0922
            if (r0 == 0) goto L_0x0922
            r2.A03()
            java.lang.String r0 = "logSmartFilterEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0144:
            java.lang.Object r2 = r2.A01
            X.5jU r2 = (X.C111295jU) r2
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.whatsapp.jid.UserJid r1 = r2.A03
            boolean r1 = X.C42171xk.A00(r0, r1)
            if (r1 != 0) goto L_0x0054
            r2.A03 = r0
            goto L_0x0165
        L_0x0155:
            java.lang.Object r2 = r2.A01
            X.5jU r2 = (X.C111295jU) r2
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Integer r1 = r2.A0C
            boolean r1 = X.C42171xk.A00(r0, r1)
            if (r1 != 0) goto L_0x0054
            r2.A0C = r0
        L_0x0165:
            X.C111295jU.A07(r2)
            return
        L_0x0169:
            java.lang.Object r6 = r2.A01
            X.5jU r6 = (X.C111295jU) r6
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r6.A0F
            boolean r1 = X.C42171xk.A00(r0, r1)
            if (r1 != 0) goto L_0x0054
            r6.A0F = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x095c
            X.0ve r0 = r6.A0y
            boolean r0 = X.C20135A8w.A08(r0)
            if (r0 == 0) goto L_0x0195
            X.A8w r2 = r6.A02
            if (r2 == 0) goto L_0x0195
            long r0 = java.lang.System.nanoTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
        L_0x0195:
            X.0zA r2 = r6.A0m
            boolean r1 = r2.A07()
            r0 = 4
            if (r1 == 0) goto L_0x0928
            r2.A03()
            r6.A0a()
            java.lang.String r0 = "logSmartFilterEventWithDebounceDelay"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01ab:
            java.lang.Object r1 = r2.A01
            X.5jU r1 = (X.C111295jU) r1
            boolean r0 = X.C111295jU.A0I(r1)
            if (r0 == 0) goto L_0x0054
            X.6q8 r0 = r1.A14
            r0.A00()
            return
        L_0x01bb:
            java.lang.Object r4 = r2.A01
            com.whatsapp.search.SearchFragment r4 = (com.whatsapp.search.SearchFragment) r4
            if (r22 == 0) goto L_0x0054
            X.1KB r3 = r4.A0F
            r2 = 12
            X.7Pl r1 = new X.7Pl
            r1.<init>(r4, r0, r2)
            r3.A0J(r1)
            return
        L_0x01ce:
            java.lang.Object r0 = r2.A01
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            X.5lL r3 = r0.A0a
            r2 = 0
        L_0x01d5:
            X.7Sy r1 = r3.A0S
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0054
            int r1 = X.C108955ca.A07(r1, r2)
            r0 = 2
            if (r1 == r0) goto L_0x01eb
            r0 = 3
            if (r1 == r0) goto L_0x01eb
            r0 = 25
            if (r1 != r0) goto L_0x01ee
        L_0x01eb:
            r3.A0G(r2)
        L_0x01ee:
            int r2 = r2 + 1
            goto L_0x01d5
        L_0x01f1:
            java.lang.Object r1 = r2.A01
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            if (r22 == 0) goto L_0x0054
            X.5lL r4 = r1.A0a
            X.7Sy r3 = r4.A0S
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0054
            X.5jU r2 = r4.A0T
            X.1Dg r1 = r2.A0g
            java.lang.Object r1 = r1.A06()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0054
            com.whatsapp.jid.UserJid r1 = r2.A0Y()
            if (r1 != 0) goto L_0x0054
            int r1 = r2.A0U()
            if (r1 != 0) goto L_0x0054
            X.77Z r1 = r2.A0a()
            if (r1 != 0) goto L_0x0054
            X.77M r1 = r2.A0Z()
            if (r1 != 0) goto L_0x0054
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto L_0x0054
            r1 = 47
            X.AnonymousClass6FD.A02(r0, r3, r1)
            r4.A0H(r2)
            return
        L_0x0239:
            java.lang.Object r3 = r2.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            X.1BI r0 = (X.AnonymousClass1BI) r0
            com.whatsapp.search.SearchFragment.A04(r0, r3)
            X.1MC r2 = r3.A0I
            r1 = 4
            r2.A01 = r1
            androidx.recyclerview.widget.RecyclerView r2 = r3.A05
            X.5jU r1 = r3.A0b
            int r1 = r1.A0V(r0)
            X.1xT r2 = r2.A0O(r1)
            if (r2 == 0) goto L_0x0054
            r3.A0Y = r0
            androidx.recyclerview.widget.RecyclerView r1 = r3.A05
            android.view.View r0 = r2.A0H
            r1.showContextMenuForChild(r0)
            return
        L_0x025f:
            java.lang.Object r5 = r2.A01
            com.whatsapp.search.SearchFragment r5 = (com.whatsapp.search.SearchFragment) r5
            X.1BI r0 = (X.AnonymousClass1BI) r0
            com.whatsapp.search.SearchFragment.A04(r0, r5)
            X.1f4 r1 = r5.A0M
            r1.A06()
            androidx.recyclerview.widget.RecyclerView r2 = r5.A05
            X.5jU r1 = r5.A0b
            int r1 = r1.A0V(r0)
            X.1xT r2 = r2.A0O(r1)
            if (r2 == 0) goto L_0x0054
            boolean r1 = r2 instanceof X.C42071xZ
            if (r1 == 0) goto L_0x02c7
            X.1xZ r2 = (X.C42071xZ) r2
            X.1bI r1 = r2.A0U
            int r1 = r1.A01()
            if (r1 != 0) goto L_0x02c4
            X.1bI r1 = r2.A0U
            android.view.View r1 = r1.A02()
            X.86t r1 = (X.C1600086t) r1
            android.view.View r3 = r1.getTransitionView()
        L_0x0295:
            if (r3 == 0) goto L_0x0054
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r0)
            X.5jJ r1 = r5.A0g
            if (r1 == 0) goto L_0x0960
            if (r2 == 0) goto L_0x0960
            X.6yE r2 = r1.A0T(r2)
            r1 = 0
            boolean r1 = X.AnonymousClass73K.A03(r2, r1)
            if (r1 == 0) goto L_0x0960
            X.5jJ r4 = r5.A0g
            java.lang.Integer r2 = X.C108955ca.A0f()
            r1 = 0
            r3 = 0
            r4.A0W(r0, r2, r1, r3)
            android.content.Context r2 = r5.A14()
            r1 = 1
            android.content.Intent r0 = X.AnonymousClass1LU.A0j(r2, r0, r1, r3, r3)
            r5.A1k(r0)
            return
        L_0x02c4:
            android.widget.ImageView r3 = r2.A04
            goto L_0x0295
        L_0x02c7:
            boolean r1 = r2 instanceof X.AnonymousClass66H
            if (r1 == 0) goto L_0x02d0
            X.66H r2 = (X.AnonymousClass66H) r2
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r3 = r2.A00
            goto L_0x0295
        L_0x02d0:
            android.view.View r2 = r2.A0H
            r1 = 2131429433(0x7f0b0839, float:1.8480539E38)
            android.view.View r3 = r2.findViewById(r1)
            goto L_0x0295
        L_0x02da:
            java.lang.Object r1 = r2.A01
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            X.21V r0 = (X.AnonymousClass21V) r0
            X.205 r9 = r0.A0v
            X.1BI r2 = r9.A00
            com.whatsapp.search.SearchFragment.A04(r2, r1)
            boolean r3 = r0 instanceof X.C441322g
            r2 = 0
            if (r3 == 0) goto L_0x0322
            X.22g r0 = (X.C441322g) r0
            X.00H r3 = r1.A16
            java.lang.Object r3 = r3.get()
            X.70H r3 = (X.AnonymousClass70H) r3
            X.77d r6 = r3.A01(r0)
            X.205 r3 = r0.A0v
            X.1BI r0 = r3.A00
            if (r0 == 0) goto L_0x0304
            java.lang.String r2 = r0.getRawString()
        L_0x0304:
            X.00H r0 = r1.A17
            r0.get()
            boolean r0 = r3.A02
            X.6Ra r7 = X.C122606Ra.FULL_TEXT_SEARCH
            r4 = 0
            r10 = 0
            r9 = r0
            r5 = r3
            r8 = r2
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r2 = X.C124156Xg.A00(r4, r5, r6, r7, r8, r9, r10)
            android.content.Context r0 = r1.A1n()
            X.1FU r0 = X.AnonymousClass3MZ.A0P(r0)
            r0.CMl(r2)
            return
        L_0x0322:
            boolean r3 = r0 instanceof X.C441522i
            if (r3 == 0) goto L_0x0351
            X.22i r0 = (X.C441522i) r0
            java.lang.String r4 = r0.A06
            if (r4 == 0) goto L_0x0054
            X.00H r0 = r1.A1A
            android.content.Context r0 = X.C108955ca.A0A(r1, r0)
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity"
            r3.setClassName(r2, r0)
            java.lang.String r0 = "sticker_pack_id"
            r3.putExtra(r0, r4)
            X.AnonymousClass4aU.A00(r3, r9)
            java.lang.String r2 = "sticker_pack_preview_source"
            r0 = 7
            r3.putExtra(r2, r0)
            r1.A1k(r3)
            return
        L_0x0351:
            X.5jU r3 = r1.A0b
            int r4 = r3.A0X(r0)
            r3 = -2
            if (r4 != r3) goto L_0x0364
            X.1KB r2 = r1.A0F
            r1 = 2131890612(0x7f1211b4, float:1.941592E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x0364:
            androidx.recyclerview.widget.RecyclerView r3 = r1.A05
            X.1xT r3 = r3.A0O(r4)
            if (r3 == 0) goto L_0x0375
            android.view.View r3 = r3.A0H
            r2 = 2131436134(0x7f0b2266, float:1.849413E38)
            android.view.View r2 = r3.findViewById(r2)
        L_0x0375:
            X.5jU r4 = r1.A0b
            r3 = 4
            r4.A0h(r3)
            X.0zA r4 = r1.A08
            boolean r3 = r4.A07()
            if (r3 == 0) goto L_0x0054
            r4.A03()
            long r15 = android.os.SystemClock.uptimeMillis()
            X.1FL r3 = r1.A1D()
            android.os.Bundle r7 = X.AnonymousClass745.A04(r3, r2)
            r8 = 0
            r10 = 0
            r11 = 5
            r12 = 1
            r13 = 2
            r14 = -1
            r18 = r10
            r19 = r10
            r20 = r10
            r17 = r10
            com.whatsapp.mediaview.MediaViewFragment r9 = com.whatsapp.mediaview.MediaViewFragment.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            X.0ve r11 = r1.A0X
            X.1FL r10 = r1.A1D()
            r3 = 9
            X.7Qo r8 = new X.7Qo
            r8.<init>((java.lang.Object) r1, (int) r3)
            java.lang.String r7 = "media_view_fragment"
            r6 = 2131432396(0x7f0b13cc, float:1.8486548E38)
            X.4ZR r5 = new X.4ZR
            r5.<init>(r10)
            X.1GP r4 = r10.getSupportFragmentManager()
            boolean r3 = X.AnonymousClass745.A00
            if (r3 == 0) goto L_0x03cf
            boolean r1 = X.C1402270m.A01(r11)
            if (r1 != 0) goto L_0x03cf
            X.1mt r1 = androidx.fragment.app.Fragment.A0K(r9)
            r1.A0E = r12
        L_0x03cf:
            r9.A0E = r8
            X.01E r10 = (X.AnonymousClass01E) r10
            java.lang.String r1 = X.AnonymousClass4W0.A01(r0)
            if (r3 == 0) goto L_0x03f1
            if (r2 == 0) goto L_0x03f1
            boolean r0 = X.C1402270m.A01(r11)
            if (r0 != 0) goto L_0x03f1
            X.1jj r0 = X.AnonymousClass6A9.A00(r2, r10, r4, r5, r1)
        L_0x03e5:
            r0.A0G = r12
            r0.A0D(r9, r7, r6)
            r0.A0H(r7)
            r0.A01()
            return
        L_0x03f1:
            X.1jj r0 = new X.1jj
            r0.<init>(r4)
            goto L_0x03e5
        L_0x03f7:
            java.lang.Object r1 = r2.A01
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            com.whatsapp.search.views.ProgressView r5 = r1.A0c
            if (r5 == 0) goto L_0x0054
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = r1.equals(r0)
            boolean r11 = X.AnonymousClass000.A1O(r0)
            android.animation.AnimatorSet r0 = r5.A00
            if (r0 == 0) goto L_0x0410
            r0.cancel()
        L_0x0410:
            android.animation.AnimatorSet r0 = X.C108945cZ.A0B()
            r5.A00 = r0
            r10 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x041e
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x041e:
            r8 = 0
            if (r11 == 0) goto L_0x0469
            int r1 = r5.A03
        L_0x0423:
            r0 = 0
            android.animation.ValueAnimator r7 = X.AnonymousClass6XP.A00(r5, r0, r1)
            com.whatsapp.CircularProgressBar r6 = r5.A04
            r4 = 2
            float[] r1 = new float[r4]
            r1[r8] = r9
            r2 = 1
            r1[r2] = r10
            java.lang.String r0 = "scaleX"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r6, r0, r1)
            float[] r1 = new float[r4]
            r1[r8] = r9
            r1[r2] = r10
            java.lang.String r0 = "scaleY"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r6, r0, r1)
            android.animation.AnimatorSet r1 = r5.A00
            r0 = 3
            android.animation.Animator[] r0 = X.C108945cZ.A1Z(r7, r3, r0, r8)
            r0[r4] = r2
            r1.playTogether(r0)
            android.animation.AnimatorSet r4 = r5.A00
            r2 = 800(0x320, double:3.953E-321)
            if (r11 == 0) goto L_0x0466
            r0 = 800(0x320, double:3.953E-321)
        L_0x0458:
            r4.setStartDelay(r0)
            android.animation.AnimatorSet r0 = r5.A00
            r0.setDuration(r2)
            android.animation.AnimatorSet r0 = r5.A00
            r0.start()
            return
        L_0x0466:
            r0 = 0
            goto L_0x0458
        L_0x0469:
            r1 = 0
            goto L_0x0423
        L_0x046b:
            java.lang.Object r3 = r2.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0054
            X.1FL r1 = r3.A1B()
            if (r1 == 0) goto L_0x0054
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x0054
            int r2 = r0.intValue()
            r1 = 4
            if (r2 == 0) goto L_0x0987
            r0 = 1
            if (r2 == r0) goto L_0x098a
            r0 = 2
            if (r2 == r0) goto L_0x098a
            r0 = 3
            if (r2 == r0) goto L_0x098a
            if (r2 == r1) goto L_0x098a
            r0 = 5
            if (r2 == r0) goto L_0x0987
            return
        L_0x0495:
            java.lang.Object r1 = r2.A01
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            java.util.Collection r0 = (java.util.Collection) r0
            X.5lL r5 = r1.A0a
            if (r0 != 0) goto L_0x04a3
            r5.notifyDataSetChanged()
            return
        L_0x04a3:
            java.util.Iterator r4 = r0.iterator()
        L_0x04a7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r3 = r4.next()
            if (r3 == 0) goto L_0x04a7
            r2 = 0
        L_0x04b4:
            X.7Sy r1 = r5.A0S
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x04a7
            java.lang.Object r0 = X.C108955ca.A0o(r1, r2)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x04ca
            r5.A0G(r2)
            return
        L_0x04ca:
            int r2 = r2 + 1
            goto L_0x04b4
        L_0x04cd:
            java.lang.Object r5 = r2.A01
            com.whatsapp.search.SearchFragment r5 = (com.whatsapp.search.SearchFragment) r5
            X.7Sy r0 = (X.C147387Sy) r0
            X.11C r1 = r5.A0O
            boolean r1 = X.C108965cb.A1X(r1)
            if (r1 == 0) goto L_0x0500
            int r4 = r0.size()
            r3 = 0
            if (r4 <= 0) goto L_0x0586
            int r2 = X.C108955ca.A07(r0, r3)
            r1 = 13
            if (r2 != r1) goto L_0x058a
        L_0x04ea:
            r1 = 2131886286(0x7f1200ce, float:1.9407147E38)
        L_0x04ed:
            java.lang.String r3 = r5.A1H(r1)
        L_0x04f1:
            X.00H r1 = r5.A19
            java.lang.Object r2 = r1.get()
            X.6mp r2 = (X.C132446mp) r2
            android.content.Context r1 = r5.A1n()
            r2.A00(r1, r3)
        L_0x0500:
            X.5lL r7 = r5.A0a
            X.5jU r1 = r5.A0b
            java.lang.String r8 = r1.A0b()
            X.118 r4 = r7.A0K
            X.1gU r3 = r7.A0N
            X.0vb r2 = r7.A0L
            X.6wQ r1 = r7.A0U
            X.7Sy r6 = new X.7Sy
            r6.<init>(r4, r2, r3, r1)
            r6.addAll(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0560
            androidx.recyclerview.widget.RecyclerView r2 = r7.A00
            if (r2 == 0) goto L_0x0584
            r1 = -1
            boolean r1 = r2.canScrollVertically(r1)
            if (r1 != 0) goto L_0x0584
            X.5jU r1 = r7.A0T
            X.1DT r2 = r1.A0i
            java.lang.Object r1 = r2.A06()
            if (r1 == 0) goto L_0x053b
            int r2 = X.C72463Mc.A0A(r2)
            r1 = 24
            if (r2 > r1) goto L_0x0584
        L_0x053b:
            r4 = 1
        L_0x053c:
            X.7Sy r3 = r7.A0S
            java.lang.String r2 = r7.A01
            X.5jj r1 = new X.5jj
            r1.<init>(r3, r6, r2, r8)
            X.Cl4 r2 = X.C25367CeS.A00(r1)
            r3.clear()
            r3.addAll(r6)
            r7.A01 = r8
            X.7Ad r1 = r7.A0R
            r2.A01(r1)
            if (r4 == 0) goto L_0x0560
            X.5jU r1 = r7.A0T
            r2 = 0
            X.1wy r1 = r1.A1J
            X.AnonymousClass3MX.A1J(r1, r2)
        L_0x0560:
            X.5lL r4 = r5.A0a
            r3 = 0
        L_0x0563:
            X.7Sy r2 = r4.A0S
            int r1 = r2.size()
            if (r3 >= r1) goto L_0x05a0
            int r2 = X.C108955ca.A07(r2, r3)
            r1 = 1
            if (r2 == r1) goto L_0x057e
            r1 = 12
            if (r2 == r1) goto L_0x057e
            r1 = 31
            if (r2 == r1) goto L_0x057e
            r1 = 39
            if (r2 != r1) goto L_0x0581
        L_0x057e:
            r4.A0G(r3)
        L_0x0581:
            int r3 = r3 + 1
            goto L_0x0563
        L_0x0584:
            r4 = 0
            goto L_0x053c
        L_0x0586:
            if (r4 != 0) goto L_0x058a
            goto L_0x04ea
        L_0x058a:
            r1 = 1
            if (r4 != r1) goto L_0x0592
            r1 = 2131886288(0x7f1200d0, float:1.940715E38)
            goto L_0x04ed
        L_0x0592:
            r2 = 2131886287(0x7f1200cf, float:1.9407149E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.C17880vN.A1T(r1, r4, r3)
            java.lang.String r3 = r5.A1I(r2, r1)
            goto L_0x04f1
        L_0x05a0:
            X.00H r1 = r5.A0y
            java.lang.Object r4 = r1.get()
            X.1rX r4 = (X.C38581rX) r4
            X.0ve r3 = r4.A01
            X.0vf r2 = X.C18040vf.A01
            r1 = 8211(0x2013, float:1.1506E-41)
            boolean r1 = X.C18020vd.A05(r2, r3, r1)
            if (r1 == 0) goto L_0x0054
            boolean r1 = r4.A01()
            if (r1 == 0) goto L_0x0054
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0054
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            X.5jU r1 = r5.A0b
            X.1Dg r1 = r1.A0f
            boolean r1 = X.C108965cb.A1W(r1, r2)
            if (r1 != 0) goto L_0x0054
            X.77E r2 = X.C111295jU.A00(r0)
            com.whatsapp.search.views.TokenizedSearchInput r1 = r5.A0d
            r0 = 3
            if (r2 == 0) goto L_0x05d6
            r0 = 4
        L_0x05d6:
            r1.setInputEnterAction(r0)
            return
        L_0x05da:
            java.lang.Object r2 = r2.A01
            com.whatsapp.search.SearchFragment r2 = (com.whatsapp.search.SearchFragment) r2
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0054
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0054
            android.view.View r0 = r2.A0B
            if (r0 == 0) goto L_0x0054
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x0054
            android.animation.ValueAnimator r0 = r2.A00
            if (r0 == 0) goto L_0x05fe
            r0.cancel()
            r0 = 0
            r2.A00 = r0
        L_0x05fe:
            X.5jU r1 = r2.A0b
            if (r1 == 0) goto L_0x0606
            r0 = 2
            r1.A0h(r0)
        L_0x0606:
            android.view.View r0 = r2.A0B
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            X.C72473Md.A10(r0)
            android.view.ViewGroup r0 = r2.A02
            r0.forceLayout()
            return
        L_0x0617:
            java.lang.Object r1 = r2.A01
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            X.5lL r4 = r1.A0a
            r3 = 0
        L_0x061e:
            X.7Sy r2 = r4.A0S
            int r1 = r2.size()
            if (r3 >= r1) goto L_0x0054
            java.lang.Object r1 = X.C108955ca.A0o(r2, r3)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0634
            r4.A0G(r3)
            return
        L_0x0634:
            int r3 = r3 + 1
            goto L_0x061e
        L_0x0637:
            java.lang.Object r4 = r2.A01
            X.6kJ r4 = (X.C130976kJ) r4
            r1 = 0
            X.C18070vi.A0d(r4, r1)
            boolean r2 = r4.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            r4.A01 = r0
            if (r0 != 0) goto L_0x0054
            if (r2 == 0) goto L_0x0054
            X.1DS r0 = r4.A02
            java.lang.String r3 = X.C108945cZ.A1F(r0)
            if (r3 == 0) goto L_0x0054
            X.1OB r0 = r4.A00
            X.1dr r2 = X.C108975cc.A0j(r0)
            X.1OX r1 = r4.A0B
            com.whatsapp.search.NonContactsSearchManager$initSearch$1 r0 = new com.whatsapp.search.NonContactsSearchManager$initSearch$1
            r0.<init>(r4, r3, r2)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r0, r1)
            goto L_0x068c
        L_0x066b:
            java.lang.Object r4 = r2.A01
            X.6kJ r4 = (X.C130976kJ) r4
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            X.C18070vi.A0d(r4, r1)
            boolean r1 = r4.A01
            if (r1 != 0) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            X.1OB r1 = r4.A00
            X.1dr r3 = X.C108975cc.A0j(r1)
            X.1OX r2 = r4.A0B
            com.whatsapp.search.NonContactsSearchManager$initSearch$1 r1 = new com.whatsapp.search.NonContactsSearchManager$initSearch$1
            r1.<init>(r4, r0, r3)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r1, r2)
        L_0x068c:
            r4.A00 = r0
            return
        L_0x068f:
            java.lang.Object r4 = r2.A01
            X.6q8 r4 = (X.C134156q8) r4
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r3 = r0.second
            if (r3 == 0) goto L_0x0054
            java.lang.Object r1 = r0.first
            if (r1 == 0) goto L_0x06a3
            X.1jz r0 = r4.A0D
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r0.A08 = r1
        L_0x06a3:
            X.1jz r2 = r4.A0D
            int r0 = X.AnonymousClass000.A0M(r3)
            r2.A00 = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0G
            r0 = 1
            r1.set(r0)
            X.1DT r1 = r4.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0F(r0)
            X.1Dg r0 = r4.A00
            r0.A0E(r2)
            return
        L_0x06be:
            java.lang.Object r1 = r2.A01
            X.1DS r1 = (X.AnonymousClass1DS) r1
            r1.A0F(r0)
            return
        L_0x06c6:
            java.lang.Object r4 = r2.A01
            X.5jU r4 = (X.C111295jU) r4
            X.6nr r3 = r4.A1C
            r2 = 13
            X.7S0 r1 = new X.7S0
            r1.<init>(r0, r4, r2)
            r3.A00 = r1
            r3.A00()
            return
        L_0x06d9:
            java.lang.Object r0 = r2.A01
            X.5jU r0 = (X.C111295jU) r0
            X.C111295jU.A08(r0)
            return
        L_0x06e1:
            java.lang.Object r3 = r2.A01
            X.5jU r3 = (X.C111295jU) r3
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            if (r0 != 0) goto L_0x06f4
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r2 = 105(0x69, float:1.47E-43)
            r1 = 1
            r0.put(r2, r1)
        L_0x06f4:
            X.C111295jU.A06(r0, r3)
            r3.A01 = r0
            X.C111295jU.A08(r3)
            return
        L_0x06fd:
            java.lang.Object r1 = r2.A01
            X.5jU r1 = (X.C111295jU) r1
            X.6ep r0 = (X.C127726ep) r0
            java.util.List r0 = r0.A00
            r1.A0J = r0
            X.C111295jU.A08(r1)
            return
        L_0x070b:
            java.lang.Object r1 = r2.A01
            com.whatsapp.search.SearchFragment r1 = (com.whatsapp.search.SearchFragment) r1
            X.1BI r0 = (X.AnonymousClass1BI) r0
            com.whatsapp.search.SearchFragment.A04(r0, r1)
            r1.A26(r0)
            return
        L_0x0718:
            java.lang.Object r3 = r2.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r1 = r0.A0v
            X.1BI r4 = r1.A00
            com.whatsapp.search.SearchFragment.A04(r4, r3)
            com.whatsapp.search.SearchFragment.A08(r3)
            X.00H r1 = r3.A14
            java.lang.Object r1 = r1.get()
            X.1f7 r1 = (X.C31161f7) r1
            r1.A02(r4)
            X.1LU r6 = new X.1LU
            r6.<init>()
            android.content.Context r2 = r3.A14()
            X.5jU r1 = r3.A0b
            java.lang.String r5 = r1.A0b()
            android.content.Intent r2 = r6.A21(r2, r0)
            java.lang.String r1 = "query"
            android.content.Intent r2 = r2.putExtra(r1, r5)
            boolean r1 = X.C42701yb.A01(r4)
            if (r1 == 0) goto L_0x077b
            boolean r1 = r4 instanceof com.whatsapp.jid.UserJid
            if (r1 == 0) goto L_0x077b
            X.00H r1 = r3.A0p
            java.lang.Object r5 = r1.get()
            X.1Pl r5 = (X.C25741Pl) r5
            r1 = r4
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.24e r1 = r5.A01(r1)
            if (r1 == 0) goto L_0x077b
            boolean r1 = r1.A0I
            if (r1 == 0) goto L_0x077b
            java.lang.String r5 = "AISEARCH_TYPE_AHEAD_RESULT_MESSAGES"
            java.lang.String r1 = "bot_metrics_entrypoint"
            r2.putExtra(r1, r5)
            java.lang.String r5 = X.C17890vO.A0Q()
            java.lang.String r1 = "bot_metrics_destination_id"
            r2.putExtra(r1, r5)
        L_0x077b:
            if (r4 == 0) goto L_0x07a5
            X.0ve r6 = r3.A0X
            r5 = 12618(0x314a, float:1.7682E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r6, r5)
            if (r1 == 0) goto L_0x07a5
            long r5 = r0.A0x
            r10 = 0
            int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x07bc
            long r6 = r0.A0x
            long r8 = r0.A0y
            r12 = -9223372036854775808
            X.4Uc r5 = new X.4Uc
            r5.<init>(r6, r8, r10, r12)
        L_0x079c:
            X.5cB r1 = r3.A0N
            X.1FL r0 = r3.A1D()
            r1.CCB(r0, r5, r4)
        L_0x07a5:
            X.11P r1 = r3.A0P
            java.lang.String r0 = X.C108955ca.A0x(r3)
            X.C60442o2.A00(r2, r1, r0)
            X.1FL r1 = r3.A1B()
            boolean r0 = r1 instanceof X.C23181Fa
            if (r0 == 0) goto L_0x07be
            X.1Fa r1 = (X.C23181Fa) r1
            r1.BhJ(r2)
            return
        L_0x07bc:
            r5 = 0
            goto L_0x079c
        L_0x07be:
            r3.A1k(r2)
            return
        L_0x07c2:
            java.lang.Object r2 = r2.A01
            com.whatsapp.search.SearchFragment r2 = (com.whatsapp.search.SearchFragment) r2
            X.00H r0 = r2.A13
            java.lang.Object r0 = r0.get()
            X.4XB r0 = (X.AnonymousClass4XB) r0
            r1 = 18
            r0.A01(r1)
            X.00H r0 = r2.A0m
            java.lang.Object r4 = r0.get()
            X.73Z r4 = (X.AnonymousClass73Z) r4
            r0 = 1
            X.3ln r3 = new X.3ln
            r3.<init>(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 299(0x12b, float:4.19E-43)
            r0 = 0
            X.AnonymousClass73Z.A01(r3, r4, r2, r1, r0)
            return
        L_0x07ec:
            java.lang.Object r3 = r2.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            X.0yx r0 = (X.C19760yx) r0
            java.lang.Object r2 = r0.A00
            X.77E r2 = (X.AnonymousClass77E) r2
            java.lang.Object r0 = r0.A01
            X.772 r0 = (X.AnonymousClass772) r0
            X.6R7 r5 = r0.A01
            int r8 = r0.A00
            java.lang.String r6 = r2.A01
            if (r6 != 0) goto L_0x0804
            java.lang.String r6 = r2.A03
        L_0x0804:
            X.00H r0 = r3.A0m
            java.lang.Object r1 = r0.get()
            X.73Z r1 = (X.AnonymousClass73Z) r1
            r9 = 1
            java.lang.String r7 = r2.A02
            X.5w6 r4 = new X.5w6
            r4.<init>(r5, r6, r7, r8, r9)
            X.00H r0 = r3.A10
            java.lang.Object r0 = r0.get()
            X.2hn r0 = (X.C56642hn) r0
            boolean r0 = r0.A00(r6)
            r1.A06(r4, r0)
            return
        L_0x0824:
            java.lang.Object r5 = r2.A01
            com.whatsapp.search.SearchFragment r5 = (com.whatsapp.search.SearchFragment) r5
            X.00H r0 = r5.A0r
            java.lang.Object r2 = r0.get()
            X.4VV r2 = (X.AnonymousClass4VV) r2
            r1 = 7
            r0 = 1
            r2.A01(r1, r0)
            X.1L9 r4 = r5.A0A
            android.content.Context r3 = r5.A14()
            android.content.Context r0 = r5.A14()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.LockedConversationsActivity"
            r2.setClassName(r1, r0)
            r4.A08(r3, r2)
            return
        L_0x0850:
            java.lang.Object r3 = r2.A01
            com.whatsapp.search.SearchFragment r3 = (com.whatsapp.search.SearchFragment) r3
            X.00H r0 = r3.A18
            java.lang.Object r2 = r0.get()
            X.1mP r2 = (X.C35541mP) r2
            r0 = 22
            X.63s r1 = new X.63s
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00 = r0
            X.18K r0 = r2.A00
            r0.CC4(r1)
            X.1L9 r6 = r3.A0A
            android.content.Context r5 = r3.A14()
            android.content.Context r4 = r3.A14()
            java.lang.String r3 = "com.bloks.www.csf.whatsapp.gethelp.user"
            r2 = 0
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportBloksActivity"
            r1.setClassName(r4, r0)
            java.lang.String r0 = "screen_name"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "screen_params"
            r1.putExtra(r0, r2)
            r6.A08(r5, r1)
            return
        L_0x0892:
            java.lang.Object r4 = r2.A01
            com.whatsapp.search.SearchFragment r4 = (com.whatsapp.search.SearchFragment) r4
            X.AEQ r0 = (X.AEQ) r0
            X.1og r3 = r4.A0Z
            r2 = 3
            r1 = 6
            r3.A00(r2, r1)
            X.00H r1 = r4.A0l
            android.content.Context r1 = X.C108955ca.A0A(r4, r1)
            android.content.Intent r2 = X.C108995ce.A0C(r1)
            java.lang.String r1 = "INITIAL_CATEGORY"
            r2.putExtra(r1, r0)
            X.1L9 r1 = r4.A0A
            android.content.Context r0 = r4.A14()
            r1.A08(r0, r2)
            return
        L_0x08b8:
            java.lang.Object r2 = r2.A01
            X.6q8 r2 = (X.C134156q8) r2
            java.util.List r0 = (java.util.List) r0
            X.1jz r1 = r2.A0D
            r1.A0C = r0
            goto L_0x08ea
        L_0x08c3:
            java.lang.Object r4 = r2.A01
            X.6q8 r4 = (X.C134156q8) r4
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.1jz r3 = r4.A0D
            r3.A03 = r0
            r2 = 0
            r3.A0G = r2
            X.10I r1 = r4.A0F
            r0 = 6
            X.AnonymousClass3MZ.A1U(r1, r4, r0)
            int r0 = r3.A02
            if (r0 != 0) goto L_0x08db
            r2 = 1
        L_0x08db:
            r4.A01(r2)
            return
        L_0x08df:
            java.lang.Object r2 = r2.A01
            X.6q8 r2 = (X.C134156q8) r2
            java.lang.String r0 = (java.lang.String) r0
            X.1jz r1 = r2.A0D
            r1.A05(r0)
        L_0x08ea:
            int r0 = r1.A02
            goto L_0x08fb
        L_0x08ed:
            java.lang.Object r2 = r2.A01
            X.6q8 r2 = (X.C134156q8) r2
            java.lang.Number r0 = (java.lang.Number) r0
            X.1jz r1 = r2.A0D
            int r0 = r0.intValue()
            r1.A02 = r0
        L_0x08fb:
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r2.A01(r0)
            return
        L_0x0903:
            java.lang.Object r2 = r2.A01
            X.6k7 r2 = (X.C130856k7) r2
            java.lang.Number r0 = (java.lang.Number) r0
            X.6iQ r1 = r2.A08
            int r0 = r0.intValue()
            r1.A00 = r0
            goto L_0x091c
        L_0x0912:
            java.lang.Object r2 = r2.A01
            X.6k7 r2 = (X.C130856k7) r2
            java.util.List r0 = (java.util.List) r0
            X.6iQ r1 = r2.A08
            r1.A01 = r0
        L_0x091c:
            X.1Dg r0 = r2.A02
            r0.A0E(r1)
            return
        L_0x0922:
            r3.A0B = r0
            X.C111295jU.A07(r3)
            return
        L_0x0928:
            X.6yj r7 = r6.A19
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            int r4 = r6.A0U()
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Runnable r1 = r7.A03
            if (r1 == 0) goto L_0x093d
            android.os.Handler r0 = r7.A06
            r0.removeCallbacks(r1)
        L_0x093d:
            X.0ve r0 = r7.A07
            boolean r0 = X.C20045A4o.A01(r0)
            if (r0 == 0) goto L_0x094e
            r0 = 0
            r7.A04 = r0
            long r0 = java.lang.System.nanoTime()
            r7.A01 = r0
        L_0x094e:
            r0 = 40
            X.3Cu r1 = new X.3Cu
            r1.<init>(r7, r4, r0, r5)
            r7.A03 = r1
            android.os.Handler r0 = r7.A06
            r0.postDelayed(r1, r2)
        L_0x095c:
            X.C111295jU.A07(r6)
            return
        L_0x0960:
            X.0ve r2 = r5.A0X
            r1 = 11563(0x2d2b, float:1.6203E-41)
            boolean r1 = X.C36301nf.A01(r2, r1)
            if (r1 == 0) goto L_0x096e
            r5.A26(r0)
            return
        L_0x096e:
            r1 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.A09 r1 = new X.A09
            r1.<init>(r3, r0, r2)
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r3)
            r1.A02 = r0
            X.1FL r0 = r5.A1B()
            r1.A01(r0)
            return
        L_0x0987:
            android.view.ViewGroup r0 = r3.A02
            goto L_0x098d
        L_0x098a:
            android.view.ViewGroup r0 = r3.A02
            r1 = 0
        L_0x098d:
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AR.Bo9(java.lang.Object):void");
    }
}
