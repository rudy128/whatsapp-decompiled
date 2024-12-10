package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6ql  reason: invalid class name and case insensitive filesystem */
public final class C134546ql {
    public final Bitmap A00;
    public final UserJid A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134546ql) {
                C134546ql r5 = (C134546ql) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public C134546ql(Bitmap bitmap, UserJid userJid) {
        this.A01 = userJid;
        this.A00 = bitmap;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CachedLastFrameData(userJid=");
        A10.append(this.A01);
        A10.append(", bitmap=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
