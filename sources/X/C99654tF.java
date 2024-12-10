package X;

/* renamed from: X.4tF  reason: invalid class name and case insensitive filesystem */
public final class C99654tF implements C108705cA {
    public final long A00;

    public C23421Fz BFE(AnonymousClass1G1 r5) {
        return C26092CsA.A02(new C27183DXs((AnonymousClass1OS) new AnonymousClass50G((C30391dr) null), (C23421Fz) AnonymousClass4Z6.A00(new AnonymousClass5AN((C30391dr) null, this), r5), 9));
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.DcQ, java.util.List, java.util.AbstractCollection, X.1JC] */
    public String toString() {
        ? r7 = new AnonymousClass1JC();
        r7.backing = new Object[2];
        long j = this.A00;
        if (j > 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("stopTimeout=");
            A10.append(j);
            r7.add(AnonymousClass000.A0y("ms", A10));
        }
        C27354DcQ A02 = AnonymousClass1ZT.A02(r7);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("SharingStarted.WhileSubscribed(");
        return C17900vP.A0B(C29431cG.A0h(", ", A02, (C22821Di) null), A102);
    }

    public static C99654tF A00() {
        return new C99654tF(0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C99654tF) || this.A00 != ((C99654tF) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(Long.MAX_VALUE, AnonymousClass000.A0I(this.A00) * 31);
    }

    public C99654tF(long j) {
        this.A00 = j;
        if (j < 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("stopTimeout(");
            A10.append(j);
            throw AnonymousClass001.A12(" ms) cannot be negative", A10);
        }
    }
}
