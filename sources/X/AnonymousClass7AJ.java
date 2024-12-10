package X;

import android.view.View;
import com.whatsapp.conversation.conversationrow.ReactionsBubbleLayout;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import java.lang.ref.Reference;

/* renamed from: X.7AJ  reason: invalid class name */
public class AnonymousClass7AJ implements C22851Dl {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass7AJ(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj4;
        this.A04 = obj2;
    }

    public final void Bo9(Object obj) {
        AnonymousClass8BG r0;
        AnonymousClass8BG r1;
        switch (this.A00) {
            case 0:
                Object obj2 = this.A01;
                Object obj3 = this.A03;
                Object obj4 = this.A04;
                C135816so r10 = (C135816so) obj;
                ReactionsBubbleLayout reactionsBubbleLayout = (ReactionsBubbleLayout) ((Reference) this.A02).get();
                if (reactionsBubbleLayout != null) {
                    if (r10 == null) {
                        r0 = null;
                    } else {
                        r0 = r10.A00;
                    }
                    reactionsBubbleLayout.A02(r0, true, false);
                    if (r10 == null || (r1 = r10.A00) == null || r1.isEmpty() || r1.BXt() < 1) {
                        reactionsBubbleLayout.setVisibility(8);
                        return;
                    }
                    reactionsBubbleLayout.setVisibility(0);
                    AnonymousClass78K.A00(reactionsBubbleLayout, obj3, 49);
                    reactionsBubbleLayout.setOnLongClickListener(new C1421178f(obj4, r10, obj2, 1));
                    return;
                }
                return;
            case 1:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A01;
                View view = (View) this.A02;
                PhotoView photoView = (PhotoView) this.A03;
                Object obj5 = this.A04;
                C135816so r102 = (C135816so) obj;
                if (r102 == null) {
                    view.setVisibility(8);
                    view.setOnClickListener((View.OnClickListener) null);
                    return;
                }
                if (r102.A03) {
                    if (photoView != null) {
                        photoView.setIsLongpressEnabled(true);
                        photoView.A0L = new C144927Jf(r102, mediaViewFragment, photoView);
                    }
                    if (r102.A02 == null) {
                        view.setVisibility(0);
                        AnonymousClass3Ma.A1F(view, mediaViewFragment, r102, obj5, 13);
                        return;
                    }
                } else {
                    view.setOnLongClickListener((View.OnLongClickListener) null);
                }
                view.setVisibility(8);
                return;
            default:
                C36341nj r6 = (C36341nj) this.A01;
                C53602cn r5 = (C53602cn) this.A02;
                AnonymousClass1FU r4 = (AnonymousClass1FU) this.A03;
                Object obj6 = this.A04;
                r4.A3k(new C64202uO(r4, r5, r6), 0, 2131891797);
                AnonymousClass3MX.A0x(r6.A0G).CGF(new C21435Ak2(r6, r5, obj6, 4));
                return;
        }
    }
}
