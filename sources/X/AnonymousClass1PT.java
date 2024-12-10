package X;

import android.util.LruCache;
import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$logActionUnconstrained$1;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1PT  reason: invalid class name */
public class AnonymousClass1PT implements C201511a {
    public static final C18180vt A0h = new C18180vt(1, 1);
    public static final C18180vt A0i = new C18180vt(1, 50, 100, false);
    public final LruCache A00 = new LruCache(50);
    public final C19880zA A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass11S A03;
    public final C25481Oj A04;
    public final AnonymousClass1M9 A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass1CJ A07;
    public final AnonymousClass1MZ A08;
    public final AnonymousClass1NK A09;
    public final AnonymousClass1PS A0A;
    public final C18030ve A0B;
    public final AnonymousClass18K A0C;
    public final C25241Nl A0D;
    public final C25351Nw A0E;
    public final C25441Of A0F;
    public final C25281Np A0G;
    public final AnonymousClass1Nb A0H;
    public final C25271No A0I;
    public final AnonymousClass10I A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final boolean A0b;
    public final AnonymousClass12B A0c;
    public final AnonymousClass1N7 A0d;
    public final C200710s A0e;
    public final AnonymousClass00H A0f;
    public final AnonymousClass00H A0g;

    public int A06(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 7) {
            return i != 8 ? 0 : 3;
        }
        return 2;
    }

    public void A0D(AnonymousClass1E9 r8, Integer num) {
        int i;
        Integer num2 = num;
        if (num != null) {
            AnonymousClass1E9 r4 = r8;
            if (C22971Dz.A0e(r8)) {
                i = 2;
            } else if (C22971Dz.A0a(r8)) {
                i = 3;
            } else if (C22971Dz.A0N(r8)) {
                i = 4;
            } else {
                return;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                this.A0J.CGF(new C146617Py(this, valueOf, r4, num2, 1));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        return 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r0 = 27;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A01(int r3) {
        /*
            r0 = -10000(0xffffffffffffd8f0, float:NaN)
            if (r3 == r0) goto L_0x0054
            r0 = -9999(0xffffffffffffd8f1, float:NaN)
            if (r3 == r0) goto L_0x0051
            r0 = -1100(0xfffffffffffffbb4, float:NaN)
            if (r3 == r0) goto L_0x004e
            r0 = -22
            if (r3 == r0) goto L_0x004b
            r0 = -12
            if (r3 == r0) goto L_0x0048
            r2 = 32
            r1 = 29
            r0 = 6
            switch(r3) {
                case -1206: goto L_0x003c;
                case -1205: goto L_0x0059;
                case -1204: goto L_0x0037;
                case -1203: goto L_0x0032;
                case -1202: goto L_0x003f;
                case -1201: goto L_0x0042;
                case -1200: goto L_0x0045;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r3) {
                case -1011: goto L_0x0032;
                case -1010: goto L_0x0021;
                case -1009: goto L_0x0023;
                case -1008: goto L_0x0059;
                case -1007: goto L_0x0026;
                case -1006: goto L_0x0028;
                case -1005: goto L_0x002a;
                case -1004: goto L_0x0037;
                case -1003: goto L_0x002c;
                case -1002: goto L_0x003c;
                case -1001: goto L_0x002f;
                case -1000: goto L_0x0057;
                default: goto L_0x001f;
            }
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            r0 = 5
            goto L_0x0059
        L_0x0023:
            r0 = 31
            goto L_0x0059
        L_0x0026:
            r0 = 1
            goto L_0x0059
        L_0x0028:
            r0 = 2
            goto L_0x0059
        L_0x002a:
            r0 = 0
            goto L_0x0059
        L_0x002c:
            r0 = 28
            goto L_0x0059
        L_0x002f:
            r0 = 23
            goto L_0x0059
        L_0x0032:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x0037:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x003c:
            r0 = 27
            goto L_0x0059
        L_0x003f:
            r0 = 42
            goto L_0x0059
        L_0x0042:
            r0 = 24
            goto L_0x0059
        L_0x0045:
            r0 = 25
            goto L_0x0059
        L_0x0048:
            r0 = 30
            goto L_0x0059
        L_0x004b:
            r0 = 26
            goto L_0x0059
        L_0x004e:
            r0 = 11
            goto L_0x0059
        L_0x0051:
            r0 = 33
            goto L_0x0059
        L_0x0054:
            r0 = 10
            goto L_0x0059
        L_0x0057:
            r0 = 34
        L_0x0059:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.A01(int):java.lang.Integer");
    }

    public static Integer A03(AnonymousClass206 r1) {
        int i;
        if (!(r1 instanceof C442422r)) {
            return null;
        }
        if (r1 instanceof AnonymousClass231) {
            i = 1;
        } else if (r1 instanceof C444023h) {
            i = 2;
        } else if (r1 instanceof C443823f) {
            i = 4;
        } else {
            boolean z = r1 instanceof C442622t;
            i = 3;
            if (z) {
                i = 5;
            }
        }
        return Integer.valueOf(i);
    }

    private void A04(AnonymousClass2HU r7, String str, long j) {
        String obj;
        String obj2;
        String obj3;
        Integer num;
        Integer num2;
        Integer num3;
        C18030ve r4 = this.A0B;
        C18040vf r1 = C18040vf.A02;
        int A002 = C18020vd.A00(r1, r4, 1073);
        int A003 = C18020vd.A00(r1, r4, 1127);
        int A004 = C18020vd.A00(r1, r4, 1128);
        if (A002 != 0 && ((num3 = r7.A0K) == null || A002 != num3.intValue())) {
            return;
        }
        if (A003 != 0 && ((num2 = r7.A0J) == null || A003 != num2.intValue())) {
            return;
        }
        if (A004 == 0 || ((num = r7.A0I) != null && A004 == num.intValue())) {
            Integer num4 = r7.A0K;
            if (num4 == null) {
                obj = null;
            } else {
                obj = num4.toString();
            }
            Integer num5 = r7.A0J;
            if (num5 == null) {
                obj2 = null;
            } else {
                obj2 = num5.toString();
            }
            Integer num6 = r7.A0I;
            if (num6 == null) {
                obj3 = null;
            } else {
                obj3 = num6.toString();
            }
            AnonymousClass190 r2 = this.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("stage: ");
            sb.append(obj);
            sb.append("; messageType: ");
            sb.append(obj2);
            sb.append("; mediaType: ");
            sb.append(obj3);
            sb.append("; durationTime: ");
            sb.append(j);
            r2.A0G(str, sb.toString(), true);
        }
    }

    public void A07(int i, int i2) {
        if (this.A0b) {
            C25281Np r2 = this.A0G;
            if (r2.A07(i)) {
                r2.A01.A01(i, r2.A01(C25281Np.A00(i2), i, i2, 0));
                ((AnonymousClass165) r2.A02.get()).A00(i, i2);
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A08(X.C56212h5 r34) {
        /*
            r33 = this;
            r11 = r34
            X.206 r3 = r11.A06
            boolean r0 = r3 instanceof X.AnonymousClass23N
            r19 = r0
            r2 = r33
            X.11P r0 = r2.A06
            r32 = r0
            long r4 = X.AnonymousClass11P.A01(r32)
            if (r19 == 0) goto L_0x0351
            r0 = r3
            X.23N r0 = (X.AnonymousClass23N) r0
            long r0 = r0.A00
        L_0x0019:
            long r4 = r4 - r0
            X.2HV r9 = new X.2HV
            r9.<init>()
            X.1Of r0 = r2.A0F
            X.2af r0 = r0.A00
            if (r0 == 0) goto L_0x034e
            X.1Oe r0 = r0.A00
            java.lang.String r0 = r0.A03()
        L_0x002b:
            r9.A0p = r0
            int r0 = r11.A04
            r21 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r9.A0W = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r9.A0h = r0
            X.00H r0 = r2.A0S
            r31 = r0
            java.lang.Object r0 = r31.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0V = r0
            int r0 = X.C64002u3.A05(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0Y = r0
            X.1CJ r0 = r2.A07
            r30 = r0
            r12 = 1
            X.C18070vi.A0d(r0, r12)
            X.205 r0 = r3.A0v
            r29 = r0
            X.1BI r8 = r0.A00
            r0 = r30
            java.lang.Integer r0 = X.C64002u3.A07(r0, r8)
            r9.A0c = r0
            boolean r0 = r11.A0D
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0C = r0
            int r0 = r3.A01
            int r0 = r2.A06(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0O = r0
            long r4 = X.AnonymousClass11P.A01(r32)
            long r0 = r3.A0I
            long r4 = r4 - r0
            r16 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r9.A0e = r0
            X.00H r0 = r2.A0R
            java.lang.Object r1 = r0.get()
            X.2iF r1 = (X.C56922iF) r1
            java.util.Collection r0 = r11.A0A
            java.lang.String r0 = r1.A00(r0)
            r9.A0s = r0
            int r0 = r11.A02
            if (r0 <= 0) goto L_0x00b8
            long r0 = (long) r0
            r5 = 32
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b2
            r5 = r0
        L_0x00b2:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r9.A0i = r0
        L_0x00b8:
            int r5 = r11.A00
            if (r5 <= 0) goto L_0x00d4
            long r0 = (long) r5
            r6 = 32
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c4
            r6 = r0
        L_0x00c4:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r9.A0d = r0
            int r0 = X.C64002u3.A00(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0L = r0
        L_0x00d4:
            boolean r0 = r11.A0C
            r18 = r0
            r10 = 0
            if (r0 == 0) goto L_0x00fe
            r1 = 0
            r0 = r21
            if (r0 == r12) goto L_0x00e1
            r1 = 1
        L_0x00e1:
            java.lang.String r0 = "Message send result should not be OK if the failure is terminal"
            X.C17960vV.A0F(r1, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageLogging/buildMessageSend message-send-terminal-failure msgId="
            r1.append(r0)
            r0 = r29
            java.lang.String r0 = r0.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00fe:
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r18)
            r0 = r20
            r9.A0B = r0
            X.00H r0 = r2.A0Q
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            java.util.HashSet r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass1O1.A00(r1, r0)
            r9.A0r = r0
            java.lang.Integer r0 = r9.A0Y
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x012a
            X.11S r1 = r2.A03
            com.whatsapp.jid.UserJid r0 = r3.A0I()
            java.lang.Boolean r0 = A00(r1, r0)
            r9.A08 = r0
        L_0x012a:
            boolean r0 = X.C22971Dz.A0e(r8)
            if (r0 == 0) goto L_0x0149
            X.00H r0 = r2.A0O
            java.lang.Object r1 = r0.get()
            X.2mo r1 = (X.C59742mo) r1
            r0 = r8
            X.1E9 r0 = (X.AnonymousClass1E9) r0
            java.lang.String r0 = r1.A01(r0)
            int r0 = X.C64002u3.A06(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0S = r0
        L_0x0149:
            com.whatsapp.jid.UserJid r0 = r3.A0I()
            boolean r0 = r2.A0K(r8, r0, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A04 = r0
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = r3.A11(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A02 = r0
            X.1PS r0 = r2.A0A
            r28 = r0
            int r0 = r28.A00()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0n = r0
            boolean r0 = X.C22971Dz.A0d(r8)
            if (r0 == 0) goto L_0x0189
            r1 = r8
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = r28
            int r0 = r0.A01(r1)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0j = r0
        L_0x0189:
            r0 = r30
            X.1ci r5 = r0.A0A(r8)
            if (r5 == 0) goto L_0x01d0
            X.1cl r0 = r5.A0e
            int r1 = r0.disappearingMessagesInitiator
            r0 = 1
            if (r1 == 0) goto L_0x019c
            r0 = 2
            if (r1 != r0) goto L_0x019c
            r0 = 3
        L_0x019c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0M = r0
            X.0ve r4 = r2.A0B
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x01d0
            X.2lr r1 = r5.A0d
            if (r1 == 0) goto L_0x01d0
            int r0 = r1.A00
            int r0 = X.C64002u3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0Q = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x01d0
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x01ca
            r0 = 1
        L_0x01ca:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0P = r0
        L_0x01d0:
            boolean r0 = r3 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x01e7
            r0 = r3
            X.21V r0 = (X.AnonymousClass21V) r0
            java.lang.String r0 = r0.A18()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A06 = r0
        L_0x01e7:
            boolean r0 = r3 instanceof X.C438921i
            if (r0 == 0) goto L_0x01fc
            r0 = r3
            X.21i r0 = (X.C438921i) r0
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A06 = r0
        L_0x01fc:
            X.0ve r7 = r2.A0B
            r0 = 7773(0x1e5d, float:1.0892E-41)
            X.0vf r13 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r13, r7, r0)
            if (r0 == 0) goto L_0x021a
            java.lang.String r1 = X.C64002u3.A0B(r3)
            if (r1 == 0) goto L_0x021a
            X.1Nl r0 = r2.A0D
            byte[] r0 = r0.A08()
            java.lang.String r0 = X.C25241Nl.A00(r0, r1)
            r9.A0q = r0
        L_0x021a:
            boolean r0 = r3 instanceof X.C441322g
            r25 = r0
            if (r0 == 0) goto L_0x04d6
            r14 = r3
            X.22g r14 = (X.C441322g) r14
            java.lang.Integer r4 = r14.A06
            if (r4 != 0) goto L_0x0238
            r0 = 8321(0x2081, float:1.166E-41)
            boolean r0 = X.C18020vd.A05(r13, r7, r0)
            if (r0 == 0) goto L_0x0238
            X.190 r5 = r2.A02
            java.lang.String r1 = "StickerSendOrigin"
            java.lang.String r0 = "The sticker origin is null"
            r5.A0G(r1, r0, r12)
        L_0x0238:
            X.73B r0 = r14.A05
            if (r0 == 0) goto L_0x0241
            boolean r0 = r0.A03
            r1 = 1
            if (r0 != 0) goto L_0x0242
        L_0x0241:
            r1 = 0
        L_0x0242:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r9.A0F = r0
            boolean r0 = r14.A1H()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0E = r0
            X.73B r1 = r14.A05
            if (r1 == 0) goto L_0x025b
            boolean r0 = r1.A0G
            r5 = 1
            if (r0 != 0) goto L_0x025c
        L_0x025b:
            r5 = 0
        L_0x025c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r9.A0G = r0
            if (r1 != 0) goto L_0x0348
            r0 = 0
        L_0x0265:
            r9.A0b = r0
            X.2H3 r5 = new X.2H3
            r5.<init>()
            r1 = 0
            if (r4 == 0) goto L_0x0270
            r1 = 1
        L_0x0270:
            java.lang.String r0 = "If you reach this breakpoint, please add info on which screen originated this sticker send or any specific flow you took to reach here T170675310"
            X.C17960vV.A0F(r1, r0)
            r5.A0A = r4
            boolean r0 = r14.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A01 = r0
            X.73B r0 = r14.A05
            if (r0 == 0) goto L_0x0288
            boolean r1 = r0.A03
            r4 = 1
            if (r1 != 0) goto L_0x0289
        L_0x0288:
            r4 = 0
        L_0x0289:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r5.A03 = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r5.A09 = r6
            if (r0 == 0) goto L_0x029c
            boolean r0 = r0.A0G
            r1 = 1
            if (r0 != 0) goto L_0x029d
        L_0x029c:
            r1 = 0
        L_0x029d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.A04 = r0
            boolean r0 = r14.A1H()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A02 = r0
            boolean r0 = r14.A1G()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
            X.77d r4 = r14.A00
            if (r4 == 0) goto L_0x02e4
            X.73B r0 = r4.A04
            if (r0 == 0) goto L_0x0345
            java.lang.String r1 = r0.A02
        L_0x02c1:
            java.lang.String r0 = "Giphy"
            boolean r0 = X.C18070vi.A18(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A05 = r0
            X.73B r0 = r4.A04
            if (r0 == 0) goto L_0x0343
            java.lang.String r1 = r0.A02
        L_0x02d3:
            java.lang.String r0 = "Tenor"
            boolean r0 = X.C18070vi.A18(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A07 = r0
            X.18K r0 = r2.A0C
            X.C137436vS.A00(r7, r0, r4, r12)
        L_0x02e4:
            X.73B r0 = r14.A05
            if (r0 != 0) goto L_0x033e
            r0 = 0
        L_0x02e9:
            r5.A08 = r0
            boolean r0 = r14.A1I()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A06 = r0
            boolean r0 = r14.A1G()
            if (r0 == 0) goto L_0x031b
            X.2FN r1 = new X.2FN
            r1.<init>()
            r1.A01 = r6
            java.lang.Integer r0 = r14.A06
            r1.A02 = r0
            r0 = 7186(0x1c12, float:1.007E-41)
            boolean r0 = X.C18020vd.A05(r13, r7, r0)
            if (r0 == 0) goto L_0x0316
            boolean r0 = r14.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
        L_0x0316:
            X.18K r0 = r2.A0C
            r0.CC7(r1)
        L_0x031b:
            X.18K r0 = r2.A0C
            r27 = r0
            r0.CC7(r5)
            X.1No r1 = r2.A0I
            java.lang.Integer r0 = r14.A06
            r24 = r0
            X.73B r0 = r14.A05
            if (r0 == 0) goto L_0x0332
            boolean r0 = r0.A03
            r23 = 1
            if (r0 != 0) goto L_0x0334
        L_0x0332:
            r23 = 0
        L_0x0334:
            boolean r0 = r14.A03
            r22 = r0
            X.1Nm r4 = r1.A01
            java.lang.Object r0 = r4.A04
            monitor-enter(r0)
            goto L_0x0355
        L_0x033e:
            java.lang.Integer r0 = r0.A03()
            goto L_0x02e9
        L_0x0343:
            r1 = 0
            goto L_0x02d3
        L_0x0345:
            r1 = 0
            goto L_0x02c1
        L_0x0348:
            java.lang.Integer r0 = r1.A03()
            goto L_0x0265
        L_0x034e:
            r0 = 0
            goto L_0x002b
        L_0x0351:
            long r0 = r3.A0I
            goto L_0x0019
        L_0x0355:
            X.0vl r1 = r4.A05     // Catch:{ all -> 0x0d4f }
            r26 = r1
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r15 = "sticker_send_count"
            int r1 = r1.getInt(r15, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r5 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r5.putInt(r15, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
            monitor-exit(r0)
            if (r24 == 0) goto L_0x037d
            int r1 = r24.intValue()
            switch(r1) {
                case 1: goto L_0x040f;
                case 2: goto L_0x03f3;
                case 3: goto L_0x03d7;
                case 4: goto L_0x03bb;
                case 5: goto L_0x039f;
                case 6: goto L_0x0382;
                default: goto L_0x037d;
            }
        L_0x037d:
            if (r22 == 0) goto L_0x0448
            monitor-enter(r0)
            goto L_0x042d
        L_0x0382:
            monitor-enter(r0)
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r15 = "sticker_send_from_pack_count"
            int r1 = r1.getInt(r15, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r5 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r5.putInt(r15, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
            goto L_0x042a
        L_0x039f:
            monitor-enter(r0)
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r15 = "sticker_send_from_emotion_count"
            int r1 = r1.getInt(r15, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r5 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r5.putInt(r15, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
            goto L_0x042a
        L_0x03bb:
            monitor-enter(r0)
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r15 = "sticker_send_from_favorites_count"
            int r1 = r1.getInt(r15, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r5 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r5.putInt(r15, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
            goto L_0x042a
        L_0x03d7:
            monitor-enter(r0)
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r15 = "sticker_send_from_recent_count"
            int r1 = r1.getInt(r15, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r5 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r5.putInt(r15, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
            goto L_0x042a
        L_0x03f3:
            monitor-enter(r0)
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r15 = "sticker_send_from_forward_count"
            int r1 = r1.getInt(r15, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r5 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r5.putInt(r15, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
            goto L_0x042a
        L_0x040f:
            monitor-enter(r0)
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r15 = "sticker_send_from_search_count"
            int r1 = r1.getInt(r15, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r5 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r5.putInt(r15, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
        L_0x042a:
            monitor-exit(r0)
            goto L_0x037d
        L_0x042d:
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r15 = "sticker_send_animated_count"
            int r1 = r1.getInt(r15, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r5 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r5.putInt(r15, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
            monitor-exit(r0)
        L_0x0448:
            if (r23 == 0) goto L_0x0466
            monitor-enter(r0)
            java.lang.Object r1 = r26.getValue()     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            java.lang.String r5 = "sticker_send_first_party_count"
            int r1 = r1.getInt(r5, r10)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r4 = X.C25251Nm.A00(r4)     // Catch:{ all -> 0x0d4f }
            int r1 = r1 + 1
            android.content.SharedPreferences$Editor r1 = r4.putInt(r5, r1)     // Catch:{ all -> 0x0d4f }
            r1.apply()     // Catch:{ all -> 0x0d4f }
            monitor-exit(r0)
        L_0x0466:
            boolean r0 = r14.A1H()
            if (r0 == 0) goto L_0x04d6
            X.2Gd r1 = new X.2Gd
            r1.<init>()
            r1.A04 = r6
            java.lang.Integer r0 = r14.A06
            r1.A05 = r0
            boolean r0 = r14.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            X.73B r4 = r14.A05
            if (r4 == 0) goto L_0x048c
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x048c
            boolean r0 = r4.A0E
            r4 = 1
            if (r0 != 0) goto L_0x048d
        L_0x048c:
            r4 = 0
        L_0x048d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A03 = r0
            r0 = 4501(0x1195, float:6.307E-42)
            boolean r0 = X.C18020vd.A05(r13, r7, r0)
            if (r0 == 0) goto L_0x04af
            X.73B r4 = r14.A05
            if (r4 == 0) goto L_0x04a8
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x04a8
            boolean r0 = r4.A0C
            r4 = 1
            if (r0 != 0) goto L_0x04a9
        L_0x04a8:
            r4 = 0
        L_0x04a9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A01 = r0
        L_0x04af:
            X.73B r4 = r14.A05
            if (r4 == 0) goto L_0x04bc
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x04bc
            boolean r0 = r4.A0D
            r5 = 1
            if (r0 != 0) goto L_0x04bd
        L_0x04bc:
            r5 = 0
        L_0x04bd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A02 = r0
            if (r4 == 0) goto L_0x04d1
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x04cb
            r1.A07 = r0
        L_0x04cb:
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x04d1
            r1.A06 = r0
        L_0x04d1:
            r0 = r27
            r0.CC7(r1)
        L_0x04d6:
            r4 = 0
            if (r19 == 0) goto L_0x07fc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r9.A0A = r0
            long r14 = X.AnonymousClass11P.A01(r32)
            long r0 = r3.A0I
            long r14 = r14 - r0
            long r14 = r14 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r9.A0l = r0
            boolean r0 = r3 instanceof X.AnonymousClass23O
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r9.A0a = r6
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0515
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageLogging/buildMessageSend Failed to log revoke duration; type="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r9.A0l = r0
        L_0x0515:
            r0 = 1
            boolean r0 = r3.A11(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A07 = r0
            int r6 = r11.A03
            if (r6 <= r12) goto L_0x052e
            int r0 = r6 - r12
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0k = r0
        L_0x052e:
            int r0 = r3.A05
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0f = r0
            int r0 = r3.A0u
            r24 = r0
            boolean r0 = X.AnonymousClass25A.A0J(r24)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A05 = r0
            boolean r0 = r11.A0B
            r22 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r9.A00 = r0
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x0568
            boolean r0 = r3 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x07db
            r0 = r3
            X.210 r0 = (X.AnonymousClass210) r0
            byte[] r0 = r0.A1A()
            if (r0 == 0) goto L_0x0568
            int r0 = r0.length
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x0566:
            r9.A0H = r0
        L_0x0568:
            boolean r0 = r3 instanceof X.C442522s
            if (r0 != 0) goto L_0x0573
            boolean r1 = X.C83574Fq.A00(r3)
            r0 = 0
            if (r1 == 0) goto L_0x0574
        L_0x0573:
            r0 = 1
        L_0x0574:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A09 = r0
            r1 = 103(0x67, float:1.44E-43)
            r0 = r24
            if (r0 == r1) goto L_0x0587
            X.206 r1 = r3.A0K()
            r0 = 1
            if (r1 != 0) goto L_0x0588
        L_0x0587:
            r0 = 0
        L_0x0588:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A03 = r0
            int r0 = r11.A01
            if (r0 <= 0) goto L_0x05a5
            double r0 = (double) r0
            r14 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r0 = r0 / r14
            double r0 = java.lang.Math.ceil(r0)
            long r14 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r9.A0g = r0
            java.lang.Integer r0 = r11.A09
            r9.A0U = r0
        L_0x05a5:
            X.00H r0 = r2.A0W
            r23 = r0
            java.lang.Object r12 = r23.get()
            X.2vE r12 = (X.C64722vE) r12
            long r0 = r12.A00
            long r14 = r12.A01
            long r0 = r0 - r14
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 < 0) goto L_0x05dd
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x05dd
            java.lang.Object r12 = r23.get()
            X.2vE r12 = (X.C64722vE) r12
            long r0 = r12.A00
            long r14 = r12.A01
            long r0 = r0 - r14
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x05cd
            r0 = 0
        L_0x05cd:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0m = r0
            java.lang.Object r0 = r23.get()
            X.2vE r0 = (X.C64722vE) r0
            r0.A01 = r4
            r0.A00 = r4
        L_0x05dd:
            java.lang.Integer r0 = r11.A07
            r9.A0N = r0
            X.00H r1 = r2.A0K
            java.lang.Object r0 = r1.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            java.lang.Integer r0 = r0.A04(r3)
            r9.A0I = r0
            if (r25 == 0) goto L_0x05fb
            r0 = r3
            X.22g r0 = (X.C441322g) r0
            boolean r0 = r0.A1G()
            if (r0 == 0) goto L_0x05fb
            r10 = 1
        L_0x05fb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r9.A0D = r0
            java.lang.Object r0 = r1.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            int r0 = r0.A01(r8)
            if (r0 == 0) goto L_0x0613
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0J = r0
        L_0x0613:
            int r0 = r11.A05
            if (r0 == 0) goto L_0x061e
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0o = r0
        L_0x061e:
            X.11S r12 = r2.A03
            java.lang.String r0 = r12.A0C()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A01 = r0
            boolean r0 = X.C22971Dz.A0d(r8)
            if (r0 == 0) goto L_0x0653
            X.00H r4 = r2.A0Z
            java.lang.Object r0 = r4.get()
            X.2l2 r0 = (X.C58652l2) r0
            r1 = r8
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Integer r0 = r0.A01(r1)
            r9.A0Z = r0
            java.lang.Object r0 = r4.get()
            X.2l2 r0 = (X.C58652l2) r0
            java.lang.Integer r0 = r0.A00(r1)
            r9.A0K = r0
        L_0x0653:
            java.lang.Integer r0 = r11.A08
            r9.A0T = r0
            java.lang.Integer r0 = A03(r3)
            r9.A0R = r0
            java.lang.Integer r0 = r3.A14
            if (r0 == 0) goto L_0x0676
            int r1 = r0.intValue()
            r0 = 29
            r4 = 2
            if (r1 == r0) goto L_0x0670
            r0 = 35
            r4 = 3
            if (r1 == r0) goto L_0x0670
            r4 = 1
        L_0x0670:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r9.A0X = r0
        L_0x0676:
            X.00H r0 = r2.A0P
            java.lang.Object r10 = r0.get()
            X.7Jm r10 = (X.C144997Jm) r10
            boolean r0 = X.AnonymousClass25A.A0t(r3)
            if (r0 == 0) goto L_0x0690
            X.10I r4 = r10.A09
            r1 = 37
            X.7Pj r0 = new X.7Pj
            r0.<init>(r10, r3, r1)
            r4.CGF(r0)
        L_0x0690:
            X.0ve r5 = r10.A04
            r0 = 2430(0x97e, float:3.405E-42)
            boolean r0 = X.C18020vd.A05(r13, r5, r0)
            if (r0 == 0) goto L_0x06df
            boolean r0 = r3 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x06da
            X.1gU r11 = r10.A07
            java.lang.String r0 = r3.A0P()
            java.lang.String r0 = r11.A02(r0)
            if (r0 == 0) goto L_0x06da
            r4 = r3
            X.210 r4 = (X.AnonymousClass210) r4
            if (r4 == 0) goto L_0x06da
            X.2Fh r1 = new X.2Fh
            r1.<init>()
            int r0 = X.C64002u3.A05(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            java.lang.Integer r0 = X.C144997Jm.A01(r10, r4)
            r1.A00 = r0
            X.118 r0 = r10.A01
            android.content.Context r0 = r0.A00
            X.C18070vi.A0X(r0)
            int r0 = X.C144997Jm.A00(r0, r5, r11, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            X.18K r0 = r10.A05
            r0.CC7(r1)
        L_0x06da:
            r0 = 9213(0x23fd, float:1.291E-41)
            r5.A0N(r0)
        L_0x06df:
            X.18K r4 = r2.A0C
            r4.CC7(r9)
            r0 = 1
            boolean r0 = r3.A11(r0)
            if (r0 == 0) goto L_0x0859
            X.2HC r5 = new X.2HC
            r5.<init>()
            java.lang.Object r0 = r31.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A09 = r0
            int r0 = X.C64002u3.A05(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0A = r0
            r0 = r30
            java.lang.Integer r0 = X.C64002u3.A07(r0, r8)
            r5.A0B = r0
            boolean r0 = X.AnonymousClass25A.A0m(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A01 = r0
            int r11 = r3.A06
            r15 = 0
            r1 = 1
            r10 = 2
            r0 = 0
            if (r11 < r10) goto L_0x0726
            r0 = 1
        L_0x0726:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
            r0 = 3
            r14 = 0
            if (r11 < r0) goto L_0x0731
            r14 = 1
        L_0x0731:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r5.A03 = r0
            r0 = 4
            if (r11 < r0) goto L_0x073b
            r15 = 1
        L_0x073b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r5.A04 = r0
            java.lang.Integer r0 = r5.A0A
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0753
            com.whatsapp.jid.UserJid r0 = r3.A0I()
            java.lang.Boolean r0 = A00(r12, r0)
            r5.A02 = r0
        L_0x0753:
            int r0 = r28.A00()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0E = r0
            boolean r0 = X.C22971Dz.A0d(r8)
            if (r0 == 0) goto L_0x0774
            r1 = r8
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = r28
            int r0 = r0.A01(r1)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0D = r0
        L_0x0774:
            r0 = r30
            X.1ci r1 = r0.A0A(r8)
            if (r1 == 0) goto L_0x07b7
            X.1cl r0 = r1.A0e
            int r0 = r0.disappearingMessagesInitiator
            r11 = 1
            if (r0 == 0) goto L_0x0787
            r11 = 2
            if (r0 != r10) goto L_0x0787
            r11 = 3
        L_0x0787:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r5.A05 = r0
            r0 = 5309(0x14bd, float:7.44E-42)
            boolean r0 = X.C18020vd.A05(r13, r7, r0)
            if (r0 == 0) goto L_0x07b7
            X.2lr r1 = r1.A0d
            if (r1 == 0) goto L_0x07b7
            int r0 = r1.A00
            int r0 = X.C64002u3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A07 = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x07b7
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x07b1
            r0 = 1
        L_0x07b1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A06 = r0
        L_0x07b7:
            r0 = 5431(0x1537, float:7.61E-42)
            boolean r0 = X.C18020vd.A05(r13, r7, r0)
            if (r0 == 0) goto L_0x084b
            r10 = 0
            X.36g r11 = X.AnonymousClass2UY.A00(r3)
            java.lang.Long r0 = r3.A0V
            if (r0 == 0) goto L_0x08ba
            X.00H r0 = r2.A0Y
            java.lang.Object r12 = r0.get()
            X.2qT r12 = (X.C61902qT) r12
            java.lang.Long r0 = r3.A0V
            long r0 = r0.longValue()
            android.database.Cursor r12 = X.C61902qT.A00(r12, r0)
            goto L_0x0804
        L_0x07db:
            X.1Nw r1 = r2.A0E
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r3, r0)
            r1.Bhl(r0)
            X.36u r12 = r3.A0O()
            if (r12 == 0) goto L_0x0568
            monitor-enter(r12)
            byte[] r0 = r12.A02     // Catch:{ all -> 0x0d76 }
            if (r0 == 0) goto L_0x07f8
            int r0 = r0.length     // Catch:{ all -> 0x0d76 }
            double r0 = (double) r0     // Catch:{ all -> 0x0d76 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0d76 }
            goto L_0x07f9
        L_0x07f8:
            r0 = 0
        L_0x07f9:
            monitor-exit(r12)
            goto L_0x0566
        L_0x07fc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r9.A0A = r0
            goto L_0x0515
        L_0x0804:
            java.lang.String r0 = "message_template_id"
            int r1 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x081f }
            java.lang.String r0 = "message_hsm_tag"
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x081f }
            boolean r14 = r12.moveToLast()     // Catch:{ all -> 0x081f }
            if (r14 == 0) goto L_0x0826
            r12.getString(r1)     // Catch:{ all -> 0x081f }
            java.lang.String r10 = r12.getString(r0)     // Catch:{ all -> 0x081f }
            r0 = 1
            goto L_0x0827
        L_0x081f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0821 }
        L_0x0821:
            r1 = move-exception
            X.CDX.A00(r12, r0)
            throw r1
        L_0x0826:
            r0 = 0
        L_0x0827:
            r12.close()
            if (r8 == 0) goto L_0x08ba
            if (r11 == 0) goto L_0x08ba
            if (r0 == 0) goto L_0x08ba
            X.1M9 r1 = r2.A05
            com.whatsapp.jid.UserJid r0 = r11.A01
            X.1E7 r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x08ba
            X.1yf r0 = r0.A0G
            if (r0 == 0) goto L_0x08ba
            boolean r1 = r0.A03()
            if (r1 == 0) goto L_0x089d
            r1 = 4
        L_0x0845:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A08 = r0
        L_0x084b:
            int r0 = r3.A05
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0C = r0
            X.0vt r0 = X.C18180vt.A06
            r4.CC6(r5, r0)
        L_0x0859:
            r1 = 1
            r0 = r21
            if (r0 != r1) goto L_0x08bc
            if (r22 != 0) goto L_0x08bc
            if (r19 != 0) goto L_0x08bc
            r0 = 2097152(0x200000, double:1.0361308E-317)
            boolean r0 = r3.A11(r0)
            if (r0 != 0) goto L_0x08bc
            boolean r0 = X.C22971Dz.A0O(r8)
            if (r0 == 0) goto L_0x08bc
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1E9 r0 = X.C50242Tr.A00(r8)
            if (r0 == 0) goto L_0x08bc
            X.00H r0 = r2.A0M
            java.lang.Object r10 = r0.get()
            X.2sT r10 = (X.C63082sT) r10
            int r0 = r3.A0A
            long r0 = (long) r0
            r5 = 7
            X.C63082sT.A01(r10, r5, r0)
            X.0zA r1 = r2.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x08bc
            r1.A03()
            android.os.Parcelable$Creator r0 = X.C47712Jo.CREATOR
            java.lang.String r0 = "logBroadcastSmbJourneyBroadcastMessageSendSuccessAction"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x089d:
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x08ba
            if (r10 == 0) goto L_0x08b6
            java.lang.String r0 = "UTILITY"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x08b8
            java.lang.String r0 = "MARKETING"
            boolean r0 = r10.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0845
        L_0x08b6:
            r1 = 3
            goto L_0x0845
        L_0x08b8:
            r1 = 2
            goto L_0x0845
        L_0x08ba:
            r1 = 0
            goto L_0x0845
        L_0x08bc:
            java.lang.Long r0 = r9.A0h
            if (r0 == 0) goto L_0x0916
            java.lang.Long r0 = r9.A0k
            if (r0 != 0) goto L_0x0916
            java.lang.Integer r0 = r9.A0W
            if (r0 == 0) goto L_0x0916
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x0916
            java.lang.Boolean r0 = r9.A07
            if (r0 == 0) goto L_0x0916
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0916
            java.lang.Integer r0 = r9.A0Y
            if (r0 == 0) goto L_0x0916
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0916
            java.lang.Integer r0 = r9.A0V
            if (r0 == 0) goto L_0x0916
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0916
            r0 = 1625(0x659, float:2.277E-42)
            int r0 = X.C18020vd.A00(r13, r7, r0)
            if (r0 <= 0) goto L_0x0916
            java.lang.Long r1 = r9.A0h
            long r10 = r1.longValue()
            long r0 = (long) r0
            int r5 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0916
            X.2FR r7 = new X.2FR
            r7.<init>()
            java.lang.String r5 = "message_send"
            r7.A02 = r5
            java.lang.Long r5 = r9.A0h
            r7.A00 = r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.A01 = r0
            r4.CC4(r7)
        L_0x0916:
            if (r19 != 0) goto L_0x0c8c
            r0 = 131072(0x20000, double:6.47582E-319)
            boolean r0 = r3.A11(r0)
            if (r0 != 0) goto L_0x0c96
        L_0x0921:
            boolean r0 = r3 instanceof X.AnonymousClass22C
            if (r0 == 0) goto L_0x09cd
            r9 = r3
            X.212 r9 = (X.AnonymousClass212) r9
            X.00H r0 = r2.A0N
            java.lang.Object r4 = r0.get()
            X.1W6 r4 = (X.AnonymousClass1W6) r4
            long r0 = r9.A02
            X.1W2 r4 = r4.A01
            X.206 r7 = r4.A03(r0)
            X.00H r0 = r2.A0T
            java.lang.Object r5 = r0.get()
            X.2px r5 = (X.C61602px) r5
            r6 = 1
            boolean r0 = r9 instanceof X.AnonymousClass22C
            if (r0 == 0) goto L_0x09cd
            X.2GZ r4 = new X.2GZ
            r4.<init>()
            r1 = r9
            X.22C r1 = (X.AnonymousClass22C) r1
            int r10 = r1.A00
            r12 = 2
            r11 = 1
            r0 = 2
            if (r10 != r6) goto L_0x0955
            r0 = 1
        L_0x0955:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A05 = r0
            X.205 r0 = r9.A0v
            X.1BI r10 = r0.A00
            r9 = 0
            if (r10 == 0) goto L_0x0997
            boolean r0 = X.C22971Dz.A0e(r10)
            if (r0 == 0) goto L_0x0c84
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r4.A00 = r0
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r10 = X.C42941yz.A00(r10)
            if (r10 == 0) goto L_0x0997
            X.1PU r0 = r5.A02
            int r0 = r0.A00(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A03 = r0
            X.1MZ r9 = r5.A00
            boolean r0 = r9.A0J(r10)
            if (r0 == 0) goto L_0x0997
            boolean r0 = r9.A0K(r10)
            if (r0 == 0) goto L_0x0991
            r12 = 1
        L_0x0991:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r4.A02 = r0
        L_0x0997:
            if (r7 == 0) goto L_0x0c81
            X.00H r0 = r5.A03
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r7)
        L_0x09a5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A04 = r0
            int r0 = r1.A17()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A06 = r0
            if (r7 == 0) goto L_0x0c7e
            X.205 r0 = r7.A0v
            if (r0 == 0) goto L_0x0c7e
            boolean r0 = r0.A02
            if (r0 != r6) goto L_0x0c7e
        L_0x09c0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r4.A01 = r0
            X.18K r1 = r5.A01
            X.0vt r0 = X.C61602px.A04
            r1.CC6(r4, r0)
        L_0x09cd:
            X.00H r0 = r2.A0L
            java.lang.Object r1 = r0.get()
            X.34Z r1 = (X.AnonymousClass34Z) r1
            X.1PW r9 = r1.A00
            int r0 = r9.A01(r8)
            if (r0 == 0) goto L_0x0a93
            r5 = 1
            r0 = r21
            if (r0 == r5) goto L_0x09e3
            r5 = 0
        L_0x09e3:
            X.1UD r10 = r1.A02
            X.0ve r6 = r10.A00
            X.0vf r4 = X.C18040vf.A01
            r0 = 10254(0x280e, float:1.4369E-41)
            int r7 = X.C18020vd.A00(r4, r6, r0)
            if (r7 == 0) goto L_0x09f4
            r0 = 2
            if (r7 != r0) goto L_0x0a50
        L_0x09f4:
            if (r5 == 0) goto L_0x0a50
            X.2Hi r7 = new X.2Hi
            r7.<init>()
            r0 = r29
            java.lang.String r0 = r0.A01
            r7.A08 = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A01 = r0
            int r0 = X.C64002u3.A05(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A05 = r0
            X.00H r0 = r1.A07
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.A04 = r0
            X.11P r0 = r1.A03
            long r11 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r7.A07 = r0
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x0c7b
            java.lang.Integer r0 = r9.A04(r3)
        L_0x0a3a:
            r7.A00 = r0
            int r9 = r9.A01(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r7.A03 = r0
            if (r0 == 0) goto L_0x0c74
            r0 = 1
            if (r9 != r0) goto L_0x0c74
            X.18K r0 = r1.A05
            r0.CC4(r7)
        L_0x0a50:
            r0 = 10254(0x280e, float:1.4369E-41)
            int r4 = X.C18020vd.A00(r4, r6, r0)
            r0 = 1
            if (r4 == r0) goto L_0x0a5c
            r0 = 2
            if (r4 != r0) goto L_0x0a93
        L_0x0a5c:
            if (r5 == 0) goto L_0x0c53
            java.util.concurrent.ConcurrentHashMap r4 = X.AnonymousClass34Z.A08
            r0 = r29
            java.lang.String r0 = r0.A01
            java.lang.Object r0 = r4.get(r0)
            X.2g0 r0 = (X.C55562g0) r0
            if (r0 == 0) goto L_0x0a93
            X.37l r6 = r1.A01
            int r5 = r0.A05
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0c4f
            java.lang.String r0 = "PLUGIN_"
        L_0x0a76:
            java.lang.String r4 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "REQUEST_RECV"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 0
            r0 = 261881857(0xf9c0001, float:1.5382789E-29)
            r6.markerPoint(r0, r5, r4, r1)
        L_0x0a93:
            boolean r0 = X.C22971Dz.A0a(r8)
            if (r0 == 0) goto L_0x0ad0
            r1 = 6
            r0 = r21
            if (r0 == r1) goto L_0x0ad0
            r1 = 16
            if (r0 == r1) goto L_0x0ad0
            X.00H r0 = r2.A0X
            java.lang.Object r5 = r0.get()
            X.1hg r5 = (X.C32741hg) r5
            int r0 = r3.A0B
            long r0 = (long) r0
            r6 = 1
            r4 = r21
            if (r4 == r6) goto L_0x0ab5
            r10 = 0
            if (r18 == 0) goto L_0x0ab6
        L_0x0ab5:
            r10 = 1
        L_0x0ab6:
            java.lang.String r9 = "error_unknown"
            switch(r21) {
                case 1: goto L_0x0c19;
                case 2: goto L_0x0abb;
                case 3: goto L_0x0abb;
                case 4: goto L_0x0c1e;
                case 5: goto L_0x0c22;
                case 6: goto L_0x0abb;
                case 7: goto L_0x0c26;
                case 8: goto L_0x0c2a;
                case 9: goto L_0x0c2e;
                case 10: goto L_0x0c32;
                case 11: goto L_0x0c36;
                case 12: goto L_0x0c3a;
                case 13: goto L_0x0c3e;
                case 14: goto L_0x0c42;
                case 15: goto L_0x0c47;
                case 16: goto L_0x0abb;
                case 17: goto L_0x0c4b;
                default: goto L_0x0abb;
            }
        L_0x0abb:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.A04
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r5.A05
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r4 = r5
            r5 = r3
            r4.A0D(r5, r6, r7, r8, r9, r10)
        L_0x0ad0:
            X.00H r0 = r2.A0X
            java.lang.Object r5 = r0.get()
            X.1hg r5 = (X.C32741hg) r5
            X.206 r6 = r3.A0K()
            r1 = 103(0x67, float:1.44E-43)
            r0 = r24
            if (r0 == r1) goto L_0x0b3f
            if (r6 == 0) goto L_0x0b3f
            X.205 r4 = r6.A0v
            X.1BI r0 = r4.A00
            boolean r0 = X.C22971Dz.A0a(r0)
            if (r0 == 0) goto L_0x0b3f
            r1 = 1
            r8 = 3
            r0 = r21
            if (r0 != r1) goto L_0x0af5
            r8 = 1
        L_0x0af5:
            X.00H r0 = r5.A0I
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r3)
            int r9 = X.C32741hg.A00(r3, r5, r0)
            r7 = 0
            if (r8 != r1) goto L_0x0b34
            X.2gt r1 = r5.A00
            if (r1 == 0) goto L_0x0b12
            int r0 = r1.A02
            int r0 = r0 + 1
            r1.A02 = r0
        L_0x0b12:
            X.71S r0 = r5.A01
            if (r0 == 0) goto L_0x0b34
            java.util.Map r1 = r0.A0D
            com.whatsapp.jid.UserJid r0 = X.C60562oE.A00(r6)
            java.lang.Object r0 = r1.get(r0)
            X.2gk r0 = (X.C56012gk) r0
            if (r0 == 0) goto L_0x0b34
            java.util.Map r0 = r0.A08
            java.lang.Object r1 = r0.get(r4)
            X.6xZ r1 = (X.C138716xZ) r1
            if (r1 == 0) goto L_0x0b34
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
        L_0x0b34:
            X.10I r0 = r5.A0F
            r10 = 4
            X.7Qh r4 = new X.7Qh
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.CGF(r4)
        L_0x0b3f:
            boolean r0 = r3 instanceof X.C440922c
            if (r0 == 0) goto L_0x0b71
            X.206 r0 = r3.A0K()
            boolean r0 = r0 instanceof X.C440922c
            if (r0 == 0) goto L_0x0b71
            X.00H r0 = r2.A0U
            java.lang.Object r0 = r0.get()
            X.7Jk r0 = (X.C144977Jk) r0
            android.content.SharedPreferences$Editor r7 = X.C144977Jk.A00(r0)
            X.0vl r0 = r0.A01
            java.lang.Object r4 = r0.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r6 = "ptv_reply_count"
            r0 = 0
            long r4 = r4.getLong(r6, r0)
            r0 = 1
            long r4 = r4 + r0
            android.content.SharedPreferences$Editor r0 = r7.putLong(r6, r4)
            r0.apply()
        L_0x0b71:
            java.lang.String r1 = r3.A0P()
            boolean r0 = r3 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0bd8
            if (r1 == 0) goto L_0x0bd8
            boolean r0 = X.AnonymousClass72X.A02(r1)
            if (r0 == 0) goto L_0x0bd8
            X.1Oj r5 = r2.A04
            X.0ve r4 = r5.A02
            r0 = 9669(0x25c5, float:1.3549E-41)
            boolean r0 = X.C18020vd.A05(r13, r4, r0)
            if (r0 == 0) goto L_0x0bd8
            X.1Oh r1 = r5.A03
            java.lang.String r0 = r3.A0P()
            boolean r1 = X.C26180Cu0.A01(r4, r1, r0)
            X.1Og r6 = r5.A00
            android.content.SharedPreferences r0 = X.C25451Og.A00(r6)
            android.content.SharedPreferences$Editor r4 = r0.edit()
            android.content.SharedPreferences r0 = X.C25451Og.A00(r6)
            if (r1 == 0) goto L_0x0c15
            java.lang.String r1 = "animated_emoji_send_count"
        L_0x0ba9:
            r5 = 0
            int r0 = r0.getInt(r1, r5)
            int r0 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r4.putInt(r1, r0)
            r0.apply()
            X.206 r0 = r3.A0K()
            if (r0 == 0) goto L_0x0bd8
            android.content.SharedPreferences r0 = X.C25451Og.A00(r6)
            android.content.SharedPreferences$Editor r4 = r0.edit()
            android.content.SharedPreferences r0 = X.C25451Og.A00(r6)
            java.lang.String r1 = "emoji_reply_count"
            int r0 = r0.getInt(r1, r5)
            int r0 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r4.putInt(r1, r0)
            r0.apply()
        L_0x0bd8:
            boolean r0 = r3 instanceof X.AnonymousClass227
            if (r0 == 0) goto L_0x0d75
            X.227 r3 = (X.AnonymousClass227) r3
            if (r3 == 0) goto L_0x0d75
            X.00H r0 = r2.A0V
            java.lang.Object r0 = r0.get()
            X.CQh r0 = (X.C24934CQh) r0
            java.lang.String r5 = r3.A01
            X.0ve r3 = r0.A00
            r1 = 10724(0x29e4, float:1.5028E-41)
            boolean r1 = X.C18020vd.A05(r13, r3, r1)
            if (r1 == 0) goto L_0x0d5c
            if (r5 == 0) goto L_0x0d5c
            int r1 = r5.length()
            if (r1 == 0) goto L_0x0d5c
            boolean r1 = X.AnonymousClass72X.A02(r5)
            if (r1 == 0) goto L_0x0d5c
            X.0vl r4 = r0.A02
            java.lang.Object r3 = r4.getValue()
            X.C18070vi.A0X(r3)
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            r1 = 0
            int r3 = r3.getInt(r5, r1)
            monitor-enter(r0)
            goto L_0x0d3e
        L_0x0c15:
            java.lang.String r1 = "single_emoji_send_count"
            goto L_0x0ba9
        L_0x0c19:
            java.lang.String r9 = "success"
            goto L_0x0abb
        L_0x0c1e:
            java.lang.String r9 = "error_network"
            goto L_0x0abb
        L_0x0c22:
            java.lang.String r9 = "error_expired"
            goto L_0x0abb
        L_0x0c26:
            java.lang.String r9 = "error_upload"
            goto L_0x0abb
        L_0x0c2a:
            java.lang.String r9 = "error_backfill_usync_failed"
            goto L_0x0abb
        L_0x0c2e:
            java.lang.String r9 = "error_payload_too_big"
            goto L_0x0abb
        L_0x0c32:
            java.lang.String r9 = "error_location"
            goto L_0x0abb
        L_0x0c36:
            java.lang.String r9 = "error_invalid_message"
            goto L_0x0abb
        L_0x0c3a:
            java.lang.String r9 = "error_e2ee"
            goto L_0x0abb
        L_0x0c3e:
            java.lang.String r9 = "error_invalid_protobuf"
            goto L_0x0abb
        L_0x0c42:
            java.lang.String r9 = "server_error"
            goto L_0x0abb
        L_0x0c47:
            java.lang.String r9 = "ephemerally_expired"
            goto L_0x0abb
        L_0x0c4b:
            java.lang.String r9 = "error_client_out_of_memory"
            goto L_0x0abb
        L_0x0c4f:
            java.lang.String r0 = ""
            goto L_0x0a76
        L_0x0c53:
            java.util.concurrent.ConcurrentHashMap r7 = X.AnonymousClass34Z.A08
            r0 = r29
            java.lang.String r6 = r0.A01
            java.lang.Object r0 = r7.get(r6)
            X.2g0 r0 = (X.C55562g0) r0
            if (r0 == 0) goto L_0x0a93
            X.C18070vi.A0X(r6)
            int r5 = r0.A05
            r4 = 3
            X.37l r1 = r1.A01
            r0 = 261881857(0xf9c0001, float:1.5382789E-29)
            r1.markerEnd(r0, r5, r4)
            r7.remove(r6)
            goto L_0x0a93
        L_0x0c74:
            X.18K r0 = r1.A05
            r0.CC7(r7)
            goto L_0x0a50
        L_0x0c7b:
            r0 = 0
            goto L_0x0a3a
        L_0x0c7e:
            r11 = 0
            goto L_0x09c0
        L_0x0c81:
            r0 = 1
            goto L_0x09a5
        L_0x0c84:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r4.A00 = r0
            goto L_0x0997
        L_0x0c8c:
            int r1 = X.C64002u3.A05(r3)
            r7 = 1
            if (r1 == r7) goto L_0x0ca2
            r0 = 2
            if (r1 == r0) goto L_0x0ca2
        L_0x0c96:
            int r1 = X.C64002u3.A05(r3)
            r7 = 1
            if (r1 == r7) goto L_0x0ce2
            r0 = 2
            if (r1 == r0) goto L_0x0ce2
            goto L_0x0921
        L_0x0ca2:
            X.2GJ r5 = new X.2GJ
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A01 = r0
            boolean r0 = r3 instanceof X.AnonymousClass23O
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A02 = r0
            long r9 = X.AnonymousClass11P.A01(r32)
            long r0 = r3.A0I
            long r9 = r9 - r0
            long r9 = r9 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.A05 = r0
            if (r6 <= r7) goto L_0x0ccf
            int r0 = r6 - r7
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A03 = r0
        L_0x0ccf:
            int r0 = r3.A0B
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A04 = r0
            r0 = r20
            r5.A00 = r0
            X.0vt r0 = A0h
            r4.CC6(r5, r0)
            goto L_0x0c96
        L_0x0ce2:
            X.2Ge r5 = new X.2Ge
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A03 = r0
            int r0 = r3.A01
            int r0 = r2.A06(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            long r9 = X.AnonymousClass11P.A01(r32)
            long r0 = r3.A0I
            long r9 = r9 - r0
            long r9 = r9 / r16
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.A05 = r0
            if (r6 <= r7) goto L_0x0d12
            int r6 = r6 - r7
            long r0 = (long) r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A06 = r0
        L_0x0d12:
            int r0 = r3.A0B
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A07 = r0
            r0 = r20
            r5.A00 = r0
            java.lang.Object r0 = r31.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A02 = r0
            r0 = r30
            java.lang.Integer r0 = X.C64002u3.A07(r0, r8)
            r5.A04 = r0
            X.0vt r0 = A0h
            r4.CC6(r5, r0)
            goto L_0x0921
        L_0x0d3e:
            java.lang.Object r1 = r4.getValue()     // Catch:{ all -> 0x0d4f }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0d4f }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0d4f }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0d4f }
            goto L_0x0d52
        L_0x0d4f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0d52:
            monitor-exit(r0)
            int r0 = r3 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r5, r0)
            r0.apply()
        L_0x0d5c:
            X.00H r0 = r2.A0a
            java.lang.Object r0 = r0.get()
            X.0z4 r0 = (X.C19830z4) r0
            long r2 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "pref_last_reaction_ts"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
        L_0x0d75:
            return
        L_0x0d76:
            r1 = move-exception
            monitor-exit(r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.A08(X.2h5):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d4, code lost:
        if (r1 != 1) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        if (X.C83574Fq.A00(r11) != false) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.C198079xk r8, com.whatsapp.jid.DeviceJid r9, com.whatsapp.jid.Jid r10, X.AnonymousClass206 r11, int r12, int r13, int r14, int r15, boolean r16) {
        /*
            r7 = this;
            X.2HP r2 = new X.2HP
            r2.<init>()
            r0 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0J = r0
            int r3 = r8.A00
            r0 = 1
            if (r3 != r0) goto L_0x0139
            r0 = 0
        L_0x0013:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0017:
            r2.A06 = r0
            int r0 = r8.A01
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0133
            java.lang.Integer r0 = A01(r0)
            r2.A08 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
        L_0x0029:
            r2.A01 = r0
            java.lang.Integer r0 = X.A8F.A04(r14)
            r2.A0H = r0
            int r0 = r7.A06(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B = r0
            r0 = 0
            java.lang.Integer r0 = X.A8F.A06(r10, r0)
            r2.A07 = r0
            if (r9 == 0) goto L_0x0051
            int r0 = r9.getDevice()
            if (r0 != 0) goto L_0x0130
            r0 = 1
        L_0x004b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
        L_0x0051:
            X.205 r0 = r11.A0v
            X.1BI r4 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 == 0) goto L_0x0074
            X.00H r0 = r7.A0O
            java.lang.Object r1 = r0.get()
            X.2mo r1 = (X.C59742mo) r1
            r0 = r4
            X.1E9 r0 = (X.AnonymousClass1E9) r0
            java.lang.String r0 = r1.A01(r0)
            int r0 = X.C64002u3.A06(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0E = r0
        L_0x0074:
            long r0 = (long) r12
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0L = r0
            X.00H r0 = r7.A0S
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            X.00H r5 = r7.A0K
            java.lang.Object r0 = r5.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            java.lang.Integer r0 = r0.A04(r11)
            r2.A04 = r0
            com.whatsapp.jid.UserJid r0 = r11.A0I()
            boolean r0 = r7.A0K(r4, r0, r11)
            if (r0 == 0) goto L_0x00a6
            r6 = 1
        L_0x00a6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A02 = r0
            X.1CJ r0 = r7.A07
            X.C18070vi.A0d(r0, r3)
            java.lang.Integer r0 = X.C64002u3.A07(r0, r4)
            r2.A0I = r0
            X.0ve r6 = r7.A0B
            r1 = 12042(0x2f0a, float:1.6874E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x00dd
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 == 0) goto L_0x00dd
            X.1M9 r0 = r7.A05
            X.1E7 r0 = r0.A0E(r4)
            if (r0 == 0) goto L_0x00d6
            int r1 = r0.A03
            r0 = 2
            if (r1 == r3) goto L_0x00d7
        L_0x00d6:
            r0 = 1
        L_0x00d7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0C = r0
        L_0x00dd:
            long r0 = (long) r13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0K = r0
            boolean r0 = r11 instanceof X.C442522s
            if (r0 != 0) goto L_0x00ef
            boolean r1 = X.C83574Fq.A00(r11)
            r0 = 0
            if (r1 == 0) goto L_0x00f0
        L_0x00ef:
            r0 = 1
        L_0x00f0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            java.lang.Object r0 = r5.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            int r0 = r0.A01(r4)
            if (r0 == 0) goto L_0x0108
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
        L_0x0108:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r2.A0F = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r2.A00 = r0
            X.11S r0 = r7.A03
            java.lang.Integer r0 = X.A8F.A05(r0, r9)
            r2.A09 = r0
            java.lang.Integer r0 = A03(r11)
            r2.A0D = r0
            java.lang.Boolean r0 = r2.A01
            boolean r0 = r0.booleanValue()
            X.18K r1 = r7.A0C
            if (r0 == 0) goto L_0x0148
            r1.CC7(r2)
            return
        L_0x0130:
            r0 = 2
            goto L_0x004b
        L_0x0133:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            goto L_0x0029
        L_0x0139:
            r1 = 2
            if (r3 == r1) goto L_0x0013
            r0 = 3
            if (r3 != r0) goto L_0x0145
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0017
        L_0x0145:
            r0 = 0
            goto L_0x0017
        L_0x0148:
            X.0vt r0 = new X.0vt
            r0.<init>(r3, r3)
            r1.CC0(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.A09(X.9xk, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, X.206, int, int, int, int, boolean):void");
    }

    public void A0A(DeviceJid deviceJid, AnonymousClass206 r5, AnonymousClass205 r6, Integer num, int i, int i2) {
        int i3;
        AnonymousClass2GB r2 = new AnonymousClass2GB();
        r2.A02 = Integer.valueOf(C64002u3.A04(r6.A00));
        if (deviceJid.getDevice() == 0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        r2.A04 = Integer.valueOf(i3);
        r2.A05 = Long.valueOf((long) i);
        boolean z = false;
        if (A8F.A04(i2) != null) {
            z = true;
        }
        r2.A00 = Boolean.valueOf(z);
        r2.A03 = num;
        if (r5 != null) {
            r2.A01 = A03(r5);
        }
        this.A0C.CC7(r2);
    }

    public void A0B(DeviceJid deviceJid, AnonymousClass205 r5, int i, boolean z) {
        int i2;
        C46692Fn r2 = new C46692Fn();
        r2.A02 = Integer.valueOf(C64002u3.A04(r5.A00));
        if (deviceJid.getDevice() == 0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        r2.A01 = Integer.valueOf(i2);
        r2.A03 = Long.valueOf((long) i);
        r2.A00 = Boolean.valueOf(z);
        this.A0C.CC6(r2, C18180vt.A06);
    }

    public void A0C(DeviceJid deviceJid, C63362sw r7, int i) {
        int i2;
        int A042;
        int i3;
        AnonymousClass2GT r3 = new AnonymousClass2GT();
        AnonymousClass1BI A032 = r7.A03();
        r3.A01 = Integer.valueOf(i);
        if (deviceJid != null) {
            if (deviceJid.getDevice() == 0) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            i2 = Integer.valueOf(i3).intValue();
        } else {
            i2 = 1;
        }
        r3.A05 = Integer.valueOf(i2);
        if (r7.A0S) {
            A042 = 3;
        } else {
            A042 = C64002u3.A04(r7.A0Z);
        }
        r3.A04 = Integer.valueOf(A042);
        r3.A03 = Integer.valueOf(((C62242r5) this.A0S.get()).A02(r7));
        r3.A00 = Boolean.valueOf(A0K(A032, r7.A05(), (AnonymousClass206) null));
        int i4 = r7.A01;
        r3.A02 = Integer.valueOf(A06(i4));
        r3.A06 = A8F.A04(i4);
        this.A0C.CC0(r3, new C18180vt(1, 1), true);
    }

    public void A0E(C59752mp r7) {
        int i = r7.A00;
        if (i > 4) {
            this.A02.A0G("retry-count-too-high", String.valueOf(i), false);
            AnonymousClass2GG r4 = new AnonymousClass2GG();
            r4.A05 = Long.valueOf((long) i);
            Jid jid = r7.A04;
            if (jid == null) {
                jid = r7.A02;
            }
            r4.A04 = Integer.valueOf(C64002u3.A04(jid));
            AnonymousClass11S r2 = this.A03;
            Jid jid2 = r7.A03;
            if (jid2 == null) {
                jid2 = r7.A02;
            }
            r4.A01 = A8F.A05(r2, DeviceJid.Companion.A02(jid2));
            C173578vJ r1 = (C173578vJ) AnonymousClass1N7.A00(this.A0d, 0, r7.A01);
            if (r1 != null) {
                r4.A03 = Integer.valueOf(r1.A00);
                r4.A02 = r1.A02;
            }
            this.A0J.CGF(new AnonymousClass7R0(this, r7, r4, 41));
        }
    }

    public void A0F(AnonymousClass206 r6, Integer num, int i) {
        Long l;
        AnonymousClass2HD r2 = new AnonymousClass2HD();
        AnonymousClass1BI r3 = r6.A0v.A00;
        r2.A0C = C64002u3.A07(this.A07, r3);
        r2.A0A = Integer.valueOf(((C62242r5) this.A0S.get()).A01(r6));
        r2.A09 = Integer.valueOf(i);
        AnonymousClass1BI A0H2 = r6.A0H();
        r2.A04 = A8F.A06(r3, A0H2);
        r2.A06 = A8F.A05(this.A03, DeviceJid.Companion.A02(A0H2));
        r2.A0E = Long.valueOf((long) r6.A0B);
        Integer num2 = r6.A0R;
        boolean z = false;
        if (num2 != null) {
            z = true;
        }
        r2.A01 = Boolean.valueOf(z);
        if (num2 != null) {
            l = Long.valueOf(num2.longValue());
        } else {
            l = null;
        }
        r2.A0D = l;
        r2.A0B = A8F.A04(r6.A01);
        AnonymousClass00H r1 = this.A0K;
        r2.A02 = ((AnonymousClass1PW) r1.get()).A04(r6);
        r2.A07 = A03(r6);
        if (num != null) {
            r2.A05 = num;
        }
        int A012 = ((AnonymousClass1PW) r1.get()).A01(r3);
        if (A012 != 0) {
            r2.A03 = Integer.valueOf(A012);
        }
        r2.A00 = Boolean.valueOf(A0K(r3, r6.A0I(), r6));
        this.A0C.CC4(r2);
    }

    public void A0G(AnonymousClass206 r33, Integer num, Collection collection, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Integer A042;
        Integer num2;
        int i7 = i;
        if (i7 == 6) {
            C25441Of r5 = this.A0F;
            C91244fN r4 = new C91244fN(2);
            AnonymousClass1OX r3 = r5.A08;
            C30451dy.A02(AnonymousClass00R.A00, r5.A07, new MessagingFunnelLoggerImpl$logActionUnconstrained$1(r4, r5, (C30391dr) null), r3);
        }
        int i8 = i6;
        int i9 = i4;
        int i10 = i3;
        boolean z6 = z3;
        int i11 = i2;
        AnonymousClass206 r11 = r33;
        long j4 = j3;
        Collection collection2 = collection;
        boolean z7 = z;
        boolean z8 = z2;
        int i12 = i5;
        A05(this, r11, collection2, i7, i11, i10, i9, i12, 0, 0, i8, j, j2, j4, z7, z8, z6, z4, z5);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == -1 || intValue == 1) {
                AnonymousClass205 r32 = r11.A0v;
                AnonymousClass1BI r8 = r32.A00;
                if (C42701yb.A01(r8)) {
                    AnonymousClass34Z r7 = (AnonymousClass34Z) this.A0L.get();
                    AnonymousClass1PW r52 = r7.A00;
                    if (r52.A01(r8) != 0) {
                        AnonymousClass1UD r6 = r7.A02;
                        C18030ve r42 = r6.A00;
                        C18040vf r2 = C18040vf.A01;
                        int A002 = C18020vd.A00(r2, r42, 10254);
                        if (A002 == 0 || A002 == 2) {
                            C47162Hi r9 = new C47162Hi();
                            r9.A08 = r32.A01;
                            r9.A01 = 1;
                            r9.A05 = Integer.valueOf(C64002u3.A05(r11));
                            r9.A04 = Integer.valueOf(((C62242r5) r7.A07.get()).A01(r11));
                            r9.A07 = Long.valueOf(AnonymousClass11P.A01(r7.A03));
                            r9.A02 = Integer.valueOf(AnonymousClass34Z.A00(r11));
                            if (r6.A06()) {
                                num2 = r52.A04(r11);
                            } else {
                                num2 = null;
                            }
                            r9.A00 = num2;
                            int A012 = r52.A01(r8);
                            Integer valueOf = Integer.valueOf(A012);
                            r9.A03 = valueOf;
                            if (valueOf == null || A012 != 1) {
                                r7.A05.CC7(r9);
                            } else {
                                r7.A05.CC4(r9);
                            }
                        }
                        int A003 = C18020vd.A00(r2, r42, 10254);
                        if (A003 == 1 || A003 == 2) {
                            ConcurrentHashMap concurrentHashMap = AnonymousClass34Z.A08;
                            String str = r32.A01;
                            if (concurrentHashMap.containsKey(str)) {
                                Log.w("BotMessageLogging/logMessageSendingToBotWithQPL: duplicate logging for same message sent");
                                return;
                            }
                            int incrementAndGet = AnonymousClass34Z.A09.incrementAndGet();
                            C18070vi.A0X(str);
                            concurrentHashMap.put(str, new C55562g0(incrementAndGet));
                            C695037l r34 = r7.A01;
                            r34.markerStart(261881857, incrementAndGet);
                            r34.markerAnnotate(261881857, incrementAndGet, "request_id", str);
                            r34.markerAnnotate(261881857, incrementAndGet, "encrypted_rid", r7.A04.A0d());
                            r34.markerAnnotate(261881857, incrementAndGet, "request_session_source", AnonymousClass34Z.A00(r11));
                            r34.markerAnnotate(261881857, incrementAndGet, "bot_type", r52.A01(r8));
                            r34.markerAnnotate(261881857, incrementAndGet, "request_media_type", ((C62242r5) r7.A07.get()).A01(r11));
                            r34.markerAnnotate(261881857, incrementAndGet, "message_type", C64002u3.A05(r11));
                            if (r6.A06() && (A042 = r52.A04(r11)) != null) {
                                r34.markerAnnotate(261881857, incrementAndGet, "agent_engagement_type", A042.intValue());
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006b, code lost:
        if (A0K(r3.A0v.A00, r11.A05(), (X.AnonymousClass206) null) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d3, code lost:
        if (r3.A11(16777216) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0173, code lost:
        if (X.AnonymousClass25A.A0J(r3.A0u) == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0192, code lost:
        if (r3.A06 < 2) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c2, code lost:
        if (r3.A0K() == null) goto L_0x01c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C63362sw r11, int r12, int r13) {
        /*
            r10 = this;
            X.206 r3 = r11.A0A
            X.2HT r2 = new X.2HT
            r2.<init>()
            java.lang.Long r0 = r11.A0K
            long r4 = r0.longValue()
            long r0 = r11.A0X
            long r4 = r4 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.A0U = r0
            long r4 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r0 = r11.A0L
            long r0 = r0.longValue()
            long r4 = r4 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.A0V = r0
            java.lang.Long r0 = r11.A0J
            r2.A0X = r0
            X.00H r0 = r10.A0S
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A02(r11)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0M = r0
            boolean r0 = r11.A0S
            if (r0 == 0) goto L_0x029e
            r1 = 3
        L_0x0042:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A0N = r0
            r4 = 1
            if (r1 == r4) goto L_0x004e
            r0 = 3
            if (r1 != r0) goto L_0x005a
        L_0x004e:
            X.11S r1 = r10.A03
            com.whatsapp.jid.UserJid r0 = r11.A05()
            java.lang.Boolean r0 = A00(r1, r0)
            r2.A06 = r0
        L_0x005a:
            r9 = 0
            if (r3 == 0) goto L_0x006d
            X.205 r0 = r3.A0v
            X.1BI r5 = r0.A00
            com.whatsapp.jid.UserJid r1 = r11.A05()
            r0 = 0
            boolean r1 = r10.A0K(r5, r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r0
            X.1CJ r5 = r10.A07
            X.C18070vi.A0d(r5, r4)
            if (r3 == 0) goto L_0x029b
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            java.lang.Integer r0 = X.C64002u3.A07(r5, r0)
        L_0x0083:
            r2.A0R = r0
            if (r3 == 0) goto L_0x00d5
            X.205 r0 = r3.A0v
            X.1BI r1 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x00cb
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.00H r0 = r10.A0O
            java.lang.Object r0 = r0.get()
            X.2mo r0 = (X.C59742mo) r0
            java.lang.String r0 = r0.A01(r1)
            int r6 = X.C64002u3.A06(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.A0K = r0
            java.lang.String r1 = r11.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00b5
            int r6 = X.C64002u3.A06(r1)
        L_0x00b5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r2.A0Q = r0
            com.whatsapp.jid.Jid r0 = r11.A0Y
            boolean r1 = X.C22971Dz.A0T(r0)
            r0 = 1
            if (r1 == 0) goto L_0x00c5
            r0 = 2
        L_0x00c5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0L = r0
        L_0x00cb:
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r1 = r3.A11(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            if (r3 == 0) goto L_0x0151
            X.205 r0 = r3.A0v
            X.1BI r6 = r0.A00
            X.1PS r7 = r10.A0A
            int r0 = r7.A00()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Z = r0
            boolean r0 = X.C22971Dz.A0d(r6)
            if (r0 == 0) goto L_0x0103
            r0 = r6
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            int r0 = r7.A01(r0)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0a = r0
        L_0x0103:
            X.1ci r6 = r5.A0A(r6)
            if (r6 == 0) goto L_0x0148
            X.1cl r0 = r6.A0e
            int r1 = r0.disappearingMessagesInitiator
            r0 = 1
            if (r1 == 0) goto L_0x0114
            r0 = 2
            if (r1 != r0) goto L_0x0114
            r0 = 3
        L_0x0114:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0F = r0
            X.0ve r5 = r10.A0B
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x0148
            X.2lr r1 = r6.A0d
            if (r1 == 0) goto L_0x0148
            int r0 = r1.A00
            int r0 = X.C64002u3.A01(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0I = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0148
            boolean r1 = r0.booleanValue()
            r0 = 2
            if (r1 == 0) goto L_0x0142
            r0 = 1
        L_0x0142:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0H = r0
        L_0x0148:
            int r0 = r3.A05
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0T = r0
        L_0x0151:
            java.lang.Integer r1 = r11.A0G
            r0 = 0
            if (r1 == 0) goto L_0x0157
            r0 = 1
        L_0x0157:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A08 = r0
            r5 = 0
            if (r1 == 0) goto L_0x0298
            long r0 = r1.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0168:
            r2.A0W = r0
            if (r3 == 0) goto L_0x0175
            int r0 = r3.A0u
            boolean r1 = X.AnonymousClass25A.A0J(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0176
        L_0x0175:
            r0 = 0
        L_0x0176:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            if (r12 <= 0) goto L_0x018c
            long r0 = (long) r12
            r7 = 32
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0186
            r7 = r0
        L_0x0186:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.A0Y = r0
        L_0x018c:
            if (r3 == 0) goto L_0x0194
            int r6 = r3.A06
            r1 = 2
            r0 = 1
            if (r6 >= r1) goto L_0x0195
        L_0x0194:
            r0 = 0
        L_0x0195:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            if (r13 <= 0) goto L_0x01b5
            long r0 = (long) r13
            r7 = 32
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x01a5
            r7 = r0
        L_0x01a5:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.A0S = r0
            int r0 = X.C64002u3.A00(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0E = r0
        L_0x01b5:
            if (r3 == 0) goto L_0x01c4
            int r1 = r3.A0u
            r0 = 103(0x67, float:1.44E-43)
            if (r1 == r0) goto L_0x01c4
            X.206 r1 = r3.A0K()
            r0 = 1
            if (r1 != 0) goto L_0x01c5
        L_0x01c4:
            r0 = 0
        L_0x01c5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            if (r3 == 0) goto L_0x01d1
            X.205 r0 = r3.A0v
            X.1BI r5 = r0.A00
        L_0x01d1:
            X.0ve r6 = r10.A0B
            r1 = 441(0x1b9, float:6.18E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x01f3
            boolean r0 = X.C22971Dz.A0e(r5)
            if (r0 == 0) goto L_0x01f3
            X.1Nb r0 = r10.A0H
            X.1yM r0 = r0.A0a(r5)
            boolean r0 = r0.A0A()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A09 = r0
        L_0x01f3:
            int r0 = r11.A01
            java.lang.Integer r0 = X.A8F.A04(r0)
            r2.A0P = r0
            boolean r0 = X.C20133A8t.A0E(r11)
            if (r0 != 0) goto L_0x0207
            boolean r0 = X.C20133A8t.A0F(r11)
            if (r0 == 0) goto L_0x020d
        L_0x0207:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A07 = r0
        L_0x020d:
            if (r3 == 0) goto L_0x0292
            java.lang.Integer r0 = A03(r3)
        L_0x0213:
            r2.A0J = r0
            int r0 = r11.A01
            int r0 = r10.A06(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            X.00H r1 = r10.A0K
            java.lang.Object r0 = r1.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            java.lang.Integer r0 = r0.A05(r11)
            r2.A0B = r0
            boolean r0 = r3 instanceof X.C441322g
            if (r0 == 0) goto L_0x023c
            X.22g r3 = (X.C441322g) r3
            boolean r0 = r3.A1G()
            if (r0 == 0) goto L_0x023c
            r9 = 1
        L_0x023c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r2.A0A = r0
            java.lang.Object r1 = r1.get()
            X.1PW r1 = (X.AnonymousClass1PW) r1
            com.whatsapp.jid.UserJid r0 = r11.A05()
            int r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0258
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0C = r0
        L_0x0258:
            X.11S r0 = r10.A03
            java.lang.String r0 = r0.A0C()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            boolean r0 = X.C22971Dz.A0d(r5)
            if (r0 == 0) goto L_0x028c
            X.00H r1 = r10.A0Z
            java.lang.Object r0 = r1.get()
            X.2l2 r0 = (X.C58652l2) r0
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Integer r0 = r0.A01(r5)
            r2.A0O = r0
            java.lang.Object r0 = r1.get()
            X.2l2 r0 = (X.C58652l2) r0
            java.lang.Integer r0 = r0.A00(r5)
            r2.A0D = r0
        L_0x028c:
            X.18K r0 = r10.A0C
            r0.CC7(r2)
            return
        L_0x0292:
            java.lang.Integer r0 = X.C64002u3.A09(r11)
            goto L_0x0213
        L_0x0298:
            r0 = r5
            goto L_0x0168
        L_0x029b:
            r0 = 0
            goto L_0x0083
        L_0x029e:
            com.whatsapp.jid.Jid r0 = r11.A0Z
            int r1 = X.C64002u3.A04(r0)
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.A0H(X.2sw, int, int):void");
    }

    public void A0I(C63362sw r5, Integer num, int i) {
        Long l;
        AnonymousClass2HD r3 = new AnonymousClass2HD();
        r3.A0C = C64002u3.A07(this.A07, r5.A0B.A00);
        r3.A0A = Integer.valueOf(((C62242r5) this.A0S.get()).A02(r5));
        r3.A09 = Integer.valueOf(i);
        if (i == 5) {
            r3.A05 = num;
        }
        r3.A04 = A8F.A06(r5.A0B.A00, r5.A0Y);
        r3.A06 = A8F.A05(this.A03, DeviceJid.Companion.A02(r5.A04()));
        r3.A0E = Long.valueOf((long) r5.A02());
        Integer num2 = r5.A0G;
        boolean z = false;
        if (num2 != null) {
            z = true;
        }
        r3.A01 = Boolean.valueOf(z);
        if (num2 != null) {
            l = Long.valueOf(num2.longValue());
        } else {
            l = null;
        }
        r3.A0D = l;
        r3.A0B = A8F.A04(r5.A01);
        AnonymousClass00H r1 = this.A0K;
        r3.A02 = ((AnonymousClass1PW) r1.get()).A05(r5);
        r3.A07 = C64002u3.A09(r5);
        int A012 = ((AnonymousClass1PW) r1.get()).A01(r5.A05());
        if (A012 != 0) {
            r3.A03 = Integer.valueOf(A012);
        }
        AnonymousClass1BI r2 = r5.A0B.A00;
        r3.A00 = Boolean.valueOf(A0K(r2, r5.A05(), (AnonymousClass206) null));
        if (C22971Dz.A0e(r2)) {
            r3.A08 = Integer.valueOf(C64002u3.A06(((C59742mo) this.A0O.get()).A01((AnonymousClass1E9) r2)));
        }
        if (i == 16) {
            this.A0C.CC6(r3, new C18180vt(100, 100));
        } else {
            this.A0C.CC4(r3);
        }
    }

    public void A0J(C63362sw r5, Integer num, int i) {
        Integer valueOf;
        C47012Gt r2 = new C47012Gt();
        r2.A08 = r5.A0h;
        if (num != null) {
            int intValue = num.intValue();
            int i2 = 0;
            if (intValue != 0) {
                i2 = 1;
                if (intValue != 1) {
                    i2 = 2;
                    if (intValue != 2) {
                        i2 = 3;
                        if (intValue != 4) {
                            valueOf = null;
                            r2.A01 = valueOf;
                        }
                    }
                }
            }
            valueOf = Integer.valueOf(i2);
            r2.A01 = valueOf;
        }
        r2.A03 = Integer.valueOf(i);
        Jid A042 = r5.A04();
        if (A042 != null) {
            r2.A09 = A042.getRawString();
            r2.A04 = A8F.A05(this.A03, DeviceJid.Companion.A02(A042));
        }
        r2.A05 = Integer.valueOf(((C62242r5) this.A0S.get()).A02(r5));
        boolean z = false;
        if (r5.A0G != null) {
            z = true;
        }
        r2.A00 = Boolean.valueOf(z);
        r2.A07 = Long.valueOf((long) r5.A02());
        r2.A02 = A8F.A06(r5.A0B.A00, r5.A0Y);
        r2.A06 = A8F.A04(r5.A01);
        this.A0C.CC7(r2);
    }

    public boolean A0K(AnonymousClass1BI r3, UserJid userJid, AnonymousClass206 r5) {
        if (!(r3 instanceof AnonymousClass1E2)) {
            C36321nh r0 = GroupJid.Companion;
            if (C36321nh.A00(r3) == null) {
                return false;
            }
            if (!(userJid instanceof AnonymousClass1E2)) {
                return ((C57502jB) this.A0g.get()).A00(r5);
            }
        }
        return true;
    }

    public AnonymousClass1PT(C19880zA r4, AnonymousClass190 r5, AnonymousClass11S r6, C25481Oj r7, AnonymousClass1M9 r8, AnonymousClass11P r9, AnonymousClass1CJ r10, AnonymousClass1MZ r11, AnonymousClass12B r12, AnonymousClass1NK r13, AnonymousClass1PS r14, C18030ve r15, AnonymousClass18K r16, C25241Nl r17, C25351Nw r18, C25441Of r19, AnonymousClass1N7 r20, C25281Np r21, AnonymousClass1Nb r22, C25271No r23, AnonymousClass10I r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43) {
        this.A06 = r9;
        this.A0B = r15;
        this.A02 = r5;
        this.A03 = r6;
        AnonymousClass10I r2 = r24;
        this.A0J = r2;
        this.A07 = r10;
        this.A09 = r13;
        this.A0C = r16;
        this.A0O = r26;
        this.A0R = r25;
        this.A0K = r27;
        this.A05 = r8;
        this.A0N = r28;
        this.A0c = r12;
        this.A0X = r34;
        this.A0H = r22;
        this.A0D = r17;
        this.A0d = r20;
        this.A0L = r29;
        this.A0P = r30;
        this.A0Q = r31;
        this.A0S = r35;
        this.A0f = r32;
        this.A0g = r33;
        this.A0I = r23;
        this.A08 = r11;
        this.A0G = r21;
        this.A0Z = r37;
        this.A0W = r40;
        this.A0E = r18;
        this.A0F = r19;
        this.A01 = r4;
        this.A0M = r36;
        this.A0T = r38;
        this.A0Y = r39;
        this.A04 = r7;
        this.A0A = r14;
        this.A0U = r41;
        this.A0V = r42;
        this.A0a = r43;
        this.A0e = new C200710s(r2, false);
        this.A0b = C18020vd.A05(C18040vf.A02, r15, 1191);
    }

    public static Boolean A00(AnonymousClass11S r0, UserJid userJid) {
        r0.A0I();
        Me me = r0.A00;
        if (me == null || userJid == null) {
            return null;
        }
        return Boolean.valueOf(!userJid.getRawString().startsWith(me.cc));
    }

    public static Integer A02(AnonymousClass1BI r1) {
        int i;
        if (C22971Dz.A0e(r1)) {
            i = 2;
        } else if (C22971Dz.A0a(r1)) {
            i = 3;
        } else if (C22971Dz.A0N(r1)) {
            i = 4;
        } else if (C22971Dz.A0d(r1)) {
            i = 1;
        } else if (!C22971Dz.A0V(r1)) {
            return null;
        } else {
            i = 5;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f2, code lost:
        if (X.C83574Fq.A00(r8) != false) goto L_0x01f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.AnonymousClass1PT r20, X.AnonymousClass206 r21, java.util.Collection r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, long r31, long r33, long r35, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41) {
        /*
            r8 = r21
            r10 = r27
            r4 = r26
            X.205 r12 = r8.A0v
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0383
            boolean r0 = r8.A0y()
            if (r0 == 0) goto L_0x0383
            X.2HU r2 = new X.2HU
            r2.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r35)
            r2.A0P = r0
            r17 = r31
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r2.A0N = r0
            r15 = r33
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r2.A0O = r0
            boolean r0 = r8 instanceof X.AnonymousClass23N
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A07 = r0
            r3 = r20
            X.00H r0 = r3.A0S
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r0 = r0.A01(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0I = r0
            r27 = r23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r2.A0K = r0
            int r0 = X.C64002u3.A05(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0J = r0
            X.1CJ r0 = r3.A07
            r5 = 1
            X.C18070vi.A0d(r0, r5)
            X.1BI r7 = r12.A00
            java.lang.Integer r0 = X.C64002u3.A07(r0, r7)
            r2.A0L = r0
            r0 = 1
            boolean r0 = r8.A11(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A06 = r0
            int r0 = r8.A0u
            r26 = r0
            boolean r0 = X.AnonymousClass25A.A0J(r26)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A08 = r0
            r0 = r25
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0W = r0
            r0 = r24
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0V = r0
            boolean r0 = X.AnonymousClass25A.A0v(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r37)
            r2.A0B = r0
            int r0 = r8.A01
            int r0 = r3.A06(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0F = r0
            X.00H r0 = r3.A0Q
            java.lang.Object r1 = r0.get()
            X.1O1 r1 = (X.AnonymousClass1O1) r1
            java.util.HashSet r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass1O1.A00(r1, r0)
            r2.A0a = r0
            X.00H r0 = r3.A0f
            r25 = r0
            java.lang.Object r1 = r25.get()
            X.2aD r1 = (X.C52002aD) r1
            monitor-enter(r1)
            r9 = 0
            if (r7 == 0) goto L_0x00e1
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x00de }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00de }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00de }
            if (r0 == 0) goto L_0x00e1
            int r9 = r0.intValue()     // Catch:{ all -> 0x00de }
            goto L_0x00e1
        L_0x00de:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00e1:
            monitor-exit(r1)
            r13 = 1
            if (r9 <= 0) goto L_0x015b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A0D = r0
        L_0x00eb:
            X.0ve r6 = r3.A0B
            X.0vf r1 = X.C18040vf.A01
            r0 = 767(0x2ff, float:1.075E-42)
            int r0 = X.C18020vd.A00(r1, r6, r0)
            if (r4 >= r0) goto L_0x00f9
            if (r9 < r0) goto L_0x00ff
        L_0x00f9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r2.A0C = r0
        L_0x00ff:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r39)
            r2.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r40)
            r2.A03 = r0
            r1 = 5
            r0 = r27
            if (r0 != r1) goto L_0x0122
            r0 = r28
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0R = r0
            r0 = r29
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Z = r0
        L_0x0122:
            boolean r0 = X.C22971Dz.A0e(r7)
            r11 = r22
            r21 = r30
            if (r0 != 0) goto L_0x0171
            boolean r0 = X.C22971Dz.A0N(r7)
            if (r0 != 0) goto L_0x0171
            if (r22 == 0) goto L_0x01d5
            java.util.Iterator r10 = r11.iterator()
            r4 = 0
        L_0x0139:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r5 = r10.next()
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            X.11S r1 = r3.A03
            com.whatsapp.jid.UserJid r0 = r5.userJid
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x0158
            boolean r0 = r1.A0P(r5)
            if (r0 != 0) goto L_0x0158
            int r4 = r4 + 1
            goto L_0x0139
        L_0x0158:
            int r13 = r13 + 1
            goto L_0x0139
        L_0x015b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r38)
            r2.A01 = r0
            goto L_0x00eb
        L_0x0162:
            long r0 = (long) r13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0X = r0
            long r0 = (long) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0U = r0
            goto L_0x01d5
        L_0x0171:
            if (r30 <= 0) goto L_0x018d
            r0 = r21
            long r0 = (long) r0
            r13 = 32
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x017d
            r13 = r0
        L_0x017d:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r2.A0S = r0
            int r0 = X.C64002u3.A03(r21)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
        L_0x018d:
            if (r22 == 0) goto L_0x01d5
            int r5 = r11.size()
            if (r5 <= 0) goto L_0x01d5
            long r0 = (long) r5
            r19 = 32
            int r13 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r13 <= 0) goto L_0x019e
            r19 = r0
        L_0x019e:
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            r2.A0M = r0
            int r0 = X.C64002u3.A00(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0E = r0
            if (r9 <= 0) goto L_0x023d
            r4 = r9
        L_0x01b1:
            double r0 = (double) r4
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r19
            double r4 = (double) r5
            double r0 = r0 / r4
            double r0 = java.lang.Math.ceil(r0)
            long r13 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r2.A0Q = r0
            if (r10 >= 0) goto L_0x01c6
            r10 = 0
        L_0x01c6:
            double r0 = (double) r10
            double r0 = r0 * r19
            double r0 = r0 / r4
            double r0 = java.lang.Math.ceil(r0)
            long r4 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.A0Y = r0
        L_0x01d5:
            X.00H r0 = r3.A0R
            java.lang.Object r0 = r0.get()
            X.2iF r0 = (X.C56922iF) r0
            java.lang.String r0 = r0.A00(r11)
            r2.A0b = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r41)
            r2.A02 = r0
            boolean r0 = r8 instanceof X.C442522s
            if (r0 != 0) goto L_0x01f4
            boolean r1 = X.C83574Fq.A00(r8)
            r0 = 0
            if (r1 == 0) goto L_0x01f5
        L_0x01f4:
            r0 = 1
        L_0x01f5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0A = r0
            com.whatsapp.jid.UserJid r0 = r8.A0I()
            boolean r0 = r3.A0K(r7, r0, r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = A03(r8)
            r2.A0H = r0
            X.10s r1 = r3.A0e
            r24 = 46
            X.Aiu r0 = new X.Aiu
            r22 = r8
            r23 = r21
            r19 = r0
            r20 = r3
            r21 = r2
            r19.<init>(r20, r21, r22, r23, r24)
            r1.execute(r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.A12 = r0
            r1 = 3
            r0 = r27
            if (r0 != r1) goto L_0x0250
            if (r9 <= 0) goto L_0x0250
            java.lang.Object r4 = r25.get()
            X.2aD r4 = (X.C52002aD) r4
            r0 = 0
            monitor-enter(r4)
            if (r7 == 0) goto L_0x024f
            goto L_0x0242
        L_0x023d:
            if (r4 >= 0) goto L_0x01b1
            r4 = 0
            goto L_0x01b1
        L_0x0242:
            java.util.Map r1 = r4.A00     // Catch:{ all -> 0x024c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x024c }
            r1.put(r7, r0)     // Catch:{ all -> 0x024c }
            goto L_0x024f
        L_0x024c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x024f:
            monitor-exit(r4)
        L_0x0250:
            boolean r0 = r3.A0b
            if (r0 == 0) goto L_0x032a
            X.1Np r1 = r3.A0G
            java.lang.String r0 = r12.A01
            int r9 = r0.hashCode()
            java.lang.Integer r0 = r2.A0K
            if (r0 == 0) goto L_0x032a
            int r4 = r0.intValue()
            r0 = 3
            if (r4 != r0) goto L_0x0321
            X.19a r7 = r1.A01
            r0 = r26
            long r10 = (long) r0
            r12 = 0
            java.lang.String r8 = "wa_type"
            r7.A09(r8, r9, r10, r12)
            java.lang.String r4 = "messageType"
            java.lang.Integer r0 = r2.A0J
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "mediaType"
            java.lang.Integer r0 = r2.A0I
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "deviceCount"
            java.lang.Long r0 = r2.A0M
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "sendCount"
            java.lang.Long r0 = r2.A0V
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "fetchPrekeys"
            java.lang.Boolean r0 = r2.A01
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "deviceSizeBucket"
            java.lang.Integer r0 = r2.A0E
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "messageIsInvisible"
            java.lang.Boolean r0 = r2.A0A
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "fetchPrekeysPercentage"
            java.lang.Long r0 = r2.A0Q
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "isDirectedMessage"
            java.lang.Boolean r0 = r2.A02
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "isE2eBackfill"
            java.lang.Boolean r0 = r2.A03
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "isMessageFanout"
            java.lang.Boolean r0 = r2.A05
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "isMessageForward"
            java.lang.Boolean r0 = r2.A06
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "isRevokeMessage"
            java.lang.Boolean r0 = r2.A07
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "isViewOnce"
            java.lang.Boolean r0 = r2.A08
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "jobsInQueue"
            java.lang.Long r0 = r2.A0R
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "networkWasDisconnected"
            java.lang.Boolean r0 = r2.A0B
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "participantCount"
            java.lang.Long r0 = r2.A0S
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "sendRetryCount"
            java.lang.Long r0 = r2.A0W
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "threadsInExecution"
            java.lang.Long r0 = r2.A0Z
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "typeOfGroup"
            java.lang.Integer r0 = r2.A0L
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "groupSizeBucket"
            java.lang.Integer r0 = r2.A0G
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "appRestart"
            java.lang.Boolean r0 = r2.A00
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "sessionsMissingWhenComposing"
            java.lang.Boolean r0 = r2.A0D
            r1.A05(r9, r4, r0)
            java.lang.String r4 = "senderKeyDistributionCountPercentage"
            java.lang.Long r0 = r2.A0Y
            r1.A05(r9, r4, r0)
        L_0x0321:
            java.lang.Integer r0 = r2.A0K
            int r0 = r0.intValue()
            r1.A03(r9, r0)
        L_0x032a:
            r0 = 920(0x398, float:1.289E-42)
            X.0vf r5 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r5, r6, r0)
            r0 = 1488(0x5d0, float:2.085E-42)
            int r7 = X.C18020vd.A00(r5, r6, r0)
            if (r37 != 0) goto L_0x0357
            if (r7 <= 0) goto L_0x0357
            if (r7 <= r1) goto L_0x0357
            r0 = 919(0x397, float:1.288E-42)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0357
            long r0 = (long) r1
            int r4 = (r31 > r0 ? 1 : (r31 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0357
            long r0 = (long) r7
            int r4 = (r31 > r0 ? 1 : (r31 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0357
            java.lang.String r4 = "MessageLogging/AbsDurationTooHigh"
            r0 = r17
            r3.A04(r2, r4, r0)
        L_0x0357:
            r0 = 1072(0x430, float:1.502E-42)
            int r4 = X.C18020vd.A00(r5, r6, r0)
            r0 = 1489(0x5d1, float:2.087E-42)
            int r1 = X.C18020vd.A00(r5, r6, r0)
            if (r37 != 0) goto L_0x0383
            if (r39 != 0) goto L_0x0383
            if (r1 <= 0) goto L_0x0383
            if (r1 <= r4) goto L_0x0383
            r0 = 1126(0x466, float:1.578E-42)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0383
            long r4 = (long) r4
            int r0 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0383
            long r4 = (long) r1
            int r0 = (r33 > r4 ? 1 : (r33 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0383
            java.lang.String r4 = "MessageLogging/RelativeDurationTooHigh"
            r0 = r15
            r3.A04(r2, r4, r0)
        L_0x0383:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PT.A05(X.1PT, X.206, java.util.Collection, int, int, int, int, int, int, int, int, long, long, long, boolean, boolean, boolean, boolean, boolean):void");
    }
}
