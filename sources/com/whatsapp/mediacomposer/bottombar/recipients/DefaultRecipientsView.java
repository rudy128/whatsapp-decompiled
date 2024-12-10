package com.whatsapp.mediacomposer.bottombar.recipients;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass72B;
import X.AnonymousClass7J2;
import X.AnonymousClass85D;
import X.B8E;
import X.C000200d;
import X.C130596jh;
import X.C177659Ab;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C24261Jm;
import X.C27641Ww;
import X.C27691Xc;
import X.C38471rL;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.List;

public final class DefaultRecipientsView extends LinearLayout implements AnonymousClass009 {
    public int A00;
    public C18000vb A01;
    public B8E A02;
    public AnonymousClass85D A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C130596jh A08;
    public final HorizontalScrollView A09;
    public final ChipGroup A0A;
    public final TextEmojiLabel A0B;
    public final C38471rL A0C;

    public final void setRecipientsChips(List list, CharSequence charSequence) {
        C18070vi.A0d(list, 0);
        ChipGroup chipGroup = this.A0A;
        if (chipGroup != null) {
            chipGroup.removeAllViews();
            if (charSequence != null) {
                Chip A002 = A00(charSequence);
                A002.setChipIcon(C24261Jm.A00(getContext(), 2131232324));
                A002.setChipIconSizeResource(2131167696);
                A002.setIconStartPaddingResource(2131167697);
                A002.setTextStartPaddingResource(2131167698);
                A002.setTag("status_chip");
                A002.setOnClickListener(this.A0C);
                chipGroup.addView(A002);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                Chip A003 = A00(charSequence);
                A003.setText(A0v);
                A003.setOnClickListener(this.A0C);
                chipGroup.addView(A003);
            }
            if (this.A07) {
                C27641Ww.A0A(this.A09, getWhatsAppLocale());
            }
        }
    }

    public final void setRecipientsListener$app_product_mediacomposer_mediacomposer(B8E b8e) {
        C18070vi.A0d(b8e, 0);
        this.A02 = b8e;
        ChipGroup chipGroup = this.A0A;
        if (chipGroup != null) {
            int childCount = chipGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                chipGroup.getChildAt(i).setOnClickListener(this.A0C);
            }
        }
    }

    public final void setRecipientsTooltipControllerFactory(AnonymousClass85D r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass85D getRecipientsTooltipControllerFactory() {
        AnonymousClass85D r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("recipientsTooltipControllerFactory");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public DefaultRecipientsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            C27691Xc.A10((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    private final Chip A00(CharSequence charSequence) {
        View A092 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(this), (ViewGroup) null, 2131624536);
        C18070vi.A0z(A092, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        Chip chip = (Chip) A092;
        chip.setChipCornerRadiusResource(2131168781);
        chip.setText(charSequence);
        C72463Mc.A0w(getContext(), getContext(), chip, 2130968699, 2131099786);
        chip.setChipBackgroundColorResource(this.A00);
        chip.setMinHeight(getResources().getDimensionPixelSize(2131167695));
        chip.setEnabled(this.A05);
        return chip;
    }

    public final void setRecipientsContentDescription(int i) {
        String A0W = C72483Me.A0W(getResources(), i, 2131755365);
        C18070vi.A0X(A0W);
        this.A09.setContentDescription(A0W);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultRecipientsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        C18070vi.A0d(context, 1);
        if (!this.A06) {
            this.A06 = true;
            C27691Xc.A10((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A0C = new C177659Ab(this, 7);
        View.inflate(getContext(), 2131625973, this);
        AnonymousClass10E r1 = ((AnonymousClass7J2) getRecipientsTooltipControllerFactory()).A00.A00;
        this.A08 = new C130596jh(context2, AnonymousClass10E.A6Q(r1), (AnonymousClass72B) r1.A34.get(), C000200d.A00(r1.AC7), C000200d.A00(r1.A00.A1H), C000200d.A00(r1.ABv));
        this.A0B = C72453Mb.A0c(this, 2131434405);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C18070vi.A05(this, 2131434403);
        this.A09 = horizontalScrollView;
        this.A0A = (ChipGroup) AnonymousClass1HF.A06(this, 2131434394);
        AnonymousClass1Y5.A02(horizontalScrollView, 2131898930);
        this.A05 = true;
        this.A07 = true;
        this.A00 = AnonymousClass1YL.A00(getContext(), 2130968698, 2131099785);
    }
}
