package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class D58 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ ChipGroup A01;

    public D58(ChipGroup chipGroup) {
        this.A01 = chipGroup;
    }

    public void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.A01;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            C26121Csj csj = chipGroup.A03;
            Chip chip = (Chip) view2;
            C17880vN.A1O(chip, csj.A03, chip.getId());
            if (chip.isChecked()) {
                C26121Csj.A01(csj, chip);
            }
            chip.A05 = new DLA(csj);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.A01;
        if (view == chipGroup && (view2 instanceof Chip)) {
            C26121Csj csj = chipGroup.A03;
            Chip chip = (Chip) view2;
            chip.A05 = null;
            csj.A03.remove(Integer.valueOf(chip.getId()));
            csj.A04.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
