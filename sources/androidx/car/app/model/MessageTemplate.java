package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15550qo;
import java.util.Collections;
import java.util.List;

public final class MessageTemplate implements C15550qo {
    public final List mActionList = Collections.emptyList();
    public final ActionStrip mActionStrip = null;
    public final CarText mDebugMessage = null;
    public final Action mHeaderAction = null;
    public final CarIcon mIcon = null;
    public final boolean mIsLoading = false;
    public final CarText mMessage = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && AnonymousClass026.A00(this.mTitle, messageTemplate.mTitle) && AnonymousClass026.A00(this.mMessage, messageTemplate.mMessage) && AnonymousClass026.A00(this.mDebugMessage, messageTemplate.mDebugMessage) && AnonymousClass026.A00(this.mHeaderAction, messageTemplate.mHeaderAction) && AnonymousClass026.A00(this.mActionList, messageTemplate.mActionList) && AnonymousClass026.A00(this.mIcon, messageTemplate.mIcon) && AnonymousClass026.A00(this.mActionStrip, messageTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        AnonymousClass000.A1N(objArr, this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mMessage;
        objArr[3] = this.mDebugMessage;
        objArr[4] = this.mHeaderAction;
        objArr[5] = this.mActionList;
        objArr[6] = this.mIcon;
        return AnonymousClass000.A0P(this.mActionStrip, objArr, 7);
    }

    public String toString() {
        return "MessageTemplate";
    }
}
