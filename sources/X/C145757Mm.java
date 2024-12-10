package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7Mm  reason: invalid class name and case insensitive filesystem */
public final class C145757Mm implements C72413Lv {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C150607kx(this));

    public C145757Mm(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void Bi5(String str) {
        C18070vi.A0d(str, 0);
        Map<String, ?> all = C17880vN.A0C(this.A01).getAll();
        C18070vi.A0X(all);
        Iterator A15 = AnonymousClass000.A15(all);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            Object value = A16.getValue();
            C18070vi.A0b(A0x);
            if (!AnonymousClass1YE.A0A(A0x, "ab_props:sys:", false)) {
                StringBuilder A11 = AnonymousClass000.A11(str);
                A11.append("/abprops key=");
                A11.append(A0x);
                C17900vP.A0Y(value, " value=", A11);
            }
        }
    }

    public /* synthetic */ void BiC(C186289dx r1) {
    }

    public /* synthetic */ void BiY(String str) {
    }
}
