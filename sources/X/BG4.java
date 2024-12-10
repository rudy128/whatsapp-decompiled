package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

public class BG4 extends Handler {
    public static final Object A0F = C17880vN.A0p();
    public int A00;
    public int A01;
    public Message A02;
    public C6B A03;
    public C6B A04;
    public C24905COy A05;
    public BN8 A06;
    public BN9 A07;
    public C6L A08;
    public ArrayList A09;
    public HashMap A0A;
    public boolean A0B;
    public CWQ[] A0C;
    public CWQ[] A0D;
    public boolean A0E;

    public static final CWQ A00(C6B c6b, C6B c6b2, BG4 bg4) {
        CWQ cwq;
        if (c6b2 != null) {
            cwq = (CWQ) bg4.A0A.get(c6b2);
            if (cwq == null) {
                cwq = A00(c6b2, (C6B) null, bg4);
            }
        } else {
            cwq = null;
        }
        HashMap hashMap = bg4.A0A;
        CWQ cwq2 = (CWQ) hashMap.get(c6b);
        if (cwq2 == null) {
            cwq2 = new CWQ(bg4);
            hashMap.put(c6b, cwq2);
        }
        CWQ cwq3 = cwq2.A01;
        if (cwq3 == null || cwq3 == cwq) {
            cwq2.A00 = c6b;
            cwq2.A01 = cwq;
            cwq2.A02 = false;
            return cwq2;
        }
        throw AnonymousClass8BR.A0w("state already added");
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [X.C68, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r6 != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x0220
            r11.A02 = r12
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x0043
            X.CWQ[] r1 = r11.A0C
            int r0 = r11.A00
            r6 = r1[r0]
            int r1 = r12.what
            r0 = -1
            if (r1 != r0) goto L_0x0069
            java.lang.Object r1 = r12.obj
            java.lang.Object r0 = A0F
            if (r1 != r0) goto L_0x0069
            X.BN9 r0 = r11.A07
            r11.A03 = r0
            if (r6 == 0) goto L_0x00b1
        L_0x0021:
            X.C6B r6 = r6.A00
        L_0x0023:
            X.CWQ[] r1 = r11.A0C
            int r0 = r11.A00
            r0 = r1[r0]
            X.C6B r5 = r0.A00
            java.lang.Object r1 = r12.obj
            java.lang.Object r0 = A0F
            boolean r0 = X.AnonymousClass3Ma.A1Z(r1, r0)
            X.COy r4 = r11.A05
            monitor-enter(r4)
            monitor-exit(r4)
            if (r0 == 0) goto L_0x011e
            X.C6L r9 = r11.A08
            android.os.Message r8 = r11.A02
            java.lang.String r7 = ""
            X.C6B r3 = r11.A03
            monitor-enter(r4)
            goto L_0x00b9
        L_0x0043:
            int r1 = r12.what
            r0 = -2
            if (r1 != r0) goto L_0x01fb
            java.lang.Object r1 = r12.obj
            java.lang.Object r0 = A0F
            if (r1 != r0) goto L_0x01fb
            r0 = 1
            r11.A0E = r0
            r2 = 0
        L_0x0052:
            int r0 = r11.A00
            if (r2 > r0) goto L_0x00b1
            X.CWQ[] r0 = r11.A0C
            r0 = r0[r2]
            X.C6B r0 = r0.A00
            r0.A01()
            X.CWQ[] r0 = r11.A0C
            r1 = r0[r2]
            r0 = 1
            r1.A02 = r0
            int r2 = r2 + 1
            goto L_0x0052
        L_0x0069:
            X.C6B r8 = r6.A00
            boolean r0 = r8 instanceof X.BNA
            if (r0 == 0) goto L_0x00b4
            X.BNA r8 = (X.BNA) r8
            java.lang.Object r7 = r12.obj
            java.lang.String r0 = "null cannot be cast to non-null type T of com.facebook.common.debuggablestatemachine.DebuggableState"
            X.C18070vi.A0z(r7, r0)
            X.BNB r1 = r8.A00
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.CYr r1 = r1.A01
            java.lang.String r5 = X.C108955ca.A0x(r7)
            X.C18070vi.A0X(r5)
            X.CN3 r0 = new X.CN3
            r0.<init>(r5)
            r1.A01(r0)
            java.lang.String r4 = r8.A02
            java.lang.String r3 = r8.A03
            java.lang.String r2 = "[%s] processing %s"
            X.EAY r1 = X.C26294Cx6.A01
            r0 = 4
            boolean r0 = r1.BfN(r0)
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r3, r5)
            X.C26294Cx6.A06(r4, r0)
        L_0x00a5:
            X.C6V r0 = r8.A01
            boolean r0 = r0.A06(r12, r7)
            if (r0 != 0) goto L_0x0021
        L_0x00ad:
            X.CWQ r6 = r6.A01
            if (r6 != 0) goto L_0x0069
        L_0x00b1:
            r6 = 0
            goto L_0x0023
        L_0x00b4:
            boolean r0 = r8 instanceof X.BN9
            if (r0 == 0) goto L_0x0021
            goto L_0x00ad
        L_0x00b9:
            int r0 = r4.A00     // Catch:{ all -> 0x011a }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x011a }
            java.util.Vector r10 = r4.A02     // Catch:{ all -> 0x011a }
            int r1 = r10.size()     // Catch:{ all -> 0x011a }
            r0 = 20
            if (r1 >= r0) goto L_0x00eb
            X.C68 r2 = new X.C68     // Catch:{ all -> 0x011a }
            r2.<init>()     // Catch:{ all -> 0x011a }
            r2.A05 = r9     // Catch:{ all -> 0x011a }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x011a }
            r2.A01 = r0     // Catch:{ all -> 0x011a }
            if (r8 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            r0 = 0
            goto L_0x00dd
        L_0x00db:
            int r0 = r8.what     // Catch:{ all -> 0x011a }
        L_0x00dd:
            r2.A00 = r0     // Catch:{ all -> 0x011a }
            r2.A06 = r7     // Catch:{ all -> 0x011a }
            r2.A04 = r6     // Catch:{ all -> 0x011a }
            r2.A03 = r5     // Catch:{ all -> 0x011a }
            r2.A02 = r3     // Catch:{ all -> 0x011a }
            r10.add(r2)     // Catch:{ all -> 0x011a }
            goto L_0x011d
        L_0x00eb:
            int r0 = r4.A01     // Catch:{ all -> 0x011a }
            java.lang.Object r2 = r10.get(r0)     // Catch:{ all -> 0x011a }
            X.C68 r2 = (X.C68) r2     // Catch:{ all -> 0x011a }
            int r0 = r4.A01     // Catch:{ all -> 0x011a }
            int r1 = r0 + 1
            r4.A01 = r1     // Catch:{ all -> 0x011a }
            r0 = 20
            if (r1 < r0) goto L_0x0100
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x011a }
        L_0x0100:
            r2.A05 = r9     // Catch:{ all -> 0x011a }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x011a }
            r2.A01 = r0     // Catch:{ all -> 0x011a }
            if (r8 == 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r0 = 0
            goto L_0x010f
        L_0x010d:
            int r0 = r8.what     // Catch:{ all -> 0x011a }
        L_0x010f:
            r2.A00 = r0     // Catch:{ all -> 0x011a }
            r2.A06 = r7     // Catch:{ all -> 0x011a }
            r2.A04 = r6     // Catch:{ all -> 0x011a }
            r2.A03 = r5     // Catch:{ all -> 0x011a }
            r2.A02 = r3     // Catch:{ all -> 0x011a }
            goto L_0x011d
        L_0x011a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x011d:
            monitor-exit(r4)
        L_0x011e:
            X.C6B r3 = r11.A03
            if (r3 == 0) goto L_0x0220
        L_0x0122:
            r0 = 0
            r11.A01 = r0
            java.util.HashMap r0 = r11.A0A
            java.lang.Object r4 = r0.get(r3)
            X.CWQ r4 = (X.CWQ) r4
        L_0x012d:
            X.CWQ[] r2 = r11.A0D
            int r1 = r11.A01
            int r0 = r1 + 1
            r11.A01 = r0
            r2[r1] = r4
            X.CWQ r4 = r4.A01
            if (r4 == 0) goto L_0x013f
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x012d
        L_0x013f:
            int r1 = r11.A00
            if (r1 < 0) goto L_0x018e
            X.CWQ[] r0 = r11.A0C
            r0 = r0[r1]
            if (r0 == r4) goto L_0x018e
            X.C6B r7 = r0.A00
            boolean r0 = r7 instanceof X.BNA
            if (r0 == 0) goto L_0x0180
            X.BNA r7 = (X.BNA) r7
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "[%s] exiting state"
            java.lang.String r6 = r7.A03
            X.C26294Cx6.A03(r6, r1, r0)
            X.BNB r0 = r7.A00
            r5 = 0
            X.CYr r2 = r0.A02
            if (r2 == 0) goto L_0x017b
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r5] = r6
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "Exit state [%s]"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.C18070vi.A0X(r1)
            X.CN3 r0 = new X.CN3
            r0.<init>(r1)
            r2.A01(r0)
        L_0x017b:
            X.C6V r0 = r7.A01
            r0.A08()
        L_0x0180:
            X.CWQ[] r0 = r11.A0C
            int r2 = r11.A00
            r1 = r0[r2]
            r0 = 0
            r1.A02 = r0
            int r0 = r2 + -1
            r11.A00 = r0
            goto L_0x013f
        L_0x018e:
            int r5 = r1 + 1
            int r0 = r11.A01
            int r4 = r0 + -1
            r2 = r5
        L_0x0195:
            if (r4 < 0) goto L_0x01a4
            X.CWQ[] r1 = r11.A0C
            X.CWQ[] r0 = r11.A0D
            r0 = r0[r4]
            r1[r2] = r0
            int r2 = r2 + 1
            int r4 = r4 + -1
            goto L_0x0195
        L_0x01a4:
            int r0 = r2 + -1
            r11.A00 = r0
        L_0x01a8:
            int r0 = r11.A00
            if (r5 > r0) goto L_0x01bf
            X.CWQ[] r0 = r11.A0C
            r0 = r0[r5]
            X.C6B r0 = r0.A00
            r0.A01()
            X.CWQ[] r0 = r11.A0C
            r1 = r0[r5]
            r0 = 1
            r1.A02 = r0
            int r5 = r5 + 1
            goto L_0x01a8
        L_0x01bf:
            java.util.ArrayList r2 = r11.A09
            int r1 = r2.size()
        L_0x01c5:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x01d3
            java.lang.Object r0 = r2.get(r1)
            android.os.Message r0 = (android.os.Message) r0
            r11.sendMessageAtFrontOfQueue(r0)
            goto L_0x01c5
        L_0x01d3:
            r2.clear()
            X.C6B r0 = r11.A03
            if (r3 == r0) goto L_0x01dd
            r3 = r0
            goto L_0x0122
        L_0x01dd:
            r0 = 0
            r11.A03 = r0
            if (r3 == 0) goto L_0x0220
            X.BN9 r0 = r11.A07
            if (r3 != r0) goto L_0x0220
            X.C6L r0 = r11.A08
            r2 = 0
            r0.A00 = r2
            r11.A08 = r2
            r11.A02 = r2
            X.COy r1 = r11.A05
            monitor-enter(r1)
            java.util.Vector r0 = r1.A02     // Catch:{ all -> 0x01f8 }
            r0.clear()     // Catch:{ all -> 0x01f8 }
            goto L_0x020a
        L_0x01f8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StateMachine.handleMessage: The start method not called, received msg: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r12, r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x020a:
            monitor-exit(r1)
            r11.A0C = r2
            r11.A0D = r2
            java.util.HashMap r0 = r11.A0A
            r0.clear()
            r11.A04 = r2
            r11.A03 = r2
            java.util.ArrayList r0 = r11.A09
            r0.clear()
            r0 = 1
            r11.A0B = r0
        L_0x0220:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BG4.handleMessage(android.os.Message):void");
    }
}
