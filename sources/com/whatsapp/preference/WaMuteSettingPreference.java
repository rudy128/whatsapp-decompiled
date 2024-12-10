package com.whatsapp.preference;

import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4RZ;
import X.AnonymousClass5Z0;
import X.AnonymousClass8J3;
import X.AnonymousClass9VV;
import X.C18070vi;
import X.C21727Ard;
import X.C72463Mc;
import X.C76743o8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;
import com.whatsapp.ListItemWithLeftIcon;

public final class WaMuteSettingPreference extends SwitchPreference {
    public CompoundButton.OnCheckedChangeListener A00;
    public AnonymousClass9VV A01;
    public ListItemWithLeftIcon A02;
    public AnonymousClass5Z0 A03;
    public AnonymousClass4RZ A04;
    public AnonymousClass1BI A05;
    public Integer A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaMuteSettingPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A06 = AnonymousClass00R.A00;
    }

    public void A0G(AnonymousClass8J3 r4) {
        C18070vi.A0d(r4, 0);
        super.A0G(r4);
        View view = r4.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
        C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.ListItemWithLeftIcon");
        this.A02 = (ListItemWithLeftIcon) view;
        C72463Mc.A13(view, 2131432092);
        AnonymousClass1BI r2 = this.A05;
        A00(this.A00, this.A02, r2, this);
    }

    public static final void A00(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, ListItemWithLeftIcon listItemWithLeftIcon, AnonymousClass1BI r16, WaMuteSettingPreference waMuteSettingPreference) {
        WaMuteSettingPreference waMuteSettingPreference2 = waMuteSettingPreference;
        if (waMuteSettingPreference2.A04 == null) {
            AnonymousClass1BI r13 = r16;
            if (r16 != null) {
                ListItemWithLeftIcon listItemWithLeftIcon2 = listItemWithLeftIcon;
                if (listItemWithLeftIcon != null) {
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    if (onCheckedChangeListener != null) {
                        int intValue = waMuteSettingPreference2.A06.intValue();
                        AnonymousClass4RZ r3 = null;
                        if (intValue == 0) {
                            AnonymousClass5Z0 r7 = waMuteSettingPreference2.A03;
                            if (r7 != null) {
                                Context context = waMuteSettingPreference2.A05;
                                C18070vi.A0X(context);
                                r3 = r7.BGm(context, onCheckedChangeListener, listItemWithLeftIcon, r13, new C21727Ard(waMuteSettingPreference2, 35));
                            }
                        } else if (intValue == 1) {
                            AnonymousClass9VV r2 = waMuteSettingPreference2.A01;
                            if (r2 != null) {
                                Context context2 = waMuteSettingPreference2.A05;
                                C18070vi.A0X(context2);
                                C21727Ard ard = new C21727Ard(waMuteSettingPreference2, 36);
                                AnonymousClass10E r1 = r2.A00.A02;
                                AnonymousClass11P A6O = AnonymousClass10E.A6O(r1);
                                AnonymousClass1CJ A0d = AnonymousClass3Ma.A0d(r1);
                                r3 = new C76743o8(context2, onCheckedChangeListener2, listItemWithLeftIcon2, AnonymousClass3MZ.A0U(r1), A6O, AnonymousClass3Ma.A0c(r1), AnonymousClass10E.A6Q(r1), A0d, AnonymousClass3MY.A0V(r1), r13, AnonymousClass3MZ.A11(r1), ard);
                            }
                        } else {
                            throw AnonymousClass3MW.A14();
                        }
                        waMuteSettingPreference2.A04 = r3;
                        if (r3 != null) {
                            r3.A00();
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ WaMuteSettingPreference(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaMuteSettingPreference(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
