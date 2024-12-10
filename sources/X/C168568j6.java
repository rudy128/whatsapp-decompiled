package X;

import android.widget.ImageView;

/* renamed from: X.8j6  reason: invalid class name and case insensitive filesystem */
public final class C168568j6 extends C20467AMe {
    public final int A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final int A04;

    public boolean BKx() {
        return C17890vO.A1R(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Bb5() {
        /*
            r2 = this;
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x0016
            java.lang.String r1 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0016
        L_0x000d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = ""
        L_0x0015:
            return r1
        L_0x0016:
            java.lang.String r1 = r2.A01
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168568j6.Bb5():java.lang.String");
    }

    public String getId() {
        String str = this.A05;
        int i = this.A00;
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append('_');
        if (i == 1) {
            i = 3;
        }
        return C17880vN.A0t(A11, i);
    }

    public C168568j6(ImageView imageView, B7F b7f, B7G b7g, B7H b7h, String str, String str2, String str3, int i, int i2, int i3) {
        super(imageView, b7f, b7g, b7h, str);
        this.A00 = i;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = i2;
        this.A03 = i3;
    }

    public int BUR() {
        return this.A03;
    }

    public int BUV() {
        return this.A04;
    }
}
