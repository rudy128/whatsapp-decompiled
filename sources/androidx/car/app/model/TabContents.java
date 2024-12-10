package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import X.C15550qo;

public class TabContents {
    public C15550qo mTemplate = null;

    public int hashCode() {
        return AnonymousClass000.A0P(this.mTemplate, new Object[1], 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabContents)) {
            return false;
        }
        return AnonymousClass026.A00(this.mTemplate, ((TabContents) obj).mTemplate);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[template: ");
        return AnonymousClass001.A1G(this.mTemplate, A10);
    }
}
