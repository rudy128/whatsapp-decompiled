package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.ohai.OhaiKeyConfigQueryResponseImpl;
import com.whatsapp.ohai.PublicKeyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class A02 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final C31611fq A03;
    public final AnonymousClass00H A04;

    public final void A01(Integer num, String str, Map map, C22821Di r15, byte[] bArr, int i) {
        Long A042;
        C18070vi.A0d(str, 0);
        C186869et r4 = (C186869et) this.A04.get();
        C21545Als als = new C21545Als(this, num, str, map, r15, bArr, i);
        C18100vl r3 = r4.A03;
        String string = C17880vN.A0C(r3).getString("expiration_date", (String) null);
        if (!(string == null || (A042 = AnonymousClass1YD.A04(string)) == null)) {
            long longValue = A042.longValue();
            r4.A02.get();
            if (longValue >= System.currentTimeMillis() + 86400000) {
                String string2 = C17880vN.A0C(r3).getString("public_key", (String) null);
                if (string2 != null) {
                    als.invoke(new PublicKeyConfig((short) C17880vN.A0C(r3).getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0), (short) C17880vN.A0C(r3).getInt("kem", 0), (short) C17880vN.A0C(r3).getInt("kdf", 0), (short) C17880vN.A0C(r3).getInt("aead", 0), C20094A6x.A03(string2, C199329zo.A03)));
                    return;
                }
                return;
            }
        }
        C108975cc.A0J(AIj.A00(A7K.A00(), OhaiKeyConfigQueryResponseImpl.class, "OhaiKeyConfigQuery"), r4.A00).A04(new C21531Ale(als, r4, 2));
    }

    public static final Map A00(Map map) {
        if (map == null) {
            return AnonymousClass1D7.A0I();
        }
        ArrayList A11 = C72453Mb.A11(map);
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            AnonymousClass1D6.A02(A16.getKey(), C108995ce.A0X(", ", (Iterable) A16.getValue()), A11);
        }
        return AnonymousClass1D7.A0D(A11);
    }

    public A02(C31611fq r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0o(r3, r4, r5);
        C18070vi.A0d(r6, 5);
        this.A00 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r2;
        this.A01 = r6;
    }
}
