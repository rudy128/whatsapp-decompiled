package X;

/* renamed from: X.9qo  reason: invalid class name and case insensitive filesystem */
public final class C193879qo {
    public final String A00;
    public final AnonymousClass206 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193879qo) {
                C193879qo r5 = (C193879qo) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C193879qo(AnonymousClass206 r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TranslationResult(message=");
        A10.append(this.A01);
        A10.append(", translation=");
        return C17900vP.A0B(this.A00, A10);
    }
}
