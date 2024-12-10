package X;

public final class BRI extends C3C {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BRI) {
                BRI bri = (BRI) obj;
                if (!C18070vi.A18(this.A00, bri.A00) || !C18070vi.A18(this.A02, bri.A02) || this.A03 != bri.A03 || !C18070vi.A18(this.A01, bri.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, AnonymousClass0DV.A00(C17890vO.A02(this.A02, C17880vN.A03(this.A00)), this.A03));
    }

    public BRI(String str, String str2, boolean z, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarMemoryLoadResultEvent(entityId=");
        A10.append(this.A00);
        A10.append(", requestId=");
        A10.append(this.A02);
        A10.append(", success=");
        A10.append(this.A03);
        A10.append(", errorString=");
        return C17900vP.A0B(this.A01, A10);
    }
}
