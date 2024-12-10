package com.whatsapp.ml.v2.storageusage;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass5IS;
import X.AnonymousClass5IT;
import X.AnonymousClass5IU;
import X.AnonymousClass5TJ;
import X.C003401n;
import X.C106205Uy;
import X.C18100vl;
import X.C30391dr;
import X.C38391rD;
import X.C41561wd;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import X.C91644g1;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

public final class MLModelStorageUsageActivity extends AnonymousClass1FY {
    public boolean A00;
    public final C18100vl A01;
    public final C18100vl A02;
    public final C18100vl A03;

    public MLModelStorageUsageActivity() {
        this(0);
        this.A02 = AnonymousClass1DF.A01(new AnonymousClass5IT(this));
        this.A01 = AnonymousClass1DF.A01(new AnonymousClass5IS(this));
        this.A03 = AnonymousClass1DF.A01(new AnonymousClass5IU(this));
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131626068);
        C003401n A0K = AnonymousClass3MY.A0K(this, AnonymousClass3Ma.A0F(this));
        if (A0K != null) {
            A0K.A0M(2131899364);
            A0K.A0W(true);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(2131434428);
        AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
        recyclerView.setAdapter((C38391rD) this.A01.getValue());
        C18100vl r5 = this.A03;
        MLModelStorageUsageViewModel mLModelStorageUsageViewModel = (MLModelStorageUsageViewModel) r5.getValue();
        AnonymousClass3MW.A1X(mLModelStorageUsageViewModel.A04, new MLModelStorageUsageViewModel$loadData$1(mLModelStorageUsageViewModel, (C30391dr) null), C41561wd.A00(mLModelStorageUsageViewModel));
        C91644g1.A00(this, ((MLModelStorageUsageViewModel) r5.getValue()).A01, new AnonymousClass5TJ(this), 49);
        C91644g1.A00(this, ((MLModelStorageUsageViewModel) r5.getValue()).A00, new C106205Uy(recyclerView, this), 49);
    }

    public MLModelStorageUsageActivity(int i) {
        this.A00 = false;
        C91014f0.A00(this, 47);
    }
}
