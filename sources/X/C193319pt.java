package X;

/* renamed from: X.9pt  reason: invalid class name and case insensitive filesystem */
public final class C193319pt {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193319pt) {
                C193319pt r5 = (C193319pt) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17880vN.A03(this.A00));
    }

    public C193319pt(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeMLModelAssetDeltaCacheEntry(baseMd5=");
        A10.append(this.A00);
        A10.append(", deltaUrl=");
        return C17900vP.A0B(this.A01, A10);
    }
}
