package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.4YQ  reason: invalid class name */
public final class AnonymousClass4YQ {
    public static final C63842tm A03 = new Object();
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final void A01(Context context, Uri uri, Integer num, boolean z) {
        AnonymousClass1FU r1;
        AnonymousClass1FU r12;
        AnonymousClass1FU r3;
        if (C18020vd.A00(C18040vf.A02, ((AnonymousClass1c4) C18070vi.A0E(this.A00)).A02, 3877) == 0) {
            Activity A002 = AnonymousClass1L9.A00(context);
            if ((A002 instanceof AnonymousClass1FU) && (r3 = (AnonymousClass1FU) A002) != null) {
                C18070vi.A0X(this.A02.get());
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(context.getPackageName(), "com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListActivity");
                A0A.putExtra("is_external_link", z);
                r3.CNh(A0A, 555);
                return;
            }
            return;
        }
        int intValue = num.intValue();
        if (uri != null) {
            Activity A003 = AnonymousClass1L9.A00(context);
            if (!(A003 instanceof AnonymousClass1FU) || (r12 = (AnonymousClass1FU) A003) == null || r12.A00 == null) {
                A00(context, uri);
                return;
            }
        }
        int i = 2131892624;
        if (intValue == 0) {
            i = 2131892741;
        }
        Activity A004 = AnonymousClass1L9.A00(context);
        if ((A004 instanceof AnonymousClass1FU) && (r1 = (AnonymousClass1FU) A004) != null) {
            r1.BhQ(i);
        }
    }

    public final void A00(Context context, Uri uri) {
        C18070vi.A0X(this.A02.get());
        Intent A022 = AnonymousClass1LU.A02(context);
        A022.setAction(C28901bF.A03);
        A022.setAction("android.intent.action.VIEW");
        A022.setData(uri);
        context.startActivity(A022);
    }

    public AnonymousClass4YQ(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A02(Context context, Integer num) {
        AnonymousClass1FU r1;
        Activity A002 = AnonymousClass1L9.A00(context);
        if ((A002 instanceof AnonymousClass1FU) && (r1 = (AnonymousClass1FU) A002) != null) {
            num.intValue();
            r1.A3v(new C92074gi(r1, this, 2), 2131892830, 2131892829, 2131892496, 2131892495);
        }
    }
}
