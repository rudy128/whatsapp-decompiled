package X;

import java.util.List;

/* renamed from: X.6qb  reason: invalid class name and case insensitive filesystem */
public final class C134446qb {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134446qb) && C18070vi.A18(this.A00, ((C134446qb) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C134446qb(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FDSAdoptionViewerQueryResponse(adaptionViewerQueryList=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
