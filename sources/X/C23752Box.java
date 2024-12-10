package X;

/* renamed from: X.Box  reason: case insensitive filesystem */
public class C23752Box extends C25836Cmq {
    public final Class A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C23752Box)) {
                return false;
            }
            Class cls = this.A00;
            Class cls2 = ((C23752Box) obj).A00;
            if (cls == null) {
                return cls2 == null;
            }
            if (!cls.equals(cls2)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.getName();
    }

    public C23752Box(Class cls) {
        this.A00 = cls;
    }
}
