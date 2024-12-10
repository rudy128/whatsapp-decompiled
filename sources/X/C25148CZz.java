package X;

import android.content.ComponentName;

/* renamed from: X.CZz  reason: case insensitive filesystem */
public final class C25148CZz {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.window.core.ActivityComponentInfo");
                C25148CZz cZz = (C25148CZz) obj;
                if (!C18070vi.A18(this.A01, cZz.A01) || !C18070vi.A18(this.A00, cZz.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, C17880vN.A03(this.A01));
    }

    public C25148CZz(ComponentName componentName) {
        String packageName = componentName.getPackageName();
        C18070vi.A0X(packageName);
        String className = componentName.getClassName();
        C18070vi.A0X(className);
        this.A01 = packageName;
        this.A00 = className;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ClassInfo { packageName: ");
        A10.append(this.A01);
        A10.append(", className: ");
        A10.append(this.A00);
        return AnonymousClass000.A0y(" }", A10);
    }
}
