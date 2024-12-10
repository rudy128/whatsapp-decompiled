package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.checkbox.RtlCheckBox;
import java.util.List;

/* renamed from: X.3QU  reason: invalid class name */
public class AnonymousClass3QU extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass3QU(Context context, LinearLayout.LayoutParams layoutParams, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list) {
        super(context);
        int intValue;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(2131625094, this);
        setOrientation(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166465);
        int i = 0;
        setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(2131166466), dimensionPixelSize, 0);
        ImageView A0G = AnonymousClass3MW.A0G(this, 2131431526);
        TextView A0J = AnonymousClass3MW.A0J(this, 2131436208);
        TextView A0J2 = AnonymousClass3MW.A0J(this, 2131435885);
        if (num != null) {
            A0G.setImageResource(num.intValue());
            A0G.setVisibility(0);
            if (layoutParams != null) {
                A0G.setLayoutParams(layoutParams);
            }
        } else {
            A0G.setVisibility(8);
        }
        String str3 = str;
        if (!TextUtils.isEmpty(str3)) {
            A0J.setText(str3);
            A0J.setVisibility(0);
        } else {
            A0J.setVisibility(8);
        }
        String str4 = str2;
        if (!TextUtils.isEmpty(str4)) {
            A0J2.setText(str4);
            if (num2 != null) {
                A0J2.setTextColor(num2.intValue());
            }
            A0J2.setVisibility(0);
        } else {
            A0J2.setVisibility(8);
        }
        if (num4 == null) {
            intValue = getResources().getDimensionPixelSize(2131166464);
        } else {
            intValue = (int) (((float) num4.intValue()) * AnonymousClass3Ma.A09(this).density);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131166463);
        while (true) {
            List list2 = list;
            if (i >= list2.size()) {
                break;
            }
            AnonymousClass4NJ r5 = (AnonymousClass4NJ) list2.get(i);
            int i2 = dimensionPixelSize2;
            if (i == 0) {
                i2 = intValue;
            }
            RtlCheckBox rtlCheckBox = new RtlCheckBox(getContext(), (AttributeSet) null);
            rtlCheckBox.setTextSize(2, 16.0f);
            C72463Mc.A0w(getContext(), getContext(), rtlCheckBox, 2130971113, 2131102439);
            AnonymousClass3MW.A0C(this, 2131429504).addView(rtlCheckBox);
            AnonymousClass3MW.A0B(rtlCheckBox).topMargin = i2;
            rtlCheckBox.setText(r5.A01);
            rtlCheckBox.setChecked(r5.A02);
            rtlCheckBox.setOnClickListener(new C90014dO(r5, rtlCheckBox, 18));
            i++;
        }
        if (num3 != null) {
            float f = AnonymousClass3Ma.A09(this).density;
            View A0R = C72453Mb.A0R(this);
            A0R.setLayoutParams(new AbsListView.LayoutParams(-1, (int) ((((float) num3.intValue()) * f) + 0.5f)));
            addView(A0R);
        }
    }
}
