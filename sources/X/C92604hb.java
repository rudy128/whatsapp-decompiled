package X;

/* renamed from: X.4hb  reason: invalid class name and case insensitive filesystem */
public final class C92604hb implements C108345bY, C106575Wj {
    public final C92584hZ A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C92604hb) && C18070vi.A18(this.A00, ((C92604hb) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass4DE BOO() {
        return this.A00.A01;
    }

    public C107855aj BR7() {
        return this.A00.A02;
    }

    public Float BZk() {
        return this.A00.A04;
    }

    public boolean Bet() {
        return this.A00.A05;
    }

    public C92604hb(C92584hZ r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Suspended(previousEnabledState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
