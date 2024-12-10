package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.comments.CommentListManager$loadMoreMessages$1;
import com.whatsapp.conversation.CommentsBottomSheet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3XZ  reason: invalid class name */
public final class AnonymousClass3XZ extends C39711tW {
    public final /* synthetic */ LinearLayoutManager A00;
    public final /* synthetic */ CommentsBottomSheet A01;

    public void A03(RecyclerView recyclerView, int i) {
        C37981qV r0;
        C18070vi.A0d(recyclerView, 0);
        if (i == 0) {
            r0 = this.A01.A0T;
        } else if (i == 1 || i == 2) {
            r0 = null;
        } else {
            return;
        }
        recyclerView.setItemAnimator(r0);
    }

    public AnonymousClass3XZ(LinearLayoutManager linearLayoutManager, CommentsBottomSheet commentsBottomSheet) {
        this.A01 = commentsBottomSheet;
        this.A00 = linearLayoutManager;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int A1P = this.A00.A1P();
        CommentsBottomSheet commentsBottomSheet = this.A01;
        AnonymousClass3WO r0 = commentsBottomSheet.A06;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
        } else if (r0.A0Q() - A1P < 100) {
            AnonymousClass3VA r3 = (AnonymousClass3VA) commentsBottomSheet.A0W.getValue();
            AnonymousClass4ZK r02 = r3.A00;
            if (r02 != null) {
                if (r02.A05.get() != AnonymousClass4D4.COMPLETE) {
                    AnonymousClass4ZK r4 = r3.A00;
                    if (r4 != null) {
                        AtomicReference atomicReference = r4.A05;
                        Object obj = atomicReference.get();
                        AnonymousClass4D4 r03 = AnonymousClass4D4.LOADING;
                        if (obj != r03) {
                            atomicReference.set(r03);
                            AnonymousClass3MW.A1X(r4.A06, new CommentListManager$loadMoreMessages$1(r4, (C30391dr) null), r4.A07);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            C18070vi.A11("commentListManager");
        } else {
            return;
        }
        throw null;
    }
}
