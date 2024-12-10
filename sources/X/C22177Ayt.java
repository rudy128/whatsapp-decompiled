package X;

import android.util.Base64;
import com.whatsapp.infra.graphql.generated.nativecontacts.IplsClientHelloPayloadResponseImpl;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* renamed from: X.Ayt  reason: case insensitive filesystem */
public final class C22177Ayt extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C33771jM $clientHelloMutationCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22177Ayt(C33771jM r2) {
        super(1);
        this.$clientHelloMutationCallback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9MD r2;
        Map unmodifiableMap;
        AnonymousClass8XJ r22;
        C18070vi.A0d(obj, 0);
        Log.i("MexClientHelloMutationRequestApi/sendClientHelloMutationRequest response success");
        String A0z = C72453Mb.A0z(C108985cd.A0I((C20125A8k) obj, IplsClientHelloPayloadResponseImpl.Xwa2IplsClientHello.class, "xwa2_ipls_client_hello"), "server_finish_payload");
        C33791jO r4 = (C33791jO) this.$clientHelloMutationCallback;
        Log.i("ClientIplsHandshakeManager/handleClientHelloMutationResponse/SUCCESS");
        C179329Hn r0 = r4.A00;
        if (r0 != null) {
            int ordinal = r0.ordinal();
            if (ordinal == 0) {
                Log.i("ClientIplsHandshakeManager/handleClientMutationSuccessResponse/GET");
                C164978aO r1 = (C164978aO) C23577Bm6.A07(C164978aO.DEFAULT_INSTANCE, Base64.decode(A0z, 1));
                byte[] A06 = r1.iplsClientSecretDataEncrypted_.A06();
                byte[] A062 = r1.iv_.A06();
                C18070vi.A0b(A06);
                C18070vi.A0b(A062);
                SecretKey secretKey = r4.A04;
                if (secretKey == null) {
                    C18070vi.A11("serverSecretSessionKey");
                    throw null;
                }
                Cipher A18 = AnonymousClass8BR.A18();
                C18070vi.A0X(A18);
                AnonymousClass8BW.A1O(secretKey, A18, A062);
                byte[] doFinal = A18.doFinal(A06);
                C18070vi.A0X(doFinal);
                AnonymousClass8XJ r12 = (AnonymousClass8XJ) Collections.unmodifiableMap(((AnonymousClass8XI) C23577Bm6.A07(AnonymousClass8XI.DEFAULT_INSTANCE, doFinal)).clientSecretMap_).get("native_contacts");
                if (r12 != null) {
                    r4.A06.A03(r12);
                } else {
                    C33791jO.A00(r4);
                }
                C179329Hn r02 = r4.A00;
                if (r02 != null) {
                    r2 = new AnonymousClass8nM(r02, r12);
                    C33791jO.A01(r4, r2);
                }
            } else if (ordinal == 1) {
                Log.i("ClientIplsHandshakeManager/handleClientMutationSuccessResponse/PUT");
                AnonymousClass8XI r03 = r4.A01;
                if (r03 == null || (unmodifiableMap = Collections.unmodifiableMap(r03.clientSecretMap_)) == null || (r22 = (AnonymousClass8XJ) unmodifiableMap.get("native_contacts")) == null) {
                    Log.i("ClientIplsHandshakeManager/handleClientMutationSuccessResponse/PUT: Error while parsing PUT request response");
                    C33791jO.A00(r4);
                    r2 = new AnonymousClass8nL("Error while parsing PUT request response", (Long) null);
                    C33791jO.A01(r4, r2);
                } else {
                    r4.A06.A03(r22);
                    C179329Hn r13 = r4.A00;
                    if (r13 != null) {
                        C33791jO.A01(r4, new AnonymousClass8nM(r13, r22));
                    }
                }
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("requestType");
        throw null;
    }
}
