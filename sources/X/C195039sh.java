package X;

import java.util.Map;

/* renamed from: X.9sh  reason: invalid class name and case insensitive filesystem */
public final class C195039sh {
    public Integer A00;
    public final String A01;
    public final Map A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195039sh) {
                C195039sh r5 = (C195039sh) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A032 = (C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A02)) * 31;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "INCOMPLETE";
        } else {
            str = "COMPLETE";
        }
        return AnonymousClass000.A0O(this.A03, AnonymousClass8BW.A03(str, intValue, A032));
    }

    public C195039sh(Integer num, String str, Map map, Map map2) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = num;
        this.A03 = map2;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StateData(stateName=");
        A10.append(this.A01);
        A10.append(", input=");
        A10.append(this.A02);
        A10.append(", status=");
        if (this.A00.intValue() != 0) {
            str = "INCOMPLETE";
        } else {
            str = "COMPLETE";
        }
        A10.append(str);
        A10.append(", resumableBloksData=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
