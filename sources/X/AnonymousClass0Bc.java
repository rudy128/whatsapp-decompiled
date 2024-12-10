package X;

/* renamed from: X.0Bc  reason: invalid class name */
public final class AnonymousClass0Bc extends AnonymousClass0HF implements C17400ub {
    public long A00 = C25293Ccv.A00(Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final C22821Di A01;

    public /* synthetic */ boolean BC2(C22821Di r2) {
        return AnonymousClass0LD.A01(this, r2);
    }

    public /* synthetic */ Object BLT(Object obj, AnonymousClass1OS r3) {
        return AnonymousClass0LD.A00(this, obj, r3);
    }

    public /* synthetic */ C17090tj CP5(C17090tj r2) {
        return AnonymousClass0EW.A00(this, r2);
    }

    public void C2y(long j) {
        if (this.A00 != j) {
            this.A01.invoke(C26142Ct5.A00(j));
            this.A00 = j;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0Bc)) {
            return false;
        }
        return C18070vi.A18(this.A01, ((AnonymousClass0Bc) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass0Bc(C22821Di r3, C22821Di r4) {
        super(r4);
        this.A01 = r3;
    }
}
