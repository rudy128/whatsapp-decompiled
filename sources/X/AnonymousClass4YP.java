package X;

/* renamed from: X.4YP  reason: invalid class name */
public final class AnonymousClass4YP {
    public final AnonymousClass206 A00;
    public final AnonymousClass205 A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YP) {
                AnonymousClass4YP r5 = (AnonymousClass4YP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A00);
        Integer num = this.A02;
        return ((A0L + C72453Mb.A0E(num, A00(num))) * 31) + AnonymousClass001.A0k(this.A01);
    }

    public AnonymousClass4YP(AnonymousClass206 r1, AnonymousClass205 r2, Integer num) {
        this.A00 = r1;
        this.A02 = num;
        this.A01 = r2;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ADDED";
            case 1:
                return "DELETED";
            case 2:
                return "EDITED";
            case 3:
                return "UNDO_DELETED";
            default:
                return "DEFAULT";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PinInChatMessageChange(message=");
        A10.append(this.A00);
        A10.append(", type=");
        A10.append(A00(this.A02));
        A10.append(", previousMessageKeyBeforeEdit=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
