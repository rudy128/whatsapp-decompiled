package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.events.EventInfoFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.48k  reason: invalid class name */
public class AnonymousClass48k extends C38471rL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public void A04(View view) {
        AnonymousClass1FR r3;
        C445823z r2;
        C49552Qx r1;
        Object obj;
        int i;
        switch (this.A00) {
            case 0:
                ((C35401mB) this.A02).A00((View) this.A01, (C66562yN) this.A03, (AnonymousClass28W) this.A04);
                return;
            case 1:
                ((AnonymousClass3uP) this.A01).A1X.CGF(new C70833Cr((Object) this, this.A02, this.A03, this.A04, 11));
                return;
            case 2:
                r3 = ((AnonymousClass3uP) this.A04).A0S.A00;
                if (r3 != null) {
                    r2 = (C445823z) this.A01;
                    r1 = (C49552Qx) this.A02;
                    obj = this.A03;
                    break;
                } else {
                    return;
                }
            case 3:
                ((AnonymousClass689) this.A02).A08((Context) this.A01, AnonymousClass205.A00((AnonymousClass206) this.A03), (UserJid) this.A04);
                return;
            case 4:
                AnonymousClass1KB r0 = ((EventInfoFragment) this.A04).A02;
                if (r0 != null) {
                    r3 = r0.A00;
                    if (r3 != null) {
                        r2 = (C445823z) this.A03;
                        r1 = (C49552Qx) this.A01;
                        obj = this.A02;
                        break;
                    } else {
                        return;
                    }
                } else {
                    AnonymousClass3MW.A1C();
                    throw null;
                }
            case 5:
                AnonymousClass4S6 r5 = (AnonymousClass4S6) this.A04;
                Object obj2 = this.A03;
                r5.A02.CGF(new AnonymousClass3C5(r5, obj2, new C91284fR(this.A02, this.A01, obj2, 1), 26));
                return;
            case 6:
                AnonymousClass6pB r12 = ((C1405571y) this.A04).A03;
                Context A042 = AnonymousClass3MY.A04((View) this.A03);
                Integer num = AnonymousClass00R.A0N;
                r12.A00(A042, (C72083Ko) this.A01, (C122646Re) this.A02, num, "status_privacy_settings", "status_privacy_activity");
                return;
            case 7:
                AnonymousClass6Gn r4 = (AnonymousClass6Gn) this.A04;
                AnonymousClass206 r52 = r4.A07;
                C18070vi.A0z(r52, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia");
                AnonymousClass21V r53 = (AnonymousClass21V) r52;
                if (r53.A0z) {
                    return;
                }
                if (AnonymousClass3Ma.A0M(r53).A07 == 1) {
                    int i2 = 2131890637;
                    if (r53.A0u == 2) {
                        i2 = 2131890636;
                    }
                    ((AnonymousClass1KB) this.A02).A06(i2, 1);
                    return;
                } else if (r53.A07 != null) {
                    if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A01, 12784)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("status-playback-page-message-");
                        ((AnonymousClass10I) this.A03).CGL(new AnonymousClass7RQ(r4, r53, 6), AnonymousClass000.A0y(r53.A0v.A01, A10));
                        return;
                    }
                    C33251iW r32 = r4.A03;
                    Activity A002 = AnonymousClass1L9.A00(r4.A0J());
                    AnonymousClass3MW.A1W(A002);
                    r32.A0M((AnonymousClass1FU) A002, r53, (Runnable) null, true, false);
                    return;
                } else {
                    Log.e("cannot download media message with no media attached");
                    ((AnonymousClass1KB) this.A02).A08(2131891444, 0);
                    return;
                }
            case 8:
                ((C136936ue) this.A04).A03((Boolean) null, 13);
                AnonymousClass1FU r22 = (AnonymousClass1FU) ((Activity) this.A02);
                C18070vi.A0d(r22, 0);
                ((AnonymousClass73V) this.A03).A04(r22, "avatar_sticker_picker", (String) null);
                return;
            default:
                C41801x5 r54 = (C41801x5) this.A04;
                r54.A01.CGF(new AnonymousClass7RO(this.A02, this.A01, r54, 46));
                ((C1603788f) this.A03).C9U();
                return;
        }
        AnonymousClass24H r02 = (AnonymousClass24H) obj;
        if (r02 != null) {
            i = r02.A00;
        } else {
            i = 0;
        }
        r3.CMk(C83674Gf.A00(r2, r1, i), "EVENT_RESPONSE_BOTTOM_SHEET");
    }

    public AnonymousClass48k(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
    }

    public AnonymousClass48k(C66562yN r2, C35401mB r3, AnonymousClass2CW r4, ThumbnailButton thumbnailButton) {
        this.A00 = 0;
        this.A04 = r4;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = thumbnailButton;
    }
}
