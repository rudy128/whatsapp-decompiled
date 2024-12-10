package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

/* renamed from: X.8DB  reason: invalid class name */
public class AnonymousClass8DB extends ArrayAdapter {
    public List A00 = AnonymousClass000.A13();
    public final A56 A01;
    public final BDt A02;

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        PaymentMethodRow paymentMethodRow;
        if (view == null) {
            paymentMethodRow = new PaymentMethodRow(getContext());
        } else {
            paymentMethodRow = (PaymentMethodRow) view;
        }
        C20284AEs A0Q = AnonymousClass8BR.A0Q(this.A00, i);
        if (A0Q != null) {
            this.A01.A04(A0Q, this.A02, paymentMethodRow);
        }
        return paymentMethodRow;
    }

    public AnonymousClass8DB(Context context, A56 a56, BDt bDt) {
        super(context, 2131626384, AnonymousClass000.A13());
        this.A01 = a56;
        this.A02 = bDt;
    }
}
