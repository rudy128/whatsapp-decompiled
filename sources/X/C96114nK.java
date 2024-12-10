package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.4nK  reason: invalid class name and case insensitive filesystem */
public class C96114nK implements C1606889n {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass891 A01;
    public final /* synthetic */ AnonymousClass47X A02;
    public final /* synthetic */ String A03;

    public void BCw() {
    }

    public /* synthetic */ void Bti() {
    }

    public C96114nK(Context context, AnonymousClass891 r2, AnonymousClass47X r3, String str) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = str;
    }

    public void C7F(Bitmap bitmap, boolean z) {
        AnonymousClass47X r2 = this.A02;
        List list = C42011xT.A0I;
        AnonymousClass3Qg r3 = r2.A05;
        if (r3.getTag() == this.A01 && bitmap != AnonymousClass6YZ.A00) {
            r2.A01 = true;
            r3.A00(new BitmapDrawable(this.A00.getResources(), bitmap), (Drawable) null, this.A03);
        }
    }
}
