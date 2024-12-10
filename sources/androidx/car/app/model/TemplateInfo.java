package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;

public final class TemplateInfo {
    public final Class mTemplateClass = null;
    public final String mTemplateId = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return AnonymousClass026.A00(this.mTemplateClass, templateInfo.mTemplateClass) && AnonymousClass026.A00(this.mTemplateId, templateInfo.mTemplateId);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mTemplateClass;
        return AnonymousClass000.A0P(this.mTemplateId, objArr, 1);
    }
}
