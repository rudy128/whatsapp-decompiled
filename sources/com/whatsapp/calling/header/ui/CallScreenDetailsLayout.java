package com.whatsapp.calling.header.ui;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1VW;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4OO;
import X.C101635Dj;
import X.C18070vi;
import X.C18100vl;
import X.C27201Vd;
import X.C27691Xc;
import X.C28931bI;
import X.C30391dr;
import X.C37451pZ;
import X.C89704ct;
import X.C94214kE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.contact.photos.MultiContactThumbnail;

public final class CallScreenDetailsLayout extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass4OO A00;
    public AnonymousClass1VW A01;
    public C27201Vd A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public final C37451pZ A05;
    public final MultiContactThumbnail A06;
    public final C28931bI A07;
    public final C18100vl A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setCallScreenDetailsStateHolder(AnonymousClass4OO r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setContactAvatars(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setContactPhotos(C27201Vd r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    /* access modifiers changed from: private */
    public final C94214kE getPhotoDisplayer() {
        return (C94214kE) this.A08.getValue();
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4OO getCallScreenDetailsStateHolder() {
        AnonymousClass4OO r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callScreenDetailsStateHolder");
        throw null;
    }

    public final AnonymousClass1VW getContactAvatars() {
        AnonymousClass1VW r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactAvatars");
        throw null;
    }

    public final C27201Vd getContactPhotos() {
        C27201Vd r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        C18070vi.A0d(context, 1);
        if (!this.A04) {
            this.A04 = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            this.A00 = (AnonymousClass4OO) r1.A0z.A0S.get();
            AnonymousClass10E r12 = r1.A10;
            this.A01 = AnonymousClass3MZ.A0e(r12);
            this.A02 = AnonymousClass3MZ.A0i(r12);
        }
        this.A08 = AnonymousClass1DF.A01(new C101635Dj(this));
        View.inflate(context, 2131624454, this);
        setOrientation(1);
        setGravity(1);
        this.A06 = (MultiContactThumbnail) C18070vi.A05(this, 2131428670);
        this.A05 = getContactPhotos().A08("voip-call-screen-detail-contact-photos", 0.0f, getResources().getDimensionPixelSize(2131165708));
        this.A07 = C28931bI.A00(this, 2131432218);
        if (isAttachedToWindow()) {
            AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
            if (A002 != null) {
                AnonymousClass3MX.A1Q(new CallScreenDetailsLayout$setupOnAttach$1(A002, this, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
            }
            if (!isAttachedToWindow()) {
                this.A05.A02();
                return;
            }
            i2 = 2;
        } else {
            i2 = 3;
        }
        C89704ct.A00(this, i2);
    }

    public /* synthetic */ CallScreenDetailsLayout(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
