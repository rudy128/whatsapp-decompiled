package com.whatsapp.calling;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass17P;
import X.AnonymousClass1FP;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass48l;
import X.C110885hR;
import X.C1598886g;
import X.C17960vV;
import X.C18070vi;
import X.C221618v;
import X.C40751vD;
import X.C72453Mb;
import X.C72473Md;
import X.C90994ey;
import X.C93094iQ;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Locale;

public class VoipAppUpdateActivity extends AnonymousClass1FP {
    public C40751vD A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final C1598886g A03;

    public VoipAppUpdateActivity() {
        this(0);
        this.A01 = C221618v.A00(AnonymousClass17P.class);
        this.A03 = new C93094iQ(this, 0);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            this.A05 = AnonymousClass10E.AL1(A0L);
            this.A00 = C72453Mb.A0d(A0L);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (getIntent().hasExtra("feature") || getIntent().hasExtra("feature_type")) {
            AnonymousClass3Ma.A1H(getWindow(), AnonymousClass3Ma.A00(this, 2130970796, 2131102217));
            getWindow().addFlags(2621440);
            setContentView(2131627479);
            AnonymousClass48l.A00(C110885hR.A0A(this, 2131428811), this, 9);
            AnonymousClass48l.A00(C110885hR.A0A(this, 2131436561), this, 10);
            C1598886g r1 = this.A03;
            C18070vi.A0d(r1, 0);
            ((AnonymousClass17P) this.A01.get()).A00.add(r1);
            boolean hasExtra = getIntent().hasExtra("feature_type");
            Intent intent = getIntent();
            if (hasExtra) {
                i = intent.getIntExtra("feature_type", 0);
            } else {
                String upperCase = intent.getStringExtra("feature").toUpperCase(Locale.ROOT);
                if (!upperCase.equals("AUDIO_CHAT_RECEIVER")) {
                    i = 1;
                    if (!upperCase.equals("SCREEN_SHARING_RECEIVER")) {
                        i = 0;
                    }
                } else {
                    i = 2;
                }
            }
            TextView A0I = AnonymousClass3MW.A0I(this, 2131436936);
            int i2 = 2131891832;
            if (i != 2) {
                i2 = 2131898102;
            }
            AnonymousClass3MY.A0x(this, A0I, i2);
            TextView A0I2 = AnonymousClass3MW.A0I(this, 2131436935);
            int i3 = 2131891831;
            if (i != 2) {
                i3 = 2131898101;
            }
            AnonymousClass3MY.A0x(this, A0I2, i3);
            return;
        }
        C17960vV.A0F(false, "VoipAppUpdateActivity/onCreate no feature extra");
    }

    public void onDestroy() {
        super.onDestroy();
        C1598886g r1 = this.A03;
        C18070vi.A0d(r1, 0);
        ((AnonymousClass17P) this.A01.get()).A00.remove(r1);
    }

    public VoipAppUpdateActivity(int i) {
        this.A02 = false;
        C90994ey.A00(this, 22);
    }
}
