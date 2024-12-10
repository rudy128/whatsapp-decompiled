package X;

import android.content.Intent;

/* renamed from: X.6pl  reason: invalid class name and case insensitive filesystem */
public final class C133946pl {
    public final AnonymousClass1MW A00;
    public final AnonymousClass18K A01;
    public final C25241Nl A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass10I A05;

    public final void A00(Intent intent) {
        C18070vi.A0d(intent, 0);
        String stringExtra = intent.getStringExtra("inorganic_notification_id");
        String stringExtra2 = intent.getStringExtra("inorganic_notification_type");
        long A06 = C108975cc.A06(intent, "inorganic_notification_thread_count");
        String stringExtra3 = intent.getStringExtra("inorganic_notification_promotion_id");
        if (stringExtra != null && stringExtra2 != null) {
            A01(C108965cb.A0Q(intent, AnonymousClass1BI.A00, "inorganic_notification_chat_jid"), Long.valueOf(A06), stringExtra, stringExtra2, stringExtra3, 3);
        }
    }

    public final void A01(AnonymousClass1BI r3, Long l, String str, String str2, String str3, int i) {
        this.A05.CGF(new AnonymousClass7R7(this, r3, l, str, str2, str3, i));
    }

    public C133946pl(AnonymousClass1MW r2, AnonymousClass18K r3, C25241Nl r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r6, r3, r4, r2);
        C18070vi.A0d(r7, 6);
        this.A05 = r5;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = r7;
    }
}
