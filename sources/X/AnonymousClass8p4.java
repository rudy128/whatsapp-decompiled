package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8p4  reason: invalid class name */
public final class AnonymousClass8p4 extends C123466Uo {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C32691hb A03;
    public final AnonymousClass00H A04;

    public ArrayList A02(AnonymousClass205 r7, int i, long j) {
        C18070vi.A0d(r7, 0);
        return ((ARP) this.A04.get()).A03(r7, 5, i, j);
    }

    public ArrayList A01(int i, long j) {
        return ((ARP) this.A04.get()).A02(5, i, j);
    }

    public AnonymousClass8p4(C32691hb r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r3, r4, r1, r5);
        this.A00 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r1;
        this.A01 = r5;
    }

    public String A00() {
        return "MessageOrphanSecretEncMessageResolver";
    }

    public void A03(List list, Set set) {
        String str;
        C18070vi.A0h(list, set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C195749tq r4 = (C195749tq) it.next();
            Long l = r4.A07;
            AnonymousClass205 r5 = r4.A06;
            AnonymousClass205 r7 = r4.A05;
            byte[] bArr = r4.A08;
            long j = r4.A02;
            C22931Dv r0 = AnonymousClass1BI.A00;
            AnonymousClass1BI A002 = C22931Dv.A00(r4.A04);
            if (r5 == null || bArr == null || l == null) {
                str = "MessageOrphanSecretEncMessageResolver/resolveOrphanMessages/some required fields are null for the orphan message";
            } else {
                AnonymousClass206 A012 = AnonymousClass1W2.A01(AnonymousClass8BV.A0L(r5, this.A02), this.A00);
                if (A012 == null || C20133A8t.A0B(A012)) {
                    str = "MessageOrphanSecretEncMessageResolver/getProcessedFMessage/parent message not found";
                } else {
                    try {
                        try {
                            C192879p8 A003 = C196699vU.A00(A3S.A00(bArr), r7, j);
                            A003.A02 = A002;
                            AnonymousClass206 A0K = AnonymousClass8BV.A0K(A003.A00(), this.A01);
                            if (!A0K.A0v.A02) {
                                A0K.A0d(A002);
                            }
                            A0K.A10 = -1;
                            if (A0K.A0u != 92 || !AnonymousClass8BV.A1R(A0K)) {
                                Log.e("MessageOrphanSecretEncMessageResolver/resolveOrphanMessages unknown secret enc message. skipping");
                            } else {
                                set.add(l);
                                this.A03.A03(A0K);
                            }
                        } catch (AnonymousClass98Y unused) {
                        } catch (C32701hc e) {
                            Log.e("MessageOrphanSecretEncMessageResolver/getProcessedFMessage/BadMessage:", e);
                        }
                    } catch (AnonymousClass1PN e2) {
                        Log.w("MessageOrphanSecretEncMessageResolver/getProcessedFMessage/cannot convert raw byte to E2E message/", e2);
                    }
                }
            }
            Log.w(str);
        }
    }
}
