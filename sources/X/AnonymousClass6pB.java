package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.6pB  reason: invalid class name */
public final class AnonymousClass6pB {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass00H A02;

    public void A00(Context context, C72083Ko r18, C122646Re r19, Integer num, String str, String str2) {
        String str3;
        int i = 2131429729;
        Integer num2 = num;
        if (num2 == AnonymousClass00R.A0N) {
            i = 2131429726;
        }
        List A0M = C18070vi.A0M(new C126966da(i, r18));
        AnonymousClass721 r4 = (AnonymousClass721) this.A02.get();
        AnonymousClass01E r5 = (AnonymousClass01E) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        if (num2.intValue() != 2) {
            str3 = "wa_crosspost_status_privacy_settings";
        } else {
            str3 = "wa_crosspost_new_status";
        }
        String rawString = AnonymousClass11S.A01(this.A01).getRawString();
        AnonymousClass7C0 r6 = new AnonymousClass7C0(this, 0);
        C18070vi.A0f(r5, 0, rawString);
        C135566sP r8 = new C135566sP(0, false, true);
        C131806lh r7 = new C131806lh();
        String valueOf = String.valueOf(r19.databaseValue);
        C18070vi.A0d(valueOf, 1);
        r7.A00.put("target_account_type", valueOf);
        r4.A02(r5, r6, r7, r8, "com.bloks.www.fxcal.waffle.router.async", str3, str, str2, rawString, A0M, 444800256);
    }

    public void A01(Context context, Integer num, Integer num2, String str) {
        String str2;
        AnonymousClass721 r2 = (AnonymousClass721) this.A02.get();
        AnonymousClass01E r3 = (AnonymousClass01E) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        int intValue = num.intValue();
        if (intValue == 1) {
            str2 = "wa_status_privacy";
        } else if (intValue != 2) {
            str2 = "wa_crosspost_error_unlinked";
        } else {
            str2 = "wa_auto_crosspost_notice";
        }
        r2.A03(r3, new AnonymousClass7C0(this, 1), num2, str2, str, AnonymousClass11S.A01(this.A01).getRawString());
    }

    public AnonymousClass6pB(AnonymousClass1KB r1, AnonymousClass11S r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
