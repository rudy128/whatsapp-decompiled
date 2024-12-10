package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;

/* renamed from: X.AFu  reason: case insensitive filesystem */
public final /* synthetic */ class C20312AFu implements AdapterView.OnItemClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ListView A01;
    public final /* synthetic */ PaymentMethodsListPickerFragment A02;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = this.A02;
        ListView listView = this.A01;
        View view2 = this.A00;
        if (view2 == null || i != listView.getPositionForView(view2)) {
            Fragment A0L = Fragment.A0L(paymentMethodsListPickerFragment, true);
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) paymentMethodsListPickerFragment.A0E;
            C20284AEs A0Q = AnonymousClass8BR.A0Q(paymentMethodsListPickerFragment.A04.A00, i - listView.getHeaderViewsCount());
            BDA bda = paymentMethodsListPickerFragment.A05;
            if (bda != null && !bda.CLr(A0Q)) {
                if (A0L instanceof C22466B8y) {
                    ((C22466B8y) A0L).C0I(A0Q);
                    if (paymentBottomSheet != null) {
                        paymentBottomSheet.A2L(A0L);
                        return;
                    }
                    return;
                }
                C22466B8y b8y = paymentMethodsListPickerFragment.A03;
                if (b8y != null) {
                    b8y.C0I(A0Q);
                    if (paymentBottomSheet != null) {
                        paymentBottomSheet.A2K();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        BDA bda2 = paymentMethodsListPickerFragment.A05;
        if (bda2 != null) {
            bda2.Bl3();
        }
    }

    public /* synthetic */ C20312AFu(View view, ListView listView, PaymentMethodsListPickerFragment paymentMethodsListPickerFragment) {
        this.A02 = paymentMethodsListPickerFragment;
        this.A01 = listView;
        this.A00 = view;
    }
}
