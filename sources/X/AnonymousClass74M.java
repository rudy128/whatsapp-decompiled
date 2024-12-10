package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioRecord;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.whatsapp.util.ClippingLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.74M  reason: invalid class name */
public class AnonymousClass74M {
    public static int A1d;
    public static int A1e;
    public static int A1f;
    public static int A1g;
    public static int A1h;
    public static SoundPool A1i;
    public static volatile int A1j;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public ObjectAnimator A08;
    public PowerManager.WakeLock A09;
    public C75373hL A0A;
    public C87814Xd A0B;
    public AnonymousClass1BI A0C;
    public AnonymousClass68R A0D;
    public AnonymousClass206 A0E;
    public C109565de A0F;
    public C132116mE A0G;
    public C132116mE A0H;
    public AnonymousClass70T A0I;
    public AnonymousClass72K A0J;
    public File A0K;
    public File A0L;
    public Runnable A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final Rect A0S;
    public final Handler A0T;
    public final Handler A0U;
    public final View A0V;
    public final View A0W;
    public final View A0X;
    public final View A0Y;
    public final TextView A0Z;
    public final AnonymousClass1FL A0a;
    public final C122956So A0b;
    public final C122956So A0c;
    public final AnonymousClass190 A0d;
    public final AnonymousClass1FR A0e;
    public final C218617r A0f;
    public final AnonymousClass1KB A0g;
    public final C36791oT A0h;
    public final C27411Vz A0i;
    public final C31131f4 A0j;
    public final AnonymousClass3V4 A0k;
    public final C86434Rp A0l;
    public final AnonymousClass11C A0m;
    public final AnonymousClass11P A0n;
    public final C19830z4 A0o;
    public final C223819r A0p;
    public final C18030ve A0q;
    public final C32171gl A0r;
    public final C26421Sb A0s;
    public final C32861hs A0t;
    public final C18010vc A0u;
    public final AnonymousClass70C A0v;
    public final AnonymousClass70F A0w;
    public final C139296yb A0x;
    public final C136776uN A0y;
    public final C87684Wn A0z;
    public final ClippingLayout A10;
    public final ClippingLayout A11;
    public final AnonymousClass10I A12;
    public final AnonymousClass73X A13;
    public final C132526mx A14;
    public final AnonymousClass7OH A15;
    public final C130236j6 A16;
    public final C132156mI A17;
    public final AnonymousClass2LC A18;
    public final C132536my A19;
    public final C136446tp A1A;
    public final AnonymousClass8AX A1B;
    public final C130456jS A1C;
    public final AnonymousClass88Z A1D;
    public final C128036fL A1E;
    public final C133016o2 A1F;
    public final AnonymousClass16P A1G = ((AnonymousClass16P) C221618v.A02(AnonymousClass16P.class));
    public final AnonymousClass00H A1H;
    public final AnonymousClass00H A1I;
    public final Runnable A1J;
    public final AtomicInteger A1K;
    public final boolean A1L;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final int A1P;
    public final int A1Q;
    public final C33251iW A1R;
    public final AudioRecordFactory A1S;
    public final OpusRecorderFactory A1T;
    public final C18000vb A1U;
    public final C34441kU A1V;
    public final C32721he A1W;
    public final AnonymousClass88K A1X;
    public final AnonymousClass1DC A1Y;
    public final C126726dC A1Z;
    public final AnonymousClass1IV A1a;
    public final AnonymousClass1VT A1b;
    public final boolean A1c;

    public static int A00(Context context, SoundPool soundPool) {
        A1i = soundPool;
        A1j = soundPool.load(context, 2132017247, 0);
        A1f = A1i.load(context, 2132017244, 0);
        A1g = A1i.load(context, 2132017245, 0);
        A1h = A1i.load(context, 2132017246, 0);
        A1e = A1i.load(context, 2132017248, 0);
        return A1i.load(context, 2132017244, 0);
    }

    public static void A02(AnonymousClass88W r4, AnonymousClass74M r5, File file, File file2) {
        File file3 = file;
        if (file != null) {
            AnonymousClass74M r2 = r5;
            boolean z = r5.A14.A00;
            r5.A0O = z;
            if (z) {
                r5.A15.A01.setActivated(true);
            }
            C128036fL r0 = r5.A1E;
            r0.A00.execute(new C146617Py(r2, file3, file2, r4, 25));
        }
    }

    public static void A0G(AnonymousClass74M r6, AnonymousClass72K r7, long j, boolean z) {
        try {
            if (!r6.A0R) {
                C18100vl r1 = r7.A0D;
                ((OpusRecorder) r1.getValue()).stop();
                r7.A01 = ((OpusRecorder) r1.getValue()).getPageNumber();
            }
        } catch (Exception e) {
            if (!z || j < 1000) {
                C17900vP.A0Y(e, "voicenote/stopandreleasevoicerecorder/stop ", AnonymousClass000.A10());
            } else {
                Log.e("voicenote/stopandreleasevoicerecorder/stop ", e);
                r6.A0d.A0E("VoiceNoteRecordingUI/stopAndReleaseVoiceRecorder/stop", (String) null, e);
            }
        } catch (Throwable th) {
            r6.A0v.A03(r7, j, z);
            throw th;
        }
        r6.A0v.A03(r7, j, z);
        try {
            AnonymousClass72K.A00(r7).close();
            ((AudioRecord) r7.A09.getValue()).release();
            r6.A0R = false;
        } catch (Exception e2) {
            Log.e("voicenote/stopandreleasevoicerecorder/release", e2);
            r6.A0d.A0E("VoiceNoteRecordingUI/stopAndReleaseVoiceRecorder/release", (String) null, e2);
        }
        Runnable runnable = r6.A0M;
        if (runnable != null) {
            runnable.run();
            r6.A0M = null;
        }
        C132116mE r0 = r6.A0H;
        if (r0 != null) {
            r0.A00();
            r6.A0H = null;
        }
        C109565de r12 = r6.A0F;
        if (r12 != null) {
            synchronized (r12) {
                r12.A00.quit();
            }
            r6.A0F = null;
        }
    }

    public static void A0J(AnonymousClass74M r9, boolean z) {
        long j;
        AnonymousClass74M r5 = r9;
        boolean A0b2 = r9.A0b();
        if (A0b2 && z) {
            A0E(r9, A1e);
            C84094Hv.A00(r9.A0m);
        }
        if (!AnonymousClass000.A1W(r9.A0J) || r9.A0C == null) {
            r9.A0K = null;
            r9.A0L = null;
            return;
        }
        C146787Qp.A00(r9.A12, r9, 8);
        C108955ca.A1E(r9.A0a, r9.A0m, 2131898079);
        Log.i("voicenote/cachevoicenoteandpreview");
        r9.A0k.A0T();
        if (A0b2) {
            j = (SystemClock.elapsedRealtime() - r5.A06) + r5.A05;
            r5.A05 = j;
        } else {
            j = r9.A05;
        }
        C17900vP.A0m("voicenote/cachevoicenoteandpreview duration:", AnonymousClass000.A10(), j);
        AnonymousClass72K r6 = r5.A0J;
        r5.A0J = null;
        r5.A01();
        if (r6 != null) {
            C200710s r0 = r5.A1E.A00;
            r0.A03();
            r0.execute(new C70743Ci(r5, r6, 3, j, z));
        }
    }

