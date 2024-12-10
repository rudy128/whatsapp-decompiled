package com.whatsapp.webpagepreview;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass204;
import X.AnonymousClass210;
import X.AnonymousClass25O;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3PR;
import X.AnonymousClass6g9;
import X.AnonymousClass7RN;
import X.BVM;
import X.C108355bZ;
import X.C108905cU;
import X.C143887Fe;
import X.C17890vO;
import X.C17970vW;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C21429Ajw;
import X.C27641Ww;
import X.C27831Xu;
import X.C28931bI;
import X.C32011gU;
import X.C32981i4;
import X.C36391no;
import X.C40501uo;
import X.C43251zV;
import X.C43351zf;
import X.C43421zm;
import X.C50882Wd;
import X.C63712tZ;
import X.C72453Mb;
import X.C72463Mc;
import X.C72513Mi;
import X.C74613c2;
import X.C75363hK;
import X.C75373hL;
import X.C87504Vv;
import X.C88584aA;
import X.C98664rW;
import X.CUR;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class WebPagePreviewView extends AnonymousClass3PR implements C108905cU {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public ImageView A06;
    public ImageView A07;
    public LinearLayout A08;
    public ProgressBar A09;
    public ShimmerFrameLayout A0A;
    public ShimmerFrameLayout A0B;
    public AnonymousClass1KB A0C;
    public WaImageView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public WaTextView A0G;
    public C108355bZ A0H;
    public ThumbnailButton A0I;
    public ThumbnailButton A0J;
    public ThumbnailButton A0K;
    public C18000vb A0L;
    public C36391no A0M;
    public C32981i4 A0N;
    public AnonymousClass1KW A0O;
    public C18030ve A0P;
    public C32011gU A0Q;
    public C28931bI A0R;
    public AnonymousClass10I A0S;
    public View A0T;
    public View A0U;
    public View A0V;
    public View A0W;
    public ImageView A0X;
    public ImageView A0Y = null;
    public ProgressBar A0Z;
    public TextView A0a;
    public C28931bI A0b;
    public final int A0c = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131167236);
    public final int A0d = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131167237);
    public final Handler A0e = C17890vO.A0D();

    public static void A04(Bitmap bitmap, ThumbnailButton thumbnailButton, WebPagePreviewView webPagePreviewView, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, int i, int i2, boolean z, boolean z2, boolean z3) {
        ThumbnailButton thumbnailButton2 = thumbnailButton;
        WebPagePreviewView webPagePreviewView2 = webPagePreviewView;
        int i3 = i2;
        boolean z4 = z2;
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0) {
            if (z) {
                atomicBoolean.set(true);
                webPagePreviewView2.setImageThumbWithCtwaDrawable(thumbnailButton);
            } else {
                if (z2) {
                    webPagePreviewView2.A0K.setImageDrawable((Drawable) null);
                    webPagePreviewView2.A0K.setVisibility(8);
                    webPagePreviewView2.A0D.setVisibility(8);
                } else {
                    webPagePreviewView2.A0F();
                }
                atomicBoolean2.set(false);
            }
        } else if (z2) {
            webPagePreviewView2.setImageThumbWithBitmap(bitmap);
        } else {
            webPagePreviewView2.A0J.setImageBitmap(bitmap);
            webPagePreviewView2.A0D.setAlpha(0.0f);
            webPagePreviewView2.setImageThumbContentIndicator(i2);
        }
        webPagePreviewView2.A08(thumbnailButton2, i3, i, atomicBoolean.get(), z3, atomicBoolean2.get(), z4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r28 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r12 != 7) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r5.A0I();
        r5.setupProfileImageView(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r24 != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r23 != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r21 > 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        r5.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r12 == 2) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r12 != 3) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0P, 4272) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r5.setExternalShareIconOverlayOnThumbnail(r5.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        r5.A0L(r12);
        A09(r5.A0K, r5, r9, r4, r11, r12, r26, r13, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r28 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r20 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r5.A0P, 12064) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(com.whatsapp.webpagepreview.WebPagePreviewView r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.List r19, byte[] r20, int r21, int r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            r5 = r14
            r14 = r27
            r6 = r15
            r15 = r28
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r21
            r12 = r22
            r13 = r23
            A0C(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r25 != 0) goto L_0x0070
            r4 = r20
            if (r20 == 0) goto L_0x0020
            r3 = 1
            if (r28 != 0) goto L_0x0023
        L_0x0020:
            r3 = 0
            if (r20 == 0) goto L_0x003b
        L_0x0023:
            X.0ve r2 = r5.A0P
            r1 = 12064(0x2f20, float:1.6905E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x003b
            if (r28 == 0) goto L_0x003b
            r0 = 7
            if (r12 != r0) goto L_0x003b
            r5.A0I()
            r5.setupProfileImageView(r4)
        L_0x003a:
            return
        L_0x003b:
            if (r24 != 0) goto L_0x003f
            if (r3 == 0) goto L_0x005e
        L_0x003f:
            if (r23 != 0) goto L_0x005e
            if (r21 > 0) goto L_0x005e
            r5.A0G()
            r0 = 2
            if (r12 == r0) goto L_0x0058
            r0 = 3
            if (r12 != r0) goto L_0x003a
            X.0ve r2 = r5.A0P
            r1 = 4272(0x10b0, float:5.986E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x003a
        L_0x0058:
            android.widget.FrameLayout r0 = r5.A04
            r5.setExternalShareIconOverlayOnThumbnail(r0)
            return
        L_0x005e:
            r5.A0L(r12)
            com.whatsapp.components.button.ThumbnailButton r0 = r5.A0K
            r8 = 1
            r6 = r26
            r1 = r5
            r2 = r9
            r3 = r4
            r4 = r11
            r5 = r12
            r7 = r13
            A09(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0070:
            r5.A0J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webpagepreview.WebPagePreviewView.A0D(com.whatsapp.webpagepreview.WebPagePreviewView, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, byte[], int, int, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0P(C143887Fe r17, List list, boolean z) {
        int i;
        C143887Fe r1 = r17;
        String str = r1.A0B;
        String str2 = r1.A0A;
        byte[] bArr = r1.A0J;
        String str3 = r1.A0S;
        Integer num = r1.A07;
        AnonymousClass6g9 r0 = r1.A05;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        boolean A0L2 = r1.A0L();
        A0D(this, num, str, str2, str3, list, bArr, i, r1.A02, false, z, A0L2, r1 instanceof C75373hL, r1 instanceof C75363hK, false);
    }

    public void setVideoLargeLogo(int i) {
        if (i == 1 || i == 7) {
            this.A06.setVisibility(8);
            return;
        }
        this.A06.animate().cancel();
        this.A06.setVisibility(0);
        this.A06.setImageResource(C63712tZ.A00(i));
        this.A06.setAlpha(1.0f);
    }

    public static CUR A00(long j) {
        BVM bvm = new BVM();
        CUR cur = bvm.A00;
        cur.A0G = false;
        bvm.A01(0.75f);
        bvm.A05(0);
        bvm.A05(j);
        bvm.A02(0.3f);
        bvm.A04(0.1f);
        bvm.A06(300);
        cur.A03 = 0.0f;
        return bvm.A00();
    }

    public static String A01(String str) {
        if (str == null) {
            return null;
        }
        Pattern pattern = C50882Wd.A01;
        if (pattern == null) {
            pattern = Pattern.compile("\r\n|\r|\n| | ");
            C50882Wd.A01 = pattern;
        }
        String[] split = pattern.split(str);
        StringBuilder A10 = AnonymousClass000.A10();
        for (String trim : split) {
            String trim2 = trim.trim();
            if (!trim2.isEmpty()) {
                A10.append(trim2);
                A10.append("\n");
            }
        }
        return A10.toString().trim();
    }

    private void A02(int i) {
        A05(this.A0K, this, 0.0f, 500);
        A05(this.A0J, this, 1.0f, 500);
        if (i == 1) {
            A05(this.A0D, this, 1.0f, 500);
        }
    }

    public static void A05(View view, WebPagePreviewView webPagePreviewView, float f, int i) {
        view.animate().alpha(f).setDuration((long) i).setListener(new C72513Mi(view, webPagePreviewView, f)).setInterpolator(new AccelerateDecelerateInterpolator());
    }

    public static void A07(C143887Fe r13, WebPagePreviewView webPagePreviewView, boolean z) {
        int i;
        String str = r13.A0B;
        String str2 = r13.A0A;
        String str3 = r13.A0S;
        Integer num = r13.A07;
        AnonymousClass6g9 r0 = r13.A05;
        if (r0 != null) {
            i = r0.A00;
        } else {
            i = -1;
        }
        A0C(webPagePreviewView, num, str, str2, str3, (List) null, i, 0, false, r13 instanceof C75363hK, false);
        if (z) {
            AlphaAnimation A0Q2 = C72463Mc.A0Q();
            A0Q2.setDuration(250);
            A0Q2.setInterpolator(new AccelerateDecelerateInterpolator());
            C74613c2.A00(A0Q2, webPagePreviewView, 14);
            webPagePreviewView.A08.startAnimation(A0Q2);
            return;
        }
        webPagePreviewView.A08.animate().setListener((Animator.AnimatorListener) null).cancel();
        webPagePreviewView.A08.setAlpha(1.0f);
        webPagePreviewView.A08.setVisibility(0);
    }

    private void A08(ThumbnailButton thumbnailButton, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        ImageView.ScaleType scaleType;
        int i3;
        ImageView.ScaleType scaleType2;
        int i4 = this.A0d;
        int i5 = this.A0c;
        if (z2) {
            if (z4) {
                i4 = (i4 * 2) / 3;
                i5 = (i5 * 2) / 3;
            }
            i3 = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131167233);
            scaleType2 = ImageView.ScaleType.FIT_CENTER;
        } else if (z) {
            i3 = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131166387);
            scaleType2 = ImageView.ScaleType.CENTER_CROP;
        } else {
            if (i2 > 0) {
                scaleType = ImageView.ScaleType.CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            thumbnailButton.setScaleType(scaleType);
            i3 = 0;
            thumbnailButton.setPadding(i3, i3, i3, i3);
            thumbnailButton.getLayoutParams().width = i4;
            AnonymousClass3MX.A1F(thumbnailButton, i5);
            thumbnailButton.requestLayout();
            if (z3 && !z4) {
                A02(i);
                return;
            }
        }
        thumbnailButton.setScaleType(scaleType2);
        thumbnailButton.setPadding(i3, i3, i3, i3);
        thumbnailButton.getLayoutParams().width = i4;
        AnonymousClass3MX.A1F(thumbnailButton, i5);
        thumbnailButton.requestLayout();
        if (z3) {
        }
    }

    public static void A0A(WebPagePreviewView webPagePreviewView) {
        webPagePreviewView.A0e.removeCallbacksAndMessages((Object) null);
        webPagePreviewView.A0A.A01();
        webPagePreviewView.A0A.setBackground((Drawable) null);
    }

    public static void A0B(WebPagePreviewView webPagePreviewView) {
        webPagePreviewView.A0B.A05(A00(1000));
        ShimmerFrameLayout shimmerFrameLayout = webPagePreviewView.A0B;
        Handler handler = webPagePreviewView.A0e;
        handler.removeCallbacksAndMessages((Object) null);
        handler.postDelayed(new C21429Ajw(shimmerFrameLayout, 0), 300);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (r6 != null) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(com.whatsapp.webpagepreview.WebPagePreviewView r9, java.lang.Integer r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.List r14, int r15, int r16, boolean r17, boolean r18, boolean r19) {
        /*
            X.1i4 r0 = r9.A0N
            boolean r8 = r0.A0J(r13)
            boolean r7 = X.C87504Vv.A01(r13)
            X.1i4 r0 = r9.A0N
            boolean r5 = r0.A0I(r13)
            if (r7 == 0) goto L_0x001a
            android.content.Context r0 = r9.getContext()
            java.lang.String r12 = X.C29551cT.A01(r0, r10, r12)
        L_0x001a:
            if (r5 == 0) goto L_0x013b
            if (r13 == 0) goto L_0x013b
            android.net.Uri r0 = android.net.Uri.parse(r13)
            java.util.List r1 = r0.getPathSegments()
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x013b
            r0 = 0
            java.lang.String r1 = X.C17880vN.A0w(r1, r0)
            java.lang.String r0 = "video"
            boolean r2 = r1.equals(r0)
            android.content.Context r1 = r9.getContext()
            r0 = 2131898570(0x7f1230ca, float:1.9432061E38)
            if (r2 == 0) goto L_0x0043
            r0 = 2131898569(0x7f1230c9, float:1.943206E38)
        L_0x0043:
            java.lang.String r6 = r1.getString(r0)
            if (r6 == 0) goto L_0x013b
        L_0x0049:
            r2 = 0
            r9.setImageProgressBarVisibility(r2)
            if (r15 <= 0) goto L_0x00f2
            com.whatsapp.WaTextView r1 = r9.A0F
            r0 = 2131890781(0x7f12125d, float:1.9416263E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r9.A0E
            r0 = 8
            r1.setVisibility(r0)
        L_0x005e:
            if (r18 == 0) goto L_0x00a3
            android.content.Context r2 = r9.getContext()
            r0 = 2131896133(0x7f122745, float:1.9427119E38)
            java.lang.String r0 = r2.getString(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r0 = 2131232302(0x7f08062e, float:1.808071E38)
            r1 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r2, r0)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass4aX.A05(r2, r0, r1)
            com.whatsapp.WaTextView r1 = r9.A0G
            android.text.TextPaint r0 = r1.getPaint()
            java.lang.CharSequence r0 = X.C72813Np.A03(r0, r2, r3)
            r1.setText(r0)
        L_0x008b:
            r9.setLinkGifSize(r15)
            android.widget.LinearLayout r1 = r9.A08
            if (r7 == 0) goto L_0x009e
            X.0vb r0 = r9.A0L
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
        L_0x0098:
            r0 = r0 ^ 1
            r1.setLayoutDirection(r0)
            return
        L_0x009e:
            boolean r0 = X.C27641Ww.A0D(r6)
            goto L_0x0098
        L_0x00a3:
            if (r7 != 0) goto L_0x00f0
            if (r8 != 0) goto L_0x00f0
            if (r5 != 0) goto L_0x00f0
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00f0
            X.0ve r5 = r9.A0P
            X.1gU r0 = r9.A0Q
            X.C18070vi.A0d(r5, r2)
            X.C18070vi.A0j(r0, r13)
            java.lang.String r4 = X.AnonymousClass2VB.A00(r0, r13)
            if (r4 == 0) goto L_0x00d7
            java.lang.String r3 = "www."
            boolean r0 = X.AnonymousClass1YE.A0A(r4, r3, r2)
            if (r0 == 0) goto L_0x00d7
            r1 = 9584(0x2570, float:1.343E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x00d7
            java.lang.String r0 = ""
            java.lang.String r4 = X.AnonymousClass1YE.A06(r4, r3, r0)
        L_0x00d7:
            if (r19 == 0) goto L_0x00ec
            com.whatsapp.WaTextView r1 = r9.A0F
            r0 = 3
            r1.setMaxLines(r0)
            com.whatsapp.WaTextView r2 = r9.A0E
            r1 = 7
            r0 = 6
            r3 = r16
            if (r3 != r1) goto L_0x00e9
            r0 = 24
        L_0x00e9:
            r2.setMaxLines(r0)
        L_0x00ec:
            r9.setLinkHostname(r4)
            goto L_0x008b
        L_0x00f0:
            r4 = 0
            goto L_0x00ec
        L_0x00f2:
            r4 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r3 = 8
            if (r0 == 0) goto L_0x010d
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x010d
        L_0x0101:
            com.whatsapp.WaTextView r0 = r9.A0F
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r9.A0E
            r0.setVisibility(r3)
            goto L_0x005e
        L_0x010d:
            if (r19 == 0) goto L_0x011f
            android.widget.LinearLayout$LayoutParams r1 = X.AnonymousClass3Ma.A0D()
            int r0 = X.C72463Mc.A05(r9)
            r1.setMargins(r2, r0, r2, r2)
            com.whatsapp.WaTextView r0 = r9.A0E
            r0.setLayoutParams(r1)
        L_0x011f:
            if (r17 != 0) goto L_0x0101
            if (r19 == 0) goto L_0x012b
            java.lang.String r4 = A01(r6)
            java.lang.String r12 = A01(r12)
        L_0x012b:
            com.whatsapp.WaTextView r1 = r9.A0F
            r0 = 150(0x96, float:2.1E-43)
            r9.A06(r1, r4, r14, r0)
            com.whatsapp.WaTextView r1 = r9.A0E
            r0 = 300(0x12c, float:4.2E-43)
            r9.A06(r1, r12, r14, r0)
            goto L_0x005e
        L_0x013b:
            r6 = r11
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webpagepreview.WebPagePreviewView.A0C(com.whatsapp.webpagepreview.WebPagePreviewView, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, boolean, boolean, boolean):void");
    }

    private void setExternalShareIconOverlayOnThumbnail(FrameLayout frameLayout) {
        ImageView imageView = this.A0Y;
        if (imageView == null) {
            this.A0Y = C72453Mb.A0U(this);
            Drawable A002 = C40501uo.A00(AnonymousClass3Ma.A06(this), getResources(), 2131232222);
            this.A0Y.setImageDrawable(A002);
            C27831Xu.A0C(A002, -1);
            ShapeDrawable A0P2 = C72453Mb.A0P();
            A0P2.getPaint().setColor(-16777216);
            A0P2.getPaint().setStyle(Paint.Style.FILL);
            A0P2.getPaint().setStrokeWidth(2.0f);
            A0P2.setAlpha(152);
            A0P2.setBounds(0, 0, 128, 128);
            this.A0Y.setBackground(A0P2);
            this.A0Y.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.A0Y.setPadding(32, 32, 32, 32);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(128, 128);
            layoutParams.gravity = 17;
            frameLayout.addView(this.A0Y, layoutParams);
            return;
        }
        imageView.setVisibility(0);
    }

    private void setImageThumbContentIndicator(int i) {
        WaImageView waImageView = this.A0D;
        int i2 = 8;
        if (i == 1) {
            i2 = 0;
        }
        waImageView.setVisibility(i2);
    }

    private void setImageThumbWithBitmap(Bitmap bitmap) {
        this.A0K.setImageBitmap(bitmap);
        this.A0K.setVisibility(0);
    }

    private void setupProfileImageView(byte[] bArr) {
        this.A0S.CGF(new AnonymousClass7RN(this, bArr, 41));
    }

    public void A0F() {
        this.A0e.removeCallbacksAndMessages((Object) null);
        this.A0B.A01();
        this.A0B.setVisibility(8);
        this.A0J.setVisibility(8);
    }

    public void A0G() {
        this.A05.setVisibility(8);
        this.A04.setVisibility(0);
        this.A0B.setVisibility(0);
        this.A0K.setVisibility(8);
        this.A0D.setVisibility(8);
        ImageView imageView = this.A0Y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.A0R.A04(8);
    }

    public void A0H() {
        this.A0U.setVisibility(0);
        this.A05.setVisibility(8);
        this.A04.setVisibility(8);
        C27641Ww.A05(this.A0F, this.A0L, 0, AnonymousClass000.A0Y(this).getDimensionPixelSize(2131166335));
    }

    public void A0I() {
        this.A05.setVisibility(8);
        this.A04.setVisibility(8);
        this.A0B.setVisibility(8);
        this.A0K.setVisibility(8);
        this.A0D.setVisibility(8);
        ImageView imageView = this.A0Y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void A0J() {
        this.A05.setVisibility(0);
        this.A04.setVisibility(8);
        this.A0B.setVisibility(0);
        this.A0K.setVisibility(8);
        this.A0D.setVisibility(8);
        this.A0R.A04(8);
    }

    public void A0K(float f, float f2, float f3, float f4) {
        Boolean bool = C17970vW.A03;
        this.A09.setAlpha(f);
        this.A00.setAlpha(f2);
        this.A06.setAlpha(f2);
        this.A01.setAlpha(f3);
        this.A02.setAlpha(f4);
    }

    public void A0L(int i) {
        this.A05.setVisibility(8);
        this.A04.setVisibility(8);
        this.A0B.setVisibility(0);
        this.A0K.setVisibility(0);
        setImageThumbContentIndicator(i);
        this.A0R.A04(8);
    }

    public void A0M(int i, int i2) {
        this.A04.getLayoutParams().width = i;
        AnonymousClass3MX.A1F(this.A04, i2);
        this.A04.requestLayout();
    }

    public void A0Q(AnonymousClass210 r11, String str) {
        A0L(r11.A01);
        String A022 = this.A0Q.A02(r11.A17());
        Set BX2 = this.A0M.BX2(r11.A0I(), r11, str);
        byte[] A1A = r11.A1A();
        boolean A1W = AnonymousClass000.A1W(BX2);
        int i = r11.A01;
        if (A1A != null) {
            this.A0P.A0N(12064);
        }
        A0L(i);
        A09(this.A0K, this, A022, A1A, -1, i, false, A1W, true);
    }

    public void A0R(boolean z, boolean z2) {
        ThumbnailButton thumbnailButton;
        if (z2) {
            thumbnailButton = this.A0J;
        } else {
            thumbnailButton = this.A0K;
        }
        int i = 0;
        thumbnailButton.setVisibility(C72453Mb.A07(z ? 1 : 0));
        if (!z2) {
            WaImageView waImageView = this.A0D;
            if (!z) {
                i = 8;
            }
            waImageView.setVisibility(i);
        }
    }

    public WaImageView getFaviconThumbView() {
        return (WaImageView) this.A0b.A02();
    }

    public ThumbnailButton getImageLargeThumb() {
        return this.A0I;
    }

    public ThumbnailButton getImageThumb() {
        return this.A0K;
    }

    public WaTextView getSnippetView() {
        return this.A0E;
    }

    public int getTitleSnippetUrlLayoutHeight() {
        return this.A08.getHeight();
    }

    public WaTextView getUrlView() {
        return this.A0G;
    }

    public ImageView getVideoLargeThumb() {
        return this.A07;
    }

    public FrameLayout getVideoLargeThumbFrame() {
        return this.A05;
    }

    public void setImageCancelClickListener(View.OnClickListener onClickListener) {
        this.A0U.setOnClickListener(onClickListener);
    }

    public void setImageContentBackgroundResource(int i) {
        this.A03.setBackgroundResource(i);
    }

    public void setImageContentClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public void setImageContentEnabled(boolean z) {
        this.A03.setEnabled(z);
    }

    public void setImageContentMinimumHeight(int i) {
        this.A03.setMinimumHeight(i);
    }

    public void setImageLargeLogo(int i) {
        ImageView imageView = this.A0X;
        if (i != 0) {
            imageView.setVisibility(0);
            this.A0V.setVisibility(0);
            ImageView imageView2 = this.A0X;
            int i2 = 2131232205;
            if (i != 1) {
                i2 = 2131232208;
                if (i != 2) {
                    i2 = -1;
                }
            }
            imageView2.setImageResource(i2);
            return;
        }
        imageView.setVisibility(8);
        this.A0V.setVisibility(8);
    }

    public void setImageLargeThumbFrameHeight(int i) {
        AnonymousClass3MX.A1F(this.A04, i);
    }

    public void setImageLargeThumbWithBackground(int i) {
        this.A0I.setBackgroundColor(i);
        this.A0I.setImageDrawable((Drawable) null);
    }

    public void setImageLargeThumbWithBitmap(Bitmap bitmap) {
        this.A0I.setImageBitmap(bitmap);
        this.A0I.setVisibility(0);
    }

    public void setImagePlayFrameVisibility(boolean z) {
        this.A0W.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void setImageProgressBarVisibility(boolean z) {
        this.A0Z.setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public void setLargeThumbSizeWidthMatchParent(boolean z) {
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
            layoutParams.width = -1;
            this.A05.setLayoutParams(layoutParams);
            return;
        }
        this.A04.getLayoutParams().width = -1;
        this.A04.requestLayout();
    }

    public void setLinkGifSize(int i) {
        View view = this.A0T;
        if (i > 0) {
            view.setVisibility(0);
            this.A0a.setVisibility(0);
            this.A0a.setText(C88584aA.A02(this.A0L, (long) i));
            return;
        }
        view.setVisibility(8);
        this.A0a.setVisibility(8);
    }

    public void setLinkSnippet(CharSequence charSequence) {
        WaTextView waTextView = this.A0E;
        if (charSequence == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0E.setText(charSequence);
    }

    public void setLinkTitle(CharSequence charSequence) {
        WaTextView waTextView = this.A0F;
        if (charSequence == null) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0F.setText(charSequence);
    }

    public void setLinkTitleTypeface(int i) {
        WaTextView waTextView = this.A0F;
        getContext();
        waTextView.setTypeface(C43421zm.A01(), i);
    }

    public void setVideoLargeThumbFrameHeight(int i) {
        AnonymousClass3MX.A1F(this.A05, i);
    }

    public void setVideoLargeThumbWithBackground(int i) {
        this.A07.setBackgroundColor(i);
        this.A07.setImageDrawable((Drawable) null);
    }

    public void setVideoLargeThumbWithBitmap(Bitmap bitmap) {
        this.A07.setImageBitmap(bitmap);
        this.A07.setVisibility(0);
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context);
    }

    private void A03(Context context) {
        View.inflate(context, 2131627603, this);
        this.A03 = AnonymousClass3MW.A0C(this, 2131432018);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) AnonymousClass1HF.A06(this, 2131436133);
        this.A0B = shimmerFrameLayout;
        shimmerFrameLayout.A01();
        this.A0B.A05((CUR) null);
        this.A0K = (ThumbnailButton) AnonymousClass1HF.A06(this, 2131436123);
        this.A0J = (ThumbnailButton) AnonymousClass1HF.A06(this, 2131436132);
        this.A0D = AnonymousClass3MW.A0R(this, 2131436131);
        this.A0W = AnonymousClass1HF.A06(this, 2131433889);
        this.A0Z = (ProgressBar) AnonymousClass1HF.A06(this, 2131434180);
        this.A0U = AnonymousClass1HF.A06(this, 2131428811);
        this.A0R = C28931bI.A00(this, 2131434138);
        this.A0b = C72453Mb.A0s(this, 2131436591);
        this.A05 = (FrameLayout) AnonymousClass1HF.A06(this, 2131431949);
        this.A07 = AnonymousClass3MW.A0G(this, 2131431948);
        this.A06 = AnonymousClass3MW.A0G(this, 2131432211);
        this.A09 = (ProgressBar) AnonymousClass1HF.A06(this, 2131431947);
        this.A00 = AnonymousClass1HF.A06(this, 2131433888);
        this.A01 = AnonymousClass1HF.A06(this, 2131431638);
        this.A02 = AnonymousClass1HF.A06(this, 2131431639);
        this.A04 = (FrameLayout) AnonymousClass1HF.A06(this, 2131437033);
        this.A0I = (ThumbnailButton) AnonymousClass1HF.A06(this, 2131437036);
        this.A0X = AnonymousClass3MW.A0G(this, 2131437034);
        this.A0V = AnonymousClass1HF.A06(this, 2131437035);
        this.A08 = AnonymousClass3MX.A0K(this, 2131436211);
        this.A0F = AnonymousClass3MW.A0T(this, 2131436208);
        this.A0E = AnonymousClass3MW.A0T(this, 2131435511);
        this.A0G = AnonymousClass3MW.A0T(this, 2131436587);
        this.A0T = AnonymousClass1HF.A06(this, 2131431138);
        this.A0a = AnonymousClass3MW.A0J(this, 2131431137);
        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) AnonymousClass1HF.A06(this, 2131431031);
        this.A0A = shimmerFrameLayout2;
        shimmerFrameLayout2.A01();
        this.A0A.A05((CUR) null);
        Drawable A022 = C27831Xu.A02(this.A0H.BS0(AnonymousClass00R.A01, 2, false).mutate());
        C27831Xu.A0C(A022, AnonymousClass3MZ.A02(getContext(), context, 2130971968, 2131103130));
        setForeground(A022);
        if (getId() == -1) {
            setId(2131432020);
        }
    }

    private void A06(WaTextView waTextView, String str, List list, int i) {
        if (!TextUtils.isEmpty(str)) {
            waTextView.setText(C43351zf.A01(AnonymousClass3MX.A04(waTextView, this, 0), this.A0L, C43251zV.A03(getContext(), waTextView.getPaint(), this.A0O, AnonymousClass1EG.A0C(str, i)), list));
            return;
        }
        waTextView.setVisibility(8);
    }

    public static void A09(ThumbnailButton thumbnailButton, WebPagePreviewView webPagePreviewView, String str, byte[] bArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        boolean A012 = C87504Vv.A01(str);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        float f = 0.0f;
        if (A012) {
            f = -1.0f;
        }
        ThumbnailButton thumbnailButton2 = thumbnailButton;
        thumbnailButton.A01 = f;
        Bitmap bitmap = null;
        thumbnailButton.setContentDescription((CharSequence) null);
        WebPagePreviewView webPagePreviewView2 = webPagePreviewView;
        int i3 = i;
        int i4 = i2;
        boolean z4 = z3;
        if (z2) {
            if (z3) {
                webPagePreviewView2.A0K.setImageDrawable((Drawable) null);
                webPagePreviewView2.A0K.setVisibility(8);
                webPagePreviewView2.A0D.setVisibility(8);
            } else {
                webPagePreviewView2.A0F();
            }
            atomicBoolean2.set(false);
        } else if (i > 0) {
            webPagePreviewView2.setImageThumbWithGifDownloadDrawable(thumbnailButton);
            atomicBoolean2.set(false);
            if (!z3) {
                webPagePreviewView2.A0K.animate().setListener((Animator.AnimatorListener) null).cancel();
                webPagePreviewView2.A0K.setAlpha(1.0f);
                webPagePreviewView2.A0K.setVisibility(8);
            }
            thumbnailButton.animate().setListener((Animator.AnimatorListener) null).cancel();
            thumbnailButton.setAlpha(1.0f);
        } else {
            C18030ve r2 = webPagePreviewView2.A0P;
            byte[] bArr2 = bArr;
            boolean z5 = z;
            if (r2 == null || !C18020vd.A05(C18040vf.A01, r2, 12375)) {
                if (bArr != null) {
                    bitmap = AnonymousClass204.A0C(new AnonymousClass25O(webPagePreviewView2.A0d, webPagePreviewView2.A0c), bArr2).A02;
                }
                A04(bitmap, thumbnailButton, webPagePreviewView, atomicBoolean, atomicBoolean2, i, i2, z, z4, A012);
                return;
            }
            webPagePreviewView2.A0S.CGF(new C98664rW(webPagePreviewView2, bArr2, thumbnailButton2, atomicBoolean, atomicBoolean2, i3, i4, 0, z5, z4, A012));
            return;
        }
        webPagePreviewView2.A08(thumbnailButton, i4, i3, atomicBoolean.get(), A012, atomicBoolean2.get(), z4);
    }

    private void setImageThumbWithCtwaDrawable(ThumbnailButton thumbnailButton) {
        Drawable A022 = C27831Xu.A02(getResources().getDrawable(2131232044));
        C27831Xu.A0C(A022, getResources().getColor(2131100290));
        thumbnailButton.setImageDrawable(A022);
        C72463Mc.A0x(thumbnailButton.getContext(), getResources(), thumbnailButton, 2130969308, 2131100289);
        thumbnailButton.setVisibility(0);
    }

    private void setImageThumbWithGifDownloadDrawable(ThumbnailButton thumbnailButton) {
        thumbnailButton.setImageDrawable(thumbnailButton.getResources().getDrawable(2131232495));
        AnonymousClass3MX.A1A(getContext(), thumbnailButton, 2131101292);
        AnonymousClass3MY.A0w(getContext(), thumbnailButton, 2131890781);
        thumbnailButton.setVisibility(0);
    }

    public void A0N(Bitmap bitmap, boolean z) {
        if (((long) bitmap.getWidth()) * ((long) bitmap.getHeight()) >= 5000000) {
            Log.e("webview/image too large", new Exception());
        }
        if (z) {
            setVideoLargeThumbWithBitmap(bitmap);
        } else {
            setImageLargeThumbWithBitmap(bitmap);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0.A00 <= 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(X.C143887Fe r3) {
        /*
            r2 = this;
            A0A(r2)
            X.6g9 r0 = r3.A05
            if (r0 == 0) goto L_0x000c
            int r0 = r0.A00
            r1 = 1
            if (r0 > 0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r0 = 1
            A07(r3, r2, r0)
            if (r1 == 0) goto L_0x0031
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A0J
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r1.setScaleType(r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A0J
            r0 = 0
            r1.setAlpha(r0)
            com.whatsapp.components.button.ThumbnailButton r1 = r2.A0J
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r2.A0J
            r2.setImageThumbWithGifDownloadDrawable(r0)
            int r0 = r3.A02
            r2.A02(r0)
            return
        L_0x0031:
            A0B(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.webpagepreview.WebPagePreviewView.A0O(X.7Fe):void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0e.removeCallbacksAndMessages((Object) null);
    }

    public void setLinkHostname(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        WaTextView waTextView = this.A0G;
        if (isEmpty) {
            waTextView.setVisibility(8);
            return;
        }
        waTextView.setVisibility(0);
        this.A0G.setText(AnonymousClass1EG.A0C(str, 150));
    }

    public WebPagePreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0E();
        A03(context);
    }

    public WebPagePreviewView(Context context) {
        super(context);
        A0E();
        A03(context);
    }
}
