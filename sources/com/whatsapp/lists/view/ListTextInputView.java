package com.whatsapp.lists.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass11C;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass3MW;
import X.AnonymousClass3O2;
import X.AnonymousClass48A;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;

public final class ListTextInputView extends FrameLayout implements AnonymousClass009 {
    public WaEditText A00;
    public WaTextView A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public AnonymousClass1L2 A04;
    public AnonymousClass1KW A05;
    public C18030ve A06;
    public C18010vc A07;
    public AnonymousClass48A A08;
    public AnonymousClass031 A09;
    public boolean A0A;
    public int A0B;
    public FrameLayout A0C;
    public WaImageButton A0D;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListTextInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setEmojiLoader(AnonymousClass1KW r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setEmojiRichFormatterStaticCaller(AnonymousClass1L2 r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setListName(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        WaEditText waEditText = this.A00;
        if (waEditText != null) {
            waEditText.setText(charSequence);
        }
    }

    public final void setSharedPreferencesFactory(C18010vc r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
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
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass1KW getEmojiLoader() {
        AnonymousClass1KW r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }

    public final AnonymousClass1L2 getEmojiRichFormatterStaticCaller() {
        AnonymousClass1L2 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("emojiRichFormatterStaticCaller");
        throw null;
    }

    public final C18010vc getSharedPreferencesFactory() {
        C18010vc r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("sharedPreferencesFactory");
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
        AnonymousClass3O2 r1;
        int i;
        Parcelable parcelable2;
        if (parcelable instanceof AnonymousClass3O2) {
            r1 = (AnonymousClass3O2) parcelable;
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
        this.A0B = i;
    }

    public final void setCursorPosition(int i) {
        WaEditText waEditText = this.A00;
        if (waEditText != null) {
            waEditText.setSelection(i);
        }
    }

    public Parcelable onSaveInstanceState() {
        return new AnonymousClass3O2(super.onSaveInstanceState(), this.A0B);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListTextInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C18070vi.A0d(context, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ListTextInputView(android.content.Context r16, android.util.AttributeSet r17, int r18, int r19) {
        /*
            r15 = this;
            r1 = 1
            r4 = r16
            X.C18070vi.A0d(r4, r1)
            r2 = r18
            r0 = r19
            r3 = r17
            r15.<init>(r4, r3, r2, r0)
            boolean r0 = r15.A0A
            if (r0 != 0) goto L_0x0043
            r15.A0A = r1
            java.lang.Object r0 = r15.generatedComponent()
            X.10E r1 = X.AnonymousClass3MW.A0O(r0)
            X.0ve r0 = X.AnonymousClass10E.A8r(r1)
            r15.A06 = r0
            X.1KW r0 = X.AnonymousClass3Ma.A0f(r1)
            r15.A05 = r0
            X.10G r0 = r1.A00
            X.1L2 r0 = X.C72463Mc.A0c(r0)
            r15.A04 = r0
            X.0vc r0 = X.AnonymousClass3Ma.A0r(r1)
            r15.A07 = r0
            X.11C r0 = X.AnonymousClass3Ma.A0a(r1)
            r15.A02 = r0
            X.0vb r0 = X.AnonymousClass10E.A6Q(r1)
            r15.A03 = r0
        L_0x0043:
            android.content.Context r1 = r15.getContext()
            r0 = 2131627365(0x7f0e0d65, float:1.8881992E38)
            android.view.View r1 = android.view.View.inflate(r1, r0, r15)
            r0 = 2131432108(0x7f0b12ac, float:1.8485964E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            r15.A00 = r0
            r0 = 2131432109(0x7f0b12ad, float:1.8485966E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0U(r1, r0)
            r15.A01 = r0
            r0 = 2131432080(0x7f0b1290, float:1.8485907E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.WaImageButton r0 = (com.whatsapp.WaImageButton) r0
            r15.A0D = r0
            r0 = 2131432110(0x7f0b12ae, float:1.8485968E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r15.A0C = r0
            com.whatsapp.WaEditText r2 = r15.A00
            if (r2 == 0) goto L_0x00c4
            X.0ve r8 = r15.getAbProps()
            X.1KW r7 = r15.getEmojiLoader()
            X.11C r4 = r15.getSystemServices()
            X.0vb r5 = r15.getWhatsAppLocale()
            X.0vc r9 = r15.getSharedPreferencesFactory()
            X.1L2 r6 = r15.getEmojiRichFormatterStaticCaller()
            com.whatsapp.WaTextView r3 = r15.A01
            r12 = 0
            r10 = 100
            r11 = 11
            X.48A r1 = new X.48A
            r14 = r12
            r13 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A08 = r1
            r1 = 1
            X.77f[] r0 = new X.C1418577f[r1]
            X.C72453Mb.A1H(r2, r0, r10, r12)
            X.48A r0 = r15.A08
            r2.addTextChangedListener(r0)
            r0 = 16385(0x4001, float:2.296E-41)
            r2.setInputType(r0)
            X.0vb r0 = r15.getWhatsAppLocale()
            X.C27641Ww.A09(r2, r0)
            X.AnonymousClass3MW.A1S(r2)
            r2.requestFocus()
            r2.A0I(r1)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.lists.view.ListTextInputView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListTextInputView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
