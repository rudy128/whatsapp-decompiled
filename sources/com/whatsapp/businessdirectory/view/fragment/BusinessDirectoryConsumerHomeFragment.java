package com.whatsapp.businessdirectory.view.fragment;

import X.A6I;
import X.AAC;
import X.AM5;
import X.APC;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass16K;
import X.AnonymousClass1DT;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1XN;
import X.AnonymousClass3MW;
import X.AnonymousClass8FJ;
import X.AnonymousClass8ID;
import X.C108365ba;
import X.C108945cZ;
import X.C169238ka;
import X.C173768vh;
import X.C185719d2;
import X.C192189nx;
import X.C192609og;
import X.C20079A6f;
import X.C20335AGr;
import X.C20531AOq;
import X.C21446AkD;
import X.C22552BCj;
import X.C23391Fw;
import X.C37801q9;
import X.C39711tW;
import X.C40751vD;
import X.C41731wy;
import X.C56492hY;
import X.C56502hZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;
import java.util.Map;

public class BusinessDirectoryConsumerHomeFragment extends Hilt_BusinessDirectoryConsumerHomeFragment implements C22552BCj, C108365ba {
    public AnonymousClass1L9 A00;
    public C56492hY A01;
    public C56502hZ A02;
    public C40751vD A03;
    public C192189nx A04;
    public A6I A05;
    public C192609og A06;
    public AAC A07;
    public C173768vh A08;
    public APC A09;
    public BusinessDirectoryConsumerHomeViewModel A0A;
    public AnonymousClass1LU A0B;
    public AnonymousClass1XN A0C;
    public AnonymousClass1L4 A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public boolean A0G = true;
    public C169238ka A0H;
    public final C39711tW A0I = new AnonymousClass8ID(this, 6);

    public void A1Q(Bundle bundle) {
        this.A0X = true;
        this.A09.A00();
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A0H = this.A01.A00((AnonymousClass16K) this.A0F.get());
        this.A0A = (BusinessDirectoryConsumerHomeViewModel) AnonymousClass3MW.A0N(this).A00(BusinessDirectoryConsumerHomeViewModel.class);
        C56502hZ r1 = this.A02;
        AnonymousClass1LU r6 = this.A0B;
        APC A002 = r1.A00(this, this.A0H, this.A07, this, r6);
        this.A09 = A002;
        this.A04.A00(A002);
    }

    public void A1w(int i, int i2, Intent intent) {
        AM5 am5;
        int i3;
        if (i == 34) {
            APC apc = this.A09;
            if (i2 == -1) {
                apc.A07.BxF();
                am5 = apc.A02;
                i3 = 5;
            } else {
                am5 = apc.A02;
                i3 = 6;
            }
            am5.A03(i3, 0);
        }
        super.A1w(i, i2, intent);
    }

    public void BL4() {
        this.A0A.A09.A00.A0H();
    }

    public void BtI() {
        this.A0A.A09.A04();
    }

    public void BxF() {
        C20531AOq aOq = this.A0A.A09;
        aOq.A05.A02(true);
        aOq.A00.A0H();
    }

    public void BxJ() {
        this.A0A.A09.A05();
    }

    public void BxK() {
        this.A0A.BxL();
    }

    public void BxM(C185719d2 r2) {
        this.A0A.A09.A07(r2);
    }

    public void C0Z() {
        this.A0A.Boe(0);
    }

    public void C40() {
        this.A0A.A09.A00.A0H();
    }

    public void CRJ() {
        AnonymousClass8FJ r2 = this.A0A.A09.A00;
        C21446AkD.A01(r2.A08, r2, 21);
    }

    public static BusinessDirectoryActivity A00(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        if (businessDirectoryConsumerHomeFragment.A1D() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) businessDirectoryConsumerHomeFragment.A1D();
        }
        throw AnonymousClass000.A0n("BusinessDirectorySearchQueryFragment should be attached to BusinessDirectoryActivity");
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass1DT r3;
        View inflate = layoutInflater.inflate(2131625350, viewGroup, false);
        RecyclerView A0U = C108945cZ.A0U(inflate, 2131434911);
        A0U.setLayoutManager(new LinearLayoutManager(A1n(), 1, false));
        A0U.setAdapter(this.A08);
        A0U.A0t(this.A0I);
        boolean A032 = this.A0C.A03();
        C23391Fw r1 = this.A0L;
        if (A032) {
            r1.A05(this.A0H);
            C169238ka r12 = this.A0H;
            r12.A02 = 0;
            r3 = r12.A04;
        } else {
            r1.A05(this.A07);
            r3 = this.A07.A00;
        }
        C37801q9 A1G = A1G();
        APC apc = this.A09;
        apc.getClass();
        C20335AGr.A00(A1G, r3, apc, 3);
        C20335AGr.A00(A1G(), this.A0A.A04, this, 4);
        C20335AGr.A00(A1G(), this.A0A.A0D, this, 5);
        C41731wy r32 = this.A0A.A0B;
        C37801q9 A1G2 = A1G();
        APC apc2 = this.A09;
        apc2.getClass();
        C20335AGr.A00(A1G2, r32, apc2, 6);
        C20335AGr.A00(A1G(), this.A0A.A0C, this, 7);
        return inflate;
    }

    public void A1r() {
        super.A1r();
        this.A04.A01(this.A09);
    }

    public void A1u() {
        C20079A6f a6f;
        super.A1u();
        BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel = this.A0A;
        if (this.A0G) {
            BusinessDirectoryConsumerHomeViewModel.A00(businessDirectoryConsumerHomeViewModel).A08(businessDirectoryConsumerHomeViewModel.A07.A04(), (Integer) null, (Map) null, 0, 0, 0);
        }
        C20531AOq aOq = businessDirectoryConsumerHomeViewModel.A09;
        if (aOq.A09() && (a6f = aOq.A00.A01) != null && !a6f.equals(BusinessDirectoryConsumerHomeViewModel.A03(businessDirectoryConsumerHomeViewModel))) {
            AnonymousClass8FJ r2 = aOq.A00;
            C21446AkD.A01(r2.A08, r2, 21);
        }
    }
}
