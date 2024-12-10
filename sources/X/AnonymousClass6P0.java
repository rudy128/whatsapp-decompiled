package X;

import java.util.ArrayList;

/* renamed from: X.6P0  reason: invalid class name */
public final class AnonymousClass6P0 extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C125636bP A00;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.2rm] */
    public static final void A00(C125636bP r10, C29621ca r11, AnonymousClass9F7 r12) {
        AnonymousClass1UI r0;
        AnonymousClass1UI r02;
        C18070vi.A0e(r12, 1, r10);
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C108945cZ.A1N(r11);
            Object obj = r12.A00;
            ? obj2 = new Object();
            C20023A3p a3p = C20023A3p.A00;
            if (obj2.A03(r11, new C21160AfV(obj, a3p, 10), new String[0]) != null) {
                obj2.A02(r11, C108945cZ.A0W(a3p, 10), new String[]{"notice"});
                r10.A00.onSuccess();
                return;
            }
            throw AnonymousClass1O9.A00(obj2);
        } catch (AnonymousClass1UI e) {
            A13.add(C17900vP.A0C("SetResponseSuccess: ", AnonymousClass000.A10(), e));
            C108945cZ.A1N(r11);
            Object obj3 = r12.A00;
            ? obj4 = new Object();
            C20023A3p a3p2 = C20023A3p.A00;
            if (obj4.A03(r11, C108945cZ.A0W(a3p2, 8), new String[]{"error"}) == null) {
                r02 = AnonymousClass1O9.A00(obj4);
            } else if (obj4.A03(r11, new C21160AfV(obj3, a3p2, 8), new String[0]) != null) {
                r10.A00.Bti();
                return;
            } else {
                r02 = AnonymousClass1O9.A00(obj4);
            }
            throw r02;
        } catch (AnonymousClass1UI e2) {
            A13.add(C17900vP.A0C("SetResponseClientError: ", AnonymousClass000.A10(), e2));
            try {
                C108945cZ.A1N(r11);
                Object obj5 = r12.A00;
                ? obj6 = new Object();
                C20023A3p a3p3 = C20023A3p.A00;
                if (obj6.A03(r11, C108945cZ.A0W(a3p3, 9), new String[]{"error"}) == null) {
                    r0 = AnonymousClass1O9.A00(obj6);
                } else if (obj6.A03(r11, new C21160AfV(obj5, a3p3, 9), new String[0]) != null) {
                    r10.A00.Bti();
                    return;
                } else {
                    r0 = AnonymousClass1O9.A00(obj6);
                }
                throw r0;
            } catch (AnonymousClass1UI e3) {
                throw new AnonymousClass1UI(AnonymousClass000.A0y(C108995ce.A0X("\n", A13), C108995ce.A0a(C17900vP.A0C("SetResponseServerError: ", AnonymousClass000.A10(), e3), A13)));
            }
        }
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        this.A00.A00.Bti();
    }

    public AnonymousClass6P0(C125636bP r1, AnonymousClass9F7 r2) {
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
