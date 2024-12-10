package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.2mR  reason: invalid class name and case insensitive filesystem */
public final class C59522mR {
    public final UserJid A00;
    public final CallInfo A01;
    public final C178119Bw A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59522mR) {
                C59522mR r5 = (C59522mR) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A02));
    }

    public C59522mR(CallInfo callInfo, C178119Bw r4) {
        this.A02 = r4;
        this.A01 = callInfo;
        UserJid userJid = r4.A04.A01;
        this.A00 = userJid;
        this.A03 = C18070vi.A18(userJid, callInfo.getPeerJid());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnAnsweredCallLog(callLog=");
        A10.append(this.A02);
        A10.append(", callInfo=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
