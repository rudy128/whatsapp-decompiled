package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Y5  reason: invalid class name */
public abstract class AnonymousClass6Y5 {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.6hj] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.6hj] */
    public static final C136306tb A00(DFL dfl, boolean z) {
        boolean z2;
        String str;
        String str2;
        boolean z3 = z;
        ArrayList A13 = AnonymousClass000.A13();
        if (dfl != null) {
            List A0F = dfl.A0F(40);
            C18070vi.A0X(A0F);
            int size = A0F.size();
            for (int i = 0; i < size; i++) {
                DFL dfl2 = (DFL) A0F.get(i);
                ? obj = new Object();
                C18070vi.A0b(dfl2);
                obj.A02 = dfl2.A0D(38);
                obj.A03 = dfl2.A0I(40, false);
                obj.A00 = dfl2.A0A(36);
                String A0D = dfl2.A0D(35);
                if (A0D != null) {
                    obj.A01 = A0D;
                }
                if (obj.A02 == null && obj.A01 == null) {
                    throw AnonymousClass000.A0k("Title or icon must be set");
                }
                A13.add(new C133746pQ(obj));
            }
        }
        C133746pQ r8 = null;
        if (dfl != null) {
            DFL A09 = dfl.A09(43);
            if (A09 != null) {
                ? obj2 = new Object();
                obj2.A02 = A09.A0D(38);
                obj2.A03 = A09.A0I(40, false);
                obj2.A00 = A09.A0A(36);
                String A0D2 = A09.A0D(35);
                if (A0D2 != null) {
                    obj2.A01 = A0D2;
                }
                if (obj2.A02 == null && obj2.A01 == null) {
                    throw AnonymousClass000.A0k("Title or icon must be set");
                }
                r8 = new C133746pQ(obj2);
            }
            str2 = dfl.A0D(36);
            z3 = dfl.A0I(35, false);
            str = dfl.A0D(38);
            z2 = dfl.A0I(41, false);
        } else {
            str2 = null;
            str = null;
            z2 = false;
        }
        return new C136306tb(r8, str2, str, A13, z3, z2);
    }
}
