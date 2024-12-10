package X;

import java.util.ArrayList;

/* renamed from: X.6Oy  reason: invalid class name and case insensitive filesystem */
public final class C122356Oy extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C128306fm A00;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, X.2rm] */
    public static final void A00(C128306fm r10, C29621ca r11, AnonymousClass9F7 r12) {
        AnonymousClass1UI r0;
        AnonymousClass1UI r02;
        ArrayList A16 = C108955ca.A16(r12, 1);
        try {
            C108945cZ.A1N(r11);
            Object obj = r12.A00;
            ? obj2 = new Object();
            if (obj2.A03(r11, new C21160AfV(obj, C20023A3p.A00, 3), new String[0]) != null) {
                int i = r10.A00;
                C33461ir r03 = ((C33501iv) r10.A01.A01.get()).A02;
                C33461ir.A01(r03);
                C39551tG r04 = (C39551tG) r03.A04.get(Integer.valueOf(i));
                if (r04 != null) {
                    r04.A01 = 0;
                }
                r10.A02.onSuccess();
                return;
            }
            throw AnonymousClass1O9.A00(obj2);
        } catch (AnonymousClass1UI e) {
            A16.add(C17900vP.A0C("DeleteResponseClientSuccess: ", AnonymousClass000.A10(), e));
            C108945cZ.A1N(r11);
            Object obj3 = r12.A00;
            ? obj4 = new Object();
            C20023A3p a3p = C20023A3p.A00;
            if (obj4.A03(r11, C108945cZ.A0W(a3p, 3), new String[]{"error"}) == null) {
                r02 = AnonymousClass1O9.A00(obj4);
            } else if (obj4.A03(r11, new C21160AfV(obj3, a3p, 2), new String[0]) != null) {
                r10.A02.Bti();
                return;
            } else {
                r02 = AnonymousClass1O9.A00(obj4);
            }
            throw r02;
        } catch (AnonymousClass1UI e2) {
            A16.add(C17900vP.A0C("DeleteResponseClientError: ", AnonymousClass000.A10(), e2));
            try {
                C108945cZ.A1N(r11);
                Object obj5 = r12.A00;
                ? obj6 = new Object();
                C20023A3p a3p2 = C20023A3p.A00;
                if (obj6.A03(r11, C108945cZ.A0W(a3p2, 4), new String[]{"error"}) == null) {
                    r0 = AnonymousClass1O9.A00(obj6);
                } else if (obj6.A03(r11, new C21160AfV(obj5, a3p2, 4), new String[0]) != null) {
                    r10.A02.Bti();
                    return;
                } else {
                    r0 = AnonymousClass1O9.A00(obj6);
                }
                throw r0;
            } catch (AnonymousClass1UI e3) {
                throw new AnonymousClass1UI(AnonymousClass000.A0y(C108995ce.A0X("\n", A16), C108995ce.A0a(C17900vP.A0C("DeleteResponseServerError: ", AnonymousClass000.A10(), e3), A16)));
            }
        }
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        this.A00.A02.Bti();
    }

    public C122356Oy(C128306fm r1, AnonymousClass9F7 r2) {
        this.A00 = r2;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        A00(this.A00, r3, (AnonymousClass9F7) C108955ca.A0c(this, r3));
    }

    public void C7Z(C29621ca r3, String str) {
        A00(this.A00, r3, (AnonymousClass9F7) C108955ca.A0c(this, r3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
