package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: X.3WD  reason: invalid class name */
public final class AnonymousClass3WD extends C41251w3 {
    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new C74113Yo(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626072, false));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1uf, java.lang.Object] */
    public AnonymousClass3WD() {
        super((C40411uf) new Object());
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r5, int i) {
        String A11;
        C74113Yo r52 = (C74113Yo) r5;
        C87164Un r2 = (C87164Un) C72463Mc.A0l(this, r52, i);
        C18070vi.A0d(r2, 0);
        ((TextView) r52.A01.getValue()).setText(r2.A03);
        AnonymousClass3MX.A0J(r52.A00).setImageResource(r2.A02);
        View view = r52.A0H;
        C90034dQ.A01(view, r2, 12);
        int i2 = r2.A01;
        int i3 = r2.A00;
        String str = null;
        if (i2 == 0) {
            A11 = null;
        } else {
            A11 = AnonymousClass3Ma.A11(view, i2);
        }
        if (i3 != 0) {
            str = AnonymousClass3Ma.A11(view, i3);
        }
        AnonymousClass4aR.A07(view, A11, str);
    }
}
