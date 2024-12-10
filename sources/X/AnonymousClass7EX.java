package X;

/* renamed from: X.7EX  reason: invalid class name */
public final class AnonymousClass7EX implements AnonymousClass5XY {
    public final Integer A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7EX) {
                AnonymousClass7EX r5 = (AnonymousClass7EX) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public AnonymousClass7EX(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UrlActionBehaviour(paidMessagingUserInteractionsActionTarget=");
        A10.append(this.A00);
        A10.append(", qbmMessageClickButtonClickedType=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
