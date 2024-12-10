package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9B7  reason: invalid class name */
public class AnonymousClass9B7 extends A34 {
    public final String A00;
    public final ArrayList A01;
    public final List A02;
    public final /* synthetic */ IndiaUpiBankPickerActivity A03;

    public AnonymousClass9B7(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, String str, ArrayList arrayList, List list) {
        ArrayList arrayList2;
        this.A03 = indiaUpiBankPickerActivity;
        if (arrayList != null) {
            arrayList2 = C17880vN.A10(arrayList);
        } else {
            arrayList2 = null;
        }
        this.A01 = arrayList2;
        this.A00 = str;
        this.A02 = C17880vN.A10(list);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        View view;
        List list = (List) obj;
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A03;
        indiaUpiBankPickerActivity.A0C = null;
        if (list.isEmpty()) {
            TextView textView = indiaUpiBankPickerActivity.A01;
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = indiaUpiBankPickerActivity.A0H;
            AnonymousClass3MY.A0y(indiaUpiBankPickerActivity, textView, A1a, 2131895497);
            indiaUpiBankPickerActivity.A01.setVisibility(0);
            view = indiaUpiBankPickerActivity.A02;
        } else {
            indiaUpiBankPickerActivity.A02.setVisibility(0);
            view = indiaUpiBankPickerActivity.A01;
        }
        view.setVisibility(8);
        indiaUpiBankPickerActivity.A04.setVisibility(8);
        indiaUpiBankPickerActivity.A03.setVisibility(8);
        C161748Hp r2 = indiaUpiBankPickerActivity.A0B;
        List list2 = r2.A03;
        C72473Md.A1B(new AnonymousClass8HG(list2, list), r2, list, list2);
        indiaUpiBankPickerActivity.A02.A0f(0);
    }
}
