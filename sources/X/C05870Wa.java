package X;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.0Wa  reason: invalid class name and case insensitive filesystem */
public final class C05870Wa implements C17770vC {
    public C16790tE A00;
    public C16790tE A01;
    public final C04710Ol A02 = new C04710Ol();
    public final AnonymousClass0t6 A03 = new AnonymousClass0WZ(this);

    private final C16790tE A03(C02000Cg r7, float f, int i, long j) {
        C16790tE A022 = A02(r7);
        if (f != 1.0f) {
            j = AnonymousClass0Oy.A03(AnonymousClass001.A11(j), C05100Qk.A04(j), C05100Qk.A03(j), C05100Qk.A02(j), C05100Qk.A01(j) * f);
        }
        AnonymousClass0WR r3 = (AnonymousClass0WR) A022;
        C02540Ek r5 = C05100Qk.A06;
        if ((((long) r3.A01.getColor()) << 32) != j) {
            A022.CIO(j);
        }
        if (r3.A02 != null) {
            r3.A02 = null;
            r3.A01.setShader((Shader) null);
        }
        if (!C18070vi.A18(r3.A03, (Object) null)) {
            r3.A03 = null;
            r3.A01.setColorFilter((ColorFilter) null);
        }
        if (r3.A00 != i) {
            A022.CI6(i);
        }
        if (!r3.A01.isFilterBitmap()) {
            r3.A01.setFilterBitmap(true);
        }
        return A022;
    }

    public void BJQ(C02000Cg r9, float f, float f2, int i, long j, long j2) {
        this.A02.A01.BJP(A03(r9, f2, i, j), f, j2);
    }

    public void BJU(AnonymousClass0HD r12, C16980tX r13, C02000Cg r14, float f, int i, int i2, long j, long j2, long j3, long j4) {
        this.A02.A01.BJX(r13, A01((C03380Hv) null, r12, r14, f, i, i2), j, j2, j3, j4);
    }

    public void BJW(AnonymousClass0HD r10, C16980tX r11, C02000Cg r12, long j) {
        this.A02.A01.BJV(r11, A01((C03380Hv) null, r10, r12, 1.0f, 3, 1), j);
    }

    public void BJe(C03380Hv r10, C17040te r11, C02000Cg r12, float f, int i) {
        this.A02.A01.BJd(A01(r10, (AnonymousClass0HD) null, r12, f, i, 1), r11);
    }

    public void BJf(C17040te r9, C02000Cg r10, long j) {
        this.A02.A01.BJd(A03(r10, 1.0f, 3, j), r9);
    }

    public void BJh(C03380Hv r18, C02000Cg r19, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        this.A02.A01.BJg(A01(r18, (AnonymousClass0HD) null, r19, 1.0f, 3, 1), AnonymousClass0QY.A01(j3), AnonymousClass0QY.A02(j3), AnonymousClass001.A03(j3, j4), AnonymousClass001.A04(j3, j4));
    }

    public void BJk(C03380Hv r20, C02000Cg r21, long j, long j2, long j3) {
        C16960tV r4 = this.A02.A01;
        long j4 = j;
        float A012 = AnonymousClass0QY.A01(j4);
        float A022 = AnonymousClass0QY.A02(j4);
        long j5 = j2;
        float A032 = AnonymousClass001.A03(j4, j5);
        float A04 = AnonymousClass001.A04(j4, j5);
        long j6 = C04140Lz.A00;
        r4.BJj(A01(r20, (AnonymousClass0HD) null, r21, 1.0f, 3, 1), A012, A022, A032, A04, AnonymousClass001.A02(j3), AnonymousClass001.A01(j3));
    }

    public /* synthetic */ int CG9(float f) {
        return C26252Cvs.A04(this, f);
    }

    public /* synthetic */ float CPE(long j) {
        return C25292Ccu.A00(this, j);
    }

    public /* synthetic */ float CPF(float f) {
        return C26252Cvs.A00(this, f);
    }

    public /* synthetic */ float CPG(int i) {
        return C26252Cvs.A02(this, i);
    }

    public /* synthetic */ long CPH(long j) {
        return C26252Cvs.A06(this, j);
    }

    public /* synthetic */ float CPP(long j) {
        return C26252Cvs.A03(this, j);
    }

    public /* synthetic */ float CPQ(float f) {
        return C26252Cvs.A01(this, f);
    }

    public /* synthetic */ long CPT(long j) {
        return C26252Cvs.A07(this, j);
    }

