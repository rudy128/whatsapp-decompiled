package com.whatsapp.biz.catalog.view;

import X.AF3;
import X.AFU;
import X.AnonymousClass11C;
import X.AnonymousClass1EG;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L4;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass86E;
import X.AnonymousClass8BR;
import X.AnonymousClass8BV;
import X.AnonymousClass8GP;
import X.AnonymousClass9VS;
import X.BAO;
import X.C18030ve;
import X.C20334AGq;
import X.C20343AGz;
import X.C36361nl;
import X.C42741yf;
import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;

public class PostcodeChangeBottomSheet extends Hilt_PostcodeChangeBottomSheet implements AnonymousClass86E {
    public AnonymousClass9VS A00;
    public AnonymousClass1KB A01;
    public C36361nl A02;
    public TextEmojiLabel A03;
    public WaEditText A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public AnonymousClass8GP A08;
    public AnonymousClass11C A09;
    public C18030ve A0A;
    public UserJid A0B = null;
    public AnonymousClass1L4 A0C;
    public String A0D = "";
    public String A0E = "pincode";
    public LinearLayout A0F;
    public final BAO A0G;
    public final boolean A0H;

    public static void A00(PostcodeChangeBottomSheet postcodeChangeBottomSheet) {
        String str;
        String A0I;
        AnonymousClass8GP r4 = postcodeChangeBottomSheet.A08;
        if (r4 != null) {
            String str2 = postcodeChangeBottomSheet.A0D;
            String str3 = postcodeChangeBottomSheet.A0E;
            UserJid userJid = postcodeChangeBottomSheet.A0B;
            if (str2 == null || (A0I = AnonymousClass1YF.A0I(str2)) == null) {
                str = null;
            } else {
                str = AnonymousClass8BV.A0s(A0I, "-");
            }
            r4.A02 = str;
            if (str3 == null) {
                str3 = "pincode";
            }
            r4.A03 = str3;
            r4.A00 = userJid;
            String str4 = null;
            if (userJid != null) {
                C42741yf A012 = r4.A07.A01(userJid);
                if (A012 != null) {
                    str4 = A012.A08;
                }
                if (AnonymousClass1EG.A0H(str4)) {
                    str4 = r4.A08.A0I(r4.A06.A0H(userJid));
                }
            }
            r4.A01 = str4;
            AnonymousClass8GP.A03(r4);
        }
    }

    public void A1r() {
        this.A0G.C1E();
        super.A1r();
    }

    public void A2M() {
        WaEditText waEditText = this.A04;
        if (waEditText != null) {
            waEditText.clearFocus();
        }
        LinearLayout linearLayout = this.A0F;
        if (linearLayout != null && AnonymousClass1L4.A00(linearLayout)) {
            this.A0C.A01(this.A0F);
        }
        A28();
    }

    public void A2N() {
        this.A03.setVisibility(8);
        this.A05.setVisibility(0);
        this.A04.getBackground().setColorFilter(AnonymousClass3Ma.A01(this.A04.getContext(), AnonymousClass3MZ.A09(this), 2130968974, 2131100033), PorterDuff.Mode.SRC_ATOP);
    }

    public PostcodeChangeBottomSheet(BAO bao, boolean z) {
        this.A0G = bao;
        this.A0H = z;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625056);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        Dialog dialog = this.A03;
        if (!(!this.A0H || dialog == null || dialog.getWindow() == null)) {
            dialog.getWindow().setSoftInputMode(21);
        }
        this.A0F = AnonymousClass3MX.A0K(view, 2131429813);
        this.A06 = AnonymousClass3MW.A0T(view, 2131429007);
        this.A07 = AnonymousClass3MW.A0T(view, 2131429009);
        this.A04 = (WaEditText) AnonymousClass1HF.A06(view, 2131429006);
        this.A03 = AnonymousClass3MX.A0V(view, 2131429010);
        this.A05 = AnonymousClass3MW.A0T(view, 2131429008);
        AnonymousClass3Ma.A1L(this.A0A, this.A03);
        AnonymousClass3Ma.A1K(this.A03, this.A09);
        this.A03.setLinksClickable(true);
        this.A03.setFocusable(false);
        AnonymousClass8GP r0 = (AnonymousClass8GP) AnonymousClass8BR.A0C(new C20343AGz(this.A00), this).A00(AnonymousClass8GP.class);
        this.A08 = r0;
        C20334AGq.A00(this, r0.A04, 33);
        C20334AGq.A00(this, this.A08.A0A, 34);
        A00(this);
        this.A04.addTextChangedListener(new AF3(this, 2));
        AFU.A00(AnonymousClass1HF.A06(view, 2131434005), this, 45);
        AFU.A00(AnonymousClass1HF.A06(view, 2131434006), this, 46);
        if (A2L()) {
            view.setBackground((Drawable) null);
        }
    }
}
