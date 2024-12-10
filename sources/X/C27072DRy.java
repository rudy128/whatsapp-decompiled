package X;

/* renamed from: X.DRy  reason: case insensitive filesystem */
public class C27072DRy implements Cloneable {
    public Integer A00;
    public boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A01 == ((C27072DRy) obj).A01;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * true;
        switch (this.A00.intValue()) {
            case 1:
                str = "BGRA";
                break;
            case 2:
                str = "YUV_GL3";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return C108945cZ.A09(str, i);
    }

    public C27072DRy A00() {
        try {
            return (C27072DRy) super.clone();
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
