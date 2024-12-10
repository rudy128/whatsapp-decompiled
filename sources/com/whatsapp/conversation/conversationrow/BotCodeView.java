package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.BEA;
import X.C18070vi;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;

public final class BotCodeView extends WaTextView {
    public int A00;
    public int A01 = ((int) AnonymousClass000.A0Y(this).getDimension(2131168489));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0j(context, attributeSet);
        BEA.A17(this);
        AnonymousClass000.A0Y(this).getDimension(2131168488);
        this.A00 = (int) AnonymousClass000.A0Y(this).getDimension(2131168486);
    }

    public static final void A0F(BotCodeView botCodeView, int i, int i2) {
        botCodeView.getLayoutParams().height = i;
        TextPaint paint = botCodeView.getPaint();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        paint.setShader(new LinearGradient(0.0f, (float) (i - i2), 0.0f, (float) i, new int[]{botCodeView.getCurrentTextColor(), 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotCodeView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        BEA.A17(this);
        AnonymousClass000.A0Y(this).getDimension(2131168488);
        this.A00 = (int) AnonymousClass000.A0Y(this).getDimension(2131168486);
    }
}
