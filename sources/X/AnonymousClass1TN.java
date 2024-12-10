package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1TN  reason: invalid class name */
public final class AnonymousClass1TN {
    public final AnonymousClass1TM A00;
    public final AnonymousClass1HY A01;

    public AnonymousClass1TN(AnonymousClass1TM r2, AnonymousClass1HY r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public String A00(C60012nF r8, String str) {
        C18070vi.A0d(r8, 0);
        C18070vi.A0d(str, 1);
        if (r8.A03) {
            byte[] A012 = A01();
            if (A012 == null) {
                Log.w("InstrumentationShareableEncryptionManager/encrypt: SCIEK does not exist");
                return "";
            }
            byte[] A0I = C17970vW.A0I(12);
            byte[] bytes = str.getBytes(C26571Sq.A05);
            C18070vi.A0X(bytes);
            Cipher A02 = A62.A02("AES/GCM/NoPadding");
            C18070vi.A0X(A02);
            A02.init(1, new SecretKeySpec(A012, "AES"), new GCMParameterSpec(128, A0I));
            byte[] doFinal = A02.doFinal(bytes);
            ByteBuffer allocate = ByteBuffer.allocate(A0I.length + doFinal.length);
            allocate.put(A0I);
            allocate.put(doFinal);
            byte[] array = allocate.array();
            C18070vi.A0X(array);
            String encodeToString = Base64.encodeToString(array, 11);
            C18070vi.A0X(encodeToString);
            return encodeToString;
        }
        throw new SecurityException("Caller isn't trusted");
    }

    public byte[] A01() {
        if (!C18020vd.A05(C18040vf.A02, this.A00.A01, 9695)) {
            Log.w("InstrumentationShareableEncryptionManager/getSciekIfExists: AB prop is disabled");
        } else {
            String string = AnonymousClass1HY.A00(this.A01).getString("sciek/key", (String) null);
            if (string != null) {
                return Base64.decode(string, 3);
            }
        }
        return null;
    }
}
