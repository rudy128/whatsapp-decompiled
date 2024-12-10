package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaDynamicRoundCornerImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaRoundCornerImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.5wX  reason: invalid class name and case insensitive filesystem */
public class C116185wX extends C113615nN implements E6Z {
    public Drawable A00;
    public ScaleGestureDetector A01;
    public C138416x2 A02;
    public C108525bq A03;
    public E6Z A04;
    public DRB A05;
    public C28931bI A06;
    public C28931bI A07;
    public C28931bI A08;
    public Runnable A09;
    public boolean A0A = false;
    public AnonymousClass26p A0B;
    public String A0C;
    public final int A0D;
    public final Rect A0E = AnonymousClass3MW.A07();
    public final View A0F;
    public final View A0G;
    public final ViewGroup A0H;
    public final ViewTreeObserver.OnGlobalLayoutListener A0I;
    public final ConstraintLayout A0J;
    public final ConstraintLayout A0K;
    public final WaDynamicRoundCornerImageView A0L;
    public final WaDynamicRoundCornerImageView A0M;
    public final WaImageView A0N;
    public final WaRoundCornerImageView A0O;
    public final WaTextView A0P;
    public final AnonymousClass1VF A0Q;
    public final C21141AfC A0R;
    public final ThumbnailButton A0S;
    public final C18000vb A0T;
    public final C18030ve A0U;
    public final AnonymousClass1DC A0V;
    public final C28931bI A0W;
    public final C28931bI A0X;
    public final C28931bI A0Y;
    public final Map A0Z;
    public final C18140vp A0a;
    public final int A0b;
    public final WaDynamicRoundCornerImageView A0c;
    public final WaDynamicRoundCornerImageView A0d;
    public final AnonymousClass6UI A0e;
    public final C28931bI A0f;
    public final E2y A0g;
    public final boolean A0h;

