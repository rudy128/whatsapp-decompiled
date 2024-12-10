package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* renamed from: X.65m  reason: invalid class name and case insensitive filesystem */
public class C1188465m extends AnonymousClass65K {
    public Long A00;
    public Drawable A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C151367mB(this));

    public void A08(Canvas canvas) {
        Rect A002;
        Drawable drawable = this.A01;
        if (drawable != null) {
            int intrinsicHeight = drawable.getIntrinsicHeight() / 4;
            Drawable bottomOverlayBackground = getBottomOverlayBackground();
            if (bottomOverlayBackground != null) {
                bottomOverlayBackground.setBounds(0, getHeight() - (drawable.getIntrinsicHeight() * 2), getWidth(), getHeight());
                bottomOverlayBackground.draw(canvas);
            }
            C110785h5.A02(drawable, this, intrinsicHeight);
            drawable.draw(canvas);
            Long l = this.A00;
            if (l != null) {
                String A0D = C64052u8.A0D(getWhatsAppLocale(), (String) null, C17880vN.A04(l.longValue()));
                C18070vi.A0X(A0D);
                Paint captionPaint = getCaptionPaint();
                C18070vi.A0d(captionPaint, 1);
                int length = A0D.length();
                Map A012 = C110785h5.A01(this, captionPaint);
                Integer valueOf = Integer.valueOf(length);
                if (A012.containsKey(valueOf)) {
                    Object obj = A012.get(valueOf);
                    if (obj != null) {
                        A002 = (Rect) obj;
                    } else {
                        throw C17880vN.A0g();
                    }
                } else {
                    A002 = C110785h5.A00(captionPaint, valueOf, A012, length, 0);
                }
                getWidth();
                int i = intrinsicHeight * 2;
                canvas.drawText(A0D, ((float) drawable.getIntrinsicWidth()) + ((float) i), C108945cZ.A04(this) - ((((float) (drawable.getIntrinsicHeight() + i)) - ((((float) (A002.bottom - A002.top)) * 0.5f) * 2.0f)) / 2.0f), getCaptionPaint());
            }
        }
    }

    private final Drawable getBottomOverlayBackground() {
        return (Drawable) this.A02.getValue();
    }

    public void setDuration(Long l) {
        if (!C18070vi.A18(this.A00, l)) {
            this.A00 = l;
            invalidate();
        }
    }

    public C1188465m(Context context) {
        super(context);
        A06();
    }

    public Long getDuration() {
        return this.A00;
    }

    public void setMediaItem(AnonymousClass8B2 r4) {
        Context context;
        int i;
        super.setMediaItem(r4);
        Drawable drawable = null;
        if (r4 != null) {
            int type = r4.getType();
            if (Integer.valueOf(type) != null) {
                if (type == 1) {
                    context = getContext();
                    i = 2131232596;
                } else if (type == 2) {
                    context = getContext();
                    i = 2131232594;
                } else if (type == 6) {
                    context = getContext();
                    i = 2131232595;
                }
                drawable = C24261Jm.A00(context, i);
            }
        }
        this.A01 = drawable;
    }
}
