package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9lg  reason: invalid class name and case insensitive filesystem */
public class C190889lg {
    public final /* synthetic */ C20375AIg A00;
    public final /* synthetic */ AtomicReference A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C190889lg(C20375AIg aIg, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3) {
        this.A00 = aIg;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = atomicReference3;
    }

    public void A00(double d) {
        AtomicReference atomicReference;
        Double valueOf;
        if (d == -1.0d) {
            atomicReference = this.A03;
            valueOf = AnonymousClass8BV.A0Q();
        } else {
            atomicReference = this.A02;
            valueOf = Double.valueOf(d * AnonymousClass8BW.A00(this.A03));
        }
        atomicReference.set(valueOf);
    }
}
