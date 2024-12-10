package com.whatsapp.wds.components.list.listitem.debug;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.E30;
import X.E31;
import X.E32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public final class WDSListItemDebugPanel extends RelativeLayout {
    public E30 A00;
    public final Context A01;
    public final AttributeSet A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSListItemDebugPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A01 = context;
        this.A02 = attributeSet;
        View.inflate(getContext(), 2131627564, this);
    }

    public void setAttributesCallback(E31 e31) {
        C18070vi.A0d(e31, 0);
        C18070vi.A11("wdsListItemDebugPanelAttributesAdapter");
        throw null;
    }

    public void setValuesCallback(E32 e32) {
        C18070vi.A0d(e32, 0);
        C18070vi.A11("wdsListItemDebugPanelValuesAdapter");
        throw null;
    }

    public final E30 getCallback() {
        return null;
    }

    public final void setCallback(E30 e30) {
        this.A00 = e30;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSListItemDebugPanel(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSListItemDebugPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSListItemDebugPanel(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
