package X;

import java.util.List;

/* renamed from: X.9tQ  reason: invalid class name and case insensitive filesystem */
public final class C195489tQ {
    public final long A00;
    public final long A01;
    public final C29681ch A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final List A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195489tQ) {
                C195489tQ r8 = (C195489tQ) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || this.A01 != r8.A01 || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0K(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass8BV.A00(this.A00))) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + C17880vN.A02(this.A04);
    }

    public C195489tQ(C29681ch r1, Long l, Long l2, String str, List list, long j, long j2) {
        this.A00 = j;
        this.A02 = r1;
        this.A01 = j2;
        this.A05 = str;
        this.A03 = l;
        this.A06 = list;
        this.A04 = l2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterMyOrphanAddOns(id=");
        A10.append(this.A00);
        A10.append(", newsletterJid=");
        A10.append(this.A02);
        A10.append(", serverMessageId=");
        A10.append(this.A01);
        A10.append(", myReaction=");
        A10.append(this.A05);
        A10.append(", myReactionMs=");
        A10.append(this.A03);
        A10.append(", myVotes=");
        A10.append(this.A06);
        A10.append(", myVotesMs=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
