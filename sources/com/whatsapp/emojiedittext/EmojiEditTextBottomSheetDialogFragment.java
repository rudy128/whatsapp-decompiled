package com.whatsapp.emojiedittext;

import X.A59;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1L4;
import X.AnonymousClass2E7;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3SU;
import X.AnonymousClass48A;
import X.AnonymousClass48E;
import X.AnonymousClass4UI;
import X.AnonymousClass4bH;
import X.C107845ai;
import X.C108265bP;
import X.C1193267r;
import X.C1418577f;
import X.C17880vN;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C19830z4;
import X.C27641Ww;
import X.C43251zV;
import X.C72453Mb;
import X.C74873d3;
import X.C89934dG;
import X.C92094gk;
import X.C95914n0;
import X.C98564rM;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public class EmojiEditTextBottomSheetDialogFragment extends Hilt_EmojiEditTextBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public ImageButton A03;
    public AnonymousClass190 A04;
    public AnonymousClass1KB A05;
    public WaEditText A06;
    public AnonymousClass11C A07;
    public C19830z4 A08;
    public C18000vb A09;
    public AnonymousClass1L2 A0A;
    public C1193267r A0B;
    public AnonymousClass1KW A0C;
    public C108265bP A0D;
    public AnonymousClass2E7 A0E;
    public C18030ve A0F;
    public C18010vc A0G;
    public AnonymousClass1L4 A0H;
    public WDSButton A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public String[] A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public String A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public int A0U = 0;
    public WDSButton A0V;
    public String A0W;
    public final C107845ai A0X = new C92094gk(this, 6);

    public static EmojiEditTextBottomSheetDialogFragment A01(String str, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = new EmojiEditTextBottomSheetDialogFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putInt("dialogId", i);
        A0D2.putInt("hintResId", i2);
        A0D2.putInt("titleResId", i3);
        A0D2.putInt("messageResId", i4);
        A0D2.putInt("emptyErrorResId", i5);
        A0D2.putString("defaultStr", str);
        A0D2.putInt("maxLength", i6);
        A0D2.putInt("inputType", i7);
        A0D2.putStringArray("codepointBlacklist", strArr);
        A0D2.putBoolean("shouldHideEmojiBtn", false);
        A0D2.putString("supportedDigits", (String) null);
        A0D2.putBoolean("allowBlank", z);
        emojiEditTextBottomSheetDialogFragment.A1R(A0D2);
        return emojiEditTextBottomSheetDialogFragment;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0F, 11056);
        this.A0R = A052;
        int i = 2131625179;
        if (A052) {
            i = 2131625180;
        }
        View inflate = AnonymousClass3MZ.A0E(this).inflate(i, (ViewGroup) null, false);
        TextView A0J2 = AnonymousClass3MW.A0J(inflate, 2131429987);
        int i2 = this.A0O;
        if (i2 != 0) {
            A0J2.setText(i2);
        }
        if (this.A0N != 0) {
            TextView textView = (TextView) AnonymousClass3MY.A0G(AnonymousClass3MW.A0F(inflate, 2131432686), 2131625178);
            textView.setText(this.A0N);
            textView.setVisibility(0);
        }
        WaEditText waEditText = (WaEditText) AnonymousClass1HF.A06(inflate, 2131430266);
        this.A06 = waEditText;
        int i3 = this.A0U;
        if (i3 != 0) {
            waEditText.setHint(i3);
        }
        this.A0I = AnonymousClass3MW.A0r(inflate, 2131434788);
        if (!this.A0Q) {
            AnonymousClass48E.A00(this.A06, this, 10);
            this.A0I.setEnabled(false);
        }
        TextView A0J3 = AnonymousClass3MW.A0J(inflate, 2131429681);
        C27641Ww.A09(this.A06, this.A09);
        if (this.A02 > 0) {
            A0J3.setVisibility(0);
        }
        ArrayList A13 = AnonymousClass000.A13();
        int i4 = this.A02;
        if (i4 > 0) {
            A13.add(new C1418577f(i4));
        }
        if (!A13.isEmpty()) {
            this.A06.setFilters((InputFilter[]) A13.toArray(new InputFilter[0]));
        }
        WaEditText waEditText2 = this.A06;
        C18030ve r10 = this.A0F;
        AnonymousClass1KW r9 = this.A0C;
        waEditText2.addTextChangedListener(new AnonymousClass48A(waEditText2, A0J3, this.A07, this.A09, this.A0A, r9, r10, this.A0G, this.A02, 0, false, false, false));
        this.A06.setInputType(this.A0M);
        if (!TextUtils.isEmpty(this.A0P)) {
            this.A06.setKeyFilter(this.A0P);
        }
        this.A06.A0I(true);
        Window window = this.A03.getWindow();
        window.getDecorView().setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
        window.setStatusBarColor(0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        this.A03.getWindow().setAttributes(attributes);
        C89934dG.A00(this.A0I, this, 16);
        WDSButton A0r = AnonymousClass3MW.A0r(inflate, 2131428815);
        this.A0V = A0r;
        if (A0r != null) {
            C89934dG.A00(A0r, this, 17);
        }
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) inflate.findViewById(2131430312);
        keyboardPopupLayout.A0A = true;
        this.A03 = (ImageButton) inflate.findViewById(2131430310);
        if (this.A0R) {
            View A062 = AnonymousClass1HF.A06(inflate, 2131430314);
            AnonymousClass2E7 r4 = this.A0E;
            AnonymousClass1FL A1D = A1D();
            r4.A0L(A1D(), A1D, A062, this.A03, (CoordinatorLayout) null, keyboardPopupLayout, this.A06, (EmojiSearchKeyboardContainer) AnonymousClass1HF.A06(inflate, 2131430335), (AnonymousClass3SU) null, false);
            C89934dG.A00(this.A03, this, 18);
            C89934dG.A00(this.A06, this, 19);
        } else {
            AnonymousClass1FL A1B = A1B();
            C18030ve r17 = this.A0F;
            AnonymousClass1L4 r15 = this.A0H;
            AnonymousClass190 r14 = this.A04;
            AnonymousClass1KW r13 = this.A0C;
            C1193267r r12 = this.A0B;
            AnonymousClass11C r11 = this.A07;
            C18000vb r102 = this.A09;
            C19830z4 r8 = this.A08;
            C18010vc r6 = this.A0G;
            ImageButton imageButton = this.A03;
            WaEditText waEditText3 = this.A06;
            AnonymousClass11C r21 = r11;
            C19830z4 r22 = r8;
            KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
            WaEditText waEditText4 = waEditText3;
            ImageButton imageButton2 = imageButton;
            AnonymousClass190 r18 = r14;
            C74873d3 r152 = new C74873d3(A1B, imageButton2, r18, keyboardPopupLayout2, waEditText4, r21, r22, r102, (A59) this.A0K.get(), r12, r13, (EmojiSearchProvider) this.A0J.get(), r17, r6, r15, 27, (Integer) null);
            new AnonymousClass4UI(A1B(), r152, (EmojiSearchContainer) inflate.findViewById(2131430335)).A00 = new C95914n0(this, 4);
            r152.A0J(this.A0X);
            r152.A0E = new C98564rM(this, 43);
        }
        this.A06.setText(C43251zV.A05(A1B(), this.A0C, this.A0W));
        if (!TextUtils.isEmpty(this.A0W)) {
            this.A06.selectAll();
        }
        this.A03.setOnShowListener(new AnonymousClass4bH(this, 3));
        Bundle bundle2 = bundle;
        if (bundle == null) {
            z = true;
        } else {
            z = bundle2.getBoolean("is_keyboard_showing");
        }
        this.A0S = z;
        if (this.A0T) {
            C72453Mb.A1A(this.A03);
        }
        return inflate;
    }

    public void A1K() {
        super.A1K();
        this.A0D = null;
    }

    public void A1u() {
        super.A1u();
        this.A06.requestFocus();
        if (this.A0S) {
            this.A06.A0I(false);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1x(android.content.Context r3) {
        /*
            r2 = this;
            super.A1x(r3)
            boolean r0 = r2 instanceof com.whatsapp.emojiedittext.customstickerpack.CustomStickerPackRenameDialog
            if (r0 != 0) goto L_0x0012
            androidx.fragment.app.Fragment r1 = r2.A0E
            boolean r0 = r1 instanceof X.C108265bP
            if (r0 == 0) goto L_0x0013
            r3 = r1
        L_0x000e:
            X.5bP r3 = (X.C108265bP) r3
            r2.A0D = r3
        L_0x0012:
            return
        L_0x0013:
            boolean r0 = r3 instanceof X.C108265bP
            if (r0 != 0) goto L_0x000e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Activity/Fragment must implement "
            r1.append(r0)
            java.lang.Class<X.5bP> r0 = X.C108265bP.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment.A1x(android.content.Context):void");
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(0, 2132083971);
        Bundle A15 = A15();
        this.A00 = A15.getInt("dialogId");
        this.A0O = A15.getInt("titleResId");
        this.A0N = A15.getInt("messageResId");
        this.A01 = A15.getInt("emptyErrorResId");
        this.A0U = A15.getInt("hintResId");
        this.A0W = A15.getString("defaultStr");
        this.A02 = A15.getInt("maxLength");
        this.A0M = A15.getInt("inputType");
        this.A0L = A15.getStringArray("codepointBlacklist");
        this.A0T = A15.getBoolean("shouldHideEmojiBtn");
        this.A0P = A15.getString("supportedDigits");
        this.A0Q = A15.getBoolean("allowBlank");
    }

    public void A20(Bundle bundle) {
        super.A20(bundle);
        boolean A002 = AnonymousClass1L4.A00(this.A06);
        this.A0S = A002;
        bundle.putBoolean("is_keyboard_showing", A002);
    }
}
