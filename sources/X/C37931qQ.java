package X;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1qQ  reason: invalid class name and case insensitive filesystem */
public final class C37931qQ {
    public int A00;
    public int A01;
    public C38441rI A02;
    public AnonymousClass2RY A03;
    public ArrayList A04 = null;
    public final ArrayList A05;
    public final ArrayList A06 = new ArrayList();
    public final List A07;
    public final /* synthetic */ RecyclerView A08;

    /* JADX WARNING: type inference failed for: r0v123, types: [X.2iU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01db, code lost:
        if (r5.A08 == false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0247, code lost:
        r4.A04 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x028e, code lost:
        if (r10 != r4.A01) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0290, code lost:
        r11.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02cc, code lost:
        if (r4.A07 != r10.A0M(r4.A04)) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02d0, code lost:
        A06(r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x031c A[EDGE_INSN: B:262:0x031c->B:197:0x031c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42011xT A03(int r25, long r26) {
        /*
            r24 = this;
            r9 = 0
            r7 = r24
            r8 = r25
            if (r25 < 0) goto L_0x0411
            androidx.recyclerview.widget.RecyclerView r6 = r7.A08
            X.1qZ r5 = r6.A0w
            int r0 = r5.A00()
            if (r8 >= r0) goto L_0x0411
            boolean r0 = r5.A08
            r15 = 0
            r17 = 1
            r22 = r26
            if (r0 == 0) goto L_0x0107
            java.util.ArrayList r11 = r7.A04
            if (r11 == 0) goto L_0x0107
            int r10 = r11.size()
            if (r10 == 0) goto L_0x0107
            r3 = 0
            r2 = 0
        L_0x0026:
            if (r2 >= r10) goto L_0x00d2
            java.lang.Object r4 = r11.get(r2)
            X.1xT r4 = (X.C42011xT) r4
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x00ce
            int r1 = r4.A05
            r0 = -1
            if (r1 != r0) goto L_0x003b
            int r1 = r4.A04
        L_0x003b:
            if (r1 != r8) goto L_0x00ce
        L_0x003d:
            r1 = 32
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
        L_0x0044:
            r16 = 1
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0075
            r0 = 8192(0x2000, float:1.14794E-41)
            int r2 = r4.A00
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0075
            r0 = -8193(0xffffffffffffdfff, float:NaN)
            r2 = r2 & r0
            r4.A00 = r2
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0075
            r1 = r2 & 14
            r0 = r2 & 4
            if (r0 != 0) goto L_0x0067
            r0 = r1 & 4
            if (r0 != 0) goto L_0x0067
            r4.A05()
        L_0x0067:
            r4.A06()
            X.2iU r0 = new X.2iU
            r0.<init>()
            r0.A00(r4)
            r6.A0q(r0, r4)
        L_0x0075:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x00af
            int r0 = r4.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00af
            r4.A05 = r8
        L_0x0081:
            r3 = 0
        L_0x0082:
            android.view.View r2 = r4.A0H
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 != 0) goto L_0x00a1
            android.view.ViewGroup$LayoutParams r1 = r6.generateDefaultLayoutParams()
        L_0x008e:
            X.1rN r1 = (X.C38491rN) r1
            r2.setLayoutParams(r1)
        L_0x0093:
            r1.A00 = r4
            if (r16 == 0) goto L_0x009e
            if (r3 == 0) goto L_0x009e
        L_0x0099:
            r0 = r17
            r1.A02 = r0
            return r4
        L_0x009e:
            r17 = 0
            goto L_0x0099
        L_0x00a1:
            boolean r0 = r6.checkLayoutParams(r1)
            if (r0 != 0) goto L_0x00ac
            android.view.ViewGroup$LayoutParams r1 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            goto L_0x008e
        L_0x00ac:
            X.1rN r1 = (X.C38491rN) r1
            goto L_0x0093
        L_0x00af:
            int r1 = r4.A00
            r0 = r1 & 1
            if (r0 == 0) goto L_0x00bd
            r0 = r1 & 2
            if (r0 != 0) goto L_0x00bd
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0081
        L_0x00bd:
            X.1qi r0 = r6.A07
            int r20 = r0.A04(r8, r9)
            r18 = r7
            r19 = r4
            r21 = r8
            boolean r3 = A00(r18, r19, r20, r21, r22)
            goto L_0x0082
        L_0x00ce:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x00d2:
            X.1rD r2 = r6.A0B
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0107
            X.1qi r0 = r6.A07
            int r1 = r0.A04(r8, r9)
            if (r1 <= 0) goto L_0x0107
            int r0 = r2.A0Q()
            if (r1 >= r0) goto L_0x0107
            X.1rD r0 = r6.A0B
            long r11 = r0.A0M(r1)
        L_0x00ec:
            if (r3 >= r10) goto L_0x0107
            java.util.ArrayList r0 = r7.A04
            java.lang.Object r4 = r0.get(r3)
            X.1xT r4 = (X.C42011xT) r4
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0104
            long r0 = r4.A07
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0104
            goto L_0x003d
        L_0x0104:
            int r3 = r3 + 1
            goto L_0x00ec
        L_0x0107:
            r16 = 0
            java.util.ArrayList r2 = r7.A05
            int r3 = r2.size()
            r12 = 0
            r1 = 0
        L_0x0111:
            if (r1 >= r3) goto L_0x013b
            java.lang.Object r4 = r2.get(r1)
            X.1xT r4 = (X.C42011xT) r4
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0138
            int r10 = r4.A05
            r0 = -1
            if (r10 != r0) goto L_0x0126
            int r10 = r4.A04
        L_0x0126:
            if (r10 != r8) goto L_0x0138
            int r0 = r4.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0138
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x01cc
            int r0 = r4.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x01cc
        L_0x0138:
            int r1 = r1 + 1
            goto L_0x0111
        L_0x013b:
            X.1qm r11 = r6.A08
            java.util.List r14 = r11.A02
            int r13 = r14.size()
            r4 = 0
        L_0x0144:
            if (r4 >= r13) goto L_0x0198
            java.lang.Object r10 = r14.get(r4)
            android.view.View r10 = (android.view.View) r10
            X.1xT r3 = androidx.recyclerview.widget.RecyclerView.A02(r10)
            int r1 = r3.A05
            r0 = -1
            if (r1 != r0) goto L_0x0157
            int r1 = r3.A04
        L_0x0157:
            if (r1 != r8) goto L_0x0195
            int r0 = r3.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x0195
            int r0 = r3.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0195
            if (r10 == 0) goto L_0x0198
            X.1xT r4 = androidx.recyclerview.widget.RecyclerView.A02(r10)
            X.1qk r0 = r11.A01
            X.1ql r0 = (X.C38141ql) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            int r3 = r0.indexOfChild(r10)
            if (r3 < 0) goto L_0x03a9
            X.1qn r1 = r11.A00
            boolean r0 = r1.A06(r3)
            if (r0 == 0) goto L_0x0391
            r1.A03(r3)
            X.C38151qm.A02(r10, r11)
            int r1 = r11.A05(r10)
            r0 = -1
            if (r1 == r0) goto L_0x0373
            r11.A08(r1)
            r7.A08(r10)
            r1 = 8224(0x2020, float:1.1524E-41)
            goto L_0x01ce
        L_0x0195:
            int r4 = r4 + 1
            goto L_0x0144
        L_0x0198:
            java.util.ArrayList r10 = r7.A06
            int r3 = r10.size()
        L_0x019e:
            if (r12 >= r3) goto L_0x01f4
            java.lang.Object r4 = r10.get(r12)
            X.1xT r4 = (X.C42011xT) r4
            int r0 = r4.A00
            r0 = r0 & 4
            if (r0 != 0) goto L_0x01c5
            int r1 = r4.A05
            r0 = -1
            if (r1 != r0) goto L_0x01b3
            int r1 = r4.A04
        L_0x01b3:
            if (r1 != r8) goto L_0x01c5
            android.view.View r1 = r4.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x01c8
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            if (r1 == r0) goto L_0x01c8
        L_0x01c5:
            int r12 = r12 + 1
            goto L_0x019e
        L_0x01c8:
            r10.remove(r12)
            goto L_0x01d3
        L_0x01cc:
            r1 = 32
        L_0x01ce:
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
        L_0x01d3:
            int r0 = r4.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x029e
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0044
        L_0x01dd:
            r1 = 4
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
            X.1qQ r0 = r4.A08
            if (r0 == 0) goto L_0x0294
            android.view.View r0 = r4.A0H
            r6.removeDetachedView(r0, r9)
            X.1qQ r0 = r4.A08
            r0.A0A(r4)
        L_0x01f1:
            r7.A09(r4)
        L_0x01f4:
            X.1qi r0 = r6.A07
            int r3 = r0.A04(r8, r9)
            if (r3 < 0) goto L_0x03c1
            X.1rD r0 = r6.A0B
            int r0 = r0.A0Q()
            if (r3 >= r0) goto L_0x03c1
            X.1rD r0 = r6.A0B
            int r10 = r0.getItemViewType(r3)
            X.1rD r1 = r6.A0B
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x02d3
            long r13 = r1.A0M(r3)
            int r11 = r2.size()
        L_0x0218:
            int r11 = r11 + -1
            if (r11 < 0) goto L_0x0265
            java.lang.Object r4 = r2.get(r11)
            X.1xT r4 = (X.C42011xT) r4
            long r0 = r4.A07
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x0218
            int r0 = r4.A00
            r0 = r0 & 32
            if (r0 != 0) goto L_0x0218
            int r0 = r4.A01
            if (r10 != r0) goto L_0x024b
            r1 = 32
            int r0 = r4.A00
            r1 = r1 | r0
            r4.A00 = r1
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0247
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0247
            r1 = r1 & -15
            r0 = 2
            r0 = r0 | r1
            r4.A00 = r0
        L_0x0247:
            r4.A04 = r3
            goto L_0x0044
        L_0x024b:
            r2.remove(r11)
            android.view.View r0 = r4.A0H
            r6.removeDetachedView(r0, r9)
            X.1xT r1 = androidx.recyclerview.widget.RecyclerView.A02(r0)
            r1.A08 = r15
            r1.A0F = r9
            int r0 = r1.A00
            r0 = r0 & -33
            r1.A00 = r0
            r7.A09(r1)
            goto L_0x0218
        L_0x0265:
            java.util.ArrayList r11 = r7.A06
            int r2 = r11.size()
        L_0x026b:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x02d3
            java.lang.Object r4 = r11.get(r2)
            X.1xT r4 = (X.C42011xT) r4
            long r0 = r4.A07
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x026b
            android.view.View r1 = r4.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x028c
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            if (r1 == r0) goto L_0x028c
            goto L_0x026b
        L_0x028c:
            int r0 = r4.A01
            if (r10 != r0) goto L_0x02d0
            r11.remove(r2)
            goto L_0x0247
        L_0x0294:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x01f1
            r0 = r1 & -33
            r4.A00 = r0
            goto L_0x01f1
        L_0x029e:
            int r1 = r4.A04
            if (r1 < 0) goto L_0x03f3
            X.1rD r0 = r6.A0B
            int r0 = r0.A0Q()
            if (r1 >= r0) goto L_0x03f3
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x02bc
            X.1rD r1 = r6.A0B
            int r0 = r4.A04
            int r1 = r1.getItemViewType(r0)
            int r0 = r4.A01
            if (r1 == r0) goto L_0x02bc
            goto L_0x01dd
        L_0x02bc:
            X.1rD r10 = r6.A0B
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x0044
            long r0 = r4.A07
            int r3 = r4.A04
            long r10 = r10.A0M(r3)
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x01dd
            goto L_0x0044
        L_0x02d0:
            r7.A06(r2)
        L_0x02d3:
            X.1rI r0 = r7.A02
            if (r0 != 0) goto L_0x02de
            X.1rI r0 = new X.1rI
            r0.<init>()
            r7.A02 = r0
        L_0x02de:
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r0 = r0.get(r10)
            X.1xS r0 = (X.C42001xS) r0
            if (r0 == 0) goto L_0x031c
            java.util.ArrayList r4 = r0.A03
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x031c
            int r3 = r4.size()
        L_0x02f4:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x031c
            java.lang.Object r2 = r4.get(r3)
            X.1xT r2 = (X.C42011xT) r2
            android.view.View r1 = r2.A0H
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x030f
            android.view.ViewParent r1 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r2.A0B
            if (r1 == r0) goto L_0x030f
            goto L_0x02f4
        L_0x030f:
            java.lang.Object r4 = r4.remove(r3)
            X.1xT r4 = (X.C42011xT) r4
            if (r4 == 0) goto L_0x031c
            r4.A07()
            goto L_0x0075
        L_0x031c:
            long r11 = java.lang.System.nanoTime()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x033e
            X.1rI r0 = r7.A02
            X.1xS r0 = X.C38441rI.A00(r0, r10)
            long r0 = r0.A02
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x033e
            long r2 = r11 + r0
            int r0 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r0 < 0) goto L_0x033e
            return r15
        L_0x033e:
            X.1rD r0 = r6.A0B
            X.1xT r4 = r0.A0F(r6, r10)
            android.view.View r0 = r4.A0H
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.A03(r0)
            if (r1 == 0) goto L_0x0353
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r4.A0C = r0
        L_0x0353:
            long r2 = java.lang.System.nanoTime()
            X.1rI r0 = r7.A02
            long r2 = r2 - r11
            X.1xS r12 = X.C38441rI.A00(r0, r10)
            long r0 = r12.A02
            r13 = 0
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x036f
            r13 = 4
            long r0 = r0 / r13
            r10 = 3
            long r0 = r0 * r10
            long r2 = r2 / r13
            long r0 = r0 + r2
            r2 = r0
        L_0x036f:
            r12.A02 = r2
            goto L_0x0075
        L_0x0373:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "layout index should not be -1 after unhiding a view:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r6.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0391:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "trying to unhide a view that was not hidden"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x03a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "view is not a child, cannot hide "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x03c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Inconsistency detected. Invalid item position "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "(offset:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ").state:"
            r1.append(r0)
            int r0 = r5.A00()
            r1.append(r0)
            java.lang.String r0 = r6.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x03f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Inconsistency detected. Invalid view holder adapter position"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r6.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0411:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Invalid item position "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "("
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "). Item count:"
            r2.append(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r7.A08
            X.1qZ r0 = r1.A0w
            int r0 = r0.A00()
            r2.append(r0)
            java.lang.String r0 = r1.A0R()
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37931qQ.A03(int, long):X.1xT");
    }

    public C37931qQ(RecyclerView recyclerView) {
        this.A08 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A00 = 2;
        this.A01 = 2;
    }

    public static boolean A00(C37931qQ r10, C42011xT r11, int i, int i2, long j) {
        RecyclerView recyclerView = r10.A08;
        r11.A0B = recyclerView;
        int i3 = r11.A01;
        long nanoTime = System.nanoTime();
        if (j != Long.MAX_VALUE) {
            long j2 = C38441rI.A00(r10.A02, i3).A01;
            if (j2 != 0 && nanoTime + j2 >= j) {
                return false;
            }
        }
        C38391rD r3 = recyclerView.A0B;
        r11.A04 = i;
        if (r3.A00) {
            r11.A07 = r3.A0M(i);
        }
        r11.A00 = (r11.A00 & -520) | 1;
        Method method = AnonymousClass1CH.A03;
        Trace.beginSection("RV OnBindView");
        r3.A0P(r11, r11.A06(), i);
        List list = r11.A0D;
        if (list != null) {
            list.clear();
        }
        r11.A00 &= -1025;
        View view = r11.A0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C38491rN) {
            ((C38491rN) layoutParams).A01 = true;
        }
        Trace.endSection();
        long nanoTime2 = System.nanoTime() - nanoTime;
        C42001xS A002 = C38441rI.A00(r10.A02, r11.A01);
        long j3 = A002.A01;
        if (j3 != 0) {
            nanoTime2 = ((j3 / 4) * 3) + (nanoTime2 / 4);
        }
        A002.A01 = nanoTime2;
        AccessibilityManager accessibilityManager = recyclerView.A0u;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            C38171qo r0 = recyclerView.A0I;
            if (r0 != null) {
                AnonymousClass1XU A1b = r0.A1b();
                if (A1b instanceof C38181qp) {
                    C38181qp r02 = (C38181qp) A1b;
                    AnonymousClass1XU A09 = AnonymousClass1HF.A09(view);
                    if (!(A09 == null || A09 == r02)) {
                        r02.A00.put(view, A09);
                    }
                }
                AnonymousClass1HF.A0f(view, A1b);
            }
        }
        if (!recyclerView.A0w.A08) {
            return true;
        }
        r11.A05 = i2;
        return true;
    }

    public int A01(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A08;
            C38021qZ r1 = recyclerView.A0w;
            if (i < r1.A00()) {
                if (r1.A08) {
                    return recyclerView.A07.A04(i, 0);
                }
                return i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        RecyclerView recyclerView2 = this.A08;
        sb.append(recyclerView2.A0w.A00());
        sb.append(recyclerView2.A0R());
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public void A04() {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            A06(size);
        }
        arrayList.clear();
        C38011qY r2 = this.A08.A09;
        int[] iArr = r2.A03;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        r2.A00 = 0;
    }

    public void A05() {
        int i;
        C38251qy r0 = this.A08.A0D;
        if (r0 != null) {
            i = r0.A02;
        } else {
            i = 0;
        }
        this.A01 = this.A00 + i;
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0 && arrayList.size() > this.A01) {
                A06(size);
            } else {
                return;
            }
        }
    }

    public void A06(int i) {
        ArrayList arrayList = this.A06;
        A0B((C42011xT) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r2.hasTransientState() == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.C42011xT r11) {
        /*
            r10 = this;
            X.1qQ r1 = r11.A08
            r0 = 0
            if (r1 == 0) goto L_0x0006
            r0 = 1
        L_0x0006:
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x00ea
            android.view.View r2 = r11.A0H
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto L_0x00ea
            int r1 = r11.A00
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.append(r0)
            r1.append(r11)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0038:
            boolean r0 = r11.A0A()
            if (r0 != 0) goto L_0x00cd
            r0 = r1 & 16
            if (r0 != 0) goto L_0x0049
            boolean r0 = r2.hasTransientState()
            r9 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r9 = 0
        L_0x004a:
            androidx.recyclerview.widget.RecyclerView r8 = r10.A08
            X.1rD r0 = r8.A0B
            if (r0 == 0) goto L_0x0088
            if (r9 == 0) goto L_0x0088
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x0088
        L_0x0058:
            int r2 = r10.A01
            if (r2 <= 0) goto L_0x00bb
            r1 = 526(0x20e, float:7.37E-43)
            int r0 = r11.A00
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00bb
            java.util.ArrayList r7 = r10.A06
            int r6 = r7.size()
            if (r6 < r2) goto L_0x0070
            r10.A06(r3)
            int r6 = r6 + -1
        L_0x0070:
            if (r6 <= 0) goto L_0x00b5
            X.1qY r5 = r8.A09
            int r4 = r11.A04
            int[] r3 = r5.A03
            if (r3 == 0) goto L_0x0095
            int r0 = r5.A00
            int r2 = r0 * 2
            r1 = 0
        L_0x007f:
            if (r1 >= r2) goto L_0x0095
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00b5
            int r1 = r1 + 2
            goto L_0x007f
        L_0x0088:
            int r0 = r11.A00
            r0 = r0 & 16
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r2.hasTransientState()
            if (r0 != 0) goto L_0x00b9
            goto L_0x0058
        L_0x0095:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00b3
            java.lang.Object r0 = r7.get(r6)
            X.1xT r0 = (X.C42011xT) r0
            int r4 = r0.A04
            int[] r3 = r5.A03
            if (r3 == 0) goto L_0x00b3
            int r0 = r5.A00
            int r2 = r0 * 2
            r1 = 0
        L_0x00aa:
            if (r1 >= r2) goto L_0x00b3
            r0 = r3[r1]
            if (r0 == r4) goto L_0x0095
            int r1 = r1 + 2
            goto L_0x00aa
        L_0x00b3:
            int r6 = r6 + 1
        L_0x00b5:
            r7.add(r6, r11)
            r3 = 1
        L_0x00b9:
            r4 = 0
            goto L_0x00be
        L_0x00bb:
            r10.A0B(r11, r4)
        L_0x00be:
            X.1qR r0 = r8.A0z
            r0.A04(r11)
            if (r3 != 0) goto L_0x00cc
            if (r4 != 0) goto L_0x00cc
            if (r9 == 0) goto L_0x00cc
            r0 = 0
            r11.A0B = r0
        L_0x00cc:
            return
        L_0x00cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0R()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Scrapped or attached views may not be recycled. isScrap:"
            r2.append(r0)
            X.1qQ r1 = r11.A08
            r0 = 0
            if (r1 == 0) goto L_0x00fa
            r0 = 1
        L_0x00fa:
            r2.append(r0)
            java.lang.String r0 = " isAttached:"
            r2.append(r0)
            android.view.View r0 = r11.A0H
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x010b
            r3 = 1
        L_0x010b:
            r2.append(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r10.A08
            java.lang.String r0 = r0.A0R()
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37931qQ.A09(X.1xT):void");
    }

    public void A0A(C42011xT r2) {
        ArrayList arrayList;
        if (r2.A0F) {
            arrayList = this.A04;
        } else {
            arrayList = this.A05;
        }
        arrayList.remove(r2);
        r2.A08 = null;
        r2.A0F = false;
        r2.A00 &= -33;
    }

    public void A07(View view) {
        C42011xT A022 = RecyclerView.A02(view);
        if ((A022.A00 & 256) != 0) {
            this.A08.removeDetachedView(view, false);
        }
        C37931qQ r0 = A022.A08;
        if (r0 != null) {
            r0.A0A(A022);
        } else {
            int i = A022.A00;
            if ((i & 32) != 0) {
                A022.A00 = i & -33;
            }
        }
        A09(A022);
        RecyclerView recyclerView = this.A08;
        if (recyclerView.A0C == null) {
            return;
        }
        if ((A022.A00 & 16) != 0 || A022.A0H.hasTransientState()) {
            recyclerView.A0C.A0E(A022);
        }
    }

    public void A08(View view) {
        ArrayList arrayList;
        C37961qT r1;
        C42011xT A022 = RecyclerView.A02(view);
        int i = A022.A00;
        if ((12 & i) != 0 || (i & 2) == 0 || (r1 = this.A08.A0C) == null || r1.A0G(A022, A022.A06())) {
            int i2 = A022.A00;
            if ((i2 & 4) != 0 && (i2 & 8) == 0) {
                RecyclerView recyclerView = this.A08;
                if (!recyclerView.A0B.A00) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                    sb.append(recyclerView.A0R());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            A022.A08 = this;
            A022.A0F = false;
            arrayList = this.A05;
        } else {
            arrayList = this.A04;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.A04 = arrayList;
            }
            A022.A08 = this;
            A022.A0F = true;
        }
        arrayList.add(A022);
    }

    public void A0B(C42011xT r6, boolean z) {
        AnonymousClass1XU r0;
        RecyclerView.A0D(r6);
        View view = r6.A0H;
        RecyclerView recyclerView = this.A08;
        C38171qo r02 = recyclerView.A0I;
        if (r02 != null) {
            AnonymousClass1XU A1b = r02.A1b();
            if (A1b instanceof C38181qp) {
                r0 = (AnonymousClass1XU) ((C38181qp) A1b).A00.remove(view);
            } else {
                r0 = null;
            }
            AnonymousClass1HF.A0f(view, r0);
        }
        if (z) {
            if (recyclerView.A0H != null && (r6 instanceof C168658jQ)) {
                ((C168658jQ) r6).A0E();
            }
            C38391rD r03 = recyclerView.A0B;
            if (r03 != null) {
                r03.A0R(r6);
            }
            if (recyclerView.A0w != null) {
                recyclerView.A0z.A04(r6);
            }
        }
        r6.A0B = null;
        C38441rI r3 = this.A02;
        if (r3 == null) {
            r3 = new C38441rI();
            this.A02 = r3;
        }
        int i = r6.A01;
        ArrayList arrayList = C38441rI.A00(r3, i).A03;
        if (((C42001xS) r3.A01.get(i)).A00 > arrayList.size()) {
            r6.A07();
            arrayList.add(r6);
        }
    }

    public View A02(int i) {
        return A03(i, Long.MAX_VALUE).A0H;
    }
}
