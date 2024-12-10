package X;

/* renamed from: X.A1g  reason: case insensitive filesystem */
public final class C19971A1g {
    public final C194779sH A00;
    public final C25073CWg A01;
    public final C85904Pe A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19971A1g) {
                C19971A1g a1g = (C19971A1g) obj;
                if (!C18070vi.A18(this.A00, a1g.A00) || !C18070vi.A18(this.A01, a1g.A01) || !C18070vi.A18(this.A02, a1g.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A02)) * 31) + 1231;
    }

    public C19971A1g(C194779sH r1, C25073CWg cWg, C85904Pe r3) {
        this.A00 = r1;
        this.A01 = cWg;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ServiceHostConfigParams(avatarSdkParams=");
        A10.append(this.A00);
        A10.append(", platformEventsController=");
        A10.append(this.A01);
        A10.append(", instructionDisplayer=");
        A10.append(this.A02);
        A10.append(", enableSkinSmoothing=");
        return C17900vP.A0F(A10, true);
    }

    public C19971A1g() {
        this((C194779sH) null, (C25073CWg) null, (C85904Pe) null);
    }
}
