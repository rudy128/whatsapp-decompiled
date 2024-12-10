package X;

/* renamed from: X.0V5  reason: invalid class name */
public final class AnonymousClass0V5 implements C17080ti {
    public final int A00;
    public final Object[] A01;
    public final AnonymousClass0KU A02;

    public int BSs(Object obj) {
        AnonymousClass0KU r0 = this.A02;
        int A04 = r0.A04(obj);
        if (A04 >= 0) {
            return r0.A02[A04];
        }
        return -1;
    }

    public Object BTi(int i) {
        Object[] objArr = this.A01;
        int i2 = i - this.A00;
        if (i2 < 0 || i2 > C200410p.A0G(objArr)) {
            return null;
        }
        return objArr[i2];
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.06z, X.0KU] */
    public AnonymousClass0V5(AnonymousClass0V2 r8, C25411Oc r9) {
        int i;
        AnonymousClass0OO r6 = r8.A00;
        int A002 = r9.A00();
        if (A002 >= 0) {
            int min = Math.min(r9.A01(), r6.A00 - 1);
            if (min < A002) {
                this.A02 = AnonymousClass0LV.A00();
                this.A01 = new Object[0];
                return;
            }
            int i2 = (min - A002) + 1;
            this.A01 = new Object[i2];
            this.A00 = A002;
            ? r2 = new AnonymousClass0KU();
            if (i2 >= 0) {
                AnonymousClass070 r0 = AnonymousClass0GO.A01;
                if (i2 == 7) {
                    i = 8;
                } else {
                    i = i2 + ((i2 - 1) / 7);
                }
                AnonymousClass06z.A03(r2, i);
                r6.A03(new C10480iP(r2, this, A002, min), A002, min);
                this.A02 = r2;
                return;
            }
            throw AnonymousClass000.A0k("Capacity must be a positive value.");
        }
        throw AnonymousClass000.A0n("negative nearestRange.first");
    }
}
