package X;

/* renamed from: X.4Tz  reason: invalid class name and case insensitive filesystem */
public final class C87024Tz {
    public final String A00;
    public final boolean A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87024Tz) {
                C87024Tz r5 = (C87024Tz) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A02, C17880vN.A03(this.A00)), this.A01);
    }

    public C87024Tz(String str, String str2, boolean z) {
        C18070vi.A0j(str, str2);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Memory(memoryContent=");
        A10.append(this.A00);
        A10.append(", memoryId=");
        A10.append(this.A02);
        A10.append(", added=");
        return C17900vP.A0F(A10, this.A01);
    }
}
