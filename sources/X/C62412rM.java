package X;

/* renamed from: X.2rM  reason: invalid class name and case insensitive filesystem */
public final class C62412rM {
    public final long A00;
    public final Boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62412rM) {
                C62412rM r8 = (C62412rM) obj;
                if (!(C18070vi.A18(this.A01, r8.A01) && this.A00 == r8.A00 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0K(this.A00, AnonymousClass001.A0k(this.A01) * 31), this.A02);
    }

    public C62412rM(Boolean bool, long j, boolean z) {
        this.A01 = bool;
        this.A00 = j;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LidChatState(isPhoneNumberShared=");
        A10.append(this.A01);
        A10.append(", phoneRequestedTimeMs=");
        A10.append(this.A00);
        A10.append(", isDuplicateThread=");
        return C17900vP.A0F(A10, this.A02);
    }

    public C62412rM() {
        this((Boolean) null, 0, false);
    }
}
