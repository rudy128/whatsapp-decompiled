package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.SparseArray;
import com.google.android.material.chip.Chip;

/* renamed from: X.6vM  reason: invalid class name and case insensitive filesystem */
public abstract class C137376vM {
    public static SparseArray A00() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(AnonymousClass74N.A03, new C130156iy(9.0f, 4.0f, 0.0f, 2131434925, 2131895493, 2131232043));
        sparseArray.put(105, new C130156iy(9.0f, 4.0f, 0.0f, 2131434924, 2131895492, 2131231992));
        sparseArray.put(97, new C130156iy(8.0f, 4.0f, 0.0f, 2131434921, 2131895474, 2131231962));
        sparseArray.put(103, new C130156iy(10.0f, 5.0f, 0.0f, 2131434923, 2131895484, 2131232659));
        sparseArray.put(118, new C130156iy(9.0f, 5.0f, 0.0f, 2131434928, 2131895528, 2131232405));
        sparseArray.put(100, new C130156iy(7.0f, 3.0f, 0.0f, 2131434922, 2131895481, 2131231686));
        sparseArray.put(115, new C130156iy(8.0f, 3.0f, 0.5f, 2131434927, 2131895525, 2131232328));
        sparseArray.put(117, new C130156iy(9.0f, 5.0f, 0.0f, 2131434973, 2131890409, 2131232371));
        sparseArray.put(111, new C130156iy(7.0f, 3.0f, 0.0f, 2131434949, 2131895514, 2131232664));
        sparseArray.put(98, new C130156iy(9.0f, 5.0f, 0.0f, 2131434859, 2131890392, 2131232338));
        sparseArray.put(109, new C130156iy(9.0f, 4.0f, 0.0f, 2131434922, 2131895494, 2131232170));
        return sparseArray;
    }

    public static void A01(Context context, Chip chip, int i, int i2) {
        C130156iy r2 = (C130156iy) A00().get(i);
        Drawable A00 = C40501uo.A00((Resources.Theme) null, context.getResources(), r2.A03);
        C17960vV.A07(A00);
        int A01 = C62762rw.A01(context, r2.A01);
        int max = Math.max(A00.getIntrinsicWidth(), A00.getIntrinsicHeight());
        int intrinsicWidth = ((max - A00.getIntrinsicWidth()) / 2) + A01;
        int intrinsicHeight = ((max - A00.getIntrinsicHeight()) / 2) + A01;
        chip.setChipIcon(AnonymousClass4aX.A08(new InsetDrawable(A00, intrinsicWidth, intrinsicHeight, intrinsicWidth, intrinsicHeight), C19740yt.A00(context, i2)));
        chip.setChipIconSize((float) C62762rw.A01(context, 20.0f));
        chip.setChipStartPadding((float) C62762rw.A01(context, 1.0f));
        chip.setTextStartPadding((float) C62762rw.A01(context, 1.0f));
        chip.setIconStartPadding((float) C62762rw.A01(context, r2.A02));
        chip.setIconEndPadding((float) C62762rw.A01(context, r2.A00));
    }
}
