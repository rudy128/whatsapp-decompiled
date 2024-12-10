package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: X.8ff  reason: invalid class name and case insensitive filesystem */
public class C167228ff extends C167258fi {
    public static final byte[] A0o = new byte[0];
    public long A00;
    public C190089kM A01;
    public AnonymousClass99o A02;
    public File A03;
    public String A04;
    public AtomicReference A05 = new AtomicReference((Object) null);
    public boolean A06;
    public final AnonymousClass190 A07;
    public final C218617r A08;
    public final AnonymousClass1KB A09;
    public final C25311Ns A0A;
    public final AnonymousClass181 A0B;
    public final AnonymousClass1TJ A0C;
    public final AnonymousClass1TJ A0D;
    public final AnonymousClass1TJ A0E;
    public final AnonymousClass1TJ A0F;
    public final AnonymousClass1TJ A0G;
    public final AnonymousClass1TJ A0H;
    public final AnonymousClass11P A0I;
    public final AnonymousClass118 A0J;
    public final C22441B7x A0K;
    public final C22498BAf A0L;
    public final AnonymousClass1ST A0M;
    public final AnonymousClass1SX A0N;
    public final C18030ve A0O;
    public final C24371Kb A0P;
    public final AnonymousClass1KX A0Q;
    public final AnonymousClass1SJ A0R;
    public final AnonymousClass1SY A0S;
    public final WamediaManager A0T;
    public final AnonymousClass1SK A0U;
    public final AnonymousClass1SU A0V;
    public final C62492rU A0W;
    public final C26411Sa A0X;
    public final C198119xo A0Y;
    public final C196299un A0Z;
    public final C188859i7 A0a;
    public final AnonymousClass1SZ A0b;
    public final AnonymousClass1SR A0c;
    public final AnonymousClass1SW A0d;
    public final C186009dV A0e;
    public final C18010vc A0f;
    public final C22394B5x A0g;
    public final C24421Kg A0h;
    public final AnonymousClass10I A0i;
    public final JniBridge A0j;
    public final boolean A0k;
    public final boolean A0l;
    public volatile long A0m;
    public volatile boolean A0n;

    public boolean A0I() {
        return false;
    }

