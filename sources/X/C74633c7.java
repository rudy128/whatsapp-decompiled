package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.comments.ui.CommentTextView;

/* renamed from: X.3c7  reason: invalid class name and case insensitive filesystem */
public final class C74633c7 extends C74653c9 {
    public final /* synthetic */ CommentTextView A00;
    public final /* synthetic */ AnonymousClass206 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74633c7(Context context, CommentTextView commentTextView, AnonymousClass206 r5) {
        super(context, AnonymousClass1YL.A00(context, 2130971977, 2131103150));
        this.A00 = commentTextView;
        this.A01 = r5;
        C72453Mb.A1S(context);
    }

    public void onClick(View view) {
        CommentTextView commentTextView = this.A00;
        commentTextView.A00 = 0;
        commentTextView.A0T(commentTextView.A04, this.A01, commentTextView.A09);
    }
}
