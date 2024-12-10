package com.whatsapp.mediacomposer.ui.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass79S;
import X.AnonymousClass85N;
import X.C134766r7;
import X.C152147nR;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.whatsapp.radio.RadioButtonWithSubtitle;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public abstract class MediaQualitySettingsBottomSheetFragment extends Hilt_MediaQualitySettingsBottomSheetFragment {
    public int A00;
    public RadioButton A01;
    public AnonymousClass1KB A02;
    public C18000vb A03;
    public C18030ve A04;
    public AnonymousClass10I A05;
    public AnonymousClass00H A06;
    public final AnonymousClass85N A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(new C152147nR(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625970, false);
    }

    public void A21(Bundle bundle, View view) {
        SortedMap sortedMap;
        boolean z;
        int A0I;
        int A0I2;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextView A0E = C17880vN.A0E(view, 2131432413);
        if (A0E != null) {
            if (this instanceof VideoQualitySettingsBottomSheetFragment) {
                A0I2 = C72453Mb.A0I(((VideoQualitySettingsBottomSheetFragment) this).A04);
            } else {
                A0I2 = C72453Mb.A0I(((ImageQualitySettingsBottomSheetFragment) this).A05);
            }
            A0E.setText(A0I2);
            A0E.setVisibility(0);
        }
        TextView A0E2 = C17880vN.A0E(view, 2131432366);
        if (A0E2 != null) {
            if (this instanceof VideoQualitySettingsBottomSheetFragment) {
                A0I = C72453Mb.A0I(((VideoQualitySettingsBottomSheetFragment) this).A03);
            } else {
                A0I = C72453Mb.A0I(((ImageQualitySettingsBottomSheetFragment) this).A04);
            }
            A0E2.setText(A0I);
            A0E2.setVisibility(0);
        }
        if (this instanceof VideoQualitySettingsBottomSheetFragment) {
            sortedMap = ((VideoQualitySettingsBottomSheetFragment) this).A02;
        } else {
            sortedMap = ((ImageQualitySettingsBottomSheetFragment) this).A03;
        }
        Iterator A15 = AnonymousClass000.A15(sortedMap);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            C134766r7 r1 = (C134766r7) A16.getValue();
            CompoundButton compoundButton = (CompoundButton) view.findViewById(AnonymousClass3MY.A03((Number) A16.getKey()));
            if (compoundButton != null) {
                compoundButton.setChecked(AnonymousClass000.A1T(r1.A00, this.A00));
            }
        }
        RadioGroup radioGroup = (RadioGroup) view.findViewById(2131432411);
        if (radioGroup != null) {
            Iterator A152 = AnonymousClass000.A15(sortedMap);
            while (A152.hasNext()) {
                Map.Entry A162 = AnonymousClass000.A16(A152);
                C134766r7 r12 = (C134766r7) A162.getValue();
                RadioButtonWithSubtitle radioButtonWithSubtitle = new RadioButtonWithSubtitle(A14(), (AttributeSet) null, 0, 6, (AnonymousClass1Y1) null);
                radioButtonWithSubtitle.setId(AnonymousClass3MY.A03((Number) A162.getKey()));
                radioButtonWithSubtitle.setTitle(A1H(r12.A01));
                int i = this.A00;
                int i2 = r12.A00;
                if (i != i2) {
                    z = false;
                    if (i2 != 0) {
                        radioButtonWithSubtitle.setChecked(z);
                        radioGroup.addView(radioButtonWithSubtitle);
                    }
                }
                z = true;
                radioButtonWithSubtitle.setChecked(z);
                radioGroup.addView(radioButtonWithSubtitle);
            }
            radioGroup.setOnCheckedChangeListener(new AnonymousClass79S(this, 1));
        }
        this.A01 = (RadioButton) view.findViewById(2131432414);
    }

    public final void A2K() {
        SortedMap sortedMap;
        RadioButtonWithSubtitle radioButtonWithSubtitle;
        Context A1n;
        int i;
        View view;
        if (this instanceof VideoQualitySettingsBottomSheetFragment) {
            sortedMap = ((VideoQualitySettingsBottomSheetFragment) this).A02;
        } else {
            sortedMap = ((ImageQualitySettingsBottomSheetFragment) this).A03;
        }
        Iterator A15 = AnonymousClass000.A15(sortedMap);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            int i2 = ((C134766r7) A16.getValue()).A00;
            String str = null;
            if (i2 == 0) {
                View view2 = this.A0B;
                if (view2 != null) {
                    Object key = A16.getKey();
                    C18070vi.A0X(key);
                    radioButtonWithSubtitle = (RadioButtonWithSubtitle) view2.findViewById(AnonymousClass000.A0M(key));
                    if (radioButtonWithSubtitle != null) {
                        A1n = A1n();
                        if (A1n != null) {
                            i = 2131891936;
                        }
                        radioButtonWithSubtitle.setSubTitle(str);
                    }
                }
            } else if (i2 == 3 && (view = this.A0B) != null) {
                Object key2 = A16.getKey();
                C18070vi.A0X(key2);
                radioButtonWithSubtitle = (RadioButtonWithSubtitle) view.findViewById(AnonymousClass000.A0M(key2));
                if (radioButtonWithSubtitle != null) {
                    A1n = A1n();
                    if (A1n != null) {
                        i = 2131891935;
                    }
                    radioButtonWithSubtitle.setSubTitle(str);
                }
            }
            str = A1n.getString(i);
            radioButtonWithSubtitle.setSubTitle(str);
        }
    }

    public MediaQualitySettingsBottomSheetFragment(AnonymousClass85N r2, int i) {
        this.A07 = r2;
        this.A00 = i;
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
    }
}
