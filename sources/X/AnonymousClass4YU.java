package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4YU  reason: invalid class name */
public final class AnonymousClass4YU {
    public final Bitmap A00;
    public final UserJid A01;
    public final List A02;
    public final boolean A03;

    public AnonymousClass4YU() {
        this((Bitmap) null, (UserJid) null, (List) null, true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YU) {
                AnonymousClass4YU r5 = (AnonymousClass4YU) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01)) * 31, this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("State(matchingBotCommands=");
        A10.append(this.A02);
        A10.append(", profilePhoto=");
        A10.append(this.A00);
        A10.append(", userJid=");
        A10.append(this.A01);
        A10.append(", isEnabled=");
        return C17900vP.A0F(A10, this.A03);
    }

    public AnonymousClass4YU(Bitmap bitmap, UserJid userJid, List list, boolean z) {
        this.A02 = list;
        this.A00 = bitmap;
        this.A01 = userJid;
        this.A03 = z;
    }
}
