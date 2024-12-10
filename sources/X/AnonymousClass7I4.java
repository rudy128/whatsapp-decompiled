package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7I4  reason: invalid class name */
public final class AnonymousClass7I4 implements C1606989o {
    public final /* synthetic */ AnonymousClass705 A00;
    public final /* synthetic */ AnonymousClass77S A01;
    public final /* synthetic */ AnonymousClass6n3 A02;
    public final /* synthetic */ C138386wz A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public void BE5(C138506xC r13) {
        C30131dR A13;
        Long A012;
        C18070vi.A0d(r13, 0);
        if (r13.A00 != 0) {
            C138386wz r8 = this.A03;
            C137916wE r2 = (C137916wE) r8.A01.get();
            AnonymousClass163 r3 = r13.A04;
            C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.xfamily.utils.XFamilyGraphqlErrorProcessor");
            AnonymousClass705 r7 = this.A00;
            AnonymousClass77S r5 = this.A01;
            String str = this.A04;
            List list = this.A05;
            AnonymousClass6n3 r9 = this.A02;
            C21463AkU akU = new C21463AkU(r5, list, r7, r8, r9, str, 9);
            C18070vi.A0d(r3, 0);
            int A052 = C108995ce.A05(r3);
            if (A052 != 3489014 || (A012 = r7.A01()) == null) {
                r9.A00(A052, (Integer) null);
            } else {
                r2.A00.CGv(akU, A012.longValue());
            }
        } else {
            C135916sy r10 = (C135916sy) r13.A03.A00;
            if (r10 == null) {
                this.A02.A00(2, (Integer) null);
                return;
            }
            AnonymousClass6n3 r6 = this.A02;
            C131266ko r4 = AnonymousClass71L.A08;
            C135586sR r92 = r6.A01;
            Map map = r92.A02;
            AnonymousClass71L r82 = r6.A02;
            AnonymousClass00H r32 = r82.A05;
            C58612ky r22 = (C58612ky) C18070vi.A0E(r32);
            AnonymousClass3Ma.A1N(map, 0, r22);
            AnonymousClass77S r23 = (AnonymousClass77S) C20017A3j.A00(new C157167vu(r22, map), 2);
            List list2 = r10.A03;
            if (AnonymousClass000.A1a(list2)) {
                AnonymousClass71L.A00(r23, r92, r82, list2);
            }
            List list3 = r10.A00;
            if (AnonymousClass000.A1a(list3)) {
                AnonymousClass71L.A00(r23, r92, r82, list3);
            }
            List list4 = r10.A01;
            if (AnonymousClass000.A1a(list4)) {
                AnonymousClass71L.A00(r23, r92, r82, list4);
            }
            List list5 = r10.A02;
            if (AnonymousClass000.A1a(list5)) {
                AnonymousClass74B.A06(r82.A00, (AnonymousClass2LI) C18070vi.A0E(r82.A03), r82.A06, r4.A00(r23, (C58612ky) C18070vi.A0E(r32), list5), 4);
            }
            if (AnonymousClass000.A1a(list3) || AnonymousClass000.A1a(list4)) {
                r6.A00.A00(-3, (Integer) null);
                return;
            }
            C132206mO r24 = r6.A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("XFamilyCrosspostRequestSessionManager/Crosspost success for session: ");
            C108995ce.A1O(A10, r24.A01);
            C123366Ue r25 = r24.A00;
            if (r25 instanceof AnonymousClass6QG) {
                AnonymousClass6QG r26 = (AnonymousClass6QG) r25;
                C139026y5 r1 = (C139026y5) C18070vi.A0E(r26.A00.A02);
                List list6 = r26.A03;
                boolean z = r26.A04;
                int i = 10;
                if (z) {
                    i = 9;
                }
                r1.A01((Boolean) null, Integer.valueOf(i), (Integer) null, (Integer) null, r26.A02, list6, 1, z);
                return;
            }
            if (r25 instanceof AnonymousClass6QI) {
                AnonymousClass6QI r27 = (AnonymousClass6QI) r25;
                C41821x7 r12 = r27.A02;
                ((C139026y5) C18070vi.A0E(r12.A05)).A01((Boolean) null, r27.A03, (Integer) null, (Integer) null, r27.A04, r27.A05, 1, true);
                A13 = C108945cZ.A13(r12.A0H);
                C108995ce.A1G(C108945cZ.A11(r12.A0B), A13, C41821x7.A0I);
            } else {
                AnonymousClass6QH r28 = (AnonymousClass6QH) r25;
                C41821x7 r14 = r28.A01;
                ((C139026y5) C18070vi.A0E(r14.A05)).A01((Boolean) null, r28.A02, (Integer) null, (Integer) null, r28.A03, r28.A05, 1, false);
                A13 = C108945cZ.A13(r14.A0H);
                A13.A02(true, "is_account_linked");
            }
            A13.A04("FINISH_CROSSPOST");
            A13.A01();
        }
    }

    public void Bsw(Exception exc) {
        int i;
        Integer num;
        C18070vi.A0d(exc, 0);
        boolean z = exc instanceof C122816Sa;
        AnonymousClass6n3 r2 = this.A02;
        if (z) {
            C1404571m r0 = ((C122816Sa) exc).error;
            i = r0.A01;
            num = Integer.valueOf(r0.A02);
        } else {
            i = 2;
            num = null;
        }
        r2.A00(i, num);
    }

    public AnonymousClass7I4(AnonymousClass705 r1, AnonymousClass77S r2, AnonymousClass6n3 r3, C138386wz r4, String str, List list) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = str;
        this.A05 = list;
    }

    public void BrB(IOException iOException) {
        AnonymousClass6n3 r5 = this.A02;
        AnonymousClass6YJ.A00("XFamilyCrosspostRequestManager/generateCrosspostGraphqlCallback delivery failure", (Throwable) null);
        AnonymousClass6p6 r4 = (AnonymousClass6p6) r5.A02.A07.get();
        C135586sR r0 = r5.A01;
        String str = r0.A01;
        AnonymousClass1IX r02 = r0.A00;
        ArrayList A0D = C29351c6.A0D(r02);
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0D, it);
        }
        r4.A01(str, A0D);
        C132206mO r42 = r5.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostRequestSessionManager/Crosspost delivery failure for session: ");
        String str2 = r42.A01;
        C18070vi.A0d(AnonymousClass000.A0y(str2, A10), 0);
        r42.A00.A00((Integer) null, (Integer) null, str2, false);
    }
}
