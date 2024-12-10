package com.whatsapp.biz.serviceofferings;

import X.AEL;
import X.AnonymousClass000;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WU;
import X.C38491rN;
import X.C72473Md;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ServiceOfferingsRecyclerView extends RecyclerView {
    private TextView getServiceOfferingItemView() {
        TextView textView = (TextView) AnonymousClass3MZ.A0D(this).inflate(2131626890, (ViewGroup) null, false);
        textView.setLayoutParams(new C38491rN(-1, -2));
        float applyDimension = TypedValue.applyDimension(1, 24.0f, AnonymousClass3Ma.A09(this));
        Drawable A06 = AnonymousClass3MX.A06(getContext(), 2131231806);
        int i = (int) applyDimension;
        A06.setBounds(0, 0, i, i);
        textView.setCompoundDrawables(A06, (Drawable) null, (Drawable) null, (Drawable) null);
        return textView;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        String str;
        int i4;
        String str2;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0 && (this.A0B instanceof AnonymousClass3WU)) {
            Resources A0Y = AnonymousClass000.A0Y(this);
            int i5 = 0;
            if (this.A0B instanceof AnonymousClass3WU) {
                Resources A0Y2 = AnonymousClass000.A0Y(this);
                TextView serviceOfferingItemView = getServiceOfferingItemView();
                AnonymousClass3WU r3 = (AnonymousClass3WU) this.A0B;
                int dimensionPixelSize = A0Y2.getDimensionPixelSize(2131168346);
                int size = (View.MeasureSpec.getSize(i) / 2) - (dimensionPixelSize / 2);
                i3 = 0;
                while (true) {
                    List list = r3.A01;
                    if (i5 >= list.size()) {
                        break;
                    }
                    if (i5 < list.size()) {
                        str = ((AEL) list.get(i5)).A02;
                    } else {
                        str = "";
                    }
                    serviceOfferingItemView.setText(str);
                    C72473Md.A12(serviceOfferingItemView, size, Integer.MIN_VALUE);
                    int measuredHeight = serviceOfferingItemView.getMeasuredHeight();
                    int i6 = i5 + 1;
                    if (i6 < list.size()) {
                        if (i6 < list.size()) {
                            str2 = ((AEL) list.get(i6)).A02;
                        } else {
                            str2 = "";
                        }
                        serviceOfferingItemView.setText(str2);
                        C72473Md.A12(serviceOfferingItemView, size, Integer.MIN_VALUE);
                        i4 = serviceOfferingItemView.getMeasuredHeight();
                    } else {
                        i4 = 0;
                    }
                    i3 = i3 + Math.max(measuredHeight, i4) + dimensionPixelSize;
                    i5 += 2;
                }
            } else {
                i3 = 0;
            }
            setMeasuredDimension(i, AnonymousClass3MX.A00(A0Y, 2131168345, i3));
        }
    }

    public ServiceOfferingsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ServiceOfferingsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ServiceOfferingsRecyclerView(Context context) {
        super(context, (AttributeSet) null);
    }
}
