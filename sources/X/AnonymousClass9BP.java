package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9BP  reason: invalid class name */
public class AnonymousClass9BP extends A34 {
    public WeakReference A00;
    public Map A01;
    public final Bundle A02;
    public final C132216mP A03;
    public final AnonymousClass11E A04;
    public final AnonymousClass11C A05;
    public final C219217x A06;
    public final AnonymousClass770 A07;
    public final AnonymousClass1MB A08;
    public final A98 A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final AnonymousClass1LU A0E;

    public AnonymousClass9BP(Bundle bundle, AnonymousClass1FU r3, C132216mP r4, AnonymousClass11E r5, AnonymousClass11C r6, C219217x r7, AnonymousClass770 r8, AnonymousClass1MB r9, AnonymousClass1LU r10, A98 a98, String str, boolean z, boolean z2, boolean z3) {
        super(r3, true);
        this.A00 = AnonymousClass3MW.A0z(r3);
        this.A03 = r4;
        this.A0E = r10;
        this.A05 = r6;
        this.A08 = r9;
        this.A09 = a98;
        this.A04 = r5;
        this.A06 = r7;
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A0A = str;
        this.A02 = bundle;
        this.A07 = r8;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Intent intent;
        String str;
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A00);
        if (A0Z != null && !A0Z.Bed()) {
            A0Z.CEx();
            int i = null;
            if (!this.A04.A09()) {
                Log.i("checksystemstatus/no-connectivity");
                AnonymousClass1XH.A01(A0Z, (Integer) null, 2131894981, (Integer) null, new String[]{A0Z.getString(2131888733)});
                return;
            }
            Map map = this.A01;
            if (map == null || map.size() == 0) {
                Log.i("checksystemstatus/no-server-status");
                if (this.A0C) {
                    AnonymousClass1XH.A01(A0Z, (Integer) null, 2131895941, (Integer) null, (Object[]) null);
                    return;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                boolean z = this.A0B;
                if (z) {
                    str = "chat";
                } else {
                    str = "reg";
                }
                A10.append(str);
                String A0y = AnonymousClass000.A0y("-unknown", A10);
                if (z) {
                    i = 1;
                }
                C132216mP r3 = this.A03;
                boolean A002 = this.A08.A00();
                String str2 = this.A0A;
                intent = r3.A00.A00(this.A02, this.A07, i, str2, A0y, (ArrayList) null, (ArrayList) null, A002);
            } else {
                ArrayList A13 = AnonymousClass000.A13();
                Iterator A0x = AnonymousClass8BU.A0x(this.A01);
                boolean z2 = true;
                boolean z3 = true;
                while (A0x.hasNext()) {
                    Object next = A0x.next();
                    if ("version".equals(next)) {
                        Object obj2 = this.A01.get(next);
                        C17960vV.A07(obj2);
                        z3 = AnonymousClass000.A1Y(obj2);
                    } else {
                        boolean equals = "email".equals(next);
                        Object obj3 = this.A01.get(next);
                        C17960vV.A07(obj3);
                        if (equals) {
                            z2 = AnonymousClass000.A1Y(obj3);
                        } else if (!AnonymousClass000.A1Y(obj3)) {
                            A13.add(next);
                        }
                    }
                }
                if (A13.size() != 0 || !z3 || this.A0C) {
                    String str3 = this.A0A;
                    if (this.A0B) {
                        i = 1;
                    }
                    boolean z4 = this.A0C;
                    Bundle bundle = this.A02;
                    intent = C17880vN.A0A().setClassName(A0Z.getPackageName(), "com.whatsapp.systemstatus.SystemStatusActivity");
                    intent.putExtra("com.whatsapp.SystemStatusActivity.from", str3);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.email", z2);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.version", z3);
                    intent.putStringArrayListExtra("com.whatsapp.SystemStatusActivity.serverfeaturesunavailable", A13);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.statusonly", z4);
                    if (i != null) {
                        intent.putExtra("com.whatsapp.SystemStatusActivity.type", i);
                    }
                    if (bundle != null) {
                        intent.putExtra("com.whatsapp.SystemStatusActivity.describeProblemBundle", bundle);
                    }
                } else {
                    if (this.A0B) {
                        i = 1;
                    }
                    C132216mP r32 = this.A03;
                    boolean A003 = this.A08.A00();
                    String str4 = this.A0A;
                    intent = r32.A00.A00(this.A02, this.A07, i, str4, (String) null, (ArrayList) null, (ArrayList) null, A003);
                }
            }
            A0Z.A3q(intent, this.A0D);
        }
    }
}
