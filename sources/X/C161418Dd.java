package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.8Dd  reason: invalid class name and case insensitive filesystem */
public final class C161418Dd extends LinearLayout implements AnonymousClass009 {
    public C180569Nb A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final ImageView A03;
    public final TextView A04;
    public final C454028v A05;
    public final C454028v A06;
    public final C454028v A07;
    public final Runnable A08;
    public final C454028v A09;

    public C161418Dd(Context context, int i) {
        super(context, (AttributeSet) null, 0, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        setOrientation(1);
        LayoutInflater layoutInflater = (LayoutInflater) AnonymousClass11C.A02(context, "layout_inflater");
        if (layoutInflater != null) {
            layoutInflater.inflate(2131625327, this, true);
            this.A04 = C17880vN.A0E(this, 2131430873);
            ImageView A0H = AnonymousClass3MW.A0H(this, 2131430872);
            this.A03 = A0H;
            C454028v A032 = C454028v.A03(contextThemeWrapper, 2131233166);
            if (A032 != null) {
                this.A06 = A032;
                A0H.setImageDrawable(A032);
                A032.start();
                C454028v A033 = C454028v.A03(contextThemeWrapper, 2131233168);
                if (A033 != null) {
                    this.A07 = A033;
                    C454028v A034 = C454028v.A03(contextThemeWrapper, 2131233167);
                    if (A034 != null) {
                        this.A09 = A034;
                        C454028v A035 = C454028v.A03(contextThemeWrapper, 2131233163);
                        if (A035 != null) {
                            this.A05 = A035;
                            this.A08 = new C70613Bu(this, 46);
                            return;
                        }
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                    throw AnonymousClass000.A0n("Required value was null.");
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public final void A01(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        setError(charSequence.toString());
        ImageView imageView = this.A03;
        imageView.removeCallbacks(this.A08);
        Drawable drawable = imageView.getDrawable();
        C454028v r1 = this.A09;
        if (!C18070vi.A18(drawable, r1)) {
            imageView.setImageDrawable(r1);
            r1.start();
            r1.A08(new C162138Jc(this, 0));
        }
    }

    public final void A02(String str) {
        C18070vi.A0d(str, 0);
        setError(str);
        ImageView imageView = this.A03;
        Drawable drawable = imageView.getDrawable();
        C454028v r1 = this.A09;
        if (!C18070vi.A18(drawable, r1)) {
            imageView.setImageDrawable(r1);
            r1.start();
        }
        Runnable runnable = this.A08;
        imageView.removeCallbacks(runnable);
        imageView.postDelayed(runnable, 1000);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public static final void A00(C454028v r4, C161418Dd r5) {
        String A0F = C18070vi.A0F(r5.getContext(), 2131890413);
        int A002 = AnonymousClass1YL.A00(r5.getContext(), 2130971197, 2131102532);
        if (r5.getContext() != null) {
            TextView textView = r5.A04;
            textView.setText(A0F);
            AnonymousClass3MX.A1C(r5.getContext(), textView, A002);
            textView.announceForAccessibility(A0F);
        }
        r5.A03.setImageDrawable(r4);
        r4.start();
    }

    private final void setError(String str) {
        int A002 = AnonymousClass1YL.A00(getContext(), 2130971197, 2131102532);
        if (getContext() != null) {
            TextView textView = this.A04;
            textView.setText(str);
            AnonymousClass3MX.A1C(getContext(), textView, A002);
            textView.announceForAccessibility(str);
        }
    }

    public final void setListener(C180569Nb r1) {
        this.A00 = r1;
    }
}
