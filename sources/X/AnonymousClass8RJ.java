package X;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.8RJ  reason: invalid class name */
public class AnonymousClass8RJ extends C25277CcZ {
    public EditText A00;
    public int A01 = 2131231326;
    public final View.OnClickListener A02 = new AFE(this, 17);

    public boolean A0A() {
        return true;
    }

    public void A06() {
        this.A02.A09(false);
    }

    public void A07() {
        EditText editText = this.A00;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.A00.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public void A08() {
        EditText editText = this.A00;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public void A09(EditText editText) {
        this.A00 = editText;
        this.A02.A09(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B() {
        /*
            r2 = this;
            android.widget.EditText r0 = r2.A00
            if (r0 == 0) goto L_0x000d
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8RJ.A0B():boolean");
    }

    public AnonymousClass8RJ(BIm bIm, int i) {
        super(bIm);
        if (i != 0) {
            this.A01 = i;
        }
    }

    public int A02() {
        return 2131899306;
    }

    public int A03() {
        return this.A01;
    }

    public View.OnClickListener A04() {
        return this.A02;
    }
}
