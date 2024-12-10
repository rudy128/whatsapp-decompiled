package com.whatsapp.status.playback.widget;

import X.AnonymousClass1HF;
import X.C108965cb;
import X.C17890vO;
import X.C18070vi;
import X.C24261Jm;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;

public final class VoiceStatusProfileAvatarView extends FrameLayout {
    public WaImageView A00;
    public WaImageView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A00(context);
    }

    public final WaImageView getProfileAvatarImageView() {
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            return waImageView;
        }
        C18070vi.A11("profileAvatarImageView");
        throw null;
    }

    private final void A00(Context context) {
        View.inflate(context, 2131627475, this);
        this.A01 = C108965cb.A0I(this, 2131434129);
        this.A00 = C108965cb.A0I(this, 2131432753);
    }

    public final void setMicrophoneStrokeColor(int i) {
        Drawable A002 = C24261Jm.A00(getContext(), 2131232648);
        if (A002 != null) {
            Drawable mutate = A002.mutate();
            C18070vi.A0X(mutate);
            WaImageView waImageView = this.A00;
            if (waImageView != null) {
                waImageView.setBackground(mutate);
                WaImageView waImageView2 = this.A00;
                if (waImageView2 != null) {
                    AnonymousClass1HF.A0L(ColorStateList.valueOf(i), waImageView2);
                    return;
                }
            }
            C18070vi.A11("micOverlayImageView");
            throw null;
        }
        throw C17890vO.A0K();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusProfileAvatarView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A00(context);
    }
}
