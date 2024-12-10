package com.whatsapp.payments.ui.widget;

import X.AG2;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C17880vN;
import X.C22378B5h;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.ChipGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiExclusionChipGroup extends ChipGroup implements AnonymousClass009 {
    public C22378B5h A00;
    public AnonymousClass031 A01;
    public Map A02;
    public Set A03;
    public boolean A04;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = C17880vN.A12();
        this.A02 = C17880vN.A11();
    }

    public void A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiExclusionChip multiExclusionChip = (MultiExclusionChip) it.next();
            this.A02.put(multiExclusionChip, list);
            multiExclusionChip.setCheckable(true);
            multiExclusionChip.setClickable(true);
            super.addView(multiExclusionChip);
            multiExclusionChip.A00 = new AG2(multiExclusionChip, this, 1);
        }
    }

    public void setOnSelectionChangedListener(C22378B5h b5h) {
        this.A00 = b5h;
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = C17880vN.A12();
        this.A02 = C17880vN.A11();
    }

    public MultiExclusionChipGroup(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = C17880vN.A12();
        this.A02 = C17880vN.A11();
    }
}
