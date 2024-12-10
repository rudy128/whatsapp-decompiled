package com.whatsapp.calling;

import X.AGB;
import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass040;
import X.AnonymousClass11T;
import X.AnonymousClass18K;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1TD;
import X.AnonymousClass1VP;
import X.AnonymousClass1VQ;
import X.AnonymousClass62G;
import X.AnonymousClass74O;
import X.C006002q;
import X.C006302u;
import X.C134126q5;
import X.C178119Bw;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C18030ve;
import X.C195199sx;
import X.C219217x;
import X.C22941Dw;
import X.C22971Dz;
import X.C24051Ir;
import X.C40811vJ;
import X.C89444cT;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoipPermissionsActivity extends AnonymousClass01E implements AnonymousClass009 {
    public AnonymousClass1KB A00;
    public AnonymousClass1VP A01;
    public AnonymousClass1M9 A02;
    public C219217x A03;
    public AnonymousClass1TD A04;
    public C18030ve A05;
    public AnonymousClass18K A06;
    public AnonymousClass1DC A07;
    public AnonymousClass00H A08;
    public C006302u A09;
    public boolean A0A;
    public int A0B;
    public int A0C;
    public GroupJid A0D;
    public C178119Bw A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final Object A0L;
    public volatile C006002q A0M;

    public final C006002q A2x() {
        if (this.A0M == null) {
            synchronized (this.A0L) {
                if (this.A0M == null) {
                    this.A0M = new C006002q(this);
                }
            }
        }
        return this.A0M;
    }

    public VoipPermissionsActivity(int i) {
        this.A0L = C17880vN.A0p();
        this.A0A = false;
        A2L(new AGB(this, 34));
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2x().generatedComponent();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VoipPermissionsActivity onActivityResult got result: ");
        int i3 = i2;
        A10.append(i3);
        A10.append(" for request: ");
        A10.append(i);
        Intent intent2 = intent;
        C17900vP.A0Y(intent2, " data: ", A10);
        if (i != 152 && i != 156) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("VoipPermissionsActivity onActivityResult unhandled request: ");
            A102.append(i);
            C17900vP.A0j(" result: ", A102, i3);
            super.onActivityResult(i, i3, intent2);
        } else if (i3 == -1) {
            boolean z = true;
            if (this.A0E == null) {
                ((C195199sx) this.A08.get()).A01();
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it = this.A0H.iterator();
                while (it.hasNext()) {
                    AnonymousClass1E7 A0E2 = this.A02.A0E(C17880vN.A0Q(it));
                    if (A0E2 != null) {
                        A13.add(A0E2);
                    }
                }
                if (this.A0F != null) {
                    Log.i("VoipPermissionsActivity onActivityResult starting call link lobby");
                    if (this.A0C == 0) {
                        z = false;
                    }
                    C17960vV.A0F(z, "Valid call link lobby entry point required");
                    AnonymousClass1VP r5 = this.A01;
                    AnonymousClass1VQ r52 = (AnonymousClass1VQ) r5;
                    AnonymousClass1VQ.A07(this, r52, this.A0F, "preview_call_link", this.A0C, this.A0J);
                } else if (!TextUtils.isEmpty(this.A0G) && C40811vJ.A0W(this.A05)) {
                    Log.i("VoipPermissionsActivity onActivityResult start precall lobby");
                    this.A01.CO3(this, this.A0D, this.A0G, A13, this.A0C, this.A0J);
                } else if (this.A0K) {
                    Log.i("VoipPermissionsActivity onActivityResult starting voice chat");
                    this.A01.BjT(this, this.A0D, A13, this.A0B, true);
                } else {
                    Log.i("VoipPermissionsActivity onActivityResult starting call");
                    this.A01.CNy(this, this.A0D, A13, this.A0B, this.A0J);
                }
            } else {
                if (this.A0C == 0) {
                    z = false;
                }
                C17960vV.A0F(z, "Valid re-join lobby entry point required");
                this.A01.BhC(this, this.A0E, this.A0C, this.A0I);
            }
        } else if (i == 156 && i2 == 0) {
            AnonymousClass62G r1 = new AnonymousClass62G();
            r1.A00 = "voip_call_fail_phone_perm_denied";
            this.A06.CC7(r1);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        Log.i("voip/VoipPermissionsActivity/onCreate");
        super.onCreate(bundle);
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A2x().A00();
            this.A09 = A002;
            if (A002.A00 == null) {
                A002.A00 = BQQ();
            }
        }
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("join_call_log", false);
        this.A0C = intent.getIntExtra("lobby_entry_point", 0);
        if (booleanExtra) {
            int intExtra = intent.getIntExtra("call_log_transaction_id", -1);
            String stringExtra = intent.getStringExtra("call_log_call_id");
            boolean booleanExtra2 = intent.getBooleanExtra("call_log_from_me", false);
            String stringExtra2 = intent.getStringExtra("call_log_user_jid");
            try {
                C22941Dw r0 = UserJid.Companion;
                this.A0E = this.A04.A07(new C89444cT(intExtra, C22941Dw.A03(stringExtra2), stringExtra, booleanExtra2));
            } catch (AnonymousClass11T unused) {
                Log.e("voip/VoipPermissionsActivity/onCreate invalid jid");
                return;
            }
        } else {
            this.A0F = intent.getStringExtra("call_link_lobby_token");
            ArrayList A0A2 = C22971Dz.A0A(UserJid.class, intent.getStringArrayListExtra("jids"));
            this.A0H = A0A2;
            if (this.A0F == null) {
                C17960vV.A0F(C17880vN.A1X(A0A2), "There must be at least one jid");
            }
            this.A0B = intent.getIntExtra("call_from", -1);
            if (intent.hasExtra("group_jid")) {
                this.A0D = GroupJid.Companion.A03(intent.getStringExtra("group_jid"));
            }
        }
        this.A0J = intent.getBooleanExtra("video_call", false);
        this.A0K = intent.getBooleanExtra("voice_chat", false);
        int intExtra2 = intent.getIntExtra("permission_type", -1);
        this.A0G = intent.getStringExtra("scheduled_id");
        this.A0I = intent.getBooleanExtra("join_and_accept", false);
        if (intExtra2 == 0) {
            AnonymousClass74O.A0B(this, this.A00, this.A03, this.A07, this.A0J);
        } else if (intExtra2 != 1) {
            C17900vP.A0j("voip/VoipPermissionsActivity/onCreate unhandled permissionType: ", AnonymousClass000.A10(), intExtra2);
        } else {
            Log.i("request/permission/checkPhonePermissionForVoipCall");
            C134126q5 r2 = new C134126q5(this);
            r2.A01 = 2131231757;
            r2.A02 = 2131894382;
            r2.A03 = 2131894381;
            r2.A01(new String[]{"android.permission.READ_PHONE_STATE"});
            r2.A06 = true;
            startActivityForResult(r2.A00(), 156);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C006302u r1 = this.A09;
        if (r1 != null) {
            r1.A00 = null;
        }
    }

    public VoipPermissionsActivity() {
        this(0);
        this.A0H = AnonymousClass000.A13();
        this.A0F = null;
    }
}
