package X;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Oz  reason: invalid class name and case insensitive filesystem */
public final class C73103Oz extends CursorAdapter {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05 = Long.MIN_VALUE;
    public AnonymousClass02B A06;
    public AnonymousClass1IX A07 = AnonymousClass1IX.of();
    public C106785Xe A08;
    public AnonymousClass1HB A09;
    public AnonymousClass4NU A0A;
    public AnonymousClass205 A0B;
    public C25802CmF A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public AnonymousClass206 A0I;
    public final SparseArray A0J = new SparseArray();
    public final AnonymousClass4Xe A0K;
    public final C19830z4 A0L;
    public final C88304Zd A0M;
    public final AnonymousClass1BI A0N;
    public final C25461Oh A0O;
    public final AnonymousClass1W6 A0P;
    public final HashSet A0Q = C17880vN.A12();
    public final HashSet A0R = C17880vN.A12();
    public final HashSet A0S = C17880vN.A12();
    public final HashSet A0T = C17880vN.A12();
    public final List A0U = AnonymousClass000.A13();
    public final Set A0V = C17880vN.A12();
    public final AnonymousClass01E A0W;
    public final C19880zA A0X;
    public final AnonymousClass11S A0Y;
    public final C88524a2 A0Z;
    public final C108875cR A0a;
    public final C63232sj A0b;
    public final AnonymousClass11P A0c;
    public final C18030ve A0d;
    public final AnonymousClass1O2 A0e;
    public final AnonymousClass1PP A0f;

    public final int A05(AnonymousClass206 r5) {
        int i;
        C18070vi.A0d(r5, 0);
        if (getCursor() != null && !this.A0G) {
            SparseArray sparseArray = this.A0J;
            int indexOfValue = sparseArray.indexOfValue(r5);
            if (indexOfValue >= 0) {
                i = sparseArray.keyAt(indexOfValue);
            } else {
                int size = this.A07.size();
                int i2 = 0;
                while (i2 < size) {
                    if (r5.equals(this.A07.get(i2))) {
                        i = i2 + this.A0H;
                    } else {
                        i2++;
                    }
                }
            }
            if (i >= A04()) {
                return i + 1;
            }
            return i;
        }
        return -1;
    }

    public final int A06(Integer num, int i) {
        int i2;
        C18070vi.A0d(num, 1);
        if (num == AnonymousClass00R.A00 || num == AnonymousClass00R.A01) {
            return i;
        }
        AnonymousClass206 A072 = getItem(i);
        C17960vV.A07(A072);
        C18070vi.A0X(A072);
        int intValue = this.A0K.A01(A072).intValue();
        if (intValue == 1) {
            int i3 = i - 1;
            while (-1 < i2) {
                AnonymousClass206 A073 = getItem(i2);
                if (A073 != null && A03(A073, A072, i2, i2 + 1) && A02(A073)) {
                    i3 = i2 - 1;
                    A072 = A073;
                }
            }
            return i;
        } else if (intValue == 3) {
            i2 = i - 1;
            while (-1 < i2) {
                AnonymousClass206 A074 = getItem(i2);
                if (A074 != null) {
                    C63232sj r0 = this.A0b;
                    C17960vV.A07(A072);
                    if (r0.A03(A074, A072)) {
                        i2--;
                        A072 = A074;
                    }
                }
            }
            return i;
        } else if (intValue != 2 || !this.A0D) {
            return i;
        } else {
            return i - 1;
        }
        return i2 + 1;
    }

