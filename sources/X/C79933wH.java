package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.3wH  reason: invalid class name and case insensitive filesystem */
public final class C79933wH extends C196289ul {
    public long A00 = -1;
    public String A01;
    public final C18030ve A02;
    public final AnonymousClass689 A03;
    public final AnonymousClass1LU A04;
    public final AnonymousClass00H A05;

    public String A08(Context context, C20285AEt aEt, C20271AEe aEe) {
        C18070vi.A0d(context, 0);
        return C18070vi.A0F(context, 2131892408);
    }

    public void A0B(Activity activity, AnonymousClass5XY r2, AnonymousClass206 r3, C20271AEe aEe, Class cls) {
    }

    public void A0C(Intent intent, AnonymousClass121 r9, AnonymousClass1W6 r10, AnonymousClass10I r11, int i) {
        String str;
        Map map;
        AnonymousClass1W6 r3 = r10;
        C18070vi.A0d(r10, 6);
        if (intent == null || intent.getExtras() == null) {
            str = "SendLocationAction/handleResult/notHandled";
        } else {
            Bundle extras = intent.getExtras();
            C17960vV.A07(extras);
            C18070vi.A0X(extras);
            if (extras.getSerializable("carry_forward_extras") instanceof Map) {
                Map map2 = (Map) extras.getSerializable("carry_forward_extras");
                if (map2 == null) {
                    map = AnonymousClass1D7.A0I();
                } else {
                    map = map2;
                }
                String valueOf = String.valueOf(map.get("message_id"));
                if (map2 == null) {
                    map2 = AnonymousClass1D7.A0I();
                }
                String A0s = C17880vN.A0s("chat_id", map2);
                if (i == -1 && valueOf != null && valueOf.length() != 0 && A0s != null && A0s.length() != 0) {
                    r11.CGF(new C21438Ak5(this, r9, r3, valueOf, A0s, 3));
                    return;
                }
                return;
            }
            str = "SendLocationAction/handleResult/intentExtrasNotFound";
        }
        Log.e(str);
    }

    public boolean A0F(C18030ve r3, C166418cr r4) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 2386);
    }

    public Integer A06() {
        return 904;
    }

    public String A07() {
        return "send_location";
    }

    public C79933wH(C18030ve r3, AnonymousClass1LU r4, AnonymousClass689 r5, AnonymousClass00H r6) {
        C18070vi.A0s(r5, r3, r6, r4);
        this.A03 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r4;
    }

    public void A0A(Activity activity, AnonymousClass5XY r7, AnonymousClass206 r8, C20271AEe aEe, int i) {
        C18070vi.A0i(activity, r8);
        this.A01 = r8.A0v.A01;
        this.A00 = r8.A0x;
        AnonymousClass4MS r4 = (AnonymousClass4MS) this.A05.get();
        C98704ra r3 = new C98704ra(this, activity, 21);
        if (AnonymousClass74O.A0L(activity, r4.A00, r4.A01, 904)) {
            r3.run();
        }
    }

    public int A04() {
        return 2131233353;
    }
}
