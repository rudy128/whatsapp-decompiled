package X;

/* renamed from: X.6rn  reason: invalid class name and case insensitive filesystem */
public final class C135186rn {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135186rn) {
                C135186rn r5 = (C135186rn) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(C17890vO.A02(this.A01, C17890vO.A02(this.A00, 0)), this.A02);
    }

    public C135186rn(String str, String str2, boolean z) {
        C108985cd.A1D(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A17(A10, "GenAIImagineEditImagesParams(actorId=");
        A10.append(", clientMutationId=");
        A10.append("");
        A10.append(", previousImageId=");
        A10.append(this.A00);
        A10.append(", prompt=");
        A10.append(this.A01);
        A10.append(", isImagineMe=");
        return C17900vP.A0F(A10, this.A02);
    }
}
