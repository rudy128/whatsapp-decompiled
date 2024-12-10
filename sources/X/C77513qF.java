package X;

import com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity;

/* renamed from: X.3qF  reason: invalid class name and case insensitive filesystem */
public final class C77513qF extends C180599Ne {
    public final /* synthetic */ RegisterAsCompanionEnterNumberActivity A00;
    public final /* synthetic */ C28931bI A01;

    public C77513qF(RegisterAsCompanionEnterNumberActivity registerAsCompanionEnterNumberActivity, C28931bI r2) {
        this.A00 = registerAsCompanionEnterNumberActivity;
        this.A01 = r2;
    }

    public void A00(String str, String str2) {
        if (str == null || AnonymousClass1YF.A0T(str)) {
            C188129gv r0 = this.A00.A04;
            if (r0 != null) {
                r0.A04.setText((CharSequence) null);
                this.A01.A04(8);
                return;
            }
        } else if (str2 == null || AnonymousClass1YF.A0T(str2)) {
            C188129gv r02 = this.A00.A04;
            if (r02 != null) {
                r02.A04.setText((CharSequence) null);
                this.A01.A04(0);
                return;
            }
        } else {
            this.A01.A04(8);
            RegisterAsCompanionEnterNumberActivity registerAsCompanionEnterNumberActivity = this.A00;
            AnonymousClass1K3 r1 = registerAsCompanionEnterNumberActivity.A06;
            if (r1 != null) {
                String A03 = r1.A03(registerAsCompanionEnterNumberActivity.A00, str2);
                C188129gv r03 = registerAsCompanionEnterNumberActivity.A04;
                if (r03 != null) {
                    r03.A04.setText(A03);
                    C188129gv r04 = registerAsCompanionEnterNumberActivity.A04;
                    if (r04 != null) {
                        r04.A06 = str2;
                        return;
                    }
                }
            } else {
                C18070vi.A11("countryUtils");
                throw null;
            }
        }
        C18070vi.A11("phoneNumberEntryViewHolder");
        throw null;
    }
}
