package com.google.android.material.theme;

import X.AnonymousClass028;
import X.AnonymousClass03P;
import X.AnonymousClass05O;
import X.AnonymousClass1YT;
import X.AnonymousClass1Z9;
import X.BJ1;
import X.BJA;
import X.C007803n;
import X.C108945cZ;
import X.C26173Ctq;
import X.C27771Xm;
import X.C27781Xn;
import X.C27791Xo;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;

public class MaterialComponentsViewInflater extends AnonymousClass028 {
    public AnonymousClass05O A03(Context context, AttributeSet attributeSet) {
        return new BJ1(context, attributeSet);
    }

    public C007803n A04(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public AppCompatCheckBox A05(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.appcompat.widget.AppCompatRadioButton, android.widget.CompoundButton, X.BJ8, android.view.View] */
    public AppCompatRadioButton A06(Context context, AttributeSet attributeSet) {
        ? appCompatRadioButton = new AppCompatRadioButton(C27771Xm.A00(context, attributeSet, 2130970895, 2132084757), attributeSet, 2130970895);
        Context context2 = appCompatRadioButton.getContext();
        TypedArray A00 = C27791Xo.A00(context2, attributeSet, C27781Xn.A0S, new int[0], 2130970895, 2132084757);
        if (A00.hasValue(0)) {
            C26173Ctq.A02(AnonymousClass1YT.A01(context2, A00, 0), appCompatRadioButton);
        }
        appCompatRadioButton.A00 = A00.getBoolean(1, false);
        A00.recycle();
        return appCompatRadioButton;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.view.View, X.03P, X.BJA] */
    public AnonymousClass03P A07(Context context, AttributeSet attributeSet) {
        int A00;
        ? r8 = new AnonymousClass03P(C27771Xm.A00(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = r8.getContext();
        if (AnonymousClass1Z9.A03(context2, 2130971524, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C27781Xn.A0V;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int[] A1W = C108945cZ.A1W();
            A1W[0] = 1;
            A1W[1] = 2;
            int i = 0;
            do {
                A00 = AnonymousClass1YT.A00(context2, obtainStyledAttributes, A1W[i], -1);
                i++;
                if (i >= 2) {
                    break;
                }
            } while (A00 < 0);
            obtainStyledAttributes.recycle();
            if (A00 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    BJA.A0F(theme, r8, resourceId);
                }
            }
        }
        return r8;
    }
}
