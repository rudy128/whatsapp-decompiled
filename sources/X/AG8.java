package X;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

public class AG8 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference A00;

    public AG8(SeekBarPreference seekBarPreference) {
        this.A00 = seekBarPreference;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.A00;
            if (seekBarPreference.A0B || !seekBarPreference.A0A) {
                int progress = seekBarPreference.A01 + seekBar.getProgress();
                if (progress != seekBarPreference.A03) {
                    Integer valueOf = Integer.valueOf(progress);
                    B6V b6v = seekBarPreference.A0A;
                    if (b6v != null) {
                        b6v.C1R(seekBarPreference, valueOf);
                    }
                    SeekBarPreference.A00(seekBarPreference, progress, false);
                    return;
                }
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.A00;
        int i2 = i + seekBarPreference2.A01;
        TextView textView = seekBarPreference2.A07;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.A00.A0A = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.A00;
        seekBarPreference.A0A = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.A01;
        if (progress2 + i != seekBarPreference.A03 && (progress = i + seekBar.getProgress()) != seekBarPreference.A03) {
            Integer valueOf = Integer.valueOf(progress);
            B6V b6v = seekBarPreference.A0A;
            if (b6v != null) {
                b6v.C1R(seekBarPreference, valueOf);
            }
            SeekBarPreference.A00(seekBarPreference, progress, false);
        }
    }
}
