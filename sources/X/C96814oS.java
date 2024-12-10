package X;

import android.view.View;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.playback.MessageReplyActivity;
import java.util.HashMap;

/* renamed from: X.4oS  reason: invalid class name and case insensitive filesystem */
public class C96814oS implements AnonymousClass5a8 {
    public final int A00;
    public final Object A01;

    public C96814oS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bo6(boolean z) {
        String str;
        switch (this.A00) {
            case 0:
                EditMessageActivity editMessageActivity = (EditMessageActivity) this.A01;
                if (!z) {
                    AnonymousClass3U2 r2 = editMessageActivity.A0A;
                    if (r2 == null) {
                        str = "editMessageViewModel";
                    } else {
                        MentionableEntry mentionableEntry = editMessageActivity.A0G;
                        if (mentionableEntry == null) {
                            str = "entry";
                        } else {
                            r2.A00 = mentionableEntry.getStringText();
                            r2.A01 = mentionableEntry.getMentions();
                        }
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                EditMessageActivity.A0Q(editMessageActivity);
                return;
            case 1:
                AnonymousClass4aY.A1D((AnonymousClass4aY) this.A01);
                return;
            default:
                View view = (View) this.A01;
                HashMap hashMap = MessageReplyActivity.A1v;
                int i = 2131231608;
                if (z) {
                    i = 2131231609;
                }
                view.setBackgroundResource(i);
                return;
        }
    }
}
