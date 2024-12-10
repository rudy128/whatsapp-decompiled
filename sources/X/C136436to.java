package X;

import com.whatsapp.voipcalling.CallInfo;
import java.util.UUID;

/* renamed from: X.6to  reason: invalid class name and case insensitive filesystem */
public final class C136436to {
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final CallInfo A05;
    public final String A06;
    public final UUID A07;

    public C136436to(CallInfo callInfo, String str, UUID uuid, int i, int i2, boolean z) {
        this.A07 = uuid;
        this.A06 = str;
        this.A05 = callInfo;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136436to) {
                C136436to r5 = (C136436to) obj;
                if (!(C18070vi.A18(this.A07, r5.A07) && C18070vi.A18(this.A06, r5.A06) && C18070vi.A18(this.A05, r5.A05) && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((((AnonymousClass000.A0L(this.A07) + C17900vP.A00(this.A06)) * 31) + C17880vN.A02(this.A05)) * 31) + this.A04) * 31) + this.A03) * 31, this.A02), this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CurrentSessionInfo(sessionId=");
        A10.append(this.A07);
        A10.append(", callRandomId=");
        A10.append(this.A06);
        A10.append(", activeCallInfo=");
        A10.append(this.A05);
        A10.append(", uiSurface=");
        A10.append(this.A04);
        A10.append(", subSurface=");
        A10.append(this.A03);
        A10.append(", shouldLogUserJourney=");
        A10.append(this.A02);
        A10.append(", hasLoggedFilterEvent=");
        A10.append(this.A00);
        A10.append(", hasLoggedSearchTermChangedEvent=");
        return C17900vP.A0F(A10, this.A01);
    }
}
