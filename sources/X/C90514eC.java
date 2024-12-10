package X;

import android.view.ViewTreeObserver;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.4eC  reason: invalid class name and case insensitive filesystem */
public final class C90514eC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C73103Oz A01;
    public final /* synthetic */ ConversationListView A02;
    public final /* synthetic */ AnonymousClass4SQ A03;
    public final /* synthetic */ C28931bI A04;

    public C90514eC(C73103Oz r1, ConversationListView conversationListView, AnonymousClass4SQ r3, C28931bI r4, int i) {
        this.A02 = conversationListView;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = r4;
    }

    public void onGlobalLayout() {
        ConversationListView conversationListView = this.A02;
        AnonymousClass3MY.A1D(conversationListView, this);
        C73103Oz r2 = this.A01;
        AnonymousClass4SQ r4 = this.A03;
        AnonymousClass205 r1 = r4.A06.A0v;
        C18070vi.A0W(r1);
        r2.A0V.add(r1);
        conversationListView.A05();
        ConversationListView.A00(conversationListView, this.A04, this.A00, r4.A03, r4.A09);
    }
}
