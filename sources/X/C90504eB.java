package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.4eB  reason: invalid class name and case insensitive filesystem */
public class C90504eB implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C90504eB(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = obj2;
    }

    public final void onGlobalLayout() {
        View view;
        if (this.A00 != 0) {
            ConversationListView conversationListView = (ConversationListView) this.A04;
            conversationListView.getImeUtils();
            if (AnonymousClass1L4.A00((View) this.A01)) {
                AnonymousClass3MY.A1D(conversationListView, this);
                conversationListView.A07();
                C108645c3 r0 = (C108645c3) this.A03;
                if (r0 != null && r0.BT1() && (view = (View) this.A02) != null) {
                    view.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        C76783oH r6 = (C76783oH) this.A01;
        Adapter adapter = (Adapter) this.A02;
        View view2 = (View) this.A03;
        View view3 = (View) this.A04;
        if (r6.A0J.isLayoutRequested()) {
            return;
        }
        if (r6.getHeight() >= r6.getWidth() && !r6.A0Z) {
            int A002 = AnonymousClass3MX.A00(r6.getResources(), 2131165756, Math.max(r6.getMeasuredHeight() - ((((r6.A0F.getMeasuredHeight() - r6.getMeasuredWidth()) + (adapter.getCount() * r6.getResources().getDimensionPixelSize(2131168743))) + view2.getMeasuredHeight()) + r6.A08(r6.A0E.getMeasuredWidth())), 0));
            if (view3.getPaddingBottom() != A002) {
                view3.setPadding(0, 0, 0, A002);
            }
        } else if (view3.getPaddingBottom() != 0) {
            view3.setPadding(0, 0, 0, 0);
        }
    }
}
