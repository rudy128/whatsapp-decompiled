package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15530qm;
import X.C15550qo;
import java.util.Collections;
import java.util.List;

public class TabTemplate implements C15550qo {
    public final Action mHeaderAction = null;
    public final boolean mIsLoading = false;
    public final C15530qm mTabCallbackDelegate = null;
    public final TabContents mTabContents = null;
    public final List mTabs = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && AnonymousClass026.A00(this.mHeaderAction, tabTemplate.mHeaderAction) && AnonymousClass026.A00(this.mTabs, tabTemplate.mTabs) && AnonymousClass026.A00(this.mTabContents, tabTemplate.mTabContents);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1N(objArr, this.mIsLoading);
        objArr[1] = this.mHeaderAction;
        objArr[2] = this.mTabs;
        return AnonymousClass000.A0P(this.mTabContents, objArr, 3);
    }

    public String toString() {
        return "TabTemplate";
    }
}
