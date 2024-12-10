package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.style.LineBackgroundSpan;
import com.whatsapp.WaEditText;
import java.util.List;

/* renamed from: X.77l  reason: invalid class name and case insensitive filesystem */
public final class C1419177l implements LineBackgroundSpan {
    public float A00;
    public int A01;
    public List A02;
    public final Context A03;
    public final Paint A04;
    public final WaEditText A05;

    public C1419177l(Context context, WaEditText waEditText, float f, int i) {
        this.A03 = context;
        this.A05 = waEditText;
        this.A01 = i;
        this.A00 = f;
        Paint A06 = AnonymousClass3MW.A06();
        A06.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A04 = A06;
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C18070vi.A0h(canvas, paint);
        int color = paint.getColor();
        Paint paint2 = this.A04;
        paint2.setColor(this.A01);
        paint2.setAlpha((int) (this.A00 * 255.0f));
        WaEditText waEditText = this.A05;
        paint2.setPathEffect(new CornerPathEffect(waEditText.getTextSize() / 2.0f));
        Context context = this.A03;
        this.A02 = C26167Cth.A00(context, waEditText.getLayout(), waEditText.getTextSize() / 2.0f, 1.0f);
        Typeface typeface = waEditText.getTypeface();
        Typeface typeface2 = AnonymousClass69c.A0M;
        if (typeface2 == null) {
            typeface2 = Typeface.createFromAsset(context.getAssets(), "fonts/FacebookScriptWA-Regular.otf");
            AnonymousClass69c.A0M = typeface2;
        }
        if (C18070vi.A18(typeface, typeface2)) {
            this.A02 = C26167Cth.A01(context, waEditText.getLayout(), waEditText.getTextSize() / 2.0f, 1.0f);
        }
        List list = this.A02;
        if (list != null) {
            int size = list.size();
            int i9 = 0;
            while (i9 < size) {
                List list2 = this.A02;
                if (list2 != null) {
                    canvas.drawPath((Path) list2.get(i9), paint2);
                    i9++;
                }
            }
            paint.setColor(color);
            return;
        }
        C18070vi.A11("paths");
        throw null;
    }
}
