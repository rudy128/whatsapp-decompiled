package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2md  reason: invalid class name and case insensitive filesystem */
public final class C59632md {
    public final int A00;
    public final int A01;
    public final GroupJid A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59632md) {
                C59632md r5 = (C59632md) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0L(this.A02) + C17900vP.A00(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public C59632md(GroupJid groupJid, String str, int i, int i2) {
        this.A02 = groupJid;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupNode(jid=");
        A10.append(this.A02);
        A10.append(", subject=");
        A10.append(this.A03);
        A10.append(", type=");
        A10.append(this.A00);
        A10.append(", version=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
