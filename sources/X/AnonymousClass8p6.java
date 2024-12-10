package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8p6  reason: invalid class name */
public final class AnonymousClass8p6 extends C123466Uo {
    public final AnonymousClass121 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public ArrayList A02(AnonymousClass205 r7, int i, long j) {
        C18070vi.A0d(r7, 0);
        return ((ARP) this.A03.get()).A03(r7, 8, i, j);
    }

    public ArrayList A01(int i, long j) {
        return ((ARP) this.A03.get()).A02(8, i, j);
    }

    public AnonymousClass8p6(AnonymousClass121 r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r4, r1, r5);
        this.A01 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = r1;
        this.A02 = r5;
    }

    public String A00() {
        return "MessageOrphanDetachedChildMessageAssociationResolver";
    }

    public void A03(List list, Set set) {
        C18070vi.A0h(list, set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C195749tq r5 = (C195749tq) it.next();
            Long l = r5.A07;
            AnonymousClass00H r2 = this.A04;
            AnonymousClass205 A012 = ((C59392mE) r2.get()).A01(r5.A06);
            AnonymousClass205 A013 = ((C59392mE) r2.get()).A01(r5.A05);
            C165308av r22 = (C165308av) C23577Bm6.A07(C165308av.DEFAULT_INSTANCE, r5.A09);
            Jid jid = r5.A03;
            if (A012 == null || l == null || r22 == null || (r22.bitField0_ & 8) == 0) {
                Log.w("MessageOrphanDetachedChildMessageAssociationResolver/processOrphanBatch/some required fields are null for the orphan message");
            } else {
                AnonymousClass206 A014 = AnonymousClass1W2.A01(A013, this.A01);
                AnonymousClass6RT A002 = C50392Ug.A00(Integer.valueOf(r22.associationTypeForMessageAssociation_));
                if (!(A002 == null || A014 == null)) {
                    C693236t r1 = new C693236t(A002, new A51((AnonymousClass1BI) jid, A012), -1);
                    AnonymousClass00H r23 = this.A02;
                    AnonymousClass206 BWH = ((AnonymousClass1RU) r23.get()).BWH(A014, r1);
                    if (BWH != null && !C20133A8t.A0B(BWH)) {
                        set.add(l);
                        ((AnonymousClass1RU) r23.get()).BCh(A014, BWH, A002);
                        this.A00.CQw(A014);
                        ((AnonymousClass1RU) r23.get()).CR9(A014, BWH, A002);
                    }
                }
            }
        }
    }
}
