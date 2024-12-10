package X;

/* renamed from: X.6qr  reason: invalid class name and case insensitive filesystem */
public final class C134606qr {
    public final String A00;
    public final boolean A01;

    public C134606qr(String str, boolean z) {
        C18070vi.A0d(str, 3);
        this.A00 = str;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134606qr) {
                C134606qr r5 = (C134606qr) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((C17890vO.A02(this.A00, 0) + 1231) * 31, this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A17(A10, "GenAIImagineAnimateImagesParams(actorId=");
        A10.append(", clientMutationId=");
        A10.append("");
        A10.append(", previousImageId=");
        A10.append(this.A00);
        C108975cc.A16(A10, ", returnWaUri=");
        A10.append(", isImagineMe=");
        return C17900vP.A0F(A10, this.A01);
    }
}
