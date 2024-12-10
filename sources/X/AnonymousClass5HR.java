package X;

import com.whatsapp.event.EventsActivity;

/* renamed from: X.5HR  reason: invalid class name */
public final class AnonymousClass5HR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ EventsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5HR(EventsActivity eventsActivity) {
        super(0);
        this.this$0 = eventsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        EventsActivity eventsActivity = this.this$0;
        C84334Jc r2 = eventsActivity.A01;
        if (r2 != null) {
            Object value = eventsActivity.A0B.getValue();
            C18070vi.A0d(value, 1);
            return C91774gE.A00(eventsActivity, r2, value, 11).A00(C73333Ur.class);
        }
        C18070vi.A11("eventsViewModelFactory");
        throw null;
    }
}
