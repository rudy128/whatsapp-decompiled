package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;

/* renamed from: X.8He  reason: invalid class name */
public class AnonymousClass8He extends C38391rD {
    public final C51302Xt A00;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0B;
        int i2;
        if (i == 1) {
            A0B = AnonymousClass3MY.A0B(viewGroup);
            i2 = 2131626797;
        } else if (i == 2) {
            return new AnonymousClass8l5((Chip) AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131626796), AnonymousClass1K1.A0M(this.A00.A00.A00));
        } else if (i == 3) {
            A0B = AnonymousClass3MY.A0B(viewGroup);
            i2 = 2131626798;
        } else {
            throw AnonymousClass8BX.A0W("SearchHistoryItemAdapter/onCreateViewHolder unhandled view type: ", AnonymousClass000.A10(), i);
        }
        View A09 = AnonymousClass3MX.A09(A0B, viewGroup, i2);
        C18070vi.A0d(A09, 1);
        return new C42011xT(A09);
    }

    public int A0Q() {
        throw AnonymousClass000.A0s("size");
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        AnonymousClass8IF r22 = (AnonymousClass8IF) r2;
        if (r22 instanceof AnonymousClass8l5) {
            ((AnonymousClass8l5) r22).A01.A03();
        }
        throw AnonymousClass000.A0s("get");
    }

    public int getItemViewType(int i) {
        throw AnonymousClass000.A0s("get");
    }

    public AnonymousClass8He(C51302Xt r1) {
        this.A00 = r1;
    }
}
