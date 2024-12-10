package com.whatsapp.biz.compliance.view;

import X.AGB;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DT;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C003401n;
import X.C137116uw;
import X.C18070vi;
import X.C20334AGq;
import X.C21450AkH;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel;

public class BusinessComplianceDetailActivity extends AnonymousClass1FY {
    public LinearLayout A00;
    public ProgressBar A01;
    public CardView A02;
    public RecyclerView A03;
    public BusinessComplianceViewModel A04;
    public boolean A05;

    public static void A03(BusinessComplianceDetailActivity businessComplianceDetailActivity) {
        if (businessComplianceDetailActivity.A07.A09()) {
            BusinessComplianceViewModel businessComplianceViewModel = businessComplianceDetailActivity.A04;
            Parcelable parcelableExtra = businessComplianceDetailActivity.getIntent().getParcelableExtra("EXTRA_CACHE_JID");
            C18070vi.A0d(parcelableExtra, 0);
            AnonymousClass1DT r1 = businessComplianceViewModel.A01;
            AnonymousClass3MX.A1J(r1, 0);
            if (businessComplianceViewModel.A00.A06() != null) {
                AnonymousClass3MX.A1J(r1, 1);
            } else {
                C21450AkH.A01(businessComplianceViewModel.A03, businessComplianceViewModel, parcelableExtra, 19);
            }
        } else {
            businessComplianceDetailActivity.A01.setVisibility(8);
            businessComplianceDetailActivity.A00.setVisibility(0);
            businessComplianceDetailActivity.A02.setVisibility(8);
        }
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
        }
    }

    public BusinessComplianceDetailActivity(int i) {
        this.A05 = false;
        AGB.A00(this, 19);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624356);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0M(2131887515);
        }
        this.A04 = (BusinessComplianceViewModel) AnonymousClass3MW.A0N(this).A00(BusinessComplianceViewModel.class);
        this.A01 = (ProgressBar) findViewById(2131428512);
        this.A00 = (LinearLayout) findViewById(2131428509);
        this.A02 = (CardView) findViewById(2131428515);
        this.A03 = (RecyclerView) findViewById(2131428513);
        AnonymousClass3Ma.A1C(findViewById(2131428510), this, 31);
        A03(this);
        C20334AGq.A00(this, this.A04.A00, 35);
        C20334AGq.A00(this, this.A04.A01, 36);
    }

    public BusinessComplianceDetailActivity() {
        this(0);
    }
}
