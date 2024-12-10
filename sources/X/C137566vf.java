package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6vf  reason: invalid class name and case insensitive filesystem */
public abstract class C137566vf {
    public static final AnonymousClass6US A00 = new C114175qH(new AnonymousClass6US[0]);

    public static AnonymousClass6US A00() {
        ArrayList A0z = C17880vN.A0z(4);
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "http";
        A1Z[1] = "https";
        List asList = Arrays.asList(A1Z);
        if (!asList.isEmpty()) {
            A0z.add(new C114185qI(asList));
            return AnonymousClass6VX.A00(A0z);
        }
        throw AnonymousClass000.A0k("Cannot set 0 schemes");
    }
}
