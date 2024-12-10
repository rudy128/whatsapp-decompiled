package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.0wD  reason: invalid class name and case insensitive filesystem */
public final class C18330wD {
    public final int A00;
    public final int A01;
    public final C18360wH A02;
    public final String A03;
    public final Set A04;
    public final Set A05;
    public final Set A06;

    public static C18330wD A00(Class cls, Object obj, Class... clsArr) {
        C18340wE r2 = new C18340wE(cls, clsArr);
        r2.A02 = new C65522wd(obj, 1);
        return r2.A00();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.A05.toArray()));
        sb.append(">{");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.A04.toArray()));
        sb.append("}");
        return sb.toString();
    }

    public C18330wD(C18360wH r2, String str, Set set, Set set2, Set set3, int i, int i2) {
        this.A03 = str;
        this.A05 = Collections.unmodifiableSet(set);
        this.A04 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A06 = Collections.unmodifiableSet(set3);
    }
}
