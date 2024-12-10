package androidx.car.app.model;

import X.AnonymousClass000;
import X.C15550qo;
import java.util.List;

public final class TemplateWrapper {
    public String mId = "";
    public C15550qo mTemplate = null;
    public List mTemplateInfoForScreenStack = AnonymousClass000.A13();

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[template: ");
        A10.append(this.mTemplate);
        A10.append(", ID: ");
        A10.append(this.mId);
        return AnonymousClass000.A0z(A10);
    }
}
