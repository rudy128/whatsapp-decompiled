package X;

/* renamed from: X.7Q7  reason: invalid class name */
public class AnonymousClass7Q7 implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public AnonymousClass7Q7(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj3;
        this.A05 = obj4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0455, code lost:
        if ((r1.A01 & 4) == 0) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x055a, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x055e, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0729, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A03, 4643) == false) goto L_0x072b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x074a, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r7.A03, 6222) == false) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x07bb, code lost:
        r4.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x07be, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01d9;
                case 2: goto L_0x001d;
                case 3: goto L_0x01f3;
                case 4: goto L_0x0209;
                case 5: goto L_0x0260;
                case 6: goto L_0x02d7;
                case 7: goto L_0x004f;
                case 8: goto L_0x02ed;
                case 9: goto L_0x0314;
                case 10: goto L_0x0360;
                case 11: goto L_0x0382;
                case 12: goto L_0x06da;
                case 13: goto L_0x048c;
                case 14: goto L_0x055f;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x00e6;
                case 18: goto L_0x0591;
                case 19: goto L_0x0126;
                case 20: goto L_0x05fd;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A02
            X.1fn r4 = (X.C31581fn) r4
            java.lang.Object r3 = r0.A03
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            int r2 = r0.A01
            java.lang.Object r1 = r0.A04
            javax.net.ssl.SSLSocketFactory r1 = (javax.net.ssl.SSLSocketFactory) r1
            java.lang.Object r0 = r0.A05
            X.2kv r0 = (X.C58582kv) r0
            X.C31581fn.A01(r4, r0, r3, r1, r2)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r1 = r0.A02
            com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper r1 = (com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper) r1
            X.9cb r3 = r1.mListener
            if (r3 == 0) goto L_0x001c
            int r1 = r0.A01
            if (r1 < 0) goto L_0x004c
            X.6Qc[] r0 = X.C122396Qc.values()
            int r0 = r0.length
            if (r1 >= r0) goto L_0x004c
            X.6Qc[] r0 = X.C122396Qc.values()
            r1 = r0[r1]
        L_0x0036:
            X.C17960vV.A02()
            r0 = -1
            if (r1 == 0) goto L_0x0655
            int r1 = r1.ordinal()
            if (r1 == r0) goto L_0x0655
            r0 = 2
            if (r1 == r0) goto L_0x0646
            r0 = 0
            if (r1 == r0) goto L_0x0655
            r0 = 1
            if (r1 == r0) goto L_0x0655
            return
        L_0x004c:
            X.6Qc r1 = X.C122396Qc.None
            goto L_0x0036
        L_0x004f:
            java.lang.Object r11 = r0.A02
            X.3Pz r11 = (X.C73133Pz) r11
            java.lang.Object r3 = r0.A03
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.A04
            java.util.List r2 = (java.util.List) r2
            int r13 = r0.A01
            java.lang.Object r10 = r0.A05
            X.2sr r10 = (X.C63312sr) r10
            r4 = 0
            boolean r6 = X.C18070vi.A17(r11, r3)
            r11.setupContentDescription(r3)
            X.1bI r0 = r11.A0L
            if (r0 == 0) goto L_0x001c
            android.view.View r0 = r0.A02()
            com.whatsapp.contact.FacepileView r0 = (com.whatsapp.contact.FacepileView) r0
            if (r0 == 0) goto L_0x001c
            int r0 = r0.A02
            boolean r1 = X.AnonymousClass000.A1R(r0)
            if (r2 != 0) goto L_0x00e4
            java.util.List r0 = r11.A0O
            java.util.List r12 = X.C73133Pz.A02(r0, r3)
        L_0x0083:
            r11.A0O = r2
            if (r1 == 0) goto L_0x06cb
            int r1 = r11.A01
            r0 = 2
            if (r1 < r0) goto L_0x06cb
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.1bI r0 = r11.A0L
            if (r0 == 0) goto L_0x06ab
            android.view.View r7 = r0.A02()
            com.whatsapp.contact.FacepileView r7 = (com.whatsapp.contact.FacepileView) r7
            if (r7 == 0) goto L_0x06ab
            int r0 = r7.A03
            if (r0 <= 0) goto L_0x00b1
            if (r13 > 0) goto L_0x00b1
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            com.whatsapp.contact.FacepileItemMaskView r1 = r7.A05
            int r0 = r7.A01
            android.animation.ValueAnimator r0 = X.C73133Pz.A01(r1, r11, r2, r4, r0)
            if (r0 == 0) goto L_0x00b1
            r3.add(r0)
        L_0x00b1:
            java.util.ArrayList r5 = X.C29351c6.A0D(r12)
            java.util.Iterator r8 = r12.iterator()
        L_0x00b9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0667
            X.1E7 r4 = X.C17880vN.A0O(r8)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131168739(0x7f070de3, float:1.7951788E38)
            int r2 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131168737(0x7f070de1, float:1.7951784E38)
            float r0 = r1.getDimension(r0)
            java.lang.String r0 = r4.A08(r0, r2)
            X.C18070vi.A0X(r0)
            r5.add(r0)
            goto L_0x00b9
        L_0x00e4:
            r12 = r2
            goto L_0x0083
        L_0x00e6:
            java.lang.Object r4 = r0.A02
            X.2qF r4 = (X.C61782qF) r4
            java.lang.Object r6 = r0.A03
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r3 = r0.A04
            com.whatsapp.jid.PhoneUserJid r3 = (com.whatsapp.jid.PhoneUserJid) r3
            java.lang.Object r2 = r0.A05
            X.1BI r2 = (X.AnonymousClass1BI) r2
            int r7 = r0.A01
            X.1Cd r0 = r4.A06
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x001c
            boolean r0 = X.C22971Dz.A0T(r6)
            if (r0 == 0) goto L_0x0115
            boolean r0 = X.C22971Dz.A0Y(r3)
            if (r0 == 0) goto L_0x0115
            X.1Ln r1 = r4.A07
            r0 = r6
            X.1E1 r0 = (X.AnonymousClass1E1) r0
            r1.A0P(r0, r3)
        L_0x0115:
            java.util.HashSet r5 = X.C61782qF.A00(r2, r4)
            X.1KB r0 = r4.A01
            r8 = 45
            X.Aiu r3 = new X.Aiu
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0J(r3)
            return
        L_0x0126:
            java.lang.Object r7 = r0.A02
            com.whatsapp.status.playback.MessageReplyActivity r7 = (com.whatsapp.status.playback.MessageReplyActivity) r7
            java.lang.Object r8 = r0.A03
            java.lang.Object r9 = r0.A04
            java.lang.Object r10 = r0.A05
            int r11 = r0.A01
            X.00H r0 = r7.A1C
            java.lang.Object r4 = r0.get()
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r4 = (com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration) r4
            X.6RS r1 = X.AnonymousClass6RS.STATUS_REPLY
            X.0wl r3 = r4.A03
            r2 = 0
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration$shouldShowSquidUpsellSync$1 r0 = new com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration$shouldShowSquidUpsellSync$1
            r0.<init>(r4, r1, r2)
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r3, r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x06cf
            X.1KB r0 = r7.A05
            r12 = 20
            X.7Q7 r6 = new X.7Q7
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.A0J(r6)
            if (r11 != 0) goto L_0x001c
            boolean r0 = r7.A1X
            if (r0 != 0) goto L_0x001c
            r0 = 1
            r7.A1X = r0
            X.00H r0 = r7.A1C
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r0 = (com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration) r0
            r0.A02(r1)
            X.00H r0 = r7.A1B
            java.lang.Object r6 = r0.get()
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r6 = (com.whatsapp.status.playback.avatar.AvatarReactionRepository) r6
            boolean r5 = r7.A4e()
            X.6oi r0 = r7.A1m
            java.lang.ref.WeakReference r7 = X.AnonymousClass3MW.A0z(r0)
            X.00H r0 = r6.A03
            java.lang.Object r0 = r0.get()
            X.4OC r0 = (X.AnonymousClass4OC) r0
            X.1G0 r0 = r0.A01
            X.0wl r8 = r6.A07
            X.1Fz r3 = X.AnonymousClass4I5.A00(r8, r0)
            r4 = 0
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$listenToAvatarEditorEvents$1 r2 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$listenToAvatarEditorEvents$1
            r2.<init>(r6, r7, r4)
            r1 = 10
            X.DXs r0 = new X.DXs
            r0.<init>((X.AnonymousClass1OS) r2, (X.C23421Fz) r3, (int) r1)
            X.1OX r3 = r6.A09
            X.C88604aC.A03(r3, r0)
            X.00H r0 = r6.A05
            java.lang.Object r0 = r0.get()
            X.6jw r0 = (X.C130746jw) r0
            X.1G0 r2 = r0.A07
            r1 = 14
            X.DXo r0 = new X.DXo
            r0.<init>(r2, r1)
            X.1Fz r1 = X.AnonymousClass4I5.A00(r8, r0)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$listenToAvatarEditorEvents$2 r0 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$listenToAvatarEditorEvents$2
            r0.<init>(r6, r7, r4, r5)
            X.C88604aC.A04(r0, r3, r1)
            return
        L_0x01c0:
            X.288 r1 = new X.288
            r1.<init>(r0)
            X.Cl4 r4 = X.C25367CeS.A00(r1)
            java.lang.Object r1 = r0.A02
            X.1uh r1 = (X.C40431uh) r1
            java.util.concurrent.Executor r3 = r1.A03
            r2 = 7
            X.Akc r1 = new X.Akc
            r1.<init>((java.lang.Object) r0, (java.lang.Object) r4, (int) r2)
            r3.execute(r1)
            return
        L_0x01d9:
            java.lang.Object r4 = r0.A04
            X.A58 r4 = (X.A58) r4
            java.lang.Object r3 = r0.A03
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A05
            X.6wl r2 = (X.C138246wl) r2
            java.lang.Object r1 = r0.A02
            X.DOZ r1 = (X.DOZ) r1
            int r0 = r0.A01
            X.71i r0 = X.C138246wl.A00(r2, r1, r0)
            r4.A03(r3, r0)
            return
        L_0x01f3:
            java.lang.Object r4 = r0.A02
            X.A74 r4 = (X.A74) r4
            java.lang.Object r3 = r0.A03
            X.1BI r3 = (X.AnonymousClass1BI) r3
            int r2 = r0.A01
            java.lang.Object r1 = r0.A04
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.A05
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.A74.A02(r4, r3, r1, r0, r2)
            return
        L_0x0209:
            java.lang.Object r6 = r0.A02
            X.1kp r6 = (X.C34641kp) r6
            java.lang.Object r5 = r0.A03
            X.2rc r5 = (X.C62572rc) r5
            java.lang.Object r4 = r0.A04
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r3 = r0.A05
            X.21V r3 = (X.AnonymousClass21V) r3
            int r7 = r0.A01
            X.0ve r2 = r6.A0A
            r1 = 12559(0x310f, float:1.7599E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0235
            if (r5 == 0) goto L_0x0235
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0235
            int r1 = r4.A0D()
            r0 = 2
            if (r1 != r0) goto L_0x0235
            return
        L_0x0235:
            r2 = 1
            if (r7 == r2) goto L_0x0247
            r0 = 2
            if (r7 == r0) goto L_0x0247
            boolean r0 = r3 instanceof X.C438421d
            if (r0 != 0) goto L_0x0247
            boolean r0 = r3 instanceof X.C441822l
            if (r0 == 0) goto L_0x0257
            int r0 = r3.A09
            if (r0 != r2) goto L_0x0257
        L_0x0247:
            r1 = 0
            if (r5 == 0) goto L_0x024c
            r5.A0V = r1
        L_0x024c:
            r3.A0U()
            if (r2 == 0) goto L_0x0259
            X.1kd r0 = r6.A01
            r0.A08(r3, r1, r1)
            return
        L_0x0257:
            r2 = 0
            goto L_0x0247
        L_0x0259:
            X.122 r1 = r6.A06
            r0 = -1
            r1.CQx(r4, r0)
            return
        L_0x0260:
            java.lang.Object r1 = r0.A02
            java.lang.Object r4 = r0.A03
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetLauncher r4 = (com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetLauncher) r4
            java.lang.Object r6 = r0.A04
            X.1BI r6 = (X.AnonymousClass1BI) r6
            int r2 = r0.A01
            java.lang.Object r5 = r0.A05
            android.net.Uri r5 = (android.net.Uri) r5
            X.6R9 r0 = X.AnonymousClass6R9.JUST_ACCEPTED
            if (r1 == r0) goto L_0x029f
            X.6R9 r0 = X.AnonymousClass6R9.ALREADY_ACCEPTED
            if (r1 == r0) goto L_0x02ac
            X.00H r0 = r4.A01
            if (r0 == 0) goto L_0x02d3
            X.1Ps r1 = X.AnonymousClass3MW.A0W(r0)
            r0 = 13
            r1.A0A(r6, r0, r2)
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            r2.setData(r5)
            java.lang.String r0 = "output_uri"
            r2.putExtra(r0, r5)
            java.lang.String r1 = "skip_cropping"
            r0 = 1
            r2.putExtra(r1, r0)
            r4.setResult(r3, r2)
            r4.finish()
            return
        L_0x029f:
            X.00H r0 = r4.A01
            if (r0 == 0) goto L_0x02d3
            X.1Ps r1 = X.AnonymousClass3MW.A0W(r0)
            r0 = 12
            r1.A0A(r6, r0, r2)
        L_0x02ac:
            com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet r3 = r4.A00
            if (r3 == 0) goto L_0x02cf
            if (r6 == 0) goto L_0x02b4
            r3.A0R = r6
        L_0x02b4:
            r3.A00 = r2
            r3.A02 = r5
            X.1GP r2 = r4.getSupportFragmentManager()
            r0 = 0
            X.7A5 r1 = new X.7A5
            r1.<init>(r5, r4, r0)
            java.lang.String r0 = "IMAGINE_BOTTOM_SHEET_REQUEST_KEY"
            r2.A0t(r1, r3, r0)
            X.1GP r0 = r4.getSupportFragmentManager()
            X.C20098A7b.A01(r3, r0)
            return
        L_0x02cf:
            java.lang.String r0 = "aiImagineBottomSheet"
            goto L_0x055a
        L_0x02d3:
            java.lang.String r0 = "bonsaiUiUtilLazy"
            goto L_0x055a
        L_0x02d7:
            java.lang.Object r4 = r0.A02
            com.whatsapp.calling.service.VoiceServiceEventCallback r4 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r4
            java.lang.Object r3 = r0.A03
            com.whatsapp.voipcalling.Voip$RecordingInfo[] r3 = (com.whatsapp.voipcalling.Voip.RecordingInfo[]) r3
            java.lang.Object r2 = r0.A04
            com.whatsapp.voipcalling.Voip$DebugTapType r2 = (com.whatsapp.voipcalling.Voip.DebugTapType) r2
            java.lang.Object r1 = r0.A05
            byte[] r1 = (byte[]) r1
            int r0 = r0.A01
            r4.m38lambda$callCaptureBufferFilled$2$comwhatsappcallingserviceVoiceServiceEventCallback(r3, r2, r1, r0)
            return
        L_0x02ed:
            java.lang.Object r4 = r0.A02
            X.8nj r4 = (X.C169888nj) r4
            java.lang.Object r6 = r0.A03
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r5 = r0.A04
            X.AEn r5 = (X.C20279AEn) r5
            java.lang.Object r3 = r0.A05
            android.app.Activity r3 = (android.app.Activity) r3
            int r7 = r0.A01
            X.00H r0 = r4.A08
            java.lang.Object r1 = r0.get()
            X.1Ty r1 = (X.C26911Ty) r1
            com.whatsapp.jid.UserJid r0 = r6.A0I()
            X.AMm r2 = new X.AMm
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A0D(r2, r0)
            return
        L_0x0314:
            java.lang.Object r1 = r0.A02
            X.7EX r1 = (X.AnonymousClass7EX) r1
            java.lang.Object r7 = r0.A03
            X.5yR r7 = (X.C116675yR) r7
            java.lang.Object r6 = r0.A04
            X.206 r6 = (X.AnonymousClass206) r6
            int r5 = r0.A01
            java.lang.Object r4 = r0.A05
            X.2qD r4 = (X.C61762qD) r4
            if (r1 == 0) goto L_0x0356
            java.lang.Integer r0 = r1.A00
            int r3 = r0.intValue()
            r2 = 12
            X.00H r0 = r7.A05
            java.lang.Object r1 = r0.get()
            X.1iV r1 = (X.C33241iV) r1
            if (r3 != r2) goto L_0x0353
            r0 = 12
        L_0x033c:
            X.C33241iV.A00(r1, r6, r0, r5)
            X.00H r0 = r7.A04
            java.lang.Object r2 = r0.get()
            X.9kk r2 = (X.C190319kk) r2
            int r0 = r4.A06
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cta-url"
            r2.A00(r6, r0, r1)
            return
        L_0x0353:
            r0 = 13
            goto L_0x033c
        L_0x0356:
            X.00H r0 = r7.A05
            java.lang.Object r1 = r0.get()
            X.1iV r1 = (X.C33241iV) r1
            r0 = 3
            goto L_0x033c
        L_0x0360:
            java.lang.Object r1 = r0.A02
            X.4qB r1 = (X.C97864qB) r1
            java.lang.Object r4 = r0.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            java.lang.Object r6 = r0.A04
            X.77d r6 = (X.C1418377d) r6
            java.lang.Object r7 = r0.A05
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r0.A01
            X.4aY r1 = r1.A00
            com.whatsapp.media.share.ShareMediaViewModel r2 = r1.A3Y
            X.1E7 r3 = r1.A35
            X.3VQ r0 = r1.A2b
            X.206 r5 = r0.A0G
            boolean r9 = r1.A6g
            r2.A0T(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0382:
            java.lang.Object r4 = r0.A02
            X.6i8 r4 = (X.C129646i8) r4
            java.lang.Object r9 = r0.A03
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r8 = r0.A04
            X.1OZ r8 = (X.AnonymousClass1OZ) r8
            java.lang.Object r3 = r0.A05
            int r5 = r0.A01
            r0 = 3
            X.C18070vi.A0d(r3, r0)
            X.0ve r11 = r4.A03
            r0 = 11685(0x2da5, float:1.6374E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r11, r0)
            r6 = 0
            if (r0 == 0) goto L_0x046e
            java.lang.String r1 = r9.getScheme()
            java.lang.String r0 = r9.getHost()
            boolean r0 = X.C32981i4.A0D(r1, r0)
            if (r0 == 0) goto L_0x03db
            java.util.List r2 = r9.getPathSegments()
            int r1 = r2.size()
            r0 = 1
            if (r1 <= r0) goto L_0x046e
            java.lang.String r7 = X.C17880vN.A0w(r2, r0)
        L_0x03c0:
            if (r7 == 0) goto L_0x046e
            r0 = 7926(0x1ef6, float:1.1107E-41)
            boolean r0 = X.C18020vd.A05(r10, r11, r0)
            if (r0 == 0) goto L_0x03d9
            java.lang.String r0 = "source_surface"
            java.lang.String r0 = r9.getQueryParameter(r0)
            if (r0 == 0) goto L_0x03d9
            java.lang.Long r2 = X.AnonymousClass1YD.A04(r0)
        L_0x03d6:
            r0 = 10000(0x2710, double:4.9407E-320)
            goto L_0x03e0
        L_0x03d9:
            r2 = r6
            goto L_0x03d6
        L_0x03db:
            java.lang.String r7 = X.C32981i4.A07(r9)
            goto L_0x03c0
        L_0x03e0:
            r8.A0E(r0)     // Catch:{ 1oV -> 0x0476 }
            X.31f r1 = r4.A00
            X.2R1 r0 = X.AnonymousClass2R1.A0F
            android.util.Pair r1 = r1.A03(r0, r6, r7)
            java.lang.Object r0 = r1.first
            X.2rf r0 = (X.C62602rf) r0
            java.lang.Object r9 = r1.second
            X.9i3 r9 = (X.C188829i3) r9
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0403
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x03fd:
            X.2rS r1 = new X.2rS
            r1.<init>(r6, r0, r2, r7)
            goto L_0x0481
        L_0x0403:
            if (r9 == 0) goto L_0x0466
            com.whatsapp.jid.UserJid r0 = r9.A0D
        L_0x0407:
            java.lang.String r0 = X.AnonymousClass17K.A05(r0)
            if (r0 == 0) goto L_0x040e
            r7 = r0
        L_0x040e:
            if (r9 == 0) goto L_0x046b
            int r0 = r9.A04
            r8 = 1
            if (r0 != r8) goto L_0x046b
            X.9ed r0 = r9.A09
            if (r0 == 0) goto L_0x0464
            X.9dG r0 = r0.A00
            if (r0 == 0) goto L_0x0464
            X.1ya r0 = r0.A01
            if (r0 == 0) goto L_0x0464
            int r1 = r0.hostStorage
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x042c:
            boolean r0 = X.C18070vi.A19(r0, r8)
            if (r0 == 0) goto L_0x0457
            X.9ed r8 = r9.A09
            if (r8 == 0) goto L_0x0468
            X.1ca r1 = r8.A03
            if (r1 == 0) goto L_0x0468
            java.lang.String r0 = "profile"
            X.1ca r1 = r1.A0K(r0)
            if (r1 == 0) goto L_0x0468
            com.whatsapp.jid.UserJid r0 = r8.A02
            X.C18070vi.A0W(r0)
            X.AEW r1 = X.A82.A01(r0, r1)
            if (r1 == 0) goto L_0x0468
            boolean r0 = r1.A0W
            if (r0 == 0) goto L_0x0468
            int r0 = r1.A01
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0468
        L_0x0457:
            com.whatsapp.jid.UserJid r1 = r9.A0D
            if (r1 == 0) goto L_0x0461
            X.1M9 r0 = r4.A02
            X.1E7 r6 = r0.A0H(r1)
        L_0x0461:
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            goto L_0x03fd
        L_0x0464:
            r0 = r6
            goto L_0x042c
        L_0x0466:
            r0 = r6
            goto L_0x0407
        L_0x0468:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x03fd
        L_0x046b:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x03fd
        L_0x046e:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.2rS r1 = new X.2rS
            r1.<init>(r6, r0, r6, r6)
            goto L_0x0481
        L_0x0476:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.2rS r1 = new X.2rS
            r1.<init>(r6, r0, r2, r6)
        L_0x0481:
            X.1KB r4 = r4.A01
            r0 = 9
            X.3Cu r2 = new X.3Cu
            r2.<init>(r3, r5, r0, r1)
            goto L_0x07bb
        L_0x048c:
            java.lang.Object r8 = r0.A02
            java.lang.Object r4 = r0.A03
            com.whatsapp.gallery.GalleryTabHostFragment r4 = (com.whatsapp.gallery.GalleryTabHostFragment) r4
            java.lang.Object r3 = r0.A04
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r2 = r0.A05
            java.util.List r2 = (java.util.List) r2
            int r10 = r0.A01
            boolean r1 = r8 instanceof X.AnonymousClass1IU
            r0 = r1 ^ 1
            if (r0 == 0) goto L_0x053e
            if (r1 == 0) goto L_0x04a5
            r8 = 0
        L_0x04a5:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x053a
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x053a
            X.7vy r9 = new X.7vy
            r9.<init>(r4, r3, r2)
            int r0 = r8.size()
            long r2 = (long) r0
            X.3Rj r5 = X.AnonymousClass4a6.A03(r4)
            X.0vb r1 = r4.A0C
            if (r1 == 0) goto L_0x0558
            r0 = 2131755369(0x7f100169, float:1.9141615E38)
            java.lang.String r0 = r1.A0D(r2, r0)
            r5.A0k(r0)
            X.0vb r7 = r4.A0C
            if (r7 == 0) goto L_0x0558
            r6 = 2131755368(0x7f100168, float:1.9141613E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            r0 = 0
            X.AnonymousClass3MX.A1S(r1, r0, r2)
            r0 = 1
            X.C17880vN.A1T(r1, r10, r0)
            java.lang.String r0 = r7.A0K(r1, r6, r2)
            r5.A0S(r0)
            r7 = 2131895707(0x7f12259b, float:1.9426255E38)
            X.1q9 r6 = r4.A1G()
            r1 = 22
            X.7AO r0 = new X.7AO
            r0.<init>(r9, r1)
            r5.A0g(r6, r0, r7)
            X.0vb r1 = r4.A0C
            if (r1 == 0) goto L_0x0558
            r0 = 2131755370(0x7f10016a, float:1.9141617E38)
            java.lang.String r3 = r1.A0D(r2, r0)
            X.1q9 r2 = r4.A1G()
            r1 = 3
            X.7AH r0 = new X.7AH
            r0.<init>(r8, r4, r1)
            r5.A0h(r2, r0, r3)
            r3 = 2131895706(0x7f12259a, float:1.9426253E38)
            X.1q9 r2 = r4.A1G()
            r1 = 23
            X.7AO r0 = new X.7AO
            r0.<init>(r4, r1)
            r5.A0f(r2, r0, r3)
            X.1q9 r3 = r4.A1G()
            r0 = 24
            X.7AO r2 = new X.7AO
            r2.<init>(r4, r0)
            androidx.appcompat.app.AlertDialog$Builder r1 = r5.A00
            X.4ao r0 = r5.A02
            r1.A0G(r0)
            X.1DT r0 = r0.A00
            r0.A0A(r3, r2)
            X.AnonymousClass3MY.A1G(r5)
            return
        L_0x053a:
            com.whatsapp.gallery.GalleryTabHostFragment.A0d(r4, r3, r2)
            return
        L_0x053e:
            X.1KB r2 = r4.A06
            if (r2 == 0) goto L_0x0555
            r1 = 2131896087(0x7f122717, float:1.9427025E38)
            r0 = 0
            r2.A08(r1, r0)
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = X.C108965cb.A0P(r4)
            X.1DT r1 = r0.A05
            X.7HN r0 = X.AnonymousClass7HN.A00
            r1.A0F(r0)
            return
        L_0x0555:
            java.lang.String r0 = "globalUI"
            goto L_0x055a
        L_0x0558:
            java.lang.String r0 = "whatsAppLocale"
        L_0x055a:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x055f:
            java.lang.Object r1 = r0.A02
            X.4rF r1 = (X.C98494rF) r1
            java.lang.Object r5 = r0.A03
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r5 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r5
            int r4 = r0.A01
            java.lang.Object r3 = r0.A04
            java.lang.Object r2 = r0.A05
            X.3RY r2 = (X.AnonymousClass3RY) r2
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Object r1 = r1.element
            if (r1 == 0) goto L_0x0581
            android.net.Uri[] r0 = r5.A0P
            r0[r4] = r3
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r2.setScreenshot(r1)
            return
        L_0x0581:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InAppBugReporting/screenshot/bitmap is null "
            X.C17900vP.A0X(r3, r0, r1)
            r0 = 2131889981(0x7f120f3d, float:1.941464E38)
            r5.BhQ(r0)
            return
        L_0x0591:
            java.lang.Object r6 = r0.A02
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r8 = r0.A03
            int r7 = r0.A01
            java.lang.Object r4 = r0.A04
            X.1KB r4 = (X.AnonymousClass1KB) r4
            java.lang.Object r5 = r0.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "android.resource://"
            r1.append(r0)
            java.lang.String r0 = r6.getPackageName()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r0 = 2132017220(0x7f140044, float:1.9672712E38)
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            android.media.MediaPlayer r2 = new android.media.MediaPlayer
            r2.<init>()
            r1 = 2
            X.75Q r0 = new X.75Q
            r0.<init>(r8, r1)
            r2.setOnCompletionListener(r0)
            r2.setAudioStreamType(r7)
            r0 = 3
            if (r7 != r0) goto L_0x05da
            r0 = 1051931443(0x3eb33333, float:0.35)
        L_0x05d6:
            r2.setVolume(r0, r0)
            goto L_0x05e0
        L_0x05da:
            if (r7 != 0) goto L_0x05e0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            goto L_0x05d6
        L_0x05e0:
            r2.setDataSource(r6, r3)     // Catch:{ IOException -> 0x05f6 }
            r2.prepare()     // Catch:{ IOException -> 0x05f6 }
            r2.start()     // Catch:{ IOException -> 0x05f6 }
            r0 = 27
            X.7Qo r2 = new X.7Qo     // Catch:{ IOException -> 0x05f6 }
            r2.<init>((java.lang.Object) r5, (int) r0)     // Catch:{ IOException -> 0x05f6 }
            r0 = 600(0x258, double:2.964E-321)
            r4.A0K(r2, r0)     // Catch:{ IOException -> 0x05f6 }
            return
        L_0x05f6:
            r1 = move-exception
            java.lang.String r0 = "SequentialMessagesTonePlayer/playMiddleTone "
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x05fd:
            java.lang.Object r5 = r0.A02
            com.whatsapp.status.playback.MessageReplyActivity r5 = (com.whatsapp.status.playback.MessageReplyActivity) r5
            java.lang.Object r1 = r0.A03
            X.6RP r1 = (X.AnonymousClass6RP) r1
            java.lang.Object r4 = r0.A04
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r3 = r0.A05
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r2 = r0.A01
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x063c
            r0 = 2
            if (r1 == r0) goto L_0x0632
            r0 = 3
            if (r1 != r0) goto L_0x0628
            r0 = 2131886884(0x7f120324, float:1.940836E38)
            r4.setText(r0)
            r0 = 2131886883(0x7f120323, float:1.9408357E38)
        L_0x0625:
            r3.setText(r0)
        L_0x0628:
            X.1bI r0 = r5.A0z
            android.view.View r0 = r0.A02()
            r0.setVisibility(r2)
            return
        L_0x0632:
            r0 = 2131886878(0x7f12031e, float:1.9408347E38)
            r4.setText(r0)
            r0 = 2131886877(0x7f12031d, float:1.9408345E38)
            goto L_0x0625
        L_0x063c:
            r0 = 2131886873(0x7f120319, float:1.9408337E38)
            r4.setText(r0)
            r0 = 2131886872(0x7f120318, float:1.9408335E38)
            goto L_0x0625
        L_0x0646:
            r0 = 2131886700(0x7f12026c, float:1.9407986E38)
            X.4Pe r2 = r3.A01
            X.4DE r1 = r3.A00
            X.6IR r0 = X.C72453Mb.A0q(r0)
            r2.A00(r1, r0)
            return
        L_0x0655:
            X.4Pe r0 = r3.A01
            X.4DE r1 = r3.A00
            com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel r0 = r0.A00
            X.0vl r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.4Qt r0 = (X.C86214Qt) r0
            r0.A00(r1)
            return
        L_0x0667:
            int r4 = r7.A02
        L_0x0669:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x06ab
            com.whatsapp.WaImageView r0 = r7.A04(r4)
            if (r0 == 0) goto L_0x0669
            java.lang.Object r0 = r0.getTag()
            if (r0 == 0) goto L_0x0669
            boolean r0 = X.C29431cG.A18(r5, r0)
            if (r0 != 0) goto L_0x0669
            android.view.View r9 = r7.getChildAt(r4)
            java.lang.Integer r8 = X.AnonymousClass00R.A01
            int r0 = r7.A01
            android.animation.ValueAnimator r2 = X.C73133Pz.A01(r9, r11, r8, r0, r0)
            if (r2 == 0) goto L_0x0699
            r1 = 0
            X.3Ml r0 = new X.3Ml
            r0.<init>(r9, r7, r1)
            r2.addListener(r0)
            r3.add(r2)
        L_0x0699:
            com.whatsapp.WaImageView r1 = r7.A04(r4)
            if (r1 == 0) goto L_0x0669
            int r0 = r7.A01
            android.animation.ValueAnimator r0 = X.C73133Pz.A01(r1, r11, r8, r0, r0)
            if (r0 == 0) goto L_0x0669
            r3.add(r0)
            goto L_0x0669
        L_0x06ab:
            boolean r0 = X.C17880vN.A1X(r3)
            if (r0 == 0) goto L_0x06c7
            android.animation.AnimatorSet r0 = X.C108945cZ.A0B()
            r14 = 0
            X.3Mj r9 = new X.3Mj
            r9.<init>(r10, r11, r12, r13, r14)
            r0.addListener(r9)
            r0.playTogether(r3)
            r11.A04 = r0
            r0.start()
            return
        L_0x06c7:
            X.C73133Pz.A03(r10, r11, r12, r13, r6)
            return
        L_0x06cb:
            X.C73133Pz.A03(r10, r11, r12, r13, r4)
            return
        L_0x06cf:
            X.1KB r4 = r7.A05
            r0 = 17
            X.7RH r2 = new X.7RH
            r2.<init>((java.lang.Object) r7, (int) r0)
            goto L_0x07bb
        L_0x06da:
            java.lang.Object r13 = r0.A02
            android.view.View r13 = (android.view.View) r13
            java.lang.Object r5 = r0.A03
            X.5kU r5 = (X.C111825kU) r5
            java.lang.Object r4 = r0.A04
            X.77V r4 = (X.AnonymousClass77V) r4
            int r3 = r0.A01
            java.lang.Object r6 = r0.A05
            X.77d r6 = (X.C1418377d) r6
            r15 = 0
            X.C18070vi.A0d(r13, r15)
            r1 = 1
            android.content.Context r12 = r13.getContext()
            r16 = 2132084381(0x7f15069d, float:1.980893E38)
            r14 = 8388613(0x800005, float:1.175495E-38)
            X.0Iy r11 = new X.0Iy
            r11.<init>(r12, r13, r14, r15, r16)
            android.content.Context r0 = r11.A02
            X.02C r2 = new X.02C
            r2.<init>(r0)
            r0 = 2131820565(0x7f110015, float:1.9273849E38)
            X.01m r8 = r11.A03
            r2.inflate(r0, r8)
            r0 = 2131431042(0x7f0b0e82, float:1.8483802E38)
            android.view.MenuItem r10 = r8.findItem(r0)
            X.6pW r7 = r5.A04
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x072b
            X.0ve r9 = r7.A03
            r2 = 4643(0x1223, float:6.506E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r9, r2)
            r0 = 1
            if (r2 != 0) goto L_0x072c
        L_0x072b:
            r0 = 0
        L_0x072c:
            r10.setVisible(r0)
            r0 = 2131431040(0x7f0b0e80, float:1.8483798E38)
            r9 = 2131431040(0x7f0b0e80, float:1.8483798E38)
            android.view.MenuItem r10 = r8.findItem(r0)
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x074c
            X.0ve r7 = r7.A03
            r2 = 6222(0x184e, float:8.719E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r7, r2)
            r0 = 1
            if (r2 != 0) goto L_0x074d
        L_0x074c:
            r0 = 0
        L_0x074d:
            r10.setVisible(r0)
            android.view.MenuItem r7 = r8.findItem(r9)
            android.content.Context r2 = r13.getContext()
            r0 = 2131899455(0x7f12343f, float:1.9433856E38)
            java.lang.String r0 = r2.getString(r0)
            r7.setTitle(r0)
            X.1SB r0 = r5.A00
            boolean r0 = r0.A0L(r6)
            if (r0 == 0) goto L_0x077c
            android.view.MenuItem r7 = r8.findItem(r9)
            android.content.Context r2 = r13.getContext()
            r0 = 2131896479(0x7f12289f, float:1.942782E38)
            java.lang.String r0 = r2.getString(r0)
            r7.setTitle(r0)
        L_0x077c:
            r8.setGroupDividerEnabled(r1)
            X.C137526vb.A00(r8)
            X.778 r9 = r5.A06
            if (r9 == 0) goto L_0x07ac
            r0 = 2131431046(0x7f0b0e86, float:1.848381E38)
            android.view.MenuItem r8 = r8.findItem(r0)
            if (r8 == 0) goto L_0x07ac
            android.content.Context r7 = X.AnonymousClass3MY.A04(r13)
            java.lang.Boolean r0 = r9.A00
            boolean r0 = X.C18070vi.A19(r0, r1)
            r2 = 2131899383(0x7f1233f7, float:1.943371E38)
            if (r0 == 0) goto L_0x07a1
            r2 = 2131895770(0x7f1225da, float:1.9426382E38)
        L_0x07a1:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r9.A02
            java.lang.String r0 = X.AnonymousClass3Ma.A10(r7, r0, r1, r15, r2)
            r8.setTitle(r0)
        L_0x07ac:
            X.79o r0 = new X.79o
            r0.<init>(r5, r4, r6, r3)
            r11.A01 = r0
            X.1KB r4 = r5.A03
            r0 = 16
            X.7Ql r2 = X.C146747Ql.A00(r11, r0)
        L_0x07bb:
            r4.A0J(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Q7.run():void");
    }
}
