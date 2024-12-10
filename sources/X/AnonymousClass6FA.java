package X;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6FA  reason: invalid class name */
public final class AnonymousClass6FA extends AnonymousClass6FB {
    public AnonymousClass1UD A00;
    public boolean A01;

    private final void setCommonViewAttributes(Chip chip) {
        chip.setClickable(true);
        chip.setChipIconTintResource(2131102435);
        C72463Mc.A0w(chip.getContext(), chip.getContext(), chip, 2130971109, 2131102436);
        C108995ce.A16(chip);
        C108995ce.A0u(this);
    }

    public final void A01(SparseIntArray sparseIntArray, C18090vk r13, C22821Di r14, boolean z) {
        ChipGroup chipGroup = this.A01;
        chipGroup.removeAllViews();
        ArrayList A13 = AnonymousClass000.A13();
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            if (sparseIntArray.keyAt(i) != 0) {
                A13.add(C17890vO.A0E(Integer.valueOf(sparseIntArray.keyAt(i)), sparseIntArray.valueAt(i)));
            }
        }
        C29391cC.A0H(A13, new C146997Rk((Object) AnonymousClass84O.A00, 10));
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Number number = (Number) pair.first;
            getAbProps();
            SparseArray A002 = C137376vM.A00();
            int A03 = AnonymousClass3MY.A03(number);
            C130156iy r7 = (C130156iy) A002.get(A03);
            if (r7 != null) {
                Chip chip = new Chip(getContext());
                chip.setText(r7.A05);
                AnonymousClass3Ma.A1F(chip, number, r13, r14, 40);
                Context context = getContext();
                getAbProps();
                C137376vM.A01(context, chip, A03, AnonymousClass1YL.A00(getContext(), 2130971109, 2131102436));
                setCommonViewAttributes(chip);
                chip.setId(r7.A04);
                if (z) {
                    chip.setEnsureMinTouchTargetSize(false);
                    Number number2 = (Number) pair.second;
                    if (number2 != null && number2.intValue() == Integer.MIN_VALUE) {
                        chip.setVisibility(4);
                    }
                    chipGroup.setChipSpacingVertical(getResources().getDimensionPixelSize(2131168578));
                }
                chipGroup.addView(chip);
            }
        }
    }

    public final void setBotGating(AnonymousClass1UD r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass1UD getBotGating() {
        AnonymousClass1UD r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("botGating");
        throw null;
    }

    public final void A02(C111295jU r8, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass77Z r1 = (AnonymousClass77Z) it.next();
            Chip chip = new Chip(getContext());
            chip.setId(r1.A03);
            chip.setText(r1.A02);
            C90024dP.A00(chip, r8, r1, 41);
            AnonymousClass6F9.A02(getContext(), chip, r1.A00, AnonymousClass1YL.A00(getContext(), 2130971109, 2131102436));
            setCommonViewAttributes(chip);
            this.A01.addView(chip);
        }
    }

    public void onMeasure(int i, int i2) {
        int measuredWidth;
        super.onMeasure(i, i2);
        if (C18020vd.A05(C18040vf.A01, getBotGating().A00, 9067) && View.MeasureSpec.getMode(i) == 0) {
            if (AnonymousClass112.A01()) {
                measuredWidth = View.MeasureSpec.getSize(i);
            } else {
                ViewParent parent = getParent();
                C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                measuredWidth = ((View) parent).getMeasuredWidth();
            }
            setMeasuredDimension(measuredWidth, getMeasuredHeight());
        }
    }
}
