package X;

/* renamed from: X.4TD  reason: invalid class name */
public final class AnonymousClass4TD {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TD) {
                AnonymousClass4TD r5 = (AnonymousClass4TD) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + this.A00.hashCode();
    }

    public AnonymousClass4TD(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SharePnDialogData(myMaskedNumber=");
        A10.append(this.A01);
        A10.append(", learnMoreLink=");
        return C17900vP.A0B(this.A00, A10);
    }
}
