package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3yG  reason: invalid class name and case insensitive filesystem */
public final class C80893yG extends C84914Li {
    public final AnonymousClass1BI A00;
    public final UserJid A01;
    public final Integer A02;
    public final Long A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80893yG) {
                C80893yG r5 = (C80893yG) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A0N = AnonymousClass000.A0N(this.A00, (AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A03)) * 31);
        int intValue = this.A02.intValue();
        if (intValue != 0) {
            str = "EVENT_CREATOR";
        } else {
            str = "NONE";
        }
        return C17880vN.A01((A0N + str.hashCode() + intValue) * 31, this.A04);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80893yG(AnonymousClass1BI r2, UserJid userJid, Integer num, Long l, boolean z) {
        super(AnonymousClass00R.A01);
        C72473Md.A1I(userJid, r2);
        this.A01 = userJid;
        this.A03 = l;
        this.A00 = r2;
        this.A02 = num;
        this.A04 = z;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserItem(userJid=");
        A10.append(this.A01);
        A10.append(", timestamp=");
        A10.append(this.A03);
        A10.append(", chatJid=");
        A10.append(this.A00);
        A10.append(", role=");
        if (this.A02.intValue() != 0) {
            str = "EVENT_CREATOR";
        } else {
            str = "NONE";
        }
        A10.append(str);
        A10.append(", isGoingWithGuest=");
        return C17900vP.A0F(A10, this.A04);
    }
}
