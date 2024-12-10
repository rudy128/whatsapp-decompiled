package X;

import android.graphics.Paint;
import android.view.View;
import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageView;
import com.whatsapp.expressionstray.expression.emoji.view.EmojiImageViewLoader;

/* renamed from: X.5zu  reason: invalid class name and case insensitive filesystem */
public final class C117505zu extends C112815m5 {
    public final EmojiImageView A00;
    public final EmojiImageViewLoader A01;
    public final AnonymousClass1OS A02;
    public final AnonymousClass1OS A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117505zu(Paint paint, View view, EmojiImageViewLoader emojiImageViewLoader, AnonymousClass1OS r6, AnonymousClass1OS r7) {
        super(view);
        C18070vi.A0w(view, paint, emojiImageViewLoader, r6, r7);
        this.A01 = emojiImageViewLoader;
        this.A03 = r6;
        this.A02 = r7;
        View findViewById = view.findViewById(2131430307);
        EmojiImageView emojiImageView = (EmojiImageView) findViewById;
        emojiImageView.A01 = paint;
        C18070vi.A0X(findViewById);
        this.A00 = emojiImageView;
    }
}
