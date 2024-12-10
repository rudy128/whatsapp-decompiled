package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4XC  reason: invalid class name */
public final class AnonymousClass4XC {
    public final AnonymousClass00H A00;

    public AnonymousClass4XC(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final List A00(C89494cY r6, List list) {
        if (list == null) {
            return C18460wS.A00;
        }
        ArrayList A10 = C17880vN.A10(list);
        Iterator it = A10.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!C18070vi.A18(((C89494cY) it.next()).A06(), r6.A06())) {
                i++;
            } else if (i != -1) {
                A10.set(i, r6);
                return A10;
            }
        }
        A10.add(r6);
        return A10;
    }

    public final Intent A01(Context context, C29681ch r4, C89494cY r5) {
        if (r5 instanceof AnonymousClass443) {
            this.A00.get();
            return AnonymousClass1LU.A0y(context, r4, (AnonymousClass443) r5);
        } else if (r5 instanceof AnonymousClass445) {
            this.A00.get();
            AnonymousClass445 r1 = (AnonymousClass445) r5;
            return AnonymousClass1LU.A0u(context, r4, r1, A00(r5, r1.A08));
        } else if (r5 instanceof AnonymousClass444) {
            this.A00.get();
            return AnonymousClass1LU.A0v(context, r4, (AnonymousClass444) r5);
        } else if (r5 instanceof AnonymousClass442) {
            this.A00.get();
            return AnonymousClass1LU.A0x(context, r4, (AnonymousClass442) r5);
        } else if (r5 instanceof AnonymousClass446) {
            this.A00.get();
            AnonymousClass446 r12 = (AnonymousClass446) r5;
            return AnonymousClass1LU.A0w(context, r4, r12, A00(r5, r12.A08));
        } else {
            throw AnonymousClass3MW.A14();
        }
    }
}
