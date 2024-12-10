package X;

import com.whatsapp.status.notifications.StatusReminderReceiver;

/* renamed from: X.3Hr  reason: invalid class name and case insensitive filesystem */
public final class C71613Hr extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass205 $messageKey;
    public final /* synthetic */ StatusReminderReceiver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71613Hr(AnonymousClass205 r2, StatusReminderReceiver statusReminderReceiver) {
        super(0);
        this.$messageKey = r2;
        this.this$0 = statusReminderReceiver;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass205 r1 = this.$messageKey;
        if (r1 == null) {
            return null;
        }
        AnonymousClass00H r0 = this.this$0.A0C;
        if (r0 != null) {
            return AnonymousClass1W2.A01(r1, r0);
        }
        C18070vi.A11("fMessageDatabase");
        throw null;
    }
}
