package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1DC;
import X.C18070vi;
import X.C27691Xc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class HoverAwareRecyclerView extends RecyclerView implements AnonymousClass009 {
    public AnonymousClass1DC A00;
    public AnonymousClass031 A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
        A14();
    }

    public final void setSystemFeatures(AnonymousClass1DC r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A14() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (AnonymousClass1DC) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.A95.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1DC getSystemFeatures() {
        AnonymousClass1DC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemFeatures");
        throw null;
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        getSystemFeatures();
        return super.onInterceptHoverEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A14();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A14();
    }

    public HoverAwareRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A14();
    }
}
