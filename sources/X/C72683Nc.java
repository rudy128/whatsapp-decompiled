package X;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.3Nc  reason: invalid class name and case insensitive filesystem */
public final class C72683Nc extends ClickableSpan {
    public final Intent A00;

    public C72683Nc(Intent intent) {
        this.A00 = intent;
    }

    public void onClick(View view) {
        StringBuilder A0K = C18070vi.A0K(view);
        A0K.append("activity-intent-span/go intent=");
        Intent intent = this.A00;
        C17900vP.A0b(intent, A0K);
        AnonymousClass3MY.A11(intent, view);
    }
}
