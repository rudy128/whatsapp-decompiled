package X;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.audiofx.Visualizer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.whatsapp.util.LRUCache;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/* renamed from: X.7Mo  reason: invalid class name and case insensitive filesystem */
public class C145777Mo implements B9T, C31121f3 {
    public static int A15;
    public static byte[] A16;
    public static final LRUCache A17 = new LRUCache(250);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = 0;
    public Activity A09;
    public Sensor A0A;
    public SensorEventListener A0B;
    public SensorManager A0C;
    public AudioManager.OnAudioFocusChangeListener A0D;
    public Visualizer A0E;
    public C22851Dl A0F = new AnonymousClass7AO(this, 12);
    public C1600386w A0G;
    public C160838Ad A0H;
    public C1600486x A0I;
    public C128596gN A0J;
    public C441822l A0K;
    public C132116mE A0L;
    public AnonymousClass70T A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public float A0W;
    public int A0X;
    public long A0Y;
    public boolean A0Z;
    public final PowerManager.WakeLock A0a;
    public final C48012Kv A0b;
    public final C31131f4 A0c;
    public final AnonymousClass11C A0d;
    public final C63552tI A0e;
    public final AnonymousClass1L1 A0f;
    public final AnonymousClass8CB A0g;
    public final C31111f2 A0h;
    public final C139296yb A0i;
    public final C136776uN A0j;
    public final C41731wy A0k;
    public final AnonymousClass10I A0l;
    public final C123486Uq A0m = new AnonymousClass6N1(this);
    public final AnonymousClass2LC A0n;
    public final boolean A0o;
    public final Handler A0p = new C109595dh(Looper.getMainLooper(), this, 1);
    public final AnonymousClass190 A0q;
    public final AnonymousClass1KB A0r;
    public final AnonymousClass118 A0s;
    public final C219217x A0t;
    public final C223819r A0u;
    public final C24681Lg A0v;
    public final C18030ve A0w;
    public final C88634aG A0x;
    public final C27231Vg A0y;
    public final AnonymousClass88K A0z = new AnonymousClass7N3(this, 0);
    public final C132156mI A10;
    public final AnonymousClass00H A11;
    public final AnonymousClass00H A12;
    public final boolean A13;
    public volatile boolean A14;

