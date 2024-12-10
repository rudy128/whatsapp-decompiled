package X;

import java.util.List;

/* renamed from: X.2mU  reason: invalid class name and case insensitive filesystem */
public final class C59552mU {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public C59552mU(String str, String str2, List list, List list2) {
        C18070vi.A0d(list, 2);
        this.A01 = str;
        this.A02 = list;
        this.A00 = str2;
        this.A03 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59552mU) {
                C59552mU r5 = (C59552mU) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, C17890vO.A02(this.A00, AnonymousClass000.A0N(this.A02, C17880vN.A03(this.A01))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FailedValidationInfo(wamEventName=");
        A10.append(this.A01);
        A10.append(", conditions=");
        A10.append(this.A02);
        A10.append(", failedExpression=");
        A10.append(this.A00);
        A10.append(", fieldsInFailedExpression=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
