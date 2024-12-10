package com.whatsapp.community.communityInfo;

import X.AnonymousClass00R;
import X.AnonymousClass01E;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1K1;
import X.AnonymousClass1NN;
import X.AnonymousClass1Q1;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4K5;
import X.AnonymousClass4P5;
import X.AnonymousClass5RV;
import X.C104075Mt;
import X.C18070vi;
import X.C18100vl;
import X.C22621Co;
import X.C24671Lf;
import X.C25191Ng;
import X.C27201Vd;
import X.C35751mk;
import X.C36251na;
import X.C37451pZ;
import X.C39511tC;
import X.C40251uP;
import X.C40261uQ;
import X.C77033p1;
import X.C84284Iw;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class CommunityHomeFragment extends Hilt_CommunityHomeFragment {
    public AnonymousClass4K5 A00;
    public AnonymousClass4P5 A01;
    public C27201Vd A02;
    public C22621Co A03;
    public C77033p1 A04;
    public C37451pZ A05;
    public C37451pZ A06;
    public final C18100vl A07 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104075Mt(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        RecyclerView recyclerView = new RecyclerView(A14(), (AttributeSet) null);
        recyclerView.setId(2131429237);
        AnonymousClass1FL A1D = A1D();
        C18070vi.A0z(A1D, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass01E r7 = (AnonymousClass01E) A1D;
        C27201Vd r3 = this.A02;
        if (r3 != null) {
            this.A05 = r3.A04(A14(), this, "CommunityHomeFragment");
            C27201Vd r4 = this.A02;
            if (r4 != null) {
                this.A06 = r4.A07(this, "CommunityHomeFragment-multi-contact", 0.0f, AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131166074));
                AnonymousClass4K5 r32 = this.A00;
                if (r32 != null) {
                    AnonymousClass1EC A0p = AnonymousClass3MX.A0p(this.A07);
                    C37451pZ r2 = this.A05;
                    if (r2 == null) {
                        str = "contactPhotoLoader";
                    } else {
                        C37451pZ r1 = this.A06;
                        if (r1 == null) {
                            str = "multiContactPhotoLoader";
                        } else {
                            C36251na r42 = r32.A00;
                            AnonymousClass10E r6 = r42.A02;
                            r6.A27.get();
                            AnonymousClass1Q1 A0U = AnonymousClass3MY.A0U(r6);
                            C24671Lf A0S = AnonymousClass3Ma.A0S(r6);
                            AnonymousClass1NN A0e = AnonymousClass3Ma.A0e(r6);
                            AnonymousClass1K1 r5 = r42.A00;
                            C40261uQ r12 = (C40261uQ) r5.A1n.get();
                            C39511tC r14 = (C39511tC) r6.A1K.get();
                            C25191Ng A0Y = AnonymousClass3MY.A0Y(r6);
                            AnonymousClass01E r9 = r7;
                            AnonymousClass01E r8 = r7;
                            AnonymousClass4P5 r62 = new AnonymousClass4P5(r7, r8, r9, recyclerView, (C84284Iw) r5.A1Z.get(), r12, (C40251uP) r42.A01.A0R.get(), r14, (C35751mk) r6.A2F.get(), A0S, r2, r1, A0U, A0e, A0Y, A0p);
                            this.A01 = r62;
                            C77033p1 r13 = r62.A04;
                            C18070vi.A0X(r13);
                            this.A04 = r13;
                            AnonymousClass3MY.A1K(r7, r13.A00.A03, new AnonymousClass5RV(this), 38);
                            return recyclerView;
                        }
                    }
                } else {
                    str = "subgroupsComponentFactory";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "contactPhotos";
        C18070vi.A11(str);
        throw null;
    }

    public void A1r() {
        String str;
        super.A1r();
        AnonymousClass4P5 r0 = this.A01;
        if (r0 == null) {
            str = "subgroupsComponent";
        } else {
            r0.A08.A01();
            C37451pZ r02 = this.A06;
            if (r02 == null) {
                str = "multiContactPhotoLoader";
            } else {
                r02.A02();
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
