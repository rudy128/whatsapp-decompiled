package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* renamed from: X.0QH  reason: invalid class name */
public class AnonymousClass0QH {
    public int A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public Handler A09;
    public Message A0A;
    public Message A0B;
    public Message A0C;
    public View A0D;
    public View A0E;
    public Button A0F;
    public Button A0G;
    public Button A0H;
    public ImageView A0I;
    public ListAdapter A0J;
    public ListView A0K;
    public TextView A0L;
    public TextView A0M;
    public NestedScrollView A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public CharSequence A0S;
    public boolean A0T;
    public final Context A0U;
    public final View.OnClickListener A0V = new C05240Rc(this, 0);
    public final Window A0W;
    public final AnonymousClass02A A0X;

    public static void A02(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            int i2 = 4;
            if (view.canScrollVertically(-1)) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    public static ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0124, code lost:
        if (r9.getVisibility() == 8) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0045, code lost:
        if (r11 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        if (A05(r11) == false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r12 = this;
            android.view.Window r4 = r12.A0W
            r0 = 2131433416(0x7f0b17c8, float:1.8488617E38)
            android.view.View r1 = r4.findViewById(r0)
            r0 = 2131436287(0x7f0b22ff, float:1.849444E38)
            r2 = 2131436287(0x7f0b22ff, float:1.849444E38)
            android.view.View r7 = r1.findViewById(r0)
            r0 = 2131429511(0x7f0b0887, float:1.8480697E38)
            r9 = 2131429511(0x7f0b0887, float:1.8480697E38)
            android.view.View r6 = r1.findViewById(r0)
            r0 = 2131428582(0x7f0b04e6, float:1.8478813E38)
            r8 = 2131428582(0x7f0b04e6, float:1.8478813E38)
            android.view.View r5 = r1.findViewById(r0)
            r0 = 2131429748(0x7f0b0974, float:1.8481177E38)
            android.view.View r3 = r1.findViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r11 = r12.A0E
            r10 = 0
            if (r11 != 0) goto L_0x0047
            int r0 = r12.A07
            if (r0 == 0) goto L_0x028e
            android.content.Context r0 = r12.A0U
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int r0 = r12.A07
            android.view.View r11 = r1.inflate(r0, r3, r10)
            if (r11 == 0) goto L_0x004e
        L_0x0047:
            r10 = 1
            boolean r0 = A05(r11)
            if (r0 != 0) goto L_0x026d
        L_0x004e:
            r0 = 131072(0x20000, float:1.83671E-40)
            r4.setFlags(r0, r0)
            if (r10 != 0) goto L_0x026d
            r0 = 8
            r3.setVisibility(r0)
        L_0x005a:
            android.view.View r2 = r3.findViewById(r2)
            android.view.View r1 = r3.findViewById(r9)
            android.view.View r0 = r3.findViewById(r8)
            android.view.ViewGroup r9 = A00(r2, r7)
            android.view.ViewGroup r8 = A00(r1, r6)
            android.view.ViewGroup r7 = A00(r0, r5)
            r12.A03(r8)
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r12.A0H = r0
            android.view.View$OnClickListener r10 = r12.A0V
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r12.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r6 = 8
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L_0x025e
            android.widget.Button r0 = r12.A0H
            r0.setVisibility(r6)
            r11 = 0
        L_0x0097:
            r0 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r12.A0F = r0
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r12.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x024e
            android.widget.Button r0 = r12.A0F
            r0.setVisibility(r6)
        L_0x00b2:
            r0 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r12.A0G = r0
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r12.A0P
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x023e
            android.widget.Button r0 = r12.A0G
            r0.setVisibility(r6)
        L_0x00cd:
            android.content.Context r0 = r12.A0U
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r0 = 2130968654(0x7f04004e, float:1.7545968E38)
            r1.resolveAttribute(r0, r2, r5)
            int r0 = r2.data
            if (r0 == 0) goto L_0x0237
            if (r11 != r5) goto L_0x0229
            android.widget.Button r2 = r12.A0H
        L_0x00e6:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r1.gravity = r5
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.weight = r0
            r2.setLayoutParams(r1)
        L_0x00f5:
            r1 = r9
            android.view.View r0 = r12.A0D
            r2 = 8
            if (r0 == 0) goto L_0x01b5
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r5.<init>(r1, r0)
            android.view.View r1 = r12.A0D
            r0 = 0
            r9.addView(r1, r0, r5)
            r0 = 2131436242(0x7f0b22d2, float:1.8494349E38)
            android.view.View r1 = r4.findViewById(r0)
        L_0x0110:
            r1.setVisibility(r6)
        L_0x0113:
            r4 = 1
            r6 = 0
            int r0 = r3.getVisibility()
            boolean r11 = X.AnonymousClass000.A1S(r0, r2)
            if (r9 == 0) goto L_0x0126
            int r0 = r9.getVisibility()
            r10 = 1
            if (r0 != r2) goto L_0x0127
        L_0x0126:
            r10 = 0
        L_0x0127:
            int r0 = r7.getVisibility()
            r7 = 1
            if (r0 != r2) goto L_0x013d
            r7 = 0
            if (r8 == 0) goto L_0x013d
            r0 = 2131436050(0x7f0b2212, float:1.849396E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x013d
            r0.setVisibility(r6)
        L_0x013d:
            if (r10 == 0) goto L_0x01ab
            androidx.core.widget.NestedScrollView r0 = r12.A0N
            if (r0 == 0) goto L_0x0146
            r0.setClipToPadding(r4)
        L_0x0146:
            java.lang.CharSequence r0 = r12.A0R
            if (r0 != 0) goto L_0x014e
            android.widget.ListView r0 = r12.A0K
            if (r0 == 0) goto L_0x015a
        L_0x014e:
            r0 = 2131436210(0x7f0b22b2, float:1.8494284E38)
            android.view.View r0 = r9.findViewById(r0)
        L_0x0155:
            if (r0 == 0) goto L_0x015a
            r0.setVisibility(r6)
        L_0x015a:
            android.widget.ListView r5 = r12.A0K
            boolean r0 = r5 instanceof androidx.appcompat.app.AlertController$RecycleListView
            if (r0 == 0) goto L_0x017d
            androidx.appcompat.app.AlertController$RecycleListView r5 = (androidx.appcompat.app.AlertController$RecycleListView) r5
            if (r7 == 0) goto L_0x0166
            if (r10 != 0) goto L_0x017d
        L_0x0166:
            int r3 = r5.getPaddingLeft()
            if (r10 == 0) goto L_0x01a8
            int r2 = r5.getPaddingTop()
        L_0x0170:
            int r1 = r5.getPaddingRight()
            if (r7 == 0) goto L_0x01a5
            int r0 = r5.getPaddingBottom()
        L_0x017a:
            r5.setPadding(r3, r2, r1, r0)
        L_0x017d:
            if (r11 != 0) goto L_0x018e
            android.widget.ListView r0 = r12.A0K
            if (r0 != 0) goto L_0x0187
            androidx.core.widget.NestedScrollView r0 = r12.A0N
            if (r0 == 0) goto L_0x018e
        L_0x0187:
            if (r7 == 0) goto L_0x018a
            r6 = 2
        L_0x018a:
            r10 = r10 | r6
            r12.A04(r8, r0, r10)
        L_0x018e:
            android.widget.ListView r2 = r12.A0K
            if (r2 == 0) goto L_0x01a4
            android.widget.ListAdapter r0 = r12.A0J
            if (r0 == 0) goto L_0x01a4
            r2.setAdapter(r0)
            int r1 = r12.A01
            r0 = -1
            if (r1 <= r0) goto L_0x01a4
            r2.setItemChecked(r1, r4)
            r2.setSelection(r1)
        L_0x01a4:
            return
        L_0x01a5:
            int r0 = r5.A00
            goto L_0x017a
        L_0x01a8:
            int r2 = r5.A01
            goto L_0x0170
        L_0x01ab:
            if (r8 == 0) goto L_0x015a
            r0 = 2131436051(0x7f0b2213, float:1.8493961E38)
            android.view.View r0 = r8.findViewById(r0)
            goto L_0x0155
        L_0x01b5:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.A0I = r0
            java.lang.CharSequence r0 = r12.A0S
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0218
            boolean r0 = r12.A0T
            if (r0 == 0) goto L_0x0218
            r0 = 2131427746(0x7f0b01a2, float:1.8477117E38)
            android.view.View r1 = r4.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r12.A0M = r1
            java.lang.CharSequence r0 = r12.A0S
            r1.setText(r0)
            int r1 = r12.A02
            if (r1 == 0) goto L_0x01e9
            android.widget.ImageView r0 = r12.A0I
            r0.setImageResource(r1)
            goto L_0x0113
        L_0x01e9:
            android.graphics.drawable.Drawable r1 = r12.A08
            if (r1 == 0) goto L_0x01f4
            android.widget.ImageView r0 = r12.A0I
            r0.setImageDrawable(r1)
            goto L_0x0113
        L_0x01f4:
            android.widget.TextView r6 = r12.A0M
            android.widget.ImageView r0 = r12.A0I
            int r5 = r0.getPaddingLeft()
            android.widget.ImageView r0 = r12.A0I
            int r4 = r0.getPaddingTop()
            android.widget.ImageView r0 = r12.A0I
            int r1 = r0.getPaddingRight()
            android.widget.ImageView r0 = r12.A0I
            int r0 = r0.getPaddingBottom()
            r6.setPadding(r5, r4, r1, r0)
            android.widget.ImageView r0 = r12.A0I
            r0.setVisibility(r2)
            goto L_0x0113
        L_0x0218:
            r0 = 2131436242(0x7f0b22d2, float:1.8494349E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.setVisibility(r6)
            android.widget.ImageView r0 = r12.A0I
            r0.setVisibility(r6)
            goto L_0x0110
        L_0x0229:
            r0 = 2
            if (r11 != r0) goto L_0x0230
            android.widget.Button r2 = r12.A0F
            goto L_0x00e6
        L_0x0230:
            r0 = 4
            if (r11 != r0) goto L_0x0237
            android.widget.Button r2 = r12.A0G
            goto L_0x00e6
        L_0x0237:
            if (r11 != 0) goto L_0x00f5
            r7.setVisibility(r6)
            goto L_0x00f5
        L_0x023e:
            android.widget.Button r1 = r12.A0G
            java.lang.CharSequence r0 = r12.A0P
            r1.setText(r0)
            android.widget.Button r0 = r12.A0G
            r0.setVisibility(r2)
            r11 = r11 | 4
            goto L_0x00cd
        L_0x024e:
            android.widget.Button r1 = r12.A0F
            java.lang.CharSequence r0 = r12.A0O
            r1.setText(r0)
            android.widget.Button r0 = r12.A0F
            r0.setVisibility(r2)
            r11 = r11 | 2
            goto L_0x00b2
        L_0x025e:
            android.widget.Button r1 = r12.A0H
            java.lang.CharSequence r0 = r12.A0Q
            r1.setText(r0)
            android.widget.Button r0 = r12.A0H
            r0.setVisibility(r2)
            r11 = 1
            goto L_0x0097
        L_0x026d:
            r0 = 2131429747(0x7f0b0973, float:1.8481175E38)
            android.view.View r10 = r4.findViewById(r0)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r10.addView(r11, r0)
            android.widget.ListView r0 = r12.A0K
            if (r0 == 0) goto L_0x005a
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 0
            r1.weight = r0
            goto L_0x005a
        L_0x028e:
            r11 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QH.A01():void");
    }

    private void A03(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.A0W.findViewById(2131434834);
        this.A0N = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A0N.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.A0L = textView;
        if (textView != null) {
            CharSequence charSequence = this.A0R;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A0N.removeView(this.A0L);
            if (this.A0K != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A0N.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A0N);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.A0K, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.widget.ListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.core.widget.NestedScrollView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.widget.ListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.widget.ListView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(android.view.ViewGroup r5, android.view.View r6, int r7) {
        /*
            r4 = this;
            android.view.Window r1 = r4.A0W
            r0 = 2131434833(0x7f0b1d51, float:1.8491491E38)
            android.view.View r3 = r1.findViewById(r0)
            r0 = 2131434832(0x7f0b1d50, float:1.849149E38)
            android.view.View r2 = r1.findViewById(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0024
            X.AnonymousClass1HF.A0d(r6, r7)
        L_0x0019:
            if (r3 == 0) goto L_0x001e
            r5.removeView(r3)
        L_0x001e:
            if (r2 == 0) goto L_0x0023
            r5.removeView(r2)
        L_0x0023:
            return
        L_0x0024:
            r1 = 0
            if (r3 == 0) goto L_0x002f
            r0 = r7 & 1
            if (r0 != 0) goto L_0x002f
            r5.removeView(r3)
            r3 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            r0 = r7 & 2
            if (r0 != 0) goto L_0x0039
            r5.removeView(r2)
            r2 = r1
        L_0x0039:
            if (r3 != 0) goto L_0x003d
            if (r2 == 0) goto L_0x0023
        L_0x003d:
            java.lang.CharSequence r0 = r4.A0R
            if (r0 == 0) goto L_0x0054
            androidx.core.widget.NestedScrollView r1 = r4.A0N
            X.0Y2 r0 = new X.0Y2
            r0.<init>(r3, r2, r4)
            r1.setOnScrollChangeListener(r0)
            X.0ZN r0 = new X.0ZN
            r0.<init>(r3, r2, r4)
        L_0x0050:
            r1.post(r0)
            return
        L_0x0054:
            android.widget.ListView r1 = r4.A0K
            if (r1 == 0) goto L_0x0019
            X.0Rr r0 = new X.0Rr
            r0.<init>(r3, r2, r4)
            r1.setOnScrollListener(r0)
            android.widget.ListView r1 = r4.A0K
            X.0ZO r0 = new X.0ZO
            r0.<init>(r3, r2, r4)
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QH.A04(android.view.ViewGroup, android.view.View, int):void");
    }

    public void A06() {
        this.A0X.setContentView(this.A00);
        A01();
    }

    public boolean A07(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A0N;
        if (nestedScrollView == null || !nestedScrollView.A0H(keyEvent)) {
            return false;
        }
        return true;
    }

    public boolean A08(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A0N;
        if (nestedScrollView == null || !nestedScrollView.A0H(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.04w, android.os.Handler] */
    public AnonymousClass0QH(Context context, Window window, AnonymousClass02A r7) {
        this.A0U = context;
        this.A0X = r7;
        this.A0W = window;
        ? handler = new Handler();
        handler.A00 = new WeakReference(r7);
        this.A09 = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C002501d.A04, 2130968655, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A04 = obtainStyledAttributes.getResourceId(4, 0);
        this.A05 = obtainStyledAttributes.getResourceId(5, 0);
        this.A06 = obtainStyledAttributes.getResourceId(7, 0);
        this.A03 = obtainStyledAttributes.getResourceId(3, 0);
        this.A0T = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        r7.A05();
    }

    public static boolean A05(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (A05(viewGroup.getChildAt(childCount))) {
                }
            }
        }
        return false;
        return true;
    }
}
