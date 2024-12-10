package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.72g  reason: invalid class name and case insensitive filesystem */
public final class C1406272g {
    public AnonymousClass6VS A00;
    public AnonymousClass6VT A01;
    public C124076Wy A02;
    public final HashMap A03 = C17880vN.A11();
    public final Map A04 = C17880vN.A11();
    public final Map A05 = C17880vN.A11();
    public final Map A06 = C17880vN.A11();
    public final Map A07 = C17880vN.A11();
    public final Map A08 = C17880vN.A11();
    public final AnonymousClass6VR A09;
    public final C124086Wz A0A;

    public static final C126886dS A00(C126876dR r8, C1406272g r9) {
        Map map;
        AnonymousClass6ZB r4;
        String str = ((C114065q6) r8).A05;
        C130716jt r6 = (C130716jt) r9.A06.get(str);
        C148057gp r0 = new C148057gp(r8);
        if (r6 == null) {
            r6 = ((C114065q6) r0.$rawInputData).A03;
        }
        synchronized (r9) {
            C18070vi.A0d(str, 0);
            map = r9.A07;
            r4 = (AnonymousClass6ZB) map.get(str);
        }
        if (r4 == null) {
            r4 = new AnonymousClass6ZB();
        }
        C18460wS r1 = C18460wS.A00;
        C18070vi.A0d(r1, 1);
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C18070vi.A0d(next, 0);
            r4.A00.put(C49442Qm.INVISIBLE, next);
        }
        synchronized (r9) {
            map.put(str, r4);
        }
        return new C126886dS(r4, r6);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.6UF] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.6UF] */
    public static final AnonymousClass6UF A01(C126876dR r6, C1406272g r7) {
        AnonymousClass6UF r2;
        C114065q6 r5 = (C114065q6) r6;
        String str = r5.A05;
        synchronized (r7) {
            C18070vi.A0d(str, 0);
            AnonymousClass6UF r22 = (AnonymousClass6UF) r7.A08.get(str);
            r2 = r22;
            if (r22 == null) {
                C134016ps A002 = AnonymousClass73T.A00(str);
                C134016ps A003 = AnonymousClass73T.A00(str);
                ? obj = new Object();
                obj.A01 = A002;
                obj.A00 = A003;
                r2 = obj;
            }
        }
        AnonymousClass73T r4 = AnonymousClass73T.A00;
        C134016ps r3 = r2.A00;
        C134016ps r23 = r2.A01;
        if (r5.A04 == AnonymousClass00R.A01 && !r3.A00()) {
            r3 = r4.A03(r6, r3);
        }
        C134016ps A032 = r4.A03(r6, r23);
        ? obj2 = new Object();
        obj2.A01 = A032;
        obj2.A00 = r3;
        return obj2;
    }

    public static final boolean A02(C126876dR r6, AnonymousClass6UF r7) {
        List list = r7.A01.A07;
        if (AnonymousClass000.A1a(list) && ((C123376Uf) list.get(AnonymousClass3MX.A02(list, 1))).A01 != -1) {
            return true;
        }
        if (((C114065q6) r6).A04 != AnonymousClass00R.A01 || r7.A00.A00()) {
            return false;
        }
        return true;
    }

    public C1406272g(AnonymousClass6VR r2, AnonymousClass6VS r3, AnonymousClass6VT r4, C124076Wy r5, C124086Wz r6) {
        this.A01 = r4;
        this.A02 = r5;
        this.A0A = r6;
        this.A00 = r3;
        this.A09 = r2;
    }
}
