package com.whatsapp.status.audienceselector.sharesheet;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass019;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass6Ql;
import X.AnonymousClass6RU;
import X.AnonymousClass77K;
import X.AnonymousClass78P;
import X.AnonymousClass79O;
import X.AnonymousClass7AP;
import X.AnonymousClass7AW;
import X.AnonymousClass7S4;
import X.AnonymousClass7wA;
import X.AnonymousClass8AT;
import X.C000200d;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C110745gz;
import X.C111165iV;
import X.C114315qV;
import X.C125016aM;
import X.C127806ex;
import X.C134086pz;
import X.C136806uR;
import X.C138896xs;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C24071It;
import X.C24641Lc;
import X.C36241nZ;
import X.C36251na;
import X.C60162nU;
import X.C89974dK;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RadioButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.lang.ref.WeakReference;

public final class StatusAudienceSelectorShareSheetFragment extends Hilt_StatusAudienceSelectorShareSheetFragment implements AnonymousClass019 {
    public View A00;
    public View A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public RadioButton A05;
    public RadioButton A06;
    public C125016aM A07;
    public WaImageView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public C24641Lc A0D;
    public C136806uR A0E;
    public C134086pz A0F;
    public C111165iV A0G;
    public WDSButton A0H;
    public WDSSwitch A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public boolean A0O;
    public final WeakReference A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        View A0G2;
        int i;
        C18070vi.A0d(layoutInflater, 0);
        int i2 = 2131626989;
        if (C108965cb.A1Y(this)) {
            i2 = 2131626992;
        }
        View A0G3 = C108955ca.A0G(layoutInflater, viewGroup, i2, false);
        ViewStub A0E2 = AnonymousClass3MW.A0E(A0G3, 2131435384);
        C18100vl r2 = this.A0Q;
        int ordinal = ((AnonymousClass6Ql) r2.getValue()).ordinal();
        int i3 = 2131626991;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i3 = 2131626990;
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        View A0G4 = AnonymousClass3MY.A0G(A0E2, i3);
        C18070vi.A0z(A0G4, "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton");
        this.A0H = (WDSButton) A0G4;
        int ordinal2 = ((AnonymousClass6Ql) r2.getValue()).ordinal();
        if (ordinal2 == 0) {
            WDSButton wDSButton = this.A0H;
            if (wDSButton != null) {
                AnonymousClass78P.A00(wDSButton, this, 0);
            }
        } else if (ordinal2 == 1) {
            WDSButton wDSButton2 = this.A0H;
            if (wDSButton2 != null) {
                C89974dK.A00(wDSButton2, this, 47);
            }
        } else {
            throw AnonymousClass3MW.A14();
        }
        if (C108965cb.A1Y(this)) {
            this.A03 = (RadioButton) AnonymousClass1HF.A06(A0G3, 2131432891);
            this.A04 = (RadioButton) AnonymousClass1HF.A06(A0G3, 2131432892);
            this.A0A = AnonymousClass3MW.A0T(A0G3, 2131430647);
            this.A05 = (RadioButton) AnonymousClass1HF.A06(A0G3, 2131433291);
            this.A0B = AnonymousClass3MW.A0T(A0G3, 2131431602);
            RadioButton radioButton = this.A03;
            if (radioButton != null) {
                radioButton.setClickable(false);
            }
            RadioButton radioButton2 = this.A03;
            if (radioButton2 != null) {
                radioButton2.setText(2131895628);
            }
            RadioButton radioButton3 = this.A03;
            if (radioButton3 != null) {
                AnonymousClass78P.A00(radioButton3, this, 4);
            }
            RadioButton radioButton4 = this.A04;
            if (radioButton4 != null) {
                radioButton4.setClickable(false);
            }
            RadioButton radioButton5 = this.A04;
            if (radioButton5 != null) {
                radioButton5.setText(2131895626);
            }
            RadioButton radioButton6 = this.A04;
            if (radioButton6 != null) {
                C89974dK.A00(radioButton6, this, 48);
            }
            WaTextView waTextView = this.A0A;
            if (waTextView != null) {
                C89974dK.A00(waTextView, this, 49);
            }
            RadioButton radioButton7 = this.A05;
            if (radioButton7 != null) {
                radioButton7.setClickable(false);
            }
            RadioButton radioButton8 = this.A05;
            if (radioButton8 != null) {
                radioButton8.setText(2131895624);
            }
            RadioButton radioButton9 = this.A05;
            if (radioButton9 != null) {
                AnonymousClass78P.A00(radioButton9, this, 5);
            }
            WaTextView waTextView2 = this.A0B;
            if (waTextView2 != null) {
                AnonymousClass78P.A00(waTextView2, this, 6);
            }
            A00();
            WaImageView A0R2 = AnonymousClass3MW.A0R(A0G3, 2131429136);
            this.A08 = A0R2;
            if (A0R2 != null) {
                C89974dK.A00(A0R2, this, 46);
            }
            C134086pz r1 = this.A0F;
            if (r1 != null) {
                C111165iV r0 = this.A0G;
                if (r0 != null) {
                    r1.A01(r0.A0T().A00);
                    C136806uR r12 = this.A0E;
                    if (r12 != null) {
                        if (r12.A03((AnonymousClass6RU) this.A0R.getValue())) {
                            A0G2 = ((ViewStub) C18070vi.A05(A0G3, 2131435386)).inflate();
                            C108985cd.A0Z(this).A00.A04("see_xpost_controller");
                            i = 2131427923;
                        }
                        return A0G3;
                    }
                    str = "shareSheetUtil";
                    C18070vi.A11(str);
                    throw null;
                }
                str = "viewModel";
                C18070vi.A11(str);
                throw null;
            }
            str = "shareSheetController";
            C18070vi.A11(str);
            throw null;
        }
        C24641Lc r02 = this.A0D;
        if (r02 != null) {
            if (C18020vd.A05(C18040vf.A01, r02.A01, 10335)) {
                ((ViewStub) C18070vi.A05(A0G3, 2131435398)).inflate();
                WaImageView A0R3 = AnonymousClass3MW.A0R(A0G3, 2131429136);
                this.A08 = A0R3;
                if (A0R3 != null) {
                    C89974dK.A00(A0R3, this, 46);
                }
            }
            this.A00 = AnonymousClass1HF.A06(A0G3, 2131435387);
            this.A01 = AnonymousClass1HF.A06(A0G3, 2131435393);
            this.A02 = (RadioButton) AnonymousClass1HF.A06(A0G3, 2131435388);
            this.A06 = (RadioButton) AnonymousClass1HF.A06(A0G3, 2131435392);
            this.A09 = AnonymousClass3MW.A0T(A0G3, 2131435389);
            WaTextView A0T = AnonymousClass3MW.A0T(A0G3, 2131435394);
            this.A0C = A0T;
            if (A0T != null) {
                C136806uR r22 = this.A0E;
                if (r22 != null) {
                    Context A14 = A14();
                    C111165iV r03 = this.A0G;
                    if (r03 != null) {
                        A0T.setText(r22.A01(A14, r03.A0T().A01));
                    }
                    C18070vi.A11("viewModel");
                    throw null;
                }
                str = "shareSheetUtil";
                C18070vi.A11(str);
                throw null;
            }
            WaTextView waTextView3 = this.A09;
            if (waTextView3 != null) {
                C136806uR r23 = this.A0E;
                if (r23 != null) {
                    Context A142 = A14();
                    C111165iV r04 = this.A0G;
                    if (r04 != null) {
                        waTextView3.setText(r23.A02(A142, r04.A0T().A02));
                    }
                    C18070vi.A11("viewModel");
                    throw null;
                }
                str = "shareSheetUtil";
                C18070vi.A11(str);
                throw null;
            }
            RadioButton radioButton10 = this.A02;
            if (radioButton10 != null) {
                radioButton10.setClickable(false);
            }
            View view = this.A00;
            if (view != null) {
                C89974dK.A00(view, this, 45);
            }
            WaTextView waTextView4 = this.A09;
            if (waTextView4 != null) {
                AnonymousClass78P.A00(waTextView4, this, 1);
            }
            RadioButton radioButton11 = this.A06;
            if (radioButton11 != null) {
                radioButton11.setClickable(false);
            }
            View view2 = this.A01;
            if (view2 != null) {
                AnonymousClass78P.A00(view2, this, 2);
            }
            WaTextView waTextView5 = this.A0C;
            if (waTextView5 != null) {
                AnonymousClass78P.A00(waTextView5, this, 3);
            }
            A00();
            C134086pz r13 = this.A0F;
            if (r13 != null) {
                C111165iV r05 = this.A0G;
                if (r05 != null) {
                    r13.A01(r05.A0T().A00);
                    C136806uR r14 = this.A0E;
                    if (r14 != null) {
                        if (r14.A03((AnonymousClass6RU) this.A0R.getValue())) {
                            A0G2 = AnonymousClass3MY.A0G((ViewStub) C18070vi.A05(A0G3, 2131435386), 2131626949);
                            C108985cd.A0Z(this).A00.A04("see_xpost_controller");
                            i = 2131429730;
                        }
                        return A0G3;
                    }
                    str = "shareSheetUtil";
                    C18070vi.A11(str);
                    throw null;
                }
                C18070vi.A11("viewModel");
                throw null;
            }
            str = "shareSheetController";
            C18070vi.A11(str);
            throw null;
        }
        str = "statusConfig";
        C18070vi.A11(str);
        throw null;
        WDSSwitch wDSSwitch = (WDSSwitch) AnonymousClass1HF.A06(A0G2, i);
        this.A0I = wDSSwitch;
        if (wDSSwitch != null) {
            C111165iV r06 = this.A0G;
            if (r06 != null) {
                wDSSwitch.setChecked(r06.A0T().A05);
            }
            str = "viewModel";
            C18070vi.A11(str);
            throw null;
        }
        WDSSwitch wDSSwitch2 = this.A0I;
        if (wDSSwitch2 != null) {
            wDSSwitch2.setOnCheckedChangeListener(new AnonymousClass79O(this, 2));
        }
        return A0G3;
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        this.A0G = (C111165iV) new C24071It(new AnonymousClass7AW(this), A1D()).A00(C111165iV.class);
        C125016aM r0 = this.A07;
        if (r0 != null) {
            Context A14 = A14();
            C111165iV r12 = this.A0G;
            if (r12 != null) {
                C36251na r02 = r0.A00;
                AnonymousClass10E r1 = r02.A02;
                this.A0F = new C134086pz(A14, AnonymousClass3MY.A0Z(r1), this, C36241nZ.A0i(r02.A01), r12, C000200d.A00(r1.A00.A4e));
                AnonymousClass00H r03 = this.A0K;
                if (r03 != null) {
                    Long l = ((C138896xs) r03.get()).A00;
                    if (l != null) {
                        long longValue = l.longValue();
                        C127806ex A0Z = C108985cd.A0Z(this);
                        String str2 = ((AnonymousClass6RU) this.A0R.getValue()).loggingString;
                        C18070vi.A0d(str2, 0);
                        C60162nU r2 = A0Z.A00;
                        r2.A01(453117140, str2, longValue);
                        r2.A06("is_fb_linked", C108945cZ.A11(A0Z.A01).A06(AnonymousClass00R.A0L));
                        C127806ex A0Z2 = C108985cd.A0Z(this);
                        C111165iV r04 = this.A0G;
                        if (r04 != null) {
                            AnonymousClass77K A0T = r04.A0T();
                            C18070vi.A0d(A0T, 0);
                            A0Z2.A00.A03(A0T);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    str = "sharingSessionManager";
                }
            }
            C18070vi.A11("viewModel");
            throw null;
        }
        str = "shareSheetControllerFactory";
        C18070vi.A11(str);
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C108985cd.A0Z(this).A00.A04("see_share_sheet");
        C111165iV r2 = this.A0G;
        if (r2 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        r2.A00.A0A(this, new AnonymousClass7AP(this, 18));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C127806ex A0Z = C108985cd.A0Z(this);
        C111165iV r0 = this.A0G;
        if (r0 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        AnonymousClass77K A0T = r0.A0T();
        C18070vi.A0d(A0T, 0);
        A0Z.A00.A02(A0T);
        C108985cd.A0Z(this).A00.A00();
        AnonymousClass8AT r02 = (AnonymousClass8AT) this.A0P.get();
        if (r02 != null) {
            r02.C6b();
        }
    }

    private final void A00() {
        WaTextView waTextView;
        WaTextView waTextView2;
        C136806uR r2 = this.A0E;
        if (r2 != null) {
            Context A14 = A14();
            C111165iV r0 = this.A0G;
            if (r0 != null) {
                String A022 = r2.A02(A14, r0.A0T().A02);
                C18070vi.A0d(A022, 0);
                if (C108965cb.A1Y(this)) {
                    waTextView = this.A0A;
                } else {
                    waTextView = this.A09;
                }
                if (waTextView != null) {
                    waTextView.setText(A022);
                }
                C136806uR r22 = this.A0E;
                if (r22 != null) {
                    Context A142 = A14();
                    C111165iV r02 = this.A0G;
                    if (r02 != null) {
                        String A012 = r22.A01(A142, r02.A0T().A01);
                        C18070vi.A0d(A012, 0);
                        if (C108965cb.A1Y(this)) {
                            waTextView2 = this.A0B;
                        } else {
                            waTextView2 = this.A0C;
                        }
                        if (waTextView2 != null) {
                            waTextView2.setText(A012);
                            return;
                        }
                        return;
                    }
                }
            }
            C18070vi.A11("viewModel");
            throw null;
        }
        C18070vi.A11("shareSheetUtil");
        throw null;
    }

    public void A1s() {
        this.A0P.clear();
        super.A1s();
        RadioButton radioButton = this.A02;
        if (radioButton != null) {
            radioButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        RadioButton radioButton2 = this.A06;
        if (radioButton2 != null) {
            radioButton2.setOnClickListener((View.OnClickListener) null);
        }
        this.A06 = null;
        WaTextView waTextView = this.A09;
        if (waTextView != null) {
            waTextView.setOnClickListener((View.OnClickListener) null);
        }
        this.A09 = null;
        WaTextView waTextView2 = this.A0C;
        if (waTextView2 != null) {
            waTextView2.setOnClickListener((View.OnClickListener) null);
        }
        this.A0C = null;
        WDSSwitch wDSSwitch = this.A0I;
        if (wDSSwitch != null) {
            wDSSwitch.setOnClickListener((View.OnClickListener) null);
        }
        this.A0I = null;
        WDSButton wDSButton = this.A0H;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A0H = null;
    }

    public final AnonymousClass00H A2K() {
        AnonymousClass00H r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusAudienceSelectorShareSheetQplLoggerLazy");
        throw null;
    }

    public StatusAudienceSelectorShareSheetFragment(AnonymousClass8AT r4) {
        this.A0P = AnonymousClass3MW.A0z(r4);
        this.A0Q = AnonymousClass7S4.A02(this, 20);
        this.A0R = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass7wA(this, AnonymousClass6RU.UNKNOWN));
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        C18070vi.A0z(A27, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        C110745gz r3 = (C110745gz) A27;
        if (this.A0Q.getValue() == AnonymousClass6Ql.SHARE) {
            r3.getContext().setTheme(2132083734);
        }
        if (r3.A01 == null) {
            C110745gz.A02(r3);
        }
        r3.A01.A0Z(new C114315qV(this, 12));
        return r3;
    }

    public StatusAudienceSelectorShareSheetFragment() {
        this((AnonymousClass8AT) null);
    }
}
