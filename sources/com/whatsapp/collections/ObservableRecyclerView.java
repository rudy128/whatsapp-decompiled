package com.whatsapp.collections;

import X.AnonymousClass1Y1;
import X.C18070vi;
import X.C40051u5;
import X.C40061u6;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;

public final class ObservableRecyclerView extends RecyclerView {
    public boolean A00;
    public final C40051u5 A01;
    public final C40061u6 A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        C40061u6 r0 = this.A02;
        r0.A00();
        super.draw(canvas);
        r0.A01();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C40051u5 r3 = this.A01;
        r3.A01();
        if (this.A00) {
            try {
                super.onLayout(z, i, i2, i3, i4);
            } catch (IndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ObservableRecyclerView/onLayout IndexOutOfBoundsException ");
                sb.append(e.getMessage());
                Log.e(sb.toString());
            }
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
        r3.A00();
    }

    public final void setCatchingLayoutAnimIssuesEnabled(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservableRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A01 = new C40051u5();
        this.A02 = new C40061u6();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ObservableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }
}
