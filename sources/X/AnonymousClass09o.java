package X;

import android.graphics.Bitmap;

/* renamed from: X.09o  reason: invalid class name */
public final class AnonymousClass09o extends C04640Oe {
    public int A00;
    public float A01;
    public AnonymousClass0HD A02;
    public final C16980tX A03;
    public final long A04;
    public final long A05;
    public final long A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass09o) {
                AnonymousClass09o r8 = (AnonymousClass09o) obj;
                if (!(C18070vi.A18(this.A03, r8.A03) && this.A05 == r8.A05 && this.A06 == r8.A06 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public long A02() {
        return C25293Ccv.A01(this.A04);
    }

    public void A06(C17770vC r16) {
        C16980tX r4 = this.A03;
        long j = this.A05;
        long j2 = this.A06;
        C17770vC r5 = r16;
        long BZL = r5.BZL();
        long A002 = C25293Ccv.A00(C22339B3q.A01(AnonymousClass0QG.A02(BZL)), C22339B3q.A01(AnonymousClass0QG.A00(BZL)));
        C04820Pb.A02(this.A02, r4, r5, this.A01, this.A00, 328, j, j2, A002);
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A06, AnonymousClass001.A0K(this.A05, AnonymousClass000.A0L(this.A03))) + this.A00;
    }

    public AnonymousClass09o(C16980tX r7, long j, long j2) {
        int i;
        int i2;
        this.A03 = r7;
        this.A05 = j;
        this.A06 = j2;
        this.A00 = 1;
        if (((int) (j >> 32)) >= 0 && ((int) (j & 4294967295L)) >= 0 && (i = (int) (j2 >> 32)) >= 0 && (i2 = (int) (j2 & 4294967295L)) >= 0) {
            Bitmap bitmap = ((AnonymousClass0WQ) r7).A00;
            if (i <= bitmap.getWidth() && i2 <= bitmap.getHeight()) {
                this.A04 = j2;
                this.A01 = 1.0f;
                return;
            }
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BitmapPainter(image=");
        A10.append(this.A03);
        A10.append(", srcOffset=");
        A10.append(C26143Ct6.A01(this.A05));
        A10.append(", srcSize=");
        A10.append(C26142Ct5.A01(this.A06));
        A10.append(", filterQuality=");
        if (this.A00 == 0) {
            str = "None";
        } else {
            str = "Low";
        }
        return AnonymousClass001.A1F(str, A10);
    }

    public void A03(float f) {
        this.A01 = f;
    }

    public void A04(AnonymousClass0HD r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass09o(X.C16980tX r8) {
        /*
            r7 = this;
            long r3 = X.C79.A00()
            r2 = r8
            r0 = r2
            X.0WQ r0 = (X.AnonymousClass0WQ) r0
            android.graphics.Bitmap r0 = r0.A00
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            long r5 = X.C25293Ccv.A00(r1, r0)
            r1 = r7
            r1.<init>(r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09o.<init>(X.0tX):void");
    }
}
