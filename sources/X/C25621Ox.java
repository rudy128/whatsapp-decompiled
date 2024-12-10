package X;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1Ox  reason: invalid class name and case insensitive filesystem */
public class C25621Ox {
    public final List A00 = new CopyOnWriteArrayList();

    public void A00() {
        C191829nG r0;
        for (AnonymousClass3KL r1 : this.A00) {
            C66212xo r12 = (C66212xo) r1;
            int i = r12.A00;
            Object obj = r12.A01;
            switch (i) {
                case 0:
                    AnonymousClass3EH r13 = (AnonymousClass3EH) obj;
                    C18070vi.A0d(r13, 0);
                    r0 = r13.A00;
                    break;
                case 1:
                    AnonymousClass3EI r14 = (AnonymousClass3EI) obj;
                    C18070vi.A0d(r14, 0);
                    r0 = r14.A00;
                    break;
                default:
                    AnonymousClass3EJ r15 = (AnonymousClass3EJ) obj;
                    C18070vi.A0d(r15, 0);
                    r0 = r15.A00;
                    break;
            }
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public void A01(AnonymousClass3KL r3) {
        C17960vV.A07(r3);
        List list = this.A00;
        if (!list.contains(r3)) {
            list.add(r3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Observer ");
        sb.append(r3);
        sb.append(" is already registered.");
        throw new IllegalStateException(sb.toString());
    }
}
