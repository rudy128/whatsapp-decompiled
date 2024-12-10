package X;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: X.03d  reason: invalid class name and case insensitive filesystem */
public class C007003d {
    public final TextView A00;
    public final AnonymousClass1Zl A01;

    public TransformationMethod A00(TransformationMethod transformationMethod) {
        return this.A01.A00(transformationMethod);
    }

    /* JADX INFO: finally extract failed */
    public void A02(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.A00.getContext().obtainStyledAttributes(attributeSet, C002501d.A08, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            A03(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void A03(boolean z) {
        this.A01.A02(z);
    }

    public InputFilter[] A04(InputFilter[] inputFilterArr) {
        return this.A01.A03(inputFilterArr);
    }

    public C007003d(TextView textView) {
        this.A00 = textView;
        this.A01 = new AnonymousClass1Zl(textView);
    }

    public void A01() {
    }
}
