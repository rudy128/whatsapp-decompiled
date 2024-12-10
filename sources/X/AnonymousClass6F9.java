package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* renamed from: X.6F9  reason: invalid class name */
public abstract class AnonymousClass6F9 extends C110425fc {
    public C18030ve A00;
    public final ChipGroup A01;

    public AnonymousClass6F9(Context context) {
        super(context);
        A03();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ChipGroup chipGroup = new ChipGroup(context);
        this.A01 = chipGroup;
        chipGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(chipGroup);
        boolean z = this instanceof AnonymousClass6F5;
        Resources resources = getResources();
        if (z) {
            int dimensionPixelSize = resources.getDimensionPixelSize(2131168577);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131168555);
            setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize);
        } else {
            int dimensionPixelSize3 = resources.getDimensionPixelSize(2131168555);
            setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        }
        chipGroup.setChipSpacingHorizontal(getChipSpacingPx());
    }

    public static void A02(Context context, Chip chip, int i, int i2) {
        chip.setChipIcon(AnonymousClass4aX.A08(AnonymousClass3MX.A06(context, i), C19740yt.A00(context, i2)));
        chip.setChipIconSize((float) C62762rw.A01(context, 18.0f));
        chip.setChipStartPadding((float) C62762rw.A01(context, 1.0f));
        chip.setTextStartPadding((float) C62762rw.A01(context, 1.0f));
        chip.setIconStartPadding((float) C62762rw.A01(context, 8.0f));
        chip.setIconEndPadding((float) C62762rw.A01(context, 4.0f));
    }

    private int getChipSpacingPx() {
        return getResources().getDimensionPixelSize(2131168578) * 2;
    }
}
