package X;

import android.os.Handler;
import android.widget.SeekBar;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voicerecorder.VoiceNoteSeekBar;
import java.io.IOException;

/* renamed from: X.79U  reason: invalid class name */
public class AnonymousClass79U implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ MediaViewFragment A00;

    public AnonymousClass79U(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar != null) {
            MediaViewFragment mediaViewFragment = this.A00;
            String A07 = C64052u8.A07(mediaViewFragment.A0W, (long) seekBar.getProgress());
            VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1F;
            if (voiceNoteSeekBar != null) {
                voiceNoteSeekBar.setContentDescription(mediaViewFragment.A1I(2131898071, AnonymousClass000.A1b(A07, 1)));
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass70T r0 = mediaViewFragment.A18;
        if (r0 != null && r0.A0C()) {
            mediaViewFragment.A18.A04();
        }
        Handler handler = mediaViewFragment.A07;
        if (handler != null) {
            handler.removeMessages(0);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        MediaViewFragment mediaViewFragment = this.A00;
        AnonymousClass70T r5 = mediaViewFragment.A18;
        if (r5 == null) {
            VoiceNoteSeekBar voiceNoteSeekBar = mediaViewFragment.A1F;
            if (voiceNoteSeekBar != null) {
                voiceNoteSeekBar.setProgress(0);
            }
        } else if (mediaViewFragment.A02 == 1) {
            try {
                if (mediaViewFragment.A1F != null) {
                    r5.A0A((int) (((float) r5.A03()) * (((float) mediaViewFragment.A1F.getProgress()) / ((float) mediaViewFragment.A1F.getMax()))));
                }
                mediaViewFragment.A18.A08();
                Handler handler = mediaViewFragment.A07;
                if (handler != null) {
                    handler.sendEmptyMessage(0);
                }
                MediaViewFragment.A0F(mediaViewFragment);
            } catch (IOException e) {
                Log.e("MediaViewFragment/onStopTrackingTouch/fail onStopTracking", e);
                C108995ce.A11(mediaViewFragment);
            }
        } else if (mediaViewFragment.A1F != null) {
            int A03 = (int) (((float) r5.A03()) * (((float) mediaViewFragment.A1F.getProgress()) / ((float) mediaViewFragment.A1F.getMax())));
            AnonymousClass21V A04 = MediaViewFragment.A04(mediaViewFragment, mediaViewFragment.A04);
            if (A04 != null) {
                MediaViewFragment.A0g(mediaViewFragment, A04, A03, false);
            }
        }
    }
}
