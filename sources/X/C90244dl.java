package X;

import android.view.View;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.4dl  reason: invalid class name and case insensitive filesystem */
public class C90244dl implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C90244dl(int i, String str, Object obj) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final boolean onLongClick(View view) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((ConversationAttachmentContentView) obj).A0D.A0I(this.A02, true);
            return true;
        }
        C92874i3 r0 = (C92874i3) obj;
        C29551cT.A02(r0.A0V, r0.A0q, this.A02);
        return true;
    }
}
