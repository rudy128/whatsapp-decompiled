package X;

import java.util.List;

/* renamed from: X.4T7  reason: invalid class name */
public final class AnonymousClass4T7 {
    public final Integer A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4T7) {
                AnonymousClass4T7 r5 = (AnonymousClass4T7) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "VIDEO";
                break;
            case 1:
                str = "AUDIO";
                break;
            default:
                str = "OTHER";
                break;
        }
        return AnonymousClass000.A0O(this.A01, (str.hashCode() + intValue) * 31);
    }

    public AnonymousClass4T7(Integer num, List list) {
        this.A00 = num;
        this.A01 = list;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserProblemData(userProblemCategory=");
        switch (this.A00.intValue()) {
            case 0:
                str = "VIDEO";
                break;
            case 1:
                str = "AUDIO";
                break;
            default:
                str = "OTHER";
                break;
        }
        A10.append(str);
        A10.append(", userProblems=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
