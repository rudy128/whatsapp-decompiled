package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import java.util.List;

public final class Header {
    public final List mEndHeaderActions = AnonymousClass000.A13();
    public final Action mStartHeaderAction = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return AnonymousClass026.A00(this.mTitle, header.mTitle) && AnonymousClass026.A00(this.mEndHeaderActions, header.mEndHeaderActions) && AnonymousClass026.A00(this.mStartHeaderAction, header.mStartHeaderAction);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mTitle;
        objArr[1] = this.mEndHeaderActions;
        return AnonymousClass000.A0P(this.mStartHeaderAction, objArr, 2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Header: ");
        A10.append(this.mTitle);
        return A10.toString();
    }
}
