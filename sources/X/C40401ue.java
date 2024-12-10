package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.community.subgroup.views.CommunityViewGroupsView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ue  reason: invalid class name and case insensitive filesystem */
public class C40401ue extends C38391rD implements C40391ud {
    public C40431uh A00;
    public RecyclerView A01;
    public final int A02;
    public final AnonymousClass1KB A03;
    public final C40351uZ A04;
    public final C40361ua A05;
    public final C40381uc A06;
    public final C36491nz A07;
    public final C36501o0 A08;
    public final C32111gf A09;
    public final AnonymousClass17C A0A = ((AnonymousClass17C) C221618v.A02(AnonymousClass17C.class));
    public final C40371ub A0B;
    public final C37451pZ A0C;
    public final C37451pZ A0D;
    public final C36531o3 A0E;
    public final C37471pb A0F;
    public final C34021jm A0G;
    public final AnonymousClass11C A0H;
    public final C18000vb A0I;
    public final AnonymousClass1VU A0J;
    public final C18030ve A0K;
    public final C34441kU A0L;
    public final C36401np A0M;
    public final AnonymousClass1DC A0N;

    public boolean CM0() {
        return true;
    }

    public int A0Q() {
        return this.A00.A02.size();
    }

    public void A0R(C42011xT r2) {
        if (r2 instanceof C453328n) {
            C30551e8.A04(((C453328n) r2).A0G.getCoroutineContext());
        }
    }

