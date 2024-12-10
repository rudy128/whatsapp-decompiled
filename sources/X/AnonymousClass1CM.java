package X;

/* renamed from: X.1CM  reason: invalid class name */
public class AnonymousClass1CM {
    public final AnonymousClass11O A00;
    public final AnonymousClass00H A01 = new C18150vq((Object) null, new C70933Db(14));
    public final AnonymousClass00H A02 = new C18150vq((Object) null, new C70943Dc(this, 18));
    public final AnonymousClass10I A03;

    public boolean A02() {
        return A00(false) == 12;
    }

    public boolean A03() {
        return A00(false) == 20;
    }

    public boolean A04() {
        return A00(false) == 3;
    }

    public boolean A05() {
        return A00(false) == 23;
    }

    public boolean A06() {
        return A00(false) == 19;
    }

    public int A00(boolean z) {
        int i = 0;
        int i2 = this.A00.A00.getInt("registration_state", 0);
        Number number = (Number) ((AnonymousClass1DS) this.A02.get()).A06();
        if (number != null) {
            i = number.intValue();
        }
        if (i2 != i) {
            if (z) {
                this.A03.CGF(new C449425j(this, i2, 3));
            } else {
                ((AnonymousClass1DS) this.A01.get()).A0E(Integer.valueOf(i2));
                return i2;
            }
        }
        return i2;
    }

    public void A01(int i) {
        this.A00.A00.edit().putInt("registration_state", i).apply();
        ((AnonymousClass1DS) this.A01.get()).A0E(Integer.valueOf(i));
    }

    public AnonymousClass1CM(AnonymousClass11O r4, AnonymousClass10I r5) {
        this.A00 = r4;
        this.A03 = r5;
    }
}
