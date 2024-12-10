package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1HF;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5M9;
import X.AnonymousClass5PR;
import X.AnonymousClass6VM;
import X.C010105w;
import X.C101135Bl;
import X.C101145Bm;
import X.C113845nr;
import X.C123496Ur;
import X.C17880vN;
import X.C18100vl;
import X.C25791Pq;
import X.C25932Cow;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C41561wd;
import X.C74423Zx;
import X.C75193e9;
import X.C91314fU;
import X.C99274sY;
import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;

public final class ImagineMeOnboardingActivity extends C75193e9 {
    public C010105w A00;
    public final C18100vl A01 = C99274sY.A00(new C101145Bm(this), new C101135Bl(this), new AnonymousClass5M9(this), AnonymousClass3MW.A15(ImagineMeOnboardingViewModel.class));

    public void onCreate(Bundle bundle) {
        Integer num;
        AnonymousClass00H r0;
        C25791Pq r02;
        super.onCreate(bundle);
        setContentView(2131624057);
        if (getIntent().hasExtra("extra_action_source")) {
            num = Integer.valueOf(getIntent().getIntExtra("extra_action_source", 0));
        } else {
            num = null;
        }
        Intent A0A = C17880vN.A0A();
        if (getIntent().hasExtra("passthrough_bundle")) {
            A0A.putExtra("passthrough_bundle", getIntent().getBundleExtra("passthrough_bundle"));
        }
        setResult(-1, A0A);
        if (num != null) {
            ImagineMeOnboardingViewModel imagineMeOnboardingViewModel = (ImagineMeOnboardingViewModel) this.A01.getValue();
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 2) {
                    r0 = imagineMeOnboardingViewModel.A0H;
                } else if (intValue == 3) {
                    r0 = imagineMeOnboardingViewModel.A0G;
                } else if (intValue != 4) {
                    r02 = null;
                } else {
                    r0 = imagineMeOnboardingViewModel.A0F;
                }
                r02 = (C25791Pq) r0.get();
            } else {
                r0 = imagineMeOnboardingViewModel.A0E;
                r02 = (C25791Pq) r0.get();
            }
            imagineMeOnboardingViewModel.A01 = r02;
        }
        getWindow().setNavigationBarColor(0);
        getWindow().setStatusBarColor(0);
        AnonymousClass6VM.A00(getWindow(), false);
        C123496Ur r03 = new C25932Cow(AnonymousClass3MZ.A0F(this), getWindow()).A00;
        r03.A03(true);
        r03.A04(true);
        AnonymousClass1HF.A0g(findViewById(2131434744), new C91314fU(2));
        ViewPager2 viewPager2 = (ViewPager2) findViewById(2131431568);
        viewPager2.setAdapter(new C74423Zx(this, this));
        viewPager2.setUserInputEnabled(false);
        viewPager2.A04(new C113845nr(this, 1));
        C37581pm A0H = AnonymousClass3MZ.A0H(this);
        ImagineMeOnboardingActivity$onCreate$2 imagineMeOnboardingActivity$onCreate$2 = new ImagineMeOnboardingActivity$onCreate$2(viewPager2, this, (C30391dr) null);
        AnonymousClass1OR r7 = AnonymousClass1OR.A00;
        Integer A0w = AnonymousClass3MW.A0w(r7, imagineMeOnboardingActivity$onCreate$2, A0H);
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l((String) AnonymousClass3Ma.A0y(AnonymousClass00R.A01, new AnonymousClass5PR(this, "extra_chat_jid")));
        ImagineMeOnboardingViewModel imagineMeOnboardingViewModel2 = (ImagineMeOnboardingViewModel) this.A01.getValue();
        imagineMeOnboardingViewModel2.A02 = A0l;
        C25791Pq r2 = imagineMeOnboardingViewModel2.A01;
        if (r2 != null) {
            AnonymousClass3MY.A1P(A0l, r2, 15, false);
        }
        C30451dy.A02(A0w, r7, new ImagineMeOnboardingViewModel$onOnboardingCreated$1(imagineMeOnboardingViewModel2, (C30391dr) null), C41561wd.A00(imagineMeOnboardingViewModel2));
    }

    public void onDestroy() {
        super.onDestroy();
        C010105w r0 = this.A00;
        if (r0 != null) {
            r0.dismiss();
        }
        this.A00 = null;
    }
}
