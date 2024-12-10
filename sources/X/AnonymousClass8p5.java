package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8p5  reason: invalid class name */
public final class AnonymousClass8p5 extends C123466Uo {
    public final AnonymousClass121 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public ArrayList A02(AnonymousClass205 r7, int i, long j) {
        C18070vi.A0d(r7, 0);
        return ((ARP) this.A04.get()).A03(r7, 4, i, j);
    }

    public ArrayList A01(int i, long j) {
        return ((ARP) this.A04.get()).A02(4, i, j);
    }

    public AnonymousClass8p5(AnonymousClass121 r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r1, r4, r5);
        this.A04 = r2;
        this.A03 = r3;
        this.A00 = r1;
        this.A02 = r4;
        this.A01 = r5;
    }

    public String A00() {
        return "MessageOrphanChildWithMessageAssociationResolver";
    }

    public void A03(List list, Set set) {
        String str;
        C18070vi.A0h(list, set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C195749tq r3 = (C195749tq) it.next();
            Long l = r3.A07;
            AnonymousClass205 r8 = r3.A06;
            AnonymousClass205 r4 = r3.A05;
            byte[] bArr = r3.A08;
            long j = r3.A02;
            C22931Dv r2 = AnonymousClass1BI.A00;
            AnonymousClass1BI A002 = C22931Dv.A00(r3.A04);
            C165308av r22 = (C165308av) C23577Bm6.A07(C165308av.DEFAULT_INSTANCE, r3.A09);
            if (r8 == null || bArr == null || l == null || r22 == null) {
                str = AnonymousClass001.A1E(l, "MessageOrphanChildWithMessageAssociationResolver/resolveOrphanMessages/some required fields are null for the orphan message; rowId=", AnonymousClass000.A10());
            } else {
                try {
                    C166418cr A003 = A3S.A00(bArr);
                    AnonymousClass6RT A004 = C50392Ug.A00(Integer.valueOf(r22.associationTypeForMessageAssociation_));
                    if (A004 == null) {
                        str = "MessageOrphanChildWithMessageAssociationResolver/processFMessage/skipping processing as association type is null";
                    } else {
                        AnonymousClass205 A0L = AnonymousClass8BV.A0L(r8, this.A03);
                        if (A0L == null) {
                            str = "MessageOrphanChildWithMessageAssociationResolver/processFMessage/skipping processing as parent message key is null";
                        } else {
                            try {
                                C192879p8 A005 = C196699vU.A00(A003, r4, j);
                                A005.A02 = A002;
                                AnonymousClass206 A0K = AnonymousClass8BV.A0K(A005.A00(), this.A01);
                                C693236t r23 = new C693236t(A004, new A51(A002, A0L), -1);
                                AnonymousClass00H r32 = this.A02;
                                AnonymousClass206 BWH = ((AnonymousClass1RU) r32.get()).BWH(A0K, r23);
                                if (BWH == null || C20133A8t.A0B(BWH)) {
                                    str = "MessageOrphanChildWithMessageAssociationResolver/processFMessage/skipping processing as parent message is null/future message/placeholder message";
                                } else {
                                    A0K.A0b(67108864);
                                    A0K.A0d(A002);
                                    this.A00.BBM(A0K);
                                    ((AnonymousClass1RU) r32.get()).CR9(A0K, BWH, A004);
                                    set.add(l);
                                }
                            } catch (C32711hd e) {
                                Log.e("MessageOrphanChildWithMessageAssociationResolver/processFMessage/BadMessage:", e);
                            }
                        }
                    }
                } catch (AnonymousClass1PN e2) {
                    Log.w("MessageOrphanChildWithMessageAssociationResolver/processFMessage/cannot convert raw byte to E2E message/", e2);
                }
            }
            Log.w(str);
        }
    }
}
