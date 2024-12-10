package X;

import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Formatter;

public class D5U implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C24149BwF A00;
    public final /* synthetic */ AnonymousClass70X A01;

    public D5U(C24149BwF bwF, AnonymousClass70X r2) {
        this.A00 = bwF;
        this.A01 = r2;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2;
        if (z && ((long) this.A01.A06()) != -9223372036854775807L) {
            C24149BwF bwF = this.A00;
            TextView textView = bwF.A0n;
            StringBuilder sb = bwF.A0u;
            Formatter formatter = bwF.A0v;
            int progress = seekBar.getProgress();
            AnonymousClass70X r0 = bwF.A0H;
            if (r0 != null) {
                i2 = (int) C17880vN.A04(((long) r0.A06()) * ((long) progress));
            } else {
                i2 = 0;
            }
            textView.setText(CDS.A00(sb, formatter, (long) i2));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C24149BwF bwF = this.A00;
        bwF.A0S = true;
        bwF.A09();
        bwF.removeCallbacks(bwF.A0t);
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int i;
        C24149BwF bwF = this.A00;
        bwF.A0S = false;
        bwF.A0l.setProgress(seekBar.getProgress());
        int progress = seekBar.getProgress();
        AnonymousClass70X r0 = bwF.A0H;
        if (r0 != null) {
            i = (int) C17880vN.A04(((long) r0.A06()) * ((long) progress));
        } else {
            i = 0;
        }
        AnonymousClass70X r1 = this.A01;
        if (i >= r1.A06()) {
            i -= 600;
        }
        r1.A0M(i);
        bwF.A0A(800);
        bwF.A0F();
    }
}
