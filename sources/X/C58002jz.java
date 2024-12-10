package X;

import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.2jz  reason: invalid class name and case insensitive filesystem */
public class C58002jz {
    public final int A00;
    public final Jid A01;
    public final AnonymousClass00H A02;
    public final Set A03;
    public final AnonymousClass1RP A04;
    public final C26111Qw A05;
    public final AnonymousClass205 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r8 = X.AnonymousClass000.A10();
        r8.append("key = ");
        r8.append(r10);
        r8.append("; messageType = ");
        r8.append(r9);
        r8.append("; targetDevices = ");
        r4 = java.lang.String.valueOf(',');
        X.C199610h.A04(r4);
        r3 = r6.iterator();
        r2 = X.AnonymousClass000.A10();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (r3.hasNext() == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r1 = r3.next();
        r1.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if ((r1 instanceof java.lang.CharSequence) == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a8, code lost:
        r1 = (java.lang.CharSequence) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        r2.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r3.hasNext() == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        r2.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        r1 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.isEmpty() != false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        throw new java.lang.AssertionError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r7.A00.A0G("InvalidRecipientFiltered", X.AnonymousClass000.A0y(r2.toString(), r8), true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r11 = this;
            java.util.Set r2 = r11.A03
            if (r2 == 0) goto L_0x000b
            boolean r1 = r2.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x00d7
            X.1RP r7 = r11.A04
            X.205 r10 = r11.A06
            int r9 = r11.A00
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            java.util.HashSet r5 = X.C17880vN.A12()
            X.C22971Dz.A0G(r0, r2, r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00df
            r0 = 58
            if (r9 == r0) goto L_0x008d
            r0 = 69
            if (r9 == r0) goto L_0x008d
            r0 = 77
            if (r9 == r0) goto L_0x008d
            X.1Qw r0 = r7.A04
            java.util.Set r6 = r0.A03(r10)
        L_0x0035:
            X.1BI r0 = r10.A00
            boolean r4 = X.C22971Dz.A0X(r0)
            boolean r3 = X.C22971Dz.A0T(r0)
            if (r4 != 0) goto L_0x0043
            if (r3 == 0) goto L_0x00d3
        L_0x0043:
            java.util.Iterator r2 = r6.iterator()
        L_0x0047:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d3
            com.whatsapp.jid.Jid r1 = X.C17880vN.A0S(r2)
            if (r4 == 0) goto L_0x0084
            boolean r0 = X.C22971Dz.A0X(r1)
            if (r0 != 0) goto L_0x0084
        L_0x0059:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "key = "
            r8.append(r0)
            r8.append(r10)
            java.lang.String r0 = "; messageType = "
            r8.append(r0)
            r8.append(r9)
            java.lang.String r0 = "; targetDevices = "
            r8.append(r0)
            r0 = 44
            java.lang.String r4 = java.lang.String.valueOf(r0)
            X.C199610h.A04(r4)
            java.util.Iterator r3 = r6.iterator()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            goto L_0x0097
        L_0x0084:
            if (r3 == 0) goto L_0x0047
            boolean r0 = X.C22971Dz.A0T(r1)
            if (r0 != 0) goto L_0x0047
            goto L_0x0059
        L_0x008d:
            X.1BI r0 = r10.A00
            X.C17960vV.A07(r0)
            java.util.HashSet r6 = X.AnonymousClass1RP.A02(r7, r0, r9)
            goto L_0x0035
        L_0x0097:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00bc }
            if (r0 == 0) goto L_0x00c3
        L_0x009d:
            java.lang.Object r1 = r3.next()     // Catch:{ IOException -> 0x00bc }
            r1.getClass()     // Catch:{ IOException -> 0x00bc }
            boolean r0 = r1 instanceof java.lang.CharSequence     // Catch:{ IOException -> 0x00bc }
            if (r0 == 0) goto L_0x00b7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ IOException -> 0x00bc }
        L_0x00aa:
            r2.append(r1)     // Catch:{ IOException -> 0x00bc }
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00bc }
            if (r0 == 0) goto L_0x00c3
            r2.append(r4)     // Catch:{ IOException -> 0x00bc }
            goto L_0x009d
        L_0x00b7:
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00aa
        L_0x00bc:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            java.lang.String r0 = r2.toString()
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r8)
            X.190 r2 = r7.A00
            java.lang.String r1 = "InvalidRecipientFiltered"
            r0 = 1
            r2.A0G(r1, r3, r0)
        L_0x00d3:
            r5.retainAll(r6)
            goto L_0x00df
        L_0x00d7:
            X.1Qw r1 = r11.A05
            X.205 r0 = r11.A06
            java.util.Set r5 = r1.A03(r0)
        L_0x00df:
            X.00H r0 = r11.A02
            r0.get()
            com.whatsapp.jid.Jid r2 = r11.A01
            int r1 = r11.A00
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 15
            if (r1 == r0) goto L_0x00f4
            r0 = 64
            if (r1 != r0) goto L_0x0113
        L_0x00f4:
            boolean r0 = X.C22971Dz.A0e(r2)
            if (r0 == 0) goto L_0x0113
            java.util.Iterator r2 = r5.iterator()
        L_0x00fe:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0114
            com.whatsapp.jid.DeviceJid r1 = X.C17880vN.A0R(r2)
            com.whatsapp.jid.UserJid r0 = r1.userJid
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x00fe
        L_0x0110:
            r5.remove(r1)
        L_0x0113:
            return r5
        L_0x0114:
            r1 = 0
            goto L_0x0110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58002jz.A00():java.util.Set");
    }

    public C58002jz(AnonymousClass1RP r1, C26111Qw r2, Jid jid, AnonymousClass205 r4, AnonymousClass00H r5, Set set, int i) {
        this.A02 = r5;
        this.A05 = r2;
        this.A04 = r1;
        this.A01 = jid;
        this.A06 = r4;
        this.A00 = i;
        this.A03 = set;
    }
}
