package X;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Dau  reason: case insensitive filesystem */
public class C27268Dau extends Permission {
    public final Set actions;

    public boolean equals(Object obj) {
        return (obj instanceof C27268Dau) && this.actions.equals(((C27268Dau) obj).actions);
    }

    public String getActions() {
        return this.actions.toString();
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof C27268Dau)) {
            return false;
        }
        C27268Dau dau = (C27268Dau) permission;
        return getName().equals(dau.getName()) || this.actions.containsAll(dau.actions);
    }

    public C27268Dau(String str) {
        super(str);
        HashSet A12 = C17880vN.A12();
        this.actions = A12;
        A12.add(str);
    }
}
