package X;

import java.util.ArrayList;

/* renamed from: X.36p  reason: invalid class name and case insensitive filesystem */
public final class C692836p implements AnonymousClass229 {
    public final ArrayList A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C692836p) && C18070vi.A18(this.A00, ((C692836p) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C692836p(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotPluginAssocMessages(assocMessages=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
