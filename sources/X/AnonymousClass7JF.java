package X;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.expressions.mediacomposer.ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import java.util.List;

/* renamed from: X.7JF  reason: invalid class name */
public final class AnonymousClass7JF implements AnonymousClass87S {
    public static final C131216kj A0j = new Object();
    public int A00;
    public int A01;
    public int A02;
    public C109205cz A03;
    public C109225d1 A04;
    public boolean A05;
    public boolean A06;
    public final Rect A07 = AnonymousClass3MW.A07();
    public final Handler A08;
    public final View A09;
    public final AnonymousClass1FL A0A;
    public final AnonymousClass1F9 A0B;
    public final AnonymousClass1FD A0C;
    public final AnonymousClass1T1 A0D;
    public final AnonymousClass11C A0E;
    public final C19830z4 A0F;
    public final C18000vb A0G;
    public final AnonymousClass74J A0H;
    public final C18030ve A0I;
    public final C136926ud A0J;
    public final MediaComposerFragment A0K;
    public final ColorPickerComponent A0L;
    public final AnonymousClass6UC A0M;
    public final C135796sm A0N;
    public final C1410073x A0O;
    public final DoodleView A0P;
    public final C1405671z A0Q;
    public final C139256yX A0R;
    public final C138576xJ A0S;
    public final C132036m4 A0T;
    public final C1419677q A0U;
    public final AnonymousClass70N A0V;
    public final C136986uj A0W;
    public final AnonymousClass71K A0X;
    public final C24641Lc A0Y;
    public final AnonymousClass1L4 A0Z;
    public final C18150vq A0a;
    public final AnonymousClass00H A0b;
    public final boolean A0c;
    public final AnonymousClass11P A0d;
    public final AnonymousClass6g1 A0e;
    public final AnonymousClass87S A0f;
    public final C138456x7 A0g;
    public final C20050A4v A0h;
    public final boolean A0i;

    public static final void A02(AnonymousClass7JF r6) {
        View rootView;
        View rootView2;
        C109205cz r2 = r6.A03;
        if (r2 != null) {
            boolean A012 = AnonymousClass112.A01();
            View findViewById = r2.findViewById(16908290);
            if (A012) {
                if (!(findViewById == null || (rootView2 = findViewById.getRootView()) == null)) {
                    rootView2.setForeground((Drawable) null);
                }
            } else if (!(findViewById == null || (rootView = findViewById.getRootView()) == null)) {
                AnonymousClass3MX.A1A(r6.A09.getContext(), rootView, 2131102739);
            }
        }
        C136926ud r5 = r6.A0J;
        r5.A04();
        r6.A0R.A02 = false;
        ColorPickerComponent colorPickerComponent = r6.A0L;
        ColorPickerView colorPickerView = colorPickerComponent.A01;
        if (colorPickerView != null) {
            ColorPickerView.A01(colorPickerView);
            colorPickerView.invalidate();
        }
        r6.A0V.A01 = null;
        DoodleView doodleView = r6.A0P;
        AnonymousClass6UC r22 = r6.A0M;
        doodleView.A03 = r22.A00;
        doodleView.invalidate();
        colorPickerComponent.setColorAndInvalidate(r22.A00);
        C136986uj r1 = r6.A0W;
        r1.A07(0);
        r1.A01 = r22.A00;
        r5.A03();
        A05(r6);
        r1.A04();
        C109005cf.A0m(colorPickerComponent, r22, r6);
    }

    public final void A0C(RectF rectF) {
        C18070vi.A0d(rectF, 0);
        if (!this.A0N.A02 || (rectF = this.A0Q.A07) != null) {
            C1405671z r2 = this.A0Q;
            r2.A08 = rectF;
            C1405671z.A01(r2);
            DoodleView doodleView = this.A0P;
            r2.A09 = AnonymousClass3Ma.A09(doodleView);
            C1410073x r0 = this.A0O;
            r0.A07();
            doodleView.requestLayout();
            r0.A06();
        }
    }

    public final void A0D(C1409773u r4) {
        this.A0P.A04(r4, 0);
        if (!A08(this)) {
            boolean A0S2 = r4.A0S();
            C136986uj r1 = this.A0W;
            if (A0S2) {
                r1.A07(2);
            } else {
                r1.A07(0);
            }
            r1.A01 = this.A0M.A00;
        }
    }

