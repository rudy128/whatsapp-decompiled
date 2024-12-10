package X;

import java.lang.ref.WeakReference;

/* renamed from: X.06T  reason: invalid class name */
public final class AnonymousClass06T extends C02160Cy {
    public final WeakReference A00;

    public void A00() {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null && ((AnonymousClass0Bs) weakReference.get()).A19()) {
            ((AnonymousClass0Bs) weakReference.get()).A10(true);
        }
    }

    public void A01(int i, CharSequence charSequence) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null && !((AnonymousClass0Bs) weakReference.get()).A1B() && ((AnonymousClass0Bs) weakReference.get()).A19()) {
            ((AnonymousClass0Bs) weakReference.get()).A0r(new C03420Ia(i, charSequence));
        }
    }

    public void A02(AnonymousClass0HL r4) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null && ((AnonymousClass0Bs) weakReference.get()).A19()) {
            if (r4.A00 == -1) {
                r4 = new AnonymousClass0HL(r4.A01, ((AnonymousClass0Bs) weakReference.get()).A0W());
            }
            ((AnonymousClass0Bs) weakReference.get()).A0t(r4);
        }
    }

    public void A03(CharSequence charSequence) {
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            ((AnonymousClass0Bs) weakReference.get()).A0w(charSequence);
        }
    }

    public AnonymousClass06T(AnonymousClass0Bs r2) {
        this.A00 = new WeakReference(r2);
    }
}
