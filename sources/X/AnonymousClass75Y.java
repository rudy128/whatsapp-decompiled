package X;

import android.os.Handler;

/* renamed from: X.75Y  reason: invalid class name */
public class AnonymousClass75Y implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public AnonymousClass75Y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0387, code lost:
        if (r6.A00 == 600) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011a, code lost:
        if (r1 != 1) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x02cb;
                case 1: goto L_0x02b0;
                case 2: goto L_0x02a3;
                case 3: goto L_0x0240;
                case 4: goto L_0x01a7;
                case 5: goto L_0x017e;
                case 6: goto L_0x0159;
                case 7: goto L_0x039a;
                case 8: goto L_0x013a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r8.A01
            com.whatsapp.voipcalling.VoipActivityV2 r5 = (com.whatsapp.voipcalling.VoipActivityV2) r5
            int r1 = r9.what
            r0 = 9
            r6 = 1
            if (r1 != r0) goto L_0x0015
            r5.finish()
        L_0x0013:
            r0 = 1
            return r0
        L_0x0015:
            com.whatsapp.voipcalling.CallInfo r2 = com.whatsapp.voipcalling.VoipActivityV2.A0Q(r5)
            if (r2 == 0) goto L_0x0013
            com.whatsapp.voipcalling.CallState r3 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r0) goto L_0x0013
            int r1 = r9.what
            if (r1 == r6) goto L_0x0135
            r0 = 2
            if (r1 == r0) goto L_0x0127
            r7 = 3
            if (r1 == r7) goto L_0x00c7
            r0 = 7
            if (r1 == r0) goto L_0x00b3
            r0 = 8
            if (r1 == r0) goto L_0x00a8
            switch(r1) {
                case 10: goto L_0x00a3;
                case 11: goto L_0x0069;
                case 12: goto L_0x0065;
                case 13: goto L_0x0036;
                case 14: goto L_0x005c;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0013
        L_0x0036:
            X.3Rj r3 = X.AnonymousClass4a6.A00(r5)
            r0 = 2131895442(0x7f122492, float:1.9425717E38)
            r3.A0E(r0)
            r0 = 2131895441(0x7f122491, float:1.9425715E38)
            X.C108955ca.A1D(r5, r3, r0)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 0
            X.7AL r0 = new X.7AL
            r0.<init>(r1)
            r3.A0g(r5, r0, r2)
            X.05w r1 = r3.create()
            java.lang.String r0 = "ScreenShareNotAvailableVoiceCall"
            r5.A4f(r1, r0)
            goto L_0x0013
        L_0x005c:
            X.1KB r1 = r5.A05
            r0 = 2131889960(0x7f120f28, float:1.9414598E38)
            r1.A08(r0, r6)
            goto L_0x0013
        L_0x0065:
            com.whatsapp.voipcalling.VoipActivityV2.A1Y(r5)
            goto L_0x0013
        L_0x0069:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r3 != r0) goto L_0x0013
            boolean r0 = r2.callEnding
            if (r0 != 0) goto L_0x0013
            X.A99 r0 = r5.A0u
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "voip/VoipActivityV2/commonHandler STOP_CAMERA"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6qE r1 = r2.self
            X.6qE r0 = r2.getDefaultPeerInfo()
            if (r0 == 0) goto L_0x0087
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0087
            goto L_0x0013
        L_0x0087:
            int r0 = r1.A08
            if (r0 != r6) goto L_0x0013
            r5.A2M = r6
            X.A99 r0 = r5.A0u
            r0.A0f()
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r5.A1b
            if (r0 == 0) goto L_0x0013
            com.whatsapp.calling.views.VoipCallFooter r1 = r0.A0T
            if (r1 == 0) goto L_0x0013
            boolean r0 = r5.A2D
            r0 = r0 ^ 1
            r1.setToggleVideoButtonSelected(r0)
            goto L_0x0013
        L_0x00a3:
            r5.CRo(r2)
            goto L_0x0013
        L_0x00a8:
            androidx.fragment.app.DialogFragment r1 = r5.A0N
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = "NonActivityDismissDialogFragment"
            r5.A4h(r1, r0)
            goto L_0x0013
        L_0x00b3:
            androidx.fragment.app.DialogFragment r0 = r5.A0N
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A1b()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "NonActivityDismissDialogFragment"
            r5.A4j(r0)
            r0 = 0
            r5.A0N = r0
            goto L_0x0013
        L_0x00c7:
            boolean r0 = r5.A2K
            r2 = 5000(0x1388, double:2.4703E-320)
            if (r0 != 0) goto L_0x00df
            boolean r0 = X.C108995ce.A1a(r5)
            if (r0 == 0) goto L_0x00eb
            X.1bI r0 = r5.A1R
            android.view.View r0 = r0.A02()
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            X.4RO r0 = r0.A03
            if (r0 == 0) goto L_0x00eb
        L_0x00df:
            android.os.Handler r0 = r5.A05
            r0.removeMessages(r7)
            android.os.Handler r0 = r5.A05
            r0.sendEmptyMessageDelayed(r7, r2)
            goto L_0x0013
        L_0x00eb:
            boolean r0 = r5.A2L
            if (r0 == 0) goto L_0x0013
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r5.A1b
            if (r1 == 0) goto L_0x0122
            boolean r0 = r1.A2G()
            if (r0 != 0) goto L_0x00df
            com.whatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r1.A0M
            if (r0 == 0) goto L_0x0105
            X.1vp r0 = r0.A0A
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 != 0) goto L_0x00df
        L_0x0105:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r5.A1b
            boolean r0 = r1.A0e
            if (r0 == 0) goto L_0x0122
            X.73c r4 = r1.A0K
            if (r4 == 0) goto L_0x0122
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x011d
            int r1 = r4.A01
            if (r1 == 0) goto L_0x011d
        L_0x0117:
            r0 = 2
            if (r1 == r0) goto L_0x00df
            if (r1 != r6) goto L_0x0122
            goto L_0x00df
        L_0x011d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0G
            int r1 = r0.A0J
            goto L_0x0117
        L_0x0122:
            com.whatsapp.voipcalling.VoipActivityV2.A1U(r5)
            goto L_0x0013
        L_0x0127:
            androidx.fragment.app.DialogFragment r0 = r5.A0O
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "EndCallConfirmationDialogFragment"
            r5.A4j(r0)
            r0 = 0
            r5.A0O = r0
            goto L_0x0013
        L_0x0135:
            com.whatsapp.voipcalling.VoipActivityV2.A1V(r5)
            goto L_0x0013
        L_0x013a:
            java.lang.Object r1 = r8.A01
            X.6Mq r1 = (X.C122066Mq) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.6t9 r0 = r1.A00
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = "staticContentPlayer"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x014d:
            r0.A02()
            X.88P r0 = r1.A08
            if (r0 == 0) goto L_0x0013
            r0.BpQ(r1)
            goto L_0x0013
        L_0x0159:
            java.lang.Object r2 = r8.A01
            X.5jU r2 = (X.C111295jU) r2
            int r0 = r9.what
            if (r0 != 0) goto L_0x03a3
            X.6yD r0 = new X.6yD
            r0.<init>()
            X.6yD r0 = r0.A00()
            r2.A06 = r0
            java.lang.Runnable r0 = r2.A0E
            if (r0 == 0) goto L_0x0173
            r0.run()
        L_0x0173:
            android.os.Handler r1 = r2.A0T
            r0 = 0
            r1.removeMessages(r0)
            X.C111295jU.A08(r2)
            goto L_0x0013
        L_0x017e:
            java.lang.Object r3 = r8.A01
            com.whatsapp.profile.SetAboutInfo r3 = (com.whatsapp.profile.SetAboutInfo) r3
            int r1 = r9.what
            r0 = 1
            if (r1 != r0) goto L_0x019d
            X.00H r0 = r3.A05
            java.lang.Object r2 = r0.get()
            X.2n7 r2 = (X.C59932n7) r2
            java.lang.Object r1 = r9.obj
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            r2.A02(r1, r0)
        L_0x0197:
            r0 = 2
            X.AnonymousClass4Yv.A00(r3, r0)
            goto L_0x0013
        L_0x019d:
            X.1KB r2 = r3.A05
            r1 = 2131891350(0x7f121496, float:1.9417418E38)
            r0 = 0
            r2.A08(r1, r0)
            goto L_0x0197
        L_0x01a7:
            java.lang.Object r4 = r8.A01
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            X.70T r0 = r4.A18
            r5 = 1
            if (r0 == 0) goto L_0x0013
            int r0 = r4.A02
            if (r0 != r5) goto L_0x01e7
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r4.A1F
            if (r0 == 0) goto L_0x0209
            int r0 = r0.getMax()
            if (r0 <= 0) goto L_0x0209
            X.70T r0 = r4.A18
            int r1 = r0.A02()
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r4.A1F
            int r0 = r0.getMax()
            int r6 = java.lang.Math.min(r1, r0)
            int r0 = r4.A00
            int r1 = r0 / 1000
            int r0 = r6 / 1000
            if (r1 == r0) goto L_0x01e2
            android.widget.TextView r3 = r4.A08
            if (r3 == 0) goto L_0x01e0
            X.0vb r2 = r4.A0W
            long r0 = (long) r0
            X.C108975cc.A0y(r3, r2, r0)
        L_0x01e0:
            r4.A00 = r6
        L_0x01e2:
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r4.A1F
            r0.setProgress(r6)
        L_0x01e7:
            X.1FL r0 = r4.A1D()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0214
            int r0 = r4.A02
            if (r0 != r5) goto L_0x0214
            X.70T r0 = r4.A18
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0214
            android.os.Handler r3 = r4.A07
            if (r3 == 0) goto L_0x0013
            r2 = 0
            r0 = 50
            r3.sendEmptyMessageDelayed(r2, r0)
            goto L_0x0013
        L_0x0209:
            X.1FU r1 = X.C108945cZ.A0Y(r4)
            r0 = 2131890028(0x7f120f6c, float:1.9414736E38)
            r1.BhQ(r0)
            goto L_0x01e7
        L_0x0214:
            int r1 = r4.A02
            r0 = 2
            if (r1 == r0) goto L_0x0013
            java.lang.String r0 = "MediaViewFragment/onViewCreated/audio/set to stop status"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r1 = r4.A1F
            if (r1 == 0) goto L_0x0229
            int r0 = r1.getMax()
            r1.setProgress(r0)
        L_0x0229:
            android.widget.TextView r3 = r4.A08
            if (r3 == 0) goto L_0x023b
            X.0vb r2 = r4.A0W
            X.70T r0 = r4.A18
            int r0 = r0.A03()
            int r0 = r0 / 1000
            long r0 = (long) r0
            X.C108975cc.A0y(r3, r2, r0)
        L_0x023b:
            com.whatsapp.mediaview.MediaViewFragment.A0D(r4)
            goto L_0x0013
        L_0x0240:
            java.lang.Object r2 = r8.A01
            X.AfC r2 = (X.C21141AfC) r2
            int r1 = r9.what
            r3 = 1
            if (r1 == r3) goto L_0x025a
            r0 = 2
            if (r1 != r0) goto L_0x0013
            X.DRB r0 = r2.A02
            if (r0 == 0) goto L_0x0013
            X.C21141AfC.A03(r2)
            X.DRB r0 = r2.A02
            X.C21141AfC.A02(r0, r2)
            goto L_0x0013
        L_0x025a:
            java.lang.String r0 = "voip/VideoPortManager/Camera evicted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r2.A01
            if (r4 == 0) goto L_0x0013
            X.8yP r5 = r4.A0W
            X.4Sa r2 = r5.A07()
            com.whatsapp.voipcalling.CallState r1 = r2.A0B
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0277
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0277
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0013
        L_0x0277:
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0013
            X.10w r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = r2.A0A
            java.lang.Object r0 = r1.get(r0)
            X.6qE r0 = (X.C134216qE) r0
            if (r0 == 0) goto L_0x028d
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x028d
            goto L_0x0013
        L_0x028d:
            X.6qE r0 = r2.A07
            if (r0 == 0) goto L_0x0013
            int r0 = r0.A08
            if (r0 != r3) goto L_0x0013
            X.A99 r0 = r5.A03
            if (r0 == 0) goto L_0x029c
            r0.A0f()
        L_0x029c:
            X.1wy r0 = r4.A0z
            X.AnonymousClass3MY.A1L(r0, r3)
            goto L_0x0013
        L_0x02a3:
            java.lang.Object r1 = r8.A01
            com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner r1 = (com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner) r1
            int r0 = r9.what
            if (r0 != 0) goto L_0x0013
            r1.A01()
            goto L_0x0013
        L_0x02b0:
            java.lang.Object r3 = r8.A01
            X.5e0 r3 = (X.C109785e0) r3
            int r1 = r9.what
            r0 = 1
            if (r1 != r0) goto L_0x0013
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r2 = r3.A02
            int r1 = r3.A00
            X.0vp r0 = r2.A0B
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 != 0) goto L_0x0013
            r0 = 0
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel.A03(r2, r1, r0)
            goto L_0x0013
        L_0x02cb:
            java.lang.Object r6 = r8.A01
            com.whatsapp.HomeActivity r6 = (com.whatsapp.HomeActivity) r6
            int r0 = r9.what
            if (r0 != 0) goto L_0x0013
            X.1bB r1 = r6.A0b
            r0 = 200(0xc8, float:2.8E-43)
            int r0 = com.whatsapp.HomeActivity.A0c(r0)
            X.1bC r1 = r1.A0J(r0)
            X.00H r0 = r6.A1H
            java.lang.Object r0 = r0.get()
            X.1Nd r0 = (X.C25161Nd) r0
            java.util.HashSet r0 = r0.A0E()
            int r0 = r0.size()
            r1.A00 = r0
            java.util.List r2 = com.whatsapp.HomeActivity.A2Y
            r3 = 400(0x190, float:5.6E-43)
            boolean r0 = X.AnonymousClass3Ma.A1b(r2, r3)
            if (r0 == 0) goto L_0x0347
            X.1bB r1 = r6.A0b     // Catch:{ all -> 0x03a5 }
            int r0 = com.whatsapp.HomeActivity.A0c(r3)     // Catch:{ all -> 0x03a5 }
            X.1bC r3 = r1.A0J(r0)     // Catch:{ all -> 0x03a5 }
            X.00H r0 = r6.A1x     // Catch:{ all -> 0x03a5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03a5 }
            X.6x3 r0 = (X.C138426x3) r0     // Catch:{ all -> 0x03a5 }
            X.C138426x3.A00(r0)     // Catch:{ all -> 0x03a5 }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x03a5 }
            int r0 = r0.size()     // Catch:{ all -> 0x03a5 }
            if (r0 <= 0) goto L_0x032c
            X.00H r0 = r6.A1x     // Catch:{ all -> 0x03a5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03a5 }
            X.6x3 r0 = (X.C138426x3) r0     // Catch:{ all -> 0x03a5 }
            X.C138426x3.A00(r0)     // Catch:{ all -> 0x03a5 }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x03a5 }
            int r0 = r0.size()     // Catch:{ all -> 0x03a5 }
        L_0x0329:
            r3.A00 = r0     // Catch:{ all -> 0x03a5 }
            goto L_0x0347
        L_0x032c:
            X.00H r0 = r6.A1d     // Catch:{ all -> 0x03a5 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x03a5 }
            X.3Ao r1 = (X.C70313Ao) r1     // Catch:{ all -> 0x03a5 }
            X.C70313Ao.A02(r1)     // Catch:{ all -> 0x03a5 }
            X.2qZ r0 = r1.A01     // Catch:{ all -> 0x03a5 }
            if (r0 == 0) goto L_0x0344
            java.util.ArrayList r0 = r0.A01()     // Catch:{ all -> 0x03a5 }
        L_0x033f:
            int r0 = r0.size()     // Catch:{ all -> 0x03a5 }
            goto L_0x0329
        L_0x0344:
            java.util.List r0 = r1.A00     // Catch:{ all -> 0x03a5 }
            goto L_0x033f
        L_0x0347:
            r0 = 600(0x258, float:8.41E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x038c
            r7 = 600(0x258, float:8.41E-43)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x038c
            X.1bB r1 = r6.A0b
            int r0 = com.whatsapp.HomeActivity.A0c(r7)
            X.1bC r5 = r1.A0J(r0)
            X.1KB r1 = r6.A05
            java.lang.Runnable r0 = r6.A2O
            r1.A0I(r0)
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = "last_community_activity"
            long r3 = X.C17890vO.A05(r1, r0)
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r6)
            java.lang.String r0 = "last_seen_community_activity"
            long r1 = X.C17890vO.A05(r1, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0389
            int r1 = r6.A00
            r0 = 1
            if (r1 != r7) goto L_0x038a
        L_0x0389:
            r0 = 0
        L_0x038a:
            r5.A00 = r0
        L_0x038c:
            X.1KB r2 = r6.A05
            r1 = 12
            X.3Bt r0 = new X.3Bt
            r0.<init>(r6, r1)
            r2.A0J(r0)
            goto L_0x0013
        L_0x039a:
            java.lang.Object r0 = r8.A01
            X.1Nh r0 = (X.C25201Nh) r0
            boolean r0 = r0.A0S()
            return r0
        L_0x03a3:
            r0 = 0
            return r0
        L_0x03a5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75Y.handleMessage(android.os.Message):boolean");
    }
}
