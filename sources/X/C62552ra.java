package X;

import android.graphics.RectF;

/* renamed from: X.2ra  reason: invalid class name and case insensitive filesystem */
public final class C62552ra {
    public final int A00;
    public final int A01;
    public final RectF A02;
    public final C134926rN A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62552ra) {
                C62552ra r5 = (C62552ra) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A05 == r5.A05 && this.A06 == r5.A06 && C18070vi.A18(this.A02, r5.A02) && this.A09 == r5.A09 && C18070vi.A18(this.A04, r5.A04) && C18070vi.A18(this.A03, r5.A03) && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((((AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass0DV.A00(((this.A01 * 31) + this.A00) * 31, this.A05), this.A06) + AnonymousClass001.A0k(this.A02)) * 31, this.A09) + C17900vP.A00(this.A04)) * 31) + C17880vN.A02(this.A03)) * 31, this.A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r6 <= 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62552ra(android.graphics.RectF r2, X.C134926rN r3, java.lang.String r4, int r5, int r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
            r1 = this;
            r1.<init>()
            r1.A01 = r5
            r1.A00 = r6
            r1.A05 = r7
            r1.A06 = r8
            r1.A02 = r2
            r1.A09 = r9
            r1.A04 = r4
            r1.A03 = r3
            r1.A08 = r10
            if (r5 <= 0) goto L_0x001a
            r0 = 1
            if (r6 > 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r1.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62552ra.<init>(android.graphics.RectF, X.6rN, java.lang.String, int, int, boolean, boolean, boolean, boolean):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaDataVideoConfiguration(resizeWidth=");
        A10.append(this.A01);
        A10.append(", resizeHeight=");
        A10.append(this.A00);
        A10.append(", allowToModifyAspectRatio=");
        A10.append(this.A05);
        A10.append(", forceSingleTranscoding=");
        A10.append(this.A06);
        A10.append(", position=");
        A10.append(this.A02);
        A10.append(", useSimpleFrameRenderer=");
        A10.append(this.A09);
        A10.append(", mediaCompositionJSONString=");
        A10.append(this.A04);
        A10.append(", musicSelectedSong=");
        A10.append(this.A03);
        A10.append(", isPhotoToVideoConversion=");
        return C17900vP.A0F(A10, this.A08);
    }

    public C62552ra() {
        this((RectF) null, (C134926rN) null, (String) null, 0, 0, false, false, false, false);
    }
}
