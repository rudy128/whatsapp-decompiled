package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass79Z;
import X.AnonymousClass7Ci;
import X.AnonymousClass7Ck;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C1598386b;
import X.C17880vN;
import X.C18070vi;
import X.C63932tv;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class AiImagineBottomSheetLauncher extends AnonymousClass1FU {
    public AiImagineBottomSheet A00;
    public AnonymousClass00H A01;
    public boolean A02;

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r0 = A0A.A00;
            C109005cf.A0d(A0A, r0, this);
            C63932tv.A08(this, C000200d.A00(r0.A5A));
            this.A00 = AnonymousClass1K1.A0G(A0K);
            this.A01 = C000200d.A00(A0A.A12);
        }
    }

    public AiImagineBottomSheetLauncher(int i) {
        this.A02 = false;
        AnonymousClass79Z.A00(this, 22);
    }

    public static final void A03(Uri uri, Bundle bundle, AiImagineBottomSheetLauncher aiImagineBottomSheetLauncher, String str) {
        C18070vi.A0k(str, bundle);
        if (str.hashCode() == 1905382724 && str.equals("IMAGINE_BOTTOM_SHEET_REQUEST_KEY")) {
            int i = 0;
            if (bundle.getBoolean("IMAGINE_BOTTOM_SHEET_SEND_RESULT")) {
                i = -1;
            }
            Intent A0A = C17880vN.A0A();
            A0A.setData(uri);
            A0A.putExtra("output_uri", uri);
            A0A.putExtra("skip_cropping", true);
            aiImagineBottomSheetLauncher.setResult(i, A0A);
            aiImagineBottomSheetLauncher.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(getIntent().getStringExtra("chat_jid"));
        Uri uri = (Uri) getIntent().getParcelableExtra("output_uri");
        int intExtra = getIntent().getIntExtra("entry_point", 1);
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            AnonymousClass3MW.A0W(r0).A07(this, new AnonymousClass7Ci(uri, this, A0l, intExtra), new AnonymousClass7Ck(this, A0l, intExtra), (C1598386b) null);
            return;
        }
        C18070vi.A11("bonsaiUiUtilLazy");
        throw null;
    }

    public AiImagineBottomSheetLauncher() {
        this(0);
    }
}
