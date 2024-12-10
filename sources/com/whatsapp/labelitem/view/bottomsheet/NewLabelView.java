package com.whatsapp.labelitem.view.bottomsheet;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass11C;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1NA;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3O1;
import X.AnonymousClass48A;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C18090vk;
import X.C19880zA;
import X.C89564cf;
import X.C90964ev;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class NewLabelView extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public C19880zA A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public AnonymousClass1NA A04;
    public AnonymousClass1L2 A05;
    public AnonymousClass1KW A06;
    public C18030ve A07;
    public C18010vc A08;
    public AnonymousClass00H A09;
    public AnonymousClass031 A0A;
    public boolean A0B;
    public final WaEditText A0C;
    public final WaImageView A0D;
    public final WaImageView A0E;
    public final WaImageView A0F;
    public final AnonymousClass48A A0G;
    public final C89564cf A0H;
    public final WaTextView A0I;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setCoreLabelStore(AnonymousClass1NA r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setEmojiRichFormatterStaticCaller(AnonymousClass1L2 r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setListsUtil(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A09 = r2;
    }

    public final void setOnCancelListener(C18090vk r3) {
        C18070vi.A0d(r3, 0);
        AnonymousClass3MZ.A1O(this.A0D, this, r3, 5);
    }

    public final void setOnConfirmListener(AnonymousClass1OS r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass3MZ.A1O(this.A0E, this, r4, 4);
        this.A0C.setOnEditorActionListener(new C90964ev(r4, this, 2));
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setSmbLabelsManagerOptional(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0A;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1NA getCoreLabelStore() {
        AnonymousClass1NA r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("coreLabelStore");
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass1L2 getEmojiRichFormatterStaticCaller() {
        AnonymousClass1L2 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiRichFormatterStaticCaller");
        throw null;
    }

    public final AnonymousClass00H getListsUtil() {
        AnonymousClass00H r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("listsUtil");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public final C19880zA getSmbLabelsManagerOptional() {
        C19880zA r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("smbLabelsManagerOptional");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass3O1 r1;
        int i;
        Parcelable parcelable2;
        if (parcelable instanceof AnonymousClass3O1) {
            r1 = (AnonymousClass3O1) parcelable;
            if (!(r1 == null || (parcelable2 = r1.A01) == null)) {
                parcelable = parcelable2;
            }
        } else {
            r1 = null;
        }
        super.onRestoreInstanceState(parcelable);
        if (r1 != null) {
            i = r1.A00;
        } else {
            i = 0;
        }
        this.A00 = i;
    }

    public static final void setOnCancelListener$lambda$2(NewLabelView newLabelView, C18090vk r1, View view) {
        C18070vi.A0h(newLabelView, r1);
        WaEditText waEditText = newLabelView.A0C;
        AnonymousClass3MW.A1S(waEditText);
        waEditText.A0H();
        r1.invoke();
    }

    public static final void setOnConfirmListener$lambda$3(NewLabelView newLabelView, AnonymousClass1OS r4, View view) {
        C18070vi.A0h(newLabelView, r4);
        WaEditText waEditText = newLabelView.A0C;
        waEditText.A0H();
        r4.invoke(Integer.valueOf(newLabelView.A00), AnonymousClass3MZ.A17(waEditText));
    }

    public Parcelable onSaveInstanceState() {
        return new AnonymousClass3O1(super.onSaveInstanceState(), this.A00);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewLabelView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NewLabelView(android.content.Context r16, android.util.AttributeSet r17, int r18, int r19) {
        /*
            r15 = this;
            r0 = 1
            r2 = r16
            X.C18070vi.A0d(r2, r0)
            r0 = r19
            r3 = r17
            r1 = r18
            r15.<init>(r2, r3, r1, r0)
            boolean r0 = r15.A0B
            if (r0 != 0) goto L_0x005a
            r0 = 1
            r15.A0B = r0
            java.lang.Object r0 = r15.generatedComponent()
            X.10E r1 = X.AnonymousClass3MW.A0O(r0)
            X.0ve r0 = X.AnonymousClass10E.A8r(r1)
            r15.A07 = r0
            X.00S r0 = r1.A2x
            java.lang.Object r0 = r0.get()
            X.1NA r0 = (X.AnonymousClass1NA) r0
            r15.A04 = r0
            X.1KW r0 = X.AnonymousClass3Ma.A0f(r1)
            r15.A06 = r0
            X.10G r0 = r1.A00
            X.1L2 r0 = X.C72463Mc.A0c(r0)
            r15.A05 = r0
            X.00H r0 = X.AnonymousClass3MX.A0z(r1)
            r15.A09 = r0
            X.0vc r0 = X.AnonymousClass3Ma.A0r(r1)
            r15.A08 = r0
            X.0zB r0 = X.C19890zB.A00
            r15.A01 = r0
            X.11C r0 = X.AnonymousClass3Ma.A0a(r1)
            r15.A02 = r0
            X.0vb r0 = X.AnonymousClass10E.A6Q(r1)
            r15.A03 = r0
        L_0x005a:
            r0 = 2131626954(0x7f0e0bca, float:1.8881159E38)
            android.view.View r1 = android.view.View.inflate(r2, r0, r15)
            r0 = 2131431920(0x7f0b11f0, float:1.8485583E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0S(r1, r0)
            r15.A0F = r0
            r0 = 2131431926(0x7f0b11f6, float:1.8485595E38)
            android.view.View r2 = r1.findViewById(r0)
            com.whatsapp.WaEditText r2 = (com.whatsapp.WaEditText) r2
            r15.A0C = r2
            r0 = 2131431917(0x7f0b11ed, float:1.8485577E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0S(r1, r0)
            r15.A0D = r0
            r0 = 2131431918(0x7f0b11ee, float:1.8485579E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0S(r1, r0)
            r15.A0E = r0
            r0 = 2131431927(0x7f0b11f7, float:1.8485597E38)
            com.whatsapp.WaTextView r3 = X.AnonymousClass3MW.A0U(r1, r0)
            r15.A0I = r3
            X.0ve r8 = r15.getAbProps()
            X.1KW r7 = r15.getEmojiLoader()
            X.11C r4 = r15.getSystemServices()
            X.0vb r5 = r15.getWhatsAppLocale()
            X.0vc r9 = r15.getSharedPreferencesFactory()
            X.1L2 r6 = r15.getEmojiRichFormatterStaticCaller()
            r10 = 100
            r11 = 0
            X.48A r1 = new X.48A
            r13 = r11
            r14 = r11
            r12 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A0G = r1
            r1 = 13
            X.48E r0 = new X.48E
            r0.<init>(r15, r1)
            r15.A0H = r0
            r0 = 8
            r15.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.labelitem.view.bottomsheet.NewLabelView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewLabelView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
