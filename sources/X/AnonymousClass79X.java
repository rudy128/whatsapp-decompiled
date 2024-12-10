package X;

import android.widget.SeekBar;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.79X  reason: invalid class name */
public class AnonymousClass79X implements SeekBar.OnSeekBarChangeListener {
    public AnonymousClass79T A00;
    public boolean A01;
    public final C31131f4 A02;
    public final AudioPlayerView A03;
    public final C1602887w A04;
    public final AnonymousClass00H A05;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        VoiceVisualizer voiceVisualizer;
        if (z) {
            AnonymousClass79T r0 = this.A00;
            r0.onProgressChanged(seekBar, i, z);
            r0.A00(i / 1000);
            AudioPlayerView audioPlayerView = this.A03;
            audioPlayerView.setSeekbarContentDescription((long) audioPlayerView.getSeekbarProgress());
        }
        AudioPlayerView audioPlayerView2 = this.A03;
        C28931bI r1 = audioPlayerView2.A04;
        if (r1 == null) {
            C18070vi.A11("voiceVisualizerViewStubHolder");
            throw null;
        }
        if (!(r1.A00 == null || (voiceVisualizer = (VoiceVisualizer) r1.A02()) == null || !voiceVisualizer.isEnabled())) {
            voiceVisualizer.setPlaybackPercentage((((float) i) * 1.0f) / ((float) audioPlayerView2.A00));
        }
        C441822l BRY = this.A04.BRY();
        int seekbarProgress = audioPlayerView2.getSeekbarProgress();
        C17890vO.A0z(BRY.A0v, C145777Mo.A17, seekbarProgress);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C441822l BRY = this.A04.BRY();
        this.A01 = false;
        C31131f4 r2 = this.A02;
        C145777Mo A002 = r2.A00();
        if (r2.A0D(BRY) && r2.A0B() && A002 != null) {
            A002.A0F(true);
            this.A01 = true;
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C441822l BRY = this.A04.BRY();
        AnonymousClass79T r2 = this.A00;
        r2.onStopTrackingTouch(seekBar);
        C31131f4 r1 = this.A02;
        if (!r1.A0D(BRY) || r1.A0B() || !this.A01) {
            r2.A00(BRY.A0D);
            int seekbarProgress = this.A03.getSeekbarProgress();
            ((AnonymousClass8AF) this.A05.get()).CKH(BRY.A0x, seekbarProgress);
            C17890vO.A0z(BRY.A0v, C145777Mo.A17, seekbarProgress);
            return;
        }
        int i = 0;
        this.A01 = false;
        C145777Mo A002 = r1.A00();
        if (A002 != null) {
            A002.A0B(this.A03.getSeekbarProgress());
            if (BRY.A1L()) {
                i = C145777Mo.A15;
            }
            A002.A0C(i, true, false);
        }
    }

    public AnonymousClass79X(C31131f4 r1, AudioPlayerView audioPlayerView, C1602887w r3, AnonymousClass79T r4, AnonymousClass00H r5) {
        this.A03 = audioPlayerView;
        this.A04 = r3;
        this.A02 = r1;
        this.A05 = r5;
        this.A00 = r4;
    }
}
