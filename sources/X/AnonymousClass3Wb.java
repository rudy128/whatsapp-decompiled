package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Wb  reason: invalid class name */
public final class AnonymousClass3Wb extends C38391rD {
    public final C125606bM A00;
    public final AnonymousClass4VT A01;
    public final List A02;

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r12, int i) {
        C18070vi.A0d(r12, 0);
        C135716se r4 = (C135716se) this.A02.get(i);
        AnonymousClass4VT r5 = this.A01;
        C18070vi.A0d(r4, 0);
        View view = r12.A0H;
        TextView A0W = C72453Mb.A0W(view, 2131435918);
        r5.A00(AnonymousClass03S.A01(view.getContext(), 2131232482), (Drawable) null, (ImageView) AnonymousClass3MX.A0C(view, 2131435917), (C108315bU) null, r4.A00);
        A0W.setText(r4.A03);
        C90104dX.A00(view, this, i, 6);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View A0E = AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625578);
        C18070vi.A0d(A0E, 1);
        return new C42011xT(A0E);
    }

    public int A0Q() {
        return this.A02.size();
    }

    public AnonymousClass3Wb(C125606bM r1, AnonymousClass4VT r2, List list) {
        this.A02 = list;
        this.A00 = r1;
        this.A01 = r2;
    }
}