    public void C5O(C1409773u r2) {
        C18070vi.A0d(r2, 0);
        if (r2 instanceof AnonymousClass69Y) {
            this.A0f.C5O(r2);
        } else {
            A0D(r2);
        }
    }

    public static final void A00(AnonymousClass7JF r4) {
        C136986uj r3 = r4.A0W;
        if (r3.A0G.A09() != 0) {
            TitleBarView.A01(r3.A0I);
        }
        if (A08(r4)) {
            AnonymousClass72m r2 = (AnonymousClass72m) r4.A0a.get();
            ShapePickerView shapePickerView = r2.A0Q;
            shapePickerView.setVisibility(8);
            r2.A0W.A01(shapePickerView);
            if (shapePickerView.A02()) {
                shapePickerView.invalidate();
            }
            if (r2.A04) {
                r2.A0E.A2K();
            }
            r3.A0I.setToolbarExtraVisibility(8);
            r3.A08(C72453Mb.A06(AnonymousClass000.A1a(r4.A0V.A03.A00) ? 1 : 0));
            r4.A0J.A03();
            A05(r4);
        }
    }

    public static final void A01(AnonymousClass7JF r29) {
        Uri uri;
        int i;
        Intent intent;
        AnonymousClass7JF r5;
        AnonymousClass7JF r8 = r29;
        if (r8.A0P.A05()) {
            AnonymousClass696 r1 = (AnonymousClass696) r8.A0J;
            if (1 - r1.A00 == 0) {
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) r1.A01;
                C1419877s r12 = ((ImagePreviewContentLayout) AnonymousClass3MX.A14(imageComposerFragment.A0G)).A02;
                C146727Qj r9 = r12.A09;
                if (r9 != null) {
                    float f = r12.A04;
                    float f2 = r12.A01;
                    View view = r12.A0M;
                    r9.A00(f, f2, C108955ca.A00(view), (float) C108945cZ.A06(view), 200);
                }
                C160888Ai A29 = imageComposerFragment.A29();
                if (!(A29 == null || (uri = imageComposerFragment.A01) == null)) {
                    int i2 = 0;
                    String str = null;
                    boolean z = false;
                    Rect rect = null;
                    AnonymousClass1FL A1D = imageComposerFragment.A1D();
                    AnonymousClass73D r92 = ((MediaComposerActivity) A29).A1q;
                    Uri fromFile = Uri.fromFile(r92.A02(uri).A0C());
                    C18070vi.A0X(fromFile);
                    C218617r r4 = imageComposerFragment.A02;
                    if (r4 != null) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append(C17970vW.A04(uri.toString()));
                        Uri fromFile2 = Uri.fromFile(r4.A0a(AnonymousClass000.A0y("-crop", A10)));
                        C18070vi.A0X(fromFile2);
                        String obj = Bitmap.CompressFormat.JPEG.toString();
                        C18070vi.A0d(obj, 4);
                        AnonymousClass7JF r13 = imageComposerFragment.A0J;
                        if (r13 != null && AnonymousClass000.A1a(r13.A0V.A04) && !imageComposerFragment.A2U() && (r5 = imageComposerFragment.A0J) != null) {
                            C1405671z r42 = r5.A0Q;
                            RectF rectF = r42.A07;
                            RectF rectF2 = r42.A08;
                            if (!(rectF == null || rectF2 == null)) {
                                String A052 = r5.A0D.A00(rectF, rectF2, r5.A0V.A04, r42.A02).A05();
                                if (A052 != null) {
                                    str = A052;
                                }
                            }
                        }
                        AnonymousClass740 r14 = imageComposerFragment.A05;
                        if (r14 != null) {
                            i = r14.A01;
                        } else {
                            i = 0;
                        }
                        boolean z2 = imageComposerFragment.A0D;
                        C18030ve A28 = imageComposerFragment.A28();
                        int i3 = 1576;
                        if (z2) {
                            i3 = 2654;
                        }
                        int A002 = C18020vd.A00(C18040vf.A02, A28, i3);
                        AnonymousClass1FL A1B = imageComposerFragment.A1B();
                        if (!(A1B == null || (intent = A1B.getIntent()) == null || intent.getIntExtra("origin", 1) != 35)) {
                            i2 = 1;
                        }
                        Rect A053 = r92.A02(uri).A05();
                        if (A053 != null) {
                            rect = A053;
                        }
                        int A032 = ImageComposerFragment.A03(imageComposerFragment);
                        if (uri.getQueryParameter("flip-h") != null) {
                            z = true;
                        }
                        imageComposerFragment.A0A = true;
                        imageComposerFragment.startActivityForResult(AnonymousClass1LU.A0N(A1D, rect, fromFile, fromFile2, obj, (String) null, str, i2, i2, 0, 0, 0, A002, A032, i, false, false, z, false), 1);
                    } else {
                        C18070vi.A11("fMessageIO");
                        throw null;
                    }
                }
            }
            A00(r8);
            r8.A0R.A02 = false;
            r8.A0V.A01 = null;
            A05(r8);
        }
    }

    public static final void A03(AnonymousClass7JF r3) {
        View rootView;
        View rootView2;
        r3.A0W.A02();
        C109205cz r2 = r3.A03;
        if (r2 != null) {
            boolean A012 = AnonymousClass112.A01();
            View findViewById = r2.findViewById(16908290);
            if (A012) {
                if (findViewById != null && (rootView2 = findViewById.getRootView()) != null) {
                    rootView2.setForeground(C24261Jm.A00(r3.A09.getContext(), 2131231358));
                }
            } else if (findViewById != null && (rootView = findViewById.getRootView()) != null) {
                rootView.setBackgroundResource(2131231357);
            }
        }
    }

    public static final void A05(AnonymousClass7JF r4) {
        C136986uj r2 = r4.A0W;
        AnonymousClass7JS r1 = r2.A0G;
        if (r1.A09() != 0) {
            TitleBarView.A01(r2.A0I);
        }
        int i = 0;
        if (r1.A09() == 2) {
            C1409773u r12 = r4.A0V.A01;
            if (r12 == null || (!r12.A0T() && !r12.A0S())) {
                r4.A0L.A05(true);
                r4.A0J.A00();
                r2.A07(0);
                r4.A0A();
            } else {
                r4.A0L.A03();
            }
        }
        if (A08(r4)) {
            ColorPickerComponent colorPickerComponent = r4.A0L;
            ColorPickerView colorPickerView = colorPickerComponent.A01;
            if (colorPickerView != null) {
                colorPickerView.clearAnimation();
            }
            colorPickerComponent.A05(false);
        } else {
            if (!AnonymousClass000.A1a(r4.A0V.A03.A00)) {
                i = 4;
            }
            r2.A08(i);
        }
        boolean A1Z = AnonymousClass3MW.A1Z(r4.A0G);
        TitleBarView titleBarView = r2.A0I;
        RelativeLayout toolbarExtra = titleBarView.getToolbarExtra();
        View startingViewFromToolbarExtra = titleBarView.getStartingViewFromToolbarExtra();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) toolbarExtra.getLayoutParams();
        layoutParams.addRule(A1Z ^ true ? 1 : 0, startingViewFromToolbarExtra.getId());
        toolbarExtra.setLayoutParams(layoutParams);
    }

    public static final void A06(AnonymousClass7JF r5, float f, int i) {
        C1417976z r4 = new C1417976z(i, f);
        AnonymousClass6g1 r3 = r5.A0e;
        AnonymousClass3MX.A1Q(new ShapeStickerLayoutDataProvider$setShapeStickerLayoutDataSync$1(r4, r3, (C30391dr) null), r3.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0081, code lost:
        if (r8.A05() == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.AnonymousClass7JF r16, X.AnonymousClass69c r17) {
        /*
            r6 = r16
            X.1FL r4 = r6.A0A
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x00d2
            A00(r6)
            X.6ud r8 = r6.A0J
            r8.A04()
            X.6yX r0 = r6.A0R
            r3 = 0
            r0.A02 = r3
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r6.A0L
            r0.A05(r3)
            X.1L4 r0 = r6.A0Z
            com.whatsapp.mediacomposer.doodle.DoodleView r2 = r6.A0P
            r0.A02(r2)
            android.view.View r9 = r6.A09
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r9)
            r0 = 2131625145(0x7f0e04b9, float:1.887749E38)
            android.view.View r1 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r1 = r1.findViewById(r0)
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r1 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r1
            X.1Lc r0 = r6.A0Y
            X.0ve r7 = r0.A01
            r5 = 7952(0x1f10, float:1.1143E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r5)
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L_0x004a
            r12 = -1
        L_0x004a:
            r5 = r17
            if (r17 == 0) goto L_0x00d3
            java.lang.String r10 = r5.A0C
            float r11 = r5.A07
            android.graphics.Paint r0 = r5.A05
            int r12 = r0.getColor()
            int r13 = r5.A09
            int r14 = r5.A0A
            X.6pZ r0 = r5.A0G
            int r15 = r0.A02
            int r0 = r5.A08
        L_0x0062:
            X.6jM r9 = new X.6jM
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r0 = r9.A01
            r6.A02 = r0
            int r0 = r9.A03
            r6.A00 = r0
            X.6pZ r0 = r9.A06
            int r0 = r0.A02
            r6.A01 = r0
            boolean r0 = r6.A0c
            if (r0 == 0) goto L_0x0083
            boolean r0 = r8.A05()
            r17 = 1
            if (r0 != 0) goto L_0x0085
        L_0x0083:
            r17 = 0
        L_0x0085:
            X.11C r7 = r6.A0E
            X.C18070vi.A0b(r1)
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x0094
            X.6uj r0 = r6.A0W
            android.graphics.Rect r0 = r0.A03
            int r3 = r0.top
        L_0x0094:
            X.5d1 r10 = new X.5d1
            r14 = r9
            r15 = r1
            r16 = r3
            r12 = r7
            r13 = r6
            r11 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r6.A04 = r10
            if (r5 == 0) goto L_0x00ac
            X.70N r0 = r6.A0V
            r0.A07(r5)
            r2.invalidate()
        L_0x00ac:
            X.5d1 r2 = r6.A04
            if (r2 == 0) goto L_0x00b9
            r1 = 3
            X.75C r0 = new X.75C
            r0.<init>(r6, r1)
            r2.setOnShowListener(r0)
        L_0x00b9:
            X.5d1 r0 = r6.A04
            if (r0 == 0) goto L_0x00c0
            r0.show()
        L_0x00c0:
            X.6uj r1 = r6.A0W
            r0 = 1
            r1.A0B = r0
            X.5d1 r2 = r6.A04
            if (r2 == 0) goto L_0x00d2
            r1 = 0
            X.75A r0 = new X.75A
            r0.<init>(r9, r5, r6, r1)
            r2.setOnDismissListener(r0)
        L_0x00d2:
            return
        L_0x00d3:
            java.lang.String r10 = ""
            android.content.res.Resources r7 = r9.getResources()
            r0 = 2131169443(0x7f0710a3, float:1.7953216E38)
            float r11 = X.AnonymousClass3MW.A00(r7, r0)
            int r13 = r6.A02
            int r14 = r6.A00
            int r15 = r6.A01
            r0 = 15
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JF.A07(X.7JF, X.69c):void");
    }

    public static final boolean A08(AnonymousClass7JF r1) {
        C18150vq r12 = r1.A0a;
        if (!r12.A03() || ((AnonymousClass72m) r12.get()).A0Q.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        if (r1.getScaleY() == 1.0f) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (r3.A05() == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r17 = this;
            r7 = r17
            com.whatsapp.mediacomposer.doodle.DoodleView r4 = r7.A0P
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x008a
            X.6yX r9 = r7.A0R
            r2 = 1
            r9.A02 = r2
            X.6ud r3 = r7.A0J
            r3.A04()
            A00(r7)
            X.70N r1 = r7.A0V
            r0 = 0
            r1.A01 = r0
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r7.A0L
            r6 = 0
            r0.A05(r6)
            r3.A02()
            int[] r14 = X.C108945cZ.A1W()
            X.6uj r11 = r7.A0W
            android.graphics.Rect r5 = r11.A03
            int r1 = r5.top
            r0 = -1
            if (r1 == r0) goto L_0x008b
            r14[r2] = r1
            int r0 = r5.left
            r14[r6] = r0
        L_0x0038:
            X.1FL r4 = r7.A0A
            X.6UC r6 = r7.A0M
            X.6m4 r10 = r7.A0T
            r0 = 0
            X.7J6 r8 = new X.7J6
            r8.<init>(r7, r0)
            boolean r0 = r7.A0c
            if (r0 == 0) goto L_0x004f
            boolean r0 = r3.A05()
            r15 = 1
            if (r0 != 0) goto L_0x0050
        L_0x004f:
            r15 = 0
        L_0x0050:
            boolean r0 = r7.A0i
            X.1Lc r12 = r7.A0Y
            X.A4v r13 = r7.A0h
            X.11P r5 = r7.A0d
            X.5cz r3 = new X.5cz
            r16 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.A03 = r3
            r1 = 6
            X.759 r0 = new X.759
            r0.<init>(r7, r1)
            r3.setOnDismissListener(r0)
            X.5cz r3 = r7.A03
            if (r3 == 0) goto L_0x0077
            r1 = 2
            X.75C r0 = new X.75C
            r0.<init>(r7, r1)
            r3.setOnShowListener(r0)
        L_0x0077:
            X.0ve r3 = r12.A01
            r1 = 7952(0x1f10, float:1.1143E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00eb
            X.5cz r0 = r7.A03
            if (r0 == 0) goto L_0x008a
            r0.show()
        L_0x008a:
            return
        L_0x008b:
            r1 = r3
            X.696 r1 = (X.AnonymousClass696) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x00d4
            java.lang.Object r0 = r1.A01
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            X.740 r6 = r0.A05
            if (r6 == 0) goto L_0x0038
            android.view.View r1 = r6.A08
            if (r1 == 0) goto L_0x0038
            float r0 = r1.getScaleX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0038
            float r0 = r0.floatValue()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            float r1 = r1.getScaleY()
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L_0x0038
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            android.view.View r1 = r6.A0O
            float r0 = r1.getScaleX()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            float r0 = r1.getScaleY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
        L_0x00d4:
            float r0 = r4.getScaleX()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            float r0 = r4.getScaleY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            r4.getLocationOnScreen(r14)
            goto L_0x0038
        L_0x00eb:
            int r4 = r6.A00
            X.7JS r0 = r11.A0G
            int r1 = r0.A09()
            if (r1 == r2) goto L_0x011c
            r0 = 3
            if (r1 != r0) goto L_0x0102
            android.animation.ValueAnimator r3 = r11.A0D
            X.74b r0 = new X.74b
            r0.<init>(r11, r4, r2)
        L_0x00ff:
            r3.addUpdateListener(r0)
        L_0x0102:
            android.animation.ValueAnimator r1 = r11.A0D
            r0 = 21
            X.C109195cy.A02(r1, r11, r0)
            android.animation.AnimatorSet r1 = r11.A00(r2)
            r11.A02 = r1
            r0 = 22
            X.C109195cy.A02(r1, r11, r0)
            android.animation.AnimatorSet r0 = r11.A02
            r0.start()
            r11.A07 = r2
            return
        L_0x011c:
            android.animation.ValueAnimator r3 = r11.A0D
            r1 = 0
            X.74e r0 = new X.74e
            r0.<init>(r11, r1, r4, r2)
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JF.A09():void");
    }

    public void A0A() {
        if (this.A0P.A05()) {
            A05(this);
            C136986uj r4 = this.A0W;
            r4.A04();
            r4.A07(0);
            C136926ud r3 = this.A0J;
            r3.A03();
            AnonymousClass70N r2 = this.A0V;
            r4.A08(C72453Mb.A06(AnonymousClass000.A1a(r2.A03.A00) ? 1 : 0));
            r3.A04();
            A00(this);
            this.A0R.A02 = false;
            ColorPickerComponent colorPickerComponent = this.A0L;
            colorPickerComponent.A05(true);
            r3.A00();
            ColorPickerView colorPickerView = colorPickerComponent.A01;
            if (colorPickerView != null) {
                ColorPickerView.A01(colorPickerView);
                colorPickerView.invalidate();
            }
            r2.A01 = null;
        }
    }

    public final void A0B() {
        AnonymousClass70B r2;
        C138456x7 r22 = this.A0g;
        r22.A02 = null;
        r22.A03 = null;
        if (this.A06) {
            for (AnonymousClass69V A0a2 : this.A0V.A04()) {
                A0a2.A0a(r22);
            }
            this.A06 = false;
        }
        C1410073x r7 = this.A0O;
        AnonymousClass70N r1 = r7.A0G;
        if (r1.A01() == null) {
            Bitmap bitmap = r7.A05;
            if (bitmap != null) {
                bitmap.eraseColor(0);
            }
            List<AnonymousClass69V> A0d2 = C108995ce.A0d(r1.A04);
            if (!A0d2.isEmpty()) {
                C1410073x.A04(r7, true);
                for (AnonymousClass69V r4 : A0d2) {
                    Bitmap bitmap2 = r7.A05;
                    if (bitmap2 != null) {
                        PointF pointF = r7.A0D;
                        int i = r7.A00;
                        C18070vi.A0d(pointF, 1);
                        r4.A01 = bitmap2;
                        r4.A02 = pointF;
                        r4.A00 = i;
                    }
                    r4.A06 = false;
                    Bitmap bitmap3 = r4.A01;
                    if (!(bitmap3 == null || (r2 = r4.A04) == null)) {
                        r2.A03(bitmap3, r4.A02, r4.A00);
                        Canvas canvas = r2.A00;
                        if (canvas != null) {
                            r2.A04(canvas);
                        }
                    }
                }
            }
        }
        this.A0P.invalidate();
    }

    public static final void A04(AnonymousClass7JF r4) {
        if (A08(r4)) {
            AnonymousClass72m r3 = (AnonymousClass72m) r4.A0a.get();
            boolean z = r4.A05;
            r3.A0T.A02(z);
            r3.A0S.A02(z);
            AnonymousClass3MY.A1L(r3.A0X, z);
            r3.A0P.A14(z, C108995ce.A1U(r3.A03.A05));
        }
    }

    public final boolean A0E(float f, float f2) {
        if (A08(this)) {
            return true;
        }
        DoodleView doodleView = this.A0P;
        if (doodleView.A0K.A08 == null) {
            return false;
        }
        if (doodleView.A0B.A02) {
            return true;
        }
        AnonymousClass70N r2 = doodleView.A0M;
        if (r2.A02 != null) {
            return true;
        }
        PointF A012 = doodleView.A0L.A01((AnonymousClass69K) null, f, f2);
        C18070vi.A0d(A012, 0);
        if (r2.A02(A012, false) != null) {
            return true;
        }
        return false;
    }

    public AnonymousClass7JF(Uri uri, GestureDetector.OnGestureListener onGestureListener, View view, AnonymousClass1FL r31, AnonymousClass1F9 r32, AnonymousClass1FD r33, AnonymousClass1T1 r34, AnonymousClass11C r35, AnonymousClass11P r36, C19830z4 r37, C18000vb r38, AnonymousClass1KW r39, AnonymousClass6g1 r40, AnonymousClass74J r41, C18030ve r42, C136926ud r43, MediaComposerFragment mediaComposerFragment, AnonymousClass6UC r45, C135796sm r46, C1193367s r47, AnonymousClass7IT r48, AnonymousClass87S r49, C1192967n r50, C136986uj r51, C24641Lc r52, C26631Sw r53, AnonymousClass2LK r54, AnonymousClass1SB r55, AnonymousClass1L4 r56, C20050A4v a4v, AnonymousClass10I r58, AnonymousClass00H r59, AnonymousClass00H r60, boolean z, boolean z2) {
        CoordinatorLayout coordinatorLayout;
        C39151sZ r1;
        AnonymousClass2LK r22 = r54;
        C18070vi.A0d(r22, 8);
        AnonymousClass74J r25 = r41;
        C18070vi.A0d(r25, 15);
        C20050A4v a4v2 = a4v;
        C18070vi.A0d(a4v2, 26);
        C24641Lc r3 = r52;
        C18070vi.A0d(r3, 29);
        AnonymousClass6g1 r4 = r40;
        C18070vi.A0d(r4, 30);
        C18070vi.A0d(uri, 35);
        this.A0I = r42;
        this.A0Z = r56;
        AnonymousClass11C r13 = r35;
        this.A0E = r13;
        C18000vb r24 = r38;
        this.A0G = r24;
        C19830z4 r12 = r37;
        this.A0F = r12;
        this.A0b = r59;
        this.A0H = r25;
        AnonymousClass1FL r10 = r31;
        this.A0A = r10;
        this.A09 = view;
        this.A0B = r32;
        this.A0C = r33;
        C136926ud r23 = r43;
        this.A0J = r23;
        this.A0f = r49;
        this.A0K = mediaComposerFragment;
        C136986uj r14 = r51;
        this.A0W = r14;
        AnonymousClass6UC r26 = r45;
        this.A0M = r26;
        this.A0h = a4v2;
        this.A0c = z;
        this.A0i = z2;
        this.A0Y = r3;
        this.A0e = r4;
        this.A0d = r36;
        this.A0D = r34;
        C135796sm r2 = r46;
        this.A0N = r2;
        Handler A0D2 = C17890vO.A0D();
        this.A08 = A0D2;
        C18030ve r11 = r3.A01;
        C18040vf r8 = C18040vf.A02;
        this.A01 = C72453Mb.A05(C18020vd.A05(r8, r11, 7952) ? 1 : 0);
        this.A02 = C17890vO.A0B(r12).getInt("text_tool_media_composer_font", 0);
        AnonymousClass3MY.A1A(this.A09, 2131430130, 0);
        Resources resources = r10.getResources();
        C1409773u.A07 = resources.getDimension(2131166565);
        C1409773u.A08 = resources.getDimension(2131166566);
        C1409773u.A0A = resources.getDimension(2131166563);
        C1409773u.A09 = resources.getDimension(2131166562);
        DoodleView doodleView = (DoodleView) AnonymousClass1HF.A06(this.A09, 2131430139);
        if (r2.A00) {
            ViewGroup.LayoutParams layoutParams = doodleView.getLayoutParams();
            if ((layoutParams instanceof C39151sZ) && (r1 = (C39151sZ) layoutParams) != null) {
                r1.A0t = "9:16";
            }
        }
        this.A0P = doodleView;
        C1405671z r5 = doodleView.A0K;
        C18070vi.A0X(r5);
        this.A0Q = r5;
        AnonymousClass70N r44 = doodleView.A0M;
        C18070vi.A0X(r44);
        this.A0V = r44;
        C1410073x r27 = doodleView.A0J;
        C18070vi.A0X(r27);
        this.A0O = r27;
        C138456x7 r15 = new C138456x7(new C126096cB(this));
        this.A0g = r15;
        AnonymousClass6p8 r16 = doodleView.A0L;
        C18070vi.A0X(r16);
        C139256yX r162 = new C139256yX(r27, r16, r44, r15, AnonymousClass3Ma.A09(doodleView).density);
        this.A0R = r162;
        this.A0T = new C132036m4(r27, r44);
        View A062 = AnonymousClass1HF.A06(this.A09, 2131436440);
        ViewGroup A0C2 = AnonymousClass3MW.A0C(this.A09, 2131432398);
        AnonymousClass71K r152 = new AnonymousClass71K(A0D2, A062, r13, r24, new C109405dO());
        this.A0X = r152;
        C138576xJ r28 = new C138576xJ(new C126116cD(this), r5, new C139356yh(A0D2, A0C2, r13), r152);
        this.A0S = r28;
        ColorPickerComponent colorPickerComponent = (ColorPickerComponent) AnonymousClass1HF.A06(this.A09, 2131429190);
        this.A0L = colorPickerComponent;
        DoodleView doodleView2 = doodleView;
        colorPickerComponent.A04(r23, new AnonymousClass7J4(this, 0), doodleView2, C18020vd.A05(r8, r11, 9237), C18020vd.A05(r8, r11, 8644));
        AnonymousClass7J8 r112 = new AnonymousClass7J8(this, C108945cZ.A0X(this, 5));
        C1419677q r153 = new C1419677q(onGestureListener, r112, doodleView2, r28, new C127456eO(new C126106cC(this)), r44);
        this.A0U = r153;
        doodleView.setControllers(r153, r162);
        doodleView.setDoodleViewListener(r112);
        AnonymousClass1KW r163 = r39;
        C1193367s r18 = r47;
        AnonymousClass7IT r19 = r48;
        C1192967n r20 = r50;
        this.A0a = new C18150vq((Object) null, new C147097Ru(r163, this, r18, r19, r20, r53, r22, r55, r58));
        this.A05 = false;
        if (C18020vd.A05(C18040vf.A01, this.A0I, 5976) && (coordinatorLayout = (CoordinatorLayout) r10.findViewById(2131430732)) != null) {
            View findViewById = r10.findViewById(2131432380);
            C18070vi.A0X(findViewById);
            r25.A0L(r10, r10, findViewById, (ImageButton) null, coordinatorLayout, (KeyboardPopupLayout) null, (WaEditText) null, (EmojiSearchKeyboardContainer) null, (AnonymousClass3SU) null, false);
            A06(this, colorPickerComponent.getSelectedStrokeSize(), r26.A00);
        }
        if (r14.A0I.A0B != null && ((C19880zA) r60.get()).A07()) {
            ((C19880zA) r60.get()).A03();
            throw AnonymousClass000.A0s("create");
        }
    }
}
