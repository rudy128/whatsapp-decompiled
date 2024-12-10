package X;

import android.content.res.ColorStateList;
import java.util.ArrayList;

/* renamed from: X.2S6  reason: invalid class name */
public abstract class AnonymousClass2S6 {
    public boolean A01() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (this instanceof C454428z) {
            C454428z r4 = (C454428z) this;
            int i = 0;
            while (true) {
                ArrayList arrayList = r4.A0C;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (((AnonymousClass2S6) arrayList.get(i)).A01()) {
                    return true;
                }
                i++;
            }
        } else if (!(this instanceof C454228x)) {
            return false;
        } else {
            C454228x r2 = (C454228x) this;
            C59202lv r1 = r2.A09;
            if (r1.A02 == null && (colorStateList2 = r1.A01) != null && colorStateList2.isStateful()) {
                return true;
            }
            C59202lv r12 = r2.A0A;
            if (r12.A02 != null || (colorStateList = r12.A01) == null || !colorStateList.isStateful()) {
                return false;
            }
            return true;
        }
    }

    public boolean A02(int[] iArr) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        int colorForState;
        ColorStateList colorStateList2;
        int colorForState2;
        if (this instanceof C454428z) {
            C454428z r4 = (C454428z) this;
            int i = 0;
            boolean z3 = false;
            while (true) {
                ArrayList arrayList = r4.A0C;
                if (i >= arrayList.size()) {
                    return z3;
                }
                z3 |= ((AnonymousClass2S6) arrayList.get(i)).A02(iArr);
                i++;
            }
        } else if (!(this instanceof C454228x)) {
            return false;
        } else {
            C454228x r42 = (C454228x) this;
            C59202lv r2 = r42.A09;
            if (r2.A02 != null || (colorStateList2 = r2.A01) == null || !colorStateList2.isStateful() || (colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor())) == r2.A00) {
                z = false;
            } else {
                r2.A00 = colorForState2;
                z = true;
            }
            C59202lv r22 = r42.A0A;
            if (r22.A02 != null || (colorStateList = r22.A01) == null || !colorStateList.isStateful() || (colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor())) == r22.A00) {
                z2 = false;
            } else {
                r22.A00 = colorForState;
                z2 = true;
            }
            return z2 | z;
        }
    }
}
