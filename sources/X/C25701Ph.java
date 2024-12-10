package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1Ph  reason: invalid class name and case insensitive filesystem */
public class C25701Ph extends C23411Fy implements AnonymousClass1G3, AnonymousClass1G5, AnonymousClass1G6 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Object[] A04;
    public final int A05;
    public final int A06;
    public final C25691Pg A07;

    /* JADX WARNING: type inference failed for: r13v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r3 = (X.AnonymousClass3JR) r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C30391dr[] A07(X.C30391dr[] r13) {
        /*
            r12 = this;
            int r7 = r13.length
            int r0 = r12.A00
            if (r0 == 0) goto L_0x003e
            X.1Ws[] r6 = r12.A01
            if (r6 == 0) goto L_0x003e
            int r5 = r6.length
            r4 = 0
        L_0x000b:
            if (r4 >= r5) goto L_0x003e
            r3 = r6[r4]
            if (r3 == 0) goto L_0x003b
            X.3JR r3 = (X.AnonymousClass3JR) r3
            X.1dr r2 = r3.A01
            if (r2 == 0) goto L_0x003b
            long r10 = r12.A00(r3)
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            int r0 = r13.length
            if (r7 < r0) goto L_0x0033
            int r0 = r13.length
            r1 = 2
            int r0 = r0 * 2
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r0)
            X.C18070vi.A0X(r13)
        L_0x0033:
            int r1 = r7 + 1
            r13[r7] = r2
            r0 = 0
            r3.A01 = r0
            r7 = r1
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x003e:
            X.1dr[] r13 = (X.C30391dr[]) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25701Ph.A07(X.1dr[]):X.1dr[]");
    }

    public Object BFC(C30391dr r2, AnonymousClass1G2 r3) {
        return A01(r2, r3, this);
    }

    public Object BJt(Object obj, C30391dr r13) {
        AnonymousClass3E4 r5;
        Object obj2 = obj;
        if (!CPw(obj)) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
            C31781g7 r7 = new C31781g7(1, C30581eB.A02(r13));
            r7.A0F();
            C30391dr[] r4 = AnonymousClass2WA.A00;
            synchronized (this) {
                if (A06(obj)) {
                    r7.resumeWith(C27621Wu.A00);
                    r4 = A07(r4);
                    r5 = null;
                } else {
                    long min = Math.min(this.A02, this.A03);
                    int i = this.A00;
                    int i2 = this.A01;
                    r5 = new AnonymousClass3E4(obj2, r7, this, ((long) (i + i2)) + min);
                    A04(r5);
                    this.A01 = i2 + 1;
                    if (this.A05 == 0) {
                        r4 = A07(r4);
                    }
                }
            }
            if (r5 != null) {
                C60682oR.A01(new AnonymousClass3E0(r5), r7);
            }
            for (C30391dr r1 : r4) {
                if (r1 != null) {
                    r1.resumeWith(C27621Wu.A00);
                }
            }
            Object A0C = r7.A0C();
            C31751g4 r0 = C31751g4.COROUTINE_SUSPENDED;
            if (A0C != r0) {
                A0C = C27621Wu.A00;
            }
            if (A0C == r0) {
                return A0C;
            }
        }
        return C27621Wu.A00;
    }

    public List BY9() {
        synchronized (this) {
            long j = this.A02;
            long j2 = this.A03;
            int min = (int) ((Math.min(j, j2) + ((long) this.A00)) - j2);
            if (min == 0) {
                C18460wS r0 = C18460wS.A00;
                return r0;
            }
            ArrayList arrayList = new ArrayList(min);
            Object[] objArr = this.A04;
            C18070vi.A0b(objArr);
            for (int i = 0; i < min; i++) {
                arrayList.add(objArr[(objArr.length - 1) & ((int) (this.A03 + ((long) i)))]);
            }
            return arrayList;
        }
    }

    public void CFl() {
        synchronized (this) {
            long j = this.A02;
            long min = Math.min(j, this.A03) + ((long) this.A00);
            A03(min, j, min, min + ((long) this.A01));
        }
    }

    private final long A00(AnonymousClass3JR r10) {
        long j = r10.A00;
        long min = Math.min(this.A02, this.A03);
        if (j < min + ((long) this.A00) || (this.A05 <= 0 && j <= min && this.A01 != 0)) {
            return j;
        }
        return -1;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static /* synthetic */ X.C31751g4 A01(X.C30391dr r13, X.AnonymousClass1G2 r14, X.C25701Ph r15) {
        /*
            boolean r0 = r13 instanceof X.AnonymousClass3FZ
            if (r0 == 0) goto L_0x002b
            r8 = r13
            X.3FZ r8 = (X.AnonymousClass3FZ) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r2 = r8.result
            X.1g4 r9 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 == r1) goto L_0x0042
            if (r0 == r6) goto L_0x0031
            if (r0 == r7) goto L_0x0031
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x002b:
            X.3FZ r8 = new X.3FZ
            r8.<init>(r13, r15)
            goto L_0x0012
        L_0x0031:
            java.lang.Object r5 = r8.L$3
            X.1OB r5 = (X.AnonymousClass1OB) r5
            java.lang.Object r4 = r8.L$2
            X.3JR r4 = (X.AnonymousClass3JR) r4
            java.lang.Object r14 = r8.L$1
            X.1G2 r14 = (X.AnonymousClass1G2) r14
            java.lang.Object r15 = r8.L$0
            X.1Ph r15 = (X.C25701Ph) r15
            goto L_0x007e
        L_0x0042:
            java.lang.Object r4 = r8.L$2
            X.3JR r4 = (X.AnonymousClass3JR) r4
            java.lang.Object r14 = r8.L$1
            X.1G2 r14 = (X.AnonymousClass1G2) r14
            java.lang.Object r15 = r8.L$0
            X.1Ph r15 = (X.C25701Ph) r15
            goto L_0x006e
        L_0x004f:
            X.C30691eM.A01(r2)
            X.1Ws r4 = r15.A08()
            X.3JR r4 = (X.AnonymousClass3JR) r4
            boolean r0 = r14 instanceof X.C27187DXx     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x0071
            r0 = r14
            X.DXx r0 = (X.C27187DXx) r0     // Catch:{ all -> 0x011b }
            r8.L$0 = r15     // Catch:{ all -> 0x011b }
            r8.L$1 = r14     // Catch:{ all -> 0x011b }
            r8.L$2 = r4     // Catch:{ all -> 0x011b }
            r8.label = r1     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r0.A00(r8)     // Catch:{ all -> 0x011b }
            if (r0 != r9) goto L_0x0071
            return r9
        L_0x006e:
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x011b }
        L_0x0071:
            X.0wh r1 = r8.getContext()     // Catch:{ all -> 0x011b }
            X.1OU r0 = X.AnonymousClass1OB.A00     // Catch:{ all -> 0x011b }
            X.0wi r5 = r1.get(r0)     // Catch:{ all -> 0x011b }
            X.1OB r5 = (X.AnonymousClass1OB) r5     // Catch:{ all -> 0x011b }
            goto L_0x0081
        L_0x007e:
            X.C30691eM.A01(r2)     // Catch:{ all -> 0x011b }
        L_0x0081:
            X.1dr[] r11 = X.AnonymousClass2WA.A00     // Catch:{ all -> 0x011b }
            monitor-enter(r15)     // Catch:{ all -> 0x011b }
            long r2 = r15.A00(r4)     // Catch:{ all -> 0x00fc }
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            X.1I8 r10 = X.C62922sD.A00     // Catch:{ all -> 0x00fc }
            goto L_0x00b0
        L_0x0091:
            long r0 = r4.A00     // Catch:{ all -> 0x00fc }
            java.lang.Object[] r12 = r15.A04     // Catch:{ all -> 0x00fc }
            X.C18070vi.A0b(r12)     // Catch:{ all -> 0x00fc }
            int r11 = (int) r2     // Catch:{ all -> 0x00fc }
            int r10 = r12.length     // Catch:{ all -> 0x00fc }
            int r10 = r10 + -1
            r10 = r10 & r11
            r10 = r12[r10]     // Catch:{ all -> 0x00fc }
            boolean r11 = r10 instanceof X.AnonymousClass3E4     // Catch:{ all -> 0x00fc }
            if (r11 == 0) goto L_0x00a7
            X.3E4 r10 = (X.AnonymousClass3E4) r10     // Catch:{ all -> 0x00fc }
            java.lang.Object r10 = r10.A01     // Catch:{ all -> 0x00fc }
        L_0x00a7:
            r11 = 1
            long r2 = r2 + r11
            r4.A00 = r2     // Catch:{ all -> 0x00fc }
            X.1dr[] r11 = r15.A0A(r0)     // Catch:{ all -> 0x00fc }
        L_0x00b0:
            monitor-exit(r15)     // Catch:{ all -> 0x011b }
            int r3 = r11.length     // Catch:{ all -> 0x011b }
            r2 = 0
        L_0x00b3:
            if (r2 >= r3) goto L_0x00c1
            r1 = r11[r2]     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x00be
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x011b }
            r1.resumeWith(r0)     // Catch:{ all -> 0x011b }
        L_0x00be:
            int r2 = r2 + 1
            goto L_0x00b3
        L_0x00c1:
            X.1I8 r0 = X.C62922sD.A00     // Catch:{ all -> 0x011b }
            if (r10 != r0) goto L_0x00f9
            r8.L$0 = r15     // Catch:{ all -> 0x011b }
            r8.L$1 = r14     // Catch:{ all -> 0x011b }
            r8.L$2 = r4     // Catch:{ all -> 0x011b }
            r8.L$3 = r5     // Catch:{ all -> 0x011b }
            r8.label = r6     // Catch:{ all -> 0x011b }
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C31781g7.A02     // Catch:{ all -> 0x011b }
            X.1dr r1 = X.C30581eB.A02(r8)     // Catch:{ all -> 0x011b }
            r0 = 1
            X.1g7 r3 = new X.1g7     // Catch:{ all -> 0x011b }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x011b }
            r3.A0F()     // Catch:{ all -> 0x011b }
            monitor-enter(r15)     // Catch:{ all -> 0x011b }
            long r10 = r15.A00(r4)     // Catch:{ all -> 0x00fc }
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ee
            r4.A01 = r3     // Catch:{ all -> 0x00fc }
            r4.A01 = r3     // Catch:{ all -> 0x00fc }
            goto L_0x00f3
        L_0x00ee:
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x00fc }
            r3.resumeWith(r0)     // Catch:{ all -> 0x00fc }
        L_0x00f3:
            monitor-exit(r15)     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r3.A0C()     // Catch:{ all -> 0x011b }
            goto L_0x0118
        L_0x00f9:
            if (r5 == 0) goto L_0x010a
            goto L_0x00ff
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x011b }
            goto L_0x0109
        L_0x00ff:
            boolean r0 = r5.Be2()     // Catch:{ all -> 0x011b }
            if (r0 != 0) goto L_0x010a
            java.util.concurrent.CancellationException r0 = r5.BOI()     // Catch:{ all -> 0x011b }
        L_0x0109:
            throw r0     // Catch:{ all -> 0x011b }
        L_0x010a:
            r8.L$0 = r15     // Catch:{ all -> 0x011b }
            r8.L$1 = r14     // Catch:{ all -> 0x011b }
            r8.L$2 = r4     // Catch:{ all -> 0x011b }
            r8.L$3 = r5     // Catch:{ all -> 0x011b }
            r8.label = r7     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r14.BJt(r10, r8)     // Catch:{ all -> 0x011b }
        L_0x0118:
            if (r0 != r9) goto L_0x0081
            return r9
        L_0x011b:
            r0 = move-exception
            r15.A09(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25701Ph.A01(X.1dr, X.1G2, X.1Ph):X.1g4");
    }

    private final void A02() {
        C27601Ws[] r10;
        Object[] objArr = this.A04;
        C18070vi.A0b(objArr);
        long j = this.A02;
        long j2 = this.A03;
        long min = Math.min(j, j2);
        objArr[(objArr.length - 1) & ((int) min)] = null;
        this.A00--;
        long j3 = min + 1;
        if (j2 < j3) {
            this.A03 = j3;
        }
        if (j < j3) {
            if (!(this.A00 == 0 || (r10 = this.A01) == null)) {
                for (C27601Ws r7 : r10) {
                    if (r7 != null) {
                        AnonymousClass3JR r72 = (AnonymousClass3JR) r7;
                        if (r72.A00 >= 0 && r72.A00 < j3) {
                            r72.A00 = j3;
                        }
                    }
                }
            }
            this.A02 = j3;
        }
    }

    private final void A04(Object obj) {
        int i = this.A00 + this.A01;
        Object[] objArr = this.A04;
        if (objArr == null) {
            objArr = new Object[2];
            this.A04 = objArr;
        } else {
            int length = objArr.length;
            if (i >= length) {
                int i2 = length * 2;
                if (i2 > 0) {
                    Object[] objArr2 = new Object[i2];
                    this.A04 = objArr2;
                    long min = Math.min(this.A02, this.A03);
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = (int) (((long) i3) + min);
                        objArr2[(i2 - 1) & i4] = objArr[(objArr.length - 1) & i4];
                    }
                    objArr = objArr2;
                } else {
                    throw new IllegalStateException("Buffer size overflow");
                }
            }
        }
        objArr[(objArr.length - 1) & ((int) (Math.min(this.A02, this.A03) + ((long) i)))] = obj;
    }

    public static final void A05(C25701Ph r10) {
        if (r10.A05 != 0 || r10.A01 > 1) {
            Object[] objArr = r10.A04;
            C18070vi.A0b(objArr);
            while (true) {
                int i = r10.A01;
                if (i > 0) {
                    long min = Math.min(r10.A02, r10.A03);
                    int i2 = r10.A00;
                    int length = objArr.length - 1;
                    if (objArr[length & ((int) ((min + ((long) (i2 + i))) - 1))] == C62922sD.A00) {
                        int i3 = i - 1;
                        r10.A01 = i3;
                        objArr[length & ((int) (min + ((long) (i2 + i3))))] = null;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1 != 2) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A06(java.lang.Object r20) {
        /*
            r19 = this;
            r10 = r19
            int r0 = r10.A00
            r9 = r20
            if (r0 != 0) goto L_0x002a
            int r1 = r10.A06
            if (r1 == 0) goto L_0x0028
            r10.A04(r9)
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            if (r0 <= r1) goto L_0x001a
            r10.A02()
        L_0x001a:
            long r2 = r10.A02
            long r0 = r10.A03
            long r2 = java.lang.Math.min(r2, r0)
            int r0 = r10.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            r10.A02 = r2
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        L_0x002a:
            int r8 = r10.A00
            int r7 = r10.A05
            r6 = 1
            r5 = 0
            if (r8 < r7) goto L_0x0046
            long r3 = r10.A02
            long r1 = r10.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            X.1Pg r0 = r10.A07
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r5) goto L_0x0029
            r0 = 2
            if (r1 == r0) goto L_0x0070
        L_0x0046:
            r10.A04(r9)
            int r0 = r8 + 1
            r10.A00 = r0
            if (r0 <= r7) goto L_0x0052
            r10.A02()
        L_0x0052:
            long r13 = r10.A02
            long r11 = r10.A03
            long r15 = java.lang.Math.min(r13, r11)
            int r0 = r10.A00
            long r0 = (long) r0
            long r15 = r15 + r0
            long r2 = r15 - r11
            int r1 = (int) r2
            int r0 = r10.A06
            if (r1 <= r0) goto L_0x0070
            r0 = 1
            long r11 = r11 + r0
            int r0 = r10.A01
            long r0 = (long) r0
            long r17 = r15 + r0
            r10.A03(r11, r13, r15, r17)
        L_0x0070:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25701Ph.A06(java.lang.Object):boolean");
    }

    public final C30391dr[] A0A(long j) {
        int i;
        int i2;
        long j2;
        C27601Ws[] r13;
        long j3 = this.A02;
        if (j <= j3) {
            long min = Math.min(j3, this.A03);
            long j4 = ((long) this.A00) + min;
            long j5 = j4;
            int i3 = this.A05;
            int i4 = i3;
            if (i3 == 0 && this.A01 > 0) {
                j4++;
            }
            int i5 = this.A00;
            if (!(i5 == 0 || (r13 = this.A01) == null)) {
                for (C27601Ws r4 : r13) {
                    if (r4 != null) {
                        AnonymousClass3JR r42 = (AnonymousClass3JR) r4;
                        if (r42.A00 >= 0 && r42.A00 < j4) {
                            j4 = r42.A00;
                        }
                    }
                }
            }
            if (j4 > j3) {
                if (i5 > 0) {
                    i2 = this.A01;
                    i = Math.min(i2, i4 - ((int) (j5 - j4)));
                } else {
                    i = this.A01;
                    i2 = i;
                }
                C30391dr[] r132 = AnonymousClass2WA.A00;
                long j6 = ((long) i2) + j5;
                if (i > 0) {
                    r132 = new C30391dr[i];
                    Object[] objArr = this.A04;
                    C18070vi.A0b(objArr);
                    long j7 = j5;
                    int i6 = 0;
                    while (j5 < j6) {
                        int length = objArr.length - 1;
                        Object obj = objArr[length & ((int) j5)];
                        AnonymousClass1I8 r3 = C62922sD.A00;
                        if (obj != r3) {
                            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            AnonymousClass3E4 r15 = (AnonymousClass3E4) obj;
                            int i7 = i6 + 1;
                            r132[i6] = r15.A02;
                            objArr[length & ((int) j5)] = r3;
                            objArr[length & ((int) j7)] = r15.A01;
                            j2 = 1;
                            j7++;
                            if (i7 >= i) {
                                break;
                            }
                            i6 = i7;
                        } else {
                            j2 = 1;
                        }
                        j5 += j2;
                    }
                    j5 = j7;
                }
                int i8 = (int) (j5 - min);
                if (this.A00 == 0) {
                    j4 = j5;
                }
                long max = Math.max(this.A03, j5 - ((long) Math.min(this.A06, i8)));
                if (i4 == 0 && max < j6) {
                    Object[] objArr2 = this.A04;
                    C18070vi.A0b(objArr2);
                    if (C18070vi.A18(objArr2[(objArr2.length - 1) & ((int) max)], C62922sD.A00)) {
                        j5++;
                        max++;
                    }
                }
                A03(max, j4, j5, j6);
                A05(this);
                if (r132.length != 0) {
                    return A07(r132);
                }
                return r132;
            }
        }
        return AnonymousClass2WA.A00;
    }

    public C23421Fz BLm(C18560wh r2, C25691Pg r3, int i) {
        if ((i == 0 || i == -3) && r3 == C25691Pg.SUSPEND) {
            return this;
        }
        return new AnonymousClass5WR(r2, r3, this, i);
    }

    public boolean CPw(Object obj) {
        int i;
        boolean z;
        C30391dr[] r5 = AnonymousClass2WA.A00;
        synchronized (this) {
            if (A06(obj)) {
                r5 = A07(r5);
                z = true;
            } else {
                z = false;
            }
        }
        for (C30391dr r1 : r5) {
            if (r1 != null) {
                r1.resumeWith(C27621Wu.A00);
            }
        }
        return z;
    }

    public C25701Ph(C25691Pg r1, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        this.A07 = r1;
    }

    private final void A03(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long min2 = Math.min(this.A02, this.A03); min2 < min; min2++) {
            Object[] objArr = this.A04;
            C18070vi.A0b(objArr);
            objArr[(objArr.length - 1) & ((int) min2)] = null;
        }
        this.A03 = j;
        this.A02 = j2;
        this.A00 = (int) (j3 - min);
        this.A01 = (int) (j4 - j3);
    }
}
