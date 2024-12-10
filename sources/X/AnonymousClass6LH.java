package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.components.InviteViaLinkView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6LH  reason: invalid class name */
public class AnonymousClass6LH extends C38471rL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public AnonymousClass6LH(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A05 = obj5;
    }

    public void A04(View view) {
        String str;
        Object obj;
        AnonymousClass4SV r0;
        switch (this.A00) {
            case 0:
                C81723zh r1 = (C81723zh) this.A04;
                if (r1 != null) {
                    r1.A0B = AnonymousClass000.A0i();
                }
                r0 = (AnonymousClass4SV) ((InviteViaLinkView) this.A05).getGroupInviteClickUtils().get();
                break;
            case 1:
                AnonymousClass219 r8 = (AnonymousClass219) this.A04;
                C60072nL r7 = r8.A02;
                if (r7 == null) {
                    if (r8.A0v.A02) {
                        AnonymousClass11S r02 = (AnonymousClass11S) this.A03;
                        r02.A0I();
                        AnonymousClass1E8 r03 = r02.A0D;
                        C17960vV.A07(r03);
                        obj = r03.A0J;
                    } else {
                        obj = this.A05;
                    }
                    UserJid userJid = (UserJid) obj;
                    C17960vV.A07(userJid);
                    double d = r8.A00;
                    double d2 = r8.A01;
                    long j = r8.A0I;
                    r7 = new C60072nL(userJid);
                    r7.A00 = d;
                    r7.A01 = d2;
                    r7.A05 = j;
                }
                Context context = (Context) this.A01;
                AnonymousClass1BI r12 = r8.A0v.A00;
                C17960vV.A07(r12);
                boolean A06 = ((C27091Ur) this.A02).A06(context);
                Intent A002 = A00(r12, r7);
                String packageName = context.getPackageName();
                if (A06) {
                    str = "com.whatsapp.location.GroupChatLiveLocationsActivity2";
                } else {
                    str = "com.whatsapp.location.GroupChatLiveLocationsActivity";
                }
                A002.setClassName(packageName, str);
                context.startActivity(A002);
                return;
            case 2:
                C88644aH r2 = (C88644aH) this.A01;
                r2.A0H.A00(2);
                C108885cS r13 = (C108885cS) C88404Zo.A03(r2.A09, C108885cS.class);
                if (r13 != null) {
                    C87754Wv r04 = (C87754Wv) this.A03;
                    String str2 = r04.A03;
                    String str3 = r04.A02;
                    if (str2 != null && str3 != null) {
                        AnonymousClass206 r22 = (AnonymousClass206) this.A04;
                        r13.BdQ(r22, r22.A0v, (AnonymousClass4QM) this.A02, str2, str3, (Bitmap[]) this.A05, r04.A01);
                        return;
                    }
                    return;
                }
                return;
            default:
                C81723zh r14 = (C81723zh) this.A04;
                if (r14 != null) {
                    r14.A0B = AnonymousClass000.A0i();
                }
                r0 = ((AnonymousClass6Ph) this.A05).A01;
                break;
        }
        r0.A00((AnonymousClass1FU) this.A01, (AnonymousClass1BI) this.A02, (AnonymousClass1EC) this.A03);
    }

    public static Intent A00(Jid jid, C60072nL r10) {
        String rawString = jid.getRawString();
        String rawString2 = r10.A06.getRawString();
        long j = r10.A05;
        double d = r10.A00;
        double d2 = r10.A01;
        Intent intent = new Intent();
        intent.putExtra("jid", rawString);
        intent.putExtra("final_location_jid", rawString2);
        intent.putExtra("final_location_timestamp", j);
        intent.putExtra("final_location_latitude", d);
        intent.putExtra("final_location_longitude", d2);
        return intent;
    }
}
