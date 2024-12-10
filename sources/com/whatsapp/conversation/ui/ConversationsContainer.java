package com.whatsapp.conversation.ui;

import X.C18070vi;
import X.C23311Fn;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public final class ConversationsContainer extends LinearLayout {
    public C23311Fn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
    }

    public final void setTouchCallback(C23311Fn r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r4 = (X.C23281Fk) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0020
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x0020
            X.1Fn r4 = r5.A00
            if (r4 == 0) goto L_0x0020
            X.1Fk r4 = (X.C23281Fk) r4
            X.1bm r3 = r4.A4g()
            if (r3 == 0) goto L_0x0020
            X.10I r2 = r4.A05
            r1 = 26
            X.3Cf r0 = new X.3Cf
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
        L_0x0020:
            boolean r0 = super.dispatchTouchEvent(r6)     // Catch:{ IllegalArgumentException -> 0x0025 }
            return r0
        L_0x0025:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ui.ConversationsContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }
}
