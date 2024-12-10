package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2n6  reason: invalid class name and case insensitive filesystem */
public final class C59922n6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final AnonymousClass2SB A0C;
    public final DeviceJid A0D;
    public final String A0E;

    public C59922n6(AnonymousClass2SB r3, DeviceJid deviceJid, String str, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        C18070vi.A0d(deviceJid, 2);
        this.A06 = j;
        this.A0D = deviceJid;
        this.A02 = i;
        this.A04 = j2;
        this.A0A = j3;
        this.A0B = j4;
        this.A08 = j5;
        this.A00 = i2;
        this.A07 = j6;
        this.A03 = j7;
        this.A01 = i3;
        this.A05 = j8;
        this.A0C = r3;
        this.A09 = j9;
        this.A0E = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C59922n6)) {
                return false;
            }
            C59922n6 r7 = (C59922n6) obj;
            if (!(this.A02 == r7.A02 && this.A04 == r7.A04 && this.A0A == r7.A0A && this.A0B == r7.A0B && this.A08 == r7.A08 && this.A00 == r7.A00 && this.A07 == r7.A07 && this.A03 == r7.A03 && C18070vi.A18(this.A0D, r7.A0D) && this.A01 == r7.A01 && this.A05 == r7.A05 && this.A09 == r7.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer[] numArr = new Integer[13];
        int i = 0;
        numArr[0] = Integer.valueOf(this.A0D.hashCode());
        AnonymousClass000.A1M(numArr, this.A02);
        numArr[2] = Integer.valueOf(AnonymousClass000.A0I(this.A04));
        C17890vO.A1G(numArr, AnonymousClass000.A0I(this.A0A));
        numArr[4] = Integer.valueOf(AnonymousClass000.A0I(this.A0B));
        numArr[5] = Integer.valueOf(AnonymousClass000.A0I(this.A08));
        C17890vO.A1H(numArr, this.A00);
        C17890vO.A1I(numArr, AnonymousClass000.A0I(this.A07));
        numArr[8] = Integer.valueOf(AnonymousClass000.A0I(this.A03));
        numArr[9] = Integer.valueOf(this.A01);
        numArr[10] = Integer.valueOf(AnonymousClass000.A0I(this.A05));
        numArr[11] = Integer.valueOf(AnonymousClass000.A0I(this.A09));
        String str = this.A0E;
        if (str != null) {
            i = str.hashCode();
        }
        return AnonymousClass000.A0P(Integer.valueOf(i), numArr, 12);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncState(rowId=");
        A10.append(this.A06);
        A10.append(", deviceJid=");
        A10.append(this.A0D);
        A10.append(", syncType=");
        A10.append(this.A02);
        A10.append(", latestMsgId=");
        A10.append(this.A04);
        A10.append(", stageOldestMsgId=");
        A10.append(this.A0A);
        A10.append(", syncOldestMsgId=");
        A10.append(this.A0B);
        A10.append(", sentMsgsCount=");
        A10.append(this.A08);
        A10.append(", chunkOrder=");
        A10.append(this.A00);
        A10.append(", sentBytes=");
        A10.append(this.A07);
        A10.append(", lastChunkTimestamp=");
        A10.append(this.A03);
        A10.append(", status=");
        A10.append(this.A01);
        A10.append(", peerMsgRowId=");
        A10.append(this.A05);
        A10.append(", bootstrapId=");
        A10.append(this.A0C);
        A10.append(", sizeLimitBytes=");
        A10.append(this.A09);
        A10.append(", fullHistoryOnDemandRequestId=");
        return C17900vP.A0B(this.A0E, A10);
    }
}
