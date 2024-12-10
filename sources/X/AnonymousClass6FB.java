package X;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;

/* renamed from: X.6FB  reason: invalid class name */
public abstract class AnonymousClass6FB extends C110525g6 {
    public C18030ve A00;
    public final ChipGroup A01;

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public AnonymousClass6FB(Context context) {
        super(context);
        A00();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setHorizontalScrollBarEnabled(false);
        ChipGroup chipGroup = new ChipGroup(context);
        this.A01 = chipGroup;
        chipGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int dimensionPixelSize = chipGroup.getResources().getDimensionPixelSize(2131168775);
        chipGroup.setPadding(dimensionPixelSize, C72463Mc.A06(chipGroup), dimensionPixelSize, 0);
        chipGroup.A03 = true;
        chipGroup.setChipSpacingHorizontal(getChipSpacingPx());
        addView(chipGroup);
    }

    private final int getChipSpacingPx() {
        return getResources().getDimensionPixelSize(2131168578) * 2;
    }

    public final ChipGroup getChipGroup() {
        return this.A01;
    }
}
