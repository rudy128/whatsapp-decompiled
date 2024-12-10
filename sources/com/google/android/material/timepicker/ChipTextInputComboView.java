package com.google.android.material.timepicker;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.BiY;
import X.C17880vN;
import X.C27080DTf;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public TextWatcher A00;
    public TextView A01;
    public final EditText A02;
    public final Chip A03;
    public final TextInputLayout A04;

    public boolean isChecked() {
        return this.A03.isChecked();
    }

    public void setChecked(boolean z) {
        Chip chip = this.A03;
        chip.setChecked(z);
        EditText editText = this.A02;
        int i = 0;
        int i2 = 4;
        if (z) {
            i2 = 0;
        }
        editText.setVisibility(i2);
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new C27080DTf((Object) editText, 17));
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.A03.setTag(i, obj);
    }

    public void toggle() {
        this.A03.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(2131625939, this, false);
        this.A03 = chip;
        chip.A06 = "android.view.View";
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(2131625940, this, false);
        this.A04 = textInputLayout;
        EditText editText = textInputLayout.A0B;
        this.A02 = editText;
        editText.setVisibility(4);
        BiY biY = new BiY(this);
        this.A00 = biY;
        editText.addTextChangedListener(biY);
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setImeHintLocales(AnonymousClass000.A0Y(this).getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        this.A01 = C17880vN.A0E(this, 2131432330);
        editText.setId(View.generateViewId());
        this.A01.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String A00(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            Locale locale = chipTextInputComboView.getResources().getConfiguration().locale;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, Integer.parseInt(String.valueOf(charSequence)));
            return String.format(locale, "%02d", A1a);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setImeHintLocales(AnonymousClass000.A0Y(this).getConfiguration().getLocales());
        }
    }

    public ChipTextInputComboView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
