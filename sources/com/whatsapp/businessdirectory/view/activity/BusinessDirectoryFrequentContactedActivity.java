package com.whatsapp.businessdirectory.view.activity;

import X.A6I;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass6B0;
import X.AnonymousClass79Z;
import X.AnonymousClass7AN;
import X.C003401n;
import X.C108955ca;
import X.C109005cf;
import X.C192609og;
import X.C41731wy;
import X.C72463Mc;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryFrequentContactedViewModel;
import java.util.Map;

public class BusinessDirectoryFrequentContactedActivity extends AnonymousClass1FY {
    public A6I A00;
    public C192609og A01;
    public BusinessDirectoryFrequentContactedViewModel A02;
    public AnonymousClass6B0 A03;
    public boolean A04;

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A03 = AnonymousClass1K1.A1J(A0K);
            this.A01 = AnonymousClass1K1.A0O(A0K);
            this.A00 = AnonymousClass1K1.A0M(A0K);
        }
    }

    public BusinessDirectoryFrequentContactedActivity(int i) {
        this.A04 = false;
        AnonymousClass79Z.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624051);
        C003401n A0S = C72463Mc.A0S(this, AnonymousClass3Ma.A0F(this));
        A0S.A0M(2131887039);
        A0S.A0W(true);
        this.A02 = (BusinessDirectoryFrequentContactedViewModel) AnonymousClass3MW.A0N(this).A00(BusinessDirectoryFrequentContactedViewModel.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131434428);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        AnonymousClass6B0 r1 = this.A03;
        BusinessDirectoryFrequentContactedViewModel businessDirectoryFrequentContactedViewModel = this.A02;
        r1.A00 = businessDirectoryFrequentContactedViewModel;
        r1.A00 = businessDirectoryFrequentContactedViewModel;
        recyclerView.setAdapter(r1);
        AnonymousClass7AN.A00(this, this.A02.A00, 7);
        AnonymousClass7AN.A00(this, this.A02.A02, 8);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.6UH] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        BusinessDirectoryFrequentContactedViewModel businessDirectoryFrequentContactedViewModel = this.A02;
        businessDirectoryFrequentContactedViewModel.A01.A08((Integer) null, AnonymousClass3MY.A0f(), (Map) null, 12, 83, 1);
        C41731wy r2 = businessDirectoryFrequentContactedViewModel.A02;
        ? obj = new Object();
        obj.A00 = 2;
        r2.A0E(obj);
        return true;
    }

    public BusinessDirectoryFrequentContactedActivity() {
        this(0);
    }
}
