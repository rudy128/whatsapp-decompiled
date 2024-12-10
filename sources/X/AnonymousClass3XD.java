package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.3XD  reason: invalid class name */
public final class AnonymousClass3XD extends C38391rD {
    public List A00;
    public final C84554Jy A01;
    public final C107195Yt A02;
    public final C37451pZ A03;

    public void A0T(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A03.A02();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(i, viewGroup, false);
        if (i == 2131625307) {
            C84554Jy r1 = this.A01;
            C18070vi.A0b(inflate);
            C37451pZ r3 = this.A03;
            C107195Yt r2 = this.A02;
            List list = C42011xT.A0I;
            return new C76253my(inflate, AnonymousClass3MZ.A0T(r1.A00.A01.A00), r2, r3);
        } else if (i == 2131625306) {
            List list2 = C42011xT.A0I;
            C72453Mb.A1S(inflate);
            return new C42011xT(inflate);
        } else {
            throw AnonymousClass000.A0n("Unsupported view type");
        }
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        C73963Xz r22 = (C73963Xz) r2;
        C18070vi.A0d(r22, 0);
        r22.A0B((AnonymousClass5X2) this.A00.get(i));
    }

    public int getItemViewType(int i) {
        Object obj = this.A00.get(i);
        if (obj instanceof C93564jB) {
            return 2131625307;
        }
        if (obj instanceof C93574jC) {
            return 2131625306;
        }
        throw AnonymousClass3MW.A14();
    }

    public AnonymousClass3XD(Context context, C84554Jy r3, C107195Yt r4, C27201Vd r5, List list) {
        C18070vi.A0k(r5, r3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = list;
        this.A03 = r5.A06(context, "favorite-call-list-single");
    }
}