    public static final boolean A08(BluetoothHeadset bluetoothHeadset, AudioManager audioManager) {
        try {
            if (AnonymousClass112.A08() && audioManager != null) {
                return C124186Xj.A00(audioManager);
            }
            if (bluetoothHeadset == null) {
                return false;
            }
            List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
            C18070vi.A0X(connectedDevices);
            if ((connectedDevices instanceof Collection) && connectedDevices.isEmpty()) {
                return false;
            }
            for (BluetoothDevice bluetoothClass : connectedDevices) {
                if (bluetoothClass.getBluetoothClass().getMajorDeviceClass() == 1024) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    public void A0A() {
        A0H(true, false);
    }

    public boolean A0J(int i) {
        float f;
        if (i == 0) {
            f = 1.0f;
        } else if (i == 1) {
            f = 1.5f;
        } else if (i == 2) {
            f = 2.0f;
        } else {
            throw AnonymousClass000.A0n(AnonymousClass001.A1I("setFastPlaybackPlayerState: Did not handle FastPlaybackPlayerState: ", AnonymousClass000.A10(), i));
        }
        C17900vP.A0j("messageaudioplayer/setFastPlaybackPlayerState fastPlaybackPlayerState: ", AnonymousClass000.A10(), i);
        AnonymousClass70T r1 = this.A0M;
        if (r1 == null || !(r1 instanceof C121616Kv) || !this.A13) {
            return true;
        }
        return r1.A0D(this.A0q, f);
    }

    private void A00() {
        AudioManager A0D2 = this.A0d.A0D();
        if (A0D2 != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0D;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new AnonymousClass75O(this.A0c);
                this.A0D = onAudioFocusChangeListener;
            }
            A0D2.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    private void A01() {
        C145777Mo A002 = this.A0c.A00();
        if (A002 != this && A002 != null) {
            if (C18020vd.A05(C18040vf.A02, this.A0w, 952)) {
                A002.A0H(false, false);
            } else {
                A002.A0A();
            }
        }
    }

    private void A02() {
        int i;
        if (this.A0E == null && !this.A0o && this.A0I != null && (i = Build.VERSION.SDK_INT) != 26) {
            if ((i != 28 || !Build.MANUFACTURER.equals("Xiaomi") || !Build.MODEL.equals("Mi 9 Lite")) && this.A0t.A0E()) {
                try {
                    Visualizer visualizer = new Visualizer(0);
                    this.A0E = visualizer;
                    visualizer.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    this.A0E.setDataCaptureListener(new AnonymousClass75X(this), Visualizer.getMaxCaptureRate() / 2, true, true);
                    this.A0E.setEnabled(true);
                } catch (RuntimeException e) {
                    Log.e("visualmediaplayer/start ", e);
                }
            }
        }
    }

    private void A03() {
        if (this.A0U) {
            boolean z = this.A0N;
            C63552tI r3 = this.A0e;
            if (z) {
                C63552tI.A00(r3).execute(new C70653Bz(r3, this, 17));
            } else {
                r3.A03();
            }
        }
        C160838Ad r0 = this.A0H;
        if (r0 != null && C108995ce.A1X(r0, this)) {
            this.A0H.C0A(A09());
        }
        C441822l r02 = this.A0K;
        int A092 = A09();
        C17890vO.A0z(r02.A0v, A17, A092);
        this.A14 = false;
        this.A0g.A03(this);
        this.A0h.A01.remove(this);
        C132116mE r03 = this.A0L;
        if (r03 != null) {
            r03.A00();
            this.A0L = null;
        }
        A07(false);
    }

    public static void A04(C145777Mo r5) {
        AnonymousClass70T r0;
        BluetoothHeadset bluetoothHeadset = r5.A0g.A00;
        AudioManager A0D2 = r5.A0d.A0D();
        PowerManager.WakeLock wakeLock = r5.A0a;
        if (wakeLock != null && !wakeLock.isHeld() && !r5.A0h.A00 && !A08(bluetoothHeadset, A0D2) && (r0 = r5.A0M) != null && r0.A0C() && !r5.A0N) {
            wakeLock.acquire(((long) r5.A01) + 5000);
            Log.i("messageaudioplayer/startProximityListener acquired proximityWakeLock");
        }
    }

    public static void A05(C145777Mo r1) {
        PowerManager.WakeLock wakeLock = r1.A0a;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release(1);
            Log.i("messageaudioplayer/stopproximitylistener released proximityWakeLock");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r0 instanceof X.C121606Ku) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06(boolean r23) {
        /*
            r22 = this;
            r12 = r22
            X.22l r1 = r12.A0K
            int r0 = r1.A09
            r2 = 1
            if (r0 == r2) goto L_0x000e
            boolean r0 = r12.A0T
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            X.2rc r0 = r1.A02
            if (r0 == 0) goto L_0x000d
            java.io.File r0 = r0.A0G
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)
            r20 = 0
            if (r0 == 0) goto L_0x0026
            r20 = 5
        L_0x0026:
            X.70T r0 = r12.A0M
            if (r0 == 0) goto L_0x0030
            boolean r0 = r0 instanceof X.C121606Ku
            r19 = 3
            if (r0 != 0) goto L_0x0032
        L_0x0030:
            r19 = 5
        L_0x0032:
            int r1 = A15
            if (r1 == r2) goto L_0x00eb
            r0 = 2
            r18 = 2
            if (r1 == r0) goto L_0x003d
            r18 = 0
        L_0x003d:
            int r0 = r12.A09()
            float r1 = (float) r0
            int r0 = r12.A01
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r1, r0)
            float r1 = r12.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0055
            r12.A00 = r2
            r1 = r2
        L_0x0055:
            X.6mI r11 = r12.A10
            boolean r10 = r12.A0Z
            int r15 = r12.A08
            int r0 = r12.A07
            long r8 = (long) r0
            double r6 = (double) r1
            int r0 = r12.A06
            long r4 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            X.22l r0 = r12.A0K
            int r0 = r0.A0D
            long r0 = (long) r0
            long r16 = r2.toMillis(r0)
            boolean r0 = r12.A0T
            r21 = r0
            int r0 = r12.A03
            long r2 = (long) r0
            boolean r14 = r12.A0S
            int r0 = r12.A04
            long r0 = (long) r0
            X.64E r13 = new X.64E
            r13.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r13.A01 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r13.A06 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            r13.A05 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r20)
            r13.A07 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            r13.A04 = r10
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r13.A0B = r8
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r13.A03 = r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r13.A0C = r4
            long r4 = X.AnonymousClass6WJ.A00(r16)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r13.A08 = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r21)
            r13.A02 = r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r13.A09 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r13.A00 = r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r13.A0A = r0
            X.18K r0 = r11.A00
            r0.CC7(r13)
            r0 = 0
            r12.A00 = r0
            r0 = 0
            r12.A04 = r0
            r12.A03 = r0
            r12.A0S = r0
            r12.A0T = r0
            if (r23 == 0) goto L_0x000d
            X.10I r1 = r12.A0l
            r0 = 11
            X.C98834rn.A01(r1, r12, r0)
            return
        L_0x00eb:
            r18 = 1
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145777Mo.A06(boolean):void");
    }

    private void A07(boolean z) {
        C441822l r2 = this.A0K;
        if (r2.A0w() && r2.A0D() != 16 && !r2.A0v.A02) {
            if (!z) {
                if (((long) A09()) <= Math.min(C17890vO.A03(r2.A0D), 3000)) {
                    return;
                }
            }
            this.A0x.A04(this.A0K);
        }
    }

    public int A09() {
        AnonymousClass70T r0 = this.A0M;
        if (r0 == null) {
            return 0;
        }
        return Math.max(this.A02, r0.A02());
    }

    public void A0B(int i) {
        try {
            AnonymousClass70T r0 = this.A0M;
            if (r0 != null) {
                r0.A0A(i);
            }
            this.A02 = i;
        } catch (IOException e) {
            Log.e((Throwable) e);
        }
    }

    public void A0D(C441822l r3) {
        Number A1D = C108945cZ.A1D(r3.A0v, A17);
        if (A1D != null) {
            A0B(A1D.intValue());
        }
    }

    public void A0E(boolean z) {
        Activity activity;
        float f;
        AnonymousClass70T r0;
        BluetoothHeadset bluetoothHeadset = this.A0g.A00;
        AudioManager A0D2 = this.A0d.A0D();
        if (this.A0h.A00 || A08(bluetoothHeadset, A0D2)) {
            z = false;
        }
        if (this.A0O == z) {
            return;
        }
        if (!z || ((r0 = this.A0M) != null && r0.A0C())) {
            C17900vP.A0n("messageaudioplayer/onearproximity ", AnonymousClass000.A10(), z);
            this.A0O = z;
            if (this.A0a == null && (activity = this.A09) != null) {
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (z) {
                    this.A0W = attributes.screenBrightness;
                    f = 0.1f;
                } else {
                    f = this.A0W;
                }
                attributes.screenBrightness = f;
                window.setAttributes(attributes);
            }
            C160838Ad r02 = this.A0H;
            if (r02 != null) {
                r02.BsS(z);
            }
            AnonymousClass70T r03 = this.A0M;
            if (r03 != null && r03.A0C()) {
                int A022 = this.A0M.A02();
                this.A0M.A06();
                this.A0M = null;
                C62572rc A002 = AnonymousClass206.A00(this.A0K);
                int i = 3;
                if (z) {
                    i = 0;
                }
                try {
                    this.A0X = i;
                    AnonymousClass70T A003 = AnonymousClass70T.A00(this.A0s, this.A0w, (AnonymousClass6gC) this.A11.get(), A002.A0G, i);
                    this.A0M = A003;
                    A003.A0B(this.A0z);
                    Activity activity2 = this.A09;
                    if (activity2 != null) {
                        activity2.setVolumeControlStream(this.A0X);
                    }
                    if (z && A0D2 != null) {
                        A0D2.setSpeakerphoneOn(false);
                    }
                    this.A0M.A05();
                    int max = Math.max(0, A022 - 1000);
                    this.A02 = max;
                    this.A0M.A0A(max);
                    if (z || System.currentTimeMillis() - this.A0Y < 1500) {
                        if (!A0J(A15)) {
                            A15 = 0;
                        }
                        this.A0M.A08();
                        return;
                    }
                    this.A0R = true;
                    A03();
                    A05(this);
                    A00();
                } catch (IOException | IllegalStateException unused) {
                    this.A0r.A08(2131890601, 0);
                }
            }
        }
    }

    public void A0F(boolean z) {
        AnonymousClass70T r0 = this.A0M;
        if (r0 != null && r0.A0C()) {
            this.A0M.A04();
            ((AnonymousClass8AF) this.A12.get()).CIb();
            this.A0R = true;
            Visualizer visualizer = this.A0E;
            if (visualizer != null) {
                visualizer.setEnabled(false);
                this.A0E.release();
                this.A0E = null;
            }
            A03();
            A05(this);
            if (!z) {
                A06(false);
            } else {
                float min = Math.min(((float) A09()) / ((float) this.A01), 1.0f);
                if (min > this.A00) {
                    this.A00 = min;
                }
            }
        }
        A00();
    }

    public void A0H(boolean z, boolean z2) {
        boolean z3;
        C128596gN r0;
        int i;
        C1600386w r1;
        AnonymousClass70T r12;
        if (this.A01 == A09() || A09() + 50 > this.A01 || ((r12 = this.A0M) != null && (r12 instanceof C121616Kv) && ((C121616Kv) r12).A05)) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("messageaudioplayer/stop playbackCompleted: ");
        A102.append(z3);
        A102.append(" duration: ");
        A102.append(this.A01);
        A102.append(" position: ");
        C17900vP.A0o(A102, A09());
        A06(z3);
        AnonymousClass8AF r2 = (AnonymousClass8AF) this.A12.get();
        if (z3) {
            r2.CEy(this.A0K.A0x);
        } else {
            r2.CIb();
        }
        AnonymousClass70T r02 = this.A0M;
        if (r02 != null) {
            r02.A06();
            this.A0M = null;
        }
        Visualizer visualizer = this.A0E;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            this.A0E.release();
            this.A0E = null;
        }
        if (this.A0a != null || !this.A0O) {
            this.A0l.CGS(new C98834rn((Object) this, 10), "messageaudioplayer/proximityListener");
        }
        A00();
        Activity activity = this.A09;
        if (activity != null) {
            activity.setVolumeControlStream(Integer.MIN_VALUE);
        }
        if (z) {
            this.A02 = 0;
        }
        this.A0R = false;
        this.A0p.removeMessages(0);
        if (z3 && (r1 = this.A0G) != null) {
            r1.C0k(this.A0X);
        }
        C31131f4 r6 = this.A0c;
        if (r6.A00 == this) {
            if (this.A0U) {
                boolean z4 = this.A0P;
                C63552tI r7 = this.A0e;
                if (!z4) {
                    r7.A03();
                } else {
                    C63552tI.A00(r7).execute(new C70653Bz(r7, this, 19));
                }
            }
            C160838Ad r03 = this.A0H;
            if (r03 != null && C108995ce.A1X(r03, this)) {
                if (this.A0K.A0D != 0) {
                    i = this.A0K.A0D * 1000;
                } else {
                    i = this.A01;
                }
                this.A0H.C70(i, z);
            }
            if (z) {
                A17.remove(this.A0K.A0v);
            }
            this.A0n.unregisterObserver(this.A0m);
            this.A0g.A03(this);
            this.A0h.A01.remove(this);
            this.A14 = false;
            C132116mE r04 = this.A0L;
            if (r04 != null) {
                r04.A00();
                this.A0L = null;
            }
        }
        r6.A08((C145777Mo) null);
        if (z2 && (r0 = this.A0J) != null) {
            View view = r0.A00;
            C31131f4 r13 = r0.A01;
            AnonymousClass00H r05 = r0.A02;
            if (view == null) {
                AnonymousClass4aV.A08(r13, r05);
            } else {
                AnonymousClass4aV.A03(view, r13, r05);
            }
        }
        A07(z3);
        this.A0u.A02("PttPlayback", "End");
    }

    public boolean A0I() {
        AnonymousClass70T r0 = this.A0M;
        if (r0 == null || !r0.A0C()) {
            return false;
        }
        return true;
    }

    public void Bmk(int i) {
        if (i == 0) {
            A04(this);
        } else if (i == 2) {
            A05(this);
        }
    }

    public void Bva(boolean z) {
        if (z) {
            A05(this);
        } else {
            A04(this);
        }
    }

    public C145777Mo(Activity activity, AnonymousClass190 r5, AnonymousClass1KB r6, C48012Kv r7, C31131f4 r8, AnonymousClass11C r9, AnonymousClass118 r10, C219217x r11, C223819r r12, C24681Lg r13, C18030ve r14, C88634aG r15, C63552tI r16, AnonymousClass1L1 r17, AnonymousClass8CB r18, C31111f2 r19, C139296yb r20, C27231Vg r21, C136776uN r22, AnonymousClass10I r23, C132156mI r24, AnonymousClass2LC r25, AnonymousClass00H r26, AnonymousClass00H r27, boolean z, boolean z2) {
        this.A09 = activity;
        this.A0s = r10;
        this.A0w = r14;
        this.A0r = r6;
        this.A0q = r5;
        this.A0l = r23;
        this.A0j = r22;
        this.A0d = r9;
        this.A0y = r21;
        this.A0v = r13;
        this.A10 = r24;
        this.A0n = r25;
        this.A0t = r11;
        this.A0f = r17;
        this.A0b = r7;
        this.A0g = r18;
        this.A0e = r16;
        this.A0h = r19;
        this.A0c = r8;
        this.A0x = r15;
        this.A0i = r20;
        this.A0u = r12;
        this.A12 = r26;
        this.A0U = z;
        this.A0o = z2;
        this.A11 = r27;
        PowerManager A0G2 = r9.A0G();
        if (A0G2 == null) {
            Log.w("messageaudioplayer pm=null");
        } else {
            this.A0a = C181789Rv.A00(A0G2, "WhatsApp MessageAudioPlayer ProximityWakeLock", 32);
        }
        this.A13 = AnonymousClass70T.A01(r14);
        C41731wy A0o2 = AnonymousClass3MW.A0o();
        this.A0k = A0o2;
        if (activity instanceof AnonymousClass1F9) {
            A0o2.A0A((AnonymousClass1F9) activity, this.A0F);
        }
    }

    public void A0C(int i, boolean z, boolean z2) {
        int BXk;
        A01();
        this.A0y.A01();
        AnonymousClass10I r4 = this.A0l;
        C98834rn.A01(r4, this, 12);
        this.A0Z = false;
        this.A0Y = System.currentTimeMillis();
        if (this.A0M == null) {
            Log.i("messageaudioplayer/start");
            this.A0u.A02("PttPlayback", "Resume");
            try {
                File file = AnonymousClass206.A00(this.A0K).A0G;
                if (file != null) {
                    this.A0X = 3;
                    AnonymousClass70T A002 = AnonymousClass70T.A00(this.A0s, this.A0w, (AnonymousClass6gC) this.A11.get(), file, 3);
                    this.A0M = A002;
                    A002.A0B(this.A0z);
                    A002.A05();
                    if (!A0J(i)) {
                        A15 = 0;
                    }
                    if (z && (BXk = ((AnonymousClass8AF) this.A12.get()).BXk(this.A0K.A0x)) >= 0) {
                        this.A02 = BXk;
                    }
                    this.A0M.A0A(this.A02);
                    this.A0M.A08();
                    AnonymousClass70T r1 = this.A0M;
                    if (r1 instanceof C121616Kv) {
                        this.A01 = this.A0K.A0D * 1000;
                        AnonymousClass70T r5 = this.A0M;
                        C125796bh r12 = new C125796bh(this);
                        if (!(r5 instanceof C121606Ku) && (r5 instanceof C121616Kv)) {
                            ((C121616Kv) r5).A02 = r12;
                        }
                    } else {
                        this.A01 = r1.A03();
                    }
                    this.A0p.sendEmptyMessage(0);
                    if (C62842s5.A02(this.A0K)) {
                        this.A0v.A02(this.A0K, 25);
                    }
                    A02();
                    if (this.A0U) {
                        C63552tI r6 = this.A0e;
                        C63552tI.A00(r6).execute(new C70653Bz(r6, this.A0K, 16));
                        C63552tI.A00(r6).execute(new C70653Bz(r6, this, 17));
                    }
                    C160838Ad r0 = this.A0H;
                    if (r0 != null && C108995ce.A1X(r0, this)) {
                        this.A0H.C6B(this.A01);
                    }
                    A17.remove(this.A0K.A0v);
                    this.A0n.registerObserver(this.A0m);
                    this.A0g.A02(this);
                    this.A0h.A01.add(this);
                    C48012Kv r52 = this.A0b;
                    C441822l r13 = this.A0K;
                    Log.i("messageaudio/play");
                    r52.notifyAllObservers(new C97014om(r13, 9));
                    this.A14 = true;
                    this.A0L = this.A0i.A01(4);
                    r4.CGS(new C98834rn((Object) this, 9), "messageaudioplayer/proximityListener");
                    this.A0c.A09(this, z2);
                    return;
                }
            } catch (IOException | IllegalStateException e) {
                this.A0q.A0G("messageaudioplayer/failed to prepare mediaplayer", e.toString(), true);
                throw e;
            } catch (IOException | IllegalStateException e2) {
                Log.e(e2);
            }
            this.A0r.A08(2131890601, 0);
            this.A0Z = true;
            A0A();
            return;
        }
        Log.i("messageaudioplayer/resume");
        try {
            this.A0M.A0A(this.A02);
            if (!A0J(i)) {
                A15 = 0;
            }
            this.A0M.A08();
            this.A0R = false;
            this.A0p.sendEmptyMessage(0);
            r4.CGS(new C98834rn((Object) this, 9), "messageaudioplayer/proximityListener");
            A02();
            if (this.A0U) {
                C63552tI r53 = this.A0e;
                C63552tI.A00(r53).execute(new C70653Bz(r53, this, 17));
            }
            C160838Ad r02 = this.A0H;
            if (r02 != null && C108995ce.A1X(r02, this)) {
                this.A0H.C3y();
            }
            A17.remove(this.A0K.A0v);
            C48012Kv r54 = this.A0b;
            C441822l r42 = this.A0K;
            Log.i("messageaudio/play");
            r54.notifyAllObservers(new C97014om(r42, 9));
            this.A14 = true;
            this.A0g.A02(this);
            this.A0h.A01.add(this);
            this.A0L = this.A0i.A01(4);
        } catch (IOException | IllegalStateException unused) {
            this.A0r.A08(2131890601, 0);
            this.A0Z = true;
            A0A();
        }
    }

    public void A0G(boolean z) {
        int i;
        A01();
        AnonymousClass70T r0 = this.A0M;
        if (r0 == null || !r0.A0C()) {
            if (z) {
                i = A15;
            } else {
                i = 0;
            }
            A0C(i, true, false);
            return;
        }
        A0F(false);
    }
}
