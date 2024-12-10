package com.whatsapp.status.privacy;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass1FL;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass6LG;
import X.AnonymousClass6R1;
import X.AnonymousClass727;
import X.AnonymousClass758;
import X.AnonymousClass77K;
import X.AnonymousClass79O;
import X.AnonymousClass7PO;
import X.AnonymousClass86E;
import X.AnonymousClass883;
import X.C108945cZ;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C110675gp;
import X.C122646Re;
import X.C127796ew;
import X.C133586p1;
import X.C138896xs;
import X.C1406772n;
import X.C1423479c;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C20098A7b;
import X.C24661Le;
import X.C30131dR;
import X.C32741hg;
import X.C35511mM;
import X.C60162nU;
import X.C72453Mb;
import X.C72473Md;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.bridge.wfal.WfalManager;
import java.lang.ref.WeakReference;

public final class StatusPrivacyBottomSheetDialogFragment extends Hilt_StatusPrivacyBottomSheetDialogFragment implements AnonymousClass86E {
    public static final Integer A0Q = AnonymousClass00R.A0K;
    public C19830z4 A00;
    public C18000vb A01;
    public AnonymousClass77K A02;
    public C24661Le A03;
    public C18030ve A04;
    public AnonymousClass1LU A05;
    public C32741hg A06;
    public C133586p1 A07;
    public AnonymousClass883 A08;
    public C110675gp A09;
    public C35511mM A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public boolean A0K;
    public boolean A0L;
    public String A0M;
    public final AnonymousClass02n A0N = CDw(new C1423479c(this, 10), new Object());
    public final AnonymousClass00H A0O = new AnonymousClass7PO(this);
    public final AnonymousClass02n A0P = CDw(new C1423479c(this, 11), new Object());

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C127796ew A0Y = C108985cd.A0Y(this);
        AnonymousClass77K r1 = this.A02;
        if (r1 == null) {
            C18070vi.A11("statusDistributionInfo");
            throw null;
        }
        A0Y.A00.A02(r1);
        C108985cd.A0Y(this).A00.A00();
    }

    public final class DiscardChangesConfirmationDialogFragment extends Hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment {
        public WfalManager A00;
        public C35511mM A01;
        public C30131dR A02;
        public boolean A03;
        public final AnonymousClass77K A04;
        public final AnonymousClass6R1 A05;
        public final WeakReference A06;
        public final boolean A07;

        public DiscardChangesConfirmationDialogFragment(AnonymousClass77K r2, AnonymousClass883 r3, AnonymousClass6R1 r4, boolean z) {
            this.A04 = r2;
            this.A07 = z;
            this.A05 = r4;
            this.A06 = AnonymousClass3MW.A0z(r3);
        }

        public void A1s() {
            boolean z;
            super.A1s();
            if (this.A07 && !this.A03) {
                AnonymousClass77K r0 = this.A04;
                if (r0 != null) {
                    z = r0.A05;
                } else {
                    z = false;
                }
                C30131dR r2 = this.A02;
                if (r2 != null) {
                    Boolean A1A = C108945cZ.A1A(z);
                    r2.A02(A1A, "initial_auto_setting");
                    r2.A02(A1A, "final_auto_setting");
                    r2.A03("TAP_OUTSIDE_DIALOG");
                    return;
                }
                C18070vi.A11("xFamilyUserFlowLogger");
                throw null;
            }
        }

        public Dialog A27(Bundle bundle) {
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                C73203Rj A002 = AnonymousClass4a6.A00(A1B);
                A002.A0D(2131889469);
                AnonymousClass758.A01(A002, this, 29, 2131889475);
                AnonymousClass758.A00(A002, this, 30, 2131895378);
                return AnonymousClass3MY.A0L(A002);
            }
            throw C17890vO.A0K();
        }
    }

    public static final void A00(StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment, boolean z) {
        String str;
        Intent intent;
        AnonymousClass727 r1;
        AnonymousClass77K r0;
        String str2;
        AnonymousClass00H r02 = statusPrivacyBottomSheetDialogFragment.A0E;
        if (r02 != null) {
            if (!C108975cc.A1H(r02)) {
                Context A14 = statusPrivacyBottomSheetDialogFragment.A14();
                intent = C17880vN.A0A();
                intent.setClassName(A14.getPackageName(), "com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity");
                intent.putExtra("is_black_list", z);
                AnonymousClass00H r03 = statusPrivacyBottomSheetDialogFragment.A0D;
                if (r03 != null) {
                    r1 = C108945cZ.A0u(r03);
                    r0 = statusPrivacyBottomSheetDialogFragment.A02;
                    if (r0 == null) {
                        str = "statusDistributionInfo";
                    }
                } else {
                    str = "statusAudienceRepository";
                }
            } else if (statusPrivacyBottomSheetDialogFragment.A05 != null) {
                Context A142 = statusPrivacyBottomSheetDialogFragment.A14();
                Integer valueOf = Integer.valueOf(C72453Mb.A03(z ? 1 : 0));
                intent = C72473Md.A0B(A142, "com.whatsapp.contact.picker.AudienceSelectionContactPicker");
                intent.putExtra("source_surface", 1);
                intent.putExtra("use_custom_multiselect_limit", true);
                intent.putExtra("custom_multiselect_limit", 2000);
                if (valueOf != null) {
                    intent.putExtra("status_distribution_mode", valueOf);
                }
                AnonymousClass00H r04 = statusPrivacyBottomSheetDialogFragment.A0D;
                if (r04 != null) {
                    r1 = C108945cZ.A0u(r04);
                    r0 = statusPrivacyBottomSheetDialogFragment.A02;
                    if (r0 == null) {
                        str2 = "statusDistributionInfo";
                    }
                } else {
                    str2 = "statusAudienceRepository";
                }
                C18070vi.A11(str2);
                throw null;
            } else {
                str = "waIntents";
            }
            r1.A03(intent, r0);
            statusPrivacyBottomSheetDialogFragment.A0N.A02((C1406772n) null, intent);
            return;
        }
        str = "statusConfig";
        C18070vi.A11(str);
        throw null;
    }

    public void A2M() {
        String str;
        AnonymousClass77K r0 = this.A02;
        if (r0 == null) {
            str = "statusDistributionInfo";
        } else {
            if (r0.A00 != 1) {
                this.A0L = true;
            }
            C108985cd.A0Y(this).A00.A04("tap_only_share_entry");
            AnonymousClass00H r02 = this.A0E;
            if (r02 != null) {
                if (C108975cc.A1H(r02)) {
                    A2N(1);
                }
                A00(this, false);
                return;
            }
            str = "statusConfig";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2N(int i) {
        String str;
        AnonymousClass77K r0 = this.A02;
        if (r0 != null) {
            int i2 = i;
            if (i != r0.A00) {
                this.A0L = true;
            }
            C127796ew A0Y = C108985cd.A0Y(this);
            if (i == 0) {
                str = "tap_my_contacts";
            } else if (i != 1) {
                str = "tap_my_contacts_except";
            } else {
                str = "tap_only_share";
            }
            A0Y.A00.A04(str);
            AnonymousClass77K r02 = this.A02;
            if (r02 != null) {
                this.A02 = new AnonymousClass77K(r02.A01, r02.A02, i2, r02.A05, r02.A06, false, false);
                return;
            }
        }
        C18070vi.A11("statusDistributionInfo");
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        String str;
        AnonymousClass883 r4;
        if (this.A08 != null && this.A0L) {
            if (this.A0K) {
                AnonymousClass00H r0 = this.A0J;
                if (r0 != null) {
                    C30131dR A13 = C108945cZ.A13(r0);
                    A13.A06((String) null, "TAP_AUDIENCE_SELECTOR_TOGGLE", 927605897);
                    A13.A04("SEE_CHANGES_DIALOG");
                } else {
                    str = "xFamilyUserFlowLoggerLazy";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            if (A1B() != null && (r4 = this.A08) != null) {
                AnonymousClass77K r3 = this.A02;
                if (r3 == null) {
                    str = "statusDistributionInfo";
                    C18070vi.A11(str);
                    throw null;
                }
                boolean z = this.A0K;
                AnonymousClass00H r1 = this.A0O;
                C18070vi.A0d(r1, 0);
                AnonymousClass6R1 r02 = (AnonymousClass6R1) r1.get();
                C18070vi.A0X(r02);
                DiscardChangesConfirmationDialogFragment discardChangesConfirmationDialogFragment = new DiscardChangesConfirmationDialogFragment(r3, r4, r02, z);
                AnonymousClass1FL A1B = A1B();
                if (A1B != null) {
                    C20098A7b.A01(discardChangesConfirmationDialogFragment, A1B.getSupportFragmentManager());
                }
            }
        }
    }

    public void A1K() {
        super.A1K();
        this.A08 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        String str2;
        C110675gp r0;
        ViewStub viewStub;
        View inflate;
        C110675gp r02;
        ViewStub viewStub2;
        View inflate2;
        int i;
        Bundle A15 = A15();
        C17960vV.A07(A15);
        AnonymousClass00H r03 = this.A0D;
        if (r03 != null) {
            AnonymousClass77K A002 = AnonymousClass727.A00(A15, r03);
            C17960vV.A07(A002);
            this.A02 = A002;
            String string = A15.getString("arg_entry_point");
            if (string != null) {
                this.A0M = string;
                AnonymousClass00H r04 = this.A0C;
                if (r04 != null) {
                    Long l = ((C138896xs) r04.get()).A00;
                    if (l != null) {
                        long longValue = l.longValue();
                        C127796ew A0Y = C108985cd.A0Y(this);
                        String str3 = this.A0M;
                        if (str3 == null) {
                            str2 = "entryPoint";
                            C18070vi.A11(str2);
                            throw null;
                        }
                        C60162nU r2 = A0Y.A00;
                        r2.A01(453120409, str3, longValue);
                        r2.A06("is_fb_linked", C108945cZ.A11(A0Y.A01).A06(AnonymousClass00R.A0L));
                        C127796ew A0Y2 = C108985cd.A0Y(this);
                        AnonymousClass77K r1 = this.A02;
                        if (r1 != null) {
                            A0Y2.A00.A03(r1);
                            C108985cd.A0Y(this).A00.A04("see_status_audience_selector_sheet");
                        }
                        C18070vi.A11("statusDistributionInfo");
                        throw null;
                    }
                    boolean z = A15().getBoolean("should_display_xo");
                    C110675gp r22 = new C110675gp(A14());
                    C18000vb r12 = this.A01;
                    if (r12 != null) {
                        this.A07 = new C133586p1(r12, r22);
                        this.A09 = r22;
                        if (z) {
                            AnonymousClass00H r05 = this.A0O;
                            C18070vi.A0d(r05, 0);
                            AnonymousClass6R1 r06 = (AnonymousClass6R1) r05.get();
                            if (r06 != null) {
                                int ordinal = r06.ordinal();
                                if (ordinal == 1 || ordinal == 2) {
                                    C35511mM r13 = this.A0A;
                                    if (r13 == null) {
                                        str2 = "fbAccountManager";
                                    } else if (!(!r13.A06(A0Q) || (r0 = this.A09) == null || (viewStub = r0.A00) == null || (inflate = viewStub.inflate()) == null)) {
                                        C108985cd.A0Y(this).A00.A04("see_xpost_controller");
                                        CompoundButton compoundButton = (CompoundButton) C18070vi.A05(inflate, 2131427923);
                                        AnonymousClass77K r07 = this.A02;
                                        if (r07 != null) {
                                            compoundButton.setChecked(r07.A05);
                                            compoundButton.setOnCheckedChangeListener(new AnonymousClass79O(this, 4));
                                        }
                                        C18070vi.A11("statusDistributionInfo");
                                        throw null;
                                    }
                                } else if (ordinal == 3) {
                                    C122646Re r14 = C122646Re.FACEBOOK;
                                    AnonymousClass00H r08 = this.A0H;
                                    if (r08 != null) {
                                        boolean A1W = AnonymousClass000.A1W(C108975cc.A0K(r14, r08));
                                        C122646Re r15 = C122646Re.INSTAGRAM;
                                        AnonymousClass00H r09 = this.A0H;
                                        if (r09 != null) {
                                            boolean A1W2 = AnonymousClass000.A1W(C108975cc.A0K(r15, r09));
                                            if (!((!A1W && !A1W2) || (r02 = this.A09) == null || (viewStub2 = r02.A01) == null || (inflate2 = viewStub2.inflate()) == null)) {
                                                View A052 = C18070vi.A05(inflate2, 2131435674);
                                                View A053 = C18070vi.A05(inflate2, 2131435675);
                                                CompoundButton compoundButton2 = (CompoundButton) C18070vi.A05(inflate2, 2131427924);
                                                CompoundButton compoundButton3 = (CompoundButton) C18070vi.A05(inflate2, 2131427925);
                                                ImageView A0C2 = AnonymousClass3Ma.A0C(inflate2, 2131430813);
                                                ImageView A0C3 = AnonymousClass3Ma.A0C(inflate2, 2131431518);
                                                if (A1W) {
                                                    A052.setVisibility(0);
                                                    AnonymousClass77K r010 = this.A02;
                                                    if (r010 != null) {
                                                        compoundButton2.setChecked(r010.A05);
                                                        compoundButton2.setOnCheckedChangeListener(new AnonymousClass79O(this, 5));
                                                        C108995ce.A0j(inflate2.getContext(), A0C2, 2131103152);
                                                    }
                                                    C18070vi.A11("statusDistributionInfo");
                                                    throw null;
                                                }
                                                if (A1W2) {
                                                    A053.setVisibility(0);
                                                    AnonymousClass77K r011 = this.A02;
                                                    if (r011 != null) {
                                                        compoundButton3.setChecked(r011.A06);
                                                        compoundButton3.setOnCheckedChangeListener(new AnonymousClass79O(this, 6));
                                                        C108995ce.A0j(inflate2.getContext(), A0C3, 2131103152);
                                                    }
                                                    C18070vi.A11("statusDistributionInfo");
                                                    throw null;
                                                }
                                                TextView A0E2 = AnonymousClass3Ma.A0E(inflate2, 2131435705);
                                                A0E2.setVisibility(0);
                                                if (A1W) {
                                                    i = 2131896326;
                                                    if (A1W2) {
                                                        i = 2131896323;
                                                    }
                                                } else {
                                                    i = 2131896328;
                                                }
                                                A0E2.setText(i);
                                            }
                                        }
                                    }
                                    str2 = "wfalManager";
                                }
                            }
                        }
                        C133586p1 r3 = this.A07;
                        if (r3 == null) {
                            str2 = "statusPrivacyBottomSheetController";
                        } else {
                            AnonymousClass77K r012 = this.A02;
                            if (r012 != null) {
                                int i2 = r012.A00;
                                int size = r012.A01.size();
                                AnonymousClass77K r013 = this.A02;
                                if (r013 != null) {
                                    int size2 = r013.A02.size();
                                    r3.A00(i2);
                                    r3.A01(size, size2);
                                    C110675gp r23 = r3.A00;
                                    AnonymousClass3MZ.A1P(r23.A04, r23, this, 35);
                                    AnonymousClass3MZ.A1P(r23.A03, r23, this, 36);
                                    AnonymousClass3MZ.A1P(r23.A02, r23, this, 37);
                                    AnonymousClass6LG.A00(r23.A07, this, 24);
                                    AnonymousClass6LG.A00(r23.A05, this, 25);
                                    AnonymousClass6LG.A00(r23.A06, this, 26);
                                    return this.A09;
                                }
                            }
                            C18070vi.A11("statusDistributionInfo");
                            throw null;
                        }
                    } else {
                        str2 = "whatsAppLocale";
                    }
                    C18070vi.A11(str2);
                    throw null;
                }
                str = "sharingSessionManager";
            } else {
                throw C17880vN.A0g();
            }
        } else {
            str = "statusAudienceRepository";
        }
        C18070vi.A11(str);
        throw null;
    }
}
