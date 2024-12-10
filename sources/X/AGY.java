package X;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;

public class AGY implements AnonymousClass1HE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ MaterialDatePicker A03;

    public AnonymousClass1HO BlX(View view, AnonymousClass1HO r6) {
        int i = r6.A07(7).A03;
        int i2 = this.A00;
        if (i2 >= 0) {
            View view2 = this.A02;
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.A02;
        C72463Mc.A14(view3, view3.getPaddingLeft(), this.A01 + i);
        return r6;
    }

    public AGY(View view, MaterialDatePicker materialDatePicker, int i, int i2) {
        this.A03 = materialDatePicker;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
    }
}
