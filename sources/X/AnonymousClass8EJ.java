package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialDatePicker;

/* renamed from: X.8EJ  reason: invalid class name */
public class AnonymousClass8EJ extends AnonymousClass1XU {
    public final int A00;
    public final Object A01;

    public AnonymousClass8EJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean A1Y(View view, int i, Bundle bundle) {
        if (this.A00 != 0) {
            return super.A1Y(view, i, bundle);
        }
        return ((AnonymousClass8JD) this.A01).A00.A1Y(view, i, bundle);
    }

    public void A1Z(View view, C26228CvK cvK) {
        String charSequence;
        Preference A0U;
        switch (this.A00) {
            case 0:
                AnonymousClass8JD r1 = (AnonymousClass8JD) this.A01;
                r1.A00.A1Z(view, cvK);
                RecyclerView recyclerView = r1.A02;
                int A002 = RecyclerView.A00(view);
                C38391rD r12 = recyclerView.A0B;
                if ((r12 instanceof C161808Hv) && (A0U = ((C161808Hv) r12).A0U(A002)) != null) {
                    A0U.A0E(cvK);
                    return;
                }
                return;
            case 2:
                super.A1Z(view, cvK);
                cvK.A0p(false);
                return;
            case 3:
                super.A1Z(view, cvK);
                MaterialCalendar materialCalendar = (MaterialCalendar) this.A01;
                int i = 2131899237;
                if (materialCalendar.A00.getVisibility() == 0) {
                    i = 2131899239;
                }
                cvK.A0S(materialCalendar.A1H(i));
                return;
            case 5:
                super.A1Z(view, cvK);
                StringBuilder A10 = AnonymousClass000.A10();
                AJN ajn = (AJN) MaterialDatePicker.A01((MaterialDatePicker) this.A01);
                if (TextUtils.isEmpty(ajn.A00)) {
                    charSequence = null;
                } else {
                    charSequence = ajn.A00.toString();
                }
                AnonymousClass8BT.A1V(A10, charSequence);
                cvK.A0Q(C17890vO.A0V(cvK.A07(), A10));
                return;
            default:
                super.A1Z(view, cvK);
                cvK.A0Z((Object) null);
                return;
        }
    }
}
