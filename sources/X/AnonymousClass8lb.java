package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8lb  reason: invalid class name */
public final class AnonymousClass8lb extends AnonymousClass9XB {
    public final C195139sr A00;
    public final UserJid A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8lb(C195139sr r2, UserJid userJid) {
        super(2);
        C18070vi.A0d(userJid, 2);
        this.A00 = r2;
        this.A01 = userJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8lb) {
                AnonymousClass8lb r5 = (AnonymousClass8lb) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExpandableCategoryParentItem(categoryData=");
        A10.append(this.A00);
        A10.append(", bizJid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
