package X;

import android.os.Handler;
import android.widget.SeekBar;

public class D5W implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C23710BoH A00;
    public final /* synthetic */ CUL A01;
    public final /* synthetic */ DOZ A02;
    public final /* synthetic */ DFL A03;
    public final /* synthetic */ E8A A04;
    public final /* synthetic */ E8A A05;

    public D5W(C23710BoH boH, CUL cul, DOZ doz, DFL dfl, E8A e8a, E8A e8a2) {
        this.A00 = boH;
        this.A01 = cul;
        this.A05 = e8a;
        this.A03 = dfl;
        this.A02 = doz;
        this.A04 = e8a2;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Handler handler = C25901CoD.A00;
        CUL cul = this.A01;
        handler.removeMessages(0, cul);
        cul.A07 = i;
        C108955ca.A1F(handler, cul, 0);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        E8A e8a = this.A05;
        if (e8a != null) {
            C26209Cul.A04(this.A02, this.A03, new C20046A4p(), e8a, 0);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        E8A e8a = this.A04;
        if (e8a != null) {
            C26209Cul.A04(this.A02, this.A03, new C20046A4p(), e8a, 0);
        }
    }
}
