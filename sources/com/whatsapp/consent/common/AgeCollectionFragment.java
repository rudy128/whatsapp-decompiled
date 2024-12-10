package com.whatsapp.consent.common;

import X.A8V;
import X.AnonymousClass00R;
import X.AnonymousClass19D;
import X.AnonymousClass1DF;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass783;
import X.AnonymousClass8Dv;
import X.C108955ca;
import X.C108985cd;
import X.C125756bd;
import X.C136116tI;
import X.C1422678u;
import X.C147017Rm;
import X.C149487j8;
import X.C149497j9;
import X.C149507jA;
import X.C149517jB;
import X.C160928Ao;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C25661Pc;
import X.C28931bI;
import X.C29431cG;
import X.C30391dr;
import X.C37581pm;
import X.C72453Mb;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import com.whatsapp.consent.DateOfBirthCollectionFragment;
import com.whatsapp.consent.DateOfBirthCollectionViewModel;
import com.whatsapp.consent.DateOfBirthRemediationFragment;
import com.whatsapp.consent.DateOfBirthRemediationViewModel;
import com.whatsapp.pancake.dosa.DosaCollectionFragment;
import com.whatsapp.pancake.dosa.DosaCollectionViewModel;
import com.whatsapp.pancake.dosa.DosaRemediationFragment;
import com.whatsapp.pancake.dosa.DosaRemediationViewModel;
import java.util.Calendar;
import java.util.List;

public abstract class AgeCollectionFragment extends Hilt_AgeCollectionFragment implements View.OnClickListener, DatePickerDialog.OnDateSetListener, AdapterView.OnItemSelectedListener {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public Button A03;
    public Spinner A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C125756bd A0A;
    public C18000vb A0B;
    public C18030ve A0C;
    public C28931bI A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;

    public static final void A01(AgeCollectionFragment ageCollectionFragment) {
        String str;
        AgeCollectionFragment ageCollectionFragment2 = ageCollectionFragment;
        C136116tI BQG = ageCollectionFragment.A26().BQG();
        AnonymousClass8Dv r4 = new AnonymousClass8Dv(ageCollectionFragment2, ageCollectionFragment.A14(), (Calendar) null, 0, BQG.A02, BQG.A01, BQG.A00);
        DatePicker datePicker = r4.A01;
        datePicker.setMinDate(BQG.A04);
        datePicker.setMaxDate(BQG.A03);
        r4.show();
        TextView textView = ageCollectionFragment2.A06;
        boolean z = false;
        if (textView != null && textView.getVisibility() == 0) {
            z = true;
        }
        if (ageCollectionFragment2 instanceof DateOfBirthCollectionFragment) {
            A8V A27 = ((DateOfBirthCollectionFragment) ageCollectionFragment2).A27();
            if (z) {
                str = "age_collection_monthday";
            } else {
                str = "age_collection_year";
            }
            A27.A0L(str, "age_collection_monthday_input", "select", (String) null);
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624150, false);
    }

