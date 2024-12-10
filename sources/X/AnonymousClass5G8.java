package X;

import android.app.DatePickerDialog;
import com.whatsapp.conversation.ConversationSearchFragment;
import java.util.Calendar;

/* renamed from: X.5G8  reason: invalid class name */
public final class AnonymousClass5G8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ConversationSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5G8(ConversationSearchFragment conversationSearchFragment) {
        super(0);
        this.this$0 = conversationSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        AnonymousClass8Dv r4 = new AnonymousClass8Dv((DatePickerDialog.OnDateSetListener) null, this.this$0.A14(), Calendar.getInstance(), 0, -1, -1, -1);
        ConversationSearchFragment conversationSearchFragment = this.this$0;
        r4.A01.setMaxDate(timeInMillis);
        r4.A00 = conversationSearchFragment.A00;
        return r4;
    }
}
