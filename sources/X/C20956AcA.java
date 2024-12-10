package X;

/* renamed from: X.AcA  reason: case insensitive filesystem */
public final class C20956AcA implements AnonymousClass25C, AnonymousClass25D {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20956AcA) {
                C20956AcA acA = (C20956AcA) obj;
                if (this.A02 != acA.A02 || !C18070vi.A18(this.A00, acA.A00) || !C18070vi.A18(this.A01, acA.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass3MX.A03(this.A02) + C17900vP.A00(this.A00)) * 31) + C108955ca.A06(this.A01);
    }

    public C20956AcA(String str, String str2, boolean z) {
        this.A02 = z;
        this.A00 = str;
        this.A01 = str2;
    }

    public void BF3(AnonymousClass206 r3, AnonymousClass206 r4) {
        AnonymousClass206.A05(r4, AnonymousClass9RV.A00(r3), C20956AcA.class);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DataSharingDisclosureMetadata(showMarketingMessageDisclosure=");
        A10.append(this.A02);
        A10.append(", encryptedSignalTokenDisclosed=");
        A10.append(this.A00);
        A10.append(", encryptedSignalTokenUnDisclosed=");
        return C17900vP.A0B(this.A01, A10);
    }
}
