package X;

import java.util.Set;

/* renamed from: X.2mk  reason: invalid class name and case insensitive filesystem */
public final class C59702mk {
    public long A00;
    public Integer A01 = null;
    public final long A02;
    public final AnonymousClass206 A03;
    public final AnonymousClass205 A04;
    public final Set A05;

    public C59702mk(AnonymousClass206 r3, AnonymousClass205 r4, Set set, long j, long j2) {
        C18070vi.A0d(r4, 2);
        this.A02 = j;
        this.A04 = r4;
        this.A00 = j2;
        this.A03 = r3;
        this.A05 = set;
        set.add(Long.valueOf(j));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59702mk) {
                C59702mk r8 = (C59702mk) obj;
                if (this.A02 != r8.A02 || !C18070vi.A18(this.A04, r8.A04) || this.A00 != r8.A00 || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A03, AnonymousClass001.A0K(this.A00, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0I(this.A02) * 31)))) + AnonymousClass001.A0k(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommentMessagePreview(parentMessageRowId=");
        A10.append(this.A02);
        A10.append(", parentMessageKey=");
        A10.append(this.A04);
        A10.append(", parentMessageSortId=");
        A10.append(this.A00);
        A10.append(", lastCommentMessage=");
        A10.append(this.A03);
        A10.append(", parentMessageRowIds=");
        A10.append(this.A05);
        A10.append(", unseenSenderCount=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
