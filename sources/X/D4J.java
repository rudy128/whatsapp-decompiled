package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ChipTextInputComboView;

public abstract class D4J implements TextWatcher {
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void afterTextChanged(Editable editable) {
        if (this instanceof BiY) {
            BiY biY = (BiY) this;
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = biY.A00;
                chipTextInputComboView.A03.setText(ChipTextInputComboView.A00(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = biY.A00;
            String A00 = ChipTextInputComboView.A00(chipTextInputComboView2, editable);
            Chip chip = chipTextInputComboView2.A03;
            if (TextUtils.isEmpty(A00)) {
                A00 = ChipTextInputComboView.A00(chipTextInputComboView2, "00");
            }
            chip.setText(A00);
        } else if (this instanceof BiX) {
            C25277CcZ A03 = ((BiX) this).A00.A03();
            if (A03 instanceof Bio) {
                Bio bio = (Bio) A03;
                if (bio.A03.isTouchExplorationEnabled() && bio.A04.getInputType() != 0 && !bio.A01.hasFocus()) {
                    bio.A04.dismissDropDown();
                }
                bio.A04.post(new C27080DTf((Object) bio, 25));
            } else if (A03 instanceof Bin) {
                Bin bin = (Bin) A03;
                if (bin.A02.A0B == null) {
                    Bin.A00(bin, Bin.A01(bin));
                }
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this instanceof BiX) {
            ((BiX) this).A00.A03().A06();
        }
    }
}
