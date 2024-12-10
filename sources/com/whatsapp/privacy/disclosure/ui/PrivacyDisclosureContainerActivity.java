package com.whatsapp.privacy.disclosure.ui;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass71X;
import X.AnonymousClass7A8;
import X.AnonymousClass7AS;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C121696Ld;
import X.C125766be;
import X.C134876rI;
import X.C135406s9;
import X.C138126wZ;
import X.C1416776n;
import X.C1418177b;
import X.C1423279a;
import X.C153077ow;
import X.C1583580j;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18100vl;
import X.C20098A7b;
import X.C30391dr;
import X.C33501iv;
import X.C34001jj;
import X.C63932tv;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.consent.ConsentNavigationViewModel;
import com.whatsapp.consent.ConsentNavigationViewModel$handleYouthConsentDisclosureAccepted$1;
import com.whatsapp.consent.YouthConsentDialog;
import java.util.List;

public final class PrivacyDisclosureContainerActivity extends AnonymousClass1FU {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C18100vl A03;

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("should_return_results", this.A02);
    }

    public static final void A0V(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity, int i) {
        Integer num;
        C134876rI r0;
        C18100vl r3 = privacyDisclosureContainerActivity.A03;
        ((PrivacyDisclosureContainerViewModel) r3.getValue()).A0T(i);
        C135406s9 r02 = (C135406s9) ((PrivacyDisclosureContainerViewModel) r3.getValue()).A02.A06();
        if (r02 == null || (r0 = (C134876rI) r02.A01) == null) {
            num = null;
        } else {
            num = Integer.valueOf(r0.A00);
        }
        if (privacyDisclosureContainerActivity.A02) {
            Intent A0A = C17880vN.A0A();
            A0A.putExtra("returned_result", i);
            A0A.putExtra("disclosure_id", num);
            privacyDisclosureContainerActivity.A3m(A0A);
            privacyDisclosureContainerActivity.setResult(-1, A0A);
        }
        if (i != 145) {
            PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) r3.getValue();
            if (num != null) {
                C33501iv r03 = privacyDisclosureContainerViewModel.A04;
                if (C108965cb.A1Z(r03.A0B, num.intValue())) {
                    C125766be r1 = AnonymousClass71X.A00;
                    if (r1 == null) {
                        return;
                    }
                    if (i == 5) {
                        ConsentNavigationViewModel consentNavigationViewModel = r1.A00;
                        consentNavigationViewModel.A00 = AnonymousClass3MW.A0z(privacyDisclosureContainerActivity);
                        consentNavigationViewModel.A01.A07(0, 2131891797);
                        AnonymousClass3MW.A1X(consentNavigationViewModel.A09, new ConsentNavigationViewModel$handleYouthConsentDisclosureAccepted$1(privacyDisclosureContainerActivity, consentNavigationViewModel, (C30391dr) null), consentNavigationViewModel.A0A);
                        return;
                    } else if (i == 162 || i == 165) {
                        r1.A00.A00 = AnonymousClass3MW.A0z(privacyDisclosureContainerActivity);
                        C20098A7b.A02(new YouthConsentDialog(), privacyDisclosureContainerActivity.getSupportFragmentManager());
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        privacyDisclosureContainerActivity.finish();
    }

    public static final boolean A0W(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity) {
        C134876rI r0;
        C1418177b r4;
        C134876rI r02;
        Fragment roundedBottomSheetDialogFragment;
        int i;
        C18100vl r6 = privacyDisclosureContainerActivity.A03;
        PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) r6.getValue();
        C135406s9 r03 = (C135406s9) privacyDisclosureContainerViewModel.A03.A06();
        if (r03 == null || (r0 = (C134876rI) r03.A01) == null) {
            return false;
        }
        List list = r0.A01;
        int i2 = privacyDisclosureContainerViewModel.A00;
        if (i2 < 0 || i2 >= list.size() || (r4 = (C1418177b) list.get(privacyDisclosureContainerViewModel.A00)) == null) {
            return false;
        }
        C135406s9 r04 = (C135406s9) ((PrivacyDisclosureContainerViewModel) r6.getValue()).A02.A06();
        if (r04 == null || (r02 = (C134876rI) r04.A01) == null) {
            throw AnonymousClass000.A0s("No data from view model");
        }
        int i3 = r02.A00;
        if (privacyDisclosureContainerActivity.getSupportFragmentManager().A0Q(privacyDisclosureContainerActivity.A03()) == null) {
            int i4 = ((PrivacyDisclosureContainerViewModel) r6.getValue()).A00;
            int intValue = r4.A05.intValue();
            if (intValue == 2 || intValue == 0 || intValue == 1) {
                C1416776n r05 = r4.A04;
                if (r05 != null) {
                    r05.A00 = false;
                }
                roundedBottomSheetDialogFragment = new RoundedBottomSheetDialogFragment();
            } else if (intValue == 3) {
                roundedBottomSheetDialogFragment = new Fragment();
            } else {
                throw AnonymousClass3MW.A14();
            }
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("argDisclosureId", i3);
            A0D.putInt("argPromptIndex", i4);
            A0D.putParcelable("argPrompt", r4);
            roundedBottomSheetDialogFragment.A1R(A0D);
            if (roundedBottomSheetDialogFragment instanceof DialogFragment) {
                privacyDisclosureContainerActivity.CMk((DialogFragment) roundedBottomSheetDialogFragment, privacyDisclosureContainerActivity.A03());
            } else {
                C34001jj A0H = AnonymousClass3Ma.A0H(privacyDisclosureContainerActivity);
                A0H.A06(2130772058, 2130772061, 2130772057, 2130772062);
                A0H.A0D(roundedBottomSheetDialogFragment, privacyDisclosureContainerActivity.A03(), 2131430999);
                A0H.A02();
            }
            switch (((PrivacyDisclosureContainerViewModel) r6.getValue()).A00) {
                case 0:
                    i = 105;
                    break;
                case 1:
                    i = 111;
                    break;
                case 2:
                    i = 112;
                    break;
                case 3:
                    i = 113;
                    break;
                case 4:
                    i = 114;
                    break;
                case 5:
                    i = 115;
                    break;
                case 6:
                    i = 116;
                    break;
                case 7:
                    i = 117;
                    break;
                case 8:
                    i = 118;
                    break;
                case 9:
                    i = 119;
                    break;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                ((PrivacyDisclosureContainerViewModel) r6.getValue()).A0T(valueOf.intValue());
                return true;
            }
        }
        return true;
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r0 = A0A.A00;
            C109005cf.A0c(A0A, r0, r0, this);
            C63932tv.A08(this, C000200d.A00(r0.A5A));
        }
    }

    public PrivacyDisclosureContainerActivity(int i) {
        this.A01 = false;
        C1423279a.A00(this, 29);
    }

    private final String A03() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("pdf_");
        return C17880vN.A0t(A10, ((PrivacyDisclosureContainerViewModel) this.A03.getValue()).A00);
    }

    public static final void A0Q(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity) {
        C138126wZ r1;
        int intExtra = privacyDisclosureContainerActivity.getIntent().getIntExtra("disclosure_id", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        if (intExtra == -1) {
            valueOf = null;
        }
        String stringExtra = privacyDisclosureContainerActivity.getIntent().getStringExtra("surface");
        Intent intent = privacyDisclosureContainerActivity.getIntent();
        C18070vi.A0X(intent);
        int intExtra2 = intent.getIntExtra("trigger", -1);
        if (intExtra2 == 0) {
            r1 = C138126wZ.A02;
        } else if (intExtra2 == 1) {
            r1 = C138126wZ.A03;
        } else if (intExtra2 == 2) {
            r1 = C138126wZ.A04;
        } else if (intExtra2 != 3) {
            r1 = C138126wZ.A06;
        } else {
            r1 = C138126wZ.A05;
        }
        PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) privacyDisclosureContainerActivity.A03.getValue();
        C18070vi.A0d(r1, 2);
        privacyDisclosureContainerViewModel.A01 = r1;
        C17890vO.A0u(new C121696Ld(privacyDisclosureContainerViewModel, valueOf, stringExtra), privacyDisclosureContainerViewModel.A05);
        if (valueOf != null && valueOf.equals(AnonymousClass71X.A02)) {
            AnonymousClass71X.A06.put(valueOf, privacyDisclosureContainerActivity);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean booleanExtra;
        super.onCreate(bundle);
        setContentView(2131626595);
        AnonymousClass7AS.A00(this, ((PrivacyDisclosureContainerViewModel) this.A03.getValue()).A02, new C1583580j(this), 9);
        if (bundle != null) {
            booleanExtra = bundle.getBoolean("should_return_results", false);
        } else {
            booleanExtra = getIntent().getBooleanExtra("should_return_results", false);
        }
        this.A02 = booleanExtra;
        getSupportFragmentManager().A0t(new AnonymousClass7A8(this, 2), this, "fragResultRequestKey");
        A0Q(this);
    }

    public PrivacyDisclosureContainerActivity() {
        this(0);
        this.A03 = AnonymousClass1DF.A01(new C153077ow(this));
    }
}
