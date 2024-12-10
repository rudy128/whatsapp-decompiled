package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DNk  reason: case insensitive filesystem */
public class C26962DNk implements E6H {
    public static final Handler A0O = C17890vO.A0D();
    public int A00;
    public C25957CpP A01;
    public CZ6 A02;
    public E6B A03;
    public C26050CrK A04 = new C26050CrK();
    public C25011CTl A05;
    public DFL A06;
    public WeakReference A07 = BE8.A0m();
    public Map A08 = Collections.emptyMap();
    public C26235CvV A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public final CBw A0C = new Object();
    public final CFu A0D;
    public final C25416CfO A0E;
    public final List A0F = AnonymousClass000.A13();
    public final List A0G = AnonymousClass000.A13();
    public final List A0H = AnonymousClass000.A13();
    public final List A0I = AnonymousClass000.A13();
    public final Map A0J = C17880vN.A11();
    public final Map A0K = C17880vN.A11();
    public final Object A0L = C17880vN.A0p();
    public final Runnable A0M = new C27080DTf((Object) this, 35);
    public volatile boolean A0N;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.CFu, java.lang.Object] */
    public static C23736Boh A01(DOZ doz, C26050CrK crK, List list) {
        C22415B6x A032 = C26272CwJ.A03(doz);
        Integer num = AnonymousClass00R.A0C;
        return new C23736Boh((E9O) null, doz, (DOZ) null, crK, (C24807CLa) null, new Object(), C199029zJ.A01, (E8A) null, A032, num, (String) DOZ.A00(doz, 2131428171), (String) null, list, (Map) null, (Map) null);
    }

    public void BKK(Object obj, Object obj2, String str, String str2) {
        A04(new C21438Ak5(this, obj, obj2, str, str2, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x026d, code lost:
        r0 = X.AnonymousClass000.A13();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0271, code lost:
        r5 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0279, code lost:
        if (r5.hasNext() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027b, code lost:
        r0 = (X.C25164CaF) r5.next();
        r3 = r0.A01;
        r4 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0285, code lost:
        if (r3 == null) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0287, code lost:
        r1.add(r3.A00);
        r11.add(X.C108945cZ.A0N(r3.A01, r3.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0297, code lost:
        r10.A04 = r10.A04.A07(X.C108975cc.A0h(r4.A01, r4.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r0 = X.AnonymousClass000.A0n("Manifest entry is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r0 = X.AnonymousClass8BR.A0w("Attempting to process async components but missing component query store");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        X.AnonymousClass0O7.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018f, code lost:
        if (r12 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0191, code lost:
        r7 = r12.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0193, code lost:
        r5 = A01(r9, r10.A04, r7);
        r4 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019b, code lost:
        if (r4 == null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a1, code lost:
        if (r4.isEmpty() != false) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a3, code lost:
        X.AnonymousClass0O7.A01("Initialize BloksComponentQueryManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01aa, code lost:
        if (r10.A01 != null) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ac, code lost:
        r3 = (X.C26012CqT) r9.A01(2131428152);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b5, code lost:
        if (r3 == null) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b7, code lost:
        r10.A01 = new X.C25957CpP(r10.A02, r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.AnonymousClass0O7.A00();
        X.AnonymousClass0O7.A01("Bloks Setup AsyncComponentQueries");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r6 = r10.A01;
        r2 = X.AnonymousClass000.A13();
        r13 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d6, code lost:
        if (r13.hasNext() == false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d8, code lost:
        r3 = (X.C25233CbU) r13.next();
        r12 = (java.lang.String) X.CBt.A00(r5, r3.A00, "appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e8, code lost:
        if (r12 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ea, code lost:
        r7 = (java.util.Map) X.CBt.A00(r5, r3.A03, "params");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f4, code lost:
        if (r7 != null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f6, code lost:
        r7 = X.AnonymousClass1D7.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fa, code lost:
        r0 = (java.lang.Long) X.CBt.A00(r5, r3.A01, "cacheTtlSeconds");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0204, code lost:
        if (r0 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0206, code lost:
        r4 = r6.A02.A01(r12, r7, new X.C28079Dqt(r6, r5, r3), r0.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021f, code lost:
        if ((r4 instanceof X.C23722BoT) == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0221, code lost:
        r6.A00.A01(((X.C23722BoT) r4).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x022d, code lost:
        if ((r4 instanceof X.C23721BoS) == false) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x022f, code lost:
        r2.add(X.AnonymousClass1D6.A01(r3, ((X.C23721BoS) r4).A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x023b, code lost:
        r7 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x023d, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r12 = X.C29351c6.A0D(r2);
        r4 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024a, code lost:
        if (r4.hasNext() == false) goto L_0x0264;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024c, code lost:
        r0 = (X.AnonymousClass1D6) r4.next();
        r12.add(X.C25957CpP.A00(r6, r5, (X.CO8) r0.second, (X.C25233CbU) r0.first, X.AnonymousClass00R.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0264, code lost:
        r0 = X.C29351c6.A0F(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        X.AnonymousClass0O7.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair A00(java.util.List r29) {
        /*
            r28 = this;
            java.lang.String r0 = "Bloks ProcessResources"
            X.AnonymousClass0O7.A01(r0)
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ all -> 0x02e1 }
            r0 = r29
            r1.<init>(r0)     // Catch:{ all -> 0x02e1 }
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02e1 }
            r10 = r28
            java.lang.ref.WeakReference r0 = r10.A07     // Catch:{ all -> 0x02e1 }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x02e1 }
            X.DOZ r9 = (X.DOZ) r9     // Catch:{ all -> 0x02e1 }
            r17 = 0
            if (r9 != 0) goto L_0x002c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)     // Catch:{ all -> 0x02e1 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02e1 }
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)     // Catch:{ all -> 0x02e1 }
            goto L_0x02dd
        L_0x002c:
            X.CrK r8 = r10.A04     // Catch:{ all -> 0x02e1 }
        L_0x002e:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x02e1 }
            if (r0 != 0) goto L_0x02cf
            java.lang.Object r0 = r1.poll()     // Catch:{ all -> 0x02e1 }
            X.CvV r0 = (X.C26235CvV) r0     // Catch:{ all -> 0x02e1 }
            if (r0 == 0) goto L_0x002e
            X.Cip r13 = r0.A00     // Catch:{ all -> 0x02e1 }
            if (r13 == 0) goto L_0x002e
            X.DFL r12 = r0.A01     // Catch:{ all -> 0x02e1 }
            X.CrK r2 = r10.A04     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = r13.A06     // Catch:{ all -> 0x02e1 }
            X.CrK r2 = r2.A05(r0)     // Catch:{ all -> 0x02e1 }
            r10.A04 = r2     // Catch:{ all -> 0x02e1 }
            X.CZq r0 = r13.A00     // Catch:{ all -> 0x02e1 }
            X.CrK r2 = r2.A01(r0)     // Catch:{ all -> 0x02e1 }
            r10.A04 = r2     // Catch:{ all -> 0x02e1 }
            java.util.List r0 = r13.A03     // Catch:{ all -> 0x02e1 }
            X.CrK r2 = r2.A02(r0)     // Catch:{ all -> 0x02e1 }
            r10.A04 = r2     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = r13.A07     // Catch:{ all -> 0x02e1 }
            X.CrK r2 = r2.A06(r0)     // Catch:{ all -> 0x02e1 }
            r10.A04 = r2     // Catch:{ all -> 0x02e1 }
            java.util.List r0 = r13.A04     // Catch:{ all -> 0x02e1 }
            X.CrK r0 = r2.A03(r0)     // Catch:{ all -> 0x02e1 }
            r10.A04 = r0     // Catch:{ all -> 0x02e1 }
            java.util.List r0 = r13.A05     // Catch:{ all -> 0x02e1 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x02e1 }
        L_0x0072:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x02e1 }
            r7 = 0
            if (r0 == 0) goto L_0x018f
            java.lang.Object r6 = r16.next()     // Catch:{ all -> 0x02e1 }
            X.E2f r6 = (X.C28464E2f) r6     // Catch:{ all -> 0x02e1 }
            r5 = r6
            X.DNb r5 = (X.C26953DNb) r5     // Catch:{ all -> 0x02e1 }
            java.lang.String r4 = r5.A00     // Catch:{ all -> 0x02e1 }
            X.CrK r0 = r10.A04     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = r0.A07     // Catch:{ all -> 0x02e1 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x02e1 }
            if (r0 != 0) goto L_0x00ce
            X.CrK r3 = r10.A04     // Catch:{ all -> 0x02e1 }
            java.util.Map r14 = java.util.Collections.singletonMap(r4, r6)     // Catch:{ all -> 0x02e1 }
            boolean r0 = r14.isEmpty()     // Catch:{ all -> 0x02e1 }
            if (r0 != 0) goto L_0x00cc
            java.util.Map r0 = r3.A07     // Catch:{ all -> 0x02e1 }
            java.util.HashMap r2 = X.BE6.A10(r0)     // Catch:{ all -> 0x02e1 }
            r2.putAll(r14)     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = r3.A04     // Catch:{ all -> 0x02e1 }
            r21 = r0
            java.util.Map r0 = r3.A08     // Catch:{ all -> 0x02e1 }
            r22 = r0
            java.util.Map r0 = r3.A03     // Catch:{ all -> 0x02e1 }
            r23 = r0
            java.util.Map r0 = r3.A02     // Catch:{ all -> 0x02e1 }
            r24 = r0
            X.CZq r0 = r3.A00     // Catch:{ all -> 0x02e1 }
            r19 = r0
            java.util.Map r15 = r3.A05     // Catch:{ all -> 0x02e1 }
            java.util.Map r14 = r3.A06     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = r3.A01     // Catch:{ all -> 0x02e1 }
            X.CrK r3 = new X.CrK     // Catch:{ all -> 0x02e1 }
            r18 = r3
            r20 = r2
            r25 = r15
            r26 = r14
            r27 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02e1 }
        L_0x00cc:
            r10.A04 = r3     // Catch:{ all -> 0x02e1 }
        L_0x00ce:
            X.CrK r0 = r10.A04     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = r0.A08     // Catch:{ all -> 0x02e1 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x02e1 }
            if (r0 != 0) goto L_0x0072
            if (r12 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r2 = r7
            goto L_0x00df
        L_0x00dd:
            java.util.List r2 = r12.A0A     // Catch:{ all -> 0x02e1 }
        L_0x00df:
            X.CrK r0 = r10.A04     // Catch:{ all -> 0x02e1 }
            X.Boh r15 = A01(r9, r0, r2)     // Catch:{ all -> 0x02e1 }
            java.lang.String r2 = r5.A01     // Catch:{ all -> 0x02e1 }
            X.E89 r3 = X.C26272CwJ.A02(r9, r2)     // Catch:{ all -> 0x02e1 }
            r0 = 2131428169(0x7f0b0349, float:1.8477975E38)
            java.lang.Object r0 = r9.A01(r0)     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x02e1 }
            if (r0 != 0) goto L_0x00f7
            goto L_0x00fe
        L_0x00f7:
            java.lang.Object r14 = r0.get(r2)     // Catch:{ all -> 0x02e1 }
            X.CVW r14 = (X.CVW) r14     // Catch:{ all -> 0x02e1 }
            goto L_0x00ff
        L_0x00fe:
            r14 = 0
        L_0x00ff:
            if (r3 == 0) goto L_0x0110
            X.E88 r2 = r3.BSv(r6, r15, r7)     // Catch:{ all -> 0x02e1 }
            java.lang.Object r3 = r2.BSx()     // Catch:{ all -> 0x02e1 }
            X.CFu r0 = r10.A0D     // Catch:{ all -> 0x02e1 }
            java.lang.Runnable r2 = r2.BFH(r0, r10)     // Catch:{ all -> 0x02e1 }
            goto L_0x017c
        L_0x0110:
            if (r14 == 0) goto L_0x02b2
            java.util.Map r6 = r5.A02     // Catch:{ all -> 0x02e1 }
            if (r6 == 0) goto L_0x02ab
            X.CXY r0 = r9.A02     // Catch:{ all -> 0x02e1 }
            android.util.SparseArray r2 = r0.A00()     // Catch:{ all -> 0x02e1 }
            r0 = 2131428241(0x7f0b0391, float:1.847812E38)
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x02e1 }
            X.9cE r3 = (X.C185219cE) r3     // Catch:{ all -> 0x02e1 }
            X.C28111Yx.A02(r3)     // Catch:{ all -> 0x02e1 }
            java.lang.String r0 = "mode"
            java.lang.Object r2 = r6.get(r0)     // Catch:{ all -> 0x02e1 }
            java.lang.String r0 = "fetch"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x02e1 }
            if (r0 == 0) goto L_0x0171
            X.COh r6 = r14.A00     // Catch:{ all -> 0x02e1 }
            java.lang.String r7 = r3.A00     // Catch:{ all -> 0x02e1 }
            java.lang.String r3 = r3.A01     // Catch:{ all -> 0x02e1 }
            java.lang.String r14 = r5.A00     // Catch:{ all -> 0x02e1 }
            monitor-enter(r6)     // Catch:{ all -> 0x02e1 }
            java.util.Map r2 = r6.A00     // Catch:{ all -> 0x02cc }
            java.lang.Object r5 = r2.get(r7)     // Catch:{ all -> 0x02cc }
            X.Ci1 r5 = (X.C25563Ci1) r5     // Catch:{ all -> 0x02cc }
            if (r5 != 0) goto L_0x0154
            X.0vp r0 = r6.A01     // Catch:{ all -> 0x02cc }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x02cc }
            X.Ci1 r5 = (X.C25563Ci1) r5     // Catch:{ all -> 0x02cc }
            r2.put(r7, r5)     // Catch:{ all -> 0x02cc }
        L_0x0154:
            monitor-enter(r5)     // Catch:{ all -> 0x02cc }
            X.COi r7 = new X.COi     // Catch:{ all -> 0x02a8 }
            r7.<init>(r10)     // Catch:{ all -> 0x02a8 }
            java.util.Map r2 = r5.A02     // Catch:{ all -> 0x02a8 }
            X.0yx r0 = new X.0yx     // Catch:{ all -> 0x02a8 }
            r0.<init>(r14, r7)     // Catch:{ all -> 0x02a8 }
            r2.put(r3, r0)     // Catch:{ all -> 0x02a8 }
            java.util.HashMap r3 = X.C25563Ci1.A00(r5, r3)     // Catch:{ all -> 0x02a8 }
            X.DSb r2 = r7.A00     // Catch:{ all -> 0x02a8 }
            X.COC r0 = new X.COC     // Catch:{ all -> 0x02a8 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x02a8 }
            monitor-exit(r5)     // Catch:{ all -> 0x02cc }
            goto L_0x0177
        L_0x0171:
            X.COC r0 = new X.COC     // Catch:{ all -> 0x02e1 }
            r0.<init>(r7, r7)     // Catch:{ all -> 0x02e1 }
            goto L_0x0178
        L_0x0177:
            monitor-exit(r6)     // Catch:{ all -> 0x02e1 }
        L_0x0178:
            java.lang.Object r3 = r0.A00     // Catch:{ all -> 0x02e1 }
            java.lang.Runnable r2 = r0.A01     // Catch:{ all -> 0x02e1 }
        L_0x017c:
            X.CZ6 r0 = r10.A02     // Catch:{ all -> 0x02e1 }
            r0.A01(r2)     // Catch:{ all -> 0x02e1 }
            X.CrK r2 = r10.A04     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = java.util.Collections.singletonMap(r4, r3)     // Catch:{ all -> 0x02e1 }
            X.CrK r0 = r2.A07(r0)     // Catch:{ all -> 0x02e1 }
            r10.A04 = r0     // Catch:{ all -> 0x02e1 }
            goto L_0x0072
        L_0x018f:
            if (r12 == 0) goto L_0x0193
            java.util.List r7 = r12.A0A     // Catch:{ all -> 0x02e1 }
        L_0x0193:
            X.CrK r0 = r10.A04     // Catch:{ all -> 0x02e1 }
            X.Boh r5 = A01(r9, r0, r7)     // Catch:{ all -> 0x02e1 }
            java.util.List r4 = r13.A01     // Catch:{ all -> 0x02e1 }
            if (r4 == 0) goto L_0x026d
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x02e1 }
            if (r0 != 0) goto L_0x026d
            java.lang.String r0 = "Initialize BloksComponentQueryManager"
            X.AnonymousClass0O7.A01(r0)     // Catch:{ all -> 0x02e1 }
            X.CpP r0 = r10.A01     // Catch:{ all -> 0x02c7 }
            if (r0 != 0) goto L_0x01c0
            r0 = 2131428152(0x7f0b0338, float:1.847794E38)
            java.lang.Object r3 = r9.A01(r0)     // Catch:{ all -> 0x02c7 }
            X.CqT r3 = (X.C26012CqT) r3     // Catch:{ all -> 0x02c7 }
            if (r3 == 0) goto L_0x02bd
            X.CZ6 r2 = r10.A02     // Catch:{ all -> 0x02c7 }
            X.CpP r0 = new X.CpP     // Catch:{ all -> 0x02c7 }
            r0.<init>(r2, r10, r3)     // Catch:{ all -> 0x02c7 }
            r10.A01 = r0     // Catch:{ all -> 0x02c7 }
        L_0x01c0:
            X.AnonymousClass0O7.A00()     // Catch:{ all -> 0x02e1 }
            java.lang.String r0 = "Bloks Setup AsyncComponentQueries"
            X.AnonymousClass0O7.A01(r0)     // Catch:{ all -> 0x02e1 }
            X.CpP r6 = r10.A01     // Catch:{ all -> 0x02c7 }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02c7 }
            java.util.Iterator r13 = r4.iterator()     // Catch:{ all -> 0x02c7 }
        L_0x01d2:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x023b
            java.lang.Object r3 = r13.next()     // Catch:{ all -> 0x02c7 }
            X.CbU r3 = (X.C25233CbU) r3     // Catch:{ all -> 0x02c7 }
            java.lang.String r4 = "appId"
            X.E8A r0 = r3.A00     // Catch:{ all -> 0x02c7 }
            java.lang.Object r12 = X.CBt.A00(r5, r0, r4)     // Catch:{ all -> 0x02c7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x02c7 }
            if (r12 == 0) goto L_0x01d2
            java.lang.String r4 = "params"
            X.E8A r0 = r3.A03     // Catch:{ all -> 0x02c7 }
            java.lang.Object r7 = X.CBt.A00(r5, r0, r4)     // Catch:{ all -> 0x02c7 }
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x02c7 }
            if (r7 != 0) goto L_0x01fa
            X.1CQ r7 = X.AnonymousClass1D7.A0I()     // Catch:{ all -> 0x02c7 }
        L_0x01fa:
            java.lang.String r4 = "cacheTtlSeconds"
            X.E8A r0 = r3.A01     // Catch:{ all -> 0x02c7 }
            java.lang.Object r0 = X.CBt.A00(r5, r0, r4)     // Catch:{ all -> 0x02c7 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x01d2
            long r22 = r0.longValue()     // Catch:{ all -> 0x02c7 }
            X.CqT r4 = r6.A02     // Catch:{ all -> 0x02c7 }
            X.Dqt r0 = new X.Dqt     // Catch:{ all -> 0x02c7 }
            r0.<init>(r6, r5, r3)     // Catch:{ all -> 0x02c7 }
            r18 = r4
            r19 = r12
            r20 = r7
            r21 = r0
            X.C4E r4 = r18.A01(r19, r20, r21, r22)     // Catch:{ all -> 0x02c7 }
            boolean r0 = r4 instanceof X.C23722BoT     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x022b
            X.CZ6 r3 = r6.A00     // Catch:{ all -> 0x02c7 }
            X.BoT r4 = (X.C23722BoT) r4     // Catch:{ all -> 0x02c7 }
            java.lang.Runnable r0 = r4.A00     // Catch:{ all -> 0x02c7 }
            r3.A01(r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x01d2
        L_0x022b:
            boolean r0 = r4 instanceof X.C23721BoS     // Catch:{ all -> 0x02c7 }
            if (r0 == 0) goto L_0x01d2
            X.BoS r4 = (X.C23721BoS) r4     // Catch:{ all -> 0x02c7 }
            X.CO8 r0 = r4.A00     // Catch:{ all -> 0x02c7 }
            X.1D6 r0 = X.AnonymousClass1D6.A01(r3, r0)     // Catch:{ all -> 0x02c7 }
            r2.add(r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x01d2
        L_0x023b:
            java.lang.Object r7 = r6.A03     // Catch:{ all -> 0x02c7 }
            monitor-enter(r7)     // Catch:{ all -> 0x02c7 }
            java.util.ArrayList r12 = X.C29351c6.A0D(r2)     // Catch:{ all -> 0x02c4 }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x02c4 }
        L_0x0246:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x02c4 }
            if (r0 == 0) goto L_0x0264
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x02c4 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x02c4 }
            java.lang.Object r3 = r0.first     // Catch:{ all -> 0x02c4 }
            X.CbU r3 = (X.C25233CbU) r3     // Catch:{ all -> 0x02c4 }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x02c4 }
            X.CO8 r2 = (X.CO8) r2     // Catch:{ all -> 0x02c4 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x02c4 }
            java.util.List r0 = X.C25957CpP.A00(r6, r5, r2, r3, r0)     // Catch:{ all -> 0x02c4 }
            r12.add(r0)     // Catch:{ all -> 0x02c4 }
            goto L_0x0246
        L_0x0264:
            java.util.ArrayList r0 = X.C29351c6.A0F(r12)     // Catch:{ all -> 0x02c4 }
            monitor-exit(r7)     // Catch:{ all -> 0x02c7 }
            X.AnonymousClass0O7.A00()     // Catch:{ all -> 0x02e1 }
            goto L_0x0271
        L_0x026d:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02e1 }
        L_0x0271:
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x02e1 }
        L_0x0275:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02e1 }
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x02e1 }
            X.CaF r0 = (X.C25164CaF) r0     // Catch:{ all -> 0x02e1 }
            X.Cae r3 = r0.A01     // Catch:{ all -> 0x02e1 }
            X.Bno r4 = r0.A00     // Catch:{ all -> 0x02e1 }
            if (r3 == 0) goto L_0x0297
            X.CvV r0 = r3.A00     // Catch:{ all -> 0x02e1 }
            r1.add(r0)     // Catch:{ all -> 0x02e1 }
            X.E6I r2 = r3.A01     // Catch:{ all -> 0x02e1 }
            X.C5s r0 = r3.A02     // Catch:{ all -> 0x02e1 }
            android.util.Pair r0 = X.C108945cZ.A0N(r2, r0)     // Catch:{ all -> 0x02e1 }
            r11.add(r0)     // Catch:{ all -> 0x02e1 }
        L_0x0297:
            X.CrK r3 = r10.A04     // Catch:{ all -> 0x02e1 }
            java.lang.String r2 = r4.A01     // Catch:{ all -> 0x02e1 }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x02e1 }
            java.util.Map r0 = X.C108975cc.A0h(r2, r0)     // Catch:{ all -> 0x02e1 }
            X.CrK r0 = r3.A07(r0)     // Catch:{ all -> 0x02e1 }
            r10.A04 = r0     // Catch:{ all -> 0x02e1 }
            goto L_0x0275
        L_0x02a8:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02cc }
            throw r0     // Catch:{ all -> 0x02cc }
        L_0x02ab:
            java.lang.String r0 = "Manifest entry is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x02e1 }
            goto L_0x02ce
        L_0x02b2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02e1 }
            java.lang.String r0 = "Missing variable module with type: "
            java.lang.RuntimeException r0 = X.BEA.A0g(r0, r2, r1)     // Catch:{ all -> 0x02e1 }
            goto L_0x02ce
        L_0x02bd:
            java.lang.String r0 = "Attempting to process async components but missing component query store"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x02c7 }
            goto L_0x02c6
        L_0x02c4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x02c7 }
        L_0x02c6:
            throw r0     // Catch:{ all -> 0x02c7 }
        L_0x02c7:
            r0 = move-exception
            X.AnonymousClass0O7.A00()     // Catch:{ all -> 0x02e1 }
            goto L_0x02ce
        L_0x02cc:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02e1 }
        L_0x02ce:
            throw r0     // Catch:{ all -> 0x02e1 }
        L_0x02cf:
            X.CrK r0 = r10.A04     // Catch:{ all -> 0x02e1 }
            if (r0 == r8) goto L_0x02d5
            r17 = 1
        L_0x02d5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)     // Catch:{ all -> 0x02e1 }
            android.util.Pair r0 = X.C108945cZ.A0N(r0, r11)     // Catch:{ all -> 0x02e1 }
        L_0x02dd:
            X.AnonymousClass0O7.A00()
            return r0
        L_0x02e1:
            r0 = move-exception
            X.AnonymousClass0O7.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26962DNk.A00(java.util.List):android.util.Pair");
    }

    public static DFL A02(C26962DNk dNk, List list) {
        AnonymousClass0O7.A01("Bloks SnapshotComponent");
        DFL dfl = dNk.A06;
        try {
            if (!list.isEmpty()) {
                dfl = CC3.A00((E9O) null, new C23713BoK(list), dfl);
            }
            return dfl;
        } finally {
            AnonymousClass0O7.A00();
        }
    }

    public static void A03(C26962DNk dNk) {
        synchronized (dNk.A0L) {
            if (!dNk.A0B) {
                dNk.A0A = true;
                return;
            }
            Handler handler = A0O;
            Runnable runnable = dNk.A0M;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public CYO A05(DOZ doz, E6B e6b, Map map) {
        C26050CrK crK = this.A04;
        if (!map.isEmpty() || !crK.A03.isEmpty()) {
            crK = C26050CrK.A00(crK, crK.A07, crK.A04, crK.A08, map);
        }
        this.A04 = crK;
        this.A02 = new CZ6(doz.A00);
        Map map2 = (Map) DOZ.A00(doz, 2131428161);
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(map2.size());
        Iterator A15 = AnonymousClass000.A15(map2);
        while (true) {
            Object obj = null;
            if (!A15.hasNext()) {
                break;
            }
            Map.Entry A16 = AnonymousClass000.A16(A15);
            COB BZR = ((E89) A16.getValue()).BZR(this);
            Object key = A16.getKey();
            if (BZR != null) {
                obj = BZR.A00;
            }
            hashMap.put(key, obj);
            if (BZR != null) {
                this.A02.A01(BZR.A01);
            }
        }
        this.A04 = this.A04.A04(hashMap);
        this.A07 = AnonymousClass3MW.A0z(doz);
        this.A03 = e6b;
        Pair A002 = A00(Collections.singletonList(this.A09));
        this.A09 = null;
        if (!((List) A002.second).isEmpty()) {
            this.A06 = A02(this, (List) A002.second);
        }
        synchronized (this.A0L) {
            this.A0B = true;
            if (this.A0A) {
                A03(this);
            }
        }
        return new CYO(this.A04, this.A06);
    }

    public C26050CrK A06() {
        C26176Ctu.A02("Tree resources can only be read from the UI Thread");
        C26050CrK crK = this.A04;
        Map map = this.A08;
        if (map != null) {
            return C26050CrK.A00(crK, crK.A07, crK.A04, map, crK.A03);
        }
        return crK;
    }

    public void A07() {
        boolean z;
        if (!this.A0N) {
            C26176Ctu.A02("Tree operations are only supported from the UI Thread");
            Map map = this.A0K;
            boolean z2 = true;
            if (!map.isEmpty()) {
                this.A04 = this.A04.A07(map);
                map.clear();
                z = true;
            } else {
                z = false;
            }
            Map map2 = this.A0J;
            if (!map2.isEmpty()) {
                this.A04 = this.A04.A04(map2);
            }
            List list = this.A0I;
            if (!list.isEmpty()) {
                ArrayList A10 = C17880vN.A10(list);
                list.clear();
                Pair A002 = A00(A10);
                z |= AnonymousClass000.A1Y(A002.first);
                this.A0H.addAll((Collection) A002.second);
            }
            AnonymousClass0O7.A01("Bloks ModelMutation");
            List list2 = this.A0H;
            DFL A022 = A02(this, list2);
            if (this.A06 == A022) {
                z2 = false;
            }
            boolean z3 = z | z2;
            this.A06 = A022;
            list2.clear();
            AnonymousClass0O7.A00();
            E6B e6b = this.A03;
            if (e6b != null && z3) {
                e6b.Bz6(new CYO(this.A04, this.A06));
            }
        }
    }

    public void A08(C26235CvV cvV, Map map) {
        C26176Ctu.A02("Tree operations are only supported from the UI Thread");
        this.A0H.addAll((Collection) A00(Collections.singletonList(cvV)).second);
        HashMap A11 = C17880vN.A11();
        A11.putAll(this.A04.A08);
        if (map != null) {
            A11.putAll(map);
        }
        if (!A11.isEmpty()) {
            this.A04 = this.A04.A07(A11);
            HashMap A10 = BE6.A10(this.A08);
            A10.putAll(A11);
            this.A08 = A10;
        }
    }

    public void A09(C4D c4d) {
        C23680Bnn bnn;
        C23681Bno bno;
        if (!this.A0N) {
            C26176Ctu.A02("Tree operations are only supported from the UI Thread");
            if (c4d instanceof C23681Bno) {
                bno = (C23681Bno) c4d;
                if (bno == null) {
                    return;
                }
            } else {
                boolean z = c4d instanceof C23680Bnn;
                if (z) {
                    bnn = (C23680Bnn) c4d;
                    if (bnn == null) {
                        return;
                    }
                } else if (c4d instanceof C23682Bnp) {
                    C23682Bnp bnp = (C23682Bnp) c4d;
                    bnn = new C23680Bnn(bnp.A02, bnp.A00);
                } else {
                    throw AnonymousClass3MW.A14();
                }
                CIG.A02.incrementAndGet();
                this.A0J.put(bnn.A01, bnn.A00);
                if (z) {
                    return;
                }
                if (c4d instanceof C23682Bnp) {
                    C23682Bnp bnp2 = (C23682Bnp) c4d;
                    bno = new C23681Bno(bnp2.A03, bnp2.A01);
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
            CIG.A06.incrementAndGet();
            this.A0K.put(bno.A01, bno.A00);
            A03(this);
        }
    }

    public void A0A(E6I e6i, C24477C5s c5s) {
        if (!this.A0N) {
            C26176Ctu.A02("Tree operations are only supported from the UI Thread");
            this.A0H.add(C108945cZ.A0N(e6i, c5s));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CBw] */
    public C26962DNk(C26235CvV cvV, CFu cFu, C25416CfO cfO) {
        this.A06 = cvV.A01;
        this.A09 = cvV;
        this.A0D = cFu;
        this.A0E = cfO;
    }

    public static void A04(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            A0O.post(runnable);
        }
    }
}
