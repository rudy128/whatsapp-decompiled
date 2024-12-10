package com.google.android.material.timepicker;

import X.AFE;
import X.AnonymousClass7BO;
import X.BH3;
import X.C90304dr;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

public class TimePickerView extends ConstraintLayout {
    public final View.OnClickListener A00;
    public final Chip A01;
    public final Chip A02;
    public final MaterialButtonToggleGroup A03;
    public final ClockFaceView A04;
    public final ClockHandView A05;

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new AFE(this, 18);
        LayoutInflater.from(context).inflate(2131625941, this);
        this.A04 = (ClockFaceView) findViewById(2131432322);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(2131432327);
        this.A03 = materialButtonToggleGroup;
        materialButtonToggleGroup.A06.add(new AnonymousClass7BO(this, 0));
        this.A02 = (Chip) findViewById(2131432332);
        this.A01 = (Chip) findViewById(2131432329);
        this.A05 = (ClockHandView) findViewById(2131432323);
        C90304dr r1 = new C90304dr(new GestureDetector(getContext(), new BH3(this, 2)), this, 0);
        this.A02.setOnTouchListener(r1);
        this.A01.setOnTouchListener(r1);
        Chip chip = this.A02;
        chip.setTag(2131435133, 12);
        Chip chip2 = this.A01;
        chip2.setTag(2131435133, 10);
        View.OnClickListener onClickListener = this.A00;
        chip.setOnClickListener(onClickListener);
        chip2.setOnClickListener(onClickListener);
        chip.A06 = "android.view.View";
        chip2.A06 = "android.view.View";
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.A01.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
