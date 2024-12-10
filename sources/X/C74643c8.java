package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;

/* renamed from: X.3c8  reason: invalid class name and case insensitive filesystem */
public class C74643c8 extends C74663cA {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74643c8(ChangeEphemeralSettingActivity changeEphemeralSettingActivity) {
        super(changeEphemeralSettingActivity, AnonymousClass1YL.A00(changeEphemeralSettingActivity, 2130968627, 2131099690));
        this.A00 = 2;
        this.A01 = changeEphemeralSettingActivity;
    }

    public void onClick(View view) {
        Intent A012;
        ChangeEphemeralSettingActivity changeEphemeralSettingActivity;
        switch (this.A00) {
            case 0:
                ((AnonymousClass3Vh) this.A01).A0A.A0E(AnonymousClass4CQ.OPEN_GROUP_PRIVACY_SETTINGS);
                return;
            case 1:
                AnonymousClass4ZP r5 = AnonymousClass4ZP.A00;
                C97924qH r4 = (C97924qH) this.A01;
                r5.A01(r4.A00, r4.A0B, r4.A0D, 4);
                C133326oZ r2 = r4.A03;
                AnonymousClass01E r3 = r4.A02;
                A012 = r2.A01(r3.getApplicationContext(), "privacy_groupadd");
                changeEphemeralSettingActivity = r3;
                break;
            default:
                ChangeEphemeralSettingActivity changeEphemeralSettingActivity2 = (ChangeEphemeralSettingActivity) this.A01;
                int i = 4;
                if (C22971Dz.A0d(AnonymousClass3MW.A0h(changeEphemeralSettingActivity2.A0F))) {
                    i = 3;
                }
                A012 = C17880vN.A0A();
                AnonymousClass1LU.A1q(changeEphemeralSettingActivity2, A012, i);
                changeEphemeralSettingActivity = changeEphemeralSettingActivity2;
                break;
        }
        changeEphemeralSettingActivity.startActivity(A012);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74643c8(Context context, Object obj, int i) {
        super(context, AnonymousClass1YL.A00(context, 2130968627, 2131099690));
        this.A00 = i;
        this.A01 = obj;
    }
}
