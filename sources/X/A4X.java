package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class A4X {
    public static final byte[] A03 = {2};
    public static final byte[] A04 = {1};
    public final int A00;
    public final C198859z2 A01;
    public final byte[] A02;

    public static byte[] A00(A4X a4x, byte[] bArr) {
        try {
            Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance.init(new SecretKeySpec(a4x.A02, DefaultCrypto.HMAC_SHA256));
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public C187069fD A01() {
        try {
            byte[][] A022 = C20011A3b.A02(this.A01.A02(A00(this, A04), "WhisperMessageKeys".getBytes(), 80), 32, 32, 16);
            SecretKeySpec A0v = AnonymousClass8BS.A0v(A022[0]);
            SecretKeySpec secretKeySpec = new SecretKeySpec(A022[1], DefaultCrypto.HMAC_SHA256);
            return new C187069fD(AnonymousClass8BR.A19(A022[2]), A0v, secretKeySpec, this.A00);
        } catch (ParseException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public A4X(C198859z2 r1, byte[] bArr, int i) {
        this.A01 = r1;
        this.A02 = bArr;
        this.A00 = i;
    }
}
