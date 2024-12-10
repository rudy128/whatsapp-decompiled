package com.whatsapp.consent;

import X.A8V;
import X.AnonymousClass000;
import X.AnonymousClass12Q;
import X.AnonymousClass1CM;
import X.AnonymousClass1DF;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass6W5;
import X.AnonymousClass71X;
import X.C108945cZ;
import X.C143447Dl;
import X.C143457Dm;
import X.C143467Dn;
import X.C143477Do;
import X.C143487Dp;
import X.C143497Dq;
import X.C143517Ds;
import X.C143537Du;
import X.C143557Dw;
import X.C143567Dx;
import X.C143577Dy;
import X.C143907Fg;
import X.C149317ir;
import X.C1594984t;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C19830z4;
import X.C33501iv;
import X.C37291pH;
import android.app.Activity;
import android.content.Context;
import com.whatsapp.dobverification.WaConsentRepository;
import java.lang.ref.WeakReference;

public final class ConsentNavigationViewModel extends AnonymousClass1J2 {
    public WeakReference A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass6W5 A02 = ((AnonymousClass6W5) AnonymousClass12Q.A01(32807));
    public final C143907Fg A03;
    public final WaConsentRepository A04;
    public final C37291pH A05;
    public final C33501iv A06;
    public final AnonymousClass1CM A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(new C149317ir(this));
    public final C18600wl A09;
    public final AnonymousClass1OX A0A;
    public final C19830z4 A0B;
    public final A8V A0C;

    public static final void A03(ConsentNavigationViewModel consentNavigationViewModel) {
        Context A0F;
        WeakReference weakReference = consentNavigationViewModel.A00;
        if (weakReference != null && (A0F = C108945cZ.A0F(weakReference)) != null) {
            C37291pH r0 = consentNavigationViewModel.A05;
            Activity A002 = AnonymousClass1L9.A00(A0F);
            r0.A01.A0B.remove(20240708);
            AnonymousClass71X.A01 = null;
            AnonymousClass71X.A03 = null;
            AnonymousClass71X.A00 = null;
            AnonymousClass71X.A04 = null;
            A002.finish();
            consentNavigationViewModel.A00 = AnonymousClass3MW.A0z((Object) null);
        }
    }

    public final void A0T() {
        C19830z4 r5 = this.A0B;
        r5.A1t("", "");
        C17880vN.A1B(C19830z4.A00(r5), "2fa");
        r5.A1d((String) null);
        r5.A1c("");
        C17880vN.A1C(C19830z4.A00(r5), "registration_voice_code_length", 0);
        C17880vN.A1C(C19830z4.A00(r5), "registration_sms_code_length", 0);
        C17880vN.A1E(C19830z4.A00(r5), "registration_failure_reason", "");
        C17880vN.A1E(C19830z4.A00(r5), "registration_push_notif_code", "");
        WaConsentRepository waConsentRepository = this.A04;
        C17900vP.A0J(waConsentRepository.A02());
        waConsentRepository.A01.A08.A01(0);
    }

    public ConsentNavigationViewModel(AnonymousClass1KB r2, C19830z4 r3, C143907Fg r4, WaConsentRepository waConsentRepository, C37291pH r6, C33501iv r7, AnonymousClass1CM r8, A8V a8v, C18600wl r10, AnonymousClass1OX r11) {
        C18070vi.A0o(r8, r7, r6);
        C18070vi.A0d(waConsentRepository, 5);
        C18070vi.A0x(r2, a8v, r3, r11, r10);
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = waConsentRepository;
        this.A01 = r2;
        this.A0C = a8v;
        this.A0B = r3;
        this.A0A = r11;
        this.A09 = r10;
    }

    public static final C1594984t A00(ConsentNavigationViewModel consentNavigationViewModel, int i) {
        C1594984t r0;
        C17900vP.A0j("ConsentNavigationViewModel/registrationStateToNavigation reg state= ", AnonymousClass000.A10(), i);
        if (i != 7) {
            if (i != 41) {
                switch (i) {
                    case 25:
                        r0 = C143447Dl.A00;
                        break;
                    case 26:
                        r0 = C143517Ds.A00;
                        break;
                    case 27:
                    case 28:
                    case 29:
                        break;
                    case 30:
                        r0 = C143577Dy.A00;
                        break;
                    default:
                        switch (i) {
                            case 32:
                                r0 = C143457Dm.A00;
                                break;
                            case 33:
                                r0 = C143487Dp.A00;
                                break;
                            case 34:
                                r0 = C143477Do.A00;
                                break;
                            case 35:
                                r0 = C143467Dn.A00;
                                break;
                            case 36:
                                r0 = C143557Dw.A00;
                                break;
                            default:
                                A8V a8v = consentNavigationViewModel.A0C;
                                a8v.A0L("age_collection_check", "age_collection_check_completed", "successful", (String) null);
                                a8v.A08();
                                r0 = C143537Du.A00;
                                break;
                        }
                }
            }
            r0 = C143497Dq.A00;
        } else {
            consentNavigationViewModel.A0C.A0L("age_collection_check", "age_collection_check_completed", "successful", (String) null);
            r0 = C143567Dx.A00;
        }
        return r0;
    }

    public void A0S() {
        A03(this);
    }
}
