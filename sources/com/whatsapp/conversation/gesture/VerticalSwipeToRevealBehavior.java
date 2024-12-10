package com.whatsapp.conversation.gesture;

import X.C18030ve;
import X.C41481wT;
import X.C41511wY;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.gesture.VerticalSwipeDownBehavior;

public class VerticalSwipeToRevealBehavior extends VerticalSwipeDownBehavior {
    public float A00 = Float.MIN_VALUE;
    public boolean A01 = false;
    public final int A02;
    public final int A03;
    public final View A04;
    public final View A05;
    public final LinearLayout A06;
    public final C41481wT A07;

    public VerticalSwipeToRevealBehavior(Context context, View view, View view2, LinearLayout linearLayout, C41481wT r6, C18030ve r7, int i) {
        super(context, r7);
        this.A04 = view;
        this.A06 = linearLayout;
        this.A05 = view2;
        this.A02 = i;
        this.A07 = r6;
        this.A03 = i / 2;
        this.A03 = new C41511wY(this);
    }
}
