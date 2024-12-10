package X;

import android.graphics.Canvas;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.DFw  reason: case insensitive filesystem */
public class C26840DFw implements C28507E4r {
    public final /* synthetic */ C28507E4r A00;
    public final /* synthetic */ E1L A01;
    public final /* synthetic */ RCTextView A02;

    public C26840DFw(C28507E4r e4r, E1L e1l, RCTextView rCTextView) {
        this.A02 = rCTextView;
        this.A01 = e1l;
        this.A00 = e4r;
    }

    public void BJI(Canvas canvas) {
        E1L e1l = this.A01;
        C28507E4r e4r = this.A00;
        C26841DFx dFx = (C26841DFx) e1l;
        C18070vi.A0d(canvas, 0);
        CT9 ct9 = dFx.A02;
        if (ct9 != null) {
            C26841DFx.A00(canvas, dFx.A00, ct9);
        }
        e4r.BJI(canvas);
        CT9 ct92 = dFx.A03;
        if (ct92 != null) {
            C26841DFx.A00(canvas, dFx.A01, ct92);
        }
    }
}
