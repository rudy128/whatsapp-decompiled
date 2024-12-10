package X;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DFL implements AnonymousClass0sU {
    public static final E6A A0B = new DNJ(1);
    public int A00;
    public E9O A01;
    public CBw A02;
    public Set A03;
    public final int A04;
    public final int A05;
    public final SparseArray A06;
    public final C25063CVv A07;
    public final DFL A08;
    public final LinkedList A09;
    public final List A0A;

    public DFL A08() {
        int i = this.A04;
        List list = this.A0A;
        return new DFL(this.A01, this.A02, this, (DFL) null, list, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        if (A0B() != null) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C16930tS BDo(X.AnonymousClass0IV r14, int r15, int r16) {
        /*
            r13 = this;
            r8 = r14
            java.lang.ThreadLocal r0 = X.C24724CHl.A01     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0.get()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0Mc r0 = r14.A00()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            java.util.Map r0 = r0.A00     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r9 = r13
            java.lang.Object r3 = r0.get(r13)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r3 != 0) goto L_0x0014
            r3 = 0
        L_0x0014:
            boolean r0 = r3 instanceof X.C03260Hg     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r0 == 0) goto L_0x001b
            X.0Hg r3 = (X.C03260Hg) r3     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            r11 = r15
            r12 = r16
            if (r3 == 0) goto L_0x0061
            int r1 = r3.A01     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0tS r2 = r3.A02     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            int r0 = r2.getWidth()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            boolean r0 = A02(r1, r15, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r0 == 0) goto L_0x0061
            int r1 = r3.A00     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            int r0 = r2.getHeight()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            boolean r0 = A02(r1, r12, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r0 == 0) goto L_0x0061
            X.0J4 r0 = X.AnonymousClass0O7.A01     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            boolean r0 = r0.A02()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r0 == 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            java.lang.String r0 = "Bloks cacheTraversal: "
            r1.append(r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            int r0 = r13.A05     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.AnonymousClass0O7.A01(r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
        L_0x0055:
            r0 = 1
            X.DNV r1 = new X.DNV     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r1.<init>(r14, r13, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0 = 0
            X.C26081Crw.A00(r13, r1, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            goto L_0x0107
        L_0x0061:
            X.CfO r2 = X.C25416CfO.A00     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0J4 r0 = X.AnonymousClass0O7.A01     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            boolean r6 = r0.A02()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r6 == 0) goto L_0x0099
            java.lang.String r0 = r13.A0B()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            java.lang.String r1 = "Bloks Layout: "
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = X.C17900vP.A0A(r1, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.AnonymousClass0O7.A01(r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
        L_0x007a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            int r0 = r13.A05     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0J4 r0 = X.AnonymousClass0O7.A01     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0.A01(r1)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0Fc r1 = X.AnonymousClass0O7.A00     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.COH r0 = new X.COH     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0.<init>(r1, r2)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0 = 128(0x80, float:1.794E-43)
            r13.A0D(r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
        L_0x0099:
            java.lang.Object r5 = r14.A03     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.DOZ r5 = (X.DOZ) r5     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r5.getClass()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.Object r0 = A00(r13, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0sU r0 = (X.AnonymousClass0sU) r0     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r0 == 0) goto L_0x00c9
            X.0tS r2 = r0.BDo(r14, r15, r12)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            boolean r0 = r2 instanceof X.DFI     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r0 != 0) goto L_0x00c7
            X.0Qf r4 = r2.BY6()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r4 == 0) goto L_0x00c2
            long r0 = r4.A0C()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0C2 r3 = new X.0C2     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r3.<init>(r4, r0)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r4 = r3
        L_0x00c2:
            X.0Qf r10 = r13.A07(r4, r5)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            goto L_0x00e1
        L_0x00c7:
            r10 = 0
            goto L_0x00e1
        L_0x00c9:
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.Cwg r0 = r0.A08     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0Qf r0 = r0.A0C(r5, r13)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0Qf r10 = r13.A07(r0, r5)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.CqB r0 = X.C25995CqB.A00()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.Cwg r7 = r0.A08     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0tS r2 = r7.A0B(r8, r9, r10, r11, r12)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
        L_0x00e1:
            X.C25995CqB.A00()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            boolean r0 = r2 instanceof X.DFI     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r0 != 0) goto L_0x00ee
            X.DFI r0 = new X.DFI     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0.<init>(r2, r10)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r2 = r0
        L_0x00ee:
            X.0Hg r1 = new X.0Hg     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r1.<init>(r2, r15, r12)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            X.0Mc r0 = r14.A00()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            java.util.Map r0 = r0.A01     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            r0.put(r13, r1)     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r6 == 0) goto L_0x010a
            X.AnonymousClass0O7.A00()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            java.lang.String r0 = r13.A0B()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
            if (r0 == 0) goto L_0x010a
        L_0x0107:
            X.AnonymousClass0O7.A00()     // Catch:{ Da6 -> 0x016d, 0CY -> 0x0112, RuntimeException -> 0x010b }
        L_0x010a:
            return r2
        L_0x010b:
            r1 = move-exception
            X.Da6 r0 = new X.Da6
            r0.<init>(r1)
            throw r0
        L_0x0112:
            r5 = move-exception
            java.lang.Object r1 = r14.A03
            X.DOZ r1 = (X.DOZ) r1
            r1.getClass()
            long r3 = r5.id
            r0 = 2131428181(0x7f0b0355, float:1.8478E38)
            java.lang.Object r0 = r1.A01(r0)
            X.CVu r0 = (X.C25062CVu) r0
            int r7 = (int) r3
            java.lang.Object r6 = r0.A00
            monitor-enter(r6)
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x016a }
            java.util.Iterator r2 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x016a }
        L_0x012f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x014f
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r2)     // Catch:{ all -> 0x016a }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x016a }
            int r0 = X.BE6.A0F(r0)     // Catch:{ all -> 0x016a }
            if (r0 != r7) goto L_0x012f
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x016a }
            X.CYe r0 = (X.C25110CYe) r0     // Catch:{ all -> 0x016a }
            monitor-exit(r6)     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x0150
            java.lang.String r2 = r0.A02
            goto L_0x0152
        L_0x014f:
            monitor-exit(r6)     // Catch:{ all -> 0x016a }
        L_0x0150:
            java.lang.String r2 = ""
        L_0x0152:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Duplicate RenderUnit IDs - scope key: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", client ID: "
            java.lang.String r1 = X.C17890vO.A0a(r0, r1, r3)
            X.Da6 r0 = new X.Da6
            r0.<init>(r1, r5)
            throw r0
        L_0x016a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x016a }
            throw r0
        L_0x016d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFL.BDo(X.0IV, int, int):X.0tS");
    }

    public static Object A00(DFL dfl, int i) {
        C24724CHl.A01.get();
        Number number = (Number) C24724CHl.A02.get();
        if (number != null) {
            number.intValue();
        }
        return dfl.A06.get(i);
    }

    public float A03(int i, float f) {
        Object A012 = A01(Number.class, A00(this, i), Float.valueOf(f));
        C221718w.A00(A012);
        return AnonymousClass000.A04(A012);
    }

    public View A06(DOZ doz) {
        if (doz == null) {
            return null;
        }
        return ((CLY) doz.A02(A0B, this, 2131428151)).A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (A03(145, 0.0f) != 0.0f) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r6.A04 == X.AnonymousClass00R.A01) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C05050Qf A07(X.C05050Qf r6, X.DOZ r7) {
        /*
            r5 = this;
            r0 = 136(0x88, float:1.9E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A03(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 137(0x89, float:1.92E-43)
            float r0 = r5.A03(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 138(0x8a, float:1.93E-43)
            r1 = 0
            float r0 = r5.A03(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 141(0x8d, float:1.98E-43)
            float r0 = r5.A03(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 144(0x90, float:2.02E-43)
            float r0 = r5.A03(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            r0 = 145(0x91, float:2.03E-43)
            float r0 = r5.A03(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r4 = 0
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            r0 = 133(0x85, float:1.86E-43)
            java.util.List r3 = r5.A0G(r0)
            if (r4 != 0) goto L_0x0058
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0058
            if (r6 == 0) goto L_0x0057
            java.lang.Integer r1 = r6.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x00b0
        L_0x0057:
            return r6
        L_0x0058:
            if (r6 != 0) goto L_0x00b0
            int r0 = r5.A04
            long r1 = (long) r0
            boolean r0 = X.C26272CwJ.A07(r7)
            X.BV9 r6 = new X.BV9
            r6.<init>(r7, r1, r0)
        L_0x0066:
            r1 = 2131428151(0x7f0b0337, float:1.8477938E38)
            X.E6A r0 = A0B
            java.lang.Object r1 = r7.A02(r0, r5, r1)
            X.CLY r1 = (X.CLY) r1
            X.DFi r0 = new X.DFi
            r0.<init>(r1)
            X.BE7.A1A(r0, r6)
            if (r4 == 0) goto L_0x0087
            long r1 = r6.A0C()
            X.Bnr r0 = new X.Bnr
            r0.<init>(r7, r5, r1)
            X.BE7.A1A(r0, r6)
        L_0x0087:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.C26272CwJ.A08(r7)
            if (r0 == 0) goto L_0x00a1
            X.DFo r0 = new X.DFo
            r0.<init>(r7, r5)
            X.0Ij r1 = new X.0Ij
            r1.<init>(r0, r3)
        L_0x009d:
            r6.A0L(r1)
            return r6
        L_0x00a1:
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            X.DFn r0 = new X.DFn
            r0.<init>(r7, r5, r1)
            X.0Ij r1 = new X.0Ij
            r1.<init>(r0, r6)
            goto L_0x009d
        L_0x00b0:
            java.lang.Integer r1 = r6.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0066
            java.lang.String r0 = "Trying to apply View attributes to a Drawable Node is not yet supported"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFL.A07(X.0Qf, X.DOZ):X.0Qf");
    }

    public E8A A0A(int i) {
        Object obj = this.A06.get(i);
        if (obj == null) {
            return null;
        }
        return CC0.A00(this, obj, i);
    }

    public String A0B() {
        return (String) A01(String.class, A00(this, 158), (Object) null);
    }

    public String A0C() {
        Object A002 = A00(this, 33);
        if (A002 != null) {
            if (A002 instanceof String) {
                return (String) A002;
            }
            if (A002 instanceof Number) {
                return String.valueOf(C17880vN.A05(A002));
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unsupported value type: ");
            C17900vP.A0a(A002, A10);
            C25913CoX.A01("BloksModel", AnonymousClass000.A0y(" for Server Id Value", A10));
        }
        return null;
    }

    public List A0G(int i) {
        Object A012 = A01(List.class, A00(this, i), Collections.emptyList());
        C221718w.A00(A012);
        return (List) A012;
    }

    public void A0H(int i, Object obj) {
        this.A06.put(i, obj);
    }

    public DFL(List list, int i, int i2) {
        this.A07 = new C25063CVv(new DNN(this));
        this.A09 = null;
        this.A06 = new SparseArray(i2 + 1);
        this.A05 = i;
        this.A04 = CFq.A00.incrementAndGet();
        this.A0A = list;
        this.A08 = null;
        this.A01 = null;
        this.A02 = null;
        CIG.A04.incrementAndGet();
    }

    private final Object A01(Class cls, Object obj, Object obj2) {
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (obj != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unsupported value type: ");
            C17900vP.A0a(obj, A10);
            A10.append(" for expected type: ");
            A10.append(cls);
            A10.append(" on model with styleId: ");
            C25913CoX.A01("BloksModel", C17880vN.A0t(A10, this.A05));
        }
        return obj2;
    }

    public static boolean A02(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (i == i2) {
            return true;
        }
        if (mode2 == 0 && mode == 0) {
            return true;
        }
        if (mode == 1073741824 && size == i3) {
            return true;
        }
        if (mode2 != Integer.MIN_VALUE || mode != Integer.MIN_VALUE || size2 <= size || i3 > size) {
            return false;
        }
        return true;
    }

    public int A04(int i, int i2) {
        Object A002 = A00(this, i);
        if (A002 instanceof String) {
            try {
                return Integer.parseInt((String) A002);
            } catch (NumberFormatException unused) {
                C25913CoX.A01("BloksModel", "Non-int string parsed as int");
                return i2;
            }
        } else {
            Object A012 = A01(Number.class, A002, Integer.valueOf(i2));
            C221718w.A00(A012);
            return AnonymousClass000.A0M(A012);
        }
    }

    public long A05(int i, long j) {
        Object A002 = A00(this, i);
        if (A002 instanceof String) {
            try {
                return Long.parseLong((String) A002);
            } catch (NumberFormatException unused) {
                C25913CoX.A01("BloksModel", "Non-long string parsed as long");
                return j;
            }
        } else {
            Object A012 = A01(Number.class, A002, Long.valueOf(j));
            C221718w.A00(A012);
            return C17880vN.A05(A012);
        }
    }

    public DFL A09(int i) {
        Object A002 = A00(this, i);
        if (A002 instanceof List) {
            List A0F = A0F(i);
            if (!A0F.isEmpty()) {
                return (DFL) C108955ca.A0p(A0F);
            }
            return null;
        } else if (A002 instanceof DFL) {
            return (DFL) A002;
        } else {
            return null;
        }
    }

    public String A0D(int i) {
        return (String) A01(String.class, A00(this, i), (Object) null);
    }

    public List A0E() {
        return A0F(C25995CqB.A00().A08.A0A(this));
    }

    public List A0F(int i) {
        Object A002 = A00(this, i);
        if (A002 instanceof DFL) {
            ArrayList A0z = AnonymousClass8BT.A0z();
            A0z.add(A002);
            return A0z;
        }
        Object A012 = A01(List.class, A002, Collections.emptyList());
        C221718w.A00(A012);
        return (List) A012;
    }

    public boolean A0I(int i, boolean z) {
        Boolean A002 = CCG.A00(A00(this, i));
        if (A002 != null) {
            return A002.booleanValue();
        }
        return z;
    }

    public DFL(E9O e9o, CBw cBw, DFL dfl, DFL dfl2, List list, int i) {
        this.A07 = new C25063CVv(new DNN(this));
        this.A09 = dfl.A09;
        this.A06 = dfl.A06.clone();
        this.A05 = dfl.A05;
        this.A04 = i;
        this.A0A = list;
        this.A08 = dfl2;
        this.A01 = e9o;
        this.A02 = cBw;
        this.A00 = dfl.A00;
        this.A03 = dfl.A03;
        CIG.A04.incrementAndGet();
    }

    public DFL(DFL dfl, C25574CiE ciE) {
        this.A07 = new C25063CVv(new DNN(this));
        LinkedList linkedList = dfl.A09;
        linkedList = linkedList == null ? AnonymousClass8BR.A14() : linkedList;
        this.A09 = linkedList;
        linkedList.addFirst(ciE);
        this.A06 = dfl.A06;
        this.A05 = dfl.A05;
        this.A04 = dfl.A04;
        this.A0A = dfl.A0A;
        DFL dfl2 = dfl.A08;
        this.A08 = dfl2 == null ? null : dfl2;
        this.A01 = dfl.A01;
        this.A02 = dfl.A02;
        this.A00 = dfl.A00;
        this.A03 = dfl.A03;
        CIG.A04.incrementAndGet();
    }

    public DFL(int i) {
        this.A07 = new C25063CVv(new DNN(this));
        this.A09 = null;
        this.A06 = BE6.A0Q();
        this.A05 = i;
        this.A04 = CFq.A00.incrementAndGet();
        this.A0A = null;
        this.A08 = null;
        this.A01 = null;
        this.A02 = null;
        CIG.A04.incrementAndGet();
    }
}
