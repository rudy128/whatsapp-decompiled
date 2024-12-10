package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;

/* renamed from: X.8JC  reason: invalid class name */
public class AnonymousClass8JC extends C42011xT implements View.OnClickListener {
    public final ImageView A00;
    public final RadioButton A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass9YO A05;

    public void onClick(View view) {
        AnonymousClass9YO r1 = this.A05;
        int i = this.A05;
        if (i == -1) {
            i = this.A04;
        }
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = r1.A00;
        if (!indiaUpiBankAccountPickerActivity.A0J && (!((C188089gr) indiaUpiBankAccountPickerActivity.A0I.get(i)).A06)) {
            if (indiaUpiBankAccountPickerActivity.A0I.size() == 1) {
                IndiaUpiBankAccountPickerActivity.A0Q(indiaUpiBankAccountPickerActivity);
                return;
            }
            ((C188089gr) indiaUpiBankAccountPickerActivity.A0I.get(indiaUpiBankAccountPickerActivity.A01)).A00 = false;
            ((C188089gr) indiaUpiBankAccountPickerActivity.A0I.get(i)).A00 = true;
            C38391rD r12 = indiaUpiBankAccountPickerActivity.A02.A0B;
            if (r12 != null) {
                r12.A0G(indiaUpiBankAccountPickerActivity.A01);
                indiaUpiBankAccountPickerActivity.A01 = i;
                indiaUpiBankAccountPickerActivity.A02.A0B.A0G(i);
            }
        }
    }

    public AnonymousClass8JC(View view, AnonymousClass9YO r3) {
        super(view);
        this.A00 = AnonymousClass3MW.A0G(view, 2131434213);
        this.A03 = AnonymousClass3MW.A0J(view, 2131427431);
        this.A02 = AnonymousClass3MW.A0J(view, 2131427429);
        this.A04 = AnonymousClass3MW.A0J(view, 2131427464);
        this.A01 = (RadioButton) AnonymousClass1HF.A06(view, 2131434311);
        this.A05 = r3;
        view.setOnClickListener(this);
    }
}
