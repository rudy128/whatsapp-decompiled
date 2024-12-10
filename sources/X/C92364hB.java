package X;

/* renamed from: X.4hB  reason: invalid class name and case insensitive filesystem */
public final class C92364hB implements C107865ak {
    public final AnonymousClass4DE A00;
    public final AnonymousClass4D9 A01;

    public C92364hB(AnonymousClass4DE r2, AnonymousClass4D9 r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92364hB) {
                C92364hB r5 = (C92364hB) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4DE BOO() {
        return this.A00;
    }

    public AnonymousClass4D9 BZx() {
        return this.A01;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DisableArEffectParams(surface=");
        A10.append(this.A01);
        A10.append(", category=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
