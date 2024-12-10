package X;

import android.content.Context;
import com.google.android.material.chip.Chip;
import java.util.Set;

/* renamed from: X.8kv  reason: invalid class name and case insensitive filesystem */
public class C169368kv extends C169408kz {
    public void A0B(C180589Nd r8) {
        String string;
        Chip chip = this.A00;
        chip.setChipIconResource(2131231782);
        super.A0B(r8);
        Set set = ((C169298ko) r8).A00;
        if (set.size() == 0) {
            chip.setText(2131887022);
        } else {
            if (set.size() == 1) {
                string = ((AEQ) set.iterator().next()).A01;
            } else {
                Context context = chip.getContext();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, set.size());
                string = context.getString(2131887051, objArr);
            }
            chip.setText(string);
        }
        chip.setCloseIconVisible(true);
        AnonymousClass3MY.A0w(chip.getContext(), chip, 2131887022);
        AFN.A00(chip, this, 28);
        chip.setOnCloseIconClickListener(new AFN(this, 29));
    }
}
