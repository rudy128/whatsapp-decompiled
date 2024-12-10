package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Arrays;

/* renamed from: X.4SF  reason: invalid class name */
public class AnonymousClass4SF {
    public final int A00;
    public final int A01;
    public final AnonymousClass1E7 A02;
    public final PhoneUserJid A03;
    public final String A04;
    public final int A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4SF r5 = (AnonymousClass4SF) obj;
            if (this.A00 != r5.A00 || this.A05 != r5.A05 || !C42171xk.A00(this.A02, r5.A02) || !C42171xk.A00(this.A03, r5.A03) || !C42171xk.A00(this.A04, r5.A04) || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        AnonymousClass3Ma.A1S(objArr, this.A00);
        C17890vO.A1G(objArr, this.A05);
        objArr[4] = this.A04;
        AnonymousClass3Ma.A1U(objArr, this.A01);
        return Arrays.hashCode(objArr);
    }

    public AnonymousClass4SF(AnonymousClass1E7 r1, PhoneUserJid phoneUserJid, String str, int i, int i2, int i3) {
        this.A02 = r1;
        this.A03 = phoneUserJid;
        this.A00 = i;
        this.A05 = i2;
        this.A04 = str;
        this.A01 = i3;
    }
}
