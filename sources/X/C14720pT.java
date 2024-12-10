package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0pT  reason: invalid class name and case insensitive filesystem */
public final class C14720pT extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $beyondBoundsItemCount;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;
    public final /* synthetic */ C16330s5 $horizontalAlignment;
    public final /* synthetic */ C16120rk $horizontalArrangement;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C18090vk $itemProviderLambda;
    public final /* synthetic */ boolean $reverseLayout;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ C16340s6 $verticalAlignment;
    public final /* synthetic */ C16130rl $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14720pT(C16120rk r2, C16130rl r3, AnonymousClass0tB r4, LazyListState lazyListState, C16330s5 r6, C16340s6 r7, C18090vk r8, int i, boolean z, boolean z2) {
        super(2);
        this.$state = lazyListState;
        this.$isVertical = z;
        this.$contentPadding = r4;
        this.$reverseLayout = z2;
        this.$itemProviderLambda = r8;
        this.$verticalArrangement = r3;
        this.$horizontalArrangement = r2;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = r6;
        this.$verticalAlignment = r7;
    }

    public static final List A05(AnonymousClass0N7 r4, List list, int i, int i2) {
        int max = Math.max(0, i - i2);
        int i3 = i - 1;
        ArrayList arrayList = null;
        if (max <= i3) {
            arrayList = AnonymousClass000.A13();
            while (true) {
                arrayList.add(r4.A00(i3));
                if (i3 == max) {
                    break;
                }
                i3--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                int A0n = AnonymousClass001.A0n(list, size);
                if (A0n < max) {
                    if (arrayList == null) {
                        arrayList = AnonymousClass000.A13();
                    }
                    arrayList.add(r4.A00(A0n));
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        if (arrayList == null) {
            return AnonymousClass1ZU.A09();
        }
        return arrayList;
    }

    public static final C25411Oc A09(int[] iArr) {
        return new C25411Oc(0, iArr.length - 1);
    }

    public static final int A00(C16610si r2, Object obj, int i) {
        int BSs;
        if (obj != null) {
            AnonymousClass0V1 r1 = (AnonymousClass0V1) r2;
            int i2 = r1.A01.A00.A00;
            if (i2 == 0 || ((i < i2 && obj.equals(r2.BTi(i))) || (BSs = r1.A02.BSs(obj)) == -1)) {
                return i;
            }
            return BSs;
        }
        return i;
    }

    public static final List A06(AnonymousClass0H2 r7, C16610si r8, C06830Zv r9) {
        C25411Oc A08;
        C06970a9 r1 = r7.A00;
        if (r1.A00 == 0 && r9.isEmpty()) {
            return AnonymousClass1ZU.A09();
        }
        ArrayList A13 = AnonymousClass000.A13();
        int i = r1.A00;
        if (i != 0) {
            Object[] objArr = r1.A01;
            AnonymousClass0Jb r4 = (AnonymousClass0Jb) objArr[0];
            int i2 = r4.A01;
            if (i > 0) {
                int i3 = 0;
                do {
                    AnonymousClass0Jb r12 = (AnonymousClass0Jb) objArr[i3];
                    if (r12.A01 < i2) {
                        i2 = r12.A01;
                    }
                    i3++;
                } while (i3 < i);
            }
            if (i2 >= 0) {
                int i4 = r4.A00;
                if (i > 0) {
                    int i5 = 0;
                    do {
                        AnonymousClass0Jb r13 = (AnonymousClass0Jb) objArr[i5];
                        if (r13.A00 > i4) {
                            i4 = r13.A00;
                        }
                        i5++;
                    } while (i5 < i);
                }
                A08 = new C25411Oc(i2, Math.min(i4, ((AnonymousClass0V1) r8).A01.A00.A00 - 1));
            } else {
                throw AnonymousClass000.A0k("negative minIndex");
            }
        } else {
            A08 = A08();
        }
        int size = r9.size();
        for (int i6 = 0; i6 < size; i6++) {
            AnonymousClass0XM r0 = (AnonymousClass0XM) ((C15710r4) r9.get(i6));
            int A00 = A00(r8, r0.A04, r0.A00.BT8());
            int A002 = A08.A00();
            if ((A00 > A08.A01() || A002 > A00) && A00 >= 0 && A00 < ((AnonymousClass0V1) r8).A01.A00.A00) {
                A13.add(Integer.valueOf(A00));
            }
        }
        int A003 = A08.A00();
        int A01 = A08.A01();
        if (A003 <= A01) {
            while (true) {
                A13.add(Integer.valueOf(A003));
                if (A003 == A01) {
                    break;
                }
                A003++;
            }
        }
        return A13;
    }

    public static final C25391Oa A07(C25391Oa r4) {
        return new C25391Oa(r4.A01, r4.A00, -r4.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.BfO() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0XG A0A(X.C17510um r54, long r55) {
        /*
            r53 = this;
            r0 = r53
            androidx.compose.foundation.lazy.LazyListState r1 = r0.$state
            boolean r1 = r1.A05
            r3 = r54
            if (r1 != 0) goto L_0x0012
            boolean r1 = r3.BfO()
            r36 = 0
            if (r1 == 0) goto L_0x0014
        L_0x0012:
            r36 = 1
        L_0x0014:
            boolean r5 = r0.$isVertical
            if (r5 == 0) goto L_0x00ba
            X.0CI r4 = X.AnonymousClass0CI.Vertical
        L_0x001a:
            r17 = r55
            r1 = r17
            X.C02220De.A00(r4, r1)
            X.0tB r2 = r0.$contentPadding
            X.By4 r1 = r3.getLayoutDirection()
            if (r5 == 0) goto L_0x00b4
            float r1 = r2.BDp(r1)
        L_0x002d:
            int r6 = r3.CG9(r1)
            boolean r4 = r0.$isVertical
            X.0tB r2 = r0.$contentPadding
            X.By4 r1 = r3.getLayoutDirection()
            if (r4 == 0) goto L_0x00af
            float r1 = r2.BDx(r1)
        L_0x003f:
            int r2 = r3.CG9(r1)
            X.0tB r1 = r0.$contentPadding
            float r1 = r1.BE0()
            int r5 = r3.CG9(r1)
            X.0tB r1 = r0.$contentPadding
            float r1 = r1.BDk()
            int r26 = r3.CG9(r1)
            int r11 = r5 + r26
            int r7 = r6 + r2
            boolean r1 = r0.$isVertical
            if (r1 == 0) goto L_0x00a4
            r27 = r11
            boolean r1 = r0.$reverseLayout
            if (r1 != 0) goto L_0x0067
            r26 = r5
        L_0x0067:
            int r27 = r27 - r26
            int r8 = -r7
            int r4 = -r11
            r1 = r17
            long r32 = X.C26229CvL.A05(r8, r4, r1)
            androidx.compose.foundation.lazy.LazyListState r1 = r0.$state
            r1.A0D(r3)
            X.0vk r1 = r0.$itemProviderLambda
            java.lang.Object r4 = r1.invoke()
            X.0uK r4 = (X.C17230uK) r4
            r8 = r4
            X.0V1 r8 = (X.AnonymousClass0V1) r8
            X.0Uz r10 = r8.A00
            int r9 = androidx.compose.ui.unit.Constraints.A01(r32)
            int r2 = androidx.compose.ui.unit.Constraints.A00(r32)
            X.0uP r1 = r10.A01
            r1.CJC(r9)
            X.0uP r1 = r10.A00
            r1.CJC(r2)
            boolean r2 = r0.$isVertical
            if (r2 == 0) goto L_0x00be
            X.0rl r1 = r0.$verticalArrangement
            if (r1 != 0) goto L_0x00c9
            java.lang.String r0 = "null verticalArrangement when isVertical == true"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00a4:
            r27 = r7
            boolean r1 = r0.$reverseLayout
            r26 = r2
            if (r1 != 0) goto L_0x0067
            r26 = r6
            goto L_0x0067
        L_0x00af:
            float r1 = X.AnonymousClass0Q7.A00(r2, r1)
            goto L_0x003f
        L_0x00b4:
            float r1 = X.AnonymousClass0Q7.A01(r2, r1)
            goto L_0x002d
        L_0x00ba:
            X.0CI r4 = X.AnonymousClass0CI.Horizontal
            goto L_0x001a
        L_0x00be:
            X.0rk r1 = r0.$horizontalArrangement
            if (r1 != 0) goto L_0x00c9
            java.lang.String r0 = "null horizontalAlignment when isVertical == false"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00c9:
            r1 = 0
            int r28 = r3.CG9(r1)
            X.0V2 r8 = r8.A01
            X.0OO r1 = r8.A00
            int r15 = r1.A00
            if (r2 == 0) goto L_0x011b
            int r25 = androidx.compose.ui.unit.Constraints.A00(r17)
            int r25 = r25 - r11
        L_0x00dc:
            boolean r1 = r0.$reverseLayout
            if (r1 == 0) goto L_0x00e6
            if (r25 > 0) goto L_0x00e6
            if (r2 == 0) goto L_0x0118
            int r5 = r5 + r25
        L_0x00e6:
            long r49 = X.C7A.A00(r6, r5)
            X.0s5 r9 = r0.$horizontalAlignment
            X.0s6 r6 = r0.$verticalAlignment
            androidx.compose.foundation.lazy.LazyListState r5 = r0.$state
            X.0N7 r10 = new X.0N7
            r37 = r10
            r38 = r4
            r39 = r5
            r40 = r3
            r41 = r9
            r42 = r6
            r43 = r15
            r44 = r28
            r45 = r26
            r46 = r27
            r47 = r32
            r51 = r2
            r52 = r1
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r51, r52)
            long r1 = r10.A00
            r5.A01 = r1
            androidx.compose.runtime.snapshots.Snapshot r12 = X.C04790Ov.A00()
            goto L_0x0122
        L_0x0118:
            int r6 = r6 + r25
            goto L_0x00e6
        L_0x011b:
            int r25 = androidx.compose.ui.unit.Constraints.A01(r17)
            int r25 = r25 - r7
            goto L_0x00dc
        L_0x0122:
            androidx.compose.runtime.snapshots.Snapshot r9 = r12.A02()     // Catch:{ all -> 0x01cd }
            X.0OG r6 = r5.A0F     // Catch:{ all -> 0x01c8 }
            X.0uP r1 = r6.A03     // Catch:{ all -> 0x01c8 }
            int r5 = r1.BT8()     // Catch:{ all -> 0x01c8 }
            java.lang.Object r2 = r6.A00     // Catch:{ all -> 0x01c8 }
            int r2 = A00(r4, r2, r5)     // Catch:{ all -> 0x01c8 }
            if (r5 == r2) goto L_0x013e
            r1.CJC(r2)     // Catch:{ all -> 0x01c8 }
            X.0Vv r1 = r6.A02     // Catch:{ all -> 0x01c8 }
            r1.A01(r5)     // Catch:{ all -> 0x01c8 }
        L_0x013e:
            X.0uP r1 = r6.A04     // Catch:{ all -> 0x01c8 }
            int r30 = r1.BT8()     // Catch:{ all -> 0x01c8 }
            X.AnonymousClass0N4.A00(r9)     // Catch:{ all -> 0x01cd }
            r12.A0D()
            androidx.compose.foundation.lazy.LazyListState r1 = r0.$state
            X.0Zv r5 = r1.A08()
            X.0H2 r1 = r1.A0H
            java.util.List r21 = A06(r1, r4, r5)
            boolean r1 = r3.BfO()
            if (r1 != 0) goto L_0x01bc
            if (r36 == 0) goto L_0x01bc
            androidx.compose.foundation.lazy.LazyListState r1 = r0.$state
            X.0Vr r1 = r1.A02
            X.0uU r1 = r1.A05
            float r1 = X.AnonymousClass001.A05(r1)
        L_0x0168:
            boolean r14 = r0.$isVertical
            java.util.List r20 = r8.A01()
            X.0rl r13 = r0.$verticalArrangement
            X.0rk r12 = r0.$horizontalArrangement
            boolean r9 = r0.$reverseLayout
            androidx.compose.foundation.lazy.LazyListState r4 = r0.$state
            X.0OM r8 = r4.A0E
            int r6 = r0.$beyondBoundsItemCount
            boolean r37 = r3.BfO()
            X.0XG r5 = r4.A03
            X.1OX r16 = r4.A0B()
            if (r16 == 0) goto L_0x01c1
            X.0uU r4 = r4.A0M
            X.0pi r22 = new X.0pi
            r38 = r22
            r39 = r3
            r40 = r7
            r41 = r11
            r42 = r17
            r38.<init>(r39, r40, r41, r42)
            r29 = r2
            r31 = r6
            r34 = r14
            r35 = r9
            r16 = r8
            r17 = r10
            r18 = r5
            r19 = r4
            r23 = r1
            r24 = r15
            r14 = r12
            r15 = r13
            X.0XG r4 = A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r35, r36, r37)
            androidx.compose.foundation.lazy.LazyListState r2 = r0.$state
            boolean r1 = r3.BfO()
            r0 = 0
            r2.A0C(r4, r1, r0)
            return r4
        L_0x01bc:
            androidx.compose.foundation.lazy.LazyListState r1 = r0.$state
            float r1 = r1.A00
            goto L_0x0168
        L_0x01c1:
            java.lang.String r0 = "coroutineScope should be not null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01c8:
            r0 = move-exception
            X.AnonymousClass0N4.A00(r9)     // Catch:{ all -> 0x01cd }
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x01cd:
            r0 = move-exception
            r12.A0D()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14720pT.A0A(X.0um, long):X.0XG");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A0A((C17510um) obj, ((Constraints) obj2).A0B());
    }

    public static final AnonymousClass0V0 A02(AnonymousClass0N7 r12, List list, List list2, int i, int i2, int i3) {
        int i4;
        int i5 = ((AnonymousClass0V0) C29431cG.A0b(list)).A04;
        int size = list2.size();
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i6 < size && AnonymousClass001.A0n(list2, i6) <= i5) {
            i7 = AnonymousClass001.A0n(list2, i6);
            int i9 = i6 + 1;
            if (i9 < 0 || i9 > AnonymousClass1ZU.A04(list2)) {
                i4 = -1;
            } else {
                i4 = list2.get(i9);
            }
            i8 = AnonymousClass000.A0M(i4);
            i6++;
        }
        int size2 = list.size();
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < size2; i13++) {
            AnonymousClass0V0 r1 = (AnonymousClass0V0) list.get(i13);
            if (r1.A04 == i7) {
                i10 = r1.A00;
                i12 = i13;
            } else if (r1.A04 == i8) {
                i11 = r1.A00;
            }
        }
        if (i7 == -1) {
            return null;
        }
        AnonymousClass0V0 A00 = r12.A00(i7);
        A00.A01 = true;
        int i14 = -i;
        if (i10 != Integer.MIN_VALUE) {
            i14 = Math.max(i14, i10);
        }
        if (i11 != Integer.MIN_VALUE) {
            i14 = Math.min(i14, i11 - A00.A05);
        }
        A00.A01(i14, i2, i3);
        if (i12 != -1) {
            list.set(i12, A00);
            return A00;
        }
        list.add(0, A00);
        return A00;
    }

    public static final C25411Oc A08() {
        return C25411Oc.A00;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.0V0} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0224, code lost:
        if (r6 > r12) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d9, code lost:
        if (r10.isEmpty() == false) goto L_0x01db;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass0XG A01(X.C16120rk r42, X.C16130rl r43, X.AnonymousClass0OM r44, X.AnonymousClass0N7 r45, X.C15700r3 r46, X.C17330uU r47, java.util.List r48, java.util.List r49, X.C36001nB r50, float r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, long r60, boolean r62, boolean r63, boolean r64, boolean r65) {
        /*
            r14 = r54
            r12 = r53
            r10 = r57
            r4 = r58
            if (r54 < 0) goto L_0x02a3
            if (r55 < 0) goto L_0x029c
            r8 = r52
            r41 = r50
            r33 = r44
            r38 = r45
            r19 = r65
            r40 = r64
            r30 = r62
            r34 = r60
            if (r52 > 0) goto L_0x005a
            int r36 = androidx.compose.ui.unit.Constraints.A03(r34)
            int r37 = androidx.compose.ui.unit.Constraints.A02(r34)
            java.util.ArrayList r35 = X.AnonymousClass000.A13()
            r6 = 0
            r34 = r38
            r38 = r30
            r39 = r19
            r33.A02(r34, r35, r36, r37, r38, r39, r40)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r36)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r37)
            X.0km r1 = X.C11850km.A00
            r0 = r41
            java.lang.Object r2 = r0.invoke(r3, r2, r1)
            X.0tH r2 = (X.C16820tH) r2
            X.0wS r3 = X.AnonymousClass1ZU.A09()
            int r7 = -r14
            int r12 = r53 + r55
            r1 = 0
            r4 = 0
            X.0XG r0 = new X.0XG
            r10 = r6
            r11 = r6
            r5 = r4
            r9 = r6
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x005a:
            r0 = 0
            if (r10 < r8) goto L_0x0060
            int r10 = r52 + -1
            r4 = 0
        L_0x0060:
            int r9 = X.C22339B3q.A01(r51)
            int r4 = r4 - r9
            if (r10 != 0) goto L_0x006b
            if (r4 >= 0) goto L_0x006b
            int r9 = r9 + r4
            r4 = 0
        L_0x006b:
            X.1JD r5 = new X.1JD
            r5.<init>()
            int r1 = -r14
            r18 = r1
            r1 = 0
            if (r56 >= 0) goto L_0x0078
            r1 = r56
        L_0x0078:
            int r2 = r18 + r1
            int r4 = r4 + r2
            r7 = 0
        L_0x007c:
            if (r4 >= 0) goto L_0x0095
            if (r10 <= 0) goto L_0x0095
            int r10 = r10 + -1
            r1 = r38
            X.0V0 r3 = r1.A00(r10)
            r5.add(r0, r3)
            int r1 = r3.A03
            int r7 = java.lang.Math.max(r7, r1)
            int r1 = r3.A06
            int r4 = r4 + r1
            goto L_0x007c
        L_0x0095:
            if (r4 >= r2) goto L_0x0099
            int r9 = r9 + r4
            r4 = r2
        L_0x0099:
            int r4 = r4 - r2
            int r17 = r53 + r55
            r11 = r17
            if (r11 >= r0) goto L_0x00a1
            r11 = 0
        L_0x00a1:
            int r6 = -r4
            r3 = r10
            r32 = 0
        L_0x00a5:
            int r1 = r5.size()
            if (r0 >= r1) goto L_0x00c1
            if (r6 < r11) goto L_0x00b3
            r5.remove(r0)
            r32 = 1
            goto L_0x00a5
        L_0x00b3:
            int r3 = r3 + 1
            java.lang.Object r1 = r5.get(r0)
            X.0V0 r1 = (X.AnonymousClass0V0) r1
            int r1 = r1.A06
            int r6 = r6 + r1
            int r0 = r0 + 1
            goto L_0x00a5
        L_0x00c1:
            if (r3 >= r8) goto L_0x00ee
            if (r6 < r11) goto L_0x00cd
            if (r6 <= 0) goto L_0x00cd
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x00ee
        L_0x00cd:
            r0 = r38
            X.0V0 r1 = r0.A00(r3)
            int r0 = r1.A06
            int r6 = r6 + r0
            if (r6 > r2) goto L_0x00e4
            int r13 = r52 + -1
            if (r3 == r13) goto L_0x00e4
            int r10 = r3 + 1
            int r4 = r4 - r0
            r32 = 1
        L_0x00e1:
            int r3 = r3 + 1
            goto L_0x00c1
        L_0x00e4:
            int r0 = r1.A03
            int r7 = java.lang.Math.max(r7, r0)
            r5.add(r1)
            goto L_0x00e1
        L_0x00ee:
            r2 = r9
            if (r6 >= r12) goto L_0x0115
            int r2 = r53 - r6
            int r4 = r4 - r2
            int r6 = r6 + r2
        L_0x00f5:
            if (r4 >= r14) goto L_0x010f
            if (r10 <= 0) goto L_0x010f
            int r10 = r10 + -1
            r0 = r38
            X.0V0 r1 = r0.A00(r10)
            r0 = 0
            r5.add(r0, r1)
            int r0 = r1.A03
            int r7 = java.lang.Math.max(r7, r0)
            int r0 = r1.A06
            int r4 = r4 + r0
            goto L_0x00f5
        L_0x010f:
            int r2 = r2 + r9
            if (r4 >= 0) goto L_0x0115
            int r2 = r2 + r4
            int r6 = r6 + r4
            r4 = 0
        L_0x0115:
            int r0 = X.C22339B3q.A01(r51)
            int r1 = java.lang.Integer.signum(r0)
            int r0 = java.lang.Integer.signum(r2)
            if (r1 != r0) goto L_0x0177
            int r0 = X.C22339B3q.A01(r51)
            int r1 = java.lang.Math.abs(r0)
            int r0 = java.lang.Math.abs(r2)
            if (r1 < r0) goto L_0x0177
            float r0 = (float) r2
            r16 = r0
        L_0x0134:
            float r51 = r51 - r16
            r0 = 0
            if (r65 == 0) goto L_0x0175
            if (r2 <= r9) goto L_0x0175
            int r0 = (r51 > r0 ? 1 : (r51 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0175
            int r2 = r2 - r9
            float r9 = (float) r2
            float r9 = r9 + r51
        L_0x0143:
            if (r4 < 0) goto L_0x0295
            int r0 = -r4
            r29 = r0
            java.lang.Object r2 = r5.A0T()
            X.0V0 r2 = (X.AnonymousClass0V0) r2
            if (r54 > 0) goto L_0x0152
            if (r56 >= 0) goto L_0x017a
        L_0x0152:
            int r13 = r5.size()
            r11 = 0
        L_0x0157:
            if (r11 >= r13) goto L_0x017a
            java.lang.Object r0 = r5.get(r11)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r1 = r0.A06
            if (r4 == 0) goto L_0x017a
            if (r1 > r4) goto L_0x017a
            int r0 = X.AnonymousClass1ZU.A04(r5)
            if (r11 == r0) goto L_0x017a
            int r4 = r4 - r1
            int r11 = r11 + 1
            java.lang.Object r2 = r5.get(r11)
            X.0V0 r2 = (X.AnonymousClass0V0) r2
            goto L_0x0157
        L_0x0175:
            r9 = 0
            goto L_0x0143
        L_0x0177:
            r16 = r51
            goto L_0x0134
        L_0x017a:
            r15 = r49
            r13 = r59
            r0 = r38
            java.util.List r11 = A05(r0, r15, r10, r13)
            int r10 = r11.size()
            r1 = 0
        L_0x0189:
            if (r1 >= r10) goto L_0x019a
            java.lang.Object r0 = r11.get(r1)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A03
            int r7 = java.lang.Math.max(r7, r0)
            int r1 = r1 + 1
            goto L_0x0189
        L_0x019a:
            r21 = r46
            r20 = r38
            r22 = r5
            r23 = r15
            r24 = r16
            r25 = r8
            r26 = r13
            r27 = r19
            java.util.List r10 = A04(r20, r21, r22, r23, r24, r25, r26, r27)
            int r13 = r10.size()
            r1 = 0
        L_0x01b3:
            if (r1 >= r13) goto L_0x01c4
            java.lang.Object r0 = r10.get(r1)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A03
            int r7 = java.lang.Math.max(r7, r0)
            int r1 = r1 + 1
            goto L_0x01b3
        L_0x01c4:
            java.lang.Object r0 = r5.A0T()
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x01db
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x01db
            boolean r0 = r10.isEmpty()
            r15 = 1
            if (r0 != 0) goto L_0x01dc
        L_0x01db:
            r15 = 0
        L_0x01dc:
            r13 = r6
            if (r62 == 0) goto L_0x01e0
            r13 = r7
        L_0x01e0:
            r0 = r34
            int r25 = X.C26229CvL.A01(r0, r13)
            if (r62 == 0) goto L_0x01e9
            r7 = r6
        L_0x01e9:
            int r26 = X.C26229CvL.A00(r0, r7)
            r31 = r63
            r20 = r42
            r21 = r43
            r27 = r6
            r28 = r12
            r23 = r11
            r24 = r10
            java.util.ArrayList r1 = A03(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r22 = r33
            r23 = r38
            r24 = r1
            r27 = r30
            r28 = r19
            r29 = r40
            r22.A02(r23, r24, r25, r26, r27, r28, r29)
            r23 = r48
            boolean r0 = X.AnonymousClass000.A1a(r23)
            if (r0 == 0) goto L_0x027a
            r21 = r38
            r22 = r1
            r24 = r14
            X.0V0 r7 = A02(r21, r22, r23, r24, r25, r26)
        L_0x0220:
            if (r3 < r8) goto L_0x0226
            r31 = 0
            if (r6 <= r12) goto L_0x0228
        L_0x0226:
            r31 = 1
        L_0x0228:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r25)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            X.0iO r3 = new X.0iO
            r11 = r47
            r0 = r19
            r3.<init>(r7, r11, r1, r0)
            r0 = r41
            java.lang.Object r12 = r0.invoke(r10, r6, r3)
            X.0tH r12 = (X.C16820tH) r12
            if (r15 != 0) goto L_0x027d
            int r0 = r1.size()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r0)
            int r14 = r1.size()
            r11 = 0
        L_0x0251:
            if (r11 >= r14) goto L_0x027c
            java.lang.Object r10 = r1.get(r11)
            r6 = r10
            X.0V0 r6 = (X.AnonymousClass0V0) r6
            int r3 = r6.A04
            java.lang.Object r0 = r5.A0T()
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            if (r3 < r0) goto L_0x0272
            int r3 = r6.A04
            java.lang.Object r0 = r5.A0U()
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            if (r3 <= r0) goto L_0x0274
        L_0x0272:
            if (r6 != r7) goto L_0x0277
        L_0x0274:
            r13.add(r10)
        L_0x0277:
            int r11 = r11 + 1
            goto L_0x0251
        L_0x027a:
            r7 = 0
            goto L_0x0220
        L_0x027c:
            r1 = r13
        L_0x027d:
            X.0XG r21 = new X.0XG
            r22 = r2
            r23 = r12
            r24 = r1
            r25 = r16
            r26 = r9
            r27 = r4
            r28 = r18
            r29 = r17
            r30 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r21
        L_0x0295:
            java.lang.String r0 = "negative currentFirstItemScrollOffset"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x029c:
            java.lang.String r0 = "invalid afterContentPadding"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x02a3:
            java.lang.String r0 = "invalid beforeContentPadding"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14720pT.A01(X.0rk, X.0rl, X.0OM, X.0N7, X.0r3, X.0uU, java.util.List, java.util.List, X.1nB, float, int, int, int, int, int, int, int, int, long, boolean, boolean, boolean, boolean):X.0XG");
    }

    public static final ArrayList A03(C16120rk r8, C16130rl r9, List list, List list2, List list3, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        int i6 = i5;
        int i7 = i;
        if (z) {
            i7 = i2;
        }
        boolean z3 = false;
        if (i3 < Math.min(i7, i4)) {
            z3 = true;
            if (i5 != 0) {
                throw AnonymousClass000.A0n("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z3) {
            int size = list2.size();
            int i8 = i6;
            for (int i9 = 0; i9 < size; i9++) {
                AnonymousClass0V0 r3 = (AnonymousClass0V0) list2.get(i9);
                i8 -= r3.A06;
                r3.A01(i8, i, i2);
                arrayList.add(r3);
            }
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                AnonymousClass0V0 r0 = (AnonymousClass0V0) list.get(i10);
                r0.A01(i6, i, i2);
                arrayList.add(r0);
                i6 += r0.A06;
            }
            int size3 = list3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                AnonymousClass0V0 r02 = (AnonymousClass0V0) list3.get(i11);
                r02.A01(i6, i, i2);
                arrayList.add(r02);
                i6 += r02.A06;
            }
        } else if (!list2.isEmpty() || !list3.isEmpty()) {
            throw AnonymousClass000.A0k("no extra items");
        } else {
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i12 = 0; i12 < size4; i12++) {
                int i13 = i12;
                if (z2) {
                    i13 = (size4 - i12) - 1;
                }
                iArr[i12] = ((AnonymousClass0V0) list.get(i13)).A05;
            }
            int[] iArr2 = new int[size4];
            for (int i14 = 0; i14 < size4; i14++) {
                iArr2[i14] = 0;
            }
            if (z) {
                if (r9 != null) {
                    r9.BCb(iArr, iArr2, i7);
                } else {
                    throw AnonymousClass000.A0k("null verticalArrangement when isVertical == true");
                }
            } else if (r8 != null) {
                r8.BCc(C24246By4.Ltr, iArr, iArr2, i7);
            } else {
                throw AnonymousClass000.A0k("null horizontalArrangement when isVertical == false");
            }
            C25391Oa A09 = A09(iArr2);
            if (z2) {
                A09 = A07(A09);
            }
            int A00 = A09.A00();
            int A01 = A09.A01();
            int A02 = A09.A02();
            if (A02 <= 0 ? !(A02 >= 0 || A01 > A00) : A00 <= A01) {
                while (true) {
                    int i15 = iArr2[A00];
                    int i16 = A00;
                    if (z2) {
                        i16 = (size4 - A00) - 1;
                    }
                    AnonymousClass0V0 r2 = (AnonymousClass0V0) list.get(i16);
                    if (z2) {
                        i15 = (i7 - i15) - r2.A05;
                    }
                    r2.A01(i15, i, i2);
                    arrayList.add(r2);
                    if (A00 == A01) {
                        break;
                    }
                    A00 += A02;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r0 = (X.C15690r2) r5.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (r10 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ff, code lost:
        if (r3 == null) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A04(X.AnonymousClass0N7 r12, X.C15700r3 r13, java.util.List r14, java.util.List r15, float r16, int r17, int r18, boolean r19) {
        /*
            java.lang.Object r0 = X.C29431cG.A0d(r14)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            int r0 = r0 + r18
            r6 = r17
            int r1 = r17 + -1
            int r4 = java.lang.Math.min(r0, r1)
            java.lang.Object r0 = X.C29431cG.A0d(r14)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            int r2 = r0 + 1
            r11 = 0
            r3 = r11
            if (r2 > r4) goto L_0x0030
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
        L_0x0024:
            X.0V0 r0 = r12.A00(r2)
            r3.add(r0)
            r0 = r2
            int r2 = r2 + 1
            if (r0 != r4) goto L_0x0024
        L_0x0030:
            r2 = 0
            if (r19 == 0) goto L_0x0122
            if (r13 == 0) goto L_0x0122
            X.0XG r13 = (X.AnonymousClass0XG) r13
            java.util.List r5 = r13.A08
            boolean r0 = X.AnonymousClass000.A1a(r5)
            if (r0 == 0) goto L_0x0122
            int r0 = r5.size()
            int r7 = r0 + -1
        L_0x0045:
            r0 = -1
            if (r0 >= r7) goto L_0x00ad
            java.lang.Object r0 = r5.get(r7)
            X.0r2 r0 = (X.C15690r2) r0
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            if (r0 <= r4) goto L_0x00aa
            if (r7 == 0) goto L_0x0064
            int r0 = r7 + -1
            java.lang.Object r0 = r5.get(r0)
            X.0r2 r0 = (X.C15690r2) r0
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            if (r0 > r4) goto L_0x00aa
        L_0x0064:
            java.lang.Object r0 = r5.get(r7)
            X.0r2 r0 = (X.C15690r2) r0
        L_0x006a:
            java.lang.Object r5 = X.C29431cG.A0d(r5)
            X.0r2 r5 = (X.C15690r2) r5
            if (r0 == 0) goto L_0x00af
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r8 = r0.A04
            r0 = r5
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            int r7 = java.lang.Math.min(r0, r1)
            if (r8 > r7) goto L_0x00af
            if (r3 != 0) goto L_0x0092
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
        L_0x0087:
            X.0V0 r0 = r12.A00(r8)
            r3.add(r0)
        L_0x008e:
            if (r8 == r7) goto L_0x00af
            int r8 = r8 + 1
        L_0x0092:
            int r9 = r3.size()
            r1 = 0
        L_0x0097:
            if (r1 >= r9) goto L_0x0087
            java.lang.Object r10 = r3.get(r1)
            r0 = r10
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            if (r0 != r8) goto L_0x00a7
            if (r10 != 0) goto L_0x008e
            goto L_0x0087
        L_0x00a7:
            int r1 = r1 + 1
            goto L_0x0097
        L_0x00aa:
            int r7 = r7 + -1
            goto L_0x0045
        L_0x00ad:
            r0 = r11
            goto L_0x006a
        L_0x00af:
            int r1 = r13.A05
            X.0V0 r5 = (X.AnonymousClass0V0) r5
            int r0 = r5.A00
            int r1 = r1 - r0
            int r0 = r5.A05
            int r1 = r1 - r0
            float r8 = (float) r1
            float r8 = r8 - r16
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0122
            int r0 = r5.A04
            int r9 = r0 + 1
            r7 = 0
        L_0x00c6:
            if (r9 >= r6) goto L_0x0122
            float r0 = (float) r7
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0122
            if (r9 > r4) goto L_0x00e8
            int r5 = r14.size()
            r1 = 0
        L_0x00d4:
            if (r1 >= r5) goto L_0x00e4
            java.lang.Object r10 = r14.get(r1)
            r0 = r10
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            if (r0 == r9) goto L_0x00e5
            int r1 = r1 + 1
            goto L_0x00d4
        L_0x00e4:
            r10 = r11
        L_0x00e5:
            X.0V0 r10 = (X.AnonymousClass0V0) r10
            goto L_0x011a
        L_0x00e8:
            if (r3 == 0) goto L_0x0101
            int r5 = r3.size()
            r1 = 0
        L_0x00ef:
            if (r1 >= r5) goto L_0x0117
            java.lang.Object r10 = r3.get(r1)
            r0 = r10
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            if (r0 == r9) goto L_0x0118
            int r1 = r1 + 1
            goto L_0x00ef
        L_0x00ff:
            if (r3 != 0) goto L_0x0105
        L_0x0101:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
        L_0x0105:
            X.0V0 r0 = r12.A00(r9)
            r3.add(r0)
            int r9 = r9 + 1
            java.lang.Object r0 = X.C29431cG.A0d(r3)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A06
            goto L_0x0120
        L_0x0117:
            r10 = r11
        L_0x0118:
            X.0V0 r10 = (X.AnonymousClass0V0) r10
        L_0x011a:
            if (r10 == 0) goto L_0x00ff
            int r9 = r9 + 1
            int r0 = r10.A06
        L_0x0120:
            int r7 = r7 + r0
            goto L_0x00c6
        L_0x0122:
            if (r3 == 0) goto L_0x0136
            java.lang.Object r0 = X.C29431cG.A0d(r3)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r0 = r0.A04
            if (r0 <= r4) goto L_0x0136
            java.lang.Object r0 = X.C29431cG.A0d(r3)
            X.0V0 r0 = (X.AnonymousClass0V0) r0
            int r4 = r0.A04
        L_0x0136:
            int r1 = r15.size()
        L_0x013a:
            if (r2 >= r1) goto L_0x0152
            int r0 = X.AnonymousClass001.A0n(r15, r2)
            if (r0 <= r4) goto L_0x014f
            if (r3 != 0) goto L_0x0148
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
        L_0x0148:
            X.0V0 r0 = r12.A00(r0)
            r3.add(r0)
        L_0x014f:
            int r2 = r2 + 1
            goto L_0x013a
        L_0x0152:
            if (r3 != 0) goto L_0x0158
            X.0wS r3 = X.AnonymousClass1ZU.A09()
        L_0x0158:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14720pT.A04(X.0N7, X.0r3, java.util.List, java.util.List, float, int, int, boolean):java.util.List");
    }
}
