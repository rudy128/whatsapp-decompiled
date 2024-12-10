package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3WI  reason: invalid class name */
public final class AnonymousClass3WI extends C41251w3 {
    public C37451pZ A00;
    public final C66812ym A01;
    public final AnonymousClass1OS A02;
    public final AnonymousClass1VW A03;
    public final C27201Vd A04;

    public void A0T(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A00.A02();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new AnonymousClass3ZQ(C72473Md.A0I(i, viewGroup), this.A01, this.A00, this.A02);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r9, int i) {
        AnonymousClass3ZQ r92 = (AnonymousClass3ZQ) r9;
        AnonymousClass4UT r6 = (AnonymousClass4UT) C72463Mc.A0l(this, r92, i);
        C18070vi.A0d(r6, 0);
        C18100vl r4 = r92.A04;
        ((TextView) r4.getValue()).setText(r6.A03);
        C37451pZ r7 = r92.A01;
        AnonymousClass1E7 r3 = r6.A02;
        C18100vl r5 = r92.A02;
        r7.A05(AnonymousClass3MX.A0J(r5), r92.A00, r3, true);
        C18100vl r32 = r92.A03;
        ((CompoundButton) r32.getValue()).setChecked(r6.A01);
        C89994dM.A00(AnonymousClass3MW.A0A(r32), r6, r92, 32);
        View view = r92.A0H;
        C89994dM.A00(view, r6, r92, 33);
        boolean z = r6.A00;
        view.setEnabled(z);
        AnonymousClass3MW.A0A(r32).setEnabled(z);
        AnonymousClass4aR.A09(AnonymousClass3MW.A0A(r5), z);
        AnonymousClass4aR.A09(AnonymousClass3MW.A0A(r4), z);
        AnonymousClass4aR.A09(AnonymousClass3MW.A0A(r32), z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3WI(Context context, C66812ym r3, AnonymousClass1VW r4, C27201Vd r5, AnonymousClass1OS r6) {
        super((C40411uf) AnonymousClass3W3.A00);
        C18070vi.A0k(r4, r5);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r3;
        this.A02 = r6;
        this.A00 = r5.A06(context, "adhoc-participant-bottom-sheet");
    }

    public int getItemViewType(int i) {
        return 2131624143;
    }
}