    public static void A0L(AnonymousClass74M r6, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass74M r4 = r6;
        r6.A0p.A02("VoiceNoteRecording", "End");
        AnonymousClass7OH r0 = r6.A15;
        View view = r6.A0Y;
        r0.A01.setActivated(false);
        r6.A1B.C77();
        View findViewById = view.findViewById(2131431654);
        findViewById.setFocusable(true);
        findViewById.setImportantForAccessibility(1);
        ObjectAnimator objectAnimator = r6.A08;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        r6.A0w.A02();
        if (r6.A0Q) {
            C108955ca.A1E(r6.A0a, r6.A0m, 2131898079);
        } else if (r6.A0J != null && r6.A0C != null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("voicenote/stopvoicenote ");
            boolean z5 = z;
            C17900vP.A0r(A102, z);
            boolean z6 = !z;
            r4.A0Q = z6;
            if (z6) {
                C108955ca.A1E(r4.A0a, r4.A0m, 2131898053);
            }
            r4.A0k.A0T();
            r4.A1R.A0P(r4.A0C);
            A0C(r4);
            AnonymousClass70T r02 = r4.A0I;
            if (r02 != null && r02.A0C()) {
                r4.A0I.A09();
            }
            AnonymousClass72K r5 = r4.A0J;
            r4.A0J = null;
            r4.A01();
            if (r5 != null) {
                r4.A0P = true;
                r4.A1E.A00.execute(new AnonymousClass7QC(r4, r5, z5, z4, z2, z3));
            }
        }
    }

    public void A0M() {
        A0J(this, false);
        A0Z(false, false);
        this.A0T.removeCallbacks(this.A1J);
        if (this.A0I != null) {
            A0O();
            this.A0I.A06();
            this.A0I = null;
        }
        this.A1b.unregisterObserver(this.A1a);
    }

    public void A0R(long j, String str, boolean z) {
        if (this.A0K != null) {
            this.A14.A00(str);
            A0V(this.A0K, this.A0L, j, z);
            this.A0K = null;
            A0E(this, A1g);
            this.A0L = null;
        }
    }

    public void A0S(AnonymousClass88Y r10, boolean z) {
        File file = this.A0K;
        AnonymousClass88Y r3 = r10;
        if (file == null) {
            r10.BpG();
            return;
        }
        this.A12.CGF(new C21375Aj4(this, r3, file.getName(), 3, this.A0K.length(), z));
    }

    public void A0Z(boolean z, boolean z2) {
        A0L(this, z, z2, true, false);
    }

    private void A01() {
        C448825d r2;
        Runnable runnable = this.A0M;
        if (runnable != null) {
            runnable.run();
            this.A0M = null;
        }
        int i = this.A1Q;
        if (i > 0) {
            AnonymousClass10I r7 = this.A12;
            C448825d CGv = r7.CGv(new AnonymousClass7RJ(this, 49), ((long) i) * 1000);
            int i2 = this.A1P;
            if (i2 >= i) {
                r2 = r7.CGv(new C146787Qp(this, 0), ((long) i2) * 1000);
            } else {
                r2 = null;
            }
            this.A0M = new AnonymousClass7RO(this, CGv, r2, 32);
        }
    }

    public static void A03(AnonymousClass74M r6) {
        boolean A052;
        boolean z = r6.A1c;
        C18030ve r2 = r6.A0q;
        if (z) {
            A052 = AnonymousClass000.A1P(C18020vd.A05(C18040vf.A02, r2, 9982) ? 1 : 0);
        } else {
            A052 = C18020vd.A05(C18040vf.A02, r2, 8565);
        }
        C133016o2 r3 = r6.A1F;
        AnonymousClass7OH r22 = r6.A15;
        C136446tp r1 = r6.A1A;
        r1.getClass();
        r6.A0J = r3.A00(new AnonymousClass7CN(r1), r22, A052);
        r6.A1G.A00 = true;
        r6.A07 = SystemClock.elapsedRealtime();
        r6.A06 = SystemClock.elapsedRealtime();
        r6.A05 = 0;
        C128036fL r23 = r6.A1E;
        r23.A00.execute(new C146787Qp(r6, 4));
    }

