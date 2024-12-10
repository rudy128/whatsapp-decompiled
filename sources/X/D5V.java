package X;

import android.widget.SeekBar;
import com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1;
import com.bloks.components.bkcomponentaeparametricslider.ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class D5V implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C23687Bnu A00;
    public final /* synthetic */ DOZ A01;
    public final /* synthetic */ DFL A02;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public D5V(C23687Bnu bnu, DOZ doz, DFL dfl) {
        this.A01 = doz;
        this.A02 = dfl;
        this.A00 = bnu;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        DOZ doz = this.A01;
        DFL dfl = this.A02;
        C24906COz cOz = (C24906COz) C26272CwJ.A04(doz, dfl);
        if (cOz != null) {
            C24487C6e c6e = cOz.A02;
            int i2 = i;
            if (c6e != null) {
                c6e.A00 = i;
                List list = c6e.A03;
                ArrayList A0D = C29351c6.A0D(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String A0v = C17880vN.A0v(it);
                    if (A0v != null) {
                        A0D.add(AnonymousClass1YF.A0K("/parameter", AnonymousClass1YF.A0K("/value", A0v)));
                    } else {
                        throw C17880vN.A0g();
                    }
                }
                CMK cmk = CMK.A01;
                if (cmk == null) {
                    cmk = new CMK();
                    CMK.A01 = cmk;
                }
                Iterator it2 = cmk.A00.iterator();
                while (it2.hasNext()) {
                    ((BA7) it2.next()).C03(i, A0D);
                }
            }
            C24487C6e c6e2 = cOz.A02;
            if (c6e2 != null && !c6e2.A05) {
                E8A A0A = dfl.A0A(42);
                AnonymousClass3MX.A1Q(new ParametricSliderPreviewUnit$addSliderListener$1$onProgressChanged$2$1(doz, dfl, A0A, (C30391dr) null, i2), BE6.A18());
            }
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C24487C6e c6e;
        DOZ doz = this.A01;
        DFL dfl = this.A02;
        C24906COz cOz = (C24906COz) C26272CwJ.A04(doz, dfl);
        if (cOz != null && (c6e = cOz.A02) != null && c6e.A05) {
            E8A A0A = dfl.A0A(42);
            AnonymousClass3MX.A1Q(new ParametricSliderPreviewUnit$addSliderListener$1$onStopTrackingTouch$1$1(c6e, doz, dfl, A0A, (C30391dr) null), BE6.A18());
        }
    }
}
