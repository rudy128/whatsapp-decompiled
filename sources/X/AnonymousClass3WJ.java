package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.3WJ  reason: invalid class name */
public final class AnonymousClass3WJ extends C41251w3 {
    public C37451pZ A00;
    public final C66812ym A01;
    public final C22821Di A02;
    public final AnonymousClass1VW A03;
    public final C27201Vd A04;

    public void A0T(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A00.A02();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(i, viewGroup, false);
        if (i == 2131624527) {
            List list = C42011xT.A0I;
            C18070vi.A0b(inflate);
            return new C76083mZ(inflate, this.A01, this.A00, this.A02);
        } else if (i == 2131624525) {
            List list2 = C42011xT.A0I;
            C18070vi.A0b(inflate);
            return new C76073mY(inflate);
        } else {
            throw AnonymousClass000.A0n("Unknown view. Expected Participant View or Header View.");
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r9, int i) {
        C73743Xd r92 = (C73743Xd) r9;
        Object A0l = C72463Mc.A0l(this, r92, i);
        if (r92 instanceof C76083mZ) {
            C76083mZ r93 = (C76083mZ) r92;
            C76093ma r3 = (C76093ma) A0l;
            C18070vi.A0d(r3, 0);
            C18100vl r6 = r93.A03;
            C72453Mb.A0X(r6).setText(r3.A02);
            r93.A01.A05((ImageView) AnonymousClass3MX.A14(r93.A02), r93.A00, r3.A00, true);
            Integer num = r3.A01;
            C18100vl r0 = r93.A04;
            C28931bI A0v = AnonymousClass3MX.A0v(r0);
            if (num != null) {
                A0v.A04(0);
                ((TextView) C72463Mc.A0O(r0)).setText(num.intValue());
                C72453Mb.A0X(r6).setMaxWidth(AnonymousClass3Ma.A09(r93.A0H).widthPixels / 2);
            } else {
                A0v.A04(8);
            }
            View view = r93.A0H;
            C89994dM.A00(view, r3, r93, 34);
            view.setEnabled(!r3.A03);
            return;
        }
        C18070vi.A0d((Object) null, 0);
        C18070vi.A0X(((C76073mY) r92).A00.getValue());
        throw AnonymousClass000.A0s("getStringRes");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3WJ(Context context, C66812ym r3, AnonymousClass1VW r4, C27201Vd r5, C22821Di r6) {
        super((C40411uf) AnonymousClass3W4.A00);
        C18070vi.A0k(r4, r5);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r3;
        this.A02 = r6;
        this.A00 = r5.A06(context, "call-messages-bottom-sheet");
    }

    public int getItemViewType(int i) {
        if (A0U(i) instanceof C76093ma) {
            return 2131624527;
        }
        throw AnonymousClass3MW.A14();
    }
}
