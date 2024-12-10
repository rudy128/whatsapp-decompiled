package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.78w  reason: invalid class name and case insensitive filesystem */
public final class C1422878w implements View.OnTouchListener {
    public float A00;
    public float A01;
    public Bitmap A02;
    public FrameLayout A03;
    public ImageView A04;
    public boolean A05;
    public int A06 = -1;
    public final C109465dU A07;
    public final List A08 = AnonymousClass000.A13();
    public final View A09;
    public final ViewStub A0A;
    public final CIZ A0B;
    public final C22821Di A0C;

    public C1422878w(View view, ViewStub viewStub, C22821Di r8) {
        C18070vi.A0d(viewStub, 2);
        this.A09 = view;
        this.A0A = viewStub;
        this.A0C = r8;
        Resources resources = view.getResources();
        CIZ ciz = new CIZ(view.getContext(), new C109745dw(this), C17890vO.A0D());
        this.A0B = ciz;
        ciz.A00.setIsLongpressEnabled(false);
        C18070vi.A0b(resources);
        this.A07 = new C109465dU(resources);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x005f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r5 = 1
            X.C18070vi.A0d(r9, r5)
            int r1 = r9.getActionMasked()
            if (r1 == r5) goto L_0x0015
            r0 = 3
            if (r1 == r0) goto L_0x0015
        L_0x000d:
            X.CIZ r0 = r7.A0B
            android.view.GestureDetector r0 = r0.A00
            r0.onTouchEvent(r9)
            return r5
        L_0x0015:
            java.util.List r0 = r7.A08
            java.util.ArrayList r4 = X.C29351c6.A0D(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x001f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r0 = r6.next()
            X.6c8 r0 = (X.C126066c8) r0
            int r3 = r7.A06
            com.whatsapp.mediacomposer.MediaComposerFragment r2 = r0.A00
            r2.A2F()
            int r1 = r2.A00
            if (r1 == 0) goto L_0x0065
            if (r1 == r5) goto L_0x00a8
            r0 = 2
            if (r1 != r0) goto L_0x005f
            X.7JF r0 = r2.A0J
            if (r0 == 0) goto L_0x004e
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r0.A0L
            com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView r0 = r1.A02
            if (r0 == 0) goto L_0x004b
            r0.A04(r3)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent.A02(r1)
        L_0x004b:
            r1.A03()
        L_0x004e:
            X.8Ai r0 = r2.A29()
            if (r0 == 0) goto L_0x005f
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.6uj r0 = X.C108955ca.A0U(r0)
            if (r0 == 0) goto L_0x005f
            r0.A04()
        L_0x005f:
            X.1Wu r0 = X.C27621Wu.A00
            r4.add(r0)
            goto L_0x001f
        L_0x0065:
            X.7JF r1 = r2.A0J
            if (r1 == 0) goto L_0x005f
            X.5d1 r0 = r1.A04
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x005f
            X.5d1 r0 = r1.A04
            if (r0 == 0) goto L_0x007a
            r0.A01()
        L_0x007a:
            X.5d1 r0 = r1.A04
            if (r0 == 0) goto L_0x0081
            r0.show()
        L_0x0081:
            X.5d1 r0 = r1.A04
            if (r0 == 0) goto L_0x005f
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r2 = r0.A02
            X.6jM r0 = r2.A07
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "textEntryInfo"
        L_0x008d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0092:
            X.6pZ r1 = r0.A06
            r1.A03 = r3
            int r0 = r1.A02
            r1.A01(r3, r0)
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r2.A05
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "doodleEditText"
            goto L_0x008d
        L_0x00a2:
            r0.A0L(r3)
            com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView r0 = r2.A0A
            goto L_0x00d2
        L_0x00a8:
            X.7JF r1 = r2.A0J
            if (r1 == 0) goto L_0x005f
            X.5cz r0 = r1.A03
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x005f
            X.5cz r0 = r1.A03
            if (r0 == 0) goto L_0x00bd
            r0.show()
        L_0x00bd:
            X.5cz r2 = r1.A03
            if (r2 == 0) goto L_0x005f
            X.6UC r0 = r2.A0I
            r0.A00 = r3
            X.6z9 r1 = r2.A08
            java.lang.String r0 = "penDialogController"
            if (r1 == 0) goto L_0x008d
            int r0 = r1.A01
            r1.A01(r0, r3)
            com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView r0 = r2.A0B
        L_0x00d2:
            if (r0 == 0) goto L_0x005f
            r0.A04(r3)
            goto L_0x005f
        L_0x00d8:
            A00(r7)
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422878w.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static final void A00(C1422878w r2) {
        FrameLayout frameLayout = r2.A03;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            C72453Mb.A1D(r2.A03);
            FrameLayout frameLayout2 = r2.A03;
            if (frameLayout2 != null) {
                frameLayout2.setOnTouchListener((View.OnTouchListener) null);
            }
            Bitmap bitmap = r2.A02;
            if (bitmap != null) {
                bitmap.recycle();
                r2.A02 = null;
            }
        }
    }

    public static final void A01(C1422878w r6) {
        float f;
        float f2;
        Bitmap bitmap = r6.A02;
        if (bitmap != null) {
            ImageView imageView = r6.A04;
            if (imageView != null) {
                float x = imageView.getX();
                C109465dU r2 = r6.A07;
                f = x + ((float) ((r2.A05 / 2) + r2.A04 + r2.A02));
            } else {
                f = 0.0f;
            }
            float width = (float) (bitmap.getWidth() - 1);
            if (f > width) {
                f = width;
            }
            float f3 = 0.0f;
            if (0.0f < f) {
                f3 = f;
            }
            ImageView imageView2 = r6.A04;
            if (imageView2 != null) {
                float y = imageView2.getY();
                C109465dU r22 = r6.A07;
                f2 = y + (((float) r22.A03) - r22.A01);
            } else {
                f2 = 0.0f;
            }
            float height = (float) (bitmap.getHeight() - 1);
            if (f2 > height) {
                f2 = height;
            }
            float f4 = 0.0f;
            if (0.0f < f2) {
                f4 = f2;
            }
            int pixel = bitmap.getPixel((int) f3, (int) f4);
            r6.A06 = pixel;
            C109465dU r1 = r6.A07;
            r1.A07.setColor(pixel);
            r1.invalidateSelf();
            List list = r6.A08;
            ArrayList A0D = C29351c6.A0D(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
                A0D.add(C27621Wu.A00);
            }
        }
    }

    public static final void A02(C1422878w r3, float f) {
        FrameLayout frameLayout = r3.A03;
        if (frameLayout != null) {
            float f2 = (float) ((-frameLayout.getWidth()) / 2);
            float A002 = C108955ca.A00(frameLayout);
            if (f > A002) {
                f = A002;
            }
            if (f2 < f) {
                f2 = f;
            }
            r3.A00 = f2;
            ImageView imageView = r3.A04;
            if (imageView != null) {
                imageView.setTranslationX(f2);
            }
            ImageView imageView2 = r3.A04;
            if (imageView2 != null) {
                imageView2.setTranslationY(r3.A01);
            }
        }
    }

    public static final void A03(C1422878w r6, float f) {
        FrameLayout frameLayout = r6.A03;
        if (frameLayout != null) {
            float f2 = (float) ((-frameLayout.getHeight()) / 2);
            C109465dU r1 = r6.A07;
            float f3 = ((float) r1.A03) - r1.A01;
            float intrinsicHeight = (float) (r1.getIntrinsicHeight() / 2);
            float f4 = (f2 - f3) + intrinsicHeight;
            float A062 = (((float) C108945cZ.A06(frameLayout)) - f3) + intrinsicHeight;
            if (f > A062) {
                f = A062;
            }
            if (f4 < f) {
                f4 = f;
            }
            r6.A01 = f4;
            ImageView imageView = r6.A04;
            if (imageView != null) {
                imageView.setTranslationX(r6.A00);
            }
            ImageView imageView2 = r6.A04;
            if (imageView2 != null) {
                imageView2.setTranslationY(r6.A01);
            }
        }
    }

    public final void A04() {
        Bitmap bitmap = this.A02;
        if (bitmap == null || bitmap.isRecycled()) {
            this.A02 = C108995ce.A0H(this.A09);
        }
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            this.A0C.invoke(C108945cZ.A0I(bitmap2));
            ImageView imageView = this.A04;
            if (imageView != null) {
                if (imageView.isLaidOut()) {
                    A01(this);
                } else {
                    imageView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass797(imageView, this, 3));
                }
            }
            C72453Mb.A1C(this.A03);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r1 != null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r3 = this;
            java.util.List r0 = r3.A08
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x000a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            X.6c8 r0 = (X.C126066c8) r0
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A00
            r0.A2G()
            X.1Wu r0 = X.C27621Wu.A00
            r2.add(r0)
            goto L_0x000a
        L_0x0021:
            android.widget.FrameLayout r1 = r3.A03
            if (r1 != 0) goto L_0x0047
            android.view.ViewStub r0 = r3.A0A
            android.view.View r2 = r0.inflate()
            boolean r0 = r2 instanceof android.widget.FrameLayout
            r1 = 0
            if (r0 == 0) goto L_0x0043
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            if (r2 == 0) goto L_0x0043
            r0 = 2131430764(0x7f0b0d6c, float:1.8483238E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0G(r2, r0)
            X.5dU r0 = r3.A07
            r1.setImageDrawable(r0)
            r3.A04 = r1
            r1 = r2
        L_0x0043:
            r3.A03 = r1
            if (r1 == 0) goto L_0x004a
        L_0x0047:
            r1.setOnTouchListener(r3)
        L_0x004a:
            r0 = 0
            A02(r3, r0)
            A03(r3, r0)
            r3.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422878w.A05():void");
    }
}
