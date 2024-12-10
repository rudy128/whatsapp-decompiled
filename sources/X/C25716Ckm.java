package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.Ckm  reason: case insensitive filesystem */
public final class C25716Ckm {
    public static final C25716Ckm A01 = new C25716Ckm(AnonymousClass000.A13());
    public final AnonymousClass1IX A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C25716Ckm) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C25716Ckm(List list) {
        this.A00 = AnonymousClass1IX.copyOf((Collection) list);
    }
}
