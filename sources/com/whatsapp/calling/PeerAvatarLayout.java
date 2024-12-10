package com.whatsapp.calling;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3WM;
import X.C000200d;
import X.C18000vb;
import X.C18140vp;
import X.C27201Vd;
import X.C27691Xc;
import X.C37451pZ;
import X.C37961qT;
import X.C38471rL;
import X.C66812ym;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PeerAvatarLayout extends RecyclerView implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass3WM A05;
    public C66812ym A06;
    public AnonymousClass1VW A07;
    public C37451pZ A08;
    public C27201Vd A09;
    public C18000vb A0A;
    public C38471rL A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass031 A0D;
    public C18140vp A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    public PeerAvatarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0D;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0D = r0;
        }
        return r0.generatedComponent();
    }

    public void setFixedContactPhotoSizeRes(int i) {
        if (i != this.A04) {
            this.A04 = i;
            this.A05.notifyDataSetChanged();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C37451pZ r0 = this.A08;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setInitialsEnabled(boolean z) {
        this.A0G = z;
    }

    public void setOnOneClickListener(C38471rL r1) {
        this.A0B = r1;
    }

    public void setShouldForceDarkMode(boolean z) {
        this.A0H = z;
    }

    public PeerAvatarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0F) {
            this.A0F = true;
            C27691Xc r2 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r1 = r2.A10;
            this.A07 = AnonymousClass3MZ.A0e(r1);
            this.A09 = AnonymousClass3MZ.A0i(r1);
            this.A0A = AnonymousClass10E.A6Q(r1);
            this.A06 = C27691Xc.A0A(r2);
            this.A0C = C000200d.A00(r1.A5H);
            this.A0E = r1.A8t;
        }
        this.A0H = true;
        this.A05 = new AnonymousClass3WM(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.A1Z(0);
        setLayoutManager(linearLayoutManager);
        setItemAnimator((C37961qT) null);
        setAdapter(this.A05);
        this.A02 = getResources().getDimensionPixelSize(2131165576);
        this.A03 = getResources().getDimensionPixelSize(2131165577);
        C27201Vd r3 = this.A09;
        Resources resources = getResources();
        int i2 = this.A04;
        this.A08 = r3.A08("peer-avatar-photo", 0.0f, resources.getDimensionPixelSize(i2 == 0 ? 2131165582 : i2));
    }

    public PeerAvatarLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
