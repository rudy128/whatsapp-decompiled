package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.3Ei  reason: invalid class name and case insensitive filesystem */
public class C71203Ei extends WeakReference {
    public final long A00;
    public final String A01;
    public final WeakReference A02 = new WeakReference(C17880vN.A0p());

    public C71203Ei(Object obj, String str, ReferenceQueue referenceQueue, long j) {
        super(obj, referenceQueue);
        this.A01 = str;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("KeyedWeakReference{key='");
        A10.append(this.A01);
        A10.append('\'');
        A10.append(", timestamp=");
        A10.append(this.A00);
        A10.append(", canary=");
        A10.append(this.A02);
        A10.append(", confirmMarker=");
        A10.append((Object) null);
        return C17890vO.A0b(A10);
    }
}
