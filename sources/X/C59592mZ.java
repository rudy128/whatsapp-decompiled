package X;

/* renamed from: X.2mZ  reason: invalid class name and case insensitive filesystem */
public final class C59592mZ {
    public final int A00;
    public final C40861vP A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59592mZ) {
                C59592mZ r5 = (C59592mZ) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17890vO.A02(this.A02, C17890vO.A02(this.A03, this.A00 * 31)));
    }

    public C59592mZ(C40861vP r1, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeData(noticeId=");
        A10.append(this.A00);
        A10.append(", text=");
        A10.append(this.A03);
        A10.append(", action=");
        A10.append(this.A02);
        A10.append(", noticeTiming=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
