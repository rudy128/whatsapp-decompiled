package X;

import com.whatsapp.jid.Jid;
import java.util.Collection;

/* renamed from: X.4im  reason: invalid class name and case insensitive filesystem */
public final class C93314im implements C108225bL {
    public final AnonymousClass1BI A00;
    public final AnonymousClass4ZN A01;

    public boolean BgJ(Collection collection) {
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93314im) {
                C93314im r5 = (C93314im) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4ZN BVD() {
        return this.A01;
    }

    public boolean BgI(Jid jid) {
        return C18070vi.A18(jid, this.A00);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public C93314im(AnonymousClass1BI r1, AnonymousClass4ZN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NotAdhoc(jid=");
        A10.append(this.A00);
        A10.append(", name=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
