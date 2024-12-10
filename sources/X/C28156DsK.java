package X;

import android.graphics.Shader;
import com.facebook.primitive.canvas.model.CanvasInverseTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DsK  reason: case insensitive filesystem */
public final class C28156DsK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CMZ $bloksCanvasState;
    public final /* synthetic */ DOZ $bloksContext;
    public final /* synthetic */ DFL $component;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28156DsK(CMZ cmz, DOZ doz, DFL dfl) {
        super(1);
        this.$component = dfl;
        this.$bloksCanvasState = cmz;
        this.$bloksContext = doz;
    }

    public static float A00(DFL dfl, float f, int i) {
        return A02(dfl.A0D(i), 0.0f, f);
    }

    public static float A01(DFL dfl, long j) {
        return A02(dfl.A0D(36), 0.0f, C25763ClY.A00(j));
    }

    public static final float A02(String str, float f, float f2) {
        if (str == null) {
            return f;
        }
        if (BE6.A1V(str)) {
            return A90.A00(str) * 0.01f * f2;
        }
        return A90.A01(str);
    }

    public static final BTK A03(DOZ doz, DFL dfl) {
        float[] fArr;
        if (dfl.A05 == 16594) {
            List A0F = dfl.A0F(36);
            C18070vi.A0X(A0F);
            ArrayList A0D = C29351c6.A0D(A0F);
            Iterator it = A0F.iterator();
            while (it.hasNext()) {
                C17890vO.A1D(A0D, C25340Cdz.A00(doz, BE6.A0d(it)));
            }
            int[] A1B = C29431cG.A1B(A0D);
            if (BE7.A0s(dfl, 35).isEmpty()) {
                fArr = null;
            } else {
                List<Object> A0G = dfl.A0G(35);
                fArr = new float[BE7.A08(A0G)];
                int i = 0;
                for (Object A04 : A0G) {
                    fArr[i] = AnonymousClass000.A04(A04);
                    i++;
                }
            }
            return new BTK(fArr, A1B);
        }
        throw AnonymousClass000.A0k("Expected canvas gradient model.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.BU3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.BU3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.BTM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.BTM} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r10v3, types: [X.BTp] */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r10v4, types: [X.BTq] */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if (r1 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        if (r1 == false) goto L_0x00de;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C28554E7f A04(X.DOZ r16, X.DFL r17, long r18) {
        /*
            r0 = r17
            int r4 = r0.A05
            r3 = 16613(0x40e5, float:2.328E-41)
            r9 = 40
            r6 = 38
            r8 = 41
            r7 = 35
            r11 = 0
            r5 = r16
            r1 = r18
            if (r4 != r3) goto L_0x004d
            X.DFL r4 = r0.A09(r8)
            if (r4 == 0) goto L_0x0241
            X.DFL r3 = r0.A09(r6)
            if (r3 == 0) goto L_0x023a
            X.E1G r8 = A08(r4, r1)
            X.E1F r6 = A06(r5, r3, r1)
            X.CUg r4 = X.C25904CoG.A00
            X.DFL r3 = r0.A09(r7)
            if (r3 == 0) goto L_0x004b
            java.lang.String r3 = r3.A0D(r7)
        L_0x0035:
            int r3 = r4.A00(r3)
            X.DFL r0 = r0.A09(r9)
            if (r0 == 0) goto L_0x0043
            X.BTM r11 = A07(r5, r0, r1)
        L_0x0043:
            X.BTo r9 = new X.BTo
            r9.<init>(r6, r11, r8, r3)
        L_0x0048:
            X.E7f r9 = (X.C28554E7f) r9
            return r9
        L_0x004b:
            r3 = r11
            goto L_0x0035
        L_0x004d:
            r3 = 16618(0x40ea, float:2.3287E-41)
            if (r4 != r3) goto L_0x015b
            r3 = 45
            X.DFL r4 = r0.A09(r3)
            if (r4 == 0) goto L_0x024f
            r3 = 43
            X.DFL r3 = r0.A09(r3)
            if (r3 == 0) goto L_0x0248
            X.E1G r12 = A08(r4, r1)
            X.E1F r10 = A06(r5, r3, r1)
            X.CUg r4 = X.C25904CoG.A00
            X.DFL r3 = r0.A09(r7)
            if (r3 == 0) goto L_0x0158
            java.lang.String r3 = r3.A0D(r7)
        L_0x0075:
            int r17 = r4.A00(r3)
            r3 = 44
            X.DFL r3 = r0.A09(r3)
            if (r3 == 0) goto L_0x0085
            X.BTM r11 = A07(r5, r3, r1)
        L_0x0085:
            java.lang.String r1 = r0.A0D(r8)
            r2 = 0
            float r14 = A02(r1, r2, r2)
            java.lang.String r1 = r0.A0D(r6)
            if (r1 == 0) goto L_0x00b5
            java.lang.String r4 = X.C108975cc.A0d(r1)
            int r3 = r4.hashCode()
            r1 = -894674659(0xffffffffcaac591d, float:-5647502.5)
            if (r3 == r1) goto L_0x014e
            r1 = 3035667(0x2e5213, float:4.253876E-39)
            if (r3 == r1) goto L_0x00b5
            r1 = 108704142(0x67ab18e, float:4.715022E-35)
            if (r3 != r1) goto L_0x00b5
            java.lang.String r1 = "round"
            boolean r1 = r4.equals(r1)
            r18 = 1
        L_0x00b3:
            if (r1 != 0) goto L_0x00b7
        L_0x00b5:
            r18 = 0
        L_0x00b7:
            java.lang.String r1 = r0.A0D(r9)
            if (r1 == 0) goto L_0x00de
            java.lang.String r4 = X.C108975cc.A0d(r1)
            int r3 = r4.hashCode()
            r1 = 93630586(0x594b07a, float:1.398268E-35)
            if (r3 == r1) goto L_0x0145
            r1 = 103906565(0x6317d05, float:3.338185E-35)
            if (r3 == r1) goto L_0x00de
            r1 = 108704142(0x67ab18e, float:4.715022E-35)
            if (r3 != r1) goto L_0x00de
            java.lang.String r1 = "round"
            boolean r1 = r4.equals(r1)
            r19 = 1
        L_0x00dc:
            if (r1 != 0) goto L_0x00e0
        L_0x00de:
            r19 = 0
        L_0x00e0:
            r3 = 1082130432(0x40800000, float:4.0)
            r1 = 42
            float r15 = r0.A03(r1, r3)
            r1 = 36
            java.util.List r4 = X.BE7.A0s(r0, r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L_0x010c
            r13 = 0
        L_0x00f5:
            r1 = 53
            java.lang.String r3 = r0.A0D(r1)
            r1 = 46
            float r0 = r0.A03(r1, r2)
            float r16 = A02(r3, r0, r2)
            X.BTr r9 = new X.BTr
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0048
        L_0x010c:
            java.util.ArrayList r3 = X.C29351c6.A0D(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0114:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0126
            java.lang.String r1 = X.C17880vN.A0v(r4)
            float r1 = X.A90.A01(r1)
            X.BE7.A1Q(r3, r1)
            goto L_0x0114
        L_0x0126:
            int r1 = r3.size()
            float[] r13 = new float[r1]
            java.util.Iterator r5 = r3.iterator()
            r4 = 0
        L_0x0131:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00f5
            java.lang.Object r1 = r5.next()
            float r3 = X.AnonymousClass000.A04(r1)
            int r1 = r4 + 1
            r13[r4] = r3
            r4 = r1
            goto L_0x0131
        L_0x0145:
            java.lang.String r1 = "bevel"
            boolean r1 = r4.equals(r1)
            r19 = 2
            goto L_0x00dc
        L_0x014e:
            java.lang.String r1 = "square"
            boolean r1 = r4.equals(r1)
            r18 = 2
            goto L_0x00b3
        L_0x0158:
            r3 = r11
            goto L_0x0075
        L_0x015b:
            r3 = 16623(0x40ef, float:2.3294E-41)
            if (r4 != r3) goto L_0x01d6
            java.lang.String r4 = r0.A0D(r8)
            float r3 = X.AnonymousClass001.A02(r1)
            float r8 = A02(r4, r3, r3)
            java.lang.String r4 = r0.A0D(r6)
            float r3 = X.AnonymousClass001.A01(r1)
            float r3 = A02(r4, r3, r3)
            long r3 = X.C24564C9l.A00(r8, r3)
            X.DFL r6 = r0.A09(r9)
            if (r6 == 0) goto L_0x01c8
            X.BUD r12 = A09(r6, r1)
        L_0x0185:
            r1 = 36
            X.DFL r1 = r0.A09(r1)
            r6 = 0
            if (r1 == 0) goto L_0x0192
            X.BU3 r11 = A05(r1, r3)
        L_0x0192:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1 = 141(0x8d, float:1.98E-43)
            float r14 = r0.A03(r1, r2)
            X.CUg r2 = X.C25904CoG.A00
            X.DFL r1 = r0.A09(r7)
            if (r1 == 0) goto L_0x01a6
            java.lang.String r6 = r1.A0D(r7)
        L_0x01a6:
            int r15 = r2.A00(r6)
            java.util.List r0 = X.BE7.A0r(r0)
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01b6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cb
            X.DFL r0 = X.BE8.A0R(r1)
            X.E7f r0 = A04(r5, r0, r3)
            r2.add(r0)
            goto L_0x01b6
        L_0x01c8:
            X.BUD r12 = X.BUD.A07
            goto L_0x0185
        L_0x01cb:
            X.BTq r9 = new X.BTq
            r10 = r9
            r13 = r2
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L_0x0048
        L_0x01d6:
            r3 = 16621(0x40ed, float:2.3291E-41)
            if (r4 != r3) goto L_0x0256
            java.lang.String r4 = r0.A0D(r9)
            float r3 = X.AnonymousClass001.A02(r1)
            float r9 = A02(r4, r3, r3)
            java.lang.String r4 = X.BE7.A0e(r0)
            float r3 = X.AnonymousClass001.A01(r1)
            float r3 = A02(r4, r3, r3)
            long r3 = X.C24564C9l.A00(r9, r3)
            X.DFL r6 = r0.A09(r6)
            if (r6 == 0) goto L_0x022d
            X.BUD r12 = A09(r6, r1)
        L_0x0200:
            X.DFL r1 = r0.A09(r7)
            if (r1 == 0) goto L_0x020a
            X.BU3 r11 = A05(r1, r3)
        L_0x020a:
            r1 = 0
            boolean r16 = r0.A0I(r8, r1)
            java.util.List r0 = X.BE7.A0r(r0)
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x021b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0230
            X.DFL r0 = X.BE8.A0R(r1)
            X.E7f r0 = A04(r5, r0, r3)
            r2.add(r0)
            goto L_0x021b
        L_0x022d:
            X.BUD r12 = X.BUD.A07
            goto L_0x0200
        L_0x0230:
            X.BTp r9 = new X.BTp
            r10 = r9
            r13 = r2
            r14 = r3
            r10.<init>(r11, r12, r13, r14, r16)
            goto L_0x0048
        L_0x023a:
            java.lang.String r0 = "Canvas fill command must specify the shading which should be used for drawing"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0241:
            java.lang.String r0 = "Canvas fill command must specify the shape which should be drawn"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0248:
            java.lang.String r0 = "Canvas stroke command must specify the shading which should be used for drawing"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x024f:
            java.lang.String r0 = "Canvas stroke command must specify the shape which should be drawn"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0256:
            java.lang.String r0 = "Unknown canvas command."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28156DsK.A04(X.DOZ, X.DFL, long):X.E7f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (X.C18070vi.A18(r1, "evenodd") == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.BU3 A05(X.DFL r21, long r22) {
        /*
            r2 = r21
            int r1 = r2.A05
            r0 = 16593(0x40d1, float:2.3252E-41)
            if (r1 != r0) goto L_0x0205
            java.lang.String r0 = X.BE7.A0d(r2)
            if (r0 == 0) goto L_0x01ee
            java.lang.String r1 = X.C108975cc.A0d(r0)
        L_0x0012:
            java.lang.String r0 = "nonzero"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "evenodd"
            boolean r0 = X.C18070vi.A18(r1, r0)
            r10 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r10 = 0
        L_0x0024:
            java.util.List r1 = X.BE7.A0r(r2)
            java.util.ArrayList r0 = X.C29351c6.A0D(r1)
            java.util.Iterator r14 = r1.iterator()
        L_0x0030:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x01ff
            X.DFL r1 = X.BE8.A0R(r14)
            int r12 = r1.A05
            r4 = 16631(0x40f7, float:2.3305E-41)
            r11 = 36
            r9 = 35
            r5 = 0
            r2 = r22
            if (r12 != r4) goto L_0x0064
            java.lang.String r6 = r1.A0D(r9)
            float r4 = X.AnonymousClass001.A02(r2)
            float r4 = A02(r6, r5, r4)
            float r1 = A01(r1, r2)
            long r1 = X.C9k.A00(r4, r1)
            X.BTt r15 = new X.BTt
            r15.<init>(r1)
        L_0x0060:
            r0.add(r15)
            goto L_0x0030
        L_0x0064:
            r4 = 16630(0x40f6, float:2.3304E-41)
            if (r12 != r4) goto L_0x0082
            java.lang.String r6 = r1.A0D(r9)
            float r4 = X.AnonymousClass001.A02(r2)
            float r4 = A02(r6, r5, r4)
            float r1 = A01(r1, r2)
            long r1 = X.C9k.A00(r4, r1)
            X.BTs r15 = new X.BTs
            r15.<init>(r1)
            goto L_0x0060
        L_0x0082:
            r6 = 16632(0x40f8, float:2.3306E-41)
            r7 = 40
            r4 = 38
            if (r12 != r6) goto L_0x00b8
            java.lang.String r6 = r1.A0D(r9)
            float r12 = X.AnonymousClass001.A02(r2)
            float r9 = A02(r6, r5, r12)
            java.lang.String r8 = r1.A0D(r11)
            float r6 = X.AnonymousClass001.A01(r2)
            float r2 = A02(r8, r5, r6)
            long r2 = X.C9k.A00(r9, r2)
            float r4 = A00(r1, r12, r4)
            float r1 = A00(r1, r6, r7)
            long r4 = X.C9k.A00(r4, r1)
            X.BTx r15 = new X.BTx
            r15.<init>(r2, r4)
            goto L_0x0060
        L_0x00b8:
            r13 = 16629(0x40f5, float:2.3302E-41)
            r8 = 42
            r6 = 41
            if (r12 != r13) goto L_0x00fb
            java.lang.String r12 = r1.A0D(r9)
            float r9 = X.AnonymousClass001.A02(r2)
            float r12 = A02(r12, r5, r9)
            java.lang.String r11 = r1.A0D(r11)
            float r3 = X.AnonymousClass001.A01(r2)
            float r2 = A02(r11, r5, r3)
            long r16 = X.C9k.A00(r12, r2)
            float r4 = A00(r1, r9, r4)
            float r2 = A00(r1, r3, r7)
            long r18 = X.C9k.A00(r4, r2)
            float r2 = A00(r1, r9, r6)
            float r1 = A00(r1, r3, r8)
            long r20 = X.C9k.A00(r2, r1)
            X.BTy r15 = new X.BTy
            r15.<init>(r16, r18, r20)
            goto L_0x0060
        L_0x00fb:
            r13 = 16628(0x40f4, float:2.3301E-41)
            if (r12 != r13) goto L_0x012f
            java.lang.String r11 = r1.A0D(r9)
            float r9 = X.AnonymousClass001.A02(r2)
            float r9 = A02(r11, r5, r9)
            float r2 = A01(r1, r2)
            long r19 = X.C9k.A00(r9, r2)
            java.lang.String r2 = r1.A0D(r6)
            float r16 = A02(r2, r5, r5)
            float r17 = r1.A03(r8, r5)
            float r18 = r1.A03(r7, r5)
            r2 = 1
            boolean r21 = r1.A0I(r4, r2)
            X.BU0 r15 = new X.BU0
            r15.<init>(r16, r17, r18, r19, r21)
            goto L_0x0060
        L_0x012f:
            r8 = 16603(0x40db, float:2.3266E-41)
            if (r12 != r8) goto L_0x016a
            java.lang.String r7 = r1.A0D(r7)
            float r8 = X.AnonymousClass001.A02(r2)
            float r12 = A02(r7, r5, r8)
            java.lang.String r7 = r1.A0D(r6)
            float r6 = X.AnonymousClass001.A01(r2)
            float r2 = A02(r7, r5, r6)
            long r17 = X.C9k.A00(r12, r2)
            float r3 = A00(r1, r8, r4)
            float r2 = A00(r1, r6, r11)
            long r19 = X.C24564C9l.A00(r3, r2)
            java.lang.String r1 = r1.A0D(r9)
            float r16 = A02(r1, r5, r5)
            X.BTz r15 = new X.BTz
            r15.<init>(r16, r17, r19)
            goto L_0x0060
        L_0x016a:
            r6 = 16608(0x40e0, float:2.3273E-41)
            if (r12 != r6) goto L_0x019d
            java.lang.String r4 = r1.A0D(r4)
            float r12 = X.AnonymousClass001.A02(r2)
            float r8 = A02(r4, r5, r12)
            java.lang.String r4 = r1.A0D(r7)
            float r6 = X.AnonymousClass001.A01(r2)
            float r2 = A02(r4, r5, r6)
            long r2 = X.C9k.A00(r8, r2)
            float r4 = A00(r1, r12, r11)
            float r1 = A00(r1, r6, r9)
            long r4 = X.C24564C9l.A00(r4, r1)
            X.BTw r15 = new X.BTw
            r15.<init>(r2, r4)
            goto L_0x0060
        L_0x019d:
            r6 = 16596(0x40d4, float:2.3256E-41)
            if (r12 != r6) goto L_0x01c4
            java.lang.String r7 = r1.A0D(r9)
            float r6 = X.AnonymousClass001.A02(r2)
            float r6 = A02(r7, r5, r6)
            float r2 = A01(r1, r2)
            long r2 = X.C9k.A00(r6, r2)
            java.lang.String r1 = r1.A0D(r4)
            float r1 = A02(r1, r5, r5)
            X.BTv r15 = new X.BTv
            r15.<init>(r1, r2)
            goto L_0x0060
        L_0x01c4:
            r4 = 16600(0x40d8, float:2.3262E-41)
            if (r12 != r4) goto L_0x01cc
            X.DF3 r15 = X.DF3.A00
            goto L_0x0060
        L_0x01cc:
            r4 = 16614(0x40e6, float:2.3281E-41)
            if (r12 != r4) goto L_0x01f8
            X.DFL r5 = r1.A09(r9)
            if (r5 == 0) goto L_0x01f1
            X.DFL r1 = r1.A09(r11)
            if (r1 == 0) goto L_0x01eb
            X.BUD r4 = A09(r1, r2)
        L_0x01e0:
            X.BU3 r1 = A05(r5, r2)
            X.BTu r15 = new X.BTu
            r15.<init>(r1, r4)
            goto L_0x0060
        L_0x01eb:
            X.BUD r4 = X.BUD.A07
            goto L_0x01e0
        L_0x01ee:
            r1 = 0
            goto L_0x0012
        L_0x01f1:
            java.lang.String r0 = "Path Add must specify the path which should be added"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01f8:
            java.lang.String r0 = "Unknown canvas child path."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x01ff:
            X.BU3 r1 = new X.BU3
            r1.<init>(r10, r0)
            return r1
        L_0x0205:
            java.lang.String r0 = "Unknown canvas path."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28156DsK.A05(X.DFL, long):X.BU3");
    }

    public static final E1F A06(DOZ doz, DFL dfl, long j) {
        C28504E4m bTn;
        E1F bu1;
        int i = dfl.A05;
        if (i == 16591) {
            DFL A09 = dfl.A09(35);
            if (A09 != null) {
                bu1 = new BU2(C25340Cdz.A00(doz, A09));
            } else {
                throw AnonymousClass000.A0k("Color shading must specify the themed color");
            }
        } else {
            if (i == 16616) {
                DFL A092 = dfl.A09(38);
                if (A092 != null) {
                    BTK A03 = A03(doz, A092);
                    String A0D = dfl.A0D(40);
                    float A02 = AnonymousClass001.A02(j);
                    float A022 = A02(A0D, 0.0f, A02);
                    String A0h = BE7.A0h(dfl);
                    float A01 = AnonymousClass001.A01(j);
                    bTn = new C22875BTm(Shader.TileMode.CLAMP, A03, C9k.A00(A022, A02(A0h, 0.0f, A01)), C9k.A00(A00(dfl, A02, 35), A00(dfl, A01, 36)));
                } else {
                    throw AnonymousClass000.A0k("Radial gradient shading must specify the gradient");
                }
            } else if (i == 16615) {
                DFL A093 = dfl.A09(38);
                if (A093 != null) {
                    BTK A032 = A03(doz, A093);
                    long A00 = C9k.A00(A02(dfl.A0D(35), 0.0f, AnonymousClass001.A02(j)), A01(dfl, j));
                    bTn = new C22876BTn(Shader.TileMode.CLAMP, A032, BEA.A02(dfl, 40), A00);
                } else {
                    throw AnonymousClass000.A0k("Radial gradient shading must specify the gradient");
                }
            } else {
                throw AnonymousClass000.A0k("Unknown canvas shading.");
            }
            bu1 = new BU1(bTn);
        }
        return bu1;
    }

    public static final BTM A07(DOZ doz, DFL dfl, long j) {
        DFL A09 = dfl.A09(40);
        if (A09 != null) {
            return new BTM(A02(BE7.A0d(dfl), 0.0f, AnonymousClass001.A02(j)), A01(dfl, j), A02(BE7.A0f(dfl), 0.0f, 0.0f), C25340Cdz.A00(doz, A09));
        }
        throw AnonymousClass000.A0k("Shadow must specify the color");
    }

    public static final E1G A08(DFL dfl, long j) {
        E1G A05;
        int i = dfl.A05;
        if (i == 16598) {
            A05 = new BU4(A02(dfl.A0D(38), 0.0f, 0.0f), C9k.A00(A02(dfl.A0D(35), 0.0f, AnonymousClass001.A02(j)), A01(dfl, j)));
        } else if (i == 16588) {
            A05 = new BU8(A02(dfl.A0D(41), 0.0f, 0.0f), dfl.A03(42, 0.0f), dfl.A03(40, 0.0f), C9k.A00(A02(dfl.A0D(35), 0.0f, AnonymousClass001.A02(j)), A01(dfl, j)), dfl.A0I(38, true));
        } else if (i == 16597) {
            String A0D = dfl.A0D(38);
            float A02 = AnonymousClass001.A02(j);
            float A022 = A02(A0D, 0.0f, A02);
            String A0D2 = dfl.A0D(40);
            float A01 = AnonymousClass001.A01(j);
            A05 = new BU5(C9k.A00(A022, A02(A0D2, 0.0f, A01)), C24564C9l.A00(A00(dfl, A02, 36), A00(dfl, A01, 35)));
        } else if (i == 16604) {
            String A0D3 = dfl.A0D(38);
            float A023 = AnonymousClass001.A02(j);
            float A024 = A02(A0D3, 0.0f, A023);
            String A0D4 = dfl.A0D(40);
            float A012 = AnonymousClass001.A01(j);
            A05 = new BU6(C9k.A00(A024, A02(A0D4, 0.0f, A012)), C9k.A00(A00(dfl, A023, 35), A00(dfl, A012, 36)));
        } else if (i == 16601) {
            String A0D5 = dfl.A0D(40);
            float A025 = AnonymousClass001.A02(j);
            float A026 = A02(A0D5, 0.0f, A025);
            String A0D6 = dfl.A0D(41);
            float A013 = AnonymousClass001.A01(j);
            A05 = new BU7(A02(dfl.A0D(35), 0.0f, 0.0f), C9k.A00(A026, A02(A0D6, 0.0f, A013)), C24564C9l.A00(A00(dfl, A025, 38), A00(dfl, A013, 36)));
        } else if (i == 16593) {
            A05 = A05(dfl, j);
        } else {
            throw AnonymousClass000.A0k("Unknown canvas shape.");
        }
        return A05;
    }

    public static final BUD A09(DFL dfl, long j) {
        Object A09;
        float A03;
        float A032;
        float A00;
        float A002;
        DFL dfl2 = dfl;
        if (dfl2.A05 == 16606) {
            float A033 = dfl2.A03(35, 1.0f);
            float A034 = dfl2.A03(36, 0.0f);
            float A035 = dfl2.A03(38, 0.0f);
            float A036 = dfl2.A03(40, 1.0f);
            String A0h = BE7.A0h(dfl2);
            long j2 = j;
            float A037 = AnonymousClass000.A03(j2);
            float A02 = A02(A0h, 0.0f, A037);
            String A0i = BE7.A0i(dfl2);
            float A01 = AnonymousClass001.A01(j2);
            float A022 = A02(A0i, 0.0f, A01);
            List A0r = BE7.A0r(dfl2);
            ArrayList A0D = C29351c6.A0D(A0r);
            Iterator it = A0r.iterator();
            while (it.hasNext()) {
                DFL A0R = BE8.A0R(it);
                int i = A0R.A05;
                if (i == 16834) {
                    A09 = CanvasInverseTransform.A00;
                } else if (i == 16590) {
                    A09 = new BUB(A0R.A03(38, 1.0f), A0R.A03(40, 1.0f), C9k.A00(A00(A0R, A037, 35), A00(A0R, A01, 36)));
                } else if (i == 16607) {
                    A09 = new BU9(A0R.A03(35, 0.0f), C9k.A00(A00(A0R, A037, 36), A00(A0R, A01, 38)));
                } else if (i == 16599) {
                    A09 = new BUA(A00(A0R, A037, 35), A00(A0R, A01, 36));
                } else {
                    if (i == 16589) {
                        A03 = A00(A0R, A037, 38);
                        A032 = A00(A0R, A01, 40);
                        A00 = A00(A0R, A037, 35);
                        A002 = A00(A0R, A01, 36);
                    } else if (i == 16830) {
                        A03 = A0R.A03(38, 0.0f);
                        A032 = A0R.A03(40, 0.0f);
                        A00 = A00(A0R, A037, 35);
                        A002 = A00(A0R, A01, 36);
                    } else if (i == 16606) {
                        A09 = A09(A0R, j2);
                    } else {
                        throw AnonymousClass000.A0k("Unknown canvas child transform.");
                    }
                    A09 = new BUC(A03, A032, C9k.A00(A00, A002));
                }
                A0D.add(A09);
            }
            return new BUD(A0D, A033, A034, A035, A036, A02, A022);
        }
        throw AnonymousClass000.A0k("Expected non-inverse transform model.");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j = ((C25763ClY) obj).A00;
        DFL dfl = this.$component;
        C25741ClB clB = this.$bloksCanvasState.A01;
        DOZ doz = this.$bloksContext;
        C18070vi.A0h(dfl, clB);
        C18070vi.A0d(doz, 3);
        List A0r = BE7.A0r(dfl);
        ArrayList A0D = C29351c6.A0D(A0r);
        Iterator it = A0r.iterator();
        while (it.hasNext()) {
            A0D.add(A04(doz, BE8.A0R(it), j));
        }
        return new BTS(clB, A0D);
    }
}
