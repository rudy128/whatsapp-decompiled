package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.4kD  reason: invalid class name and case insensitive filesystem */
public final class C94204kD implements C42971z2 {
    public AnonymousClass1VX A00 = AnonymousClass1VW.A06;
    public final AnonymousClass1VW A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass1E7 A04;
    public final AnonymousClass00H A05;
    public final boolean A06;

    public /* synthetic */ void CBg() {
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        C18070vi.A0d(imageView, 0);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            CN5(imageView);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CN5(android.widget.ImageView r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            android.content.Context r3 = r7.getContext()
            X.1VW r4 = r6.A01
            boolean r0 = r4.A0D()
            if (r0 == 0) goto L_0x004e
            X.1VX r0 = r6.A00
            int r0 = r0.backgroundColorRes
        L_0x0014:
            int r5 = X.C19740yt.A00(r3, r0)
        L_0x0018:
            X.00H r0 = r6.A05
            java.lang.Object r1 = r0.get()
            X.1Va r1 = (X.C27171Va) r1
            X.1E7 r0 = r6.A04
            java.lang.String r2 = r1.A01(r0)
            boolean r0 = r4.A0D()
            if (r2 == 0) goto L_0x0064
            if (r0 == 0) goto L_0x0043
            X.1VX r0 = r6.A00
            int r0 = r0.colorResId
        L_0x0032:
            int r1 = X.C19740yt.A00(r3, r0)
            X.C18070vi.A0b(r3)
            int r0 = r6.A03
            android.graphics.Bitmap r0 = X.AnonymousClass4GF.A00(r3, r2, r0, r5, r1)
            r7.setImageBitmap(r0)
            return
        L_0x0043:
            r1 = 2130971957(0x7f040d35, float:1.7552667E38)
            r0 = 2131103410(0x7f060eb2, float:1.7819285E38)
            int r0 = X.AnonymousClass1YL.A00(r3, r1, r0)
            goto L_0x0032
        L_0x004e:
            int r2 = r6.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = -1
            if (r2 == r0) goto L_0x0060
            if (r1 == 0) goto L_0x0060
            boolean r0 = r6.A06
            int r5 = X.AnonymousClass4aR.A01(r3, r2, r0)
            goto L_0x0018
        L_0x0060:
            r0 = 2131102080(0x7f060980, float:1.7816588E38)
            goto L_0x0014
        L_0x0064:
            if (r0 == 0) goto L_0x0079
            r3 = 2131233521(0x7f080af1, float:1.8083182E38)
            X.1VX r2 = r6.A00
            r1 = 3
            X.2wZ r0 = new X.2wZ
            r0.<init>(r1)
            android.graphics.drawable.LayerDrawable r0 = r4.A08(r0, r2, r3)
            r7.setImageDrawable(r0)
            return
        L_0x0079:
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r7.setImageResource(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94204kD.CN5(android.widget.ImageView):void");
    }

    public C94204kD(AnonymousClass1VW r2, AnonymousClass1E7 r3, AnonymousClass00H r4, int i, int i2, boolean z) {
        C72473Md.A1J(r2, r4);
        this.A03 = i;
        this.A04 = r3;
        this.A02 = i2;
        this.A01 = r2;
        this.A05 = r4;
        this.A06 = z;
    }

    public void CIg(AnonymousClass1BI r2) {
        this.A00 = AnonymousClass1VW.A01(r2);
    }
}
