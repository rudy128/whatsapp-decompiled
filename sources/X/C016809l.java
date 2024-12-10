package X;

/* renamed from: X.09l  reason: invalid class name and case insensitive filesystem */
public final class C016809l extends C02000Cg {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C016809l) {
                C016809l r5 = (C016809l) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0B(AnonymousClass000.A05(this.A01), this.A00) + this.A02) * 31) + this.A03) * 31;
    }

    public C016809l(float f, float f2, int i, int i2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Stroke(width=");
        A10.append(this.A01);
        A10.append(", miter=");
        A10.append(this.A00);
        A10.append(", cap=");
        int i = this.A02;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else if (i == 2) {
            str = "Square";
        } else {
            str = "Unknown";
        }
        A10.append(str);
        A10.append(", join=");
        int i2 = this.A03;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else {
            str2 = "Bevel";
        }
        A10.append(str2);
        A10.append(", pathEffect=");
        return AnonymousClass001.A1F((Object) null, A10);
    }
}
