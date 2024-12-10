package X;

import com.whatsapp.util.Log;

/* renamed from: X.Ayu  reason: case insensitive filesystem */
public final class C22178Ayu extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C33771jM $clientHelloMutationCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22178Ayu(C33771jM r2) {
        super(1);
        this.$clientHelloMutationCallback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        C18070vi.A0d(a6z, 0);
        BC4 A02 = a6z.A02();
        if (A02 instanceof C172858u8) {
            Log.i("MexClientHelloMutationRequestApi/sendClientHelloMutationRequest response delivery failure");
            C197179wH r0 = C197179wH.A00;
            C33791jO r3 = (C33791jO) this.$clientHelloMutationCallback;
            C18070vi.A0d(r0, 0);
            Log.i("ClientIplsHandshakeManager/handleClientHelloMutationResponse/DeliveryFailure");
            C33791jO.A00(r3);
            C33791jO.A01(r3, new AnonymousClass8nL("delivery failure when sending client hello mutation request", (Long) null));
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MexClientHelloMutationRequestApi/sendClientHelloMutationRequest: ");
            A10.append(A02.BOq());
            A10.append(" response error  -> ");
            C17890vO.A1A(A10, A02.BQa());
            long BOq = (long) A02.BOq();
            String BQa = A02.BQa();
            C18070vi.A0d(BQa, 2);
            C33791jO r4 = (C33791jO) this.$clientHelloMutationCallback;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("ClientIplsHandshakeManager/handleClientHelloMutationResponse/Error: errorCode: ");
            A102.append(BOq);
            C17900vP.A0f(" and errorMessage:", BQa, A102);
            C33791jO.A00(r4);
            C33791jO.A01(r4, new AnonymousClass8nL(BQa, Long.valueOf(BOq)));
        }
        return false;
    }
}
