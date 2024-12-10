package X;

/* renamed from: X.DRx  reason: case insensitive filesystem */
public class C27071DRx implements Cloneable {
    public Integer A00;
    public boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A01 == ((C27071DRx) obj).A01;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * true;
        if (1 - this.A00.intValue() != 0) {
            str = "DEFAULT";
        } else {
            str = "BGRA";
        }
        return C108945cZ.A09(str, i);
    }

    public C27071DRx A00() {
        try {
            return (C27071DRx) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
