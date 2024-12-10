package X;

import com.whatsapp.util.Log;

/* renamed from: X.7DA  reason: invalid class name */
public final class AnonymousClass7DA implements C1604988s {
    public final /* synthetic */ C1603388b A00;
    public final /* synthetic */ C138616xO A01;
    public final /* synthetic */ String A02;

    public AnonymousClass7DA(C1603388b r1, C138616xO r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void Bti() {
        Log.i("WabaiConsentManager/accept/error");
        this.A00.C3p(false);
    }

    public void onSuccess() {
        C18100vl r0;
        Log.i("WabaiConsentManager/accept/success");
        String str = this.A02;
        if (C18070vi.A18(str, "biz_bot")) {
            r0 = this.A01.A04;
        } else {
            if (C18070vi.A18(str, "meta_ai_biz")) {
                r0 = this.A01.A05;
            }
            this.A00.C3p(true);
        }
        ((AnonymousClass1H7) r0.getValue()).A04("yes", true);
        this.A00.C3p(true);
    }
}
