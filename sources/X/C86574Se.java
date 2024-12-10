package X;

/* renamed from: X.4Se  reason: invalid class name and case insensitive filesystem */
public final class C86574Se {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86574Se) && this.A00 == ((C86574Se) obj).A00);
    }

    public int hashCode() {
        String str;
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "CONSENT";
        } else {
            str = "ONBOARDING";
        }
        return str.hashCode() + intValue;
    }

    public C86574Se(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendClickResult(openUi=");
        Integer num = this.A00;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "CONSENT";
        } else {
            str = "ONBOARDING";
        }
        return C17900vP.A0B(str, A10);
    }
}
