package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15410qa;
import X.C15570qq;
import androidx.car.app.model.CarText;

public final class InputSignInMethod implements C15570qq {
    public final CarText mDefaultValue = null;
    public final CarText mErrorMessage = null;
    public final CarText mHint = null;
    public final C15410qa mInputCallbackDelegate = null;
    public final int mInputType = 1;
    public final int mKeyboardType = 1;
    public final boolean mShowKeyboardByDefault = false;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputSignInMethod)) {
            return false;
        }
        InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
        return this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && AnonymousClass026.A00(this.mHint, inputSignInMethod.mHint) && AnonymousClass026.A00(this.mDefaultValue, inputSignInMethod.mDefaultValue) && AnonymousClass026.A00(this.mErrorMessage, inputSignInMethod.mErrorMessage);
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.mHint;
        objArr[1] = this.mDefaultValue;
        objArr[2] = Integer.valueOf(this.mInputType);
        objArr[3] = this.mErrorMessage;
        objArr[4] = Integer.valueOf(this.mKeyboardType);
        return AnonymousClass000.A0P(Boolean.valueOf(this.mShowKeyboardByDefault), objArr, 5);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[inputType:");
        A10.append(this.mInputType);
        A10.append(", keyboardType: ");
        A10.append(this.mKeyboardType);
        return AnonymousClass000.A0z(A10);
    }
}
