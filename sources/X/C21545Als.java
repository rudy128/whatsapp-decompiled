package X;

import com.whatsapp.ohai.EncryptionContext;
import com.whatsapp.ohai.EncryptionResult;
import com.whatsapp.ohai.HttpRequest;
import com.whatsapp.ohai.HttpResponse;
import com.whatsapp.ohai.PublicKeyConfig;
import com.whatsapp.ohai.WaOhaiClient;
import com.whatsapp.util.Log;
import java.net.HttpURLConnection;
import java.util.Map;

/* renamed from: X.Als  reason: case insensitive filesystem */
public final /* synthetic */ class C21545Als implements C22821Di {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A02 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;
    public final /* synthetic */ C22821Di A05;
    public final /* synthetic */ byte[] A06;

    public final Object invoke(Object obj) {
        HttpResponse httpResponse;
        A02 a02 = this.A01;
        String str = this.A03;
        Integer num = this.A02;
        byte[] bArr = this.A06;
        Map map = this.A04;
        int i = this.A00;
        C22821Di r5 = this.A05;
        PublicKeyConfig publicKeyConfig = (PublicKeyConfig) obj;
        C18070vi.A0d(num, 2);
        C18070vi.A0d(publicKeyConfig, 9);
        AnonymousClass00H r2 = a02.A01;
        C63042sP.A00((C63042sP) r2.get(), 501817243);
        try {
            HttpRequest httpRequest = new HttpRequest("POST", str, map, bArr, true);
            AnonymousClass4XD r15 = WaOhaiClient.A00;
            r15.A01();
            EncryptionResult encrypt = WaOhaiClient.encrypt(httpRequest, publicKeyConfig);
            Map A0h = C108975cc.A0h("Content-Type", "message/ohttp-req");
            AnonymousClass1D9 r10 = (AnonymousClass1D9) a02.A00.get();
            byte[] bArr2 = encrypt.cipherText;
            byte[] bArr3 = null;
            AnonymousClass1D9 r16 = r10;
            AUZ A002 = AnonymousClass1D9.A00(r16, C17880vN.A0l(), "https://meta-ohttp-relay-prod.fastly-edge.com/", (String) null, r10.A01.A02(), (String) null, A0h, bArr2, false, false, false);
            HttpURLConnection httpURLConnection = A002.A01;
            if (httpURLConnection.getResponseCode() >= 400) {
                C63042sP.A01((C63042sP) r2.get(), 501817243, 3);
                try {
                    C179229Hb BMO = A002.BMO((AnonymousClass181) a02.A02.get(), (Integer) null, Integer.valueOf(i));
                    bArr3 = C196989vy.A01(BMO);
                    BMO.close();
                } catch (Exception e) {
                    Log.e("WaOhaiClient/handleError", e);
                }
                short responseCode = (short) httpURLConnection.getResponseCode();
                Map A003 = A02.A00(httpURLConnection.getHeaderFields());
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                httpResponse = new HttpResponse(responseCode, A003, bArr3);
            } else {
                C63042sP.A01((C63042sP) r2.get(), 501817243, 2);
                try {
                    C179229Hb BMP = A002.BMP((AnonymousClass181) a02.A02.get(), (Integer) null, Integer.valueOf(i));
                    byte[] A012 = C196989vy.A01(BMP);
                    BMP.close();
                    short s = publicKeyConfig.aeadId;
                    EncryptionContext encryptionContext = encrypt.encryptionContext;
                    byte[] bArr4 = encrypt.keyEncapsulation;
                    C18070vi.A0d(encryptionContext, 1);
                    C18070vi.A0d(bArr4, 2);
                    r15.A01();
                    httpResponse = WaOhaiClient.decrypt(s, encryptionContext, bArr4, A012);
                } catch (Exception e2) {
                    Log.e("WaOhaiClient/handleValidResponseCode", e2);
                    httpResponse = new HttpResponse((short) httpURLConnection.getResponseCode(), A02.A00(httpURLConnection.getHeaderFields()), new byte[0]);
                }
            }
            r5.invoke(httpResponse);
        } catch (Exception e3) {
            C63042sP.A01((C63042sP) r2.get(), 501817243, 3);
            Log.e("WaOhaiClient/executeRequest", e3);
            r5.invoke((Object) null);
        }
        return C27621Wu.A00;
    }

    public /* synthetic */ C21545Als(A02 a02, Integer num, String str, Map map, C22821Di r5, byte[] bArr, int i) {
        this.A01 = a02;
        this.A03 = str;
        this.A02 = num;
        this.A06 = bArr;
        this.A04 = map;
        this.A00 = i;
        this.A05 = r5;
    }
}
