package X;

import java.util.List;

/* renamed from: X.Cb5  reason: case insensitive filesystem */
public final class C25211Cb5 {
    public final C25550Cho A00;
    public final String A01;
    public final List A02;
    public final C441822l A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25211Cb5) {
                C25211Cb5 cb5 = (C25211Cb5) obj;
                if (!C18070vi.A18(this.A03, cb5.A03) || !C18070vi.A18(this.A01, cb5.A01) || !C18070vi.A18(this.A02, cb5.A02) || !C18070vi.A18(this.A00, cb5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A02, C17890vO.A02(this.A01, AnonymousClass000.A0L(this.A03))));
    }

    public C25211Cb5(C25550Cho cho, C441822l r2, String str, List list) {
        this.A03 = r2;
        this.A01 = str;
        this.A02 = list;
        this.A00 = cho;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TranscriptionResult(message=");
        A10.append(this.A03);
        A10.append(", text=");
        A10.append(this.A01);
        A10.append(", segments=");
        A10.append(this.A02);
        A10.append(", locale=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