    public void changeCursor(Cursor cursor) {
        this.A0E = true;
        if (cursor != null) {
            this.A0H = cursor.getCount();
        }
        super.changeCursor(cursor);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C73103Oz(X.AnonymousClass01E r21, X.C19880zA r22, X.AnonymousClass11S r23, X.AnonymousClass4Xe r24, X.C88524a2 r25, X.C108875cR r26, X.C63232sj r27, X.AnonymousClass11P r28, X.C19830z4 r29, X.C18030ve r30, X.C88304Zd r31, X.AnonymousClass1BI r32, X.AnonymousClass1O2 r33, X.C25461Oh r34, X.C86454Rr r35, X.AnonymousClass1PP r36, X.AnonymousClass1W6 r37) {
        /*
            r20 = this;
            r9 = r32
            r15 = r28
            r14 = r21
            r18 = r23
            r16 = r25
            r1 = r16
            r0 = r18
            X.C18070vi.A0w(r14, r9, r1, r15, r0)
            r8 = r33
            r5 = r36
            r4 = r37
            X.C18070vi.A0q(r5, r4, r8)
            r0 = 9
            r13 = r27
            X.C18070vi.A0d(r13, r0)
            r6 = r35
            r12 = r29
            r11 = r30
            r10 = r31
            r17 = r24
            r0 = r17
            X.C18070vi.A0y(r10, r0, r6, r11, r12)
            r7 = r34
            r19 = r22
            r0 = r19
            X.C18070vi.A0m(r7, r0)
            r0 = 0
            r3 = 0
            r2 = r20
            r2.<init>(r14, r0, r3)
            r0 = -9223372036854775808
            r2.A05 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r2.A0J = r0
            java.util.HashSet r0 = X.C17880vN.A12()
            r2.A0V = r0
            java.util.HashSet r0 = X.C17880vN.A12()
            r2.A0R = r0
            java.util.HashSet r0 = X.C17880vN.A12()
            r2.A0T = r0
            java.util.HashSet r0 = X.C17880vN.A12()
            r2.A0Q = r0
            java.util.HashSet r0 = X.C17880vN.A12()
            r2.A0S = r0
            X.1IX r0 = X.AnonymousClass1IX.of()
            r2.A07 = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r2.A0U = r0
            r2.A0c = r15
            r2.A0N = r9
            r0 = r18
            r2.A0Y = r0
            r2.A0f = r5
            r2.A0P = r4
            r2.A0e = r8
            r2.A0b = r13
            r0 = r26
            r2.A0a = r0
            r2.A0W = r14
            r0 = r16
            r2.A0Z = r0
            r2.A0M = r10
            r0 = r17
            r2.A0K = r0
            r2.A0d = r11
            r2.A0L = r12
            boolean r0 = X.C22971Dz.A0V(r9)
            if (r0 == 0) goto L_0x00a8
            X.1ch r9 = (X.C29681ch) r9
            boolean r0 = r6.A01(r9)
            if (r0 == 0) goto L_0x00a8
            r3 = 1
        L_0x00a8:
            r2.A0G = r3
            r2.A0O = r7
            r0 = r19
            r2.A0X = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73103Oz.<init>(X.01E, X.0zA, X.11S, X.4Xe, X.4a2, X.5cR, X.2sj, X.11P, X.0z4, X.0ve, X.4Zd, X.1BI, X.1O2, X.1Oh, X.4Rr, X.1PP, X.1W6):void");
    }

    public static void A00(AnonymousClass4aY r2) {
        r2.A2B.getConversationCursorAdapter().A01++;
        r2.A2B.A05();
    }

    private final boolean A01(AnonymousClass3uP r4, AnonymousClass206 r5) {
        C108675c7 conversationRowCustomizer = this.A0a.getConversationRowCustomizer();
        C18070vi.A0X(conversationRowCustomizer);
        int BFV = conversationRowCustomizer.BFV();
        if (r4.A00 == BFV || !conversationRowCustomizer.CM7()) {
            HashSet hashSet = this.A0T;
            AnonymousClass205 r1 = r5.A0v;
            if (hashSet.contains(r1) || this.A0Q.contains(r1) || this.A0S.contains(r1) || this.A0R.contains(r1) || this.A06 != null || r4.A03 != this.A01 || (r5 instanceof AnonymousClass219)) {
                return true;
            }
            return false;
        }
        r4.A00 = BFV;
        return true;
    }

    private final boolean A02(AnonymousClass206 r8) {
        int i;
        AnonymousClass8BG A012;
        AnonymousClass212 r0;
        Integer A013 = this.A0K.A01(r8);
        if (A013 != AnonymousClass00R.A00) {
            C18070vi.A0d(A013, 0);
            if ((A013 == AnonymousClass00R.A0N || r8.A0y <= this.A05) && r8.A0x > 0 && (((i = r8.A0u) != 20 || r8.A0K() == null) && !C20097A7a.A05(r8) && C60532oB.A00(r8) == null && i != 99)) {
                if (i != 20) {
                    return true;
                }
                AnonymousClass11P r5 = this.A0c;
                AnonymousClass11S r3 = this.A0Y;
                AnonymousClass1O2 r2 = this.A0e;
                C18030ve r1 = this.A0d;
                if (AnonymousClass4Z2.A00(r3, r5, r1, r2, r8) != null || ((A012 = C63892tr.A01(r8)) != null && AnonymousClass4Z2.A01(r3, r5, r1, r2, A012.BMv()) != null)) {
                    return false;
                }
                if ((!(r8 instanceof AnonymousClass22H) || AnonymousClass4Z2.A01(r3, r5, r1, r2, ((AnonymousClass22H) r8).A17()) == null) && AnonymousClass4Z2.A01(r3, r5, r1, r2, Collections.singletonList(C63892tr.A02(r8))) == null && AnonymousClass4Z2.A01(r3, r5, r1, r2, Collections.singletonList(C63892tr.A03(r8))) == null) {
                    if (!(r8 instanceof C444323k)) {
                        return true;
                    }
                    C693136s r02 = (C693136s) ((C444323k) r8).A00.A02;
                    if (r02 != null) {
                        r0 = r02.A00;
                    } else {
                        r0 = null;
                    }
                    if (AnonymousClass4Z2.A01(r3, r5, r1, r2, Collections.singletonList(r0)) != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A03(AnonymousClass206 r11, AnonymousClass206 r12, int i, int i2) {
        boolean z;
        AnonymousClass206 A0K2;
        AnonymousClass206 A0K3;
        AnonymousClass1BI A0H2;
        long j = r11.A0I;
        long j2 = r12.A0I;
        boolean z2 = false;
        if (Math.abs(j - j2) <= 610000 && A87.A04(j, j2) && r11.A11(1) == r12.A11(1) && (z = r11.A0v.A02) == r12.A0v.A02 && (z || (A0H2 = r11.A0H()) == null || A0H2.equals(r12.A0H()))) {
            boolean z3 = true;
            boolean A1U = AnonymousClass000.A1U(i, A04());
            if (i2 >= A04()) {
                z3 = false;
            }
            if (A1U == z3) {
                AnonymousClass4Xe r0 = this.A0K;
                if (r0.A01(r11) == r0.A01(r12) && ((A0K2 = r11.A0K()) == (A0K3 = r12.A0K()) || !(A0K2 == null || A0K3 == null || !A0K2.A0v.equals(A0K3.A0v)))) {
                    C20947Ac1 A002 = AnonymousClass9RY.A00(r11);
                    C20947Ac1 A003 = AnonymousClass9RY.A00(r12);
                    z2 = true;
                    if (A002 == null) {
                        if (A003 == null) {
                            return z2;
                        }
                        return false;
                    } else if (A003 == null || !A002.A01.equals(A003.A01)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return z2;
    }

    public final int A04() {
        if (this.A0G) {
            return 0;
        }
        return (this.A0H + this.A07.size()) - this.A04;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: A07 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 getItem(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.A0G
            r2 = 0
            if (r0 != 0) goto L_0x0146
            int r0 = r9.A04     // Catch:{ all -> 0x0144 }
            if (r0 <= 0) goto L_0x002c
            int r0 = r9.A04()     // Catch:{ all -> 0x0144 }
            if (r10 != r0) goto L_0x002c
            X.206 r3 = r9.A0I     // Catch:{ all -> 0x0144 }
            if (r3 != 0) goto L_0x002b
            X.1PP r0 = r9.A0f     // Catch:{ all -> 0x0144 }
            X.205 r2 = X.C17880vN.A0Z(r2, r0)     // Catch:{ all -> 0x0144 }
            X.11P r0 = r9.A0c     // Catch:{ all -> 0x0144 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0144 }
            X.210 r3 = new X.210     // Catch:{ all -> 0x0144 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "dummy msg!"
            r3.A0i(r0)     // Catch:{ all -> 0x0144 }
            r9.A0I = r3     // Catch:{ all -> 0x0144 }
        L_0x002b:
            return r3
        L_0x002c:
            android.database.Cursor r7 = r9.getCursor()     // Catch:{ all -> 0x0144 }
            if (r7 == 0) goto L_0x0146
            int r5 = r9.A04()     // Catch:{ all -> 0x0144 }
            r6 = r10
            if (r10 <= r5) goto L_0x003b
            int r6 = r10 + -1
        L_0x003b:
            int r0 = r9.A0H     // Catch:{ all -> 0x0144 }
            if (r6 >= r0) goto L_0x0109
            android.util.SparseArray r1 = r9.A0J     // Catch:{ all -> 0x0144 }
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0144 }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ all -> 0x0144 }
            if (r2 != 0) goto L_0x012e
            int r4 = r7.getPosition()     // Catch:{ all -> 0x0144 }
            int r0 = r9.A0H     // Catch:{ all -> 0x0144 }
            int r0 = r0 + -1
            int r0 = r0 - r6
            r7.moveToPosition(r0)     // Catch:{ all -> 0x0144 }
            int r3 = r7.getPosition()     // Catch:{ all -> 0x0144 }
            X.1BI r2 = r9.A0N     // Catch:{ CursorIndexOutOfBoundsException -> 0x006f }
            X.1W6 r0 = r9.A0P     // Catch:{ all -> 0x006d }
            X.206 r2 = r0.A02(r7, r2)     // Catch:{ all -> 0x006d }
            if (r3 >= r4) goto L_0x012b
            int r0 = r9.A00     // Catch:{ all -> 0x0144 }
            if (r3 <= r0) goto L_0x011f
            int r0 = r0 + 50
            if (r3 <= r0) goto L_0x012b
            goto L_0x011f
        L_0x006d:
            r0 = move-exception
            throw r0     // Catch:{ CursorIndexOutOfBoundsException -> 0x006f }
        L_0x006f:
            r8 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "ConversationCursorAdapter/getItem out-of-bounds "
            r2.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " unseenRowCount:"
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            int r0 = r9.A04     // Catch:{ all -> 0x0144 }
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " unseenMsgCount:"
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            int r0 = r9.A02     // Catch:{ all -> 0x0144 }
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " unseenCallCount:"
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            int r0 = r9.A03     // Catch:{ all -> 0x0144 }
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " cachePos:"
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            int r0 = r9.A00     // Catch:{ all -> 0x0144 }
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " appended:"
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            X.1IX r0 = r9.A07     // Catch:{ all -> 0x0144 }
            int r0 = r0.size()     // Catch:{ all -> 0x0144 }
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " db:"
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            int r0 = r1.size()     // Catch:{ all -> 0x0144 }
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " jidString:"
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            X.1BI r1 = r9.A0N     // Catch:{ all -> 0x0144 }
            r7.append(r1)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " jidType:"
            r7.append(r0)     // Catch:{ all -> 0x0144 }
            int r0 = r1.getType()     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = X.C17880vN.A0t(r7, r0)     // Catch:{ all -> 0x0144 }
            r2.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " cursorCount:"
            r2.append(r0)     // Catch:{ all -> 0x0144 }
            int r0 = r9.A0H     // Catch:{ all -> 0x0144 }
            r2.append(r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " dataPos:"
            r2.append(r0)     // Catch:{ all -> 0x0144 }
            r2.append(r6)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " viewPos:"
            r2.append(r0)     // Catch:{ all -> 0x0144 }
            r2.append(r10)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " dividerPos:"
            r2.append(r0)     // Catch:{ all -> 0x0144 }
            r2.append(r5)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " oldPos:"
            r2.append(r0)     // Catch:{ all -> 0x0144 }
            r2.append(r4)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = " newPos:"
            X.C17900vP.A0i(r0, r2, r3)     // Catch:{ all -> 0x0144 }
            throw r8     // Catch:{ all -> 0x0144 }
        L_0x0109:
            int r1 = r6 - r0
            if (r1 < 0) goto L_0x012e
            X.1IX r0 = r9.A07     // Catch:{ all -> 0x0144 }
            int r0 = r0.size()     // Catch:{ all -> 0x0144 }
            if (r1 >= r0) goto L_0x012e
            X.1IX r1 = r9.A07     // Catch:{ all -> 0x0144 }
            int r0 = r9.A0H     // Catch:{ all -> 0x0144 }
            int r6 = r6 - r0
            X.206 r2 = X.AnonymousClass3MW.A0k(r1, r6)     // Catch:{ all -> 0x0144 }
            goto L_0x012e
        L_0x011f:
            r4 = 0
            int r0 = r3 + -50
            int r0 = java.lang.Math.max(r4, r0)     // Catch:{ all -> 0x0144 }
            r9.A00 = r0     // Catch:{ all -> 0x0144 }
            r7.moveToPosition(r0)     // Catch:{ all -> 0x0144 }
        L_0x012b:
            r1.put(r6, r2)     // Catch:{ all -> 0x0144 }
        L_0x012e:
            java.util.List r0 = r9.A0U     // Catch:{ all -> 0x0144 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0144 }
        L_0x0134:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x0146
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0144 }
            X.5Z4 r0 = (X.AnonymousClass5Z4) r0     // Catch:{ all -> 0x0144 }
            r0.C1I(r2)     // Catch:{ all -> 0x0144 }
            goto L_0x0134
        L_0x0144:
            r0 = move-exception
            throw r0
        L_0x0146:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73103Oz.getItem(int):X.206");
    }

    public final void A09(C216416v r7) {
        int intValue;
        C216416v r5 = this.A0Z.A08;
        ConcurrentHashMap concurrentHashMap = r7.A00;
        Enumeration keys = concurrentHashMap.keys();
        C18070vi.A0X(keys);
        C98994s5 r3 = new C98994s5(keys);
        while (r3.hasNext()) {
            Object next = r3.next();
            C18070vi.A0d(next, 0);
            Number number = (Number) concurrentHashMap.get(next);
            if (number == null) {
                intValue = 0;
            } else {
                intValue = number.intValue();
            }
            r5.A00.put(next, Integer.valueOf(intValue));
        }
    }

    public void bindView(View view, Context context, Cursor cursor) {
        throw AnonymousClass000.A0n("should not be called, getView is defined");
    }

    public int getCount() {
        int i = 0;
        if (!this.A0E || getCursor() == null || this.A0G) {
            return 0;
        }
        int size = this.A0H + this.A07.size();
        if (this.A04 > 0) {
            i = 1;
        }
        return i + size;
    }

    public int getItemViewType(int i) {
        if (!this.A0E) {
            return -1;
        }
        if (this.A04 > 0 && i == A04()) {
            return 18;
        }
        AnonymousClass206 A072 = getItem(i);
        if (A072 == null) {
            return -1;
        }
        C88524a2 r2 = this.A0Z;
        Integer A082 = A08(A072, i);
        if (A082 == AnonymousClass00R.A00) {
            return r2.A03(A072);
        }
        if (A082 != AnonymousClass00R.A01) {
            return 34;
        }
        int intValue = r2.A07.A01(A072).intValue();
        if (intValue != 2) {
            if (intValue == 3) {
                return 107;
            }
            if (A072.A0v.A02) {
                return 32;
            }
            return 33;
        } else if (A072.A0v.A02) {
            return 41;
        } else {
            return 42;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f8, code lost:
        if (r5.A0w.A01(r1).A0H != null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0211, code lost:
        if (X.AnonymousClass9RY.A00(r0) != null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0253, code lost:
        if (r1 != r0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ad, code lost:
        if (X.C26180Cu0.A02(r3, r7.A0O, r9.A0P()) != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02bf, code lost:
        if (X.C26180Cu0.A02(r3, r7.A0O, r9.A0P()) == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02db, code lost:
        if (X.C18070vi.A18(r9.getClass(), r5.getFMessage().getClass()) == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05a0, code lost:
        if (r6 != false) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1 == true) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01df, code lost:
        if (r1.A03.A0H == null) goto L_0x01e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r2 = r20
            r8 = 2
            r5 = r21
            X.C18070vi.A0d(r5, r8)
            r7 = r18
            boolean r0 = r7.A0F
            if (r0 != 0) goto L_0x00a9
            X.1HB r0 = r7.A09
            if (r0 == 0) goto L_0x00a9
            X.4NU r0 = r7.A0A
            if (r0 == 0) goto L_0x00a9
            X.C17960vV.A02()
            boolean r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x00a9
        L_0x001e:
            java.lang.String r16 = "adapter_row"
            if (r0 == 0) goto L_0x002e
            X.1HB r0 = r7.A09
            X.C17960vV.A07(r0)
            X.19a r1 = r0.A01
            r0 = r16
            r1.A07(r0)
        L_0x002e:
            int r0 = r7.A04()
            r6 = 0
            r4 = 1
            r12 = r19
            if (r12 != r0) goto L_0x00ca
            X.1BI r0 = r7.A0N
            boolean r9 = X.C22971Dz.A0V(r0)
            int r1 = r7.A02
            int r0 = r7.A03
            if (r1 <= 0) goto L_0x0096
            android.content.res.Resources r3 = r5.getResources()
            r1 = 2131755469(0x7f1001cd, float:1.9141818E38)
            if (r0 <= 0) goto L_0x008e
            int r0 = r7.A02
            java.lang.String r10 = X.C72473Md.A0k(r3, r0, r1)
            X.C18070vi.A0X(r10)
            android.content.res.Resources r3 = r5.getResources()
            r1 = 2131755236(0x7f1000e4, float:1.9141346E38)
            int r0 = r7.A03
            java.lang.String r9 = X.C72473Md.A0k(r3, r0, r1)
            X.C18070vi.A0X(r9)
            android.content.Context r3 = r5.getContext()
            r1 = 2131897347(0x7f122c03, float:1.942958E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r6] = r10
            java.lang.String r3 = X.C17880vN.A0q(r3, r9, r0, r4, r1)
        L_0x0075:
            X.C18070vi.A0X(r3)
        L_0x0078:
            int r0 = r7.A02
            if (r0 <= 0) goto L_0x00ac
            X.0zA r1 = r7.A0X
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x00ac
            r1.A03()
            java.lang.String r0 = "canSummarize"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x008e:
            if (r9 == 0) goto L_0x0093
            r1 = 2131755473(0x7f1001d1, float:1.9141826E38)
        L_0x0093:
            int r0 = r7.A02
            goto L_0x00a1
        L_0x0096:
            if (r0 <= 0) goto L_0x00a6
            android.content.res.Resources r3 = r5.getResources()
            r1 = 2131755236(0x7f1000e4, float:1.9141346E38)
            int r0 = r7.A03
        L_0x00a1:
            java.lang.String r3 = X.C72473Md.A0k(r3, r0, r1)
            goto L_0x0075
        L_0x00a6:
            java.lang.String r3 = ""
            goto L_0x0078
        L_0x00a9:
            r0 = 0
            goto L_0x001e
        L_0x00ac:
            if (r20 != 0) goto L_0x00b9
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r5)
            r0 = 2131624969(0x7f0e0409, float:1.8877133E38)
            android.view.View r2 = r1.inflate(r0, r5, r6)
        L_0x00b9:
            r0 = 2131436514(0x7f0b23e2, float:1.84949E38)
            android.widget.TextView r0 = X.AnonymousClass3Ma.A0E(r2, r0)
            r0.setText(r3)
            r0.setFocusable(r4)
            X.C18070vi.A0b(r2)
            return r2
        L_0x00ca:
            X.206 r9 = r7.getItem(r12)
            if (r9 != 0) goto L_0x00e2
            java.lang.String r0 = "Conversation/isMessageValid message was null, already deleted?"
        L_0x00d2:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.view.View r2 = X.C72453Mb.A0R(r5)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r6, r6)
            r2.setLayoutParams(r0)
            return r2
        L_0x00e2:
            int r1 = r9.A0u
            r0 = 36
            if (r1 != r0) goto L_0x00f1
            boolean r0 = X.C22971Dz.A0f(r9)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = "Conversation/isMessageValid message was malicious."
            goto L_0x00d2
        L_0x00f1:
            boolean r0 = r9 instanceof X.AnonymousClass2MN
            if (r0 == 0) goto L_0x0100
            r3 = r9
            X.2MN r3 = (X.AnonymousClass2MN) r3
            com.whatsapp.jid.UserJid r0 = r3.A01
            if (r0 == 0) goto L_0x02df
            com.whatsapp.jid.UserJid r0 = r3.A00
            if (r0 == 0) goto L_0x02df
        L_0x0100:
            X.C17960vV.A07(r9)
            java.lang.Integer r11 = r7.A08(r9, r12)
            boolean r0 = r2 instanceof X.AnonymousClass3uP
            if (r0 == 0) goto L_0x0126
            X.0ve r3 = r7.A0d
            r5 = r2
            X.3uP r5 = (X.AnonymousClass3uP) r5
            X.206 r0 = r5.getFMessage()
            int r0 = r0.A0u
            if (r0 != r1) goto L_0x0126
            boolean r0 = r9 instanceof X.AnonymousClass23U
            if (r0 == 0) goto L_0x01ba
            boolean r1 = X.C79103uS.A1I(r5)
            X.205 r0 = r9.A0v
            boolean r0 = r0.A02
            if (r1 == r0) goto L_0x01ba
        L_0x0126:
            boolean r0 = r2 instanceof X.C79033uC
            if (r0 == 0) goto L_0x0139
            r1 = r2
            X.3uC r1 = (X.C79033uC) r1
            com.whatsapp.conversation.carousel.CarouselView r0 = r1.A01
            if (r0 == 0) goto L_0x0139
            r1.removeView(r0)
            r0 = 0
            r1.A01 = r0
            r1.A02 = r0
        L_0x0139:
            X.4a2 r1 = r7.A0Z
            X.5cR r0 = r7.A0a
            X.3uP r5 = r1.A06(r0, r9, r11)
        L_0x0141:
            X.1XU r1 = r5.A0J
            if (r1 != 0) goto L_0x014d
            r0 = 4
            X.3SS r1 = new X.3SS
            r1.<init>(r5, r0)
            r5.A0J = r1
        L_0x014d:
            X.AnonymousClass1HF.A0f(r5, r1)
            X.0ve r1 = r5.A0F
            r0 = 3419(0xd5b, float:4.791E-42)
            r1.A0N(r0)
            boolean r0 = r5 instanceof X.AnonymousClass3u9
            if (r0 == 0) goto L_0x02e3
            boolean r0 = r5 instanceof X.AnonymousClass3u5
            if (r0 != 0) goto L_0x02e3
            r15 = r5
            X.3u9 r15 = (X.AnonymousClass3u9) r15
            int r14 = r15.getMaxAlbumSize()
            int r0 = r15.getMinAlbumSize()
            java.util.ArrayList r13 = X.C17880vN.A0z(r0)
            r13.add(r9)
            boolean r10 = r7.A01(r5, r9)
            int r3 = r19 + 1
            r1 = r9
        L_0x0178:
            int r0 = r7.getCount()
            if (r3 >= r0) goto L_0x03cd
            int r0 = r13.size()
            if (r0 >= r14) goto L_0x03cd
            X.206 r2 = r7.getItem(r3)
            if (r2 == 0) goto L_0x03cd
            int r0 = r3 + -1
            boolean r0 = r7.A03(r2, r1, r3, r0)
            if (r0 == 0) goto L_0x03cd
            boolean r0 = r7.A02(r2)
            if (r0 == 0) goto L_0x03cd
            r13.add(r2)
            boolean r0 = r7.A01(r5, r2)
            r10 = r10 | r0
            java.util.HashSet r0 = r7.A0R
            X.205 r1 = r2.A0v
            r0.remove(r1)
            java.util.HashSet r0 = r7.A0T
            r0.remove(r1)
            java.util.HashSet r0 = r7.A0Q
            r0.remove(r1)
            java.util.HashSet r0 = r7.A0S
            r0.remove(r1)
            int r3 = r3 + 1
            r1 = r2
            goto L_0x0178
        L_0x01ba:
            boolean r0 = r9 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x01c8
            X.206 r0 = r5.getFMessage()
            boolean r0 = r0 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x01c8
            goto L_0x0126
        L_0x01c8:
            boolean r0 = r9 instanceof X.C438721g
            if (r0 != 0) goto L_0x0126
            boolean r0 = r9 instanceof X.C1770797c
            if (r0 == 0) goto L_0x01e3
            boolean r0 = r5 instanceof X.C78953tz
            if (r0 == 0) goto L_0x01e3
            r1 = r5
            X.3tz r1 = (X.C78953tz) r1
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0126
            X.1E7 r0 = r1.A03
            X.2lf r0 = r0.A0H
            if (r0 == 0) goto L_0x01e3
            goto L_0x0126
        L_0x01e3:
            boolean r0 = r5 instanceof X.C78963u0
            if (r0 == 0) goto L_0x01fa
            X.206 r0 = r5.A0I
            X.1BI r1 = X.AnonymousClass205.A00(r0)
            X.C18070vi.A0X(r1)
            X.1Nf r0 = r5.A0w
            X.1E7 r0 = r0.A01(r1)
            X.2lf r0 = r0.A0H
            if (r0 == 0) goto L_0x0126
        L_0x01fa:
            boolean r0 = r9 instanceof X.C441822l
            if (r0 == 0) goto L_0x0215
            X.206 r0 = r5.getFMessage()
            boolean r0 = r0 instanceof X.C441822l
            if (r0 == 0) goto L_0x0215
            X.206 r0 = r5.getFMessage()
            X.C18070vi.A0X(r0)
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r0)
            if (r0 == 0) goto L_0x0215
            goto L_0x0126
        L_0x0215:
            X.4Zd r1 = r7.A0M
            X.206 r10 = r5.getFMessage()
            X.C18070vi.A0X(r10)
            boolean r0 = r1.A03(r10)
            if (r0 == 0) goto L_0x0274
            boolean r0 = r1.A03(r9)
        L_0x0228:
            r0 = r0 ^ 1
        L_0x022a:
            if (r0 != 0) goto L_0x0126
            r1 = 7268(0x1c64, float:1.0185E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            X.36i r10 = X.AnonymousClass2UX.A00(r9)
            if (r0 == 0) goto L_0x0257
            X.206 r0 = r5.getFMessage()
            X.C18070vi.A0X(r0)
            X.36i r13 = X.AnonymousClass2UX.A00(r0)
            if (r10 == 0) goto L_0x029b
            if (r13 == 0) goto L_0x029b
            X.9Ij r1 = r10.A00
            X.9Ij r0 = r13.A00
            if (r1 != r0) goto L_0x0126
            X.9Ic r1 = r10.A01
            X.9Ic r0 = r13.A01
        L_0x0253:
            if (r1 == r0) goto L_0x029b
            goto L_0x0126
        L_0x0257:
            boolean r0 = r5 instanceof X.C78853tn
            if (r0 == 0) goto L_0x0265
            if (r10 == 0) goto L_0x0265
            X.9Ij r1 = r10.A00
            X.9Ij r0 = X.C179539Ij.REELS
            if (r1 == r0) goto L_0x0265
            goto L_0x0126
        L_0x0265:
            boolean r0 = r5 instanceof X.C78863to
            if (r0 != 0) goto L_0x026d
            boolean r0 = r5 instanceof X.C78873tp
            if (r0 == 0) goto L_0x029b
        L_0x026d:
            if (r10 == 0) goto L_0x029b
            X.9Ij r1 = r10.A00
            X.9Ij r0 = X.C179539Ij.SEARCH
            goto L_0x0253
        L_0x0274:
            boolean r0 = r1.A02(r10)
            if (r0 == 0) goto L_0x027f
            boolean r0 = r1.A02(r9)
            goto L_0x0228
        L_0x027f:
            boolean r0 = r1.A04(r10)
            if (r0 == 0) goto L_0x028a
            boolean r0 = r1.A04(r9)
            goto L_0x0228
        L_0x028a:
            boolean r0 = r1.A03(r9)
            if (r0 != 0) goto L_0x0126
            boolean r0 = r1.A02(r9)
            if (r0 != 0) goto L_0x0126
            boolean r0 = r1.A04(r9)
            goto L_0x022a
        L_0x029b:
            boolean r0 = r9 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x02c3
            boolean r0 = r5 instanceof X.AnonymousClass3uO
            if (r0 == 0) goto L_0x02b1
            X.1Oh r1 = r7.A0O
            java.lang.String r0 = r9.A0P()
            boolean r0 = X.C26180Cu0.A02(r3, r1, r0)
            if (r0 == 0) goto L_0x02b1
            goto L_0x0126
        L_0x02b1:
            boolean r0 = r5 instanceof X.C79063uI
            if (r0 == 0) goto L_0x02c3
            X.1Oh r1 = r7.A0O
            java.lang.String r0 = r9.A0P()
            boolean r0 = X.C26180Cu0.A02(r3, r1, r0)
            if (r0 != 0) goto L_0x02c3
            goto L_0x0126
        L_0x02c3:
            boolean r0 = r9 instanceof X.C443222z
            if (r0 != 0) goto L_0x0126
            boolean r0 = r5 instanceof X.C78903ts
            if (r0 != 0) goto L_0x0126
            java.lang.Class r1 = r9.getClass()
            X.206 r0 = r5.getFMessage()
            java.lang.Class r0 = r0.getClass()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0126
            goto L_0x0141
        L_0x02df:
            java.lang.String r0 = "Conversation/isMessageValid number change message missing JID(s)."
            goto L_0x00d2
        L_0x02e3:
            boolean r13 = r5 instanceof X.C78873tp
            if (r13 != 0) goto L_0x02ef
            boolean r0 = r5 instanceof X.C78853tn
            if (r0 != 0) goto L_0x02ef
            boolean r0 = r5 instanceof X.C78863to
            if (r0 == 0) goto L_0x03a3
        L_0x02ef:
            boolean r0 = r9 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x03a3
            X.2sj r14 = r7.A0b
            boolean r0 = r14.A01(r9)
            if (r0 != 0) goto L_0x03a3
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            boolean r10 = r7.A01(r5, r9)
            r17 = r9
            r2 = r9
            boolean r0 = X.C63232sj.A00(r14, r9)
            if (r0 == 0) goto L_0x0319
            X.36i r0 = X.AnonymousClass2UX.A00(r9)
            if (r0 == 0) goto L_0x0319
            X.9Ij r0 = r0.A00
            if (r0 == 0) goto L_0x0319
            r3.add(r9)
        L_0x0319:
            int r15 = r19 + 1
        L_0x031b:
            int r0 = r7.getCount()
            if (r15 >= r0) goto L_0x0369
            int r1 = r3.size()
            r0 = 10
            if (r1 >= r0) goto L_0x0369
            X.206 r1 = r7.getItem(r15)
            if (r1 == 0) goto L_0x0369
            X.C17960vV.A07(r17)
            r0 = r17
            boolean r0 = r14.A03(r0, r1)
            if (r0 == 0) goto L_0x0369
            r17 = r1
            boolean r0 = X.C63232sj.A00(r14, r1)
            if (r0 == 0) goto L_0x0357
            X.36i r0 = X.AnonymousClass2UX.A00(r1)
            if (r0 == 0) goto L_0x0357
            X.9Ij r0 = r0.A00
            if (r0 == 0) goto L_0x0357
            r3.add(r1)
        L_0x034f:
            boolean r0 = r7.A01(r5, r1)
            r10 = r10 | r0
            int r15 = r15 + 1
            goto L_0x031b
        L_0x0357:
            boolean r0 = X.C63232sj.A00(r14, r1)
            if (r0 == 0) goto L_0x034f
            X.36i r0 = X.AnonymousClass2UX.A00(r1)
            if (r0 == 0) goto L_0x0367
            X.9Ij r0 = r0.A00
            if (r0 != 0) goto L_0x034f
        L_0x0367:
            r2 = r1
            goto L_0x034f
        L_0x0369:
            boolean r0 = r5 instanceof X.C78853tn
            if (r0 == 0) goto L_0x0379
            r0 = r5
            X.3su r0 = (X.C78503su) r0
            X.C17960vV.A07(r2)
            X.210 r2 = (X.AnonymousClass210) r2
            r0.A2w(r2, r3, r10)
            goto L_0x03d0
        L_0x0379:
            boolean r0 = r5 instanceof X.C78863to
            if (r0 == 0) goto L_0x039a
            r1 = r5
            X.3to r1 = (X.C78863to) r1
            X.C17960vV.A07(r2)
            X.210 r2 = (X.AnonymousClass210) r2
            X.C18070vi.A0d(r2, r6)
            X.00H r0 = r1.A1k
            X.1UD r0 = X.AnonymousClass3MW.A0X(r0)
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0396
            r1.A02 = r3
        L_0x0396:
            r1.A2w(r2, r3, r10)
            goto L_0x03d0
        L_0x039a:
            if (r13 == 0) goto L_0x03d0
            r0 = r5
            X.3tp r0 = (X.C78873tp) r0
            r0.setBotPluginMessages(r3)
            goto L_0x03d0
        L_0x03a3:
            boolean r0 = r5 instanceof X.C78933tx
            if (r0 == 0) goto L_0x03b6
            r1 = r5
            X.3tx r1 = (X.C78933tx) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            boolean r0 = X.AnonymousClass000.A1Z(r11, r0)
            r1.A00 = r0
            r5.A2V(r9, r6)
            goto L_0x03d0
        L_0x03b6:
            if (r20 != 0) goto L_0x03bc
            boolean r0 = r5.A2b
            if (r0 == 0) goto L_0x03d0
        L_0x03bc:
            boolean r0 = r7.A01(r5, r9)
            r5.A2V(r9, r0)
            java.util.HashSet r1 = r7.A0R
            X.205 r0 = r9.A0v
            r1.remove(r0)
            r5.A2b = r6
            goto L_0x03d0
        L_0x03cd:
            r15.A2k(r13, r10)
        L_0x03d0:
            int r0 = r7.A01
            r5.A03 = r0
            java.util.HashSet r1 = r7.A0T
            X.205 r10 = r9.A0v
            boolean r0 = r1.contains(r10)
            if (r0 == 0) goto L_0x03f8
            r1.remove(r10)
            X.01E r0 = r7.A0W
            X.1Fv r0 = r0.getLifecycle()
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r1 = r0.A02
            X.1Fx r0 = X.C23401Fx.RESUMED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x03f8
            boolean r0 = r9.A0q
            r5.A25(r6, r0)
        L_0x03f8:
            java.util.HashSet r1 = r7.A0Q
            boolean r0 = r1.contains(r10)
            if (r0 == 0) goto L_0x0424
            r1.remove(r10)
            X.01E r0 = r7.A0W
            X.1Fv r0 = r0.getLifecycle()
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r1 = r0.A02
            X.1Fx r0 = X.C23401Fx.RESUMED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0424
            boolean r0 = r5 instanceof X.C79073uJ
            if (r0 != 0) goto L_0x0424
            int r0 = r9.A0C()
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r5.A25(r4, r0)
        L_0x0424:
            java.util.HashSet r1 = r7.A0S
            boolean r0 = r1.contains(r10)
            if (r0 == 0) goto L_0x0450
            r1.remove(r10)
            X.01E r0 = r7.A0W
            X.1Fv r0 = r0.getLifecycle()
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r1 = r0.A02
            X.1Fx r0 = X.C23401Fx.RESUMED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0450
            boolean r0 = r5 instanceof X.C79073uJ
            if (r0 != 0) goto L_0x0450
            int r0 = X.C63892tr.A00(r9)
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            r5.A25(r8, r0)
        L_0x0450:
            X.205 r0 = r7.A0B
            r14 = 0
            if (r0 == 0) goto L_0x0460
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0460
            r7.A0B = r14
            r5.A20()
        L_0x0460:
            boolean r0 = r5 instanceof X.C23819BqW
            if (r0 == 0) goto L_0x046c
            r1 = r5
            X.BqW r1 = (X.C23819BqW) r1
            X.CmF r0 = r7.A0C
            r1.setSharedTranscriptionState(r0)
        L_0x046c:
            java.util.Set r3 = r7.A0V
            java.util.Iterator r1 = r3.iterator()
        L_0x0472:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0493
            java.lang.Object r2 = r1.next()
            X.205 r2 = (X.AnonymousClass205) r2
            boolean r0 = r5.A2h(r2)
            if (r0 == 0) goto L_0x0472
            r3.remove(r2)
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            X.4eN r0 = new X.4eN
            r0.<init>(r5, r2, r4)
            r1.addOnPreDrawListener(r0)
        L_0x0493:
            java.lang.Integer r13 = X.AnonymousClass00R.A00
            if (r11 == r13) goto L_0x049b
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r11 != r0) goto L_0x05ad
        L_0x049b:
            if (r19 == 0) goto L_0x05aa
            int r0 = r19 + -1
            X.206 r14 = r7.getItem(r0)
            if (r14 == 0) goto L_0x05aa
            X.206 r0 = r7.A0I
            if (r14 != r0) goto L_0x04b3
            if (r12 <= r4) goto L_0x04b3
            int r0 = r19 + -2
            X.206 r0 = r7.getItem(r0)
            if (r0 != 0) goto L_0x04b4
        L_0x04b3:
            r0 = r14
        L_0x04b4:
            long r2 = r0.A0I
            long r0 = r9.A0I
            boolean r1 = X.A87.A04(r2, r0)
            r0 = r1 ^ 1
            r5.A2W(r0)
        L_0x04c1:
            r15 = -1
            if (r11 != r13) goto L_0x05a6
            X.5cR r0 = r7.A0a
            X.5c7 r11 = r0.getConversationRowCustomizer()
            X.C18070vi.A0X(r11)
            boolean r0 = r11.CLi()
            if (r0 != 0) goto L_0x05a2
            r13 = 6
            if (r1 == 0) goto L_0x059d
            if (r14 == 0) goto L_0x059d
            X.205 r0 = r14.A0v
            boolean r0 = r0.A02
            boolean r1 = r10.A02
            if (r0 != r1) goto L_0x059d
            X.0ve r2 = r7.A0d
            X.1Oh r0 = r7.A0O
            X.4Ci r2 = X.C79093uR.A19(r11, r2, r0, r14)
            X.4Ci r0 = X.C82854Ci.NONE
            if (r2 == r0) goto L_0x059d
            int r0 = r9.A0D()
            if (r0 == r13) goto L_0x059d
            int r0 = r14.A0D()
            if (r0 == r13) goto L_0x059d
            if (r1 != 0) goto L_0x050a
            X.1BI r1 = r9.A0H()
            if (r1 == 0) goto L_0x050a
            X.1BI r0 = r14.A0H()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x059d
        L_0x050a:
            r14 = 1
        L_0x050b:
            int r0 = r19 + 1
            X.206 r12 = r7.getItem(r0)
            if (r12 == 0) goto L_0x0550
            long r2 = r12.A0I
            long r0 = r9.A0I
            boolean r0 = X.A87.A04(r2, r0)
            if (r0 == 0) goto L_0x0550
            X.205 r0 = r12.A0v
            boolean r0 = r0.A02
            boolean r2 = r10.A02
            if (r0 != r2) goto L_0x0550
            X.0ve r1 = r7.A0d
            X.1Oh r0 = r7.A0O
            X.4Ci r1 = X.C79093uR.A19(r11, r1, r0, r12)
            X.4Ci r0 = X.C82854Ci.NONE
            if (r1 == r0) goto L_0x0550
            int r0 = r9.A0D()
            if (r0 == r13) goto L_0x0550
            int r0 = r12.A0D()
            if (r0 == r13) goto L_0x0550
            if (r2 != 0) goto L_0x054f
            X.1BI r1 = r9.A0H()
            if (r1 == 0) goto L_0x054f
            X.1BI r0 = r12.A0H()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0550
        L_0x054f:
            r6 = 1
        L_0x0550:
            if (r14 == 0) goto L_0x0554
            if (r6 != 0) goto L_0x0599
        L_0x0554:
            X.0ve r1 = r7.A0d
            X.1Oh r0 = r7.A0O
            X.4Ci r1 = X.C79093uR.A19(r11, r1, r0, r9)
            X.4Ci r0 = X.C82854Ci.NONE
            if (r1 == r0) goto L_0x0599
            if (r14 == 0) goto L_0x05a0
            r0 = 3
            r5.A23(r0)
        L_0x0566:
            X.4NU r2 = r7.A0A
            if (r2 == 0) goto L_0x0598
            boolean r0 = r7.A0F
            if (r0 != 0) goto L_0x0587
            X.1HB r0 = r7.A09
            if (r0 == 0) goto L_0x0587
            X.C17960vV.A02()
            boolean r0 = r2.A00
            if (r0 != r4) goto L_0x0587
            X.1HB r0 = r7.A09
            X.C17960vV.A07(r0)
            X.19a r1 = r0.A01
            r0 = r16
            r1.A06(r0)
            r7.A0F = r4
        L_0x0587:
            X.C17960vV.A02()
            X.C17960vV.A02()
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0598
            X.1Gu r1 = r2.A01
            X.1u6 r0 = r5.A1L
            r0.A02(r1)
        L_0x0598:
            return r5
        L_0x0599:
            r5.A23(r8)
            goto L_0x0566
        L_0x059d:
            r14 = 0
            goto L_0x050b
        L_0x05a0:
            if (r6 == 0) goto L_0x05a6
        L_0x05a2:
            r5.A23(r4)
            goto L_0x0566
        L_0x05a6:
            r5.A23(r15)
            goto L_0x0566
        L_0x05aa:
            r5.A2W(r4)
        L_0x05ad:
            r1 = 0
            goto L_0x04c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73103Oz.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return (AnonymousClass000.A1R(this.A04) ? 1 : 0) + true;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw AnonymousClass000.A0n("should not be called, getView is defined");
    }

    public void onContentChanged() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r1.A03(r10, r0) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c6, code lost:
        if (A02(r1) != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cc, code lost:
        if ((r5 % 2) == 1) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00dc, code lost:
        if (r5 == 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e6, code lost:
        return X.AnonymousClass00R.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A08(X.AnonymousClass206 r10, int r11) {
        /*
            r9 = this;
            boolean r0 = r9.A02(r10)
            if (r0 == 0) goto L_0x00c8
            X.4Xe r0 = r9.A0K
            java.lang.Integer r0 = r0.A01(r10)
            int r1 = r0.intValue()
            r6 = 4
            r0 = 0
            r8 = 3
            r7 = 2
            r5 = 0
            r4 = 1
            if (r1 == r4) goto L_0x0068
            if (r1 == r8) goto L_0x0047
            if (r1 == r7) goto L_0x0023
            if (r1 == r0) goto L_0x00c8
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0023:
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x00c8
            int r3 = r11 + -1
            r2 = r10
        L_0x002a:
            r0 = -1
            if (r0 >= r3) goto L_0x00b0
            X.206 r1 = r9.getItem(r3)
            if (r1 == 0) goto L_0x00b0
            int r0 = r3 + 1
            boolean r0 = r9.A03(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x00b0
            boolean r0 = r9.A02(r1)
            if (r0 == 0) goto L_0x00b0
            int r5 = r5 + 1
            int r3 = r3 + -1
            r2 = r1
            goto L_0x002a
        L_0x0047:
            if (r11 == 0) goto L_0x00e1
            int r0 = r11 + -1
            X.206 r0 = r9.getItem(r0)
            if (r0 == 0) goto L_0x00e1
            X.2sj r1 = r9.A0b
            boolean r0 = r1.A03(r0, r10)
            if (r0 == 0) goto L_0x00e1
            int r0 = r11 + 1
            X.206 r0 = r9.getItem(r0)
            if (r0 == 0) goto L_0x00de
            boolean r0 = r1.A03(r10, r0)
            if (r0 != 0) goto L_0x00e4
            goto L_0x00de
        L_0x0068:
            int r3 = r11 + -1
            r2 = r10
            r4 = 0
        L_0x006c:
            if (r3 < 0) goto L_0x008a
            if (r4 >= r8) goto L_0x008a
            X.206 r1 = r9.getItem(r3)
            if (r1 == 0) goto L_0x008a
            int r0 = r3 + 1
            boolean r0 = r9.A03(r1, r2, r3, r0)
            if (r0 == 0) goto L_0x008a
            boolean r0 = r9.A02(r1)
            if (r0 == 0) goto L_0x008a
            int r4 = r4 + 1
            int r3 = r3 + -1
            r2 = r1
            goto L_0x006c
        L_0x008a:
            int r3 = r11 + 1
        L_0x008c:
            int r0 = r9.getCount()
            r2 = 102(0x66, float:1.43E-43)
            if (r3 >= r0) goto L_0x00cf
            if (r5 >= r2) goto L_0x00cf
            X.206 r1 = r9.getItem(r3)
            if (r1 == 0) goto L_0x00cf
            int r0 = r3 + -1
            boolean r0 = r9.A03(r1, r10, r3, r0)
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r9.A02(r1)
            if (r0 == 0) goto L_0x00cf
            int r5 = r5 + 1
            int r3 = r3 + 1
            r10 = r1
            goto L_0x008c
        L_0x00b0:
            int r0 = r5 % 2
            if (r0 != 0) goto L_0x00cb
            int r0 = r11 + 1
            X.206 r1 = r9.getItem(r0)
            if (r1 == 0) goto L_0x00c8
            boolean r0 = r9.A03(r1, r10, r0, r11)
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r9.A02(r1)
            if (r0 != 0) goto L_0x00e1
        L_0x00c8:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        L_0x00cb:
            int r5 = r5 % r7
            if (r5 != r4) goto L_0x00e4
            goto L_0x00de
        L_0x00cf:
            int r0 = r4 + 1
            int r0 = r0 + r5
            if (r0 < r6) goto L_0x00c8
            if (r5 >= r2) goto L_0x00c8
            r0 = 101(0x65, float:1.42E-43)
            if (r5 == r0) goto L_0x00e1
            if (r4 == 0) goto L_0x00e1
            if (r5 != 0) goto L_0x00e4
        L_0x00de:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            return r0
        L_0x00e1:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            return r0
        L_0x00e4:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73103Oz.A08(X.206, int):java.lang.Integer");
    }

    public Cursor getCursor() {
        Cursor cursor = super.getCursor();
        if (cursor == null || !cursor.isClosed()) {
            return cursor;
        }
        return null;
    }

    public long getItemId(int i) {
        long j;
        AnonymousClass206 A072 = getItem(i);
        if (A072 == null) {
            return 0;
        }
        if (A072.A0x == 0) {
            j = (long) A072.A0v.hashCode();
        } else {
            j = A072.A0x;
        }
        return (j & 4294967295L) | (((long) A072.A0u) << 32);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.A0E = false;
    }
}
