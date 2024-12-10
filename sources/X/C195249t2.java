package X;

import java.util.List;

/* renamed from: X.9t2  reason: invalid class name and case insensitive filesystem */
public final class C195249t2 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C195249t2(String str, String str2, String str3, List list, long j) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
        this.A04 = list;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195249t2) {
                C195249t2 r8 = (C195249t2) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00 || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A04, AnonymousClass001.A0K(this.A00, (C17880vN.A03(this.A02) + C17900vP.A00(this.A01)) * 31)) + C108955ca.A06(this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Post(id=");
        A10.append(this.A02);
        A10.append(", caption=");
        A10.append(this.A01);
        A10.append(", creationTime=");
        A10.append(this.A00);
        A10.append(", images=");
        A10.append(this.A04);
        A10.append(", postUrl=");
        return C17900vP.A0B(this.A03, A10);
    }
}
