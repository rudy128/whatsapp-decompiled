package X;

import java.util.List;

/* renamed from: X.0VP  reason: invalid class name */
public final class AnonymousClass0VP implements C16270rz {
    public Object A00;
    public final Object A01;
    public final List A02 = AnonymousClass000.A13();

    public void CQI() {
        List list = this.A02;
        if (AnonymousClass000.A1a(list)) {
            this.A00 = list.remove(list.size() - 1);
            return;
        }
        throw AnonymousClass000.A0n("empty stack");
    }

    public AnonymousClass0VP(AnonymousClass0XV r2) {
        this.A01 = r2;
        this.A00 = r2;
    }
}
