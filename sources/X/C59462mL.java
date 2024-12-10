package X;

/* renamed from: X.2mL  reason: invalid class name and case insensitive filesystem */
public final class C59462mL {
    public final String A00;
    public final String A01;
    public final String A02;

    public C59462mL(String str, String str2, String str3) {
        C18070vi.A0d(str3, 3);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59462mL) {
                C59462mL r5 = (C59462mL) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, C17880vN.A03(this.A02)) + this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NotificationChannelConversation(settingsId=");
        A10.append(this.A02);
        A10.append(", parentChannelId=");
        A10.append(this.A01);
        A10.append(", conversationId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
