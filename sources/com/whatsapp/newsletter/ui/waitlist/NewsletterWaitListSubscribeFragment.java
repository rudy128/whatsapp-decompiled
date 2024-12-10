package com.whatsapp.newsletter.ui.waitlist;

import X.AFC;
import X.AnonymousClass00H;
import X.AnonymousClass112;
import X.AnonymousClass11C;
import X.AnonymousClass1F9;
import X.AnonymousClass1FL;
import X.AnonymousClass1Vo;
import X.AnonymousClass1YL;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aU;
import X.AnonymousClass5YB;
import X.AnonymousClass74D;
import X.AnonymousClass74O;
import X.C110885hR;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C19830z4;
import X.C21425Ajs;
import X.C23391Fw;
import X.C23401Fx;
import X.C27301Vn;
import X.C72453Mb;
import X.C81323z3;
import X.C90594eK;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

public final class NewsletterWaitListSubscribeFragment extends Hilt_NewsletterWaitListSubscribeFragment {
    public C19830z4 A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625398, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View findViewById = view.findViewById(2131433218);
        View findViewById2 = view.findViewById(2131430057);
        C19830z4 r0 = this.A00;
        if (r0 != null) {
            if (C17880vN.A1W(C17890vO.A0B(r0), "newsletter_wait_list_subscription")) {
                C17880vN.A0E(view, 2131436963).setText(2131898394);
                C18070vi.A0b(findViewById);
                findViewById.setVisibility(8);
            }
            AnonymousClass3Ma.A19(findViewById, this, 26);
            AnonymousClass3Ma.A19(findViewById2, this, 27);
            return;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public static final void A00(NewsletterWaitListSubscribeFragment newsletterWaitListSubscribeFragment) {
        AnonymousClass5YB r5;
        String str;
        String className;
        AnonymousClass1FL A1B = newsletterWaitListSubscribeFragment.A1B();
        if ((A1B instanceof AnonymousClass5YB) && (r5 = (AnonymousClass5YB) A1B) != null) {
            NewsletterWaitListActivity newsletterWaitListActivity = (NewsletterWaitListActivity) r5;
            C27301Vn r0 = newsletterWaitListActivity.A00;
            if (r0 == null) {
                str = "waNotificationManager";
            } else if (((AnonymousClass1Vo) r0).A00.A01()) {
                AnonymousClass00H r02 = newsletterWaitListActivity.A02;
                if (r02 != null) {
                    ((AnonymousClass74D) r02.get()).A08(2);
                    C17880vN.A1F(C19830z4.A00(newsletterWaitListActivity.A0A), "newsletter_wait_list_subscription", true);
                    ComponentName callingActivity = newsletterWaitListActivity.getCallingActivity();
                    if (callingActivity != null && (className = callingActivity.getClassName()) != null && className.equals("com.whatsapp.Conversation")) {
                        C72453Mb.A14(newsletterWaitListActivity);
                    } else if (((C23391Fw) newsletterWaitListActivity.getLifecycle()).A02 != C23401Fx.DESTROYED) {
                        View view = newsletterWaitListActivity.A00;
                        C18070vi.A0X(view);
                        String A0F = C18070vi.A0F(newsletterWaitListActivity, 2131898397);
                        List emptyList = Collections.emptyList();
                        C18070vi.A0X(emptyList);
                        AnonymousClass11C r6 = newsletterWaitListActivity.A08;
                        C18070vi.A0W(r6);
                        C90594eK r3 = new C90594eK(view, (AnonymousClass1F9) newsletterWaitListActivity, r6, A0F, emptyList, 2000, false);
                        r3.A06(new AFC(newsletterWaitListActivity, 25), 2131897301);
                        r3.A05(AnonymousClass1YL.A00(newsletterWaitListActivity.A00.getContext(), 2130971311, 2131102579));
                        r3.A07(new C21425Ajs((Object) newsletterWaitListActivity, 6));
                        r3.A03();
                        newsletterWaitListActivity.A01 = r3;
                    }
                } else {
                    str = "newsletterLogging";
                }
            } else if (AnonymousClass112.A09() && !newsletterWaitListActivity.A0A.A2a("android.permission.POST_NOTIFICATIONS")) {
                C19830z4 r2 = newsletterWaitListActivity.A0A;
                C18070vi.A0W(r2);
                String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
                AnonymousClass74O.A0H(r2, strArr);
                C110885hR.A0B(newsletterWaitListActivity, strArr, 0);
            } else if (AnonymousClass112.A03()) {
                AnonymousClass4aU.A06(newsletterWaitListActivity);
            } else {
                AnonymousClass4aU.A05(newsletterWaitListActivity);
            }
            C18070vi.A11(str);
            throw null;
        }
        super.A28();
    }

    public void A28() {
        AnonymousClass5YB r4;
        super.A28();
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof AnonymousClass5YB) && (r4 = (AnonymousClass5YB) A1B) != null) {
            NewsletterWaitListActivity newsletterWaitListActivity = (NewsletterWaitListActivity) r4;
            AnonymousClass00H r0 = newsletterWaitListActivity.A02;
            if (r0 != null) {
                boolean A1W = C17880vN.A1W(C72453Mb.A0M(newsletterWaitListActivity), "newsletter_wait_list_subscription");
                C81323z3 r1 = new C81323z3();
                r1.A01 = C17880vN.A0j();
                r1.A00 = Boolean.valueOf(A1W);
                ((AnonymousClass74D) r0.get()).A05.CC7(r1);
                newsletterWaitListActivity.finish();
                return;
            }
            C18070vi.A11("newsletterLogging");
            throw null;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        A29();
    }
}
