package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.6M5  reason: invalid class name */
public class AnonymousClass6M5 extends A34 {
    public int A00;
    public AnonymousClass740 A01;
    public C113625nO A02;
    public C112135kz A03;
    public WeakReference A04;
    public Bitmap[] A05;
    public boolean[] A06;
    public boolean[] A07;
    public final AnonymousClass2E5 A08;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        int i = this.A00;
        int i2 = i - 1;
        if (i == 0) {
            return this.A01.A03;
        }
        Bitmap bitmap = this.A05[i2];
        if (bitmap != null) {
            boolean[] zArr = this.A07;
            if (zArr[i2]) {
                zArr[i2] = true ^ FilterUtils.A03(this.A01.A03, bitmap, this.A08, i);
            }
            return this.A05[i2];
        }
        Bitmap A002 = FilterUtils.A00(this.A01.A03, this.A08, i, true);
        if (A002 != null) {
            this.A05[i2] = A002;
            this.A07[i2] = false;
            return A002;
        }
        Log.e("FilterThumbnailAdapter/onBindViewHolder/onPostExecute/failed to create thumbnail");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        if (r5 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r5) {
        /*
            r4 = this;
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.ref.WeakReference r0 = r4.A04
            android.content.Context r3 = X.C108945cZ.A0F(r0)
            r2 = 0
            if (r3 == 0) goto L_0x004d
            X.740 r0 = r4.A01
            android.graphics.Bitmap r0 = r0.A03
            if (r0 == 0) goto L_0x004d
            if (r5 == 0) goto L_0x004f
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L_0x0041
            X.5nO r0 = r4.A02
            android.widget.ImageView r0 = r0.A02
            r0.setBackgroundResource(r2)
            X.5nO r0 = r4.A02
            android.widget.ImageView r1 = r0.A02
            android.graphics.drawable.BitmapDrawable r0 = X.C108975cc.A08(r3, r5)
            r1.setImageDrawable(r0)
            X.5nO r0 = r4.A02
            android.widget.TextView r1 = r0.A03
            int r0 = r4.A00
            X.6ry r0 = X.C137726vv.A00(r0)
            int r0 = r0.A01
            r1.setText(r0)
            X.5nO r1 = r4.A02
            android.view.View r0 = r1.A01
            r0.setOnClickListener(r1)
        L_0x0041:
            r0 = 0
            r4.A01 = r0
            r4.A03 = r0
            r4.A02 = r0
            r4.A07 = r0
            r4.A05 = r0
            return
        L_0x004d:
            if (r5 != 0) goto L_0x0041
        L_0x004f:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0041
            int r1 = r0 + -1
            boolean[] r0 = r4.A06
            r0[r1] = r2
            X.5kz r0 = r4.A03
            if (r0 == 0) goto L_0x0041
            r0.A0G(r1)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6M5.A0H(java.lang.Object):void");
    }

    public AnonymousClass6M5(Context context, AnonymousClass2E5 r3, AnonymousClass740 r4, C113625nO r5, C112135kz r6, Bitmap[] bitmapArr, boolean[] zArr, boolean[] zArr2, int i) {
        this.A04 = AnonymousClass3MW.A0z(context);
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = i;
        this.A05 = bitmapArr;
        this.A07 = zArr;
        this.A06 = zArr2;
        this.A02 = r5;
        this.A08 = r3;
    }
}
