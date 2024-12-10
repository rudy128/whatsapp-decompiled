package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.framework.alerts.ui.AlertCardListFragment;
import java.util.List;

/* renamed from: X.8HX  reason: invalid class name */
public final class AnonymousClass8HX extends C38391rD {
    public AlertCardListFragment A00;
    public List A01;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C162058Iu(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131624181));
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r9, int i) {
        ImageView imageView;
        Context context;
        int i2;
        C162058Iu r92 = (C162058Iu) r9;
        C18070vi.A0d(r92, 0);
        C70513Bj r7 = (C70513Bj) this.A01.get(i);
        AlertCardListFragment alertCardListFragment = this.A00;
        C18070vi.A0d(r7, 0);
        C18100vl r5 = r92.A03;
        ((View) AnonymousClass3MX.A14(r5)).setVisibility(0);
        int i3 = r7.A01;
        if (i3 != 1) {
            if (i3 == 2) {
                C18100vl r4 = r92.A04;
                View view = r92.A0H;
                AnonymousClass3MX.A1B(view.getContext(), (ImageView) AnonymousClass3MX.A14(r4), 2131232438);
                imageView = (ImageView) AnonymousClass3MX.A14(r4);
                context = view.getContext();
                i2 = 2131099707;
            } else if (i3 == 3) {
                C18100vl r42 = r92.A04;
                View view2 = r92.A0H;
                AnonymousClass3MX.A1B(view2.getContext(), (ImageView) AnonymousClass3MX.A14(r42), 2131231836);
                imageView = (ImageView) AnonymousClass3MX.A14(r42);
                context = view2.getContext();
                i2 = 2131099708;
            }
            AnonymousClass8BW.A10(context, imageView, i2);
        } else {
            C18100vl r43 = r92.A04;
            View view3 = r92.A0H;
            AnonymousClass3MX.A1B(view3.getContext(), (ImageView) AnonymousClass3MX.A14(r43), 2131231889);
            AnonymousClass8BW.A10(view3.getContext(), (ImageView) AnonymousClass3MX.A14(r43), 2131099706);
            C108965cb.A1N(AnonymousClass3MX.A14(r5));
        }
        C72453Mb.A0X(r92.A05).setText(r7.A08);
        C72453Mb.A0X(r92.A02).setText(r7.A05);
        TextView A0X = C72453Mb.A0X(r92.A01);
        A0X.setText(r7.A04);
        C90014dO.A00(A0X, alertCardListFragment, r7, 32);
        if (((View) AnonymousClass3MX.A14(r5)).getVisibility() == 0) {
            TextView A0X2 = C72453Mb.A0X(r5);
            A0X2.setText(2131886638);
            C90014dO.A00(A0X2, alertCardListFragment, r7, 33);
        }
    }
}
