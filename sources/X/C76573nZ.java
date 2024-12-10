package X;

/* renamed from: X.3nZ  reason: invalid class name and case insensitive filesystem */
public final class C76573nZ extends C86594Sg {
    public final C106735Wz A00;

    public boolean A00(C86594Sg r2) {
        C18070vi.A0d(r2, 0);
        return equals(r2);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76573nZ) && C18070vi.A18(this.A00, ((C76573nZ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C76573nZ(C106735Wz r2) {
        super(8);
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("JoinLeaveButtonState(buttonGroupState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
