package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Ni  reason: invalid class name and case insensitive filesystem */
public class C145977Ni implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C145977Ni(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj2;
        this.A03 = obj;
        this.A04 = obj3;
    }

    public final void accept(Object obj) {
        AnonymousClass18K r4;
        int i;
        C46162Dk r1;
        switch (this.A00) {
            case 0:
                C33251iW r42 = (C33251iW) this.A01;
                List list = (List) this.A02;
                Object obj2 = this.A03;
                Object obj3 = this.A04;
                HashMap hashMap = new HashMap(list.size());
                ArrayList A14 = AnonymousClass000.A14(list);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    AnonymousClass1BI r0 = A0Y.A0v.A00;
                    hashMap.put(r0, A0Y);
                    A14.add(r0);
                }
                ((C31931gM) r42.A1B.get()).A01(new C21468AkZ(hashMap, r42, obj3, obj2, A14, 8), 75);
                return;
            case 1:
                AnonymousClass1T6 r5 = (AnonymousClass1T6) this.A01;
                AnonymousClass34B r6 = (AnonymousClass34B) this.A02;
                Object obj4 = this.A03;
                C21132Af0 af0 = (C21132Af0) this.A04;
                C55612g5 r11 = (C55612g5) obj;
                int i2 = r11.A00;
                if (r6.A09()) {
                    if (C137266vB.A01(i2)) {
                        Log.e("mediaJobManager/mediaUpload/whenResponse; express path upload failed, fallback to normal upload");
                        r4 = r5.A03;
                        i = 24;
                    } else if (27 == i2) {
                        Log.e("mediaJobManager/mediaUpload/whenResponse; express path upload no primary host, skip and fallback to normal upload");
                        r4 = r5.A03;
                        i = 26;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    AnonymousClass64X r12 = new AnonymousClass64X();
                    r12.A0I = AnonymousClass3MY.A0g();
                    r12.A0J = null;
                    r12.A0K = valueOf;
                    r12.A0G = null;
                    r4.CC7(r12);
                    AnonymousClass10I r3 = r5.A0D;
                    r6.A0O.A0A(0);
                    r6.A0Z = "mms";
                    r3.CGF(new AnonymousClass7R0(r5, r6, new C62492rU(r6, r6.A01()), 18));
                    return;
                }
                if ((obj4 instanceof AnonymousClass68R) && (38 == i2 || 36 == i2)) {
                    if (C18020vd.A05(C18040vf.A02, r5.A02, 8264)) {
                        r5.A0D.CGF(new C21365Aiu(r5, r6, new C62492rU(r6, r6.A01()), i2, 30));
                        return;
                    }
                }
                C1408173e r13 = r6.A0O;
                synchronized (r13) {
                    r13.A0H = true;
                }
                if (C22781De.A03()) {
                    r5.A0D.CGF(new AnonymousClass7R0(r5, r6, r11, 17));
                } else {
                    AnonymousClass1T6.A07(r5, r6, r11);
                }
                af0.A0D();
                return;
            case 2:
                Fragment fragment = (Fragment) this.A01;
                C138736xb r62 = (C138736xb) this.A02;
                AnonymousClass1BI r43 = (AnonymousClass1BI) this.A03;
                AnonymousClass206 r7 = (AnonymousClass206) this.A04;
                Boolean bool = (Boolean) obj;
                AnonymousClass1FL A1B = fragment.A1B();
                if (A1B != null && !AnonymousClass4Yv.A02(A1B)) {
                    C134136q6 r2 = new C134136q6(r62.A03, r43, "media_viewer", AnonymousClass3MX.A1a(bool));
                    r2.A00 = 0;
                    r2.A09 = false;
                    r2.A01 = r7.A0I();
                    r2.A06 = false;
                    r2.A08 = false;
                    r2.A02 = r7.A0v;
                    r2.A03 = new AnonymousClass7M2(fragment, 3);
                    if (C22971Dz.A0V(r43)) {
                        C29691ci A0A = ((AnonymousClass1CJ) r62.A0C.get()).A0A(r43);
                        if ((A0A instanceof C46162Dk) && (r1 = (C46162Dk) A0A) != null) {
                            r2.A01(r1);
                        }
                    }
                    C20098A7b.A01(r2.A00(), fragment.A1E());
                    return;
                }
                return;
            default:
                Reference reference = (Reference) this.A01;
                AnonymousClass1KB r14 = (AnonymousClass1KB) this.A02;
                AnonymousClass1L9 r44 = (AnonymousClass1L9) this.A03;
                AnonymousClass21V r32 = (AnonymousClass21V) this.A04;
                Uri uri = (Uri) obj;
                C18070vi.A0f(reference, 0, uri);
                Context A0F = C108945cZ.A0F(reference);
                if (A0F != null) {
                    r14.A04();
                    Intent A0G = C108945cZ.A0G("android.intent.action.VIEW");
                    A0G.setDataAndType(uri, r32.A06);
                    A0G.setFlags(1);
                    r44.A08(A0F, A0G);
                    return;
                }
                return;
        }
    }
}
