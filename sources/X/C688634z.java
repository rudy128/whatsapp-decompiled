package X;

import java.util.Set;

/* renamed from: X.34z  reason: invalid class name and case insensitive filesystem */
public final class C688634z implements B5K {
    public final long A00;
    public final C59052lg A01;
    public final C58882lP A02;
    public final String A03;
    public final Set A04;
    public final C58892lQ A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C688634z) {
                C688634z r8 = (C688634z) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((AnonymousClass000.A0I(this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17900vP.A00(this.A03)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A05);
    }

    public C688634z(C59052lg r1, C58882lP r2, C58892lQ r3, String str, Set set, long j) {
        this.A00 = j;
        this.A02 = r2;
        this.A03 = str;
        this.A04 = set;
        this.A01 = r1;
        this.A05 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingNewsletterValues(serverId=");
        A10.append(this.A00);
        A10.append(", plaintext=");
        A10.append(this.A02);
        A10.append(", newsletterReactionFromMe=");
        A10.append(this.A03);
        A10.append(", newsletterVotes=");
        A10.append(this.A04);
        A10.append(", newsletterEditMetaNode=");
        A10.append(this.A01);
        A10.append(", wamo=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
