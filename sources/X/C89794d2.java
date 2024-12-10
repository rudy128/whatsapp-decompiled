package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4d2  reason: invalid class name and case insensitive filesystem */
public class C89794d2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C89794d2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = obj6;
    }

    public final void onClick(View view) {
        if (this.A00 != 0) {
            ((AnonymousClass10I) this.A01).CGF(new C70733Ch(this.A05, this.A06, 41));
            AnonymousClass4W2.A01((Activity) this.A02, (View) this.A03, 2131891559);
            ((Dialog) this.A04).dismiss();
            return;
        }
        AnonymousClass4ZE.A00((Context) this.A02, (Drawable) this.A04, (TextEmojiLabel) this.A03, (AnonymousClass5XK) this.A06, (C61762qD) this.A05);
    }
}
