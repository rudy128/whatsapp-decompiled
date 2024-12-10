package X;

import java.util.Arrays;

/* renamed from: X.4Ue  reason: invalid class name and case insensitive filesystem */
public final class C87074Ue {
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x004e
            java.lang.Class r1 = r4.getClass()
            if (r5 == 0) goto L_0x003e
            java.lang.Class r0 = r5.getClass()
        L_0x000d:
            boolean r0 = X.C18070vi.A18(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.ctwa.entity.CtwaDeeplinkContentMedia"
            X.C18070vi.A0z(r5, r0)
            X.4Ue r5 = (X.C87074Ue) r5
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x003d
            byte[] r1 = r4.A03
            byte[] r0 = r5.A03
            if (r1 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x003d
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0043
        L_0x003d:
            return r2
        L_0x003e:
            r0 = 0
            goto L_0x000d
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x004e
            return r2
        L_0x004e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87074Ue.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.A02;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        byte[] bArr = this.A03;
        if (bArr != null) {
            i3 = Arrays.hashCode(bArr);
        }
        return i5 + i3;
    }

    public C87074Ue(String str, String str2, String str3, byte[] bArr) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = bArr;
        this.A00 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CtwaDeeplinkContentMedia(videoUrl=");
        A10.append(this.A02);
        A10.append(", thumbnailUrl=");
        A10.append(this.A01);
        A10.append(", thumbnailBytes=");
        A10.append(Arrays.toString(this.A03));
        A10.append(", originalImageUrl=");
        return C17900vP.A0B(this.A00, A10);
    }
}
