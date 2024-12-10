package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C72473Md;
import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class ConversationPaymentRowTransactionLayout extends LinearLayout implements AnonymousClass009 {
    public ViewGroup A00;
    public AnonymousClass031 A01;
    public boolean A02;

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A00();
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        TextView textView = (TextView) AnonymousClass3MY.A0F(this);
        TextView textView2 = (TextView) getChildAt(1);
        if (textView2.getVisibility() != 0) {
            if (textView.getVisibility() != 0) {
                textView = null;
            }
            textView2 = textView;
        }
        super.onMeasure(i, i2);
        if (textView2 != null && this.A00 != null) {
            boolean A1X = AnonymousClass000.A1X(textView2.getLayout());
            int measuredWidth2 = getMeasuredWidth();
            Layout layout = textView2.getLayout();
            if (layout == null) {
                Log.e("ConversationRowTransactionPill/onMeasure/error getting textView layout");
                return;
            }
            if (layout.getLineCount() > 1) {
                int desiredWidth = (int) Layout.getDesiredWidth(textView2.getText().subSequence(layout.getLineStart(layout.getLineCount() - 1), layout.getLineEnd(layout.getLineCount() - 1)), textView2.getPaint());
                int measuredWidth3 = textView2.getMeasuredWidth();
                if (!A1X && textView2.getText() != null && TextUtils.indexOf(textView2.getText(), 10) >= 0) {
                    measuredWidth3 = Math.min(measuredWidth3, ((int) Math.ceil((double) Layout.getDesiredWidth(textView2.getText(), textView2.getPaint()))) + textView2.getPaddingRight() + textView2.getPaddingLeft());
                }
                if (C72473Md.A07(this, measuredWidth2) >= this.A00.getMeasuredWidth() + measuredWidth3) {
                    setMeasuredDimension(measuredWidth3 + this.A00.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), getMeasuredHeight());
                    return;
                }
                if (C72473Md.A07(textView2, measuredWidth3) >= desiredWidth + this.A00.getMeasuredWidth()) {
                    return;
                }
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight() + this.A00.getMeasuredHeight();
            } else {
                if (C72473Md.A07(this, measuredWidth2) >= textView2.getMeasuredWidth() + this.A00.getMeasuredWidth()) {
                    measuredWidth = textView2.getMeasuredWidth() + this.A00.getMeasuredWidth() + getPaddingLeft() + getPaddingRight();
                    if (measuredWidth > getMeasuredWidth()) {
                        measuredHeight = getMeasuredHeight();
                    } else {
                        return;
                    }
                }
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight() + this.A00.getMeasuredHeight();
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    public void setDateWrapper(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        A00();
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public ConversationPaymentRowTransactionLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public ConversationPaymentRowTransactionLayout(Context context) {
        super(context, (AttributeSet) null);
        A00();
    }
}
