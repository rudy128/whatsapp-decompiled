package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6Cp  reason: invalid class name and case insensitive filesystem */
public final class C120156Cp extends C145267Kp {
    public final C18000vb A00;
    public final C62282r9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120156Cp(C18000vb r1, AnonymousClass1KW r2, C62282r9 r3) {
        super(r2);
        C18070vi.A0o(r2, r1, r3);
        this.A00 = r1;
        this.A01 = r3;
    }

    public void CFC(C135396s8 r7, AnonymousClass206 r8) {
        boolean A15 = C18070vi.A15(r8, r7);
        TextEmojiLabel textEmojiLabel = r7.A02;
        Context context = textEmojiLabel.getContext();
        textEmojiLabel.setText(this.A01.A01(r8));
        Drawable A02 = AnonymousClass4aX.A02(context, 2131233361, 2131103152);
        C18070vi.A0X(A02);
        int A012 = C62762rw.A01(context, 16.0f);
        A02.setBounds(A15 ? 1 : 0, A15, A012, A012);
        if (AnonymousClass3MW.A1Z(this.A00)) {
            textEmojiLabel.setCompoundDrawables((Drawable) null, (Drawable) null, A02, (Drawable) null);
        } else {
            textEmojiLabel.setCompoundDrawables(A02, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textEmojiLabel.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(2131168779));
    }
}
