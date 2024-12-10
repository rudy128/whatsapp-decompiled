package X;

/* renamed from: X.9s1  reason: invalid class name and case insensitive filesystem */
public final class C194619s1 {
    public final AnonymousClass9Ji A00;
    public final AnonymousClass205 A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194619s1) {
                C194619s1 r5 = (C194619s1) obj;
                if (this.A02 != r5.A02 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass3MX.A03(this.A02)));
    }

    public C194619s1(AnonymousClass9Ji r1, AnonymousClass205 r2, boolean z) {
        this.A02 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageSecretParams(sendAsLidMessage=");
        A10.append(this.A02);
        A10.append(", parentMessageKey=");
        A10.append(this.A01);
        A10.append(", messageSecretEncryptedType=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
