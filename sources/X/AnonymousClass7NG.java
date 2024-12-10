package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.7NG  reason: invalid class name */
public class AnonymousClass7NG implements AnonymousClass3M2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7NG(View view, AnonymousClass1DT r2, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = r2;
            this.A02 = view;
        } else {
            this.A02 = r2;
            this.A01 = view;
        }
    }

    public int BZK() {
        Object obj;
        switch (this.A00) {
            case 0:
                return ((MediaViewFragment) this.A01).A1C.A0A(((View) this.A02).getContext());
            case 1:
                obj = this.A01;
                break;
            default:
                obj = this.A02;
                break;
        }
        return AnonymousClass000.A0Y((View) obj).getDimensionPixelSize(2131168436);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r1 != 43) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r12 != null) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CMa(android.graphics.Bitmap r12, android.view.View r13, X.AnonymousClass206 r14) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
        L_0x0007:
            X.1DS r0 = (X.AnonymousClass1DS) r0
            r0.A0E(r12)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r11.A02
            goto L_0x0007
        L_0x0010:
            java.lang.Object r4 = r11.A01
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            android.content.Context r0 = r4.A1n()
            if (r0 == 0) goto L_0x000c
            X.21V r14 = (X.AnonymousClass21V) r14
            r8 = 0
            r7 = 43
            r6 = 42
            r9 = 13
            r5 = 9
            r2 = 3
            r3 = 1
            if (r12 == 0) goto L_0x00a9
            java.lang.Object r10 = r11.A02
            com.whatsapp.mediaview.PhotoView r10 = (com.whatsapp.mediaview.PhotoView) r10
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r4)
            X.5dL r0 = new X.5dL
            r0.<init>(r1, r12, r14)
        L_0x0036:
            r10.A0B(r0)
        L_0x0039:
            int r1 = r14.A0u
            if (r1 == r3) goto L_0x009d
            if (r1 == r2) goto L_0x008f
            if (r1 == r5) goto L_0x0088
            if (r1 == r9) goto L_0x008f
            r0 = 28
            if (r1 == r0) goto L_0x008f
            r0 = 29
            if (r1 == r0) goto L_0x008f
            if (r1 == r6) goto L_0x009d
            if (r1 == r7) goto L_0x008f
        L_0x004f:
            X.2rc r1 = X.AnonymousClass206.A00(r14)
            int r0 = r1.A08
            if (r0 == 0) goto L_0x005e
            int r0 = r1.A06
            if (r0 == 0) goto L_0x005e
            r2 = 1
            if (r12 != 0) goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            boolean r0 = X.AnonymousClass745.A00
            if (r0 == 0) goto L_0x007c
            X.21V r0 = r4.A0y
            if (r0 == 0) goto L_0x007c
            X.205 r1 = r14.A0v
            X.205 r0 = r0.A0v
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007c
            if (r2 != 0) goto L_0x0077
            X.7RT r0 = r4.A0B
            if (r0 != 0) goto L_0x007c
        L_0x0077:
            r4.A1d = r3
            com.whatsapp.mediaview.MediaViewFragment.A0H(r4)
        L_0x007c:
            X.7RT r1 = r4.A0B
            if (r1 == 0) goto L_0x000c
            java.lang.Object r0 = r11.A02
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r1.A01(r0, r14)
            return
        L_0x0088:
            java.lang.Object r0 = r11.A02
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r0.A0K = r8
            goto L_0x004f
        L_0x008f:
            java.lang.Object r2 = r11.A02
            com.whatsapp.mediaview.PhotoView r2 = (com.whatsapp.mediaview.PhotoView) r2
            r1 = 19
            X.787 r0 = new X.787
            r0.<init>(r11, r14, r1)
            r2.A0K = r0
            goto L_0x004f
        L_0x009d:
            java.lang.Object r1 = r11.A02
            com.whatsapp.mediaview.PhotoView r1 = (com.whatsapp.mediaview.PhotoView) r1
            X.6AA r0 = new X.6AA
            r0.<init>(r11, r14)
            r1.A0K = r0
            goto L_0x004f
        L_0x00a9:
            int r0 = r14.A0u
            if (r0 == r3) goto L_0x00cd
            if (r0 == r2) goto L_0x00c1
            if (r0 == r5) goto L_0x00d9
            if (r0 == r9) goto L_0x00c1
            if (r0 == r6) goto L_0x00b8
            if (r0 == r7) goto L_0x00b8
            goto L_0x0039
        L_0x00b8:
            java.lang.Object r0 = r11.A02
            com.whatsapp.mediaview.PhotoView r0 = (com.whatsapp.mediaview.PhotoView) r0
            r0.A0B(r8)
            goto L_0x0039
        L_0x00c1:
            java.lang.Object r10 = r11.A02
            com.whatsapp.mediaview.PhotoView r10 = (com.whatsapp.mediaview.PhotoView) r10
            android.content.Context r1 = r4.A14()
            r0 = 2131232400(0x7f080690, float:1.8080908E38)
            goto L_0x00e4
        L_0x00cd:
            java.lang.Object r10 = r11.A02
            com.whatsapp.mediaview.PhotoView r10 = (com.whatsapp.mediaview.PhotoView) r10
            android.content.Context r1 = r4.A14()
            r0 = 2131231023(0x7f08012f, float:1.8078115E38)
            goto L_0x00e4
        L_0x00d9:
            java.lang.Object r10 = r11.A02
            com.whatsapp.mediaview.PhotoView r10 = (com.whatsapp.mediaview.PhotoView) r10
            android.content.Context r1 = r4.A14()
            r0 = 2131232458(0x7f0806ca, float:1.8081026E38)
        L_0x00e4:
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r1, r0)
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7NG.CMa(android.graphics.Bitmap, android.view.View, X.206):void");
    }

    public void CN4(View view) {
        if (this.A00 == 0) {
            PhotoView photoView = (PhotoView) this.A02;
            photoView.A0I = null;
            photoView.A04 = 0.0f;
        }
    }

    public /* synthetic */ void BuW() {
    }

    public AnonymousClass7NG(MediaViewFragment mediaViewFragment, PhotoView photoView) {
        this.A00 = 0;
        this.A01 = mediaViewFragment;
        this.A02 = photoView;
    }
}
