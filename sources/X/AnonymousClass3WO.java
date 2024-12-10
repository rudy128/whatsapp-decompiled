package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.comments.ui.TextCommentLayout;

/* renamed from: X.3WO  reason: invalid class name */
public final class AnonymousClass3WO extends C41251w3 implements C40391ud {
    public RecyclerView A00;
    public final AnonymousClass00H A01;
    public final C37451pZ A02;
    public final AnonymousClass4RR A03;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1uf, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3WO(C37451pZ r3, AnonymousClass4RR r4, AnonymousClass00H r5) {
        super((C40411uf) new Object());
        C18070vi.A0d(r4, 2);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
        A0K(true);
        CDq(new AnonymousClass28K(this, 5));
    }

    public void A0S(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A00 = recyclerView;
    }

    public void A0T(RecyclerView recyclerView) {
        this.A00 = null;
    }

    public boolean Be5() {
        return true;
    }

    public boolean Bex(int i) {
        if (i == -1 || getItemViewType(i) != 6) {
            return false;
        }
        return true;
    }

    public void Bmc(C42011xT r6, int i) {
        C18070vi.A0d(r6, 0);
        if (r6 instanceof AnonymousClass3YU) {
            Object A0U = A0U(i);
            C18070vi.A0z(A0U, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.CommentItem");
            AnonymousClass206 r4 = ((C78093s9) A0U).A00;
            C37451pZ r3 = this.A02;
            AnonymousClass4RR r2 = this.A03;
            C18070vi.A0j(r3, r2);
            View view = r6.A0H;
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.conversation.comments.ui.TextCommentLayout");
            ((TextCommentLayout) view).A01(r3, r2, r4);
        } else if (r6 instanceof AnonymousClass3YT) {
            Object A0U2 = A0U(i);
            C18070vi.A0z(A0U2, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.RevokedCommentItem");
            AnonymousClass206 r32 = ((C78113sB) A0U2).A00;
            C37451pZ r22 = this.A02;
            C18070vi.A0d(r22, 1);
            View view2 = r6.A0H;
            C18070vi.A0z(view2, "null cannot be cast to non-null type com.whatsapp.conversation.comments.ui.RevokedCommentLayout");
            ((AnonymousClass3QC) view2).A00(r22, r32);
        } else if (r6 instanceof AnonymousClass3YS) {
            Object A0U3 = A0U(i);
            C18070vi.A0z(A0U3, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.DecryptionFailureItem");
            AnonymousClass206 r33 = ((C78103sA) A0U3).A00;
            C37451pZ r23 = this.A02;
            C18070vi.A0d(r23, 1);
            View view3 = r6.A0H;
            C18070vi.A0z(view3, "null cannot be cast to non-null type com.whatsapp.conversation.comments.ui.DecryptionFailureCommentLayout");
            ((AnonymousClass3QB) view3).A00(r23, r33);
        } else if (r6 instanceof AnonymousClass3YR) {
            Object A0U4 = A0U(i);
            C18070vi.A0z(A0U4, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.CommentDateDividerItem");
            AnonymousClass206 r1 = ((C78083s8) A0U4).A00;
            View view4 = r6.A0H;
            C18070vi.A0z(view4, "null cannot be cast to non-null type com.whatsapp.conversation.comments.ui.CommentDateDividerView");
            AnonymousClass3Pa r42 = (AnonymousClass3Pa) view4;
            WaTextView waTextView = r42.A06;
            r42.getTime();
            waTextView.setText(C64052u8.A0B(r42.getWhatsAppLocale(), r1.A0I));
            C43421zm.A04(waTextView);
            waTextView.setTextSize(r42.getConversationFont().A03(r42.getResources()));
            C72473Md.A14(waTextView, r42.getBubbleResolver());
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        View view;
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass3YU(AnonymousClass3MY.A05(viewGroup));
        }
        if (i == 2) {
            return new AnonymousClass3YT(AnonymousClass3MY.A05(viewGroup));
        }
        if (i == 3) {
            return new AnonymousClass3YS(AnonymousClass3MY.A05(viewGroup));
        }
        if (i == 4) {
            View A09 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624567);
            C72473Md.A14(A09.findViewById(2131436091), this.A01);
            view = A09;
        } else if (i == 5) {
            View A092 = AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131624566);
            A092.setLayoutParams(new ViewGroup.LayoutParams(-1, Resources.getSystem().getDisplayMetrics().heightPixels / 3));
            view = A092;
        } else {
            view = viewGroup;
            if (i == 6) {
                return new AnonymousClass3YR(AnonymousClass3MY.A05(viewGroup));
            }
        }
        return new C42011xT(view);
    }

    public boolean CM0() {
        return true;
    }

    public int BSO(int i) {
        int size = this.A00.A02.size();
        while (i < size) {
            if (Bex(i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public long A0M(int i) {
        long intValue;
        AnonymousClass206 r0;
        AnonymousClass4LF r1 = (AnonymousClass4LF) A0U(i);
        if (r1 instanceof C78093s9) {
            r0 = ((C78093s9) r1).A00;
        } else if (r1 instanceof C78113sB) {
            r0 = ((C78113sB) r1).A00;
        } else if (r1 instanceof C78103sA) {
            r0 = ((C78103sA) r1).A00;
        } else {
            if ((r1 instanceof C78073s6) || (r1 instanceof AnonymousClass3s7)) {
                intValue = (long) r1.A00.intValue();
            } else if (!(r1 instanceof C78083s8)) {
                return -1;
            } else {
                intValue = ((C78083s8) r1).A00.A0I;
            }
            return -intValue;
        }
        return r0.A0x;
    }

    public int getItemViewType(int i) {
        Integer num;
        AnonymousClass4LF r0 = (AnonymousClass4LF) A0U(i);
        if (r0 != null) {
            num = r0.A00;
        } else {
            num = AnonymousClass00R.A00;
        }
        return num.intValue();
    }
}