    public static void A04(AnonymousClass74M r30) {
        AnonymousClass74M r7 = r30;
        View view = r7.A0Y;
        view.findViewById(2131436900).setVisibility(4);
        ObjectAnimator objectAnimator = r7.A08;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        A0E(r7, A1h);
        View findViewById = view.findViewById(2131436865);
        findViewById.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(213);
        translateAnimation.setStartOffset(640);
        translateAnimation.setFillBefore(true);
        findViewById.startAnimation(translateAnimation);
        View findViewById2 = view.findViewById(2131436864);
        findViewById2.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator(1.1f));
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        translateAnimation2.setDuration(640);
        translateAnimation2.setRepeatMode(2);
        translateAnimation2.setRepeatCount(1);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(640);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.61f, 1.0f, 0.61f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(320);
        scaleAnimation.setStartOffset(960);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation2);
        View findViewById3 = view.findViewById(2131436867);
        AnimationSet animationSet2 = new AnimationSet(true);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        translateAnimation3.setDuration(160);
        translateAnimation3.setStartOffset(746);
        translateAnimation3.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(160);
        rotateAnimation2.setStartOffset(746);
        rotateAnimation2.setFillAfter(true);
        animationSet2.addAnimation(rotateAnimation2);
        animationSet2.addAnimation(translateAnimation3);
        animationSet2.setFillAfter(true);
        findViewById3.setVisibility(0);
        findViewById3.startAnimation(animationSet2);
        int i = 2131430328;
        if (C18020vd.A05(C18040vf.A02, r7.A0q, 4268)) {
            i = 2131431646;
        }
        View findViewById4 = view.findViewById(i);
        findViewById4.setVisibility(4);
        findViewById2.startAnimation(animationSet);
        animationSet.setAnimationListener(new C114515qx(findViewById2, findViewById, findViewById3, findViewById4, r7));
    }

    public static void A05(AnonymousClass74M r3) {
        AnonymousClass70T r2 = r3.A0I;
        if (r2 != null) {
            try {
                int i = r3.A04;
                if (i != -1) {
                    r2.A0A(i);
                    if (r3.A0I.A0C()) {
                        r3.A0T.post(r3.A1J);
                        A08(r3);
                    }
                }
            } catch (IOException e) {
                C108995ce.A1M("Error resuming playback after seek ", AnonymousClass000.A10(), e);
            }
        }
    }

    public static void A06(AnonymousClass74M r2) {
        if (r2.A1L) {
            AnonymousClass7RJ.A02(r2.A12, r2, 47);
            return;
        }
        PowerManager.WakeLock wakeLock = r2.A09;
        if (wakeLock != null && wakeLock.isHeld()) {
            r2.A09.release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r3.A01 == null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.AnonymousClass74M r4) {
        /*
            X.72K r2 = r4.A0J
            if (r2 != 0) goto L_0x000a
            java.lang.String r0 = "VoiceNoteRecordingUI/resumeVoiceNoteRecording/resume voice recorder is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000a:
            X.70F r1 = r4.A0w
            r0 = 1
            r1.A0B = r0
            X.7OH r3 = r4.A15
            X.0vl r0 = r2.A0E
            java.lang.Object r2 = r0.getValue()
            if (r2 == 0) goto L_0x0020
            X.10I r1 = r3.A0L
            r0 = 45
            X.AnonymousClass7RD.A00(r1, r3, r2, r0)
        L_0x0020:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A06 = r0
            X.70T r0 = r4.A0I
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0035
            X.70T r0 = r4.A0I
            r0.A09()
        L_0x0035:
            X.6j6 r3 = r4.A16
            X.0ve r2 = r3.A02
            r1 = 8630(0x21b6, float:1.2093E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0048
            java.lang.String r1 = r3.A01
            r0 = 3
            if (r1 != 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            A0D(r4, r0)
            X.6fL r2 = r4.A1E
            r0 = 48
            X.7RJ r1 = new X.7RJ
            r1.<init>(r4, r0)
            X.10s r0 = r2.A00
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74M.A07(X.74M):void");
    }

    public static void A08(AnonymousClass74M r3) {
        AnonymousClass7OH r1 = r3.A15;
        r1.A0K.A02();
        C130456jS r32 = r1.A04;
        ImageButton imageButton = r32.A00;
        if (imageButton != null) {
            imageButton.setImageResource(2131232493);
        }
        ImageButton imageButton2 = r32.A00;
        if (imageButton2 != null) {
            imageButton2.setContentDescription(r32.A05.A01(2131893587));
        }
    }

    public static void A09(AnonymousClass74M r3) {
        AnonymousClass7OH r1 = r3.A15;
        r1.A0K.A02();
        C130456jS r32 = r1.A04;
        ImageButton imageButton = r32.A00;
        if (imageButton != null) {
            imageButton.setImageResource(2131232218);
        }
        ImageButton imageButton2 = r32.A00;
        if (imageButton2 != null) {
            imageButton2.setContentDescription(r32.A05.A01(2131899314));
        }
    }

    public static void A0A(AnonymousClass74M r8) {
        boolean z;
        int i;
        if (r8.A0I != null) {
            AnonymousClass7OH r2 = r8.A15;
            if (C108995ce.A1U(r2.A05)) {
                if (r2.A05.getProgress() != 0 || r8.A0I.A0C()) {
                    z = false;
                    i = r2.A05.getProgress();
                } else {
                    z = true;
                    i = r2.A05.getMax();
                }
            } else if (r2.A03.getVisibility() != 0) {
                z = true;
                i = 0;
            } else if (r2.A03.A00 != 0.0f || r8.A0I.A0C()) {
                z = false;
                i = r8.A0I.A02();
            } else {
                z = true;
                i = r8.A0I.A03();
            }
            AnonymousClass1FL r7 = r8.A0a;
            int i2 = 2131898071;
            if (z) {
                i2 = 2131897354;
            }
            String A0q2 = C17880vN.A0q(r7, C64052u8.A07(r8.A1U, (long) i), new Object[1], 0, i2);
            r2.A05.setContentDescription(A0q2);
            r2.A03.setContentDescription(A0q2);
        }
    }

    public static void A0B(AnonymousClass74M r3) {
        AnonymousClass72K r0 = r3.A0J;
        if (r0 != null) {
            r0.A04();
            AnonymousClass1KB r2 = r3.A0g;
            AnonymousClass2LC r1 = r3.A18;
            r1.getClass();
            AnonymousClass7RJ.A01(r2, r1, 41);
            r3.A0H = r3.A0x.A01(3);
        }
    }

    public static void A0C(AnonymousClass74M r2) {
        if (r2.A1M) {
            AnonymousClass70F r0 = r2.A0w;
            r0.A0G.removeCallbacks(r0.A0T);
            View view = r2.A0Y;
            if (view != null && view.getKeepScreenOn()) {
                view.setKeepScreenOn(false);
            }
            if (r2.A0N) {
                r2.A0N = false;
                r2.A0i.unregisterObserver(r2.A0h);
            }
        }
    }

    public static void A0D(AnonymousClass74M r7, int i) {
        Integer num;
        int A032 = C72453Mb.A03(r7.A0w.A0B ? 1 : 0);
        C130236j6 r2 = r7.A16;
        AnonymousClass1BI r72 = r7.A0C;
        C18030ve r5 = r2.A02;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r5, 8630)) {
            String str = r2.A01;
            if (str == null) {
                if (i == 1) {
                    str = C17890vO.A0Q();
                    r2.A01 = str;
                    if (str == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            C1184963r r3 = new C1184963r();
            r3.A06 = AnonymousClass3MW.A0y(r2.A04);
            r3.A01 = Integer.valueOf(i);
            r3.A02 = Integer.valueOf(A032);
            if (r72 != null) {
                int i2 = 4;
                if (C22971Dz.A0V(r72)) {
                    i2 = 26;
                }
                num = Integer.valueOf(i2);
            } else {
                num = null;
            }
            r3.A03 = num;
            r3.A04 = C64002u3.A08(r72);
            r3.A07 = str;
            r3.A05 = C108955ca.A0m();
            if (C18020vd.A05(r4, r5, 11229)) {
                r3.A00 = Integer.valueOf(r2.A00);
            }
            r2.A03.CC4(r3);
            C154707rZ r1 = new C154707rZ(r2);
            if (i == 4 || i == 5 || i == 6 || i == 7 || i == 9) {
                r1.invoke();
            }
        }
    }

    public static void A0E(AnonymousClass74M r6, int i) {
        SoundPool soundPool = A1i;
        C18070vi.A0d(soundPool, 0);
        ((C200710s) r6.A1H.get()).execute(new C146627Pz(soundPool, (WeakReference) null, 1.0f, 1.0f, i));
    }

    public static void A0F(AnonymousClass74M r3, int i, boolean z) {
        AnonymousClass70T r0 = r3.A0I;
        if (r0 != null && z) {
            r3.A04 = i;
            if (i == 0 && !r0.A0C()) {
                i = r3.A0I.A03();
            }
            r3.A15.A04((long) i);
            if (!r3.A0I.A0C()) {
                A09(r3);
            }
        }
    }

    public static void A0K(AnonymousClass74M r6, boolean z) {
        View view = r6.A0Y;
        view.findViewById(2131436920).setVisibility(8);
        if (r6.A1M) {
            view.findViewById(2131435142).setEnabled(!TextUtils.isEmpty(r6.A0Z.getText().toString().trim()));
            AnonymousClass7OH r1 = r6.A15;
            r1.A0F.setVisibility(8);
            r1.A0D.setVisibility(8);
            VoiceVisualizer voiceVisualizer = r1.A0H;
            voiceVisualizer.A0C.clear();
            voiceVisualizer.A06 = false;
            voiceVisualizer.A03 = 0;
            voiceVisualizer.A04 = 166;
        }
        r6.A0w.A04(z);
        View findViewById = view.findViewById(2131431654);
        findViewById.clearAnimation();
        AlphaAnimation A0Q2 = C72463Mc.A0Q();
        A0Q2.setDuration(160);
        A0Q2.setFillBefore(true);
        A0Q2.setFillAfter(true);
        findViewById.startAnimation(A0Q2);
        view.findViewById(2131430949).setClipBounds((Rect) null);
        r6.A11.setClipBounds((Rect) null);
        View findViewById2 = view.findViewById(2131436900);
        findViewById2.clearAnimation();
        ((ImageView) findViewById2).getDrawable().setAlpha(255);
    }

    public void A0N() {
        Log.i("VoiceNoteRecordingUI/onPauseActivity/");
        if (C18020vd.A05(C18040vf.A02, this.A0q, 4166)) {
            A0J(this, A0b());
        } else {
            A0U((File) null, (File) null);
        }
    }

    public void A0O() {
        AnonymousClass70T r0 = this.A0I;
        if (r0 != null && r0.A0C()) {
            this.A0I.A04();
            this.A0y.A00();
            C132116mE r02 = this.A0G;
            if (r02 != null) {
                r02.A00();
                this.A0G = null;
            }
        }
        A09(this);
        this.A0T.removeCallbacks(this.A1J);
    }

    public /* synthetic */ void A0P() {
        AnonymousClass1BI r7;
        AnonymousClass7OH r5 = this.A15;
        boolean z = !this.A0O;
        View view = this.A0Y;
        View view2 = r5.A01;
        view2.setActivated(z);
        if (z) {
            int A062 = C108945cZ.A06(view) - view2.getHeight();
            AnonymousClass1KB r3 = r5.A0G;
            String string = r5.A06.getString(2131897913);
            AnonymousClass1KB.A01(r3, "toast");
            Toast A032 = r3.A03(string);
            A032.setGravity(49, 0, A062);
            A032.show();
        }
        this.A0O = !this.A0O;
        if (C18020vd.A05(C18040vf.A02, this.A0q, 2832) && this.A0O && !A0b() && (r7 = this.A0C) != null) {
            AnonymousClass1GP supportFragmentManager = this.A0a.getSupportFragmentManager();
            C34441kU r0 = this.A1V;
            AnonymousClass3Ma.A1N(r0, 0, supportFragmentManager);
            if (!r0.A00.A01((Object) null, "ephemeral_view_once") && supportFragmentManager.A0Q("view_once_nux_v2") == null) {
                Bundle A0D2 = C17880vN.A0D();
                AnonymousClass3MY.A15(A0D2, r7, "CHAT_JID");
                A0D2.putInt("MESSAGE_TYPE", 82);
                A0D2.putBoolean("IN_GROUP", C22971Dz.A0e(r7));
                A0D2.putBoolean("FORCE_SHOW", false);
                ViewOnceNuxBottomSheet viewOnceNuxBottomSheet = new ViewOnceNuxBottomSheet();
                viewOnceNuxBottomSheet.A1R(A0D2);
                viewOnceNuxBottomSheet.A2C(supportFragmentManager, "view_once_nux_v2");
            }
        }
    }

    public void A0Q(long j) {
        if (TextUtils.isEmpty(this.A0Z.getText().toString().trim()) && this.A19.A00()) {
            C18030ve r2 = this.A0q;
            C18070vi.A0d(r2, 0);
            if (C18020vd.A05(C18040vf.A02, r2, 12555)) {
                this.A12.CGL(new C146487Ph(this, j, 29), "VoiceNoteRecordingUi-Worker");
            } else if (A0c()) {
                this.A0g.CGP(new C146487Ph(this, j, 27));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r6 == null) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(java.io.File r5, java.io.File r6) {
        /*
            r4 = this;
            java.lang.String r2 = "VoiceNoteRecordingUI/pauseRecording/stop waveform creation failed"
            if (r5 == 0) goto L_0x0007
            r1 = 0
            if (r6 != 0) goto L_0x0008
        L_0x0007:
            r1 = 1
        L_0x0008:
            boolean r0 = r4.A0b()
            if (r0 != 0) goto L_0x0016
            if (r1 == 0) goto L_0x0016
            java.lang.String r0 = "VoiceNoteRecordingUI/pauseRecording/voice recorder ir null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0015:
            return
        L_0x0016:
            X.72K r0 = r4.A0J     // Catch:{ IOException -> 0x0046 }
            if (r0 == 0) goto L_0x0041
            java.io.File r5 = r0.A03()     // Catch:{ IOException -> 0x0046 }
            X.72K r0 = r4.A0J     // Catch:{ IOException -> 0x0046 }
            X.0vl r0 = r0.A0E     // Catch:{ IOException -> 0x0046 }
            java.lang.Object r6 = r0.getValue()     // Catch:{ IOException -> 0x0046 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ IOException -> 0x0046 }
            X.72K r3 = r4.A0J     // Catch:{ IOException -> 0x0046 }
            X.0vl r1 = r3.A0D     // Catch:{ IOException -> 0x0046 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x0046 }
            com.whatsapp.util.OpusRecorder r0 = (com.whatsapp.util.OpusRecorder) r0     // Catch:{ IOException -> 0x0046 }
            r0.pause()     // Catch:{ IOException -> 0x0046 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x0046 }
            com.whatsapp.util.OpusRecorder r0 = (com.whatsapp.util.OpusRecorder) r0     // Catch:{ IOException -> 0x0046 }
            long r0 = r0.getPageNumber()     // Catch:{ IOException -> 0x0046 }
            r3.A01 = r0     // Catch:{ IOException -> 0x0046 }
        L_0x0041:
            r0 = 2
            A0D(r4, r0)     // Catch:{ IOException -> 0x0046 }
            goto L_0x0054
        L_0x0046:
            r1 = move-exception
            java.lang.String r0 = "VoiceNoteRecordingUI/pauseRecording/pause failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x006e }
            X.72K r0 = r4.A0J     // Catch:{ IOException -> 0x0069 }
            if (r0 == 0) goto L_0x0015
            r0.A05()     // Catch:{ IOException -> 0x0069 }
            goto L_0x0068
        L_0x0054:
            X.72K r0 = r4.A0J     // Catch:{ IOException -> 0x005c }
            if (r0 == 0) goto L_0x0060
            r0.A05()     // Catch:{ IOException -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
        L_0x0060:
            X.1KB r1 = r4.A0g
            r0 = 34
            X.AnonymousClass7RO.A01(r1, r4, r5, r6, r0)
            return
        L_0x0068:
            return
        L_0x0069:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
            return
        L_0x006e:
            r1 = move-exception
            X.72K r0 = r4.A0J     // Catch:{ IOException -> 0x0077 }
            if (r0 == 0) goto L_0x007b
            r0.A05()     // Catch:{ IOException -> 0x0077 }
            throw r1
        L_0x0077:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
        L_0x007b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74M.A0T(java.io.File, java.io.File):void");
    }

    public void A0U(File file, File file2) {
        C128036fL r2 = this.A1E;
        r2.A00.execute(new AnonymousClass7RO(this, file, file2, 33));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (r4.A0O == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(java.io.File r24, java.io.File r25, long r26, boolean r28) {
        /*
            r23 = this;
            r5 = r24
            X.C17960vV.A07(r5)
            r4 = r23
            X.1BI r0 = r4.A0C
            X.C17960vV.A07(r0)
            X.10I r6 = r4.A12
            r1 = 28
            X.7Ph r0 = new X.7Ph
            r2 = r26
            r0.<init>(r4, r2, r1)
            r6.CGF(r0)
            X.17r r2 = r4.A0f
            X.0vc r1 = r4.A0u
            X.1BI r0 = r4.A0C
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x00ac
            X.1So r0 = X.C26551So.A0W
        L_0x0028:
            r3 = 1
            java.io.File r2 = X.C26511Sk.A0E(r2, r1, r0, r5, r3)
            boolean r0 = r5.renameTo(r2)
            if (r0 != 0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voicenote/sendvoicenotefile/failed to rename "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " to "
            X.C17900vP.A0X(r2, r0, r1)
            r2 = r5
        L_0x0045:
            X.2rc r10 = new X.2rc
            r10.<init>()
            r10.A0G = r2
            X.1Sb r8 = r4.A0s
            X.1BI r11 = r4.A0C
            X.206 r12 = r4.A0E
            X.0ve r0 = r4.A0q
            r7 = 2832(0xb10, float:3.968E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r0, r7)
            r6 = 0
            if (r0 == 0) goto L_0x0064
            boolean r0 = r4.A0O
            r1 = 1
            if (r0 != 0) goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            r9 = 0
            r18 = 2
            X.0ve r0 = r8.A0A
            boolean r0 = X.C18020vd.A05(r2, r0, r7)
            if (r0 == 0) goto L_0x0074
            if (r1 == 0) goto L_0x0074
            r18 = 82
        L_0x0074:
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r22 = r6
            r21 = r28
            r13 = r9
            r19 = r3
            r20 = r6
            X.21V r3 = r8.A03(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.3hL r2 = r4.A0A
            if (r2 == 0) goto L_0x0098
            X.4Xd r1 = r4.A0B
            if (r1 == 0) goto L_0x0098
            X.4Rp r0 = r4.A0l
            X.Abv r0 = r0.A00(r2, r1, r6)
            X.C60532oB.A01(r0, r3)
        L_0x0098:
            int r0 = r3.A0D
            if (r0 != 0) goto L_0x00a2
            int r0 = X.C26511Sk.A03(r5)
            r3.A0D = r0
        L_0x00a2:
            X.70C r0 = r4.A0v
            X.22l r3 = (X.C441822l) r3
            r1 = r25
            r0.A01(r9, r3, r1)
            return
        L_0x00ac:
            X.1So r0 = X.C26551So.A0M
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74M.A0V(java.io.File, java.io.File, long, boolean):void");
    }

    public void A0X(boolean z) {
        String str;
        C132526mx r1 = this.A14;
        File file = this.A0K;
        if (file != null) {
            str = file.getName();
        } else {
            str = null;
        }
        r1.A00(str);
        if (z && this.A0C != null) {
            C18030ve r2 = this.A0q;
            if (r2 == null || !C18020vd.A05(C18040vf.A01, r2, 12624)) {
                this.A13.A06(this.A0C);
            } else {
                C146787Qp.A00(this.A12, this, 6);
            }
            this.A0K = null;
            this.A0L = null;
        }
        this.A0T.removeCallbacks(this.A1J);
        if (this.A0I != null) {
            A0O();
            this.A0I.A06();
            this.A0I = null;
        }
        View findViewById = this.A0Y.findViewById(2131431654);
        findViewById.setFocusable(true);
        findViewById.setImportantForAccessibility(1);
        float f = -1.0f;
        if (AnonymousClass3MY.A1b(this.A1U)) {
            f = 1.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(200);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setAnimationListener(new C114525qy(findViewById, this, 3));
        findViewById.startAnimation(translateAnimation);
        AnonymousClass7OH r22 = this.A15;
        r22.A0F.setVisibility(8);
        this.A1B.C77();
        r22.A0D.setVisibility(8);
        VoiceVisualizer voiceVisualizer = r22.A0H;
        voiceVisualizer.A0C.clear();
        voiceVisualizer.A06 = false;
        voiceVisualizer.A03 = 0;
        voiceVisualizer.A04 = 166;
    }

    public void A0Y(boolean z, boolean z2) {
        if (this.A0J != null) {
            if (!z2) {
                AnonymousClass7RJ.A02(this.A12, this, 37);
            }
        } else if (!z2) {
            return;
        }
        View view = this.A0Y;
        view.findViewById(2131428625).setVisibility(4);
        C27411Vz r3 = this.A0i;
        if (r3.A00.A00() >= 16.0d) {
            if (!view.getKeepScreenOn()) {
                view.setKeepScreenOn(true);
            }
            if (!this.A0N) {
                this.A0N = true;
                r3.registerObserver(this.A0h);
            }
        }
        AnonymousClass7OH r32 = this.A15;
        AnonymousClass7O8 r5 = new AnonymousClass7O8(this, z);
        AnonymousClass7OD r2 = new AnonymousClass7OD(this);
        AnonymousClass78L.A00(r32.A09, r5, 33);
        AnonymousClass78L.A00(r32.A0B, r2, 35);
        r32.A0F.setVisibility(0);
        r32.A02();
        VoiceVisualizer voiceVisualizer = r32.A0H;
        voiceVisualizer.setEnabled(true);
        if (r32.A0N) {
            voiceVisualizer.setVisibility(0);
        }
        r32.A0E.setVisibility(0);
        r32.A0K.A04(8);
        if (!z2) {
            A0D(this, 8);
        }
        AnonymousClass2LC r1 = this.A18;
        Log.i("voicenote/notifyVoiceNoteLocked");
        C17960vV.A02();
        AnonymousClass7KX.A00(r1, 35);
        AnonymousClass70F r22 = this.A0w;
        r22.A0A = true;
        r22.A08 = true;
        ImageView imageView = r22.A0O;
        if (imageView.isLaidOut()) {
            AnonymousClass70F.A00(r22);
        } else {
            AnonymousClass793.A00(imageView.getViewTreeObserver(), r22, 17);
        }
        AnonymousClass3MY.A1B(view, 2131436920, 8);
    }

    public boolean A0a() {
        return C108995ce.A1U(this.A15.A0F);
    }

    public boolean A0b() {
        AnonymousClass72K r0 = this.A0J;
        if (r0 == null || !AnonymousClass72K.A00(r0).isRecording()) {
            return false;
        }
        return true;
    }

    public boolean A0c() {
        C126726dC r2 = this.A1Z;
        if (r2 != null) {
            AnonymousClass7RJ.A01(this.A0g, r2, 38);
        }
        this.A0P = false;
        A0D(this, 1);
        if (C22781De.A03()) {
            AnonymousClass10I r22 = this.A12;
            C136446tp r1 = this.A1A;
            r1.getClass();
            AnonymousClass7RJ.A02(r22, r1, 39);
        } else {
            this.A1A.A00();
        }
        if (this.A0v.A04(this.A0a, this.A0e, this.A0C)) {
            if (this.A0J != null) {
                Log.e("VoiceNoteRecordingUi/startVoiceNote/inProgress");
            } else {
                AnonymousClass7RJ.A01(this.A0g, this, 40);
                return true;
            }
        }
        return false;
    }

    public static void A0H(AnonymousClass74M r2, File file) {
        C17960vV.A07(file);
        try {
            AnonymousClass70T r0 = r2.A0I;
            if (r0 != null) {
                r0.A06();
            }
            AnonymousClass70T A002 = AnonymousClass70T.A00((AnonymousClass118) null, (C18030ve) null, (AnonymousClass6gC) null, file, 3);
            r2.A0I = A002;
            A002.A05();
            r2.A0I.A0B(r2.A1X);
        } catch (IOException e) {
            r2.A0I = null;
            Log.e("voicenoterecordingui/prepareVoiceNoteDraftPlayer/ error creating audio player for voice note preview ", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005c, code lost:
        if (r13.A0O == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0I(X.AnonymousClass74M r13, java.io.File r14, int r15, boolean r16) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voicenote/onrecordingstopped "
            r2 = r16
            X.C17900vP.A0n(r0, r1, r2)
            X.68R r0 = r13.A0D
            X.34B r0 = r0.A00
            X.73e r0 = r0.A0O
            r0.A09()
            X.68R r0 = r13.A0D
            r0.A01 = r2
            X.68R r1 = r13.A0D
            r0 = 1
            r1.A02 = r0
            if (r16 == 0) goto L_0x0083
            X.2rc r4 = new X.2rc
            r4.<init>()
            r4.A0Q = r0
            X.68R r0 = r13.A0D
            X.2h8 r0 = r0.A02
            java.io.File r0 = r0.A07
            X.C17960vV.A07(r0)
            r4.A0G = r0
            X.1he r3 = r13.A1W
            X.1BI r5 = r13.A0C
            X.C17960vV.A07(r5)
            X.11P r0 = r13.A0n
            long r8 = X.AnonymousClass11P.A01(r0)
            java.io.File r0 = r4.A0G
            java.lang.String r7 = r0.getName()
            java.io.File r0 = r4.A0G
            long r10 = r0.length()
            X.206 r6 = r13.A0E
            X.0ve r2 = r13.A0q
            r1 = 2832(0xb10, float:3.968E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 0
            if (r0 == 0) goto L_0x005e
            boolean r0 = r13.A0O
            r12 = 1
            if (r0 != 0) goto L_0x005f
        L_0x005e:
            r12 = 0
        L_0x005f:
            X.22l r4 = r3.A00(r4, r5, r6, r7, r8, r10, r12)
            r4.A0D = r15
            X.3hL r3 = r13.A0A
            if (r3 == 0) goto L_0x0076
            X.4Xd r1 = r13.A0B
            if (r1 == 0) goto L_0x0076
            X.4Rp r0 = r13.A0l
            X.Abv r0 = r0.A00(r3, r1, r2)
            X.C60532oB.A01(r0, r4)
        L_0x0076:
            X.68R r0 = r13.A0D
            X.34B r1 = r0.A00
            X.70C r0 = r13.A0v
            r0.A01(r1, r4, r14)
        L_0x007f:
            r0 = 0
            r13.A0D = r0
            return
        L_0x0083:
            X.1hs r2 = r13.A0t
            X.68R r1 = r13.A0D
            java.lang.String r0 = "app/mediajobmanager/cancelVoiceNoteUpload"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1T6 r3 = r2.A09
            X.34B r2 = r1.A00
            X.10I r1 = r3.A0D
            X.7Qr r0 = new X.7Qr
            r0.<init>(r3, r2)
            r1.CGF(r0)
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74M.A0I(X.74M, java.io.File, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r1 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(java.io.File r6, java.io.File r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            A0H(r5, r6)
            X.70T r0 = r5.A0I
            if (r0 == 0) goto L_0x00ad
            int r0 = r0.A03()
            long r0 = (long) r0
            r5.A05 = r0
            A09(r5)
            X.7OH r4 = r5.A15
            X.6dA r2 = new X.6dA
            r2.<init>(r5)
            android.view.View r1 = r4.A00
            r0 = 34
            X.AnonymousClass78L.A00(r1, r2, r0)
            long r0 = r5.A05
            r4.A04(r0)
            X.70T r2 = r5.A0I
            X.72K r0 = r5.A0J
            if (r0 == 0) goto L_0x0035
            com.whatsapp.util.OpusRecorder r0 = X.AnonymousClass72K.A00(r0)
            boolean r1 = r0.isRecording()
            r0 = 1
            if (r1 == 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r4.A05(r2, r7, r9, r0)
            A0A(r5)
            android.view.View r2 = r5.A0Y
            r0 = 2131436898(0x7f0b2562, float:1.849568E38)
            X.C108975cc.A0t(r2, r0)
            r0 = 2131431654(0x7f0b10e6, float:1.8485043E38)
            android.view.View r0 = r2.findViewById(r0)
            r1 = 4
            r0.setVisibility(r1)
            r0 = 2131428625(0x7f0b0511, float:1.84789E38)
            X.AnonymousClass3MY.A1B(r2, r0, r1)
            r0 = 2131430163(0x7f0b0b13, float:1.848202E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 10
            X.C108955ca.A1K(r1, r5, r0)
            X.70F r2 = r5.A0w
            android.view.View r0 = r2.A0L
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A0O
            r0.setVisibility(r1)
            X.5eR r1 = r2.A05
            if (r1 == 0) goto L_0x0077
            r0 = 4
            r1.setVisibility(r0)
        L_0x0077:
            r1 = 0
            android.view.ViewGroup r0 = r4.A0F
            r0.setVisibility(r1)
            r3 = 1
            r0.setClickable(r3)
            X.7O9 r2 = new X.7O9
            r2.<init>(r5, r6)
            android.view.View r1 = r4.A09
            r0 = 33
            X.AnonymousClass78L.A00(r1, r2, r0)
            X.79V r1 = new X.79V
            r1.<init>(r5, r3)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r0 = r4.A05
            r0.setOnSeekBarChangeListener(r1)
            X.7Eb r1 = new X.7Eb
            r1.<init>(r5)
            com.whatsapp.conversation.waveforms.VoiceVisualizer r0 = r4.A03
            r0.A05 = r1
            if (r8 == 0) goto L_0x00a9
            X.10I r1 = r5.A12
            r0 = 44
            X.AnonymousClass7RJ.A02(r1, r5, r0)
        L_0x00a9:
            r5.A0K = r6
            r5.A0L = r7
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74M.A0W(java.io.File, java.io.File, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r1 != 3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0d(android.view.MotionEvent r5, android.view.View r6, boolean r7) {
        /*
            r4 = this;
            int r1 = r5.getAction()
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L_0x004a
            if (r1 == r3) goto L_0x0021
            r0 = 2
            if (r1 == r0) goto L_0x0011
            r0 = 3
            if (r1 == r0) goto L_0x0021
        L_0x0010:
            return r2
        L_0x0011:
            boolean r0 = r4.A0Q
            if (r0 != 0) goto L_0x0010
            X.70F r1 = r4.A0w
            android.widget.TextView r0 = r4.A0Z
            int r0 = r0.getWidth()
            r1.A03(r5, r0, r7)
            return r2
        L_0x0021:
            android.widget.TextView r0 = r4.A0Z
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            boolean r0 = r4.A0Q
            if (r0 != 0) goto L_0x0010
            X.70F r0 = r4.A0w
            boolean r0 = r0.A05(r1, r7, r3)
            if (r0 == 0) goto L_0x0010
            if (r1 != 0) goto L_0x0010
            r6.playSoundEffect(r2)
            X.8AX r0 = r4.A1B
            r0.C5D()
            return r2
        L_0x004a:
            android.view.View r0 = r4.A0V
            r0.clearFocus()
            r6.setFocusable(r3)
            r6.setFocusableInTouchMode(r3)
            r6.requestFocus()
            X.3V4 r0 = r4.A0k
            r0.A0T()
            X.70F r1 = r4.A0w
            float r0 = r5.getX()
            r1.A00 = r0
            float r0 = r5.getY()
            r1.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74M.A0d(android.view.MotionEvent, android.view.View, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.6So, java.lang.Number] */
    /* JADX WARNING: type inference failed for: r12v0, types: [X.6So, java.lang.Number] */
    public AnonymousClass74M(View view, AnonymousClass1FL r46, C19880zA r47, AnonymousClass190 r48, AnonymousClass1FR r49, C218617r r50, AnonymousClass1KB r51, C33251iW r52, AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, C27411Vz r55, C31131f4 r56, AnonymousClass3V4 r57, C86434Rp r58, AnonymousClass11C r59, AnonymousClass11P r60, AnonymousClass118 r61, C19830z4 r62, C18000vb r63, C223819r r64, C18030ve r65, C26421Sb r66, C32861hs r67, C34441kU r68, AnonymousClass1L1 r69, C18010vc r70, C32721he r71, AnonymousClass70C r72, C139296yb r73, C136776uN r74, C87684Wn r75, AnonymousClass1DC r76, AnonymousClass10I r77, AnonymousClass73X r78, C132526mx r79, AnonymousClass7OH r80, C130236j6 r81, C132156mI r82, AnonymousClass2LC r83, C132536my r84, AnonymousClass8AX r85, C126726dC r86, C143857Fb r87, C128036fL r88, C133016o2 r89, AnonymousClass1VT r90, AnonymousClass00H r91, AnonymousClass00H r92, boolean z, boolean z2, boolean z3) {
        int A002;
        Handler A0D2 = C17890vO.A0D();
        this.A0T = A0D2;
        ? number = new Number();
        number.A00 = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.A0b = number;
        ? number2 = new Number();
        number2.A00 = new AtomicLong(Double.doubleToRawLongBits(Double.MIN_VALUE));
        this.A0c = number2;
        this.A0S = AnonymousClass3MW.A07();
        this.A0O = false;
        this.A04 = -1;
        AnonymousClass7OI r6 = new AnonymousClass7OI(this, 4);
        this.A1a = r6;
        this.A1X = new AnonymousClass7N3(this, 1);
        this.A1K = new AtomicInteger(0);
        this.A0h = new AnonymousClass7CP(this);
        AnonymousClass11P r40 = r60;
        this.A0n = r40;
        C18030ve r2 = r65;
        this.A0q = r2;
        this.A0g = r51;
        this.A0v = r72;
        this.A0d = r48;
        AnonymousClass10I r39 = r77;
        this.A12 = r39;
        this.A0f = r50;
        this.A0y = r74;
        C33251iW r43 = r52;
        this.A1R = r43;
        this.A0s = r66;
        AnonymousClass1VT r15 = r90;
        this.A1b = r15;
        this.A14 = r79;
        this.A1Y = r76;
        AnonymousClass11C r41 = r59;
        this.A0m = r41;
        C18000vb r18 = r63;
        this.A1U = r18;
        this.A1V = r68;
        this.A1S = audioRecordFactory;
        AnonymousClass7OH r38 = r80;
        this.A15 = r38;
        C19830z4 r31 = r62;
        this.A0o = r31;
        this.A18 = r83;
        this.A0i = r55;
        this.A13 = r78;
        this.A1W = r71;
        this.A1H = r91;
        this.A0t = r67;
        this.A0u = r70;
        this.A1I = r92;
        this.A0x = r73;
        this.A0p = r64;
        this.A1T = opusRecorderFactory;
        this.A0l = r58;
        this.A19 = r84;
        boolean z4 = z;
        this.A1M = z4;
        this.A1N = z2;
        this.A0z = r75;
        this.A0j = r56;
        AnonymousClass1FL r10 = r46;
        this.A0a = r10;
        this.A0e = r49;
        View view2 = view;
        this.A0Y = view2;
        this.A1B = r85;
        this.A0r = (C32171gl) r47.A04();
        C18040vf r5 = C18040vf.A02;
        this.A1O = C18020vd.A05(r5, r2, 1139);
        AnonymousClass3V4 r42 = r57;
        this.A0k = r42;
        C18070vi.A0d(view2, 0);
        C143857Fb r8 = r87;
        this.A1C = new C130456jS(view2, r8.A00, r8.A01);
        this.A1Z = r86;
        this.A16 = r81;
        this.A1c = z3;
        this.A1F = r89;
        this.A1E = r88;
        C132156mI r37 = r82;
        this.A17 = r37;
        boolean A052 = C18020vd.A05(r5, r2, 11649);
        this.A1L = A052;
        AnonymousClass3MW.A0G(view2, 2131436881).setImageResource(2131232101);
        C28931bI.A00(view2, 2131436865).A02();
        C28931bI.A00(view2, 2131436864).A02();
        ViewGroup A0C2 = AnonymousClass3MW.A0C(view2, 2131436899);
        ImageView A0G2 = AnonymousClass3MW.A0G(view2, 2131436881);
        TextView A0J2 = AnonymousClass3MW.A0J(view2, 2131436901);
        AnonymousClass11P r29 = r40;
        AnonymousClass1FL r182 = r10;
        AnonymousClass70F r17 = new AnonymousClass70F(r182, AnonymousClass1HF.A06(view2, 2131436904), AnonymousClass1HF.A06(view2, 2131436903), AnonymousClass1HF.A06(view2, 2131436902), AnonymousClass1HF.A06(view2, 2131436865), AnonymousClass1HF.A06(view2, 2131436864), AnonymousClass1HF.A06(view2, 2131436867), AnonymousClass1HF.A06(view2, 2131436898), A0C2, A0G2, A0J2, r29, r61, r31, r18, new C145417Le(this, 1), r10.getResources().getDimension(2131169225), 0, AnonymousClass000.A1O(z4 ? 1 : 0));
        this.A0w = r17;
        r17.A04 = new C145407Ld(view2, r10, r42, r41, this);
        if (A052) {
            C146787Qp.A00(this.A12, this, 5);
            if (A1i == null) {
                A002 = A00(this.A0a.getApplicationContext(), new SoundPool.Builder().setMaxStreams(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).build());
            }
            this.A11 = (ClippingLayout) view2.findViewById(2131436883);
            this.A0Z = C17880vN.A0E(view2, 2131430490);
            View findViewById = view2.findViewById(2131431653);
            this.A0W = findViewById;
            this.A10 = (ClippingLayout) view2.findViewById(2131430949);
            this.A0V = findViewById.findViewById(2131430490);
            r2.A0N(746);
            AnonymousClass3MW.A0D(view2, 2131436920).addView(new C109895eE(r10, this, 2), -1, -1);
            this.A0X = view2.findViewById(2131434297);
            r15.registerObserver(r6);
            long A082 = C108995ce.A08(r2, 3657);
            C126716dB r7 = new C126716dB(this);
            this.A1A = new C136446tp(r69, r37, r7);
            this.A0U = new C109625dk(number2, r43, r40, r38, new AnonymousClass7OA(this, 1), new AnonymousClass7OA(this, 2), new AnonymousClass7OA(this, 3), new AnonymousClass7OA(this, 4), r7, new AnonymousClass7OF(this, 0), new AnonymousClass7OF(this, 1), A082);
            this.A1J = new C146617Py(new AnonymousClass7OF(this, 2), new AnonymousClass7OF(this, 3), A0D2, r7, 24);
            this.A1D = new AnonymousClass7OE(r39, this);
            this.A1Q = C18020vd.A00(r5, r2, 7333);
            this.A1P = C18020vd.A00(r5, r2, 7334);
        }
        PowerManager A0G3 = r41.A0G();
        if (A0G3 == null) {
            Log.w("voicenoterecordingui pm=null");
        } else {
            this.A09 = C181789Rv.A00(A0G3, "voicenote", 6);
        }
        A002 = A1i == null ? A00(r10, new SoundPool(1, 1, 0)) : A002;
        this.A11 = (ClippingLayout) view2.findViewById(2131436883);
        this.A0Z = C17880vN.A0E(view2, 2131430490);
        View findViewById2 = view2.findViewById(2131431653);
        this.A0W = findViewById2;
        this.A10 = (ClippingLayout) view2.findViewById(2131430949);
        this.A0V = findViewById2.findViewById(2131430490);
        r2.A0N(746);
        AnonymousClass3MW.A0D(view2, 2131436920).addView(new C109895eE(r10, this, 2), -1, -1);
        this.A0X = view2.findViewById(2131434297);
        r15.registerObserver(r6);
        long A0822 = C108995ce.A08(r2, 3657);
        C126716dB r710 = new C126716dB(this);
        this.A1A = new C136446tp(r69, r37, r710);
        this.A0U = new C109625dk(number2, r43, r40, r38, new AnonymousClass7OA(this, 1), new AnonymousClass7OA(this, 2), new AnonymousClass7OA(this, 3), new AnonymousClass7OA(this, 4), r710, new AnonymousClass7OF(this, 0), new AnonymousClass7OF(this, 1), A0822);
        this.A1J = new C146617Py(new AnonymousClass7OF(this, 2), new AnonymousClass7OF(this, 3), A0D2, r710, 24);
        this.A1D = new AnonymousClass7OE(r39, this);
        this.A1Q = C18020vd.A00(r5, r2, 7333);
        this.A1P = C18020vd.A00(r5, r2, 7334);
        A1d = A002;
        this.A11 = (ClippingLayout) view2.findViewById(2131436883);
        this.A0Z = C17880vN.A0E(view2, 2131430490);
        View findViewById22 = view2.findViewById(2131431653);
        this.A0W = findViewById22;
        this.A10 = (ClippingLayout) view2.findViewById(2131430949);
        this.A0V = findViewById22.findViewById(2131430490);
        r2.A0N(746);
        AnonymousClass3MW.A0D(view2, 2131436920).addView(new C109895eE(r10, this, 2), -1, -1);
        this.A0X = view2.findViewById(2131434297);
        r15.registerObserver(r6);
        long A08222 = C108995ce.A08(r2, 3657);
        C126716dB r7102 = new C126716dB(this);
        this.A1A = new C136446tp(r69, r37, r7102);
        this.A0U = new C109625dk(number2, r43, r40, r38, new AnonymousClass7OA(this, 1), new AnonymousClass7OA(this, 2), new AnonymousClass7OA(this, 3), new AnonymousClass7OA(this, 4), r7102, new AnonymousClass7OF(this, 0), new AnonymousClass7OF(this, 1), A08222);
        this.A1J = new C146617Py(new AnonymousClass7OF(this, 2), new AnonymousClass7OF(this, 3), A0D2, r7102, 24);
        this.A1D = new AnonymousClass7OE(r39, this);
        this.A1Q = C18020vd.A00(r5, r2, 7333);
        this.A1P = C18020vd.A00(r5, r2, 7334);
    }
}
