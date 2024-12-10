package X;

import com.whatsapp.jid.Jid;
import java.util.Collection;

/* renamed from: X.4il  reason: invalid class name and case insensitive filesystem */
public final class C93304il implements C108225bL {
    public final AnonymousClass4ZN A00;
    public final Collection A01;

    public boolean BgI(Jid jid) {
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93304il) {
                C93304il r5 = (C93304il) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass4ZN BVD() {
        return this.A00;
    }

    public boolean BgJ(Collection collection) {
        return C18070vi.A18(collection, this.A01);
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C93304il(AnonymousClass4ZN r1, Collection collection) {
        this.A01 = collection;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Adhoc(jids=");
        A10.append(this.A01);
        A10.append(", name=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
