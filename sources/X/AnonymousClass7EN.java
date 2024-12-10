package X;

import android.net.Uri;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7EN  reason: invalid class name */
public final class AnonymousClass7EN implements C1595184v {
    public final Uri A00;
    public final UserJid A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7EN) {
                AnonymousClass7EN r5 = (AnonymousClass7EN) obj;
                if (this.A03 != r5.A03 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass3MX.A03(this.A03))), this.A02);
    }

    public AnonymousClass7EN(Uri uri, UserJid userJid, boolean z, boolean z2) {
        C18070vi.A0k(uri, userJid);
        this.A03 = z;
        this.A00 = uri;
        this.A01 = userJid;
        this.A02 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Finished(success=");
        A10.append(this.A03);
        A10.append(", deeplink=");
        A10.append(this.A00);
        A10.append(", userJid=");
        A10.append(this.A01);
        A10.append(", isDefaultBot=");
        return C17900vP.A0F(A10, this.A02);
    }
}
