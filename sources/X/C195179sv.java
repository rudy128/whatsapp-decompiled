package X;

import java.util.List;

/* renamed from: X.9sv  reason: invalid class name and case insensitive filesystem */
public final class C195179sv {
    public final int A00;
    public final long A01;
    public final AnonymousClass1BI A02;
    public final List A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195179sv) {
                C195179sv r8 = (C195179sv) obj;
                if (!(C18070vi.A18(this.A02, r8.A02) && this.A00 == r8.A00 && C18070vi.A18(this.A03, r8.A03) && this.A04 == r8.A04 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A03, (AnonymousClass000.A0L(this.A02) + this.A00) * 31), this.A04));
    }

    public C195179sv(AnonymousClass1BI r1, List list, int i, long j, boolean z) {
        this.A02 = r1;
        this.A00 = i;
        this.A03 = list;
        this.A04 = z;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReadEventParams(chatJid=");
        A10.append(this.A02);
        A10.append(", readSource=");
        A10.append(this.A00);
        A10.append(", unreadMessageKeys=");
        A10.append(this.A03);
        A10.append(", isBulkAction=");
        A10.append(this.A04);
        A10.append(", eventTime=");
        return C17900vP.A0E(A10, this.A01);
    }
}
