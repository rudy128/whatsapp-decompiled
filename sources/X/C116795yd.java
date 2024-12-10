package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.5yd  reason: invalid class name and case insensitive filesystem */
public final class C116795yd extends AnonymousClass6T2 {
    public final UserJid A00;
    public final boolean A01;
    public final C87814Xd A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C116795yd) {
                C116795yd r5 = (C116795yd) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A00, AnonymousClass000.A0L(this.A02)), this.A01);
    }

    public C116795yd(C87814Xd r1, UserJid userJid, boolean z) {
        this.A02 = r1;
        this.A00 = userJid;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(result=");
        A10.append(this.A02);
        A10.append(", preferredId=");
        A10.append(this.A00);
        A10.append(", showPreThreadBlockingDisclosure=");
        return C17900vP.A0F(A10, this.A01);
    }
}
