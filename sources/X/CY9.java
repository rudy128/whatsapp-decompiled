package X;

import java.lang.reflect.Method;

@Deprecated
public final class CY9 {
    public final int A00;
    public final Method A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CY9)) {
            return false;
        }
        CY9 cy9 = (CY9) obj;
        return this.A00 == cy9.A00 && this.A01.getName().equals(cy9.A01.getName());
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01.getName(), this.A00 * 31);
    }

    public CY9(Method method, int i) {
        this.A00 = i;
        this.A01 = method;
        method.setAccessible(true);
    }
}
