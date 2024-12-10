package com.whatsapp.conversation.selection;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3UB;
import X.AnonymousClass3X1;
import X.AnonymousClass4Q9;
import X.C108445bi;
import X.C18070vi;
import X.C74193Yw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class MessageSelectionDropDownRecyclerView extends RecyclerView {
    public AnonymousClass3X1 A00;
    public AnonymousClass3UB A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageSelectionDropDownRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    public final int A14() {
        AnonymousClass3UB r0 = this.A01;
        if (r0 == null) {
            C18070vi.A11("messageSelectionDropDownViewModel");
        } else {
            List<AnonymousClass4Q9> A10 = AnonymousClass3MW.A10(r0.A02);
            AnonymousClass3X1 r02 = this.A00;
            if (r02 != null) {
                C74193Yw r7 = (C74193Yw) r02.A0F(this, 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AnonymousClass000.A0Y(this).getDimensionPixelSize(2131167723), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                int i = 0;
                for (AnonymousClass4Q9 r03 : A10) {
                    int i2 = 0;
                    for (C108445bi r1 : r03.A00) {
                        AnonymousClass3X1 r04 = this.A00;
                        if (r04 != null) {
                            r04.A0U(r1, r7, 0);
                            View view = r7.A0H;
                            view.measure(makeMeasureSpec, makeMeasureSpec2);
                            i2 += view.getMeasuredHeight();
                        }
                    }
                    i = Math.max(i, i2);
                }
                return i + getPaddingTop() + getPaddingBottom();
            }
            C18070vi.A11("messageSelectionDropDownRecyclerViewAdapter");
        }
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageSelectionDropDownRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageSelectionDropDownRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
