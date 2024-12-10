package X;

import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1OZ  reason: invalid class name */
public class AnonymousClass1OZ {
    public static final Set A0J = C200410p.A0S(new Integer[]{501, 531, 532, 533, 536, 542, 547, 548});
    public static final C25411Oc A0K = new C25411Oc(500, 599);
    public C52332ak A00;
    public final AnonymousClass190 A01;
    public final C23651Hc A02;
    public final AnonymousClass1O2 A03;
    public final C25361Nx A04;
    public final AnonymousClass1O3 A05;
    public final C25381Nz A06;
    public final AnonymousClass1O4 A07;
    public final AnonymousClass19Y A08;
    public final Map A09 = new LinkedHashMap();
    public final C18100vl A0A = new C18110vm(C25421Od.A00);
    public final AnonymousClass1OX A0B;
    public final AnonymousClass11P A0C;
    public final C18030ve A0D;
    public final AnonymousClass1N7 A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AtomicInteger A0H = new AtomicInteger();
    public volatile C36281nd A0I;

    public AnonymousClass1OZ(AnonymousClass190 r3, C23651Hc r4, AnonymousClass11P r5, C18030ve r6, AnonymousClass1O2 r7, C25361Nx r8, AnonymousClass1O3 r9, C25381Nz r10, AnonymousClass1O4 r11, AnonymousClass1N7 r12, AnonymousClass19Y r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass1OX r16) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r14, 5);
        C18070vi.A0d(r10, 6);
        C18070vi.A0d(r7, 7);
        C18070vi.A0d(r4, 8);
        C18070vi.A0d(r13, 9);
        C18070vi.A0d(r12, 10);
        C18070vi.A0d(r15, 11);
        C18070vi.A0d(r9, 12);
        C18070vi.A0d(r11, 13);
        AnonymousClass1OX r1 = r16;
        C18070vi.A0d(r1, 14);
        this.A0C = r5;
        this.A0D = r6;
        this.A01 = r3;
        this.A04 = r8;
        this.A0F = r14;
        this.A06 = r10;
        this.A03 = r7;
        this.A02 = r4;
        this.A08 = r13;
        this.A0E = r12;
        this.A0G = r15;
        this.A05 = r9;
        this.A07 = r11;
        this.A0B = r1;
    }

    public final C26981Ug A07(Message message, C60132nR r6) {
        C18070vi.A0d(message, 1);
        C17960vV.A08(r6, "MessageClient/sendAckableMessage: stanzaKey is null");
        C60132nR A012 = A01(r6);
        C26981Ug r2 = new C26981Ug();
        this.A05.A00(A012, r2);
        StringBuilder sb = new StringBuilder();
        sb.append("MessageClient/sendAckableMessage ");
        sb.append(A012);
        Log.i(sb.toString());
        A03(message, this, false);
        return r2;
    }

    public final void A0F(Message message, String str) {
        C18070vi.A0d(message, 0);
        C18070vi.A0d(str, 1);
        A02(message, this, (C26971Uf) null, str, 0, true);
    }

    public final void A0G(Message message, String str) {
        C18070vi.A0d(message, 0);
        A02(message, this, (C26971Uf) null, str, 0, false);
    }

    public final void A0H(AnonymousClass1O5 r26, C29621ca r27, AnonymousClass1NV r28, String str, int i, long j) {
        C29621ca r10 = r27;
        String str2 = str;
        int i2 = i;
        long j2 = j;
        C20994Acm acm = new C20994Acm(this.A0C, this, r26, r10, r28, str2, i2, j2);
        boolean z = true;
        boolean z2 = false;
        if (!this.A02.A07 || this.A0I == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIqWithRetryInternal/add-to-pending inFlightMessages type=");
            sb.append(i2);
            sb.append(" id=");
            sb.append(str2);
            Log.i(sb.toString());
            this.A07.A04(acm, str2, i2, j2, false);
            AnonymousClass1O2 r1 = this.A03;
            if (j <= 0) {
                z = false;
            }
            r1.A02(AnonymousClass2U2.A00(r10, Boolean.valueOf(z), str2, i2, false, false), str2);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageClient/sendIqWithRetryInternal/add-to-pending type=");
        sb2.append(i2);
        sb2.append(" id=");
        sb2.append(str2);
        Log.i(sb2.toString());
        this.A07.A04(acm, str2, i2, j2, false);
        if (j > 0) {
            z2 = true;
        }
        A03(AnonymousClass2U2.A00(r10, Boolean.valueOf(z2), str2, i2, false, false), this, true);
    }

    public final void A0I(AnonymousClass1O5 r9, C29621ca r10, String str, int i, long j) {
        C18070vi.A0d(str, 1);
        C18070vi.A0d(r10, 2);
        AnonymousClass1O5 r1 = r9;
        A04(this, r1, r10, str, i, j, false);
    }

    public final void A0J(AnonymousClass1O5 r18, C29621ca r19, String str, int i, long j) {
        String str2 = str;
        C18070vi.A0d(str2, 1);
        C29621ca r5 = r19;
        C18070vi.A0d(r5, 2);
        AnonymousClass1O5 r4 = r18;
        int i2 = i;
        long j2 = j;
        if (!A0N(r4, r5, str2, i2, j2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIqWithCallback/add-to-pending type=");
            sb.append(i2);
            sb.append(" id=");
            sb.append(str2);
            Log.i(sb.toString());
            this.A07.A04(r4, str2, i2, j2, true);
            AnonymousClass1O2 r42 = this.A03;
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            r42.A02(AnonymousClass2U2.A00(r5, Boolean.valueOf(z), str2, i2, false, false), str2);
        }
    }

    public final void A0K(C60132nR r3) {
        C18070vi.A0d(r3, 0);
        Message A032 = C63902ts.A03(this.A01, this.A0D, r3);
        C18070vi.A0X(A032);
        A0M(A032);
    }

    public final boolean A0M(Message message) {
        StringBuilder sb;
        C18070vi.A0d(message, 0);
        int A002 = AnonymousClass2U7.A00(message);
        if (this.A02.A07) {
            sb.append("MessageClient/sendXmppIfReady type=");
            sb.append(A002);
            Log.i(sb.toString());
            A03(message, this, false);
            return true;
        }
        sb = new StringBuilder();
        sb.append("MessageClient/sendXmppIfReady not-ready type=");
        sb.append(A002);
        Log.i(sb.toString());
        A00(message);
        return false;
    }

    public final boolean A0N(AnonymousClass1O5 r9, C29621ca r10, String str, int i, long j) {
        C18070vi.A0d(str, 1);
        C29621ca r2 = r10;
        C18070vi.A0d(r10, 2);
        AnonymousClass1O5 r1 = r9;
        C18070vi.A0d(r9, 3);
        return A06(this, r1, r2, str, i, j, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01bb, code lost:
        if (r0 != false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x023c, code lost:
        if ((r6 instanceof X.C173598vL) != false) goto L_0x023e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Message A00(android.os.Message r18) {
        /*
            r17 = this;
            r0 = r17
            X.0ve r3 = r0.A0D
            r4 = r18
            int r6 = r4.arg1
            r1 = 9
            if (r6 == r1) goto L_0x0134
            r1 = 11
            if (r6 == r1) goto L_0x0129
            r1 = 76
            if (r6 == r1) goto L_0x011c
            r1 = 129(0x81, float:1.81E-43)
            if (r6 == r1) goto L_0x011c
            r1 = 419(0x1a3, float:5.87E-43)
            if (r6 == r1) goto L_0x0103
            r1 = 431(0x1af, float:6.04E-43)
            if (r6 == r1) goto L_0x00ea
            X.0vf r2 = X.C18040vf.A01
            r1 = 6175(0x181f, float:8.653E-42)
            boolean r1 = X.C18020vd.A05(r2, r3, r1)
            if (r1 == 0) goto L_0x003b
            r3 = 157(0x9d, float:2.2E-43)
            java.lang.String r5 = "loggableStanzaId"
            java.lang.String r8 = "callId"
            java.lang.String r9 = "callCreatorJid"
            java.lang.String r2 = "jid"
            java.lang.String r1 = "id"
            if (r6 == r3) goto L_0x00a6
            switch(r6) {
                case 71: goto L_0x0144;
                case 72: goto L_0x0073;
                case 73: goto L_0x0040;
                default: goto L_0x003b;
            }
        L_0x003b:
            r5 = 0
        L_0x003c:
            if (r5 != 0) goto L_0x017d
            r0 = 0
            return r0
        L_0x0040:
            android.os.Bundle r7 = X.C63902ts.A00(r4)
            X.C17960vV.A07(r7)
            java.lang.String r6 = r7.getString(r1)
            java.lang.String r1 = r7.getString(r2)
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r4 = r2.A06(r1)
            X.C17960vV.A07(r4)
            java.lang.String r1 = r7.getString(r9)
            com.whatsapp.jid.DeviceJid r3 = r2.A06(r1)
            X.C17960vV.A07(r3)
            java.lang.String r2 = r7.getString(r8)
            java.lang.String r1 = "reject"
            X.1ca r4 = X.C63952ty.A02(r4, r3, r6, r2, r1)
            long r2 = r7.getLong(r5)
            goto L_0x0175
        L_0x0073:
            android.os.Bundle r7 = X.C63902ts.A00(r4)
            X.C17960vV.A07(r7)
            java.lang.String r6 = r7.getString(r1)
            java.lang.String r1 = r7.getString(r2)
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r4 = r2.A06(r1)
            X.C17960vV.A07(r4)
            java.lang.String r1 = r7.getString(r9)
            com.whatsapp.jid.DeviceJid r3 = r2.A06(r1)
            X.C17960vV.A07(r3)
            java.lang.String r2 = r7.getString(r8)
            java.lang.String r1 = "accept"
            X.1ca r4 = X.C63952ty.A02(r4, r3, r6, r2, r1)
            long r2 = r7.getLong(r5)
            goto L_0x0175
        L_0x00a6:
            android.os.Bundle r3 = X.C63902ts.A00(r4)
            X.C17960vV.A07(r3)
            java.lang.String r12 = r3.getString(r1)
            java.lang.String r1 = r3.getString(r2)
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r10 = r2.A06(r1)
            X.C17960vV.A07(r10)
            java.lang.String r1 = r3.getString(r9)
            com.whatsapp.jid.DeviceJid r11 = r2.A06(r1)
            X.C17960vV.A07(r11)
            java.lang.String r13 = r3.getString(r8)
            java.lang.String r1 = "type"
            java.lang.String r14 = r3.getString(r1)
            java.lang.String r1 = "registrationId"
            byte[] r15 = r3.getByteArray(r1)
            java.lang.String r1 = "retry"
            byte r16 = r3.getByte(r1)
            X.1ca r4 = X.C63952ty.A03(r10, r11, r12, r13, r14, r15, r16)
            long r2 = r3.getLong(r5)
            goto L_0x0175
        L_0x00ea:
            java.lang.Object r1 = r4.obj
            X.C17960vV.A07(r1)
            X.2fh r1 = (X.C55392fh) r1
            X.1BI r2 = r1.A01
            java.lang.String r5 = r1.A04
            X.1BI r3 = r1.A02
            r4 = 0
            java.lang.String r7 = r1.A03
            r8 = r4
            r6 = r4
            X.1ca r4 = X.C63952ty.A00(r2, r3, r4, r5, r6, r7, r8)
            long r2 = r1.A00
            goto L_0x0175
        L_0x0103:
            java.lang.Object r1 = r4.obj
            X.2gc r1 = (X.C55942gc) r1
            X.205 r5 = r1.A06
            java.lang.String r6 = r1.A07
            java.lang.String[] r7 = r1.A02
            X.1BI r2 = r1.A03
            com.whatsapp.jid.UserJid r4 = r1.A05
            com.whatsapp.jid.DeviceJid r3 = r1.A04
            int r8 = r1.A00
            X.1ca r4 = X.C63952ty.A01(r2, r3, r4, r5, r6, r7, r8)
            long r2 = r1.A01
            goto L_0x0175
        L_0x011c:
            java.lang.Object r2 = r4.obj
            X.2nR r2 = (X.C60132nR) r2
            X.1ca r1 = r2.A04
            X.1ca r4 = X.C63952ty.A06(r1, r2)
            long r2 = r2.A00
            goto L_0x0175
        L_0x0129:
            java.lang.Object r1 = r4.obj
            X.2h7 r1 = (X.C56222h7) r1
            X.1ca r4 = X.C63952ty.A04(r1)
            long r2 = r1.A03
            goto L_0x0175
        L_0x0134:
            java.lang.Object r2 = r4.obj
            X.C17960vV.A07(r2)
            X.206 r2 = (X.AnonymousClass206) r2
            int r1 = r4.arg2
            X.1ca r4 = X.C63952ty.A05(r2, r1)
            long r2 = r2.A10
            goto L_0x0175
        L_0x0144:
            android.os.Bundle r7 = X.C63902ts.A00(r4)
            X.C17960vV.A07(r7)
            java.lang.String r6 = r7.getString(r1)
            java.lang.String r1 = r7.getString(r2)
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r4 = r2.A06(r1)
            X.C17960vV.A07(r4)
            java.lang.String r1 = r7.getString(r9)
            com.whatsapp.jid.DeviceJid r3 = r2.A06(r1)
            X.C17960vV.A07(r3)
            java.lang.String r2 = r7.getString(r8)
            java.lang.String r1 = "offer"
            X.1ca r4 = X.C63952ty.A02(r4, r3, r6, r2, r1)
            long r2 = r7.getLong(r5)
        L_0x0175:
            r1 = 0
            X.2mG r5 = new X.2mG
            r5.<init>(r4, r1, r2)
            goto L_0x003c
        L_0x017d:
            X.1N7 r3 = r0.A0E
            long r1 = r5.A00
            X.2tQ r6 = r3.A01(r1)
            if (r6 != 0) goto L_0x01c6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessageClient/markProcessedAndAddToPreacksQueue loggableStanza for "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = " not found, possibly the cache is cleared or we're seeing double ack/receipts sends"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x01a0:
            X.00H r0 = r0.A0F
            java.lang.Object r2 = r0.get()
            X.1fG r2 = (X.C31251fG) r2
            X.1ca r0 = r5.A01
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "ack"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x01bd
            java.lang.String r0 = "receipt"
            boolean r0 = X.C18070vi.A18(r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x01be
        L_0x01bd:
            r1 = 1
        L_0x01be:
            java.lang.String r0 = "Only ack/receipt can be pre-acked."
            X.C17960vV.A0G(r1, r0)
            monitor-enter(r2)
            goto L_0x0245
        L_0x01c6:
            monitor-enter(r6)
            int r4 = r6.A00     // Catch:{ all -> 0x025a }
            if (r4 != 0) goto L_0x01ef
            X.190 r4 = r6.A05     // Catch:{ all -> 0x025a }
            java.lang.String r3 = "loggable_stanza_already_acked"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r2.<init>()     // Catch:{ all -> 0x025a }
            java.lang.String r1 = "tag="
            r2.append(r1)     // Catch:{ all -> 0x025a }
            java.lang.String r1 = r6.A04()     // Catch:{ all -> 0x025a }
            r2.append(r1)     // Catch:{ all -> 0x025a }
            java.lang.String r1 = " method=onStanzaProcessed"
            r2.append(r1)     // Catch:{ all -> 0x025a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x025a }
            r1 = 1
            r4.A0G(r3, r2, r1)     // Catch:{ all -> 0x025a }
            goto L_0x0242
        L_0x01ef:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x025a }
            r3.<init>()     // Catch:{ all -> 0x025a }
            java.lang.String r1 = "LoggableStanza/onStanzaProcessed id="
            r3.append(r1)     // Catch:{ all -> 0x025a }
            long r1 = r6.A03     // Catch:{ all -> 0x025a }
            r3.append(r1)     // Catch:{ all -> 0x025a }
            java.lang.String r1 = "/"
            r3.append(r1)     // Catch:{ all -> 0x025a }
            java.lang.String r1 = r6.A0A     // Catch:{ all -> 0x025a }
            r3.append(r1)     // Catch:{ all -> 0x025a }
            java.lang.String r1 = " currentStage="
            r3.append(r1)     // Catch:{ all -> 0x025a }
            r3.append(r4)     // Catch:{ all -> 0x025a }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x025a }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x025a }
            X.1N7 r4 = r6.A07     // Catch:{ all -> 0x025a }
            monitor-enter(r4)     // Catch:{ all -> 0x025a }
            X.1N6 r3 = r4.A01     // Catch:{ all -> 0x0257 }
            r2 = 18
            X.AWd r1 = new X.AWd     // Catch:{ all -> 0x0257 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0257 }
            r3.notifyAllObservers(r1)     // Catch:{ all -> 0x0257 }
            boolean r1 = r6 instanceof X.C173588vK     // Catch:{ all -> 0x0257 }
            r2 = 4
            if (r1 != 0) goto L_0x023e
            boolean r1 = r6 instanceof X.C173578vJ     // Catch:{ all -> 0x0257 }
            if (r1 == 0) goto L_0x0231
            r1 = 6
            goto L_0x0236
        L_0x0231:
            boolean r1 = r6 instanceof X.C173568vI     // Catch:{ all -> 0x0257 }
            if (r1 == 0) goto L_0x023a
            r1 = 5
        L_0x0236:
            r6.A05(r1)     // Catch:{ all -> 0x0257 }
            goto L_0x0241
        L_0x023a:
            boolean r1 = r6 instanceof X.C173598vL     // Catch:{ all -> 0x0257 }
            if (r1 == 0) goto L_0x0241
        L_0x023e:
            r6.A05(r2)     // Catch:{ all -> 0x0257 }
        L_0x0241:
            monitor-exit(r4)     // Catch:{ all -> 0x025a }
        L_0x0242:
            monitor-exit(r6)
            goto L_0x01a0
        L_0x0245:
            X.1JD r0 = r2.A03     // Catch:{ all -> 0x0254 }
            r0.add(r5)     // Catch:{ all -> 0x0254 }
            monitor-exit(r2)
            r2 = 0
            r1 = 43
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r1, r2, r5)
            return r0
        L_0x0254:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0257:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x025a }
            throw r0     // Catch:{ all -> 0x025a }
        L_0x025a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OZ.A00(android.os.Message):android.os.Message");
    }

    public static final C60132nR A01(C60132nR r3) {
        Jid jid = r3.A02;
        C58762lD r2 = null;
        if ((jid instanceof DeviceJid) && jid.getDevice() == 0) {
            r2 = r3.A00();
            r2.A02 = ((DeviceJid) jid).userJid;
        }
        DeviceJid A022 = DeviceJid.Companion.A02(r3.A01);
        if (A022 != null && A022.getDevice() == 0) {
            if (r2 == null) {
                r2 = r3.A00();
            }
            r2.A01 = A022.userJid;
        } else if (r2 == null) {
            return r3;
        }
        return r2.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.os.Message r3, X.AnonymousClass1OZ r4, boolean r5) {
        /*
            X.1nd r0 = r4.A0I
            if (r0 != 0) goto L_0x0016
            X.1Hc r1 = r4.A02
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x004d
            int r1 = r1.A04
            r0 = 12
            if (r1 != r0) goto L_0x004d
            java.lang.String r0 = "MessageClient/sendXmpp/drop the stanza if xmpp is not ready for a good reason"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0015:
            return
        L_0x0016:
            int r0 = X.AnonymousClass2U7.A00(r3)
            switch(r0) {
                case 4: goto L_0x001f;
                case 8: goto L_0x001f;
                case 12: goto L_0x001f;
                case 25: goto L_0x001f;
                case 27: goto L_0x001f;
                case 35: goto L_0x001f;
                case 38: goto L_0x001f;
                case 59: goto L_0x001f;
                case 60: goto L_0x001f;
                case 71: goto L_0x001f;
                case 72: goto L_0x001f;
                case 73: goto L_0x001f;
                case 77: goto L_0x001f;
                case 89: goto L_0x001f;
                case 118: goto L_0x001f;
                case 119: goto L_0x001f;
                case 157: goto L_0x001f;
                case 194: goto L_0x001f;
                case 206: goto L_0x001f;
                case 220: goto L_0x001f;
                case 255: goto L_0x001f;
                case 273: goto L_0x001f;
                case 327: goto L_0x001f;
                case 371: goto L_0x001f;
                case 381: goto L_0x001f;
                case 402: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            if (r5 == 0) goto L_0x0036
        L_0x001f:
            X.2ak r0 = r4.A00
            X.C17960vV.A07(r0)
            X.17v r2 = r0.A00
            X.1cu r1 = r2.A0e
            r0 = 4
            X.C29811cu.A01(r1, r0)
            X.1Kj r0 = r2.A0c
            r0.A02()
            r1 = 1
            r0 = 0
            X.C219017v.A06(r2, r1, r0, r0)
        L_0x0036:
            android.os.Message r2 = r4.A00(r3)
            X.1nd r1 = r4.A0I
            if (r1 == 0) goto L_0x0015
            if (r2 != 0) goto L_0x0044
            android.os.Message r2 = android.os.Message.obtain(r3)
        L_0x0044:
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 4
            r2.what = r0
            r1.sendMessage(r2)
            return
        L_0x004d:
            java.lang.String r1 = "sendXmpp called before sending channel is ready"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OZ.A03(android.os.Message, X.1OZ, boolean):void");
    }

    public static final boolean A06(AnonymousClass1OZ r9, AnonymousClass1O5 r10, C29621ca r11, String str, int i, long j, boolean z) {
        boolean z2 = false;
        String str2 = str;
        int i2 = i;
        if (!r9.A02.A07 || r9.A0I == null) {
            r9.A07.A05(str);
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIqWithCallbackInternal not ready, type=");
            sb.append(i);
            sb.append(" iqId=");
            sb.append(str);
            Log.i(sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageClient/sendIqWithCallbackInternal/add-to-pending type=");
        sb2.append(i);
        sb2.append(" id=");
        sb2.append(str);
        Log.i(sb2.toString());
        r9.A07.A04(r10, str2, i2, j, false);
        if (j > 0) {
            z2 = true;
        }
        A03(AnonymousClass2U2.A00(r11, Boolean.valueOf(z2), str2, i2, z, false), r9, true);
        return true;
    }

    public final C26981Ug A09(C29621ca r12, String str, int i) {
        Boolean bool = C17960vV.A01;
        C26981Ug r2 = new C26981Ug();
        if (!A06(this, new C20989Ach(r2, 3), r12, str, i, 32000, false)) {
            r2.BrC(new IOException("connection layer not ready yet"));
        }
        return r2;
    }

    public final Object A0A(C29621ca r22, String str, C30391dr r24, int i, long j, boolean z) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        boolean z2 = true;
        C31781g7 r4 = new C31781g7(1, C30581eB.A02(r24));
        r4.A0F();
        C20989Ach ach = new C20989Ach(r4, 4);
        C29621ca r8 = r22;
        String str2 = str;
        int i2 = i;
        long j2 = j;
        if (z) {
            A04(this, ach, r8, str2, i2, j2, false);
        } else if (!A06(this, ach, r8, str2, i2, j2, false)) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIq/add-to-pending type=");
            sb.append(i2);
            sb.append(" id=");
            sb.append(str2);
            Log.i(sb.toString());
            String str3 = str2;
            int i3 = i2;
            this.A07.A04(ach, str3, i3, j2, true);
            AnonymousClass1O2 r3 = this.A03;
            if (j <= 0) {
                z2 = false;
            }
            r3.A02(AnonymousClass2U2.A00(r8, Boolean.valueOf(z2), str3, i3, false, false), str2);
        }
        return r4.A0C();
    }

    public final String A0B() {
        String obj;
        AnonymousClass1O4 r6 = this.A07;
        synchronized (r6.A0B) {
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            int i = r6.A00;
            r6.A00 = i + 1;
            sb.append(Integer.toHexString(i));
            obj = sb.toString();
            boolean z = false;
            if (r6.A0E.put(obj, r6.A09) == null) {
                z = true;
            }
            C17960vV.A0D(z);
            if (r6.A00 == 65536) {
                r6.A03.A0G("iqId too large", (String) null, false);
                r6.A00 = 0;
            }
        }
        C18070vi.A0X(obj);
        return obj;
    }

    public final String A0C() {
        StringBuilder sb = new StringBuilder();
        sb.append('n');
        sb.append(Integer.toHexString(this.A0H.getAndIncrement()));
        return sb.toString();
    }

    public final void A0D() {
        Map map = this.A09;
        synchronized (map) {
            for (Map.Entry value : map.entrySet()) {
                ((AnonymousClass1OB) value.getValue()).BEM((CancellationException) null);
            }
            map.clear();
        }
    }

    public final boolean A0L() {
        C23651Hc r1 = this.A02;
        if (!r1.A07 || !r1.A02()) {
            return false;
        }
        return true;
    }

    public final boolean A0O(C29621ca r7, int i) {
        if (!this.A02.A07) {
            return false;
        }
        A03(AnonymousClass2U2.A00(r7, (Boolean) null, (String) null, i, false, false), this, false);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.os.Message r6, X.AnonymousClass1OZ r7, X.C26971Uf r8, java.lang.String r9, long r10, boolean r12) {
        /*
            int r3 = X.AnonymousClass2U7.A00(r6)
            X.1Hc r0 = r7.A02
            boolean r0 = r0.A07
            r4 = 0
            java.lang.String r2 = " id="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r0 == 0) goto L_0x0072
            r1.<init>()
            java.lang.String r0 = "MessageClient/sendMessageWhenReady type="
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 0
            if (r12 == 0) goto L_0x00b5
            X.1Nz r0 = r7.A06
            X.C17960vV.A07(r9)
            X.C18070vi.A0X(r9)
            java.util.LinkedHashMap r3 = r0.A00
            monitor-enter(r3)
            java.lang.Object r1 = r3.get(r9)     // Catch:{ all -> 0x006f }
            X.2mF r1 = (X.C59402mF) r1     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x004f
            int r0 = r1.A00     // Catch:{ all -> 0x006f }
            int r0 = r0 + 1
            if (r8 != 0) goto L_0x0046
            X.1Uf r8 = r1.A02     // Catch:{ all -> 0x006f }
        L_0x0046:
            X.2mF r1 = new X.2mF     // Catch:{ all -> 0x006f }
            r1.<init>(r6, r8, r0)     // Catch:{ all -> 0x006f }
        L_0x004b:
            r3.put(r9, r1)     // Catch:{ all -> 0x006f }
            goto L_0x00a8
        L_0x004f:
            monitor-exit(r3)
            java.util.LinkedHashMap r3 = r0.A01
            monitor-enter(r3)
            java.lang.Object r1 = r3.get(r9)     // Catch:{ all -> 0x006f }
            X.2mF r1 = (X.C59402mF) r1     // Catch:{ all -> 0x006f }
            r0 = 1
            if (r1 == 0) goto L_0x0060
            int r0 = r1.A00     // Catch:{ all -> 0x006f }
            int r0 = r0 + 1
        L_0x0060:
            if (r8 != 0) goto L_0x0069
            if (r1 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r8 = 0
            goto L_0x0069
        L_0x0067:
            X.1Uf r8 = r1.A02     // Catch:{ all -> 0x006f }
        L_0x0069:
            X.2mF r1 = new X.2mF     // Catch:{ all -> 0x006f }
            r1.<init>(r6, r8, r0)     // Catch:{ all -> 0x006f }
            goto L_0x004b
        L_0x006f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0072:
            r1.<init>()
            java.lang.String r0 = "MessageClient/sendMessageWhenReady/add-to-pending type="
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1O2 r0 = r7.A03
            java.util.List r1 = r0.A02
            monitor-enter(r1)
            X.2f0 r0 = new X.2f0     // Catch:{ all -> 0x00b9 }
            r0.<init>(r6, r8, r9, r12)     // Catch:{ all -> 0x00b9 }
            r1.add(r0)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b9 }
            if (r12 == 0) goto L_0x00b8
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b8
            X.1O4 r1 = r7.A07
            X.C17960vV.A07(r9)
            r0 = 1
            r1.A02(r10, r9, r0)
            return
        L_0x00a8:
            monitor-exit(r3)
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b5
            X.1O4 r0 = r7.A07
            X.C17960vV.A07(r9)
            r0.A02(r10, r9, r2)
        L_0x00b5:
            A03(r6, r7, r2)
        L_0x00b8:
            return
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OZ.A02(android.os.Message, X.1OZ, X.1Uf, java.lang.String, long, boolean):void");
    }

    public static final void A04(AnonymousClass1OZ r9, AnonymousClass1O5 r10, C29621ca r11, String str, int i, long j, boolean z) {
        AnonymousClass1O5 r3 = r10;
        String str2 = str;
        int i2 = i;
        if (r9.A0L()) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessageClient/sendIqWithCallbackIfConnectedInternal/add-to-pending type=");
            sb.append(i);
            sb.append(" id=");
            sb.append(str);
            Log.i(sb.toString());
            r9.A07.A04(r3, str2, i2, j, false);
            boolean z2 = false;
            if (j > 0) {
                z2 = true;
            }
            A03(AnonymousClass2U2.A00(r11, Boolean.valueOf(z2), str2, i2, z, true), r9, false);
            return;
        }
        r9.A07.A05(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageClient/sendIqWithCallback ready=");
        C23651Hc r1 = r9.A02;
        sb2.append(r1.A07);
        sb2.append("  connected=");
        sb2.append(r1.A02());
        sb2.append(" type=");
        sb2.append(i);
        sb2.append(" iqId=");
        sb2.append(str);
        Log.i(sb2.toString());
        r10.BrD(str);
    }

    public static final void A05(AnonymousClass1OZ r3, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            r3.A0F((Message) entry.getValue(), (String) entry.getKey());
        }
    }

    public final C26981Ug A08(C29621ca r10, C60132nR r11, int i) {
        C60132nR A012 = A01(r11);
        C26981Ug r2 = new C26981Ug();
        C23651Hc r1 = this.A02;
        if (!r1.A07 || !r1.A02()) {
            r2.BrC(new IOException("MessageClient not ready, user not registered likely"));
            return r2;
        }
        this.A05.A00(A012, r2);
        A03(AnonymousClass2U2.A00(r10, (Boolean) null, (String) null, i, false, false), this, false);
        return r2;
    }

    public final void A0E(long j) {
        C17960vV.A01();
        C23651Hc r3 = this.A02;
        if (!r3.A02()) {
            if (this.A00 != null) {
                Log.i("app/msghandler-not-connected/connecting-now");
                C52332ak r0 = this.A00;
                if (r0 != null) {
                    C219017v r2 = r0.A00;
                    C29811cu.A01(r2.A0e, 4);
                    r2.A0c.A02();
                    C219017v.A06(r2, true, false, false);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                Log.i("app/msghandler-not-connected/too-early-to-connect");
            }
            Log.i("app/waiting-for-msghandler-to-be-connected");
            C17960vV.A01();
            if (!r3.A02.block(j)) {
                Log.i("gdrive-service/backup-map/timeout-while-waiting-for-msghandler-to-be-connected/abort");
                throw new C36811oV();
            }
        }
        Log.i("app/msghandler-connected/true");
    }
}
