package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.9sZ  reason: invalid class name and case insensitive filesystem */
public final class C194959sZ {
    public final UserJid A00;
    public final AnonymousClass205 A01;
    public final String A02;
    public final byte[] A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194959sZ) {
                C194959sZ r5 = (C194959sZ) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, ((((Arrays.hashCode(this.A03) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01)) * 31);
    }

    public C194959sZ(UserJid userJid, AnonymousClass205 r2, String str, byte[] bArr) {
        this.A03 = bArr;
        this.A00 = userJid;
        this.A01 = r2;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageSecretEncryptionParams(data=");
        C17890vO.A1C(A10, this.A03);
        A10.append(", senderUserJid=");
        A10.append(this.A00);
        A10.append(", targetMessageKey=");
        A10.append(this.A01);
        A10.append(", messageSecretUseCase=");
        return C17900vP.A0B(this.A02, A10);
    }
}
