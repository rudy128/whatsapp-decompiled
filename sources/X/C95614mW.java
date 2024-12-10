package X;

import android.content.Intent;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureActivity;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureViewModel;

/* renamed from: X.4mW  reason: invalid class name and case insensitive filesystem */
public final class C95614mW implements C108045b2 {
    public final /* synthetic */ ConsumerDisclosureActivity A00;

    public C95614mW(ConsumerDisclosureActivity consumerDisclosureActivity) {
        this.A00 = consumerDisclosureActivity;
    }

    public void Bkq() {
        ConsumerDisclosureActivity consumerDisclosureActivity = this.A00;
        ((C192769ox) ((ConsumerDisclosureViewModel) consumerDisclosureActivity.A04.getValue()).A00.get()).A00((AnonymousClass1BI) null, (Boolean) null);
        AnonymousClass00H r0 = consumerDisclosureActivity.A02;
        if (r0 != null) {
            AnonymousClass4QI r5 = (AnonymousClass4QI) r0.get();
            r5.A00.CC7(r5.A00(AnonymousClass00R.A01, AnonymousClass00R.A00, AnonymousClass00R.A0N, 1));
            AnonymousClass00H r02 = consumerDisclosureActivity.A01;
            if (r02 != null) {
                AnonymousClass3MW.A0b(r02).A04(consumerDisclosureActivity.A00);
                Intent intent = (Intent) consumerDisclosureActivity.getIntent().getParcelableExtra("extra_next_intent");
                if (intent != null) {
                    consumerDisclosureActivity.startActivity(intent);
                }
                consumerDisclosureActivity.finish();
                return;
            }
            C18070vi.A11("ctwaCustomerLoggingController");
            throw null;
        }
        C18070vi.A11("dataSharingCtwaDisclosureLogger");
        throw null;
    }

    public void Bnl() {
        String str;
        ConsumerDisclosureActivity consumerDisclosureActivity = this.A00;
        AnonymousClass00H r0 = consumerDisclosureActivity.A02;
        if (r0 != null) {
            AnonymousClass4QI r5 = (AnonymousClass4QI) r0.get();
            r5.A00.CC7(r5.A00(AnonymousClass00R.A01, AnonymousClass00R.A00, AnonymousClass00R.A0N, 2));
            AnonymousClass00H r02 = consumerDisclosureActivity.A01;
            if (r02 != null) {
                AnonymousClass3MW.A0b(r02).A05(consumerDisclosureActivity.A00);
                consumerDisclosureActivity.finishAndRemoveTask();
                return;
            }
            str = "ctwaCustomerLoggingController";
        } else {
            str = "dataSharingCtwaDisclosureLogger";
        }
        C18070vi.A11(str);
        throw null;
    }
}
