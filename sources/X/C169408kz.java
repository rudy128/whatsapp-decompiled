package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.google.android.material.chip.Chip;

/* renamed from: X.8kz  reason: invalid class name and case insensitive filesystem */
public abstract class C169408kz extends AnonymousClass8J2 {
    public final Chip A00;

    public void A0B(C180589Nd r6) {
        Chip chip = this.A00;
        Context context = chip.getContext();
        boolean A002 = r6.A00();
        int i = 2130971109;
        int i2 = 2131102436;
        if (A002) {
            i = 2130971957;
            i2 = 2131103410;
        }
        C72463Mc.A0y(context, chip, i, i2);
        Context context2 = chip.getContext();
        int i3 = 2130971087;
        int i4 = 2131102418;
        if (A002) {
            i3 = 2130971100;
            i4 = 2131102426;
        }
        chip.setChipBackgroundColorResource(AnonymousClass1YL.A00(context2, i3, i4));
        Context context3 = chip.getContext();
        int i5 = 2130971109;
        int i6 = 2131102436;
        if (A002) {
            i5 = 2130971957;
            i6 = 2131103410;
        }
        chip.setCloseIconTintResource(AnonymousClass1YL.A00(context3, i5, i6));
        chip.setCloseIconVisible(false);
        chip.A04.A0W((ColorStateList) null);
        Context context4 = chip.getContext();
        int i7 = 2130971109;
        int i8 = 2131102436;
        if (A002) {
            i7 = 2130971957;
            i8 = 2131103410;
        }
        chip.setChipIconTintResource(AnonymousClass1YL.A00(context4, i7, i8));
        chip.setChipIconSize((float) AnonymousClass000.A0Y(chip).getDimensionPixelSize(2131166801));
    }

    public C169408kz(Chip chip, C22553BCk bCk) {
        super(chip, bCk);
        this.A00 = chip;
    }
}
