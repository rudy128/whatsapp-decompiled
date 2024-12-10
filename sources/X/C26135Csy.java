package X;

/* renamed from: X.Csy  reason: case insensitive filesystem */
public class C26135Csy {
    public static final AnonymousClass1Bx[] A03 = new AnonymousClass1Bx[0];
    public int A00;
    public boolean A01;
    public AnonymousClass1Bx[] A02;

    public C26135Csy() {
        this(10);
    }

    public static AnonymousClass1Bx[] A00(AnonymousClass1Bx[] r2) {
        return r2.length < 1 ? A03 : (AnonymousClass1Bx[]) r2.clone();
    }

    public AnonymousClass1Bx[] A03() {
        int i = this.A00;
        if (i == 0) {
            return A03;
        }
        AnonymousClass1Bx[] r2 = this.A02;
        if (r2.length == i) {
            this.A01 = true;
            return r2;
        }
        AnonymousClass1Bx[] r1 = new AnonymousClass1Bx[i];
        System.arraycopy(r2, 0, r1, 0, i);
        return r1;
    }

    public AnonymousClass1Bx A01(int i) {
        int i2 = this.A00;
        if (i < i2) {
            return this.A02[i];
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(i);
        throw BEA.A0Z(" >= ", A10, i2);
    }

    public void A02(AnonymousClass1Bx r7) {
        if (r7 != null) {
            AnonymousClass1Bx[] r5 = this.A02;
            int length = r5.length;
            int i = this.A00;
            boolean z = true;
            int i2 = i + 1;
            if (i2 <= length) {
                z = false;
            }
            if (this.A01 || z) {
                AnonymousClass1Bx[] r1 = new AnonymousClass1Bx[Math.max(length, (i2 >> 1) + i2)];
                System.arraycopy(r5, 0, r1, 0, i);
                this.A02 = r1;
                r5 = r1;
                this.A01 = false;
            }
            r5[this.A00] = r7;
            this.A00 = i2;
            return;
        }
        throw AnonymousClass000.A0s("'element' cannot be null");
    }

    public C26135Csy(int i) {
        AnonymousClass1Bx[] r0;
        if (i >= 0) {
            if (i == 0) {
                r0 = A03;
            } else {
                r0 = new AnonymousClass1Bx[i];
            }
            this.A02 = r0;
            this.A00 = 0;
            this.A01 = false;
            return;
        }
        throw AnonymousClass000.A0k("'initialCapacity' must not be negative");
    }
}
