package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.377  reason: invalid class name */
public final class AnonymousClass377 implements AnonymousClass1O5 {
    public final C37551pj A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final AnonymousClass1OZ A03;
    public final C57732jY A04;

    public AnonymousClass377(C37551pj r2, AnonymousClass11P r3, C19830z4 r4, AnonymousClass1OZ r5, C57732jY r6) {
        C18070vi.A0d(r5, 2);
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
    }

    public void C7Z(C29621ca r11, String str) {
        C18070vi.A0d(r11, 1);
        C29621ca A0K = r11.A0K("list");
        if (A0K == null) {
            C19830z4 r1 = this.A02;
            C17880vN.A1D(C19830z4.A00(r1), "block_list_receive_time", AnonymousClass11P.A01(this.A01));
        } else {
            LinkedHashSet A14 = C17880vN.A14();
            LinkedHashMap A13 = C17880vN.A13();
            String A022 = C29621ca.A02(A0K, "dhash");
            C29621ca[] r9 = A0K.A02;
            if (r9 != null) {
                int length = r9.length;
                int i = 0;
                while (i < length) {
                    C29621ca r3 = r9[i];
                    C29621ca.A04(r3, "item");
                    Jid A0F = r3.A0F(UserJid.class, "jid");
                    if (A0F != null) {
                        String A023 = C29621ca.A02(r3, "display_name");
                        if (A023 != null && !AnonymousClass1YF.A0T(A023) && (A0F instanceof AnonymousClass1E2)) {
                            A13.put(A0F, A023);
                        }
                        A14.add(A0F);
                        i++;
                    } else {
                        throw C17880vN.A0g();
                    }
                }
            }
            this.A00.A0M(A022, A13, A14);
        }
        C57732jY r12 = this.A04;
        if (r12 != null) {
            r12.A00(4);
        }
    }

    public void BrD(String str) {
        C17900vP.A0f("BlocklistGetProtocolHelper/onDeliveryFailure iq=", str, C18070vi.A0K(str));
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0h(str, r4);
        int A002 = C60482o6.A00(r4);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BlocklistGetProtocolHelper/onError, iq=");
        A10.append(str);
        C17900vP.A0j("; errorCode=", A10, A002);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
