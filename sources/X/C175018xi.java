package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.8xi  reason: invalid class name and case insensitive filesystem */
public final class C175018xi extends C174898xW {
    public TextEmojiLabel A00;
    public final C18000vb A01;

    public void A0D(C174098wE r4) {
        C18070vi.A0d(r4, 0);
        super.A0D(r4);
        this.A00.setText(AnonymousClass1X0.A06(this.A01.A0N(), String.valueOf(A05() + 1)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175018xi(View view, C18000vb r3, C18030ve r4, C183269Xp r5) {
        super(view, r4, r5);
        C18070vi.A0o(r4, r5, r3);
        this.A01 = r3;
        this.A00 = C72453Mb.A0c(view, 2131428563);
    }
}