    public void C37() {
        boolean z = true;
        this.A0A = true;
        DRB drb = this.A05;
        if (drb != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.A0C);
            A10.append("onRenderStarted  for ");
            C17900vP.A0b(drb.A0D, A10);
            AnonymousClass70A r3 = this.A05;
            if (r3 == null || !r3.A0N) {
                z = false;
            }
            this.A0M.post(new AnonymousClass7RF(this, r3, 17, z));
        }
        this.A0J.post(new C146427Pb(this, 5));
    }

    private void A00() {
        int i;
        WaDynamicRoundCornerImageView waDynamicRoundCornerImageView = this.A0M;
        if (waDynamicRoundCornerImageView.getVisibility() == 0) {
            AnonymousClass70A r0 = this.A05;
            if (r0 == null || r0.A0N) {
                i = 0;
            } else {
                i = this.A03;
            }
            waDynamicRoundCornerImageView.post(new AnonymousClass7RP(this, i, 30));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r5 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.graphics.Bitmap r5, X.C116185wX r6) {
        /*
            int r0 = r6.A03
            r4 = 1
            if (r0 == 0) goto L_0x0010
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r6.A0M
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0010
            r3 = 1
            if (r5 != 0) goto L_0x0011
        L_0x0010:
            r3 = 0
        L_0x0011:
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r6.A0M
            r1.setImageBitmap(r5)
            r0 = 0
            if (r5 != 0) goto L_0x001b
            r0 = 8
        L_0x001b:
            r1.setVisibility(r0)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = r6.A04
            if (r2 == 0) goto L_0x0032
            X.70A r0 = r6.A05
            if (r0 == 0) goto L_0x0032
            com.whatsapp.jid.UserJid r1 = r0.A0h
            if (r5 != 0) goto L_0x002b
            r4 = 0
        L_0x002b:
            java.util.HashSet r0 = r2.A17
            if (r4 == 0) goto L_0x0038
            r0.add(r1)
        L_0x0032:
            if (r3 == 0) goto L_0x0037
            r6.A00()
        L_0x0037:
            return
        L_0x0038:
            r0.remove(r1)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116185wX.A01(android.graphics.Bitmap, X.5wX):void");
    }

    private void A02(Drawable drawable) {
        View view = this.A0H;
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).setForeground(drawable);
        } else {
            C17960vV.A0F(false, "FrameLayout required as root to support corner rounding via overlay");
        }
    }

    public static boolean A03(C116185wX r1, Map.Entry entry, float f, float f2) {
        C28931bI r0 = r1.A07;
        if (r0 != null && r0.A01() == 0 && ((C28931bI) entry.getKey()).A00 != null && ((C28931bI) entry.getKey()).A02().getVisibility() == 0) {
            if (!AnonymousClass4aO.A06((Rect) entry.getValue(), ((C28931bI) entry.getKey()).A02(), f, f2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A0B() {
        Object surface;
        C22851Dl r5;
        AnonymousClass70A r2 = this.A05;
        if (r2 != null) {
            CallGridViewModel callGridViewModel = this.A04;
            if (!(callGridViewModel == null || (r5 = this.A09) == null)) {
                C131896lq r1 = callGridViewModel.A0a;
                C17960vV.A07(r2);
                UserJid userJid = r2.A0h;
                Map map = r1.A01;
                if (map.containsKey(userJid)) {
                    Map map2 = r1.A00;
                    if (r5.equals(map2.get(userJid))) {
                        map2.remove(userJid);
                        map.remove(userJid);
                    }
                }
                this.A09 = null;
            }
            AnonymousClass6UI r4 = this.A0e;
            if (r4.A01 != null) {
                boolean z = r4 instanceof C116295wm;
                if (z) {
                    surface = ((C116295wm) r4).A01.getSurfaceTexture();
                } else {
                    surface = ((C116285wl) r4).A01.getHolder().getSurface();
                }
                if (surface != null) {
                    r4.A01.A0C(surface);
                }
                r4.A01 = null;
                if (z) {
                    ((C116295wm) r4).A01.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
                } else {
                    C116285wl r42 = (C116285wl) r4;
                    r42.A01.getHolder().removeCallback(r42.A00);
                }
            }
            GradientDrawable gradientDrawable = (GradientDrawable) this.A0K.getBackground();
            int i = this.A01;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(i, 0);
            }
            this.A05 = null;
            View view = this.A0H;
            view.setOnClickListener((View.OnClickListener) null);
            view.setOnLongClickListener((View.OnLongClickListener) null);
            DRB drb = this.A05;
            if (drb != null) {
                drb.A0A(this);
            }
            this.A05 = null;
            this.A0A = false;
            this.A01 = null;
        }
    }

    public void A0E(int i) {
        this.A02 = i;
        A0G(this.A0H, this.A0P);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0284, code lost:
        if (r0.A01() != 0) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x034b, code lost:
        if (r4 != 3) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d8, code lost:
        if (r11.A0J.getVisibility() == 0) goto L_0x01da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03d5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:296:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass70A r12) {
        /*
            r11 = this;
            boolean r0 = r12.A0N
            if (r0 == 0) goto L_0x05db
            java.lang.String r0 = "preview - "
        L_0x0006:
            r11.A0C = r0
            X.70A r0 = r11.A05
            if (r0 == 0) goto L_0x0026
            X.C17960vV.A07(r0)
            boolean r0 = X.AnonymousClass70A.A00(r0, r12)
            if (r0 != 0) goto L_0x0026
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r11.A0C
            r1.append(r0)
            java.lang.String r0 = "bind() called with new participant before unbind()"
            X.C17890vO.A1B(r1, r0)
            r11.A0B()
        L_0x0026:
            X.DRB r0 = r11.A05
            if (r0 != 0) goto L_0x0047
            com.whatsapp.jid.UserJid r2 = r12.A0h
            boolean r0 = r11 instanceof X.C116175wW
            if (r0 == 0) goto L_0x05ce
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r11.A0A = r0
            X.AfC r1 = r11.A0R
            r1.A07(r2)
            r0 = 1
            X.DRB r0 = X.C21141AfC.A00(r1, r2, r0)
            r11.A05 = r0
            if (r0 == 0) goto L_0x0047
        L_0x0044:
            r0.A09(r11)
        L_0x0047:
            X.6UI r5 = r11.A0e
            X.DRB r1 = r11.A05
            X.DRB r0 = r5.A01
            if (r0 != 0) goto L_0x05c5
            r5.A01 = r1
            boolean r0 = r5 instanceof X.C116295wm
            if (r0 == 0) goto L_0x0587
            r0 = r5
            X.5wm r0 = (X.C116295wm) r0
            android.view.TextureView r4 = r0.A01
            android.view.TextureView$SurfaceTextureListener r3 = r0.A00
            r4.setSurfaceTextureListener(r3)
            android.graphics.SurfaceTexture r2 = r4.getSurfaceTexture()
            if (r2 == 0) goto L_0x0074
            X.DRB r0 = r0.A01
            if (r0 == 0) goto L_0x0074
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            r3.onSurfaceTextureAvailable(r2, r1, r0)
        L_0x0074:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r6 = r11.A04
            if (r6 == 0) goto L_0x00a8
            X.70A r0 = r11.A05
            if (r0 != 0) goto L_0x00a8
            r0 = 32
            X.7AN r4 = new X.7AN
            r4.<init>(r11, r0)
            r11.A09 = r4
            X.6lq r3 = r6.A0a
            com.whatsapp.jid.UserJid r2 = r12.A0h
            java.util.Map r1 = r3.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x0095
            r0 = 0
            r1.put(r2, r0)
        L_0x0095:
            java.util.Map r0 = r3.A00
            r0.put(r2, r4)
            X.1E7 r3 = r12.A0g
            com.whatsapp.WaDynamicRoundCornerImageView r2 = r11.A0L
            r0 = 1
            r1 = 0
            r11.A0H(r2, r3, r0, r1)
            com.whatsapp.components.button.ThumbnailButton r0 = r11.A0S
            r11.A0H(r0, r3, r1, r1)
        L_0x00a8:
            r11.A05 = r12
            android.view.View r3 = r11.A0G
            boolean r0 = r12.A0N
            if (r0 == 0) goto L_0x057d
            android.content.Context r1 = r3.getContext()
            r0 = 2131898595(0x7f1230e3, float:1.9432112E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x00bb:
            r3.setContentDescription(r0)
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x0576
            com.whatsapp.WaRoundCornerImageView r8 = r11.A0O
            if (r8 == 0) goto L_0x00f7
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = r11.A00
            r7 = 0
            if (r0 != 0) goto L_0x00ef
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r2 = X.C108945cZ.A1W()
            int r0 = X.C108955ca.A01(r9)
            r2[r7] = r0
            r1 = 2130968808(0x7f0400e8, float:1.754628E38)
            r0 = 2131099885(0x7f0600ed, float:1.7812136E38)
            int r1 = X.AnonymousClass3Ma.A00(r9, r1, r0)
            r0 = 1
            r2[r0] = r1
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r4, r2)
            r11.A00 = r0
        L_0x00ef:
            r8.setVisibility(r7)
            android.graphics.drawable.Drawable r0 = r11.A00
            r8.setImageDrawable(r0)
        L_0x00f7:
            boolean r9 = r12.A0J
            boolean r8 = r12.A0E
            boolean r7 = r12.A0H
            boolean r2 = r11.A0h
            X.0ve r0 = r11.A0U
            X.0vp r4 = r11.A0a
            boolean r1 = X.C40811vJ.A0b(r0, r4)
            if (r2 != 0) goto L_0x0571
            if (r7 == 0) goto L_0x0563
            r0 = 2131165645(0x7f0701cd, float:1.7945513E38)
        L_0x010e:
            android.view.View r2 = r11.A0H
            int r7 = X.AnonymousClass3Ma.A02(r2, r0)
            X.26p r0 = r11.A0B
            if (r0 != 0) goto L_0x012e
            float r1 = (float) r7
            float r0 = r5.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L_0x012e
            r5.A00 = r1
            boolean r0 = r5 instanceof X.C116295wm
            if (r0 == 0) goto L_0x054f
            X.DRB r0 = r5.A01
            if (r0 == 0) goto L_0x012e
            r0.setCornerRadius(r1)
        L_0x012e:
            int r0 = r11.A00
            if (r7 == r0) goto L_0x0166
            r11.A00 = r7
            X.26p r0 = r11.A0B
            if (r0 == 0) goto L_0x053e
            int r1 = r11.A0b
            X.26p r0 = new X.26p
            r0.<init>(r7, r1)
            r11.A0B = r0
            r11.A02(r0)
        L_0x0144:
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r11.A0M
            int r0 = r11.A00
            float r0 = (float) r0
            r1.setRadius(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r11.A0L
            int r0 = r11.A00
            float r0 = (float) r0
            r1.setRadius(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r11.A0d
            int r0 = r11.A00
            float r0 = (float) r0
            r1.setRadius(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r11.A0c
            if (r1 == 0) goto L_0x0166
            int r0 = r11.A00
            float r0 = (float) r0
            r1.setRadius(r0)
        L_0x0166:
            androidx.constraintlayout.widget.ConstraintLayout r8 = r11.A0K
            android.graphics.drawable.Drawable r0 = r8.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x017c
            android.graphics.drawable.Drawable r1 = r8.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r11.A00
            float r0 = (float) r0
            r1.setCornerRadius(r0)
        L_0x017c:
            X.4ZN r9 = r12.A0C
            boolean r0 = r12.A0c
            r7 = 0
            r5 = 8
            if (r0 != 0) goto L_0x018d
            boolean r0 = r11.A0A
            if (r0 != 0) goto L_0x0539
            boolean r0 = r12.A0f
            if (r0 == 0) goto L_0x0539
        L_0x018d:
            r11.A0L(r7)
        L_0x0190:
            if (r9 == 0) goto L_0x0523
            boolean r0 = r12.A0c
            if (r0 != 0) goto L_0x0523
            boolean r0 = r12.A0Z
            if (r0 != 0) goto L_0x0523
            android.view.ViewGroup r3 = r11.A0H
            if (r3 == 0) goto L_0x01be
            com.whatsapp.WaTextView r1 = r11.A0P
            if (r1 == 0) goto L_0x01be
            r3.setVisibility(r7)
            X.70A r0 = r11.A05
            if (r0 == 0) goto L_0x01af
            int r0 = r0.A04
            float r0 = (float) r0
            r3.setRotation(r0)
        L_0x01af:
            android.content.Context r0 = r1.getContext()
            X.AnonymousClass4ZN.A01(r0, r1, r9)
            r1.setVisibility(r7)
            com.whatsapp.components.button.ThumbnailButton r0 = r11.A0S
            r0.setVisibility(r5)
        L_0x01be:
            boolean r0 = r12.A0Z
            if (r0 != 0) goto L_0x0508
            boolean r0 = r12.A0d
            if (r0 != 0) goto L_0x0508
            X.1bI r0 = r11.A0f
            r0.A04(r5)
        L_0x01cb:
            com.whatsapp.WaImageView r3 = r11.A0N
            boolean r0 = r12.A0a
            if (r0 == 0) goto L_0x01da
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.A0J
            int r1 = r0.getVisibility()
            r0 = 0
            if (r1 != 0) goto L_0x01dc
        L_0x01da:
            r0 = 8
        L_0x01dc:
            r3.setVisibility(r0)
            X.70A r0 = r11.A05
            int r0 = r0.A04
            float r0 = (float) r0
            r3.setRotation(r0)
            boolean r0 = r12.A0a
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r12.A0Q
            if (r0 != 0) goto L_0x01fc
        L_0x01ef:
            android.graphics.drawable.Drawable r1 = r8.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r11.A01
            if (r1 == 0) goto L_0x01fc
            r1.setStroke(r0, r7)
        L_0x01fc:
            int r0 = r12.A05
            if (r0 == 0) goto L_0x0230
            X.1bI r9 = r11.A0X
            android.view.View r1 = r9.A02()
            r0 = 2131431496(0x7f0b1048, float:1.8484723E38)
            android.widget.ImageView r8 = X.AnonymousClass3MW.A0G(r1, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131167985(0x7f070af1, float:1.795026E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            X.C108955ca.A1I(r8, r1, r0)
            int r0 = r12.A05
            r8.setImageResource(r0)
            android.view.View r1 = r9.A02()
            X.70A r0 = r11.A05
            int r0 = r0.A04
            float r0 = (float) r0
            r1.setRotation(r0)
        L_0x0230:
            X.1bI r8 = r11.A0X
            int r0 = r12.A05
            if (r0 == 0) goto L_0x0504
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.A0J
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0504
        L_0x023e:
            r8.A04(r7)
            boolean r1 = X.C72463Mc.A1Z(r4)
            boolean r0 = r12.A0X
            if (r0 == 0) goto L_0x04fb
            if (r1 == 0) goto L_0x04fb
            X.1bI r0 = r11.A07
            r4 = 0
            if (r0 == 0) goto L_0x04cc
            r0.A04(r4)
        L_0x0253:
            X.5Wl r1 = r12.A0A
            X.4hn r0 = X.C92724hn.A00
            if (r1 != r0) goto L_0x0484
            X.1bI r0 = r11.A06
            if (r0 == 0) goto L_0x0260
            r0.A04(r5)
        L_0x0260:
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131166835(0x7f070673, float:1.7947927E38)
            int r9 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131166833(0x7f070671, float:1.7947923E38)
            int r7 = r1.getDimensionPixelSize(r0)
            X.1bI r0 = r11.A08
            r1 = 0
            if (r0 == 0) goto L_0x029b
            X.1bI r0 = r11.A06
            if (r0 == 0) goto L_0x0286
            int r0 = r0.A01()
            r4 = 0
            if (r0 == 0) goto L_0x0287
        L_0x0286:
            r4 = r9
        L_0x0287:
            X.0vb r0 = r11.A0T
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            android.graphics.Rect r10 = new android.graphics.Rect
            if (r0 == 0) goto L_0x047f
            r10.<init>(r7, r7, r9, r4)
        L_0x0294:
            java.util.Map r4 = r11.A0Z
            X.1bI r0 = r11.A08
            r4.put(r0, r10)
        L_0x029b:
            X.1bI r0 = r11.A06
            if (r0 == 0) goto L_0x02bd
            X.1bI r0 = r11.A08
            if (r0 == 0) goto L_0x047c
            int r0 = r0.A01()
            if (r0 != 0) goto L_0x047c
        L_0x02a9:
            X.0vb r0 = r11.A0T
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            android.graphics.Rect r4 = new android.graphics.Rect
            if (r0 == 0) goto L_0x0477
            r4.<init>(r7, r1, r9, r9)
        L_0x02b6:
            java.util.Map r1 = r11.A0Z
            X.1bI r0 = r11.A06
            r1.put(r0, r4)
        L_0x02bd:
            int r4 = r12.A04
            float r10 = r12.A01
            X.1bI r0 = r11.A07
            X.C17960vV.A07(r0)
            android.view.View r9 = r0.A02()
            X.0vb r0 = r11.A0T
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            r7 = 0
            if (r0 == 0) goto L_0x0474
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131169378(0x7f071062, float:1.7953084E38)
            float r0 = X.AnonymousClass3MW.A00(r1, r0)
        L_0x02de:
            r9.setPivotX(r0)
            r9.setPivotY(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r10
            r9.setScaleX(r0)
            r9.setScaleY(r0)
            X.1bI r0 = r11.A08
            if (r0 == 0) goto L_0x02f9
            android.view.View r1 = r0.A02()
            float r0 = (float) r4
            r1.setRotation(r0)
        L_0x02f9:
            X.1bI r0 = r11.A06
            if (r0 == 0) goto L_0x0305
            android.view.View r1 = r0.A02()
            float r0 = (float) r4
            r1.setRotation(r0)
        L_0x0305:
            X.70A r0 = r11.A05
            int r7 = r0.A07
            boolean r0 = r12.A0X
            r11.A03 = r7
            r4 = 0
            if (r0 == 0) goto L_0x0311
            r7 = 0
        L_0x0311:
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            X.1sZ r1 = (X.C39151sZ) r1
            r0 = -1
            r1.A0p = r0
            r1.A0n = r0
            r1.A0I = r0
            r1.A0B = r0
            r0 = 1
            if (r7 == r0) goto L_0x046e
            r0 = 2
            if (r7 == r0) goto L_0x046b
            r0 = 3
            if (r7 == r0) goto L_0x0467
            r1.A0n = r4
        L_0x032b:
            r1.A0p = r4
        L_0x032d:
            r3.setLayoutParams(r1)
            android.view.ViewGroup$LayoutParams r7 = r8.A03()
            X.1sZ r7 = (X.C39151sZ) r7
            r0 = -1
            r7.A0p = r0
            r7.A0n = r0
            r7.A0I = r0
            r7.A0B = r0
            int r4 = r11.A03
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L_0x0463
            r0 = 2
            if (r4 == r0) goto L_0x045d
            r0 = 3
            r7.A0I = r1
            if (r4 == r0) goto L_0x045f
        L_0x034d:
            r7.A0p = r1
        L_0x034f:
            r8.A06(r7)
            r11.A00()
            X.6x2 r4 = r11.A02
            if (r4 == 0) goto L_0x0367
            int r1 = r11.A03
            r0 = 1
            r4.A03 = r0
            int r0 = r4.A02
            if (r1 == r0) goto L_0x0367
            r4.A02 = r1
            X.C138416x2.A00(r4)
        L_0x0367:
            android.graphics.Bitmap r0 = r12.A08
            A01(r0, r11)
            boolean r0 = r12.A0T
            r4 = 0
            if (r0 != 0) goto L_0x043f
            boolean r0 = r12.A0U
            if (r0 != 0) goto L_0x043f
            boolean r0 = r12.A0L
            if (r0 != 0) goto L_0x043f
            r2.setOnTouchListener(r4)
        L_0x037c:
            boolean r0 = r12.A0T
            if (r0 == 0) goto L_0x043a
            r0 = 15
            X.C89994dM.A00(r2, r11, r12, r0)
        L_0x0385:
            boolean r0 = r12.A0U
            if (r0 == 0) goto L_0x0435
            r0 = 2
            X.C1421578j.A00(r2, r12, r11, r0)
        L_0x038d:
            boolean r0 = r12.A0d
            if (r0 == 0) goto L_0x0417
            X.1bI r7 = r11.A0Y
            int r0 = r7.A01()
            if (r0 != r5) goto L_0x0417
            X.E6Z r0 = r11.A04
            if (r0 != 0) goto L_0x03a4
            X.7DP r0 = new X.7DP
            r0.<init>(r11)
            r11.A04 = r0
        L_0x03a4:
            java.lang.Runnable r0 = r11.A09
            if (r0 != 0) goto L_0x03b0
            r1 = 6
            X.7Pb r0 = new X.7Pb
            r0.<init>(r11, r1)
            r11.A09 = r0
        L_0x03b0:
            r0 = 0
            r7.A04(r0)
            java.lang.Runnable r7 = r11.A09
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r7, r0)
        L_0x03bb:
            X.4ZN r7 = r12.A0B
            X.1bI r0 = r11.A0W
            if (r7 != 0) goto L_0x0409
            r0.A04(r5)
        L_0x03c4:
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x03ca
            java.lang.String r4 = "transition_target_floating_view"
        L_0x03ca:
            r3.setTransitionName(r4)
            X.1bI r1 = r11.A08
            if (r1 == 0) goto L_0x0408
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0408
            if (r6 == 0) goto L_0x0408
            android.view.View r5 = r1.A02()
            android.content.res.Resources r2 = r5.getResources()
            com.whatsapp.voipcalling.camera.VoipCameraManager r4 = r6.A14
            boolean r1 = r4.isFrontCamera()
            r0 = 2131896663(0x7f122957, float:1.9428194E38)
            if (r1 == 0) goto L_0x03ed
            r0 = 2131896661(0x7f122955, float:1.942819E38)
        L_0x03ed:
            java.lang.String r3 = r2.getString(r0)
            android.content.res.Resources r2 = r5.getResources()
            boolean r1 = r4.isFrontCamera()
            r0 = 2131896662(0x7f122956, float:1.9428192E38)
            if (r1 == 0) goto L_0x0401
            r0 = 2131896660(0x7f122954, float:1.9428188E38)
        L_0x0401:
            java.lang.String r0 = r2.getString(r0)
            X.AnonymousClass4aR.A07(r5, r3, r0)
        L_0x0408:
            return
        L_0x0409:
            android.view.View r1 = X.C72463Mc.A0N(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r0 = r2.getContext()
            X.AnonymousClass4ZN.A01(r0, r1, r7)
            goto L_0x03c4
        L_0x0417:
            boolean r0 = r12.A0d
            if (r0 != 0) goto L_0x03bb
            X.1bI r0 = r11.A0Y
            r0.A04(r5)
            java.lang.Runnable r0 = r11.A09
            if (r0 == 0) goto L_0x0429
            r2.removeCallbacks(r0)
            r11.A09 = r4
        L_0x0429:
            X.E6Z r1 = r11.A04
            if (r1 == 0) goto L_0x03bb
            X.DRB r0 = r11.A05
            r0.A0A(r1)
            r11.A04 = r4
            goto L_0x03bb
        L_0x0435:
            r2.setOnLongClickListener(r4)
            goto L_0x038d
        L_0x043a:
            r2.setOnClickListener(r4)
            goto L_0x0385
        L_0x043f:
            boolean r0 = r12.A0L
            if (r0 == 0) goto L_0x0457
            android.view.ScaleGestureDetector r0 = r11.A01
            if (r0 != 0) goto L_0x0457
            android.content.Context r7 = r2.getContext()
            X.5e1 r1 = new X.5e1
            r1.<init>(r11)
            android.view.ScaleGestureDetector r0 = new android.view.ScaleGestureDetector
            r0.<init>(r7, r1)
            r11.A01 = r0
        L_0x0457:
            r0 = 0
            X.C1422578t.A00(r2, r12, r11, r0)
            goto L_0x037c
        L_0x045d:
            r7.A0n = r1
        L_0x045f:
            r7.A0B = r1
            goto L_0x034f
        L_0x0463:
            r7.A0n = r1
            goto L_0x034d
        L_0x0467:
            r1.A0I = r4
            goto L_0x032b
        L_0x046b:
            r1.A0I = r4
            goto L_0x0470
        L_0x046e:
            r1.A0n = r4
        L_0x0470:
            r1.A0B = r4
            goto L_0x032d
        L_0x0474:
            r0 = 0
            goto L_0x02de
        L_0x0477:
            r4.<init>(r9, r1, r7, r9)
            goto L_0x02b6
        L_0x047c:
            r1 = r9
            goto L_0x02a9
        L_0x047f:
            r10.<init>(r9, r7, r7, r4)
            goto L_0x0294
        L_0x0484:
            X.4ho r1 = (X.C92734ho) r1
            boolean r7 = r1.A00
            X.1bI r0 = r11.A06
            if (r0 != 0) goto L_0x04c2
            r0 = 2131427837(0x7f0b01fd, float:1.8477302E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x0260
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r11.A06 = r0
            android.view.View r4 = r0.A02()
            r0 = 19
            X.C89874dA.A00(r4, r11, r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131886696(0x7f120268, float:1.9407978E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            X.AnonymousClass4aR.A07(r4, r1, r0)
            r1 = 1
            X.4du r0 = new X.4du
            r0.<init>((java.lang.Object) r11, (int) r1)
            r4.setOnTouchListener(r0)
        L_0x04bd:
            r4.setSelected(r7)
            goto L_0x0260
        L_0x04c2:
            r0.A04(r4)
            X.1bI r0 = r11.A06
            android.view.View r4 = r0.A02()
            goto L_0x04bd
        L_0x04cc:
            r0 = 2131428806(0x7f0b05c6, float:1.8479267E38)
            X.1bI r0 = X.C72453Mb.A0s(r2, r0)
            r11.A07 = r0
            r0.A04(r4)
            r0 = 2131428805(0x7f0b05c5, float:1.8479265E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x0253
            X.1bI r0 = new X.1bI
            r0.<init>(r1)
            r11.A08 = r0
            android.view.View r1 = r0.A02()
            r0 = 20
            X.C89874dA.A00(r1, r11, r0)
            X.4du r0 = new X.4du
            r0.<init>((java.lang.Object) r11, (int) r4)
            r1.setOnTouchListener(r0)
            goto L_0x0253
        L_0x04fb:
            X.1bI r0 = r11.A07
            if (r0 == 0) goto L_0x0305
            r0.A04(r5)
            goto L_0x0305
        L_0x0504:
            r7 = 8
            goto L_0x023e
        L_0x0508:
            X.1bI r9 = r11.A0f
            android.view.View r1 = X.AnonymousClass3MY.A0I(r9, r7)
            float r0 = r12.A01
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3 / r0
            r1.setScaleX(r0)
            android.view.View r1 = r9.A02()
            float r0 = r12.A01
            float r3 = r3 / r0
            r1.setScaleY(r3)
            goto L_0x01cb
        L_0x0523:
            android.view.ViewGroup r0 = r11.A0H
            if (r0 == 0) goto L_0x01be
            r0.setVisibility(r5)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.A0J
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01be
            com.whatsapp.components.button.ThumbnailButton r0 = r11.A0S
            r0.setVisibility(r7)
            goto L_0x01be
        L_0x0539:
            r11.A0L(r5)
            goto L_0x0190
        L_0x053e:
            X.DRB r0 = r11.A05
            if (r0 == 0) goto L_0x0144
            float r1 = (float) r7
            r0.setCornerRadius(r1)
            boolean r0 = r3 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x0144
            X.C42491yG.A05(r3, r1)
            goto L_0x0144
        L_0x054f:
            X.5wl r5 = (X.C116285wl) r5
            X.DRB r1 = r5.A01
            if (r1 == 0) goto L_0x012e
            float r0 = r5.A00
            r1.setCornerRadius(r0)
            android.view.SurfaceView r1 = r5.A01
            float r0 = r5.A00
            X.C42491yG.A05(r1, r0)
            goto L_0x012e
        L_0x0563:
            if (r9 == 0) goto L_0x0571
            if (r8 != 0) goto L_0x0571
            r0 = 2131165650(0x7f0701d2, float:1.7945523E38)
            if (r1 == 0) goto L_0x010e
            r0 = 2131169533(0x7f0710fd, float:1.7953399E38)
            goto L_0x010e
        L_0x0571:
            r0 = 2131165638(0x7f0701c6, float:1.7945499E38)
            goto L_0x010e
        L_0x0576:
            com.whatsapp.WaRoundCornerImageView r0 = r11.A0O
            X.C72453Mb.A1B(r0)
            goto L_0x00f7
        L_0x057d:
            X.1Me r1 = r11.A0C
            X.1E7 r0 = r12.A0g
            java.lang.String r0 = r1.A0I(r0)
            goto L_0x00bb
        L_0x0587:
            r2 = r5
            X.5wl r2 = (X.C116285wl) r2
            android.view.SurfaceView r4 = r2.A01
            android.view.SurfaceHolder r1 = r4.getHolder()
            android.view.SurfaceHolder$Callback r0 = r2.A00
            r1.addCallback(r0)
            android.view.SurfaceHolder r0 = r4.getHolder()
            android.view.Surface r3 = r0.getSurface()
            if (r3 == 0) goto L_0x0074
            boolean r0 = r3.isValid()
            if (r0 == 0) goto L_0x0074
            X.DRB r0 = r2.A01
            if (r0 == 0) goto L_0x0074
            X.C17960vV.A07(r3)
            r0.A0B(r3)
            X.DRB r1 = r2.A01
            float r0 = r2.A00
            r1.setCornerRadius(r0)
            X.DRB r2 = r2.A01
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            r2.A0D(r3, r1, r0)
            goto L_0x0074
        L_0x05c5:
            if (r0 == r1) goto L_0x0074
            java.lang.String r0 = "Callback must be disconnected before connecting a different callback"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x05ce:
            r1 = 0
            r11.A0A = r1
            X.AfC r0 = r11.A0R
            X.DRB r0 = X.C21141AfC.A00(r0, r2, r1)
            r11.A05 = r0
            goto L_0x0044
        L_0x05db:
            java.lang.String r0 = "display - "
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116185wX.A0J(X.70A):void");
    }

    public void A0K() {
        View view = this.A0G;
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderMediaOverlay(true);
        }
        this.A0B = null;
        A02((Drawable) null);
    }

    public void A0L(int i) {
        C28931bI r1;
        this.A0J.setVisibility(i);
        WaTextView waTextView = this.A0P;
        int i2 = 8;
        if (waTextView != null && waTextView.getVisibility() == 0) {
            this.A0S.setVisibility(8);
        }
        if (i == 0) {
            this.A0N.setVisibility(8);
            r1 = this.A0X;
        } else {
            AnonymousClass70A r0 = this.A05;
            if (r0 != null) {
                this.A0N.setVisibility(C72453Mb.A07(r0.A0a ? 1 : 0));
                r1 = this.A0X;
                if (this.A05.A05 != 0) {
                    i2 = 0;
                }
            } else {
                return;
            }
        }
        r1.A04(i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116185wX(android.view.View r17, X.C24771Lp r18, X.AnonymousClass1VF r19, X.AnonymousClass6bT r20, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r21, X.C21141AfC r22, X.AnonymousClass1VW r23, X.C24921Me r24, X.C18000vb r25, X.C18030ve r26, X.AnonymousClass1DC r27, X.C18140vp r28, boolean r29, boolean r30) {
        /*
            r16 = this;
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r20
            r13 = r21
            r14 = r23
            r15 = r24
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4 = 0
            r9.A0A = r4
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            r9.A0E = r0
            r7 = 0
            r9.A02 = r7
            java.util.HashMap r0 = X.C17880vN.A11()
            r9.A0Z = r0
            X.7OJ r0 = new X.7OJ
            r0.<init>(r9)
            r9.A0g = r0
            r6 = r26
            r9.A0U = r6
            r0 = r25
            r9.A0T = r0
            r0 = 2131432881(0x7f0b15b1, float:1.8487532E38)
            com.whatsapp.WaImageView r3 = X.AnonymousClass3MW.A0R(r10, r0)
            r9.A0N = r3
            r0 = 2131432171(0x7f0b12eb, float:1.8486092E38)
            X.1bI r0 = X.C28931bI.A00(r10, r0)
            r9.A0f = r0
            r0 = 2131429767(0x7f0b0987, float:1.8481216E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            r9.A0F = r0
            r0 = 2131431008(0x7f0b0e60, float:1.8483733E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r9.A0M = r0
            r0 = 2131436745(0x7f0b24c9, float:1.849537E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r9.A0K = r0
            r0 = 2131436768(0x7f0b24e0, float:1.8495416E38)
            android.view.ViewGroup r1 = X.AnonymousClass3MW.A0D(r10, r0)
            r9.A0H = r1
            r0 = 2131433442(0x7f0b17e2, float:1.848867E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r10, r0)
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r9.A0J = r5
            r0 = 2131428678(0x7f0b0546, float:1.8479007E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r9.A0L = r0
            r0 = 2131436186(0x7f0b229a, float:1.8494235E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r9.A0d = r0
            r0 = 2131433441(0x7f0b17e1, float:1.8488668E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r10, r0)
            com.whatsapp.components.button.ThumbnailButton r2 = (com.whatsapp.components.button.ThumbnailButton) r2
            r9.A0S = r2
            r0 = 2131431196(0x7f0b0f1c, float:1.8484114E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.WaRoundCornerImageView r0 = (com.whatsapp.WaRoundCornerImageView) r0
            r9.A0O = r0
            r0 = 2131435843(0x7f0b2143, float:1.849354E38)
            android.view.View r0 = r10.findViewById(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r9.A0c = r0
            r0 = 2131435567(0x7f0b202f, float:1.849298E38)
            X.1bI r0 = X.C28931bI.A00(r10, r0)
            r9.A0Y = r0
            r0 = 2131432943(0x7f0b15ef, float:1.8487658E38)
            X.1bI r0 = X.C28931bI.A00(r10, r0)
            r9.A0X = r0
            r0 = r22
            r9.A0R = r0
            r0 = r30
            r9.A0h = r0
            r0 = r27
            r9.A0V = r0
            r0 = r28
            r9.A0a = r0
            r0 = r19
            r9.A0Q = r0
            if (r1 == 0) goto L_0x00dd
            r0 = 2131435610(0x7f0b205a, float:1.8493067E38)
            com.whatsapp.WaTextView r7 = X.AnonymousClass3MW.A0U(r1, r0)
        L_0x00dd:
            r9.A0P = r7
            r0 = 2131435942(0x7f0b21a6, float:1.849374E38)
            if (r29 == 0) goto L_0x00e7
            r0 = 2131436102(0x7f0b2246, float:1.8494065E38)
        L_0x00e7:
            android.view.View r1 = X.AnonymousClass1HF.A06(r10, r0)
            r9.A0G = r1
            r0 = 2131432913(0x7f0b15d1, float:1.8487597E38)
            X.1bI r0 = X.C28931bI.A00(r10, r0)
            r9.A0W = r0
            boolean r0 = r1 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x01b3
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            X.5wl r0 = new X.5wl
            r0.<init>(r1)
        L_0x0101:
            r9.A0e = r0
            android.content.res.Resources$Theme r8 = X.AnonymousClass3Ma.A06(r10)
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r1 = 2130968927(0x7f04015f, float:1.7546521E38)
            r0 = 1
            r8.resolveAttribute(r1, r7, r0)
            android.content.res.Resources r1 = r10.getResources()
            int r0 = r7.data
            if (r0 == 0) goto L_0x01ae
            int r0 = r7.resourceId
        L_0x011d:
            int r0 = r1.getDimensionPixelSize(r0)
            r9.A00 = r0
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165639(0x7f0701c7, float:1.79455E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.A01 = r0
            android.util.DisplayMetrics r0 = X.AnonymousClass3Ma.A09(r10)
            int r0 = r0.widthPixels
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r2.A01 = r1
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r10)
            android.content.Context r2 = r10.getContext()
            r1 = 2130968798(0x7f0400de, float:1.754626E38)
            r0 = 2131099872(0x7f0600e0, float:1.781211E38)
            int r2 = X.AnonymousClass3Ma.A01(r2, r7, r1, r0)
            r9.A0b = r2
            int r0 = r9.A00
            X.26p r1 = new X.26p
            r1.<init>(r0, r2)
            r9.A0B = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r4, r4, r4)
            r1.A00 = r0
            X.26p r0 = r9.A0B
            r9.A02(r0)
            r2 = 3
            X.793 r0 = new X.793
            r0.<init>(r9, r2)
            r9.A0I = r0
            r1 = 3153(0xc51, float:4.418E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r6, r1)
            if (r0 < r2) goto L_0x0188
            r2 = r10
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.util.List r1 = java.util.Collections.singletonList(r5)
            X.6x2 r0 = new X.6x2
            r0.<init>(r2, r1)
            r9.A02 = r0
        L_0x0188:
            X.77y r0 = new X.77y
            r0.<init>(r10, r9, r4)
            r10.addOnAttachStateChangeListener(r0)
            if (r21 == 0) goto L_0x01a0
            X.0vp r0 = r13.A19
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x01a0
            r0 = 2131232421(0x7f0806a5, float:1.808095E38)
            r3.setImageResource(r0)
        L_0x01a0:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165653(0x7f0701d5, float:1.794553E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.A0D = r0
            return
        L_0x01ae:
            r0 = 2131165637(0x7f0701c5, float:1.7945497E38)
            goto L_0x011d
        L_0x01b3:
            boolean r0 = r1 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x01c0
            android.view.TextureView r1 = (android.view.TextureView) r1
            X.5wm r0 = new X.5wm
            r0.<init>(r1)
            goto L_0x0101
        L_0x01c0:
            java.lang.String r0 = "videoView must be one of [SurfaceView, TextureView]"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116185wX.<init>(android.view.View, X.1Lp, X.1VF, X.6bT, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel, X.AfC, X.1VW, X.1Me, X.0vb, X.0ve, X.1DC, X.0vp, boolean, boolean):void");
    }
}
