package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.9RZ  reason: invalid class name */
public abstract class AnonymousClass9RZ {
    public static final byte[] A00(UserJid userJid, UserJid userJid2, JniBridge jniBridge, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        StringBuilder A10;
        String str3;
        C18070vi.A0d(jniBridge, 3);
        int length = bArr4.length;
        if (length != 32) {
            A10 = AnonymousClass000.A10();
            str3 = "MessageEncUtils/decryptEncMessage: invalid message_secret secretSize=";
        } else {
            byte[] bArr5 = bArr;
            length = bArr.length;
            if (length != 12) {
                A10 = AnonymousClass000.A10();
                str3 = "MessageEncUtils/decryptEncMessage: invalid encIv ivSize=";
            } else {
                byte[] A01 = C60612oK.A01(userJid, userJid2, str2, str, bArr4);
                C18070vi.A0X(A01);
                return (byte[]) JniBridge.jvidispatchOIOOOOO(6, 16, jniBridge.wajContext.get(), A01, bArr5, bArr2, bArr3);
            }
        }
        C17900vP.A0i(str3, A10, length);
        return null;
    }
}
