package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.3Bi  reason: invalid class name and case insensitive filesystem */
public final class C70503Bi implements Comparable {
    public final AnonymousClass1BI A00;
    public final String A01;

    public C70503Bi(AnonymousClass1BI r2, String str) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70503Bi) {
                C70503Bi r5 = (C70503Bi) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C70503Bi r3 = (C70503Bi) obj;
        C18070vi.A0d(r3, 0);
        return this.A00.compareTo((Jid) r3.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + C17900vP.A00(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Mention(jid=");
        A10.append(this.A00);
        A10.append(", displayName=");
        return C17900vP.A0B(this.A01, A10);
    }
}
