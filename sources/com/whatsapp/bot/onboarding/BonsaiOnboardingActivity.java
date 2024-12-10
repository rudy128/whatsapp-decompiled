package com.whatsapp.bot.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1UD;
import X.AnonymousClass73Z;
import X.C006602x;
import X.C1416576l;
import X.C17880vN;
import X.C18070vi;
import X.C25811Ps;
import X.C451527l;
import X.C75813ln;
import X.C75833lp;
import X.C90994ey;
import X.C93074iO;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

public final class BonsaiOnboardingActivity extends AnonymousClass1FY {
    public C25811Ps A00;
    public AnonymousClass73Z A01;
    public AnonymousClass1UD A02;
    public AnonymousClass1LU A03;
    public boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r0.A0F() != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        r2.putExtra("target_flow", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r0.A0B() == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.bot.onboarding.BonsaiOnboardingActivity r7, X.AnonymousClass1E7 r8, int r9) {
        /*
            X.1BI r4 = r8.A0J
            r3 = r7
            X.1LU r0 = r7.A03
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r5 = X.AnonymousClass00R.A03
            java.lang.String r6 = X.C17890vO.A0Q()
            r7 = 34
            r8 = 7
            android.content.Intent r2 = X.AnonymousClass1LU.A0h(r3, r4, r5, r6, r7, r8)
            r1 = 1
            X.1UD r0 = r3.A02
            if (r9 != r1) goto L_0x0025
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x002d
        L_0x0021:
            r3.startActivity(r2)
            return
        L_0x0025:
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0021
        L_0x002d:
            java.lang.String r0 = "target_flow"
            r2.putExtra(r0, r9)
            goto L_0x0021
        L_0x0034:
            java.lang.String r0 = "botGating"
            goto L_0x003a
        L_0x0037:
            java.lang.String r0 = "waIntents"
        L_0x003a:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.onboarding.BonsaiOnboardingActivity.A03(com.whatsapp.bot.onboarding.BonsaiOnboardingActivity, X.1E7, int):void");
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 r3 = (AnonymousClass1K1) ((C006602x) generatedComponent());
            AnonymousClass10E A0J = AnonymousClass1FB.A0J(r3, this);
            AnonymousClass1FB.A0M(A0J, this);
            AnonymousClass10G r1 = A0J.A00;
            AnonymousClass1FB.A0K(A0J, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0J, r1, this, r1.A5A);
            this.A01 = (AnonymousClass73Z) r3.A0E.get();
            this.A00 = (C25811Ps) A0J.A12.get();
            this.A02 = (AnonymousClass1UD) A0J.A14.get();
            this.A03 = (AnonymousClass1LU) A0J.ABd.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 101 && i != 102) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            AnonymousClass73Z r0 = this.A01;
            if (r0 != null) {
                r0.A04(intent);
            } else {
                C18070vi.A11("bonsaiOnboardingActivityController");
                throw null;
            }
        }
        finish();
    }

    public BonsaiOnboardingActivity(int i) {
        this.A04 = false;
        A2L(new C90994ey(this, 19));
    }

    public void onCreate(Bundle bundle) {
        Integer valueOf;
        String str;
        AnonymousClass73Z r2;
        C1416576l r1;
        int i;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("bonsaiOnboardingEntryPoint", -1);
        if (intExtra == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(intExtra);
        }
        int intExtra2 = getIntent().getIntExtra("metaAiOnboardingTargetKey", 0);
        if (isTaskRoot()) {
            finish();
            ArrayList A13 = AnonymousClass000.A13();
            A13.add(AnonymousClass1LU.A02(this));
            Intent A0A = C17880vN.A0A();
            if (valueOf != null) {
                A0A.putExtra("bonsaiOnboardingEntryPoint", valueOf.intValue());
            }
            A0A.putExtra("metaAiOnboardingTargetKey", intExtra2);
            A0A.setClassName(getPackageName(), "com.whatsapp.bot.onboarding.BonsaiOnboardingActivity");
            A13.add(A0A);
            if (!A13.isEmpty()) {
                Intent[] intentArr = (Intent[]) A13.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                startActivities(intentArr, (Bundle) null);
                return;
            }
            throw AnonymousClass000.A0n("No intents added to TaskStackBuilder; cannot startActivities");
        }
        if (intExtra2 == 1) {
            r2 = this.A01;
            if (r2 != null) {
                r2.A00 = new C93074iO(this, 0);
                r1 = new C75833lp(true);
                i = 101;
                AnonymousClass73Z.A01(r1, r2, valueOf, i, false);
            }
            str = "bonsaiOnboardingActivityController";
            C18070vi.A11(str);
            throw null;
        } else if (intExtra2 != 2) {
            C25811Ps r0 = this.A00;
            if (r0 != null) {
                r0.A08(this, valueOf, 0);
            } else {
                str = "bonsaiUiUtil";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            r2 = this.A01;
            if (r2 != null) {
                r2.A00 = new C93074iO(this, 0);
                r1 = new C75813ln(true);
                i = 102;
                AnonymousClass73Z.A01(r1, r2, valueOf, i, false);
            }
            str = "bonsaiOnboardingActivityController";
            C18070vi.A11(str);
            throw null;
        }
        this.A03.A00.A03.A0q(new C451527l(this, 1), false);
    }

    public BonsaiOnboardingActivity() {
        this(0);
    }
}
