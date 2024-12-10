package X;

import android.graphics.Bitmap;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.5nE  reason: invalid class name and case insensitive filesystem */
public class C113525nE extends C42011xT {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextEmojiLabel A03;

    public final void A0B(Bitmap bitmap, View.OnClickListener onClickListener, String str, String str2, String str3, String str4, int i) {
        C18070vi.A0d(bitmap, 3);
        this.A01.setText(str);
        TextView textView = this.A02;
        textView.setText(str2);
        if (i != 0) {
            AnonymousClass3MX.A1C(textView.getContext(), textView, i);
        }
        int i2 = 0;
        this.A03.A0S(str3, (List) null, 0, false);
        if (str2 == null) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.A00.setImageBitmap(bitmap);
        if (onClickListener != null) {
            this.A0H.setOnClickListener(onClickListener);
        }
        TypedValue typedValue = new TypedValue();
        View view = this.A0H;
        AnonymousClass3Ma.A06(view).resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setContentDescription(str4);
    }

    public C113525nE(View view) {
        super(view);
        this.A01 = AnonymousClass3Ma.A0E(view, 2131434351);
        this.A03 = C72453Mb.A0c(view, 2131434348);
        this.A02 = AnonymousClass3Ma.A0E(view, 2131434352);
        this.A00 = AnonymousClass3Ma.A0C(view, 2131434343);
    }
}
