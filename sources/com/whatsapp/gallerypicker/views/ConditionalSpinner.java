package com.whatsapp.gallerypicker.views;

import X.C18070vi;
import X.C20643ATb;
import X.C22507BAo;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;

public final class ConditionalSpinner extends AppCompatSpinner {
    public C22507BAo A00 = new C20643ATb();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConditionalSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    public final void setConditionalSelectionListener(C22507BAo bAo) {
        C18070vi.A0d(bAo, 0);
        this.A00 = bAo;
    }

    public void setSelection(int i, boolean z) {
        int i2 = i;
        if (!this.A00.CMB(i) || (i == getSelectedItemPosition() && this.A00.BgF(i))) {
            AdapterView.OnItemSelectedListener onItemSelectedListener = getOnItemSelectedListener();
            if (onItemSelectedListener != null) {
                onItemSelectedListener.onItemSelected(this, getSelectedView(), i2, getSelectedItemId());
                return;
            }
            return;
        }
        super.setSelection(i, z);
    }

    public final C22507BAo getConditionalSelectionListener() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConditionalSpinner(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public void setSelection(int i) {
        setSelection(i, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConditionalSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }
}
