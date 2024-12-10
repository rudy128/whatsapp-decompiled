package X;

import android.content.Intent;
import android.view.View;

/* renamed from: X.48m  reason: invalid class name */
public class AnonymousClass48m extends C38471rL {
    public final int A00;
    public final Object A01;

    public AnonymousClass48m(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass48m(obj, i));
    }

    /* JADX WARNING: type inference failed for: r1v60, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v12, types: [X.4FE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v3, types: [com.whatsapp.bizintegrity.utils.BizIntegrityFragment, com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment, com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment] */
    /* JADX WARNING: type inference failed for: r13v2, types: [X.4FE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v5, types: [com.whatsapp.bizintegrity.utils.BizIntegrityFragment, com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment, com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b3, code lost:
        if (r1.A06() != false) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x068b, code lost:
        X.AnonymousClass3V5.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x068e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x068f, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0855, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0859, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x09ce, code lost:
        r1.A01(r4.getContext(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x09d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r2.CGF(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0abf, code lost:
        r3.create().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0ac6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x021c, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x021e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r18) {
        /*
            r17 = this;
            r5 = r17
            int r0 = r5.A00
            r4 = r18
            switch(r0) {
                case 0: goto L_0x0603;
                case 1: goto L_0x0603;
                case 2: goto L_0x0009;
                case 3: goto L_0x0009;
                case 4: goto L_0x0603;
                case 5: goto L_0x0009;
                case 6: goto L_0x0610;
                case 7: goto L_0x001c;
                case 8: goto L_0x003a;
                case 9: goto L_0x0626;
                case 10: goto L_0x0664;
                case 11: goto L_0x0678;
                case 12: goto L_0x0645;
                case 13: goto L_0x0693;
                case 14: goto L_0x069f;
                case 15: goto L_0x06c4;
                case 16: goto L_0x06de;
                case 17: goto L_0x06e4;
                case 18: goto L_0x0579;
                case 19: goto L_0x008b;
                case 20: goto L_0x070e;
                case 21: goto L_0x00c6;
                case 22: goto L_0x0734;
                case 23: goto L_0x077c;
                case 24: goto L_0x0784;
                case 25: goto L_0x07b1;
                case 26: goto L_0x077c;
                case 27: goto L_0x080a;
                case 28: goto L_0x0163;
                case 29: goto L_0x0819;
                case 30: goto L_0x077c;
                case 31: goto L_0x082c;
                case 32: goto L_0x083c;
                case 33: goto L_0x0593;
                case 34: goto L_0x084b;
                case 35: goto L_0x08a9;
                case 36: goto L_0x08bd;
                case 37: goto L_0x08d4;
                case 38: goto L_0x0182;
                case 39: goto L_0x08dc;
                case 40: goto L_0x01ae;
                case 41: goto L_0x093e;
                case 42: goto L_0x0946;
                case 43: goto L_0x02e9;
                case 44: goto L_0x0404;
                case 45: goto L_0x0414;
                case 46: goto L_0x0424;
                case 47: goto L_0x045a;
                case 48: goto L_0x048c;
                case 49: goto L_0x0515;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r5.A01
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r0
            X.3VM r3 = r0.A0P
            X.10I r2 = r3.A0f
            r0 = 48
            X.4rf r1 = new X.4rf
            r1.<init>(r3, r0)
        L_0x0018:
            r2.CGF(r1)
        L_0x001b:
            return
        L_0x001c:
            java.lang.Object r4 = r5.A01
            com.whatsapp.community.ManageGroupsInCommunityActivity r4 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r4
            boolean r0 = com.whatsapp.community.ManageGroupsInCommunityActivity.A0Q(r4)
            if (r0 != 0) goto L_0x001b
            X.1VD r0 = r4.A0L
            X.1VC r0 = r0.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x094e
            X.1VD r0 = r4.A0L
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r0 = r0.A00()
            r4.CMl(r0)
            return
        L_0x003a:
            java.lang.Object r6 = r5.A01
            com.whatsapp.community.ManageGroupsInCommunityActivity r6 = (com.whatsapp.community.ManageGroupsInCommunityActivity) r6
            boolean r0 = com.whatsapp.community.ManageGroupsInCommunityActivity.A0Q(r6)
            if (r0 != 0) goto L_0x001b
            X.00H r0 = r6.A0T
            r0.get()
            X.00H r0 = r6.A0P
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            X.0ve r2 = r0.A07
            r1 = 1238(0x4d6, float:1.735E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            int r5 = r0 + 1
            X.3p1 r0 = r6.A0A
            X.1vp r0 = r0.A0w
            int r0 = X.C72463Mc.A0A(r0)
            int r5 = r5 - r0
            X.1EC r4 = r6.A0K
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.LinkExistingGroups"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "max_groups_allowed_to_link"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x0080
            java.lang.String r0 = "parent_group_jid"
            X.AnonymousClass3MY.A12(r2, r4, r0)
        L_0x0080:
            java.lang.String r0 = "community_name"
            r2.putExtra(r0, r3)
            r0 = 10
            r6.CNh(r2, r0)
            return
        L_0x008b:
            java.lang.Object r6 = r5.A01
            com.whatsapp.contact.picker.ContactPickerFragment r6 = (com.whatsapp.contact.picker.ContactPickerFragment) r6
            X.1FL r5 = r6.A1B()
            if (r5 == 0) goto L_0x001b
            boolean r0 = r6.A3M
            r2 = 2
            if (r0 == 0) goto L_0x009b
            r2 = 5
        L_0x009b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            X.1nb r0 = r6.A0v
            r0.A00(r3)
            boolean r0 = r6.A3O
            if (r0 == 0) goto L_0x00ae
            X.4YE r1 = r6.A1l
            r0 = 6
            r1.A03(r0)
        L_0x00ae:
            X.11S r0 = r6.A0T
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x09cc
            X.1L9 r1 = r6.A0J
            android.content.Context r0 = r6.A14()
            android.content.Intent r0 = X.AnonymousClass1LU.A0F(r0, r2)
            r1.A09(r5, r0)
            return
        L_0x00c6:
            java.lang.Object r8 = r5.A01
            com.whatsapp.contact.picker.ContactPickerFragment r8 = (com.whatsapp.contact.picker.ContactPickerFragment) r8
            boolean r0 = com.whatsapp.contact.picker.ContactPickerFragment.A0n(r8)
            if (r0 == 0) goto L_0x00ff
            X.00H r0 = r8.A2n
            java.lang.Object r0 = r0.get()
            X.2iK r0 = (X.C56972iK) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r8.A3S
            if (r0 != 0) goto L_0x00e6
            boolean r0 = r8.A3a
            if (r0 == 0) goto L_0x00ff
        L_0x00e6:
            boolean r1 = r8.A3a
            r0 = 3
            if (r1 == 0) goto L_0x00ed
            r0 = 10
        L_0x00ed:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.1hg r2 = r8.A1n
            int r0 = r3.intValue()
            java.lang.Integer r1 = X.C32741hg.A02(r0)
            r0 = 0
            r2.A0F(r0, r3, r1)
        L_0x00ff:
            X.4Xm r2 = r8.A1X
            r0 = 3
            X.4fP r1 = new X.4fP
            r1.<init>(r5, r0)
            r0 = 107(0x6b, float:1.5E-43)
            r2.A01(r1, r0)
            boolean r7 = com.whatsapp.contact.picker.ContactPickerFragment.A0n(r8)
            boolean r6 = com.whatsapp.contact.picker.ContactPickerFragment.A0m(r8)
            X.1BI r0 = r8.A1b
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 != 0) goto L_0x0159
            android.content.Context r4 = r8.A14()
            X.0z4 r3 = r8.A18
            X.6oT r0 = r8.A0s
            boolean r2 = X.C72453Mb.A1Z(r3)
            if (r0 == 0) goto L_0x0159
            X.1vp r0 = r0.A0K
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x0159
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r3)
            java.lang.String r0 = "forward_with_captions_nux_shown"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0159
            X.3Rj r2 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131890527(0x7f12115f, float:1.9415748E38)
            r2.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 12
            X.C73203Rj.A08(r2, r3, r0, r1)
            r2.A0C()
            java.lang.String r0 = "contactpicker/forward with captions nux shown"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0159:
            X.10I r2 = r8.A1y
            r0 = 6
            X.7Qv r1 = new X.7Qv
            r1.<init>(r5, r0, r7, r6)
            goto L_0x0018
        L_0x0163:
            java.lang.Object r2 = r5.A01
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            X.7Fe r0 = r2.A03
            if (r0 == 0) goto L_0x001b
            X.6g9 r0 = r0.A05
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x09d6
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x09d6
            return
        L_0x0182:
            java.lang.Object r2 = r5.A01
            X.3uR r2 = (X.C79093uR) r2
            X.5cR r1 = r2.A0k
            if (r1 == 0) goto L_0x001b
            java.lang.Class<X.5Xc> r0 = X.C106765Xc.class
            java.lang.Object r1 = r1.BPO(r0)
            X.5Xc r1 = (X.C106765Xc) r1
            if (r1 == 0) goto L_0x001b
            X.206 r3 = r2.getFMessage()
            X.3wF r2 = X.C79913wF.A00
            X.4lm r1 = (X.C95154lm) r1
            int r0 = r1.A00
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x09fe
            java.lang.Object r1 = r1.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r0 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment.A00(r2, r3)
            r1.CMl(r0)
            return
        L_0x01ae:
            java.lang.Object r3 = r5.A01
            X.3uP r3 = (X.AnonymousClass3uP) r3
            X.206 r9 = r3.getFMessage()
            X.00H r0 = r3.A2J
            java.lang.Object r0 = r0.get()
            X.70P r0 = (X.AnonymousClass70P) r0
            boolean r0 = r0.A06(r9)
            if (r0 == 0) goto L_0x01e6
            X.00H r0 = r3.A2I
            java.lang.Object r8 = r0.get()
            X.72y r8 = (X.C1407672y) r8
            r15 = 0
            X.C18070vi.A0d(r9, r15)
            X.0ve r2 = r8.A02
            r1 = 3127(0xc37, float:4.382E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01e6
            r10 = 0
            r16 = 5
            r12 = r10
            r13 = r10
            r14 = r10
            r11 = r10
            X.C1407672y.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x01e6:
            X.1FU r4 = X.C72473Md.A0O(r3)
            if (r4 == 0) goto L_0x001b
            X.1Qy r0 = r3.A16
            int r8 = r0.A01(r9)
            X.00H r0 = r3.A1h
            boolean r0 = X.C79103uS.A1K(r3, r9, r0)
            if (r0 == 0) goto L_0x01ff
            if (r8 == 0) goto L_0x020b
            X.AnonymousClass3uP.A0b(r4, r3)
        L_0x01ff:
            boolean r0 = r3.A1X()
            if (r0 == 0) goto L_0x001b
            if (r8 == 0) goto L_0x02c8
            X.AnonymousClass3uP.A0b(r4, r3)
            return
        L_0x020b:
            r0 = 4096(0x1000, double:2.0237E-320)
            boolean r0 = r9.A11(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0222
            java.lang.String r1 = r3.getMoreInfoString()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01ff
        L_0x021e:
            r4.BhS(r6, r1)
            goto L_0x01ff
        L_0x0222:
            r0 = 512(0x200, double:2.53E-321)
            boolean r0 = r9.A11(r0)
            if (r0 == 0) goto L_0x0274
            int r2 = r9.A05
            if (r2 > 0) goto L_0x0239
            r0 = 2131892991(0x7f121aff, float:1.9420746E38)
            java.lang.String r1 = r4.getString(r0)
        L_0x0235:
            X.C18070vi.A0X(r1)
            goto L_0x021e
        L_0x0239:
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r2 <= r0) goto L_0x024e
            int r2 = r2 / r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755122(0x7f100072, float:1.9141114E38)
        L_0x0246:
            java.lang.String r1 = X.C72473Md.A0k(r1, r2, r0)
            X.C18070vi.A0b(r1)
            goto L_0x021e
        L_0x024e:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r2 < r0) goto L_0x025b
            int r2 = r2 / r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755123(0x7f100073, float:1.9141116E38)
            goto L_0x0246
        L_0x025b:
            r0 = 60
            if (r2 < r0) goto L_0x0268
            int r2 = r2 / r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755124(0x7f100074, float:1.9141118E38)
            goto L_0x0246
        L_0x0268:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755125(0x7f100075, float:1.914112E38)
            java.lang.String r1 = X.C72473Md.A0k(r1, r2, r0)
            goto L_0x0235
        L_0x0274:
            X.00H r0 = r3.A20
            java.lang.Object r0 = r0.get()
            X.2Zm r0 = (X.C51752Zm) r0
            X.0ve r2 = r0.A00
            r1 = 6939(0x1b1b, float:9.724E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01ff
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            boolean r0 = r9.A11(r0)
            if (r0 == 0) goto L_0x01ff
            X.205 r0 = r9.A0v
            X.1BI r1 = r0.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 != 0) goto L_0x01ff
            com.whatsapp.jid.UserJid r7 = X.C22941Dw.A00(r1)
            X.1PM r2 = r3.A0k
            X.1Ok r0 = r3.A0m
            X.2tn r1 = new X.2tn
            r1.<init>((X.AnonymousClass1PM) r2, (X.C25491Ok) r0, (com.whatsapp.jid.UserJid) r7)
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x02b5
            boolean r0 = r1.A06()
            r2 = 0
            if (r0 == 0) goto L_0x02b6
        L_0x02b5:
            r2 = 1
        L_0x02b6:
            android.content.Context r1 = r3.getContext()
            r0 = 2131899076(0x7f1232c4, float:1.9433088E38)
            if (r2 == 0) goto L_0x02c2
            r0 = 2131899077(0x7f1232c5, float:1.943309E38)
        L_0x02c2:
            java.lang.String r1 = r1.getString(r0)
            goto L_0x021e
        L_0x02c8:
            X.00H r0 = r3.A2H
            java.lang.Object r0 = r0.get()
            X.4QZ r0 = (X.AnonymousClass4QZ) r0
            java.lang.Integer r0 = r0.A00(r9)
            if (r0 == 0) goto L_0x001b
            int r3 = r0.intValue()
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 2131891598(0x7f12158e, float:1.941792E38)
            X.4gj r0 = new X.4gj
            r0.<init>(r4, r9, r5)
            r4.A3u(r0, r3, r2, r1)
            return
        L_0x02e9:
            java.lang.Object r4 = r5.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            X.206 r3 = r4.getFMessage()
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.1FU> r0 = X.AnonymousClass1FU.class
            android.app.Activity r2 = X.C18050vg.A01(r1, r0)
            X.1FL r2 = (X.AnonymousClass1FL) r2
            if (r2 == 0) goto L_0x001b
            X.00H r0 = r4.A25
            java.lang.Object r1 = r0.get()
            X.4Qc r1 = (X.C86084Qc) r1
            android.content.Context r11 = r4.getContext()
            X.1GP r10 = r2.getSupportFragmentManager()
            com.whatsapp.jid.UserJid r9 = r3.A0I()
            java.lang.String r8 = "quick_action"
            X.C18070vi.A0h(r11, r10)
            if (r9 == 0) goto L_0x001b
            X.00H r0 = r1.A03
            java.lang.Object r0 = r0.get()
            X.1mm r0 = (X.C35771mm) r0
            boolean r0 = r0.A08(r9)
            X.2gX r7 = r1.A01
            if (r0 == 0) goto L_0x039b
            r0 = 2131231774(0x7f08041e, float:1.8079639E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 2131231552(0x7f080340, float:1.8079188E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 2131103258(0x7f060e1a, float:1.7818977E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r2 = 2131625929(0x7f0e07c9, float:1.887908E38)
            r1 = 2131891904(0x7f1216c0, float:1.9418541E38)
            r0 = 2131891902(0x7f1216be, float:1.9418537E38)
            X.4FE r13 = new X.4FE
            r13.<init>()
            r13.A01 = r2
            r13.A06 = r6
            r13.A04 = r5
            r13.A05 = r4
            r13.A02 = r1
            r13.A03 = r3
            r13.A00 = r0
            r13.A07 = r3
            X.0ve r6 = r7.A04
            X.1KB r5 = r7.A01
            X.1LU r4 = r7.A05
            X.1L9 r3 = r7.A00
            X.11C r2 = r7.A02
            X.00H r0 = r7.A06
            java.lang.Object r1 = r0.get()
            X.1mm r1 = (X.C35771mm) r1
            X.00H r0 = r7.A07
            java.lang.Object r0 = r0.get()
            X.1mk r0 = (X.C35751mk) r0
            com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment r12 = new com.whatsapp.bizintegrity.marketingoptout.MarketingReOptInFragment
            r12.<init>()
            r12.A06 = r13
            r12.A08 = r6
            r12.A04 = r5
            r12.A09 = r4
            r12.A03 = r3
            r12.A07 = r2
            r12.A03 = r9
            r12.A01 = r1
            r12.A04 = r8
            r12.A02 = r0
            r12.A00 = r11
        L_0x0393:
            java.lang.String r0 = X.C17890vO.A0U(r12)
            r12.A2C(r10, r0)
            return
        L_0x039b:
            r0 = 2131232091(0x7f08055b, float:1.8080281E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r0 = 2131231552(0x7f080340, float:1.8079188E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r0 = 2131103258(0x7f060e1a, float:1.7818977E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 2131891888(0x7f1216b0, float:1.9418509E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r2 = 2131625927(0x7f0e07c7, float:1.8879076E38)
            r1 = 2131891889(0x7f1216b1, float:1.941851E38)
            r0 = 2131891885(0x7f1216ad, float:1.9418503E38)
            X.4FE r6 = new X.4FE
            r6.<init>()
            r6.A01 = r2
            r6.A06 = r13
            r6.A04 = r12
            r6.A05 = r5
            r6.A02 = r1
            r6.A03 = r3
            r6.A00 = r0
            r6.A07 = r4
            X.0ve r5 = r7.A04
            X.1KB r4 = r7.A01
            X.1LU r3 = r7.A05
            X.1L9 r2 = r7.A00
            X.11C r1 = r7.A02
            X.00H r0 = r7.A07
            java.lang.Object r0 = r0.get()
            X.1mk r0 = (X.C35751mk) r0
            com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment r12 = new com.whatsapp.bizintegrity.marketingoptout.MarketingOptOutFragment
            r12.<init>()
            r12.A06 = r6
            r12.A08 = r5
            r12.A04 = r4
            r12.A09 = r3
            r12.A03 = r2
            r12.A07 = r1
            r12.A01 = r7
            r12.A03 = r9
            r12.A04 = r8
            r12.A02 = r0
            r12.A00 = r11
            goto L_0x0393
        L_0x0404:
            java.lang.Object r0 = r5.A01
            X.3uR r0 = (X.C79093uR) r0
            X.5cR r1 = r0.A0k
            if (r1 == 0) goto L_0x001b
            X.206 r0 = r0.getFMessage()
            r1.BCy(r0)
            return
        L_0x0414:
            java.lang.Object r0 = r5.A01
            X.3uR r0 = (X.C79093uR) r0
            X.5cR r1 = r0.A0k
            if (r1 == 0) goto L_0x001b
            X.206 r0 = r0.getFMessage()
            r1.BCz(r0)
            return
        L_0x0424:
            java.lang.Object r4 = r5.A01
            X.3so r4 = (X.C78443so) r4
            X.73C r0 = r4.A0J
            r2 = 0
            if (r0 != 0) goto L_0x043b
            java.lang.String r0 = "conversationrowcontact/addcontactonclicklistener/contact is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r1 = r4.A0S
            r0 = 2131890000(0x7f120f50, float:1.941468E38)
            r1.A08(r0, r2)
            return
        L_0x043b:
            byte[] r1 = r0.A0B
            if (r1 == 0) goto L_0x0458
            int r0 = r1.length
            if (r0 <= 0) goto L_0x0458
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)
        L_0x0446:
            X.1FU r2 = X.C72473Md.A0O(r4)
            X.73C r1 = r4.A0J
            if (r1 == 0) goto L_0x001b
            boolean r0 = r2 instanceof X.AnonymousClass5ZB
            if (r0 == 0) goto L_0x001b
            X.5ZB r2 = (X.AnonymousClass5ZB) r2
            r2.CMb(r3, r1)
            return
        L_0x0458:
            r3 = 0
            goto L_0x0446
        L_0x045a:
            java.lang.Object r7 = r5.A01
            X.3so r7 = (X.C78443so) r7
            X.73C r0 = r7.A0J
            boolean r0 = X.C78443so.A04(r7, r0)
            if (r0 == 0) goto L_0x001b
            X.73C r0 = r7.A0J
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0a0c
            java.util.Iterator r4 = r0.iterator()
        L_0x0474:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0a0c
            java.lang.Object r2 = r4.next()
            X.6jA r2 = (X.C130276jA) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x0474
            java.lang.String r0 = r2.A02
            r3.add(r0)
            goto L_0x0474
        L_0x048c:
            java.lang.Object r1 = r5.A01
            X.3so r1 = (X.C78443so) r1
            int r2 = r1.A00
            r0 = 1
            if (r2 != r0) goto L_0x04bc
            java.util.ArrayList r0 = r1.A0a
            java.util.Iterator r2 = r0.iterator()
        L_0x049b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r4 = r2.next()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            if (r4 == 0) goto L_0x049b
            X.700 r3 = r1.A06
            android.content.Context r2 = r1.getContext()
            X.73C r1 = r1.A0J
            r0 = 0
            if (r1 == 0) goto L_0x04b8
            X.6oE r0 = r1.A0A
            java.lang.String r0 = r0.A08
        L_0x04b8:
            r3.A02(r2, r4, r0)
            return
        L_0x04bc:
            r1.getFMessage()
            android.content.Context r2 = r1.getContext()
            java.lang.Class<X.01E> r0 = X.AnonymousClass01E.class
            android.app.Activity r5 = X.C18050vg.A01(r2, r0)
            X.1FL r5 = (X.AnonymousClass1FL) r5
            X.73C r0 = r1.A0J
            if (r0 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x001b
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            r2 = 0
        L_0x04da:
            X.73C r0 = r1.A0J
            java.util.List r0 = r0.A06
            int r0 = r0.size()
            r8 = 0
            if (r2 >= r0) goto L_0x0ad7
            java.util.ArrayList r0 = r1.A0a
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x050e
            X.73C r0 = r1.A0J
            java.util.List r0 = r0.A06
            java.lang.Object r0 = r0.get(r2)
            X.6ib r0 = (X.C129926ib) r0
            java.lang.String r0 = r0.A02
            r7.add(r0)
            X.73C r0 = r1.A0J
            java.util.List r0 = r0.A06
            java.lang.Object r0 = r0.get(r2)
            X.6ib r0 = (X.C129926ib) r0
            java.lang.String r0 = r0.A03
            r6.add(r0)
        L_0x050b:
            int r2 = r2 + 1
            goto L_0x04da
        L_0x050e:
            r7.add(r8)
            r6.add(r8)
            goto L_0x050b
        L_0x0515:
            java.lang.Object r3 = r5.A01
            X.3so r3 = (X.C78443so) r3
            android.content.Context r1 = r3.getContext()
            java.lang.Class<X.1FY> r0 = X.AnonymousClass1FY.class
            android.app.Activity r6 = X.C18050vg.A01(r1, r0)
            X.1FY r6 = (X.AnonymousClass1FY) r6
            java.util.ArrayList r1 = r3.A0a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001b
            r2 = 0
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x001b
            if (r6 == 0) goto L_0x001b
            java.lang.Object r9 = r1.get(r2)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            X.1M9 r0 = r3.A0j
            X.1E7 r4 = r0.A0H(r9)
            X.1BI r1 = r4.A0J
            boolean r0 = X.C22971Dz.A0d(r1)
            if (r0 == 0) goto L_0x054f
            X.11S r0 = r3.A0U
            r0.A0O(r1)
        L_0x054f:
            boolean r0 = r4.A0C()
            if (r0 != 0) goto L_0x0b03
            X.2Pp r1 = r3.A09
            if (r1 == 0) goto L_0x0560
            r0 = 1
            r1.A0B(r0)
            r0 = 0
            r3.A09 = r0
        L_0x0560:
            X.11S r5 = r3.A0U
            X.12E r8 = r3.A08
            X.00H r0 = r3.A0G
            java.lang.Object r7 = r0.get()
            X.1tC r7 = (X.C39511tC) r7
            X.2Pp r4 = new X.2Pp
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A09 = r4
            X.10I r0 = r3.A1X
            X.AnonymousClass3MW.A1T(r4, r0, r2)
            return
        L_0x0579:
            java.lang.Object r2 = r5.A01
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            boolean r1 = r2.A2n()
            r0 = 14
            if (r1 != 0) goto L_0x0586
            r0 = 2
        L_0x0586:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.1nb r0 = r2.A0v
            r0.A00(r3)
            X.1nc r1 = r2.A0X
            goto L_0x09ce
        L_0x0593:
            java.lang.Object r6 = r5.A01
            com.whatsapp.conversation.ConversationAttachmentContentView r6 = (com.whatsapp.conversation.ConversationAttachmentContentView) r6
            android.content.Context r0 = r6.getContext()
            X.3Rj r3 = X.AnonymousClass4a6.A00(r0)
            X.1R2 r2 = r6.A0M
            X.0ve r0 = r2.A07
            int r0 = X.AnonymousClass8BX.A03(r0)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r1 = 2131893280(0x7f121c20, float:1.9421332E38)
            if (r0 == 0) goto L_0x05b3
            r1 = 2131888115(0x7f1207f3, float:1.9410856E38)
        L_0x05b3:
            X.118 r0 = r2.A04
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r1)
            r3.A0k(r0)
            X.1R2 r4 = r6.A0M
            X.4PH r2 = r6.A0B
            X.1BI r0 = r6.A0H
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1M9 r0 = r2.A00
            X.1E7 r1 = r0.A0E(r1)
            if (r1 == 0) goto L_0x0601
            X.1Me r0 = r2.A01
            java.lang.String r2 = r0.A0I(r1)
        L_0x05da:
            X.0ve r0 = r4.A07
            int r0 = X.AnonymousClass8BX.A03(r0)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r1 = 2131893279(0x7f121c1f, float:1.942133E38)
            if (r0 == 0) goto L_0x05ec
            r1 = 2131888114(0x7f1207f2, float:1.9410854E38)
        L_0x05ec:
            X.118 r0 = r4.A04
            android.content.Context r0 = r0.A00
            java.lang.String r0 = X.C72473Md.A0j(r0, r2, r1)
            r3.A0S(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 15
            X.C73203Rj.A08(r3, r5, r0, r1)
            goto L_0x0abf
        L_0x0601:
            r2 = 0
            goto L_0x05da
        L_0x0603:
            java.lang.Object r0 = r5.A01
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r0
            X.3VM r0 = r0.A0P
            X.1vp r1 = r0.A0e
            r0 = 1
            X.AnonymousClass3MX.A1J(r1, r0)
            return
        L_0x0610:
            java.lang.Object r4 = r5.A01
            com.whatsapp.community.JoinGroupBottomSheetFragment r4 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r4
            X.11t r3 = r4.A0R
            X.1FL r2 = r4.A1D()
            X.01E r2 = (X.AnonymousClass01E) r2
            X.1EC r1 = r4.A0f
            r0 = 0
            r3.BBX(r2, r1, r0)
            r4.A28()
            return
        L_0x0626:
            java.lang.Object r1 = r5.A01
            com.whatsapp.community.NewCommunityActivity r1 = (com.whatsapp.community.NewCommunityActivity) r1
            com.whatsapp.WaEditText r0 = r1.A08
            android.text.Editable r0 = r0.getText()
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            if (r0 == 0) goto L_0x0641
            r0 = 2131892459(0x7f1218eb, float:1.9419667E38)
            java.lang.String r0 = r1.getString(r0)
            r1.A4b(r0)
            return
        L_0x0641:
            com.whatsapp.community.NewCommunityActivity.A0Q(r1)
            return
        L_0x0645:
            java.lang.Object r2 = r5.A01
            X.3PU r2 = (X.AnonymousClass3PU) r2
            X.3zh r1 = r2.A02
            if (r1 != 0) goto L_0x0651
            java.lang.String r0 = "wamGroupInfo"
            goto L_0x0855
        L_0x0651:
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A0C = r0
            X.1RK r0 = r2.getCompanionDeviceManager$app_product_community_community()
            X.Af0 r1 = r0.A04()
            r0 = 4
            X.C98334qx.A00(r1, r2, r0)
            return
        L_0x0664:
            java.lang.Object r0 = r5.A01
            com.whatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.whatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.00H r0 = r0.A03
            if (r0 == 0) goto L_0x068f
            java.lang.Object r1 = r0.get()
            X.3V5 r1 = (X.AnonymousClass3V5) r1
            X.AnonymousClass3V5.A03(r1)
            X.4Co r0 = X.C82894Co.CONTINUE
            goto L_0x068b
        L_0x0678:
            java.lang.Object r0 = r5.A01
            com.whatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.whatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.00H r0 = r0.A03
            if (r0 == 0) goto L_0x068f
            java.lang.Object r1 = r0.get()
            X.3V5 r1 = (X.AnonymousClass3V5) r1
            X.AnonymousClass3V5.A03(r1)
            X.4Co r0 = X.C82894Co.SELF_DEMOTE
        L_0x068b:
            X.AnonymousClass3V5.A00(r0, r1)
            return
        L_0x068f:
            java.lang.String r0 = "viewModel"
            goto L_0x0855
        L_0x0693:
            java.lang.Object r0 = r5.A01
            X.4Up r0 = (X.C87184Up) r0
            X.1Di r1 = r0.A04
            X.1EC r0 = r0.A00
            r1.invoke(r0)
            return
        L_0x069f:
            java.lang.Object r3 = r5.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r3 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r3
            X.9gv r0 = r3.A04
            if (r0 != 0) goto L_0x06ab
            java.lang.String r0 = "phoneNumberEntryViewHolder"
            goto L_0x0855
        L_0x06ab:
            android.widget.TextView r0 = r0.A04
            java.lang.String r2 = X.AnonymousClass3Ma.A13(r0)
            X.02n r1 = r3.A09
            X.1LU r0 = r3.A03
            if (r0 == 0) goto L_0x06c0
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1S(r3, r0, r2)
            r1.A03(r0)
            return
        L_0x06c0:
            java.lang.String r0 = "waIntents"
            goto L_0x0855
        L_0x06c4:
            java.lang.Object r2 = r5.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r2 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r2
            X.129 r1 = r2.A05
            if (r1 == 0) goto L_0x06da
            java.lang.String r0 = "1460738748095414"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            r2.startActivity(r0)
            return
        L_0x06da:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x0855
        L_0x06de:
            java.lang.Object r0 = r5.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x06e4:
            java.lang.Object r1 = r5.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            X.0ve r8 = r1.A1U
            X.1KB r3 = r1.A0S
            X.1FL r2 = r1.A1D()
            X.00H r0 = r1.A22
            X.1q1 r10 = X.AnonymousClass3MW.A0m(r0)
            X.1LU r9 = r1.A4A
            X.1pJ r5 = r1.A0w
            X.17x r6 = r1.A17
            X.00H r0 = r1.A2G
            java.lang.Object r4 = r0.get()
            X.1dX r4 = (X.C30191dX) r4
            X.0z4 r7 = r1.A18
            r13 = 1
            r11 = 3
            r12 = 12
            X.AnonymousClass4GD.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x070e:
            java.lang.Object r3 = r5.A01
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            boolean r0 = r3.A3O
            if (r0 == 0) goto L_0x071c
            X.4YE r1 = r3.A1l
            r0 = 7
            r1.A03(r0)
        L_0x071c:
            X.00H r0 = r3.A2H
            java.lang.Object r2 = r0.get()
            X.4Rs r2 = (X.C86464Rs) r2
            boolean r1 = r3.A3V
            r0 = 0
            if (r1 == 0) goto L_0x072d
            java.lang.Integer r0 = X.C17880vN.A0h()
        L_0x072d:
            r2.A00(r0)
            com.whatsapp.contact.picker.ContactPickerFragment.A0e(r3)
            return
        L_0x0734:
            java.lang.Object r2 = r5.A01
            X.3gf r2 = (X.AnonymousClass3gf) r2
            java.util.List r0 = r2.A0i
            int r1 = r0.size()
            int r0 = r2.A4g()
            if (r1 >= r0) goto L_0x0778
            X.1KB r6 = r2.A05
            boolean r0 = r2 instanceof X.C77073pJ
            if (r0 == 0) goto L_0x0756
            r0 = 2131886154(0x7f12004a, float:1.9406879E38)
            java.lang.String r0 = X.C18070vi.A0F(r2, r0)
        L_0x0751:
            r1 = 0
            r6.A0G(r0, r1)
            return
        L_0x0756:
            boolean r0 = r2 instanceof X.C77053p5
            if (r0 == 0) goto L_0x0762
            r0 = 2131886153(0x7f120049, float:1.9406877E38)
            java.lang.String r0 = X.C18070vi.A0F(r2, r0)
            goto L_0x0751
        L_0x0762:
            X.0vb r5 = r2.A0F
            r4 = 2131755252(0x7f1000f4, float:1.9141378E38)
            int r3 = r2.A4g()
            long r1 = (long) r3
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            X.AnonymousClass000.A1L(r0, r3)
            java.lang.String r0 = r5.A0K(r0, r4, r1)
            goto L_0x0751
        L_0x0778:
            r2.A4s()
            return
        L_0x077c:
            java.lang.Object r0 = r5.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass4aU.A05(r0)
            return
        L_0x0784:
            java.lang.Object r1 = r5.A01
            X.3gf r1 = (X.AnonymousClass3gf) r1
            X.0ve r7 = r1.A0E
            X.1KB r2 = r1.A05
            X.00H r0 = r1.A0I
            X.1q1 r9 = X.AnonymousClass3MW.A0m(r0)
            X.00H r0 = r1.A0Q
            java.lang.Object r8 = r0.get()
            X.1LU r8 = (X.AnonymousClass1LU) r8
            X.1pJ r4 = r1.A0C
            X.17x r5 = r1.A0E
            X.00H r0 = r1.A0L
            java.lang.Object r3 = r0.get()
            X.1dX r3 = (X.C30191dX) r3
            X.0z4 r6 = r1.A0A
            r12 = 20
            r10 = 2
            r11 = 12
            X.AnonymousClass4GD.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x07b1:
            java.lang.Object r5 = r5.A01
            com.whatsapp.contact.picker.PhoneContactsSelector r5 = (com.whatsapp.contact.picker.PhoneContactsSelector) r5
            java.util.List r10 = r5.A0h
            int r1 = r10.size()
            r0 = 1
            if (r1 >= r0) goto L_0x07d5
            X.1KB r6 = r5.A05
            X.0vb r5 = r5.A0N
            r4 = 2131755252(0x7f1000f4, float:1.9141378E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            boolean r2 = X.C72453Mb.A1b(r3, r0)
            r0 = 1
            java.lang.String r0 = r5.A0K(r3, r4, r0)
            r6.A0G(r0, r2)
            return
        L_0x07d5:
            X.00H r0 = r5.A0Q
            boolean r0 = X.C72463Mc.A1W(r0)
            if (r0 != 0) goto L_0x07f1
            X.00H r0 = r5.A0T
            java.lang.Object r0 = r0.get()
            X.1pJ r0 = (X.C37311pJ) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x07f1
            java.lang.String r0 = "conversation/actresult/read_contacts permission denied"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x07f1:
            X.10I r0 = r5.A05
            X.118 r7 = r5.A0L
            X.1M9 r4 = r5.A09
            X.11C r6 = r5.A08
            X.0vb r8 = r5.A0N
            X.1LA r2 = r5.A05
            X.1Ty r3 = r5.A07
            X.1BI r9 = r5.A0P
            X.6MJ r1 = new X.6MJ
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.C17890vO.A0u(r1, r0)
            return
        L_0x080a:
            java.lang.Object r1 = r5.A01
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r1 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r1
            java.lang.String r0 = r1.A0Q
            r1.A0P = r0
            r0 = 0
            r1.A03 = r0
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment.A04(r1)
            return
        L_0x0819:
            java.lang.Object r2 = r5.A01
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r2 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r2
            X.1nc r1 = r2.A06
            if (r1 == 0) goto L_0x0829
            java.lang.Integer r0 = com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity.A0Q(r2)
            r1.A01(r2, r0)
            return
        L_0x0829:
            java.lang.String r0 = "tellAFriend"
            goto L_0x0855
        L_0x082c:
            java.lang.Object r0 = r5.A01
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = (com.whatsapp.conversation.ConversationAttachmentContentView) r0
            X.5tO r3 = r0.A0D
            int r2 = r0.A05
            java.lang.String r1 = "chat"
            java.lang.String r0 = "payment"
            r3.A0H(r0, r1, r2)
            return
        L_0x083c:
            java.lang.Object r0 = r5.A01
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = (com.whatsapp.conversation.ConversationAttachmentContentView) r0
            X.5tO r3 = r0.A0D
            java.lang.String r2 = "pix"
            r1 = 2
            java.lang.String r0 = "chat_attachment"
            r3.A0H(r2, r0, r1)
            return
        L_0x084b:
            java.lang.Object r0 = r5.A01
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            X.3U2 r2 = r0.A0A
            if (r2 != 0) goto L_0x085a
            java.lang.String r0 = "editMessageViewModel"
        L_0x0855:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x085a:
            java.lang.String r8 = r2.A00
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x08a4
            X.206 r7 = r2.A0B
            if (r7 == 0) goto L_0x08a4
            if (r8 == 0) goto L_0x08a4
            int r0 = r8.length()
            if (r0 == 0) goto L_0x08a4
            X.11P r1 = r2.A09
            X.0ve r0 = r2.A0A
            boolean r0 = X.AnonymousClass25A.A0U(r1, r0, r7)
            if (r0 != 0) goto L_0x088d
            X.1DT r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
        L_0x087a:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0887;
                case 1: goto L_0x088a;
                default: goto L_0x0881;
            }
        L_0x0881:
            java.lang.String r0 = "ExitEditExpired"
        L_0x0883:
            r1.A0E(r0)
            return
        L_0x0887:
            java.lang.String r0 = "ExitWithChanges"
            goto L_0x0883
        L_0x088a:
            java.lang.String r0 = "ExitNoChanges"
            goto L_0x0883
        L_0x088d:
            X.1iW r4 = r2.A06
            X.3TA r6 = r2.A08
            X.7Fe r5 = r6.A00
            java.util.List r9 = r2.A01
            X.10I r0 = r4.A19
            X.AkU r3 = new X.AkU
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.CGF(r3)
            X.1DT r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x087a
        L_0x08a4:
            X.1DT r1 = r2.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x087a
        L_0x08a9:
            java.lang.Object r3 = r5.A01
            X.3rr r3 = (X.C77943rr) r3
            X.0z4 r0 = r3.A05
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "pref_cag_events_banner_dismissed"
            X.C17880vN.A1F(r1, r0, r2)
            r3.A06(r2)
            return
        L_0x08bd:
            java.lang.Object r1 = r5.A01
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.C18070vi.A0X(r0)
            X.AnonymousClass3MZ.A1F(r1, r0)
            android.text.TextPaint r1 = r1.getPaint()
            r0 = 0
            r1.setShader(r0)
            return
        L_0x08d4:
            java.lang.Object r0 = r5.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            X.AnonymousClass3uP.A0e(r0)
            return
        L_0x08dc:
            java.lang.Object r4 = r5.A01
            X.3uP r4 = (X.AnonymousClass3uP) r4
            X.00H r0 = r4.A1Z
            java.lang.Object r0 = r0.get()
            X.1Uk r0 = (X.C27021Uk) r0
            boolean r0 = r0.A01()
            r1 = 7
            if (r0 == 0) goto L_0x090c
            X.00H r0 = r4.A1b
            java.lang.Object r0 = r0.get()
            X.6ue r0 = (X.C136936ue) r0
            r0.A01(r1)
            X.00H r0 = r4.A2R
            X.10T r4 = X.C17880vN.A0V(r0)
            r3 = 0
            r2 = 3
            r1 = 1
            X.4on r0 = new X.4on
            r0.<init>(r3, r2, r1)
            r4.notifyAllObservers(r0)
            return
        L_0x090c:
            X.1FU r3 = X.C72473Md.A0O(r4)
            if (r3 == 0) goto L_0x0938
            X.00H r0 = r4.A1b
            java.lang.Object r0 = r0.get()
            X.6ue r0 = (X.C136936ue) r0
            r0.A01(r1)
            X.00H r0 = r4.A1b
            java.lang.Object r1 = r0.get()
            X.6ue r1 = (X.C136936ue) r1
            r0 = 2
            r2 = 0
            r1.A03(r2, r0)
            X.00H r0 = r4.A1a
            java.lang.Object r1 = r0.get()
            X.73V r1 = (X.AnonymousClass73V) r1
            java.lang.String r0 = "conversation_quick_action_button"
            r1.A04(r3, r0, r2)
            return
        L_0x0938:
            java.lang.String r0 = "Unable to find host Activity"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x093e:
            java.lang.Object r0 = r5.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            X.AnonymousClass3uP.A0X(r4, r0)
            return
        L_0x0946:
            java.lang.Object r0 = r5.A01
            X.3uR r0 = (X.C79093uR) r0
            r0.A1R()
            return
        L_0x094e:
            X.00H r0 = r4.A0Q
            X.1gf r3 = X.AnonymousClass3MX.A0b(r0)
            X.1EC r6 = r4.A0K
            int r0 = r4.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r13 = 1
            X.C18070vi.A0d(r6, r13)
            X.00H r0 = r3.A0A
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            r1 = 0
            boolean r0 = r0.A0V(r6)
            if (r0 != 0) goto L_0x0988
            r1 = 1
            X.11E r0 = r3.A04
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0988
            X.3Rj r1 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131896613(0x7f122925, float:1.9428092E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0S(r0)
            X.C73203Rj.A04(r4, r1)
            return
        L_0x0988:
            X.1jj r5 = X.AnonymousClass3Ma.A0H(r4)
            r4 = -1
            if (r1 == 0) goto L_0x09b7
            if (r2 == 0) goto L_0x0995
            int r4 = r2.intValue()
        L_0x0995:
            com.whatsapp.group.SuggestGroupRouter r3 = new com.whatsapp.group.SuggestGroupRouter
            r3.<init>()
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r1 = r6.getRawString()
            java.lang.String r0 = "parent_group"
            r2.putString(r0, r1)
            java.lang.String r0 = "entry_point"
            r2.putInt(r0, r4)
            r3.A1R(r2)
        L_0x09af:
            r0 = 0
            r5.A0B(r3, r0)
            r5.A04()
            return
        L_0x09b7:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            if (r2 == 0) goto L_0x09ca
            int r10 = r2.intValue()
        L_0x09c1:
            r7 = 0
            r11 = 0
            r9 = r7
            r12 = r11
            com.whatsapp.group.NewGroupRouter r3 = X.C83794Gr.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x09af
        L_0x09ca:
            r10 = -1
            goto L_0x09c1
        L_0x09cc:
            X.1nc r1 = r6.A0X
        L_0x09ce:
            android.content.Context r0 = r4.getContext()
            r1.A01(r0, r3)
            return
        L_0x09d6:
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r2.A09
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r2.A09
            r7 = 0
            r0.A0R(r7, r7)
            X.10I r6 = r2.A0J
            X.17r r4 = r2.A04
            X.7Fe r0 = r2.A03
            X.6g9 r0 = r0.A05
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            X.4nM r0 = new X.4nM
            r0.<init>(r5, r7)
            X.6Lr r1 = new X.6Lr
            r1.<init>(r4, r0, r3, r2)
            java.lang.String[] r0 = new java.lang.String[r7]
            r6.CGD(r1, r0)
            return
        L_0x09fe:
            java.lang.Object r0 = r1.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.5cQ r1 = r0.A2Q
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r0 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment.A00(r2, r3)
            r1.CMl(r0)
            return
        L_0x0a0c:
            boolean r0 = r3.isEmpty()
            r8 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0a34
            java.util.ArrayList r1 = r7.A0b
            int r0 = r1.size()
            if (r0 != r8) goto L_0x0a34
            java.lang.Object r4 = r1.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            X.733 r3 = r7.A07
            android.content.Context r2 = r7.getContext()
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r3.A04(r2, r1, r4, r0)
            return
        L_0x0a34:
            java.util.ArrayList r2 = r7.A0b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a4c
            int r0 = r3.size()
            if (r0 != r8) goto L_0x0a4c
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            r5.A05(r0)
            return
        L_0x0a4c:
            int r1 = r2.size()
            int r0 = r3.size()
            int r1 = r1 + r0
            java.util.ArrayList r4 = X.C17880vN.A0z(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x0a5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a71
            java.lang.String r1 = X.C17880vN.A0v(r2)
            X.0vb r0 = r7.A0D
            java.lang.String r0 = r0.A0G(r1)
            r4.add(r0)
            goto L_0x0a5d
        L_0x0a71:
            java.util.Iterator r2 = r3.iterator()
        L_0x0a75:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0a89
            java.lang.String r1 = X.C17880vN.A0v(r2)
            X.0vb r0 = r7.A0D
            java.lang.String r0 = r0.A0F(r1)
            r4.add(r0)
            goto L_0x0a75
        L_0x0a89:
            X.73C r0 = r7.A0J
            X.6oE r0 = r0.A0A
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.content.Context r3 = r7.getContext()
            if (r0 == 0) goto L_0x0ac7
            r0 = 2131891469(0x7f12150d, float:1.9417659E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x0aa0:
            android.content.Context r0 = r7.getContext()
            X.3Rj r3 = X.AnonymousClass4a6.A00(r0)
            r3.A0k(r1)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r2 = r4.toArray(r0)
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            r0 = 13
            X.4bC r1 = new X.4bC
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r4, (int) r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = r3.A00
            r0.A0M(r1, r2)
        L_0x0abf:
            X.05w r0 = r3.create()
            r0.show()
            return
        L_0x0ac7:
            r2 = 2131891485(0x7f12151d, float:1.9417691E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.73C r0 = r7.A0J
            X.6oE r0 = r0.A0A
            java.lang.String r0 = r0.A01
            java.lang.String r1 = X.C17880vN.A0q(r3, r0, r1, r6, r2)
            goto L_0x0aa0
        L_0x0ad7:
            java.util.ArrayList r4 = r1.A0a
            X.73C r0 = r1.A0J
            X.6oE r0 = r0.A0A
            java.lang.String r3 = r0.A08
            com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment r2 = new com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "jids"
            X.AnonymousClass3MY.A17(r1, r0, r4)
            java.lang.String r0 = "phones"
            r1.putStringArrayList(r0, r7)
            java.lang.String r0 = "labels"
            r1.putStringArrayList(r0, r6)
            java.lang.String r0 = "business_name"
            r1.putString(r0, r3)
            r2.A1R(r1)
            X.AnonymousClass3MY.A1H(r2, r5, r8)
            return
        L_0x0b03:
            X.1LU r1 = new X.1LU
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0h()
            android.content.Intent r0 = r1.A1v(r6, r4, r0)
            r6.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48m.A04(android.view.View):void");
    }

    public void A05(String str) {
        C78443so r5 = (C78443so) this.A01;
        C133656pG r8 = r5.A03;
        Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", new String[]{str}).putExtra("android.intent.extra.SUBJECT", r5.getContext().getString(2131896796));
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C17880vN.A0q(r5.getContext(), "https://www.whatsapp.com/download/", new Object[1], 0, 2131896795));
        r8.A00(r5.getContext(), putExtra.putExtra("android.intent.extra.TEXT", AnonymousClass000.A0y("\n\n", A10)), (AnonymousClass1FR) null, r5.getContext().getString(2131891496), true);
    }
}