    public void A21(Bundle bundle, View view) {
        ViewGroup viewGroup;
        int i;
        Spinner spinner;
        Button button;
        C18070vi.A0d(view, 0);
        A26().CFi();
        C125756bd r0 = this.A0A;
        if (r0 != null) {
            AnonymousClass19D r1 = r0.A00;
            C18040vf r5 = C18040vf.A02;
            if (C18020vd.A05(r5, r1, 12577) && (button = this.A03) != null) {
                button.setEnabled(false);
            }
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            this.A02 = viewGroup;
            C17880vN.A0E(view, 2131429379).setText(2131886581);
            TextView A0E2 = C17880vN.A0E(view, 2131429375);
            boolean z = this instanceof DosaCollectionFragment;
            if (z) {
                i = 2131889560;
            } else {
                i = 2131886570;
            }
            A0E2.setText(i);
            TextView A0E3 = C17880vN.A0E(view, 2131429377);
            A0E3.setText(2131886579);
            A0E3.setOnClickListener(this);
            TextView A0E4 = C17880vN.A0E(view, 2131429382);
            this.A09 = A0E4;
            if (A0E4 != null) {
                A0E4.setText(2131886582);
            }
            TextView A0E5 = C17880vN.A0E(view, 2131429374);
            this.A07 = A0E5;
            if (A0E5 != null) {
                int i2 = 2131886568;
                if (A26().BI2()) {
                    i2 = 2131886569;
                }
                A0E5.setText(i2);
            }
            Spinner spinner2 = (Spinner) view.findViewById(2131429380);
            this.A04 = spinner2;
            if (spinner2 != null) {
                spinner2.setAdapter((ArrayAdapter) this.A0E.getValue());
            }
            Spinner spinner3 = this.A04;
            if (spinner3 != null) {
                spinner3.setOnItemSelectedListener(this);
            }
            Spinner spinner4 = this.A04;
            if (spinner4 != null) {
                C1422678u.A00(spinner4, this, 8);
            }
            C18100vl r8 = this.A0E;
            ((ArrayAdapter) r8.getValue()).setDropDownViewResource(2131627624);
            C125756bd r02 = this.A0A;
            if (r02 != null) {
                if (C18020vd.A05(r5, r02.A00, 12336)) {
                    ((ArrayAdapter) r8.getValue()).add(AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(this), 2131895638));
                }
                ((ArrayAdapter) r8.getValue()).add("----");
                List BU7 = A26().BU7();
                C147017Rm r12 = C147017Rm.A00;
                C18070vi.A0z(r12, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
                ((ArrayAdapter) r8.getValue()).addAll(C29431cG.A0y(BU7, r12));
                Spinner spinner5 = this.A04;
                int i3 = 0;
                if (spinner5 != null) {
                    spinner5.setSelection(0);
                }
                C125756bd r03 = this.A0A;
                if (r03 != null) {
                    if (C18020vd.A05(r5, r03.A00, 12336) && (spinner = this.A04) != null) {
                        C1422678u.A00(spinner, this, 9);
                    }
                    this.A01 = view.findViewById(2131429381);
                    TextView A0E6 = C17880vN.A0E(view, 2131429373);
                    this.A06 = A0E6;
                    if (A0E6 != null) {
                        A0E6.setOnClickListener(this);
                    }
                    this.A05 = C17880vN.A0E(view, 2131429371);
                    this.A08 = C17880vN.A0E(view, 2131429376);
                    Button button2 = (Button) view.findViewById(2131429372);
                    button2.setText(2131886567);
                    button2.setOnClickListener(this);
                    this.A03 = button2;
                    this.A00 = view.findViewById(2131429378);
                    C28931bI A0s = C72453Mb.A0s(view, 2131429794);
                    this.A0D = A0s;
                    if (!z) {
                        i3 = 8;
                    }
                    A0s.A04(i3);
                    C28931bI r2 = this.A0D;
                    if (r2 != null) {
                        r2.A05(new AnonymousClass783(this, 17));
                    }
                    C37581pm A0G2 = AnonymousClass3MZ.A0G(this);
                    A0G2.A01(new AgeCollectionFragment$onViewCreated$1$1(this, (C30391dr) null));
                    A0G2.A01(new AgeCollectionFragment$onViewCreated$1$2(this, (C30391dr) null));
                    if (this instanceof DosaRemediationFragment) {
                        return;
                    }
                    if (z) {
                        C25661Pc r22 = ((DosaCollectionFragment) this).A00;
                        if (r22 != null) {
                            Integer A0k = C17880vN.A0k();
                            Integer A0f = AnonymousClass3MY.A0f();
                            C25661Pc.A00(r22, A0k, A0f, A0f, (Integer) null);
                            return;
                        }
                        C18070vi.A11("contextualAgeCollectionLogUtil");
                        throw null;
                    } else if (!(this instanceof DateOfBirthRemediationFragment)) {
                        ((DateOfBirthCollectionFragment) this).A27().A0L("age_collection_year", "age_collection_year_landing", "view", (String) null);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        C18070vi.A11("consentFeatureManager");
        throw null;
    }

    public void onClick(View view) {
        if (view != null) {
            int id = view.getId();
            if (Integer.valueOf(id) == null) {
                return;
            }
            if (id == 2131429373) {
                A01(this);
            } else if (id == 2131429377) {
                new DateOfBirthCollectionTransparencyBottomSheet().A2C(A1F(), "DateOfBirthCollectionTransparencyBottomSheet");
                if (this instanceof DosaRemediationFragment) {
                    return;
                }
                if (this instanceof DosaCollectionFragment) {
                    C25661Pc r3 = ((DosaCollectionFragment) this).A00;
                    if (r3 != null) {
                        C108985cd.A17(r3, C17880vN.A0l(), C108955ca.A0i(), 0);
                    } else {
                        C18070vi.A11("contextualAgeCollectionLogUtil");
                        throw null;
                    }
                } else if (!(this instanceof DateOfBirthRemediationFragment)) {
                    ((DateOfBirthCollectionFragment) this).A27().A0L("age_collection_education_nux", "age_collection_education_nux_landing", "view", (String) null);
                }
            } else if (id == 2131429372) {
                AnonymousClass3MX.A1Q(new AgeCollectionFragment$onClick$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                TextView textView = this.A06;
                if (textView == null || textView.getVisibility() != 0) {
                    if (this instanceof DosaRemediationFragment) {
                        return;
                    }
                    if (this instanceof DosaCollectionFragment) {
                        C25661Pc r32 = ((DosaCollectionFragment) this).A00;
                        if (r32 != null) {
                            C108985cd.A17(r32, C17880vN.A0k(), C17880vN.A0i(), 3);
                        } else {
                            C18070vi.A11("contextualAgeCollectionLogUtil");
                            throw null;
                        }
                    } else if (!(this instanceof DateOfBirthRemediationFragment)) {
                        ((DateOfBirthCollectionFragment) this).A27().A0L("age_collection_year", "age_collection_year_next", "next", (String) null);
                    }
                } else {
                    if (this instanceof DosaRemediationFragment) {
                        return;
                    }
                    if (this instanceof DosaCollectionFragment) {
                        C25661Pc r33 = ((DosaCollectionFragment) this).A00;
                        if (r33 != null) {
                            C108985cd.A17(r33, AnonymousClass3MY.A0f(), C17880vN.A0l(), 3);
                        } else {
                            C18070vi.A11("contextualAgeCollectionLogUtil");
                            throw null;
                        }
                    } else if (!(this instanceof DateOfBirthRemediationFragment)) {
                        ((DateOfBirthCollectionFragment) this).A27().A0L("age_collection_monthday", "age_collection_monthday_next", "next", (String) null);
                    }
                }
            }
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public C160928Ao A26() {
        if (this instanceof DosaRemediationFragment) {
            return (DosaRemediationViewModel) ((DosaRemediationFragment) this).A00.getValue();
        }
        if (this instanceof DosaCollectionFragment) {
            return (DosaCollectionViewModel) ((DosaCollectionFragment) this).A01.getValue();
        }
        if (this instanceof DateOfBirthRemediationFragment) {
            return (DateOfBirthRemediationViewModel) ((DateOfBirthRemediationFragment) this).A01.getValue();
        }
        return (DateOfBirthCollectionViewModel) ((DateOfBirthCollectionFragment) this).A01.getValue();
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str;
        String str2;
        C18100vl r4 = this.A0E;
        String str3 = (String) ((ArrayAdapter) r4.getValue()).getItem(i);
        if (str3 != null) {
            C125756bd r0 = this.A0A;
            if (r0 != null) {
                if (C18020vd.A05(C18040vf.A02, r0.A00, 12336)) {
                    str2 = AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(this), 2131895638);
                } else {
                    str2 = "----";
                }
                if (!str3.equals(str2)) {
                    ((ArrayAdapter) r4.getValue()).remove("----");
                    if (str2.equals(AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(this), 2131895638))) {
                        ((ArrayAdapter) r4.getValue()).remove(AnonymousClass3MY.A0m(AnonymousClass3MZ.A09(this), 2131895638));
                    }
                    A26().CAh(Integer.parseInt(str3));
                    if (this instanceof DosaCollectionFragment) {
                        C25661Pc r3 = ((DosaCollectionFragment) this).A00;
                        if (r3 != null) {
                            C108985cd.A17(r3, C17880vN.A0k(), C17880vN.A0h(), 2);
                            return;
                        }
                        str = "contextualAgeCollectionLogUtil";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                str = "consentFeatureManager";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public AgeCollectionFragment() {
        Integer num = AnonymousClass00R.A0C;
        this.A0H = AnonymousClass1DF.A00(num, new C149517jB(this));
        this.A0F = AnonymousClass1DF.A00(num, new C149497j9(this));
        this.A0G = AnonymousClass1DF.A00(num, new C149507jA(this));
        this.A0E = AnonymousClass1DF.A00(num, new C149487j8(this));
    }

    public void A1s() {
        super.A1s();
        Button button = this.A03;
        if (button != null) {
            button.setOnClickListener((View.OnClickListener) null);
        }
        TextView textView = this.A06;
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener) null);
        }
        this.A05 = null;
        this.A03 = null;
        this.A06 = null;
        this.A07 = null;
        this.A08 = null;
        this.A00 = null;
        this.A04 = null;
        this.A01 = null;
        this.A09 = null;
        this.A0D = null;
        this.A02 = null;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        A26().Bs3(i, i2, i3);
        if (this instanceof DosaCollectionFragment) {
            C25661Pc r3 = ((DosaCollectionFragment) this).A00;
            if (r3 != null) {
                C108985cd.A17(r3, AnonymousClass3MY.A0f(), C17880vN.A0k(), 2);
            } else {
                C18070vi.A11("contextualAgeCollectionLogUtil");
                throw null;
            }
        }
    }
}
