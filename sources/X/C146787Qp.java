package X;

/* renamed from: X.7Qp  reason: invalid class name and case insensitive filesystem */
public class C146787Qp implements Runnable {
    public final int A00;
    public final Object A01;

    public C146787Qp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C146787Qp(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v34, types: [android.os.Handler, X.5de] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0342, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0355, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0358, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x035f, code lost:
        r2.performAccessibilityAction(64, (android.os.Bundle) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0365, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r2.notifyAllObservers(new X.AnonymousClass7KY(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0256, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0257, code lost:
        com.whatsapp.util.Log.e("voicenote/startvoicenote/startfailed", r1);
        X.AnonymousClass74M.A0D(r5, 4);
        r5.A0R = true;
        r4.CGP(new X.AnonymousClass7RD(r5, r3, 48));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x026d, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x01c7;
                case 1: goto L_0x01da;
                case 2: goto L_0x01e7;
                case 3: goto L_0x01ef;
                case 4: goto L_0x0274;
                case 5: goto L_0x028c;
                case 6: goto L_0x02a9;
                case 7: goto L_0x02b5;
                case 8: goto L_0x0016;
                case 9: goto L_0x02be;
                case 10: goto L_0x02be;
                case 11: goto L_0x02c8;
                case 12: goto L_0x02d2;
                case 13: goto L_0x02da;
                case 14: goto L_0x02e4;
                case 15: goto L_0x0303;
                case 16: goto L_0x0316;
                case 17: goto L_0x0076;
                case 18: goto L_0x0322;
                case 19: goto L_0x0332;
                case 20: goto L_0x033c;
                case 21: goto L_0x00b7;
                case 22: goto L_0x02da;
                case 23: goto L_0x0344;
                case 24: goto L_0x034d;
                case 25: goto L_0x0359;
                case 26: goto L_0x0366;
                case 27: goto L_0x0373;
                case 28: goto L_0x0386;
                case 29: goto L_0x00f5;
                case 30: goto L_0x03a1;
                case 31: goto L_0x03ae;
                case 32: goto L_0x03c7;
                case 33: goto L_0x0104;
                case 34: goto L_0x03d1;
                case 35: goto L_0x03e9;
                case 36: goto L_0x011d;
                case 37: goto L_0x011d;
                case 38: goto L_0x03f1;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x040e;
                case 43: goto L_0x0426;
                case 44: goto L_0x0436;
                case 45: goto L_0x0442;
                case 46: goto L_0x0144;
                case 47: goto L_0x0460;
                case 48: goto L_0x04e2;
                case 49: goto L_0x01b3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.2mM r0 = (X.C59472mM) r0
            X.2LJ r2 = r0.A01
            r1 = 27
        L_0x000d:
            X.7KY r0 = new X.7KY
            r0.<init>(r2, r1)
            r2.notifyAllObservers(r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r0 = r12.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.6tp r3 = r0.A1A
            r0 = 1
            r3.A04 = r0
            X.6dB r0 = r3.A07
            X.74M r0 = r0.A00
            X.1BI r1 = r0.A0C
            if (r1 == 0) goto L_0x0015
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 == 0) goto L_0x0047
            X.1L1 r1 = r3.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            java.lang.String r4 = "ptt_draft_review_broadcast"
        L_0x003c:
            long r2 = X.C17890vO.A05(r3, r4)
            r0 = 1
            long r2 = r2 + r0
            X.C17880vN.A1D(r5, r4, r2)
            return
        L_0x0047:
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x005d
            X.1L1 r1 = r3.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            java.lang.String r4 = "ptt_draft_review_group"
            goto L_0x003c
        L_0x005d:
            boolean r2 = X.C22971Dz.A0S(r1)
            X.1L1 r1 = r3.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            if (r2 == 0) goto L_0x0073
            java.lang.String r4 = "ptt_draft_review_interop"
            goto L_0x003c
        L_0x0073:
            java.lang.String r4 = "ptt_draft_review_individual"
            goto L_0x003c
        L_0x0076:
            java.lang.Object r1 = r12.A01
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            com.whatsapp.voipcalling.CallInfo r0 = r1.A1Y
            com.whatsapp.jid.UserJid r6 = r0.getPeerJid()
            java.lang.String r5 = r0.callId
            if (r6 == 0) goto L_0x0015
            X.118 r0 = r1.A1A
            android.content.Context r4 = r0.A00
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.bizintegrity.callpermission.BizCallbackActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "chat_jid"
            X.AnonymousClass3MY.A12(r2, r6, r0)
            java.lang.String r0 = "user_selected_reply_action"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "call_id"
            r2.putExtra(r0, r5)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/VoipActivityV2/startBizCallbackActivity "
            X.C17900vP.A0Y(r6, r0, r1)
            r4.startActivity(r2)
            return
        L_0x00b7:
            java.lang.Object r4 = r12.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            X.1Ty r1 = r4.A0V
            com.whatsapp.voipcalling.CallInfo r0 = r4.A1Y
            com.whatsapp.jid.UserJid r0 = r0.getPeerJid()
            X.AEW r2 = r1.A08(r0)
            X.1M9 r1 = r4.A12
            com.whatsapp.voipcalling.CallInfo r0 = r4.A1Y
            com.whatsapp.jid.UserJid r0 = r0.getPeerJid()
            X.1E7 r0 = r1.A0E(r0)
            boolean r0 = X.C40811vJ.A0L(r2, r0)
            if (r0 == 0) goto L_0x0015
            boolean r0 = r4.A2G
            if (r0 == 0) goto L_0x04ea
            X.00H r0 = r4.A1f
            java.lang.Object r3 = r0.get()
            X.9n3 r3 = (X.C191709n3) r3
            X.118 r0 = r4.A1A
            android.content.Context r2 = r0.A00
            com.whatsapp.voipcalling.CallInfo r0 = r4.A1Y
            com.whatsapp.jid.UserJid r1 = r0.getPeerJid()
            java.lang.String r0 = r0.callId
            r3.A00(r2, r1, r0)
            return
        L_0x00f5:
            java.lang.Object r1 = r12.A01
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment r1 = (com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment) r1
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0015
            r0 = 1
            r1.A07 = r0
            r1.A1M()
            return
        L_0x0104:
            java.lang.Object r3 = r12.A01
            X.721 r3 = (X.AnonymousClass721) r3
            r2 = 0
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0015
            X.1KB r1 = r3.A01
            r0 = 2131891800(0x7f121658, float:1.941833E38)
            r1.A07(r2, r0)
            X.1dk r1 = r3.A05
            java.lang.String r0 = "SEE_AL_LOAD_PROGRESS"
            r1.A04(r0)
            return
        L_0x011d:
            java.lang.Object r3 = r12.A01
            X.6Oc r3 = (X.C122196Oc) r3
            X.00H r2 = r3.A05
            java.lang.Object r0 = r2.get()
            X.1lZ r0 = (X.C35051lZ) r0
            android.content.SharedPreferences r1 = X.C35051lZ.A00(r0)
            java.lang.String r0 = "is_wfal_link_active"
            boolean r0 = X.C17880vN.A1W(r1, r0)
            if (r0 != 0) goto L_0x0015
            java.lang.Object r0 = r2.get()
            X.1lZ r0 = (X.C35051lZ) r0
            r0.A01()
            X.1la r2 = r3.A04
            r1 = 26
            goto L_0x000d
        L_0x0144:
            java.lang.Object r2 = r12.A01
            X.7Bz r2 = (X.C143097Bz) r2
            X.00H r3 = r2.A08
            java.lang.Object r1 = r3.get()
            com.whatsapp.bridge.wfal.WfalManager r1 = (com.whatsapp.bridge.wfal.WfalManager) r1
            r0 = 0
            boolean r0 = com.whatsapp.bridge.wfal.WfalManager.A00(r1, r0)
            if (r0 == 0) goto L_0x0015
            java.lang.Object r1 = r3.get()
            com.whatsapp.bridge.wfal.WfalManager r1 = (com.whatsapp.bridge.wfal.WfalManager) r1
            X.6Re r0 = X.C122646Re.FACEBOOK
            X.77e r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.Object r1 = r3.get()
            com.whatsapp.bridge.wfal.WfalManager r1 = (com.whatsapp.bridge.wfal.WfalManager) r1
            X.6Re r0 = X.C122646Re.INSTAGRAM
            X.77e r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0015
        L_0x0173:
            java.lang.String r0 = "CrosspostUnsentStatusManager/sendUnsentCrosspostStatus called"
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.6LN r0 = r2.A00
            X.C17890vO.A0t(r0)
            X.11P r5 = r2.A02
            X.00H r0 = r2.A05
            java.lang.Object r8 = X.C18070vi.A0E(r0)
            X.1W6 r8 = (X.AnonymousClass1W6) r8
            java.lang.Object r4 = X.C18070vi.A0E(r3)
            com.whatsapp.bridge.wfal.WfalManager r4 = (com.whatsapp.bridge.wfal.WfalManager) r4
            X.00H r0 = r2.A06
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.73E r6 = (X.AnonymousClass73E) r6
            X.00H r0 = r2.A04
            java.lang.Object r9 = X.C18070vi.A0E(r0)
            X.6zy r9 = (X.C140116zy) r9
            X.00H r0 = r2.A07
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.6ou r7 = (X.C133526ou) r7
            X.6LN r3 = new X.6LN
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.A00 = r3
            X.10I r0 = r2.A03
            X.AnonymousClass3MW.A1T(r3, r0, r1)
            return
        L_0x01b3:
            java.lang.Object r1 = r12.A01
            X.5eT r1 = (X.C109955eT) r1
            r0 = 0
            r1.setAnchorView(r0)
            X.86F r0 = r1.A05
            if (r0 == 0) goto L_0x0015
            X.7PC r0 = (X.AnonymousClass7PC) r0
            X.1bm r0 = r0.A00
            r0.CKb()
            return
        L_0x01c7:
            java.lang.Object r0 = r12.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.1FL r0 = r0.A0a
            if (r0 == 0) goto L_0x01d2
            r0.finishAffinity()
        L_0x01d2:
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x01da:
            java.lang.Object r0 = r12.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            android.os.PowerManager$WakeLock r2 = r0.A09
            r0 = 600000(0x927c0, double:2.964394E-318)
            r2.acquire(r0)
            return
        L_0x01e7:
            java.lang.Object r0 = r12.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.AnonymousClass74M.A03(r0)
            return
        L_0x01ef:
            java.lang.Object r5 = r12.A01
            X.74M r5 = (X.AnonymousClass74M) r5
            X.1KB r4 = r5.A0g
            X.1FR r3 = r5.A0e
            X.72K r7 = r5.A0J
            if (r7 == 0) goto L_0x026e
            java.lang.String r0 = "voicenote/startvoicenote/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r5.A1K
            int r0 = r1.get()
            if (r0 == 0) goto L_0x0212
            android.media.SoundPool r2 = X.AnonymousClass74M.A1i
            int r1 = r1.get()
            r0 = 0
            r2.setVolume(r1, r0, r0)
        L_0x0212:
            X.AnonymousClass74M.A0B(r5)     // Catch:{ Exception -> 0x0256 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0256 }
            r5.A07 = r0     // Catch:{ Exception -> 0x0256 }
            X.70F r2 = r5.A0w     // Catch:{ Exception -> 0x0256 }
            r2.A02 = r0     // Catch:{ Exception -> 0x0256 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0256 }
            r5.A06 = r0     // Catch:{ Exception -> 0x0256 }
            r0 = 0
            r5.A05 = r0     // Catch:{ Exception -> 0x0256 }
            android.os.Handler r1 = r5.A0U     // Catch:{ Exception -> 0x0256 }
            r0 = 0
            r1.sendEmptyMessage(r0)     // Catch:{ Exception -> 0x0256 }
            X.6So r6 = r5.A0c     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = "PushToTalkVoiceVisualizerHandler"
            android.os.HandlerThread r2 = new android.os.HandlerThread     // Catch:{ Exception -> 0x0256 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0256 }
            r2.start()     // Catch:{ Exception -> 0x0256 }
            android.os.Looper r0 = r2.getLooper()     // Catch:{ Exception -> 0x0256 }
            X.5de r1 = new X.5de     // Catch:{ Exception -> 0x0256 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0256 }
            r1.A00 = r2     // Catch:{ Exception -> 0x0256 }
            r1.A01 = r6     // Catch:{ Exception -> 0x0256 }
            r1.A02 = r7     // Catch:{ Exception -> 0x0256 }
            r5.A0F = r1     // Catch:{ Exception -> 0x0256 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0256 }
            r0 = 0
            r1.sendEmptyMessage(r0)     // Catch:{ all -> 0x0253 }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0256 }
            return
        L_0x0253:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0256 }
            throw r0     // Catch:{ Exception -> 0x0256 }
        L_0x0256:
            r1 = move-exception
            java.lang.String r0 = "voicenote/startvoicenote/startfailed"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 4
            X.AnonymousClass74M.A0D(r5, r0)
            r0 = 1
            r5.A0R = r0
            r1 = 48
            X.7RD r0 = new X.7RD
            r0.<init>(r5, r3, r1)
            r4.CGP(r0)
            return
        L_0x026e:
            java.lang.String r0 = "voicenote/startvoicenote/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0274:
            java.lang.Object r3 = r12.A01
            X.74M r3 = (X.AnonymousClass74M) r3
            X.72K r2 = r3.A0J
            r0 = 1
            r2.A02 = r0     // Catch:{ Exception -> 0x0285 }
            com.whatsapp.util.OpusRecorder r0 = X.AnonymousClass72K.A00(r2)     // Catch:{ Exception -> 0x0285 }
            r0.prepare()     // Catch:{ Exception -> 0x0285 }
            return
        L_0x0285:
            X.1KB r1 = r3.A0g
            r0 = 0
            X.AnonymousClass7RN.A01(r1, r3, r2, r0)
            return
        L_0x028c:
            java.lang.Object r3 = r12.A01
            X.74M r3 = (X.AnonymousClass74M) r3
            X.11C r0 = r3.A0m
            android.os.PowerManager r2 = r0.A0G()
            if (r2 != 0) goto L_0x029e
            java.lang.String r0 = "voicenoterecordingui pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x029e:
            r1 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = "voicenote"
            android.os.PowerManager$WakeLock r0 = X.C181789Rv.A00(r2, r0, r1)
            r3.A09 = r0
            return
        L_0x02a9:
            java.lang.Object r0 = r12.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.73X r1 = r0.A13
            X.1BI r0 = r0.A0C
            r1.A06(r0)
            return
        L_0x02b5:
            java.lang.Object r1 = r12.A01
            X.74M r1 = (X.AnonymousClass74M) r1
            r0 = 0
            r1.A0Y(r0, r0)
            return
        L_0x02be:
            java.lang.Object r0 = r12.A01
            X.72K r0 = (X.AnonymousClass72K) r0
            X.89T r0 = r0.A07
            r0.BIs()
            return
        L_0x02c8:
            java.lang.Object r0 = r12.A01
            X.72K r0 = (X.AnonymousClass72K) r0
            X.89T r0 = r0.A07
            r0.CMs()
            return
        L_0x02d2:
            java.lang.Object r0 = r12.A01
            com.whatsapp.voipcalling.JNIUtils r0 = (com.whatsapp.voipcalling.JNIUtils) r0
            r0.m35lambda$updateH26XCodecSupported$0$comwhatsappvoipcallingJNIUtils()
            return
        L_0x02da:
            java.lang.Object r0 = r12.A01
            X.1FP r0 = (X.AnonymousClass1FP) r0
            X.1Bd r0 = r0.A02
            r0.A03()
            return
        L_0x02e4:
            java.lang.Object r4 = r12.A01
            com.whatsapp.voipcalling.VoipActivityV2 r4 = (com.whatsapp.voipcalling.VoipActivityV2) r4
            com.whatsapp.calling.views.VoipContactPickerDialogFragment r3 = new com.whatsapp.calling.views.VoipContactPickerDialogFragment
            r3.<init>()
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r3.A02
            r4.A16 = r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            r4.A4i(r0)
            r2 = 0
            r0 = 1
            X.6za r1 = new X.6za
            r1.<init>(r0, r2)
            java.lang.String r0 = "VoipContactPickerDialogFragment"
            r4.A4g(r3, r1, r0)
            return
        L_0x0303:
            java.lang.Object r0 = r12.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.11C r0 = r0.A08
            android.os.Vibrator r2 = r0.A0H()
            X.C17960vV.A07(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.vibrate(r0)
            return
        L_0x0316:
            java.lang.Object r0 = r12.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            com.whatsapp.calling.screenshare.ScreenShareViewModel r1 = r0.A0t
            X.6Qx r0 = X.C122576Qx.BOTTOM_SHEET
            r1.A0T(r0)
            return
        L_0x0322:
            java.lang.Object r2 = r12.A01
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            android.widget.TextView r1 = r2.A0K
            r0 = 2131887857(0x7f1206f1, float:1.9410333E38)
            r1.setText(r0)
            com.whatsapp.voipcalling.VoipActivityV2.A1d(r2)
            return
        L_0x0332:
            java.lang.Object r0 = r12.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            android.view.ViewGroup r1 = r0.A0G
            X.C17960vV.A05(r1)
            goto L_0x0342
        L_0x033c:
            java.lang.Object r0 = r12.A01
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            android.view.ViewGroup r1 = r0.A0G
        L_0x0342:
            r0 = 4
            goto L_0x0355
        L_0x0344:
            java.lang.Object r0 = r12.A01
            X.6lg r0 = (X.C131796lg) r0
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            android.view.View r2 = r0.A0C
            goto L_0x035f
        L_0x034d:
            java.lang.Object r0 = r12.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r1 = r0.A0S
            r0 = 8
        L_0x0355:
            r1.setVisibility(r0)
            return
        L_0x0359:
            java.lang.Object r0 = r12.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r2 = r0.A0S
        L_0x035f:
            r1 = 0
            r0 = 64
            r2.performAccessibilityAction(r0, r1)
            return
        L_0x0366:
            java.lang.Object r0 = r12.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            X.73c r0 = r0.A0K
            r1 = 0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0G
            r0.A0b(r1)
            return
        L_0x0373:
            java.lang.Object r0 = r12.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            android.view.View r1 = r0.A09
            r0 = 2131436564(0x7f0b2414, float:1.8495002E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r1, r0)
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            return
        L_0x0386:
            java.lang.Object r2 = r12.A01
            X.BwM r2 = (X.C24156BwM) r2
            java.lang.Runnable r0 = r2.A04
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "Camera Delayed Start Op should not be null if calling delayedStartOnCameraThread"
            X.C17960vV.A0F(r1, r0)
            r0 = 0
            r2.A04 = r0
            java.lang.String r0 = "voip/video/VoipCamera/ Trying to start camera again after delay."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.startOnCameraThread()
            return
        L_0x03a1:
            java.lang.Object r1 = r12.A01
            X.6ln r1 = (X.C131866ln) r1
            r0 = 0
            java.util.ArrayList r0 = X.C17880vN.A0z(r0)
            r1.A00(r0)
            return
        L_0x03ae:
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            r2 = 0
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131891799(0x7f121657, float:1.9418328E38)
            r1.A0D(r0)
            r1.A0T(r2)
            X.C73203Rj.A06(r1)
            X.AnonymousClass3MY.A1G(r1)
            return
        L_0x03c7:
            java.lang.Object r0 = r12.A01
            X.721 r0 = (X.AnonymousClass721) r0
            X.1KB r0 = r0.A01
            r0.A04()
            return
        L_0x03d1:
            java.lang.Object r0 = r12.A01
            X.6jU r0 = (X.C130476jU) r0
            X.00H r0 = r0.A06
            java.lang.Object r0 = r0.get()
            com.whatsapp.bridge.wfal.WfalManager r0 = (com.whatsapp.bridge.wfal.WfalManager) r0
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.2iP r0 = (X.C57022iP) r0
            r0.A00()
            return
        L_0x03e9:
            java.lang.Object r0 = r12.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.isFinishing()
            return
        L_0x03f1:
            java.lang.Object r2 = r12.A01
            X.1dk r2 = (X.C30321dk) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WaffleClientAndBloksAcFlowLoggerImpl/OnAppBackgrounded: marker="
            r1.append(r0)
            r0 = 924663622(0x371d3f46, float:9.372661E-6)
            java.lang.String r0 = X.C24461Kk.A00(r0)
            X.C108995ce.A1O(r1, r0)
            java.lang.String r0 = "BACKGROUND_APP"
            r2.A04(r0)
            return
        L_0x040e:
            java.lang.Object r4 = r12.A01
            X.6jy r4 = (X.C130766jy) r4
            X.00H r0 = r4.A06
            java.lang.Object r3 = r0.get()
            X.1lY r3 = (X.C35041lY) r3
            X.1lW r2 = X.C35011lV.A00
            r1 = 0
            X.7Gk r0 = new X.7Gk
            r0.<init>(r4, r1)
            r3.A01(r2, r0)
            return
        L_0x0426:
            java.lang.Object r0 = r12.A01
            X.6jy r0 = (X.C130766jy) r0
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.7F6 r0 = (X.AnonymousClass7F6) r0
            r0.A00()
            return
        L_0x0436:
            java.lang.Object r1 = r12.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.run()
            return
        L_0x0442:
            java.lang.Object r0 = r12.A01
            X.7Bz r0 = (X.C143097Bz) r0
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.6ou r0 = (X.C133526ou) r0
            X.0vl r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.clear()
            java.lang.String r1 = "CrosspostUnsentStatusManager/onUnlink called, cleaned up unsent sessions"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            return
        L_0x0460:
            java.lang.Object r0 = r12.A01
            com.whatsapp.waffle.wfac.ui.WfacBanViewModel r0 = (com.whatsapp.waffle.wfac.ui.WfacBanViewModel) r0
            X.6n0 r2 = com.whatsapp.waffle.wfac.ui.WfacBanViewModel.A03(r0)
            X.6lk r3 = new X.6lk
            r3.<init>(r0)
            java.lang.String r0 = "WfacBanRepository/fetchBanStatus"
            X.C31081ez.A02(r0)
            X.00H r0 = r2.A02
            java.lang.Object r0 = r0.get()
            X.6wT r0 = (X.C138066wT) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "wfac_ban_status_token"
            java.lang.String r11 = X.C17880vN.A0r(r1, r0)
            if (r11 == 0) goto L_0x04dd
            X.00H r0 = r2.A00
            java.lang.Object r2 = r0.get()
            X.6fR r2 = (X.C128096fR) r2
            r1 = 1
            int r0 = r11.length()
            if (r0 == 0) goto L_0x04dd
            X.11E r0 = r2.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x04a3
            r3.A00(r1)
            return
        L_0x04a3:
            X.6aa r0 = r2.A00
            X.10F r0 = r0.A00
            X.10E r1 = r0.A00
            X.0ve r7 = X.AnonymousClass10E.A8r(r1)
            X.00S r0 = r1.ABB
            java.lang.Object r9 = r0.get()
            X.11W r9 = (X.AnonymousClass11W) r9
            X.181 r5 = X.C108965cb.A0H(r1)
            X.0z4 r6 = X.AnonymousClass3Ma.A0c(r1)
            X.00H r10 = X.C108945cZ.A14(r1)
            X.1fq r8 = X.C108955ca.A0X(r1)
            X.6OV r4 = new X.6OV
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = X.C22781De.A03()
            r0 = r0 ^ 1
            X.C17960vV.A0D(r0)
            r1 = 6
            X.7Hz r0 = new X.7Hz
            r0.<init>(r2, r3, r1)
            r4.CBv(r0)
            return
        L_0x04dd:
            r0 = 3
            r3.A00(r0)
            return
        L_0x04e2:
            java.lang.Object r0 = r12.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            com.whatsapp.wds.components.list.footer.WDSSectionFooter.setFooterTextWithLink$lambda$2(r0)
            return
        L_0x04ea:
            X.1KB r2 = r4.A05
            r1 = 17
            X.7Qp r0 = new X.7Qp
            r0.<init>(r4, r1)
            r2.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146787Qp.run():void");
    }
}
