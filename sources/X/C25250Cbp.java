package X;

/* renamed from: X.Cbp  reason: case insensitive filesystem */
public final class C25250Cbp {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25250Cbp) {
                C25250Cbp cbp = (C25250Cbp) obj;
                if (!C18070vi.A18(this.A02, cbp.A02) || this.A01 != cbp.A01 || this.A00 != cbp.A00 || !C18070vi.A18(this.A03, cbp.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C26047CrE A00(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        } else if (i == Integer.MIN_VALUE) {
            throw AnonymousClass000.A0n("Item.end should be set first");
        }
        return new C26047CrE(this.A02, this.A03, this.A01, i);
    }

    public int hashCode() {
        return C108945cZ.A09(this.A03, ((((AnonymousClass001.A0k(this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public C25250Cbp(Object obj, String str, int i, int i2) {
        this.A02 = obj;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MutableRange(item=");
        A10.append(this.A02);
        A10.append(", start=");
        A10.append(this.A01);
        A10.append(", end=");
        A10.append(this.A00);
        A10.append(", tag=");
        return C17900vP.A0B(this.A03, A10);
    }
}
