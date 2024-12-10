package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8p7  reason: invalid class name */
public final class AnonymousClass8p7 extends C123466Uo {
    public final AnonymousClass12N A00;
    public final C59392mE A01;
    public final AnonymousClass1W6 A02;
    public final AnonymousClass121 A03;
    public final ARP A04;

    public ArrayList A02(AnonymousClass205 r7, int i, long j) {
        C18070vi.A0d(r7, 0);
        return this.A04.A03(r7, 7, i, j);
    }

    public ArrayList A01(int i, long j) {
        return this.A04.A02(7, i, j);
    }

    public AnonymousClass8p7(AnonymousClass121 r1, ARP arp, AnonymousClass12N r3, C59392mE r4, AnonymousClass1W6 r5) {
        C18070vi.A0w(r5, r4, arp, r1, r3);
        this.A02 = r5;
        this.A01 = r4;
        this.A04 = arp;
        this.A03 = r1;
        this.A00 = r3;
    }

    public String A00() {
        return "StatusMentionsOrphanedResolver";
    }

    public void A03(List list, Set set) {
        String str;
        C18070vi.A0h(list, set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C195749tq r1 = (C195749tq) it.next();
            Long l = r1.A07;
            AnonymousClass205 r3 = r1.A06;
            AnonymousClass205 r7 = r1.A05;
            C22931Dv r0 = AnonymousClass1BI.A00;
            AnonymousClass1BI A002 = C22931Dv.A00(r1.A04);
            byte[] bArr = r1.A08;
            long j = r1.A02;
            if (r3 == null || l == null || bArr == null) {
                str = "StatusMentionsOrphanedResolver/resolveOrphanMessages/some required fields are null for the orphan message";
            } else {
                try {
                    C166418cr A003 = A3S.A00(bArr);
                    AnonymousClass206 A0s = C108945cZ.A0s(this.A01.A01(r3), this.A02);
                    if (A0s == null || C20133A8t.A0B(A0s)) {
                        str = "StatusMentionsOrphanedResolver/getProcessedFMessage/parent message not found";
                    } else {
                        try {
                            C192879p8 A004 = C196699vU.A00(A003, r7, j);
                            A004.A02 = A002;
                            AnonymousClass206 A005 = this.A00.A00(A004.A00());
                            set.add(l);
                            this.A03.BBM(A005);
                        } catch (C32711hd e) {
                            Log.e("MessageOrphanCommentResolver/getProcessedFMessage/BadMessage:", e);
                        }
                    }
                } catch (AnonymousClass1PN e2) {
                    Log.w("StatusMentionsOrphanedResolver/getProcessedFMessage/cannot convert raw byte to E2E message/", e2);
                }
            }
            Log.w(str);
        }
    }
}
