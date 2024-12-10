package X;

import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6F8  reason: invalid class name */
public class AnonymousClass6F8 extends AnonymousClass6F9 {
    public C24921Me A00;
    public C18000vb A01;
    public AnonymousClass1KW A02;
    public boolean A03;

    public void A04(C111295jU r13, List list) {
        ChipGroup chipGroup = this.A01;
        chipGroup.removeAllViews();
        int maxChipWidth = getMaxChipWidth();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            if (A0O != null) {
                Chip chip = new Chip(getContext());
                C108965cb.A12(chip, -2);
                String A0I = this.A00.A0I(A0O);
                AnonymousClass1X3 r1 = C18000vb.A00(this.A01).A01;
                chip.setText(C43251zV.A05(getContext(), this.A02, AnonymousClass3MW.A0x(getResources(), r1.A02(r1.A00, A0I), new Object[1], 0, 2131895477)));
                chip.setId(2131434872);
                chip.setClickable(true);
                C90024dP.A00(chip, r13, A0O, 39);
                C72463Mc.A0w(getContext(), getContext(), chip, 2130971113, 2131102439);
                C108995ce.A16(chip);
                chip.setEllipsize(TextUtils.TruncateAt.END);
                if (maxChipWidth > 0) {
                    chip.setMaxWidth(maxChipWidth);
                }
                chipGroup.addView(chip);
            }
        }
    }

    /* access modifiers changed from: private */
    public int getMaxChipWidth() {
        return (C108995ce.A03(this) - this.A01.A00) / 2;
    }
}
