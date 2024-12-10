package com.whatsapp.contact.picker;

import X.AnonymousClass10E;
import X.AnonymousClass1L4;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18000vb;
import X.C18070vi;
import X.C72463Mc;
import X.C90774ec;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.whatsapp.collections.observablelistview.ObservableListView;

public final class BidiContactListView extends ObservableListView {
    public C18000vb A00;
    public AnonymousClass1L4 A01;
    public boolean A02;

    public final void setImeUtils(AnonymousClass1L4 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public void A01() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            this.A0A = AnonymousClass3MZ.A13(A0X);
            this.A01 = AnonymousClass3Ma.A0w(A0X.A00);
            this.A00 = AnonymousClass10E.A6Q(A0X);
        }
    }

    public final AnonymousClass1L4 getImeUtils() {
        AnonymousClass1L4 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("imeUtils");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BidiContactListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0j(context, attributeSet);
        A01();
        A00();
    }

    private final void A00() {
        int dimensionPixelSize;
        Resources resources;
        int i;
        if (AnonymousClass3MW.A1Z(getWhatsAppLocale())) {
            setVerticalScrollbarPosition(1);
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166071);
            resources = getResources();
            i = 2131166070;
        } else {
            setVerticalScrollbarPosition(2);
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166070);
            resources = getResources();
            i = 2131166071;
        }
        setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i), 0);
        setFastScrollAlwaysVisible(true);
        setScrollBarStyle(33554432);
        setFastScrollEnabled(true);
        setScrollbarFadingEnabled(true);
        this.A06 = new C90774ec(this, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BidiContactListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0j(context, attributeSet);
        A01();
        A00();
    }

    public BidiContactListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BidiContactListView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        A00();
    }
}
