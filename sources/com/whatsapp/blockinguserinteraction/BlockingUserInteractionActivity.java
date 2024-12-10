package com.whatsapp.blockinguserinteraction;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DP;
import X.AnonymousClass1DQ;
import X.AnonymousClass1DT;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.C000200d;
import X.C006602x;
import X.C18070vi;
import X.C22851Dl;
import X.C27431Wb;
import X.C28901bF;
import X.C65042vk;
import X.C90994ey;
import X.C91574fu;
import android.content.Intent;
import android.os.Bundle;

public final class BlockingUserInteractionActivity extends AnonymousClass1FU {
    public AnonymousClass1DQ A00;
    public C27431Wb A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public void onCreate(Bundle bundle) {
        String str;
        C22851Dl r2;
        AnonymousClass1DT r0;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("blocking_type", 0);
        if (intExtra == 0) {
            setContentView(2131624020);
            C27431Wb r1 = this.A01;
            if (r1 != null) {
                r2 = new C91574fu(this, 8);
                r0 = r1.A03;
            } else {
                str = "messageStoreBackup";
                C18070vi.A11(str);
                throw null;
            }
        } else if (intExtra == 1) {
            setTitle(2131892337);
            setContentView(2131624048);
            AnonymousClass1DQ r12 = this.A00;
            if (r12 != null) {
                r2 = new C65042vk(this, 8);
                r0 = ((AnonymousClass1DP) r12).A00;
            } else {
                str = "forceBlockDatabaseMigrationManager";
                C18070vi.A11(str);
                throw null;
            }
        } else {
            return;
        }
        r0.A0A(this, r2);
    }

    public static final void A03(BlockingUserInteractionActivity blockingUserInteractionActivity) {
        AnonymousClass00H r0 = blockingUserInteractionActivity.A02;
        if (r0 != null) {
            r0.get();
            Intent action = AnonymousClass1LU.A02(blockingUserInteractionActivity.getApplicationContext()).setAction(C28901bF.A02);
            C18070vi.A0X(action);
            blockingUserInteractionActivity.finish();
            blockingUserInteractionActivity.startActivity(action);
            blockingUserInteractionActivity.overridePendingTransition(0, 0);
            return;
        }
        C18070vi.A11("waIntents");
        throw null;
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0J = AnonymousClass1FB.A0J((AnonymousClass1K1) ((C006602x) generatedComponent()), this);
            AnonymousClass1FB.A0M(A0J, this);
            AnonymousClass10G r1 = A0J.A00;
            AnonymousClass1FB.A0K(A0J, r1, this, r1.A45);
            this.A0G = C000200d.A00(r1.A5A);
            this.A00 = AnonymousClass10E.A7j(A0J);
            this.A01 = (C27431Wb) A0J.A6f.get();
            this.A02 = C000200d.A00(A0J.ABd);
        }
    }

    public BlockingUserInteractionActivity(int i) {
        this.A03 = false;
        A2L(new C90994ey(this, 16));
    }

    public BlockingUserInteractionActivity() {
        this(0);
    }
}
