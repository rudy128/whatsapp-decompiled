package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.3cd  reason: invalid class name and case insensitive filesystem */
public abstract class C74783cd extends AnonymousClass3gj {
    public C18030ve A00;
    public boolean A01 = C18020vd.A05(C18040vf.A02, this.A00, 6616);
    public float A02;
    public int A03;
    public TextPaint A04;
    public String A05;
    public String A06;
    public String A07;

    public boolean A0K() {
        Editable text;
        if (this instanceof FinalBackspaceAwareEntry) {
            text = FinalBackspaceAwareEntry.A08(getText());
        } else {
            text = getText();
        }
        return TextUtils.isEmpty(text);
    }

    public void setHint(String str) {
        this.A06 = str;
        this.A07 = null;
        requestLayout();
    }

    public void setInputEnterAction(int i) {
        this.A03 = i;
        setRawInputType(180225);
        if (i == 0) {
            i = 1073741824;
        }
        AnonymousClass11C r2 = this.A02;
        if (r2 != null && Build.MANUFACTURER.toLowerCase(Locale.US).contains("htc")) {
            AnonymousClass11B A0O = r2.A0O();
            if (A0O == null) {
                Log.w("conversation-text-entry/set-input-enter-action cr=null");
            } else if ("com.htc.android.htcime/.HTCIMEService".equals(Settings.Secure.getString(A0O.A00, "default_input_method"))) {
                i |= 268435456;
            }
        }
        setImeOptions(i);
    }

    public C74783cd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = this.A03;
        if (i != 0) {
            int i2 = editorInfo.imeOptions;
            int i3 = i2 & 255;
            if ((i & i3) != 0) {
                int i4 = i3 ^ i2;
                editorInfo.imeOptions = i4;
                int i5 = i4 | i;
                editorInfo.imeOptions = i5;
                i2 = i5;
            }
            if ((1073741824 & i2) != 0) {
                editorInfo.imeOptions = i2 & -1073741825;
            }
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        String str;
        int paddingLeft;
        super.onDraw(canvas);
        if (!isInEditMode() && this.A04 != null && !TextUtils.isEmpty(this.A07) && A0K()) {
            C18000vb r0 = this.A03;
            if (r0 == null || AnonymousClass3MY.A1b(r0)) {
                str = this.A07;
                paddingLeft = getPaddingLeft();
            } else {
                this.A04.setTextAlign(Paint.Align.RIGHT);
                str = this.A07;
                paddingLeft = C72463Mc.A09(this);
            }
            canvas.drawText(str, (float) paddingLeft, ((float) getTotalPaddingTop()) - this.A02, this.A04);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String A0y;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.A06) && A0K()) {
            A0y = this.A06;
        } else if (!TextUtils.isEmpty(this.A05) && !A0K()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(getText());
            A0y = AnonymousClass000.A0y(this.A05, A10);
        } else {
            return;
        }
        accessibilityNodeInfo.setText(A0y);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextPaint textPaint;
        super.onLayout(z, i, i2, i3, i4);
        String str = this.A06;
        if (str != null && (textPaint = this.A04) != null && this.A01) {
            this.A07 = TextUtils.ellipsize(str, textPaint, (float) (i3 - i), TextUtils.TruncateAt.END).toString();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A06 != null) {
            if (this.A04 == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A04 = textPaint;
                textPaint.setColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130970055, 2131101191));
                this.A04.setTextSize(getTextSize());
                this.A04.setTextAlign(Paint.Align.LEFT);
                TextPaint textPaint2 = this.A04;
                getContext();
                textPaint2.setTypeface(C43421zm.A01());
            }
            if (!this.A01) {
                this.A07 = TextUtils.ellipsize(this.A06, this.A04, (float) C72473Md.A07(this, getMeasuredWidth()), TextUtils.TruncateAt.END).toString();
            }
            this.A02 = this.A04.getFontMetrics().top;
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!TextUtils.isEmpty(this.A06) && A0K()) {
            accessibilityEvent.getText().add(this.A06);
        }
    }

    public void setContentDescription(String str) {
        super.setContentDescription(str);
        this.A05 = str;
        requestLayout();
    }
}
