package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.style.ImageSpan;

/* renamed from: X.3No  reason: invalid class name and case insensitive filesystem */
public final class C72803No extends ImageSpan {
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72803No(Context context, Bitmap bitmap, String str) {
        super(context, bitmap);
        C18070vi.A0k(bitmap, str);
        this.A00 = str;
    }
}
