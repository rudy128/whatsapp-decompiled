package X;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

/* renamed from: X.9R9  reason: invalid class name */
public abstract class AnonymousClass9R9 {
    public static String A00(C187359fg r10, String str) {
        if (TextUtils.isEmpty(str) || r10 == null) {
            return null;
        }
        byte[] bArr = new byte[24];
        new SecureRandom().nextBytes(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(1);
        byte[] array = allocate.array();
        byte[] bytes = "cd7962b7".getBytes();
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        allocate2.putInt(r10.A02);
        byte[] array2 = allocate2.array();
        ByteBuffer allocate3 = ByteBuffer.allocate(8);
        allocate3.putLong(r10.A03);
        return Base64.encodeToString(A8G.A05(A8G.A05(bytes, allocate3.array(), array2, array, r10.A01, bArr), C25892Co3.A02(C26098CsI.A00(r10.A04, r10.A00), bArr, str.getBytes())), 0);
    }
}
