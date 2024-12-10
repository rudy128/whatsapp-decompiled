package com.whatsapp.conversation.selection;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1W2;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass21V;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aU;
import X.AnonymousClass5ZI;
import X.C000200d;
import X.C18070vi;
import X.C72473Md;
import X.C72483Me;
import X.C80133wd;
import X.C91004ez;
import X.C91644g1;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class SelectedImageAndVideoAlbumActivity extends C80133wd {
    public SelectedImageAlbumViewModel A00;
    public AnonymousClass00H A01;
    public boolean A02;

    public SelectedImageAndVideoAlbumActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A04 = AnonymousClass3Ma.A0W(A0K);
            this.A03 = (AnonymousClass5ZI) A0K.A2I.get();
            this.A01 = C000200d.A00(A0K.A10);
        }
    }

    public void A4d() {
        super.A4d();
        A4c().setVisibility(0);
    }

    public void onCreate(Bundle bundle) {
        ArrayList A04;
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("fMessageKeyBundle");
        if (bundleExtra == null) {
            A04 = null;
        } else {
            A04 = AnonymousClass4aU.A04(bundleExtra);
        }
        if (A04 == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        SelectedImageAlbumViewModel selectedImageAlbumViewModel = (SelectedImageAlbumViewModel) AnonymousClass3MW.A0N(this).A00(SelectedImageAlbumViewModel.class);
        this.A00 = selectedImageAlbumViewModel;
        if (selectedImageAlbumViewModel != null) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A04.iterator();
            while (true) {
                if (!it.hasNext()) {
                    selectedImageAlbumViewModel.A00.A0F(A13);
                    selectedImageAlbumViewModel.A01.registerObserver(selectedImageAlbumViewModel.A03.getValue());
                    break;
                }
                AnonymousClass206 A012 = AnonymousClass1W2.A01((AnonymousClass205) it.next(), selectedImageAlbumViewModel.A02);
                if (!(A012 instanceof AnonymousClass21V)) {
                    break;
                }
                A13.add(A012);
            }
            SelectedImageAlbumViewModel selectedImageAlbumViewModel2 = this.A00;
            if (selectedImageAlbumViewModel2 != null) {
                C91644g1.A00(this, selectedImageAlbumViewModel2.A00, AnonymousClass3MW.A16(this, 41), 23);
                return;
            }
        }
        C18070vi.A11("selectedImageAlbumViewModel");
        throw null;
    }

    public SelectedImageAndVideoAlbumActivity(int i) {
        this.A02 = false;
        C91004ez.A00(this, 36);
    }
}
