package X;

/* renamed from: X.7Rt  reason: invalid class name and case insensitive filesystem */
public class C147087Rt implements C18140vp {
    public final int A00;
    public final Object A01;

    public C147087Rt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (X.C22971Dz.A0i(r1.A0R) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        if (r1.A0M != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        return X.C122506Qq.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        return X.C122506Qq.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0029;
                case 2: goto L_0x0046;
                case 3: goto L_0x000e;
                case 4: goto L_0x0062;
                case 5: goto L_0x006f;
                case 6: goto L_0x0089;
                case 7: goto L_0x00a2;
                case 8: goto L_0x00b6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.11C r0 = (X.AnonymousClass11C) r0
            android.content.ClipboardManager r4 = r0.A09()
        L_0x000d:
            return r4
        L_0x000e:
            java.lang.Object r2 = r10.A01
            int[][] r2 = (int[][]) r2
            int r1 = r2.length
            java.util.ArrayList r4 = X.C17880vN.A0z(r1)
            r0 = 0
        L_0x0018:
            if (r0 >= r1) goto L_0x000d
            X.AnonymousClass737.A01(r4, r2, r0)
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r10.A01
            X.00H r0 = (X.AnonymousClass00H) r0
            java.lang.Object r4 = r0.get()
            return r4
        L_0x0029:
            java.lang.Object r1 = r10.A01
            X.5rS r1 = (X.C114645rS) r1
            X.00H r0 = r1.A0M
            boolean r0 = X.C108975cc.A1H(r0)
            if (r0 == 0) goto L_0x00b3
            java.util.List r0 = r1.A0R
            X.1BI r0 = X.C22971Dz.A01(r0)
            if (r0 == 0) goto L_0x00b3
            java.util.List r0 = r1.A0R
            boolean r0 = X.C22971Dz.A0i(r0)
            if (r0 != 0) goto L_0x00b3
            goto L_0x00b0
        L_0x0046:
            java.lang.Object r1 = r10.A01
            X.73a r1 = (X.C1407773a) r1
            com.whatsapp.stickers.StickerView r0 = r1.A0E
            android.content.Context r2 = r0.getContext()
            X.5dv r0 = new X.5dv
            r0.<init>(r1)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r2, r0)
            r0 = 12
            X.78u r4 = new X.78u
            r4.<init>((java.lang.Object) r1, (int) r0)
            return r4
        L_0x0062:
            java.lang.Object r0 = r10.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            X.0ve r1 = r0.A0F
            r0 = 9875(0x2693, float:1.3838E-41)
            java.lang.Boolean r4 = X.AnonymousClass3MZ.A15(r1, r0)
            return r4
        L_0x006f:
            java.lang.Object r0 = r10.A01
            X.7Is r0 = (X.C144797Is) r0
            java.lang.Object r1 = r0.A02
            X.5ti r1 = (X.C115295ti) r1
            com.whatsapp.media.WamediaManager r3 = r1.A0W
            X.6zF r0 = r1.A0e
            java.io.File r2 = r0.A0B
            X.6ug r0 = r1.A0r
            long r0 = r0.A00()
            X.72t r4 = new X.72t
            r4.<init>(r3, r2, r0)
            return r4
        L_0x0089:
            java.lang.Object r0 = r10.A01
            X.10I r0 = (X.AnonymousClass10I) r0
            java.util.concurrent.PriorityBlockingQueue r2 = new java.util.concurrent.PriorityBlockingQueue
            r2.<init>()
            java.lang.String r1 = "MediaDownload"
            r3 = 1
            r6 = 60
            r5 = 10
            r4 = r3
            X.2Py r4 = r0.BHv(r1, r2, r3, r4, r5, r6)
            r4.allowCoreThreadTimeOut(r3)
            return r4
        L_0x00a2:
            java.lang.Object r0 = r10.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.7JS r1 = r0.A0X
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x00b3
        L_0x00b0:
            X.6Qq r4 = X.C122506Qq.GONE
            return r4
        L_0x00b3:
            X.6Qq r4 = X.C122506Qq.DEFAULT
            return r4
        L_0x00b6:
            java.lang.Object r3 = r10.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r3 = (com.whatsapp.mediacomposer.MediaComposerActivity) r3
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r1 = 2131627207(0x7f0e0cc7, float:1.8881672E38)
            r0 = 2131434044(0x7f0b1a3c, float:1.848989E38)
            android.view.View r0 = r3.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = X.AnonymousClass3MX.A0A(r2, r0, r1)
            r0 = 2131436219(0x7f0b22bb, float:1.8494302E38)
            android.view.View r8 = r1.findViewById(r0)
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r8 = (com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView) r8
            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = r3.A06
            X.6c7 r7 = new X.6c7
            r7.<init>(r3)
            X.7JS r6 = r3.A0X
            X.A4v r9 = X.C108965cb.A0f(r3)
            X.6uj r4 = new X.6uj
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147087Rt.get():java.lang.Object");
    }
}
