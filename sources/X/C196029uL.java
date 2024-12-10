package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9uL  reason: invalid class name and case insensitive filesystem */
public class C196029uL {
    public final long A00;
    public final AnonymousClass1BI A01;
    public final UserJid A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C196029uL r5 = (C196029uL) obj;
            if (this.A04 != r5.A04 || !this.A03.equals(r5.A03) || !this.A01.equals(r5.A01) || !C42171xk.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = Boolean.valueOf(this.A04);
        objArr[1] = this.A03;
        objArr[2] = this.A01;
        return AnonymousClass000.A0P(this.A02, objArr, 3);
    }

    public C196029uL(AnonymousClass1BI r1, UserJid userJid, String str, long j, boolean z) {
        this.A00 = j;
        this.A04 = z;
        this.A03 = str;
        this.A01 = r1;
        this.A02 = userJid;
    }

    public C164488Za A00() {
        UserJid userJid;
        AnonymousClass8X7 A002 = C166408cq.A00();
        A002.A0H(this.A03);
        boolean z = this.A04;
        A002.A0K(z);
        AnonymousClass1BI r0 = this.A01;
        AnonymousClass8X7.A00(r0, A002);
        if (C22971Dz.A0e(r0) && !z && (userJid = this.A02) != null) {
            AnonymousClass8X7.A01(userJid, A002);
        }
        C23624Bmt A0N = C164488Za.DEFAULT_INSTANCE.A0N();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        if (seconds > 0) {
            C164488Za r1 = (C164488Za) C17880vN.A0G(A0N);
            r1.bitField0_ |= 2;
            r1.timestamp_ = seconds;
        }
        C164488Za r12 = (C164488Za) C17880vN.A0G(A0N);
        r12.key_ = AnonymousClass8BU.A0Y(A002);
        r12.bitField0_ |= 1;
        return (C164488Za) A0N.A0C();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncdMessage{timestamp=");
        A10.append(this.A00);
        A10.append(", isFromMe=");
        A10.append(this.A04);
        A10.append(", messageId=");
        A10.append(this.A03);
        A10.append(", remoteJid=");
        A10.append(this.A01);
        A10.append(", participant=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }
}
