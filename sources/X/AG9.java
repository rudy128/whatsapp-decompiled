package X;

import android.widget.SeekBar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class AG9 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ C166498cz A00;
    public final /* synthetic */ DOZ A01;
    public final /* synthetic */ DFL A02;
    public final /* synthetic */ boolean A03;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Set keySet;
        C18070vi.A0d(seekBar, 0);
        DFL dfl = this.A02;
        float f = 100.0f;
        if (dfl.A03(46, 0.0f) > 0.0f) {
            f = 1.0f / dfl.A03(46, 0.0f);
        }
        float f2 = ((float) i) / f;
        DOZ doz = this.A01;
        C183639Za r2 = (C183639Za) C26272CwJ.A04(doz, dfl);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[EvaluateExpression]bodyParametricSlider progress: ");
        A10.append(i);
        A10.append(" calcProgress: ");
        A10.append(f2);
        C26294Cx6.A04("BodyParametricSliderPreviewUnit", A10.toString());
        if (r2 != null) {
            r2.A00 = Float.valueOf(f2);
        }
        E8A A0A = dfl.A0A(48);
        if (A0A != null) {
            Map map = (Map) C26209Cul.A01(doz, dfl, C199029zJ.A01, A0A);
            LinkedHashMap A13 = C17880vN.A13();
            if (!(map == null || (keySet = map.keySet()) == null)) {
                for (Object next : keySet) {
                    Object obj = map.get(next);
                    if (obj != null) {
                        E8A e8a = ((C25488Cgj) obj).A00;
                        C20046A4p a4p = new C20046A4p();
                        a4p.A03(Float.valueOf(f2), 0);
                        Object A012 = C26209Cul.A01(doz, dfl, C20046A4p.A00(a4p, doz, 1), e8a);
                        C18070vi.A0z(A012, "null cannot be cast to non-null type kotlin.Number");
                        A13.put(next, Float.valueOf(AnonymousClass000.A04(A012)));
                    } else {
                        throw C17880vN.A0g();
                    }
                }
            }
            C26294Cx6.A04("BodyParametricSliderPreviewUnit", AnonymousClass001.A1E(A13, "configMap: ", AnonymousClass000.A10()));
            if (AnonymousClass8BR.A1Y(A13)) {
                CMK cmk = CMK.A01;
                if (cmk == null) {
                    cmk = new CMK();
                    CMK.A01 = cmk;
                }
                Iterator it = cmk.A00.iterator();
                while (it.hasNext()) {
                    ((BA7) it.next()).Bml(A13);
                }
            }
        }
        E8A A0A2 = dfl.A0A(36);
        if (A0A2 != null) {
            C20046A4p a4p2 = new C20046A4p();
            a4p2.A03(Float.valueOf(f2), 0);
            a4p2.A03(doz, 1);
            C20046A4p.A01(doz, dfl, a4p2, A0A2);
        }
        if (this.A03) {
            C166498cz.A00(seekBar);
        }
    }

    public AG9(C166498cz r1, DOZ doz, DFL dfl, boolean z) {
        this.A02 = dfl;
        this.A01 = doz;
        this.A00 = r1;
        this.A03 = z;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        C26294Cx6.A04("BodyParametricSliderPreviewUnit", "onStartTrackingTouch");
        DFL dfl = this.A02;
        E8A A0A = dfl.A0A(40);
        DOZ doz = this.A01;
        if (A0A != null) {
            C20046A4p.A01(doz, dfl, C108985cd.A0J(doz), A0A);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C26294Cx6.A04("BodyParametricSliderPreviewUnit", "onStopTrackingTouch");
        DFL dfl = this.A02;
        E8A A0A = dfl.A0A(38);
        C17890vO.A0D().postDelayed(new C21368Aix(this.A01, A0A, dfl, this.A00, 3), 200);
    }
}
