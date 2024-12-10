package X;

import java.util.List;

/* renamed from: X.6FK  reason: invalid class name */
public final class AnonymousClass6FK extends C39611tM implements C39621tN {
    public final AnonymousClass1E7 A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6FK(AnonymousClass1E7 r2, List list) {
        super(r2, 38);
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = list;
    }

    public AnonymousClass1BI BTb() {
        return AnonymousClass1E7.A00(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InvitableContactListItem{contact=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
