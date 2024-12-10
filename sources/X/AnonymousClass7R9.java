package X;

import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.7R9  reason: invalid class name */
public class AnonymousClass7R9 implements Runnable {
    public final int A00;
    public final Object A01;

    public AnonymousClass7R9(C76783oH r1, int i) {
        this.A00 = i;
        if (41 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04d2, code lost:
        r0 = "camera";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04e4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0188, code lost:
        if ((!X.C17880vN.A1W(X.C18070vi.A03(((X.C85234Mp) r1.A00.get()).A01), "pref_chat_info_new_icon_shown")) == false) goto L_0x018a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0544;
                case 1: goto L_0x053c;
                case 2: goto L_0x0534;
                case 3: goto L_0x052c;
                case 4: goto L_0x0524;
                case 5: goto L_0x0123;
                case 6: goto L_0x0113;
                case 7: goto L_0x0503;
                case 8: goto L_0x04fb;
                case 9: goto L_0x04f5;
                case 10: goto L_0x04ed;
                case 11: goto L_0x04b5;
                case 12: goto L_0x00fc;
                case 13: goto L_0x0486;
                case 14: goto L_0x047e;
                case 15: goto L_0x04d5;
                case 16: goto L_0x0472;
                case 17: goto L_0x046a;
                case 18: goto L_0x0438;
                case 19: goto L_0x03f4;
                case 20: goto L_0x03ea;
                case 21: goto L_0x03d8;
                case 22: goto L_0x03d0;
                case 23: goto L_0x03c8;
                case 24: goto L_0x00c5;
                case 25: goto L_0x00a2;
                case 26: goto L_0x03c0;
                case 27: goto L_0x0392;
                case 28: goto L_0x033f;
                case 29: goto L_0x0337;
                case 30: goto L_0x0329;
                case 31: goto L_0x0082;
                case 32: goto L_0x031e;
                case 33: goto L_0x0318;
                case 34: goto L_0x0310;
                case 35: goto L_0x0304;
                case 36: goto L_0x024b;
                case 37: goto L_0x0243;
                case 38: goto L_0x0232;
                case 39: goto L_0x0221;
                case 40: goto L_0x01c4;
                case 41: goto L_0x01b9;
                case 42: goto L_0x0058;
                case 43: goto L_0x01a9;
                case 44: goto L_0x002f;
                case 45: goto L_0x018f;
                case 46: goto L_0x0147;
                case 47: goto L_0x001d;
                case 48: goto L_0x0138;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r11.A01
            X.3oT r4 = (X.C76813oT) r4
            r3 = 0
            X.0ve r2 = r4.A0R
            r1 = 1071(0x42f, float:1.501E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001c
            X.1nr r1 = r4.A0W
            r0 = 3
            r1.A00(r0, r3)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r2 = r11.A01
            X.3oT r2 = (X.C76813oT) r2
            X.1E7 r0 = r2.A02
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MZ.A0x(r0)
            if (r1 == 0) goto L_0x001c
            X.2kp r0 = r2.A0Q
            r0.A01(r1)
            return
        L_0x002f:
            java.lang.Object r5 = r11.A01
            com.whatsapp.chatinfo.view.custom.ContactDetailsCard r5 = (com.whatsapp.chatinfo.view.custom.ContactDetailsCard) r5
            X.1E7 r2 = r5.A0O
            if (r2 == 0) goto L_0x001c
            X.1R2 r1 = r5.A0X
            X.1Me r0 = r1.A02
            java.lang.String r4 = r0.A0O(r2)
            X.118 r0 = r1.A04
            android.content.Context r3 = r0.A00
            r1 = 2131893647(0x7f121d8f, float:1.9422076E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            r2 = 0
            java.lang.String r1 = X.C17880vN.A0q(r3, r4, r0, r2, r1)
            r0 = 0
            X.Bik r0 = X.C23520Bik.A00(r0, r5, r1, r2)
            r0.A08()
            return
        L_0x0058:
            java.lang.Object r3 = r11.A01
            X.3oH r3 = (X.C76783oH) r3
            android.widget.ListView r0 = r3.A0J
            r2 = 0
            android.view.View r1 = r0.getChildAt(r2)
            if (r1 == 0) goto L_0x001c
            android.widget.ListView r0 = r3.A0J
            int r0 = r0.getFirstVisiblePosition()
            if (r0 != 0) goto L_0x001c
            int r0 = r1.getTop()
            int r1 = r3.A08
            if (r0 == r1) goto L_0x054c
            java.lang.Boolean r0 = X.C17970vW.A03
            android.widget.ListView r0 = r3.A0J
            r0.setSelectionFromTop(r2, r1)
            android.widget.ListView r0 = r3.A0J
            r0.post(r11)
            return
        L_0x0082:
            java.lang.Object r3 = r11.A01
            com.whatsapp.camera.overlays.AutofocusOverlay r3 = (com.whatsapp.camera.overlays.AutofocusOverlay) r3
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x001c
            r3.setVisibility(r0)
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x001c
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            r3.startAnimation(r2)
            return
        L_0x00a2:
            java.lang.Object r3 = r11.A01
            X.701 r3 = (X.AnonymousClass701) r3
            X.6tN r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x00b0
            r0.A00()
            r3.A02 = r2
        L_0x00b0:
            X.5lB r1 = r3.A01
            if (r1 == 0) goto L_0x001c
            X.10s r0 = r1.A08
            r0.A03()
            X.8Ah r0 = r1.A00
            if (r0 == 0) goto L_0x00c2
            r0.close()
            r1.A00 = r2
        L_0x00c2:
            r3.A01 = r2
            return
        L_0x00c5:
            java.lang.Object r1 = r11.A01
            X.72r r1 = (X.C1407172r) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.wds.components.button.WDSButton r5 = r1.A01
            r4 = 0
            if (r5 == 0) goto L_0x00fa
            android.view.ViewParent r3 = r5.getParent()
        L_0x00d6:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L_0x00ea
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00ea
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            r3.startAnimation(r2)
        L_0x00ea:
            if (r5 == 0) goto L_0x00f0
            android.view.ViewParent r4 = r5.getParent()
        L_0x00f0:
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L_0x001c
            android.view.View r4 = (android.view.View) r4
            X.C72453Mb.A1D(r4)
            return
        L_0x00fa:
            r3 = r4
            goto L_0x00d6
        L_0x00fc:
            java.lang.Object r3 = r11.A01
            X.7DY r3 = (X.AnonymousClass7DY) r3
            java.lang.String r2 = r3.A0c
            if (r2 == 0) goto L_0x001c
            X.1FU r0 = r3.A0H
            if (r0 == 0) goto L_0x001c
            X.8Av r0 = r3.A0K
            r1 = 0
            if (r0 != 0) goto L_0x0561
            java.lang.String r0 = "camera"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0113:
            java.lang.Object r0 = r11.A01
            com.whatsapp.calling.views.PermissionDialogFragment r0 = (com.whatsapp.calling.views.PermissionDialogFragment) r0
            X.5aq r2 = r0.A04
            if (r2 == 0) goto L_0x001c
            int r1 = r0.A00
            java.lang.String[] r0 = r0.A0E
            r2.C0T(r0, r1)
            return
        L_0x0123:
            java.lang.Object r0 = r11.A01
            X.AfC r0 = (X.C21141AfC) r0
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r0.A01
            if (r0 == 0) goto L_0x001c
            X.8yP r0 = r0.A0W
            X.A99 r2 = r0.A03
            if (r2 == 0) goto L_0x001c
            r1 = 15
            r0 = 0
            X.A99.A0G(r2, r0, r0, r1)
            return
        L_0x0138:
            java.lang.Object r0 = r11.A01
            X.3oT r0 = (X.C76813oT) r0
            r3 = 0
            X.1pz r2 = r0.A0V
            X.1BI r1 = r0.A0F
            X.1i2 r0 = X.C32961i2.CONTACT_INFO
            r2.A01(r1, r0, r3)
            return
        L_0x0147:
            java.lang.Object r1 = r11.A01
            X.3oT r1 = (X.C76813oT) r1
            X.1DT r2 = r1.A0K
            X.00H r0 = r1.A0c
            java.lang.Object r0 = r0.get()
            X.73F r0 = (X.AnonymousClass73F) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x018a
            X.00H r0 = r1.A0b
            java.lang.Object r1 = r0.get()
            X.6pP r1 = (X.C133736pP) r1
            X.00H r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.11S r0 = (X.AnonymousClass11S) r0
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x018a
            X.00H r0 = r1.A00
            java.lang.Object r0 = r0.get()
            X.4Mp r0 = (X.C85234Mp) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "pref_chat_info_new_icon_shown"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            r1 = r0 ^ 1
            r0 = 1
            if (r1 != 0) goto L_0x018b
        L_0x018a:
            r0 = 0
        L_0x018b:
            X.AnonymousClass3MY.A1M(r2, r0)
            return
        L_0x018f:
            java.lang.Object r1 = r11.A01
            com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet r1 = (com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet) r1
            X.00H r0 = r1.A02
            if (r0 == 0) goto L_0x01a5
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "newsletter-guidelines"
            r2.A01(r1, r0)
            return
        L_0x01a5:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x04e0
        L_0x01a9:
            java.lang.Object r0 = r11.A01
            com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2 r0 = (com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2) r0
            X.11e r0 = r0.A0A
            java.lang.Object r0 = r0.get()
            X.17O r0 = (X.AnonymousClass17O) r0
            r0.A01()
            return
        L_0x01b9:
            java.lang.Object r0 = r11.A01
            X.3oH r0 = (X.C76783oH) r0
            android.widget.ListView r1 = r0.A0J
            r0 = 0
            r1.setSelectionFromTop(r0, r0)
            return
        L_0x01c4:
            java.lang.Object r0 = r11.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            X.3oR r4 = r0.A08
            X.1E7 r1 = r0.A0J
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r5 = r1.A06(r6)
            X.C17960vV.A07(r5)
            X.C18070vi.A0X(r5)
            X.00H r0 = r4.A09
            java.lang.Object r3 = r0.get()
            X.2to r3 = (X.C63862to) r3
            X.2Jo r2 = r4.A05
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            r0 = 1
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            r0[r1] = r5
            java.util.ArrayList r1 = X.AnonymousClass1ZU.A06(r0)
            X.126 r0 = r3.A0A
            r0.A0W(r2, r1)
            X.1vp r4 = r4.A06
            java.lang.Object r0 = r4.A06()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0208:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            com.whatsapp.jid.Jid r0 = r0.A06(r6)
            X.C108975cc.A13(r0, r5, r1, r3)
            goto L_0x0208
        L_0x021d:
            r4.A0E(r3)
            return
        L_0x0221:
            java.lang.Object r0 = r11.A01
            X.4mF r0 = (X.C95444mF) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            com.whatsapp.chatinfo.ContactInfoActivity.A16(r0)
            X.4XY r0 = r0.A0e
            r0.A01()
            return
        L_0x0232:
            java.lang.Object r0 = r11.A01
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            com.whatsapp.chatinfo.ContactInfoActivity.A1B(r0)
            android.os.Handler r2 = r0.A2X
            long r0 = com.whatsapp.chatinfo.ContactInfoActivity.A0y(r0)
            r2.postDelayed(r11, r0)
            return
        L_0x0243:
            java.lang.Object r0 = r11.A01
            com.whatsapp.chatinfo.ContactInfoActivity r0 = (com.whatsapp.chatinfo.ContactInfoActivity) r0
            com.whatsapp.chatinfo.ContactInfoActivity.A18(r0)
            return
        L_0x024b:
            java.lang.Object r5 = r11.A01
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.1M9 r4 = r5.A0E
            com.whatsapp.jid.UserJid r3 = r5.A4l()
            X.1M2 r8 = r4.A04
            X.1E7 r7 = r8.A0K(r3)
            if (r7 == 0) goto L_0x02fd
            java.lang.String r0 = r7.A0K()
            r7.A0c = r0
            r0 = 0
            r7.A0R = r0
            r0 = 1
            X.1Ez r6 = new X.1Ez
            r6.<init>((boolean) r0)
            r6.A04()
            X.1Lt r0 = r8.A00     // Catch:{ IllegalArgumentException -> 0x02cb }
            X.1au r9 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x02cb }
            X.1BI r0 = r7.A0J     // Catch:{ all -> 0x02c1 }
            if (r0 == 0) goto L_0x02ba
            r0 = 3
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x02c1 }
            r10.<init>(r0)     // Catch:{ all -> 0x02c1 }
            java.lang.String r0 = "raw_contact_id"
            r10.putNull(r0)     // Catch:{ all -> 0x02c1 }
            java.lang.String r1 = "display_name"
            java.lang.String r0 = r7.A0K()     // Catch:{ all -> 0x02c1 }
            r10.put(r1, r0)     // Catch:{ all -> 0x02c1 }
            java.lang.String r1 = "wa_name"
            java.lang.String r0 = r7.A0c     // Catch:{ all -> 0x02c1 }
            r10.put(r1, r0)     // Catch:{ all -> 0x02c1 }
            X.1BI r1 = r7.A0J     // Catch:{ all -> 0x02c1 }
            boolean r0 = X.C22971Dz.A0d(r1)     // Catch:{ all -> 0x02c1 }
            if (r0 == 0) goto L_0x02a7
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r1)     // Catch:{ all -> 0x02c1 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x02c1 }
            X.AnonymousClass1M2.A09(r10, r8, r9, r0)     // Catch:{ all -> 0x02c1 }
            goto L_0x02b6
        L_0x02a7:
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ all -> 0x02c1 }
            r0 = 0
            X.C17880vN.A1J(r1, r2, r0)     // Catch:{ all -> 0x02c1 }
            java.lang.String r1 = "wa_contacts"
            java.lang.String r0 = "jid = ?"
            X.C24861Ly.A01(r10, r9, r1, r0, r2)     // Catch:{ all -> 0x02c1 }
        L_0x02b6:
            r9.close()     // Catch:{ IllegalArgumentException -> 0x02cb }
            goto L_0x02de
        L_0x02ba:
            java.lang.String r0 = "Contact jid is not specified."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x02c1 }
            throw r0     // Catch:{ all -> 0x02c1 }
        L_0x02c1:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x02c6 }
            goto L_0x02ca
        L_0x02c6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x02cb }
        L_0x02ca:
            throw r1     // Catch:{ IllegalArgumentException -> 0x02cb }
        L_0x02cb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactManagerDatabase/unable to update contact "
            r1.append(r0)
            X.1BI r0 = r7.A0J
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            X.C17960vV.A09(r0, r2)
        L_0x02de:
            X.00H r0 = r8.A09
            java.lang.Object r2 = r0.get()
            X.2Kb r2 = (X.C47812Kb) r2
            java.util.List r1 = java.util.Collections.singletonList(r7)
            r0 = 5
            X.AnonymousClass35V.A00(r2, r1, r0)
            r6.A01()
            X.11A r2 = r4.A0I
            r1 = 20
            X.3Bv r0 = new X.3Bv
            r0.<init>(r4, r3, r1)
            r2.A00(r0)
        L_0x02fd:
            X.12E r1 = r5.A0r
            r0 = 0
            r1.A0D(r0)
            return
        L_0x0304:
            java.lang.Object r0 = r11.A01
            X.4mF r0 = (X.C95444mF) r0
            java.lang.Object r0 = r0.A01
            X.3o2 r0 = (X.C76733o2) r0
            X.C76733o2.A1O(r0)
            return
        L_0x0310:
            java.lang.Object r0 = r11.A01
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r0 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r0
            r0.A28()
            return
        L_0x0318:
            java.lang.Object r0 = r11.A01
            X.C108965cb.A1N(r0)
            return
        L_0x031e:
            java.lang.Object r1 = r11.A01
            com.whatsapp.camera.overlays.ShutterOverlay r1 = (com.whatsapp.camera.overlays.ShutterOverlay) r1
            r0 = 0
            r1.A02 = r0
            r1.invalidate()
            return
        L_0x0329:
            java.lang.Object r0 = r11.A01
            X.DAc r0 = (X.C26703DAc) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.camera.litecamera.LiteCameraView r0 = (com.whatsapp.camera.litecamera.LiteCameraView) r0
            X.DAi r0 = r0.A0U
            r0.Bxu()
            return
        L_0x0337:
            java.lang.Object r0 = r11.A01
            X.EA4 r0 = (X.EA4) r0
            r0.destroy()
            return
        L_0x033f:
            java.lang.Object r3 = r11.A01
            com.whatsapp.camera.litecamera.LiteCameraView r3 = (com.whatsapp.camera.litecamera.LiteCameraView) r3
            X.DAi r1 = r3.A0U
            X.EDC r0 = r1.A00
            if (r0 == 0) goto L_0x034d
            X.BPv r0 = (X.C22807BPv) r0
            r0.A08 = r1
        L_0x034d:
            X.0ve r4 = r3.A07
            r0 = 12846(0x322e, float:1.8001E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0360
            X.EDL r1 = r3.A0R
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r1.CJv(r0)
        L_0x0360:
            r0 = 12848(0x3230, float:1.8004E-41)
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            r1 = 2073600(0x1fa400, float:2.905732E-39)
            if (r0 == 0) goto L_0x0370
            X.EDL r0 = r3.A0R
            r0.CK8(r1)
        L_0x0370:
            r0 = 12847(0x322f, float:1.8002E-41)
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x037d
            X.EDL r0 = r3.A0R
            r0.CLM(r1)
        L_0x037d:
            X.EDL r1 = r3.A0R
            boolean r0 = r3.A0L
            r1.CHq(r0)
            X.E93 r0 = r3.A0Q
            r1.BB3(r0)
            X.E0i r0 = r3.A0S
            r1.CK9(r0)
            r1.CG0()
            return
        L_0x0392:
            java.lang.Object r3 = r11.A01
            com.whatsapp.camera.litecamera.LiteCameraView r3 = (com.whatsapp.camera.litecamera.LiteCameraView) r3
            r0 = 1
            r3.A0b = r0
            r2 = 0
            r3.A0a = r2
            X.CkJ r0 = r3.A0T
            r0.A00()
            X.DAi r0 = r3.A0U
            X.EDC r1 = r0.A00
            if (r1 == 0) goto L_0x03ac
            r0 = 0
            X.BPv r1 = (X.C22807BPv) r1
            r1.A08 = r0
        L_0x03ac:
            X.EDL r1 = r3.A0R
            X.E93 r0 = r3.A0Q
            r1.CEd(r0)
            r0 = 0
            r1.CK9(r0)
            r1.CK7(r0)
            r1.pause()
            r3.A0b = r2
            return
        L_0x03c0:
            java.lang.Object r0 = r11.A01
            X.1rD r0 = (X.C38391rD) r0
            r0.notifyDataSetChanged()
            return
        L_0x03c8:
            java.lang.Object r0 = r11.A01
            X.Bq6 r0 = (X.Bq6) r0
            X.Bq6.A06(r0)
            return
        L_0x03d0:
            java.lang.Object r0 = r11.A01
            X.Bq6 r0 = (X.Bq6) r0
            X.Bq6.A08(r0)
            return
        L_0x03d8:
            java.lang.Object r0 = r11.A01
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            r0.forceLayout()
            android.view.View r0 = r0.getRootView()
            r0.requestLayout()
            return
        L_0x03ea:
            java.lang.Object r0 = r11.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.11C r0 = r0.A1B
            X.AnonymousClass4a5.A03(r0)
            return
        L_0x03f4:
            java.lang.Object r4 = r11.A01
            X.7DY r4 = (X.AnonymousClass7DY) r4
            boolean r0 = r4.A0t()
            if (r0 != 0) goto L_0x0401
            X.AnonymousClass7DY.A0N(r4)
        L_0x0401:
            android.view.View r0 = r4.A09
            java.lang.String r3 = "cameraProtection"
            if (r0 == 0) goto L_0x0433
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0426
            android.view.View r1 = r4.A09
            if (r1 == 0) goto L_0x0433
            r0 = 8
            r1.setVisibility(r0)
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 400(0x190, double:1.976E-321)
            r2.setDuration(r0)
            android.view.View r0 = r4.A09
            if (r0 == 0) goto L_0x0433
            r0.startAnimation(r2)
        L_0x0426:
            X.77p r1 = r4.A0J
            if (r1 != 0) goto L_0x042e
            java.lang.String r0 = "cameraGestureDetector"
            goto L_0x04e0
        L_0x042e:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A00 = r0
            return
        L_0x0433:
            X.C18070vi.A11(r3)
            goto L_0x04e3
        L_0x0438:
            java.lang.Object r3 = r11.A01
            X.7DY r3 = (X.AnonymousClass7DY) r3
            r2 = 0
            android.view.View r0 = r3.A0A
            if (r0 != 0) goto L_0x0445
            java.lang.String r0 = "cameraView"
            goto L_0x04e0
        L_0x0445:
            r1 = 4
            r0.setVisibility(r1)
            android.view.View r0 = r3.A08
            if (r0 != 0) goto L_0x0451
            java.lang.String r0 = "cameraLayout"
            goto L_0x04e0
        L_0x0451:
            r0.setVisibility(r1)
            X.6pk r0 = r3.A0Q
            if (r0 != 0) goto L_0x045c
            java.lang.String r0 = "cameraModeTabController"
            goto L_0x04e0
        L_0x045c:
            X.AnonymousClass7DY.A0R(r3, r0, r1)
            android.view.View r0 = r3.A09
            if (r0 != 0) goto L_0x0466
            java.lang.String r0 = "cameraProtection"
            goto L_0x04e0
        L_0x0466:
            r0.setVisibility(r2)
            return
        L_0x046a:
            java.lang.Object r0 = r11.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            r0.A0m()
            return
        L_0x0472:
            java.lang.Object r0 = r11.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.8Av r0 = r0.A0K
            if (r0 == 0) goto L_0x04d2
            r0.pause()
            return
        L_0x047e:
            java.lang.Object r0 = r11.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.AnonymousClass7DY.A0G(r0)
            return
        L_0x0486:
            java.lang.Object r5 = r11.A01
            X.7DY r5 = (X.AnonymousClass7DY) r5
            X.8Av r0 = r5.A0K
            if (r0 == 0) goto L_0x04d2
            boolean r0 = r0.isRecording()
            if (r0 == 0) goto L_0x04ab
            java.io.File r0 = r5.A0Z
            if (r0 == 0) goto L_0x04a8
            long r3 = r0.length()
        L_0x049c:
            X.1KB r2 = r5.A0y
            r0 = 5
            X.7Ph r1 = new X.7Ph
            r1.<init>(r5, r3, r0)
        L_0x04a4:
            r2.CGP(r1)
            return
        L_0x04a8:
            r3 = -1
            goto L_0x049c
        L_0x04ab:
            X.1KB r2 = r5.A0y
            r0 = 15
            X.7R9 r1 = new X.7R9
            r1.<init>((java.lang.Object) r5, (int) r0)
            goto L_0x04a4
        L_0x04b5:
            java.lang.Object r3 = r11.A01
            X.7DY r3 = (X.AnonymousClass7DY) r3
            X.6u4 r0 = r3.A15
            java.util.Set r0 = r0.A09
            int r0 = r0.size()
            boolean r2 = X.AnonymousClass000.A1R(r0)
            X.8Av r1 = r3.A0K
            if (r1 == 0) goto L_0x04d2
            X.7DW r0 = new X.7DW
            r0.<init>(r3)
            r1.CP2(r0, r2)
            return
        L_0x04d2:
            java.lang.String r0 = "camera"
            goto L_0x04e0
        L_0x04d5:
            java.lang.Object r0 = r11.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            r2 = 0
            X.6zv r1 = r0.A0T
            if (r1 != 0) goto L_0x04e5
            java.lang.String r0 = "recordingController"
        L_0x04e0:
            X.C18070vi.A11(r0)
        L_0x04e3:
            r0 = 0
            throw r0
        L_0x04e5:
            boolean r0 = r0.A0t()
            r1.A02(r2, r0, r2)
            return
        L_0x04ed:
            java.lang.Object r0 = r11.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.AnonymousClass7DY.A0Q(r0)
            return
        L_0x04f5:
            r1 = 1
            r0 = 2
            com.whatsapp.voipcalling.Voip.endCall(r1, r0)
            return
        L_0x04fb:
            java.lang.Object r0 = r11.A01
            X.5gi r0 = (X.C110665gi) r0
            r0.A04()
            return
        L_0x0503:
            java.lang.Object r2 = r11.A01
            com.whatsapp.calling.views.VoipCallFooter r2 = (com.whatsapp.calling.views.VoipCallFooter) r2
            android.view.View r1 = r2.A0E
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131429988(0x7f0b0a64, float:1.8481664E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r2, r0)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r2.A02 = r1
            r0 = 1
            X.AnonymousClass4aR.A09(r1, r0)
            android.widget.ImageButton r1 = r2.A02
            android.view.View$OnClickListener r0 = r2.A00
            r1.setOnClickListener(r0)
            return
        L_0x0524:
            java.lang.Object r0 = r11.A01
            X.DRB r0 = (X.DRB) r0
            X.DRB.A04(r0)
            return
        L_0x052c:
            java.lang.Object r0 = r11.A01
            X.A8A r0 = (X.A8A) r0
            r0.A06()
            return
        L_0x0534:
            java.lang.Object r0 = r11.A01
            X.4ZV r0 = (X.AnonymousClass4ZV) r0
            r0.A02()
            return
        L_0x053c:
            java.lang.Object r0 = r11.A01
            com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader r0 = (com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader) r0
            r0.A00()
            return
        L_0x0544:
            java.lang.Object r0 = r11.A01
            com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader r0 = (com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader) r0
            r0.A00()
            return
        L_0x054c:
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r3)
            X.1FL r0 = (X.AnonymousClass1FL) r0
            r0.A2Z()
            android.widget.ListView r2 = r3.A0J
            r1 = 4
            X.2vK r0 = new X.2vK
            r0.<init>(r11, r1)
            r2.setOnScrollListener(r0)
            return
        L_0x0561:
            r0.setFlashMode(r2)
            r3.A0c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7R9.run():void");
    }

    public AnonymousClass7R9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass7R9(ContactInfoActivity contactInfoActivity, int i) {
        this.A00 = i;
        switch (i) {
            case 36:
            case 37:
                this.A01 = contactInfoActivity;
                return;
            default:
                this.A01 = contactInfoActivity;
                return;
        }
    }
}
