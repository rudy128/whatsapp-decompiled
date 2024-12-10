package X;

/* renamed from: X.4UE  reason: invalid class name */
public final class AnonymousClass4UE {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UE) {
                AnonymousClass4UE r5 = (AnonymousClass4UE) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A002 = ((C17900vP.A00(this.A00) * 31) + C17900vP.A00(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A002 + i;
    }

    public AnonymousClass4UE(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CtwaDeeplinkContentFlow(flowCta=");
        A10.append(this.A00);
        A10.append(", flowId=");
        A10.append(this.A02);
        A10.append(", flowFirstScreen=");
        return C17900vP.A0B(this.A01, A10);
    }
}
