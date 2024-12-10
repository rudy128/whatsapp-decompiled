package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.CYc  reason: case insensitive filesystem */
public final class C25108CYc {
    public final List A00;
    public final Map A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C25108CYc cYc = (C25108CYc) obj;
        return this.A02.equals(cYc.A02) && this.A01.equals(cYc.A01) && this.A00.equals(cYc.A00);
    }

    public int hashCode() {
        int hashCode = (31 + this.A02.hashCode()) * 31;
        int hashCode2 = AnonymousClass8BV.A0a().hashCode();
        return (((BE6.A06((((hashCode + hashCode2) * 31) + hashCode2) * 31, hashCode2) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public C25108CYc(C24916CPk cPk) {
        this.A02 = cPk.A02;
        this.A01 = cPk.A01;
        this.A00 = cPk.A00;
    }
}
