package androidx.car.app.model.signin;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15550qo;
import X.C15570qq;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;

public final class SignInTemplate implements C15550qo {
    public final List mActionList = Collections.emptyList();
    public final ActionStrip mActionStrip = null;
    public final CarText mAdditionalText = null;
    public final Action mHeaderAction = null;
    public final CarText mInstructions = null;
    public final boolean mIsLoading = false;
    public final C15570qq mSignInMethod = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTemplate)) {
            return false;
        }
        SignInTemplate signInTemplate = (SignInTemplate) obj;
        return this.mIsLoading == signInTemplate.mIsLoading && AnonymousClass026.A00(this.mHeaderAction, signInTemplate.mHeaderAction) && AnonymousClass026.A00(this.mTitle, signInTemplate.mTitle) && AnonymousClass026.A00(this.mInstructions, signInTemplate.mInstructions) && AnonymousClass026.A00(this.mAdditionalText, signInTemplate.mAdditionalText) && AnonymousClass026.A00(this.mActionStrip, signInTemplate.mActionStrip) && AnonymousClass026.A00(this.mActionList, signInTemplate.mActionList) && AnonymousClass026.A00(this.mSignInMethod, signInTemplate.mSignInMethod);
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        AnonymousClass000.A1N(objArr, this.mIsLoading);
        objArr[1] = this.mHeaderAction;
        objArr[2] = this.mTitle;
        objArr[3] = this.mInstructions;
        objArr[4] = this.mAdditionalText;
        objArr[5] = this.mActionStrip;
        objArr[6] = this.mActionList;
        return AnonymousClass000.A0P(this.mSignInMethod, objArr, 7);
    }

    public String toString() {
        return "SignInTemplate";
    }
}
