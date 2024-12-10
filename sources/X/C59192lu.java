package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2lu  reason: invalid class name and case insensitive filesystem */
public final class C59192lu {
    public final UserJid A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59192lu) {
                C59192lu r5 = (C59192lu) obj;
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

    public C59192lu(UserJid userJid, boolean z) {
        this.A00 = userJid;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QualityBizIntentFlagResultInfo(jid=");
        A10.append(this.A00);
        A10.append(", bizIntentFlag=");
        return C17900vP.A0F(A10, this.A01);
    }
}
