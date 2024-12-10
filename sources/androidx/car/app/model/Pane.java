package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import java.util.Collections;
import java.util.List;

public final class Pane {
    public final List mActionList = Collections.emptyList();
    public final CarIcon mImage = null;
    public final boolean mIsLoading = false;
    public final List mRows = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pane)) {
            return false;
        }
        Pane pane = (Pane) obj;
        return this.mIsLoading == pane.mIsLoading && AnonymousClass026.A00(this.mActionList, pane.mActionList) && AnonymousClass026.A00(this.mRows, pane.mRows) && AnonymousClass026.A00(this.mImage, pane.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mRows;
        objArr[1] = this.mActionList;
        objArr[2] = Boolean.valueOf(this.mIsLoading);
        return AnonymousClass000.A0P(this.mImage, objArr, 3);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ rows: ");
        List list = this.mRows;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        A10.append(str);
        A10.append(", action list: ");
        return AnonymousClass001.A1G(this.mActionList, A10);
    }
}
