package com.whatsapp.biz.catalog.view.variants.v2;

import X.AnonymousClass1DF;
import X.AnonymousClass1YF;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass77A;
import X.AnonymousClass79S;
import X.C108955ca;
import X.C131476lA;
import X.C148317hF;
import X.C148327hG;
import X.C168168iQ;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C20245ADd;
import X.C22821Di;
import X.C24141Ja;
import X.C27641Ww;
import X.C72453Mb;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class TextVariantsBottomSheetV2 extends Hilt_TextVariantsBottomSheetV2 {
    public int A00;
    public C131476lA A01;
    public C18000vb A02;
    public C22821Di A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new C148317hF(this));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C148327hG(this));

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        int i;
        CharSequence charSequence;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        Bundle bundle2 = this.A06;
        ArrayList arrayList = null;
        if (bundle2 != null) {
            arrayList = bundle2.getParcelableArrayList("TEXT_OPTIONS_DATA");
        }
        Bundle bundle3 = this.A06;
        if (bundle3 == null || (str = bundle3.getString("VARAINT_NAME_ARG")) == null) {
            str = "";
        }
        TextView A0J = AnonymousClass3MW.A0J(view2, 2131436674);
        C131476lA r0 = this.A01;
        if (r0 != null) {
            String A002 = r0.A00(str);
            C18000vb r02 = this.A02;
            if (r02 != null) {
                Locale A0N = r02.A0N();
                C18070vi.A0X(A0N);
                String lowerCase = A002.toLowerCase(A0N);
                C18070vi.A0X(lowerCase);
                A0J.setText(AnonymousClass3MY.A0o(this, lowerCase, 0, 2131896825));
                RadioGroup radioGroup = (RadioGroup) C18070vi.A05(view2, 2131436666);
                Bundle bundle4 = this.A06;
                if (bundle4 != null) {
                    C24141Ja.A00(bundle4, C20245ADd.class, "OTHER_OPTION_SELECTED_ARG");
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AnonymousClass1ZU.A0B();
                        } else {
                            AnonymousClass77A r11 = (AnonymousClass77A) next;
                            View inflate = LayoutInflater.from(A1n()).inflate(2131627321, radioGroup, false);
                            C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.RadioButton");
                            TextView textView = (TextView) inflate;
                            boolean z = r11.A01;
                            String str3 = ((C168168iQ) r11.A00).A00;
                            if (!z) {
                                Context A042 = AnonymousClass3MY.A04(textView);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                C18000vb r03 = this.A02;
                                if (r03 != null) {
                                    if (AnonymousClass3MW.A1Z(r03)) {
                                        spannableStringBuilder.append(8207);
                                    }
                                    spannableStringBuilder.append(C27641Ww.A02(str3));
                                    C18000vb r2 = this.A02;
                                    if (r2 != null) {
                                        spannableStringBuilder.append(C27641Ww.A01(r2, "   "));
                                        spannableStringBuilder.append(A042.getString(2131894798));
                                        int A0F = AnonymousClass1YF.A0F(spannableStringBuilder, str3, 0, false);
                                        if (A0F <= 0) {
                                            A0F = 0;
                                        }
                                        spannableStringBuilder.setSpan(spannableStringBuilder, A0F, str3.length() + A0F, 33);
                                        charSequence = new SpannedString(spannableStringBuilder);
                                    }
                                }
                            } else {
                                charSequence = str3;
                            }
                            textView.setText(charSequence);
                            textView.setEnabled(z);
                            textView.setVisibility(C72453Mb.A07(r11.A03 ? 1 : 0));
                            radioGroup.addView(textView);
                            i2 = i3;
                        }
                    }
                }
                int A0I = C72453Mb.A0I(this.A04);
                this.A00 = A0I;
                View childAt = radioGroup.getChildAt(A0I);
                C18070vi.A0z(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
                ((CompoundButton) childAt).setChecked(true);
                radioGroup.setOnCheckedChangeListener(new AnonymousClass79S(this, 0));
                ImageView A0G = AnonymousClass3MW.A0G(view2, 2131436090);
                Bundle bundle5 = this.A06;
                if (bundle5 == null || !bundle5.getBoolean("USE_BACK_ARROW_FOR_CLOSE_ARG")) {
                    A0G.setImageResource(2131231814);
                    i = 2131898783;
                } else {
                    A0G.setImageResource(2131231675);
                    i = 2131898718;
                }
                C108955ca.A1J(A0G, this, i);
                AnonymousClass3MZ.A1I(A0G, this, 6);
                return;
            }
            str2 = "whatsAppLocale";
            C18070vi.A11(str2);
        } else {
            str2 = "variantNameResolver";
            C18070vi.A11(str2);
        }
        throw null;
    }

    public void A1s() {
        C22821Di r1;
        super.A1s();
        int A0I = C72453Mb.A0I(this.A04);
        int i = this.A00;
        if (A0I != i && (r1 = this.A03) != null) {
            r1.invoke(Integer.valueOf(i));
        }
    }
}
