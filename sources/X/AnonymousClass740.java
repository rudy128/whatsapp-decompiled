package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;

/* renamed from: X.740  reason: invalid class name */
public final class AnonymousClass740 {
    public float A00;
    public int A01;
    public Bitmap A02;
    public Bitmap A03;
    public Bitmap A04;
    public Bitmap A05;
    public Bitmap A06;
    public Rect A07;
    public View A08;
    public C6X A09;
    public BottomSheetBehavior A0A;
    public C112135kz A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final int A0J;
    public final int A0K;
    public final Handler A0L = C17890vO.A0D();
    public final View A0M;
    public final View A0N;
    public final View A0O;
    public final CoordinatorLayout A0P;
    public final CIZ A0Q;
    public final AnonymousClass1FL A0R;
    public final RecyclerView A0S;
    public final C25131Mz A0T;
    public final C19830z4 A0U;
    public final AnonymousClass2E5 A0V;
    public final C1419377n A0W;
    public final AnonymousClass7JF A0X;
    public final C200710s A0Y;
    public final Runnable A0Z;
    public final String A0a;
    public final String A0b;
    public final C18000vb A0c;

    public static final void A00(C25131Mz r2, AnonymousClass740 r3) {
        Bitmap bitmap = r3.A05;
        if (bitmap != null) {
            r2.A0F(r3.A0b, bitmap);
        }
        Bitmap bitmap2 = r3.A04;
        if (bitmap2 != null) {
            r2.A0F(r3.A0a, bitmap2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6LI, X.A34] */
    public static final void A01(AnonymousClass740 r5) {
        C112135kz r52 = r5.A0B;
        if (r52 != null) {
            int i = 0;
            while (true) {
                AnonymousClass740 r2 = r52.A09;
                RecyclerView recyclerView = r2.A0S;
                if (i < recyclerView.getChildCount()) {
                    C113625nO r0 = (C113625nO) recyclerView.A0Q(recyclerView.getChildAt(i));
                    if (r0 != null) {
                        ImageView imageView = r0.A02;
                        imageView.setBackgroundResource(0);
                        imageView.setImageDrawable((Drawable) null);
                    }
                    i++;
                } else {
                    Bitmap[] bitmapArr = r52.A01;
                    ? a34 = new A34();
                    a34.A00 = bitmapArr;
                    a34.A02.executeOnExecutor(r2.A0Y, new Void[0]);
                    return;
                }
            }
        }
    }

    public static final void A02(AnonymousClass740 r3) {
        AnonymousClass7JF r0 = r3.A0X;
        if (r0 != null) {
            if (C18020vd.A05(C18040vf.A02, r0.A0Y.A01, 9569)) {
                Bitmap bitmap = r3.A05;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                Bitmap bitmap2 = r3.A04;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
            }
        }
        r3.A05 = null;
        r3.A04 = null;
    }

    public static final void A03(AnonymousClass740 r4) {
        Bitmap bitmap = r4.A06;
        if (bitmap != null && !r4.A0C) {
            AnonymousClass1FL r2 = r4.A0R;
            if (((C23391Fw) r2.getLifecycle()).A02 != C23401Fx.DESTROYED) {
                new AnonymousClass6MS(bitmap, r2, r4).A02.executeOnExecutor(r4.A0Y, new Void[0]);
                r4.A0C = true;
            }
        }
    }

    public static final void A04(AnonymousClass740 r6) {
        int i;
        RecyclerView recyclerView = r6.A0S;
        ViewGroup.MarginLayoutParams A0P2 = C72463Mc.A0P(recyclerView);
        Rect rect = r6.A07;
        if (rect != null) {
            A0P2.leftMargin = rect.left;
            A0P2.rightMargin = rect.right;
            A0P2.topMargin = rect.top;
            A0P2.bottomMargin = rect.bottom;
        }
        recyclerView.setLayoutParams(A0P2);
        recyclerView.A0R = true;
        View view = r6.A0N;
        int width = view.getWidth();
        int height = view.getHeight();
        int dimensionPixelSize = r6.A0R.getResources().getDimensionPixelSize(2131166805);
        float f = 0.5f;
        if (width < height) {
            f = 0.28f;
        }
        r6.A00 = f;
        BottomSheetBehavior bottomSheetBehavior = r6.A0A;
        if (bottomSheetBehavior != null) {
            int i2 = height - dimensionPixelSize;
            Rect rect2 = r6.A07;
            if (rect2 != null) {
                i = rect2.bottom;
            } else {
                i = 0;
            }
            bottomSheetBehavior.A0V(i2 - i);
        }
        float f2 = ((float) width) / 2.0f;
        float height2 = ((float) (height - recyclerView.getHeight())) / 2.0f;
        View view2 = r6.A08;
        if (view2 != null) {
            view2.setPivotX(f2);
            view2.setPivotY(height2);
        } else {
            View view3 = r6.A0O;
            view3.setPivotX(f2);
            view3.setPivotY(height2);
            AnonymousClass7JF r0 = r6.A0X;
            if (r0 != null) {
                DoodleView doodleView = r0.A0P;
                doodleView.setPivotX(f2);
                doodleView.setPivotY(height2);
            }
        }
        BottomSheetBehavior bottomSheetBehavior2 = r6.A0A;
        if (bottomSheetBehavior2 != null && bottomSheetBehavior2.A0J == 3) {
            float f3 = 1.0f - r6.A00;
            if (view2 != null) {
                view2.setScaleX(f3);
                view2.setScaleY(f3);
                return;
            }
            View view4 = r6.A0O;
            view4.setScaleX(f3);
            view4.setScaleY(f3);
            AnonymousClass7JF r02 = r6.A0X;
            if (r02 != null) {
                DoodleView doodleView2 = r02.A0P;
                doodleView2.setScaleX(f3);
                doodleView2.setScaleY(f3);
            }
        }
    }

    public static final boolean A05(AnonymousClass740 r4) {
        BottomSheetBehavior bottomSheetBehavior = r4.A0A;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0J == 4 || r4.A0I) {
            return false;
        }
        C6X c6x = r4.A09;
        if (c6x != null) {
            c6x.A03(r4.A0M, 1);
        }
        BottomSheetBehavior bottomSheetBehavior2 = r4.A0A;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0W(4);
        }
        r4.A0I = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r2 == 3) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r4 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r4.A0A
            if (r3 == 0) goto L_0x000d
            int r2 = r3.A0J
            r0 = 4
            if (r2 == r0) goto L_0x000d
            r0 = 3
            r1 = 0
            if (r2 != r0) goto L_0x000e
        L_0x000d:
            r1 = 1
        L_0x000e:
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r3 == 0) goto L_0x0019
            int r1 = r3.A0J
            r0 = 3
            if (r1 != r0) goto L_0x0019
            return
        L_0x0019:
            android.view.View r0 = r4.A0M
            r0.setVisibility(r2)
            return
        L_0x001f:
            r0 = 1
            r4.A0F = r0
            r4.A0D = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass740.A06():void");
    }

    public final void A07() {
        String str;
        if (this.A06 != null) {
            C25131Mz r4 = this.A0T;
            String str2 = this.A0b;
            this.A05 = (Bitmap) r4.A0A(str2);
            String str3 = this.A0a;
            this.A04 = (Bitmap) r4.A0A(str3);
            if (this.A05 == null) {
                int i = this.A01;
                Bitmap bitmap = this.A06;
                if (i == 0) {
                    this.A05 = bitmap;
                    this.A04 = this.A02;
                    r4.A0E(str2);
                    r4.A0E(str3);
                    return;
                }
                AnonymousClass2E5 r3 = this.A0V;
                Bitmap A002 = FilterUtils.A00(bitmap, r3, i, true);
                if (A002 == null) {
                    this.A05 = this.A06;
                    this.A04 = this.A02;
                    this.A01 = 0;
                    str = "FilterSelectorController/updateFilteredMediaBitmap/filter failed";
                } else {
                    this.A05 = A002;
                    Bitmap bitmap2 = this.A02;
                    if (bitmap2 != null) {
                        Bitmap A003 = FilterUtils.A00(bitmap2, r3, this.A01, true);
                        if (A003 == null) {
                            this.A05 = this.A06;
                            this.A04 = this.A02;
                            this.A01 = 0;
                            str = "FilterSelectorController/updateFilteredMediaBitmap/filter background failed";
                        } else {
                            this.A04 = A003;
                        }
                    }
                    A00(r4, this);
                    return;
                }
                Log.w(str);
            }
        }
    }

    public final void A08(Runnable runnable, Runnable runnable2, int i) {
        Bitmap bitmap = this.A06;
        if (bitmap == null) {
            Log.e("FilterSelectorController/startUpdateFilteredMediaBitmapTask/mediaBitmap is null");
            return;
        }
        C25131Mz r3 = this.A0T;
        String str = this.A0b;
        Bitmap bitmap2 = (Bitmap) r3.A0A(str);
        String str2 = this.A0a;
        Bitmap bitmap3 = (Bitmap) r3.A0A(str2);
        if (i != this.A01 || i == 0) {
            r3.A0E(str);
            r3.A0E(str2);
        }
        if (i == 0) {
            this.A05 = this.A06;
            this.A04 = this.A02;
            if (runnable != null) {
                runnable.run();
            }
            this.A01 = 0;
            this.A0W.A00();
            return;
        }
        new AnonymousClass6M2(bitmap2, bitmap, bitmap3, this.A0R, this, runnable, runnable2, i).A02.executeOnExecutor(this.A0Y, new Void[0]);
    }

    public final void A09(boolean z) {
        int i;
        BottomSheetBehavior bottomSheetBehavior = this.A0A;
        if (bottomSheetBehavior == null || (i = bottomSheetBehavior.A0J) == 4 || i == 3) {
            this.A0M.setVisibility(4);
            return;
        }
        this.A0F = false;
        this.A0D = true;
        this.A0E = z;
    }

    public AnonymousClass740(Uri uri, View view, AnonymousClass1FL r6, C24771Lp r7, C19830z4 r8, C18000vb r9, AnonymousClass2E5 r10, C1419377n r11, AnonymousClass7JF r12, AnonymousClass10I r13, int i) {
        this.A0V = r10;
        this.A0c = r9;
        this.A0U = r8;
        this.A0R = r6;
        this.A0N = view;
        this.A0W = r11;
        this.A01 = i;
        this.A0X = r12;
        C32071ga A052 = r7.A05();
        C18070vi.A0X(A052);
        this.A0T = A052;
        this.A0Y = C200710s.A00(r13);
        this.A0Q = C108965cb.A0C(view.getContext(), new C109765dy(this, 5));
        this.A0P = (CoordinatorLayout) AnonymousClass1HF.A06(this.A0N, 2131430857);
        this.A0M = AnonymousClass1HF.A06(this.A0N, 2131430851);
        this.A0S = C108945cZ.A0U(this.A0N, 2131430856);
        this.A0O = AnonymousClass1HF.A06(this.A0N, 2131432382);
        this.A08 = view.findViewById(2131429504);
        this.A00 = 0.28f;
        this.A0b = AnonymousClass000.A0y("-filter", C17890vO.A0f(uri));
        this.A0a = AnonymousClass000.A0y("-filter-background", C17890vO.A0f(uri));
        this.A0K = r6.getResources().getDimensionPixelSize(2131166816);
        this.A0J = r6.getResources().getDimensionPixelSize(2131166811);
        this.A0Z = C108945cZ.A0X(this, 11);
    }
}
