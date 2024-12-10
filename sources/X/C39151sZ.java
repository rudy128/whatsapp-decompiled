package X;

import android.view.ViewGroup;

/* renamed from: X.1sZ  reason: invalid class name and case insensitive filesystem */
public class C39151sZ extends ViewGroup.MarginLayoutParams {
    public float A00 = 0.0f;
    public float A01 = -1.0f;
    public float A02 = 0.5f;
    public float A03 = -1.0f;
    public float A04 = 1.0f;
    public float A05 = 1.0f;
    public float A06;
    public float A07 = 0.5f;
    public float A08 = 0.5f;
    public float A09 = -1.0f;
    public int A0A = -1;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = 0;
    public int A0F = 1;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = -1;
    public int A0P = -1;
    public int A0Q = -1;
    public int A0R = -1;
    public int A0S = 0;
    public int A0T = -1;
    public int A0U = -1;
    public int A0V = 0;
    public int A0W = 0;
    public int A0X = 0;
    public int A0Y = 0;
    public int A0Z = 0;
    public int A0a = 0;
    public int A0b = -1;
    public int A0c = -1;
    public int A0d = -1;
    public int A0e;
    public int A0f;
    public int A0g = -1;
    public int A0h = -1;
    public int A0i = -1;
    public int A0j = -1;
    public int A0k = -1;
    public int A0l = -1;
    public int A0m = -1;
    public int A0n = -1;
    public int A0o = -1;
    public int A0p = -1;
    public int A0q = 0;
    public C38871s3 A0r = new C38871s3();
    public String A0s = null;
    public String A0t = null;
    public boolean A0u = false;
    public boolean A0v = false;
    public boolean A0w = true;
    public boolean A0x = false;
    public boolean A0y = false;
    public boolean A0z = false;
    public boolean A10 = true;

    public void A00() {
        this.A0x = false;
        this.A0w = true;
        this.A10 = true;
        int i = this.width;
        if (i == -2 && this.A0v) {
            this.A0w = false;
            if (this.A0W == 0) {
                this.A0W = 1;
            }
        }
        int i2 = this.height;
        if (i2 == -2 && this.A0u) {
            this.A10 = false;
            if (this.A0V == 0) {
                this.A0V = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.A0w = false;
            if (i == 0 && this.A0W == 1) {
                this.width = -2;
                this.A0v = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.A10 = false;
            if (i2 == 0 && this.A0V == 1) {
                this.height = -2;
                this.A0u = true;
            }
        }
        if (this.A01 != -1.0f || this.A0Q != -1 || this.A0R != -1) {
            this.A0x = true;
            this.A0w = true;
            this.A10 = true;
            C38871s3 r1 = this.A0r;
            if (!(r1 instanceof AnonymousClass27L)) {
                r1 = new AnonymousClass27L();
                this.A0r = r1;
            }
            ((AnonymousClass27L) r1).A0J(this.A0b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resolveLayoutDirection(int r15) {
        /*
            r14 = this;
            int r2 = r14.leftMargin
            int r4 = r14.rightMargin
            r1 = 1
            r13 = 0
            super.resolveLayoutDirection(r15)
            int r0 = r14.getLayoutDirection()
            r5 = 0
            if (r1 != r0) goto L_0x0011
            r5 = 1
        L_0x0011:
            r3 = -1
            r14.A0i = r3
            r14.A0j = r3
            r14.A0g = r3
            r14.A0h = r3
            int r0 = r14.A0M
            r14.A0c = r0
            int r0 = r14.A0N
            r14.A0d = r0
            float r12 = r14.A02
            r14.A07 = r12
            int r11 = r14.A0Q
            r14.A0e = r11
            int r10 = r14.A0R
            r14.A0f = r10
            float r9 = r14.A01
            r14.A06 = r9
            int r7 = r14.A0m
            if (r5 == 0) goto L_0x00bf
            if (r7 == r3) goto L_0x00b7
            r14.A0i = r7
        L_0x003a:
            r13 = 1
        L_0x003b:
            int r8 = r14.A0J
            if (r8 == r3) goto L_0x0042
            r14.A0h = r8
            r13 = 1
        L_0x0042:
            int r6 = r14.A0I
            if (r6 == r3) goto L_0x0049
            r14.A0g = r6
            r13 = 1
        L_0x0049:
            int r0 = r14.A0O
            if (r0 == r3) goto L_0x004f
            r14.A0d = r0
        L_0x004f:
            int r0 = r14.A0L
            if (r0 == r3) goto L_0x0055
            r14.A0c = r0
        L_0x0055:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x005d
            float r0 = r5 - r12
            r14.A07 = r0
        L_0x005d:
            boolean r0 = r14.A0x
            if (r0 == 0) goto L_0x0072
            int r0 = r14.A0b
            if (r0 != r1) goto L_0x0072
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            float r5 = r5 - r9
            r14.A06 = r5
            r14.A0e = r3
            r14.A0f = r3
        L_0x0072:
            if (r8 != r3) goto L_0x0098
            if (r6 != r3) goto L_0x0098
            int r0 = r14.A0n
            if (r0 != r3) goto L_0x0098
            if (r7 != r3) goto L_0x0098
            int r0 = r14.A0k
            if (r0 == r3) goto L_0x00a0
            r14.A0i = r0
        L_0x0082:
            int r0 = r14.rightMargin
            if (r0 > 0) goto L_0x008a
            if (r4 <= 0) goto L_0x008a
            r14.rightMargin = r4
        L_0x008a:
            int r0 = r14.A0T
            if (r0 == r3) goto L_0x0099
            r14.A0g = r0
        L_0x0090:
            int r0 = r14.leftMargin
            if (r0 > 0) goto L_0x0098
            if (r2 <= 0) goto L_0x0098
            r14.leftMargin = r2
        L_0x0098:
            return
        L_0x0099:
            int r0 = r14.A0U
            if (r0 == r3) goto L_0x0098
            r14.A0h = r0
            goto L_0x0090
        L_0x00a0:
            int r0 = r14.A0l
            if (r0 == r3) goto L_0x008a
            r14.A0j = r0
            goto L_0x0082
        L_0x00a7:
            if (r11 == r3) goto L_0x00b0
            r14.A0f = r11
            r14.A0e = r3
        L_0x00ad:
            r14.A06 = r1
            goto L_0x0072
        L_0x00b0:
            if (r10 == r3) goto L_0x0072
            r14.A0e = r10
            r14.A0f = r3
            goto L_0x00ad
        L_0x00b7:
            int r0 = r14.A0n
            if (r0 == r3) goto L_0x003b
            r14.A0j = r0
            goto L_0x003a
        L_0x00bf:
            if (r7 == r3) goto L_0x00c3
            r14.A0h = r7
        L_0x00c3:
            int r0 = r14.A0n
            if (r0 == r3) goto L_0x00c9
            r14.A0g = r0
        L_0x00c9:
            int r8 = r14.A0J
            if (r8 == r3) goto L_0x00cf
            r14.A0i = r8
        L_0x00cf:
            int r6 = r14.A0I
            if (r6 == r3) goto L_0x00d5
            r14.A0j = r6
        L_0x00d5:
            int r0 = r14.A0O
            if (r0 == r3) goto L_0x00db
            r14.A0c = r0
        L_0x00db:
            int r0 = r14.A0L
            if (r0 == r3) goto L_0x0072
            r14.A0d = r0
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39151sZ.resolveLayoutDirection(int):void");
    }

    public C39151sZ(int i, int i2) {
        super(i, i2);
    }
}
