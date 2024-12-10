package X;

import java.util.Map;

/* renamed from: X.4TN  reason: invalid class name */
public final class AnonymousClass4TN {
    public final Map A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C102275Fv(this));

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4TN) && C18070vi.A18(this.A00, ((AnonymousClass4TN) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass4TN(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CompoundedLoaderResults(mappedContacts=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
