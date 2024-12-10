package com.whatsapp.biz.catalog.view;

import X.A1M;
import X.AEW;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KC;
import X.AnonymousClass1L9;
import X.AnonymousClass2L5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48V;
import X.BD0;
import X.BDO;
import X.C000200d;
import X.C17960vV;
import X.C190289kg;
import X.C191899nN;
import X.C196149uX;
import X.C19880zA;
import X.C19957A0o;
import X.C20005A2v;
import X.C20114A7x;
import X.C20287AEv;
import X.C20507ANs;
import X.C20508ANt;
import X.C21076Ae6;
import X.C22364B4s;
import X.C26911Ty;
import X.C36361nl;
import X.C47962Kq;
import X.C84144If;
import X.C85424Ni;
import X.C85774Or;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class CatalogMediaCard extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public C20005A2v A02;
    public C191899nN A03;
    public C22364B4s A04;
    public AnonymousClass1KC A05;
    public UserJid A06;
    public AnonymousClass48V A07;
    public AnonymousClass00H A08;
    public AnonymousClass031 A09;
    public Boolean A0A;
    public boolean A0B;
    public BD0 A0C;
    public String A0D;
    public boolean A0E;

    public void A03(List list) {
        int i = 5;
        if (this.A0A.booleanValue() && (i = list.size()) > 3) {
            int i2 = i;
            i = 6;
            if (i2 < 6) {
                i = 3;
            }
        }
        this.A07.A08(list, i);
    }

    public void A01() {
        this.A02.A02();
        AnonymousClass1KC r4 = this.A05;
        BD0[] bd0Arr = {r4.A01, r4.A00};
        int i = 0;
        do {
            BD0 bd0 = bd0Arr[i];
            if (bd0 != null) {
                bd0.cleanup();
            }
            i++;
        } while (i < 2);
        r4.A00 = null;
        r4.A01 = null;
    }

    public void A02(AEW aew, UserJid userJid, String str, boolean z, boolean z2) {
        C20507ANs aNs;
        UserJid userJid2 = userJid;
        this.A06 = userJid2;
        boolean z3 = z2;
        this.A0E = z3;
        String str2 = str;
        this.A0D = str2;
        AnonymousClass1KC r9 = this.A05;
        C196149uX r8 = r9.A07;
        AEW aew2 = aew;
        if (r8.A03(aew2)) {
            C20507ANs aNs2 = r9.A01;
            C20507ANs aNs3 = aNs2;
            if (aNs2 == null) {
                AnonymousClass18K r4 = r9.A0G;
                C36361nl r15 = r9.A05;
                BDO bdo = r9.A0D;
                AnonymousClass2L5 r2 = r9.A0I;
                C20507ANs aNs4 = new C20507ANs(r15, r8, bdo, this, r9.A0E, r4, r2, r9.A0K);
                r9.A01 = aNs4;
                aNs3 = aNs4;
            }
            C17960vV.A07(aew2);
            aNs3.A00 = aew2;
            aNs = aNs3;
        } else {
            C20508ANt aNt = r9.A00;
            if (aNt == null) {
                AnonymousClass1KB r30 = r9.A04;
                AnonymousClass11S r19 = r9.A06;
                AnonymousClass1L9 r18 = r9.A03;
                AnonymousClass10I r17 = r9.A0J;
                C19880zA r16 = r9.A02;
                CatalogManager catalogManager = r9.A0C;
                C85424Ni r6 = r9.A0E;
                C20114A7x a7x = r9.A0B;
                C26911Ty r42 = r9.A08;
                C47962Kq r3 = r9.A0A;
                C190289kg r22 = r9.A0H;
                C19957A0o a0o = r9.A0F;
                AnonymousClass10I r29 = r17;
                AnonymousClass1L9 r172 = r18;
                AnonymousClass1KB r182 = r30;
                aNt = new C20508ANt(r16, r172, r182, r19, r8, r42, r9.A09, r3, a7x, catalogManager, r6, a0o, r22, r29);
                r9.A00 = aNt;
            }
            aNt.A03 = str2;
            aNt.A02 = aew2;
            aNt.A01 = this;
            aNt.A00 = getContext();
            C20508ANt aNt2 = r9.A00;
            aNt2.A04 = z3;
            aNs = aNt2;
        }
        this.A0C = aNs;
        if (z && aNs.BcZ(userJid2)) {
            this.A0C.BuR(userJid2);
        } else if (this.A0C.CM1()) {
            setVisibility(8);
        } else {
            this.A0C.BdP(userJid2);
            this.A0C.BBd();
            this.A0C.BL3(userJid2, this.A01);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public String getMediaCardViewErrorText() {
        return this.A07.getError();
    }

    public void setError(int i) {
        this.A07.setError(AnonymousClass3Ma.A11(this, i));
    }

    public void setMediaTitleTextAppearance(int i) {
        this.A07.setMediaTitleTextAppearance(i);
    }

    public void setThumbnailBg(int i) {
        this.A07.A00 = i;
    }

    public void setupThumbnails(UserJid userJid, int i, List list) {
        BD0 bd0 = this.A0C;
        UserJid userJid2 = this.A06;
        C17960vV.A07(userJid2);
        int BXe = bd0.BXe(userJid2);
        if (BXe != this.A00) {
            A03(A00(userJid, AnonymousClass3Ma.A11(this, i), list, this.A0E));
            this.A00 = BXe;
        }
    }

    public CatalogMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass10G r1 = AnonymousClass3MW.A0O(generatedComponent()).A00;
            this.A03 = (C191899nN) r1.A7i.get();
            this.A05 = r1.A20();
            this.A08 = C000200d.A00(r1.A7j);
        }
        this.A0A = AnonymousClass000.A0h();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A05);
            this.A0A = Boolean.valueOf(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        }
        AnonymousClass48V r0 = (AnonymousClass48V) AnonymousClass1HF.A06(AnonymousClass3MX.A0A(AnonymousClass3MZ.A0D(this), this, this.A0A.booleanValue() ? 2131624371 : 2131624370), 2131434102);
        this.A07 = r0;
        r0.setTopShadowVisibility(0);
        this.A07.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.A02 = C20005A2v.A00(this.A03, this.A08);
        int thumbnailPixelSize = this.A07.getThumbnailPixelSize();
        this.A01 = thumbnailPixelSize;
        this.A03.A00 = thumbnailPixelSize;
    }

    public ArrayList A00(UserJid userJid, String str, List list, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list2 = list;
            if (i >= list2.size() || i2 >= 6) {
                return A13;
            }
            C20287AEv aEv = (C20287AEv) list2.get(i);
            if (aEv.A01() && !aEv.A0H.equals(this.A0D)) {
                i2++;
                A13.add(new C85774Or((Drawable) null, this.A0C.BaN(aEv, userJid, z), new C21076Ae6(aEv, this, 0), (String) null, str, AnonymousClass001.A1H("thumb-transition-", A1M.A00(aEv.A0H, 0), AnonymousClass000.A10())));
            }
            i++;
        }
        return A13;
    }

    public C22364B4s getCatalogPreviewItemClickListener() {
        return this.A04;
    }

    public BD0 getMediaCardViewPresenter() {
        return this.A0C;
    }

    public void setCatalogPreviewItemClickListener(C22364B4s b4s) {
        this.A04 = b4s;
    }

    public CatalogMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public CatalogMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