    public /* synthetic */ long CPU(float f) {
        return C25292Ccu.A01(this, f);
    }

    public /* synthetic */ long CPV(float f) {
        return C26252Cvs.A05(this, f);
    }

    private final C16790tE A00(C03380Hv r9, float f, float f2) {
        int i;
        int i2;
        C16790tE r2 = this.A01;
        AnonymousClass0WR r22 = r2;
        if (r2 == null) {
            AnonymousClass0WR r23 = new AnonymousClass0WR();
            r23.A01.setStyle(Paint.Style.STROKE);
            this.A01 = r23;
            r22 = r23;
        }
        if (r9 != null) {
            r9.A00(r22, f2, BQs().BZL());
        } else if (((float) ((AnonymousClass0WR) r22).A01.getAlpha()) / 255.0f != f2) {
            r22.CHo(f2);
        }
        AnonymousClass0WR r7 = (AnonymousClass0WR) r22;
        if (!C18070vi.A18(r7.A03, (Object) null)) {
            r7.A03 = null;
            r7.A01.setColorFilter((ColorFilter) null);
        }
        if (r7.A00 != 3) {
            r22.CI6(3);
        }
        if (r7.A01.getStrokeWidth() != f) {
            r7.A01.setStrokeWidth(f);
        }
        if (r7.A01.getStrokeMiter() != 4.0f) {
            r7.A01.setStrokeMiter(4.0f);
        }
        Paint.Cap strokeCap = r7.A01.getStrokeCap();
        if (!(strokeCap == null || (i2 = AnonymousClass0GV.A00[strokeCap.ordinal()]) == 1 || (i2 != 2 && i2 != 3))) {
            r7.A01.setStrokeCap(Paint.Cap.BUTT);
        }
        Paint.Join strokeJoin = r7.A01.getStrokeJoin();
        if (!(strokeJoin == null || (i = AnonymousClass0GV.A01[strokeJoin.ordinal()]) == 1 || (i != 2 && i != 3))) {
            r22.CKv(0);
        }
        if (!r7.A01.isFilterBitmap()) {
            r7.A01.setFilterBitmap(true);
        }
        return r22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r1 != 3) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        if (r1 != 3) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C16790tE A02(X.C02000Cg r7) {
        /*
            r6 = this;
            X.09m r0 = X.C016909m.A00
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x001b
            X.0tE r2 = r6.A00
            if (r2 != 0) goto L_0x001a
            X.0WR r2 = new X.0WR
            r2.<init>()
            android.graphics.Paint r1 = r2.A01
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            r6.A00 = r2
        L_0x001a:
            return r2
        L_0x001b:
            boolean r0 = r7 instanceof X.C016809l
            if (r0 == 0) goto L_0x00ae
            X.0tE r2 = r6.A01
            if (r2 != 0) goto L_0x0031
            X.0WR r2 = new X.0WR
            r2.<init>()
            android.graphics.Paint r1 = r2.A01
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r0)
            r6.A01 = r2
        L_0x0031:
            r3 = r2
            X.0WR r3 = (X.AnonymousClass0WR) r3
            android.graphics.Paint r0 = r3.A01
            float r0 = r0.getStrokeWidth()
            X.09l r7 = (X.C016809l) r7
            float r1 = r7.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0047
            android.graphics.Paint r0 = r3.A01
            r0.setStrokeWidth(r1)
        L_0x0047:
            android.graphics.Paint r0 = r3.A01
            android.graphics.Paint$Cap r0 = r0.getStrokeCap()
            if (r0 == 0) goto L_0x0062
            int[] r1 = X.AnonymousClass0GV.A00
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x0062
            r0 = 2
            r5 = 1
            if (r1 == r0) goto L_0x0063
            r0 = 3
            r5 = 2
            if (r1 == r0) goto L_0x0063
        L_0x0062:
            r5 = 0
        L_0x0063:
            int r4 = r7.A02
            if (r5 == r4) goto L_0x0071
            android.graphics.Paint r1 = r3.A01
            r0 = 2
            if (r4 != r0) goto L_0x00a5
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        L_0x006e:
            r1.setStrokeCap(r0)
        L_0x0071:
            android.graphics.Paint r0 = r3.A01
            float r0 = r0.getStrokeMiter()
            float r1 = r7.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0082
            android.graphics.Paint r0 = r3.A01
            r0.setStrokeMiter(r1)
        L_0x0082:
            android.graphics.Paint r0 = r3.A01
            android.graphics.Paint$Join r0 = r0.getStrokeJoin()
            if (r0 == 0) goto L_0x009c
            int[] r1 = X.AnonymousClass0GV.A01
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x009c
            r3 = 2
            if (r1 == r3) goto L_0x009d
            r0 = 3
            r3 = 1
            if (r1 == r0) goto L_0x009d
        L_0x009c:
            r3 = 0
        L_0x009d:
            int r0 = r7.A03
            if (r3 == r0) goto L_0x001a
            r2.CKv(r0)
            return r2
        L_0x00a5:
            r0 = 1
            if (r4 != r0) goto L_0x00ab
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L_0x006e
        L_0x00ab:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L_0x006e
        L_0x00ae:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05870Wa.A02(X.0Cg):X.0tE");
    }

    public void BJO(C02000Cg r17, float f, float f2, long j, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        this.A02.A01.BJN(A03(r17, 1.0f, 3, j), AnonymousClass0QY.A01(j4), AnonymousClass0QY.A02(j4), AnonymousClass001.A03(j4, j5), AnonymousClass001.A04(j4, j5), f, f2);
    }

    public void BJb(C03380Hv r7, float f, float f2, long j, long j2) {
        this.A02.A01.BJc(A00(r7, f, f2), j, j2);
    }

    public void BJi(C02000Cg r7, float f, int i, long j, long j2, long j3) {
        this.A02.A01.BJg(A03(r7, f, i, j), AnonymousClass0QY.A01(j2), AnonymousClass0QY.A02(j2), AnonymousClass001.A03(j2, j3), AnonymousClass001.A04(j2, j3));
    }

    public void BJl(C02000Cg r19, long j, long j2, long j3, long j4) {
        C16960tV r4 = this.A02.A01;
        long j5 = j2;
        float A012 = AnonymousClass0QY.A01(j5);
        float A022 = AnonymousClass0QY.A02(j5);
        long j6 = j3;
        float A032 = AnonymousClass001.A03(j5, j6);
        float A04 = AnonymousClass001.A04(j5, j6);
        long j7 = C04140Lz.A00;
        r4.BJj(A03(r19, 1.0f, 3, j), A012, A022, A032, A04, AnonymousClass001.A02(j4), AnonymousClass001.A01(j4));
    }

    public float BQU() {
        return this.A02.A01().BQU();
    }

    public float BRu() {
        return this.A02.A01().BRu();
    }

    public C24246By4 getLayoutDirection() {
        return this.A02.A03();
    }

    private final C16790tE A01(C03380Hv r8, AnonymousClass0HD r9, C02000Cg r10, float f, int i, int i2) {
        ColorFilter colorFilter;
        C16790tE A022 = A02(r10);
        if (r8 != null) {
            r8.A00(A022, f, BQs().BZL());
        } else {
            AnonymousClass0WR r6 = (AnonymousClass0WR) A022;
            if (r6.A02 != null) {
                r6.A02 = null;
                r6.A01.setShader((Shader) null);
            }
            long j = C05100Qk.A01;
            if ((((long) r6.A01.getColor()) << 32) != j) {
                A022.CIO(j);
            }
            if (((float) r6.A01.getAlpha()) / 255.0f != f) {
                A022.CHo(f);
            }
        }
        AnonymousClass0WR r2 = (AnonymousClass0WR) A022;
        if (!C18070vi.A18(r2.A03, r9)) {
            r2.A03 = r9;
            Paint paint = r2.A01;
            if (r9 != null) {
                colorFilter = r9.A00;
            } else {
                colorFilter = null;
            }
            paint.setColorFilter(colorFilter);
        }
        if (r2.A00 != i) {
            A022.CI6(i);
        }
        int i3 = 1;
        if (!r2.A01.isFilterBitmap()) {
            i3 = 0;
        }
        if (i3 != i2) {
            Paint paint2 = r2.A01;
            boolean z = false;
            if (i2 == 0) {
                z = true;
            }
            paint2.setFilterBitmap(!z);
        }
        return A022;
    }

    public final C04710Ol A04() {
        return this.A02;
    }

    public /* synthetic */ long BOQ() {
        long BZL = BQs().BZL();
        return AnonymousClass0LG.A01(AnonymousClass0QG.A02(BZL), BZL);
    }

    public AnonymousClass0t6 BQs() {
        return this.A03;
    }

    public /* synthetic */ long BZL() {
        return BQs().BZL();
    }
}
