package X;

/* renamed from: X.4Tc  reason: invalid class name and case insensitive filesystem */
public final class C86794Tc {
    public final Integer A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86794Tc) {
                C86794Tc r5 = (C86794Tc) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "ERROR";
        } else {
            str = "SUCCESS";
        }
        return ((str.hashCode() + intValue) * 31) + AnonymousClass001.A0k(this.A00);
    }

    public C86794Tc(Integer num, Integer num2) {
        this.A01 = num;
        this.A00 = num2;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendMessageState(result=");
        if (this.A01.intValue() != 0) {
            str = "ERROR";
        } else {
            str = "SUCCESS";
        }
        A10.append(str);
        A10.append(", messageResId=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
