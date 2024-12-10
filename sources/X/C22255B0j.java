package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.B0j  reason: case insensitive filesystem */
public final class C22255B0j extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C33781jN $callback;
    public final /* synthetic */ C179329Hn $requestType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22255B0j(C179329Hn r2, C33781jN r3) {
        super(1);
        this.$callback = r3;
        this.$requestType = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9MD r1;
        A6Z a6z = (A6Z) obj;
        C18070vi.A0d(a6z, 0);
        BC4 A02 = a6z.A02();
        if (A02 instanceof C172858u8) {
            C197189wI r0 = C197189wI.A00;
            C33791jO r3 = (C33791jO) this.$callback;
            C18070vi.A0d(r0, 0);
            C33791jO.A00(r3);
            C33791jO.A01(r3, new AnonymousClass8nL("delivery failure when initiating handshake", (Long) null));
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MexClientIplsHandshakeInitRequestApi/clientIplsHandshakeInit/requestType: ");
            A10.append(this.$requestType);
            C17890vO.A1A(A10, " DeliveryFailureError");
        } else {
            List list = a6z.A01;
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                if (((long) ((BC4) next).BOq()) == 404) {
                    A13.add(next);
                }
            }
            BC4 bc4 = (BC4) C29431cG.A0c(A13);
            if (bc4 != null) {
                C18070vi.A0d(bc4.BQa(), 2);
                C33791jO r12 = (C33791jO) this.$callback;
                C33791jO.A00(r12);
                C33791jO.A01(r12, AnonymousClass8nN.A00);
            } else {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("MexClientIplsHandshakeInitRequestApi/clientIplsHandshakeInit/requestType:");
                A102.append(this.$requestType);
                A102.append(", errorCode ");
                A102.append(A02.BOq());
                A102.append(", errorDetail: ");
                C17890vO.A1A(A102, A02.BQa());
                long BOq = (long) A02.BOq();
                String BQa = A02.BQa();
                C18070vi.A0d(BQa, 2);
                C33791jO r2 = (C33791jO) this.$callback;
                C33791jO.A00(r2);
                if (BOq == 404) {
                    r1 = AnonymousClass8nN.A00;
                } else {
                    r1 = new AnonymousClass8nL(BQa, Long.valueOf(BOq));
                }
                C33791jO.A01(r2, r1);
            }
        }
        return false;
    }
}
