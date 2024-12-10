package com.whatsapp.conversation.conversationrow.link;

import X.A5M;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass12Q;
import X.AnonymousClass18K;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L8;
import X.AnonymousClass1W6;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4X7;
import X.C102475Gp;
import X.C102485Gq;
import X.C102495Gr;
import X.C102505Gs;
import X.C102515Gt;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C81423zD;
import X.C89914dE;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public final class LinkLongPressBottomSheet extends Hilt_LinkLongPressBottomSheet {
    public AnonymousClass1L8 A00;
    public AnonymousClass1KB A01;
    public A5M A02;
    public AnonymousClass11C A03;
    public C18030ve A04;
    public AnonymousClass18K A05;
    public AnonymousClass1W6 A06;
    public AnonymousClass10I A07;
    public final AnonymousClass4X7 A08 = ((AnonymousClass4X7) AnonymousClass12Q.A01(16430));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C102475Gp(this));
    public final C18100vl A0A = AnonymousClass1DF.A01(new C102485Gq(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new C102495Gr(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C102505Gs(this));
    public final C18100vl A0D = AnonymousClass1DF.A01(new C102515Gt(this));

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C17880vN.A0E(view, 2131432021).setText(this.A0D.getValue().toString());
        C89914dE.A00(view.findViewById(2131429669), this, 19);
        C89914dE.A00(view.findViewById(2131433295), this, 20);
        View findViewById = view.findViewById(2131434910);
        if (!C72453Mb.A1a(this.A0B) || !C72453Mb.A1a(this.A0A)) {
            findViewById.setVisibility(8);
        }
        C89914dE.A00(findViewById, this, 21);
    }

    public static final void A00(Uri uri, LinkLongPressBottomSheet linkLongPressBottomSheet) {
        A01(linkLongPressBottomSheet, 8);
        AnonymousClass1L8 r2 = linkLongPressBottomSheet.A00;
        if (r2 != null) {
            r2.CGU(linkLongPressBottomSheet.A14(), uri, (AnonymousClass206) null);
            linkLongPressBottomSheet.A28();
            return;
        }
        C18070vi.A11("activityLauncher");
        throw null;
    }

    public static final void A01(LinkLongPressBottomSheet linkLongPressBottomSheet, int i) {
        C81423zD r1 = new C81423zD();
        r1.A02 = Integer.valueOf(i);
        r1.A01 = AnonymousClass3MY.A0f();
        r1.A00 = C17880vN.A0h();
        AnonymousClass18K r0 = linkLongPressBottomSheet.A05;
        if (r0 != null) {
            r0.CC7(r1);
        } else {
            AnonymousClass3MW.A1J();
            throw null;
        }
    }

    public int A2F() {
        return 2131625814;
    }
}
