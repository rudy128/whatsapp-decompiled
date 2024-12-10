package com.whatsapp.gallery;

import X.AnonymousClass00H;
import X.AnonymousClass190;
import X.AnonymousClass1DC;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass384;
import X.AnonymousClass408;
import X.C108055b3;
import X.C17880vN;
import X.C32211gp;
import X.C57172ie;
import X.C88104Yi;
import android.os.Bundle;
import android.view.View;

public class DocumentsGalleryFragment extends Hilt_DocumentsGalleryFragment implements C108055b3 {
    public AnonymousClass1L9 A00;
    public AnonymousClass190 A01;
    public AnonymousClass1KB A02;
    public C57172ie A03;
    public AnonymousClass384 A04;
    public C88104Yi A05;
    public C32211gp A06;
    public AnonymousClass1DC A07;
    public AnonymousClass00H A08;

    public DocumentsGalleryFragment() {
        super("DocumentsGalleryFragment");
        this.A00 = false;
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        AnonymousClass408 r1 = new AnonymousClass408(this);
        this.A0A = r1;
        this.A02.setAdapter(r1);
        C17880vN.A0E(view, 2131430396).setText(2131892917);
    }
}
