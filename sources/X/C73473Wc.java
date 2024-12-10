package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Wc  reason: invalid class name and case insensitive filesystem */
public final class C73473Wc extends C38391rD {
    public final Context A00;
    public final C86654Sm A01;
    public final List A02;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new AnonymousClass3ZH(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625802, false));
    }

    public int A0Q() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        AnonymousClass3ZH r72 = (AnonymousClass3ZH) r7;
        C18070vi.A0d(r72, 0);
        List list = this.A02;
        Bitmap bitmap = ((C87214Us) list.get(i)).A00;
        ImageView imageView = r72.A00;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        Context context = this.A00;
        imageView.setColorFilter(C19740yt.A00(context, 2131102653), PorterDuff.Mode.SRC_IN);
        TextView textView = r72.A01;
        int i2 = ((C87214Us) list.get(i)).A01;
        String str = ((C87214Us) list.get(i)).A03;
        C25970Cpd cpd = C25970Cpd.A03;
        cpd.A01(textView, i2, str);
        AnonymousClass3MX.A1C(context, textView, 2131102653);
        int i3 = ((C87214Us) list.get(i)).A02;
        TextView textView2 = r72.A02;
        if (textView2 != null) {
            cpd.A01(textView2, i3, ((C87214Us) list.get(i)).A04);
            AnonymousClass3MX.A1C(context, textView2, 2131102654);
        }
    }

    public C73473Wc(Context context, C86654Sm r2, List list) {
        this.A00 = context;
        this.A02 = list;
        this.A01 = r2;
    }
}
