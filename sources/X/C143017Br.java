package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

/* renamed from: X.7Br  reason: invalid class name and case insensitive filesystem */
public final class C143017Br implements C1604588o, LineBackgroundSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final TextEmojiLabel A03;
    public final String A04;
    public final ArrayList A05 = AnonymousClass000.A13();
    public final boolean A06;
    public final AnonymousClass86P A07;

    public C143017Br(AnonymousClass86P r2, TextEmojiLabel textEmojiLabel, String str, int i, int i2, int i3, boolean z) {
        C18070vi.A0d(str, 2);
        this.A03 = textEmojiLabel;
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A06 = z;
        this.A07 = r2;
    }

    public void Bos() {
        AnonymousClass86P r1 = this.A07;
        if (r1 != null) {
            r1.Bwf(this.A04);
        }
    }

    public void BxU() {
        AnonymousClass86P r0 = this.A07;
        if (r0 != null) {
            String str = this.A04;
            C142927Bi r02 = (C142927Bi) r0;
            AnonymousClass11C r1 = r02.A01;
            AnonymousClass73K.A02(r02.A00, r1, str);
            AnonymousClass4a5.A03(r1);
        }
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        float f;
        float measureText;
        float f2;
        C18070vi.A0h(canvas, paint);
        CharSequence charSequence2 = charSequence;
        C18070vi.A0d(charSequence2, 7);
        TextEmojiLabel textEmojiLabel = this.A03;
        Layout layout = textEmojiLabel.getLayout();
        int i10 = this.A01;
        int lineForOffset = layout.getLineForOffset(i10);
        int i11 = this.A00;
        int lineForOffset2 = layout.getLineForOffset(i11);
        int i12 = i8;
        if (lineForOffset <= i12 && i12 <= lineForOffset2) {
            if (i12 == lineForOffset) {
                i9 = (int) layout.getPrimaryHorizontal(i10);
                if (i12 == lineForOffset2) {
                    f2 = layout.getPrimaryHorizontal(i11);
                } else {
                    f = (float) i9;
                    measureText = paint.measureText(charSequence2, i10, i7);
                    f2 = f + measureText;
                }
            } else {
                i10 = i6;
                i9 = (int) layout.getPrimaryHorizontal(i10);
                f = (float) i9;
                if (i12 >= lineForOffset2) {
                    measureText = paint.measureText(charSequence2, i10, i11);
                    f2 = f + measureText;
                }
                measureText = paint.measureText(charSequence2, i10, i7);
                f2 = f + measureText;
            }
            int i13 = (int) f2;
            int A012 = AnonymousClass3MW.A01(textEmojiLabel.getResources(), 2131168873) / 3;
            RectF rectF = new RectF((float) (i9 - A012), (float) i3, (float) (i13 + A012), (float) i5);
            Rect A072 = AnonymousClass3MW.A07();
            textEmojiLabel.getGlobalVisibleRect(A072);
            int i14 = A072.left;
            int i15 = this.A02;
            int i16 = A072.top;
            this.A05.add(new RectF((float) (((i14 + i9) - A012) + i15), (float) (i16 + i3 + i15), (float) (i14 + i13 + A012 + i15), (float) (i16 + i5 + i15)));
            int color = paint.getColor();
            paint.setColor(AnonymousClass3Ma.A01(textEmojiLabel.getContext(), AnonymousClass000.A0Y(textEmojiLabel), 2130972020, 2131103424));
            float f3 = (float) i15;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            paint.setColor(color);
        }
    }
}
