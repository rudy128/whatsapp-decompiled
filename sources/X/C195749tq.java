package X;

import com.whatsapp.jid.Jid;
import java.util.Arrays;

/* renamed from: X.9tq  reason: invalid class name and case insensitive filesystem */
public final class C195749tq {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Jid A03;
    public final Jid A04;
    public final AnonymousClass205 A05;
    public final AnonymousClass205 A06;
    public final Long A07;
    public final byte[] A08;
    public final byte[] A09;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x0084
            java.lang.Class r1 = r7.getClass()
            java.lang.Class r0 = X.C108975cc.A0R(r8)
            boolean r0 = X.C18070vi.A18(r1, r0)
            r5 = 0
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.orphan.MessageOrphan"
            X.C18070vi.A0z(r8, r0)
            X.9tq r8 = (X.C195749tq) r8
            java.lang.Long r1 = r7.A07
            java.lang.Long r0 = r8.A07
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0061
            X.205 r1 = r7.A05
            X.205 r0 = r8.A05
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.jid.Jid r1 = r7.A04
            com.whatsapp.jid.Jid r0 = r8.A04
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0061
            X.205 r1 = r7.A06
            X.205 r0 = r8.A06
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.jid.Jid r1 = r7.A03
            com.whatsapp.jid.Jid r0 = r8.A03
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0061
            long r3 = r7.A02
            long r1 = r8.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            byte[] r1 = r7.A08
            byte[] r0 = r8.A08
            if (r1 == 0) goto L_0x0062
            if (r0 == 0) goto L_0x0061
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0065
        L_0x0061:
            return r5
        L_0x0062:
            if (r0 == 0) goto L_0x0065
            return r5
        L_0x0065:
            int r1 = r7.A01
            int r0 = r8.A01
            if (r1 != r0) goto L_0x0061
            byte[] r1 = r7.A09
            byte[] r0 = r8.A09
            if (r1 == 0) goto L_0x007a
            if (r0 == 0) goto L_0x0061
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x007d
            return r5
        L_0x007a:
            if (r0 == 0) goto L_0x007d
            return r5
        L_0x007d:
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 == r0) goto L_0x0084
            return r5
        L_0x0084:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195749tq.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int A0l = AnonymousClass001.A0l(this.A07) * 31;
        int A0K = AnonymousClass001.A0K(this.A02, (((((AnonymousClass000.A0N(this.A05, A0l) + AnonymousClass001.A0l(this.A04)) * 31) + AnonymousClass001.A0l(this.A06)) * 31) + AnonymousClass001.A0l(this.A03)) * 31);
        byte[] bArr = this.A08;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        int i3 = (((A0K + i) * 31) + this.A01) * 31;
        byte[] bArr2 = this.A09;
        if (bArr2 != null) {
            i2 = Arrays.hashCode(bArr2);
        }
        return ((i3 + i2) * 31) + this.A00;
    }

    public C195749tq(Jid jid, Jid jid2, AnonymousClass205 r3, AnonymousClass205 r4, Long l, byte[] bArr, byte[] bArr2, int i, int i2, long j) {
        this.A07 = l;
        this.A05 = r3;
        this.A04 = jid;
        this.A06 = r4;
        this.A03 = jid2;
        this.A02 = j;
        this.A08 = bArr;
        this.A01 = i;
        this.A09 = bArr2;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageOrphan(rowId=");
        A10.append(this.A07);
        A10.append(", key=");
        A10.append(this.A05);
        A10.append(", senderJid=");
        A10.append(this.A04);
        A10.append(", parentMessageKey=");
        A10.append(this.A06);
        A10.append(", parentMessageSenderJid=");
        A10.append(this.A03);
        A10.append(", timestamp=");
        A10.append(this.A02);
        A10.append(", orphanMessageData=");
        C17890vO.A1C(A10, this.A08);
        A10.append(", orphanMessageType=");
        A10.append(this.A01);
        A10.append(", orphanMessageStanzaData=");
        C17890vO.A1C(A10, this.A09);
        A10.append(", orphanMessageReason=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
