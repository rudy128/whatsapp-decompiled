package X;

import android.widget.AbsListView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.1tV  reason: invalid class name and case insensitive filesystem */
public class C39701tV implements AbsListView.OnScrollListener {
    public final /* synthetic */ ConversationsFragment A00;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 == 0) goto L_0x0021
            if (r5 != r0) goto L_0x0017
            com.whatsapp.conversationslist.ConversationsFragment r1 = r3.A00
            X.1FL r0 = r1.A1B()
            if (r0 == 0) goto L_0x0017
            X.1oL r2 = r1.A2M
            r1 = 2
            android.view.Window r0 = r0.getWindow()
            r2.A03(r0, r1)
        L_0x0017:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r3.A00
            X.4eK r0 = r0.A2S
            if (r0 == 0) goto L_0x0020
            r0.A01()
        L_0x0020:
            return
        L_0x0021:
            com.whatsapp.conversationslist.ConversationsFragment r1 = r3.A00
            X.1FL r0 = r1.A1B()
            if (r0 == 0) goto L_0x002e
            X.1oL r0 = r1.A2M
            r0.A01()
        L_0x002e:
            boolean r0 = com.whatsapp.conversationslist.ConversationsFragment.A11(r1)
            if (r0 == 0) goto L_0x0020
            com.whatsapp.conversationslist.ConversationsFragment.A0I(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39701tV.onScrollStateChanged(android.widget.AbsListView, int):void");
    }

    public C39701tV(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }
}
