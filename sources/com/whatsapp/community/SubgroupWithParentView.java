package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1HF;
import X.AnonymousClass1VU;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3PH;
import X.C000200d;
import X.C1600086t;
import X.C18000vb;
import X.C18030ve;
import X.C37451pZ;
import X.C65482wZ;
import X.C72473Md;
import X.C91274fQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;

public class SubgroupWithParentView extends AnonymousClass3PH implements C1600086t {
    public int A00;
    public WaImageView A01;
    public ThumbnailButton A02;
    public AnonymousClass1VW A03;
    public C18000vb A04;
    public AnonymousClass1VU A05;
    public C18030ve A06;
    public AnonymousClass00H A07;
    public int A08;

    public SubgroupWithParentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View getTransitionView() {
        if (this.A08 == 3) {
            return this.A01;
        }
        return this.A02;
    }

    public void setSubgroupProfilePhoto(AnonymousClass1E7 r3, int i, C37451pZ r5) {
        this.A08 = i;
        r5.A0C(this.A02, r3, false);
        setBottomCommunityPhoto(r3, r5);
    }

    public void setSubgroupProfilePhotoBorderColor(int i) {
        this.A02.A02 = AnonymousClass3MY.A02(this, i);
    }

    private void setBottomCommunityPhoto(AnonymousClass1E7 r6, C37451pZ r7) {
        AnonymousClass1EC A0n = AnonymousClass3Ma.A0n(r6);
        if (A0n == null) {
            WaImageView waImageView = this.A01;
            AnonymousClass1VU r3 = this.A05;
            Context context = getContext();
            C65482wZ A0J = AnonymousClass3Ma.A0J();
            C72473Md.A0t(context.getTheme(), context.getResources(), waImageView, A0J, r3);
            return;
        }
        AnonymousClass3MW.A0Z(this.A07).A0F(new C91274fQ(r7, this, 0), A0n);
    }

    public SubgroupWithParentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = AnonymousClass10E.A8r(A0O);
            this.A04 = AnonymousClass10E.A6Q(A0O);
            this.A03 = AnonymousClass3MZ.A0e(A0O);
            this.A05 = AnonymousClass3MZ.A0s(A0O);
            this.A07 = C000200d.A00(A0O.A2L);
        }
        this.A08 = 0;
        this.A00 = getResources().getDimensionPixelSize(2131166002);
        LayoutInflater.from(context).inflate(2131627148, this, true);
        this.A01 = AnonymousClass3MW.A0R(this, 2131433420);
        this.A02 = (ThumbnailButton) AnonymousClass1HF.A06(this, 2131435870);
    }

    public SubgroupWithParentView(Context context) {
        this(context, (AttributeSet) null);
    }
}
