package X;

import androidx.fragment.app.Fragment;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.27F  reason: invalid class name */
public class AnonymousClass27F extends AnonymousClass02n {
    public final /* synthetic */ C005302h A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ AtomicReference A02;

    public AnonymousClass27F(C005302h r1, Fragment fragment, AtomicReference atomicReference) {
        this.A01 = fragment;
        this.A02 = atomicReference;
        this.A00 = r1;
    }

    public void A01() {
        AnonymousClass02n r0 = (AnonymousClass02n) this.A02.getAndSet((Object) null);
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A02(C1406772n r2, Object obj) {
        AnonymousClass02n r0 = (AnonymousClass02n) this.A02.get();
        if (r0 != null) {
            r0.A02(r2, obj);
            return;
        }
        throw AnonymousClass000.A0n("Operation cannot be started before fragment is in created state");
    }

    public C005302h A00() {
        return this.A00;
    }
}
