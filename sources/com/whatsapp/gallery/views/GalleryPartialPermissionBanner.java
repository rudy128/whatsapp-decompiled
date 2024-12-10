package com.whatsapp.gallery.views;

import X.AnonymousClass1Y1;
import X.AnonymousClass1YF;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3PK;
import X.C18070vi;
import X.C18090vk;
import X.C72703Ne;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.WaTextView;

public final class GalleryPartialPermissionBanner extends AnonymousClass3PK {
    public C18090vk A00;
    public WaTextView A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final C18090vk getManageActionCallback() {
        return this.A00;
    }

    public final void setManageActionCallback(C18090vk r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        Object systemService = context.getSystemService("layout_inflater");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(2131625416, this, true);
        this.A01 = AnonymousClass3Ma.A0N(inflate, 2131428060);
        String A0F = C18070vi.A0F(context, 2131893529);
        String A10 = AnonymousClass3Ma.A10(context, A0F, new Object[1], 0, 2131893528);
        int A0F2 = AnonymousClass1YF.A0F(A10, A0F, 0, false);
        C72703Ne r3 = new C72703Ne(inflate, this, 2);
        SpannableString spannableString = new SpannableString(A10);
        spannableString.setSpan(r3, A0F2, A0F.length() + A0F2, 33);
        WaTextView waTextView = this.A01;
        waTextView.setText(spannableString);
        waTextView.setContentDescription(spannableString.toString());
        waTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public /* synthetic */ GalleryPartialPermissionBanner(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GalleryPartialPermissionBanner(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
