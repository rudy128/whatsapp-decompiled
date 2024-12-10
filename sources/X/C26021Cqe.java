package X;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: X.Cqe  reason: case insensitive filesystem */
public final class C26021Cqe {
    public static final Uri A04 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final ComponentName A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26021Cqe) {
                C26021Cqe cqe = (C26021Cqe) obj;
                if (!C25332Cdd.A01(this.A01, cqe.A01) || !C25332Cdd.A01(this.A02, cqe.A02) || !C25332Cdd.A01(this.A00, cqe.A00) || this.A03 != cqe.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass000.A1b(this.A01, 5);
        A1b[1] = this.A02;
        A1b[2] = this.A00;
        C17890vO.A1G(A1b, 4225);
        BE8.A1Q(A1b, this.A03);
        return Arrays.hashCode(A1b);
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.A00;
        C18210vx.A00(componentName);
        return componentName.flattenToString();
    }

    public C26021Cqe(String str, String str2, boolean z) {
        C18210vx.A03(str);
        this.A01 = str;
        C18210vx.A03(str2);
        this.A02 = str2;
        this.A00 = null;
        this.A03 = z;
    }

    public C26021Cqe(ComponentName componentName) {
        this.A01 = null;
        this.A02 = null;
        C18210vx.A00(componentName);
        this.A00 = componentName;
        this.A03 = false;
    }
}
