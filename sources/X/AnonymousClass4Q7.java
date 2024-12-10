package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.4Q7  reason: invalid class name */
public class AnonymousClass4Q7 {
    public final /* synthetic */ InteractiveMessageView A00;
    public final /* synthetic */ AnonymousClass206 A01;

    public AnonymousClass4Q7(InteractiveMessageView interactiveMessageView, AnonymousClass206 r2) {
        this.A00 = interactiveMessageView;
        this.A01 = r2;
    }

    public void A00(String str, int i, boolean z, boolean z2) {
        InteractiveMessageView interactiveMessageView = this.A00;
        interactiveMessageView.A06.setVisibility(C72453Mb.A07(z ? 1 : 0));
        if (TextUtils.isEmpty(str)) {
            interactiveMessageView.A06.setText(i);
        } else {
            WaTextView waTextView = interactiveMessageView.A06;
            Context context = interactiveMessageView.getContext();
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = str;
            AnonymousClass3MY.A0y(context, waTextView, A1a, i);
        }
        interactiveMessageView.A06.setSingleLine(z2);
    }
}
