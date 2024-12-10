package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6qZ  reason: invalid class name and case insensitive filesystem */
public abstract class C134426qZ {
    public final AnonymousClass00H A00;

    public void A00(C136316tc r12) {
        C139016y4 r6 = (C139016y4) this.A00.get();
        Iterator it = r12.A01.iterator();
        while (it.hasNext()) {
            C139886zb r2 = (C139886zb) it.next();
            Iterator it2 = r12.A02.iterator();
            while (it2.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it2);
                C18070vi.A0b(A0Y);
                C139016y4.A00(r2.A00, A0Y, r6, r12.A04, (String) null, r12.A00, 1);
            }
        }
    }

    public void A01(C147347Su r20, Integer num, String str, List list, int i) {
        List list2;
        Context context;
        C139006y3 r3;
        String str2;
        C147347Su r7 = r20;
        String str3 = str;
        if (this instanceof AnonymousClass6OC) {
            StringBuilder A19 = AnonymousClass3MZ.A19(str3, 1);
            A19.append("CrosspostRequestSessionManager/[Retry]Error encountered for session: ");
            A19.append(str3);
            A19.append(" with exception: ");
            C108995ce.A1K(r7, A19);
            return;
        }
        Integer num2 = num;
        List list3 = list;
        int i2 = i;
        if (this instanceof AnonymousClass6OE) {
            AnonymousClass6OE r4 = (AnonymousClass6OE) this;
            C18070vi.A0j(str3, num2);
            String A02 = AnonymousClass74A.A02(r7);
            C41801x5 r6 = r4.A01;
            C30101dO A002 = C41801x5.A00(r6);
            if (A002 != null) {
                A002.A01(A02, "error");
            }
            C30101dO A003 = C41801x5.A00(r6);
            if (A003 != null) {
                A003.A03("SEE_CROSSPOST_ERROR");
            }
            context = r4.A00;
            str2 = "status_fragment";
            list2 = r4.A03;
            C1603788f r32 = r4.A02;
            if (num2.intValue() == 0) {
                C139126yG r2 = (C139126yG) r6.A0A.get();
                AnonymousClass48k r13 = new AnonymousClass48k(list2, list3, r32, r6, 9);
                r2.A00.CGP(new C21462AkT((C114375qh) new C114405qk(context, r6, r7, num2, str3, list2, list3, i2), (C38471rL) r13, r32, r2));
                return;
            }
            r3 = (C139006y3) r6.A02.get();
        } else {
            AnonymousClass6OD r42 = (AnonymousClass6OD) this;
            C18070vi.A0j(str3, num2);
            String A022 = AnonymousClass74A.A02(r7);
            C41801x5 r22 = r42.A02;
            C30101dO A004 = C41801x5.A00(r22);
            if (A004 != null) {
                A004.A01(A022, "error");
                A004.A03("SEE_CROSSPOST_ERROR");
            }
            r3 = (C139006y3) r22.A02.get();
            context = r42.A00;
            list2 = C18070vi.A0M(r42.A01);
            str2 = r42.A03;
        }
        r3.A01(context, r7, num2, str2, str3, list2, list3, i2);
    }

    public void A02(Integer num, String str) {
        String str2;
        C139126yG r1;
        Integer num2;
        if (this instanceof AnonymousClass6OC) {
            C18070vi.A0d(AnonymousClass001.A1H("CrosspostRequestSessionManager/[Retry]Delivery Failure encountered for session: ", str, AnonymousClass3MZ.A19(str, 0)), 0);
            return;
        }
        if (this instanceof AnonymousClass6OE) {
            AnonymousClass6OE r3 = (AnonymousClass6OE) this;
            C18070vi.A0d(num, 1);
            C41801x5 r8 = r3.A01;
            C30101dO A002 = C41801x5.A00(r8);
            if (A002 != null) {
                A002.A01("no_internet", "error");
                A002.A03("SEE_CROSSPOST_ERROR");
            }
            List list = r3.A04;
            str2 = "status_fragment";
            List list2 = r3.A03;
            C1603788f r7 = r3.A02;
            if (num.intValue() == 0) {
                C139126yG r32 = (C139126yG) r8.A0A.get();
                AnonymousClass48k r4 = new AnonymousClass48k(list2, list, r7, r8, 9);
                r32.A00.CGP(new C21462AkT((C114375qh) new C114425qm(list2, r8, 1), (C38471rL) r4, r7, r32));
                return;
            }
            r8.A02.get();
            r1 = (C139126yG) C18070vi.A0E(r8.A0A);
            C18070vi.A0d(r1, 2);
            num2 = C139006y3.A00(list2);
        } else {
            AnonymousClass6OD r42 = (AnonymousClass6OD) this;
            C41801x5 r33 = r42.A02;
            C30101dO A003 = C41801x5.A00(r33);
            if (A003 != null) {
                A003.A01("no_internet", "error");
                A003.A03("SEE_CROSSPOST_ERROR");
            }
            r33.A02.get();
            List A0M = C18070vi.A0M(r42.A01);
            str2 = r42.A03;
            r1 = (C139126yG) C18070vi.A0E(r33.A0A);
            C18070vi.A0j(str2, r1);
            num2 = C139006y3.A00(A0M);
        }
        r1.A01(num2, str2);
    }

    public C134426qZ(AnonymousClass00H r1) {
        this.A00 = r1;
    }
}
