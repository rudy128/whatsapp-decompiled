package X;

import android.widget.BaseAdapter;
import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.community.AggregateCommunityObserver$chatsObserver$1$onChatLockStateChanged$1;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.Collection;

/* renamed from: X.4mC  reason: invalid class name and case insensitive filesystem */
public class C95414mC implements C28741ap {
    public final int A00;
    public final Object A01;

    public C95414mC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r1 != X.C179509Ig.OWNER) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void BoG(X.AnonymousClass1BI r25, boolean r26) {
        /*
            r24 = this;
            r1 = r24
            int r0 = r1.A00
            r4 = r25
            switch(r0) {
                case 4: goto L_0x0070;
                case 12: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r3 = r1.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.1E7 r6 = r3.A35
            X.1BI r0 = r6.A0J
            if (r4 != r0) goto L_0x0009
            boolean r0 = X.C22971Dz.A0V(r4)
            if (r0 == 0) goto L_0x0009
            X.3Ub r0 = r3.A2X
            X.4md r2 = r0.A04
            X.1E7 r1 = r0.A00
            X.1BI r0 = r0.A05
            boolean r19 = r2.A00(r1, r0)
            r11 = 0
            X.3Ub r0 = r3.A2X
            X.9Ig r1 = r0.A0T()
            if (r1 == 0) goto L_0x0035
            X.9Ig r0 = X.C179509Ig.OWNER
            r21 = 1
            if (r1 == r0) goto L_0x0037
        L_0x0035:
            r21 = 0
        L_0x0037:
            X.4X5 r0 = X.AnonymousClass3Ma.A0Y(r3)
            X.00H r0 = r0.A0I
            java.lang.Object r2 = r0.get()
            X.4Rr r2 = (X.C86454Rr) r2
            X.1BI r1 = r3.A3R
            X.25J r0 = X.C29681ch.A03
            boolean r0 = r1 instanceof X.C29681ch
            if (r0 == 0) goto L_0x006e
            X.1ch r1 = (X.C29681ch) r1
        L_0x004d:
            boolean r22 = r2.A01(r1)
            r5 = 0
            X.4Cw r8 = X.C82974Cw.NOT_ENFORCED
            r10 = 4
            X.4SW r4 = new X.4SW
            r9 = r5
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r20 = r11
            r23 = r11
            r7 = r5
            r12 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.AnonymousClass4aY.A1R(r3, r4)
            return
        L_0x006e:
            r1 = 0
            goto L_0x004d
        L_0x0070:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.lang.Object r3 = r1.A01
            X.4Xp r3 = (X.AnonymousClass4Xp) r3
            X.1OX r2 = r3.A0K
            r1 = 0
            com.whatsapp.community.AggregateCommunityObserver$chatsObserver$1$onChatChanged$1 r0 = new com.whatsapp.community.AggregateCommunityObserver$chatsObserver$1$onChatChanged$1
            r0.<init>(r3, r4, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95414mC.BoG(X.1BI, boolean):void");
    }

    public /* synthetic */ void BoJ(AnonymousClass1BI r5) {
        switch (this.A00) {
            case 4:
                C18070vi.A0d(r5, 0);
                AnonymousClass4Xp r3 = (AnonymousClass4Xp) this.A01;
                AnonymousClass3MX.A1Q(new AggregateCommunityObserver$chatsObserver$1$onChatLockStateChanged$1(r3, r5, (C30391dr) null), r3.A0K);
                return;
            case 5:
                C98754rf.A00(((AnonymousClass3VJ) this.A01).A0P, this, 44);
                return;
            default:
                return;
        }
    }

    public /* synthetic */ void BoK() {
        if (12 - this.A00 == 0) {
            AnonymousClass4aY r0 = (AnonymousClass4aY) this.A01;
            AnonymousClass4aY.A1E(r0);
            C98774rh.A00(r0.A2B, 7);
        }
    }

    public void BoO(AnonymousClass1BI r5, C32961i2 r6) {
        BaseAdapter baseAdapter;
        switch (this.A00) {
            case 0:
                ((BusinessProfileExtraFieldsActivity) this.A01).A4b();
                return;
            case 1:
                CallLogActivity.A0Q((CallLogActivity) this.A01);
                return;
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
                contactInfoActivity.A0k.A0V();
                contactInfoActivity.A2X();
                return;
            case 3:
                C76793oR r2 = ((ListChatInfoActivity) this.A01).A08;
                C98754rf.A01(r2.A0H, r2, 0);
                return;
            case 6:
                ((AnonymousClass3gf) this.A01).A4r();
                return;
            case 7:
                ((C75433hU) this.A01).A0I();
                return;
            case 8:
                C75423hT.A00((C75423hT) this.A01);
                return;
            case 9:
                baseAdapter = ((MediaAlbumActivity) this.A01).A0A;
                break;
            case 10:
                baseAdapter = ((MessageDetailsActivity) this.A01).A01;
                break;
            case 11:
                ((C79333vF) this.A01).A04.notifyDataSetChanged();
                return;
            case 13:
                ((C73293Ub) this.A01).A06.execute(new C98554rL(this, 8));
                return;
            case 14:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A01;
                GroupAdminPickerActivity.A0c(groupAdminPickerActivity, groupAdminPickerActivity.A0I);
                return;
            case 15:
                GroupChatInfoActivity.A19((GroupChatInfoActivity) this.A01);
                return;
            case 16:
                C18070vi.A0d(r5, 0);
                NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A01;
                if (r5.equals(C29681ch.A03.A01(C72453Mb.A0u(newsletterInfoActivity)))) {
                    C76823oU r22 = newsletterInfoActivity.A0g;
                    if (r22 == null) {
                        C18070vi.A11("newsletterInfoViewModel");
                        throw null;
                    }
                    r22.A0Z(true);
                    newsletterInfoActivity.A2X();
                    return;
                }
                return;
            default:
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public /* synthetic */ void BoD(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoE(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoR(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoW(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoZ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoF(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoP(AnonymousClass1BI r1, AnonymousClass201 r2) {
    }

    public /* synthetic */ void BoS(AnonymousClass1BI r1, Collection collection) {
    }

    public /* synthetic */ void BoX(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoY(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoQ(AnonymousClass1BI r1, Collection collection, int i, boolean z) {
    }
}
