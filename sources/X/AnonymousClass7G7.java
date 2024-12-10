package X;

/* renamed from: X.7G7  reason: invalid class name */
public class AnonymousClass7G7 implements C72243Le {
    public int A00 = 0;
    public int A01 = 0;

    public boolean C8B(int i, boolean z) {
        if (z) {
            this.A01++;
        }
        if (this.A01 < 128) {
            return true;
        }
        this.A00 = i;
        return false;
    }

    public int BU0() {
        return this.A00;
    }
}
