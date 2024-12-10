package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.safetycheck.ui.SafetyCheckBottomSheet;
import java.util.List;

/* renamed from: X.5kj  reason: invalid class name and case insensitive filesystem */
public final class C111975kj extends C38391rD {
    public final /* synthetic */ SafetyCheckBottomSheet A00;
    public final /* synthetic */ List A01;

    public void Bmc(C42011xT r7, int i) {
        C18070vi.A0d(r7, 0);
        C18030ve r5 = this.A00.A0A;
        if (r5 != null) {
            C135496sI r4 = (C135496sI) this.A01.get(i);
            C18070vi.A0d(r4, 1);
            View view = r7.A0H;
            ImageView A0H = AnonymousClass3MW.A0H(view, 2131436612);
            TextView A0E = C17880vN.A0E(view, 2131436614);
            TextView A0E2 = C17880vN.A0E(view, 2131436613);
            A0H.setImageResource(r4.A00);
            A0E.setText(r4.A02);
            A0E2.setText(r4.A01);
            AnonymousClass3Ma.A1I(A0E2, r5);
            return;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131627289, viewGroup, false);
        List list = C42011xT.A0I;
        C72453Mb.A1S(inflate);
        return new C42011xT(inflate);
    }

    public C111975kj(SafetyCheckBottomSheet safetyCheckBottomSheet, List list) {
        this.A01 = list;
        this.A00 = safetyCheckBottomSheet;
    }

    public int A0Q() {
        return this.A01.size();
    }
}
