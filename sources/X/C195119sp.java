package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9sp  reason: invalid class name and case insensitive filesystem */
public final class C195119sp {
    public final int A00;
    public final int A01;
    public final C194359rb A02;
    public final UserJid A03;
    public final List A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195119sp) {
                C195119sp r5 = (C195119sp) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0N(this.A04, AnonymousClass000.A0L(this.A03)) + this.A01) * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A02);
    }

    public C195119sp(C194359rb r1, UserJid userJid, List list, int i, int i2) {
        this.A03 = userJid;
        this.A04 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RefreshCartRequest(bizJid=");
        A10.append(this.A03);
        A10.append(", productIds=");
        A10.append(this.A04);
        A10.append(", width=");
        A10.append(this.A01);
        A10.append(", height=");
        A10.append(this.A00);
        A10.append(", catalogVariantsRequestData=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
