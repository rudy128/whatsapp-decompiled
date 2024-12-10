package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity;
import java.util.Collection;

/* renamed from: X.35V  reason: invalid class name */
public class AnonymousClass35V implements C23691Hg {
    public final int A00;
    public final Object A01;

    public AnonymousClass35V(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass10T r1, Object obj, int i) {
        r1.notifyAllObservers(new AnonymousClass35V(obj, i));
    }

    public final void CGE(Object obj) {
        String str;
        C25871Py r10;
        AnonymousClass10U r5;
        C60082nM A03;
        Boolean valueOf;
        ComponentName component;
        switch (this.A00) {
            case 0:
                ((C37751q4) obj).A03((C41761x1) this.A01);
                return;
            case 1:
                ((C36791oT) obj).BmS((AnonymousClass1W0) this.A01);
                return;
            case 2:
                C88344Zh r7 = (C88344Zh) this.A01;
                C55652g9 r102 = (C55652g9) obj;
                Context context = r102.A01.A00;
                C18070vi.A0X(context);
                String A0F = C18070vi.A0F(context, 2131893010);
                String A002 = A8I.A00(r102.A03, r7.A06);
                Object[] objArr = new Object[2];
                if (r7.A09 == AnonymousClass2RG.VR) {
                    str = context.getString(2131891679);
                } else {
                    str = r7.A0A;
                }
                objArr[0] = str;
                String A0q = C17880vN.A0q(context, A002, objArr, 1, 2131893009);
                C18070vi.A0X(A0q);
                C1409673t A032 = C217217d.A03(context);
                A032.A0M = "other_notifications@1";
                A032.A0F(A0F);
                A032.A0E(A0F);
                A032.A0D(A0q);
                C18070vi.A0X(r7.A08);
                Intent A012 = C87404Vl.A01(context, 4);
                C18070vi.A0b(A012);
                PendingIntent A003 = C1408573i.A00(context, 0, A012, 0);
                C18070vi.A0X(A003);
                A032.A0A = A003;
                C17900vP.A0L(A032, A0q);
                A032.A0G(true);
                A032.A08.icon = 2131232039;
                C27301Vn r2 = r102.A02;
                Notification A05 = A032.A05();
                C18070vi.A0X(A05);
                r2.BkR(21, A05);
                return;
            case 3:
                C26791Tm r103 = (C26791Tm) obj;
                C18070vi.A0d(r103, 1);
                r103.C8F((Pair) this.A01);
                return;
            case 4:
                ((AnonymousClass11J) obj).Bps((C59732mn) this.A01);
                return;
            case 5:
                ((AnonymousClass1M1) obj).Bq0((Collection) this.A01);
                return;
            case 6:
                ((AnonymousClass1M1) obj).Bq3((Collection) this.A01);
                return;
            case 7:
                ((AnonymousClass1M1) obj).Bpx((AnonymousClass1E7) this.A01);
                return;
            case 8:
                ((AnonymousClass1M1) obj).BwP((Collection) this.A01);
                return;
            case 9:
                ((C23581Gv) obj).Brx((UserJid) this.A01);
                return;
            case 10:
                ((C23581Gv) obj).BtU((UserJid) this.A01);
                return;
            case 11:
                ((C23581Gv) obj).Bq3((Collection) this.A01);
                return;
            case 12:
                ((C23581Gv) obj).Bmh((Collection) this.A01);
                return;
            case 13:
                ((C23581Gv) obj).Bq1((Collection) this.A01);
                return;
            case 14:
                ((C23581Gv) obj).Bq4((Collection) this.A01);
                return;
            case 15:
                ((C23581Gv) obj).Bq0((Collection) this.A01);
                return;
            case 16:
                ((C23581Gv) obj).Bkk((UserJid) this.A01);
                return;
            case 17:
                AnonymousClass12E r104 = (AnonymousClass12E) obj;
                C18070vi.A0d(r104, 1);
                r104.A0B((AnonymousClass1E7) this.A01);
                return;
            case 18:
                UserJid userJid = (UserJid) this.A01;
                C32951i1 r105 = (C32951i1) obj;
                if (!r105.A02.A0O(userJid) && (A03 = r105.A09.A03(userJid)) != null && !A03.A0A) {
                    r105.A0T.execute(new C70773Cl(r105, userJid, A03, 37));
                    return;
                }
                return;
            case 19:
                Intent intent = (Intent) this.A01;
                C55212fP r106 = (C55212fP) obj;
                C18070vi.A0d(r106, 1);
                Boolean bool = false;
                int i = r106.A01.A00.A01;
                if (i == Integer.MIN_VALUE) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(AnonymousClass000.A1O(i));
                }
                if (bool.equals(valueOf)) {
                    String action = intent.getAction();
                    if (action == null && ((component = intent.getComponent()) == null || (action = component.getClassName()) == null)) {
                        r106.A00.A0G("wake-up-action-null", AnonymousClass001.A1E(intent, "intent: ", AnonymousClass000.A10()), false);
                        return;
                    } else {
                        r106.A02.CGF(new C21452AkJ(26, action, r106));
                        return;
                    }
                } else {
                    return;
                }
            case 20:
                C28741ap r107 = (C28741ap) obj;
                C18070vi.A0d(r107, 1);
                r107.BoD((AnonymousClass1BI) this.A01);
                return;
            case 21:
                C28741ap r108 = (C28741ap) obj;
                C18070vi.A0d(r108, 1);
                r108.BoE((AnonymousClass1BI) this.A01);
                return;
            case 22:
                C28741ap r109 = (C28741ap) obj;
                C18070vi.A0d(r109, 1);
                r109.BoW((AnonymousClass1BI) this.A01);
                return;
            case 23:
                C28741ap r1010 = (C28741ap) obj;
                C18070vi.A0d(r1010, 1);
                r1010.BoJ((AnonymousClass1BI) this.A01);
                return;
            case 24:
                C28741ap r1011 = (C28741ap) obj;
                C18070vi.A0d(r1011, 1);
                r1011.BoR((AnonymousClass1BI) this.A01);
                return;
            case 25:
                C28741ap r1012 = (C28741ap) obj;
                C18070vi.A0d(r1012, 1);
                r1012.BoK();
                return;
            case 26:
                C28741ap r1013 = (C28741ap) obj;
                C18070vi.A0d(r1013, 1);
                r1013.BoZ((AnonymousClass1BI) this.A01);
                return;
            case 27:
                ((C25231Nk) obj).BqI((AnonymousClass1BI) this.A01);
                return;
            case 28:
                ((C25231Nk) obj).BqF((AnonymousClass1BI) this.A01);
                return;
            case 29:
                ((C25231Nk) obj).BqJ((AnonymousClass1BI) this.A01);
                return;
            case 30:
                C29961dA r1014 = (C29961dA) obj;
                C18070vi.A0d(r1014, 1);
                r1014.ByP((AnonymousClass206) this.A01);
                return;
            case 31:
                C29961dA r1015 = (C29961dA) obj;
                C18070vi.A0d(r1015, 1);
                r1015.ByI();
                return;
            case 32:
                ((AnonymousClass1WR) obj).Byd((Collection) this.A01);
                return;
            case 33:
                ((AnonymousClass1WR) obj).ByR((AnonymousClass206) this.A01);
                return;
            case 34:
                ((AnonymousClass1WR) obj).Bz8((C29681ch) this.A01);
                return;
            case 35:
                ((AnonymousClass1WR) obj).Bz9((AnonymousClass206) this.A01);
                return;
            case 37:
                ((C26701Td) obj).BrU();
                return;
            case 38:
                ((C26701Td) obj).BrT((C199410f) this.A01);
                return;
            case 39:
                ((C26701Td) obj).BrL((C59312m6) this.A01);
                return;
            case 40:
                ((C26701Td) obj).BrS((C59312m6) this.A01);
                return;
            case 42:
                ((C26701Td) obj).BrO((C59312m6) this.A01);
                return;
            case 44:
                C26811To r1016 = (C26811To) obj;
                r1016.A0W.CGF(new AnonymousClass2PF((C59312m6) this.A01, r1016));
                return;
            case 45:
            case 46:
                Object obj2 = this.A01;
                AnonymousClass10T r1017 = (AnonymousClass10T) obj;
                C18070vi.A0d(r1017, 1);
                if (C200410p.A0S(new C35021lW[]{C35011lV.A00, C35021lW.A09}).contains(obj2)) {
                    r1017.notifyAllObservers(new AnonymousClass7KY(r1017, 26));
                    return;
                }
                return;
            case 47:
                r5 = (AnonymousClass10U) this.A01;
                r10 = (C25871Py) obj;
                r10.A01();
                return;
            case 48:
                r5 = (AnonymousClass10U) this.A01;
                r10 = (C25871Py) obj;
                try {
                    r10.A02();
                    return;
                } catch (Exception e) {
                    String name = r10.getClass().getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Observer crashed: ");
                    sb.append(name);
                    ((AnonymousClass190) r5.A00.get()).A0E("abprops-observer-crashed", name, new RuntimeException(sb.toString(), e));
                }
            case 49:
                C53432cW r3 = (C53432cW) this.A01;
                ShareGroupInviteLinkActivity shareGroupInviteLinkActivity = ((C126386ce) obj).A00;
                AnonymousClass1EC r1 = shareGroupInviteLinkActivity.A05;
                if (r1 != null && r1.equals(r3.A00)) {
                    ShareGroupInviteLinkActivity.A0V(shareGroupInviteLinkActivity, r3.A01);
                    return;
                }
                return;
            default:
                return;
        }
        String name2 = r10.getClass().getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Observer crashed: ");
        sb2.append(name2);
        ((AnonymousClass190) r5.A00.get()).A0E("abprops-observer-crashed", name2, new RuntimeException(sb2.toString(), e));
    }
}
