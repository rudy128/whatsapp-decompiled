package com.google.android.material.datepicker;

import X.ADU;
import X.AFX;
import X.AJN;
import X.AnonymousClass8BV;
import X.AnonymousClass8RF;
import X.AnonymousClass8RI;
import X.BDX;
import X.C27080DTf;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class MaterialTextInputPicker extends PickerFragment {
    public int A00;
    public ADU A01;
    public BDX A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(A1n(), this.A00));
        BDX bdx = this.A02;
        ADU adu = this.A01;
        AnonymousClass8RF r12 = new AnonymousClass8RF(this, 1);
        AJN ajn = (AJN) bdx;
        View inflate = cloneInContext.inflate(2131626102, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(2131432830);
        textInputLayout.setErrorAccessibilityLiveRegion(0);
        EditText editText = textInputLayout.A0B;
        String lowerCase = Build.MANUFACTURER.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("lge") || lowerCase.equals("samsung")) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        AnonymousClass8BV.A1P(simpleDateFormat);
        simpleDateFormat.setLenient(false);
        Resources resources = inflate.getResources();
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(2131899234);
        String string2 = resources.getString(2131899233);
        String string3 = resources.getString(2131899232);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        String replace = pattern.replace("d", string3).replace("M", string2).replace("y", string);
        textInputLayout.setPlaceholderText(replace);
        Long l = ajn.A01;
        if (l != null) {
            editText.setText(simpleDateFormat.format(l));
        }
        editText.addTextChangedListener(new AnonymousClass8RI(adu, r12, ajn, textInputLayout, textInputLayout, replace, simpleDateFormat));
        EditText[] editTextArr = {editText};
        editTextArr[0].setOnFocusChangeListener(new AFX(editTextArr, 0));
        EditText editText2 = editTextArr[0];
        editText2.requestFocus();
        editText2.post(new C27080DTf((Object) editText2, 17));
        return inflate;
    }

    public void A20(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A00);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.A02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A01);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (bundle == null) {
            bundle = this.A06;
        }
        this.A00 = bundle.getInt("THEME_RES_ID_KEY");
        this.A02 = (BDX) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.A01 = (ADU) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
