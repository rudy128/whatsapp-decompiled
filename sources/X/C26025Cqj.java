package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.whatsapp.videoplayback.BloksVideoPlayerView;
import com.whatsapp.videoplayback.VideoSurfaceView;
import java.io.File;
import java.math.BigDecimal;

/* renamed from: X.Cqj  reason: case insensitive filesystem */
public class C26025Cqj {
    public final AnonymousClass1L8 A00;
    public final AnonymousClass1KB A01;
    public final C187619g6 A02;
    public final AnonymousClass11C A03;
    public final C18000vb A04;
    public final C18030ve A05;
    public final AnonymousClass1L4 A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public static void A01(CQS cqs, float f, float f2, float f3) {
        if (cqs != null) {
            double d = (double) f3;
            BigDecimal bigDecimal = new BigDecimal(((double) Math.round(((double) f) / d)) * d);
            BigDecimal bigDecimal2 = new BigDecimal(((double) Math.round(((double) f2) / d)) * d);
            float floatValue = bigDecimal.floatValue();
            float floatValue2 = bigDecimal2.floatValue();
            DFL dfl = cqs.A01;
            E8A e8a = cqs.A02;
            DOZ doz = cqs.A00;
            C20046A4p a4p = new C20046A4p();
            a4p.A03(C25343Ce2.A00((double) floatValue), 0);
            a4p.A03(C25343Ce2.A00((double) floatValue2), 1);
            C26209Cul.A03(doz, dfl, a4p, e8a);
        }
    }

    public void A04(ImageView imageView, byte[] bArr) {
        Bitmap decodeByteArray;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT <= 23) {
            Context context = imageView.getContext();
            C18070vi.A0d(context, 0);
            Point point = new Point();
            AnonymousClass11C.A01(context).getDefaultDisplay().getSize(point);
            if (C108965cb.A03(context).orientation == 2 && (i = point.x) < (i2 = point.y)) {
                point.y = i;
                point.x = i2;
            }
            int dimensionPixelSize = point.y - (context.getResources().getDimensionPixelSize(2131165186) + C87344Vf.A01(context, AnonymousClass11C.A01(context)));
            point.y = dimensionPixelSize;
            int i3 = point.x;
            decodeByteArray = AnonymousClass204.A0C(new AnonymousClass25O(new BitmapFactory.Options(), Long.valueOf(C19620yd.A00 / 32), i3, dimensionPixelSize, false), bArr).A02;
        } else {
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        imageView.setImageBitmap(decodeByteArray);
    }

    public C26025Cqj(AnonymousClass1L8 r1, AnonymousClass1KB r2, C187619g6 r3, AnonymousClass11C r4, C18000vb r5, C18030ve r6, AnonymousClass1L4 r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A08 = r9;
        this.A09 = r10;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r3.length() <= 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(com.google.android.material.textfield.TextInputEditText r3, com.google.android.material.textfield.TextInputLayout r4, boolean r5) {
        /*
            android.text.Editable r3 = r3.getText()
            X.BIm r0 = r4.A15
            int r1 = r0.A01
            r0 = 2
            if (r1 == r0) goto L_0x000d
            if (r1 != 0) goto L_0x0032
        L_0x000d:
            r2 = 0
            if (r5 == 0) goto L_0x0019
            if (r3 == 0) goto L_0x0019
            int r1 = r3.length()
            r0 = 1
            if (r1 > 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r4.setEndIconVisible(r0)
            if (r5 == 0) goto L_0x0032
            r0 = 2131231384(0x7f080298, float:1.8078847E38)
            r4.setEndIconDrawable((int) r0)
            r0 = 2131898780(0x7f12319c, float:1.9432487E38)
            r4.setEndIconContentDescription((int) r0)
            r4.setEndIconCheckable(r2)
            r0 = 0
            r4.setEndIconTintList(r0)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26025Cqj.A00(com.google.android.material.textfield.TextInputEditText, com.google.android.material.textfield.TextInputLayout, boolean):void");
    }

    public void A02(View view) {
        BloksVideoPlayerView bloksVideoPlayerView = (BloksVideoPlayerView) view.findViewById(2131436764);
        AnonymousClass70X r0 = bloksVideoPlayerView.A0A;
        if (r0 != null) {
            r0.A0F();
        }
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = bloksVideoPlayerView.A00;
        if (onScrollChangedListener != null) {
            bloksVideoPlayerView.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
        bloksVideoPlayerView.A00 = null;
    }

    public void A03(View view, String str, boolean z) {
        int i;
        File A002;
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) AnonymousClass1HF.A06(view, 2131436771);
        View A062 = AnonymousClass1HF.A06(view, 2131432166);
        View A063 = AnonymousClass1HF.A06(view, 2131433885);
        String str2 = null;
        if (!TextUtils.isEmpty(str) && (A002 = ((C189369iy) this.A08.get()).A00(str)) != null) {
            str2 = A002.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(str2)) {
            videoSurfaceView.setVideoPath(str2);
        }
        videoSurfaceView.A0A = new AnonymousClass75U(A062, 0);
        videoSurfaceView.A08 = new AnonymousClass75Q(A063, 0);
        A063.setOnClickListener(new AnonymousClass78Q((Object) A063, (Object) videoSurfaceView, 33));
        if (z) {
            videoSurfaceView.start();
            i = 8;
        } else {
            i = 0;
        }
        A063.setVisibility(i);
    }
}
