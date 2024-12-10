package com.whatsapp.dogfood;

import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass4S3;
import X.C18070vi;
import X.C200410p;
import X.C34071js;
import X.C80653xj;
import X.C80673xl;
import X.C86774Ta;
import X.C87704Wq;

public final class DogfooderDiagnosticsViewModel extends AnonymousClass1J2 {
    public final C87704Wq A00;
    public final AnonymousClass1G1 A01;
    public final AnonymousClass1G4 A02;

    public DogfooderDiagnosticsViewModel(C87704Wq r6) {
        C18070vi.A0d(r6, 1);
        this.A00 = r6;
        AnonymousClass1G7 A002 = C34071js.A00(C200410p.A0P(new C86774Ta[]{A0T(1), A0T(3), A0T(4)}));
        this.A02 = A002;
        this.A01 = A002;
    }

    public final C86774Ta A0T(int i) {
        String str;
        AnonymousClass4S3 A002 = C87704Wq.A00(this.A00, i);
        if (A002 == null || !A002.A01()) {
            return null;
        }
        if (A002 instanceof C80673xl) {
            str = "Ghost view detected";
        } else if (A002 instanceof C80653xj) {
            str = "You have crashed";
        } else {
            str = "Slow Conversation Row Detected";
        }
        return new C86774Ta(i, str);
    }
}
