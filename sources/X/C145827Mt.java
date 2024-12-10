package X;

import android.os.Handler;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;
import com.whatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Mt  reason: invalid class name and case insensitive filesystem */
public final class C145827Mt implements AnonymousClass861 {
    public static final long A0M;
    public static final long A0N;
    public static final long A0O;
    public static final long A0P;
    public int A00 = -1;
    public long A01 = -1;
    public PowerManager.WakeLock A02;
    public TextStatusComposerFragment A03;
    public AnonymousClass6LS A04;
    public AnonymousClass6LS A05;
    public C109635dl A06;
    public C145847Mv A07;
    public File A08;
    public File A09;
    public boolean A0A;
    public byte[] A0B;
    public long A0C;
    public final C131336kv A0D;
    public final AnonymousClass6a0 A0E;
    public final AnonymousClass1FR A0F;
    public final C32741hg A0G;
    public final C1608089z A0H;
    public final AnonymousClass88G A0I;
    public final C136776uN A0J;
    public final AnonymousClass10I A0K;
    public final C18030ve A0L;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0O = timeUnit.toMillis(1);
        A0M = timeUnit.toMillis(3);
        A0P = timeUnit.toMillis(30);
        A0N = timeUnit.toMillis(5);
    }

    public static final long A00(C145827Mt r3) {
        int A002 = C18020vd.A00(C18040vf.A02, r3.A0L, 6845);
        if (A002 <= 0) {
            return A0P;
        }
        return ((long) A002) * A0O;
    }

    public static final void A01(C145827Mt r5) {
        r5.A0H.Bc1();
        C32741hg r0 = r5.A0G;
        long j = r5.A0C;
        C63742tc A0Y = C108965cb.A0Y(r0);
        if (C63742tc.A03(A0Y)) {
            AnonymousClass2HA A002 = C63742tc.A00(A0Y);
            C108995ce.A1C(A002, 30);
            A002.A08 = Long.valueOf((j / 1000) * 1000);
            A0Y.A01.CC7(A002);
        }
    }

    public static final void A02(C145827Mt r1, File file) {
        if (file != null) {
            AnonymousClass7RI.A01(r1.A0K, file, 49);
        }
    }

    public static final void A03(C145827Mt r4, boolean z) {
        C109635dl r3 = r4.A06;
        if (r3 != null) {
            Handler handler = r3.A03;
            if (handler != null) {
                handler.post(new C70813Cp(41, (Object) r3, z));
            }
            r4.A06 = null;
            r4.A0J.A00();
            PowerManager.WakeLock wakeLock = r4.A02;
            if (wakeLock != null) {
                wakeLock.release();
            }
            r4.A0A = false;
            AnonymousClass3Ma.A05((View) r4.A0H).setRequestedOrientation(-1);
        }
    }

    public void A04() {
        TextStatusComposerFragment textStatusComposerFragment = this.A03;
        if (textStatusComposerFragment != null) {
            AnonymousClass7J1 r2 = textStatusComposerFragment.A0n;
            if (r2 != null && r2.A07.A00 == AnonymousClass00R.A0N) {
                r2.A07 = new C121226Iq(r2);
                r2.A0B = false;
                r2.A08.A03(300);
            }
            TextStatusComposerFragment.A0A(textStatusComposerFragment);
            AnonymousClass886 A002 = TextStatusComposerFragment.A00(textStatusComposerFragment);
            if (A002 != null) {
                A002.CAO();
            }
        }
        C145847Mv r0 = this.A07;
        if (r0 != null) {
            r0.A00 = null;
        }
        this.A07 = null;
        A02(this, this.A08);
        this.A08 = null;
        A02(this, this.A09);
        this.A09 = null;
        C63742tc A0Y = C108965cb.A0Y(this.A0G);
        if (C63742tc.A03(A0Y)) {
            AnonymousClass2HA A003 = C63742tc.A00(A0Y);
            C108995ce.A1C(A003, 32);
            A0Y.A01.CC7(A003);
        }
    }

    public final void A05(long j) {
        TextView textView;
        int i;
        this.A0C = j;
        if (j < A00(this)) {
            long millis = TimeUnit.SECONDS.toMillis(1);
            long A002 = (((A00(this) - j) + millis) - 1) / millis;
            C1608089z r5 = this.A0H;
            r5.setRemainingSeconds((int) A002);
            long A003 = A00(this);
            long j2 = A0M;
            int i2 = (A003 > j2 ? 1 : (A003 == j2 ? 0 : -1));
            long A004 = A00(this);
            if (i2 > 0) {
                A004 -= j2;
            }
            if (j < A004 || j % TimeUnit.SECONDS.toMillis(1) <= 500) {
                textView = ((VoiceRecordingView) r5).A03;
                i = 0;
            } else {
                textView = ((VoiceRecordingView) r5).A03;
                i = 4;
            }
            textView.setVisibility(i);
            return;
        }
        C109635dl r2 = this.A06;
        if (r2 != null) {
            Handler handler = r2.A03;
            if (handler != null) {
                handler.post(AnonymousClass7RC.A00(r2, 1));
            }
            A03(this, false);
        }
        A01(this);
        C63742tc A0Y = C108965cb.A0Y(this.A0G);
        if (C63742tc.A03(A0Y)) {
            AnonymousClass2HA A005 = C63742tc.A00(A0Y);
            C108995ce.A1C(A005, 29);
            A0Y.A01.CC7(A005);
        }
        TextStatusComposerFragment textStatusComposerFragment = this.A03;
        if (textStatusComposerFragment != null) {
            AnonymousClass7J1 r22 = textStatusComposerFragment.A0n;
            if (r22 != null && r22.A07.A00 == AnonymousClass00R.A01) {
                C121216Ip r0 = new C121216Ip(r22);
                r22.A07 = r0;
                r0.A00();
                AnonymousClass72I r1 = r22.A08;
                r1.A04((ViewGroup) r22.A0J);
                r1.A02();
            }
            TextStatusComposerFragment.A08(textStatusComposerFragment);
        }
    }

    public C145827Mt(C131336kv r4, AnonymousClass6a0 r5, AnonymousClass1FR r6, AnonymousClass11C r7, C18030ve r8, C32741hg r9, VoiceRecordingView voiceRecordingView, C136776uN r11, AnonymousClass10I r12) {
        C18070vi.A0p(r7, r8, r4);
        C18070vi.A0d(r11, 5);
        C18070vi.A0d(r12, 6);
        C108965cb.A1P(r9, 7, r5);
        C18070vi.A0d(r6, 9);
        this.A0L = r8;
        this.A0D = r4;
        this.A0J = r11;
        this.A0K = r12;
        this.A0G = r9;
        this.A0E = r5;
        this.A0F = r6;
        this.A0H = voiceRecordingView;
        this.A0I = voiceRecordingView;
        PowerManager A0G2 = r7.A0G();
        if (A0G2 != null) {
            this.A02 = C181789Rv.A00(A0G2, "voice-status-recording", 6);
        }
        voiceRecordingView.A09 = this;
    }
}
