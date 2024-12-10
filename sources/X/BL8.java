package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.chip.Chip;
import java.util.List;

public class BL8 extends C39401t1 {
    public final /* synthetic */ Chip A00;

    public void A1f(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.A00;
            chip.A07 = z;
            chip.refreshDrawableState();
        }
    }

    public void A1i(List list) {
        C23518Bih bih;
        BE7.A11(0, list);
        Chip chip = this.A00;
        if (Chip.A06(chip) && (bih = chip.A04) != null && bih.A0d && chip.A02 != null) {
            BE7.A11(1, list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BL8(Chip chip, Chip chip2) {
        super(chip2);
        this.A00 = chip;
    }

    public int A1b(float f, float f2) {
        Chip chip = this.A00;
        if (!Chip.A06(chip) || !chip.getCloseIconTouchBounds().contains(f, f2)) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1g(X.C26228CvK r4) {
        /*
            r3 = this;
            com.google.android.material.chip.Chip r2 = r3.A00
            X.Bih r0 = r2.A04
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.A0b
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r4.A0d(r0)
            boolean r0 = r2.isClickable()
            r4.A0f(r0)
            java.lang.CharSequence r0 = r2.getAccessibilityClassName()
            r4.A0O(r0)
            java.lang.CharSequence r2 = r2.getText()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x002b
            r4.A0X(r2)
            return
        L_0x002b:
            r4.A0Q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BL8.A1g(X.CvK):void");
    }

    public void A1h(C26228CvK cvK, int i) {
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.A00;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                closeIconContentDescription = context.getString(2131899200, objArr).trim();
            }
            cvK.A0Q(closeIconContentDescription);
            cvK.A02.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            cvK.A0L(C26137Ct0.A08);
            cvK.A0h(chip.isEnabled());
            return;
        }
        cvK.A0Q(charSequence);
        cvK.A02.setBoundsInParent(Chip.A0J);
    }

    public boolean A1m(int i, int i2, Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.A00.performClick();
        }
        if (i != 1) {
            return false;
        }
        Chip chip = this.A00;
        boolean z = false;
        chip.playSoundEffect(0);
        View.OnClickListener onClickListener = chip.A02;
        if (onClickListener != null) {
            onClickListener.onClick(chip);
            z = true;
        }
        if (!chip.A0B) {
            return z;
        }
        chip.A0F.A1e(1, 1);
        return z;
    }
}
