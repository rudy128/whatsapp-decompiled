package X;

/* renamed from: X.4Ts  reason: invalid class name and case insensitive filesystem */
public final class C86954Ts {
    public final C29681ch A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86954Ts) {
                C86954Ts r5 = (C86954Ts) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return AnonymousClass000.A0O(this.A00, C72453Mb.A0E(num, AnonymousClass4H5.A00(num)) * 31);
    }

    public C86954Ts(C29681ch r1, Integer num) {
        this.A01 = num;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterSuccessAction(action=");
        A10.append(AnonymousClass4H5.A00(this.A01));
        A10.append(", jid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
