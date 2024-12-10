package X;

/* renamed from: X.0Uo  reason: invalid class name and case insensitive filesystem */
public class C05520Uo implements C16120rk, C17220uJ, C16130rl {
    public final int A00;

    public C05520Uo(int i) {
        this.A00 = i;
    }

    public void BCb(int[] iArr, int[] iArr2, int i) {
        if (this.A00 != 0) {
            AnonymousClass0OB.A01(iArr, iArr2, i, false);
        } else {
            AnonymousClass0OB.A00(iArr, iArr2, i, false);
        }
    }

    public void BCc(C24246By4 by4, int[] iArr, int[] iArr2, int i) {
        int i2 = this.A00;
        C24246By4 by42 = C24246By4.Ltr;
        boolean z = true;
        if (i2 != 0) {
            if (by4 == by42) {
                z = false;
            }
            AnonymousClass0OB.A01(iArr, iArr2, i, z);
            return;
        }
        if (by4 == by42) {
            z = false;
        }
        AnonymousClass0OB.A00(iArr, iArr2, i, z);
    }

    public String toString() {
        if (this.A00 != 0) {
            return "Arrangement#SpaceBetween";
        }
        return "Arrangement#Center";
    }
}
