package X;

import android.content.res.Resources;
import java.util.Arrays;

/* renamed from: X.1YI  reason: invalid class name */
public final class AnonymousClass1YI {
    public final Resources.Theme A00;
    public final Resources A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1YI r5 = (AnonymousClass1YI) obj;
            if (!this.A01.equals(r5.A01) || !AnonymousClass026.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public AnonymousClass1YI(Resources.Theme theme, Resources resources) {
        this.A01 = resources;
        this.A00 = theme;
    }
}
