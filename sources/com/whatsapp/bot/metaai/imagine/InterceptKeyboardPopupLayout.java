package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass7D3;
import X.C1594284m;
import X.C18070vi;
import X.CIZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.KeyboardPopupLayout;

public final class InterceptKeyboardPopupLayout extends KeyboardPopupLayout {
    public C1594284m A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptKeyboardPopupLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C1594284m r0;
        CIZ ciz;
        if (!(motionEvent == null || (r0 = this.A00) == null)) {
            AiImagineBottomSheet aiImagineBottomSheet = ((AnonymousClass7D3) r0).A00;
            if ((aiImagineBottomSheet.A04 == null || motionEvent.getAction() != 1) && (ciz = aiImagineBottomSheet.A0A) != null) {
                ciz.A00.onTouchEvent(motionEvent);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final C1594284m getCallback() {
        return this.A00;
    }

    public final void setCallback(C1594284m r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptKeyboardPopupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InterceptKeyboardPopupLayout(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
    }
}
