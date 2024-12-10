package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class B3U extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C20528AOn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B3U(C20528AOn aOn) {
        super(2);
        this.this$0 = aOn;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        String str = (String) obj2;
        C18070vi.A0h(imageView, str);
        C183109Wy r3 = this.this$0.A03;
        Drawable A02 = AnonymousClass4aX.A02(imageView.getContext(), 2131231781, 2131101222);
        C18070vi.A0X(A02);
        r3.A00.A01((Drawable) null, A02, imageView, str);
        return C27621Wu.A00;
    }
}
