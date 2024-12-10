package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.2vs  reason: invalid class name and case insensitive filesystem */
public final class C65122vs implements AnonymousClass1GI {
    public final Set A00 = C17880vN.A14();

    public C65122vs(AnonymousClass1GB r2) {
        r2.A03(this, "androidx.savedstate.Restarter");
    }

    public Bundle CGk() {
        Bundle A0D = C17880vN.A0D();
        A0D.putStringArrayList("classes_to_restore", C17880vN.A10(this.A00));
        return A0D;
    }
}
