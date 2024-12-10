package com.whatsapp.conversation.comments.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C17880vN;
import X.C18070vi;
import X.C19830z4;
import X.C24921Me;
import X.C36331ni;
import X.C36361nl;
import X.C36401np;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C98774rh;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.TextEmojiLabel;

public final class CommentDecryptionFailureTextView extends TextEmojiLabel {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public C36361nl A02;
    public AnonymousClass11S A03;
    public C24921Me A04;
    public C19830z4 A05;
    public AnonymousClass129 A06;
    public C36331ni A07;
    public C36401np A08;
    public boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentDecryptionFailureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
        setAutoLinkMask(0);
        setLinksClickable(false);
        setFocusable(false);
        setClickable(false);
        setLongClickable(false);
        AnonymousClass3Ma.A1L(getAbProps(), this);
        C72473Md.A1D(this);
        C72473Md.A1C(this);
        setText(getLinkifier().A06(context, new C98774rh(this, 36), C17880vN.A0q(context, "learn-more", new Object[1], 0, 2131889226), "learn-more", C72463Mc.A02(context)));
    }

    public final void setActivityUtils(AnonymousClass1L9 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setFaqLinkFactory(AnonymousClass129 r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setLinkLauncher(C36361nl r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setLinkifier(C36401np r2) {
        C18070vi.A0d(r2, 0);
        this.A08 = r2;
    }

    public final void setMeManager(AnonymousClass11S r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setUiWamEventHelper(C36331ni r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWaSharedPreferences(C19830z4 r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public void A0I() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(this);
            C72483Me.A0s(A0X, this);
            this.A02 = AnonymousClass3Ma.A0f(A0X);
            AnonymousClass10G r1 = A0X.A00;
            this.A01 = C72463Mc.A0c(r1);
            this.A03 = AnonymousClass3Ma.A0r(A0X);
            this.A00 = AnonymousClass3MZ.A0N(A0X);
            this.A06 = AnonymousClass3Ma.A0t(A0X);
            this.A01 = AnonymousClass10E.A12(A0X);
            this.A02 = AnonymousClass3Ma.A0L(A0X);
            this.A08 = AnonymousClass3MY.A0e(r1);
            this.A03 = AnonymousClass10E.A17(A0X);
            this.A07 = AnonymousClass10E.AKo(A0X);
            this.A04 = AnonymousClass3MZ.A0g(A0X);
            this.A05 = AnonymousClass3Ma.A0c(A0X);
        }
    }

    public final AnonymousClass1L9 getActivityUtils() {
        AnonymousClass1L9 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }

    public final AnonymousClass129 getFaqLinkFactory() {
        AnonymousClass129 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("faqLinkFactory");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final C36361nl getLinkLauncher() {
        C36361nl r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("linkLauncher");
        throw null;
    }

    public final C36401np getLinkifier() {
        C36401np r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }

    public final AnonymousClass11S getMeManager() {
        AnonymousClass11S r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public final C36331ni getUiWamEventHelper() {
        C36331ni r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("uiWamEventHelper");
        throw null;
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }

    public final C19830z4 getWaSharedPreferences() {
        C19830z4 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public CommentDecryptionFailureTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A0I();
    }

    public /* synthetic */ CommentDecryptionFailureTextView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
