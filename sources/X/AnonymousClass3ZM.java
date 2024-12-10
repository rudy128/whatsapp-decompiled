package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3ZM  reason: invalid class name */
public final class AnonymousClass3ZM extends C42011xT {
    public ImageView A00;
    public TextEmojiLabel A01;
    public TextEmojiLabel A02;
    public C42141xh A03;
    public final View A04;

    public AnonymousClass3ZM(View view, C72043Kk r6) {
        super(view);
        this.A04 = view;
        View findViewById = view.findViewById(2131427946);
        ImageView imageView = (ImageView) findViewById;
        imageView.setImportantForAccessibility(2);
        C18070vi.A0X(findViewById);
        this.A00 = imageView;
        this.A01 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131434233);
        this.A02 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131435610);
        this.A03 = C42141xh.A01(view, r6, 2131432903);
        view.setFocusable(true);
        view.setClickable(true);
        view.setBackgroundResource(2131232942);
    }
}
