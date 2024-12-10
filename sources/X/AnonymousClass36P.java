package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.36P  reason: invalid class name */
public final class AnonymousClass36P implements C437420t {
    public final C32251gt A00;
    public final C18030ve A01;
    public final AnonymousClass118 A02;
    public final C18000vb A03;

    public AnonymousClass3KT BXU(AnonymousClass206 r9) {
        AnonymousClass1D6 r1;
        Object obj;
        C18070vi.A0d(r9, 0);
        AnonymousClass247 r92 = (AnonymousClass247) r9;
        if (C18020vd.A05(C18040vf.A02, this.A01, 11281)) {
            C32251gt r12 = this.A00;
            C18070vi.A0d(r92, 0);
            AnonymousClass1BI r0 = r92.A0v.A00;
            if (r0 != null) {
                HashMap hashMap = r12.A00;
                synchronized (hashMap) {
                    ArrayList arrayList = (ArrayList) hashMap.get(r0);
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (C18070vi.A18(((C59252m0) obj).A02, r92)) {
                                break;
                            }
                        }
                        C59252m0 r3 = (C59252m0) obj;
                        if (r3 != null) {
                            r1 = AnonymousClass1D6.A01(Long.valueOf(r3.A00), Long.valueOf(r3.A01));
                        }
                    }
                }
                long A05 = C17880vN.A05(r1.first);
                long A052 = C17880vN.A05(r1.second);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("📷 ");
                Context context = this.A02.A00;
                C18070vi.A0X(context);
                return C690335q.A01(AnonymousClass000.A0y(C49852Se.A00(context, this.A03, A05, A052), A10));
            }
        }
        r1 = AnonymousClass1D6.A01(Long.valueOf(r92.A02), Long.valueOf(r92.A03));
        long A053 = C17880vN.A05(r1.first);
        long A0522 = C17880vN.A05(r1.second);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("📷 ");
        Context context2 = this.A02.A00;
        C18070vi.A0X(context2);
        return C690335q.A01(AnonymousClass000.A0y(C49852Se.A00(context2, this.A03, A053, A0522), A102));
    }

    public AnonymousClass36P(C32251gt r1, AnonymousClass118 r2, C18000vb r3, C18030ve r4) {
        C18070vi.A0s(r4, r2, r3, r1);
        this.A01 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ AnonymousClass3KT BXT(AnonymousClass206 r2) {
        return C690235p.A00;
    }
}
