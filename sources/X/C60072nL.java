package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.2nL  reason: invalid class name and case insensitive filesystem */
public class C60072nL {
    public double A00;
    public double A01;
    public float A02 = -1.0f;
    public int A03 = -1;
    public int A04 = -1;
    public long A05;
    public final UserJid A06;

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.A06;
        C17890vO.A1M(objArr, this.A05);
        return Arrays.hashCode(objArr);
    }

    public void A00(C60072nL r3) {
        C17960vV.A0D(r3.A06.equals(this.A06));
        this.A05 = r3.A05;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A02 = r3.A02;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C60072nL) {
            C60072nL r7 = (C60072nL) obj;
            if (!r7.A06.equals(this.A06) || r7.A05 != this.A05) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C60072nL(UserJid userJid) {
        this.A06 = userJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[UserLocation jid=");
        A10.append(this.A06);
        A10.append(" latitude=");
        A10.append(this.A00);
        A10.append(" longitude=");
        A10.append(this.A01);
        A10.append(" accuracy=");
        A10.append(this.A03);
        A10.append(" speed=");
        A10.append(this.A02);
        A10.append(" bearing=");
        A10.append(this.A04);
        A10.append(" timestamp=");
        A10.append(this.A05);
        return AnonymousClass000.A0z(A10);
    }
}
