package com.whatsapp.search.views;

import X.AM6;
import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1XU;
import X.AnonymousClass1YL;
import X.AnonymousClass1Z2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4M1;
import X.AnonymousClass6F9;
import X.AnonymousClass77M;
import X.AnonymousClass77Z;
import X.C108625c1;
import X.C130156iy;
import X.C134176qA;
import X.C137376vM;
import X.C146777Qo;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C20045A4o;
import X.C20135A8w;
import X.C22851Dl;
import X.C24921Me;
import X.C28931bI;
import X.C38711rl;
import X.C42171xk;
import X.C62762rw;
import X.C72453Mb;
import X.C72463Mc;
import X.C88754aj;
import X.C90064dT;
import X.C91614fy;
import X.C98204qk;
import X.C98254qp;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.chip.Chip;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.text.FinalBackspaceAwareEntry;
import java.util.List;

public class TokenizedSearchInput extends LinearLayout implements AnonymousClass009 {
    public int A00;
    public C22851Dl A01;
    public Chip A02;
    public AnonymousClass1KB A03;
    public WaImageButton A04;
    public WaImageButton A05;
    public AnonymousClass1M9 A06;
    public C24921Me A07;
    public AnonymousClass11C A08;
    public C18000vb A09;
    public C18030ve A0A;
    public UserJid A0B;
    public AnonymousClass77M A0C;
    public AnonymousClass77Z A0D;
    public C134176qA A0E;
    public C108625c1 A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass031 A0K;
    public Integer A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public int A0Q;
    public Runnable A0R;
    public Runnable A0S;
    public boolean A0T;
    public final View.OnClickListener A0U;
    public final View.OnFocusChangeListener A0V;
    public final View.OnKeyListener A0W;
    public final TextView.OnEditorActionListener A0X;
    public final AnonymousClass1XU A0Y;
    public final WaImageView A0Z;
    public final AnonymousClass4M1 A0a;
    public final FinalBackspaceAwareEntry A0b;
    public final C28931bI A0c;
    public final C28931bI A0d;
    public final C28931bI A0e;
    public final C28931bI A0f;
    public final List A0g;
    public final View.OnClickListener A0h;
    public final View.OnClickListener A0i;
    public final View A0j;

    public TokenizedSearchInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A03() {
        Chip chip = this.A02;
        if (chip != null) {
            AnonymousClass77M r0 = this.A0C;
            if (r0 == null) {
                chip.setVisibility(8);
                return;
            }
            A08(chip, (String) null, r0.A04, r0.A02, 5);
            C134176qA r1 = this.A0E;
            if (r1 != null) {
                r1.A01(this.A0M);
            }
        }
    }

    private void A04() {
        AnonymousClass77Z r0 = this.A0D;
        C28931bI r1 = this.A0e;
        if (r0 == null) {
            r1.A04(8);
            return;
        }
        AnonymousClass77Z r02 = this.A0D;
        A08((Chip) r1.A02(), r02.A04, r02.A02, r02.A00, 3);
    }

    /* access modifiers changed from: private */
    public void setGridListState(Boolean bool) {
        int i = 0;
        if (bool != null && bool.booleanValue()) {
            i = 1;
        }
        this.A0Q = i;
        A00();
    }

    public /* synthetic */ void A0N() {
        setFocus(1);
    }

    public /* synthetic */ void A0O() {
        setFocus(2);
    }

    public /* synthetic */ void A0P() {
        setFocus(3);
    }

    public /* synthetic */ void A0Q() {
        setFocus(5);
    }

