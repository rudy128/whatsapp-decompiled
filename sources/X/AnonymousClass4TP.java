package X;

/* renamed from: X.4TP  reason: invalid class name */
public final class AnonymousClass4TP {
    public AnonymousClass5YR A00;
    public final C195409tI A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TP) {
                AnonymousClass4TP r5 = (AnonymousClass4TP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public AnonymousClass4TP(C195409tI r1, AnonymousClass5YR r2) {
        this.A00 = r2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QuickPromotionInfo(qp=");
        A10.append(this.A00);
        A10.append(", surveyInfo=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
