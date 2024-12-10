package X;

import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;

/* renamed from: X.3XN  reason: invalid class name */
public final class AnonymousClass3XN extends C38391rD implements Filterable {
    public List A00;
    public final List A01;
    public final C22821Di A02;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C74213Yy(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624343));
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r3, int i) {
        C74213Yy r32 = (C74213Yy) r3;
        C18070vi.A0d(r32, 0);
        r32.A01.setText(((AnonymousClass4NP) this.A00.get(i)).A02);
        r32.A00.setText(((AnonymousClass4NP) this.A00.get(i)).A01);
        C90104dX.A00(r32.A0H, this, i, 19);
    }

    public Filter getFilter() {
        return new AnonymousClass3P2(this);
    }

    public AnonymousClass3XN(List list, C22821Di r3) {
        this.A01 = list;
        this.A02 = r3;
        this.A00 = C29431cG.A0m(list);
    }
}