    public static C187989gh A00(C190089kM r12, C167228ff r13, AnonymousClass99o r14, String str) {
        A02(r13, AnonymousClass00R.A07);
        C183199Xi r8 = new C183199Xi(r13);
        AnonymousClass1SW r1 = r13.A0d;
        String A002 = A01(r13).A00();
        C24361Ka r2 = r1.A00;
        AnonymousClass1SJ r6 = r1.A04;
        C191879nL r15 = new C191879nL(r2, r1.A01, r1.A02, r1.A03, r6, r12, r8, r14, str, A002);
        C195479tP A003 = r15.A00();
        C186819eo r4 = r15.A07;
        A02(r13, AnonymousClass00R.A08);
        C179449Hz r3 = A003.A02;
        if (r3 == null || r3 == C179449Hz.FAILURE) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("mediaupload/the resume request and the fallback mms resume request failed; request=");
            C17900vP.A0b(r13.A0W, A10);
            return new C187989gh(r4, (String) null, (String) null, (List) null, 17, 0, false);
        } else if (r3 == C179449Hz.COMPLETE) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("mediaupload/object already existed on media server; upload ending; request=");
            C17900vP.A0b(r13.A0W, A102);
            return new C187989gh(r4, A003.A03, A003.A05, A003.A06, 0, 0, true);
        } else {
            C179449Hz r0 = C179449Hz.RESUME;
            StringBuilder A103 = AnonymousClass000.A10();
            if (r3 == r0) {
                A103.append("mediaupload/resume from ");
                A103.append(A003.A01);
                A103.append("; request=");
                C17900vP.A0b(r13.A0W, A103);
                return new C187989gh(r4, (String) null, (String) null, (List) null, 0, A003.A01, false);
            }
            throw AnonymousClass000.A0n(AnonymousClass001.A1E(r3, "unhandled result type in checkForResumePoint, type=", A103));
        }
    }

    public static C58092k8 A01(C167228ff r9) {
        String str;
        Integer valueOf;
        C18030ve r2 = r9.A0O;
        JniBridge jniBridge = r9.A0j;
        C56232h8 r1 = r9.A0W.A02;
        switch (r1.A02) {
            case 2:
                str = "chat_personal";
                break;
            case 3:
                str = "chat_group";
                break;
            case 4:
                str = "status_user";
                break;
            case 5:
                str = "product_catalog";
                break;
            case 6:
                str = "sticker_web";
                break;
            case 7:
                str = "payment_kyc";
                break;
            case 8:
                str = "message_history_sync";
                break;
            case 9:
                str = "community";
                break;
            case 10:
                str = "channel";
                break;
            case 11:
                str = "broadcast";
                break;
            case 12:
                str = "multi_chat";
                break;
            default:
                str = "unknown";
                break;
        }
        String str2 = r1.A06.A02;
        C190089kM r0 = r9.A01;
        if (r0 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(r0.A01.get());
        }
        C18070vi.A0e(r2, 1, jniBridge);
        return new C58092k8(r2, jniBridge, valueOf, str, str2, (String) null, (String) null, true);
    }

    public static void A02(C167228ff r2, Integer num) {
        r2.A0X.A02(r2.A0a.A0Q, num);
    }

    public static void A03(C167228ff r13, Integer num) {
        C196299un r8;
        if (r13.A0n) {
            r13.A0n = false;
            r13.A0h.unregisterObserver(r13.A0g);
        }
        C62492rU r7 = r13.A0W;
        if (r7.A02.A0G) {
            C196299un r4 = r13.A0Z;
            AnonymousClass1SJ r3 = r13.A0R;
            String A032 = r4.A03();
            long A012 = AnonymousClass11P.A01(r13.A0I);
            if (!TextUtils.isEmpty(A032)) {
                A032 = C50462Un.A00(Uri.parse(A032).buildUpon(), "_nc_hot", String.valueOf(C17880vN.A04(A012))).build().toString();
            }
            r4.A08(r3.A00(A032, true));
        }
        if (num.intValue() == 18) {
            r13.A0Q.A00();
        }
        if (r13.A02.isCancelled()) {
            num = C17880vN.A0h();
        }
        AnonymousClass1TJ r1 = r13.A0H;
        C196299un r2 = r13.A0Z;
        synchronized (r2) {
            r8 = new C196299un();
            r8.A00 = r2.A00;
            r8.A0M = r2.A0M;
            r8.A0O = r2.A0O;
            r8.A0P = r2.A0P;
            r8.A03 = r2.A03;
            r8.A04 = r2.A04;
            r8.A0A = r2.A0A;
            r8.A09 = r2.A09;
            r8.A02 = r2.A02;
            r8.A0C = r2.A0C;
            r8.A08 = r2.A08;
            r8.A05 = r2.A05;
            r8.A0F = r2.A0F;
            r8.A0G = r2.A0G;
            r8.A06 = r2.A06;
            r8.A0I = r2.A0I;
            r8.A0L = r2.A0L;
            r8.A0K = r2.A0K;
            r8.A0E = r2.A0E;
            r8.A0D = r2.A0D;
            r8.A0N = r2.A0N;
            r8.A01 = r2.A01;
            r8.A07 = r2.A07;
            r8.A0B = r2.A0B;
            r8.A0H = r2.A0H;
            r8.A0J = r2.A0J;
        }
        r1.A04(new C55612g5(r7, r8, r13.A03, num.intValue(), r13.A06, r13.A0J()));
    }

    public static boolean A04(C167228ff r2) {
        C56232h8 r22 = r2.A0W.A02;
        C26551So r1 = r22.A06;
        if (!C693436v.A00(r1)) {
            return false;
        }
        if (C63972u0.A08(r1) || r1 == C26551So.A0p) {
            return true;
        }
        int[] iArr = r22.A0J;
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: X.9fc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: X.9fc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: X.9fc} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x035d A[Catch:{ all -> 0x0abc }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0370 A[Catch:{ all -> 0x0abc }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:403:0x0740=Splitter:B:403:0x0740, B:104:0x0285=Splitter:B:104:0x0285, B:395:0x071d=Splitter:B:395:0x071d, B:93:0x024e=Splitter:B:93:0x024e, B:206:0x043f=Splitter:B:206:0x043f} */
    public /* bridge */ /* synthetic */ java.lang.Object A0E() {
        /*
            r46 = this;
            r1 = r46
            boolean r0 = r1 instanceof X.C173528vE     // Catch:{ all -> 0x0abc }
            r22 = r0
            X.2rU r5 = r1.A0W     // Catch:{ all -> 0x0abc }
            X.2h4 r0 = r5.A01     // Catch:{ all -> 0x0abc }
            r45 = r0
            long r6 = r0.A09     // Catch:{ all -> 0x0abc }
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x001c
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0abc }
            r0 = r45
            r0.A09 = r2     // Catch:{ all -> 0x0abc }
        L_0x001c:
            X.9i7 r6 = r1.A0a     // Catch:{ all -> 0x0abc }
            X.1SK r0 = r1.A0U     // Catch:{ all -> 0x0abc }
            r44 = r0
            r7 = 0
            java.lang.Float r0 = r0.BNL(r7)     // Catch:{ all -> 0x0abc }
            r6.A05 = r0     // Catch:{ all -> 0x0abc }
            X.0ve r0 = r1.A0O     // Catch:{ all -> 0x0abc }
            r43 = r0
            boolean r0 = X.C50262Tt.A00(r43)     // Catch:{ all -> 0x0abc }
            if (r0 == 0) goto L_0x003b
            r0 = r44
            java.lang.Float r0 = r0.BNM(r7)     // Catch:{ all -> 0x0abc }
            r6.A06 = r0     // Catch:{ all -> 0x0abc }
        L_0x003b:
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x0abc }
            r6.A04 = r0     // Catch:{ all -> 0x0abc }
            boolean r0 = r1.A0J()     // Catch:{ all -> 0x0abc }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0abc }
            r6.A03 = r0     // Catch:{ all -> 0x0abc }
            java.lang.Long r0 = X.AnonymousClass8BT.A0m()     // Catch:{ all -> 0x0abc }
            r6.A0K = r0     // Catch:{ all -> 0x0abc }
            X.11P r0 = r1.A0I     // Catch:{ all -> 0x0abc }
            java.lang.Long r0 = X.AnonymousClass8BU.A0l(r0)     // Catch:{ all -> 0x0abc }
            r6.A0L = r0     // Catch:{ all -> 0x0abc }
            java.lang.Integer r0 = X.AnonymousClass00R.A0j     // Catch:{ all -> 0x0abc }
            A02(r1, r0)     // Catch:{ all -> 0x0abc }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0abc }
            java.lang.Integer r0 = X.AnonymousClass00R.A19     // Catch:{ all -> 0x0abc }
            A02(r1, r0)     // Catch:{ all -> 0x0abc }
            X.1Kg r15 = r1.A0h     // Catch:{ all -> 0x0abc }
            r15.A0D()     // Catch:{ all -> 0x0abc }
            java.lang.Integer r0 = X.AnonymousClass00R.A02     // Catch:{ all -> 0x0abc }
            A02(r1, r0)     // Catch:{ all -> 0x0abc }
            boolean r16 = r1.A0I()     // Catch:{ all -> 0x0abc }
            if (r16 == 0) goto L_0x00f6
            X.2h8 r2 = r5.A02     // Catch:{ all -> 0x0abc }
            X.1So r0 = r2.A06     // Catch:{ all -> 0x0abc }
            r42 = r0
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x0abc }
            r41 = r0
            r33 = 0
            X.2n5 r30 = r15.A0B()     // Catch:{ all -> 0x0abc }
            X.11P r0 = r15.A05     // Catch:{ all -> 0x0abc }
            r17 = r0
            X.0ve r14 = r15.A06     // Catch:{ all -> 0x0abc }
            X.18h r13 = r15.A0E     // Catch:{ all -> 0x0abc }
            X.190 r12 = r15.A03     // Catch:{ all -> 0x0abc }
            X.1Hc r11 = r15.A04     // Catch:{ all -> 0x0abc }
            X.00H r0 = r15.A0G     // Catch:{ all -> 0x0abc }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0abc }
            X.4Yt r10 = (X.C88214Yt) r10     // Catch:{ all -> 0x0abc }
            X.1KX r0 = r15.A07     // Catch:{ all -> 0x0abc }
            long r3 = r15.A01     // Catch:{ all -> 0x0abc }
            r39 = 1
            r36 = r7
            r40 = r7
            r25 = r17
            r26 = r14
            r27 = r0
            r28 = r10
            r29 = r15
            r31 = r13
            r32 = r41
            r34 = r33
            r35 = r7
            r37 = r3
            r23 = r12
            r24 = r11
            X.37z r10 = X.C696437z.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40)     // Catch:{ all -> 0x0abc }
            X.9nA r0 = r10.A01     // Catch:{ all -> 0x0abc }
            if (r0 == 0) goto L_0x00ca
            X.99p r10 = new X.99p     // Catch:{ all -> 0x0abc }
            r10.<init>(r0, r3)     // Catch:{ all -> 0x0abc }
        L_0x00ca:
            X.9kM r20 = new X.9kM     // Catch:{ all -> 0x0abc }
            r0 = r20
            r0.<init>(r10)     // Catch:{ all -> 0x0abc }
        L_0x00d1:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0abc }
            java.lang.Long r0 = X.C108945cZ.A1B(r3, r8)     // Catch:{ all -> 0x0abc }
            r6.A0I = r0     // Catch:{ all -> 0x0abc }
            r0 = r20
            X.BCG r0 = r0.A00     // Catch:{ all -> 0x0abc }
            X.9nA r0 = r0.BQ1()     // Catch:{ all -> 0x0abc }
            r4 = 33
            if (r0 != 0) goto L_0x0111
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0abc }
            java.lang.String r0 = "mediaupload/getselectedroute/failed; request="
            X.C17900vP.A0X(r5, r0, r3)     // Catch:{ all -> 0x0abc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0abc }
            goto L_0x0a4b
        L_0x00f6:
            X.2h8 r2 = r5.A02     // Catch:{ all -> 0x0abc }
            X.1So r0 = r2.A06     // Catch:{ all -> 0x0abc }
            r42 = r0
            java.lang.String r0 = r0.A02     // Catch:{ all -> 0x0abc }
            r41 = r0
            r25 = 0
            r28 = r7
            r23 = r15
            r24 = r0
            r26 = r25
            r27 = r7
            X.9kM r20 = X.C24421Kg.A00(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0abc }
            goto L_0x00d1
        L_0x0111:
            if (r16 == 0) goto L_0x0125
            java.lang.String r3 = "fallback"
            java.lang.String r0 = r0.A05     // Catch:{ all -> 0x0abc }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0abc }
            if (r0 == 0) goto L_0x0125
            r0 = 27
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0abc }
            goto L_0x0a4b
        L_0x0125:
            r0 = r20
            r1.A01 = r0     // Catch:{ all -> 0x0abc }
            java.lang.Integer r0 = X.AnonymousClass00R.A0u     // Catch:{ all -> 0x0abc }
            A02(r1, r0)     // Catch:{ all -> 0x0abc }
            r1.A0F()     // Catch:{ all -> 0x0abc }
            X.9un r0 = r1.A0Z     // Catch:{ all -> 0x0abc }
            r10 = r0
            monitor-enter(r10)     // Catch:{ all -> 0x0abc }
            X.9bC r3 = r0.A01     // Catch:{ all -> 0x0ab6 }
            monitor-exit(r10)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0159
            monitor-enter(r10)     // Catch:{ all -> 0x0abc }
            X.9bC r3 = r0.A01     // Catch:{ all -> 0x0ab6 }
            monitor-exit(r10)     // Catch:{ all -> 0x0abc }
            X.9bE r4 = r3.A01     // Catch:{ all -> 0x0abc }
            monitor-enter(r10)     // Catch:{ all -> 0x0abc }
            X.9bC r3 = r0.A01     // Catch:{ all -> 0x0ab6 }
            monitor-exit(r10)     // Catch:{ all -> 0x0abc }
            int r9 = r3.A00     // Catch:{ all -> 0x0abc }
            X.1SR r8 = r1.A0c     // Catch:{ all -> 0x0abc }
            X.BAf r3 = r1.A0L     // Catch:{ all -> 0x0abc }
            r30 = r3
            X.9dU r3 = r8.A06(r3, r5, r4)     // Catch:{ all -> 0x0abc }
            X.9kN r10 = r3.A01     // Catch:{ all -> 0x0abc }
            X.9kN r3 = r3.A00     // Catch:{ all -> 0x0abc }
            r35 = r3
            r3 = 0
            goto L_0x03e8
        L_0x0159:
            X.9xo r9 = r1.A0Y     // Catch:{ all -> 0x0abc }
            X.BAf r3 = r1.A0L     // Catch:{ all -> 0x0abc }
            r30 = r3
            boolean r4 = r1.A0J()     // Catch:{ all -> 0x0abc }
            boolean r8 = X.AnonymousClass8BU.A1X(r30)     // Catch:{ all -> 0x0abc }
            boolean r3 = r2.A0E     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x01c5
            X.1SR r10 = r9.A01     // Catch:{ all -> 0x0abc }
            java.io.File r3 = r2.A07     // Catch:{ all -> 0x0abc }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0abc }
            java.security.MessageDigest r4 = X.C108945cZ.A1I()     // Catch:{ all -> 0x0abc }
            java.io.InputStream r3 = X.AnonymousClass1SR.A02(r5, r10, r3)     // Catch:{ all -> 0x0abc }
            X.9HQ r9 = new X.9HQ     // Catch:{ all -> 0x0abc }
            r9.<init>(r3, r4)     // Catch:{ all -> 0x0abc }
            r3 = 0
            X.AiG r4 = new X.AiG     // Catch:{ all -> 0x0abc }
            r4.<init>(r9, r9, r3, r10)     // Catch:{ all -> 0x0abc }
            r3 = 16384(0x4000, float:2.2959E-41)
            byte[] r9 = new byte[r3]     // Catch:{ all -> 0x01bf }
        L_0x0189:
            X.9HQ r3 = r4.A00     // Catch:{ all -> 0x01bf }
            int r3 = r3.read(r9)     // Catch:{ all -> 0x01bf }
            if (r3 >= 0) goto L_0x0189
            X.9HQ r3 = r4.A02     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = r3.A00()     // Catch:{ all -> 0x01bf }
            X.9kN r10 = new X.9kN     // Catch:{ all -> 0x01bf }
            r10.<init>(r3, r7)     // Catch:{ all -> 0x01bf }
            r4.close()     // Catch:{ all -> 0x0abc }
            r9 = 0
            X.9kN r4 = new X.9kN     // Catch:{ all -> 0x0abc }
            r4.<init>(r9, r7)     // Catch:{ all -> 0x0abc }
            X.9bE r3 = new X.9bE     // Catch:{ all -> 0x0abc }
            r3.<init>(r9, r8)     // Catch:{ all -> 0x0abc }
            X.9gF r11 = new X.9gF     // Catch:{ all -> 0x0abc }
            r28 = r9
            r23 = r11
            r24 = r9
            r25 = r10
            r26 = r4
            r27 = r3
            r29 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0abc }
            goto L_0x03c9
        L_0x01bf:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x09a5 }
            goto L_0x0abb
        L_0x01c5:
            X.2pa r3 = r0.A00()     // Catch:{ all -> 0x0abc }
            r21 = 1
            if (r3 == 0) goto L_0x01de
            boolean r3 = X.C198119xo.A00(r3, r5, r9)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x01d6
            r29 = 3
            goto L_0x01e3
        L_0x01d6:
            monitor-enter(r10)     // Catch:{ all -> 0x0abc }
            r3 = 0
            r0.A00 = r3     // Catch:{ all -> 0x0ab6 }
            r0.A09 = r3     // Catch:{ all -> 0x0ab6 }
            monitor-exit(r10)     // Catch:{ all -> 0x0abc }
            goto L_0x01e1
        L_0x01de:
            r29 = 1
            goto L_0x01e3
        L_0x01e1:
            r29 = 2
        L_0x01e3:
            if (r4 == 0) goto L_0x0217
            X.1SR r10 = r9.A01     // Catch:{ all -> 0x0abc }
            r3 = 32
            byte[] r3 = X.AnonymousClass8BV.A1a(r3)     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = X.C108955ca.A14(r3)     // Catch:{ all -> 0x0abc }
            X.9kN r13 = new X.9kN     // Catch:{ all -> 0x0abc }
            r13.<init>(r3, r7)     // Catch:{ all -> 0x0abc }
            r3 = 32
            byte[] r3 = X.AnonymousClass8BV.A1a(r3)     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = X.C108955ca.A14(r3)     // Catch:{ all -> 0x0abc }
            X.9kN r12 = new X.9kN     // Catch:{ all -> 0x0abc }
            r12.<init>(r3, r7)     // Catch:{ all -> 0x0abc }
            r3 = 32
            byte[] r11 = new byte[r3]     // Catch:{ all -> 0x0abc }
            monitor-enter(r10)     // Catch:{ all -> 0x0abc }
            java.security.SecureRandom r3 = r10.A00     // Catch:{ all -> 0x0ab6 }
            if (r3 != 0) goto L_0x02aa
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ all -> 0x0ab6 }
            r3.<init>()     // Catch:{ all -> 0x0ab6 }
            r10.A00 = r3     // Catch:{ all -> 0x0ab6 }
            goto L_0x02aa
        L_0x0217:
            int r3 = r2.A01     // Catch:{ all -> 0x0abc }
            boolean r12 = X.AnonymousClass000.A1S(r3, r8)
            X.1SR r10 = r9.A01     // Catch:{ all -> 0x0abc }
            java.io.File r3 = r2.A07     // Catch:{ all -> 0x0abc }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0abc }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0abc }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0abc }
            boolean r11 = r3.exists()     // Catch:{ all -> 0x0abc }
            if (r11 == 0) goto L_0x0a97
            if (r12 == 0) goto L_0x026f
            java.lang.String r3 = r0.A06()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x026f
            java.lang.String r3 = r0.A05()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x026f
            X.2pa r3 = r0.A00()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x026f
            java.lang.String r3 = r0.A05()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x024e
            android.util.Base64.decode(r3, r7)     // Catch:{ IllegalArgumentException -> 0x026f }
        L_0x024e:
            java.lang.String r3 = r0.A06()     // Catch:{ all -> 0x0abc }
            X.9kN r11 = new X.9kN     // Catch:{ all -> 0x0abc }
            r11.<init>(r3, r8)     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r0.A05()     // Catch:{ all -> 0x0abc }
            X.9kN r10 = new X.9kN     // Catch:{ all -> 0x0abc }
            r10.<init>(r3, r8)     // Catch:{ all -> 0x0abc }
            X.2pa r4 = r0.A00()     // Catch:{ all -> 0x0abc }
            X.9bE r3 = new X.9bE     // Catch:{ all -> 0x0abc }
            r3.<init>(r4, r7)     // Catch:{ all -> 0x0abc }
            X.9dU r4 = new X.9dU     // Catch:{ all -> 0x0abc }
            r4.<init>(r11, r10, r3)     // Catch:{ all -> 0x0abc }
            goto L_0x02c5
        L_0x026f:
            X.2pa r3 = r0.A00()     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x029a
            r3 = 32
            byte[] r12 = new byte[r3]     // Catch:{ all -> 0x0abc }
            monitor-enter(r10)     // Catch:{ all -> 0x0abc }
            java.security.SecureRandom r3 = r10.A00     // Catch:{ all -> 0x0ab6 }
            if (r3 != 0) goto L_0x0285
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ all -> 0x0ab6 }
            r3.<init>()     // Catch:{ all -> 0x0ab6 }
            r10.A00 = r3     // Catch:{ all -> 0x0ab6 }
        L_0x0285:
            monitor-exit(r10)     // Catch:{ all -> 0x0abc }
            r3.nextBytes(r12)     // Catch:{ all -> 0x0abc }
            X.11P r3 = r10.A02     // Catch:{ all -> 0x0abc }
            long r3 = X.AnonymousClass11P.A01(r3)     // Catch:{ all -> 0x0abc }
            X.2pa r11 = new X.2pa     // Catch:{ all -> 0x0abc }
            r11.<init>(r12, r3)     // Catch:{ all -> 0x0abc }
            X.9bE r4 = new X.9bE     // Catch:{ all -> 0x0abc }
            r4.<init>(r11, r8)     // Catch:{ all -> 0x0abc }
            goto L_0x02a3
        L_0x029a:
            X.2pa r3 = r0.A00()     // Catch:{ all -> 0x0abc }
            X.9bE r4 = new X.9bE     // Catch:{ all -> 0x0abc }
            r4.<init>(r3, r7)     // Catch:{ all -> 0x0abc }
        L_0x02a3:
            r3 = r30
            X.9dU r4 = r10.A06(r3, r5, r4)     // Catch:{ all -> 0x0abc }
            goto L_0x02c5
        L_0x02aa:
            monitor-exit(r10)     // Catch:{ all -> 0x0abc }
            r3.nextBytes(r11)     // Catch:{ all -> 0x0abc }
            X.11P r3 = r10.A02     // Catch:{ all -> 0x0abc }
            long r16 = X.AnonymousClass11P.A01(r3)     // Catch:{ all -> 0x0abc }
            X.2pa r10 = new X.2pa     // Catch:{ all -> 0x0abc }
            r3 = r16
            r10.<init>(r11, r3)     // Catch:{ all -> 0x0abc }
            X.9bE r3 = new X.9bE     // Catch:{ all -> 0x0abc }
            r3.<init>(r10, r8)     // Catch:{ all -> 0x0abc }
            X.9dU r4 = new X.9dU     // Catch:{ all -> 0x0abc }
            r4.<init>(r13, r12, r3)     // Catch:{ all -> 0x0abc }
        L_0x02c5:
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x0abc }
            X.9kN r3 = r4.A01     // Catch:{ all -> 0x0abc }
            r25 = r3
            X.9kN r3 = r4.A00     // Catch:{ all -> 0x0abc }
            r19 = r3
            X.9bE r12 = r4.A02     // Catch:{ all -> 0x0abc }
            boolean r3 = r2.A0H     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x02d8
            goto L_0x037f
        L_0x02d8:
            r3 = r25
            java.lang.String r11 = r3.A00     // Catch:{ all -> 0x0abc }
            r3 = r42
            int r4 = r3.A00     // Catch:{ all -> 0x0abc }
            if (r11 == 0) goto L_0x02e9
            X.1ST r3 = r9.A00     // Catch:{ all -> 0x0abc }
            X.6io r10 = r3.A09(r11, r4)     // Catch:{ all -> 0x0abc }
            goto L_0x02ea
        L_0x02e9:
            r10 = 0
        L_0x02ea:
            if (r10 == 0) goto L_0x0380
            boolean r3 = r12.A01     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0382
            X.2rc r13 = r10.A01     // Catch:{ all -> 0x0abc }
            long r3 = r10.A00     // Catch:{ all -> 0x0abc }
            r23 = r3
            byte[] r3 = r13.A0a     // Catch:{ all -> 0x0abc }
            r18 = r3
            long r3 = r13.A0B     // Catch:{ all -> 0x0abc }
            if (r18 != 0) goto L_0x02ff
            goto L_0x030f
        L_0x02ff:
            r16 = 0
            int r13 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r13 > 0) goto L_0x0307
            r3 = r23
        L_0x0307:
            X.2pa r14 = new X.2pa     // Catch:{ all -> 0x0abc }
            r13 = r18
            r14.<init>(r13, r3)     // Catch:{ all -> 0x0abc }
            goto L_0x0310
        L_0x030f:
            r14 = 0
        L_0x0310:
            if (r14 == 0) goto L_0x0382
            if (r11 == 0) goto L_0x0315
            goto L_0x0318
        L_0x0315:
            r11 = 0
        L_0x0316:
            r8 = 0
            goto L_0x032f
        L_0x0318:
            X.1ST r3 = r9.A00     // Catch:{ all -> 0x0abc }
            java.lang.String r13 = r10.A02     // Catch:{ all -> 0x0abc }
            byte[] r4 = r14.A01     // Catch:{ all -> 0x0abc }
            X.C18070vi.A0W(r4)     // Catch:{ all -> 0x0abc }
            X.205 r11 = r3.A0A(r11, r13, r4, r8)     // Catch:{ all -> 0x0abc }
            if (r11 == 0) goto L_0x0316
            X.1BI r3 = r11.A00     // Catch:{ all -> 0x0abc }
            boolean r3 = X.C22971Dz.A0a(r3)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0316
        L_0x032f:
            X.2qf r3 = r5.A03     // Catch:{ all -> 0x0abc }
            com.whatsapp.jid.UserJid r4 = r3.A00     // Catch:{ all -> 0x0abc }
            boolean r3 = X.C42701yb.A01(r4)     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x0346
            if (r11 == 0) goto L_0x033c
            goto L_0x033e
        L_0x033c:
            r3 = 0
            goto L_0x0340
        L_0x033e:
            X.1BI r3 = r11.A00     // Catch:{ all -> 0x0abc }
        L_0x0340:
            boolean r3 = X.C42701yb.A01(r3)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0354
        L_0x0346:
            if (r11 == 0) goto L_0x0356
            X.1BI r3 = r11.A00     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0356
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0abc }
            r3 = r21
            if (r4 != r3) goto L_0x0356
        L_0x0354:
            r4 = 0
            goto L_0x0357
        L_0x0356:
            r4 = 1
        L_0x0357:
            boolean r3 = X.C198119xo.A00(r14, r5, r9)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0370
            if (r8 != 0) goto L_0x037c
            if (r4 != 0) goto L_0x0374
            java.lang.String r4 = r10.A02     // Catch:{ all -> 0x0abc }
            X.9kN r19 = new X.9kN     // Catch:{ all -> 0x0abc }
            r3 = r19
            r3.<init>(r4, r7)     // Catch:{ all -> 0x0abc }
            X.9bE r12 = new X.9bE     // Catch:{ all -> 0x0abc }
            r12.<init>(r14, r7)     // Catch:{ all -> 0x0abc }
            goto L_0x0377
        L_0x0370:
            if (r8 != 0) goto L_0x037c
            if (r4 == 0) goto L_0x0379
        L_0x0374:
            r29 = r21
            goto L_0x0382
        L_0x0377:
            r29 = 3
        L_0x0379:
            r21 = r29
            goto L_0x0374
        L_0x037c:
            r21 = 4
            goto L_0x0374
        L_0x037f:
            r10 = 0
        L_0x0380:
            r4 = 0
            goto L_0x03af
        L_0x0382:
            X.2rc r4 = r10.A01     // Catch:{ all -> 0x0abc }
            java.io.File r8 = r2.A07     // Catch:{ all -> 0x0abc }
            X.C17960vV.A07(r8)     // Catch:{ all -> 0x0abc }
            boolean r3 = r4.A0V     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0380
            java.io.File r3 = r4.A0G     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0380
            boolean r3 = r3.isAbsolute()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0380
            java.io.File r3 = r4.A0G     // Catch:{ all -> 0x0abc }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0380
            java.io.File r3 = r4.A0G     // Catch:{ all -> 0x0abc }
            long r13 = r3.length()     // Catch:{ all -> 0x0abc }
            long r8 = r8.length()     // Catch:{ all -> 0x0abc }
            int r3 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0380
            java.io.File r4 = r4.A0G     // Catch:{ all -> 0x0abc }
        L_0x03af:
            boolean r3 = r12.A01     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x03b6
            if (r10 == 0) goto L_0x03b6
            goto L_0x03b8
        L_0x03b6:
            r3 = 0
            goto L_0x03ba
        L_0x03b8:
            X.2rc r3 = r10.A01     // Catch:{ all -> 0x0abc }
        L_0x03ba:
            X.9gF r11 = new X.9gF     // Catch:{ all -> 0x0abc }
            r23 = r11
            r24 = r3
            r26 = r19
            r27 = r12
            r28 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0abc }
        L_0x03c9:
            X.1TJ r8 = r1.A0E     // Catch:{ all -> 0x0abc }
            X.9bE r4 = r11.A04     // Catch:{ all -> 0x0abc }
            int r9 = r11.A00     // Catch:{ all -> 0x0abc }
            X.9bC r3 = new X.9bC     // Catch:{ all -> 0x0abc }
            r3.<init>(r4, r9)     // Catch:{ all -> 0x0abc }
            r8.A04(r3)     // Catch:{ all -> 0x0abc }
            X.1TJ r3 = r1.A0F     // Catch:{ all -> 0x0abc }
            r3.A04(r11)     // Catch:{ all -> 0x0abc }
            X.9kN r10 = r11.A03     // Catch:{ all -> 0x0abc }
            X.9kN r3 = r11.A02     // Catch:{ all -> 0x0abc }
            r35 = r3
            java.io.File r3 = r11.A05     // Catch:{ all -> 0x0abc }
            r1.A03 = r3     // Catch:{ all -> 0x0abc }
            X.2rc r3 = r11.A01     // Catch:{ all -> 0x0abc }
        L_0x03e8:
            java.lang.String r8 = r10.A00     // Catch:{ all -> 0x0abc }
            r34 = r8
            r0.A0A(r8)     // Catch:{ all -> 0x0abc }
            boolean r8 = r10.A01     // Catch:{ all -> 0x0abc }
            r19 = r8
            r1.A0F()     // Catch:{ all -> 0x0abc }
            r8 = r45
            int r8 = r8.A00     // Catch:{ all -> 0x0abc }
            if (r8 != 0) goto L_0x0400
            r8 = r45
            r8.A00 = r9     // Catch:{ all -> 0x0abc }
        L_0x0400:
            r8 = r35
            java.lang.String r12 = r8.A00     // Catch:{ all -> 0x0abc }
            r0.A09(r12)     // Catch:{ all -> 0x0abc }
            r1.A04 = r12     // Catch:{ all -> 0x0abc }
            java.lang.Integer r8 = X.AnonymousClass00R.A15     // Catch:{ all -> 0x0abc }
            A02(r1, r8)     // Catch:{ all -> 0x0abc }
            r1.A0F()     // Catch:{ all -> 0x0abc }
            boolean r8 = r2.A0F     // Catch:{ all -> 0x0abc }
            if (r8 != 0) goto L_0x044c
            int r9 = r5.A00()     // Catch:{ all -> 0x0abc }
            r8 = 3
            boolean r8 = X.AnonymousClass000.A1T(r9, r8)
            if (r8 != 0) goto L_0x044c
            boolean r3 = r1.A0J()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0446
        L_0x0426:
            if (r22 == 0) goto L_0x0436
            boolean r3 = r1.A0J()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0436
            r3 = r5
            X.68R r3 = (X.AnonymousClass68R) r3     // Catch:{ all -> 0x0abc }
            boolean r4 = r3.A02     // Catch:{ all -> 0x0abc }
            r3 = 1
            if (r4 == 0) goto L_0x0437
        L_0x0436:
            r3 = 0
        L_0x0437:
            if (r3 == 0) goto L_0x0446
            r3 = 100
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x043f }
            goto L_0x0442
        L_0x043f:
            X.AnonymousClass8BS.A0x()     // Catch:{ all -> 0x0abc }
        L_0x0442:
            r1.A0F()     // Catch:{ all -> 0x0abc }
            goto L_0x0426
        L_0x0446:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x044c:
            X.1SR r8 = r1.A0c     // Catch:{ all -> 0x0abc }
            java.io.File r10 = r2.A07     // Catch:{ all -> 0x0abc }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0abc }
            boolean r9 = r1.A0J()     // Catch:{ all -> 0x0abc }
            r7 = r42
            boolean r9 = r8.A07(r7, r10, r9)     // Catch:{ all -> 0x0abc }
            r7 = 5
            if (r9 != 0) goto L_0x046f
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = "unable to send media; was not eligible for encryption but must be encrypted; request="
            X.C17900vP.A0X(r5, r3, r4)     // Catch:{ all -> 0x0abc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x046f:
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0abc }
            boolean r9 = r1.A0J()     // Catch:{ all -> 0x0abc }
            r7 = r42
            boolean r7 = r8.A07(r7, r10, r9)     // Catch:{ all -> 0x0abc }
            X.C17960vV.A0D(r7)     // Catch:{ all -> 0x0abc }
            boolean r7 = X.C63972u0.A03(r42)     // Catch:{ all -> 0x0abc }
            if (r7 == 0) goto L_0x0494
            if (r9 == 0) goto L_0x0488
            goto L_0x048d
        L_0x0488:
            X.1SQ r7 = X.AnonymousClass1SO.A03(r10)     // Catch:{ all -> 0x0abc }
            goto L_0x048f
        L_0x048d:
            X.1SQ r7 = X.AnonymousClass1SR.A07     // Catch:{ all -> 0x0abc }
        L_0x048f:
            java.lang.String r7 = X.AnonymousClass1SO.A06(r7)     // Catch:{ all -> 0x0abc }
            goto L_0x04b0
        L_0x0494:
            boolean r7 = X.C63972u0.A09(r42)     // Catch:{ all -> 0x0abc }
            if (r7 == 0) goto L_0x04af
            X.1SP r7 = X.AnonymousClass1SO.A04(r10)     // Catch:{ all -> 0x0abc }
            int r9 = r7.A01     // Catch:{ all -> 0x0abc }
            r7 = 7
            if (r9 != r7) goto L_0x04a6
            java.lang.String r7 = "video/quicktime"
            goto L_0x04b0
        L_0x04a6:
            r7 = 3
            if (r9 != r7) goto L_0x04ac
            java.lang.String r7 = "video/3gpp"
            goto L_0x04b0
        L_0x04ac:
            java.lang.String r7 = "video/mp4"
            goto L_0x04b0
        L_0x04af:
            r7 = 0
        L_0x04b0:
            if (r7 == 0) goto L_0x04b6
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0C = r7     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x04b6:
            X.2pa r13 = r4.A00     // Catch:{ all -> 0x0abc }
            if (r13 == 0) goto L_0x04cf
            byte[] r9 = r13.A01     // Catch:{ all -> 0x0abc }
        L_0x04bc:
            X.B7x r7 = r1.A0K     // Catch:{ all -> 0x0abc }
            X.9dF r11 = r7.BIV(r9)     // Catch:{ all -> 0x0abc }
            r7 = r30
            X.3Kt r18 = r7.BRG(r9)     // Catch:{ all -> 0x0abc }
            boolean r7 = r5.A01()     // Catch:{ all -> 0x0abc }
            if (r7 == 0) goto L_0x04ec
            goto L_0x04d2
        L_0x04cf:
            byte[] r9 = A0o     // Catch:{ all -> 0x0abc }
            goto L_0x04bc
        L_0x04d2:
            if (r13 != 0) goto L_0x04dc
            r3 = 30
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x04dc:
            byte[] r14 = r11.A00     // Catch:{ all -> 0x0abc }
            byte[] r9 = r11.A02     // Catch:{ all -> 0x0abc }
            byte[] r7 = r11.A01     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A00 = r13     // Catch:{ all -> 0x0ab9 }
            r0.A0M = r14     // Catch:{ all -> 0x0ab9 }
            r0.A0O = r9     // Catch:{ all -> 0x0ab9 }
            r0.A0P = r7     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x04ec:
            r1.A0F()     // Catch:{ all -> 0x0abc }
            X.2qf r9 = r5.A03     // Catch:{ all -> 0x0abc }
            boolean r7 = r9.A03     // Catch:{ all -> 0x0abc }
            if (r7 == 0) goto L_0x0526
            boolean r7 = r9.A02     // Catch:{ all -> 0x0abc }
            if (r7 != 0) goto L_0x0526
            java.lang.String r28 = "status"
        L_0x04fb:
            r7 = r45
            java.lang.String r9 = r7.A0D     // Catch:{ all -> 0x0abc }
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r9 == 0) goto L_0x0523
            java.util.UUID r7 = java.util.UUID.fromString(r9)     // Catch:{ all -> 0x0abc }
            long r13 = r7.getMostSignificantBits()     // Catch:{ all -> 0x0abc }
            long r13 = r13 & r16
            java.lang.Long r23 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0abc }
        L_0x0514:
            X.1SU r13 = r1.A0V     // Catch:{ all -> 0x0abc }
            java.util.List r7 = r2.A0C     // Catch:{ all -> 0x0abc }
            java.util.List r7 = r13.A00(r7)     // Catch:{ all -> 0x0abc }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0abc }
            if (r7 != 0) goto L_0x052c
            goto L_0x0529
        L_0x0523:
            r23 = 0
            goto L_0x0514
        L_0x0526:
            r28 = 0
            goto L_0x04fb
        L_0x0529:
            if (r9 == 0) goto L_0x052c
            goto L_0x052f
        L_0x052c:
            r24 = 0
            goto L_0x053d
        L_0x052f:
            java.util.UUID r7 = java.util.UUID.fromString(r9)     // Catch:{ all -> 0x0abc }
            long r13 = r7.getLeastSignificantBits()     // Catch:{ all -> 0x0abc }
            long r13 = r13 & r16
            java.lang.Long r24 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0abc }
        L_0x053d:
            boolean r7 = r5.A01()     // Catch:{ all -> 0x0abc }
            if (r7 == 0) goto L_0x055e
            java.lang.String r14 = r1.A04     // Catch:{ all -> 0x0abc }
        L_0x0545:
            java.lang.String r7 = r2.A0B     // Catch:{ all -> 0x0abc }
            r27 = r7
            X.1SY r7 = r1.A0S     // Catch:{ all -> 0x0abc }
            r21 = r7
            boolean r30 = r1.A0J()     // Catch:{ all -> 0x0abc }
            boolean r7 = r1.A0J()     // Catch:{ all -> 0x0abc }
            if (r7 == 0) goto L_0x0561
            boolean r7 = r1.A0l     // Catch:{ all -> 0x0abc }
            r31 = 1
            if (r7 != 0) goto L_0x0563
            goto L_0x0561
        L_0x055e:
            r14 = r34
            goto L_0x0545
        L_0x0561:
            r31 = 0
        L_0x0563:
            boolean r7 = r2.A0I     // Catch:{ all -> 0x0abc }
            r17 = r7
            int r13 = r2.A02     // Catch:{ all -> 0x0abc }
            X.1So r9 = X.C26551So.A0d     // Catch:{ all -> 0x0abc }
            r7 = r42
            if (r7 != r9) goto L_0x0581
            r7 = 10
            if (r13 != r7) goto L_0x0581
            r13 = 9096(0x2388, float:1.2746E-41)
            X.0vf r9 = X.C18040vf.A02     // Catch:{ all -> 0x0abc }
            r7 = r43
            boolean r7 = X.C18020vd.A05(r9, r7, r13)     // Catch:{ all -> 0x0abc }
            r32 = 1
            if (r7 != 0) goto L_0x0583
        L_0x0581:
            r32 = 0
        L_0x0583:
            r9 = r43
            r7 = r42
            boolean r33 = X.C25291Nq.A05(r9, r7)     // Catch:{ all -> 0x0abc }
            if (r14 == 0) goto L_0x0a90
            X.99o r16 = new X.99o     // Catch:{ all -> 0x0abc }
            r22 = r21
            r25 = r14
            r26 = r41
            r29 = r17
            r21 = r16
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0abc }
            r7 = r16
            r1.A02 = r7     // Catch:{ all -> 0x0abc }
            r1.A0F()     // Catch:{ all -> 0x0abc }
            r7 = 6
            android.net.TrafficStats.setThreadStatsTag(r7)     // Catch:{ all -> 0x0abc }
            boolean r4 = r4.A01     // Catch:{ all -> 0x0abc }
            if (r4 == 0) goto L_0x05b2
            r3 = 0
            r1.A00 = r3     // Catch:{ all -> 0x0abc }
            r7 = 0
            goto L_0x064b
        L_0x05b2:
            if (r3 == 0) goto L_0x0606
            java.lang.String r4 = r3.A0J     // Catch:{ all -> 0x0abc }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0abc }
            if (r4 != 0) goto L_0x0606
            r9 = 12718(0x31ae, float:1.7822E-41)
            X.0vf r7 = X.C18040vf.A02     // Catch:{ all -> 0x0abc }
            r4 = r43
            boolean r4 = X.C18020vd.A05(r7, r4, r9)     // Catch:{ all -> 0x0abc }
            if (r4 == 0) goto L_0x0606
            r0.A09(r12)     // Catch:{ all -> 0x0abc }
            r4 = r34
            r0.A0A(r4)     // Catch:{ all -> 0x0abc }
            X.1SJ r9 = r1.A0R     // Catch:{ all -> 0x0abc }
            java.lang.String r7 = r3.A0J     // Catch:{ all -> 0x0abc }
            r4 = 0
            java.lang.String r4 = r9.A00(r7, r4)     // Catch:{ all -> 0x0abc }
            r0.A08(r4)     // Catch:{ all -> 0x0abc }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0abc }
            java.lang.String r4 = "https://mmg.whatsapp.net"
            r7.append(r4)     // Catch:{ all -> 0x0abc }
            java.lang.String r4 = r0.A03()     // Catch:{ all -> 0x0abc }
            java.lang.String r4 = X.AnonymousClass000.A0y(r4, r7)     // Catch:{ all -> 0x0abc }
            r0.A0B(r4)     // Catch:{ all -> 0x0abc }
            java.io.File r3 = r3.A0G     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x05fb
            long r3 = r3.length()     // Catch:{ all -> 0x05f9 }
            goto L_0x05fd
        L_0x05f9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0abc }
        L_0x05fb:
            r3 = 0
        L_0x05fd:
            r1.A00 = r3     // Catch:{ all -> 0x0abc }
            java.lang.Integer r3 = X.AnonymousClass00R.A0D     // Catch:{ all -> 0x0abc }
            A02(r1, r3)     // Catch:{ all -> 0x0abc }
            r7 = 1
            goto L_0x064b
        L_0x0606:
            java.lang.String r7 = r1.A04     // Catch:{ all -> 0x0abc }
            r4 = r20
            r3 = r16
            X.9gh r7 = A00(r4, r1, r3, r7)     // Catch:{ all -> 0x0abc }
            X.9eo r3 = r7.A02     // Catch:{ all -> 0x0abc }
            r6.A01 = r3     // Catch:{ all -> 0x0abc }
            X.1SJ r9 = r1.A0R     // Catch:{ all -> 0x0abc }
            java.lang.String r4 = r7.A03     // Catch:{ all -> 0x0abc }
            r3 = 0
            java.lang.String r3 = r9.A00(r4, r3)     // Catch:{ all -> 0x0abc }
            r0.A08(r3)     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r7.A04     // Catch:{ all -> 0x0abc }
            r0.A0B(r3)     // Catch:{ all -> 0x0abc }
            int r3 = r7.A01     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x062f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x062f:
            java.util.List r4 = r7.A05     // Catch:{ all -> 0x0abc }
            boolean r3 = X.C137476vW.A00(r4)     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x063f
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r3 = 0
            X.C18070vi.A0d(r4, r3)     // Catch:{ all -> 0x0ab9 }
            r0.A0J = r4     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x063f:
            int r3 = r7.A00     // Catch:{ all -> 0x0abc }
            long r3 = (long) r3     // Catch:{ all -> 0x0abc }
            r1.A00 = r3     // Catch:{ all -> 0x0abc }
            boolean r7 = r7.A06     // Catch:{ all -> 0x0abc }
            java.lang.Integer r3 = X.AnonymousClass00R.A0D     // Catch:{ all -> 0x0abc }
            A02(r1, r3)     // Catch:{ all -> 0x0abc }
        L_0x064b:
            r1.A0F()     // Catch:{ all -> 0x0abc }
            X.0vc r4 = r1.A0f     // Catch:{ all -> 0x0abc }
            X.17r r3 = r1.A08     // Catch:{ all -> 0x0abc }
            X.C26511Sk.A0P(r3, r4)     // Catch:{ all -> 0x0abc }
            boolean r3 = X.C63972u0.A09(r42)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x068d
            X.C17960vV.A07(r10)     // Catch:{ 1Se -> 0x0687 }
            com.whatsapp.media.WamediaManager r3 = r1.A0T     // Catch:{ 1Se -> 0x0687 }
            X.71x r9 = new X.71x     // Catch:{ 1Se -> 0x0687 }
            r9.<init>(r3, r10)     // Catch:{ 1Se -> 0x0687 }
            boolean r3 = r9.A02()     // Catch:{ 1Se -> 0x0687 }
            if (r3 == 0) goto L_0x0671
            int r4 = r9.A00     // Catch:{ 1Se -> 0x0687 }
            int r3 = r9.A02     // Catch:{ 1Se -> 0x0687 }
        L_0x066f:
            monitor-enter(r0)     // Catch:{ 1Se -> 0x0687 }
            goto L_0x0676
        L_0x0671:
            int r4 = r9.A02     // Catch:{ 1Se -> 0x0687 }
            int r3 = r9.A00     // Catch:{ 1Se -> 0x0687 }
            goto L_0x066f
        L_0x0676:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0684 }
            r0.A03 = r3     // Catch:{ all -> 0x0684 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0684 }
            r0.A04 = r3     // Catch:{ all -> 0x0684 }
            monitor-exit(r0)     // Catch:{ 1Se -> 0x0687 }
            goto L_0x068d
        L_0x0684:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ 1Se -> 0x0687 }
            throw r3     // Catch:{ 1Se -> 0x0687 }
        L_0x0687:
            r4 = move-exception
            java.lang.String r3 = "MMS upload unable to get video meta"
            com.whatsapp.util.Log.w(r3, r4)     // Catch:{ all -> 0x0abc }
        L_0x068d:
            if (r7 == 0) goto L_0x074d
            boolean r3 = A04(r1)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x073d
            java.lang.Integer r3 = X.AnonymousClass00R.A0A     // Catch:{ all -> 0x0abc }
            A02(r1, r3)     // Catch:{ all -> 0x0abc }
            X.1ST r12 = r1.A0M     // Catch:{ all -> 0x0abc }
            java.lang.String r9 = r1.A04     // Catch:{ all -> 0x0abc }
            X.2pa r3 = r0.A00()     // Catch:{ all -> 0x0abc }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0abc }
            byte[] r7 = r3.A01     // Catch:{ all -> 0x0abc }
            r4 = 0
            r3 = r34
            X.205 r7 = r12.A0A(r3, r9, r7, r4)     // Catch:{ all -> 0x0abc }
            if (r7 == 0) goto L_0x06b7
            X.1SX r3 = r1.A0N     // Catch:{ all -> 0x0abc }
            X.2d7 r4 = r3.A00(r7)     // Catch:{ all -> 0x0abc }
            goto L_0x06b8
        L_0x06b7:
            r4 = 0
        L_0x06b8:
            if (r4 == 0) goto L_0x06e1
            byte[] r3 = r4.A00     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x06e1
            int r3 = r3.length     // Catch:{ all -> 0x0abc }
            if (r3 <= 0) goto L_0x06e1
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A02 = r4     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
            int[] r3 = r4.A01     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x06de
            X.00H r3 = r8.A03     // Catch:{ all -> 0x0abc }
            X.206 r3 = X.AnonymousClass1W2.A01(r7, r3)     // Catch:{ all -> 0x0abc }
            X.21V r3 = (X.AnonymousClass21V) r3     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x06de
            X.2rc r3 = r3.A02     // Catch:{ all -> 0x0abc }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A0O     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0E = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x06de:
            r9 = 0
            r4 = 0
            goto L_0x0743
        L_0x06e1:
            int[] r4 = r2.A0J     // Catch:{ all -> 0x0abc }
            if (r4 == 0) goto L_0x071d
            int r3 = r4.length     // Catch:{ all -> 0x0abc }
            if (r3 <= 0) goto L_0x071d
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0abc }
            r3 = r18
            X.AiG r7 = r8.A04(r3, r10, r4)     // Catch:{ all -> 0x0abc }
            X.9HQ r3 = r7.A00     // Catch:{ all -> 0x0737 }
            X.8oM r9 = new X.8oM     // Catch:{ IOException -> 0x0716 }
            r9.<init>(r11, r3, r4)     // Catch:{ IOException -> 0x0716 }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x070c }
        L_0x06fc:
            int r3 = r9.read(r4)     // Catch:{ all -> 0x070c }
            if (r3 >= 0) goto L_0x06fc
            X.9j6 r4 = r9.A04     // Catch:{ all -> 0x070c }
            r9.close()     // Catch:{ IOException -> 0x0716 }
            X.9en r9 = r7.A00()     // Catch:{ all -> 0x0737 }
            goto L_0x0740
        L_0x070c:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x0711 }
            goto L_0x0715
        L_0x0711:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ IOException -> 0x0716 }
        L_0x0715:
            throw r2     // Catch:{ IOException -> 0x0716 }
        L_0x0716:
            r2 = move-exception
            java.lang.String r0 = "mediaupload/calculate-sidecar/ioexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0737 }
            throw r2     // Catch:{ all -> 0x0737 }
        L_0x071d:
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0abc }
            java.io.InputStream r4 = X.AnonymousClass1SR.A02(r5, r8, r10)     // Catch:{ all -> 0x0abc }
            r3 = r18
            X.AiG r7 = r8.A05(r3, r4)     // Catch:{ all -> 0x0abc }
            X.9HQ r4 = r7.A00     // Catch:{ all -> 0x0737 }
            r3 = 65536(0x10000, float:9.18355E-41)
            X.9j6 r4 = X.AnonymousClass1SR.A01(r11, r4, r3)     // Catch:{ all -> 0x0737 }
            X.9en r9 = r7.A00()     // Catch:{ all -> 0x0737 }
            goto L_0x0740
        L_0x0737:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x09a5 }
            goto L_0x0abb
        L_0x073d:
            r9 = 0
            r4 = 0
            goto L_0x0748
        L_0x0740:
            r7.close()     // Catch:{ all -> 0x0abc }
        L_0x0743:
            java.lang.Integer r3 = X.AnonymousClass00R.A0B     // Catch:{ all -> 0x0abc }
            A02(r1, r3)     // Catch:{ all -> 0x0abc }
        L_0x0748:
            r3 = 1
            r1.A06 = r3     // Catch:{ all -> 0x0abc }
            goto L_0x0907
        L_0x074d:
            r4 = 1
            boolean r3 = r1.A0k     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0759
            r1.A0n = r4     // Catch:{ all -> 0x0abc }
            X.B5x r3 = r1.A0g     // Catch:{ all -> 0x0abc }
            r15.registerObserver(r3)     // Catch:{ all -> 0x0abc }
        L_0x0759:
            X.1SZ r3 = r1.A0b     // Catch:{ all -> 0x0abc }
            java.lang.String r30 = r5.toString()     // Catch:{ all -> 0x0abc }
            java.util.concurrent.atomic.AtomicReference r4 = r1.A05     // Catch:{ all -> 0x0abc }
            r31 = r4
            int[] r14 = r2.A0J     // Catch:{ all -> 0x0abc }
            X.0ve r13 = r3.A01     // Catch:{ all -> 0x0abc }
            X.1Ka r12 = r3.A00     // Catch:{ all -> 0x0abc }
            X.00H r4 = r3.A04     // Catch:{ all -> 0x0abc }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x0abc }
            X.4Yt r9 = (X.C88214Yt) r9     // Catch:{ all -> 0x0abc }
            X.1KX r7 = r3.A03     // Catch:{ all -> 0x0abc }
            X.1SV r4 = r3.A02     // Catch:{ all -> 0x0abc }
            X.00H r3 = r3.A05     // Catch:{ all -> 0x0abc }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0abc }
            X.1Kq r3 = (X.C24521Kq) r3     // Catch:{ all -> 0x0abc }
            X.9hp r21 = new X.9hp     // Catch:{ all -> 0x0abc }
            r22 = r3
            r23 = r12
            r24 = r13
            r25 = r4
            r26 = r7
            r27 = r1
            r28 = r6
            r29 = r9
            r32 = r14
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0abc }
            java.lang.Integer r3 = X.AnonymousClass00R.A18     // Catch:{ all -> 0x0abc }
            A02(r1, r3)     // Catch:{ all -> 0x0abc }
            X.AVW r4 = new X.AVW     // Catch:{ all -> 0x0abc }
            r22 = r4
            r23 = r11
            r24 = r18
            r25 = r20
            r26 = r1
            r27 = r21
            r28 = r16
            r22.<init>(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0abc }
            r3 = r20
            java.lang.Object r12 = r3.A00(r4)     // Catch:{ all -> 0x0abc }
            X.9gi r12 = (X.C187999gi) r12     // Catch:{ all -> 0x0abc }
            java.lang.Integer r3 = X.AnonymousClass00R.A09     // Catch:{ all -> 0x0abc }
            A02(r1, r3)     // Catch:{ all -> 0x0abc }
            java.lang.Integer r3 = X.AnonymousClass00R.A0D     // Catch:{ all -> 0x0abc }
            A02(r1, r3)     // Catch:{ all -> 0x0abc }
            if (r12 != 0) goto L_0x07cd
            java.lang.String r3 = "mediaupload/failed-network; no routes to upload"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0abc }
            r3 = 33
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x07cd:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = "mediaupload/transfer completed; result = "
            r4.append(r3)     // Catch:{ all -> 0x0abc }
            int r7 = r12.A05     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = X.C137266vB.A00(r7)     // Catch:{ all -> 0x0abc }
            r4.append(r3)     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = "; cancelled = "
            r4.append(r3)     // Catch:{ all -> 0x0abc }
            java.util.concurrent.FutureTask r3 = r1.A02     // Catch:{ all -> 0x0abc }
            r17 = r3
            boolean r3 = r17.isCancelled()     // Catch:{ all -> 0x0abc }
            X.C17900vP.A0r(r4, r3)     // Catch:{ all -> 0x0abc }
            r9 = 17
            if (r7 != r9) goto L_0x0802
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = "mediaupload/failed-network; request="
            X.C17900vP.A0X(r5, r3, r4)     // Catch:{ all -> 0x0abc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x0802:
            X.9en r9 = r12.A02     // Catch:{ all -> 0x0abc }
            X.9dT r3 = r12.A01     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0820
            X.9j6 r4 = r3.A00     // Catch:{ all -> 0x0abc }
        L_0x080a:
            r3 = r18
            java.lang.String r13 = r1.A0H(r3)     // Catch:{ all -> 0x0abc }
            if (r13 != 0) goto L_0x0822
            boolean r3 = r5.A01()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0822
            r3 = 37
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x0820:
            r4 = 0
            goto L_0x080a
        L_0x0822:
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x089a
            java.lang.String r3 = r3.A08     // Catch:{ all -> 0x0abc }
            r0.A0B(r3)     // Catch:{ all -> 0x0abc }
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A03     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A08 = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A01     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A06 = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
            X.1SJ r15 = r1.A0R     // Catch:{ all -> 0x0abc }
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A00     // Catch:{ all -> 0x0abc }
            r14 = 1
            java.lang.String r3 = r15.A00(r3, r14)     // Catch:{ all -> 0x0abc }
            r0.A08(r3)     // Catch:{ all -> 0x0abc }
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A05     // Catch:{ all -> 0x0abc }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x085f
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A05     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r15.A00(r3, r14)     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0F = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x085f:
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A06     // Catch:{ all -> 0x0abc }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x0871
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A06     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0G = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x0871:
            r0.A09(r13)     // Catch:{ all -> 0x0abc }
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A04     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0B = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A02     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A07 = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = r3.A07     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0H = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
            X.9hT r3 = r12.A03     // Catch:{ all -> 0x0abc }
            java.util.List r3 = r3.A09     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0896
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0J = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x0896:
            boolean r3 = r12.A04     // Catch:{ all -> 0x0abc }
            r1.A06 = r3     // Catch:{ all -> 0x0abc }
        L_0x089a:
            boolean r3 = r1.A0J()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0908
            java.lang.Object r3 = r31.get()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0908
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0abc }
            java.lang.String r3 = X.C1402370n.A00(r10)     // Catch:{ all -> 0x0abc }
            r0.A0A(r3)     // Catch:{ all -> 0x0abc }
            r0.A09(r13)     // Catch:{ all -> 0x0abc }
            if (r7 != 0) goto L_0x0908
            boolean r3 = r17.isCancelled()     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x0908
            boolean r3 = r1.A0l     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x0908
            java.lang.String r3 = "MediaUpload/call Sending streaming finalize request"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0abc }
            X.9dV r15 = r1.A0e     // Catch:{ all -> 0x0abc }
            X.2k8 r3 = A01(r1)     // Catch:{ all -> 0x0abc }
            java.lang.String r14 = r3.A00()     // Catch:{ all -> 0x0abc }
            X.AVV r12 = new X.AVV     // Catch:{ all -> 0x0abc }
            r3 = r16
            r12.<init>(r15, r3, r13, r14)     // Catch:{ all -> 0x0abc }
            r3 = r20
            java.lang.Object r12 = r3.A00(r12)     // Catch:{ all -> 0x0abc }
            X.9fc r12 = (X.C187319fc) r12     // Catch:{ all -> 0x0abc }
            if (r12 != 0) goto L_0x08e4
            X.9fc r12 = new X.9fc     // Catch:{ all -> 0x0abc }
            r12.<init>()     // Catch:{ all -> 0x0abc }
        L_0x08e4:
            X.6iI r3 = r12.A01     // Catch:{ all -> 0x0abc }
            r6.A00 = r3     // Catch:{ all -> 0x0abc }
            boolean r3 = r12.A04     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0901
            java.lang.String r3 = r12.A03     // Catch:{ all -> 0x0abc }
            r0.A0B(r3)     // Catch:{ all -> 0x0abc }
            X.1SJ r14 = r1.A0R     // Catch:{ all -> 0x0abc }
            java.lang.String r12 = r12.A02     // Catch:{ all -> 0x0abc }
            r3 = 1
            java.lang.String r3 = r14.A00(r12, r3)     // Catch:{ all -> 0x0abc }
            r0.A08(r3)     // Catch:{ all -> 0x0abc }
            r0.A09(r13)     // Catch:{ all -> 0x0abc }
            goto L_0x0908
        L_0x0901:
            java.lang.Integer r5 = X.C108955ca.A0g()     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x0907:
            r7 = 0
        L_0x0908:
            if (r7 != 0) goto L_0x0965
            if (r9 == 0) goto L_0x0965
            java.lang.String r12 = r9.A00     // Catch:{ all -> 0x0abc }
            r3 = r35
            boolean r3 = r3.A01     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x0926
            java.lang.String r3 = r1.A04     // Catch:{ all -> 0x0abc }
            boolean r3 = r12.equals(r3)     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x0926
            java.lang.String r3 = "mediaupload/optimistic-hash-fail"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0abc }
            r0.A09(r12)     // Catch:{ all -> 0x0abc }
            r13 = 1
            goto L_0x0927
        L_0x0926:
            r13 = 0
        L_0x0927:
            java.lang.String r12 = r9.A02     // Catch:{ all -> 0x0abc }
            if (r19 == 0) goto L_0x0941
            r3 = r34
            boolean r3 = r12.equals(r3)     // Catch:{ all -> 0x0abc }
            if (r3 != 0) goto L_0x0941
            java.lang.String r3 = "mediaupload/optimistic-plaintext-hash-fail"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0abc }
            r0.A0A(r12)     // Catch:{ all -> 0x0abc }
        L_0x093b:
            java.lang.Integer r5 = X.C108955ca.A0h()     // Catch:{ all -> 0x0abc }
            goto L_0x0a02
        L_0x0941:
            if (r13 != 0) goto L_0x093b
            boolean r3 = A04(r1)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x095f
            if (r4 == 0) goto L_0x095f
            byte[] r12 = r4.A00()     // Catch:{ all -> 0x0abc }
            if (r12 == 0) goto L_0x095f
            int r3 = r12.length     // Catch:{ all -> 0x0abc }
            if (r3 <= 0) goto L_0x095f
            int[] r4 = r2.A0J     // Catch:{ all -> 0x0abc }
            X.2d7 r3 = new X.2d7     // Catch:{ all -> 0x0abc }
            r3.<init>(r12, r4)     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A02 = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x095f:
            java.lang.String r3 = r9.A01     // Catch:{ all -> 0x0abc }
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0E = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x0965:
            int r4 = r2.A00     // Catch:{ all -> 0x0abc }
            if (r4 <= 0) goto L_0x09ab
            boolean r3 = X.C63972u0.A07(r42)     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x09ab
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0abc }
            long r3 = (long) r4     // Catch:{ all -> 0x0abc }
            r12 = 15
            long r3 = r3 + r12
            r12 = 16
            long r3 = r3 / r12
            long r3 = r3 * r12
            int r9 = (int) r3     // Catch:{ all -> 0x0abc }
            java.io.InputStream r4 = X.AnonymousClass1SR.A02(r5, r8, r10)     // Catch:{ all -> 0x0abc }
            r3 = r18
            X.AiG r10 = r8.A05(r3, r4)     // Catch:{ all -> 0x0abc }
            X.9HQ r8 = r10.A00     // Catch:{ all -> 0x099f }
            long r3 = (long) r9     // Catch:{ all -> 0x099f }
            X.6QY r5 = new X.6QY     // Catch:{ all -> 0x099f }
            r5.<init>(r8, r3)     // Catch:{ all -> 0x099f }
            X.9j6 r3 = X.AnonymousClass1SR.A01(r11, r5, r9)     // Catch:{ all -> 0x099f }
            byte[] r3 = r3.A00()     // Catch:{ all -> 0x099f }
            r10.close()     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x09ab
            monitor-enter(r0)     // Catch:{ all -> 0x0abc }
            r0.A0N = r3     // Catch:{ all -> 0x0ab9 }
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
            goto L_0x09ab
        L_0x099f:
            r2 = move-exception
            r10.close()     // Catch:{ all -> 0x09a5 }
            goto L_0x0abb
        L_0x09a5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x0abc }
            goto L_0x0abb
        L_0x09ab:
            r3 = 5
            if (r7 == r3) goto L_0x09c2
            r3 = 21
            if (r7 == r3) goto L_0x09c2
            r3 = 35
            if (r7 == r3) goto L_0x09c2
            r3 = 36
            if (r7 == r3) goto L_0x09c2
            r3 = 24
            if (r7 == r3) goto L_0x09c2
            r3 = 34
            if (r7 != r3) goto L_0x09c9
        L_0x09c2:
            r3 = 0
            r0.A09(r3)     // Catch:{ all -> 0x0abc }
            r0.A0A(r3)     // Catch:{ all -> 0x0abc }
        L_0x09c9:
            r1.A0F()     // Catch:{ all -> 0x0abc }
            if (r7 != 0) goto L_0x09fe
            java.lang.Long r10 = r6.A09     // Catch:{ all -> 0x0abc }
            if (r10 == 0) goto L_0x09fe
            java.lang.Long r4 = r6.A0G     // Catch:{ all -> 0x0abc }
            if (r4 == 0) goto L_0x09eb
            java.lang.Long r3 = r6.A0F     // Catch:{ all -> 0x0abc }
            if (r3 == 0) goto L_0x09eb
            long r8 = r3.longValue()     // Catch:{ all -> 0x0abc }
            long r3 = r4.longValue()     // Catch:{ all -> 0x0abc }
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x09eb
            java.lang.Long r3 = X.C108945cZ.A1B(r8, r3)     // Catch:{ all -> 0x0abc }
            goto L_0x09ec
        L_0x09eb:
            r3 = 0
        L_0x09ec:
            if (r3 == 0) goto L_0x09fe
            long r11 = r10.longValue()     // Catch:{ all -> 0x0abc }
            long r13 = r3.longValue()     // Catch:{ all -> 0x0abc }
            r10 = 0
            r8 = r44
            r9 = r42
            r8.BBK(r9, r10, r11, r13)     // Catch:{ all -> 0x0abc }
        L_0x09fe:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0abc }
        L_0x0a02:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r4 = r2.A07
            X.C17960vV.A07(r4)
            long r2 = r4.length()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.A0D = r2
            java.lang.Integer r2 = r0.A01()
            if (r2 == 0) goto L_0x0a2f
            java.lang.Integer r2 = r0.A02()
            if (r2 == 0) goto L_0x0a2f
            java.lang.Integer r2 = r0.A01()
            java.lang.Long r2 = X.C17890vO.A0N(r2)
            r6.A0C = r2
            java.lang.Integer r0 = r0.A02()
            goto L_0x0a79
        L_0x0a2f:
            boolean r0 = X.C63972u0.A04(r42)
            if (r0 == 0) goto L_0x0a7f
            X.C17960vV.A07(r4)
            android.util.Pair r2 = X.C26511Sk.A0B(r4)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Long r0 = X.C17890vO.A0N(r0)
            r6.A0C = r0
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            goto L_0x0a79
        L_0x0a4b:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r4 = r2.A07
            X.C17960vV.A07(r4)
            long r2 = r4.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.A0D = r0
            X.9un r2 = r1.A0Z
            java.lang.Integer r0 = r2.A01()
            if (r0 == 0) goto L_0x0a2f
            java.lang.Integer r0 = r2.A02()
            if (r0 == 0) goto L_0x0a2f
            java.lang.Integer r0 = r2.A01()
            java.lang.Long r0 = X.C17890vO.A0N(r0)
            r6.A0C = r0
            java.lang.Integer r0 = r2.A02()
        L_0x0a79:
            java.lang.Long r0 = X.C17890vO.A0N(r0)
            r6.A0E = r0
        L_0x0a7f:
            X.9kM r0 = r1.A01
            if (r0 == 0) goto L_0x0a8f
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.get()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r6.A0H = r0
        L_0x0a8f:
            return r5
        L_0x0a90:
            java.lang.String r0 = "mediaHash and fileType not both present for upload URL generation"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0abc }
            goto L_0x0abb
        L_0x0a97:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0abc }
            java.lang.String r0 = "mediaupload/hash-calculate/file not found; message.key="
            X.C17900vP.A0e(r0, r4, r2)     // Catch:{ all -> 0x0abc }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0abc }
            java.lang.String r0 = "File not found: "
            r2.append(r0)     // Catch:{ all -> 0x0abc }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0abc }
            java.lang.String r0 = X.C17890vO.A0V(r3, r2)     // Catch:{ all -> 0x0abc }
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0abc }
            r2.<init>(r0)     // Catch:{ all -> 0x0abc }
            goto L_0x0abb
        L_0x0ab6:
            r2 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0abc }
            goto L_0x0abb
        L_0x0ab9:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0abc }
        L_0x0abb:
            throw r2     // Catch:{ all -> 0x0abc }
        L_0x0abc:
            r8 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            X.9i7 r3 = r1.A0a
            X.2rU r0 = r1.A0W
            X.2h8 r7 = r0.A02
            java.io.File r6 = r7.A07
            X.C17960vV.A07(r6)
            long r4 = r6.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.A0D = r0
            X.9un r2 = r1.A0Z
            java.lang.Integer r0 = r2.A01()
            if (r0 == 0) goto L_0x0b08
            java.lang.Integer r0 = r2.A02()
            if (r0 == 0) goto L_0x0b08
            java.lang.Integer r0 = r2.A01()
            java.lang.Long r0 = X.C17890vO.A0N(r0)
            r3.A0C = r0
            java.lang.Integer r0 = r2.A02()
        L_0x0af1:
            java.lang.Long r0 = X.C17890vO.A0N(r0)
            r3.A0E = r0
        L_0x0af7:
            X.9kM r0 = r1.A01
            if (r0 == 0) goto L_0x0b07
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.get()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r3.A0H = r0
        L_0x0b07:
            throw r8
        L_0x0b08:
            X.1So r0 = r7.A06
            boolean r0 = X.C63972u0.A04(r0)
            if (r0 == 0) goto L_0x0af7
            X.C17960vV.A07(r6)
            android.util.Pair r2 = X.C26511Sk.A0B(r6)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Long r0 = X.C17890vO.A0N(r0)
            r3.A0C = r0
            java.lang.Object r0 = r2.second
            java.lang.Number r0 = (java.lang.Number) r0
            goto L_0x0af1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167228ff.A0E():java.lang.Object");
    }

    public String A0H(C72133Kt r7) {
        if (!(this instanceof C173528vE)) {
            return this.A04;
        }
        C173528vE r4 = (C173528vE) this;
        C62492rU r2 = r4.A0W;
        AnonymousClass68R r5 = (AnonymousClass68R) r2;
        C17960vV.A0F(r5.A02, "Cannot calculate final hash before recording finished");
        String str = r4.A00;
        if (str != null) {
            return str;
        }
        AnonymousClass1SR r1 = r4.A0c;
        File file = r2.A02.A07;
        C17960vV.A07(file);
        C21331AiG A032 = r1.A03(r7, r5, file);
        try {
            while (A032.A00.read(new byte[16384]) >= 0) {
            }
        } catch (IOException e) {
            Log.w(AnonymousClass001.A1E(r5, "IOException while computing ciphertext sha-256; skipping duplicate detection; request=", AnonymousClass000.A10()), e);
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        String str2 = A032.A00().A00;
        A032.close();
        r4.A00 = str2;
        return str2;
    }

    public boolean A0J() {
        if (this instanceof C173528vE) {
            return AnonymousClass3Ma.A1Z(this.A0W.A02.A06, C26551So.A0W);
        }
        return false;
    }

    public byte[] A0K(C72133Kt r7) {
        String str;
        if (!(this instanceof C173528vE) || !this.A0l) {
            return null;
        }
        JSONObject A15 = C17880vN.A15();
        AnonymousClass68R r2 = (AnonymousClass68R) this.A0W;
        if (r2.A01) {
            str = "sent";
        } else {
            str = "canceled";
        }
        A15.put("status", str);
        if (r2.A01) {
            A15.put("hash", A0H(r7));
        }
        byte[] bytes = AnonymousClass001.A1E(A15, "RIFF", AnonymousClass000.A10()).getBytes();
        ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(A15.toString().length() ^ 1444152587);
        byte[] array = order.array();
        byte[] bytes2 = "META".getBytes();
        int length = bytes.length + array.length + bytes2.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[length]);
        wrap.put(bytes);
        wrap.put(array);
        wrap.put(bytes2);
        if (length <= 100) {
            return wrap.array();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoiceNoteUpload/preparePttMetadata Metadata length unusual: ");
        A10.append(length);
        C17900vP.A0X(wrap, " ,metadata content: ", A10);
        throw new AnonymousClass9HW();
    }

    public void cancel() {
        if (this.A05.get() != null && A0J() && !this.A0l) {
            C17960vV.A07(this.A02);
            this.A0i.CGF(new AnonymousClass7RA((Object) this, 38));
        }
        super.cancel();
    }

    public void A0D() {
        super.A0D();
        this.A0C.A01();
        this.A0G.A01();
        this.A0H.A01();
        this.A0E.A01();
        this.A0D.A01();
    }

    public C62492rU A0G() {
        return this.A0W;
    }

    public C167228ff(AnonymousClass190 r18, C218617r r19, AnonymousClass1KB r20, C25311Ns r21, AnonymousClass181 r22, AnonymousClass11P r23, AnonymousClass118 r24, AnonymousClass1ST r25, AnonymousClass1SX r26, C18030ve r27, AnonymousClass1SV r28, C24371Kb r29, AnonymousClass1KX r30, AnonymousClass1SJ r31, AnonymousClass1SY r32, WamediaManager wamediaManager, AnonymousClass1SK r34, AnonymousClass1SU r35, C62492rU r36, C26411Sa r37, AnonymousClass1SZ r38, AnonymousClass1SR r39, AnonymousClass1SW r40, C18010vc r41, C24421Kg r42, AnonymousClass10I r43, JniBridge jniBridge) {
        C56232h8 r2;
        C24371Kb r10 = r29;
        C18030ve r7 = r27;
        C186009dV r210 = new C186009dV(r7, r28, r10);
        AnonymousClass1TJ r4 = new AnonymousClass1TJ();
        this.A0C = r4;
        this.A0G = new AnonymousClass1TJ();
        this.A0H = new AnonymousClass1TJ();
        this.A0E = new AnonymousClass1TJ();
        this.A0F = new AnonymousClass1TJ();
        this.A0D = new AnonymousClass1TJ();
        this.A0g = new C21048Ade(this, 1);
        this.A0J = r24;
        AnonymousClass11P r9 = r23;
        this.A0I = r9;
        this.A0O = r7;
        AnonymousClass1KB r3 = r20;
        this.A09 = r3;
        this.A07 = r18;
        this.A0i = r43;
        this.A08 = r19;
        this.A0j = jniBridge;
        this.A0B = r22;
        C24421Kg r12 = r42;
        this.A0h = r12;
        this.A0T = wamediaManager;
        this.A0R = r31;
        this.A0U = r34;
        AnonymousClass1SR r1 = r39;
        this.A0c = r1;
        AnonymousClass1ST r8 = r25;
        this.A0M = r8;
        this.A0d = r40;
        this.A0V = r35;
        this.A0b = r38;
        this.A0N = r26;
        this.A0S = r32;
        this.A0Q = r30;
        this.A0P = r10;
        this.A0f = r41;
        this.A0A = r21;
        this.A0X = r37;
        C62492rU r11 = r36;
        this.A0a = r11.A04;
        this.A0W = r11;
        this.A0e = r210;
        C196299un r102 = new C196299un();
        this.A0Z = r102;
        synchronized (r102) {
            r2 = r11.A02;
            r102.A00 = r2.A04;
            r102.A0A = r2.A0A;
            r102.A09 = r2.A09;
            r102.A01 = r2.A05;
        }
        C22498BAf bAf = r11.A00;
        this.A0L = bAf;
        this.A0K = bAf.BTl();
        this.A0Y = new C198119xo(r9, r8, r1);
        C21111Aef aef = new C21111Aef(this, 6);
        Executor executor = r3.A05;
        A0A(aef, executor);
        this.A00.A03(new C21111Aef(this, 7), executor);
        boolean z = true;
        r4.A04(true);
        String str = this.A0W.A02.A06.A02;
        C18030ve r13 = r12.A06;
        C18040vf r5 = C18040vf.A02;
        if (!C18020vd.A05(r5, r13, 15)) {
            r12.A0D.CGF(new C21373Aj2(r12, str, (String) null, (String) null, 0));
        }
        this.A0k = (!C18020vd.A05(r5, r7, 487) || r2.A06 != C26551So.A0B || r2.A03 <= 52428800) ? false : z;
        this.A0l = C18020vd.A05(r5, r7, 8264);
    }
}
