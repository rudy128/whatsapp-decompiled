package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.3X0  reason: invalid class name */
public final class AnonymousClass3X0 extends C38391rD {
    public C84724Kp A00;
    public List A01 = C18460wS.A00;
    public final C37451pZ A02;
    public final C27201Vd A03;

    public AnonymousClass3X0(Context context, C27201Vd r3) {
        C18070vi.A0d(r3, 2);
        this.A03 = r3;
        this.A02 = r3.A06(context, "group-call-psa-bottom-sheet");
    }

    public void A0T(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A02.A02();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass3ZG(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625482), this.A00, this.A02);
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        AnonymousClass3ZG r82 = (AnonymousClass3ZG) r8;
        C18070vi.A0d(r82, 0);
        AnonymousClass4TB r5 = (AnonymousClass4TB) this.A01.get(i);
        C18070vi.A0d(r5, 0);
        ((TextView) r82.A03.getValue()).setText(r5.A01);
        ImageView A0J = AnonymousClass3MX.A0J(r82.A02);
        C37451pZ r3 = r82.A01;
        AnonymousClass1E7 r2 = r5.A00;
        C18070vi.A0d(r3, 0);
        r3.A08(A0J, r2, -1.0f, A0J.getResources().getDimensionPixelSize(2131166936));
        C84724Kp r22 = r82.A00;
        if (r22 != null) {
            C89994dM.A00(r82.A0H, r5, r22, 44);
        }
    }
}
