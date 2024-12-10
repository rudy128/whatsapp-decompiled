package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.conversation.comments.ui.CommentContactPictureView;
import com.whatsapp.conversation.comments.ui.CommentDateView;
import com.whatsapp.conversation.comments.ui.CommentHeaderView;
import com.whatsapp.conversation.comments.ui.RevokedCommentTextView;

/* renamed from: X.3QC  reason: invalid class name */
public final class AnonymousClass3QC extends LinearLayout {
    public LinearLayout A00 = ((LinearLayout) AnonymousClass3MX.A0C(this, 2131434696));
    public CommentContactPictureView A01 = ((CommentContactPictureView) AnonymousClass3MX.A0C(this, 2131434698));
    public CommentDateView A02 = ((CommentDateView) AnonymousClass3MX.A0C(this, 2131429203));
    public CommentHeaderView A03 = ((CommentHeaderView) AnonymousClass3MX.A0C(this, 2131434697));
    public RevokedCommentTextView A04 = ((RevokedCommentTextView) AnonymousClass3MX.A0C(this, 2131434699));
    public final C18100vl A05;

    public AnonymousClass3QC(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A05 = AnonymousClass1DF.A01(new AnonymousClass5GL(context));
        View.inflate(context, 2131626748, this);
    }

    private final void setupClickListener(AnonymousClass206 r3) {
        C90284dp.A00(this.A00, this, r3, 6);
    }

    public final void A00(C37451pZ r4, AnonymousClass206 r5) {
        this.A01.A07(r4, r5);
        this.A04.A0T(r5);
        this.A03.A02(r5);
        CommentDateView commentDateView = this.A02;
        C72473Md.A15(commentDateView, commentDateView.getTime(), commentDateView.getWhatsAppLocale(), r5);
        setupClickListener(r5);
    }

    public final AnonymousClass1FU getActivity() {
        return (AnonymousClass1FU) this.A05.getValue();
    }
}