    public /* synthetic */ void A0R() {
        setFocus(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (A0J() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r3 = this;
            com.whatsapp.WaImageView r2 = r3.A0Z
            java.lang.String r0 = r3.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0011
            boolean r1 = r3.A0J()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r0 = r0 ^ 1
            r2.setEnabled(r0)
            X.1bI r0 = r3.A0d
            android.view.View r1 = r0.A02()
            boolean r0 = r3.A0N
            r1.setEnabled(r0)
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x002a
            A0C(r3)
            return
        L_0x002a:
            java.lang.Runnable r0 = r3.A0S
            if (r0 == 0) goto L_0x0031
            r3.removeCallbacks(r0)
        L_0x0031:
            java.lang.Runnable r0 = r3.A0R
            if (r0 == 0) goto L_0x0038
            r3.removeCallbacks(r0)
        L_0x0038:
            r0 = 18
            X.7Qo r2 = new X.7Qo
            r2.<init>((java.lang.Object) r3, (int) r0)
            r3.A0S = r2
            r0 = 50
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A00():void");
    }

    private void A01() {
        FinalBackspaceAwareEntry finalBackspaceAwareEntry;
        String string;
        if (this.A0B != null && this.A0L.intValue() != 0) {
            finalBackspaceAwareEntry = this.A0b;
            string = "";
        } else if (this.A0T) {
            String hintForMetaAISearch = getHintForMetaAISearch();
            this.A0b.setHint(hintForMetaAISearch);
            C134176qA r1 = this.A0E;
            if (r1 != null) {
                C18070vi.A0d(hintForMetaAISearch, 0);
                r1.A09 = hintForMetaAISearch;
                return;
            }
            return;
        } else {
            finalBackspaceAwareEntry = this.A0b;
            string = getContext().getString(2131895489);
        }
        finalBackspaceAwareEntry.setHint(string);
    }

    private void A02() {
        UserJid userJid = this.A0B;
        C28931bI r6 = this.A0c;
        if (userJid == null) {
            r6.A04(8);
            return;
        }
        int A012 = r6.A01();
        boolean z = true;
        Chip chip = (Chip) r6.A02();
        if (A012 == 8) {
            A07(chip, AnonymousClass1YL.A00(getContext(), 2130971100, 2131102426));
        } else {
            chip.setChipBackgroundColor(A0K(AnonymousClass000.A1T(this.A00, 2)));
        }
        Chip chip2 = (Chip) r6.A02();
        if (this.A00 != 2) {
            z = false;
        }
        A0T(chip2, z);
    }

    public static void A06(View view, TokenizedSearchInput tokenizedSearchInput) {
        if (tokenizedSearchInput.A0F != null) {
            if (view == tokenizedSearchInput.A0f.A02()) {
                tokenizedSearchInput.A0F.C4n();
            } else if (view == tokenizedSearchInput.A0c.A02()) {
                tokenizedSearchInput.A0F.C4k();
            } else if (view == tokenizedSearchInput.A0e.A02()) {
                tokenizedSearchInput.A0F.C5p();
            } else if (view == tokenizedSearchInput.A02) {
                tokenizedSearchInput.A0F.C30(true);
                C134176qA r0 = tokenizedSearchInput.A0E;
                if (r0 != null) {
                    r0.A00();
                }
            }
        }
        tokenizedSearchInput.postDelayed(new C146777Qo((Object) tokenizedSearchInput, 19), 100);
    }

    private void A08(Chip chip, String str, int i, int i2, int i3) {
        if (!C72453Mb.A1W(this.A0H) || str == null) {
            chip.setText(i);
        } else {
            chip.setText(str);
        }
        C72463Mc.A0w(getContext(), getContext(), chip, 2130970097, AnonymousClass1YL.A00(getContext(), 2130971957, 2131103410));
        AnonymousClass6F9.A02(getContext(), chip, i2, AnonymousClass1YL.A00(getContext(), 2130970097, AnonymousClass1YL.A00(getContext(), 2130971957, 2131103410)));
        boolean z = true;
        chip.setChipBackgroundColor(A0K(AnonymousClass000.A1T(this.A00, i3)));
        if (this.A00 != i3) {
            z = false;
        }
        A0T(chip, z);
        if (chip.getVisibility() == 8) {
            A07(chip, AnonymousClass1YL.A00(getContext(), 2130971100, 2131102426));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r1 == 8) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(com.whatsapp.search.views.TokenizedSearchInput r6) {
        /*
            int r0 = r6.A0Q
            X.1bI r5 = r6.A0d
            android.view.View r1 = r5.A02()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            if (r0 == 0) goto L_0x0076
            r0 = 2131232047(0x7f08052f, float:1.8080192E38)
            r1.setImageResource(r0)
            android.view.View r2 = r5.A02()
            android.content.Context r1 = r6.getContext()
            r0 = 2131896665(0x7f122959, float:1.9428198E38)
        L_0x001d:
            X.AnonymousClass3MY.A0w(r1, r2, r0)
            int r4 = r5.A01()
            boolean r0 = r6.A0N
            r3 = 4
            r2 = 8
            if (r0 == 0) goto L_0x006a
            r1 = 0
        L_0x002c:
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x003c
            r5.A04(r1)
            A0D(r6)
            A0F(r6)
            A0E(r6)
        L_0x003c:
            if (r4 != r2) goto L_0x004d
            if (r1 != r2) goto L_0x005b
        L_0x0040:
            r5.A04(r1)
            A0D(r6)
            A0F(r6)
            A0E(r6)
            return
        L_0x004d:
            if (r1 != r2) goto L_0x0040
            r5.A04(r3)
            A0D(r6)
            A0F(r6)
            A0E(r6)
        L_0x005b:
            r0 = 40
            X.7RM r2 = new X.7RM
            r2.<init>((java.lang.Object) r6, (int) r1, (int) r0)
            r6.A0R = r2
            r0 = 50
            r6.postDelayed(r2, r0)
            return
        L_0x006a:
            java.lang.Integer r0 = r6.A0L
            boolean r0 = X.C111295jU.A0J(r0)
            r1 = 8
            if (r0 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002c
        L_0x0076:
            r0 = 2131231948(0x7f0804cc, float:1.8079991E38)
            r1.setImageResource(r0)
            android.view.View r2 = r5.A02()
            android.content.Context r1 = r6.getContext()
            r0 = 2131896664(0x7f122958, float:1.9428196E38)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A0C(com.whatsapp.search.views.TokenizedSearchInput):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r5.A0J() == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(com.whatsapp.search.views.TokenizedSearchInput r5) {
        /*
            com.whatsapp.WaImageButton r0 = r5.A04
            r4 = 8
            r3 = 0
            if (r0 == 0) goto L_0x0013
            boolean r2 = r5.A0J()
        L_0x000b:
            if (r2 == 0) goto L_0x002d
            com.whatsapp.WaImageView r0 = r5.A0Z
        L_0x000f:
            r0.setVisibility(r4)
            return
        L_0x0013:
            com.whatsapp.WaImageButton r1 = r5.A05
            java.lang.String r0 = r5.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0024
            boolean r0 = r5.A0J()
            r2 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            if (r1 != 0) goto L_0x000b
            if (r2 == 0) goto L_0x002d
            com.whatsapp.WaImageView r0 = r5.A0Z
            r4 = 4
            goto L_0x000f
        L_0x002d:
            com.whatsapp.WaImageView r0 = r5.A0Z
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A0D(com.whatsapp.search.views.TokenizedSearchInput):void");
    }

    public static void A0E(TokenizedSearchInput tokenizedSearchInput) {
        WaImageButton waImageButton = tokenizedSearchInput.A04;
        if (waImageButton != null) {
            int i = 0;
            if (tokenizedSearchInput.A05 == null) {
                if (!tokenizedSearchInput.A0J()) {
                    i = 8;
                }
            } else if ((!TextUtils.isEmpty(tokenizedSearchInput.A0M) || !tokenizedSearchInput.A0J()) && tokenizedSearchInput.A0J()) {
                waImageButton = tokenizedSearchInput.A04;
            } else {
                tokenizedSearchInput.A04.setVisibility(8);
                return;
            }
            waImageButton.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r3.A0J() == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(com.whatsapp.search.views.TokenizedSearchInput r3) {
        /*
            com.whatsapp.WaImageButton r2 = r3.A05
            if (r2 == 0) goto L_0x001b
            java.lang.String r0 = r3.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0013
            boolean r1 = r3.A0J()
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            int r0 = X.C72453Mb.A07(r0)
            r2.setVisibility(r0)
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.A0F(com.whatsapp.search.views.TokenizedSearchInput):void");
    }

    private boolean A0J() {
        if (this.A0B == null && this.A0L.intValue() == 0 && this.A0D == null && this.A0C == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r4 != 4) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFocus(int r4) {
        /*
            r3 = this;
            X.5c1 r0 = r3.A0F
            if (r0 == 0) goto L_0x0038
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = X.C42171xk.A00(r1, r0)
            if (r0 != 0) goto L_0x0038
            r2 = 1
            if (r4 == 0) goto L_0x0043
            if (r4 == r2) goto L_0x0039
            r0 = 2
            if (r4 == r0) goto L_0x0039
            r0 = 3
            if (r4 == r0) goto L_0x0039
            r0 = 5
            if (r4 == r0) goto L_0x0039
        L_0x0022:
            r0 = 4
            if (r4 == r0) goto L_0x002a
        L_0x0025:
            X.5c1 r0 = r3.A0F
            r0.C2N(r2)
        L_0x002a:
            r3.A00 = r4
            r3.A05()
            r3.A02()
            r3.A04()
            r3.A03()
        L_0x0038:
            return
        L_0x0039:
            com.whatsapp.text.FinalBackspaceAwareEntry r1 = r3.A0b
            r0 = 0
            r1.setSelection(r0)
            r1.setCursorVisible(r0)
            goto L_0x0022
        L_0x0043:
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = r3.A0b
            r0.setCursorVisible(r2)
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.setFocus(int):void");
    }

    /* access modifiers changed from: private */
    public void setGridAvailable(Boolean bool) {
        this.A0N = Boolean.TRUE.equals(bool);
        A00();
    }

    /* access modifiers changed from: private */
    public void setJid(UserJid userJid) {
        if (!C42171xk.A00(this.A0B, userJid)) {
            this.A0B = userJid;
            if (userJid != null) {
                AnonymousClass3MX.A0M(this.A0c).setText(AnonymousClass3MY.A0p(this.A06, this.A07, this.A0B));
            }
            A02();
            A01();
        }
    }

    /* access modifiers changed from: private */
    public void setRemoteEntity(AnonymousClass77M r2) {
        if (!C42171xk.A00(this.A0C, r2)) {
            this.A0C = r2;
            A03();
            A01();
        }
    }

    /* access modifiers changed from: private */
    public void setSmartFilter(AnonymousClass77Z r2) {
        if (!C42171xk.A00(this.A0D, r2)) {
            this.A0D = r2;
            A04();
            A01();
        }
    }

    public void A0L() {
        C28931bI r5 = this.A0f;
        r5.A05(new C90064dT(this, 4));
        C28931bI r4 = this.A0c;
        r4.A05(new C90064dT(this, 5));
        C28931bI r3 = this.A0e;
        r3.A05(new C90064dT(this, 6));
        Chip chip = this.A02;
        if (chip != null) {
            chip.setOnClickListener(new C90064dT(this, 7));
            AnonymousClass1HF.A0f(chip, this.A0Y);
        }
        r5.A08(new C98254qp(this, 39), "a11y");
        r4.A08(new C98254qp(this, 36), "a11y");
        r3.A08(new C98254qp(this, 37), "a11y");
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = this.A0b;
        finalBackspaceAwareEntry.setOnClickListener(new C90064dT(this, 2));
        if (AnonymousClass3MY.A1b(this.A09)) {
            finalBackspaceAwareEntry.setSingleLine(true);
        }
        finalBackspaceAwareEntry.setFilters(new InputFilter[]{new InputFilter.LengthFilter(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
        AnonymousClass4M1 r2 = this.A0a;
        List list = finalBackspaceAwareEntry.A00;
        if (list == null) {
            list = AnonymousClass000.A13();
            finalBackspaceAwareEntry.A00 = list;
        }
        list.add(r2);
        r2.A00.A01 = new C91614fy(finalBackspaceAwareEntry, 34);
        finalBackspaceAwareEntry.setOnFocusChangeListener(this.A0V);
        finalBackspaceAwareEntry.setInputEnterAction(3);
        finalBackspaceAwareEntry.setOnEditorActionListener(this.A0X);
        finalBackspaceAwareEntry.setOnKeyListener(this.A0W);
        if (!this.A0P) {
            ViewGroup A0C2 = AnonymousClass3MW.A0C(this, 2131431653);
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setAnimator(2, (Animator) null);
            layoutTransition.setDuration(100);
            A0C2.setLayoutTransition(layoutTransition);
        }
        this.A0Z.setOnClickListener(this.A0i);
        A05();
        A04();
        A03();
        if (this.A0B != null) {
            AnonymousClass3MX.A0M(r4).setText(AnonymousClass3MY.A0p(this.A06, this.A07, this.A0B));
        }
        A02();
        A01();
        A00();
        this.A0d.A05(new C90064dT(this, 3));
    }

    public void A0M() {
        WaImageButton waImageButton = this.A05;
        if (waImageButton != null) {
            waImageButton.setEnabled(true);
            return;
        }
        WaImageButton waImageButton2 = (WaImageButton) C72453Mb.A0S(this, 2131434908);
        this.A05 = waImageButton2;
        waImageButton2.setOnClickListener(this.A0h);
        this.A05.setEnabled(true);
        C72453Mb.A1B(this.A04);
    }

    public /* synthetic */ void A0S() {
        int i;
        String str = this.A0M;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = this.A0b;
        finalBackspaceAwareEntry.setSelection(i);
        finalBackspaceAwareEntry.sendAccessibilityEvent(8);
        setFocus(0);
    }

    public void A0T(Chip chip, boolean z) {
        Context context;
        float f;
        if (z) {
            chip.setChipStrokeColor(ColorStateList.valueOf(AnonymousClass3MZ.A02(getContext(), getContext(), 2130971102, 2131102428)));
            context = getContext();
            f = 1.0f;
        } else {
            chip.setChipStrokeColor((ColorStateList) null);
            context = getContext();
            f = 0.0f;
        }
        chip.setChipStrokeWidth((float) C62762rw.A01(context, f));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0K;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0K = r0;
        }
        return r0.generatedComponent();
    }

    public WaImageView getClearButton() {
        return this.A0Z;
    }

    public void setGridToggleTintListOnInflate(ColorStateList colorStateList) {
        this.A0d.A08(new C98254qp(colorStateList, 38), "color");
    }

    public void setInputEnterAction(int i) {
        FinalBackspaceAwareEntry finalBackspaceAwareEntry = this.A0b;
        if (finalBackspaceAwareEntry.getImeOptions() != i && AnonymousClass3Ma.A1b(this.A0g, i)) {
            finalBackspaceAwareEntry.setInputEnterAction(i);
            finalBackspaceAwareEntry.setInputType(1);
        }
    }

    public void setIsMetaAiSearchEnabled(boolean z) {
        this.A0T = z;
        A01();
    }

    public void setQueryInputActive(Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            setFocus(0);
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = this.A0b;
            finalBackspaceAwareEntry.requestFocus();
            finalBackspaceAwareEntry.A0I(false);
            return;
        }
        setFocus(4);
        FinalBackspaceAwareEntry finalBackspaceAwareEntry2 = this.A0b;
        if (finalBackspaceAwareEntry2.hasFocus()) {
            finalBackspaceAwareEntry2.clearFocus();
        }
        View view = this.A0j;
        if (view.isAttachedToWindow()) {
            view.requestFocus();
        }
        InputMethodManager A0N2 = this.A08.A0N();
        if (A0N2 != null) {
            A0N2.hideSoftInputFromWindow(getWindowToken(), 2);
        }
    }

    public void setText(String str) {
        C18030ve r1 = this.A0A;
        if (C20045A4o.A01(r1) && !C20135A8w.A08(r1)) {
            ((AM6) this.A0G.get()).A06(str);
        }
        if (!C42171xk.A00(this.A0M, str)) {
            if (this.A00 != 0 && !TextUtils.isEmpty(str)) {
                setFocus(0);
            }
            this.A0M = str;
            C134176qA r12 = this.A0E;
            if (r12 != null) {
                if (str != null && str.length() != 0) {
                    r12.A00();
                } else if (r12.A0G.invoke() != null) {
                    r12.A01(str);
                }
            }
            A00();
        }
        C22851Dl r0 = this.A01;
        if (r0 != null) {
            r0.Bo9(str);
        }
    }

    public void setType(Integer num) {
        if (num != null && !C42171xk.A00(this.A0L, num)) {
            this.A0L = num;
            A05();
            A01();
            A00();
        }
    }

    private void A05() {
        SparseArray A002 = C137376vM.A00();
        int intValue = this.A0L.intValue();
        C130156iy r7 = (C130156iy) A002.get(intValue);
        if (r7 == null || intValue == 98) {
            this.A0f.A04(8);
            return;
        }
        C28931bI r4 = this.A0f;
        TextView A0M2 = AnonymousClass3MX.A0M(r4);
        C72463Mc.A0w(getContext(), getContext(), A0M2, 2130970097, AnonymousClass1YL.A00(getContext(), 2130971957, 2131103410));
        AnonymousClass3MX.A0M(r4).setText(r7.A05);
        C137376vM.A01(getContext(), (Chip) r4.A02(), this.A0L.intValue(), AnonymousClass1YL.A00(getContext(), 2130970097, AnonymousClass1YL.A00(getContext(), 2130971957, 2131103410)));
        boolean z = false;
        ((Chip) r4.A02()).setChipBackgroundColor(A0K(AnonymousClass000.A1T(this.A00, 1)));
        Chip chip = (Chip) r4.A02();
        if (this.A00 == 1) {
            z = true;
        }
        A0T(chip, z);
        if (r4.A01() == 8) {
            A07((Chip) r4.A02(), AnonymousClass1YL.A00(getContext(), 2130971100, 2131102426));
        }
    }

    private void A07(Chip chip, int i) {
        int A012 = AnonymousClass3Ma.A01(getContext(), getResources(), 2130968804, 2131099879);
        int color = getResources().getColor(i);
        int A052 = AnonymousClass1Z2.A05(A012, color);
        if (this.A0P) {
            chip.setScaleX(1.0f);
            chip.setScaleY(1.0f);
            chip.setAlpha(1.0f);
            chip.setVisibility(0);
            chip.setChipBackgroundColor(ColorStateList.valueOf(color));
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(A052);
        chip.setScaleX(0.92f);
        chip.setScaleY(0.92f);
        chip.setAlpha(0.0f);
        chip.setChipBackgroundColor(valueOf);
        chip.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chip, "scaleX", new float[]{0.92f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chip, "scaleY", new float[]{0.92f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(chip, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.setDuration(100);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Object[] objArr = new Object[2];
        C17880vN.A1T(objArr, A052, 0);
        C17880vN.A1T(objArr, color, 1);
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
        C88754aj.A00(ofObject, chip, 21);
        ofObject.setDuration(100);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofObject).after(animatorSet);
        animatorSet2.start();
    }

    private String getHintForMetaAISearch() {
        int i;
        Context context = getContext();
        if (A0J()) {
            i = ((C38711rl) this.A0J.get()).A00();
        } else {
            i = 2131895489;
        }
        return context.getString(i);
    }

    public ColorStateList A0K(boolean z) {
        int A022 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130971101, 2131102427);
        int A023 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130971100, 2131102426);
        if (!z) {
            A022 = A023;
        }
        return ColorStateList.valueOf(A022);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int max = Math.max(getResources().getDimensionPixelSize(2131168580), (int) Math.floor(((double) getWidth()) * 0.3d));
        this.A0f.A08(new C98204qk(max, 1), "width");
        this.A0c.A08(new C98204qk(max, 2), "width");
    }

    public void setNoAnimateForTestsOnly(boolean z) {
        this.A0P = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0126, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 7618) == false) goto L_0x0128;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TokenizedSearchInput(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            boolean r0 = r6.A0O
            if (r0 != 0) goto L_0x005c
            r0 = 1
            r6.A0O = r0
            java.lang.Object r2 = r6.generatedComponent()
            X.033 r2 = (X.AnonymousClass033) r2
            X.1Xc r2 = (X.C27691Xc) r2
            X.10E r1 = r2.A10
            X.0ve r0 = X.AnonymousClass10E.A8r(r1)
            r6.A0A = r0
            X.1KB r0 = X.AnonymousClass10E.A12(r1)
            r6.A03 = r0
            X.00H r0 = X.AnonymousClass3MX.A0z(r1)
            r6.A0H = r0
            X.1M9 r0 = X.AnonymousClass10E.A4z(r1)
            r6.A06 = r0
            X.1Me r0 = X.AnonymousClass3MZ.A0g(r1)
            r6.A07 = r0
            X.0vb r0 = X.AnonymousClass10E.A6Q(r1)
            r6.A09 = r0
            X.11C r0 = X.AnonymousClass3Ma.A0a(r1)
            r6.A08 = r0
            X.10G r1 = r1.A00
            X.00S r0 = r1.A0i
            X.00H r0 = X.C000200d.A00(r0)
            r6.A0G = r0
            X.00S r0 = r1.A3E
            X.00H r0 = X.C000200d.A00(r0)
            r6.A0I = r0
            X.00S r0 = r2.A0d
            X.00H r0 = X.C000200d.A00(r0)
            r6.A0J = r0
        L_0x005c:
            r5 = 0
            r6.A0P = r5
            r6.A0T = r5
            java.lang.String r0 = ""
            r6.A0M = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r6.A0L = r0
            r6.A00 = r5
            r6.A0Q = r5
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 3
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.Integer r0 = X.C17880vN.A0k()
            r2 = 1
            r1[r2] = r0
            java.util.List r0 = java.util.Arrays.asList(r1)
            r6.A0g = r0
            r0 = 0
            r6.A01 = r0
            X.4M1 r0 = new X.4M1
            r0.<init>(r6)
            r6.A0a = r0
            r3 = 5
            X.4et r0 = new X.4et
            r0.<init>(r6, r3)
            r6.A0X = r0
            X.4dd r0 = new X.4dd
            r0.<init>(r6, r3)
            r6.A0W = r0
            r1 = 8
            X.4dT r0 = new X.4dT
            r0.<init>((com.whatsapp.search.views.TokenizedSearchInput) r6, (int) r1)
            r6.A0i = r0
            r1 = 9
            X.4dT r0 = new X.4dT
            r0.<init>((com.whatsapp.search.views.TokenizedSearchInput) r6, (int) r1)
            r6.A0U = r0
            r1 = 10
            X.4dT r0 = new X.4dT
            r0.<init>((com.whatsapp.search.views.TokenizedSearchInput) r6, (int) r1)
            r6.A0h = r0
            r1 = 11
            X.3SS r0 = new X.3SS
            r0.<init>(r6, r1)
            r6.A0Y = r0
            X.4da r0 = new X.4da
            r0.<init>(r6, r3)
            r6.A0V = r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r6.setOrientation(r5)
            r0 = 16
            r6.setGravity(r0)
            r0 = 2131626799(0x7f0e0b2f, float:1.8880844E38)
            r1.inflate(r0, r6, r2)
            r0 = 2131434907(0x7f0b1d9b, float:1.8491641E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r6.A0f = r0
            r0 = 2131434902(0x7f0b1d96, float:1.8491631E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r6.A0c = r0
            r0 = 2131434906(0x7f0b1d9a, float:1.849164E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r6.A0e = r0
            X.0ve r0 = r6.A0A
            X.A4o r4 = X.C20135A8w.A0R
            boolean r0 = r4.A02(r0)
            if (r0 == 0) goto L_0x0109
            r0 = 2131434475(0x7f0b1beb, float:1.8490765E38)
            android.view.View r0 = X.C72453Mb.A0S(r6, r0)
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            r6.A02 = r0
        L_0x0109:
            r0 = 2131434898(0x7f0b1d92, float:1.8491623E38)
            android.view.ViewStub r3 = X.AnonymousClass3MW.A0E(r6, r0)
            X.0ve r2 = r6.A0A
            X.C18070vi.A0d(r2, r5)
            boolean r0 = r4.A02(r2)
            if (r0 == 0) goto L_0x0128
            r1 = 7618(0x1dc2, float:1.0675E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 2131626804(0x7f0e0b34, float:1.8880855E38)
            if (r1 != 0) goto L_0x012b
        L_0x0128:
            r0 = 2131626803(0x7f0e0b33, float:1.8880853E38)
        L_0x012b:
            r3.setLayoutResource(r0)
            r3.inflate()
            X.0ve r2 = r6.A0A
            X.C18070vi.A0d(r2, r5)
            boolean r0 = r4.A02(r2)
            if (r0 == 0) goto L_0x0156
            r1 = 7618(0x1dc2, float:1.0675E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0156
            X.1KB r2 = r6.A03
            r0 = 34
            X.4sN r1 = new X.4sN
            r1.<init>(r6, r0)
            X.6qA r0 = new X.6qA
            r0.<init>(r6, r2, r1)
            r6.A0E = r0
        L_0x0156:
            r0 = 2131434901(0x7f0b1d95, float:1.849163E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            com.whatsapp.text.FinalBackspaceAwareEntry r0 = (com.whatsapp.text.FinalBackspaceAwareEntry) r0
            r6.A0b = r0
            r0 = 2131434868(0x7f0b1d74, float:1.8491562E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r6, r0)
            r6.A0Z = r0
            r0 = 2131430938(0x7f0b0e1a, float:1.8483591E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r6, r0)
            r6.A0j = r0
            r0 = 2131431232(0x7f0b0f40, float:1.8484187E38)
            X.1bI r0 = X.C28931bI.A00(r6, r0)
            r6.A0d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.TokenizedSearchInput.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public TokenizedSearchInput(Context context) {
        this(context, (AttributeSet) null);
    }
}
