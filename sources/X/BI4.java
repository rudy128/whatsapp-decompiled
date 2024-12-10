package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class BI4 extends ArrayAdapter {
    public ColorStateList A00;
    public ColorStateList A01;
    public final /* synthetic */ BJ1 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BI4(Context context, BJ1 bj1, String[] strArr, int i) {
        super(context, i, strArr);
        this.A02 = bj1;
        A00();
    }

    public void A00() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        BJ1 bj1 = this.A02;
        ColorStateList colorStateList3 = bj1.A01;
        if (colorStateList3 != null) {
            int[] iArr = {16842919};
            int[][] iArr2 = {iArr, new int[0]};
            colorStateList = new ColorStateList(iArr2, new int[]{colorStateList3.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.A00 = colorStateList;
        if (bj1.A00 == 0 || bj1.A01 == null) {
            colorStateList2 = null;
        } else {
            int[] iArr3 = {16843623, -16842919};
            int[] iArr4 = {16842913, -16842919};
            int[][] iArr5 = {iArr4, iArr3, new int[0]};
            colorStateList2 = new ColorStateList(iArr5, new int[]{AnonymousClass1Z2.A05(bj1.A01.getColorForState(iArr4, 0), bj1.A00), AnonymousClass1Z2.A05(bj1.A01.getColorForState(iArr3, 0), bj1.A00), bj1.A00});
        }
        this.A01 = colorStateList2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawable;
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            BJ1 bj1 = this.A02;
            if (bj1.getText().toString().contentEquals(textView.getText())) {
                int i2 = bj1.A00;
                if (AnonymousClass000.A1O(i2)) {
                    Drawable colorDrawable = new ColorDrawable(i2);
                    if (this.A00 != null) {
                        C27831Xu.A03(this.A01, colorDrawable);
                        drawable = new RippleDrawable(this.A00, colorDrawable, (Drawable) null);
                    } else {
                        drawable = colorDrawable;
                    }
                } else {
                    drawable = null;
                }
            } else {
                drawable = null;
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
