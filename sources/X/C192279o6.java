package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.9o6  reason: invalid class name and case insensitive filesystem */
public abstract class C192279o6 {
    public List A00;
    public final JSONArray A01 = AnonymousClass8BR.A1A();

    public String A00() {
        if (!(this instanceof C176038zg)) {
            return ((C176048zh) this).A00;
        }
        try {
            return AnonymousClass8BT.A0x(AnonymousClass8BR.A1Z(((C176038zg) this).A00.toString()));
        } catch (UnsupportedEncodingException e) {
            throw new AnonymousClass9LF(e);
        }
    }

    public void A01(PublicKey... publicKeyArr) {
        ArrayList A13 = AnonymousClass000.A13();
        try {
            A13.add(AnonymousClass9R7.A00(publicKeyArr[0]));
            this.A00 = A13;
        } catch (NoSuchAlgorithmException e) {
            Log.e("PAY: DefaultTrustTokenBuilder/generateKeyFingerprints", e);
            throw new AnonymousClass9LF(e);
        }
    }
}
