package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import java.util.Map;

/* renamed from: X.48G  reason: invalid class name */
public final class AnonymousClass48G extends C72843Ns {
    public final Context A00;
    public final C107725aU A01;
    public final String A02;
    public final Map A03;

    public void updateDrawState(TextPaint textPaint) {
        C18070vi.A0d(textPaint, 0);
        super.updateDrawState(textPaint);
        int A002 = C19740yt.A00(this.A00, 2131103455);
        textPaint.setColor(A002);
        int i = 0;
        if (this.A01) {
            i = AnonymousClass1Z2.A06(A002, 72);
        }
        textPaint.bgColor = i;
        textPaint.setTypeface(C43421zm.A00());
    }

    public void onClick(View view) {
        this.A01.Bwe(this.A02, this.A03);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass48G(Context context, C107725aU r2, String str, String str2, Map map) {
        super(context, str);
        C18070vi.A0j(context, str);
        this.A00 = context;
        this.A02 = str2;
        this.A03 = map;
        this.A01 = r2;
    }
}
