package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Oc  reason: invalid class name */
public class AnonymousClass3Oc extends ArrayAdapter {
    public int A00 = 0;
    public final List A01;

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625762, viewGroup, false);
        }
        TextView A0J = AnonymousClass3MW.A0J(view, 2131436208);
        TextView A0J2 = AnonymousClass3MW.A0J(view, 2131435885);
        CompoundButton compoundButton = (CompoundButton) AnonymousClass1HF.A06(view, 2131433797);
        AnonymousClass48n r3 = new AnonymousClass48n(this, i, 0);
        C89354cK r2 = (C89354cK) this.A01.get(i);
        String str = r2.A01;
        if (TextUtils.isEmpty(str)) {
            A0J.setVisibility(8);
        } else {
            A0J.setVisibility(0);
            A0J.setText(str);
        }
        A0J2.setText(r2.A00);
        if (i == this.A00) {
            z = true;
        }
        compoundButton.setChecked(z);
        compoundButton.setOnClickListener(r3);
        view.setOnClickListener(r3);
        return view;
    }

    public AnonymousClass3Oc(Context context, List list) {
        super(context, 2131625762, list);
        this.A01 = list;
    }
}
