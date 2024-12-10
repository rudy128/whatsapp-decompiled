package com.whatsapp.gallery;

import X.AnonymousClass00H;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1QB;
import X.AnonymousClass385;
import X.AnonymousClass407;
import X.C108055b3;
import X.C108355bZ;
import X.C131596lM;
import X.C17880vN;
import X.C200710s;
import X.C32011gU;
import X.C32021gV;
import X.C36391no;
import X.C37471pb;
import X.C88104Yi;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class LinksGalleryFragment extends Hilt_LinksGalleryFragment implements C108055b3 {
    public AnonymousClass1L9 A00;
    public C108355bZ A01;
    public C37471pb A02;
    public AnonymousClass1QB A03;
    public C88104Yi A04;
    public C36391no A05;
    public AnonymousClass1KW A06;
    public C131596lM A07;
    public C32011gU A08;
    public AnonymousClass385 A09;
    public C32021gV A0A;
    public AnonymousClass00H A0B;

    public LinksGalleryFragment() {
        super("LinksGalleryFragment");
        this.A00 = false;
    }

    public void A1x(Context context) {
        super.A1x(context);
        this.A02 = new C37471pb(C200710s.A00(this.A0F));
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        AnonymousClass407 r1 = new AnonymousClass407(this);
        this.A0A = r1;
        this.A02.setAdapter(r1);
        C17880vN.A0E(view, 2131430396).setText(2131892970);
    }
}
