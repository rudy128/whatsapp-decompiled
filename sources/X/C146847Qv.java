package X;

import com.whatsapp.registration.ChangeNumberOverview;

/* renamed from: X.7Qv  reason: invalid class name and case insensitive filesystem */
public class C146847Qv implements Runnable {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C146847Qv(ChangeNumberOverview changeNumberOverview, boolean z, boolean z2) {
        this.A00 = 9;
        this.A01 = changeNumberOverview;
        this.A02 = z;
        this.A03 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r5 = r22
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x011f;
                case 2: goto L_0x017b;
                case 3: goto L_0x0187;
                case 4: goto L_0x018f;
                case 5: goto L_0x019b;
                case 6: goto L_0x01b3;
                case 7: goto L_0x01db;
                case 8: goto L_0x013d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r13 = r5.A01
            com.whatsapp.registration.ChangeNumberOverview r13 = (com.whatsapp.registration.ChangeNumberOverview) r13
            boolean r1 = r5.A02
            boolean r0 = r5.A03
            if (r1 == 0) goto L_0x0014
            r12 = 1
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r12 = 0
        L_0x0015:
            X.0ve r1 = r13.A0E
            r0 = 6367(0x18df, float:8.922E-42)
            r1.A0N(r0)
            r0 = 2131428984(0x7f0b0678, float:1.8479628E38)
            android.widget.TextView r9 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131428990(0x7f0b067e, float:1.847964E38)
            android.widget.TextView r8 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131428989(0x7f0b067d, float:1.8479638E38)
            android.widget.TextView r5 = X.AnonymousClass3MX.A0L(r13, r0)
            r0 = 2131428983(0x7f0b0677, float:1.8479626E38)
            android.view.View r11 = r13.findViewById(r0)
            r0 = 2131428982(0x7f0b0676, float:1.8479624E38)
            android.view.View r10 = r13.findViewById(r0)
            r0 = 2131428986(0x7f0b067a, float:1.8479632E38)
            android.view.View r4 = r13.findViewById(r0)
            r0 = 2131428985(0x7f0b0679, float:1.847963E38)
            android.view.View r3 = r13.findViewById(r0)
            r0 = 2131428988(0x7f0b067c, float:1.8479636E38)
            android.view.View r2 = r13.findViewById(r0)
            r0 = 2131428987(0x7f0b067b, float:1.8479634E38)
            android.view.View r6 = r13.findViewById(r0)
            com.whatsapp.TextEmojiLabel r6 = (com.whatsapp.TextEmojiLabel) r6
            r7 = 0
            r1 = 8
            r11.setVisibility(r1)
            r10.setVisibility(r1)
            r4.setVisibility(r1)
            r3.setVisibility(r1)
            if (r12 == 0) goto L_0x00c3
            r0 = 2131888067(0x7f1207c3, float:1.9410759E38)
            r9.setText(r0)
            r0 = 2131888070(0x7f1207c6, float:1.9410765E38)
            r8.setText(r0)
            r0 = 2131888068(0x7f1207c4, float:1.941076E38)
        L_0x007d:
            r5.setText(r0)
            X.00H r0 = r13.A07
            if (r0 == 0) goto L_0x0177
            java.lang.Object r0 = r0.get()
            X.1tF r0 = (X.C39541tF) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0170
            r2.setVisibility(r7)
            r6.setVisibility(r7)
            X.0ve r5 = r13.A0E
            X.1KB r4 = r13.A05
            X.1L9 r15 = r13.A01
            X.11C r3 = r13.A08
            r1 = 2131888073(0x7f1207c9, float:1.9410771E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r2 = "learn-more"
            java.lang.String r20 = X.C17880vN.A0q(r13, r2, r0, r7, r1)
            X.129 r1 = r13.A05
            if (r1 == 0) goto L_0x020b
            java.lang.String r0 = "369709382495539"
            android.net.Uri r14 = r1.A03(r0)
            r17 = r6
            r18 = r3
            r19 = r5
            r21 = r2
            r16 = r4
            X.C26302CxJ.A0K(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x00c2:
            return
        L_0x00c3:
            r0 = 2131888063(0x7f1207bf, float:1.941075E38)
            r9.setText(r0)
            r0 = 2131888076(0x7f1207cc, float:1.9410777E38)
            r8.setText(r0)
            r0 = 2131888074(0x7f1207ca, float:1.9410773E38)
            goto L_0x007d
        L_0x00d3:
            java.lang.Object r4 = r5.A01
            com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment r4 = (com.facebook.smartcapture.ui.DefaultCaptureOverlayFragment) r4
            boolean r3 = r5.A02
            boolean r2 = r5.A03
            r1 = 0
            android.widget.ImageButton r0 = r4.A01
            X.C18070vi.A0b(r0)
            r0.setEnabled(r3)
            if (r3 != 0) goto L_0x0108
            android.widget.ImageButton r0 = r4.A01
            X.C18070vi.A0b(r0)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0108
            android.widget.ProgressBar r0 = r4.A03
            X.C18070vi.A0b(r0)
            r0.setVisibility(r1)
            if (r2 == 0) goto L_0x00c2
            android.widget.ProgressBar r0 = r4.A03
            X.C18070vi.A0b(r0)
            android.view.ViewPropertyAnimator r0 = X.C108985cd.A0G(r0)
        L_0x0104:
            r0.start()
            return
        L_0x0108:
            if (r2 == 0) goto L_0x01fc
            android.widget.ProgressBar r0 = r4.A03
            X.C18070vi.A0b(r0)
            android.view.ViewPropertyAnimator r2 = X.C108985cd.A0F(r0)
            r1 = 36
            X.DTh r0 = new X.DTh
            r0.<init>((java.lang.Object) r4, (int) r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            goto L_0x0104
        L_0x011f:
            java.lang.Object r0 = r5.A01
            X.DGH r0 = (X.DGH) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x0129:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r2 = r3.next()
            X.EAh r2 = (X.C28613EAh) r2
            boolean r1 = r5.A03
            boolean r0 = r5.A02
            r2.CAH(r1, r0)
            goto L_0x0129
        L_0x013d:
            java.lang.Object r4 = r5.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r4 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r4
            boolean r3 = r5.A02
            boolean r2 = r5.A03
            X.1FL r0 = r4.A1B()
            if (r0 == 0) goto L_0x00c2
            r1 = 1
            boolean r0 = r0.isFinishing()
            if (r0 == r1) goto L_0x00c2
            if (r2 == 0) goto L_0x0162
            r4.A2E(r1)
            r0 = 0
            r4.A01 = r0
            r4.A2B()
            java.util.List r0 = r4.A0b
            r0.clear()
        L_0x0162:
            X.10I r2 = r4.A0L
            if (r2 == 0) goto L_0x0207
            r1 = 4
            X.3Cp r0 = new X.3Cp
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.CGF(r0)
            return
        L_0x0170:
            r2.setVisibility(r1)
            r6.setVisibility(r1)
            return
        L_0x0177:
            java.lang.String r0 = "interopRolloutManager"
            goto L_0x020d
        L_0x017b:
            java.lang.Object r2 = r5.A01
            X.A6b r2 = (X.C20075A6b) r2
            boolean r1 = r5.A02
            boolean r0 = r5.A03
            r2.A08(r1, r0)
            return
        L_0x0187:
            boolean r1 = r5.A02
            boolean r0 = r5.A03
            com.whatsapp.voipcalling.Voip.stopVideoCaptureStream(r1, r0)
            return
        L_0x018f:
            java.lang.Object r2 = r5.A01
            X.7DY r2 = (X.AnonymousClass7DY) r2
            boolean r1 = r5.A02
            boolean r0 = r5.A03
            X.AnonymousClass7DY.A0a(r2, r1, r0)
            return
        L_0x019b:
            boolean r0 = r5.A02
            java.lang.Object r2 = r5.A01
            X.7DY r2 = (X.AnonymousClass7DY) r2
            boolean r1 = r5.A03
            if (r0 == 0) goto L_0x01af
            X.8Av r0 = r2.A0K
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = "camera"
            goto L_0x020d
        L_0x01ac:
            r0.pause()
        L_0x01af:
            X.AnonymousClass7DY.A0V(r2, r1)
            return
        L_0x01b3:
            java.lang.Object r3 = r5.A01
            X.48m r3 = (X.AnonymousClass48m) r3
            boolean r0 = r5.A02
            boolean r2 = r5.A03
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r1 = r3.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            X.1Le r0 = r1.A1N
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x01d0
            X.1KB r1 = r1.A0S
            r0 = 5
        L_0x01cc:
            X.C108965cb.A19(r1, r3, r0)
            return
        L_0x01d0:
            java.lang.Object r0 = r3.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            X.1KB r1 = r0.A0S
            r0 = 7
            if (r2 == 0) goto L_0x01cc
            r0 = 6
            goto L_0x01cc
        L_0x01db:
            java.lang.Object r6 = r5.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r6 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r6
            boolean r4 = r5.A02
            boolean r3 = r5.A03
            X.8Ah r0 = r6.A0G
            if (r0 == 0) goto L_0x01ea
            r0.close()
        L_0x01ea:
            r0 = 0
            r6.A0G = r0
            X.1KB r2 = r6.A26()
            r1 = 8
            X.7Qv r0 = new X.7Qv
            r0.<init>(r6, r1, r4, r3)
            r2.CGP(r0)
            return
        L_0x01fc:
            android.widget.ProgressBar r1 = r4.A03
            X.C18070vi.A0b(r1)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0207:
            X.AnonymousClass3MW.A1G()
            goto L_0x0210
        L_0x020b:
            java.lang.String r0 = "faqLinkFactory"
        L_0x020d:
            X.C18070vi.A11(r0)
        L_0x0210:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146847Qv.run():void");
    }

    public C146847Qv(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }
}