    public void A0U(AnonymousClass1BI r5) {
        ArrayList arrayList = new ArrayList();
        List list = this.A00.A02;
        for (int i = 0; i < list.size(); i++) {
            if (r5.equals(((C58482kl) list.get(i)).A01)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.A03.CGP(new C98804rk(this, arrayList, 34));
    }

    public void A0V(List list) {
        ArrayList arrayList = new ArrayList();
        List list2 = this.A00.A02;
        for (int i = 0; i < list2.size(); i++) {
            Object obj = ((C58482kl) list2.get(i)).A01;
            if ((obj instanceof AnonymousClass1BI) && list.contains(obj)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.A03.CGP(new C98804rk(this, arrayList, 34));
    }

    public int BSO(int i) {
        while (i >= 0) {
            if (Bex(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.4dN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: X.48h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: X.2PA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: X.2PA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: X.2PA} */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0807, code lost:
        if (r0.intValue() <= 0) goto L_0x0809;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0813, code lost:
        if (r4.intValue() <= 0) goto L_0x0815;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x093a, code lost:
        if (r2.A07.A0J(r6) == false) goto L_0x093c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r22, int r23) {
        /*
            r21 = this;
            r2 = r22
            boolean r0 = r2 instanceof X.C453228m
            if (r0 == 0) goto L_0x0028
            r5 = r2
            X.28m r5 = (X.C453228m) r5
            android.view.View r4 = r5.A01
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166637(0x7f0705ad, float:1.7947525E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r1 = r4.getPaddingTop()
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r3, r1, r3, r0)
            com.airbnb.lottie.LottieAnimationView r0 = r5.A00
            if (r0 == 0) goto L_0x0028
            r0.A04()
        L_0x0028:
            r4 = r21
            X.1uh r0 = r4.A00
            java.util.List r0 = r0.A02
            r3 = r23
            java.lang.Object r1 = r0.get(r3)
            X.2kl r1 = (X.C58482kl) r1
            boolean r0 = r2 instanceof X.C74123Yp
            if (r0 == 0) goto L_0x0045
            android.view.View r6 = r2.A0H
            r5 = 1
            X.4di r0 = new X.4di
            r0.<init>(r1, r4, r2, r5)
            r6.addOnLayoutChangeListener(r0)
        L_0x0045:
            boolean r0 = r2 instanceof X.AnonymousClass28d
            if (r0 == 0) goto L_0x0064
            r5 = r2
            X.28d r5 = (X.AnonymousClass28d) r5
            java.lang.Object r8 = r1.A02
            com.whatsapp.jid.GroupJid r8 = (com.whatsapp.jid.GroupJid) r8
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.3Pi r7 = r5.A00
            r7.A06 = r8
            X.10I r6 = r7.A09
            r5 = 35
            X.4rk r0 = new X.4rk
            r0.<init>(r7, r8, r5)
            r6.CGF(r0)
        L_0x0064:
            boolean r0 = r2 instanceof X.C453328n
            if (r0 == 0) goto L_0x01de
            X.28n r2 = (X.C453328n) r2
            X.1OX r0 = r2.A0G
            r20 = r0
            X.0wh r0 = r20.getCoroutineContext()
            X.C30551e8.A04(r0)
            java.lang.Object r8 = r1.A02
            X.4V0 r8 = (X.AnonymousClass4V0) r8
            int r7 = r4.A02
            r12 = 0
            r11 = 1
            X.C18070vi.A0d(r8, r11)
            X.A2B r13 = r8.A00
            com.whatsapp.jid.GroupJid r6 = r13.A02
            android.view.View r4 = r2.A0H
            android.content.Context r5 = r4.getContext()
            X.1xh r10 = r2.A02
            java.lang.String r3 = r13.A06
            com.whatsapp.TextEmojiLabel r9 = r2.A00
            android.text.TextPaint r1 = r9.getPaint()
            X.1KW r0 = r2.A0A
            java.lang.CharSequence r0 = X.C43251zV.A03(r5, r1, r0, r3)
            com.whatsapp.TextEmojiLabel r3 = r10.A01
            r3.setText(r0)
            r1 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r0 = 2131101314(0x7f060682, float:1.7815034E38)
            int r0 = X.AnonymousClass1YL.A00(r5, r1, r0)
            int r0 = X.C19740yt.A00(r5, r0)
            r3.setTextColor(r0)
            r0 = 6
            if (r7 != r0) goto L_0x00b6
            X.C43421zm.A04(r9)
        L_0x00b6:
            X.1M9 r0 = r2.A05
            X.1MA r0 = r0.A03
            X.1E7 r10 = r0.A0A(r6)
            if (r10 == 0) goto L_0x0185
            X.C453328n.A00(r8, r2, r2, r10)
            X.C453328n.A02(r2, r2, r10)
        L_0x00c6:
            int r3 = r13.A00
            r0 = 3
            r1 = 8
            if (r3 != r0) goto L_0x017c
            boolean r0 = X.C22891Dp.A02
            r14 = 2131231044(0x7f080144, float:1.8078158E38)
            if (r0 == 0) goto L_0x00d7
            r14 = 2131231045(0x7f080145, float:1.807816E38)
        L_0x00d7:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r13 = r2.A0E
            X.1VU r15 = r2.A09
            android.content.res.Resources r10 = r13.getResources()
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources$Theme r9 = r0.getTheme()
            X.1z7 r3 = new X.1z7
            r3.<init>()
            X.0ve r0 = r15.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass1VU.A00(r9, r10, r3, r0, r14)
            r13.setImageDrawable(r0)
            com.whatsapp.TextEmojiLabel r3 = r2.A01
            r3.setVisibility(r12)
            X.1bI r0 = r2.A0C
            r0.A04(r12)
            r0 = 2131888526(0x7f12098e, float:1.941169E38)
            r3.setText(r0)
        L_0x0105:
            X.1bI r9 = r2.A0B
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0921
            android.view.View r3 = r9.A02()
            r0 = 2131432982(0x7f0b1616, float:1.8487737E38)
            android.view.View r13 = X.AnonymousClass1HF.A06(r3, r0)
            X.C18070vi.A0X(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            X.4XG r0 = r2.A08
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x01d9
            r13.setVisibility(r12)
            java.lang.Integer r0 = r8.A03
            if (r0 == 0) goto L_0x017a
            int r15 = r0.intValue()
        L_0x012e:
            android.content.res.Resources r14 = r5.getResources()
            r10 = 2131892475(0x7f1218fb, float:1.94197E38)
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755186(0x7f1000b2, float:1.9141244E38)
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r11[r12] = r16
            java.lang.String r0 = r1.getQuantityString(r0, r15, r11)
            r3[r12] = r0
            java.lang.String r0 = r14.getString(r10, r3)
            r13.setText(r0)
            android.view.View r1 = r9.A02()
            r0 = 2131435868(0x7f0b215c, float:1.849359E38)
            android.view.View r10 = X.AnonymousClass1HF.A06(r1, r0)
            X.C18070vi.A0X(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131896594(0x7f122912, float:1.9428054E38)
            r10.setText(r0)
            android.content.Context r0 = r10.getContext()
            X.C18070vi.A0X(r0)
            r11 = 2130971978(0x7f040d4a, float:1.755271E38)
            goto L_0x01c0
        L_0x017a:
            r15 = 0
            goto L_0x012e
        L_0x017c:
            X.1bI r0 = r2.A0C
            r0.A04(r1)
            X.C453328n.A01(r8, r2, r2, r10)
            goto L_0x0105
        L_0x0185:
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r14 = r2.A0E
            X.1VU r0 = r2.A09
            android.content.res.Resources r15 = r14.getResources()
            android.content.Context r1 = r14.getContext()
            android.content.res.Resources$Theme r9 = r1.getTheme()
            X.1z7 r3 = new X.1z7
            r3.<init>()
            r1 = 2131231053(0x7f08014d, float:1.8078176E38)
            X.0ve r0 = r0.A00
            android.graphics.drawable.Drawable r0 = X.AnonymousClass1VU.A00(r9, r15, r3, r0, r1)
            r14.setImageDrawable(r0)
            r19 = 0
            com.whatsapp.community.subgroup.viewholders.SubgroupItemViewHolder$bind$2 r9 = new com.whatsapp.community.subgroup.viewholders.SubgroupItemViewHolder$bind$2
            r17 = r2
            r16 = r2
            r18 = r6
            r14 = r9
            r15 = r8
            r14.<init>(r15, r16, r17, r18, r19)
            X.1OR r3 = X.AnonymousClass1OR.A00
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            r0 = r20
            X.C30451dy.A02(r1, r3, r9, r0)
            goto L_0x00c6
        L_0x01c0:
            android.util.TypedValue r3 = new android.util.TypedValue     // Catch:{ Exception -> 0x091d }
            r3.<init>()     // Catch:{ Exception -> 0x091d }
            android.content.res.Resources$Theme r1 = r0.getTheme()     // Catch:{ Exception -> 0x091d }
            if (r1 == 0) goto L_0x01cf
            r0 = 1
            r1.resolveAttribute(r11, r3, r0)     // Catch:{ Exception -> 0x091d }
        L_0x01cf:
            int r0 = r3.resourceId     // Catch:{ Exception -> 0x091d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x091d }
            if (r0 == 0) goto L_0x091d
            goto L_0x090e
        L_0x01d9:
            r13.setVisibility(r1)
            goto L_0x0920
        L_0x01de:
            boolean r0 = r2 instanceof X.C452628g
            if (r0 == 0) goto L_0x0232
            X.28g r2 = (X.C452628g) r2
            java.lang.Object r6 = r1.A02
            X.4FL r6 = (X.AnonymousClass4FL) r6
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            android.widget.ImageView r5 = r2.A00
            android.content.Context r4 = r5.getContext()
            boolean r3 = r6.A01
            r1 = 2131232029(0x7f08051d, float:1.8080156E38)
            if (r3 == 0) goto L_0x0200
            r1 = 2131232031(0x7f08051f, float:1.808016E38)
        L_0x0200:
            r0 = 2131101222(0x7f060626, float:1.7814848E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r4, r1, r0)
            r5.setImageDrawable(r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            r0 = 2131896601(0x7f122919, float:1.9428068E38)
            if (r3 == 0) goto L_0x0214
            r0 = 2131896574(0x7f1228fe, float:1.9428013E38)
        L_0x0214:
            r1.setText(r0)
            X.C43421zm.A04(r1)
            android.view.View r2 = r2.A0H
            r1 = 34
            X.4dC r0 = new X.4dC
            r0.<init>(r6, r1)
            r2.setOnClickListener(r0)
            java.lang.String r0 = "Button"
            X.AnonymousClass1Y5.A07(r2, r0)
            r0 = 2131886298(0x7f1200da, float:1.940717E38)
            X.AnonymousClass1Y5.A02(r2, r0)
            return
        L_0x0232:
            boolean r0 = r2 instanceof X.C452528f
            if (r0 == 0) goto L_0x026b
            X.28f r2 = (X.C452528f) r2
            java.lang.Object r8 = r1.A02
            X.4FK r8 = (X.AnonymousClass4FK) r8
            r7 = 0
            X.C18070vi.A0d(r2, r7)
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            android.widget.TextView r6 = r2.A00
            android.content.res.Resources r5 = r6.getResources()
            r4 = 2131755419(0x7f10019b, float:1.9141717E38)
            int r3 = r8.A00
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r7] = r0
            java.lang.String r0 = r5.getQuantityString(r4, r3, r1)
            r6.setText(r0)
            android.view.View r2 = r2.A0H
            r0 = 38
            X.4dC r1 = new X.4dC
            r1.<init>(r8, r0)
        L_0x0267:
            r2.setOnClickListener(r1)
            return
        L_0x026b:
            boolean r0 = r2 instanceof X.C74273Ze
            if (r0 == 0) goto L_0x027e
            X.3Ze r2 = (X.C74273Ze) r2
            java.lang.Object r0 = r1.A02
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 0
            r2.A0B(r1, r0)
            return
        L_0x027e:
            boolean r0 = r2 instanceof X.AnonymousClass3YJ
            if (r0 == 0) goto L_0x0293
            java.lang.Object r1 = r1.A02
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.view.View r4 = r2.A0H
            r0 = 29
            X.48h r3 = new X.48h
            r3.<init>(r1, r2, r0)
            goto L_0x094d
        L_0x0293:
            boolean r0 = r2 instanceof X.AnonymousClass28U
            if (r0 != 0) goto L_0x0950
            boolean r0 = r2 instanceof X.C453128l
            if (r0 == 0) goto L_0x039b
            X.28l r2 = (X.C453128l) r2
            java.lang.Object r3 = r1.A02
            X.4V8 r3 = (X.AnonymousClass4V8) r3
            X.0z4 r0 = r2.A06
            X.00H r6 = r0.A00
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "previous_last_seen_community_activity"
            r4 = 0
            long r10 = r1.getLong(r0, r4)
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "last_seen_community_activity"
            long r8 = r1.getLong(r0, r4)
            X.1ci r5 = r3.A00
            java.lang.String r7 = r5.A0A()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x02f2
            X.190 r6 = r2.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Missing group subject for jid:"
            r1.append(r0)
            X.1BI r0 = r5.A08()
            r1.append(r0)
            java.lang.String r0 = ". type:"
            r1.append(r0)
            int r0 = r5.A03
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r1 = 1
            java.lang.String r0 = "ParentViewHolder/bind"
            r6.A0G(r0, r4, r1)
        L_0x02f2:
            com.whatsapp.TextEmojiLabel r0 = r2.A03
            r0.A0R(r7)
            X.1E7 r4 = r3.A01
            if (r4 == 0) goto L_0x031e
            boolean r0 = r4.A0F()
            if (r0 == 0) goto L_0x0317
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ParentViewHolder/displayContact"
            r1.append(r0)
            X.1BI r0 = r4.A0J
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0317:
            X.1pZ r1 = r2.A05
            android.widget.ImageView r0 = r2.A01
            r1.A07(r0, r4)
        L_0x031e:
            boolean r7 = r3.A06
            android.widget.ImageView r1 = r2.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x0328
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x0328:
            r1.setAlpha(r0)
            long r4 = r5.A0K
            r6 = 0
            r1 = 8
            if (r7 == 0) goto L_0x0382
            X.1bI r0 = r2.A07
            r0.A04(r1)
            X.1bI r0 = r2.A08
            r0.A04(r6)
        L_0x033c:
            android.view.View r7 = r2.A0H
            r1 = 37
            X.4dC r0 = new X.4dC
            r0.<init>(r3, r1)
            r7.setOnClickListener(r0)
            r1 = 11
            X.4do r0 = new X.4do
            r0.<init>(r3, r1)
            r7.setOnLongClickListener(r0)
            boolean r5 = r3.A05
            boolean r0 = r2.A00
            if (r5 == r0) goto L_0x0950
            r4 = 1
            r2.A00 = r5
            if (r5 == 0) goto L_0x0377
            android.content.Context r3 = r7.getContext()
            r1 = 2130970064(0x7f0405d0, float:1.7548828E38)
            r0 = 2131101205(0x7f060615, float:1.7814813E38)
            int r0 = X.AnonymousClass1YL.A00(r3, r1, r0)
            r7.setBackgroundResource(r0)
            com.whatsapp.components.SelectionCheckView r1 = r2.A04
            r1.setVisibility(r6)
        L_0x0373:
            r1.A04(r5, r4)
            return
        L_0x0377:
            r7.setBackgroundResource(r6)
            com.whatsapp.components.SelectionCheckView r1 = r2.A04
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0373
        L_0x0382:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0395
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0395
            X.1bI r0 = r2.A07
            r0.A04(r6)
        L_0x038f:
            X.1bI r0 = r2.A08
            r0.A04(r1)
            goto L_0x033c
        L_0x0395:
            X.1bI r0 = r2.A07
            r0.A04(r1)
            goto L_0x038f
        L_0x039b:
            boolean r0 = r2 instanceof X.C452928j
            if (r0 == 0) goto L_0x045d
            X.28j r2 = (X.C452928j) r2
            java.lang.Object r4 = r1.A02
            X.4V8 r4 = (X.AnonymousClass4V8) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.0z4 r0 = r2.A01
            X.00H r3 = r0.A00
            java.lang.Object r1 = r3.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "previous_last_seen_community_activity"
            r5 = 0
            long r10 = r1.getLong(r0, r5)
            java.lang.Object r1 = r3.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "last_seen_community_activity"
            long r8 = r1.getLong(r0, r5)
            X.1ci r7 = r4.A00
            java.lang.String r6 = r7.A0A()
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r5 = 1
            if (r0 == 0) goto L_0x03fa
            X.190 r3 = r2.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Missing group subject for jid:"
            r1.append(r0)
            X.1BI r0 = r7.A08()
            r1.append(r0)
            java.lang.String r0 = ". type:"
            r1.append(r0)
            int r0 = r7.A03
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ParentViewHolder/bind"
            r3.A0G(r0, r1, r5)
        L_0x03fa:
            com.whatsapp.wds.components.list.header.WDSSectionHeader r3 = r2.A02
            r3.setHeaderText((java.lang.String) r6)
            long r6 = r7.A0K
            r0 = 1
            long r10 = r10 + r0
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0437
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0437
            X.6tF r0 = r3.A03
            if (r0 == 0) goto L_0x0431
            com.whatsapp.WaTextView r8 = r0.A01(r5)
            if (r8 == 0) goto L_0x0431
            android.view.View r7 = r2.A0H
            android.content.Context r6 = r7.getContext()
            r1 = 2130971952(0x7f040d30, float:1.7552657E38)
            r0 = 2131103094(0x7f060d76, float:1.7818644E38)
            int r1 = X.AnonymousClass1YL.A00(r6, r1, r0)
            android.content.Context r0 = r7.getContext()
            int r0 = X.C19740yt.A00(r0, r1)
            r8.setTextColor(r0)
        L_0x0431:
            r0 = 2131892460(0x7f1218ec, float:1.9419669E38)
            r3.setSubHeaderText((int) r0)
        L_0x0437:
            android.view.View r0 = r2.A0H
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131897861(0x7f122e05, float:1.9430623E38)
            java.lang.String r2 = r1.getString(r0)
            X.1Xz r1 = X.C27881Xz.TONAL
            X.6Pk r0 = new X.6Pk
            r0.<init>(r1, r2)
            r3.setAddOnType(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r3.A07(r5)
            if (r2 == 0) goto L_0x0950
            r0 = 36
            X.4dC r1 = new X.4dC
            r1.<init>(r4, r0)
            goto L_0x0267
        L_0x045d:
            boolean r0 = r2 instanceof X.AnonymousClass3Z7
            if (r0 == 0) goto L_0x0480
            java.lang.Object r1 = r1.A02
            X.1ci r1 = (X.C29691ci) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1BI r0 = r1.A08()
            X.1EC r1 = X.C42941yz.A00(r0)
            if (r1 == 0) goto L_0x0950
            android.view.View r4 = r2.A0H
            r0 = 9
            X.4dN r3 = new X.4dN
            r3.<init>(r2, r1, r0)
            goto L_0x094d
        L_0x0480:
            boolean r0 = r2 instanceof X.C42071xZ
            if (r0 == 0) goto L_0x0496
            X.1xZ r2 = (X.C42071xZ) r2
            java.lang.Object r1 = r1.A02
            X.1tO r1 = (X.C39631tO) r1
            int r0 = r4.A02
            r4 = 0
            r8 = 0
            r5 = r4
            r6 = r0
            r7 = r3
            r3 = r1
            r2.A0I(r3, r4, r5, r6, r7, r8)
            return
        L_0x0496:
            boolean r0 = r2 instanceof X.AnonymousClass28X
            if (r0 == 0) goto L_0x053e
            X.28X r2 = (X.AnonymousClass28X) r2
            java.lang.Object r0 = r1.A02
            X.2lV r0 = (X.C58942lV) r0
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            X.3QY r4 = r2.A00
            X.1EC r1 = r0.A00
            r4.A05 = r1
            boolean r6 = r0.A01
            X.1M9 r0 = r4.A02
            X.1E7 r2 = r0.A0H(r1)
            X.00H r1 = r4.A07
            java.lang.Object r0 = r1.get()
            X.1xo r0 = (X.C42211xo) r0
            boolean r9 = r0.A01(r2)
            java.lang.Object r0 = r1.get()
            X.1xo r0 = (X.C42211xo) r0
            boolean r8 = r0.A00(r2)
            X.1EC r7 = r4.A05
            r1 = 8
            android.view.View r3 = r4.A0D
            if (r8 == 0) goto L_0x0530
            r3.setVisibility(r5)
            android.view.View r2 = r4.A0G
            r2.setVisibility(r1)
            android.view.View r0 = r4.A0E
            r0.setVisibility(r5)
        L_0x04dd:
            r1 = 14
            X.4dN r0 = new X.4dN
            r0.<init>(r4, r7, r1)
            r3.setOnClickListener(r0)
            r1 = 15
            X.4dN r0 = new X.4dN
            r0.<init>(r4, r7, r1)
            r2.setOnClickListener(r0)
            X.1EC r0 = r4.A05
            if (r0 == 0) goto L_0x04ff
            android.view.View r1 = r4.A0F
            r0 = 0
            if (r8 == 0) goto L_0x04fc
            r0 = 8
        L_0x04fc:
            r1.setVisibility(r0)
        L_0x04ff:
            X.1EC r3 = r4.A05
            if (r6 == 0) goto L_0x052b
            if (r8 != 0) goto L_0x052b
            android.view.View r2 = r4.A0C
            r0 = 0
        L_0x0508:
            r2.setVisibility(r0)
            r1 = 16
            X.4dN r0 = new X.4dN
            r0.<init>(r4, r3, r1)
            r2.setOnClickListener(r0)
            X.1EC r3 = r4.A05
            if (r6 == 0) goto L_0x06a7
            if (r9 != 0) goto L_0x06a7
            X.1bI r2 = r4.A0J
            r2.A04(r5)
            r0 = 17
            X.4dN r1 = new X.4dN
            r1.<init>(r4, r3, r0)
        L_0x0527:
            r2.A05(r1)
            return
        L_0x052b:
            android.view.View r2 = r4.A0C
            r0 = 8
            goto L_0x0508
        L_0x0530:
            r3.setVisibility(r1)
            android.view.View r2 = r4.A0G
            r2.setVisibility(r5)
            android.view.View r0 = r4.A0E
            r0.setVisibility(r1)
            goto L_0x04dd
        L_0x053e:
            boolean r0 = r2 instanceof X.AnonymousClass28Y
            if (r0 == 0) goto L_0x0679
            X.28Y r2 = (X.AnonymousClass28Y) r2
            java.lang.Object r6 = r1.A02
            X.4TJ r6 = (X.AnonymousClass4TJ) r6
            r5 = 0
            X.C18070vi.A0d(r6, r5)
            X.278 r7 = r2.A00
            X.206 r1 = r6.A00
            com.whatsapp.TextEmojiLabel r4 = r7.A04
            X.11S r0 = r7.A00
            boolean r0 = X.AnonymousClass25A.A0S(r0, r1)
            if (r0 == 0) goto L_0x0671
            X.1gn r12 = r7.A01
            boolean r0 = r1 instanceof X.AnonymousClass98B
            if (r0 == 0) goto L_0x062c
            X.98B r1 = (X.AnonymousClass98B) r1
            int r11 = r1.A00
            java.util.Set r0 = r1.A03
        L_0x0566:
            r1 = 3
            java.util.ArrayList r9 = X.C32191gn.A0H(r0, r1)
            android.util.Pair r2 = X.C32191gn.A00(r9, r11)
            java.lang.Object r0 = r2.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r13 = r0.intValue()
            r8 = 1
            if (r13 == r8) goto L_0x0612
            r10 = 2
            if (r13 == r10) goto L_0x05f3
            if (r13 == r1) goto L_0x05ce
            r3 = 4
            X.118 r0 = r12.A05
            android.content.Context r0 = r0.A00
            if (r13 == r3) goto L_0x05a8
            android.content.res.Resources r3 = r0.getResources()
            int[] r0 = X.C32191gn.A0Y
            r2 = r0[r5]
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r5] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r11, r1)
        L_0x059a:
            r4.A0R(r0)
            r1 = 30
            X.48h r0 = new X.48h
            r0.<init>(r7, r6, r1)
            r7.setOnClickListener(r0)
            return
        L_0x05a8:
            android.content.res.Resources r12 = r0.getResources()
            int[] r0 = X.C32191gn.A0Y
            r11 = r0[r1]
            java.lang.Object r3 = r2.second
            r0 = r3
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r9.get(r5)
            r1[r5] = r0
            java.lang.Object r0 = r9.get(r8)
            r1[r8] = r0
            r1[r10] = r3
            java.lang.String r0 = r12.getQuantityString(r11, r2, r1)
            goto L_0x059a
        L_0x05ce:
            X.118 r0 = r12.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            int[] r0 = X.C32191gn.A0Y
            r2 = r0[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r9.get(r5)
            r1[r5] = r0
            java.lang.Object r0 = r9.get(r8)
            r1[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r10] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r8, r1)
            goto L_0x059a
        L_0x05f3:
            X.118 r0 = r12.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            int[] r0 = X.C32191gn.A0Y
            r2 = r0[r10]
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Object r0 = r9.get(r5)
            r1[r5] = r0
            java.lang.Object r0 = r9.get(r8)
            r1[r8] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            goto L_0x059a
        L_0x0612:
            X.118 r0 = r12.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r3 = r0.getResources()
            int[] r0 = X.C32191gn.A0Y
            r2 = r0[r8]
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object r0 = r9.get(r5)
            r1[r5] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            goto L_0x059a
        L_0x062c:
            boolean r0 = r1 instanceof X.C48342Mc
            if (r0 == 0) goto L_0x0640
            X.2Mc r1 = (X.C48342Mc) r1
            java.util.HashSet r0 = r1.A1E()
            int r11 = r0.size()
            java.util.HashSet r0 = r1.A1E()
            goto L_0x0566
        L_0x0640:
            boolean r0 = X.AnonymousClass25A.A0q(r1)
            if (r0 == 0) goto L_0x066e
            java.lang.String r3 = r1.A0P()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0666
            X.118 r0 = r12.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131896599(0x7f122917, float:1.9428064E38)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r3
            java.lang.String r0 = r2.getString(r1, r0)
            goto L_0x059a
        L_0x0666:
            X.20i r1 = (X.C436420i) r1
            java.lang.String r0 = r12.A0S(r1, r5)
            goto L_0x059a
        L_0x066e:
            r0 = 0
            goto L_0x059a
        L_0x0671:
            java.lang.String r0 = "CommunityActivityView/unexpected community activity"
            X.C17960vV.A0F(r5, r0)
            r0 = 0
            goto L_0x059a
        L_0x0679:
            boolean r0 = r2 instanceof X.AnonymousClass28Z
            if (r0 == 0) goto L_0x06b5
            X.28Z r2 = (X.AnonymousClass28Z) r2
            java.lang.Object r0 = r1.A02
            X.1EC r0 = (X.AnonymousClass1EC) r0
            r4 = 0
            X.C18070vi.A0d(r0, r4)
            X.279 r3 = r2.A00
            r3.A02 = r0
            X.0ve r2 = r3.getAbProps$app_product_community_community()
            r1 = 3829(0xef5, float:5.366E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            X.1bI r2 = r3.A05
            if (r0 == 0) goto L_0x06af
            r2.A04(r4)
            r0 = 40
            X.4dC r1 = new X.4dC
            r1.<init>(r3, r0)
            goto L_0x0527
        L_0x06a7:
            X.1bI r1 = r4.A0J
            r0 = 8
            r1.A04(r0)
            return
        L_0x06af:
            r0 = 8
            r2.A04(r0)
            return
        L_0x06b5:
            boolean r0 = r2 instanceof X.AnonymousClass28c
            if (r0 == 0) goto L_0x06c8
            X.28c r2 = (X.AnonymousClass28c) r2
            java.lang.Object r1 = r1.A02
            X.1EC r1 = (X.AnonymousClass1EC) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView r0 = r2.A00
            r0.A01 = r1
            return
        L_0x06c8:
            boolean r0 = r2 instanceof X.C452328a
            if (r0 == 0) goto L_0x07d9
            X.28a r2 = (X.C452328a) r2
            java.lang.Object r1 = r1.A02
            X.1EC r1 = (X.AnonymousClass1EC) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.27B r3 = r2.A00
            r3.A0J = r1
            android.content.Context r0 = r3.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r0)
            r0 = 1
            r1.A1Z(r0)
            androidx.recyclerview.widget.RecyclerView r5 = r3.A00
            r5.setLayoutManager(r1)
            X.1FY r10 = r3.A0T
            X.5X7 r1 = r3.getCommunityMembersViewModelFactory$app_product_community_community()
            X.1EC r0 = r3.A0J
            if (r0 != 0) goto L_0x06fd
            java.lang.String r0 = "parentJid"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x06fd:
            com.whatsapp.community.CommunityMembersViewModel r0 = X.AnonymousClass4G9.A00(r10, r1, r0)
            r3.A09 = r0
            X.5Z1 r4 = r3.getCommunityAdminPromoteDemoteHelperFactory$app_product_community_community()
            X.1EC r1 = r3.A0J
            java.lang.String r7 = "parentJid"
            r2 = 0
            if (r1 != 0) goto L_0x0712
            X.C18070vi.A11(r7)
            throw r2
        L_0x0712:
            r0 = 2
            X.4XS r11 = r4.BGK(r10, r1, r0)
            X.1Vd r4 = r3.getContactPhotos$app_product_community_community()
            android.content.Context r1 = r3.getContext()
            java.lang.String r0 = "community-view-members"
            X.1pZ r0 = r4.A06(r1, r0)
            r3.A0D = r0
            X.00H r0 = r3.getCommunityChatManager$app_product_community_community()
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r1 = r3.A0J
            if (r1 != 0) goto L_0x0739
            X.C18070vi.A11(r7)
            throw r2
        L_0x0739:
            X.1MG r0 = r0.A08
            X.A2B r0 = r0.A02(r1)
            X.5Z2 r6 = r3.getCommunityMembersAdapterFactory()
            if (r0 == 0) goto L_0x074f
            com.whatsapp.jid.GroupJid r4 = r0.A02
        L_0x0747:
            X.1EC r1 = r3.A0J
            if (r1 != 0) goto L_0x0751
            X.C18070vi.A11(r7)
            throw r2
        L_0x074f:
            r4 = r2
            goto L_0x0747
        L_0x0751:
            X.1pZ r0 = r3.A0D
            if (r0 != 0) goto L_0x075b
            java.lang.String r0 = "contactPhotoLoader"
            X.C18070vi.A11(r0)
            throw r2
        L_0x075b:
            X.11S r9 = r3.getMeManager$app_product_community_community()
            X.1KW r15 = r3.getEmojiLoader$app_product_community_community()
            X.1M9 r13 = r3.getContactManager$app_product_community_community()
            X.1Me r14 = r3.getWaContactNames$app_product_community_community()
            com.whatsapp.community.CommunityMembersViewModel r12 = r3.A09
            if (r12 != 0) goto L_0x0775
            java.lang.String r0 = "communityMembersViewModel"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0775:
            X.00H r7 = r3.getBaseMemberContextMenuHelper$app_product_community_community()
            java.lang.Object r8 = r7.get()
            X.C18070vi.A0X(r8)
            X.4XU r8 = (X.AnonymousClass4XU) r8
            X.4P7 r7 = new X.4P7
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.3XL r4 = r6.BGn(r7, r0, r4, r1)
            r3.A07 = r4
            java.lang.String r1 = "communityMembersAdapter"
            r0 = 1
            r4.A0K(r0)
            X.3XL r0 = r3.A07
            if (r0 != 0) goto L_0x079b
            X.C18070vi.A11(r1)
            throw r2
        L_0x079b:
            r5.setAdapter(r0)
            X.1pm r1 = X.AnonymousClass2SS.A00(r10)
            com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$1 r0 = new com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$1
            r0.<init>(r3, r2)
            X.1OR r5 = X.AnonymousClass1OR.A00
            java.lang.Integer r4 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r4, r5, r0, r1)
            X.1pm r1 = X.AnonymousClass2SS.A00(r10)
            com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$2 r0 = new com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$2
            r0.<init>(r3, r2)
            X.C30451dy.A02(r4, r5, r0, r1)
            X.1pm r1 = X.AnonymousClass2SS.A00(r10)
            com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$3 r0 = new com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$3
            r0.<init>(r3, r2)
            X.C30451dy.A02(r4, r5, r0, r1)
            com.whatsapp.community.CommunityMembersViewModel r1 = r3.A09
            if (r1 != 0) goto L_0x07d0
            java.lang.String r0 = "communityMembersViewModel"
            X.C18070vi.A11(r0)
            throw r2
        L_0x07d0:
            X.3BR r0 = new X.3BR
            r0.<init>(r3)
            r1.A0R(r0)
            return
        L_0x07d9:
            boolean r0 = r2 instanceof X.AnonymousClass28e
            if (r0 == 0) goto L_0x07ed
            X.28e r2 = (X.AnonymousClass28e) r2
            java.lang.Object r1 = r1.A02
            X.4UX r1 = (X.AnonymousClass4UX) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.3Qk r0 = r2.A00
            r0.A00(r1)
            return
        L_0x07ed:
            boolean r0 = r2 instanceof X.C452428b
            if (r0 == 0) goto L_0x0950
            X.28b r2 = (X.C452428b) r2
            java.lang.Object r7 = r1.A02
            X.4Up r7 = (X.C87184Up) r7
            r6 = 0
            X.C18070vi.A0d(r7, r6)
            X.27A r5 = r2.A00
            java.lang.Integer r0 = r7.A03
            r8 = 0
            if (r0 == 0) goto L_0x0809
            int r0 = r0.intValue()
            r11 = 1
            if (r0 > 0) goto L_0x080a
        L_0x0809:
            r11 = 0
        L_0x080a:
            java.lang.Integer r4 = r7.A02
            if (r4 == 0) goto L_0x0815
            int r0 = r4.intValue()
            r9 = 1
            if (r0 > 0) goto L_0x0816
        L_0x0815:
            r9 = 0
        L_0x0816:
            java.lang.Integer r3 = r7.A01
            if (r3 == 0) goto L_0x0820
            int r0 = r3.intValue()
            if (r0 <= 0) goto L_0x0821
        L_0x0820:
            r8 = 1
        L_0x0821:
            X.0ve r2 = r5.getAbProps()
            r1 = 9027(0x2343, float:1.265E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x08b0
            if (r11 == 0) goto L_0x0836
            X.1bI r0 = r5.A06
            X.AnonymousClass27A.A00(r7, r5, r0)
        L_0x0836:
            if (r8 == 0) goto L_0x086d
            X.1bI r0 = r5.A07
            android.view.View r9 = r0.A02()
            com.whatsapp.community.subgroup.views.CommunityNavigationItem r9 = (com.whatsapp.community.subgroup.views.CommunityNavigationItem) r9
            if (r3 == 0) goto L_0x08ae
            int r10 = r3.intValue()
        L_0x0846:
            r9.setVisibility(r6)
            r0 = 2131232170(0x7f0805aa, float:1.8080442E38)
            r9.setIcon(r0)
            r0 = 2131888535(0x7f120997, float:1.9411708E38)
            r9.setTitle(r0)
            if (r3 != 0) goto L_0x0887
            com.whatsapp.TextEmojiLabel r1 = r9.A00
            java.lang.String r0 = ""
            r1.setText(r0)
            r0 = 20
            r1.setPlaceholder(r0)
        L_0x0863:
            r1 = 11
            X.48j r0 = new X.48j
            r0.<init>(r9, r5, r7, r1)
            r9.setOnClickListener(r0)
        L_0x086d:
            if (r11 == 0) goto L_0x0950
            r5.getWhatsAppLocale()
            X.1bI r0 = r5.A06
            android.view.View r2 = r0.A02()
        L_0x0878:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.C27641Ww.A03(r2, r6, r0)
            return
        L_0x0887:
            android.content.res.Resources r8 = r9.getResources()
            r4 = 2131755054(0x7f10002e, float:1.9140976E38)
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            X.4ZS r2 = r5.getLargeNumberFormatter()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            android.content.res.Resources r0 = r5.getResources()
            X.C18070vi.A0X(r0)
            java.lang.String r0 = r2.A02(r0, r1, r6)
            r3[r6] = r0
            java.lang.String r0 = r8.getQuantityString(r4, r10, r3)
            r9.setDescription(r0)
            goto L_0x0863
        L_0x08ae:
            r10 = 0
            goto L_0x0846
        L_0x08b0:
            if (r9 == 0) goto L_0x08f4
            X.1bI r0 = r5.A06
            if (r4 == 0) goto L_0x090c
            int r8 = r4.intValue()
        L_0x08ba:
            android.view.View r4 = r0.A02()
            com.whatsapp.community.subgroup.views.CommunityNavigationItem r4 = (com.whatsapp.community.subgroup.views.CommunityNavigationItem) r4
            r4.setVisibility(r6)
            r0 = 2131233360(0x7f080a50, float:1.8082855E38)
            r4.setIcon(r0)
            r0 = 2131888558(0x7f1209ae, float:1.9411755E38)
            r4.setTitle(r0)
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131755227(0x7f1000db, float:1.9141327E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r6] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r8, r1)
            r4.setDescription(r0)
            r1 = 13
            X.48m r0 = new X.48m
            r0.<init>(r7, r1)
            r4.setOnClickListener(r0)
        L_0x08f4:
            if (r11 == 0) goto L_0x08fb
            X.1bI r0 = r5.A07
            X.AnonymousClass27A.A00(r7, r5, r0)
        L_0x08fb:
            if (r9 == 0) goto L_0x0950
            r5.getWhatsAppLocale()
            X.1bI r0 = r5.A06
            android.view.View r2 = r0.A02()
            if (r11 != 0) goto L_0x0878
            X.C27641Ww.A03(r2, r6, r6)
            return
        L_0x090c:
            r8 = 0
            goto L_0x08ba
        L_0x090e:
            android.content.Context r1 = r10.getContext()
            int r0 = r0.intValue()
            int r0 = X.C19740yt.A00(r1, r0)
            r10.setTextColor(r0)
        L_0x091d:
            X.C43421zm.A04(r10)
        L_0x0920:
            r1 = 0
        L_0x0921:
            r9.A04(r1)
            java.lang.String r0 = "Button"
            X.AnonymousClass1Y5.A07(r4, r0)
            X.1CJ r0 = r2.A06
            boolean r0 = r0.A0P(r6)
            if (r0 == 0) goto L_0x093c
            X.1MZ r0 = r2.A07
            boolean r1 = r0.A0J(r6)
            r0 = 2131888887(0x7f120af7, float:1.9412422E38)
            if (r1 != 0) goto L_0x093f
        L_0x093c:
            r0 = 2131886299(0x7f1200db, float:1.9407173E38)
        L_0x093f:
            X.AnonymousClass1Y5.A02(r4, r0)
            X.2PA r3 = new X.2PA
            r9 = r3
            r10 = r5
            r11 = r8
            r12 = r2
            r13 = r6
            r14 = r7
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x094d:
            r4.setOnClickListener(r3)
        L_0x0950:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40401ue.Bmc(X.1xT, int):void");
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        LayoutInflater from = LayoutInflater.from(viewGroup2.getContext());
        switch (i) {
            case 1:
                List list = C42011xT.A0I;
                return new AnonymousClass28d(new C73123Pi(viewGroup2.getContext()));
            case 2:
                List list2 = C42011xT.A0I;
                return new C74273Ze(new AnonymousClass3P6(viewGroup2.getContext()));
            case 3:
                C43351zf r8 = C43351zf.A00;
                C18030ve r5 = this.A0K;
                if (r5 == null || !C18020vd.A05(C18040vf.A01, r5, 11789)) {
                    View A002 = C42071xZ.A00(viewGroup2, (AnonymousClass1LT) null, false);
                    C36491nz r2 = this.A07;
                    Context context = viewGroup2.getContext();
                    C34021jm r7 = this.A0G;
                    return r2.A00(context, A002, this.A0C, this.A0F, r7, r8, false);
                }
                View A003 = C42071xZ.A00(viewGroup2, (AnonymousClass1LT) null, true);
                C36501o0 r22 = this.A08;
                Context context2 = viewGroup2.getContext();
                C34021jm r72 = this.A0G;
                return r22.A00(context2, A003, this.A0C, this.A0F, r72, r8, false);
            case 4:
                C40381uc r4 = this.A06;
                View inflate = from.inflate(2131625490, viewGroup2, false);
                C37451pZ r11 = this.A0C;
                List list3 = C42011xT.A0I;
                AnonymousClass10E r52 = r4.A00.A01;
                AnonymousClass1M9 r10 = (AnonymousClass1M9) r52.A2f.get();
                C32111gf r9 = (C32111gf) r52.A2M.get();
                C34511kb r82 = (C34511kb) r52.A2L.get();
                AnonymousClass1MZ r13 = (AnonymousClass1MZ) r52.A4t.get();
                AnonymousClass4XG r14 = (AnonymousClass4XG) r52.AAX.get();
                return new C453328n(inflate, (C72043Kk) r52.A00.A1j.get(), r82, r9, r10, r11, (AnonymousClass1CJ) r52.A2H.get(), r13, r14, (AnonymousClass1VU) r52.A7y.get(), (AnonymousClass1KW) r52.A3d.get(), (C18030ve) r52.A04.get(), (AnonymousClass10I) r52.AC1.get(), (C18600wl) r52.A9E.get(), (C18600wl) r52.A9F.get());
            case 5:
                List list4 = C42011xT.A0I;
                return new C452528f(from.inflate(2131625281, viewGroup2, false));
            case 6:
                C18030ve r6 = this.A0K;
                if (r6 == null || !C18020vd.A05(C18040vf.A01, r6, 10545)) {
                    List list5 = C42011xT.A0I;
                    View inflate2 = from.inflate(2131626304, viewGroup2, false);
                    AnonymousClass1VU r112 = this.A0J;
                    C32111gf r53 = this.A09;
                    C42011xT r42 = new C42011xT(inflate2);
                    View view = r42.A0H;
                    AnonymousClass1Y5.A08(view, view.getContext().getString(2131892456), (String) null, (String) null);
                    C43421zm.A04((TextView) AnonymousClass1HF.A06(inflate2, 2131429287));
                    C65482wZ r73 = new C65482wZ(0);
                    ((ImageView) AnonymousClass1HF.A06(inflate2, 2131429244)).setImageDrawable(AnonymousClass1VU.A00(inflate2.getContext().getTheme(), inflate2.getContext().getResources(), r73, r112.A00, 2131233211));
                    C28931bI r0 = new C28931bI(AnonymousClass1HF.A06(view, 2131429245));
                    r0.A04(0);
                    ImageView imageView = (ImageView) r0.A02();
                    int i2 = 2131232714;
                    if (C22891Dp.A02) {
                        i2 = 2131232715;
                    }
                    imageView.setImageResource(i2);
                    inflate2.setOnClickListener(new C90004dN(r53, inflate2, 13));
                    return r42;
                }
                List list6 = C42011xT.A0I;
                View inflate3 = from.inflate(2131624597, viewGroup2, false);
                AnonymousClass1VU r92 = this.A0J;
                C32111gf r62 = this.A09;
                C42011xT r43 = new C42011xT(inflate3);
                View view2 = r43.A0H;
                AnonymousClass1Y5.A08(view2, view2.getContext().getString(2131892456), (String) null, (String) null);
                C43421zm.A04((TextView) AnonymousClass1HF.A06(inflate3, 2131429287));
                ImageView imageView2 = (ImageView) AnonymousClass1HF.A06(inflate3, 2131429244);
                C43021z7 r74 = new C43021z7();
                imageView2.setImageDrawable(AnonymousClass1VU.A00(inflate3.getContext().getTheme(), inflate3.getContext().getResources(), r74, r92.A00, 2131233212));
                int dimensionPixelSize = imageView2.getResources().getDimensionPixelSize(C39191sf.SMALL.dimension);
                C42491yG.A09(imageView2, dimensionPixelSize, dimensionPixelSize);
                inflate3.setOnClickListener(new C90004dN(r62, inflate3, 12));
                return r43;
            case 7:
                C40351uZ r63 = this.A04;
                View inflate4 = from.inflate(2131626304, viewGroup2, false);
                C37451pZ r3 = this.A0C;
                List list7 = C42011xT.A0I;
                AnonymousClass10E r23 = r63.A00.A01;
                return new C453128l(inflate4, (AnonymousClass190) r23.A31.get(), r3, (C19830z4) r23.ABl.get());
            case 8:
                List list8 = C42011xT.A0I;
                return new AnonymousClass3Z7(from.inflate(2131626854, viewGroup2, false), this.A09, this.A0I, false);
            case 9:
                C36401np r12 = this.A0M;
                AnonymousClass11C r93 = this.A0H;
                C32111gf r75 = this.A09;
                C36531o3 r83 = this.A0E;
                C18000vb r102 = this.A0I;
                C18030ve r113 = this.A0K;
                List list9 = C42011xT.A0I;
                return new C453228m(LayoutInflater.from(viewGroup2.getContext()).inflate(2131625198, viewGroup2, false), r75, r83, r93, r102, r113, r12);
            case 10:
                List list10 = C42011xT.A0I;
                return new AnonymousClass28X(new AnonymousClass3QY(viewGroup2.getContext()));
            case 11:
                C32111gf r44 = this.A09;
                List list11 = C42011xT.A0I;
                C18070vi.A0d(r44, 1);
                View inflate5 = LayoutInflater.from(viewGroup2.getContext()).inflate(2131624579, viewGroup2, false);
                C18070vi.A0X(inflate5);
                return new AnonymousClass3YJ(inflate5, r44);
            case 12:
                List list12 = C42011xT.A0I;
                return new AnonymousClass28Y(new AnonymousClass278(viewGroup2.getContext()));
            case 13:
                return C74273Ze.A00(viewGroup2, this.A0K);
            case 14:
                List list13 = C42011xT.A0I;
                Context context3 = viewGroup2.getContext();
                C18070vi.A0X(context3);
                return new AnonymousClass28Z(new AnonymousClass279(context3));
            case 15:
                List list14 = C42011xT.A0I;
                View inflate6 = LayoutInflater.from(viewGroup2.getContext()).inflate(2131624582, viewGroup2, false);
                C18070vi.A0z(inflate6, "null cannot be cast to non-null type com.whatsapp.community.subgroup.views.CommunityViewGroupsView");
                return new AnonymousClass28c((CommunityViewGroupsView) inflate6);
            case 16:
                List list15 = C42011xT.A0I;
                Context context4 = viewGroup2.getContext();
                C18070vi.A0X(context4);
                return new C452328a(new AnonymousClass27B(context4));
            case 17:
                List list16 = C42011xT.A0I;
                View inflate7 = LayoutInflater.from(viewGroup2.getContext()).inflate(2131625207, viewGroup2, false);
                C18070vi.A0X(inflate7);
                return new C74123Yp(inflate7);
            case 18:
                List list17 = C42011xT.A0I;
                Context context5 = viewGroup2.getContext();
                C18070vi.A0X(context5);
                return new AnonymousClass28e(new AnonymousClass3Qk(context5));
            case 19:
                List list18 = C42011xT.A0I;
                return new C452628g(from.inflate(2131625279, viewGroup2, false));
            case 20:
                List list19 = C42011xT.A0I;
                Context context6 = viewGroup2.getContext();
                C18070vi.A0X(context6);
                return new C452428b(new AnonymousClass27A(context6));
            case 21:
                List list20 = C42011xT.A0I;
                Context context7 = viewGroup2.getContext();
                C18070vi.A0X(context7);
                return new C42011xT(new AnonymousClass3PW(context7));
            case 22:
                C40361ua r24 = this.A05;
                View inflate8 = from.inflate(2131626303, viewGroup2, false);
                List list21 = C42011xT.A0I;
                AnonymousClass10E r25 = r24.A00.A01;
                return new C452928j(inflate8, (AnonymousClass190) r25.A31.get(), (C19830z4) r25.ABl.get());
            case 23:
                List list22 = C42011xT.A0I;
                Context context8 = viewGroup2.getContext();
                C18070vi.A0X(context8);
                return new C42011xT(new AnonymousClass3PX(context8));
            default:
                Context context9 = viewGroup2.getContext();
                List list23 = C42011xT.A0I;
                return new C42011xT(new View(context9));
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1uf, java.lang.Object] */
    public C40401ue(C40351uZ r4, C40361ua r5, C40381uc r6, C36491nz r7, C36501o0 r8, AnonymousClass1KB r9, C32111gf r10, C40371ub r11, C37451pZ r12, C37451pZ r13, C36531o3 r14, C34021jm r15, AnonymousClass11C r16, C18000vb r17, AnonymousClass1VU r18, C18030ve r19, C34441kU r20, C36401np r21, AnonymousClass1DC r22, AnonymousClass10I r23, int i) {
        this.A09 = r10;
        this.A07 = r7;
        this.A08 = r8;
        this.A0K = r19;
        this.A03 = r9;
        this.A0M = r21;
        this.A0N = r22;
        this.A0H = r16;
        this.A0I = r17;
        this.A0L = r20;
        this.A0C = r12;
        this.A0D = r13;
        this.A0J = r18;
        this.A0B = r11;
        this.A0E = r14;
        this.A04 = r4;
        this.A05 = r5;
        this.A0G = r15;
        this.A06 = r6;
        this.A0F = new C37471pb(new C200710s(r23, true));
        this.A02 = i;
        A0K(true);
        this.A00 = new C40431uh((C40411uf) new Object(), (C38391rD) this);
    }

    public /* synthetic */ boolean Be5() {
        return false;
    }

    public boolean Bex(int i) {
        if (getItemViewType(i) == 2 || getItemViewType(i) == 13) {
            return true;
        }
        return false;
    }
}
