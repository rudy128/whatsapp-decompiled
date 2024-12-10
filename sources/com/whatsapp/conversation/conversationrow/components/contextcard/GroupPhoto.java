package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass01C;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FY;
import X.AnonymousClass1L9;
import X.AnonymousClass1PU;
import X.AnonymousClass1VU;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass7AT;
import X.AnonymousClass7AX;
import X.AnonymousClass7BV;
import X.AnonymousClass82F;
import X.C111135iO;
import X.C115025tD;
import X.C147987gi;
import X.C147997gj;
import X.C148007gk;
import X.C1595284w;
import X.C18070vi;
import X.C24071It;
import X.C37451pZ;
import X.C42941yz;
import android.content.Context;
import android.util.AttributeSet;

public class GroupPhoto extends C115025tD {
    public C1595284w A00;
    public AnonymousClass1VU A01;
    public AnonymousClass1PU A02;
    public C111135iO A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupPhoto(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A05();
    }

    public final void setGroupChatUtils(AnonymousClass1PU r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setPathDrawableHelper(AnonymousClass1VU r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setViewModelFactory(C1595284w r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public static final void A00(C37451pZ r7, GroupPhoto groupPhoto, AnonymousClass1E7 r9) {
        AnonymousClass1BI r0;
        Integer num;
        Object obj;
        C42941yz r02 = AnonymousClass1EC.A01;
        if (r9 != null) {
            r0 = r9.A0J;
        } else {
            r0 = null;
        }
        AnonymousClass1EC A002 = C42941yz.A00(r0);
        if (groupPhoto.getGroupChatUtils().A03(A002)) {
            num = Integer.MIN_VALUE;
            obj = C147987gi.A00;
        } else if (groupPhoto.getGroupChatUtils().A02(A002)) {
            num = Integer.MIN_VALUE;
            obj = C147997gj.A00;
        } else {
            num = -1;
            obj = C148007gk.A00;
        }
        int intValue = num.intValue();
        int dimensionPixelSize = groupPhoto.getResources().getDimensionPixelSize(2131166133);
        if (r9 == null) {
            AnonymousClass1VU pathDrawableHelper = groupPhoto.getPathDrawableHelper();
            groupPhoto.setImageDrawable(AnonymousClass1VU.A00(AnonymousClass3Ma.A06(groupPhoto), groupPhoto.getResources(), new AnonymousClass7BV(obj, 0), pathDrawableHelper.A00, 2131231054));
            return;
        }
        r7.A08(groupPhoto, r9, (float) intValue, dimensionPixelSize);
    }

    public final AnonymousClass1PU getGroupChatUtils() {
        AnonymousClass1PU r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatUtils");
        throw null;
    }

    public final AnonymousClass1VU getPathDrawableHelper() {
        AnonymousClass1VU r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pathDrawableHelper");
        throw null;
    }

    public final C1595284w getViewModelFactory() {
        C1595284w r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("viewModelFactory");
        throw null;
    }

    public final void A06(AnonymousClass1E7 r6, C37451pZ r7) {
        AnonymousClass1BI r0;
        AnonymousClass01C r4 = (AnonymousClass01C) AnonymousClass1L9.A01(getContext(), AnonymousClass1FY.class);
        C42941yz r02 = AnonymousClass1EC.A01;
        if (r6 != null) {
            r0 = r6.A0J;
        } else {
            r0 = null;
        }
        AnonymousClass1EC A002 = C42941yz.A00(r0);
        if (A002 != null) {
            C1595284w viewModelFactory = getViewModelFactory();
            C18070vi.A0d(r4, 0);
            C111135iO r03 = (C111135iO) new C24071It(new AnonymousClass7AX(viewModelFactory, A002), r4).A00(C111135iO.class);
            this.A03 = r03;
            if (r03 == null) {
                AnonymousClass3MW.A1H();
                throw null;
            }
            AnonymousClass7AT.A01(r4, r03.A00, new AnonymousClass82F(r7, this), 22);
        }
        A00(r7, this, r6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupPhoto(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ GroupPhoto(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GroupPhoto(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
