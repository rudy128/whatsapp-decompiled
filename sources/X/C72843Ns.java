package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.3Ns  reason: invalid class name and case insensitive filesystem */
public class C72843Ns extends URLSpan implements C39371sy {
    public Typeface A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Context A04;

    public C72843Ns(Context context, String str) {
        super(str);
        this.A04 = context;
        int A002 = AnonymousClass3Ma.A00(context, 2130971981, 2131101293);
        this.A03 = A002;
        this.A02 = AnonymousClass1Z2.A06(A002, 72);
    }

    public void C8s(MotionEvent motionEvent, View view) {
        boolean z = true;
        if (motionEvent.getAction() == 1 && this.A01) {
            onClick(view);
        }
        if (motionEvent.getAction() != 0) {
            z = false;
        }
        this.A01 = z;
        view.invalidate();
    }

    public void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        textPaint.setColor(this.A03);
        if (this.A01) {
            i = this.A02;
        } else {
            i = 0;
        }
        textPaint.bgColor = i;
        textPaint.setUnderlineText(false);
        if (C22891Dp.A04) {
            Typeface typeface = this.A00;
            if (typeface == null) {
                typeface = C43421zm.A00();
                this.A00 = typeface;
            }
            textPaint.setTypeface(typeface);
        }
    }
}
