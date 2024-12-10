package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.Ah0  reason: case insensitive filesystem */
public final class C21253Ah0 implements C22470B9c {
    public static final C21253Ah0 A00 = new C21253Ah0();

    public final Object BCF(C29621ca r24, C62672rm r25) {
        C29621ca A0m;
        C29621ca r3 = r24;
        C62672rm r10 = r25;
        int A17 = C18070vi.A17(r3, r10);
        if (r10.A09(r3, "single_serialized_proof")) {
            String[] A1Z = C17880vN.A1Z();
            A1Z[0] = "serialized_proof";
            A1Z[A17] = "#elementValue";
            Long A0L = C17890vO.A0L();
            Long A0j = AnonymousClass8BU.A0j();
            Class<byte[]> cls = byte[].class;
            byte[] bArr = (byte[]) r10.A04(r3, cls, A0L, A0j, (Object) null, A1Z);
            if (bArr != null) {
                String[] strArr = new String[A17];
                C29621ca A0Z = AnonymousClass8BT.A0Z(r3, "root_hash", strArr);
                if (A0Z == null) {
                    AnonymousClass8BY.A11(r3, r10, strArr, 0);
                } else {
                    String[] strArr2 = new String[2];
                    strArr2[0] = "hash";
                    strArr2[A17] = "epoch";
                    Number number = (Number) r10.A05(A0Z, Long.TYPE, AnonymousClass8BU.A0i(), A0j, (Object) null, strArr2, false);
                    if (number != null) {
                        long longValue = number.longValue();
                        String[] A1b = C17880vN.A1b("hash", "#elementValue", 2, A17);
                        Long A0d = AnonymousClass8BV.A0d();
                        Class<byte[]> cls2 = cls;
                        byte[] bArr2 = (byte[]) r10.A04(A0Z, cls2, A0d, A0d, (Object) null, A1b);
                        if (bArr2 != null) {
                            String[] strArr3 = new String[2];
                            strArr3[0] = PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
                            strArr3[A17] = "#elementValue";
                            byte[] bArr3 = (byte[]) r10.A04(A0Z, cls2, 64L, 64, (Object) null, strArr3);
                            if (bArr3 != null) {
                                String[] strArr4 = new String[A17];
                                strArr4[0] = "hash";
                                ArrayList A0u = AnonymousClass8BU.A0u(A0Z, r10, new C21158AfT(1), strArr4);
                                if (!(A0u == null || (A0m = AnonymousClass8BR.A0m(A0u, 0)) == null)) {
                                    return new C122346Ox(r3, new C122326Ov(A0m, A0Z, bArr2, bArr3, longValue), bArr);
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
