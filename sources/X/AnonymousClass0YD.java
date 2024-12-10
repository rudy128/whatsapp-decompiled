package X;

import android.os.Bundle;

/* renamed from: X.0YD  reason: invalid class name */
public class AnonymousClass0YD implements AnonymousClass1GI {
    public final int A00;
    public final Object A01;

    public AnonymousClass0YD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Bundle CGk() {
        if (this.A00 == 0) {
            return AnonymousClass01C.A00((AnonymousClass01C) this.A01);
        }
        Bundle bundle = new Bundle();
        ((AnonymousClass01E) this.A01).A2n();
        return bundle;
    }
}
