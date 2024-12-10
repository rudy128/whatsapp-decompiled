package X;

import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: X.Atb  reason: case insensitive filesystem */
public final class C21849Atb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C20440ALd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21849Atb(C20440ALd aLd) {
        super(0);
        this.this$0 = aLd;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C20440ALd aLd = this.this$0;
        ViewGroup viewGroup = aLd.A01;
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        C18070vi.A0X(A0D);
        View inflate = A0D.inflate(2131627294, viewGroup, false);
        View A0C = AnonymousClass3MX.A0C(inflate, 2131436650);
        C40751vD r1 = aLd.A02;
        C18070vi.A0h(r1, aLd.A03);
        Uri A03 = r1.A03();
        C18070vi.A0X(A03);
        inflate.setOnClickListener(new C90084dV((Object) aLd, (Object) inflate, (Object) A03, 7));
        AFU.A00(A0C, aLd, 33);
        String A10 = AnonymousClass3Ma.A10(inflate.getContext(), A03.toString(), AnonymousClass3MW.A1a(), 0, 2131886954);
        aLd.A05.A03(inflate.getContext(), A10);
        SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(A10));
        C18070vi.A0X(valueOf);
        ((TextView) AnonymousClass3MX.A0C(inflate, 2131436651)).setText(valueOf, TextView.BufferType.SPANNABLE);
        return inflate;
    }
}
