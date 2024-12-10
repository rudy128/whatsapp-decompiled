package X;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AlphaAnimation;
import com.whatsapp.camera.recording.RecordingView;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6zv  reason: invalid class name and case insensitive filesystem */
public class C140086zv {
    public long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Handler A04 = new C109595dh(Looper.getMainLooper(), this, 0);
    public final C125716bZ A05;
    public final RecordingView A06;
    public final AnonymousClass11P A07;
    public final C18000vb A08;

    public static String A00(C140086zv r5, long j) {
        Locale A0N = r5.A08.A0N();
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j));
        C17890vO.A1M(A1b, TimeUnit.MILLISECONDS.toSeconds(j) % 60);
        return String.format(A0N, "%02d:%02d", A1b);
    }

    public void A01() {
        Handler handler = this.A04;
        if (handler.hasMessages(0)) {
            handler.removeMessages(0);
        }
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        A02(false, false, false);
    }

    public void A02(boolean z, boolean z2, boolean z3) {
        RecordingView recordingView = this.A06;
        recordingView.setVisibility(C72453Mb.A07(z ? 1 : 0));
        if (z && z3) {
            AlphaAnimation A0Q = C72463Mc.A0Q();
            A0Q.setDuration(220);
            recordingView.startAnimation(A0Q);
        }
        recordingView.setSelected(z2);
        if (!z || !z2) {
            recordingView.A00.setText(A00(this, 0));
            recordingView.A01.setProgress(0);
        }
    }

    public C140086zv(C125716bZ r4, RecordingView recordingView, AnonymousClass11P r6, C18000vb r7, long j, long j2, long j3) {
        this.A05 = r4;
        this.A06 = recordingView;
        this.A08 = r7;
        this.A07 = r6;
        recordingView.A01.setVisibility(8);
        recordingView.A00.setPadding(0, 0, 0, 0);
        recordingView.A00.setTextSize(2, 14.0f);
        recordingView.A00.setLetterSpacing(0.09f);
        recordingView.setBackground(C40501uo.A00((Resources.Theme) null, recordingView.A02.getResources(), 2131231206));
        recordingView.A00.setText(C64052u8.A0D(r7, (String) null, 0));
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
    }

    public boolean A03() {
        return AnonymousClass000.A1R(((SystemClock.elapsedRealtime() - this.A00) > 1000 ? 1 : ((SystemClock.elapsedRealtime() - this.A00) == 1000 ? 0 : -1)));
    }
}
