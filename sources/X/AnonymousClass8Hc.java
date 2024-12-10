package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.List;

/* renamed from: X.8Hc  reason: invalid class name */
public class AnonymousClass8Hc extends C38391rD {
    public final AnonymousClass9YO A00;
    public final List A01;
    public final /* synthetic */ IndiaUpiBankAccountPickerActivity A02;

    public AnonymousClass8Hc(AnonymousClass9YO r1, IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, List list) {
        this.A02 = indiaUpiBankAccountPickerActivity;
        this.A01 = list;
        this.A00 = r1;
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r13, int i) {
        String str;
        Drawable drawable;
        AnonymousClass8JC r132 = (AnonymousClass8JC) r13;
        List list = this.A01;
        C188089gr r5 = (C188089gr) list.get(i);
        IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = this.A02;
        if (!TextUtils.isEmpty(indiaUpiBankAccountPickerActivity.A0H)) {
            indiaUpiBankAccountPickerActivity.A0E.A00(indiaUpiBankAccountPickerActivity.getResources().getDrawable(2131231081), (Drawable) null, r132.A00, (C108315bU) null, indiaUpiBankAccountPickerActivity.A0H);
        } else {
            r132.A00.setImageResource(2131231081);
        }
        int size = list.size();
        RadioButton radioButton = r132.A01;
        if (size == 1) {
            radioButton.setVisibility(8);
        } else {
            radioButton.setVisibility(0);
        }
        TextView textView = r132.A03;
        boolean equals = "CREDIT".equals(r5.A02);
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = r5.A03;
        A1b[1] = r5.A04;
        if (equals) {
            str = "%s %s";
        } else {
            str = "%s ••%s";
        }
        textView.setText(String.format(str, A1b));
        radioButton.setChecked(r5.A00);
        r132.A04.setText(r5.A05);
        boolean z = !r5.A06;
        View view = r132.A0H;
        if (z) {
            C72463Mc.A0w(view.getContext(), view.getContext(), textView, 2130970343, 2131101314);
            r132.A02.setText(r5.A01);
            radioButton.setEnabled(true);
        } else {
            AnonymousClass3MX.A1C(view.getContext(), textView, 2131102706);
            r132.A02.setText(2131893791);
            radioButton.setEnabled(false);
        }
        if (indiaUpiBankAccountPickerActivity.A0J || !z) {
            drawable = null;
        } else {
            drawable = C24261Jm.A00(view.getContext(), 2131232942);
        }
        view.setBackground(drawable);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        List list = C42011xT.A0I;
        return new AnonymousClass8JC(AnonymousClass3MX.A09(this.A02.getLayoutInflater(), viewGroup, 2131625602), this.A00);
    }
}
