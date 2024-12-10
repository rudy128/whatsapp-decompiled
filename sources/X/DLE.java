package X;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public class DLE implements C28523E5n {
    public final /* synthetic */ BIm A00;

    public DLE(BIm bIm) {
        this.A00 = bIm;
    }

    public void BsV(TextInputLayout textInputLayout) {
        View.OnFocusChangeListener onFocusChangeListener;
        BIm bIm = this.A00;
        EditText editText = bIm.A08;
        if (editText != textInputLayout.A0B) {
            if (editText != null) {
                editText.removeTextChangedListener(bIm.A0D);
                if (bIm.A08.getOnFocusChangeListener() == bIm.A03().A05()) {
                    bIm.A08.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.A0B;
            bIm.A08 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(bIm.A0D);
            }
            bIm.A03().A09(bIm.A08);
            C25277CcZ A03 = bIm.A03();
            EditText editText3 = bIm.A08;
            if (editText3 != null) {
                View.OnFocusChangeListener A05 = A03.A05();
                if (A05 != null) {
                    editText3.setOnFocusChangeListener(A05);
                }
                if ((A03 instanceof Bin) && (onFocusChangeListener = ((Bin) A03).A08) != null) {
                    bIm.A0G.setOnFocusChangeListener(onFocusChangeListener);
                }
            }
        }
    }
}
