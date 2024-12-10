package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tk  reason: invalid class name and case insensitive filesystem */
public final class C63822tk {
    public final AnonymousClass190 A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1TK A03;
    public final C26681Tb A04;
    public final AnonymousClass1M9 A05;
    public final C25111Mx A06;
    public final AnonymousClass11Q A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1P3 A09;
    public final AnonymousClass1M4 A0A;
    public final AnonymousClass1TB A0B;
    public final C22621Co A0C;
    public final AnonymousClass1LW A0D;
    public final AnonymousClass1CJ A0E;
    public final AnonymousClass1MZ A0F;
    public final AnonymousClass1Q2 A0G;
    public final C24621La A0H;
    public final AnonymousClass1WW A0I;
    public final C24661Le A0J;
    public final C24751Ln A0K;
    public final AnonymousClass1RL A0L;
    public final C34821l8 A0M;
    public final C18030ve A0N;
    public final C36181nT A0O;
    public final C26061Qr A0P;
    public final AnonymousClass1RU A0Q;
    public final AnonymousClass10I A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final C35191ln A0Y;
    public final C26141Qz A0Z;
    public final AnonymousClass1WM A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;

    private final void A01(int i, boolean z) {
        int i2;
        if (i != 1) {
            i2 = 0;
            if (i != 4) {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        C25491Ok r4 = (C25491Ok) this.A0b.get();
        String A0B2 = this.A02.A0B();
        AnonymousClass2GP r1 = new AnonymousClass2GP();
        r1.A06 = A0B2;
        r1.A03 = 2;
        r1.A04 = Integer.valueOf(i2);
        r1.A01 = true;
        r1.A00 = Boolean.valueOf(z);
        r1.A05 = C17880vN.A0n(r4.A00.A06());
        r4.A01.CC7(r1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2ee, java.lang.Object] */
    public static final void A03(C57132ia r6, C63822tk r7, C56152gz r8, File file) {
        C57132ia r2 = r6;
        try {
            ? obj = new Object();
            obj.A03 = file.length();
            obj.A02 = r8.A03;
            obj.A01 = AnonymousClass11P.A01(r7.A08);
            byte[] A0X2 = C64062u9.A0X(file);
            C18070vi.A0X(A0X2);
            A02(r2, obj, r7, file, A0X2, r8.A01, r8.A00);
        } catch (IOException e) {
            Log.e("HistorySyncChunkProcessor/ unable to read file data");
            r2.A00(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A04(X.C166388co r9, X.AnonymousClass206 r10, java.lang.Long r11) {
        /*
            r8 = this;
            r7 = 0
            boolean r0 = X.AnonymousClass206.A08(r10)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r0 == 0) goto L_0x000c
            X.1ln r0 = r8.A0Y     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            r0.CBs(r9, r10)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
        L_0x000c:
            r0 = 65536(0x10000, double:3.2379E-319)
            r10.A0b(r0)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r11 != 0) goto L_0x0038
            X.1La r6 = r8.A0H     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            java.lang.String r5 = "next_sort_id_for_companion_history_sync"
            r0 = -2
            long r1 = r6.A01(r5, r0)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            r10.A0y = r1     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            r3 = 1
            long r1 = r1 - r3
            r3 = -2
            long r3 = r6.A01(r5, r3)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
            r6.A05(r5, r1)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            goto L_0x003e
        L_0x0031:
            java.lang.String r0 = "The next sort_id for a historical message should be negative and smaller than our last used sort_id."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
        L_0x0038:
            long r0 = r11.longValue()     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            r10.A0y = r0     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
        L_0x003e:
            int r0 = r10.A05     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r0 <= 0) goto L_0x0049
            X.1Qz r2 = r8.A0Z     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            long r0 = r10.A0I     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            r2.A05(r10, r0)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
        L_0x0049:
            X.36t r2 = X.C60512o9.A00(r10)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r2 == 0) goto L_0x0076
            X.1RU r1 = r8.A0Q     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            X.6RT r0 = r2.A01     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            boolean r0 = r1.BE9(r0)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r0 == 0) goto L_0x0076
            X.206 r0 = r1.BWH(r10, r2)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            boolean r0 = r1.BkB(r10, r0)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r0 == 0) goto L_0x0076
            X.8cr r0 = r9.message_     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r0 != 0) goto L_0x006d
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r0 != 0) goto L_0x006d
            r0 = 0
            goto L_0x0071
        L_0x006d:
            byte[] r0 = r0.A0M()     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
        L_0x0071:
            int r0 = r1.BcL(r10, r0)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            goto L_0x0077
        L_0x0076:
            r0 = 2
        L_0x0077:
            r1 = 1
            if (r0 == r1) goto L_0x00a6
            X.00H r0 = r8.A0U     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            X.1W6 r0 = X.C17880vN.A0c(r0)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            r0.A04(r10)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            X.1WM r0 = r8.A0a     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            r0.A0I(r10)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            boolean r0 = X.C22971Dz.A0g(r10)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            if (r0 == 0) goto L_0x0099
            X.00H r0 = r8.A0d     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            X.2iA r0 = (X.C56872iA) r0     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
            r0.A00(r10)     // Catch:{ SQLiteConstraintException -> 0x00a1, Exception -> 0x009a }
        L_0x0099:
            return r1
        L_0x009a:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncChunkProcessor/ could not insert message into db"
            com.whatsapp.util.Log.e(r0, r1)
            return r7
        L_0x00a1:
            java.lang.String r0 = "HistorySyncChunkProcessor/ tried to insert duplicate message"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00a6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63822tk.A04(X.8co, X.206, java.lang.Long):boolean");
    }

    private final AnonymousClass206 A00(C166388co r3) {
        try {
            return ((C192859p6) this.A0c.get()).A01(new C193069pU(AnonymousClass00R.A00), r3);
        } catch (Exception e) {
            Log.e("HistorySyncChunkProcessor/ failed to parse wmi of history sync message", e);
            return null;
        }
    }

    public final ArrayList A05(AnonymousClass9KV r13, List list) {
        AnonymousClass9KV r0 = AnonymousClass9KV.INITIAL_BOOTSTRAP;
        ArrayList A13 = AnonymousClass000.A13();
        if (r13 == r0) {
            C24621La r7 = this.A0H;
            long A012 = r7.A01("next_sort_id_for_companion_history_sync", -2);
            long size = (A012 - ((long) list.size())) - 1;
            if (size < r7.A01("next_sort_id_for_companion_history_sync", -2)) {
                r7.A05("next_sort_id_for_companion_history_sync", size);
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    C166388co r72 = ((C164658Zr) list.get(i)).message_;
                    if (r72 == null) {
                        r72 = C166388co.DEFAULT_INSTANCE;
                    }
                    C18070vi.A0b(r72);
                    AnonymousClass206 A002 = A00(r72);
                    long j = A012 - ((long) i);
                    if (A002 != null) {
                        if (A002.A0J == C49502Qs.USERNAME) {
                            if (!(!C18020vd.A05(C18040vf.A02, this.A0N, 6595))) {
                            }
                        }
                        if (A04(r72, A002, Long.valueOf(j))) {
                            A13.add(A002);
                        }
                    }
                }
            } else {
                throw AnonymousClass000.A0n("The next sort_id for a historical message should be negative and smaller than our last used sort_id.");
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C166388co r4 = ((C164658Zr) it.next()).message_;
                if (r4 == null) {
                    r4 = C166388co.DEFAULT_INSTANCE;
                }
                C18070vi.A0b(r4);
                AnonymousClass206 A003 = A00(r4);
                if (A003 != null) {
                    if (A003.A0J == C49502Qs.USERNAME) {
                        if (!(!C18020vd.A05(C18040vf.A02, this.A0N, 6595))) {
                        }
                    }
                    if (A04(r4, A003, (Long) null)) {
                        A13.add(A003);
                    }
                }
            }
        }
        return A13;
    }

    public C63822tk(AnonymousClass190 r42, AnonymousClass1KB r43, AnonymousClass11S r44, AnonymousClass1TK r45, C35191ln r46, C26681Tb r47, AnonymousClass1M9 r48, C25111Mx r49, AnonymousClass11Q r50, AnonymousClass11P r51, AnonymousClass1P3 r52, AnonymousClass1M4 r53, AnonymousClass1TB r54, C22621Co r55, AnonymousClass1LW r56, AnonymousClass1CJ r57, C26141Qz r58, AnonymousClass1MZ r59, AnonymousClass1Q2 r60, C24621La r61, AnonymousClass1WW r62, C24661Le r63, C24751Ln r64, AnonymousClass1RL r65, AnonymousClass1WM r66, C34821l8 r67, C18030ve r68, C36181nT r69, C26061Qr r70, AnonymousClass1RU r71, AnonymousClass10I r72, AnonymousClass00H r73, AnonymousClass00H r74, AnonymousClass00H r75, AnonymousClass00H r76, AnonymousClass00H r77, AnonymousClass00H r78, AnonymousClass00H r79, AnonymousClass00H r80, AnonymousClass00H r81) {
        C18030ve r19 = r68;
        AnonymousClass1LW r29 = r56;
        AnonymousClass190 r40 = r42;
        AnonymousClass1KB r39 = r43;
        AnonymousClass11P r0 = r51;
        C18070vi.A0w(r0, r19, r39, r29, r40);
        C24661Le r23 = r63;
        AnonymousClass1CJ r28 = r57;
        AnonymousClass10I r15 = r72;
        C22621Co r14 = r55;
        AnonymousClass11S r38 = r44;
        C18070vi.A0x(r15, r38, r28, r23, r14);
        AnonymousClass1Q2 r26 = r60;
        AnonymousClass00H r12 = r74;
        AnonymousClass00H r13 = r73;
        AnonymousClass1TB r30 = r54;
        AnonymousClass1M9 r34 = r48;
        C18070vi.A0y(r30, r26, r13, r34, r12);
        C24751Ln r22 = r64;
        AnonymousClass1WW r24 = r62;
        C24621La r25 = r61;
        AnonymousClass00H r11 = r75;
        C18070vi.A0t(r11, r22, r24, r25);
        AnonymousClass1WM r20 = r66;
        AnonymousClass00H r10 = r76;
        AnonymousClass1RU r16 = r71;
        AnonymousClass1P3 r32 = r52;
        C18070vi.A0u(r32, r10, r16, r20);
        AnonymousClass00H r8 = r78;
        AnonymousClass00H r9 = r77;
        C36181nT r18 = r69;
        C25111Mx r33 = r49;
        C18070vi.A0v(r18, r33, r9, r8);
        C26141Qz r27 = r58;
        C18070vi.A0d(r27, 28);
        AnonymousClass00H r7 = r79;
        C18070vi.A0d(r7, 29);
        AnonymousClass1RL r21 = r65;
        C18070vi.A0d(r21, 30);
        C35191ln r36 = r46;
        C18070vi.A0d(r36, 31);
        C26061Qr r17 = r70;
        C18070vi.A0d(r17, 32);
        AnonymousClass00H r6 = r80;
        C18070vi.A0d(r6, 33);
        C26681Tb r35 = r47;
        C18070vi.A0d(r35, 34);
        AnonymousClass1MZ r5 = r59;
        C18070vi.A0d(r5, 35);
        AnonymousClass1TK r37 = r45;
        C18070vi.A0d(r37, 36);
        C34821l8 r4 = r67;
        C18070vi.A0d(r4, 37);
        AnonymousClass00H r2 = r81;
        C18070vi.A0d(r2, 38);
        AnonymousClass1M4 r31 = r53;
        C18070vi.A0d(r31, 39);
        AnonymousClass11Q r3 = r50;
        C18070vi.A0d(r3, 40);
        this.A08 = r0;
        this.A0N = r19;
        this.A01 = r39;
        this.A0D = r29;
        this.A00 = r40;
        this.A0R = r15;
        this.A02 = r38;
        this.A0E = r28;
        this.A0J = r23;
        this.A0C = r14;
        this.A0B = r30;
        this.A0G = r26;
        this.A0V = r13;
        this.A05 = r34;
        this.A0S = r12;
        this.A0U = r11;
        this.A0K = r22;
        this.A0I = r24;
        this.A0H = r25;
        this.A09 = r32;
        this.A0X = r10;
        this.A0Q = r16;
        this.A0a = r20;
        this.A0O = r18;
        this.A06 = r33;
        this.A0b = r9;
        this.A0c = r8;
        this.A0Z = r27;
        this.A0d = r7;
        this.A0L = r21;
        this.A0Y = r36;
        this.A0P = r17;
        this.A0W = r6;
        this.A04 = r35;
        this.A0F = r5;
        this.A03 = r37;
        this.A0M = r4;
        this.A0T = r2;
        this.A0A = r31;
        this.A07 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r11v15, types: [X.23J, X.206] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0367 A[Catch:{ IOException -> 0x0b3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03a0 A[Catch:{ IOException -> 0x0b3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03b5 A[Catch:{ IOException -> 0x0b3c }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03ca A[Catch:{ IOException -> 0x0b3c }] */
    public static final void A02(X.C57132ia r43, X.C54752ee r44, X.C63822tk r45, java.io.File r46, byte[] r47, int r48, int r49) {
        /*
            X.8cQ r0 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0b3c }
            r1 = r47
            X.Bm6 r3 = X.C23577Bm6.A07(r0, r1)     // Catch:{ IOException -> 0x0b3c }
            X.8cQ r3 = (X.C166148cQ) r3     // Catch:{ IOException -> 0x0b3c }
            int r1 = r3.progress_     // Catch:{ IOException -> 0x0b3c }
            r42 = r44
            r0 = r42
            r0.A00 = r1     // Catch:{ IOException -> 0x0b3c }
            X.EE9 r1 = r3.phoneNumberToLidMappings_     // Catch:{ IOException -> 0x0b3c }
            r2 = r45
            if (r1 == 0) goto L_0x0057
            boolean r0 = X.AnonymousClass000.A1a(r1)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0057
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ IOException -> 0x0b3c }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ IOException -> 0x0b3c }
        L_0x0026:
            boolean r0 = r6.hasNext()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0052
            java.lang.Object r5 = r6.next()     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r5)     // Catch:{ IOException -> 0x0b3c }
            X.8ZP r5 = (X.AnonymousClass8ZP) r5     // Catch:{ IOException -> 0x0b3c }
            X.1yH r1 = X.AnonymousClass1E2.A01     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r5.lidJid_     // Catch:{ IOException -> 0x0b3c }
            X.1E2 r4 = r1.A03(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r4 == 0) goto L_0x0026
            X.1Dx r1 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r5.pnJid_     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jid.PhoneUserJid r1 = r1.A04(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r1 == 0) goto L_0x0026
            X.0yx r0 = new X.0yx     // Catch:{ IOException -> 0x0b3c }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x0b3c }
            r7.add(r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0026
        L_0x0052:
            X.1Ln r0 = r2.A0K     // Catch:{ IOException -> 0x0b3c }
            r0.A0J(r7)     // Catch:{ IOException -> 0x0b3c }
        L_0x0057:
            X.1Tb r10 = r2.A04     // Catch:{ IOException -> 0x0b3c }
            r0 = r42
            int r0 = r0.A00     // Catch:{ IOException -> 0x0b3c }
            long r8 = (long) r0     // Catch:{ IOException -> 0x0b3c }
            r0 = r42
            long r6 = r0.A03     // Catch:{ IOException -> 0x0b3c }
            long r4 = r0.A02     // Catch:{ IOException -> 0x0b3c }
            long r0 = r0.A01     // Catch:{ IOException -> 0x0b3c }
            r17 = 0
            X.2H2 r11 = new X.2H2     // Catch:{ IOException -> 0x0b3c }
            r11.<init>()     // Catch:{ IOException -> 0x0b3c }
            java.lang.Integer r12 = X.C17880vN.A0h()     // Catch:{ IOException -> 0x0b3c }
            r11.A02 = r12     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r12 = X.C26681Tb.A00(r10)     // Catch:{ IOException -> 0x0b3c }
            r11.A0A = r12     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x0b3c }
            r11.A04 = r8     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x0b3c }
            r11.A05 = r6     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0b3c }
            r11.A09 = r0     // Catch:{ IOException -> 0x0b3c }
            long r0 = r0.longValue()     // Catch:{ IOException -> 0x0b3c }
            long r0 = r0 - r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0b3c }
            r11.A06 = r0     // Catch:{ IOException -> 0x0b3c }
            java.lang.Integer r0 = X.C26371Rw.A01(r48)     // Catch:{ IOException -> 0x0b3c }
            r11.A00 = r0     // Catch:{ IOException -> 0x0b3c }
            java.lang.Integer r0 = X.C26371Rw.A00(r48)     // Catch:{ IOException -> 0x0b3c }
            r11.A01 = r0     // Catch:{ IOException -> 0x0b3c }
            X.00H r1 = r10.A03     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r0 = r1.get()     // Catch:{ IOException -> 0x0b3c }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ IOException -> 0x0b3c }
            long r4 = r0.A04()     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0b3c }
            r11.A07 = r0     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r0 = r1.get()     // Catch:{ IOException -> 0x0b3c }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ IOException -> 0x0b3c }
            long r0 = r0.A02()     // Catch:{ IOException -> 0x0b3c }
            long r4 = r4 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0b3c }
            r11.A08 = r0     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r0 = X.C17880vN.A0n(r49)     // Catch:{ IOException -> 0x0b3c }
            r11.A03 = r0     // Catch:{ IOException -> 0x0b3c }
            X.18K r0 = r10.A02     // Catch:{ IOException -> 0x0b3c }
            r0.CC7(r11)     // Catch:{ IOException -> 0x0b3c }
            int r0 = r3.syncType_     // Catch:{ IOException -> 0x0b3c }
            X.9KV r0 = X.AnonymousClass9KV.A00(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x00da
            X.9KV r0 = X.AnonymousClass9KV.INITIAL_BOOTSTRAP     // Catch:{ IOException -> 0x0b3c }
        L_0x00da:
            int r0 = r0.ordinal()     // Catch:{ IOException -> 0x0b3c }
            switch(r0) {
                case 0: goto L_0x04e3;
                case 1: goto L_0x02cb;
                case 2: goto L_0x0119;
                case 3: goto L_0x0119;
                case 4: goto L_0x04b6;
                case 5: goto L_0x021d;
                default: goto L_0x00e1;
            }     // Catch:{ IOException -> 0x0b3c }
        L_0x00e1:
            java.lang.String r0 = "HistorySyncChunkProcessor/ invalid sync type"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x00e6:
            r0 = r43
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker r6 = r0.A00     // Catch:{ IOException -> 0x0b3c }
            X.1lA r5 = r6.A01     // Catch:{ IOException -> 0x0b3c }
            X.2gz r9 = r0.A01     // Catch:{ IOException -> 0x0b3c }
            r4 = 2
            java.util.Map r0 = r5.A0C     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r7 = r9.A09     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r0 = r0.remove(r7)     // Catch:{ IOException -> 0x0b3c }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x00ff
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ IOException -> 0x0b3c }
        L_0x00ff:
            long r2 = r0.longValue()     // Catch:{ IOException -> 0x0b3c }
            X.11S r0 = r5.A00     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)     // Catch:{ IOException -> 0x0b3c }
            r0 = 1
            X.205 r10 = X.AnonymousClass205.A01(r1, r7, r0)     // Catch:{ IOException -> 0x0b3c }
            r0 = 1
            r8 = 35
            X.23J r11 = new X.23J     // Catch:{ IOException -> 0x0b3c }
            r11.<init>(r10, r8, r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x09a1
        L_0x0119:
            X.EE9 r0 = r3.conversations_     // Catch:{ IOException -> 0x0b3c }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ IOException -> 0x0b3c }
        L_0x011f:
            boolean r0 = r14.hasNext()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0216
            java.lang.Object r7 = r14.next()     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r7)     // Catch:{ IOException -> 0x0b3c }
            X.8cf r7 = (X.C166298cf) r7     // Catch:{ IOException -> 0x0b3c }
            X.1Dv r1 = X.AnonymousClass1BI.A00     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r7.id_     // Catch:{ IOException -> 0x0b3c }
            X.1BI r4 = r1.A02(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r4 == 0) goto L_0x020b
            boolean r0 = X.C22971Dz.A0N(r4)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x020b
            X.1CJ r0 = r2.A0E     // Catch:{ IOException -> 0x0b3c }
            X.1ci r4 = X.AnonymousClass1CJ.A00(r0, r4)     // Catch:{ IOException -> 0x0b3c }
            if (r4 != 0) goto L_0x014c
            java.lang.String r0 = "HistorySyncChunkProcessor/ received chat history from chat not sent in bootstrap"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x011f
        L_0x014c:
            X.EE9 r1 = r7.messages_     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r1)     // Catch:{ IOException -> 0x0b3c }
            int r0 = r3.syncType_     // Catch:{ IOException -> 0x0b3c }
            X.9KV r0 = X.AnonymousClass9KV.A00(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x015b
            X.9KV r0 = X.AnonymousClass9KV.INITIAL_BOOTSTRAP     // Catch:{ IOException -> 0x0b3c }
        L_0x015b:
            java.util.ArrayList r8 = r2.A05(r0, r1)     // Catch:{ IOException -> 0x0b3c }
            int r0 = r7.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0185
            int r1 = r7.endOfHistoryTransferType_     // Catch:{ IOException -> 0x0b3c }
            if (r1 == 0) goto L_0x0173
            r0 = 1
            if (r1 == r0) goto L_0x0170
            r0 = 2
            if (r1 != r0) goto L_0x0173
            goto L_0x0176
        L_0x0170:
            X.2R7 r0 = X.AnonymousClass2R7.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0178
        L_0x0173:
            X.2R7 r0 = X.AnonymousClass2R7.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0178
        L_0x0176:
            X.2R7 r0 = X.AnonymousClass2R7.COMPLETE_ON_DEMAND_SYNC_BUT_MORE_MSG_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0b3c }
        L_0x0178:
            int r5 = r0.ordinal()     // Catch:{ IOException -> 0x0b3c }
            r1 = 2
            r0 = 0
            if (r5 == r0) goto L_0x0183
            if (r5 == r1) goto L_0x0183
            r1 = 0
        L_0x0183:
            r4.A04 = r1     // Catch:{ IOException -> 0x0b3c }
        L_0x0185:
            X.1LW r5 = r2.A0D     // Catch:{ IOException -> 0x0b3c }
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = "history_sync_progress"
            int r0 = r4.A04     // Catch:{ all -> 0x01ac }
            X.C17880vN.A18(r6, r1, r0)     // Catch:{ all -> 0x01ac }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            int r0 = r5.A05(r6, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            if (r0 != 0) goto L_0x01b8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            java.lang.String r0 = "ChatStore/historysyncprogress/did not update "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            X.1BI r0 = r4.A0u     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            X.C17890vO.A0w(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            goto L_0x01b8
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01af, Error | RuntimeException -> 0x0aee }
        L_0x01af:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ IOException -> 0x0b3c }
            X.1Cn r0 = r5.A02     // Catch:{ IOException -> 0x0b3c }
            r0.A03()     // Catch:{ IOException -> 0x0b3c }
        L_0x01b8:
            boolean r0 = r8.isEmpty()     // Catch:{ IOException -> 0x0b3c }
            r11 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ff
            monitor-enter(r4)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r4.A0W     // Catch:{ all -> 0x0af3 }
            monitor-exit(r4)     // Catch:{ IOException -> 0x0b3c }
            r12 = 1
            r6 = 0
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x01ed
            int r10 = r8.size()     // Catch:{ IOException -> 0x0b3c }
            r1 = 0
            goto L_0x0208
        L_0x01d2:
            java.lang.Object r9 = r8.get(r1)     // Catch:{ IOException -> 0x0b3c }
            X.206 r9 = (X.AnonymousClass206) r9     // Catch:{ IOException -> 0x0b3c }
            X.1Qr r0 = r2.A0P     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = X.AnonymousClass25A.A0X(r0, r9, r11)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0206
            long r0 = r9.A0y     // Catch:{ IOException -> 0x0b3c }
            r4.A0G(r0)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r9.A0x     // Catch:{ IOException -> 0x0b3c }
            r4.A0F(r0)     // Catch:{ IOException -> 0x0b3c }
            r5.A06(r4)     // Catch:{ IOException -> 0x0b3c }
        L_0x01ed:
            X.1Q2 r0 = r2.A0G     // Catch:{ IOException -> 0x0b3c }
            android.os.Handler r5 = r0.A00     // Catch:{ IOException -> 0x0b3c }
            r4 = 29
            java.lang.Object r1 = r8.get(r6)     // Catch:{ IOException -> 0x0b3c }
            r0 = 5
            android.os.Message r0 = android.os.Message.obtain(r5, r0, r4, r6, r1)     // Catch:{ IOException -> 0x0b3c }
            r0.sendToTarget()     // Catch:{ IOException -> 0x0b3c }
        L_0x01ff:
            X.EE9 r0 = r7.messages_     // Catch:{ IOException -> 0x0b3c }
            r0.size()     // Catch:{ IOException -> 0x0b3c }
            goto L_0x011f
        L_0x0206:
            int r1 = r1 + 1
        L_0x0208:
            if (r1 >= r10) goto L_0x01ed
            goto L_0x01d2
        L_0x020b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "HistorySyncChunkProcessor/ skip importing of chatJid="
            X.C17900vP.A0Z(r4, r0, r1)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x011f
        L_0x0216:
            X.EE9 r0 = r3.conversations_     // Catch:{ IOException -> 0x0b3c }
            r0.size()     // Catch:{ IOException -> 0x0b3c }
            goto L_0x00e6
        L_0x021d:
            java.lang.String r0 = "HistorySyncChunkProcessor/addNonBlockingData"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0b3c }
            X.EE9 r0 = r3.callLogRecords_     // Catch:{ IOException -> 0x0b3c }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ IOException -> 0x0b3c }
        L_0x0228:
            boolean r0 = r12.hasNext()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r1 = r12.next()     // Catch:{ IOException -> 0x0b3c }
            X.8cO r1 = (X.C166128cO) r1     // Catch:{ IOException -> 0x0b3c }
            if (r1 == 0) goto L_0x02bd
            X.A77 r0 = X.A77.A00     // Catch:{ IOException -> 0x0b3c }
            X.9Bw r4 = r0.A03(r1)     // Catch:{ IOException -> 0x0b3c }
            if (r4 == 0) goto L_0x02bd
            X.1TB r6 = r2.A0B     // Catch:{ IOException -> 0x0b3c }
            X.2m4 r3 = r4.A0B     // Catch:{ IOException -> 0x0b3c }
            if (r3 == 0) goto L_0x025c
            X.1T9 r1 = r6.A00     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r7 = r3.A02     // Catch:{ IOException -> 0x0b3c }
            X.2m4 r0 = r1.A02(r7)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x025c
            com.whatsapp.jid.UserJid r5 = r3.A01     // Catch:{ IOException -> 0x0b3c }
            long r0 = r1.A00(r5, r7)     // Catch:{ IOException -> 0x0b3c }
            X.2m4 r3 = new X.2m4     // Catch:{ IOException -> 0x0b3c }
            r3.<init>(r5, r7, r0)     // Catch:{ IOException -> 0x0b3c }
            r4.A0H(r3)     // Catch:{ IOException -> 0x0b3c }
        L_0x025c:
            X.1Cd r0 = r6.A06     // Catch:{ IOException -> 0x0b3c }
            X.1au r11 = r0.A05()     // Catch:{ IOException -> 0x0b3c }
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x0b03 }
            monitor-enter(r4)     // Catch:{ all -> 0x0af9 }
            r4.A04()     // Catch:{ all -> 0x0af6 }
            int r8 = r4.A01     // Catch:{ all -> 0x0af6 }
            monitor-exit(r4)     // Catch:{ all -> 0x0af9 }
            X.4cT r5 = r4.A04     // Catch:{ all -> 0x0af9 }
            android.content.ContentValues r9 = X.AnonymousClass1TB.A00(r6, r4, r5)     // Catch:{ all -> 0x0af9 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0af9 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0af9 }
            java.lang.String r3 = "call_log"
            java.lang.String r1 = "insertCallLog/INSERT_CALL_LOG"
            r0 = 5
            long r0 = r7.A09(r3, r1, r9, r0)     // Catch:{ all -> 0x0af9 }
            r4.A03(r0)     // Catch:{ all -> 0x0af9 }
            monitor-enter(r4)     // Catch:{ all -> 0x0af9 }
            r1 = 0
            int r0 = r4.A01     // Catch:{ all -> 0x0af6 }
            if (r8 != r0) goto L_0x0290
            r4.A02 = r1     // Catch:{ all -> 0x0af6 }
            int r0 = r0 + 1
            r4.A01 = r0     // Catch:{ all -> 0x0af6 }
        L_0x0290:
            monitor-exit(r4)     // Catch:{ all -> 0x0af9 }
            X.AnonymousClass1TB.A02(r6, r4)     // Catch:{ all -> 0x0af9 }
            r10.A00()     // Catch:{ all -> 0x0af9 }
            r10.close()     // Catch:{ all -> 0x0b03 }
            r11.close()     // Catch:{ IOException -> 0x0b3c }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "HistorySyncChunkProcessor/addNonBlockingData; callLog.key="
            r3.append(r0)     // Catch:{ IOException -> 0x0b3c }
            r3.append(r5)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "; callLog.row_id="
            r3.append(r0)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r4.A00     // Catch:{ IOException -> 0x0b3c }
            r3.append(r0)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "; callLog.timestamp="
            r3.append(r0)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r4.A01     // Catch:{ IOException -> 0x0b3c }
            X.C17890vO.A16(r3, r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x02bd:
            X.1KB r3 = r2.A01     // Catch:{ IOException -> 0x0b3c }
            r1 = 9
            X.7Pc r0 = new X.7Pc     // Catch:{ IOException -> 0x0b3c }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0b3c }
            r3.A0J(r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0228
        L_0x02cb:
            X.EE9 r0 = r3.statusV3Messages_     // Catch:{ IOException -> 0x0b3c }
            r35 = r0
            java.util.LinkedHashMap r9 = X.C17880vN.A13()     // Catch:{ IOException -> 0x0b3c }
            java.util.LinkedHashMap r15 = X.C17880vN.A13()     // Catch:{ IOException -> 0x0b3c }
            java.util.LinkedHashMap r24 = X.C17880vN.A13()     // Catch:{ IOException -> 0x0b3c }
            java.util.LinkedHashMap r14 = X.C17880vN.A13()     // Catch:{ IOException -> 0x0b3c }
            java.util.LinkedHashMap r23 = X.C17880vN.A13()     // Catch:{ IOException -> 0x0b3c }
            int r22 = r35.size()     // Catch:{ IOException -> 0x0b3c }
            r13 = 0
            java.lang.Integer r21 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0b3c }
            r8 = 0
        L_0x02ed:
            java.lang.String r20 = "Required value was null."
            r0 = r22
            if (r8 >= r0) goto L_0x03e5
            r0 = r35
            java.lang.Object r11 = r0.get(r8)     // Catch:{ IOException -> 0x0b3c }
            X.8co r11 = (X.C166388co) r11     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0b(r11)     // Catch:{ IOException -> 0x0b3c }
            X.206 r7 = r2.A00(r11)     // Catch:{ IOException -> 0x0b3c }
            if (r7 == 0) goto L_0x03e1
            r0 = r17
            boolean r0 = r2.A04(r11, r7, r0)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x03e1
            com.whatsapp.jid.UserJid r10 = r7.A0I()     // Catch:{ IOException -> 0x0b3c }
            X.205 r0 = r7.A0v     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x035d
            X.EE9 r0 = r11.userReceipt_     // Catch:{ IOException -> 0x0b3c }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ IOException -> 0x0b3c }
        L_0x031c:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0359
            java.lang.Object r12 = r16.next()     // Catch:{ IOException -> 0x0b3c }
            X.8bj r12 = (X.C165768bj) r12     // Catch:{ IOException -> 0x0b3c }
            X.1WW r0 = r2.A0I     // Catch:{ SQLiteConstraintException -> 0x0352 }
            r25 = r0
            long r0 = r7.A0x     // Catch:{ SQLiteConstraintException -> 0x0352 }
            r29 = r0
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ SQLiteConstraintException -> 0x0352 }
            java.lang.String r0 = r12.userJid_     // Catch:{ SQLiteConstraintException -> 0x0352 }
            com.whatsapp.jid.UserJid r26 = r1.A04(r0)     // Catch:{ SQLiteConstraintException -> 0x0352 }
            long r5 = r12.receiptTimestamp_     // Catch:{ SQLiteConstraintException -> 0x0352 }
            r18 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r18
            long r3 = r12.readTimestamp_     // Catch:{ SQLiteConstraintException -> 0x0352 }
            long r3 = r3 * r18
            long r0 = r12.playedTimestamp_     // Catch:{ SQLiteConstraintException -> 0x0352 }
            long r0 = r0 * r18
            r27 = r29
            r29 = r5
            r31 = r3
            r33 = r0
            r25.A02(r26, r27, r29, r31, r33)     // Catch:{ SQLiteConstraintException -> 0x0352 }
            goto L_0x031c
        L_0x0352:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncChunkProcessor/failed to insert user receipt."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x031c
        L_0x0359:
            if (r10 != 0) goto L_0x0361
            X.1E5 r10 = X.AnonymousClass1E5.A00     // Catch:{ IOException -> 0x0b3c }
        L_0x035d:
            if (r10 != 0) goto L_0x0361
            goto L_0x0b0d
        L_0x0361:
            java.lang.Object r0 = r9.get(r10)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x036a
            r9.put(r10, r7)     // Catch:{ IOException -> 0x0b3c }
        L_0x036a:
            java.lang.Object r0 = r15.get(r10)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0383
            X.205 r0 = r7.A0v     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0383
            int r0 = r11.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0383
            boolean r0 = r11.ignore_     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0383
            r15.put(r10, r7)     // Catch:{ IOException -> 0x0b3c }
        L_0x0383:
            X.205 r0 = r7.A0v     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r0.A02     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x03ab
            int r0 = r11.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0393
            boolean r0 = r11.ignore_     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x03ab
        L_0x0393:
            r0 = r24
            r0.put(r10, r7)     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r0 = r14.get(r10)     // Catch:{ IOException -> 0x0b3c }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x03a2
            r0 = r21
        L_0x03a2:
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0b3c }
            int r0 = r0 + 1
            X.C17880vN.A1P(r10, r14, r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x03ab:
            r0 = r23
            java.lang.Object r0 = r0.get(r10)     // Catch:{ IOException -> 0x0b3c }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x03b7
            r0 = r21
        L_0x03b7:
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0b3c }
            int r1 = r0 + 1
            r0 = r23
            X.C17880vN.A1P(r10, r0, r1)     // Catch:{ IOException -> 0x0b3c }
            int r0 = r35.size()     // Catch:{ IOException -> 0x0b3c }
            int r0 = r0 + -1
            if (r8 != r0) goto L_0x03d3
            X.1La r4 = r2.A0H     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r3 = "earliest_status_time"
            long r0 = r7.A0I     // Catch:{ IOException -> 0x0b3c }
            r4.A05(r3, r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x03d3:
            X.1Q2 r0 = r2.A0G     // Catch:{ IOException -> 0x0b3c }
            android.os.Handler r3 = r0.A00     // Catch:{ IOException -> 0x0b3c }
            r1 = 5
            r0 = 29
            android.os.Message r0 = android.os.Message.obtain(r3, r1, r0, r13, r7)     // Catch:{ IOException -> 0x0b3c }
            r0.sendToTarget()     // Catch:{ IOException -> 0x0b3c }
        L_0x03e1:
            int r8 = r8 + 1
            goto L_0x02ed
        L_0x03e5:
            java.util.Iterator r16 = X.AnonymousClass000.A15(r9)     // Catch:{ IOException -> 0x0b3c }
        L_0x03e9:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x00e6
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r16)     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r9 = r0.getKey()     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r8 = r0.getValue()     // Catch:{ IOException -> 0x0b3c }
            if (r8 == 0) goto L_0x0b29
            X.206 r8 = (X.AnonymousClass206) r8     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r0 = r15.get(r9)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x040a
            r18 = -9223372036854775808
            goto L_0x0416
        L_0x040a:
            java.lang.Object r0 = r15.get(r9)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0b24
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ IOException -> 0x0b3c }
            long r0 = r0.A0y     // Catch:{ IOException -> 0x0b3c }
            r18 = r0
        L_0x0416:
            r0 = r24
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0421
            r11 = -9223372036854775808
            goto L_0x042d
        L_0x0421:
            r0 = r24
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0b1f
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ IOException -> 0x0b3c }
            long r11 = r0.A0y     // Catch:{ IOException -> 0x0b3c }
        L_0x042d:
            java.lang.Object r0 = r14.get(r9)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0435
            r10 = 0
            goto L_0x043f
        L_0x0435:
            java.lang.Object r0 = r14.get(r9)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0b1a
            int r10 = X.AnonymousClass000.A0M(r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x043f:
            r0 = r23
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0b15
            int r29 = X.AnonymousClass000.A0M(r0)     // Catch:{ IOException -> 0x0b3c }
            X.1Le r7 = r2.A0J     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r6 = r7.A09     // Catch:{ IOException -> 0x0b3c }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0b3c }
            X.C24661Le.A03(r7)     // Catch:{ all -> 0x0b12 }
            r0 = 4
            android.content.ContentValues r5 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x0b12 }
            X.2sx r13 = r7.A08(r9)     // Catch:{ all -> 0x0b12 }
            r0 = 2
            if (r13 == 0) goto L_0x048d
            int r1 = r13.A00()     // Catch:{ all -> 0x0b12 }
            int r1 = r1 + r29
            r13.A09(r1)     // Catch:{ all -> 0x0b12 }
            int r1 = r13.A01()     // Catch:{ all -> 0x0b12 }
            if (r1 > r0) goto L_0x0487
            long r0 = r13.A03()     // Catch:{ all -> 0x0b12 }
        L_0x0472:
            r13.A0A(r0)     // Catch:{ all -> 0x0b12 }
        L_0x0475:
            java.util.concurrent.ConcurrentHashMap r0 = r7.A0C     // Catch:{ all -> 0x0b12 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0b12 }
            r0.put(r9, r13)     // Catch:{ all -> 0x0b12 }
            X.C24661Le.A01(r5, r13)     // Catch:{ all -> 0x0b12 }
            r0 = 0
            X.C24661Le.A02(r5, r7, r9, r8, r0)     // Catch:{ all -> 0x0b12 }
            monitor-exit(r6)     // Catch:{ all -> 0x0b12 }
            goto L_0x03e9
        L_0x0487:
            int r0 = r13.A01()     // Catch:{ all -> 0x0b12 }
            long r0 = (long) r0     // Catch:{ all -> 0x0b12 }
            goto L_0x0472
        L_0x048d:
            if (r10 > r0) goto L_0x0490
            goto L_0x0492
        L_0x0490:
            long r3 = (long) r10     // Catch:{ all -> 0x0b12 }
            goto L_0x0494
        L_0x0492:
            long r3 = r8.A0y     // Catch:{ all -> 0x0b12 }
        L_0x0494:
            X.11P r0 = r7.A01     // Catch:{ all -> 0x0b12 }
            r26 = r0
            long r0 = r8.A0y     // Catch:{ all -> 0x0b12 }
            r32 = r0
            long r0 = r8.A0I     // Catch:{ all -> 0x0b12 }
            X.2sx r13 = new X.2sx     // Catch:{ all -> 0x0b12 }
            r34 = r18
            r25 = r13
            r27 = r9
            r28 = r10
            r30 = r32
            r32 = r18
            r36 = r11
            r38 = r3
            r40 = r0
            r25.<init>(r26, r27, r28, r29, r30, r32, r34, r36, r38, r40)     // Catch:{ all -> 0x0b12 }
            goto L_0x0475
        L_0x04b6:
            X.EE9 r0 = r3.pushnames_     // Catch:{ IOException -> 0x0b3c }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ IOException -> 0x0b3c }
        L_0x04bc:
            boolean r0 = r5.hasNext()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r4 = r5.next()     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r4)     // Catch:{ IOException -> 0x0b3c }
            X.2B6 r4 = (X.AnonymousClass2B6) r4     // Catch:{ IOException -> 0x0b3c }
            X.1Dv r1 = X.AnonymousClass1BI.A00     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r4.id_     // Catch:{ IOException -> 0x0b3c }
            X.1BI r0 = r1.A02(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x04bc
            X.1M9 r3 = r2.A05     // Catch:{ IOException -> 0x0b3c }
            X.1E7 r1 = r3.A0H(r0)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r4.pushname_     // Catch:{ IOException -> 0x0b3c }
            r1.A0c = r0     // Catch:{ IOException -> 0x0b3c }
            r3.A0W(r1)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x04bc
        L_0x04e3:
            int r0 = r3.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x092f
            X.11Q r0 = r2.A07     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r4 = r3.companionMetaNonce_     // Catch:{ IOException -> 0x0b3c }
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass11Q.A00(r0)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "companion_meta_nonce"
            X.C17880vN.A1E(r1, r0, r4)     // Catch:{ IOException -> 0x0b3c }
        L_0x04f6:
            X.EE9 r0 = r3.conversations_     // Catch:{ IOException -> 0x0b3c }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ IOException -> 0x0b3c }
        L_0x04fc:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0936
            java.lang.Object r4 = r16.next()     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r4)     // Catch:{ IOException -> 0x0b3c }
            X.8cf r4 = (X.C166298cf) r4     // Catch:{ IOException -> 0x0b3c }
            X.1Dv r1 = X.AnonymousClass1BI.A00     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r4.id_     // Catch:{ IOException -> 0x0b3c }
            X.1BI r6 = r1.A02(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r6 == 0) goto L_0x0924
            boolean r0 = X.C22971Dz.A0N(r6)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0924
            X.1CJ r7 = r2.A0E     // Catch:{ IOException -> 0x0b3c }
            X.1ci r0 = X.AnonymousClass1CJ.A00(r7, r6)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0553
            r0 = 1
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch     // Catch:{ IOException -> 0x0b3c }
            r8.<init>(r0)     // Catch:{ IOException -> 0x0b3c }
            X.1Co r9 = r2.A0C     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r5 = r4.name_     // Catch:{ IOException -> 0x0b3c }
            r1 = 10
            X.7Pc r0 = new X.7Pc     // Catch:{ IOException -> 0x0b3c }
            r0.<init>(r8, r1)     // Catch:{ IOException -> 0x0b3c }
            r14 = 0
            r10 = r17
            r11 = r6
            r12 = r0
            r13 = r5
            r9.A05(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x0b3c }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x054d }
            r0 = 10
            boolean r0 = r8.await(r0, r5)     // Catch:{ InterruptedException -> 0x054d }
            if (r0 != 0) goto L_0x0553
            java.lang.String r0 = "HistorySyncChunkProcessor/ Chat creation timed out"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x054d }
            goto L_0x0553
        L_0x054d:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncChunkProcessor/ Chat creation interrupted."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0b3c }
        L_0x0553:
            X.1ci r5 = X.AnonymousClass1CJ.A00(r7, r6)     // Catch:{ IOException -> 0x0b3c }
            if (r5 != 0) goto L_0x055f
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoFromConversation ChatInfo is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x04fc
        L_0x055f:
            boolean r0 = r4.notSpam_     // Catch:{ IOException -> 0x0b3c }
            r8 = 1
            if (r0 == 0) goto L_0x0567
            r5.A0D(r8)     // Catch:{ IOException -> 0x0b3c }
        L_0x0567:
            int r1 = r4.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0574
            boolean r0 = r4.markedAsUnread_     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0574
            r0 = -1
            goto L_0x0576
        L_0x0574:
            int r0 = r4.unreadCount_     // Catch:{ IOException -> 0x0b3c }
        L_0x0576:
            monitor-enter(r5)     // Catch:{ IOException -> 0x0b3c }
            r5.A0A = r0     // Catch:{ all -> 0x0b36 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r4.ephemeralSettingTimestamp_     // Catch:{ IOException -> 0x0b3c }
            r9 = 0
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x05a3
            int r10 = r4.ephemeralExpiration_     // Catch:{ IOException -> 0x0b3c }
            boolean r7 = X.C22971Dz.A0d(r6)     // Catch:{ IOException -> 0x0b3c }
            if (r7 == 0) goto L_0x05d3
            X.8ci r7 = r4.disappearingMode_     // Catch:{ IOException -> 0x0b3c }
            if (r7 != 0) goto L_0x0590
            X.8ci r7 = X.C166328ci.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0b3c }
        L_0x0590:
            X.9K8 r7 = r7.A0R()     // Catch:{ IOException -> 0x0b3c }
            int r9 = r7.value     // Catch:{ IOException -> 0x0b3c }
            r7 = 0
            int r9 = java.lang.Math.max(r7, r9)     // Catch:{ IOException -> 0x0b3c }
            r7 = 3
            int r7 = java.lang.Math.min(r7, r9)     // Catch:{ IOException -> 0x0b3c }
        L_0x05a0:
            r5.A0E(r10, r0, r7)     // Catch:{ IOException -> 0x0b3c }
        L_0x05a3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoFromConversation setArchive - "
            r1.append(r0)     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r4.archived_     // Catch:{ IOException -> 0x0b3c }
            X.C17900vP.A0r(r1, r0)     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r4.archived_     // Catch:{ IOException -> 0x0b3c }
            r5.A0l = r0     // Catch:{ IOException -> 0x0b3c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoFromConversation setLocked - "
            r1.append(r0)     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r4.locked_     // Catch:{ IOException -> 0x0b3c }
            X.C17900vP.A0r(r1, r0)     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r4.locked_     // Catch:{ IOException -> 0x0b3c }
            r5.A0m = r0     // Catch:{ IOException -> 0x0b3c }
            long r0 = r4.conversationTimestamp_     // Catch:{ IOException -> 0x0b3c }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r9
            r5.A0H(r0)     // Catch:{ IOException -> 0x0b3c }
            int r0 = r4.unreadMentionCount_     // Catch:{ IOException -> 0x0b3c }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x05d9
        L_0x05d3:
            boolean r7 = r6 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x0b3c }
            if (r7 == 0) goto L_0x05a3
            r7 = 0
            goto L_0x05a0
        L_0x05d9:
            r5.A08 = r0     // Catch:{ all -> 0x0b36 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0b3c }
            int r0 = r4.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0602
            int r1 = r4.endOfHistoryTransferType_     // Catch:{ IOException -> 0x0b3c }
            if (r1 == 0) goto L_0x05ef
            if (r1 == r8) goto L_0x05ec
            r0 = 2
            if (r1 != r0) goto L_0x05ef
            goto L_0x05f2
        L_0x05ec:
            X.2R7 r0 = X.AnonymousClass2R7.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0b3c }
            goto L_0x05f4
        L_0x05ef:
            X.2R7 r0 = X.AnonymousClass2R7.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0b3c }
            goto L_0x05f4
        L_0x05f2:
            X.2R7 r0 = X.AnonymousClass2R7.COMPLETE_ON_DEMAND_SYNC_BUT_MORE_MSG_REMAIN_ON_PRIMARY     // Catch:{ IOException -> 0x0b3c }
        L_0x05f4:
            int r7 = r0.ordinal()     // Catch:{ IOException -> 0x0b3c }
            r1 = 2
            r0 = 0
            if (r7 == r0) goto L_0x05ff
            if (r7 == r1) goto L_0x05ff
            r1 = 0
        L_0x05ff:
            r5.A04 = r1     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0604
        L_0x0602:
            r5.A04 = r8     // Catch:{ IOException -> 0x0b3c }
        L_0x0604:
            int r1 = r4.bitField1_     // Catch:{ IOException -> 0x0b3c }
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0610
            boolean r0 = r4.isParentGroup_     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0610
            r5.A03 = r8     // Catch:{ IOException -> 0x0b3c }
        L_0x0610:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x061b
            boolean r0 = r4.isDefaultSubgroup_     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x061b
            r0 = 3
            r5.A03 = r0     // Catch:{ IOException -> 0x0b3c }
        L_0x061b:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0622
            r0 = 2
            r5.A03 = r0     // Catch:{ IOException -> 0x0b3c }
        L_0x0622:
            X.EE9 r1 = r4.messages_     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r1)     // Catch:{ IOException -> 0x0b3c }
            int r0 = r3.syncType_     // Catch:{ IOException -> 0x0b3c }
            X.9KV r0 = X.AnonymousClass9KV.A00(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0631
            X.9KV r0 = X.AnonymousClass9KV.INITIAL_BOOTSTRAP     // Catch:{ IOException -> 0x0b3c }
        L_0x0631:
            java.util.ArrayList r9 = r2.A05(r0, r1)     // Catch:{ IOException -> 0x0b3c }
            X.EE9 r0 = r4.messages_     // Catch:{ IOException -> 0x0b3c }
            r0.size()     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r9.isEmpty()     // Catch:{ IOException -> 0x0b3c }
            r7 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0678
            int r0 = r9.size()     // Catch:{ IOException -> 0x0b3c }
            int r0 = r0 - r8
            java.lang.Object r0 = r9.get(r0)     // Catch:{ IOException -> 0x0b3c }
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ IOException -> 0x0b3c }
            long r0 = r0.A0I     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0b3c }
            r10 = 0
            java.lang.Object r11 = r9.get(r10)     // Catch:{ IOException -> 0x0b3c }
            X.206 r11 = (X.AnonymousClass206) r11     // Catch:{ IOException -> 0x0b3c }
            r5.A0I(r11)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r11.A0y     // Catch:{ IOException -> 0x0b3c }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0b3c }
            r5.A0Q = r0     // Catch:{ all -> 0x0b36 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r11.A0x     // Catch:{ IOException -> 0x0b3c }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0b3c }
            r5.A0P = r0     // Catch:{ all -> 0x0b36 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0b3c }
            X.2Qs r1 = r11.A0J     // Catch:{ IOException -> 0x0b3c }
            X.2Qs r0 = r5.A0b     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0672
            r5.A0b = r1     // Catch:{ IOException -> 0x0b3c }
        L_0x0672:
            int r1 = r9.size()     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0736
        L_0x0678:
            r8 = 0
            goto L_0x0692
        L_0x067a:
            java.lang.Object r11 = r9.get(r10)     // Catch:{ IOException -> 0x0b3c }
            X.206 r11 = (X.AnonymousClass206) r11     // Catch:{ IOException -> 0x0b3c }
            X.1Qr r0 = r2.A0P     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = X.AnonymousClass25A.A0X(r0, r11, r7)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0728
            long r0 = r11.A0y     // Catch:{ IOException -> 0x0b3c }
            r5.A0G(r0)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r11.A0x     // Catch:{ IOException -> 0x0b3c }
            r5.A0F(r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x0692:
            X.1LW r1 = r2.A0D     // Catch:{ IOException -> 0x0b3c }
            android.content.ContentValues r0 = r5.A07(r8)     // Catch:{ IOException -> 0x0b3c }
            r1.A0M(r0, r5)     // Catch:{ IOException -> 0x0b3c }
            X.1M9 r9 = r2.A05     // Catch:{ IOException -> 0x0b3c }
            X.1E7 r8 = r9.A0H(r6)     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x073d
            java.lang.String r0 = r4.name_     // Catch:{ IOException -> 0x0b3c }
            r8.A0R = r0     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r5 = r4.pHash_     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0b(r5)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r1 = "1:"
            r10 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r5, r1, r10)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x06bb
            java.lang.String r5 = X.C17900vP.A0A(r1, r5)     // Catch:{ IOException -> 0x0b3c }
        L_0x06bb:
            r8.A0U = r5     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r4.suspended_     // Catch:{ IOException -> 0x0b3c }
            r8.A0t = r0     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r4.readOnly_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x06f1
            X.1BI r0 = r8.A0J     // Catch:{ IOException -> 0x0b3c }
            X.1E9 r7 = X.C50242Tr.A00(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r7 == 0) goto L_0x0b2e
            X.11S r0 = r2.A02     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jid.PhoneUserJid r5 = X.AnonymousClass11S.A01(r0)     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r5)     // Catch:{ IOException -> 0x0b3c }
            X.1MZ r1 = r2.A0F     // Catch:{ IOException -> 0x0b3c }
            X.2sr r0 = new X.2sr     // Catch:{ IOException -> 0x0b3c }
            r0.<init>((com.whatsapp.jid.UserJid) r5, (int) r10, (boolean) r10, (boolean) r10)     // Catch:{ IOException -> 0x0b3c }
            java.util.List r0 = X.C18070vi.A0M(r0)     // Catch:{ IOException -> 0x0b3c }
            r1.A0E(r7, r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x06e6:
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x08a2
            boolean r0 = r4.capiCreatedGroup_     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x08a2
            goto L_0x073a
        L_0x06f1:
            int r5 = r4.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0700
            long r0 = r4.createdAt_     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0b3c }
            r8.A0X = r0     // Catch:{ IOException -> 0x0b3c }
        L_0x0700:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x070f
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r4.createdBy_     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)     // Catch:{ IOException -> 0x0b3c }
            r8.A0K = r0     // Catch:{ IOException -> 0x0b3c }
        L_0x070f:
            long r0 = r4.createdAt_     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r7 = r4.description_     // Catch:{ IOException -> 0x0b3c }
            X.1yX r5 = new X.1yX     // Catch:{ IOException -> 0x0b3c }
            r20 = r17
            r21 = r17
            r18 = r5
            r19 = r17
            r22 = r7
            r23 = r0
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x0b3c }
            r8.A09(r5)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x06e6
        L_0x0728:
            int r0 = r9.size()     // Catch:{ IOException -> 0x0b3c }
            int r0 = r0 - r7
            if (r10 != r0) goto L_0x0734
            java.lang.String r0 = "HistorySyncChunkProcessor/updateChatInfoWithAddedMessages no display message in initial history sync"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x0734:
            int r10 = r10 + 1
        L_0x0736:
            if (r10 >= r1) goto L_0x0692
            goto L_0x067a
        L_0x073a:
            r10 = 1
            goto L_0x08a2
        L_0x073d:
            boolean r0 = X.C22971Dz.A0d(r6)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x08a7
            r9 = r6
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ IOException -> 0x0b3c }
            r0 = 2
            byte[][] r5 = new byte[r0][]     // Catch:{ 1Ak -> 0x078b }
            byte[] r1 = new byte[r7]     // Catch:{ 1Ak -> 0x078b }
            r8 = 5
            r0 = 0
            r1[r0] = r8     // Catch:{ 1Ak -> 0x078b }
            r5[r0] = r1     // Catch:{ 1Ak -> 0x078b }
            X.DSQ r0 = r4.contactPrimaryIdentityKey_     // Catch:{ 1Ak -> 0x078b }
            byte[] r0 = r0.A06()     // Catch:{ 1Ak -> 0x078b }
            r5[r7] = r0     // Catch:{ 1Ak -> 0x078b }
            byte[] r0 = X.A8G.A05(r5)     // Catch:{ 1Ak -> 0x078b }
            X.1jP r7 = X.C63962tz.A01(r0)     // Catch:{ 1Ak -> 0x078b }
            X.1P3 r5 = r2.A09     // Catch:{ 1Ak -> 0x078b }
            boolean r0 = r5.A0Y()     // Catch:{ 1Ak -> 0x078b }
            if (r0 == 0) goto L_0x077a
            com.whatsapp.jid.DeviceJid r0 = r9.getPrimaryDevice()     // Catch:{ 1Ak -> 0x078b }
            X.2nE r1 = X.C63962tz.A02(r0)     // Catch:{ 1Ak -> 0x078b }
            X.2kO r0 = new X.2kO     // Catch:{ 1Ak -> 0x078b }
            r0.<init>(r7)     // Catch:{ 1Ak -> 0x078b }
            r5.A0a(r0, r1)     // Catch:{ 1Ak -> 0x078b }
            goto L_0x0794
        L_0x077a:
            X.00H r0 = r2.A0V     // Catch:{ 1Ak -> 0x078b }
            java.lang.Object r1 = r0.get()     // Catch:{ 1Ak -> 0x078b }
            X.1Ot r1 = (X.C25581Ot) r1     // Catch:{ 1Ak -> 0x078b }
            X.3Cl r0 = new X.3Cl     // Catch:{ 1Ak -> 0x078b }
            r0.<init>(r2, r9, r7, r8)     // Catch:{ 1Ak -> 0x078b }
            r1.A02(r0)     // Catch:{ 1Ak -> 0x078b }
            goto L_0x0794
        L_0x078b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "HistorySyncChunkProcessor/ invalid public key jid="
            X.C17900vP.A0X(r9, r0, r1)     // Catch:{ IOException -> 0x0b3c }
        L_0x0794:
            int r1 = r4.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x07b0
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x07b0
            X.1Mx r7 = r2.A06     // Catch:{ IOException -> 0x0b3c }
            X.DSQ r0 = r4.tcToken_     // Catch:{ IOException -> 0x0b3c }
            byte[] r5 = r0.A06()     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r5)     // Catch:{ IOException -> 0x0b3c }
            long r0 = r4.tcTokenTimestamp_     // Catch:{ IOException -> 0x0b3c }
            r7.A07(r9, r5, r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x07b0:
            int r1 = r4.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x07be
            X.1Mx r5 = r2.A06     // Catch:{ IOException -> 0x0b3c }
            long r0 = r4.tcTokenSenderTimestamp_     // Catch:{ IOException -> 0x0b3c }
            r5.A0A(r9, r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x07be:
            boolean r0 = r9 instanceof X.AnonymousClass1E2     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x07d4
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x08a7
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r4.lidJid_     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jid.UserJid r9 = r1.A04(r0)     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r9 instanceof X.AnonymousClass1E2     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x08a7
        L_0x07d4:
            X.1E2 r9 = (X.AnonymousClass1E2) r9     // Catch:{ IOException -> 0x0b3c }
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x07e6
            X.1M4 r1 = r2.A0A     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r4.displayName_     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x0b3c }
            r1.Bdb(r9, r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x07e6:
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x07ff
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = r4.pnJid_     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jid.UserJid r1 = r1.A04(r0)     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x07ff
            X.1Ln r0 = r2.A0K     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ IOException -> 0x0b3c }
            r0.A0P(r9, r1)     // Catch:{ IOException -> 0x0b3c }
        L_0x07ff:
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x080e
            boolean r0 = r4.shareOwnPn_     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x080e
            X.1RL r0 = r2.A0L     // Catch:{ IOException -> 0x0b3c }
            r0.A08(r9)     // Catch:{ IOException -> 0x0b3c }
        L_0x080e:
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x08a7
            X.1RL r14 = r2.A0L     // Catch:{ IOException -> 0x0b3c }
            boolean r15 = r4.pnhDuplicateLidThread_     // Catch:{ IOException -> 0x0b3c }
            monitor-enter(r14)     // Catch:{ IOException -> 0x0b3c }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ all -> 0x0b33 }
            X.1DL r0 = r14.A02     // Catch:{ all -> 0x0b33 }
            long r0 = r0.A09(r9)     // Catch:{ all -> 0x0b33 }
            r7 = -1
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x08a0
            X.00H r5 = r14.A05     // Catch:{ all -> 0x0b33 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0b33 }
            X.2nB r5 = (X.C59972nB) r5     // Catch:{ all -> 0x0b33 }
            X.1Cd r5 = r5.A00     // Catch:{ all -> 0x0879 }
            X.1au r13 = r5.A05()     // Catch:{ all -> 0x0879 }
            X.C18070vi.A0b(r13)     // Catch:{ all -> 0x0872 }
            X.1xA r12 = r13.BD0()     // Catch:{ all -> 0x0872 }
            android.content.ContentValues r11 = X.C17880vN.A08()     // Catch:{ all -> 0x086b }
            java.lang.String r5 = "jid_row_id"
            X.C17880vN.A19(r11, r5, r0)     // Catch:{ all -> 0x086b }
            java.lang.String r7 = "pnh_duplicate_lid_thread"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x086b }
            r11.put(r7, r5)     // Catch:{ all -> 0x086b }
            java.lang.String r10 = "LidChatStateStore/SET_LID_DUPLICATE_FLAG"
            r5 = r13
            X.1av r5 = (X.C28801av) r5     // Catch:{ all -> 0x086b }
            X.1Ev r8 = r5.A02     // Catch:{ all -> 0x086b }
            r7 = 5
            java.lang.String r5 = "lid_chat_state"
            r8.A09(r5, r10, r11, r7)     // Catch:{ all -> 0x086b }
            r12.A00()     // Catch:{ all -> 0x086b }
            r12.close()     // Catch:{ all -> 0x0872 }
            r13.close()     // Catch:{ all -> 0x0879 }
            java.lang.Boolean r8 = X.AnonymousClass000.A0i()     // Catch:{ all -> 0x0879 }
            goto L_0x087f
        L_0x086b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x086d }
        L_0x086d:
            r5 = move-exception
            X.CDX.A00(r12, r7)     // Catch:{ all -> 0x0872 }
            throw r5     // Catch:{ all -> 0x0872 }
        L_0x0872:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0874 }
        L_0x0874:
            r5 = move-exception
            X.CDX.A00(r13, r7)     // Catch:{ all -> 0x0879 }
            throw r5     // Catch:{ all -> 0x0879 }
        L_0x0879:
            r5 = move-exception
            X.1IU r8 = new X.1IU     // Catch:{ all -> 0x0b33 }
            r8.<init>(r5)     // Catch:{ all -> 0x0b33 }
        L_0x087f:
            java.lang.Throwable r7 = X.C30671eK.A00(r8)     // Catch:{ all -> 0x0b33 }
            if (r7 == 0) goto L_0x088b
            java.lang.String r5 = "{LidChatStateStore/}failed to set duplicate flag"
            com.whatsapp.util.Log.e(r5, r7)     // Catch:{ all -> 0x0b33 }
        L_0x088b:
            java.lang.Boolean r7 = X.AnonymousClass000.A0h()     // Catch:{ all -> 0x0b33 }
            boolean r5 = r8 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x0b33 }
            if (r5 == 0) goto L_0x0894
            r8 = r7
        L_0x0894:
            boolean r5 = X.AnonymousClass000.A1Y(r8)     // Catch:{ all -> 0x0b33 }
            if (r5 == 0) goto L_0x08a0
            X.AnonymousClass1RL.A02(r14, r0, r15)     // Catch:{ all -> 0x0b33 }
            X.AnonymousClass1RL.A03(r14, r9, r0)     // Catch:{ all -> 0x0b33 }
        L_0x08a0:
            monitor-exit(r14)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x08a7
        L_0x08a2:
            r8.A03 = r10     // Catch:{ IOException -> 0x0b3c }
            r9.A0X(r8)     // Catch:{ IOException -> 0x0b3c }
        L_0x08a7:
            r5 = 0
            r8 = 1
            int r0 = r4.bitField1_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x04fc
            X.11S r0 = r2.A02     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r0.A0N()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x04fc
            boolean r0 = X.C22971Dz.A0d(r6)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x04fc
            boolean r0 = X.C22971Dz.A0Z(r6)     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x04fc
            int r1 = r4.systemMessageToInsert_     // Catch:{ Exception -> 0x0912 }
            if (r1 == r8) goto L_0x08d4
            r0 = 2
            if (r1 == r0) goto L_0x08d1
            r0 = 3
            if (r1 == r0) goto L_0x08ce
            goto L_0x08d7
        L_0x08ce:
            X.2R8 r0 = X.AnonymousClass2R8.NE2EE_OTHER     // Catch:{ Exception -> 0x0912 }
            goto L_0x08d9
        L_0x08d1:
            X.2R8 r0 = X.AnonymousClass2R8.NE2EE_SELF     // Catch:{ Exception -> 0x0912 }
            goto L_0x08d9
        L_0x08d4:
            X.2R8 r0 = X.AnonymousClass2R8.E2EE_MSG     // Catch:{ Exception -> 0x0912 }
            goto L_0x08d9
        L_0x08d7:
            X.2R8 r0 = X.AnonymousClass2R8.E2EE_MSG     // Catch:{ Exception -> 0x0912 }
        L_0x08d9:
            int r1 = r0.ordinal()     // Catch:{ Exception -> 0x0912 }
            if (r1 == r5) goto L_0x08e5
            r0 = 2
            r7 = 5
            if (r1 == r0) goto L_0x08e6
            r7 = 4
            goto L_0x08e6
        L_0x08e5:
            r7 = 1
        L_0x08e6:
            X.00H r0 = r2.A0W     // Catch:{ Exception -> 0x0910 }
            java.lang.Object r9 = r0.get()     // Catch:{ Exception -> 0x0910 }
            X.1PQ r9 = (X.AnonymousClass1PQ) r9     // Catch:{ Exception -> 0x0910 }
            X.11P r0 = r2.A08     // Catch:{ Exception -> 0x0910 }
            long r13 = X.AnonymousClass11P.A01(r0)     // Catch:{ Exception -> 0x0910 }
            X.1yi r0 = X.C42771yi.A00()     // Catch:{ Exception -> 0x0910 }
            java.lang.String r11 = X.AnonymousClass17K.A00(r0, r6)     // Catch:{ Exception -> 0x0910 }
            r10 = r6
            r12 = r7
            X.2MD r1 = r9.A03(r10, r11, r12, r13)     // Catch:{ Exception -> 0x0910 }
            X.00H r0 = r2.A0U     // Catch:{ Exception -> 0x0910 }
            X.1W6 r0 = X.C17880vN.A0c(r0)     // Catch:{ Exception -> 0x0910 }
            r0.A04(r1)     // Catch:{ Exception -> 0x0910 }
            r2.A01(r7, r8)     // Catch:{ Exception -> 0x0910 }
            goto L_0x04fc
        L_0x0910:
            r0 = move-exception
            goto L_0x0914
        L_0x0912:
            r0 = move-exception
            r7 = 0
        L_0x0914:
            X.190 r4 = r2.A00     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r1 = "HistorySyncChunkProcessor/ could not insert system message"
            java.lang.String r0 = r0.getMessage()     // Catch:{ IOException -> 0x0b3c }
            r4.A0G(r1, r0, r5)     // Catch:{ IOException -> 0x0b3c }
            r2.A01(r7, r5)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x04fc
        L_0x0924:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "HistorySyncChunkProcessor/ skip importing of chatJid="
            X.C17900vP.A0Z(r6, r0, r1)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x04fc
        L_0x092f:
            java.lang.String r0 = "HistorySyncChunkProcessor/ initial bootstrap did not contain companion meta nonce"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x04f6
        L_0x0936:
            int r0 = r3.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0973
            X.8cV r4 = r3.globalSettings_     // Catch:{ IOException -> 0x0b3c }
            if (r4 != 0) goto L_0x0942
            X.8cV r4 = X.C166198cV.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0b3c }
        L_0x0942:
            X.C18070vi.A0X(r4)     // Catch:{ IOException -> 0x0b3c }
            int r1 = r4.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0973
            X.8Yg r4 = r4.chatLockSettings_     // Catch:{ IOException -> 0x0b3c }
            if (r4 != 0) goto L_0x0952
            X.8Yg r4 = X.C164288Yg.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0b3c }
        L_0x0952:
            int r0 = r4.bitField0_     // Catch:{ IOException -> 0x0b3c }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0973
            X.1TK r1 = r2.A03     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = r4.hideLockedChats_     // Catch:{ IOException -> 0x0b3c }
            r1.A02(r0)     // Catch:{ IOException -> 0x0b3c }
            X.00H r0 = r2.A0T     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0b3c }
            X.2nD r1 = (X.C59992nD) r1     // Catch:{ IOException -> 0x0b3c }
            X.8ax r0 = r4.secretCode_     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x096d
            X.8ax r0 = X.C165328ax.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0b3c }
        L_0x096d:
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x0b3c }
            r1.A03(r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x0973:
            X.DSQ r0 = r3.threadIdUserSecret_     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0983
            java.lang.String r0 = "HistorySyncChunkProcessor/applyInitialBootstrapSync thread-id-user-secret is not found"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x097c:
            X.EE9 r0 = r3.conversations_     // Catch:{ IOException -> 0x0b3c }
            r0.size()     // Catch:{ IOException -> 0x0b3c }
            goto L_0x00e6
        L_0x0983:
            X.0ve r4 = r2.A0N     // Catch:{ IOException -> 0x0b3c }
            r1 = 8278(0x2056, float:1.16E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IOException -> 0x0b3c }
            boolean r0 = X.C18020vd.A05(r0, r4, r1)     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x097c
            X.00H r0 = r2.A0X     // Catch:{ IOException -> 0x0b3c }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x0b3c }
            X.1Nl r1 = (X.C25241Nl) r1     // Catch:{ IOException -> 0x0b3c }
            X.DSQ r0 = r3.threadIdUserSecret_     // Catch:{ IOException -> 0x0b3c }
            byte[] r0 = r0.A06()     // Catch:{ IOException -> 0x0b3c }
            r1.A07(r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x097c
        L_0x09a1:
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x09a9
            r11.A10 = r2     // Catch:{ IOException -> 0x0b3c }
        L_0x09a9:
            r0 = r42
            int r2 = r0.A00     // Catch:{ IOException -> 0x0b3c }
            r11.A01 = r2     // Catch:{ IOException -> 0x0b3c }
            int r8 = r9.A01     // Catch:{ IOException -> 0x0b3c }
            int r10 = r9.A00     // Catch:{ IOException -> 0x0b3c }
            r13 = 1
            if (r8 == 0) goto L_0x09f0
            r1 = 100
            r0 = 3
            if (r8 == r4) goto L_0x09e2
            if (r8 != r0) goto L_0x0a1b
            if (r2 != r1) goto L_0x09e9
            X.118 r0 = r5.A07     // Catch:{ IOException -> 0x0b3c }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0b3c }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ IOException -> 0x0b3c }
            r1 = 4
            X.AiL r0 = new X.AiL     // Catch:{ IOException -> 0x0b3c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0b3c }
            java.io.File[] r3 = r2.listFiles(r0)     // Catch:{ IOException -> 0x0b3c }
            if (r3 == 0) goto L_0x0a1b
            int r2 = r3.length     // Catch:{ IOException -> 0x0b3c }
            r1 = 0
        L_0x09d5:
            if (r1 >= r2) goto L_0x0a1b
            r0 = r3[r1]     // Catch:{ IOException -> 0x0b3c }
            X.C18070vi.A0b(r0)     // Catch:{ IOException -> 0x0b3c }
            r0.delete()     // Catch:{ IOException -> 0x0b3c }
            int r1 = r1 + 1
            goto L_0x09d5
        L_0x09e2:
            if (r2 != r1) goto L_0x09e9
            org.json.JSONObject r12 = X.C34841lA.A00(r0, r13)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0a0a
        L_0x09e9:
            int r0 = r10 + 1
            org.json.JSONObject r12 = X.C34841lA.A00(r8, r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0a0a
        L_0x09f0:
            org.json.JSONObject r12 = X.C34841lA.A00(r4, r13)     // Catch:{ IOException -> 0x0b3c }
            X.1lB r3 = r5.A03     // Catch:{ IOException -> 0x0b3c }
            monitor-enter(r3)     // Catch:{ IOException -> 0x0b3c }
            X.2Zn r0 = r3.A00     // Catch:{ all -> 0x0b39 }
            if (r0 == 0) goto L_0x0a09
            X.Af0 r2 = r0.A00     // Catch:{ all -> 0x0b39 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0b39 }
            X.2Dn r0 = new X.2Dn     // Catch:{ all -> 0x0b39 }
            r0.<init>(r1)     // Catch:{ all -> 0x0b39 }
            r2.A0B(r0)     // Catch:{ all -> 0x0b39 }
        L_0x0a09:
            monitor-exit(r3)     // Catch:{ IOException -> 0x0b3c }
        L_0x0a0a:
            if (r12 == 0) goto L_0x0a1b
            X.11Q r0 = r5.A05     // Catch:{ IOException -> 0x0b3c }
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass11Q.A00(r0)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r1 = "history_sync_companion_state"
            java.lang.String r0 = r12.toString()     // Catch:{ IOException -> 0x0b3c }
            X.C17880vN.A1E(r2, r1, r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x0a1b:
            boolean r16 = X.AnonymousClass000.A1W(r46)
            X.1N9 r0 = r5.A0A     // Catch:{ IOException -> 0x0b3c }
            r0.A08(r11)     // Catch:{ IOException -> 0x0b3c }
            X.1Tb r11 = r5.A02     // Catch:{ IOException -> 0x0b3c }
            r0 = r42
            int r0 = r0.A00     // Catch:{ IOException -> 0x0b3c }
            long r2 = (long) r0     // Catch:{ IOException -> 0x0b3c }
            r0 = r42
            long r0 = r0.A01     // Catch:{ IOException -> 0x0b3c }
            X.2H1 r12 = new X.2H1     // Catch:{ IOException -> 0x0b3c }
            r12.<init>()     // Catch:{ IOException -> 0x0b3c }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0b3c }
            r12.A05 = r13     // Catch:{ IOException -> 0x0b3c }
            java.lang.Integer r13 = X.C26371Rw.A01(r8)     // Catch:{ IOException -> 0x0b3c }
            r12.A03 = r13     // Catch:{ IOException -> 0x0b3c }
            java.lang.Integer r13 = X.C26371Rw.A00(r8)     // Catch:{ IOException -> 0x0b3c }
            r12.A04 = r13     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r13 = X.C26681Tb.A00(r11)     // Catch:{ IOException -> 0x0b3c }
            r12.A0A = r13     // Catch:{ IOException -> 0x0b3c }
            X.11P r13 = r11.A01     // Catch:{ IOException -> 0x0b3c }
            long r14 = X.AnonymousClass11P.A01(r13)     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r13 = java.lang.Long.valueOf(r14)     // Catch:{ IOException -> 0x0b3c }
            r12.A09 = r13     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x0b3c }
            r12.A07 = r2     // Catch:{ IOException -> 0x0b3c }
            long r14 = r14 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ IOException -> 0x0b3c }
            r12.A08 = r0     // Catch:{ IOException -> 0x0b3c }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)     // Catch:{ IOException -> 0x0b3c }
            r12.A00 = r0     // Catch:{ IOException -> 0x0b3c }
            java.lang.Long r0 = X.C17880vN.A0n(r10)     // Catch:{ IOException -> 0x0b3c }
            r12.A06 = r0     // Catch:{ IOException -> 0x0b3c }
            X.18K r0 = r11.A02     // Catch:{ IOException -> 0x0b3c }
            r0.CC7(r12)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r2 = r9.A05     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r1 = r9.A04     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r3 = r9.A07     // Catch:{ IOException -> 0x0b3c }
            X.11Q r0 = r5.A05     // Catch:{ IOException -> 0x0b3c }
            android.content.SharedPreferences r11 = X.AnonymousClass11Q.A01(r0)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r9 = "companion_meta_nonce"
            r0 = r17
            java.lang.String r16 = r11.getString(r9, r0)     // Catch:{ IOException -> 0x0b3c }
            if (r1 == 0) goto L_0x0aa8
            int r0 = r1.length()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0aa8
            if (r3 == 0) goto L_0x0aa8
            int r0 = r3.length()     // Catch:{ IOException -> 0x0b3c }
            if (r0 == 0) goto L_0x0aa8
            X.1Mm r0 = r5.A01     // Catch:{ IOException -> 0x0b3c }
            com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob r11 = new com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob     // Catch:{ IOException -> 0x0b3c }
            r12 = r7
            r13 = r2
            r14 = r1
            r15 = r3
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x0b3c }
            r0.A01(r11)     // Catch:{ IOException -> 0x0b3c }
        L_0x0aa8:
            X.1l8 r0 = r5.A09     // Catch:{ IOException -> 0x0b3c }
            r0.A03(r7)     // Catch:{ IOException -> 0x0b3c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = "ReceiveHistorySyncManager/ processed syncType="
            r1.append(r0)     // Catch:{ IOException -> 0x0b3c }
            r1.append(r8)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = " chunkOrder="
            r1.append(r0)     // Catch:{ IOException -> 0x0b3c }
            r1.append(r10)     // Catch:{ IOException -> 0x0b3c }
            java.lang.String r0 = " progress="
            r1.append(r0)     // Catch:{ IOException -> 0x0b3c }
            r0 = r42
            int r0 = r0.A00     // Catch:{ IOException -> 0x0b3c }
            X.C17900vP.A0o(r1, r0)     // Catch:{ IOException -> 0x0b3c }
            if (r46 == 0) goto L_0x0ada
            boolean r0 = r46.delete()     // Catch:{ IOException -> 0x0b3c }
            if (r0 != 0) goto L_0x0ada
            java.lang.String r0 = "ReceiveHistorySyncManager/ failed to delete local chunk file."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x0ada:
            if (r8 == r4) goto L_0x0adf
            r0 = 3
            if (r8 != r0) goto L_0x0aea
        L_0x0adf:
            X.10I r2 = r5.A0B     // Catch:{ IOException -> 0x0b3c }
            r1 = 0
            X.7Pc r0 = new X.7Pc     // Catch:{ IOException -> 0x0b3c }
            r0.<init>(r5, r1)     // Catch:{ IOException -> 0x0b3c }
            r2.CGF(r0)     // Catch:{ IOException -> 0x0b3c }
        L_0x0aea:
            com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker.A00(r6)     // Catch:{ IOException -> 0x0b3c }
            return
        L_0x0aee:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0af3:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0af6:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0af9 }
            throw r0     // Catch:{ all -> 0x0af9 }
        L_0x0af9:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0afe }
            goto L_0x0b02
        L_0x0afe:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0b03 }
        L_0x0b02:
            throw r1     // Catch:{ all -> 0x0b03 }
        L_0x0b03:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0b08 }
            goto L_0x0b3b
        L_0x0b08:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b0d:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r20)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b12:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0b12 }
            goto L_0x0b3b
        L_0x0b15:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r20)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b1a:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r20)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b1f:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r20)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b24:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r20)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b29:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r20)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b2e:
            java.lang.IllegalArgumentException r1 = X.C17890vO.A0K()     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b33:
            r1 = move-exception
            monitor-exit(r14)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b36:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0b3c }
            goto L_0x0b3b
        L_0x0b39:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0b3c }
        L_0x0b3b:
            throw r1     // Catch:{ IOException -> 0x0b3c }
        L_0x0b3c:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncChunkProcessor/ unable to parse history sync protobuf"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = r43
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63822tk.A02(X.2ia, X.2ee, X.2tk, java.io.File, byte[], int, int):void");
    }
}
