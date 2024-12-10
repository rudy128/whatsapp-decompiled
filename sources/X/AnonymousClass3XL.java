package X;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.components.InviteViaLinkView;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3XL  reason: invalid class name */
public final class AnonymousClass3XL extends C38391rD {
    public AnonymousClass4SF A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass4TE A02 = new AnonymousClass4TE(7, (Object) null);
    public final AnonymousClass4TE A03 = new AnonymousClass4TE(0, (Object) null);
    public final AnonymousClass4TE A04 = new AnonymousClass4TE(1, (Object) null);
    public final AnonymousClass4TE A05 = new AnonymousClass4TE(5, (Object) null);
    public final AnonymousClass4P7 A06;
    public final AnonymousClass1MZ A07;
    public final AnonymousClass1MW A08;
    public final AnonymousClass1LU A09;
    public final GroupJid A0A;
    public final List A0B = AnonymousClass000.A13();
    public final C59932n7 A0C;
    public final AnonymousClass11S A0D;
    public final C72043Kk A0E;
    public final AnonymousClass4TE A0F = new AnonymousClass4TE(6, (Object) null);
    public final AnonymousClass4TE A0G = new AnonymousClass4TE(4, (Object) null);
    public final AnonymousClass1VW A0H;
    public final C24921Me A0I;
    public final C37451pZ A0J;
    public final C18030ve A0K;
    public final AnonymousClass1EC A0L;

