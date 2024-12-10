package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6Z3;
import X.C108995ce;
import X.C1604288l;
import X.C19740yt;
import X.C90104dX;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Keypad extends TableLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C1604288l A04;

    public Keypad(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setOnKeyPressCallback(C1604288l r1) {
        this.A04 = r1;
    }

    private TableRow.LayoutParams getItemParams() {
        return new TableRow.LayoutParams(0, (int) (((float) this.A01) * ((float) (AnonymousClass3Ma.A09(this).densityDpi / 160))), 1.0f);
    }

    private void setClickFeedback(View view) {
        TypedValue typedValue = new TypedValue();
        AnonymousClass3Ma.A06(this).resolveAttribute(2130971131, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public Keypad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 61;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass6Z3.A02, 0, 0);
        this.A02 = obtainStyledAttributes.getColor(3, C19740yt.A00(getContext(), 2131101986));
        this.A03 = obtainStyledAttributes.getColor(0, C19740yt.A00(getContext(), 2131101983));
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelSize(2, 33);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, this.A01);
        obtainStyledAttributes.recycle();
        setBackgroundColor(this.A02);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, 0, 1.0f);
        int i = 0;
        int i2 = 1;
        while (true) {
            Context context2 = getContext();
            if (i < 3) {
                TableRow tableRow = new TableRow(context2);
                tableRow.setLayoutParams(layoutParams);
                tableRow.setWeightSum(3.0f);
                int i3 = 0;
                do {
                    TextView textView = new TextView(getContext());
                    textView.setGravity(17);
                    textView.setLayoutParams(getItemParams());
                    textView.setTextColor(this.A03);
                    textView.setTextSize(2, this.A00);
                    textView.setText(String.valueOf(i2));
                    textView.setClickable(true);
                    setClickFeedback(textView);
                    C90104dX.A00(textView, this, i2, 40);
                    tableRow.addView(textView);
                    i2++;
                    i3++;
                } while (i3 < 3);
                addView(tableRow);
                i++;
            } else {
                ImageView imageView = new ImageView(context2);
                imageView.setImageResource(2131231626);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setAdjustViewBounds(true);
                AnonymousClass3MZ.A1G(imageView, getItemParams(), C108995ce.A00(this, (float) this.A01), 1.2f);
                imageView.setClickable(true);
                setClickFeedback(imageView);
                AnonymousClass3MZ.A1M(imageView, this, 29);
                TextView textView2 = new TextView(getContext());
                textView2.setLayoutParams(getItemParams());
                textView2.setGravity(17);
                textView2.setText(String.valueOf(0));
                textView2.setTextColor(this.A03);
                textView2.setTextSize(2, this.A00);
                textView2.setClickable(true);
                setClickFeedback(textView2);
                AnonymousClass3MZ.A1M(textView2, this, 30);
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(2131231640);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView2.setAdjustViewBounds(true);
                AnonymousClass3MZ.A1G(imageView2, getItemParams(), C108995ce.A00(this, (float) this.A01), 1.1f);
                imageView2.setClickable(true);
                setClickFeedback(imageView2);
                AnonymousClass3MZ.A1M(imageView2, this, 31);
                TableRow tableRow2 = new TableRow(getContext());
                tableRow2.setLayoutParams(layoutParams);
                tableRow2.setWeightSum(3.0f);
                tableRow2.addView(imageView);
                tableRow2.addView(textView2);
                tableRow2.addView(imageView2);
                addView(tableRow2);
                return;
            }
        }
    }
}
