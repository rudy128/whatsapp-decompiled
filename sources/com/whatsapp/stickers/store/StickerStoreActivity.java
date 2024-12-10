package com.whatsapp.stickers.store;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MY;
import X.AnonymousClass78P;
import X.AnonymousClass7BQ;
import X.AnonymousClass7RI;
import X.C109005cf;
import X.C111015ho;
import X.C114315qV;
import X.C114335qX;
import X.C114885s9;
import X.C124176Xi;
import X.C136836uU;
import X.C142707Am;
import X.C142747Aq;
import X.C18000vb;
import X.C37891qK;
import X.C90594eK;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;

public class StickerStoreActivity extends C114885s9 {
    public ViewPager A00;
    public BottomSheetBehavior A01;
    public C18000vb A02;
    public C90594eK A03 = null;
    public C111015ho A04;
    public StickerStoreFeaturedTabFragment A05;
    public StickerStoreMyTabFragment A06;
    public AnonymousClass00H A07;
    public String A08;
    public View A09;
    public TabLayout A0A;

    private void A03(Fragment fragment, int i) {
        this.A04.A00.add(fragment);
        TabLayout tabLayout = this.A0A;
        C136836uU A072 = tabLayout.A07();
        A072.A01(i);
        tabLayout.A0F(A072);
    }

    public void A4b(int i) {
        String string = getString(i);
        C90594eK A002 = C124176Xi.A00(findViewById(2131429520), this, this.A08, string, AnonymousClass000.A13());
        this.A03 = A002;
        A002.A07(AnonymousClass7RI.A00(this, 21));
        this.A03.A03();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && this.A04 != null) {
            if (i2 == 1) {
                A4b(2131896439);
                this.A00.postDelayed(AnonymousClass7RI.A00(this, 23), 300);
            } else if (i2 == 2) {
                A4b(2131896457);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.whatsapp.stickers.store.StickerStoreMyTabFragment, com.whatsapp.stickers.store.Hilt_StickerStoreMyTabFragment] */
    public void onCreate(Bundle bundle) {
        Fragment fragment;
        int i;
        super.onCreate(bundle);
        setContentView(2131627114);
        View view = this.A00;
        this.A09 = view;
        View findViewById = view.findViewById(2131435836);
        this.A0A = (TabLayout) this.A09.findViewById(2131435774);
        this.A00 = (ViewPager) this.A09.findViewById(2131435772);
        this.A04 = new C111015ho(getSupportFragmentManager());
        this.A05 = new StickerStoreFeaturedTabFragment();
        this.A06 = new Hilt_StickerStoreMyTabFragment();
        this.A05.A09 = AnonymousClass000.A1X(bundle);
        this.A0A.setLayoutDirection(0);
        if (AnonymousClass3MY.A1b(this.A02)) {
            A03(this.A05, 2131896504);
            fragment = this.A06;
            i = 2131896506;
        } else {
            A03(this.A06, 2131896506);
            fragment = this.A05;
            i = 2131896504;
        }
        A03(fragment, i);
        this.A00.setAdapter(this.A04);
        this.A00.A0K(new C142747Aq(this.A0A));
        this.A00.A0K(new C142707Am(this, 2));
        this.A08 = StickerStoreFeaturedTabFragment.class.getName();
        this.A00.A0J(AnonymousClass3MY.A1b(this.A02) ^ true ? 1 : 0, false);
        this.A0A.A0E(new AnonymousClass7BQ(this, 3));
        Toolbar toolbar = (Toolbar) findViewById.findViewById(2131436270);
        C109005cf.A0O(this, toolbar, this.A02);
        toolbar.setNavigationContentDescription(2131896497);
        toolbar.setTitle(2131896513);
        AnonymousClass1Y5.A0A(toolbar, true);
        toolbar.setNavigationOnClickListener(new AnonymousClass78P((Object) this, 28));
        C114335qX r0 = new C114335qX(this);
        this.A01 = r0;
        r0.A0d(true);
        this.A01.A0W(4);
        this.A01.A0h = true;
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        ((C37891qK) findViewById.getLayoutParams()).A00(bottomSheetBehavior);
        C114315qV.A00(bottomSheetBehavior, this, 15);
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 4) {
            this.A09.post(AnonymousClass7RI.A00(this, 22));
        }
    }
}
