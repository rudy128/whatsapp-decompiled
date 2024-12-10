package com.whatsapp.videoplayback;

import X.AnonymousClass78U;
import X.C108955ca;
import X.C121996Mj;
import X.C122106Mu;
import X.C135046rZ;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C25746ClG;
import X.C26378Cye;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;

public class HeroPlaybackControlView extends C122106Mu {
    public final Handler A00;
    public final C25746ClG A01;
    public final AnonymousClass78U A02;

    public void setPlayer(Object obj) {
        C135046rZ r0;
        if (!C18020vd.A05(C18040vf.A02, this.A03, 6576) && (r0 = this.A04) != null) {
            C108955ca.A1F(r0.A00.A0C, this.A02, 45);
        }
        if (obj != null) {
            C135046rZ r02 = new C135046rZ((C26378Cye) obj, this);
            this.A04 = r02;
            C108955ca.A1F(r02.A00.A0C, this.A02, 44);
        } else {
            this.A04 = null;
        }
        C121996Mj.A01(this);
    }

    public HeroPlaybackControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
        this.A00 = C17890vO.A0D();
        this.A01 = new C25746ClG();
        AnonymousClass78U r1 = new AnonymousClass78U(this);
        this.A02 = r1;
        this.A0Q.setOnSeekBarChangeListener(r1);
        this.A0D.setOnClickListener(r1);
    }

    public HeroPlaybackControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeroPlaybackControlView(Context context) {
        this(context, (AttributeSet) null);
    }
}
