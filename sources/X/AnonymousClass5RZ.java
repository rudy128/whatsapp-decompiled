package X;

import com.whatsapp.event.ChatInfoEventsCard;
import java.util.List;

/* renamed from: X.5RZ  reason: invalid class name */
public final class AnonymousClass5RZ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass3PS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5RZ(AnonymousClass3PS r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        ChatInfoEventsCard chatInfoEventsCard = this.this$0.A05;
        C18070vi.A0b(list);
        chatInfoEventsCard.setUpcomingEvents(list);
        this.this$0.A05.setInfoText(list.size());
        return C27621Wu.A00;
    }
}
