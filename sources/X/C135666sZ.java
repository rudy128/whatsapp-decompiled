package X;

/* renamed from: X.6sZ  reason: invalid class name and case insensitive filesystem */
public final class C135666sZ {
    public final AnonymousClass4ZN A00;
    public final AnonymousClass4ZN A01;
    public final Integer A02;
    public final Object A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135666sZ) {
                C135666sZ r5 = (C135666sZ) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A03)) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A02);
    }

    public C135666sZ(AnonymousClass4ZN r1, AnonymousClass4ZN r2, Integer num, Object obj) {
        this.A03 = obj;
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaMessageModel(data=");
        A10.append(this.A03);
        A10.append(", caption=");
        A10.append(this.A01);
        A10.append(", author=");
        A10.append(this.A00);
        A10.append(", mediaIconDrawable=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
