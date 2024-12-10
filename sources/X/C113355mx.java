package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.FacepileView;

/* renamed from: X.5mx  reason: invalid class name and case insensitive filesystem */
public class C113355mx extends C42011xT {
    public FacepileView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final /* synthetic */ AnonymousClass6BZ A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113355mx(View view, AnonymousClass6BZ r3) {
        super(view);
        this.A04 = r3;
        this.A01 = AnonymousClass3Ma.A0E(view, 2131434351);
        this.A03 = C72453Mb.A0c(view, 2131434348);
        this.A02 = AnonymousClass3Ma.A0E(view, 2131434352);
        FacepileView facepileView = (FacepileView) view.findViewById(2131430775);
        this.A00 = facepileView;
        C72453Mb.A1C(facepileView);
    }
}
