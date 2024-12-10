package com.whatsapp.newsletter.ui.directory.filter.country;

import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass7PB;
import X.C108945cZ;
import X.C111865kY;
import X.C112485lY;
import X.C127576ea;
import X.C18030ve;
import X.C18070vi;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.wds.components.search.WDSSearchView;

public final class CountrySelectorBottomSheet extends Hilt_CountrySelectorBottomSheet {
    public View A00;
    public RecyclerView A01;
    public C18030ve A02;
    public C127576ea A03;
    public C111865kY A04;
    public C112485lY A05;
    public AnonymousClass00H A06;
    public WDSSearchView A07;
    public String A08 = "";

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r11, android.view.View r12) {
        /*
            r10 = this;
            r5 = 0
            X.C18070vi.A0d(r12, r5)
            super.A21(r11, r12)
            X.5lY r0 = new X.5lY
            r0.<init>(r10)
            r10.A05 = r0
            X.5kY r1 = new X.5kY
            r1.<init>(r10)
            X.5lY r0 = r10.A05
            if (r0 == 0) goto L_0x001a
            r1.CDq(r0)
        L_0x001a:
            r10.A04 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r10.A01
            if (r0 == 0) goto L_0x0023
            r0.setAdapter(r1)
        L_0x0023:
            androidx.recyclerview.widget.RecyclerView r3 = r10.A01
            if (r3 == 0) goto L_0x0034
            X.1FL r2 = r10.A1B()
            r1 = 1
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r2, r1, r5)
            r3.setLayoutManager(r0)
        L_0x0034:
            X.1It r1 = X.AnonymousClass3MW.A0N(r10)
            java.lang.Class<com.whatsapp.countries.CountryListViewModel> r0 = com.whatsapp.countries.CountryListViewModel.class
            X.1J2 r7 = r1.A00(r0)
            com.whatsapp.countries.CountryListViewModel r7 = (com.whatsapp.countries.CountryListViewModel) r7
            java.lang.String r8 = r10.A08
            X.0ve r2 = r10.A02
            if (r2 == 0) goto L_0x012e
            r1 = 1777(0x6f1, float:2.49E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r9 = X.C18020vd.A05(r0, r2, r1)
            X.C18070vi.A0d(r8, r5)
            X.1K3 r2 = r7.A03
            X.0vb r1 = r7.A02
            java.util.Locale r0 = r1.A0N()
            java.lang.String r0 = X.AnonymousClass1X0.A04(r0)
            java.util.List r6 = X.AnonymousClass1K3.A02(r2, r0)
            X.C18070vi.A0X(r6)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0074
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = X.AnonymousClass1X0.A04(r0)
            java.util.List r6 = X.AnonymousClass1K3.A02(r2, r0)
        L_0x0074:
            java.util.Locale r1 = r1.A0N()
            X.C18070vi.A0X(r1)
            X.7Re r0 = new X.7Re
            r0.<init>(r1)
            java.util.Collections.sort(r6, r0)
            java.lang.String r4 = "N/A"
            r3 = 0
            if (r9 == 0) goto L_0x00f2
            java.lang.String r1 = r7.A04
            boolean r0 = X.C18070vi.A18(r1, r8)
            if (r0 == 0) goto L_0x00f2
            X.2dJ r0 = new X.2dJ
            r0.<init>(r1, r1)
            r6.add(r5, r0)
        L_0x0098:
            java.util.ArrayList r5 = X.AnonymousClass000.A14(r6)
            int r8 = r6.size()
        L_0x00a0:
            if (r3 >= r8) goto L_0x011e
            java.lang.Object r9 = r6.get(r3)
            X.2dJ r9 = (X.C53922dJ) r9
            X.1LA r1 = r7.A01
            java.lang.String r0 = r9.A00
            X.1yp r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = r9.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00df
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r9.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x00df
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CountryListViewModel saw unknown country "
            r1.append(r0)
            java.lang.String r0 = r9.A00
            r1.append(r0)
            r0 = 61
            r1.append(r0)
            java.lang.String r0 = r9.A01
            X.C17890vO.A1B(r1, r0)
        L_0x00dc:
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00df:
            java.lang.String r2 = r9.A01
            X.C18070vi.A0W(r2)
            java.lang.String r1 = r9.A00
            X.C18070vi.A0W(r1)
            X.6fu r0 = new X.6fu
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x00dc
        L_0x00f2:
            java.util.Iterator r1 = r6.iterator()
        L_0x00f6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r2 = r1.next()
            X.2dJ r2 = (X.C53922dJ) r2
            java.lang.String r0 = r2.A00
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00f6
            r1.remove()
            if (r9 == 0) goto L_0x0119
            java.lang.String r1 = r7.A04
            X.2dJ r0 = new X.2dJ
            r0.<init>(r1, r1)
            r6.add(r5, r0)
        L_0x0119:
            r6.add(r5, r2)
            goto L_0x0098
        L_0x011e:
            X.1DT r2 = r7.A00
            r2.A0F(r5)
            X.80Q r1 = new X.80Q
            r1.<init>(r10)
            r0 = 49
            X.AnonymousClass7AT.A01(r10, r2, r1, r0)
            return
        L_0x012e:
            X.AnonymousClass3MW.A1A()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C127576ea r0 = this.A03;
        if (r0 != null) {
            r0.A00.A4h();
        }
    }

    public void A1K() {
        C112485lY r1;
        super.A1K();
        C111865kY r0 = this.A04;
        if (!(r0 == null || (r1 = this.A05) == null)) {
            r0.A01.unregisterObserver(r1);
        }
        this.A01 = null;
        C127576ea r02 = this.A03;
        if (r02 != null) {
            r02.A00.A4h();
        }
        this.A03 = null;
        this.A07 = null;
        this.A00 = null;
    }

    public void A1j() {
        super.A1j();
        C127576ea r0 = this.A03;
        if (r0 != null) {
            r0.A00.A4h();
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String string;
        View inflate = LayoutInflater.from(A1n()).inflate(2131626257, viewGroup);
        Bundle bundle2 = this.A06;
        String str = "";
        if (!(bundle2 == null || (string = bundle2.getString("SELECTED_COUNTRY_ISO", str)) == null)) {
            str = string;
        }
        this.A08 = str;
        this.A01 = C108945cZ.A0U(inflate, 2131429688);
        this.A00 = AnonymousClass1HF.A06(inflate, 2131429689);
        WDSSearchView wDSSearchView = (WDSSearchView) AnonymousClass1HF.A06(inflate, 2131434853);
        this.A07 = wDSSearchView;
        if (wDSSearchView != null) {
            wDSSearchView.setBackImageDrawableRes(2131233425);
        }
        WDSSearchView wDSSearchView2 = this.A07;
        if (wDSSearchView2 != null) {
            wDSSearchView2.setHint(2131895483);
        }
        WDSSearchView wDSSearchView3 = this.A07;
        if (wDSSearchView3 != null) {
            wDSSearchView3.setOnQueryTextChangeListener(new AnonymousClass7PB(this, 3));
        }
        return inflate;
    }
}
