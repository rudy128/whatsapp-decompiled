package X;

import android.content.res.ColorStateList;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatRadioButton;

public class BJ8 extends AppCompatRadioButton {
    public static final int[][] A02 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public boolean A00;
    public ColorStateList A01;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.A01;
        if (colorStateList != null) {
            return colorStateList;
        }
        int A03 = AnonymousClass1ZA.A03(this, 2130969111);
        int A032 = AnonymousClass1ZA.A03(this, 2130969128);
        int A033 = AnonymousClass1ZA.A03(this, 2130969148);
        ColorStateList colorStateList2 = new ColorStateList(A02, new int[]{AnonymousClass1ZA.A00(1.0f, A033, A03), AnonymousClass1ZA.A00(0.54f, A033, A032), AnonymousClass1ZA.A00(0.38f, A033, A032), AnonymousClass1ZA.A00(0.38f, A033, A032)});
        this.A01 = colorStateList2;
        return colorStateList2;
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.A00 = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        C26173Ctq.A02(colorStateList, this);
    }

    public static ColorStateList A00(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A00 && A00(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
