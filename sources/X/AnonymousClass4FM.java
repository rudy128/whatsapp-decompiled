package X;

/* renamed from: X.4FM  reason: invalid class name */
public final class AnonymousClass4FM {
    public AnonymousClass1E7 A00;
    public C139106yE A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4FM) {
                AnonymousClass4FM r5 = (AnonymousClass4FM) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01)) * 31;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Suggestion(contact=");
        A10.append(this.A00);
        A10.append(", statusData=");
        A10.append(this.A01);
        A10.append(", profileBadge=");
        return AnonymousClass001.A1F((Object) null, A10);
    }
}
