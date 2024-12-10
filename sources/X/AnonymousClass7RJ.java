package X;

/* renamed from: X.7RJ  reason: invalid class name */
public class AnonymousClass7RJ implements Runnable {
    public final int A00;
    public final Object A01;

    public AnonymousClass7RJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1KB r1, Object obj, int i) {
        r1.A0J(new AnonymousClass7RJ(obj, i));
    }

    public static void A01(AnonymousClass1KB r1, Object obj, int i) {
        r1.CGP(new AnonymousClass7RJ(obj, i));
    }

    public static void A02(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new AnonymousClass7RJ(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v24, types: [android.os.Handler, X.5de] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0637, code lost:
        r0.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x063a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r1.BwB(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r81 = this;
            r1 = r81
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0791;
                case 1: goto L_0x03e5;
                case 2: goto L_0x0784;
                case 3: goto L_0x0776;
                case 4: goto L_0x0743;
                case 5: goto L_0x0735;
                case 6: goto L_0x072d;
                case 7: goto L_0x0723;
                case 8: goto L_0x064b;
                case 9: goto L_0x0643;
                case 10: goto L_0x063b;
                case 11: goto L_0x03c8;
                case 12: goto L_0x062e;
                case 13: goto L_0x0624;
                case 14: goto L_0x0624;
                case 15: goto L_0x061c;
                case 16: goto L_0x03b4;
                case 17: goto L_0x05a2;
                case 18: goto L_0x059a;
                case 19: goto L_0x058f;
                case 20: goto L_0x057d;
                case 21: goto L_0x0379;
                case 22: goto L_0x0335;
                case 23: goto L_0x0310;
                case 24: goto L_0x0564;
                case 25: goto L_0x0007;
                case 26: goto L_0x0007;
                case 27: goto L_0x0007;
                case 28: goto L_0x02f3;
                case 29: goto L_0x0007;
                case 30: goto L_0x02e6;
                case 31: goto L_0x055e;
                case 32: goto L_0x0556;
                case 33: goto L_0x0541;
                case 34: goto L_0x02d3;
                case 35: goto L_0x02c0;
                case 36: goto L_0x0539;
                case 37: goto L_0x04d0;
                case 38: goto L_0x04be;
                case 39: goto L_0x04b6;
                case 40: goto L_0x0135;
                case 41: goto L_0x04a7;
                case 42: goto L_0x00c2;
                case 43: goto L_0x0069;
                case 44: goto L_0x002a;
                case 45: goto L_0x049f;
                case 46: goto L_0x041f;
                case 47: goto L_0x0016;
                case 48: goto L_0x0402;
                case 49: goto L_0x03f4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.7B9 r0 = (X.AnonymousClass7B9) r0
            X.6Mr r0 = r0.A00
            X.88N r1 = r0.A06
            if (r1 == 0) goto L_0x0015
            r0 = 0
        L_0x0012:
            r1.BwB(r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r1 = r1.A01
            X.74M r1 = (X.AnonymousClass74M) r1
            android.os.PowerManager$WakeLock r0 = r1.A09
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x0015
            android.os.PowerManager$WakeLock r0 = r1.A09
            r0.release()
            return
        L_0x002a:
            java.lang.Object r0 = r1.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.1BI r6 = r0.A0C
            if (r6 == 0) goto L_0x0015
            X.73X r5 = r0.A13
            java.lang.Boolean r0 = X.C17960vV.A01
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r1 = X.AnonymousClass73X.A02(r6, r5)
            r4 = 1
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.exists()
            if (r0 != r4) goto L_0x004a
            r1.setLastModified(r2)
        L_0x004a:
            java.io.File r1 = X.AnonymousClass73X.A01(r6, r5)
            if (r1 == 0) goto L_0x0059
            boolean r0 = r1.exists()
            if (r0 != r4) goto L_0x0059
            r1.setLastModified(r2)
        L_0x0059:
            java.io.File r1 = X.AnonymousClass73X.A00(r6, r5)
            if (r1 == 0) goto L_0x0015
            boolean r0 = r1.exists()
            if (r0 != r4) goto L_0x0015
            r1.setLastModified(r2)
            return
        L_0x0069:
            java.lang.Object r4 = r1.A01
            X.6tp r4 = (X.C136446tp) r4
            long r2 = r4.A01
            r0 = 1
            long r2 = r2 + r0
            r4.A01 = r2
            X.6dB r0 = r4.A07
            X.74M r0 = r0.A00
            X.1BI r1 = r0.A0C
            if (r1 == 0) goto L_0x0015
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 == 0) goto L_0x0093
            X.1L1 r1 = r4.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            java.lang.String r4 = "ptt_playback_broadcast"
            goto L_0x0126
        L_0x0093:
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x00a9
            X.1L1 r1 = r4.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            java.lang.String r4 = "ptt_playback_group"
            goto L_0x0126
        L_0x00a9:
            boolean r2 = X.C22971Dz.A0S(r1)
            X.1L1 r1 = r4.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            if (r2 == 0) goto L_0x00bf
            java.lang.String r4 = "ptt_playback_interop"
            goto L_0x0126
        L_0x00bf:
            java.lang.String r4 = "ptt_playback_individual"
            goto L_0x0126
        L_0x00c2:
            java.lang.Object r4 = r1.A01
            X.6tp r4 = (X.C136446tp) r4
            X.6dB r0 = r4.A07
            X.74M r0 = r0.A00
            X.1BI r3 = r0.A0C
            long r1 = r4.A00
            r5 = 1
            long r1 = r1 + r5
            r4.A00 = r1
            if (r3 == 0) goto L_0x0015
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            boolean r0 = X.C22971Dz.A0N(r3)
            if (r0 == 0) goto L_0x00fb
            X.1L1 r1 = r4.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r4 = r1.A00
            android.content.SharedPreferences$Editor r3 = X.C108985cd.A0C(r4, r0, r1)
            java.lang.String r2 = "ptt_pause_tap_broadcast"
        L_0x00ee:
            long r0 = X.C17890vO.A05(r4, r2)
            long r0 = r0 + r5
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)
        L_0x00f7:
            r0.apply()
            return
        L_0x00fb:
            boolean r0 = X.C22971Dz.A0e(r3)
            if (r0 == 0) goto L_0x0111
            X.1L1 r1 = r4.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r4 = r1.A00
            android.content.SharedPreferences$Editor r3 = X.C108985cd.A0C(r4, r0, r1)
            java.lang.String r2 = "ptt_pause_tap_group"
            goto L_0x00ee
        L_0x0111:
            boolean r2 = X.C22971Dz.A0S(r3)
            X.1L1 r1 = r4.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            if (r2 == 0) goto L_0x0132
            java.lang.String r4 = "ptt_pause_tap_interop"
        L_0x0126:
            long r2 = X.C17890vO.A05(r3, r4)
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r0 = r5.putLong(r4, r2)
            goto L_0x00f7
        L_0x0132:
            java.lang.String r4 = "ptt_pause_tap_individual"
            goto L_0x0126
        L_0x0135:
            java.lang.Object r3 = r1.A01
            X.74M r3 = (X.AnonymousClass74M) r3
            X.19r r2 = r3.A0p
            java.lang.String r1 = "VoiceNoteRecording"
            java.lang.String r0 = "Resume"
            r2.A02(r1, r0)
            android.view.View r0 = r3.A0V
            r0.clearFocus()
            r7 = 0
            r0.setFocusable(r7)
            X.1f4 r0 = r3.A0j
            r0.A04()
            boolean r0 = r3.A1N
            if (r0 == 0) goto L_0x0159
            X.1FL r0 = r3.A0a
            X.AnonymousClass6Y1.A00(r0)
        L_0x0159:
            android.os.PowerManager$WakeLock r1 = r3.A09
            if (r1 == 0) goto L_0x0167
            boolean r0 = r3.A1L
            if (r0 == 0) goto L_0x02bb
            X.10I r1 = r3.A12
            r0 = 1
            X.C146787Qp.A00(r1, r3, r0)
        L_0x0167:
            X.6uN r0 = r3.A0y
            r0.A02()
            X.3V4 r0 = r3.A0k
            r0.A0T()
            X.11C r0 = r3.A0m
            X.C84094Hv.A00(r0)
            X.00H r0 = r3.A1H
            java.lang.Object r2 = r0.get()
            X.10s r2 = (X.C200710s) r2
            android.media.SoundPool r9 = X.AnonymousClass74M.A1i
            int r13 = X.AnonymousClass74M.A1j
            r1 = 6
            X.7S6 r0 = new X.7S6
            r0.<init>(r3, r1)
            r11 = 1065353216(0x3f800000, float:1.0)
            X.C18070vi.A0d(r9, r7)
            java.lang.ref.WeakReference r10 = X.AnonymousClass3MW.A0z(r0)
            X.7Pz r8 = new X.7Pz
            r12 = r11
            r8.<init>(r9, r10, r11, r12, r13)
            r2.execute(r8)
            X.6jS r8 = r3.A1C
            android.view.View r2 = r8.A04
            r0 = 2131436864(0x7f0b2540, float:1.849561E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0G(r2, r0)
            r0 = 2131232103(0x7f080567, float:1.8080306E38)
            r1.setImageResource(r0)
            r0 = 2131436867(0x7f0b2543, float:1.8495617E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0G(r2, r0)
            r0 = 2131232869(0x7f080865, float:1.808186E38)
            r1.setImageResource(r0)
            r0 = 2131436866(0x7f0b2542, float:1.8495615E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0G(r2, r0)
            r0 = 2131232868(0x7f080864, float:1.8081857E38)
            r1.setImageResource(r0)
            android.widget.TextView r1 = r8.A02
            X.0vb r6 = r8.A06
            r4 = 0
            r2 = 0
            java.lang.String r0 = X.C64052u8.A0D(r6, r2, r4)
            r1.setText(r0)
            r1.setVisibility(r7)
            android.widget.TextView r1 = r8.A03
            java.lang.String r0 = X.C64052u8.A0D(r6, r2, r4)
            r1.setText(r0)
            r3.A02 = r7
            r3.A03 = r7
            X.7OH r4 = r3.A15
            java.util.List r0 = r4.A0M
            r0.clear()
            r3.A00 = r7
            X.6So r6 = r3.A0b
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            java.util.concurrent.atomic.AtomicLong r2 = r6.A00
            r2.set(r0)
            android.view.View r8 = r3.A0Y
            r0 = 2131436900(0x7f0b2564, float:1.8495683E38)
            android.view.View r2 = r8.findViewById(r0)
            r2.setVisibility(r7)
            android.animation.ObjectAnimator r0 = r3.A08
            if (r0 != 0) goto L_0x0231
            r5 = 2
            float[] r1 = new float[r5]
            r1 = {0, 1065353216} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r2, r0, r1)
            r3.A08 = r1
            X.74W r0 = new X.74W
            r0.<init>(r6)
            r1.setInterpolator(r0)
            android.animation.ObjectAnimator r2 = r3.A08
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            android.animation.ObjectAnimator r0 = r3.A08
            r0.setRepeatMode(r5)
            android.animation.ObjectAnimator r1 = r3.A08
            r0 = -1
            r1.setRepeatCount(r0)
        L_0x0231:
            android.animation.ObjectAnimator r0 = r3.A08
            r0.start()
            r0 = 2131428625(0x7f0b0511, float:1.84789E38)
            android.view.View r1 = r8.findViewById(r0)
            r0 = 4
            r1.setVisibility(r0)
            r0 = 2131431654(0x7f0b10e6, float:1.8485043E38)
            android.view.View r2 = r8.findViewById(r0)
            r2.clearAnimation()
            r0 = 0
            android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
            r1.<init>(r11, r0)
            r5 = 160(0xa0, double:7.9E-322)
            r1.setDuration(r5)
            r0 = 1
            r1.setFillBefore(r0)
            r1.setFillAfter(r0)
            r2.startAnimation(r1)
            r0 = 2131436920(0x7f0b2578, float:1.8495724E38)
            X.AnonymousClass3MY.A1B(r8, r0, r7)
            r2.setFocusable(r7)
            r0 = 4
            r2.setImportantForAccessibility(r0)
            boolean r0 = r3.A1L
            if (r0 == 0) goto L_0x02b7
            X.10I r1 = r3.A12
            r0 = 2
            X.C146787Qp.A00(r1, r3, r0)
        L_0x0277:
            X.6fL r0 = r3.A1E
            X.10s r2 = r0.A00
            r2.A03()
            r1 = 3
            X.7Qp r0 = new X.7Qp
            r0.<init>(r3, r1)
            r2.A05(r0, r5)
            r3.A0Q = r7
            android.view.View r0 = r4.A01
            r0.setActivated(r7)
            X.70F r2 = r3.A0w
            long r0 = r3.A07
            r2.A02 = r0
            r0 = 1
            r2.A09 = r0
            android.widget.ImageView r1 = r2.A0O
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto L_0x02ad
            X.AnonymousClass70F.A00(r2)
        L_0x02a2:
            boolean r0 = r3.A1M
            if (r0 == 0) goto L_0x0015
            r0 = 2131232163(0x7f0805a3, float:1.8080427E38)
            r4.A03(r0)
            return
        L_0x02ad:
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r0 = 17
            X.AnonymousClass793.A00(r1, r2, r0)
            goto L_0x02a2
        L_0x02b7:
            X.AnonymousClass74M.A03(r3)
            goto L_0x0277
        L_0x02bb:
            r1.acquire()
            goto L_0x0167
        L_0x02c0:
            java.lang.Object r3 = r1.A01
            X.7B1 r3 = (X.AnonymousClass7B1) r3
            r2 = 0
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0015
            X.11E r1 = r3.A05
            X.11J r0 = r3.A04
            r1.unregisterObserver(r0)
            r3.A01 = r2
            return
        L_0x02d3:
            java.lang.Object r2 = r1.A01
            X.7B1 r2 = (X.AnonymousClass7B1) r2
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0015
            X.11E r1 = r2.A05
            X.11J r0 = r2.A04
            r1.registerObserver(r0)
            r0 = 1
            r2.A01 = r0
            return
        L_0x02e6:
            java.lang.Object r0 = r1.A01
            X.7B9 r0 = (X.AnonymousClass7B9) r0
            X.6Mr r0 = r0.A00
            X.88N r1 = r0.A06
            if (r1 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0012
        L_0x02f3:
            java.lang.Object r0 = r1.A01
            X.7B9 r0 = (X.AnonymousClass7B9) r0
            X.6Mr r2 = r0.A00
            r1 = 1
            r2.A0E = r1
            r2.A0H = r1
            r0 = 0
            r2.A0J = r0
            X.88T r0 = r2.A0A
            if (r0 == 0) goto L_0x0308
            r0.CA3()
        L_0x0308:
            X.88N r0 = r2.A06
            if (r0 == 0) goto L_0x0015
            r0.BwB(r1)
            return
        L_0x0310:
            java.lang.Object r1 = r1.A01
            X.70X r1 = (X.AnonymousClass70X) r1
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0015
            X.11C r0 = r1.A05
            X.C17960vV.A07(r0)
            android.media.AudioManager r3 = r0.A0D()
            if (r3 == 0) goto L_0x0015
            android.media.AudioManager$OnAudioFocusChangeListener r2 = r1.A03
            if (r2 != 0) goto L_0x032f
            r0 = 3
            X.75N r2 = new X.75N
            r2.<init>(r0)
            r1.A03 = r2
        L_0x032f:
            r1 = 3
            r0 = 2
            r3.requestAudioFocus(r2, r1, r0)
            return
        L_0x0335:
            java.lang.Object r4 = r1.A01
            X.6Mr r4 = (X.C122076Mr) r4
            X.Cye r5 = r4.A06
            if (r5 == 0) goto L_0x0015
            X.6ra r0 = r4.A09
            if (r0 == 0) goto L_0x0344
            r0.A00()
        L_0x0344:
            boolean r0 = r4.A0F
            r0 = r0 ^ 1
            android.os.Handler r3 = r5.A0C
            r1 = 47
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C108955ca.A1F(r3, r0, r1)
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x036e
            boolean r1 = r4.A0D
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2[r0] = r1
            java.lang.String r0 = "setLooping: %s"
            X.C26378Cye.A06(r5, r0, r2)
            r0 = 19
            X.C108955ca.A1F(r3, r1, r0)
        L_0x036e:
            r5.A0C()
            X.10I r1 = r4.A0Z
            r0 = 23
            A02(r1, r4, r0)
            return
        L_0x0379:
            java.lang.Object r4 = r1.A01
            X.6Mr r4 = (X.C122076Mr) r4
            X.88S r2 = r4.A0B
            if (r2 == 0) goto L_0x0386
            r1 = 0
            r0 = 1
            r2.C0q(r1, r0)
        L_0x0386:
            X.6Mw r3 = r4.A0a
            X.6ph r0 = r3.A01
            if (r0 == 0) goto L_0x038f
            r0.A00()
        L_0x038f:
            X.0ve r2 = r3.A09
            r1 = 9716(0x25f4, float:1.3615E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 0
            if (r0 == 0) goto L_0x039e
            r3.A01 = r1
        L_0x039e:
            r3.A00 = r1
            X.6Mj r0 = r4.A0C
            if (r0 == 0) goto L_0x0015
            r0.setPlayer(r1)
            X.6Mj r1 = r4.A0C
            java.lang.Runnable r0 = r1.A0J
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.A0K
            r1.removeCallbacks(r0)
            return
        L_0x03b4:
            java.lang.Object r1 = r1.A01
            X.COg r1 = (X.C24888COg) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0015
            X.BwF r1 = r1.A01
            r0 = 1
            r1.A0R = r0
            android.os.Handler r1 = r1.A0V
            r0 = 0
            r1.sendEmptyMessage(r0)
            return
        L_0x03c8:
            java.lang.Object r0 = r1.A01
            X.BLA r0 = (X.BLA) r0
            X.BIe r2 = r0.A00
            android.view.View r1 = r2.A0F
            if (r1 == 0) goto L_0x0015
            android.view.View r0 = r2.A0D
            if (r0 != r1) goto L_0x0015
            X.E2v r1 = r2.A0H
            if (r1 == 0) goto L_0x0015
            r0 = 0
            r2.A0F = r0
            X.DQx r1 = (X.C27052DQx) r1
            X.DR0 r0 = r1.A00
            r0.BF9()
            return
        L_0x03e5:
            java.lang.Object r1 = r1.A01
            X.1Vg r1 = (X.C27231Vg) r1
            X.70T r0 = r1.A01
            if (r0 == 0) goto L_0x0015
            r0.A06()
            r0 = 0
            r1.A01 = r0
            return
        L_0x03f4:
            java.lang.Object r0 = r1.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.190 r3 = r0.A0d
            r2 = 0
            r1 = 1
            java.lang.String r0 = "VoiceNoteRecordingUI/logCriticalErrorForVoiceNoteReleaseIfNeeded"
            r3.A0G(r0, r2, r1)
            return
        L_0x0402:
            java.lang.Object r4 = r1.A01
            X.74M r4 = (X.AnonymousClass74M) r4
            X.AnonymousClass74M.A0B(r4)     // Catch:{ IOException -> 0x0411 }
            X.1KB r1 = r4.A0g     // Catch:{ IOException -> 0x0411 }
            r0 = 46
            A01(r1, r4, r0)     // Catch:{ IOException -> 0x0411 }
            return
        L_0x0411:
            r3 = move-exception
            X.1KB r2 = r4.A0g
            r1 = 49
            X.7RD r0 = new X.7RD
            r0.<init>(r4, r3, r1)
            r2.CGP(r0)
            return
        L_0x041f:
            java.lang.Object r6 = r1.A01
            X.74M r6 = (X.AnonymousClass74M) r6
            boolean r0 = r6.A1N
            if (r0 == 0) goto L_0x042c
            X.1FL r0 = r6.A0a
            X.AnonymousClass6Y1.A00(r0)
        L_0x042c:
            X.16P r0 = r6.A1G
            r4 = 1
            r0.A00 = r4
            X.7OH r3 = r6.A15
            android.view.animation.AlphaAnimation r2 = X.C108985cd.A0H()
            r0 = 150(0x96, double:7.4E-322)
            r2.setDuration(r0)
            r0 = 20
            X.C114545r0.A00(r2, r3, r0)
            X.1bI r0 = r3.A0K
            android.view.View r0 = r0.A02()
            r0.startAnimation(r2)
            r5 = 0
            android.view.animation.AnimationSet r2 = X.AnonymousClass6Y2.A00(r5)
            android.view.animation.AnimationSet r1 = X.AnonymousClass6Y2.A00(r4)
            X.5qz r0 = new X.5qz
            r0.<init>(r1, r3, r5)
            r2.setAnimationListener(r0)
            r0 = 17
            X.C114545r0.A00(r1, r3, r0)
            android.view.View r0 = r3.A0B
            r0.startAnimation(r2)
            X.72K r4 = r6.A0J
            if (r4 == 0) goto L_0x048f
            X.6So r3 = r6.A0c
            java.lang.String r0 = "PushToTalkVoiceVisualizerHandler"
            android.os.HandlerThread r2 = new android.os.HandlerThread
            r2.<init>(r0)
            r2.start()
            android.os.Looper r0 = r2.getLooper()
            X.5de r1 = new X.5de
            r1.<init>(r0)
            r1.A00 = r2
            r1.A01 = r3
            r1.A02 = r4
            r6.A0F = r1
            monitor-enter(r1)
            r1.sendEmptyMessage(r5)     // Catch:{ all -> 0x048b }
            goto L_0x048e
        L_0x048b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x048e:
            monitor-exit(r1)
        L_0x048f:
            android.os.Handler r0 = r6.A0U
            r0.sendEmptyMessage(r5)
            X.1FL r2 = r6.A0a
            X.11C r1 = r6.A0m
            r0 = 2131898083(0x7f122ee3, float:1.9431074E38)
            X.C108955ca.A1E(r2, r1, r0)
            return
        L_0x049f:
            java.lang.Object r0 = r1.A01
            X.88Y r0 = (X.AnonymousClass88Y) r0
            r0.BpG()
            return
        L_0x04a7:
            java.lang.Object r1 = r1.A01
            X.10T r1 = (X.AnonymousClass10T) r1
            java.lang.String r0 = "voicenote/voicenotestarted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 38
            X.AnonymousClass7KX.A00(r1, r0)
            return
        L_0x04b6:
            java.lang.Object r0 = r1.A01
            X.6tp r0 = (X.C136446tp) r0
            r0.A00()
            return
        L_0x04be:
            java.lang.Object r0 = r1.A01
            X.6dC r0 = (X.C126726dC) r0
            X.4SK r2 = r0.A00
            X.2rE r1 = r2.A03
            r0 = 1
            X.C62332rE.A00(r1, r0)
            X.1f4 r0 = r2.A02
            r0.A06()
            return
        L_0x04d0:
            java.lang.Object r0 = r1.A01
            X.74M r0 = (X.AnonymousClass74M) r0
            X.6tp r6 = r0.A1A
            X.6dB r0 = r6.A07
            X.74M r0 = r0.A00
            X.1BI r1 = r0.A0C
            if (r1 == 0) goto L_0x04fd
            boolean r0 = X.C22971Dz.A0N(r1)
            if (r0 == 0) goto L_0x050a
            X.1L1 r1 = r6.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            java.lang.String r4 = "ptt_lock_broadcast"
        L_0x04f3:
            long r2 = X.C17890vO.A05(r3, r4)
            r0 = 1
            long r2 = r2 + r0
            X.C17880vN.A1D(r5, r4, r2)
        L_0x04fd:
            X.6mI r0 = r6.A06
            X.61p r1 = new X.61p
            r1.<init>()
            X.18K r0 = r0.A00
            r0.CC7(r1)
            return
        L_0x050a:
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x0520
            X.1L1 r1 = r6.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            java.lang.String r4 = "ptt_lock_group"
            goto L_0x04f3
        L_0x0520:
            boolean r2 = X.C22971Dz.A0S(r1)
            X.1L1 r1 = r6.A05
            X.0z4 r0 = r1.A01
            r1.A00(r0)
            android.content.SharedPreferences r3 = r1.A00
            android.content.SharedPreferences$Editor r5 = X.C108985cd.A0C(r3, r0, r1)
            if (r2 == 0) goto L_0x0536
            java.lang.String r4 = "ptt_lock_interop"
            goto L_0x04f3
        L_0x0536:
            java.lang.String r4 = "ptt_lock_individual"
            goto L_0x04f3
        L_0x0539:
            java.lang.Object r0 = r1.A01
            X.7B1 r0 = (X.AnonymousClass7B1) r0
            r0.A00()
            return
        L_0x0541:
            java.lang.Object r2 = r1.A01
            X.6gi r2 = (X.C128806gi) r2
            X.70X r0 = r2.A01
            int r1 = r0.A05()
            X.70X r0 = r2.A01
            r0.A0J()
            X.70X r0 = r2.A01
            r0.A0M(r1)
            return
        L_0x0556:
            java.lang.Object r0 = r1.A01
            X.6Mj r0 = (X.C121996Mj) r0
            r0.A04()
            return
        L_0x055e:
            java.lang.Object r0 = r1.A01
            X.6Mj r0 = (X.C121996Mj) r0
            goto L_0x0637
        L_0x0564:
            java.lang.Object r0 = r1.A01
            X.7B9 r0 = (X.AnonymousClass7B9) r0
            X.6Mr r3 = r0.A00
            boolean r0 = r3.A0M
            r2 = 1
            if (r0 == 0) goto L_0x057a
            X.6Mw r0 = r3.A0a
            android.view.View r1 = r0.A05
            r0 = 8
            r1.setVisibility(r0)
            r3.A0E = r2
        L_0x057a:
            r3.A0K = r2
            return
        L_0x057d:
            java.lang.Object r0 = r1.A01
            X.77w r0 = (X.C1420277w) r0
            java.lang.Object r0 = r0.A01
            X.6Mi r0 = (X.C121986Mi) r0
            android.media.MediaPlayer$OnErrorListener r3 = r0.A07
            android.media.MediaPlayer r2 = r0.A09
            r1 = 1
            r0 = 0
            r3.onError(r2, r1, r0)
            return
        L_0x058f:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            r0.invalidate()
            return
        L_0x059a:
            java.lang.Object r0 = r1.A01
            X.6Ms r0 = (X.C122086Ms) r0
            X.C122086Ms.A01(r0)
            return
        L_0x05a2:
            java.lang.Object r5 = r1.A01
            X.1hP r5 = (X.C32571hP) r5
            monitor-enter(r5)
            X.00H r0 = r5.A03     // Catch:{ all -> 0x0619 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0619 }
            X.6m1 r0 = (X.C132006m1) r0     // Catch:{ all -> 0x0619 }
            X.00H r1 = r0.A01     // Catch:{ all -> 0x0619 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0619 }
            X.Cmh r0 = (X.C25830Cmh) r0     // Catch:{ all -> 0x0619 }
            X.Cqo r6 = r0.A01()     // Catch:{ all -> 0x0619 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x0619 }
            X.Cmh r4 = (X.C25830Cmh) r4     // Catch:{ all -> 0x0619 }
            long r2 = r6.A07     // Catch:{ all -> 0x0619 }
            r0 = 1
            long r2 = r2 + r0
            r8 = 15
            r9 = 0
            r7 = -2097153(0xffffffffffdfffff, float:NaN)
            r13 = r9
            r15 = r9
            r17 = r9
            r19 = r9
            r21 = r9
            r23 = r9
            r25 = r9
            r27 = r9
            r29 = r9
            r31 = r9
            r33 = r9
            r35 = r9
            r37 = r9
            r39 = r9
            r41 = r9
            r43 = r9
            r45 = r9
            r47 = r9
            r49 = r9
            r53 = r9
            r55 = r9
            r57 = r9
            r59 = r9
            r61 = r9
            r63 = r9
            r65 = r9
            r67 = r9
            r69 = r9
            r71 = r9
            r73 = r9
            r75 = r9
            r77 = r9
            r79 = r9
            r11 = r9
            r51 = r2
            X.Cqo r0 = X.C26030Cqo.A00(r6, r7, r8, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79)     // Catch:{ all -> 0x0619 }
            r4.A03(r0)     // Catch:{ all -> 0x0619 }
            monitor-exit(r5)
            return
        L_0x0619:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x061c:
            java.lang.Object r0 = r1.A01
            X.BID r0 = (X.BID) r0
            r0.A0D()
            return
        L_0x0624:
            java.lang.Object r0 = r1.A01
            X.78U r0 = (X.AnonymousClass78U) r0
            com.whatsapp.videoplayback.HeroPlaybackControlView r0 = r0.A01
            r0.A07()
            goto L_0x0637
        L_0x062e:
            java.lang.Object r0 = r1.A01
            X.78U r0 = (X.AnonymousClass78U) r0
            com.whatsapp.videoplayback.HeroPlaybackControlView r0 = r0.A01
            r0.A08()
        L_0x0637:
            r0.A09()
            return
        L_0x063b:
            java.lang.Object r0 = r1.A01
            X.1yT r0 = (X.C42621yT) r0
            r0.A01()
            return
        L_0x0643:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            X.C42491yG.A02(r0)
            return
        L_0x064b:
            java.lang.Object r10 = r1.A01
            X.2so r10 = (X.C63282so) r10
            monitor-enter(r10)
            java.util.Map r0 = r10.A04     // Catch:{ all -> 0x0720 }
            java.util.Iterator r6 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x0720 }
        L_0x0656:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0720 }
            if (r0 == 0) goto L_0x06ac
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r6)     // Catch:{ all -> 0x0720 }
            java.lang.Object r0 = r5.getValue()     // Catch:{ all -> 0x0720 }
            X.7RD r0 = (X.AnonymousClass7RD) r0     // Catch:{ all -> 0x0720 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0720 }
            android.os.Handler r0 = (android.os.Handler) r0     // Catch:{ all -> 0x0720 }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x0720 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0720 }
            java.lang.String r4 = r0.getName()     // Catch:{ all -> 0x0720 }
            long r2 = r0.getId()     // Catch:{ all -> 0x0720 }
            java.util.Map r1 = r10.A05     // Catch:{ all -> 0x0720 }
            java.lang.Object r0 = r5.getKey()     // Catch:{ all -> 0x0720 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0720 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0720 }
            if (r1 != r0) goto L_0x06a6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = "StuckDbHandlerThreadDetector/onHeartbeatDeadline thread stuck thread=["
            r1.append(r0)     // Catch:{ all -> 0x0720 }
            r1.append(r2)     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch:{ all -> 0x0720 }
            r1.append(r4)     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = "]"
            X.C17890vO.A1B(r1, r0)     // Catch:{ all -> 0x0720 }
            X.C63282so.A00(r10, r4)     // Catch:{ all -> 0x0720 }
        L_0x06a4:
            monitor-exit(r10)     // Catch:{ all -> 0x0720 }
            goto L_0x071f
        L_0x06a6:
            java.util.Map r0 = r10.A06     // Catch:{ all -> 0x0720 }
            r0.remove(r4)     // Catch:{ all -> 0x0720 }
            goto L_0x0656
        L_0x06ac:
            java.util.List r0 = r10.A03     // Catch:{ all -> 0x0720 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0720 }
        L_0x06b2:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0720 }
            if (r0 == 0) goto L_0x071b
            java.lang.Object r11 = r14.next()     // Catch:{ all -> 0x0720 }
            X.6he r11 = (X.C129346he) r11     // Catch:{ all -> 0x0720 }
            java.util.concurrent.ThreadPoolExecutor r0 = r11.A03     // Catch:{ all -> 0x0720 }
            long r3 = r0.getTaskCount()     // Catch:{ all -> 0x0720 }
            long r1 = r0.getCompletedTaskCount()     // Catch:{ all -> 0x0720 }
            long r7 = r11.A01     // Catch:{ all -> 0x0720 }
            long r5 = r11.A00     // Catch:{ all -> 0x0720 }
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x070c
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x070c
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x070c
            r13 = 1
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = "StuckDbHandlerThreadDetector/Thread pool stuck, name:"
            r12.append(r0)     // Catch:{ all -> 0x0720 }
            java.lang.String r9 = r11.A02     // Catch:{ all -> 0x0720 }
            r12.append(r9)     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = " lastTaskCount:"
            r12.append(r0)     // Catch:{ all -> 0x0720 }
            r12.append(r7)     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = " lastCompleted:"
            r12.append(r0)     // Catch:{ all -> 0x0720 }
            r12.append(r5)     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = " currentTaskCount:"
            r12.append(r0)     // Catch:{ all -> 0x0720 }
            r12.append(r3)     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = " currentCompleted:"
            java.lang.String r0 = X.C17890vO.A0a(r0, r12, r1)     // Catch:{ all -> 0x0720 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0720 }
            X.C63282so.A00(r10, r9)     // Catch:{ all -> 0x0720 }
            goto L_0x0714
        L_0x070c:
            r13 = 0
            java.util.Map r5 = r10.A06     // Catch:{ all -> 0x0720 }
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x0720 }
            r5.remove(r0)     // Catch:{ all -> 0x0720 }
        L_0x0714:
            r11.A00 = r1     // Catch:{ all -> 0x0720 }
            r11.A01 = r3     // Catch:{ all -> 0x0720 }
            if (r13 == 0) goto L_0x06b2
            goto L_0x06a4
        L_0x071b:
            r10.A01()     // Catch:{ all -> 0x0720 }
            goto L_0x06a4
        L_0x071f:
            return
        L_0x0720:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0720 }
            throw r0
        L_0x0723:
            java.lang.Object r0 = r1.A01
            X.6j5 r0 = (X.C130226j5) r0
            X.3M2 r0 = r0.A03
            r0.BuW()
            return
        L_0x072d:
            java.lang.Object r0 = r1.A01
            X.1gV r0 = (X.C32021gV) r0
            r0.A0C()
            return
        L_0x0735:
            java.lang.Object r2 = r1.A01
            X.79h r2 = (X.C1423979h) r2
            android.widget.TextView r1 = r2.A02
            r0 = 1
            r1.setSelected(r0)
            r0 = 0
            r2.A00 = r0
            return
        L_0x0743:
            java.lang.Object r3 = r1.A01
            com.whatsapp.util.FloatingChildLayout r3 = (com.whatsapp.util.FloatingChildLayout) r3
            android.animation.ValueAnimator r0 = r3.A05
            if (r0 == 0) goto L_0x0757
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0757
            android.animation.ValueAnimator r0 = r3.A05
            r0.reverse()
            return
        L_0x0757:
            int[] r0 = X.C108945cZ.A1W()
            r0 = {0, 127} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r0)
            r3.A05 = r1
            r0 = 34
            X.C1411074h.A00(r1, r3, r0)
            android.animation.ValueAnimator r2 = r3.A05
            int r0 = r3.A0B
            long r0 = (long) r0
            android.animation.ValueAnimator r0 = r2.setDuration(r0)
            r0.start()
            return
        L_0x0776:
            java.lang.Object r1 = r1.A01
            X.6nr r1 = (X.C132916nr) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vk r0 = r1.A00
            r0.invoke()
            return
        L_0x0784:
            java.lang.Object r0 = r1.A01
            X.6Kw r0 = (X.C121626Kw) r0
            android.media.MediaPlayer r0 = r0.A01
            r0.reset()
            r0.release()
            return
        L_0x0791:
            java.lang.Object r0 = r1.A01
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r0 = (com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel) r0
            X.1KB r2 = r0.A04
            r1 = 2131897217(0x7f122b81, float:1.9429317E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7RJ.run():void");
    }
}
