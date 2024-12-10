package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8ld  reason: invalid class name and case insensitive filesystem */
public final class C169428ld extends AnonymousClass9XB {
    public final C195139sr A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169428ld) {
                C169428ld r5 = (C169428ld) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C169428ld(C195139sr r2, UserJid userJid) {
        super(0);
        C18070vi.A0j(r2, userJid);
        this.A00 = r2;
        this.A01 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StandardCategoryListDisplayItem(categoryData=");
        A10.append(this.A00);
        A10.append(", bizJid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
