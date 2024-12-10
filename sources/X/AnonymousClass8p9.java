package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.8p9  reason: invalid class name */
public final class AnonymousClass8p9 extends C123466Uo {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C35191ln A03;
    public final AnonymousClass121 A04;
    public final AnonymousClass00H A05;

    public ArrayList A02(AnonymousClass205 r7, int i, long j) {
        C18070vi.A0d(r7, 0);
        return ((ARP) this.A05.get()).A03(r7, 3, i, j);
    }

    public ArrayList A01(int i, long j) {
        return ((ARP) this.A05.get()).A02(3, i, j);
    }

    public void A03(List list, Set set) {
        String str;
        Set set2 = set;
        List<C195749tq> list2 = list;
        C18070vi.A0h(list2, set2);
        LinkedHashSet A14 = C17880vN.A14();
        for (C195749tq r4 : list2) {
            Long l = r4.A07;
            AnonymousClass205 r6 = r4.A06;
            C22941Dw r0 = UserJid.Companion;
            UserJid A012 = C22941Dw.A01(r4.A03);
            AnonymousClass205 r13 = r4.A05;
            byte[] bArr = r4.A08;
            long j = r4.A02;
            AnonymousClass1BI A002 = C22931Dv.A00(r4.A04);
            if (r6 == null || bArr == null || l == null) {
                str = "MessageOrphanCommentResolver/resolveOrphanMessages/some required fields are null for the orphan message";
            } else {
                try {
                    C166418cr A003 = A3S.A00(bArr);
                    AnonymousClass00H r5 = this.A02;
                    AnonymousClass205 A0L = AnonymousClass8BV.A0L(r6, r5);
                    AnonymousClass00H r42 = this.A00;
                    AnonymousClass206 A013 = AnonymousClass1W2.A01(A0L, r42);
                    if (A013 == null || C20133A8t.A0B(A013)) {
                        str = "MessageOrphanCommentResolver/getProcessedFMessage/parent message not found";
                    } else {
                        try {
                            C192879p8 A004 = C196699vU.A00(A003, r13, j);
                            A004.A02 = A002;
                            A004.A05 = r6.A01;
                            A004.A03 = A012;
                            AnonymousClass206 A0K = AnonymousClass8BV.A0K(A004.A00(), this.A01);
                            if (C60472o5.A00(A0K) == null) {
                                A0K.A0b(16777216);
                                C60472o5.A01(new C48312Lz(A51.A00(A013), A013.A0x), A0K);
                            }
                            A0K.A0d(A002);
                            if (AnonymousClass206.A08(A0K)) {
                                set2.add(l);
                                AnonymousClass206 A0s = C108945cZ.A0s(A0K.A0v, C17880vN.A0c(r42));
                                if (A0s == null || !(A0s instanceof AnonymousClass23Z)) {
                                    this.A04.BBM(A0K);
                                } else {
                                    this.A04.BBN(A0K, 5);
                                }
                                AnonymousClass206 A014 = AnonymousClass1W2.A01(AnonymousClass8BV.A0L(r6, r5), r42);
                                if (A014 != null) {
                                    A14.add(A014);
                                }
                            }
                        } catch (C32711hd e) {
                            Log.e("MessageOrphanCommentResolver/getProcessedFMessage/BadMessage:", e);
                        }
                    }
                } catch (AnonymousClass1PN e2) {
                    Log.w("MessageOrphanCommentResolver/getProcessedFMessage/cannot convert raw byte to E2E message/", e2);
                }
            }
            Log.w(str);
        }
        Iterator it = A14.iterator();
        while (it.hasNext()) {
            this.A03.BKN(C17880vN.A0Y(it));
        }
    }

    public AnonymousClass8p9(C35191ln r2, AnonymousClass121 r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r4, r5, r6, r3, r2);
        C18070vi.A0d(r7, 6);
        this.A00 = r4;
        this.A05 = r5;
        this.A02 = r6;
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = r7;
    }

    public String A00() {
        return "MessageOrphanCommentResolver";
    }
}
