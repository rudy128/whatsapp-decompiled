package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass026;
import X.C15550qo;

public final class PaneTemplate implements C15550qo {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final Pane mPane = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return AnonymousClass026.A00(this.mTitle, paneTemplate.mTitle) && AnonymousClass026.A00(this.mPane, paneTemplate.mPane) && AnonymousClass026.A00(this.mHeaderAction, paneTemplate.mHeaderAction) && AnonymousClass026.A00(this.mActionStrip, paneTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mTitle;
        objArr[1] = this.mPane;
        objArr[2] = this.mHeaderAction;
        return AnonymousClass000.A0P(this.mActionStrip, objArr, 3);
    }

    public String toString() {
        return "PaneTemplate";
    }
}
