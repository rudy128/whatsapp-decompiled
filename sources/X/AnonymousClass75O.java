package X;

import android.media.AudioManager;

/* renamed from: X.75O  reason: invalid class name */
public class AnonymousClass75O implements AudioManager.OnAudioFocusChangeListener {
    public final C31131f4 A00;

    public void onAudioFocusChange(int i) {
        C145777Mo A002 = this.A00.A00();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("messageaudioplayer/onaudiofocuschanged ");
        A10.append(i);
        A10.append(" current player:");
        C17900vP.A0r(A10, AnonymousClass000.A1W(A002));
        if (C22781De.A03() && A002 != null) {
            if (i == -2 || i == -1) {
                if (A002.A0I()) {
                    A002.A0F(false);
                }
            } else if (i == 1) {
                int i2 = C145777Mo.A15;
                if (A002.A0R) {
                    A002.A0C(C145777Mo.A15, true, false);
                }
            }
        }
    }

    public AnonymousClass75O(C31131f4 r1) {
        this.A00 = r1;
    }
}
