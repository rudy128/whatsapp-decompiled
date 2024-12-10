package X;

import android.view.View;

/* renamed from: X.6Go  reason: invalid class name */
public abstract class AnonymousClass6Go extends AnonymousClass6Gp {
    public final AnonymousClass1L8 A00;
    public final AnonymousClass86P A01;
    public final C36391no A02;
    public final C32981i4 A03;
    public final C25931Qe A04;
    public final C32741hg A05;
    public final C139956zi A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6Go(X.AnonymousClass1L8 r17, X.AnonymousClass1L9 r18, X.AnonymousClass1KB r19, X.AnonymousClass11S r20, X.C40751vD r21, X.C36531o3 r22, X.AnonymousClass11C r23, X.AnonymousClass11P r24, X.C36391no r25, X.AnonymousClass1WX r26, X.C32981i4 r27, X.C18030ve r28, X.C25931Qe r29, X.C24641Lc r30, X.C32741hg r31, X.AnonymousClass6p9 r32, X.C139956zi r33, X.AnonymousClass10I r34, X.AnonymousClass00H r35, X.AnonymousClass00H r36, X.AnonymousClass00H r37) {
        /*
            r16 = this;
            r10 = r28
            r9 = r26
            r8 = r24
            r7 = r23
            r6 = r22
            r5 = r21
            r4 = r20
            r15 = r37
            r14 = r36
            r13 = r34
            r12 = r32
            r3 = r19
            r2 = r18
            r11 = r30
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r33
            r1.A06 = r0
            r0 = r27
            r1.A03 = r0
            r0 = r25
            r1.A02 = r0
            r0 = r17
            r1.A00 = r0
            r0 = r31
            r1.A05 = r0
            r0 = r29
            r1.A04 = r0
            r0 = r35
            r1.A07 = r0
            X.7Bi r0 = new X.7Bi
            r0.<init>(r3, r7, r1)
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Go.<init>(X.1L8, X.1L9, X.1KB, X.11S, X.1vD, X.1o3, X.11C, X.11P, X.1no, X.1WX, X.1i4, X.0ve, X.1Qe, X.1Lc, X.1hg, X.6p9, X.6zi, X.10I, X.00H, X.00H, X.00H):void");
    }

    public void A0U(View view) {
        C32741hg r1 = this.A05;
        int hashCode = ((AnonymousClass6Gn) this).A07.A0v.A01.hashCode();
        AnonymousClass19Y r2 = r1.A0E;
        r2.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_VIEW_CREATED_START");
        super.A0U(view);
        r2.markerPoint(453119185, hashCode, "PLAYBACK_PAGE_ITEM_ON_VIEW_CREATED_END");
        r2.markerEnd(453119185, hashCode, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r10.A01() == false) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0Z(android.view.LayoutInflater r13, android.view.ViewGroup r14) {
        /*
            r12 = this;
            X.1hg r4 = r12.A05
            r0 = r12
            X.6Gn r0 = (X.AnonymousClass6Gn) r0
            X.206 r7 = r0.A07
            X.205 r3 = r7.A0v
            java.lang.String r0 = r3.A01
            int r6 = r0.hashCode()
            int r1 = r7.A0u
            if (r1 == 0) goto L_0x020c
            r0 = 1
            if (r1 == r0) goto L_0x0208
            r0 = 2
            if (r1 == r0) goto L_0x0204
            r0 = 3
            if (r1 == r0) goto L_0x0200
            r0 = 13
            if (r1 == r0) goto L_0x01fc
            r0 = 15
            if (r1 == r0) goto L_0x01f8
            r0 = 25
            if (r1 == r0) goto L_0x0208
            switch(r1) {
                case 27: goto L_0x020c;
                case 28: goto L_0x0200;
                case 29: goto L_0x01fc;
                default: goto L_0x002b;
            }
        L_0x002b:
            java.lang.String r2 = "UNKNOWN"
        L_0x002d:
            boolean r1 = r3.A02
            X.19Y r5 = r4.A0E
            r4 = 453119185(0x1b020cd1, float:1.0757489E-22)
            r5.markerStart(r4, r6)
            java.lang.String r0 = "is_outgoing"
            r5.markerAnnotate((int) r4, (int) r6, (java.lang.String) r0, (boolean) r1)
            java.lang.String r0 = "media_type"
            r5.markerAnnotate((int) r4, (int) r6, (java.lang.String) r0, (java.lang.String) r2)
            java.lang.String r0 = "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_START"
            r5.markerPoint((int) r4, (int) r6, (java.lang.String) r0)
            r3 = 0
            X.6p9 r0 = r12.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r9 = r0.A01
            android.view.View r1 = r9.A17()
            r0 = 2131433893(0x7f0b19a5, float:1.8489585E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.status.playback.widget.StatusPlaybackProgressView r0 = (com.whatsapp.status.playback.widget.StatusPlaybackProgressView) r0
            r12.A02 = r0
            r2 = 2131627034(0x7f0e0c1a, float:1.8881321E38)
            X.1Lc r10 = r12.A0M
            X.0ve r8 = r10.A01
            X.0vf r1 = X.C18040vf.A01
            r0 = 11188(0x2bb4, float:1.5678E-41)
            boolean r0 = X.C18020vd.A05(r1, r8, r0)
            if (r0 == 0) goto L_0x0072
            boolean r1 = r10.A01()
            r0 = 1
            if (r1 != 0) goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            r12.A03 = r0
            r8 = 0
            if (r0 != 0) goto L_0x0080
            boolean r0 = r7 instanceof X.AnonymousClass210
            if (r0 != 0) goto L_0x01f5
            boolean r0 = r7 instanceof X.C441822l
            if (r0 != 0) goto L_0x01f5
        L_0x0080:
            r1 = 1
        L_0x0081:
            boolean r0 = r10.A01()
            if (r0 == 0) goto L_0x008a
            if (r1 == 0) goto L_0x008a
            r8 = 1
        L_0x008a:
            r12.A08 = r8
            if (r8 == 0) goto L_0x01ce
            r2 = 2131627035(0x7f0e0c1b, float:1.8881323E38)
        L_0x0091:
            r0 = 0
            android.view.View r8 = X.AnonymousClass3MX.A0B(r13, r0, r2, r3)
            android.content.Context r1 = r8.getContext()
            r0 = 2131103384(0x7f060e98, float:1.7819233E38)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r1, r0)
            r12.A00 = r0
            X.70R r2 = r12.A0L()
            r0 = 2131429520(0x7f0b0890, float:1.8480715E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r8, r0)
            r2.A02 = r0
            r0 = 2131429510(0x7f0b0886, float:1.8480695E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r8, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C18070vi.A0d(r0, r3)
            r2.A07 = r0
            r0 = 2131431052(0x7f0b0e8c, float:1.8483822E38)
            X.1bI r0 = X.C72453Mb.A0s(r8, r0)
            r2.A0E = r0
            X.0ve r9 = r12.A0L
            r1 = 9522(0x2532, float:1.3343E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r9, r1)
            if (r0 == 0) goto L_0x00da
            X.10I r1 = r12.A0S
            r0 = 41
            X.AnonymousClass7RH.A01(r1, r12, r0)
        L_0x00da:
            boolean r1 = r12.A0V
            if (r1 == 0) goto L_0x019d
            r0 = 2131428830(0x7f0b05de, float:1.8479316E38)
            X.1bI r0 = X.C72453Mb.A0s(r8, r0)
            r2.A0B = r0
            r0 = 2131428834(0x7f0b05e2, float:1.8479324E38)
            X.1bI r0 = X.C72453Mb.A0s(r8, r0)
            r2.A0A = r0
        L_0x00f0:
            r0 = 2131430516(0x7f0b0c74, float:1.8482735E38)
            X.1bI r0 = X.C72453Mb.A0s(r8, r0)
            r2.A0D = r0
            r0 = 2131429544(0x7f0b08a8, float:1.8480764E38)
            X.1bI r0 = X.C72453Mb.A0s(r8, r0)
            r2.A0C = r0
            r0 = 2131429126(0x7f0b0706, float:1.8479916E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r8, r0)
            r2.A05 = r0
            r0 = 2131428345(0x7f0b03f9, float:1.8478332E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r8, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C18070vi.A0d(r0, r3)
            r2.A06 = r0
            r0 = 2131435635(0x7f0b2073, float:1.8493118E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r8, r0)
            r2.A04 = r0
            r0 = 2131434507(0x7f0b1c0b, float:1.849083E38)
            X.1bI r0 = X.C72453Mb.A0s(r8, r0)
            r2.A0G = r0
            r0 = 2131432489(0x7f0b1429, float:1.8486737E38)
            X.1bI r0 = X.C72453Mb.A0s(r8, r0)
            r2.A0F = r0
            boolean r0 = r12.A08
            r10 = 1
            if (r0 == 0) goto L_0x015e
            android.view.ViewGroup r0 = r2.A03()
            r0.setClipToOutline(r10)
            X.AnonymousClass6Gp.A06(r12)
        L_0x0143:
            X.1BI r0 = r7.A0H()
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 == 0) goto L_0x0156
            android.view.ViewGroup r1 = r2.A02()
            r0 = 8
            r1.setVisibility(r0)
        L_0x0156:
            r2.A0H = r10
            java.lang.String r0 = "PLAYBACK_PAGE_ITEM_ON_CREATE_VIEW_END"
            r5.markerPoint((int) r4, (int) r6, (java.lang.String) r0)
            return r8
        L_0x015e:
            if (r1 == 0) goto L_0x0143
            android.view.ViewGroup r0 = r2.A03()
            r0.setClipToOutline(r10)
            boolean r0 = r12 instanceof X.C120906Gm
            if (r0 == 0) goto L_0x0199
            r11 = r12
            X.6Gm r11 = (X.C120906Gm) r11
            X.6Gk r1 = r11.A0B
            r0 = 2131434011(0x7f0b1a1b, float:1.8489824E38)
            X.1bI r0 = X.C72453Mb.A0s(r8, r0)
            r0.A04(r3)
            r1.A0D = r0
            r0 = 2131427557(0x7f0b00e5, float:1.8476734E38)
            android.view.View r9 = r8.findViewById(r0)
            r1 = 8
            if (r9 == 0) goto L_0x018f
            X.6mq r0 = r11.A0A
            r0.A00()
            r9.setVisibility(r3)
        L_0x018f:
            r0 = 2131430187(0x7f0b0b2b, float:1.8482068E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r8, r0)
            r0.setVisibility(r1)
        L_0x0199:
            X.AnonymousClass6Gp.A05(r8, r12)
            goto L_0x0143
        L_0x019d:
            r0 = 2131428838(0x7f0b05e6, float:1.8479332E38)
            android.view.View r0 = r8.findViewById(r0)
            r2.A01 = r0
            r0 = 2131428830(0x7f0b05de, float:1.8479316E38)
            android.view.View r0 = r8.findViewById(r0)
            com.whatsapp.ui.media.MediaCaptionTextView r0 = (com.whatsapp.ui.media.MediaCaptionTextView) r0
            r2.A09 = r0
            r0 = 2131428832(0x7f0b05e0, float:1.847932E38)
            android.view.View r0 = r8.findViewById(r0)
            r2.A00 = r0
            r0 = 2131430763(0x7f0b0d6b, float:1.8483236E38)
            android.view.View r0 = r8.findViewById(r0)
            r2.A03 = r0
            r0 = 2131431625(0x7f0b10c9, float:1.8484984E38)
            android.view.ViewGroup r0 = X.AnonymousClass3MW.A0D(r8, r0)
            r2.A08 = r0
            goto L_0x00f0
        L_0x01ce:
            boolean r0 = r12.A0V
            if (r0 == 0) goto L_0x0091
            r2 = 2131627039(0x7f0e0c1f, float:1.8881331E38)
            X.0ve r8 = r12.A0L
            r1 = 10577(0x2951, float:1.4822E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            r12.A0B = r0
            X.1FL r1 = r9.A1B()
            boolean r0 = r1 instanceof com.whatsapp.status.playback.StatusPlaybackActivity
            if (r0 == 0) goto L_0x01f3
            com.whatsapp.status.playback.StatusPlaybackActivity r1 = (com.whatsapp.status.playback.StatusPlaybackActivity) r1
            if (r1 == 0) goto L_0x01f3
            boolean r0 = r1.A0Z
        L_0x01ef:
            r12.A0A = r0
            goto L_0x0091
        L_0x01f3:
            r0 = 0
            goto L_0x01ef
        L_0x01f5:
            r1 = 0
            goto L_0x0081
        L_0x01f8:
            java.lang.String r2 = "DELETING"
            goto L_0x002d
        L_0x01fc:
            java.lang.String r2 = "GIF"
            goto L_0x002d
        L_0x0200:
            java.lang.String r2 = "VIDEO"
            goto L_0x002d
        L_0x0204:
            java.lang.String r2 = "VOICE"
            goto L_0x002d
        L_0x0208:
            java.lang.String r2 = "IMAGE"
            goto L_0x002d
        L_0x020c:
            java.lang.String r2 = "TEXT"
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Go.A0Z(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }
}
