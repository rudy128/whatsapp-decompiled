package X;

/* renamed from: X.9rL  reason: invalid class name and case insensitive filesystem */
public final class C194199rL {
    public final String A00;
    public final Integer A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194199rL) {
                C194199rL r5 = (C194199rL) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, C17890vO.A02(this.A00, AnonymousClass001.A0k(this.A01) * 31));
    }

    public C194199rL(Integer num, String str, String str2) {
        this.A01 = num;
        this.A00 = str;
        this.A02 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ModelAssetMetadata(bytecodeVersion=");
        A10.append(this.A01);
        A10.append(", fileName=");
        A10.append(this.A00);
        A10.append(", operators=");
        return C17900vP.A0B(this.A02, A10);
    }
}
