package X;

import com.google.android.material.chip.ChipGroup;

public class DL8 implements C28520E5k {
    public final /* synthetic */ E2O A00;
    public final /* synthetic */ ChipGroup A01;

    public DL8(E2O e2o, ChipGroup chipGroup) {
        this.A01 = chipGroup;
        this.A00 = e2o;
    }

    public void Boa(ChipGroup chipGroup) {
        ChipGroup chipGroup2 = this.A01;
        if (chipGroup2.A03.A02) {
            chipGroup2.getCheckedChipId();
            throw AnonymousClass000.A0s("onCheckedChanged");
        }
    }
}
