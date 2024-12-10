package X;

/* renamed from: X.BXe  reason: case insensitive filesystem */
public class C22958BXe extends C24491C6j {
    public final int A00;
    public final Object A01;

    public C22958BXe(C26996DOs dOs, int i) {
        this.A00 = i;
        this.A01 = dOs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r6 = this;
            int r0 = r6.A00
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x006c
            java.lang.Object r3 = r6.A01
            X.DOs r3 = (X.C26996DOs) r3
            X.CuS r4 = r3.A0F
            X.BY7 r2 = X.BY7.A00
            int r1 = r2.A00
            r0 = 4
            if (r1 == r0) goto L_0x001c
            r0 = 7
            if (r1 == r0) goto L_0x00f1
            r0 = 10
            if (r1 != r0) goto L_0x001f
            X.BXl r2 = X.C22965BXl.A00
        L_0x001c:
            r4.A06(r2)
        L_0x001f:
            X.Cn1 r2 = X.C24712CGy.A01
            java.lang.String r1 = "sup:SUPDelegate"
            java.lang.String r0 = "MediaStreamStateListener:onStreamStarted"
            r2.A02(r1, r0)
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r3.A01
            r5 = 1
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r0.toConnected(r5)
            r3.A01 = r0
            X.0vk r0 = r4.A02
            java.lang.Object r1 = r0.invoke()
            X.CNl r1 = (X.C24867CNl) r1
            if (r1 == 0) goto L_0x0046
            boolean r0 = r1 instanceof X.BYB
            if (r0 == 0) goto L_0x0046
            X.BYB r0 = r4.A00
            if (r0 == 0) goto L_0x0046
            X.C26197CuS.A02(r4, r0, r1)
        L_0x0046:
            r3.CPZ(r5)
            java.lang.String r0 = "sup:SUPDelegate onGlassesActive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            r3.A08 = r1
            X.1HQ r0 = r3.A0G
            com.whatsapp.voipcalling.CallInfo r4 = r0.BO3()
            if (r4 == 0) goto L_0x006c
            X.A99 r0 = r3.A02
            if (r0 == 0) goto L_0x005e
            r1 = 1
        L_0x005e:
            java.lang.String r0 = "VoiceService is null"
            X.C17960vV.A0F(r1, r0)
            X.6qE r0 = r4.self
            if (r0 != 0) goto L_0x006d
            java.lang.String r0 = "sup:SUPDelegate onGlassesActive selfInfo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006c:
            return
        L_0x006d:
            int r1 = r0.A08
            if (r1 != 0) goto L_0x00be
            java.lang.String r0 = "sup:SUPDelegate onGlassesActive triggering a pocket start."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r2 = r3.A0I
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00f5
            r1 = 6624(0x19e0, float:9.282E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00f5
            boolean r0 = X.C26996DOs.A09(r4)
            if (r0 == 0) goto L_0x006c
            X.A99 r4 = r3.A02
            if (r4 == 0) goto L_0x006c
            r4.A0h()
            com.whatsapp.voipcalling.camera.VoipCameraManager r2 = r4.A34
            X.1VE r0 = r4.A2A
            java.lang.String r1 = r0.A03()
            X.1HQ r0 = r4.A29
            r2.setRequestedCamera2SupportLevel(r1, r0)
            android.os.Handler r0 = r4.A0H
            r3 = 23
            r0.removeMessages(r3)
            android.os.Handler r2 = r4.A0H
            r0 = 45000(0xafc8, double:2.2233E-319)
            r2.sendEmptyMessageDelayed(r3, r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r4.A1E
            r0 = 40
            X.7Pb r2 = new X.7Pb
            r2.<init>(r4, r0)
        L_0x00ba:
            r3.execute(r2)
            return
        L_0x00be:
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "sup:SUPDelegate onGlassesActive Video stopped. Turning back on."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = X.C26996DOs.A09(r4)
            if (r0 == 0) goto L_0x006c
            X.A99 r1 = r3.A02
            if (r1 == 0) goto L_0x006c
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r1.A1E
            r0 = 46
            X.7Pb r2 = new X.7Pb
            r2.<init>(r1, r0)
            goto L_0x00ba
        L_0x00de:
            java.lang.String r0 = "sup:SUPDelegate onGlassesActive Toggling to glasses."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.A99 r1 = r3.A02
            if (r1 == 0) goto L_0x006c
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r1.A1E
            r0 = 19
            X.7RK r2 = new X.7RK
            r2.<init>((int) r0, (java.lang.Object) r1, (boolean) r5)
            goto L_0x00ba
        L_0x00f1:
            X.BXy r2 = X.C22978BXy.A00
            goto L_0x001c
        L_0x00f5:
            java.lang.String r0 = "sup:SUPDelegate onGlassesActive Pocket start is not enabled."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22958BXe.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f2, code lost:
        if (r1 == 4) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01aa, code lost:
        if (r6.A07 == null) goto L_0x01ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C24425C3a r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 1: goto L_0x005e;
                case 2: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            X.BX6 r0 = X.BX6.A00
            boolean r0 = X.C18070vi.A18(r11, r0)
            java.lang.String r3 = "sup:SUPDelegate"
            if (r0 == 0) goto L_0x0023
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent SGDonned"
            r1.A02(r3, r0)
            java.lang.Object r0 = r10.A01
            X.DOs r0 = (X.C26996DOs) r0
            X.CuS r1 = r0.A0F
            X.BY4 r0 = X.BY4.A00
        L_0x001f:
            r1.A06(r0)
            return
        L_0x0023:
            X.BX5 r0 = X.BX5.A00
            boolean r0 = X.C18070vi.A18(r11, r0)
            if (r0 == 0) goto L_0x0041
            java.lang.Object r2 = r10.A01
            X.DOs r2 = (X.C26996DOs) r2
            boolean r0 = r2.Be0()
            if (r0 == 0) goto L_0x0005
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent SGDoffedImmediate"
            r1.A02(r3, r0)
            X.CuS r1 = r2.A0F
            X.BXp r0 = X.C22969BXp.A00
            goto L_0x001f
        L_0x0041:
            X.BX4 r0 = X.BX4.A00
            boolean r0 = X.C18070vi.A18(r11, r0)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r2 = r10.A01
            X.DOs r2 = (X.C26996DOs) r2
            boolean r0 = r2.Be0()
            if (r0 == 0) goto L_0x0005
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent SGDoffErrorDuringStream"
            r1.A02(r3, r0)
            X.C26996DOs.A02(r2)
            return
        L_0x005e:
            r5 = 0
            X.BX2 r0 = X.BX2.A00
            boolean r0 = X.C18070vi.A18(r11, r0)
            java.lang.String r4 = "sup:SUPDelegate"
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r2 = r10.A01
            X.DOs r2 = (X.C26996DOs) r2
            X.118 r0 = r2.A0H
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = X.C19740yt.A01(r1, r0)
            X.Cn1 r3 = X.C24712CGy.A01
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent RequestSGCameraOn: Permission not granted"
            r3.A02(r4, r0)
            X.CvH r1 = r2.A0E
            java.lang.Integer r0 = X.AnonymousClass00R.A0I
            r1.A0D(r0)
            return
        L_0x0088:
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent RequestSGCameraOn"
            r3.A02(r4, r0)
            com.facebook.wearable.mediastream.model.SUPToggleState r4 = r2.A01
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            r5 = 0
            r7 = r5
            r9 = r5
            r6 = r5
            com.facebook.wearable.mediastream.model.SUPToggleState r0 = r4.getUpdatedStatusIndicatorAttributes(r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x009f
            r2.A01 = r0
        L_0x009f:
            X.ChS r1 = r2.A03
            X.E8l r0 = r1.A00
            if (r0 == 0) goto L_0x00aa
            X.DDo r0 = (X.C26782DDo) r0
            r0.BIY()
        L_0x00aa:
            X.C25530ChS.A00(r1)
            X.CvH r5 = r2.A0E
            android.view.Surface r6 = r2.A00
            java.lang.String r0 = "msc:start"
            java.lang.String r4 = "sup:MediaStreamController"
            r3.A01(r4, r0)
            boolean r0 = r5.A0M
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = "msc, connecting, returning"
        L_0x00be:
            r3.A01(r4, r0)
        L_0x00c1:
            r0 = 1
            r2.A08 = r0
            X.A99 r3 = r2.A02
            if (r3 == 0) goto L_0x0005
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.A1E
            r1 = 42
            X.7Pb r0 = new X.7Pb
            r0.<init>(r3, r1)
            r2.execute(r0)
            return
        L_0x00d5:
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "msc, not connected, returning"
            goto L_0x00be
        L_0x00dc:
            boolean r0 = r5.A0P
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "msc, already streaming, returning"
            goto L_0x00be
        L_0x00e3:
            X.Cms r8 = r5.A0H
            if (r8 == 0) goto L_0x0180
            r0 = 1
            r8.A02(r0)
            int r1 = r5.A00
            r0 = 2
            if (r1 == r0) goto L_0x00f4
            r0 = 4
            r7 = 0
            if (r1 != r0) goto L_0x00f5
        L_0x00f4:
            r7 = 1
        L_0x00f5:
            boolean r0 = r5.A0O
            java.lang.String r1 = java.lang.String.valueOf(r0)
            if (r7 == 0) goto L_0x0120
            java.lang.String r0 = "is_in_call"
            r8.A04(r0, r1)
            X.CmZ r7 = X.C25822CmZ.A0B
            java.lang.String r1 = r7.A01()
            java.lang.String r0 = "app_call_session_id"
        L_0x010a:
            r8.A04(r0, r1)
            java.lang.String r1 = r7.A00()
            if (r1 == 0) goto L_0x011a
            java.lang.String r0 = "app_cold_start_session_id"
            r8.A04(r0, r1)
        L_0x0118:
            monitor-enter(r7)
            goto L_0x012e
        L_0x011a:
            java.lang.String r0 = "COLD_START_SESSION_ID_NULL"
            X.C26226CvH.A02(r5, r0)
            goto L_0x0118
        L_0x0120:
            java.lang.String r0 = "is_live"
            r8.A04(r0, r1)
            X.CmZ r7 = X.C25822CmZ.A0B
            java.lang.String r1 = r7.A01()
            java.lang.String r0 = "app_stream_session_id"
            goto L_0x010a
        L_0x012e:
            java.lang.String r1 = X.C108985cd.A0f()     // Catch:{ all -> 0x01ed }
            X.C25822CmZ.A09 = r1     // Catch:{ all -> 0x01ed }
            monitor-exit(r7)
            java.lang.String r0 = "app_warm_start_session_id"
            r8.A04(r0, r1)
            monitor-enter(r7)
            int r1 = X.C25822CmZ.A00     // Catch:{ all -> 0x01ed }
            int r0 = r1 + 1
            X.C25822CmZ.A00 = r0     // Catch:{ all -> 0x01ed }
            monitor-exit(r7)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "app_warm_start_sequence_id"
            r8.A04(r0, r1)
            java.lang.Integer r0 = r5.A0I
            java.lang.String r1 = X.C24592CAn.A00(r0)
            java.lang.String r0 = "streaming_protocol"
            X.C26226CvH.A01(r5, r8, r0, r1)
            java.lang.String r1 = X.C24459C4z.A01
            if (r1 == 0) goto L_0x01e6
            java.lang.String r0 = "device_type"
            r8.A04(r0, r1)
        L_0x015f:
            java.lang.String r1 = X.C24459C4z.A03
            if (r1 == 0) goto L_0x01e0
            java.lang.String r0 = "device_build_type"
            r8.A04(r0, r1)
        L_0x0168:
            java.lang.String r1 = X.C24459C4z.A02
            if (r1 == 0) goto L_0x01da
            java.lang.String r0 = "soc_version"
            r8.A04(r0, r1)
        L_0x0171:
            java.lang.String r1 = X.C24459C4z.A00
            if (r1 == 0) goto L_0x01d4
            java.lang.String r0 = "build_flavor"
            r8.A04(r0, r1)
        L_0x017a:
            r0 = 0
            r8.A00 = r0
            r7.A03(r0)
        L_0x0180:
            java.lang.String r0 = "Activating video codec"
            r3.A01(r4, r0)
            X.CrL r1 = r5.A05()
            r1.A05(r6)
            X.DpD r0 = new X.DpD
            r0.<init>(r5)
            r1.A08(r0)
            X.DhL r0 = new X.DhL
            r0.<init>(r5)
            r1.A07(r0)
            r1.A04()
            X.Cj5 r6 = r5.A09
            if (r6 == 0) goto L_0x01b6
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x01ac
            X.1OB r1 = r6.A07
            r0 = 1
            if (r1 != 0) goto L_0x01ad
        L_0x01ac:
            r0 = 0
        L_0x01ad:
            java.lang.String r1 = "sup:FrameRateAdaptiveVideoConfigHandler"
            if (r0 == 0) goto L_0x01c8
            java.lang.String r0 = "Handler already running, return"
            r3.A01(r1, r0)
        L_0x01b6:
            java.lang.String r0 = "msc, asking client to start stream"
            r3.A01(r4, r0)
            X.CTk r0 = r5.A04()
            X.BQm r1 = r0.A00
            X.BXa r0 = X.C22954BXa.A00
            r1.A04(r0)
            goto L_0x00c1
        L_0x01c8:
            java.lang.String r0 = "Starting throughput monitor"
            r3.A01(r1, r0)
            r0 = 1
            r6.A08 = r0
            X.C25625Cj5.A00(r6)
            goto L_0x01b6
        L_0x01d4:
            java.lang.String r0 = "BUILD_FLAVOR_NULL"
            X.C26226CvH.A02(r5, r0)
            goto L_0x017a
        L_0x01da:
            java.lang.String r0 = "SOC_VERSION_NULL"
            X.C26226CvH.A02(r5, r0)
            goto L_0x0171
        L_0x01e0:
            java.lang.String r0 = "DEVICE_BUILD_TYPE_NULL"
            X.C26226CvH.A02(r5, r0)
            goto L_0x0168
        L_0x01e6:
            java.lang.String r0 = "DEVICE_TYPE_NULL"
            X.C26226CvH.A02(r5, r0)
            goto L_0x015f
        L_0x01ed:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x01f0:
            X.BX1 r0 = X.BX1.A00
            boolean r0 = X.C18070vi.A18(r11, r0)
            if (r0 != 0) goto L_0x0206
            X.BX7 r0 = X.BX7.A00
            boolean r0 = X.C18070vi.A18(r11, r0)
            if (r0 != 0) goto L_0x0206
            X.BXB r0 = X.BXB.A00
            X.C18070vi.A18(r11, r0)
            return
        L_0x0206:
            X.Cn1 r1 = X.C24712CGy.A01
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent RequestPhoneCameraOn"
            r1.A02(r4, r0)
            java.lang.Object r2 = r10.A01
            X.DOs r2 = (X.C26996DOs) r2
            X.ChS r1 = r2.A03
            X.E8l r0 = r1.A00
            if (r0 == 0) goto L_0x021c
            X.DDo r0 = (X.C26782DDo) r0
            r0.BIY()
        L_0x021c:
            X.C25530ChS.A00(r1)
            r2.Byg()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22958BXe.A04(X.C3a):void");
    }
}
