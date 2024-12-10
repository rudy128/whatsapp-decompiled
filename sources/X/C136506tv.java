package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.6tv  reason: invalid class name and case insensitive filesystem */
public final class C136506tv {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final UserJid A04;
    public final AnonymousClass206 A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136506tv) {
                C136506tv r8 = (C136506tv) obj;
                if (!(C18070vi.A18(this.A05, r8.A05) && C18070vi.A18(this.A03, r8.A03) && C18070vi.A18(this.A04, r8.A04) && C18070vi.A18(this.A06, r8.A06) && this.A08 == r8.A08 && this.A07 == r8.A07 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C136506tv(C130816k3 r17) {
        C130816k3 r13 = r17;
        AnonymousClass206 r12 = r13.A09;
        DeviceJid deviceJid = r13.A03;
        UserJid userJid = r13.A04;
        Set set = r13.A05;
        boolean z = r13.A07;
        boolean z2 = r13.A06;
        long j = r13.A01;
        long j2 = r13.A02;
        long j3 = r13.A00;
        if (j3 == 0) {
            if (r12 instanceof AnonymousClass23N) {
                j3 = AnonymousClass11P.A01(r13.A08);
            } else {
                j3 = r12.A0I;
            }
        }
        this.A05 = r12;
        this.A03 = deviceJid;
        this.A04 = userJid;
        this.A06 = set;
        this.A08 = z;
        this.A07 = z2;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A01, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A06, (((AnonymousClass000.A0L(this.A05) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A04)) * 31), this.A08), this.A07))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendMessageParams(message=");
        A10.append(this.A05);
        A10.append(", remoteJidForRetry=");
        A10.append(this.A03);
        A10.append(", recipientJid=");
        A10.append(this.A04);
        A10.append(", targetDevices=");
        A10.append(this.A06);
        A10.append(", isResend=");
        A10.append(this.A08);
        A10.append(", isOffline=");
        A10.append(this.A07);
        A10.append(", originalTimestamp=");
        A10.append(this.A01);
        A10.append(", sendExpirationMs=");
        A10.append(this.A02);
        A10.append(", messageSendStartTime=");
        return C17900vP.A0E(A10, this.A00);
    }
}
