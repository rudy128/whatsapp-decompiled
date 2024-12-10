package com.whatsapp.conversationslist.filter;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class ConversationsFilterTextView extends WaTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsFilterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayout().getLineCount() == 1) {
            int ceil = (int) ((float) Math.ceil((double) getLayout().getLineWidth(0)));
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth > 0 && measuredWidth != ceil) {
                setMeasuredDimension(ceil, getMeasuredHeight());
            }
        }
    }

    public /* synthetic */ ConversationsFilterTextView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsFilterTextView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
