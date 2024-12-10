package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;

public class A7v {
    public int A00;
    public Ringtone A01;
    public Uri A02;
    public C177779Ao A03;
    public C200710s A04;
    public long[] A05;
    public final int A06;
    public final Context A07;
    public final A99 A08;
    public final AnonymousClass11C A09;
    public final C18030ve A0A;
    public final AnonymousClass1Nb A0B;
    public final int A0C;
    public final AnonymousClass11P A0D;
    public final AnonymousClass1DC A0E;
    public final AnonymousClass10I A0F;
    public final AnonymousClass00H A0G = C18150vq.A01(new C21516AlP(this, 1));

    public void A06() {
        this.A02 = null;
        C177779Ao r1 = this.A03;
        if (r1 != null) {
            r1.A0B(true);
            this.A03 = null;
        }
        if (this.A01 != null) {
            Log.i("voip/ringtone/stop");
            Ringtone ringtone = this.A01;
            if (C18020vd.A05(C18040vf.A02, this.A0A, 6570)) {
                C200710s A002 = A00(this);
                A002.A03();
                A002.execute(new C146427Pb(ringtone, 31));
            } else {
                ringtone.stop();
            }
            this.A01 = null;
        }
        A01();
    }

    public boolean A08(CallInfo callInfo) {
        int i;
        int i2;
        if (!(callInfo == null && (callInfo = AnonymousClass8BR.A0r(this.A08)) == null)) {
            A99 a99 = this.A08;
            if (C18020vd.A00(C18040vf.A02, a99.A2p, 5170) <= 1 || (i2 = this.A0C) <= 0 ? ((i = this.A0C) <= 0 || callInfo.participants.size() > i) && this.A06 > 0 && callInfo.groupJid != null && callInfo.isJoinableGroupCall : callInfo.groupJid != null && callInfo.participants.size() > i2) {
                if (!a99.A0Q(callInfo.callId).A0G) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C200710s A00(A7v a7v) {
        C200710s r2 = a7v.A04;
        if (r2 != null) {
            return r2;
        }
        C200710s r22 = new C200710s(a7v.A0F, true);
        a7v.A04 = r22;
        return r22;
    }

    private void A01() {
        if (this.A05 != null) {
            Log.i("voip/vibrate/stop");
            Vibrator A0H = this.A09.A0H();
            C17960vV.A07(A0H);
            if (C18020vd.A05(C18040vf.A02, this.A0A, 6570)) {
                A00(this).execute(new C146427Pb(A0H, 29));
            } else {
                A0H.cancel();
            }
            this.A05 = null;
        }
    }

    public static /* synthetic */ void A02(AudioAttributes audioAttributes, VibrationEffect vibrationEffect, Vibrator vibrator) {
        if (vibrator != null) {
            vibrator.vibrate(vibrationEffect, audioAttributes);
        }
        Log.i("voip/vibrate/start complete");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r0.getRingerMode() != 2) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.A7v r8) {
        /*
            android.media.Ringtone r0 = r8.A01
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "voip/ringtone/play"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r2 = r8.A0A
            r1 = 6570(0x19aa, float:9.207E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0076
            X.10s r2 = A00(r8)
            r1 = 30
            X.7Pb r0 = new X.7Pb
            r0.<init>(r8, r1)
            r2.execute(r0)
        L_0x0023:
            int r0 = r8.A00
            r5 = 1
            int r0 = r0 + 1
            r8.A00 = r0
            X.A99 r1 = r8.A08
            com.whatsapp.voipcalling.CallInfo r6 = X.AnonymousClass8BR.A0r(r1)
            if (r6 == 0) goto L_0x0075
            java.lang.String r0 = r6.callId
            X.9hv r7 = r1.A0Q(r0)
            long r1 = r7.A01
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            long r1 = r7.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A01 = r0
        L_0x004c:
            boolean r0 = r6.isGroupCall
            if (r0 == 0) goto L_0x0075
            com.whatsapp.voipcalling.CallState r1 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0075
            com.whatsapp.jid.UserJid r4 = r6.getPeerJid()
            boolean r3 = r8.A08(r6)
            X.11C r0 = r8.A09
            android.media.AudioManager r0 = r0.A0D()
            if (r0 == 0) goto L_0x006e
            int r2 = r0.getRingerMode()
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            long[] r0 = r8.A05
            if (r0 == 0) goto L_0x0084
            if (r1 != 0) goto L_0x0084
        L_0x0075:
            return
        L_0x0076:
            android.media.Ringtone r0 = r8.A01
            boolean r0 = r0.isPlaying()
            if (r0 != 0) goto L_0x0075
            android.media.Ringtone r0 = r8.A01
            r0.play()
            goto L_0x0023
        L_0x0084:
            r8.A01()
            X.C17960vV.A07(r4)
            long[] r0 = r8.A09(r4, r3, r1)
            if (r3 != 0) goto L_0x0096
            if (r1 != 0) goto L_0x0096
        L_0x0092:
            r8.A07(r4, r0, r5)
            return
        L_0x0096:
            r5 = 0
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7v.A03(X.A7v):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A2p, 6307) == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A2p, 6307) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.A7v r5) {
        /*
            X.A99 r5 = r5.A08
            X.9sR r0 = r5.A44
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0015
            X.0ve r2 = r5.A2p
            r1 = 6307(0x18a3, float:8.838E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            X.9sR r0 = r5.A44
            boolean r3 = r0.A01
            X.9sR r0 = r5.A44
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x002d
            X.0ve r2 = r5.A2p
            r1 = 6307(0x18a3, float:8.838E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceService/isCallSilenced By Call Notification Settings: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; By WA App Notification Settings : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; By DND Mode: "
            X.C17900vP.A0n(r0, r1, r3)
            if (r4 != 0) goto L_0x004e
            if (r2 != 0) goto L_0x004e
            r0 = 0
            if (r3 == 0) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7v.A04(X.A7v):boolean");
    }

    public void A05() {
        if (this.A02 == null) {
            return;
        }
        if (this.A01 != null) {
            try {
                A03(this);
            } catch (NullPointerException e) {
                if (Build.VERSION.SDK_INT != 22 || !"oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
                    throw e;
                }
                Log.e("voip/loadAndPlayRingtone error while playing existing ringtone", e);
            }
        } else if (this.A03 == null) {
            C177779Ao r4 = new C177779Ao(this.A07, (AnonymousClass9X8) this.A0G.get());
            this.A03 = r4;
            this.A0F.CGD(r4, this.A02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        com.whatsapp.util.Log.e("voip/ringtone/vibrate/UNKNOWN");
        X.C17960vV.A0F(false, X.AnonymousClass001.A1H("unknown vibrate preference ", r4, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        if (r4.equals("2") == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        r0 = new long[]{0, 750, 1500};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        switch(r2) {
            case 0: goto L_0x00df;
            case 1: goto L_0x00d7;
            default: goto L_0x00cb;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cb, code lost:
        r0 = {0, 750, 250} // fill-array;
        r7.A05 = r0;
        r0 = "voip/ringtone/vibrate/LONG";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r0 = {0, 300, 200} // fill-array;
        r7.A05 = r0;
        r0 = "voip/ringtone/vibrate/SHORT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        r0 = {0, 750, 1500} // fill-array;
        r7.A05 = r0;
        r0 = "voip/ringtone/vibrate/DEFAULT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass1BI r8, long[] r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "voip/vibrate"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r8 != 0) goto L_0x000d
            java.lang.String r0 = "voip/vibrate/error/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000c:
            return
        L_0x000d:
            long[] r0 = r7.A05
            if (r0 != 0) goto L_0x000c
            boolean r0 = A04(r7)
            if (r0 != 0) goto L_0x000c
            X.11C r1 = r7.A09
            android.media.AudioManager r4 = r1.A0D()
            if (r4 == 0) goto L_0x000c
            int r3 = r4.getRingerMode()
            r2 = 1
            r0 = 2
            if (r3 == r0) goto L_0x002d
            int r0 = r4.getRingerMode()
            if (r0 != r2) goto L_0x000c
        L_0x002d:
            X.1Nb r0 = r7.A0B
            X.1yM r0 = r0.A0a(r8)
            java.lang.String r4 = r0.A04()
            if (r4 == 0) goto L_0x000c
            java.lang.String r0 = "0"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x000c
            r3 = 0
            if (r9 == 0) goto L_0x008f
            r7.A05 = r9
        L_0x0046:
            long[] r6 = r7.A05
            if (r6 == 0) goto L_0x000c
            android.os.Vibrator r4 = r1.A0H()
            X.C17960vV.A07(r4)
            java.lang.String r0 = "voip/vibrate/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00eb
            android.media.AudioAttributes$Builder r1 = new android.media.AudioAttributes$Builder
            r1.<init>()
            r0 = 4
            android.media.AudioAttributes$Builder r1 = r1.setContentType(r0)
            r0 = 6
            android.media.AudioAttributes$Builder r0 = r1.setUsage(r0)
            android.media.AudioAttributes r5 = r0.build()
            if (r10 != 0) goto L_0x0072
            r3 = -1
        L_0x0072:
            android.os.VibrationEffect r3 = android.os.VibrationEffect.createWaveform(r6, r3)
            X.0ve r2 = r7.A0A
            r1 = 6570(0x19aa, float:9.207E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00e7
            X.10s r1 = A00(r7)
            X.Ain r0 = new X.Ain
            r0.<init>(r5, r3, r4)
            r1.execute(r0)
            return
        L_0x008f:
            int r0 = r4.hashCode()
            switch(r0) {
                case 49: goto L_0x00bc;
                case 50: goto L_0x00b3;
                case 51: goto L_0x00a9;
                default: goto L_0x0096;
            }
        L_0x0096:
            java.lang.String r0 = "voip/ringtone/vibrate/UNKNOWN"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown vibrate preference "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r2)
            X.C17960vV.A0F(r3, r0)
            goto L_0x0046
        L_0x00a9:
            java.lang.String r0 = "3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0096
            r2 = 2
            goto L_0x00c5
        L_0x00b3:
            java.lang.String r0 = "2"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00c5
            goto L_0x0096
        L_0x00bc:
            java.lang.String r0 = "1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0096
            r2 = 0
        L_0x00c5:
            r0 = 3
            long[] r0 = new long[r0]
            switch(r2) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00d7;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            r0 = {0, 750, 250} // fill-array
            r7.A05 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/LONG"
        L_0x00d2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0046
        L_0x00d7:
            r0 = {0, 300, 200} // fill-array
            r7.A05 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/SHORT"
            goto L_0x00d2
        L_0x00df:
            r0 = {0, 750, 1500} // fill-array
            r7.A05 = r0
            java.lang.String r0 = "voip/ringtone/vibrate/DEFAULT"
            goto L_0x00d2
        L_0x00e7:
            r4.vibrate(r3, r5)
            return
        L_0x00eb:
            X.0ve r2 = r7.A0A
            r1 = 6570(0x19aa, float:9.207E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0106
            X.10s r2 = A00(r7)
            r1 = 19
            X.7RF r0 = new X.7RF
            r0.<init>(r4, r6, r1, r10)
            r2.execute(r0)
            return
        L_0x0106:
            if (r10 != 0) goto L_0x0109
            r3 = -1
        L_0x0109:
            r4.vibrate(r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7v.A07(X.1BI, long[], boolean):void");
    }

    public long[] A09(AnonymousClass1BI r8, boolean z, boolean z2) {
        int i;
        if ("0".equals(this.A0B.A0a(r8).A04())) {
            return new long[]{0, 0, 0};
        }
        if (!z) {
            return new long[]{0, 50, 50, 70, 30, 70, 30, 50, 50, 70, 30, 70, 30, 50, 50, 70, 30, 70, 4000};
        }
        long[] jArr = {0, 150, 83, 50, 67, 20, 97, 20, 96, 50, 67, 35, 195, 50, 78, 300, 4000};
        if (z2 || (i = this.A06) <= 1) {
            return jArr;
        }
        long[] jArr2 = new long[((i * 16) + 1)];
        int i2 = 0;
        do {
            System.arraycopy(jArr, 1, jArr2, (i2 * 16) + 1, 16);
            i2++;
        } while (i2 < i);
        return jArr2;
    }

    public A7v(Context context, A99 a99, AnonymousClass11C r5, AnonymousClass11P r6, C18030ve r7, AnonymousClass1Nb r8, AnonymousClass1DC r9, AnonymousClass10I r10) {
        this.A0D = r6;
        this.A0A = r7;
        this.A07 = context;
        this.A0F = r10;
        this.A08 = a99;
        this.A0E = r9;
        this.A09 = r5;
        this.A0B = r8;
        C18040vf r1 = C18040vf.A02;
        this.A0C = C18020vd.A00(r1, r7, 4710);
        this.A06 = C18020vd.A00(r1, r7, 870);
    }
}
