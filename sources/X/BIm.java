package X;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class BIm extends LinearLayout {
    public int A00;
    public int A01 = 0;
    public ColorStateList A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public PorterDuff.Mode A05;
    public View.OnLongClickListener A06;
    public View.OnLongClickListener A07;
    public EditText A08;
    public ImageView.ScaleType A09;
    public E0F A0A;
    public CharSequence A0B;
    public boolean A0C;
    public final TextWatcher A0D = new BiX(this);
    public final AccessibilityManager A0E;
    public final TextView A0F;
    public final CheckableImageButton A0G;
    public final CheckableImageButton A0H;
    public final C24951CRb A0I;
    public final TextInputLayout A0J;
    public final LinkedHashSet A0K = C17880vN.A14();
    public final FrameLayout A0L;
    public final C28523E5n A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.A0H.getVisibility() == 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r4.A0C != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r4 = this;
            android.widget.FrameLayout r3 = r4.A0L
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0G
            int r0 = r0.getVisibility()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0H
            int r1 = r0.getVisibility()
            r0 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r0 = 8
        L_0x0016:
            r3.setVisibility(r0)
            java.lang.CharSequence r0 = r4.A0B
            if (r0 == 0) goto L_0x0022
            boolean r0 = r4.A0C
            r1 = 0
            if (r0 == 0) goto L_0x0024
        L_0x0022:
            r1 = 8
        L_0x0024:
            boolean r0 = r4.A0B()
            if (r0 != 0) goto L_0x0036
            com.google.android.material.internal.CheckableImageButton r0 = r4.A0H
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0036
            if (r1 == 0) goto L_0x0036
            r2 = 8
        L_0x0036:
            r4.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIm.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r1.A07() != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.BIm r4) {
        /*
            com.google.android.material.internal.CheckableImageButton r3 = r4.A0H
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.google.android.material.textfield.TextInputLayout r0 = r4.A0J
            X.CtC r1 = r0.A16
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x002a
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x002a
        L_0x0017:
            r3.setVisibility(r2)
            r4.A00()
            r4.A04()
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0029
            com.google.android.material.textfield.TextInputLayout r0 = r4.A0J
            r0.A0J()
        L_0x0029:
            return
        L_0x002a:
            r2 = 8
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIm.A01(X.BIm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5.A0C != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.BIm r5) {
        /*
            android.widget.TextView r4 = r5.A0F
            int r1 = r4.getVisibility()
            java.lang.CharSequence r0 = r5.A0B
            r3 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.A0C
            r2 = 0
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r2 = 8
        L_0x0012:
            if (r1 == r2) goto L_0x002a
            X.CcZ r1 = r5.A03()
            if (r2 != 0) goto L_0x001b
            r3 = 1
        L_0x001b:
            boolean r0 = r1 instanceof X.Bin
            if (r0 == 0) goto L_0x002a
            X.Bin r1 = (X.Bin) r1
            X.BIm r0 = r1.A02
            java.lang.CharSequence r0 = r0.A0B
            if (r0 == 0) goto L_0x002a
            X.Bin.A00(r1, r3)
        L_0x002a:
            r5.A00()
            r4.setVisibility(r2)
            com.google.android.material.textfield.TextInputLayout r0 = r5.A0J
            r0.A0J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIm.A02(X.BIm):void");
    }

    public C25277CcZ A03() {
        C24951CRb cRb = this.A0I;
        int i = this.A01;
        SparseArray sparseArray = cRb.A02;
        C25277CcZ ccZ = (C25277CcZ) sparseArray.get(i);
        if (ccZ == null) {
            if (i == -1) {
                ccZ = new C25277CcZ(cRb.A03);
            } else if (i == 0) {
                ccZ = new C25277CcZ(cRb.A03);
            } else if (i == 1) {
                ccZ = new AnonymousClass8RJ(cRb.A03, cRb.A01);
            } else if (i == 2) {
                ccZ = new Bin(cRb.A03);
            } else if (i == 3) {
                ccZ = new Bio(cRb.A03);
            } else {
                throw AnonymousClass001.A13("Invalid end icon mode: ", AnonymousClass000.A10(), i);
            }
            sparseArray.append(i, ccZ);
        }
        return ccZ;
    }

    public void A04() {
        int i;
        TextInputLayout textInputLayout = this.A0J;
        if (textInputLayout.A0B != null) {
            if (A0B() || this.A0H.getVisibility() == 0) {
                i = 0;
            } else {
                i = textInputLayout.A0B.getPaddingEnd();
            }
            this.A0F.setPaddingRelative(AnonymousClass000.A0Y(this).getDimensionPixelSize(2131167667), textInputLayout.A0B.getPaddingTop(), i, textInputLayout.A0B.getPaddingBottom());
        }
    }

    public void A05(int i) {
        if (i < 0) {
            throw AnonymousClass000.A0k("endIconSize cannot be less than 0");
        } else if (i != this.A00) {
            this.A00 = i;
            CheckableImageButton checkableImageButton = this.A0G;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = this.A0H;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void A06(int i) {
        Drawable A0F2;
        E0F e0f;
        View.OnFocusChangeListener onFocusChangeListener;
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        if (this.A01 != i) {
            C25277CcZ A032 = A03();
            E0F e0f2 = this.A0A;
            if (!(e0f2 == null || (accessibilityManager2 = this.A0E) == null)) {
                accessibilityManager2.removeTouchExplorationStateChangeListener(new D5L(e0f2));
            }
            this.A0A = null;
            A032.A08();
            this.A01 = i;
            Iterator it = this.A0K.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("onEndIconChanged");
            }
            A0A(AnonymousClass000.A1O(i));
            C25277CcZ A033 = A03();
            int i2 = this.A0I.A00;
            if (i2 == 0 && (i2 = A033.A03()) == 0) {
                A0F2 = null;
            } else {
                A0F2 = BE7.A0F(this, i2);
            }
            A07(A0F2);
            CharSequence A0a = BEA.A0a(this, A033.A02());
            CheckableImageButton checkableImageButton = this.A0G;
            BE9.A16(checkableImageButton, A0a);
            checkableImageButton.setCheckable(A033.A0A());
            TextInputLayout textInputLayout = this.A0J;
            int i3 = textInputLayout.A01;
            boolean z = A033 instanceof Bio;
            if (!z || AnonymousClass000.A1O(i3)) {
                A033.A07();
                if (z) {
                    e0f = ((Bio) A033).A0D;
                } else {
                    e0f = null;
                }
                this.A0A = e0f;
                if (!(e0f == null || (accessibilityManager = this.A0E) == null || !isAttachedToWindow())) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new D5L(this.A0A));
                }
                View.OnClickListener A042 = A033.A04();
                View.OnLongClickListener onLongClickListener = this.A06;
                checkableImageButton.setOnClickListener(A042);
                C26165Cte.A03(onLongClickListener, checkableImageButton);
                EditText editText = this.A08;
                if (editText != null) {
                    A033.A09(editText);
                    EditText editText2 = this.A08;
                    if (editText2 != null) {
                        View.OnFocusChangeListener A052 = A033.A05();
                        if (A052 != null) {
                            editText2.setOnFocusChangeListener(A052);
                        }
                        if ((A033 instanceof Bin) && (onFocusChangeListener = ((Bin) A033).A08) != null) {
                            checkableImageButton.setOnFocusChangeListener(onFocusChangeListener);
                        }
                    }
                }
                C26165Cte.A01(this.A02, this.A04, checkableImageButton, textInputLayout);
                A09(true);
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("The current box background mode ");
            A10.append(i3);
            throw AnonymousClass8BX.A0W(" is not supported by the end icon mode ", A10, i);
        }
    }

    public void A07(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A0G;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            TextInputLayout textInputLayout = this.A0J;
            C26165Cte.A01(this.A02, this.A04, checkableImageButton, textInputLayout);
            C26165Cte.A02(this.A02, checkableImageButton, textInputLayout);
        }
    }

    public void A08(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.A0H;
        checkableImageButton.setImageDrawable(drawable);
        A01(this);
        C26165Cte.A01(this.A03, this.A05, checkableImageButton, this.A0J);
    }

    public boolean A0B() {
        if (this.A0L.getVisibility() == 0 && this.A0G.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public BIm(C002401c r12, TextInputLayout textInputLayout) {
        super(textInputLayout.getContext());
        DLE dle = new DLE(this);
        this.A0M = dle;
        this.A0E = BEA.A0O(this);
        this.A0J = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.A0L = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater A0D2 = AnonymousClass3MZ.A0D(this);
        CheckableImageButton checkableImageButton = (CheckableImageButton) A0D2.inflate(2131625083, this, false);
        checkableImageButton.setId(2131436067);
        C26165Cte.A04(checkableImageButton);
        if (AnonymousClass1YT.A04(getContext())) {
            AnonymousClass3MW.A0B(checkableImageButton).setMarginStart(0);
        }
        this.A0H = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) A0D2.inflate(2131625083, frameLayout, false);
        checkableImageButton2.setId(2131436066);
        C26165Cte.A04(checkableImageButton2);
        if (AnonymousClass1YT.A04(getContext())) {
            AnonymousClass3MW.A0B(checkableImageButton2).setMarginStart(0);
        }
        this.A0G = checkableImageButton2;
        this.A0I = new C24951CRb(r12, this);
        AnonymousClass03P r3 = new AnonymousClass03P(getContext());
        this.A0F = r3;
        TypedArray typedArray = r12.A02;
        if (typedArray.hasValue(36)) {
            this.A03 = AnonymousClass1YT.A02(getContext(), r12, 36);
        }
        if (typedArray.hasValue(37)) {
            this.A05 = AnonymousClass1YU.A01((PorterDuff.Mode) null, typedArray.getInt(37, -1));
        }
        if (typedArray.hasValue(35)) {
            A08(r12.A03(35));
        }
        CheckableImageButton checkableImageButton3 = this.A0H;
        checkableImageButton3.setContentDescription(getResources().getText(2131898956));
        checkableImageButton3.setImportantForAccessibility(2);
        checkableImageButton3.setClickable(false);
        checkableImageButton3.A01 = false;
        checkableImageButton3.setFocusable(false);
        if (!typedArray.hasValue(51)) {
            if (typedArray.hasValue(30)) {
                this.A02 = AnonymousClass1YT.A02(getContext(), r12, 30);
            }
            if (typedArray.hasValue(31)) {
                this.A04 = AnonymousClass1YU.A01((PorterDuff.Mode) null, typedArray.getInt(31, -1));
            }
        }
        if (typedArray.hasValue(28)) {
            A06(typedArray.getInt(28, 0));
            if (typedArray.hasValue(25)) {
                BE9.A16(this.A0G, typedArray.getText(25));
            }
            this.A0G.setCheckable(typedArray.getBoolean(24, true));
        } else if (typedArray.hasValue(51)) {
            if (typedArray.hasValue(52)) {
                this.A02 = AnonymousClass1YT.A02(getContext(), r12, 52);
            }
            if (typedArray.hasValue(53)) {
                this.A04 = AnonymousClass1YU.A01((PorterDuff.Mode) null, typedArray.getInt(53, -1));
            }
            A06(typedArray.getBoolean(51, false) ? 1 : 0);
            BE9.A16(this.A0G, typedArray.getText(49));
        }
        A05(typedArray.getDimensionPixelSize(27, getResources().getDimensionPixelSize(2131167880)));
        if (typedArray.hasValue(29)) {
            ImageView.ScaleType A002 = C26165Cte.A00(typedArray.getInt(29, -1));
            this.A09 = A002;
            this.A0G.setScaleType(A002);
            this.A0H.setScaleType(A002);
        }
        TextView textView = this.A0F;
        textView.setVisibility(8);
        textView.setId(2131436100);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        textView.setAccessibilityLiveRegion(1);
        C29261bv.A08(textView, typedArray.getResourceId(70, 0));
        if (typedArray.hasValue(71)) {
            textView.setTextColor(r12.A01(71));
        }
        CharSequence text = typedArray.getText(69);
        this.A0B = TextUtils.isEmpty(text) ? null : text;
        textView.setText(text);
        A02(this);
        frameLayout.addView(checkableImageButton2);
        addView(r3);
        addView(frameLayout);
        addView(checkableImageButton);
        textInputLayout.A18.add(dle);
        if (textInputLayout.A0B != null) {
            dle.BsV(textInputLayout);
        }
        addOnAttachStateChangeListener(new C26569D4j(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r6.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r2 = r6.A0G;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(boolean r7) {
        /*
            r6 = this;
            X.CcZ r5 = r6.A03()
            boolean r0 = r5.A0A()
            r4 = 1
            if (r0 == 0) goto L_0x0042
            com.google.android.material.internal.CheckableImageButton r2 = r6.A0G
            boolean r1 = r2.isChecked()
            boolean r0 = r5.A0B()
            if (r1 == r0) goto L_0x0042
            r0 = r1 ^ 1
            r2.setChecked(r0)
            r3 = 1
        L_0x001d:
            boolean r0 = r5 instanceof X.Bio
            if (r0 == 0) goto L_0x0040
            com.google.android.material.internal.CheckableImageButton r2 = r6.A0G
            boolean r1 = r2.isActivated()
            X.Bio r5 = (X.Bio) r5
            boolean r0 = r5.A06
            if (r1 == r0) goto L_0x0040
            r0 = r1 ^ 1
            r2.setActivated(r0)
        L_0x0032:
            if (r7 != 0) goto L_0x0036
            if (r4 == 0) goto L_0x003f
        L_0x0036:
            com.google.android.material.textfield.TextInputLayout r2 = r6.A0J
            com.google.android.material.internal.CheckableImageButton r1 = r6.A0G
            android.content.res.ColorStateList r0 = r6.A02
            X.C26165Cte.A02(r0, r1, r2)
        L_0x003f:
            return
        L_0x0040:
            r4 = r3
            goto L_0x0032
        L_0x0042:
            r3 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIm.A09(boolean):void");
    }

    public void A0A(boolean z) {
        if (A0B() != z) {
            this.A0G.setVisibility(C72453Mb.A07(z ? 1 : 0));
            A00();
            A04();
            this.A0J.A0J();
        }
    }
}
