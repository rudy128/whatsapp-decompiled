package X;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6vu  reason: invalid class name and case insensitive filesystem */
public abstract class C137716vu {
    public static final Map A00 = AnonymousClass1D7.A0B(AnonymousClass1D6.A00(2131890275, 2131430740), AnonymousClass1D6.A00(2131890274, 2131430739), AnonymousClass1D6.A00(2131890276, 2131430741), AnonymousClass1D6.A00(2131890273, 2131430738), AnonymousClass1D6.A00(2131890277, 2131430742), AnonymousClass1D6.A00(2131890278, 2131430743), AnonymousClass1D6.A00(2131890271, 2131430736), AnonymousClass1D6.A00(2131890272, 2131430737), AnonymousClass1D6.A00(2131890279, 2131430744));
    public static final List A01;

    public static final List A00(LayoutInflater layoutInflater, ChipGroup chipGroup) {
        C18070vi.A0d(chipGroup, 0);
        List<C135216rq> list = A01;
        ArrayList A0D = C29351c6.A0D(list);
        for (C135216rq r2 : list) {
            View inflate = layoutInflater.inflate(2131625285, chipGroup, false);
            C18070vi.A0z(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Chip chip = (Chip) inflate;
            chip.setId(r2.A01);
            chip.setText(r2.A02);
            chip.setChipIconResource(r2.A00);
            A0D.add(chip);
        }
        return A0D;
    }

    static {
        C135216rq[] r2 = new C135216rq[9];
        r2[0] = new C135216rq(2131430740, 2131890275, 2131233499);
        r2[1] = new C135216rq(2131430739, 2131890274, 2131233366);
        r2[2] = new C135216rq(2131430741, 2131890276, 2131233297);
        r2[3] = new C135216rq(2131430738, 2131890273, 2131232180);
        r2[4] = new C135216rq(2131430742, 2131890277, 2131232279);
        r2[5] = new C135216rq(2131430743, 2131890278, 2131233462);
        r2[6] = new C135216rq(2131430736, 2131890271, 2131233367);
        r2[7] = new C135216rq(2131430737, 2131890272, 2131232280);
        A01 = C18070vi.A0O(new C135216rq(2131430744, 2131890279, 2131232281), r2, 8);
    }
}
