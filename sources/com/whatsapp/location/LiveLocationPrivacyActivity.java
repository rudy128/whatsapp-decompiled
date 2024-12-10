package com.whatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass112;
import X.AnonymousClass11P;
import X.AnonymousClass195;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1J8;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass205;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass74O;
import X.AnonymousClass757;
import X.AnonymousClass79I;
import X.AnonymousClass79J;
import X.C003401n;
import X.C010105w;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C109005cf;
import X.C110245fA;
import X.C110885hR;
import X.C1423279a;
import X.C144687Ih;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C219217x;
import X.C24921Me;
import X.C27131Uv;
import X.C27201Vd;
import X.C37451pZ;
import X.C54882er;
import X.C72273Lh;
import X.C72453Mb;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LiveLocationPrivacyActivity extends AnonymousClass1FY {
    public View A00;
    public ListView A01;
    public AnonymousClass195 A02;
    public C24921Me A03;
    public C37451pZ A04;
    public C27201Vd A05;
    public C219217x A06;
    public AnonymousClass1LU A07;
    public C110245fA A08;
    public C27131Uv A09;
    public AnonymousClass00H A0A;
    public View A0B;
    public View A0C;
    public Button A0D;
    public ScrollView A0E;
    public boolean A0F;
    public final List A0G;
    public final C72273Lh A0H;

    public static void A03(LiveLocationPrivacyActivity liveLocationPrivacyActivity) {
        ArrayList A11;
        List list = liveLocationPrivacyActivity.A0G;
        list.clear();
        C27131Uv r9 = liveLocationPrivacyActivity.A09;
        synchronized (r9.A0U) {
            Map A062 = C27131Uv.A06(r9);
            A11 = C72453Mb.A11(A062);
            long A012 = AnonymousClass11P.A01(r9.A0D);
            Iterator A0l = C17890vO.A0l(A062);
            while (A0l.hasNext()) {
                C54882er r5 = (C54882er) A0l.next();
                if (C27131Uv.A0G(r5.A01, A012)) {
                    AnonymousClass1M9 r4 = r9.A0A;
                    AnonymousClass205 r3 = r5.A02;
                    AnonymousClass1BI r0 = r3.A00;
                    C17960vV.A07(r0);
                    C108965cb.A1Q(r4.A0E(r0), r3, A11);
                }
            }
        }
        list.addAll(A11);
        liveLocationPrivacyActivity.A08.notifyDataSetChanged();
        if (list.isEmpty()) {
            liveLocationPrivacyActivity.A0C.setVisibility(8);
            liveLocationPrivacyActivity.A0B.setVisibility(8);
            liveLocationPrivacyActivity.A01.setVisibility(8);
            liveLocationPrivacyActivity.A0E.setVisibility(0);
            liveLocationPrivacyActivity.A0D.setVisibility(8);
            return;
        }
        C18000vb r52 = liveLocationPrivacyActivity.A00;
        long size = (long) list.size();
        Object[] A1a = AnonymousClass3MW.A1a();
        C108985cd.A1S(list, A1a, 0);
        String A0K = r52.A0K(A1a, 2131755217, size);
        View view = liveLocationPrivacyActivity.A0C;
        if (view instanceof WaTextView) {
            ((TextView) view).setText(A0K);
        } else if (view instanceof WDSSectionHeader) {
            ((WDSSectionHeader) view).setHeaderText(A0K);
        }
        liveLocationPrivacyActivity.A0C.setVisibility(0);
        liveLocationPrivacyActivity.A0B.setVisibility(0);
        liveLocationPrivacyActivity.A0E.setVisibility(8);
        liveLocationPrivacyActivity.A01.setVisibility(0);
        liveLocationPrivacyActivity.A0D.setVisibility(0);
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0c(A0A2, r1, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A07 = AnonymousClass3MY.A0Z(A0A2);
            this.A05 = AnonymousClass3MZ.A0i(A0A2);
            this.A03 = AnonymousClass3MZ.A0g(A0A2);
            this.A0A = AnonymousClass3MX.A12(A0A2);
            this.A06 = AnonymousClass3Ma.A0b(A0A2);
            this.A09 = (C27131Uv) A0A2.A5p.get();
            this.A02 = (AnonymousClass195) A0A2.A0L.get();
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i != 0) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(2131891789);
        A002.A0T(true);
        A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
        AnonymousClass757.A01(A002, this, 48, 2131891787);
        C010105w create = A002.create();
        create.A05();
        return create;
    }

    public LiveLocationPrivacyActivity(int i) {
        this.A0F = false;
        C1423279a.A00(this, 10);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (AnonymousClass112.A0A() && i == 0 && i2 == -1) {
            LocationSharingService.A03(getApplicationContext(), this.A02, this.A06, this.A09);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        View inflate;
        super.onCreate(bundle);
        AnonymousClass74O.A0K(this, this.A06, 2131894349, 2131894348, 0);
        setContentView(2131625878);
        View A0A2 = C110885hR.A0A(this, 2131432141);
        if (A0A2 instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) A0A2;
            int i = 2131625879;
            if (AnonymousClass1J8.A05(this.A0E)) {
                i = 2131625880;
            }
            viewStub.setLayoutResource(i);
            viewStub.inflate();
        }
        C003401n A0J = AnonymousClass3MY.A0J(this);
        A0J.A0W(true);
        A0J.A0M(2131895985);
        this.A04 = this.A05.A06(this, "live-location-privacy-activity");
        this.A08 = new C110245fA(this);
        this.A01 = (ListView) findViewById(2131432113);
        boolean A052 = AnonymousClass1J8.A05(this.A0E);
        LayoutInflater layoutInflater = getLayoutInflater();
        if (A052) {
            inflate = layoutInflater.inflate(2131625876, (ViewGroup) null, false);
            this.A0C = inflate;
        } else {
            inflate = layoutInflater.inflate(2131625875, (ViewGroup) null, false);
            this.A0C = inflate.findViewById(2131436208);
        }
        inflate.setImportantForAccessibility(2);
        this.A0E = (ScrollView) findViewById(2131432140);
        this.A00 = findViewById(2131428324);
        this.A0D = (Button) findViewById(2131435806);
        this.A01.addHeaderView(inflate);
        LayoutInflater layoutInflater2 = getLayoutInflater();
        int i2 = 2131625879;
        if (AnonymousClass1J8.A05(this.A0E)) {
            i2 = 2131625880;
        }
        View inflate2 = layoutInflater2.inflate(i2, (ViewGroup) null, false);
        this.A0B = inflate2;
        this.A01.addFooterView(inflate2);
        this.A01.setOnItemClickListener(new AnonymousClass79J(this, 5));
        this.A01.setAdapter(this.A08);
        this.A01.setOnScrollListener(new AnonymousClass79I(this, getResources().getDimensionPixelSize(2131168631)));
        AnonymousClass3Ma.A1D(this.A0D, this, 3);
        A03(this);
        C27131Uv r0 = this.A09;
        r0.A0W.add(this.A0H);
    }

    public void onDestroy() {
        super.onDestroy();
        C27131Uv r0 = this.A09;
        r0.A0W.remove(this.A0H);
        C37451pZ r02 = this.A04;
        if (r02 != null) {
            r02.A02();
        }
    }

    public void onResume() {
        super.onResume();
        if (!AnonymousClass112.A0A() || this.A06.A06()) {
            LocationSharingService.A03(getApplicationContext(), this.A02, this.A06, this.A09);
        }
    }

    public LiveLocationPrivacyActivity() {
        this(0);
        this.A0G = AnonymousClass000.A13();
        this.A0H = new C144687Ih(this, 1);
    }
}
