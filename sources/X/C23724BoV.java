package X;

import com.instagram.common.bloks.payload.BloksComponentQueryResources;

/* renamed from: X.BoV  reason: case insensitive filesystem */
public final class C23724BoV extends C23725BoW {
    public final BloksComponentQueryResources A00;
    public final CO7 A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23724BoV) {
                C23724BoV boV = (C23724BoV) obj;
                if (!C18070vi.A18(this.A02, boV.A02) || !C18070vi.A18(this.A00, boV.A00) || !C18070vi.A18(this.A01, boV.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, (C17880vN.A03(this.A02) + AnonymousClass001.A0k(this.A00)) * 31);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23724BoV(CO7 co7, BloksComponentQueryResources bloksComponentQueryResources, String str) {
        super(co7, str);
        C72473Md.A1I(str, co7);
        this.A02 = str;
        this.A00 = bloksComponentQueryResources;
        this.A01 = co7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Resource(key=");
        A10.append(this.A02);
        A10.append(", resources=");
        A10.append(this.A00);
        A10.append(", summary=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
