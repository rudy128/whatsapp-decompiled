package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BOF extends C26659D8i implements Handler.Callback {
    public int A00;
    public long A01;
    public D48 A02;
    public C22767BOg A03;
    public C22766BOe A04;
    public int A05;
    public long A06;
    public long A07;
    public C22766BOe A08;
    public C22764BOb A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C24756CIt A0E;
    public final E40 A0F;
    public final C24798CKr A0G;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CIt, java.lang.Object] */
    public BOF(Looper looper, E40 e40, C24798CKr cKr) {
        super(3);
        Handler handler;
        this.A0F = e40;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A0D = handler;
        this.A0G = cKr;
        this.A0E = new Object();
        this.A06 = -9223372036854775807L;
        this.A01 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    private void A02() {
        this.A09 = null;
        this.A05 = -1;
        C22766BOe bOe = this.A04;
        if (bOe != null) {
            bOe.release();
            this.A04 = null;
        }
        C22766BOe bOe2 = this.A08;
        if (bOe2 != null) {
            bOe2.release();
            this.A08 = null;
        }
    }

    public static void A05(BOF bof) {
        C22767BOg bp8;
        bof.A0C = true;
        C24798CKr cKr = bof.A0G;
        D48 d48 = bof.A02;
        C26056CrS.A01(d48);
        if (d48.A0S.equals("application/x-subrip")) {
            if (cKr.A00.sortSubripSubtitles) {
                bp8 = new BP7();
            } else {
                bp8 = new BP8();
            }
            bof.A03 = bp8;
            return;
        }
        throw AnonymousClass000.A0k("Attempted to create decoder for unsupported format");
    }

    public void A0H() {
        this.A02 = null;
        this.A06 = -9223372036854775807L;
        A01();
        this.A01 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        A02();
        C22767BOg bOg = this.A03;
        C26056CrS.A01(bOg);
        bOg.release();
        this.A03 = null;
        this.A00 = 0;
    }

    public boolean Bg8() {
        return true;
    }

    private long A00() {
        if (this.A05 == -1) {
            return Long.MAX_VALUE;
        }
        C26056CrS.A01(this.A04);
        if (this.A05 < this.A04.BRQ()) {
            return this.A04.BRP(this.A05);
        }
        return Long.MAX_VALUE;
    }

    private void A01() {
        C25498Cgt cgt = C25498Cgt.A01;
        List emptyList = Collections.emptyList();
        boolean z = true;
        C26056CrS.A03(AnonymousClass000.A1O((this.A07 > -9223372036854775807L ? 1 : (this.A07 == -9223372036854775807L ? 0 : -1))));
        if (this.A01 == -9223372036854775807L) {
            z = false;
        }
        C26056CrS.A03(z);
        C25498Cgt cgt2 = new C25498Cgt(emptyList);
        Handler handler = this.A0D;
        if (handler != null) {
            BE7.A18(handler, cgt2, 0);
        } else {
            A04(cgt2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.D3K, java.lang.Object] */
    private void A04(C25498Cgt cgt) {
        E40 e40 = this.A0F;
        AnonymousClass1IX r0 = cgt.A00;
        e40.Bqd(r0);
        C26678D9b d9b = (C26678D9b) e40;
        ArrayList A13 = AnonymousClass000.A13();
        if (r0 != null) {
            AnonymousClass1IZ it = r0.iterator();
            while (it.hasNext()) {
                CharSequence charSequence = ((C26009CqQ) it.next()).A05;
                ? obj = new Object();
                obj.A00 = charSequence;
                A13.add(obj);
            }
        }
        d9b.A00.A0o.Bqd(A13);
    }

    public void A0I(long j, boolean z) {
        this.A07 = j;
        A01();
        this.A0A = false;
        this.A0B = false;
        this.A06 = -9223372036854775807L;
        if (this.A00 != 0) {
            A03();
            return;
        }
        A02();
        C22767BOg bOg = this.A03;
        C26056CrS.A01(bOg);
        bOg.flush();
    }

    public boolean Bed() {
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        if (r8 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c A[LOOP:1: B:64:0x011c->B:96:0x011c, LOOP_START, SYNTHETIC, Splitter:B:64:0x011c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CF7(long r11, long r13) {
        /*
            r10 = this;
            r10.A07 = r11
            boolean r0 = r10.A08
            r5 = 1
            if (r0 == 0) goto L_0x001b
            long r1 = r10.A06
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            r10.A02()
            r10.A0B = r5
        L_0x001b:
            boolean r0 = r10.A0B
            if (r0 != 0) goto L_0x01ab
            X.BOe r0 = r10.A08
            if (r0 != 0) goto L_0x0052
            X.BOg r0 = r10.A03
            X.C26056CrS.A01(r0)
            X.BOg r0 = r10.A03     // Catch:{ BOZ -> 0x0036 }
            X.C26056CrS.A01(r0)     // Catch:{ BOZ -> 0x0036 }
            X.BOY r0 = r0.A03()     // Catch:{ BOZ -> 0x0036 }
            X.BOe r0 = (X.C22766BOe) r0     // Catch:{ BOZ -> 0x0036 }
            r10.A08 = r0     // Catch:{ BOZ -> 0x0036 }
            goto L_0x0052
        L_0x0036:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            r1.append(r0)
            X.D48 r0 = r10.A02
            java.lang.String r1 = X.C17890vO.A0V(r0, r1)
            java.lang.String r0 = "TextRenderer"
            android.util.Log.e(r0, r1, r2)
            r10.A01()
            r10.A03()
            return
        L_0x0052:
            int r0 = r10.A01
            r4 = 2
            if (r0 != r4) goto L_0x01ab
            X.BOe r0 = r10.A04
            r3 = 0
            if (r0 == 0) goto L_0x0071
            long r1 = r10.A00()
            r8 = 0
        L_0x0061:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0072
            int r0 = r10.A05
            int r0 = r0 + 1
            r10.A05 = r0
            long r1 = r10.A00()
            r8 = 1
            goto L_0x0061
        L_0x0071:
            r8 = 0
        L_0x0072:
            X.BOe r7 = r10.A08
            r2 = 0
            if (r7 == 0) goto L_0x00bb
            r1 = 4
            int r0 = r7.A00
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 == 0) goto L_0x00a3
            if (r8 != 0) goto L_0x00bd
            long r8 = r10.A00()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0098
            int r0 = r10.A00
            if (r0 != r4) goto L_0x009d
            r10.A03()
        L_0x0098:
            int r0 = r10.A00
            if (r0 != r4) goto L_0x011c
            return
        L_0x009d:
            r10.A02()
            r10.A0B = r5
            goto L_0x0098
        L_0x00a3:
            long r0 = r7.A01
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x00bb
            X.BOe r0 = r10.A04
            if (r0 == 0) goto L_0x00b0
            r0.release()
        L_0x00b0:
            int r0 = r7.BVM(r11)
            r10.A05 = r0
            r10.A04 = r7
            r10.A08 = r2
            goto L_0x00bd
        L_0x00bb:
            if (r8 == 0) goto L_0x0098
        L_0x00bd:
            X.BOe r0 = r10.A04
            X.C26056CrS.A01(r0)
            X.BOe r0 = r10.A04
            int r6 = r0.BVM(r11)
            if (r6 == 0) goto L_0x0112
            X.BOe r0 = r10.A04
            int r0 = r0.BRQ()
            if (r0 == 0) goto L_0x0112
            r0 = -1
            X.BOe r1 = r10.A04
            if (r6 != r0) goto L_0x010f
            int r0 = r1.BRQ()
            int r0 = r0 + -1
        L_0x00dd:
            long r0 = r1.BRP(r0)
        L_0x00e1:
            r9 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r6)
            X.C26056CrS.A03(r0)
            long r0 = r10.A01
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00f7
            r9 = 0
        L_0x00f7:
            X.C26056CrS.A03(r9)
            X.Cgt r0 = X.C25498Cgt.A01
            X.BOe r0 = r10.A04
            java.util.List r0 = r0.BPm(r11)
            X.Cgt r1 = new X.Cgt
            r1.<init>(r0)
            android.os.Handler r0 = r10.A0D
            if (r0 == 0) goto L_0x0117
            X.BE7.A18(r0, r1, r3)
            goto L_0x0098
        L_0x010f:
            int r0 = r6 + -1
            goto L_0x00dd
        L_0x0112:
            X.BOe r0 = r10.A04
            long r0 = r0.A01
            goto L_0x00e1
        L_0x0117:
            r10.A04(r1)
            goto L_0x0098
        L_0x011c:
            boolean r0 = r10.A0A     // Catch:{ BOZ -> 0x0190 }
            if (r0 != 0) goto L_0x01ab
            X.BOb r6 = r10.A09     // Catch:{ BOZ -> 0x0190 }
            if (r6 != 0) goto L_0x0133
            X.BOg r0 = r10.A03     // Catch:{ BOZ -> 0x0190 }
            X.C26056CrS.A01(r0)     // Catch:{ BOZ -> 0x0190 }
            X.BOc r6 = r0.A02()     // Catch:{ BOZ -> 0x0190 }
            X.BOb r6 = (X.C22764BOb) r6     // Catch:{ BOZ -> 0x0190 }
            if (r6 == 0) goto L_0x01ab
            r10.A09 = r6     // Catch:{ BOZ -> 0x0190 }
        L_0x0133:
            int r0 = r10.A00     // Catch:{ BOZ -> 0x0190 }
            if (r0 != r5) goto L_0x0147
            r0 = 4
            r6.A00 = r0     // Catch:{ BOZ -> 0x0190 }
            X.BOg r0 = r10.A03     // Catch:{ BOZ -> 0x0190 }
            X.C26056CrS.A01(r0)     // Catch:{ BOZ -> 0x0190 }
            r0.A04(r6)     // Catch:{ BOZ -> 0x0190 }
            r10.A09 = r2     // Catch:{ BOZ -> 0x0190 }
            r10.A00 = r4     // Catch:{ BOZ -> 0x0190 }
            goto L_0x018f
        L_0x0147:
            X.CIt r7 = r10.A0E     // Catch:{ BOZ -> 0x0190 }
            int r1 = r10.A0C(r7, r6, r3)     // Catch:{ BOZ -> 0x0190 }
            r0 = -4
            if (r1 != r0) goto L_0x018b
            r1 = 4
            int r0 = r6.A00     // Catch:{ BOZ -> 0x0190 }
            r0 = r0 & 4
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)     // Catch:{ BOZ -> 0x0190 }
            if (r0 == 0) goto L_0x016a
            r10.A0A = r5     // Catch:{ BOZ -> 0x0190 }
            r10.A0C = r3     // Catch:{ BOZ -> 0x0190 }
        L_0x015f:
            X.BOg r0 = r10.A03     // Catch:{ BOZ -> 0x0190 }
            X.C26056CrS.A01(r0)     // Catch:{ BOZ -> 0x0190 }
            r0.A04(r6)     // Catch:{ BOZ -> 0x0190 }
            r10.A09 = r2     // Catch:{ BOZ -> 0x0190 }
            goto L_0x011c
        L_0x016a:
            X.D48 r0 = r7.A00     // Catch:{ BOZ -> 0x0190 }
            if (r0 == 0) goto L_0x01ab
            long r0 = r0.A0J     // Catch:{ BOZ -> 0x0190 }
            r6.A00 = r0     // Catch:{ BOZ -> 0x0190 }
            java.nio.ByteBuffer r0 = r6.A01     // Catch:{ BOZ -> 0x0190 }
            if (r0 == 0) goto L_0x0179
            r0.flip()     // Catch:{ BOZ -> 0x0190 }
        L_0x0179:
            boolean r1 = r10.A0C     // Catch:{ BOZ -> 0x0190 }
            int r0 = r6.A00     // Catch:{ BOZ -> 0x0190 }
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r5)     // Catch:{ BOZ -> 0x0190 }
            r0 = r0 ^ 1
            r1 = r1 & r0
            r10.A0C = r1     // Catch:{ BOZ -> 0x0190 }
            if (r1 != 0) goto L_0x011c
            goto L_0x015f
        L_0x018b:
            r0 = -3
            if (r1 != r0) goto L_0x011c
            return
        L_0x018f:
            return
        L_0x0190:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            r1.append(r0)
            X.D48 r0 = r10.A02
            java.lang.String r1 = X.C17890vO.A0V(r0, r1)
            java.lang.String r0 = "TextRenderer"
            android.util.Log.e(r0, r1, r2)
            r10.A01()
            r10.A03()
        L_0x01ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BOF.CF7(long, long):void");
    }

    public int COo(D48 d48) {
        int A1O;
        String str = d48.A0S;
        if ("application/x-subrip".equals(str)) {
            A1O = 2;
            if (d48.A06 == 0) {
                A1O = 4;
            }
        } else {
            A1O = AnonymousClass000.A1O(C26233CvQ.A05(str) ? 1 : 0);
        }
        return A1O | 128;
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            A04((C25498Cgt) message.obj);
            return true;
        }
        throw BE6.A0k();
    }

    private void A03() {
        A02();
        C22767BOg bOg = this.A03;
        C26056CrS.A01(bOg);
        bOg.release();
        this.A03 = null;
        this.A00 = 0;
        A05(this);
    }
}
