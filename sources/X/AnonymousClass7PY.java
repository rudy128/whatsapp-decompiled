package X;

/* renamed from: X.7PY  reason: invalid class name */
public class AnonymousClass7PY implements Comparable {
    public final Class A00;
    public final Object A01;

    public AnonymousClass7PY(Object obj) {
        Class<String> cls = String.class;
        if (cls.isInstance(obj)) {
            this.A01 = obj;
            this.A00 = cls;
            return;
        }
        throw AnonymousClass000.A0k("Mismatched args: value is not an instance of type");
    }

    public int compareTo(Object obj) {
        if (obj instanceof AnonymousClass7PY) {
            AnonymousClass7PY r4 = (AnonymousClass7PY) obj;
            Object obj2 = r4.A01;
            Class cls = r4.A00;
            Class<Float> cls2 = this.A00;
            if (!cls2.equals(cls)) {
                throw AnonymousClass000.A0k("compareTo objects have mismatched types");
            } else if (cls2 == Boolean.class) {
                throw AnonymousClass000.A0k("compareTo should not be called on boolean types");
            } else if (cls2 == String.class) {
                return ((String) this.A01).compareTo((String) obj2);
            } else {
                if (cls2 == Integer.class) {
                    return AnonymousClass1XO.A00(AnonymousClass000.A0M(this.A01), AnonymousClass000.A0M(obj2));
                }
                if (cls2 == Float.class) {
                    return Float.compare(AnonymousClass000.A04(this.A01), AnonymousClass000.A04(obj2));
                }
                throw AnonymousClass000.A0n("Invalid type: must be one of {Boolean, Integer, Float, String}");
            }
        } else {
            throw AnonymousClass000.A0k("compareTo o should be an instance of ConfigPrimitive");
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7PY)) {
            return false;
        }
        AnonymousClass7PY r5 = (AnonymousClass7PY) obj;
        Object obj2 = r5.A01;
        if (!this.A00.equals(r5.A00) || !this.A01.equals(obj2)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.A01.toString();
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A01;
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }
}
