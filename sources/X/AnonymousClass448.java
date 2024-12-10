package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.448  reason: invalid class name */
public abstract class AnonymousClass448 extends C74843d0 implements TextWatcher {
    public boolean A00;
    public boolean A01;
    public float A02;
    public int A03;
    public int A04;
    public boolean A05 = false;
    public final Handler A06 = C17890vO.A0D();
    public final Paint A07 = AnonymousClass3MZ.A0A();
    public final RectF A08 = AnonymousClass3MW.A08();
    public final Runnable A09 = new C21425Ajs((Object) this, 18);

    public abstract void afterTextChanged(Editable editable);

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) this;
        if (!TextUtils.isEmpty(charSequence)) {
            paymentAmountInputField.A0D = paymentAmountInputField.A0A.BLk(paymentAmountInputField.A09, charSequence.toString());
        }
    }

    public abstract int getCursorColor();

    public abstract int getCursorVerticalPadding();

    public abstract int getCursorWidth();

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean hasFocus() {
        return this.A00;
    }

    public void setCustomCursorEnabled(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            Handler handler = this.A06;
            Runnable runnable = this.A09;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            boolean z2 = !z;
            setFocusable(z2);
            setCursorVisible(z2);
            if (z) {
                addTextChangedListener(this);
            } else {
                removeTextChangedListener(this);
            }
        }
    }

    public void setHasFocus(boolean z) {
        if (z != this.A00) {
            this.A00 = z;
            Handler handler = this.A06;
            Runnable runnable = this.A09;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
            PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) this;
            C108275bQ r1 = paymentAmountInputField.A0B;
            if (r1 != null) {
                Editable text = paymentAmountInputField.getText();
                C17960vV.A07(text);
                r1.Buo(text.toString(), z);
            }
        }
    }

    public AnonymousClass448(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0C();
    }

    private void A0C() {
        this.A04 = getCursorWidth();
        this.A03 = getCursorVerticalPadding();
        Paint paint = this.A07;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getCursorColor());
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A05 && this.A01) {
            RectF rectF = this.A08;
            float f = this.A02;
            rectF.set(f, (float) this.A03, ((float) this.A04) + f, (float) (getHeight() - this.A03));
            canvas.drawRect(rectF, this.A07);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (getText() == null || TextUtils.isEmpty(AnonymousClass3Ma.A12(this))) {
            this.A02 = 0.0f;
        } else {
            PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) this;
            float A062 = PaymentAmountInputField.A06(paymentAmountInputField, AnonymousClass3Ma.A12(this), paymentAmountInputField.getTextSize());
            this.A02 = A062;
            if (this.A05) {
                i3 = this.A04;
            } else {
                i3 = 0;
            }
            i = View.MeasureSpec.makeMeasureSpec((int) (A062 + ((float) i3) + ((float) getPaddingLeft()) + ((float) getPaddingRight())), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public AnonymousClass448(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0G();
        A0C();
    }

    public AnonymousClass448(Context context) {
        super(context);
        A0G();
        A0C();
    }
}
