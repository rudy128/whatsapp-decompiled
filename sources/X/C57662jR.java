package X;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2jR  reason: invalid class name and case insensitive filesystem */
public final class C57662jR {
    public final AnonymousClass1KB A00;
    public final C139246yW A01;
    public final AnonymousClass00H A02;
    public final C33251iW A03;

    public C57662jR(AnonymousClass1KB r1, C33251iW r2, C139246yW r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r4, r3, r2);
        this.A00 = r1;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r2;
    }

    public final void A00(Context context, List list, boolean z) {
        if (AnonymousClass000.A1a(list)) {
            AnonymousClass1BI r1 = ((AnonymousClass206) list.get(0)).A0v.A00;
            if (C22971Dz.A0e(r1) && ((C42211xo) this.A02.get()).A03(r1)) {
                if (z) {
                    this.A00.CGP(new C98834rn((Object) this, 5));
                    return;
                }
                return;
            }
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            AnonymousClass21V r2 = (AnonymousClass21V) next;
            if (C50302Tx.A00(r2)) {
                C139246yW r0 = this.A01;
                C17960vV.A07(r0);
                r0.A01(r2);
            } else {
                C62572rc A002 = AnonymousClass206.A00(r2);
                C18070vi.A0X(A002);
                if (!A002.A0V && !A002.A0f && r2.A1F() && A002.A07 != 1) {
                    A13.add(next);
                }
            }
        }
        C33251iW r4 = this.A03;
        Activity A003 = AnonymousClass1L9.A00(context);
        C18070vi.A0z(A003, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        if (!A13.isEmpty()) {
            AnonymousClass1NM r9 = r4.A0J;
            AnonymousClass00H r22 = r4.A1c;
            AnonymousClass1KB r7 = r4.A03;
            if (r9.A04(new AnonymousClass7Ek(A003, r7, (AnonymousClass11Z) r22.get()))) {
                AnonymousClass18K r12 = r4.A0d;
                C144787Ir r5 = new C144787Ir(A003, r7, r4.A0G, r9, (AnonymousClass11Z) r22.get(), AnonymousClass25A.A05(r4.A0S, (AnonymousClass206) A13.get(0)), r12);
                if (C22781De.A03()) {
                    r4.A19.CGF(new C21455AkM(r4, r5, A13, 4));
                    return;
                }
                Iterator it = A13.iterator();
                while (it.hasNext()) {
                    r4.A0n.A0D(r5, C17880vN.A0b(it), 0);
                }
            }
        }
    }
}
