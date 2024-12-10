package X;

/* renamed from: X.A1s  reason: case insensitive filesystem */
public final class C19982A1s {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19982A1s) {
                C19982A1s a1s = (C19982A1s) obj;
                if (!C18070vi.A18(this.A01, a1s.A01) || !C18070vi.A18(this.A00, a1s.A00) || !C18070vi.A18(this.A02, a1s.A02) || !C18070vi.A18(this.A03, a1s.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((AnonymousClass001.A0k(this.A01) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03);
    }

    public C19982A1s(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.A01 = bool;
        this.A00 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CreateGroupSuggestionPermissionRequestParams(isAnyoneCanEditGroupEnabled=");
        A10.append(this.A01);
        A10.append(", isAnyoneCanAddEnabled=");
        A10.append(this.A00);
        A10.append(", isAnyoneCanSendMessagesEnabled=");
        A10.append(this.A02);
        A10.append(", isRequireMembershipApproval=");
        return AnonymousClass001.A1F(this.A03, A10);
    }

    public C19982A1s() {
        this((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null);
    }
}