    public AnonymousClass3XL(C59932n7 r18, AnonymousClass1KB r19, AnonymousClass11S r20, C72043Kk r21, AnonymousClass4P7 r22, AnonymousClass1VW r23, C24921Me r24, C37451pZ r25, AnonymousClass1MZ r26, AnonymousClass1MW r27, C18030ve r28, AnonymousClass1LU r29, GroupJid groupJid, AnonymousClass1EC r31) {
        AnonymousClass1KB r15 = r19;
        C18070vi.A0d(r15, 1);
        AnonymousClass1LU r0 = r29;
        C59932n7 r16 = r18;
        C18070vi.A0k(r0, r16);
        C18030ve r8 = r28;
        C18070vi.A0d(r8, 4);
        AnonymousClass11S r14 = r20;
        C18070vi.A0d(r14, 5);
        AnonymousClass1VW r12 = r23;
        C18070vi.A0d(r12, 6);
        C24921Me r11 = r24;
        AnonymousClass1MZ r10 = r26;
        AnonymousClass1MW r9 = r27;
        C72043Kk r13 = r21;
        C72483Me.A16(r11, r9, r10, r13, 7);
        AnonymousClass1EC r7 = r31;
        C18070vi.A0d(r7, 12);
        this.A01 = r15;
        this.A09 = r0;
        this.A0C = r16;
        this.A0K = r8;
        this.A0D = r14;
        this.A0H = r12;
        this.A0I = r11;
        this.A08 = r9;
        this.A07 = r10;
        this.A0E = r13;
        this.A0A = groupJid;
        this.A0L = r7;
        this.A0J = r25;
        this.A06 = r22;
    }

    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [X.1VX, java.util.List] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r6.A03.A0O(r5.A03) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            boolean r0 = r14 instanceof X.AnonymousClass3ZW
            if (r0 == 0) goto L_0x0103
            java.util.List r0 = r13.A0B
            java.lang.Object r0 = r0.get(r15)
            X.4TE r0 = (X.AnonymousClass4TE) r0
            java.lang.Object r5 = r0.A01
            X.4SF r5 = (X.AnonymousClass4SF) r5
            X.3ZW r14 = (X.AnonymousClass3ZW) r14
            if (r5 == 0) goto L_0x0170
            X.4P7 r6 = r13.A06
            r4 = 0
            r3 = 1
            X.C18070vi.A0d(r6, r3)
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x002e
            X.11S r1 = r6.A03
            com.whatsapp.jid.PhoneUserJid r0 = r5.A03
            boolean r0 = r1.A0O(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0039
        L_0x002e:
            r2 = 1
            android.view.ViewGroup r1 = r14.A00
            X.4dZ r0 = new X.4dZ
            r0.<init>(r5, r6, r4)
            r1.setOnCreateContextMenuListener(r0)
        L_0x0039:
            android.view.ViewGroup r6 = r14.A00
            r6.setClickable(r2)
            if (r2 == 0) goto L_0x00f3
            r0 = 9
            X.C89894dC.A00(r6, r14, r0)
            r0 = 2131232942(0x7f0808ae, float:1.8082007E38)
        L_0x0048:
            r6.setBackgroundResource(r0)
            X.1E7 r9 = r5.A02
            r2 = r9
            if (r9 != 0) goto L_0x0057
            com.whatsapp.jid.PhoneUserJid r0 = r5.A03
            X.1E7 r9 = new X.1E7
            r9.<init>(r0)
        L_0x0057:
            java.lang.Integer r6 = X.AnonymousClass00R.A00
            X.11S r1 = r14.A03
            com.whatsapp.jid.PhoneUserJid r0 = r5.A03
            boolean r0 = r1.A0O(r0)
            r11 = 7
            if (r0 == 0) goto L_0x00d0
            X.1xh r0 = r14.A05
            r0.A02()
            com.whatsapp.TextEmojiLabel r1 = r14.A04
            X.2n7 r0 = r14.A02
            java.lang.String r0 = r0.A00()
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            r7 = 0
            r1.A0S(r0, r7, r4, r4)
        L_0x0079:
            if (r2 == 0) goto L_0x00c5
            X.1pZ r1 = r14.A08
            android.widget.ImageView r0 = r14.A01
            r1.A07(r0, r2)
        L_0x0082:
            int r8 = r5.A00
            r5 = 8
            if (r8 != 0) goto L_0x00ac
            X.1bI r0 = r14.A09
            r0.A04(r5)
        L_0x008d:
            X.1Me r0 = r14.A07
            X.1yg r0 = r0.A0G(r9, r6, r11)
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x016a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x016a
            X.1bI r0 = r14.A0A
            android.view.View r0 = X.AnonymousClass3MY.A0I(r0, r4)
            X.C18070vi.A0X(r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r0.A0S(r1, r7, r4, r4)
        L_0x00ab:
            return
        L_0x00ac:
            X.1bI r2 = r14.A09
            android.widget.TextView r1 = X.AnonymousClass3MX.A0M(r2)
            r0 = 2131888554(0x7f1209aa, float:1.9411747E38)
            if (r8 != r3) goto L_0x00c1
            r0 = 2131888500(0x7f120974, float:1.9411637E38)
            r1.setText(r0)
        L_0x00bd:
            r2.A04(r4)
            goto L_0x008d
        L_0x00c1:
            r1.setText(r0)
            goto L_0x00bd
        L_0x00c5:
            X.1VW r2 = r14.A06
            android.widget.ImageView r1 = r14.A01
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r2.A0B(r1, r7, r0)
            goto L_0x0082
        L_0x00d0:
            X.1Me r0 = r14.A07
            X.1yg r8 = r0.A0D(r9, r11)
            java.lang.Integer r6 = r8.A00
            X.1xh r7 = r14.A05
            r10 = 0
            boolean r12 = r9.A0P()
            r7.A04(r8, r9, r10, r11, r12)
            com.whatsapp.TextEmojiLabel r1 = r14.A04
            java.lang.String r0 = r5.A04
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
        L_0x00ec:
            r7 = 0
            r1.A0S(r0, r10, r4, r4)
            goto L_0x0079
        L_0x00f1:
            r0 = 0
            goto L_0x00ec
        L_0x00f3:
            android.content.Context r2 = r6.getContext()
            r1 = 2130970830(0x7f0408ce, float:1.7550381E38)
            r0 = 2131102245(0x7f060a25, float:1.7816922E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            goto L_0x0048
        L_0x0103:
            boolean r0 = r14 instanceof X.AnonymousClass3Y4
            if (r0 == 0) goto L_0x012f
            java.util.List r0 = r13.A0B
            java.lang.Object r0 = r0.get(r15)
            X.4TE r0 = (X.AnonymousClass4TE) r0
            java.lang.Object r5 = r0.A01
            java.lang.Number r5 = (java.lang.Number) r5
            X.3Y4 r14 = (X.AnonymousClass3Y4) r14
            if (r5 == 0) goto L_0x00ab
            com.whatsapp.WaTextView r4 = r14.A00
            android.view.View r0 = r14.A0H
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131755489(0x7f1001e1, float:1.9141859E38)
            int r1 = r5.intValue()
            r0 = 1
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r5, r0)
            X.AnonymousClass3MX.A1E(r3, r4, r0, r2, r1)
            return
        L_0x012f:
            boolean r0 = r14 instanceof X.AnonymousClass3Y3
            if (r0 == 0) goto L_0x00ab
            X.1yz r0 = X.AnonymousClass1EC.A01
            com.whatsapp.jid.GroupJid r4 = r13.A0A
            X.1EC r0 = X.C42941yz.A00(r4)
            if (r0 == 0) goto L_0x00ab
            X.3Y3 r14 = (X.AnonymousClass3Y3) r14
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C18070vi.A0z(r4, r0)
            X.1EC r4 = (X.AnonymousClass1EC) r4
            X.1EC r3 = r13.A0L
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.3RZ r2 = r14.A00
            r2.A02 = r4
            r2.A03 = r3
            X.1FU r1 = r2.getActivity()
            X.C18070vi.A0X(r1)
            X.5X7 r0 = r2.getCommunityMembersViewModelFactory$app_product_community_community()
            com.whatsapp.community.CommunityMembersViewModel r0 = X.AnonymousClass4G9.A00(r1, r0, r3)
            r2.A01 = r0
            android.view.View r1 = r2.A07
            r0 = 6
            X.AnonymousClass48j.A00(r1, r3, r2, r4, r0)
            return
        L_0x016a:
            X.1bI r0 = r14.A0A
            r0.A04(r5)
            return
        L_0x0170:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XL.Bmc(X.1xT, int):void");
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater A0B2;
        int i2;
        C18070vi.A0d(viewGroup, 0);
        if (i != 0) {
            switch (i) {
                case 2:
                    View A0E2 = AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624591);
                    C18030ve r10 = this.A0K;
                    return new AnonymousClass3ZW(A0E2, this.A0C, this.A0D, this.A0E, this.A0H, this.A0I, this.A0J, r10);
                case 3:
                    List list = C42011xT.A0I;
                    AnonymousClass1EC r2 = this.A0L;
                    View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625486, viewGroup, false);
                    AnonymousClass48j.A00(inflate, r2, this, viewGroup, 7);
                    return new AnonymousClass3Y4(inflate);
                case 4:
                    A0B2 = AnonymousClass3MY.A0B(viewGroup);
                    i2 = 2131624593;
                    break;
                case 5:
                    List list2 = C42011xT.A0I;
                    AnonymousClass1EC r22 = this.A0L;
                    View inflate2 = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625486, viewGroup, false);
                    AnonymousClass3MW.A0J(inflate2, 2131436044).setText(2131891951);
                    AnonymousClass48j.A00(inflate2, r22, this, viewGroup, 8);
                    view = inflate2;
                    break;
                case 6:
                    A0B2 = AnonymousClass3MY.A0B(viewGroup);
                    i2 = 2131624592;
                    break;
                case 7:
                    return new AnonymousClass3Y3(new AnonymousClass3RZ(AnonymousClass3MY.A05(viewGroup)));
                default:
                    A0B2 = AnonymousClass3MY.A0B(viewGroup);
                    i2 = 2131624606;
                    break;
            }
            view = AnonymousClass3MX.A0B(A0B2, viewGroup, i2, false);
        } else {
            List list3 = C42011xT.A0I;
            AnonymousClass1EC r23 = this.A0L;
            InviteViaLinkView inviteViaLinkView = new InviteViaLinkView(AnonymousClass3MY.A04(viewGroup), (AttributeSet) null, 0);
            Activity A052 = AnonymousClass3Ma.A05(viewGroup);
            AnonymousClass3MW.A1W(A052);
            inviteViaLinkView.setupOnClick(r23, (AnonymousClass1FU) A052, (C81723zh) null, (AnonymousClass1EC) null);
            TextView A0E3 = C17880vN.A0E(inviteViaLinkView, 2131431815);
            view = inviteViaLinkView;
            if (A0E3 != null) {
                A0E3.setText(2131888534);
                view = inviteViaLinkView;
            }
        }
        return new C42011xT(view);
    }

    public long A0M(int i) {
        AnonymousClass4TE r2 = (AnonymousClass4TE) this.A0B.get(i);
        int i2 = r2.A00;
        if (i2 == 2) {
            AnonymousClass4SF r0 = (AnonymousClass4SF) r2.A01;
            if (r0 != null) {
                i2 = r0.A03.hashCode();
            } else {
                throw C17880vN.A0g();
            }
        }
        return (long) i2;
    }

    public int A0Q() {
        return this.A0B.size();
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass4TE) this.A0B.get(i)).A00;
    }

    public final void A0U(List list) {
        ArrayList A0s = C72463Mc.A0s(list);
        A0s.add(this.A0G);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass4SF r3 = (AnonymousClass4SF) it.next();
            GroupJid groupJid = this.A0A;
            if (groupJid != null && this.A07.A05(groupJid, r3.A03) == null) {
                A0s.add(new AnonymousClass4TE(2, r3));
            }
        }
        A0s.add(this.A0F);
        List list2 = this.A0B;
        C72473Md.A1B(new C73393Vm(list2, A0s), this, A0s, list2);
    }
}
