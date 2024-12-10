package com.whatsapp.dogfood;

import X.AnonymousClass11P;
import X.AnonymousClass1J2;
import X.AnonymousClass4DY;
import X.C18070vi;
import X.C24521Kq;
import X.C87704Wq;

public final class MuteDiagnosticsDialogViewModel extends AnonymousClass1J2 {
    public AnonymousClass4DY A00;
    public final C87704Wq A01;
    public final AnonymousClass11P A02;
    public final C24521Kq A03;

    public MuteDiagnosticsDialogViewModel(AnonymousClass11P r7, C24521Kq r8, C87704Wq r9) {
        AnonymousClass4DY r1;
        C18070vi.A0o(r7, r9, r8);
        this.A02 = r7;
        this.A01 = r9;
        this.A03 = r8;
        C24521Kq r0 = C24521Kq.$redex_init_class;
        AnonymousClass4DY[] values = AnonymousClass4DY.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = AnonymousClass4DY.A02;
                break;
            }
            r1 = values[i];
            if (r1.id == -1) {
                break;
            }
            i++;
        }
        this.A00 = r1;
    }
}
