package X;

/* renamed from: X.3oZ  reason: invalid class name and case insensitive filesystem */
public final class C76873oZ extends AnonymousClass4EF {
    public final AnonymousClass1BI A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76873oZ) {
                C76873oZ r5 = (C76873oZ) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public C76873oZ(AnonymousClass1BI r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnlockChat(chatJid=");
        A10.append(this.A00);
        A10.append(", openChatDirectly=");
        return C17900vP.A0F(A10, this.A01);
    }
}
