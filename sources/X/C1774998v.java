package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.98v  reason: invalid class name and case insensitive filesystem */
public final class C1774998v extends C180619Ng {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final DeviceJid A04;
    public final GroupJid A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C1774998v(DeviceJid deviceJid, DeviceJid deviceJid2, GroupJid groupJid, String str, String str2, String str3, long j, long j2, long j3, boolean z) {
        C18070vi.A0d(str3, 3);
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A03 = deviceJid;
        this.A04 = deviceJid2;
        this.A09 = z;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A05 = groupJid;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1774998v) {
                C1774998v r8 = (C1774998v) obj;
                if (!C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A08, r8.A08) || !C18070vi.A18(this.A06, r8.A06) || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A04, r8.A04) || this.A09 != r8.A09 || this.A00 != r8.A00 || this.A01 != r8.A01 || this.A02 != r8.A02 || !C18070vi.A18(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A00, AnonymousClass0DV.A00((((C17890vO.A02(this.A06, (C17880vN.A03(this.A07) + C17900vP.A00(this.A08)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A04)) * 31, this.A09)))) + C17880vN.A02(this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallPushPayload(dataNotificationType=");
        A10.append(this.A07);
        A10.append(", dataToLid=");
        A10.append(this.A08);
        A10.append(", callId=");
        A10.append(this.A06);
        A10.append(", fromDeviceJid=");
        A10.append(this.A03);
        A10.append(", fromPhoneDeviceJid=");
        A10.append(this.A04);
        A10.append(", videoCall=");
        A10.append(this.A09);
        A10.append(", offerTimeSec=");
        A10.append(this.A00);
        A10.append(", pushTimeoutSec=");
        A10.append(this.A01);
        A10.append(", secondaryOfferTimeoutSec=");
        A10.append(this.A02);
        A10.append(", groupJid=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
